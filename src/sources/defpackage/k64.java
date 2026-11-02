package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k64 {
    public final Object a;
    public final m64 b;
    public int d;
    public k64 e;
    public boolean f;
    public int c = -1;
    public final rh5 g = z51.H(null);

    public k64(Object obj, m64 m64Var) {
        this.a = obj;
        this.b = m64Var;
    }

    public final k64 a() {
        if (this.f) {
            zc3.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.X.add(this);
            k64 k64Var = (k64) this.g.getValue();
            if (k64Var != null) {
                k64Var.a();
            } else {
                k64Var = null;
            }
            this.e = k64Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            zc3.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            c();
        }
    }

    public final void c() {
        this.b.X.remove(this);
        k64 k64Var = this.e;
        if (k64Var != null) {
            k64Var.b();
        }
        this.e = null;
    }
}
