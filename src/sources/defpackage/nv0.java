package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class nv0 implements g83, rs6 {
    public int Y;
    public Object Z;
    public int X = 0;
    public Object f0 = new r75(0);

    public nv0(String str) {
        this.Y = 0;
        String strTrim = str.trim();
        this.Z = strTrim;
        this.Y = strTrim.length();
    }

    public static boolean F(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public static nv0 G(OutputStream outputStream, int i) {
        byte[] bArr = new byte[i];
        nv0 nv0Var = new nv0();
        nv0Var.f0 = outputStream;
        nv0Var.Z = bArr;
        nv0Var.Y = 0;
        nv0Var.X = bArr.length;
        return nv0Var;
    }

    public static int k(int i, int i2) {
        return m(i2) + r(i);
    }

    public static int l(int i, int i2) {
        return m(i2) + r(i);
    }

    public static int m(int i) {
        if (i >= 0) {
            return p(i);
        }
        return 10;
    }

    public static int n(int i, d2 d2Var) {
        return o(d2Var) + r(i);
    }

    public static int o(d2 d2Var) {
        int iB = d2Var.b();
        return p(iB) + iB;
    }

    public static int p(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int q(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int r(int i) {
        return p(i << 3);
    }

    public boolean A(int i) {
        int i2 = this.X + 1;
        if (i > this.Y || i2 > i) {
            return false;
        }
        return t08.d(Character.codePointBefore((CharSequence) this.Z, i));
    }

    public boolean B(int i) {
        h(i);
        if (!((BreakIterator) this.f0).isBoundary(i)) {
            return false;
        }
        if (D(i) && D(i - 1) && D(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.Z).length() - 1 || !(C(i) || C(i + 1));
    }

    public boolean C(int i) {
        CharSequence charSequence = (CharSequence) this.Z;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (dh3.f(unicodeBlockOf, unicodeBlock) && dh3.f(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return dh3.f(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && dh3.f(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean D(int i) {
        CharSequence charSequence = (CharSequence) this.Z;
        int i2 = this.X;
        if (i >= this.Y || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!yy1.d()) {
                return false;
            }
            yy1 yy1VarA = yy1.a();
            if (yy1VarA.c() != 1 || yy1VarA.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean E(int i) {
        int i2 = this.X;
        if (i >= this.Y || i2 > i) {
            return false;
        }
        return t08.d(Character.codePointAt((CharSequence) this.Z, i));
    }

    public int H(int i) {
        h(i);
        int iFollowing = ((BreakIterator) this.f0).following(i);
        return (D(iFollowing + (-1)) && D(iFollowing) && !C(iFollowing)) ? H(iFollowing) : iFollowing;
    }

    public Integer I() {
        int i = this.X;
        if (i == this.Y) {
            return null;
        }
        String str = (String) this.Z;
        this.X = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public float J() {
        r75 r75Var = (r75) this.f0;
        float fB = r75Var.b(this.X, this.Y, (String) this.Z);
        if (!Float.isNaN(fB)) {
            this.X = r75Var.Y;
        }
        return fB;
    }

    public ks6 K() {
        float fJ = J();
        if (Float.isNaN(fJ)) {
            return null;
        }
        int iO = O();
        return iO == 0 ? new ks6(1, fJ) : new ks6(iO, fJ);
    }

    public String L() {
        String str = (String) this.Z;
        if (w()) {
            return null;
        }
        int i = this.X;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iG = g();
        while (iG != -1 && iG != cCharAt) {
            iG = g();
        }
        if (iG == -1) {
            this.X = i;
            return null;
        }
        int i2 = this.X;
        this.X = i2 + 1;
        return str.substring(i + 1, i2);
    }

    public String M() {
        return N(' ', false);
    }

    public String N(char c, boolean z) {
        String str = (String) this.Z;
        if (w()) {
            return null;
        }
        char cCharAt = str.charAt(this.X);
        if ((!z && F(cCharAt)) || cCharAt == c) {
            return null;
        }
        int i = this.X;
        int iG = g();
        while (iG != -1 && iG != c && (z || !F(iG))) {
            iG = g();
        }
        return str.substring(i, this.X);
    }

    public int O() {
        String str = (String) this.Z;
        if (w()) {
            return 0;
        }
        char cCharAt = str.charAt(this.X);
        int i = this.X;
        if (cCharAt == '%') {
            this.X = i + 1;
            return 9;
        }
        if (i > this.Y - 2) {
            return 0;
        }
        try {
            int iX = pc6.x(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.X += 2;
            return iX;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public float P() {
        S();
        r75 r75Var = (r75) this.f0;
        float fB = r75Var.b(this.X, this.Y, (String) this.Z);
        if (!Float.isNaN(fB)) {
            this.X = r75Var.Y;
        }
        return fB;
    }

    public int Q(int i) {
        h(i);
        int iPreceding = ((BreakIterator) this.f0).preceding(i);
        return (D(iPreceding) && z(iPreceding) && !C(iPreceding)) ? Q(iPreceding) : iPreceding;
    }

    public void R() throws IOException {
        ((OutputStream) this.f0).write((byte[]) this.Z, 0, this.Y);
        this.Y = 0;
    }

    public boolean S() {
        T();
        int i = this.X;
        if (i == this.Y || ((String) this.Z).charAt(i) != ',') {
            return false;
        }
        this.X++;
        T();
        return true;
    }

    public void T() {
        while (true) {
            int i = this.X;
            if (i >= this.Y || !F(((String) this.Z).charAt(i))) {
                return;
            } else {
                this.X++;
            }
        }
    }

    public void U(int i, int i2) throws IOException {
        g0(i, 0);
        W(i2);
    }

    public void V(int i, int i2) throws IOException {
        g0(i, 0);
        W(i2);
    }

    public void W(int i) throws IOException {
        if (i >= 0) {
            e0(i);
        } else {
            f0(i);
        }
    }

    public void X(int i, d2 d2Var) throws IOException {
        g0(i, 2);
        Y(d2Var);
    }

    public void Y(d2 d2Var) throws IOException {
        e0(d2Var.b());
        d2Var.f(this);
    }

    public void Z(int i) throws IOException {
        byte b = (byte) i;
        if (this.Y == this.X) {
            R();
        }
        byte[] bArr = (byte[]) this.Z;
        int i2 = this.Y;
        this.Y = i2 + 1;
        bArr[i2] = b;
    }

    @Override // defpackage.rs6
    public void a(float f, float f2, float f3, float f4) {
        f((byte) 3);
        v(4);
        float[] fArr = (float[]) this.f0;
        int i = this.Y;
        int i2 = i + 1;
        this.Y = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.Y = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.Y = i4;
        fArr[i3] = f3;
        this.Y = i + 4;
        fArr[i4] = f4;
    }

    public void a0(jb0 jb0Var) throws IOException {
        int size = jb0Var.size();
        int i = this.X;
        int i2 = this.Y;
        int i3 = i - i2;
        byte[] bArr = (byte[]) this.Z;
        if (i3 >= size) {
            jb0Var.c(bArr, 0, i2, size);
            this.Y += size;
            return;
        }
        jb0Var.c(bArr, 0, i2, i3);
        int i4 = size - i3;
        this.Y = i;
        R();
        if (i4 <= i) {
            jb0Var.c(bArr, i3, 0, i4);
            this.Y = i4;
            return;
        }
        OutputStream outputStream = (OutputStream) this.f0;
        if (i3 < 0) {
            bt.e(30, i3, "Source offset < 0: ");
            return;
        }
        if (i4 < 0) {
            bt.e(23, i4, "Length < 0: ");
            return;
        }
        int i5 = i3 + i4;
        if (i5 > jb0Var.size()) {
            bt.e(39, i5, "Source end offset exceeded: ");
        } else if (i4 > 0) {
            jb0Var.s(outputStream, i3, i4);
        }
    }

    @Override // defpackage.rs6
    public void b(float f, float f2) {
        f((byte) 0);
        v(2);
        float[] fArr = (float[]) this.f0;
        int i = this.Y;
        int i2 = i + 1;
        this.Y = i2;
        fArr[i] = f;
        this.Y = i + 2;
        fArr[i2] = f2;
    }

    public void b0(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.X;
        int i2 = this.Y;
        int i3 = i - i2;
        byte[] bArr2 = (byte[]) this.Z;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i2, length);
            this.Y += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i3);
        int i4 = length - i3;
        this.Y = i;
        R();
        if (i4 > i) {
            ((OutputStream) this.f0).write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.Y = i4;
        }
    }

    @Override // defpackage.rs6
    public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        f((byte) 2);
        v(6);
        float[] fArr = (float[]) this.f0;
        int i = this.Y;
        int i2 = i + 1;
        this.Y = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.Y = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.Y = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.Y = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.Y = i6;
        fArr[i5] = f5;
        this.Y = i + 6;
        fArr[i6] = f6;
    }

    public void c0(int i) throws IOException {
        Z(i & 255);
        Z((i >> 8) & 255);
        Z((i >> 16) & 255);
        Z((i >> 24) & 255);
    }

    @Override // defpackage.rs6
    public void close() {
        f((byte) 8);
    }

    @Override // defpackage.rs6
    public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        f((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        v(5);
        float[] fArr = (float[]) this.f0;
        int i = this.Y;
        int i2 = i + 1;
        this.Y = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.Y = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.Y = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.Y = i5;
        fArr[i4] = f4;
        this.Y = i + 5;
        fArr[i5] = f5;
    }

    public void d0(long j) throws IOException {
        Z(((int) j) & 255);
        Z(((int) (j >> 8)) & 255);
        Z(((int) (j >> 16)) & 255);
        Z(((int) (j >> 24)) & 255);
        Z(((int) (j >> 32)) & 255);
        Z(((int) (j >> 40)) & 255);
        Z(((int) (j >> 48)) & 255);
        Z(((int) (j >> 56)) & 255);
    }

    @Override // defpackage.rs6
    public void e(float f, float f2) {
        f((byte) 1);
        v(2);
        float[] fArr = (float[]) this.f0;
        int i = this.Y;
        int i2 = i + 1;
        this.Y = i2;
        fArr[i] = f;
        this.Y = i + 2;
        fArr[i2] = f2;
    }

    public void e0(int i) throws IOException {
        while ((i & (-128)) != 0) {
            Z((i & 127) | 128);
            i >>>= 7;
        }
        Z(i);
    }

    public void f(byte b) {
        int i = this.X;
        byte[] bArr = (byte[]) this.Z;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.Z = bArr2;
            bArr = bArr2;
        }
        int i2 = this.X;
        this.X = i2 + 1;
        bArr[i2] = b;
    }

    public void f0(long j) throws IOException {
        while (((-128) & j) != 0) {
            Z((((int) j) & 127) | 128);
            j >>>= 7;
        }
        Z((int) j);
    }

    public int g() {
        int i = this.X;
        int i2 = this.Y;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.X = i3;
        if (i3 < i2) {
            return ((String) this.Z).charAt(i3);
        }
        return -1;
    }

    public void g0(int i, int i2) throws IOException {
        e0((i << 3) | i2);
    }

    public void h(int i) {
        int i2 = this.X;
        int i3 = this.Y;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbR = oi0.r(i, "Invalid offset: ", i2, ". Valid range is [", " , ");
        sbR.append(i3);
        sbR.append("]");
        xc3.a(sbR.toString());
    }

    public Boolean i(Object obj) {
        if (obj == null) {
            return null;
        }
        S();
        int i = this.X;
        if (i == this.Y) {
            return null;
        }
        char cCharAt = ((String) this.Z).charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.X++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public float j(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        S();
        return J();
    }

    public boolean s(char c) {
        int i = this.X;
        boolean z = i < this.Y && ((String) this.Z).charAt(i) == c;
        if (z) {
            this.X++;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r8.m0(r7, r9, r1, r0) == r6) goto L30;
     */
    @Override // defpackage.g83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(boolean r8, defpackage.s51 r9) {
        /*
            r7 = this;
            java.lang.Object r8 = r7.Z
            su.happ.proxyutility.feature.main.MainActivity r8 = (su.happ.proxyutility.feature.main.MainActivity) r8
            boolean r0 = r9 instanceof defpackage.yl4
            if (r0 == 0) goto L17
            r0 = r9
            yl4 r0 = (defpackage.yl4) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.h0 = r1
            goto L1c
        L17:
            yl4 r0 = new yl4
            r0.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r0.f0
            int r1 = r0.h0
            dn8 r2 = defpackage.dn8.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L39
            if (r1 == r5) goto L35
            if (r1 != r4) goto L2f
            defpackage.w39.n0(r9)
            return r2
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r7)
            return r3
        L35:
            defpackage.w39.n0(r9)
            goto L52
        L39:
            defpackage.w39.n0(r9)
            int r9 = r7.X
            int r9 = r9 + r5
            int r1 = r7.Y
            c71 r6 = defpackage.c71.X
            if (r9 >= r1) goto L5c
            java.lang.Object r7 = r7.f0
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0.h0 = r5
            java.lang.Object r7 = r8.m0(r7, r9, r1, r0)
            if (r7 != r6) goto L52
            goto L8d
        L52:
            m51 r7 = defpackage.ko1.B1
            ml2 r7 = r8.n()
            defpackage.km4.x(r7)
            return r2
        L5c:
            java.util.concurrent.atomic.AtomicBoolean r7 = r8.m1
            r9 = 0
            r7.set(r9)
            su.happ.proxyutility.feature.main.MainViewModel r7 = r8.G()
            su.happ.proxyutility.feature.main.MainViewModel.C(r7, r9, r4)
            ss8 r7 = defpackage.ss8.a
            boolean r7 = defpackage.ss8.x()
            if (r7 == 0) goto L7b
            m51 r7 = defpackage.ko1.B1
            ml2 r7 = r8.n()
            defpackage.km4.x(r7)
            return r2
        L7b:
            nf1 r7 = defpackage.tp1.a
            hv2 r7 = defpackage.dm4.a
            pl4 r9 = new pl4
            r1 = 6
            r9.<init>(r8, r3, r1)
            r0.h0 = r4
            java.lang.Object r7 = defpackage.w51.W(r7, r9, r0)
            if (r7 != r6) goto L8e
        L8d:
            return r6
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.t(boolean, s51):java.lang.Object");
    }

    public boolean u(String str) {
        int length = str.length();
        int i = this.X;
        boolean z = i <= this.Y - length && ((String) this.Z).substring(i, i + length).equals(str);
        if (z) {
            this.X += length;
        }
        return z;
    }

    public void v(int i) {
        float[] fArr = (float[]) this.f0;
        if (fArr.length < this.Y + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f0 = fArr2;
        }
    }

    public boolean w() {
        return this.X == this.Y;
    }

    public void x(rs6 rs6Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.X; i2++) {
            byte b = ((byte[]) this.Z)[i2];
            if (b == 0) {
                float[] fArr = (float[]) this.f0;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                rs6Var.b(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = (float[]) this.f0;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                rs6Var.e(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = (float[]) this.f0;
                rs6Var.c(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b == 3) {
                float[] fArr4 = (float[]) this.f0;
                float f3 = fArr4[i];
                float f4 = fArr4[i + 1];
                int i5 = i + 3;
                float f5 = fArr4[i + 2];
                i += 4;
                rs6Var.a(f3, f4, f5, fArr4[i5]);
            } else if (b != 8) {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = (float[]) this.f0;
                rs6Var.d(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                i += 5;
            } else {
                rs6Var.close();
            }
        }
    }

    public void y() throws IOException {
        R();
    }

    public boolean z(int i) {
        CharSequence charSequence = (CharSequence) this.Z;
        int i2 = this.X + 1;
        if (i > this.Y || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!yy1.d()) {
                    return false;
                }
                yy1 yy1VarA = yy1.a();
                if (yy1VarA.c() != 1 || yy1VarA.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }
}
