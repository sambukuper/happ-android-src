package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x77 {
    public final rh5 a;
    public final rh5 b;
    public final d6 c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public long h;
    public long i;
    public vu8 j;

    public x77() {
        Boolean bool = Boolean.FALSE;
        this.a = z51.H(bool);
        this.b = z51.H(bool);
        this.c = new d6((byte) 4);
        this.d = yx4.a();
        this.e = dw0.f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = gd8.b;
        this.i = 0L;
    }

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        rh5 rh5Var = this.a;
        boolean zBooleanValue = ((Boolean) rh5Var.getValue()).booleanValue();
        rh5 rh5Var2 = this.b;
        if (zBooleanValue && !z) {
            rh5Var2.setValue(Boolean.TRUE);
        } else if (z) {
            rh5Var2.setValue(Boolean.FALSE);
        }
        rh5Var.setValue(Boolean.valueOf(z));
    }
}
