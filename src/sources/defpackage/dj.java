package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dj implements xr4 {
    public final lj a;
    public eo5[] b;
    public eo5[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final cj h = new cj(this, (byte) 1);
    public final cj i = new cj(this, (byte) 0);

    public dj(lj ljVar) {
        this.a = ljVar;
    }

    @Override // defpackage.xr4
    public final yr4 c(zr4 zr4Var, List list, long j) {
        qg5 qg5Var;
        int size = list.size();
        eo5[] eo5VarArr = new eo5[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            tr4 tr4Var = (tr4) list.get(i);
            Object objW = tr4Var.w();
            gj gjVar = objW instanceof gj ? (gj) objW : null;
            if (gjVar != null && ((Boolean) gjVar.X.getValue()).booleanValue()) {
                eo5 eo5VarO = tr4Var.o(j);
                long j3 = (((long) eo5VarO.Y) & 4294967295L) | (((long) eo5VarO.X) << 32);
                eo5VarArr[i] = eo5VarO;
                j2 = j3;
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            tr4 tr4Var2 = (tr4) list.get(i2);
            if (eo5VarArr[i2] == null) {
                eo5VarArr[i2] = tr4Var2.o(j);
            }
        }
        if (zr4Var.c0()) {
            qg5Var = new qg5(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                eo5 eo5Var = eo5VarArr[i5];
                if (eo5Var != null) {
                    Object objW2 = ((tr4) list.get(i5)).w();
                    gj gjVar2 = objW2 instanceof gj ? (gj) objW2 : null;
                    if (gjVar2 == null || !((Boolean) gjVar2.Y.getValue()).booleanValue()) {
                        int i6 = eo5Var.X;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = eo5Var.Y;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            qg5Var = new qg5(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) qg5Var.X).intValue();
        int iIntValue2 = ((Number) qg5Var.Y).intValue();
        boolean zC0 = zr4Var.c0();
        e02 e02Var = e02.X;
        if (zC0) {
            this.b = eo5VarArr;
            this.d = iIntValue;
            this.f = iIntValue2;
            return zr4Var.g0(iIntValue, iIntValue2, e02Var, this.h);
        }
        this.a.b.setValue(new pf3((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        this.c = eo5VarArr;
        this.e = iIntValue;
        this.g = iIntValue2;
        return zr4Var.g0(iIntValue, iIntValue2, e02Var, this.i);
    }

    @Override // defpackage.xr4
    public final int d(i55 i55Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((tr4) list.get(0)).a(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((tr4) list.get(i2)).a(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.xr4
    public final int f(i55 i55Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((tr4) list.get(0)).k(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((tr4) list.get(i2)).k(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.xr4
    public final int g(i55 i55Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((tr4) list.get(0)).K(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((tr4) list.get(i2)).K(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.xr4
    public final int i(i55 i55Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((tr4) list.get(0)).m(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((tr4) list.get(i2)).m(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
