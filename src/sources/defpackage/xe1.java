package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xe1 implements tr4 {
    public final /* synthetic */ byte X;
    public final tr4 Y;
    public final Enum Z;
    public final Enum f0;

    public /* synthetic */ xe1(tr4 tr4Var, Enum r2, Enum r3, byte b) {
        this.X = b;
        this.Y = tr4Var;
        this.Z = r2;
        this.f0 = r3;
    }

    @Override // defpackage.tr4
    public final int K(int i) {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.Y.K(i);
    }

    @Override // defpackage.tr4
    public final int a(int i) {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.Y.a(i);
    }

    @Override // defpackage.tr4
    public final int k(int i) {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.Y.k(i);
    }

    @Override // defpackage.tr4
    public final int m(int i) {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.Y.m(i);
    }

    @Override // defpackage.tr4
    public final eo5 o(long j) {
        byte b = this.X;
        Enum r1 = this.Z;
        Enum r2 = this.f0;
        tr4 tr4Var = this.Y;
        switch (b) {
            case 0:
                zg3 zg3Var = (zg3) r2;
                vg3 vg3Var = (vg3) r1;
                vg3 vg3Var2 = vg3.Y;
                if (zg3Var == zg3.X) {
                    return new zc2(vg3Var == vg3Var2 ? tr4Var.m(q31.g(j)) : tr4Var.k(q31.g(j)), q31.c(j) ? q31.g(j) : 32767, (byte) 0);
                }
                return new zc2(q31.d(j) ? q31.h(j) : 32767, vg3Var == vg3Var2 ? tr4Var.a(q31.h(j)) : tr4Var.K(q31.h(j)), (byte) 0);
            case 1:
                cs4 cs4Var = (cs4) r2;
                bs4 bs4Var = (bs4) r1;
                bs4 bs4Var2 = bs4.Y;
                if (cs4Var == cs4.X) {
                    return new zc2(bs4Var == bs4Var2 ? tr4Var.m(q31.g(j)) : tr4Var.k(q31.g(j)), q31.c(j) ? q31.g(j) : 32767, (byte) 1);
                }
                return new zc2(q31.d(j) ? q31.h(j) : 32767, bs4Var == bs4Var2 ? tr4Var.a(q31.h(j)) : tr4Var.K(q31.h(j)), (byte) 1);
            default:
                m55 m55Var = (m55) r2;
                l55 l55Var = (l55) r1;
                l55 l55Var2 = l55.Y;
                if (m55Var == m55.X) {
                    return new zc2(l55Var == l55Var2 ? tr4Var.m(q31.g(j)) : tr4Var.k(q31.g(j)), q31.c(j) ? q31.g(j) : 32767, (byte) 2);
                }
                return new zc2(q31.d(j) ? q31.h(j) : 32767, l55Var == l55Var2 ? tr4Var.a(q31.h(j)) : tr4Var.K(q31.h(j)), (byte) 2);
        }
    }

    @Override // defpackage.tr4
    public final Object w() {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.Y.w();
    }
}
