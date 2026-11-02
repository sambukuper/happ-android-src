package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j86 {
    public r01 a;
    public int b;
    public gp2 c;
    public rn2 d;
    public int e;
    public f05 f;
    public s05 g;

    public j86(r01 r01Var) {
        this.a = r01Var;
    }

    public final boolean a() {
        if (this.a != null) {
            gp2 gp2Var = this.c;
            if (gp2Var != null ? gp2Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final di3 b(Object obj) {
        di3 di3VarS;
        r01 r01Var = this.a;
        return (r01Var == null || (di3VarS = r01Var.s(this, obj)) == null) ? di3.X : di3VarS;
    }

    public final void c() {
        r01 r01Var = this.a;
        if (r01Var != null) {
            r01Var.q0 = true;
            r01Var.v0.l();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
