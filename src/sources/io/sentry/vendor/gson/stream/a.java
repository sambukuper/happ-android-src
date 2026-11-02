package io.sentry.vendor.gson.stream;

import defpackage.bt;
import defpackage.oi0;
import io.sentry.c2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {
    public final Reader X;
    public long k0;
    public int l0;
    public String m0;
    public int[] n0;
    public String[] p0;
    public int[] q0;
    public boolean Y = false;
    public final char[] Z = new char[1024];
    public int f0 = 0;
    public int g0 = 0;
    public int h0 = 0;
    public int i0 = 0;
    public int j0 = 0;
    public int o0 = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.n0 = iArr;
        iArr[0] = 6;
        this.p0 = new String[32];
        this.q0 = new int[32];
        this.X = reader;
    }

    public final int C(boolean z) throws IOException {
        int i = this.f0;
        int i2 = this.g0;
        while (true) {
            if (i == i2) {
                this.f0 = i;
                if (!m(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(u()));
                    }
                    return -1;
                }
                i = this.f0;
                i2 = this.g0;
            }
            int i3 = i + 1;
            char[] cArr = this.Z;
            char c = cArr[i];
            if (c == '\n') {
                this.h0++;
                this.i0 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f0 = i3;
                    if (i3 == i2) {
                        this.f0 = i;
                        boolean zM = m(2);
                        this.f0++;
                        if (!zM) {
                        }
                        return c;
                    }
                    g();
                    int i4 = this.f0;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f0 = i4 + 1;
                        while (true) {
                            if (this.f0 + 2 > this.g0 && !m(2)) {
                                a0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f0;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.f0;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.g0;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.h0++;
                                this.i0 = i5 + 1;
                            }
                            this.f0++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f0 = i4 + 1;
                        Y();
                        i = this.f0;
                        i2 = this.g0;
                    }
                } else {
                    if (c != '#') {
                        this.f0 = i3;
                        return c;
                    }
                    this.f0 = i3;
                    g();
                    Y();
                    i = this.f0;
                    i2 = this.g0;
                }
            }
            i = i3;
        }
    }

    public final String D(char c) throws d {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.f0;
            int i3 = this.g0;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    cArr = this.Z;
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (c2 == c) {
                            this.f0 = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.f0 = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(U());
                            i2 = this.f0;
                            i3 = this.g0;
                        } else {
                            if (c2 == '\n') {
                                this.h0++;
                                this.i0 = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.f0 = i2;
        } while (m(1));
        a0("Unterminated string");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    public final String J() throws d {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.f0 + i2;
                int i4 = this.g0;
                char[] cArr = this.Z;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        g();
                    }
                    i = i2;
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.f0, i2);
                    this.f0 += i2;
                    if (!m(1)) {
                    }
                } else if (!m(i2 + 1)) {
                    i = i2;
                }
                int i5 = this.f0;
                if (sb == null) {
                    string = new String(cArr, i5, i);
                } else {
                    sb.append(cArr, i5, i);
                    string = sb.toString();
                }
                this.f0 += i;
                return string;
            }
        }
    }

    public final void R(int i) {
        int i2 = this.o0;
        int[] iArr = this.n0;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.n0 = Arrays.copyOf(iArr, i3);
            this.q0 = Arrays.copyOf(this.q0, i3);
            this.p0 = (String[]) Arrays.copyOf(this.p0, i3);
        }
        int[] iArr2 = this.n0;
        int i4 = this.o0;
        this.o0 = i4 + 1;
        iArr2[i4] = i;
    }

    public final char U() throws d {
        int i;
        if (this.f0 == this.g0 && !m(1)) {
            a0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f0;
        int i3 = i2 + 1;
        this.f0 = i3;
        char[] cArr = this.Z;
        char c = cArr[i2];
        if (c == '\n') {
            this.h0++;
            this.i0 = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            a0("Invalid escape sequence");
            throw null;
        }
        if (i2 + 5 > this.g0 && !m(4)) {
            a0("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.f0;
        int i5 = i4 + 4;
        char c2 = 0;
        while (i4 < i5) {
            char c3 = cArr[i4];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f0, 4)));
                }
                i = c3 - '7';
            }
            c2 = (char) (i + c4);
            i4++;
        }
        this.f0 += 4;
        return c2;
    }

    public final void X(char c) throws d {
        do {
            int i = this.f0;
            int i2 = this.g0;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.Z[i];
                if (c2 == c) {
                    this.f0 = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f0 = i3;
                    U();
                    i = this.f0;
                    i2 = this.g0;
                } else {
                    if (c2 == '\n') {
                        this.h0++;
                        this.i0 = i3;
                    }
                    i = i3;
                }
            }
            this.f0 = i;
        } while (m(1));
        a0("Unterminated string");
        throw null;
    }

    public final void Y() {
        char c;
        do {
            if (this.f0 >= this.g0 && !m(1)) {
                return;
            }
            int i = this.f0;
            int i2 = i + 1;
            this.f0 = i2;
            c = this.Z[i];
            if (c == '\n') {
                this.h0++;
                this.i0 = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void a0(String str) throws d {
        throw new d(str.concat(u()));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.j0 = 0;
        this.n0[0] = 8;
        this.o0 = 1;
        this.X.close();
    }

    public final String e0() throws IOException {
        String strD;
        int iK = this.j0;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 14) {
            strD = J();
        } else if (iK == 12) {
            strD = D('\'');
        } else {
            if (iK != 13) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(peek());
                c2.l(sb, u());
                return null;
            }
            strD = D('\"');
        }
        this.j0 = 0;
        this.p0[this.o0 - 1] = strD;
        return strD;
    }

    public final void g() throws d {
        if (this.Y) {
            return;
        }
        a0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final boolean hasNext() throws IOException {
        int iK = this.j0;
        if (iK == 0) {
            iK = k();
        }
        return (iK == 2 || iK == 4) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017a  */
    /* JADX WARN: Code duplicated, block: B:119:0x018b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0191  */
    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a0 A[PHI: r1 r7
  0x01a0: PHI (r1v56 int) = (r1v55 int), (r1v71 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]
  0x01a0: PHI (r7v7 int) = (r7v6 int), (r7v8 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:169:0x020f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0211  */
    /* JADX WARN: Code duplicated, block: B:182:0x0232 A[DONT_INVERT, PHI: r10
  0x0232: PHI (r10v31 char) = (r10v30 char), (r10v32 char) binds: [B:168:0x020d, B:174:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:183:0x0234  */
    /* JADX WARN: Code duplicated, block: B:196:0x0252  */
    /* JADX WARN: Code duplicated, block: B:198:0x0256  */
    /* JADX WARN: Code duplicated, block: B:201:0x025b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0265 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:207:0x0266  */
    /* JADX WARN: Code duplicated, block: B:209:0x0270  */
    /* JADX WARN: Code duplicated, block: B:211:0x0276  */
    /* JADX WARN: Code duplicated, block: B:271:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0199 A[SYNTHETIC] */
    public final int k() throws IOException {
        int iC;
        String str;
        String str2;
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        boolean z;
        int i5;
        char c2;
        char c3;
        char c4;
        int i6;
        char c5;
        int[] iArr = this.n0;
        int i7 = this.o0 - 1;
        int i8 = iArr[i7];
        char[] cArr = this.Z;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iC2 = C(true);
            if (iC2 != 44) {
                if (iC2 != 59) {
                    if (iC2 == 93) {
                        this.j0 = 4;
                        return 4;
                    }
                    a0("Unterminated array");
                    throw null;
                }
                g();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5 && (iC = C(true)) != 44) {
                    if (iC != 59) {
                        if (iC == 125) {
                            this.j0 = 2;
                            return 2;
                        }
                        a0("Unterminated object");
                        throw null;
                    }
                    g();
                }
                int iC3 = C(true);
                if (iC3 == 34) {
                    this.j0 = 13;
                    return 13;
                }
                if (iC3 == 39) {
                    g();
                    this.j0 = 12;
                    return 12;
                }
                if (iC3 == 125) {
                    if (i8 != 5) {
                        this.j0 = 2;
                        return 2;
                    }
                    a0("Expected name");
                    throw null;
                }
                g();
                this.f0--;
                if (p((char) iC3)) {
                    this.j0 = 14;
                    return 14;
                }
                a0("Expected name");
                throw null;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iC4 = C(true);
                if (iC4 != 58) {
                    if (iC4 != 61) {
                        a0("Expected ':'");
                        throw null;
                    }
                    g();
                    if (this.f0 < this.g0 || m(1)) {
                        int i9 = this.f0;
                        if (cArr[i9] == '>') {
                            this.f0 = i9 + 1;
                        }
                    }
                }
            } else if (i8 == 6) {
                if (this.Y) {
                    C(true);
                    int i10 = this.f0;
                    int i11 = i10 - 1;
                    this.f0 = i11;
                    if ((i10 + 4 <= this.g0 || m(5)) && cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                        this.f0 += 5;
                    }
                }
                this.n0[this.o0 - 1] = 7;
            } else if (i8 == 7) {
                if (C(false) == -1) {
                    this.j0 = 17;
                    return 17;
                }
                g();
                this.f0--;
            } else if (i8 == 8) {
                bt.i("JsonReader is closed");
                return 0;
            }
        }
        int iC5 = C(true);
        if (iC5 == 34) {
            this.j0 = 9;
            return 9;
        }
        if (iC5 == 39) {
            g();
            this.j0 = 8;
            return 8;
        }
        if (iC5 != 44 && iC5 != 59) {
            if (iC5 == 91) {
                this.j0 = 3;
                return 3;
            }
            if (iC5 != 93) {
                if (iC5 == 123) {
                    this.j0 = 1;
                    return 1;
                }
                int i12 = this.f0 - 1;
                this.f0 = i12;
                char c6 = cArr[i12];
                if (c6 == 't' || c6 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (c6 != 'f' && c6 != 'F') {
                        if (c6 != 'n' && c6 != 'N') {
                            i2 = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        if (i2 != 0) {
                            return i2;
                        }
                        i3 = this.f0;
                        i4 = this.g0;
                        z = true;
                        i5 = 0;
                        boolean z2 = false;
                        c2 = 0;
                        long j = 0;
                        while (true) {
                            if (i3 + i5 != i4) {
                                c3 = cArr[i3 + i5];
                                if (c3 != '+') {
                                    if (c3 != 'E' || c3 == 'e') {
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i5++;
                                        }
                                    } else if (c3 == '-') {
                                        c4 = 6;
                                        if (c2 == 0) {
                                            z2 = true;
                                            c2 = 1;
                                        } else {
                                            if (c2 != 5) {
                                            }
                                            c2 = c4;
                                        }
                                        i5++;
                                    } else if (c3 != '.') {
                                        if (c3 >= '0' && c3 <= '9') {
                                            if (c2 == 1 || c2 == 0) {
                                                j = -(c3 - '0');
                                                c2 = 2;
                                            } else if (c2 == 2) {
                                                if (j != 0) {
                                                    long j2 = (10 * j) - ((long) (c3 - '0'));
                                                    z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                    j = j2;
                                                }
                                            } else if (c2 == 3) {
                                                c2 = 4;
                                            } else if (c2 == 5 || c2 == 6) {
                                                c2 = 7;
                                            }
                                            i5++;
                                        } else if (!p(c3)) {
                                            c5 = 2;
                                            if (c2 != 2) {
                                                if (c2 != c5 || c2 == 4 || c2 == 7) {
                                                    this.l0 = i5;
                                                    i6 = 16;
                                                    this.j0 = 16;
                                                }
                                            } else if (z || ((j == Long.MIN_VALUE && !z2) || (j == 0 && z2))) {
                                                c5 = 2;
                                                if (c2 != c5) {
                                                }
                                                this.l0 = i5;
                                                i6 = 16;
                                                this.j0 = 16;
                                            } else {
                                                if (!z2) {
                                                    j = -j;
                                                }
                                                this.k0 = j;
                                                this.f0 += i5;
                                                i6 = 15;
                                                this.j0 = 15;
                                            }
                                        }
                                    } else if (c2 == 2) {
                                        c2 = 3;
                                        i5++;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (p(cArr[this.f0])) {
                                        a0("Expected value");
                                        throw null;
                                    }
                                    g();
                                    this.j0 = 10;
                                    return 10;
                                }
                                c4 = 6;
                                if (c2 != 5) {
                                }
                                c2 = c4;
                                i5++;
                            } else if (i5 != cArr.length) {
                                if (!m(i5 + 1)) {
                                    i3 = this.f0;
                                    i4 = this.g0;
                                    c3 = cArr[i3 + i5];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                        } else {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                        }
                                        if (i6 != 0) {
                                            return i6;
                                        }
                                        if (p(cArr[this.f0])) {
                                            a0("Expected value");
                                            throw null;
                                        }
                                        g();
                                        this.j0 = 10;
                                        return 10;
                                    }
                                    c4 = 6;
                                    if (c2 != 5) {
                                    }
                                    c2 = c4;
                                    i5++;
                                }
                                c5 = 2;
                                if (c2 != 2) {
                                    if (c2 != c5) {
                                    }
                                    this.l0 = i5;
                                    i6 = 16;
                                    this.j0 = 16;
                                } else {
                                    if (z) {
                                    }
                                    c5 = 2;
                                    if (c2 != c5) {
                                    }
                                    this.l0 = i5;
                                    i6 = 16;
                                    this.j0 = 16;
                                }
                                if (i6 != 0) {
                                    return i6;
                                }
                                if (p(cArr[this.f0])) {
                                    a0("Expected value");
                                    throw null;
                                }
                                g();
                                this.j0 = 10;
                                return 10;
                            }
                            i6 = 0;
                            if (i6 != 0) {
                                return i6;
                            }
                            if (p(cArr[this.f0])) {
                                a0("Expected value");
                                throw null;
                            }
                            g();
                            this.j0 = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                int length = str.length();
                int i13 = 1;
                while (true) {
                    int i14 = this.f0;
                    int i15 = this.g0;
                    if (i13 >= length) {
                        if ((i14 + length >= i15 && !m(length + 1)) || !p(cArr[this.f0 + length])) {
                            this.f0 += length;
                            this.j0 = i;
                            i2 = i;
                            break;
                        }
                        break;
                    }
                    if ((i14 + i13 < i15 || m(i13 + 1)) && ((c = cArr[this.f0 + i13]) == str.charAt(i13) || c == str2.charAt(i13))) {
                        i13++;
                    }
                    i2 = 0;
                    break;
                }
                if (i2 != 0) {
                    return i2;
                }
                i3 = this.f0;
                i4 = this.g0;
                z = true;
                i5 = 0;
                boolean z3 = false;
                c2 = 0;
                long j3 = 0;
                while (true) {
                    if (i3 + i5 != i4) {
                        c3 = cArr[i3 + i5];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i5++;
                            } else {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i5++;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (p(cArr[this.f0])) {
                                a0("Expected value");
                                throw null;
                            }
                            g();
                            this.j0 = 10;
                            return 10;
                        }
                        c4 = 6;
                        if (c2 != 5) {
                        }
                        c2 = c4;
                        i5++;
                    } else if (i5 != cArr.length) {
                        if (!m(i5 + 1)) {
                            i3 = this.f0;
                            i4 = this.g0;
                            c3 = cArr[i3 + i5];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i5++;
                                } else {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i5++;
                                }
                                if (i6 != 0) {
                                    return i6;
                                }
                                if (p(cArr[this.f0])) {
                                    a0("Expected value");
                                    throw null;
                                }
                                g();
                                this.j0 = 10;
                                return 10;
                            }
                            c4 = 6;
                            if (c2 != 5) {
                            }
                            c2 = c4;
                            i5++;
                        }
                        c5 = 2;
                        if (c2 != 2) {
                            if (c2 != c5) {
                            }
                            this.l0 = i5;
                            i6 = 16;
                            this.j0 = 16;
                        } else {
                            if (z) {
                            }
                            c5 = 2;
                            if (c2 != c5) {
                            }
                            this.l0 = i5;
                            i6 = 16;
                            this.j0 = 16;
                        }
                        if (i6 != 0) {
                            return i6;
                        }
                        if (p(cArr[this.f0])) {
                            a0("Expected value");
                            throw null;
                        }
                        g();
                        this.j0 = 10;
                        return 10;
                    }
                    i6 = 0;
                    if (i6 != 0) {
                        return i6;
                    }
                    if (p(cArr[this.f0])) {
                        a0("Expected value");
                        throw null;
                    }
                    g();
                    this.j0 = 10;
                    return 10;
                }
            }
            if (i8 == 1) {
                this.j0 = 4;
                return 4;
            }
        }
        if (i8 != 1 && i8 != 2) {
            a0("Unexpected value");
            throw null;
        }
        g();
        this.f0--;
        this.j0 = 7;
        return 7;
    }

    public final boolean m(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.i0;
        int i5 = this.f0;
        this.i0 = i4 - i5;
        int i6 = this.g0;
        char[] cArr = this.Z;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.g0 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.g0 = 0;
        }
        this.f0 = 0;
        do {
            int i8 = this.g0;
            int i9 = this.X.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.g0 + i9;
            this.g0 = i2;
            if (this.h0 == 0 && (i3 = this.i0) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f0++;
                this.i0 = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final double nextDouble() throws IOException {
        int iK = this.j0;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 15) {
            this.j0 = 0;
            int[] iArr = this.q0;
            int i = this.o0 - 1;
            iArr[i] = iArr[i] + 1;
            return this.k0;
        }
        if (iK == 16) {
            this.m0 = new String(this.Z, this.f0, this.l0);
            this.f0 += this.l0;
        } else if (iK == 8 || iK == 9) {
            this.m0 = D(iK == 8 ? '\'' : '\"');
        } else if (iK == 10) {
            this.m0 = J();
        } else if (iK != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(peek());
            c2.l(sb, u());
            return 0.0d;
        }
        this.j0 = 11;
        double d = Double.parseDouble(this.m0);
        if (!this.Y && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new d("JSON forbids NaN and infinities: " + d + u());
        }
        this.m0 = null;
        this.j0 = 0;
        int[] iArr2 = this.q0;
        int i2 = this.o0 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public final boolean p(char c) throws d {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        g();
        return false;
    }

    public final b peek() throws IOException {
        int iK = this.j0;
        if (iK == 0) {
            iK = k();
        }
        switch (iK) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final String toString() {
        return a.class.getSimpleName().concat(u());
    }

    public final String u() {
        StringBuilder sbR = oi0.r(this.h0 + 1, " at line ", (this.f0 - this.i0) + 1, " column ", " path ");
        StringBuilder sb = new StringBuilder("$");
        int i = this.o0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.n0[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.q0[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.p0[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        sbR.append(sb.toString());
        return sbR.toString();
    }
}
