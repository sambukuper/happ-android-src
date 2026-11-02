package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dd1 implements rj2 {
    public final d0 a;
    public final int b;
    public final int c;
    public final List d;

    public dd1(d0 d0Var, int i, int i2, List list) {
        this.a = d0Var;
        this.b = i;
        this.c = i2;
        this.d = list;
        if (1 > i || i >= 10) {
            em7.c(ie2.h("The minimum number of digits (", i, ") is not in range 1..9"));
            throw null;
        }
        if (i > i2 || i2 >= 10) {
            em7.c(pc6.k(i2, "The maximum number of digits (", i, ") is not in range ", "..9"));
            throw null;
        }
    }

    @Override // defpackage.rj2
    public final void a(Object obj, StringBuilder sb, boolean z) {
        int[] iArr = yn0.d;
        cd1 cd1Var = (cd1) this.a.B(obj);
        int i = this.c;
        int iA = cd1Var.a(i);
        int i2 = 0;
        while (i > this.b + i2) {
            int i3 = i2 + 1;
            if (iA % iArr[i3] != 0) {
                break;
            } else {
                i2 = i3;
            }
        }
        int iIntValue = ((Number) this.d.get((i - i2) - 1)).intValue();
        if (i2 >= iIntValue) {
            i2 -= iIntValue;
        }
        sb.append((CharSequence) String.valueOf((iA / iArr[i2]) + iArr[i - i2]).substring(1));
    }
}
