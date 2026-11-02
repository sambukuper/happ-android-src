package io.sentry;

import defpackage.fm7;
import defpackage.mm7;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements FilenameFilter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((c0) obj).a(str);
            default:
                io.sentry.android.replay.l lVar = (io.sentry.android.replay.l) obj;
                str.getClass();
                if (mm7.R(str, false, ".jpg")) {
                    File file2 = new File(file, str);
                    String name = file2.getName();
                    name.getClass();
                    int iR0 = fm7.r0(name, ".", 0, 6);
                    if (iR0 != -1) {
                        name = name.substring(0, iR0);
                    }
                    Long lC0 = mm7.c0(name);
                    if (lC0 != null) {
                        lVar.g(file2, lC0.longValue(), null);
                    }
                }
                return false;
        }
    }
}
