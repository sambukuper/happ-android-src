package defpackage;

import android.os.Trace;
import java.util.Arrays;
import su.happ.proxyutility.ui.ScannerActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xu5 {
    public static final xu5 b = new xu5(new d6((byte) 3));
    public final d6 a;

    public xu5(d6 d6Var) {
        this.a = d6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p84 a(ScannerActivity scannerActivity, lk0 lk0Var, hq8... hq8VarArr) {
        boolean z;
        d6 d6Var = this.a;
        hq8[] hq8VarArr2 = (hq8[]) Arrays.copyOf(hq8VarArr, hq8VarArr.length);
        Trace.beginSection("CX:bindToLifecycle");
        try {
            zl0 zl0Var = (zl0) d6Var.i0;
            boolean z2 = 0;
            if (zl0Var != null) {
                zl0Var.getClass();
                t6 t6Var = zl0Var.g;
                if (t6Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                vh0 vh0Var = (vh0) t6Var.h0;
                synchronized (vh0Var.b) {
                    z = vh0Var.e;
                }
                z2 = z;
            }
            if (z2 == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            d6Var.e(1);
            p84 p84VarA = d6.a(d6Var, scannerActivity, lk0Var, new xy0(eu.q0(hq8VarArr2), d02.X));
            Trace.endSection();
            return p84VarA;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
