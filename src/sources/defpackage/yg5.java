package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yg5 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        w88[] w88VarArr = v88.b;
        a = v88.c;
    }

    public static final xg5 a(xg5 xg5Var, int i, int i2, long j, i78 i78Var, fp5 fp5Var, aa4 aa4Var, int i3, int i4, e88 e88Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        i78 i78Var2 = i78Var;
        fp5 fp5Var2 = fp5Var;
        aa4 aa4Var2 = aa4Var;
        int i7 = i3;
        int i8 = i4;
        e88 e88Var2 = e88Var;
        if (i5 == 0 || i5 == xg5Var.a) {
            w88[] w88VarArr = v88.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (v88.a(j3, xg5Var.c)) {
                }
            }
            if ((i78Var2 == null || i78Var2.equals(xg5Var.d)) && ((i6 == 0 || i6 == xg5Var.b) && ((fp5Var2 == null || fp5Var2.equals(xg5Var.e)) && ((aa4Var2 == null || aa4Var2.equals(xg5Var.f)) && ((i7 == 0 || i7 == xg5Var.g) && ((i8 == 0 || i8 == xg5Var.h) && (e88Var2 == null || e88Var2.equals(xg5Var.i)))))))) {
                return xg5Var;
            }
        } else {
            j2 = 0;
        }
        w88[] w88VarArr2 = v88.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = xg5Var.c;
        }
        if (i78Var2 == null) {
            i78Var2 = xg5Var.d;
        }
        if (i5 == 0) {
            i5 = xg5Var.a;
        }
        if (i6 == 0) {
            i6 = xg5Var.b;
        }
        fp5 fp5Var3 = xg5Var.e;
        if (fp5Var3 != null && fp5Var2 == null) {
            fp5Var2 = fp5Var3;
        }
        if (aa4Var2 == null) {
            aa4Var2 = xg5Var.f;
        }
        if (i7 == 0) {
            i7 = xg5Var.g;
        }
        if (i8 == 0) {
            i8 = xg5Var.h;
        }
        if (e88Var2 == null) {
            e88Var2 = xg5Var.i;
        }
        return new xg5(i5, i6, j3, i78Var2, fp5Var2, aa4Var2, i7, i8, e88Var2);
    }
}
