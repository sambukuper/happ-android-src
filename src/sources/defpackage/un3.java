package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class un3 extends hi5 {
    public final d7 g0;
    public final g55 h0;

    public un3(d7 d7Var, vm3 vm3Var) {
        vm3Var.getClass();
        this.g0 = d7Var;
        this.h0 = vm3Var.b;
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final byte A() {
        bk8 bk8Var;
        d7 d7Var = this.g0;
        String strM = d7Var.m();
        try {
            strM.getClass();
            lk8 lk8VarE = p38.e(strM);
            if (lk8VarE != null) {
                int i = lk8VarE.X;
                bk8Var = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new bk8((byte) i);
            }
            if (bk8Var != null) {
                return bk8Var.X;
            }
            mm7.T(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            d7.s(d7Var, p61.l('\'', "Failed to parse type 'UByte' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final short B() {
        dl8 dl8Var;
        d7 d7Var = this.g0;
        String strM = d7Var.m();
        try {
            strM.getClass();
            lk8 lk8VarE = p38.e(strM);
            if (lk8VarE != null) {
                int i = lk8VarE.X;
                dl8Var = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new dl8((short) i);
            }
            if (dl8Var != null) {
                return dl8Var.X;
            }
            mm7.T(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            d7.s(d7Var, p61.l('\'', "Failed to parse type 'UShort' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.f01
    public final int e(e37 e37Var) {
        e37Var.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final int l() {
        d7 d7Var = this.g0;
        String strM = d7Var.m();
        try {
            strM.getClass();
            lk8 lk8VarE = p38.e(strM);
            if (lk8VarE != null) {
                return lk8VarE.X;
            }
            mm7.T(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            d7.s(d7Var, p61.l('\'', "Failed to parse type 'UInt' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.f01
    public final g55 o() {
        return this.h0;
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final long v() {
        d7 d7Var = this.g0;
        String strM = d7Var.m();
        try {
            strM.getClass();
            tk8 tk8VarF = p38.f(strM);
            if (tk8VarF != null) {
                return tk8VarF.X;
            }
            mm7.T(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            d7.s(d7Var, p61.l('\'', "Failed to parse type 'ULong' for input '", strM), 0, null, 6);
            throw null;
        }
    }
}
