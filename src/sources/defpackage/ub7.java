package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ub7 implements gn2 {
    public final /* synthetic */ gn2 X;
    public final /* synthetic */ uu0 Y;
    public final /* synthetic */ byte Z;
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ float g0;

    /* JADX WARN: Multi-variable type inference failed */
    public ub7(gn2 gn2Var, uu0 uu0Var, int i, boolean z, float f) {
        this.X = gn2Var;
        this.Y = uu0Var;
        this.Z = i;
        this.f0 = z;
        this.g0 = f;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        KeyEvent keyEvent = ((cx3) obj).a;
        uu0 uu0Var = this.Y;
        float f = uu0Var.Y;
        gn2 gn2Var = this.X;
        if (gn2Var == null) {
            return Boolean.FALSE;
        }
        int iS = w39.S(keyEvent);
        boolean z = false;
        if (iS == 2) {
            float f2 = uu0Var.X;
            float fAbs = Math.abs(f - f2);
            byte b = this.Z;
            int i = b > 0 ? b + 1 : 100;
            float f3 = fAbs / i;
            int i2 = this.f0 ? -1 : 1;
            long jD = pu.d(keyEvent.getKeyCode());
            boolean zA = ax3.a(jD, ax3.d);
            float f4 = this.g0;
            if (zA) {
                gn2Var.B(x97.r(Float.valueOf((i2 * f3) + f4), uu0Var));
            } else if (ax3.a(jD, ax3.e)) {
                gn2Var.B(x97.r(Float.valueOf(f4 - (i2 * f3)), uu0Var));
            } else if (ax3.a(jD, ax3.g)) {
                gn2Var.B(x97.r(Float.valueOf((i2 * f3) + f4), uu0Var));
            } else if (ax3.a(jD, ax3.f)) {
                gn2Var.B(x97.r(Float.valueOf(f4 - (i2 * f3)), uu0Var));
            } else if (ax3.a(jD, ax3.v)) {
                gn2Var.B(Float.valueOf(f2));
            } else if (ax3.a(jD, ax3.w)) {
                gn2Var.B(Float.valueOf(f));
            } else if (ax3.a(jD, ax3.C)) {
                gn2Var.B(x97.r(Float.valueOf(f4 - (x97.n(i / 10, 1, 10) * f3)), uu0Var));
            } else if (ax3.a(jD, ax3.D)) {
                gn2Var.B(x97.r(Float.valueOf((x97.n(i / 10, 1, 10) * f3) + f4), uu0Var));
            }
            z = true;
        } else if (iS == 1) {
            long jD2 = pu.d(keyEvent.getKeyCode());
            if (ax3.a(jD2, ax3.d) || ax3.a(jD2, ax3.e) || ax3.a(jD2, ax3.g) || ax3.a(jD2, ax3.f) || ax3.a(jD2, ax3.v) || ax3.a(jD2, ax3.w) || ax3.a(jD2, ax3.C) || ax3.a(jD2, ax3.D)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
