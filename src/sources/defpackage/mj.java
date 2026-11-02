package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mj implements xr4 {
    public final fk a;
    public boolean b;

    public mj(fk fkVar) {
        this.a = fkVar;
    }

    @Override // defpackage.xr4
    public final yr4 c(zr4 zr4Var, List list, long j) {
        rh5 rh5Var = this.a.b;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            eo5 eo5VarO = ((tr4) list.get(i)).o(j);
            iMax = Math.max(iMax, eo5VarO.X);
            iMax2 = Math.max(iMax2, eo5VarO.Y);
            arrayList.add(eo5VarO);
        }
        if (zr4Var.c0()) {
            this.b = true;
            rh5Var.setValue(new pf3((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            rh5Var.setValue(new pf3((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return zr4Var.g0(iMax, iMax2, e02.X, new wi(arrayList, (byte) 1));
    }

    @Override // defpackage.xr4
    public final int d(i55 i55Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA = ((tr4) list.get(0)).a(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iA2 = ((tr4) list.get(i2)).a(i);
                if (iA2 > iA) {
                    iA = iA2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iA;
    }

    @Override // defpackage.xr4
    public final int f(i55 i55Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iK = ((tr4) list.get(0)).k(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iK2 = ((tr4) list.get(i2)).k(i);
                if (iK2 > iK) {
                    iK = iK2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iK;
    }

    @Override // defpackage.xr4
    public final int g(i55 i55Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iK = ((tr4) list.get(0)).K(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iK2 = ((tr4) list.get(i2)).K(i);
                if (iK2 > iK) {
                    iK = iK2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iK;
    }

    @Override // defpackage.xr4
    public final int i(i55 i55Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iM = ((tr4) list.get(0)).m(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iM2 = ((tr4) list.get(i2)).m(i);
                if (iM2 > iM) {
                    iM = iM2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iM;
    }
}
