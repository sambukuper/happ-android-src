package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r59 extends so3 {
    public static final char[] y0 = fq0.a(true);
    public static final char[] z0 = fq0.a(false);
    public final ih4 r0;
    public final char s0;
    public char[] t0;
    public int u0;
    public int v0;
    public final int w0;
    public char[] x0;

    public r59(k43 k43Var, int i, z75 z75Var, ih4 ih4Var, char c) {
        int[] iArrCopyOf;
        super(i, k43Var, z75Var);
        this.r0 = ih4Var;
        if (k43Var.h0 != null) {
            bt.i("Trying to call same allocXxx() method second time");
            throw null;
        }
        m90 m90Var = k43Var.Y;
        m90Var.getClass();
        int i2 = m90.d[1];
        i2 = i2 <= 0 ? 0 : i2;
        char[] cArr = (char[]) m90Var.b.getAndSet(1, null);
        cArr = (cArr == null || cArr.length < i2) ? new char[i2] : cArr;
        k43Var.h0 = cArr;
        this.t0 = cArr;
        this.w0 = cArr.length;
        this.s0 = c;
        boolean zP = p(gs3.ESCAPE_FORWARD_SLASHES.X);
        if (c != '\"' || zP) {
            if (c == '\"') {
                iArrCopyOf = zP ? fq0.g : fq0.f;
            } else {
                eq0 eq0Var = eq0.c;
                int[][] iArr = eq0Var.a;
                int[][] iArr2 = eq0Var.b;
                if (zP) {
                    iArrCopyOf = iArr2[c];
                    if (iArrCopyOf == null) {
                        iArrCopyOf = iArr[c];
                        if (iArrCopyOf == null) {
                            iArrCopyOf = Arrays.copyOf(fq0.f, 128);
                            if (iArrCopyOf[c] == 0) {
                                iArrCopyOf[c] = -1;
                            }
                            iArr[c] = iArrCopyOf;
                        }
                        iArrCopyOf[47] = 47;
                        iArr2[c] = iArrCopyOf;
                    }
                } else {
                    iArrCopyOf = iArr[c];
                    if (iArrCopyOf == null) {
                        iArrCopyOf = Arrays.copyOf(fq0.f, 128);
                        if (iArrCopyOf[c] == 0) {
                            iArrCopyOf[c] = -1;
                        }
                        iArr[c] = iArrCopyOf;
                    }
                }
            }
            this.l0 = iArrCopyOf;
        }
    }

    public static int p1(h90 h90Var, byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (i < i2) {
            bArr[i5] = bArr[i];
            i5++;
            i++;
        }
        int iMin = Math.min(i3, bArr.length);
        do {
            int i6 = iMin - i5;
            if (i6 == 0 || (i4 = h90Var.read(bArr, i5, i6)) < 0) {
                return i5;
            }
            i5 += i4;
        } while (i5 < 3);
        return i5;
    }

    @Override // defpackage.ro3
    public final void B0(short s) {
        h1("write a number");
        boolean z = this.g0;
        int i = this.w0;
        if (!z) {
            if (this.v0 + 6 >= i) {
                m1();
            }
            this.v0 = q75.e(this.t0, s, this.v0);
            return;
        }
        if (this.v0 + 8 >= i) {
            m1();
        }
        char[] cArr = this.t0;
        int i2 = this.v0;
        int i3 = i2 + 1;
        this.v0 = i3;
        char c = this.s0;
        cArr[i2] = c;
        int iE = q75.e(cArr, s, i3);
        char[] cArr2 = this.t0;
        this.v0 = iE + 1;
        cArr2[iE] = c;
    }

    @Override // defpackage.ro3
    public final void C(boolean z) {
        int i;
        h1("write a boolean value");
        if (this.v0 + 5 >= this.w0) {
            m1();
        }
        int i2 = this.v0;
        char[] cArr = this.t0;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.v0 = i + 1;
    }

    @Override // defpackage.ro3
    public final void C0(String str) {
        int length = str.length();
        int i = this.v0;
        int i2 = this.w0;
        int i3 = i2 - i;
        if (i3 == 0) {
            m1();
            i = this.v0;
            i3 = i2 - i;
        }
        char[] cArr = this.t0;
        if (i3 >= length) {
            str.getChars(0, length, cArr, i);
            this.v0 += length;
            return;
        }
        int i4 = i2 - i;
        str.getChars(0, i4, cArr, i);
        this.v0 += i4;
        m1();
        int length2 = str.length() - i4;
        while (true) {
            char[] cArr2 = this.t0;
            if (length2 <= i2) {
                str.getChars(i4, i4 + length2, cArr2, 0);
                this.u0 = 0;
                this.v0 = length2;
                return;
            } else {
                int i5 = i4 + i2;
                str.getChars(i4, i5, cArr2, 0);
                this.u0 = 0;
                this.v0 = i2;
                m1();
                length2 -= i2;
                i4 = i5;
            }
        }
    }

    @Override // defpackage.ro3
    public final void D() {
        fs3 fs3Var = this.h0;
        if (fs3Var.a != 1) {
            g("Current context not Array but ".concat(fs3Var.a()));
            throw null;
        }
        it5 it5Var = this.X;
        if (it5Var != null) {
            int i = fs3Var.b + 1;
            lf1 lf1Var = (lf1) it5Var;
            m85 m85Var = lf1Var.X;
            if (!m85Var.Y()) {
                lf1Var.f0--;
            }
            if (i > 0) {
                m85Var.c0(this, lf1Var.f0);
            } else {
                C0(lf1Var.k0);
            }
            v1(']');
        } else {
            if (this.v0 >= this.w0) {
                m1();
            }
            char[] cArr = this.t0;
            int i2 = this.v0;
            this.v0 = i2 + 1;
            cArr[i2] = ']';
        }
        this.h0 = this.h0.d;
    }

    @Override // defpackage.ro3
    public final void H0() throws xk7 {
        h1("start an array");
        fs3 fs3Var = this.h0;
        fs3 fs3Var2 = fs3Var.f;
        if (fs3Var2 == null) {
            z47 z47Var = fs3Var.e;
            fs3Var2 = new fs3(1, fs3Var, z47Var != null ? new z47((eq2) z47Var.Z) : null);
            fs3Var.f = fs3Var2;
        } else {
            fs3Var2.a = (byte) 1;
            fs3Var2.b = -1;
            fs3Var2.g = null;
            fs3Var2.i = false;
            z47 z47Var2 = fs3Var2.e;
            if (z47Var2 != null) {
                z47Var2.Y = null;
                z47Var2.f0 = null;
                z47Var2.g0 = null;
            }
        }
        this.h0 = fs3Var2;
        this.k0.b(fs3Var2.c);
        it5 it5Var = this.X;
        if (it5Var != null) {
            ((lf1) it5Var).a(this);
            return;
        }
        if (this.v0 >= this.w0) {
            m1();
        }
        char[] cArr = this.t0;
        int i = this.v0;
        this.v0 = i + 1;
        cArr[i] = '[';
    }

    @Override // defpackage.ro3
    public final void J() {
        fs3 fs3Var = this.h0;
        if (fs3Var.a != 2) {
            g("Current context not Object but ".concat(fs3Var.a()));
            throw null;
        }
        it5 it5Var = this.X;
        if (it5Var != null) {
            int i = fs3Var.b + 1;
            lf1 lf1Var = (lf1) it5Var;
            m85 m85Var = lf1Var.Y;
            if (!m85Var.Y()) {
                lf1Var.f0--;
            }
            if (i > 0) {
                m85Var.c0(this, lf1Var.f0);
            } else {
                C0(lf1Var.i0);
            }
            v1('}');
        } else {
            if (this.v0 >= this.w0) {
                m1();
            }
            char[] cArr = this.t0;
            int i2 = this.v0;
            this.v0 = i2 + 1;
            cArr[i2] = '}';
        }
        this.h0 = this.h0.d;
    }

    @Override // defpackage.ro3
    public final void J0(Object obj) throws xk7 {
        h1("start an array");
        fs3 fs3Var = this.h0;
        fs3 fs3Var2 = fs3Var.f;
        if (fs3Var2 == null) {
            z47 z47Var = fs3Var.e;
            fs3Var2 = new fs3(1, fs3Var, z47Var != null ? new z47((eq2) z47Var.Z) : null, obj);
            fs3Var.f = fs3Var2;
        } else {
            fs3Var2.a = (byte) 1;
            fs3Var2.b = -1;
            fs3Var2.g = null;
            fs3Var2.i = false;
            fs3Var2.h = obj;
            z47 z47Var2 = fs3Var2.e;
            if (z47Var2 != null) {
                z47Var2.Y = null;
                z47Var2.f0 = null;
                z47Var2.g0 = null;
            }
        }
        this.h0 = fs3Var2;
        this.k0.b(fs3Var2.c);
        it5 it5Var = this.X;
        if (it5Var != null) {
            ((lf1) it5Var).a(this);
            return;
        }
        if (this.v0 >= this.w0) {
            m1();
        }
        char[] cArr = this.t0;
        int i = this.v0;
        this.v0 = i + 1;
        cArr[i] = '[';
    }

    @Override // defpackage.ro3
    public final void R(r37 r37Var) {
        int iB = this.h0.b(r37Var.X);
        if (iB == 4) {
            g("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z = iB == 1;
        int i = this.w0;
        char c = this.s0;
        it5 it5Var = this.X;
        if (it5Var != null) {
            if (z) {
                lf1 lf1Var = (lf1) it5Var;
                C0(lf1Var.h0);
                lf1Var.Y.c0(this, lf1Var.f0);
            } else {
                lf1 lf1Var2 = (lf1) it5Var;
                lf1Var2.Y.c0(this, lf1Var2.f0);
            }
            char[] cArrA = r37Var.a();
            if (this.o0) {
                w1(cArrA, cArrA.length);
                return;
            }
            if (this.v0 >= i) {
                m1();
            }
            char[] cArr = this.t0;
            int i2 = this.v0;
            this.v0 = i2 + 1;
            cArr[i2] = c;
            w1(cArrA, cArrA.length);
            if (this.v0 >= i) {
                m1();
            }
            char[] cArr2 = this.t0;
            int i3 = this.v0;
            this.v0 = i3 + 1;
            cArr2[i3] = c;
            return;
        }
        if (this.v0 + 1 >= i) {
            m1();
        }
        if (z) {
            char[] cArr3 = this.t0;
            int i4 = this.v0;
            this.v0 = i4 + 1;
            cArr3[i4] = ',';
        }
        if (this.o0) {
            char[] cArrA2 = r37Var.a();
            w1(cArrA2, cArrA2.length);
            return;
        }
        char[] cArr4 = this.t0;
        int i5 = this.v0;
        int i6 = i5 + 1;
        this.v0 = i6;
        cArr4[i5] = c;
        char[] cArrA3 = r37Var.Y;
        if (cArrA3 == null) {
            cr3 cr3Var = r37.Z;
            String str = r37Var.X;
            cr3Var.getClass();
            cArrA3 = cr3.a(str);
            r37Var.Y = cArrA3;
        }
        int length = cArrA3.length;
        if (i6 + length > cArr4.length) {
            length = -1;
        } else {
            System.arraycopy(cArrA3, 0, cArr4, i6, length);
        }
        if (length < 0) {
            char[] cArrA4 = r37Var.a();
            w1(cArrA4, cArrA4.length);
            if (this.v0 >= i) {
                m1();
            }
            char[] cArr5 = this.t0;
            int i7 = this.v0;
            this.v0 = i7 + 1;
            cArr5[i7] = c;
            return;
        }
        int i8 = this.v0 + length;
        this.v0 = i8;
        if (i8 >= i) {
            m1();
        }
        char[] cArr6 = this.t0;
        int i9 = this.v0;
        this.v0 = i9 + 1;
        cArr6[i9] = c;
    }

    @Override // defpackage.ro3
    public final void U(String str) {
        int iB = this.h0.b(str);
        if (iB == 4) {
            g("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z = iB == 1;
        it5 it5Var = this.X;
        int i = this.w0;
        char c = this.s0;
        if (it5Var == null) {
            if (this.v0 + 1 >= i) {
                m1();
            }
            if (z) {
                char[] cArr = this.t0;
                int i2 = this.v0;
                this.v0 = i2 + 1;
                cArr[i2] = ',';
            }
            if (this.o0) {
                u1(str);
                return;
            }
            char[] cArr2 = this.t0;
            int i3 = this.v0;
            this.v0 = i3 + 1;
            cArr2[i3] = c;
            u1(str);
            if (this.v0 >= i) {
                m1();
            }
            char[] cArr3 = this.t0;
            int i4 = this.v0;
            this.v0 = i4 + 1;
            cArr3[i4] = c;
            return;
        }
        if (z) {
            lf1 lf1Var = (lf1) it5Var;
            C0(lf1Var.h0);
            lf1Var.Y.c0(this, lf1Var.f0);
        } else {
            lf1 lf1Var2 = (lf1) it5Var;
            lf1Var2.Y.c0(this, lf1Var2.f0);
        }
        if (this.o0) {
            u1(str);
            return;
        }
        if (this.v0 >= i) {
            m1();
        }
        char[] cArr4 = this.t0;
        int i5 = this.v0;
        this.v0 = i5 + 1;
        cArr4[i5] = c;
        u1(str);
        if (this.v0 >= i) {
            m1();
        }
        char[] cArr5 = this.t0;
        int i6 = this.v0;
        this.v0 = i6 + 1;
        cArr5[i6] = c;
    }

    @Override // defpackage.ro3
    public final void V0(Object obj) throws xk7 {
        h1("start an array");
        fs3 fs3Var = this.h0;
        fs3 fs3Var2 = fs3Var.f;
        if (fs3Var2 == null) {
            z47 z47Var = fs3Var.e;
            fs3Var2 = new fs3(1, fs3Var, z47Var != null ? new z47((eq2) z47Var.Z) : null, obj);
            fs3Var.f = fs3Var2;
        } else {
            fs3Var2.a = (byte) 1;
            fs3Var2.b = -1;
            fs3Var2.g = null;
            fs3Var2.i = false;
            fs3Var2.h = obj;
            z47 z47Var2 = fs3Var2.e;
            if (z47Var2 != null) {
                z47Var2.Y = null;
                z47Var2.f0 = null;
                z47Var2.g0 = null;
            }
        }
        this.h0 = fs3Var2;
        this.k0.b(fs3Var2.c);
        it5 it5Var = this.X;
        if (it5Var != null) {
            ((lf1) it5Var).a(this);
            return;
        }
        if (this.v0 >= this.w0) {
            m1();
        }
        char[] cArr = this.t0;
        int i = this.v0;
        this.v0 = i + 1;
        cArr[i] = '[';
    }

    @Override // defpackage.ro3
    public final void X() {
        h1("write a null");
        s1();
    }

    @Override // defpackage.ro3
    public final void Y(double d) {
        if (!this.g0) {
            String str = q75.a;
            if (Double.isFinite(d) || !p(qo3.i0)) {
                h1("write a number");
                C0(q75.g(d, p(qo3.n0)));
                return;
            }
        }
        c1(q75.g(d, p(qo3.n0)));
    }

    @Override // defpackage.ro3
    public final void Z0() throws xk7 {
        h1("start an object");
        fs3 fs3Var = this.h0;
        fs3 fs3Var2 = fs3Var.f;
        if (fs3Var2 == null) {
            z47 z47Var = fs3Var.e;
            fs3Var2 = new fs3(2, fs3Var, z47Var != null ? new z47((eq2) z47Var.Z) : null);
            fs3Var.f = fs3Var2;
        } else {
            fs3Var2.a = (byte) 2;
            fs3Var2.b = -1;
            fs3Var2.g = null;
            fs3Var2.i = false;
            z47 z47Var2 = fs3Var2.e;
            if (z47Var2 != null) {
                z47Var2.Y = null;
                z47Var2.f0 = null;
                z47Var2.g0 = null;
            }
        }
        this.h0 = fs3Var2;
        this.k0.b(fs3Var2.c);
        it5 it5Var = this.X;
        if (it5Var != null) {
            lf1 lf1Var = (lf1) it5Var;
            v1('{');
            if (lf1Var.Y.Y()) {
                return;
            }
            lf1Var.f0++;
            return;
        }
        if (this.v0 >= this.w0) {
            m1();
        }
        char[] cArr = this.t0;
        int i = this.v0;
        this.v0 = i + 1;
        cArr[i] = '{';
    }

    @Override // defpackage.ro3
    public final void a0(float f) {
        if (!this.g0) {
            String str = q75.a;
            if (Float.isFinite(f) || !p(qo3.i0)) {
                h1("write a number");
                C0(q75.h(f, p(qo3.n0)));
                return;
            }
        }
        c1(q75.h(f, p(qo3.n0)));
    }

    @Override // defpackage.ro3
    public final void a1(Object obj) throws xk7 {
        h1("start an object");
        fs3 fs3Var = this.h0;
        fs3 fs3Var2 = fs3Var.f;
        if (fs3Var2 == null) {
            z47 z47Var = fs3Var.e;
            fs3Var2 = new fs3(2, fs3Var, z47Var != null ? new z47((eq2) z47Var.Z) : null, obj);
            fs3Var.f = fs3Var2;
        } else {
            fs3Var2.a = (byte) 2;
            fs3Var2.b = -1;
            fs3Var2.g = null;
            fs3Var2.i = false;
            fs3Var2.h = obj;
            z47 z47Var2 = fs3Var2.e;
            if (z47Var2 != null) {
                z47Var2.Y = null;
                z47Var2.f0 = null;
                z47Var2.g0 = null;
            }
        }
        this.k0.b(fs3Var.c);
        this.h0 = fs3Var2;
        it5 it5Var = this.X;
        if (it5Var != null) {
            lf1 lf1Var = (lf1) it5Var;
            v1('{');
            if (lf1Var.Y.Y()) {
                return;
            }
            lf1Var.f0++;
            return;
        }
        if (this.v0 >= this.w0) {
            m1();
        }
        char[] cArr = this.t0;
        int i = this.v0;
        this.v0 = i + 1;
        cArr[i] = '{';
    }

    @Override // defpackage.ro3
    public final void b1(r37 r37Var) {
        char c = this.s0;
        h1("write a string");
        int i = this.v0;
        int i2 = this.w0;
        if (i >= i2) {
            m1();
        }
        char[] cArr = this.t0;
        int i3 = this.v0;
        int i4 = i3 + 1;
        this.v0 = i4;
        cArr[i3] = c;
        char[] cArrA = r37Var.Y;
        if (cArrA == null) {
            cr3 cr3Var = r37.Z;
            String str = r37Var.X;
            cr3Var.getClass();
            cArrA = cr3.a(str);
            r37Var.Y = cArrA;
        }
        int length = cArrA.length;
        if (i4 + length > cArr.length) {
            length = -1;
        } else {
            System.arraycopy(cArrA, 0, cArr, i4, length);
        }
        if (length >= 0) {
            int i5 = this.v0 + length;
            this.v0 = i5;
            if (i5 >= i2) {
                m1();
            }
            char[] cArr2 = this.t0;
            int i6 = this.v0;
            this.v0 = i6 + 1;
            cArr2[i6] = c;
            return;
        }
        char[] cArrA2 = r37Var.a();
        int length2 = cArrA2.length;
        if (length2 < 32) {
            if (length2 > i2 - this.v0) {
                m1();
            }
            System.arraycopy(cArrA2, 0, this.t0, this.v0, length2);
            this.v0 += length2;
        } else {
            m1();
            this.r0.write(cArrA2, 0, length2);
        }
        if (this.v0 >= i2) {
            m1();
        }
        char[] cArr3 = this.t0;
        int i7 = this.v0;
        this.v0 = i7 + 1;
        cArr3[i7] = c;
    }

    @Override // defpackage.ro3
    public final void c0(int i) {
        h1("write a number");
        boolean z = this.g0;
        int i2 = this.w0;
        if (!z) {
            if (this.v0 + 11 >= i2) {
                m1();
            }
            this.v0 = q75.e(this.t0, i, this.v0);
            return;
        }
        if (this.v0 + 13 >= i2) {
            m1();
        }
        char[] cArr = this.t0;
        int i3 = this.v0;
        int i4 = i3 + 1;
        this.v0 = i4;
        char c = this.s0;
        cArr[i3] = c;
        int iE = q75.e(cArr, i, i4);
        char[] cArr2 = this.t0;
        this.v0 = iE + 1;
        cArr2[iE] = c;
    }

    @Override // defpackage.ro3
    public final void c1(String str) {
        h1("write a string");
        if (str == null) {
            s1();
            return;
        }
        int i = this.v0;
        int i2 = this.w0;
        if (i >= i2) {
            m1();
        }
        char[] cArr = this.t0;
        int i3 = this.v0;
        this.v0 = i3 + 1;
        char c = this.s0;
        cArr[i3] = c;
        u1(str);
        if (this.v0 >= i2) {
            m1();
        }
        char[] cArr2 = this.t0;
        int i4 = this.v0;
        this.v0 = i4 + 1;
        cArr2[i4] = c;
    }

    @Override // defpackage.eq2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        try {
            if (this.t0 != null && p(qo3.f0)) {
                while (true) {
                    byte b = this.h0.a;
                    if (!(b == 1)) {
                        if (!(b == 2)) {
                            break;
                        } else {
                            J();
                        }
                    } else {
                        D();
                    }
                }
            }
            m1();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        this.u0 = 0;
        this.v0 = 0;
        if (this.r0 != null) {
            try {
                if (!p(qo3.Z)) {
                    p(qo3.g0);
                }
            } catch (IOException | RuntimeException e2) {
                if (e != null) {
                    e2.addSuppressed(e);
                }
                throw e2;
            }
        }
        char[] cArr = this.t0;
        if (cArr != null) {
            this.t0 = null;
            k43 k43Var = this.f0;
            char[] cArr2 = k43Var.h0;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                bt.q("Trying to release buffer smaller than original");
                return;
            }
            k43Var.h0 = null;
            AtomicReferenceArray atomicReferenceArray = k43Var.Y.b;
            char[] cArr3 = (char[]) atomicReferenceArray.get(1);
            if (cArr3 == null || cArr.length > cArr3.length) {
                atomicReferenceArray.set(1, cArr);
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[PHI: r11
  0x0045: PHI (r11v6 int) = (r11v3 int), (r11v7 int) binds: [B:15:0x0041, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ro3
    public final void d1(char[] cArr, int i, int i2) {
        char c;
        h1("write a string");
        int i3 = this.v0;
        int i4 = this.w0;
        if (i3 >= i4) {
            m1();
        }
        char[] cArr2 = this.t0;
        int i5 = this.v0;
        this.v0 = i5 + 1;
        char c2 = this.s0;
        cArr2[i5] = c2;
        int i6 = this.m0;
        int[] iArr = this.l0;
        ih4 ih4Var = this.r0;
        int i7 = 32;
        if (i6 != 0) {
            int i8 = i2 + i;
            int iMin = Math.min(iArr.length, i6 + 1);
            int i9 = 0;
            int i10 = i;
            while (i10 < i8) {
                int i11 = i10;
                do {
                    c = cArr[i11];
                    if (c < iMin) {
                        i9 = iArr[c];
                        if (i9 != 0) {
                            break;
                        } else {
                            i11++;
                        }
                    } else {
                        if (c > i6) {
                            i9 = -1;
                            break;
                        }
                        i11++;
                    }
                } while (i11 < i8);
                int i12 = i11 - i10;
                if (i12 < i7) {
                    if (this.v0 + i12 > i4) {
                        m1();
                    }
                    if (i12 > 0) {
                        System.arraycopy(cArr, i10, this.t0, this.v0, i12);
                        this.v0 += i12;
                    }
                } else {
                    m1();
                    ih4Var.write(cArr, i10, i12);
                }
                if (i11 >= i8) {
                    break;
                }
                i10 = i11 + 1;
                l1(c, i9);
                i7 = 32;
            }
        } else {
            int i13 = i2 + i;
            int length = iArr.length;
            int i14 = i;
            while (i14 < i13) {
                int i15 = i14;
                do {
                    char c3 = cArr[i15];
                    if (c3 < length && iArr[c3] != 0) {
                        break;
                    } else {
                        i15++;
                    }
                } while (i15 < i13);
                int i16 = i15 - i14;
                if (i16 < 32) {
                    if (this.v0 + i16 > i4) {
                        m1();
                    }
                    if (i16 > 0) {
                        System.arraycopy(cArr, i14, this.t0, this.v0, i16);
                        this.v0 += i16;
                    }
                } else {
                    m1();
                    ih4Var.write(cArr, i14, i16);
                }
                if (i15 >= i13) {
                    break;
                }
                i14 = i15 + 1;
                char c4 = cArr[i15];
                l1(c4, iArr[c4]);
            }
        }
        if (this.v0 >= i4) {
            m1();
        }
        char[] cArr3 = this.t0;
        int i17 = this.v0;
        this.v0 = i17 + 1;
        cArr3[i17] = c2;
    }

    @Override // defpackage.ro3, java.io.Flushable
    public final void flush() {
        m1();
        if (this.r0 != null) {
            p(qo3.g0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    @Override // defpackage.eq2
    public final void h1(String str) {
        char c;
        char c2;
        fs3 fs3Var = this.h0;
        byte b = fs3Var.a;
        if (b != 2) {
            int i = fs3Var.b;
            if (b == 1) {
                fs3Var.b = i + 1;
                if (i < 0) {
                    c = 0;
                } else {
                    c = 1;
                }
            } else {
                int i2 = i + 1;
                fs3Var.b = i2;
                if (i2 == 0) {
                    c = 0;
                } else {
                    c = 3;
                }
            }
        } else if (fs3Var.i) {
            fs3Var.i = false;
            fs3Var.b++;
            c = 2;
        } else {
            c = 5;
        }
        it5 it5Var = this.X;
        if (it5Var == null) {
            if (c == 1) {
                c2 = ',';
            } else {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 5) {
                            return;
                        }
                        i1(str);
                        throw null;
                    }
                    r37 r37Var = this.n0;
                    if (r37Var != null) {
                        C0(r37Var.X);
                        return;
                    }
                    return;
                }
                c2 = ':';
            }
            if (this.v0 >= this.w0) {
                m1();
            }
            char[] cArr = this.t0;
            int i3 = this.v0;
            this.v0 = i3 + 1;
            cArr[i3] = c2;
            return;
        }
        if (c == 0) {
            if (b == 1) {
                lf1 lf1Var = (lf1) it5Var;
                lf1Var.X.c0(this, lf1Var.f0);
                return;
            } else {
                if (b == 2) {
                    lf1 lf1Var2 = (lf1) it5Var;
                    lf1Var2.Y.c0(this, lf1Var2.f0);
                    return;
                }
                return;
            }
        }
        if (c == 1) {
            lf1 lf1Var3 = (lf1) it5Var;
            C0(lf1Var3.j0);
            lf1Var3.X.c0(this, lf1Var3.f0);
            return;
        }
        if (c == 2) {
            C0(((lf1) it5Var).g0);
            return;
        }
        if (c != 3) {
            if (c == 5) {
                i1(str);
                throw null;
            }
            int i4 = ev8.a;
            kp5.t("Internal error: this code path should never get executed");
            return;
        }
        r37 r37Var2 = ((lf1) it5Var).Z;
        if (r37Var2 != null) {
            String str2 = r37Var2.X;
            char[] cArr2 = this.t0;
            int i5 = this.v0;
            int length = str2.length();
            if (i5 + length > cArr2.length) {
                length = -1;
            } else {
                str2.getChars(0, length, cArr2, i5);
            }
            if (length < 0) {
                C0(str2);
            } else {
                this.v0 += length;
            }
        }
    }

    public final char[] k1() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.x0 = cArr;
        return cArr;
    }

    public final void l1(char c, int i) {
        int i2;
        int i3 = this.w0;
        if (i >= 0) {
            if (this.v0 + 2 > i3) {
                m1();
            }
            char[] cArr = this.t0;
            int i4 = this.v0;
            int i5 = i4 + 1;
            this.v0 = i5;
            cArr[i4] = '\\';
            this.v0 = i4 + 2;
            cArr[i5] = (char) i;
            return;
        }
        if (i == -2) {
            throw null;
        }
        if (this.v0 + 5 >= i3) {
            m1();
        }
        int i6 = this.v0;
        char[] cArr2 = this.t0;
        char[] cArr3 = this.p0 ? y0 : z0;
        cArr2[i6] = '\\';
        int i7 = i6 + 2;
        cArr2[i6 + 1] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            int i9 = i6 + 3;
            cArr2[i7] = cArr3[(i8 & 255) >> 4];
            i2 = i6 + 4;
            cArr2[i9] = cArr3[i8 & 15];
            c = (char) (c & 255);
        } else {
            int i10 = i6 + 3;
            cArr2[i7] = '0';
            i2 = i6 + 4;
            cArr2[i10] = '0';
        }
        cArr2[i2] = cArr3[c >> 4];
        cArr2[i2 + 1] = cArr3[c & 15];
        this.v0 = i2 + 2;
    }

    public final void m1() {
        int i = this.v0;
        int i2 = this.u0;
        int i3 = i - i2;
        if (i3 > 0) {
            this.u0 = 0;
            this.v0 = 0;
            this.r0.write(this.t0, i2, i3);
        }
    }

    public final int n1(char[] cArr, int i, int i2, char c, int i3) {
        int i4;
        ih4 ih4Var = this.r0;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArrK1 = this.x0;
            if (cArrK1 == null) {
                cArrK1 = k1();
            }
            cArrK1[1] = (char) i3;
            ih4Var.write(cArrK1, 0, 2);
            return i;
        }
        if (i3 == -2) {
            throw null;
        }
        char[] cArr2 = this.p0 ? y0 : z0;
        if (i <= 5 || i >= i2) {
            char[] cArrK2 = this.x0;
            if (cArrK2 == null) {
                cArrK2 = k1();
            }
            this.u0 = this.v0;
            if (c <= 255) {
                cArrK2[6] = cArr2[c >> 4];
                cArrK2[7] = cArr2[c & 15];
                ih4Var.write(cArrK2, 2, 6);
                return i;
            }
            int i6 = c >> '\b';
            cArrK2[10] = cArr2[(i6 & 255) >> 4];
            cArrK2[11] = cArr2[i6 & 15];
            cArrK2[12] = cArr2[(c & 255) >> 4];
            cArrK2[13] = cArr2[c & 15];
            ih4Var.write(cArrK2, 8, 6);
            return i;
        }
        cArr[i - 6] = '\\';
        int i7 = i - 4;
        cArr[i - 5] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            int i9 = i - 3;
            cArr[i7] = cArr2[(i8 & 255) >> 4];
            i4 = i - 2;
            cArr[i9] = cArr2[i8 & 15];
            c = (char) (c & 255);
        } else {
            int i10 = i - 3;
            cArr[i7] = '0';
            i4 = i - 2;
            cArr[i10] = '0';
        }
        cArr[i4] = cArr2[c >> 4];
        cArr[i4 + 1] = cArr2[c & 15];
        return i4 - 4;
    }

    public final void o1(char c, int i) {
        int i2;
        ih4 ih4Var = this.r0;
        if (i >= 0) {
            int i3 = this.v0;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.u0 = i4;
                char[] cArr = this.t0;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArrK1 = this.x0;
            if (cArrK1 == null) {
                cArrK1 = k1();
            }
            this.u0 = this.v0;
            cArrK1[1] = (char) i;
            ih4Var.write(cArrK1, 0, 2);
            return;
        }
        if (i == -2) {
            throw null;
        }
        char[] cArr2 = this.p0 ? y0 : z0;
        int i5 = this.v0;
        if (i5 < 6) {
            char[] cArrK2 = this.x0;
            if (cArrK2 == null) {
                cArrK2 = k1();
            }
            this.u0 = this.v0;
            if (c <= 255) {
                cArrK2[6] = cArr2[c >> 4];
                cArrK2[7] = cArr2[c & 15];
                ih4Var.write(cArrK2, 2, 6);
                return;
            } else {
                int i6 = c >> '\b';
                cArrK2[10] = cArr2[(i6 & 255) >> 4];
                cArrK2[11] = cArr2[i6 & 15];
                cArrK2[12] = cArr2[(c & 255) >> 4];
                cArrK2[13] = cArr2[c & 15];
                ih4Var.write(cArrK2, 8, 6);
                return;
            }
        }
        char[] cArr3 = this.t0;
        int i7 = i5 - 6;
        this.u0 = i7;
        cArr3[i7] = '\\';
        cArr3[i5 - 5] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            cArr3[i5 - 4] = cArr2[(i8 & 255) >> 4];
            i2 = i5 - 3;
            cArr3[i2] = cArr2[i8 & 15];
            c = (char) (c & 255);
        } else {
            cArr3[i5 - 4] = '0';
            i2 = i5 - 3;
            cArr3[i2] = '0';
        }
        cArr3[i2 + 1] = cArr2[c >> 4];
        cArr3[i2 + 2] = cArr2[c & 15];
    }

    public final int q1(l10 l10Var, h90 h90Var, byte[] bArr) {
        int i = this.w0 - 6;
        int i2 = 2;
        int i3 = l10Var.h0 >> 2;
        int i4 = -3;
        int i5 = 0;
        int iP1 = 0;
        int i6 = 0;
        while (true) {
            if (i5 > i4) {
                iP1 = p1(h90Var, bArr, i5, iP1, bArr.length);
                if (iP1 < 3) {
                    break;
                }
                i4 = iP1 - 3;
                i5 = 0;
            }
            if (this.v0 > i) {
                m1();
            }
            int i7 = i5 + 2;
            int i8 = ((bArr[i5 + 1] & 255) | (bArr[i5] << 8)) << 8;
            i5 += 3;
            i6 += 3;
            int iA = l10Var.a(this.t0, (bArr[i7] & 255) | i8, this.v0);
            this.v0 = iA;
            i3--;
            if (i3 <= 0) {
                char[] cArr = this.t0;
                int i9 = iA + 1;
                this.v0 = i9;
                cArr[iA] = '\\';
                this.v0 = iA + 2;
                cArr[i9] = 'n';
                i3 = l10Var.h0 >> 2;
            }
        }
        if (iP1 <= 0) {
            return i6;
        }
        if (this.v0 > i) {
            m1();
        }
        int i10 = bArr[0] << 16;
        if (1 < iP1) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i11 = i6 + i2;
        this.v0 = l10Var.b(i10, i2, this.t0, this.v0);
        return i11;
    }

    public final int r1(l10 l10Var, h90 h90Var, byte[] bArr, int i) {
        int iP1;
        int i2 = this.w0 - 6;
        int i3 = 2;
        int i4 = l10Var.h0 >> 2;
        int i5 = -3;
        int i6 = 0;
        int iP2 = 0;
        while (i > 2) {
            if (i6 > i5) {
                iP2 = p1(h90Var, bArr, i6, iP2, i);
                if (iP2 < 3) {
                    i6 = 0;
                    break;
                }
                i5 = iP2 - 3;
                i6 = 0;
            }
            if (this.v0 > i2) {
                m1();
            }
            int i7 = i6 + 2;
            int i8 = ((bArr[i6 + 1] & 255) | (bArr[i6] << 8)) << 8;
            i6 += 3;
            i -= 3;
            int iA = l10Var.a(this.t0, (bArr[i7] & 255) | i8, this.v0);
            this.v0 = iA;
            i4--;
            if (i4 <= 0) {
                char[] cArr = this.t0;
                int i9 = iA + 1;
                this.v0 = i9;
                cArr[iA] = '\\';
                this.v0 = iA + 2;
                cArr[i9] = 'n';
                i4 = l10Var.h0 >> 2;
            }
        }
        if (i <= 0 || (iP1 = p1(h90Var, bArr, i6, iP2, i)) <= 0) {
            return i;
        }
        if (this.v0 > i2) {
            m1();
        }
        int i10 = bArr[0] << 16;
        if (1 < iP1) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.v0 = l10Var.b(i10, i3, this.t0, this.v0);
        return i - i3;
    }

    public final void s1() {
        if (this.v0 + 4 >= this.w0) {
            m1();
        }
        int i = this.v0;
        char[] cArr = this.t0;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.v0 = i + 4;
    }

    public final void t1(String str) {
        int i = this.v0;
        int i2 = this.w0;
        if (i >= i2) {
            m1();
        }
        char[] cArr = this.t0;
        int i3 = this.v0;
        this.v0 = i3 + 1;
        char c = this.s0;
        cArr[i3] = c;
        C0(str);
        if (this.v0 >= i2) {
            m1();
        }
        char[] cArr2 = this.t0;
        int i4 = this.v0;
        this.v0 = i4 + 1;
        cArr2[i4] = c;
    }

    @Override // defpackage.ro3
    public final void u(l10 l10Var, byte[] bArr, int i, int i2) {
        int iA;
        if (bArr == null) {
            g("Invalid `byte[]` argument: `null`");
            throw null;
        }
        int length = bArr.length;
        int i3 = i + i2;
        if ((i | i2 | i3 | (length - i3)) < 0) {
            g(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
            throw null;
        }
        h1("write a binary value");
        int i4 = this.v0;
        int i5 = this.w0;
        if (i4 >= i5) {
            m1();
        }
        char[] cArr = this.t0;
        int i6 = this.v0;
        this.v0 = i6 + 1;
        char c = this.s0;
        cArr[i6] = c;
        int i7 = i3 - 3;
        int i8 = i5 - 6;
        int i9 = l10Var.h0;
        loop0: while (true) {
            int i10 = i9 >> 2;
            do {
                if (i > i7) {
                    break loop0;
                }
                if (this.v0 > i8) {
                    m1();
                }
                int i11 = i + 2;
                int i12 = ((bArr[i + 1] & 255) | (bArr[i] << 8)) << 8;
                i += 3;
                iA = l10Var.a(this.t0, i12 | (bArr[i11] & 255), this.v0);
                this.v0 = iA;
                i10--;
            } while (i10 > 0);
            char[] cArr2 = this.t0;
            int i13 = iA + 1;
            this.v0 = i13;
            cArr2[iA] = '\\';
            this.v0 = iA + 2;
            cArr2[i13] = 'n';
            i9 = l10Var.h0;
        }
        int i14 = i3 - i;
        if (i14 > 0) {
            if (this.v0 > i8) {
                m1();
            }
            int i15 = i + 1;
            int i16 = bArr[i] << 16;
            if (i14 == 2) {
                i16 |= (bArr[i15] & 255) << 8;
            }
            this.v0 = l10Var.b(i16, i14, this.t0, this.v0);
        }
        if (this.v0 >= i5) {
            m1();
        }
        char[] cArr3 = this.t0;
        int i17 = this.v0;
        this.v0 = i17 + 1;
        cArr3[i17] = c;
    }

    @Override // defpackage.ro3
    public final void u0(long j) {
        h1("write a number");
        boolean z = this.g0;
        int i = this.w0;
        if (!z) {
            if (this.v0 + 21 >= i) {
                m1();
            }
            this.v0 = q75.f(j, this.t0, this.v0);
            return;
        }
        if (this.v0 + 23 >= i) {
            m1();
        }
        char[] cArr = this.t0;
        int i2 = this.v0;
        int i3 = i2 + 1;
        this.v0 = i3;
        char c = this.s0;
        cArr[i2] = c;
        int iF = q75.f(j, cArr, i3);
        char[] cArr2 = this.t0;
        this.v0 = iF + 1;
        cArr2[iF] = c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[PHI: r16
  0x004b: PHI (r16v3 int) = (r16v0 int), (r16v4 int) binds: [B:18:0x0046, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068 A[LOOP:2: B:13:0x0039->B:28:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:90:0x004f A[EDGE_INSN: B:90:0x004f->B:22:0x004f BREAK  A[LOOP:2: B:13:0x0039->B:28:0x0068], SYNTHETIC] */
    public final void u1(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char[] cArr;
        char c;
        char[] cArr2;
        int i6;
        char c2;
        int length = str.length();
        ih4 ih4Var = this.r0;
        int i7 = this.w0;
        if (length <= i7) {
            if (this.v0 + length > i7) {
                m1();
            }
            str.getChars(0, length, this.t0, this.v0);
            int i8 = this.m0;
            int i9 = this.v0;
            int[] iArr = this.l0;
            if (i8 == 0) {
                int i10 = i9 + length;
                int length2 = iArr.length;
                while (this.v0 < i10) {
                    do {
                        char[] cArr3 = this.t0;
                        int i11 = this.v0;
                        char c3 = cArr3[i11];
                        if (c3 >= length2 || iArr[c3] == 0) {
                            i = i11 + 1;
                            this.v0 = i;
                        } else {
                            int i12 = this.u0;
                            int i13 = i11 - i12;
                            if (i13 > 0) {
                                ih4Var.write(cArr3, i12, i13);
                            }
                            char[] cArr4 = this.t0;
                            int i14 = this.v0;
                            this.v0 = i14 + 1;
                            char c4 = cArr4[i14];
                            o1(c4, iArr[c4]);
                        }
                    } while (i < i10);
                    return;
                }
                return;
            }
            int i15 = i9 + length;
            int iMin = Math.min(iArr.length, i8 + 1);
            while (this.v0 < i15) {
                do {
                    char[] cArr5 = this.t0;
                    int i16 = this.v0;
                    char c5 = cArr5[i16];
                    if (c5 < iMin) {
                        i2 = iArr[c5];
                        if (i2 != 0) {
                            i3 = this.u0;
                            i4 = i16 - i3;
                            if (i4 > 0) {
                                ih4Var.write(cArr5, i3, i4);
                            }
                            this.v0++;
                            o1(c5, i2);
                        }
                        i5 = i16 + 1;
                        this.v0 = i5;
                    } else {
                        if (c5 > i8) {
                            i2 = -1;
                            i3 = this.u0;
                            i4 = i16 - i3;
                            if (i4 > 0) {
                                ih4Var.write(cArr5, i3, i4);
                            }
                            this.v0++;
                            o1(c5, i2);
                        }
                        i5 = i16 + 1;
                        this.v0 = i5;
                    }
                } while (i5 < i15);
                return;
            }
            return;
        }
        m1();
        int length3 = str.length();
        int i17 = 0;
        while (true) {
            int i18 = i17 + i7 > length3 ? length3 - i17 : i7;
            int i19 = i17 + i18;
            str.getChars(i17, i19, this.t0, 0);
            int i20 = this.m0;
            int[] iArr2 = this.l0;
            if (i20 != 0) {
                int iMin2 = Math.min(iArr2.length, i20 + 1);
                int i21 = 0;
                int iN1 = 0;
                int i22 = 0;
                while (i21 < i18) {
                    while (true) {
                        cArr2 = this.t0;
                        i6 = i22;
                        c2 = cArr2[i21];
                        if (c2 < iMin2) {
                            i6 = iArr2[c2];
                            if (i6 != 0) {
                                break;
                            }
                            i21++;
                            if (i21 >= i18) {
                                break;
                            } else {
                                i22 = i6;
                            }
                        } else {
                            if (c2 > i20) {
                                i6 = -1;
                                break;
                            }
                            i21++;
                            if (i21 >= i18) {
                                break;
                                break;
                            }
                            i22 = i6;
                        }
                    }
                    int i23 = i21 - iN1;
                    if (i23 > 0) {
                        ih4Var.write(cArr2, iN1, i23);
                        if (i21 >= i18) {
                            break;
                        }
                    }
                    int i24 = i21 + 1;
                    int i25 = i6;
                    iN1 = n1(this.t0, i24, i18, c2, i25);
                    i21 = i24;
                    i22 = i25;
                }
            } else {
                int length4 = iArr2.length;
                int i26 = 0;
                int iN2 = 0;
                while (i26 < i18) {
                    do {
                        cArr = this.t0;
                        c = cArr[i26];
                        if (c < length4 && iArr2[c] != 0) {
                            break;
                        } else {
                            i26++;
                        }
                    } while (i26 < i18);
                    int i27 = i26 - iN2;
                    if (i27 > 0) {
                        ih4Var.write(cArr, iN2, i27);
                        if (i26 >= i18) {
                            break;
                        }
                    }
                    int i28 = i26 + 1;
                    iN2 = n1(this.t0, i28, i18, c, iArr2[c]);
                    i26 = i28;
                }
            }
            if (i19 >= length3) {
                return;
            } else {
                i17 = i19;
            }
        }
    }

    public final void v1(char c) {
        if (this.v0 >= this.w0) {
            m1();
        }
        char[] cArr = this.t0;
        int i = this.v0;
        this.v0 = i + 1;
        cArr[i] = c;
    }

    public final void w1(char[] cArr, int i) {
        int length = cArr.length;
        if (((length - i) | i) < 0) {
            g(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", 0, Integer.valueOf(i), Integer.valueOf(length)));
            throw null;
        }
        if (i >= 32) {
            m1();
            this.r0.write(cArr, 0, i);
        } else {
            if (i > this.w0 - this.v0) {
                m1();
            }
            System.arraycopy(cArr, 0, this.t0, this.v0, i);
            this.v0 += i;
        }
    }
}
