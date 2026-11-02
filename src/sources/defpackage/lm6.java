package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lm6 extends z91 {
    @Override // defpackage.z91
    public final void D(l77 l77Var, float f, float f2) {
        float f3 = f2 * f;
        l77Var.d(0.0f, f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        h77 h77Var = new h77(0.0f, 0.0f, f4, f4);
        h77Var.f = 180.0f;
        h77Var.g = 90.0f;
        l77Var.g.add(h77Var);
        f77 f77Var = new f77(h77Var);
        l77Var.a(180.0f);
        l77Var.h.add(f77Var);
        l77Var.e = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        l77Var.c = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        l77Var.d = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
