package io.sentry.android.replay;

import defpackage.dn2;
import defpackage.g24;
import io.sentry.s5;
import io.sentry.s6;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends g24 implements dn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ l Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, byte b) {
        super(0);
        this.Y = b;
        this.Z = lVar;
    }

    @Override // defpackage.dn2
    public final Object invoke() throws IOException {
        byte b = this.Y;
        File file = null;
        l lVar = this.Z;
        switch (b) {
            case 0:
                if (lVar.m() != null) {
                    file = new File(lVar.m(), ".ongoing_segment");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                }
                return file;
            default:
                s6 s6Var = lVar.X;
                io.sentry.protocol.w wVar = lVar.Y;
                s6Var.getClass();
                wVar.getClass();
                String cacheDirPath = s6Var.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    s6Var.getLogger().h(s5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                String cacheDirPath2 = s6Var.getCacheDirPath();
                cacheDirPath2.getClass();
                File file2 = new File(cacheDirPath2, "replay_" + wVar);
                file2.mkdirs();
                return file2;
        }
    }
}
