package io.sentry.android.replay;

import android.graphics.Bitmap;
import defpackage.dh3;
import defpackage.dn8;
import defpackage.ea6;
import defpackage.g24;
import defpackage.oc;
import defpackage.rn2;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends g24 implements rn2 {
    public final /* synthetic */ ReplayIntegration Y;
    public final /* synthetic */ Bitmap Z;
    public final /* synthetic */ ea6 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ReplayIntegration replayIntegration, Bitmap bitmap, ea6 ea6Var) {
        super(2);
        this.Y = replayIntegration;
        this.Z = bitmap;
        this.f0 = ea6Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws IOException {
        l lVar = (l) obj;
        long jLongValue = ((Number) obj2).longValue();
        lVar.getClass();
        SentryAndroidOptions sentryAndroidOptions = this.Y.f0;
        if (sentryAndroidOptions == null) {
            dh3.T("options");
            throw null;
        }
        sentryAndroidOptions.getSessionReplay().getClass();
        Bitmap bitmap = this.Z;
        String str = (String) this.f0.X;
        bitmap.getClass();
        if (lVar.m() != null && !bitmap.isRecycled()) {
            File fileM = lVar.m();
            if (fileM != null) {
                fileM.mkdirs();
            }
            File file = new File(lVar.m(), jLongValue + ".jpg");
            file.createNewFile();
            synchronized (bitmap) {
                if (!bitmap.isRecycled()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, lVar.X.getSessionReplay().f.screenshotQuality, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        lVar.g(file, jLongValue, str);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            oc.h(fileOutputStream, th);
                            throw th2;
                        }
                    }
                }
            }
        }
        return dn8.a;
    }
}
