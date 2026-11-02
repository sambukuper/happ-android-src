package defpackage;

import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class in0 implements en0 {
    public static final boolean c;
    public final v06 a;
    public final vz7 b;

    static {
        c = um1.a().b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public in0(qj0 qj0Var, v06 v06Var, pr8 pr8Var, uc8 uc8Var) {
        qj0Var.getClass();
        v06Var.getClass();
        pr8Var.getClass();
        uc8Var.getClass();
        this.a = v06Var;
        new vz7(new fn0(qj0Var, (byte) 1));
        this.b = new vz7(new o7(this, (byte) 18));
    }

    @Override // defpackage.en0
    public final void a(int i) {
        ((hn0) this.b.getValue()).getClass();
    }
}
