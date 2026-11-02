package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xg3 extends jx4 implements g34 {
    public final /* synthetic */ byte q0;

    public int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        switch (this.q0) {
            case 0:
                break;
        }
        return tr4Var.a(i);
    }

    public yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        long jY0 = Y0(tr4Var, j);
        if (Z0()) {
            jY0 = s31.e(j, jY0);
        }
        eo5 eo5VarO = tr4Var.o(jY0);
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, (byte) 7));
    }

    public abstract long Y0(tr4 tr4Var, long j);

    public abstract boolean Z0();

    public int i0(ug3 ug3Var, tr4 tr4Var, int i) {
        switch (this.q0) {
            case 0:
                break;
        }
        return tr4Var.m(i);
    }

    public int m0(ug3 ug3Var, tr4 tr4Var, int i) {
        switch (this.q0) {
            case 0:
                break;
        }
        return tr4Var.k(i);
    }

    public int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        switch (this.q0) {
            case 0:
                break;
        }
        return tr4Var.K(i);
    }
}
