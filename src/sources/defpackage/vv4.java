package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vv4 {
    public final gx4 a;
    public final int b;
    public final int c;
    public final int d;
    public final vv4 e;
    public final int f;

    public vv4(m70 m70Var, gx4 gx4Var, int i, int i2, int i3, vv4 vv4Var, av8 av8Var) {
        this.a = gx4Var;
        this.b = i;
        gx4 gx4Var2 = gx4.BYTE;
        int i4 = (gx4Var == gx4Var2 || vv4Var == null) ? i2 : vv4Var.c;
        this.c = i4;
        this.d = i3;
        this.e = vv4Var;
        boolean z = false;
        int iA = vv4Var != null ? vv4Var.f : 0;
        if ((gx4Var == gx4Var2 && vv4Var == null && i4 != 0) || (vv4Var != null && i4 != vv4Var.c)) {
            z = true;
        }
        iA = (vv4Var == null || gx4Var != vv4Var.a || z) ? iA + gx4Var.a(av8Var) + 4 : iA;
        int iOrdinal = gx4Var.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                iA += i3 != 1 ? 11 : 6;
            } else if (iOrdinal == 4) {
                iA += ((String) m70Var.d).substring(i, i3 + i).getBytes(((wx1) m70Var.e).a[i2].charset()).length * 8;
                if (z) {
                    iA += 12;
                }
            } else if (iOrdinal == 6) {
                iA += 13;
            }
        } else {
            iA += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        }
        this.f = iA;
    }
}
