package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jc8 {
    public final boolean a;
    public final m15 b;
    public final b15 c = new b15(Boolean.FALSE);
    public mm0 d;

    public jc8(boolean z, m15 m15Var) {
        this.a = z;
        this.b = m15Var;
    }

    public final void a() {
        mm0 mm0Var;
        this.c.c.setValue(Boolean.FALSE);
        if (!this.a || (mm0Var = this.d) == null) {
            return;
        }
        mm0Var.z(null);
    }

    public final boolean b() {
        b15 b15Var = this.c;
        return ((Boolean) b15Var.b.getValue()).booleanValue() || ((Boolean) b15Var.c.getValue()).booleanValue();
    }

    public final Object c(f15 f15Var, uy7 uy7Var) {
        q51 q51Var = null;
        ic8 ic8Var = new ic8(this, new rf0(this, q51Var, (byte) 3), f15Var, null);
        m15 m15Var = this.b;
        m15Var.getClass();
        Object objN = gv3.n(new kg3(f15Var, m15Var, ic8Var, q51Var, (byte) 1), uy7Var);
        return objN == c71.X ? objN : dn8.a;
    }
}
