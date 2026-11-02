package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qz6 extends kb0 {
    public final transient byte[][] g0;
    public final transient int[] h0;

    public qz6(byte[][] bArr, int[] iArr) {
        super(kb0.f0.X);
        this.g0 = bArr;
        this.h0 = iArr;
    }

    @Override // defpackage.kb0
    public final String a() {
        return v().a();
    }

    @Override // defpackage.kb0
    public final String b() {
        return v().b();
    }

    @Override // defpackage.kb0
    public final kb0 d(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.g0;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.h0;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new kb0(bArrDigest);
    }

    @Override // defpackage.kb0
    public final int e() {
        return this.h0[this.g0.length - 1];
    }

    @Override // defpackage.kb0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kb0) {
            kb0 kb0Var = (kb0) obj;
            if (kb0Var.e() == e() && m(0, kb0Var, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kb0
    public final String f() {
        return v().f();
    }

    @Override // defpackage.kb0
    public final int g(int i, byte[] bArr) {
        bArr.getClass();
        return v().g(i, bArr);
    }

    @Override // defpackage.kb0
    public final int hashCode() {
        int i = this.Y;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.g0;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.h0;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.Y = i3;
        return i3;
    }

    @Override // defpackage.kb0
    public final byte[] i() {
        return s();
    }

    @Override // defpackage.kb0
    public final byte j(int i) {
        byte[][] bArr = this.g0;
        int length = bArr.length - 1;
        int[] iArr = this.h0;
        os4.i(iArr[length], i, 1L);
        int iQ = nr4.Q(this, i);
        return bArr[iQ][(i - (iQ == 0 ? 0 : iArr[iQ - 1])) + iArr[bArr.length + iQ]];
    }

    @Override // defpackage.kb0
    public final int k(int i, byte[] bArr) {
        bArr.getClass();
        return v().k(i, bArr);
    }

    @Override // defpackage.kb0
    public final boolean m(int i, kb0 kb0Var, int i2) {
        kb0Var.getClass();
        if (i >= 0 && i <= e() - i2) {
            int i3 = i2 + i;
            int iQ = nr4.Q(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.h0;
                int i5 = iQ == 0 ? 0 : iArr[iQ - 1];
                int i6 = iArr[iQ] - i5;
                byte[][] bArr = this.g0;
                int i7 = iArr[bArr.length + iQ];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (kb0Var.n(bArr[iQ], i4, (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iQ++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.kb0
    public final boolean n(byte[] bArr, int i, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= e() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iQ = nr4.Q(this, i);
            while (i < i4) {
                int[] iArr = this.h0;
                int i5 = iQ == 0 ? 0 : iArr[iQ - 1];
                int i6 = iArr[iQ] - i5;
                byte[][] bArr2 = this.g0;
                int i7 = iArr[bArr2.length + iQ];
                int iMin = Math.min(i4, i6 + i5) - i;
                if (os4.f((i - i5) + i7, i2, iMin, bArr2[iQ], bArr)) {
                    i2 += iMin;
                    i += iMin;
                    iQ++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.kb0
    public final String o(Charset charset) {
        charset.getClass();
        return v().o(charset);
    }

    @Override // defpackage.kb0
    public final kb0 p(int i, int i2) {
        if (i < 0) {
            em7.c(ie2.h("beginIndex=", i, " < 0"));
            return null;
        }
        if (i2 > e()) {
            StringBuilder sbL = ie2.l("endIndex=", i2, " > length(");
            sbL.append(e());
            sbL.append(')');
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            em7.c(pc6.m("endIndex=", i2, i, " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == e()) {
            return this;
        }
        if (i == i2) {
            return kb0.f0;
        }
        int iQ = nr4.Q(this, i);
        int iQ2 = nr4.Q(this, i2 - 1);
        byte[][] bArr = this.g0;
        byte[][] bArr2 = (byte[][]) eu.k0(bArr, iQ, iQ2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.h0;
        if (iQ <= iQ2) {
            int i4 = iQ;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iQ2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iQ != 0 ? iArr2[iQ - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new qz6(bArr2, iArr);
    }

    @Override // defpackage.kb0
    public final kb0 r() {
        return v().r();
    }

    @Override // defpackage.kb0
    public final byte[] s() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.g0;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.h0;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            eu.d0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.kb0
    public final String toString() {
        return v().toString();
    }

    @Override // defpackage.kb0
    public final void u(int i, i90 i90Var) {
        int iQ = nr4.Q(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.h0;
            int i3 = iQ == 0 ? 0 : iArr[iQ - 1];
            int i4 = iArr[iQ] - i3;
            byte[][] bArr = this.g0;
            int i5 = iArr[bArr.length + iQ];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            mz6 mz6Var = new mz6(bArr[iQ], i6, i6 + iMin, true, false);
            mz6 mz6Var2 = i90Var.X;
            if (mz6Var2 == null) {
                mz6Var.g = mz6Var;
                mz6Var.f = mz6Var;
                i90Var.X = mz6Var;
            } else {
                mz6 mz6Var3 = mz6Var2.g;
                mz6Var3.getClass();
                mz6Var3.b(mz6Var);
            }
            i2 += iMin;
            iQ++;
        }
        i90Var.Y += (long) i;
    }

    public final kb0 v() {
        return new kb0(s());
    }
}
