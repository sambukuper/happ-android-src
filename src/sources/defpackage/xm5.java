package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraMetadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xm5 implements xi0, bo8 {
    public final qj0 X;
    public final vz7 Y = new vz7(new tb2(this, (byte) 28));

    public xm5(qj0 qj0Var) {
        this.X = qj0Var;
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        zb6 zb6Var = yb6.a;
        if (zu3Var.equals(zb6Var.b(jf0.class))) {
            jf0 jf0Var = (jf0) this.Y.getValue();
            jf0Var.getClass();
            return jf0Var;
        }
        boolean zEquals = zu3Var.equals(zb6Var.b(qj0.class));
        qj0 qj0Var = this.X;
        if (zEquals) {
            return qj0Var;
        }
        boolean zEquals2 = zu3Var.equals(zb6Var.b(CameraMetadata.class));
        jj0 jj0Var = qj0Var.b;
        if (!zEquals2) {
            return ((lf0) jj0Var).C0(zu3Var);
        }
        jj0Var.getClass();
        return jj0Var;
    }

    @Override // defpackage.xi0
    public final int c() {
        return n(0);
    }

    @Override // defpackage.xi0
    public final qc4 f() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // defpackage.xi0
    public final int j() {
        jj0 jj0Var = this.X.b;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object objC = ((lf0) jj0Var).c(key);
        objC.getClass();
        int iIntValue = ((Number) objC).intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        bt.q(ie2.h("The specified lens facing integer ", iIntValue, " can not be recognized."));
        return 0;
    }

    @Override // defpackage.xi0
    public final int n(int i) {
        jj0 jj0Var = this.X.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object objC = ((lf0) jj0Var).c(key);
        objC.getClass();
        return w39.Q(w39.m0(i), ((Number) objC).intValue(), 1 == j());
    }

    @Override // defpackage.xi0
    public final boolean q() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }
}
