package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qr5 {
    public static final jx5[] f = new jx5[0];
    public final ul a;
    public final boolean b;
    public final nn3 c;
    public jx5[] d;
    public jx5[] e;

    public qr5(ul ulVar, nn3 nn3Var) {
        this.a = ulVar;
        this.b = nn3Var != null;
        this.c = nn3Var == null ? nn3.X : nn3Var;
    }

    public final boolean a(l37 l37Var) {
        m85 m85VarD = l37Var.d();
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (this.e[i] == null && this.d[i] == null && m85VarD.i(this.a.F0(i)) == null) {
                return false;
            }
        }
        return true;
    }

    public final void b(vp4 vp4Var) {
        if (this.d != null) {
            return;
        }
        ul ulVar = this.a;
        int iG0 = ulVar.G0();
        if (iG0 == 0) {
            jx5[] jx5VarArr = f;
            this.e = jx5VarArr;
            this.d = jx5VarArr;
            return;
        }
        this.e = new jx5[iG0];
        this.d = new jx5[iG0];
        m85 m85VarD = vp4Var.d();
        for (int i = 0; i < iG0; i++) {
            jx5 jx5VarL = m85VarD.l(ulVar.F0(i));
            if (jx5VarL != null && !jx5VarL.c()) {
                this.e[i] = jx5VarL;
            }
        }
    }

    public final String toString() {
        return "(mode=" + this.c + ")" + this.a;
    }
}
