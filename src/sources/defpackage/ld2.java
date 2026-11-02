package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ld2 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld2(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (byte) 3);
        this.a = (byte) 3;
    }

    public static kd2 a(ld2 ld2Var, bg3[] bg3VarArr) {
        return new kd2(ld2Var.b + ld2Var.c, bg3VarArr);
    }

    public static jd2 b(ld2 ld2Var) {
        return new jd2(ld2Var.b + ld2Var.c, 1, (byte) 0);
    }

    public static jd2 c() {
        return new jd2(0, 1, (byte) 0);
    }

    public void d(xr0 xr0Var, rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        bc7Var.a(xr0Var.h(0));
    }

    public abstract Object e(int i);

    public int f(z33 z33Var, int i) {
        if (i < 0 || this.b <= i) {
            return -1;
        }
        int iCharAt = z33Var.c.charAt(this.c + i);
        int i2 = z33Var.h;
        if (iCharAt >= i2) {
            iCharAt = (iCharAt - i2) + z33Var.g;
        }
        return iCharAt | 1610612736;
    }

    public int g(z33 z33Var, int i) {
        if (i < 0 || this.b <= i) {
            return -1;
        }
        int i2 = (i * 4) + this.c;
        k32 k32Var = z33.n;
        return z33Var.a.getInt(i2);
    }

    public int h(z33 z33Var, int i) {
        return -1;
    }

    public gp2 i(xr0 xr0Var) {
        return null;
    }

    public abstract byte[] j();

    public abstract byte[] k(int i, byte[] bArr);

    public String toString() {
        char c;
        switch (this.a) {
            case 2:
                int i = this.b;
                byte[] bArrK = new byte[i];
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i + 1) * i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    bArrK = k(i3, bArrK);
                    for (int i4 = 0; i4 < i; i4++) {
                        int i5 = bArrK[i4] & 255;
                        if (i5 < 64) {
                            c = '#';
                        } else if (i5 < 128) {
                            c = '+';
                        } else {
                            c = i5 < 192 ? '.' : ' ';
                        }
                        sb.append(c);
                    }
                    sb.append('\n');
                }
                return sb.toString();
            case 3:
                String strE = yb6.a.b(getClass()).E();
                return strE == null ? _UrlKt.FRAGMENT_ENCODE_SET : strE;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ld2(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }
}
