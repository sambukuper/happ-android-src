package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kq2 {
    public final jq2 a;
    public final int[] b;

    public kq2(jq2 jq2Var, int[] iArr) {
        if (iArr.length == 0) {
            kp5.e();
            throw null;
        }
        this.a = jq2Var;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public final kq2 a(kq2 kq2Var) {
        jq2 jq2Var = kq2Var.a;
        jq2 jq2Var2 = this.a;
        if (!jq2Var2.equals(jq2Var)) {
            bt.q("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (e()) {
            return kq2Var;
        }
        if (kq2Var.e()) {
            return this;
        }
        int[] iArr = kq2Var.b;
        int[] iArr2 = this.b;
        if (iArr2.length > iArr.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new kq2(jq2Var2, iArr3);
    }

    public final int b(int i) {
        if (i == 0) {
            return c(0);
        }
        int[] iArr = this.b;
        if (i != 1) {
            int iC = iArr[0];
            int length = iArr.length;
            for (int i2 = 1; i2 < length; i2++) {
                iC = this.a.c(i, iC) ^ iArr[i2];
            }
            return iC;
        }
        int i3 = 0;
        for (int i4 : iArr) {
            jq2 jq2Var = jq2.h;
            i3 ^= i4;
        }
        return i3;
    }

    public final int c(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public final int d() {
        return this.b.length - 1;
    }

    public final boolean e() {
        return this.b[0] == 0;
    }

    public final kq2 f(int i) {
        jq2 jq2Var = this.a;
        if (i == 0) {
            return jq2Var.c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = jq2Var.c(iArr[i2], i);
        }
        return new kq2(jq2Var, iArr2);
    }

    public final kq2 g(kq2 kq2Var) {
        jq2 jq2Var = kq2Var.a;
        jq2 jq2Var2 = this.a;
        if (!jq2Var2.equals(jq2Var)) {
            bt.q("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (e() || kq2Var.e()) {
            return jq2Var2.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = kq2Var.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = iArr3[i4] ^ jq2Var2.c(i2, iArr2[i3]);
            }
        }
        return new kq2(jq2Var2, iArr3);
    }

    public final kq2 h(int i, int i2) {
        if (i < 0) {
            kp5.e();
            return null;
        }
        jq2 jq2Var = this.a;
        if (i2 == 0) {
            return jq2Var.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = jq2Var.c(iArr[i3], i2);
        }
        return new kq2(jq2Var, iArr2);
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    if (iD == d()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    iC = -iC;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    jq2 jq2Var = this.a;
                    if (iC == 0) {
                        jq2Var.getClass();
                        kp5.e();
                        return null;
                    }
                    int i = jq2Var.b[iC];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (iD != 0) {
                    if (iD == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iD);
                    }
                }
            }
        }
        return sb.toString();
    }
}
