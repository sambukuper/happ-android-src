package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hf0 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ if0 Y;

    public /* synthetic */ hf0(if0 if0Var, byte b) {
        this.X = b;
        this.Y = if0Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        Set setC1;
        Set setC2;
        byte b = this.X;
        m02 m02Var = m02.X;
        boolean z = false;
        if0 if0Var = this.Y;
        switch (b) {
            case 0:
                try {
                    try {
                        Trace.beginSection(((Object) vi0.b(if0Var.X)) + "#availableCaptureRequestKeys");
                        if (Build.VERSION.SDK_INT >= 33) {
                            setC1 = wv0.c1(c4.d(if0Var.Z, if0Var.Y));
                            break;
                        } else {
                            setC1 = m02Var;
                        }
                        return setC1;
                    } catch (Throwable unused) {
                        return m02Var;
                    }
                } finally {
                    Trace.endSection();
                }
            case 1:
                try {
                    try {
                        Trace.beginSection(((Object) vi0.b(if0Var.X)) + "#availableCaptureResultKeys");
                        if (Build.VERSION.SDK_INT >= 33) {
                            setC2 = wv0.c1(c4.e(if0Var.Z, if0Var.Y));
                            break;
                        } else {
                            setC2 = m02Var;
                        }
                        return setC2;
                    } catch (Throwable unused2) {
                        return m02Var;
                    }
                } finally {
                    Trace.endSection();
                }
            case 2:
                try {
                    try {
                        Trace.beginSection(((Object) vi0.b(if0Var.X)) + "#isPostviewSupported");
                        boolean zT = Build.VERSION.SDK_INT >= 34 ? u3.t(if0Var.Z, if0Var.Y) : false;
                        Trace.endSection();
                        z = zT;
                        break;
                    } catch (Throwable unused3) {
                    }
                    return Boolean.valueOf(z);
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            default:
                try {
                    try {
                        Trace.beginSection(((Object) vi0.b(if0Var.X)) + "#isCaptureProgressSupported");
                        boolean zS = Build.VERSION.SDK_INT >= 34 ? u3.s(if0Var.Z, if0Var.Y) : false;
                        Trace.endSection();
                        z = zS;
                        break;
                    } catch (Throwable unused4) {
                    }
                    return Boolean.valueOf(z);
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
        }
    }
}
