package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rr4 implements de3 {
    public final short X;

    /* JADX WARN: Multi-variable type inference failed */
    public rr4(int i) {
        this.X = i;
        if (i >= 0) {
            return;
        }
        zc3.a("maxLength must be at least zero");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr4) && this.X == ((rr4) obj).X;
    }

    @Override // defpackage.de3
    public final void h(f17 f17Var) {
        nw3[] nw3VarArr = d17.a;
        e17 e17Var = c17.R;
        nw3 nw3Var = d17.a[29];
        Integer numValueOf = Integer.valueOf(this.X);
        e17Var.getClass();
        f17Var.a(e17Var, numValueOf);
    }

    public final int hashCode() {
        return Integer.hashCode(this.X);
    }

    @Override // defpackage.de3
    public final void i(g48 g48Var) {
        mi5 mi5Var = g48Var.Z;
        if (mi5Var.length() > this.X) {
            int length = mi5Var.length();
            h48 h48Var = g48Var.X;
            CharSequence charSequence = h48Var.Z;
            c78 c78Var = h48Var.Y;
            g48Var.c(0, length, charSequence.toString());
            g48Var.g(h48Var.f0);
            g48Var.a().A();
            p88 p88Var = g48Var.f0;
            if (c78Var == null) {
                if (p88Var != null) {
                    df3 df3Var = p88Var.b;
                    df3Var.d = df3Var.e;
                    zz4 zz4Var = df3Var.b;
                    zz4Var.e(4, zz4Var.b);
                    j05 j05Var = df3Var.a;
                    j05Var.m(1, j05Var.b);
                    df3Var.c = 0;
                    return;
                }
                return;
            }
            if (p88Var == null) {
                p88Var = new p88((p88) null, 3);
                g48Var.f0 = p88Var;
            }
            p88 p88Var2 = c78Var.a;
            if (!p88Var.a) {
                zc3.c("This buffer is immutable");
            }
            p88Var.c = p88Var2.c;
            p88Var.d = p88Var2.d;
            df3 df3Var2 = p88Var.b;
            df3 df3Var3 = p88Var2.b;
            j05 j05Var2 = df3Var2.a;
            zz4 zz4Var2 = df3Var2.b;
            if (df3Var3.d == df3Var3.e) {
                df3Var2.d = df3Var2.e;
                zz4Var2.e(4, zz4Var2.b);
                j05 j05Var3 = df3Var2.a;
                j05Var3.m(1, j05Var3.b);
                df3Var2.c = 0;
                return;
            }
            zz4Var2.b = 0;
            zz4Var2.b(0, df3Var3.b);
            j05Var2.d();
            j05Var2.b(df3Var3.a);
            df3Var2.d = df3Var3.d;
            df3Var2.c = df3Var3.c;
            df3Var2.f = df3Var3.f;
        }
    }

    public final String toString() {
        return ie2.h("InputTransformation.maxLength(", this.X, ")");
    }
}
