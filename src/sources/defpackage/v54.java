package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v54 extends jx4 implements g34 {
    public static final t54 t0 = new t54();
    public x64 q0;
    public vk1 r0;
    public sd5 s0;

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        eo5 eo5VarO = tr4Var.o(j);
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, (byte) 8));
    }

    public final boolean Y0(r54 r54Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.s0 != sd5.X) {
                }
            } else if (i != 1 && i != 2) {
                bt.i("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (Z0(i) ? r54Var.a > 0 : r54Var.b < this.q0.a.d().o - 1) {
                return true;
            }
        } else if (this.s0 != sd5.Y) {
            if (Z0(i)) {
            }
        }
        return false;
    }

    public final boolean Z0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = yn0.Z(this).B0.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            b61.c();
            return false;
        }
        if (i != 4) {
            bt.i("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = yn0.Z(this).B0.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        b61.c();
        return false;
    }
}
