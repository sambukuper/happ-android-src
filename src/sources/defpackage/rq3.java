package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class rq3 implements Closeable {
    public final Reader X;
    public long j0;
    public int k0;
    public String l0;
    public int[] m0;
    public String[] o0;
    public int[] p0;
    public int q0 = 2;
    public final char[] Y = new char[1024];
    public int Z = 0;
    public int f0 = 0;
    public int g0 = 0;
    public int h0 = 0;
    public int i0 = 0;
    public int n0 = 1;

    static {
        k32.X = new k32();
    }

    public rq3(Reader reader) {
        int[] iArr = new int[32];
        this.m0 = iArr;
        iArr[0] = 6;
        this.o0 = new String[32];
        this.p0 = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.X = reader;
    }

    public final char B0() throws cp4 {
        int i;
        if (this.Z == this.f0 && !m(1)) {
            Z0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.Z;
        int i3 = i2 + 1;
        this.Z = i3;
        char[] cArr = this.Y;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
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
                            Z0("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.f0 && !m(4)) {
                            Z0("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.Z;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    Z0("Malformed Unicode escape \\u".concat(new String(cArr, this.Z, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.Z += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.q0 == 3) {
            Z0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.g0++;
        this.h0 = i3;
        if (this.q0 == 3) {
            Z0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public String C() {
        return u(true);
    }

    public final void C0(int i) {
        if (i == 0) {
            throw null;
        }
        this.q0 = i;
    }

    public final boolean D(char c) throws cp4 {
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

    public void F0() throws IOException {
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        if (iK != 1) {
            throw a1("BEGIN_OBJECT");
        }
        u0(3);
        this.i0 = 0;
    }

    public final void H0(char c) throws cp4 {
        do {
            int i = this.Z;
            int i2 = this.f0;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.Y[i];
                if (c2 == c) {
                    this.Z = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.Z = i3;
                    B0();
                    i = this.Z;
                    i2 = this.f0;
                } else {
                    if (c2 == '\n') {
                        this.g0++;
                        this.h0 = i3;
                    }
                    i = i3;
                }
            }
            this.Z = i;
        } while (m(1));
        Z0("Unterminated string");
        throw null;
    }

    final String J() {
        StringBuilder sbR = oi0.r(this.g0 + 1, " at line ", (this.Z - this.h0) + 1, " column ", " path ");
        sbR.append(p());
        return sbR.toString();
    }

    public final void J0() {
        char c;
        do {
            if (this.Z >= this.f0 && !m(1)) {
                return;
            }
            int i = this.Z;
            int i2 = i + 1;
            this.Z = i2;
            c = this.Y[i];
            if (c == '\n') {
                this.g0++;
                this.h0 = i2;
                return;
            }
        } while (c != '\r');
    }

    public void K0() throws IOException {
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        if (iK != 4) {
            throw a1("END_ARRAY");
        }
        int i = this.n0;
        this.n0 = i - 1;
        int[] iArr = this.p0;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.i0 = 0;
    }

    public void Q0() throws IOException {
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        if (iK != 3) {
            throw a1("BEGIN_ARRAY");
        }
        u0(1);
        this.p0[this.n0 - 1] = 0;
        this.i0 = 0;
    }

    public boolean R() throws IOException {
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 5) {
            this.i0 = 0;
            int[] iArr = this.p0;
            int i = this.n0 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iK != 6) {
            throw a1("a boolean");
        }
        this.i0 = 0;
        int[] iArr2 = this.p0;
        int i2 = this.n0 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final int U(boolean z) throws IOException {
        int i = this.Z;
        int i2 = this.f0;
        while (true) {
            if (i == i2) {
                this.Z = i;
                if (!m(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(J()));
                    }
                    return -1;
                }
                i = this.Z;
                i2 = this.f0;
            }
            int i3 = i + 1;
            char[] cArr = this.Y;
            char c = cArr[i];
            if (c == '\n') {
                this.g0++;
                this.h0 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.Z = i3;
                    if (i3 == i2) {
                        this.Z = i;
                        boolean zM = m(2);
                        this.Z++;
                        if (!zM) {
                        }
                        return c;
                    }
                    g();
                    int i4 = this.Z;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.Z = i4 + 1;
                        while (true) {
                            if (this.Z + 2 > this.f0 && !m(2)) {
                                Z0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.Z;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.Z;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.f0;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.g0++;
                                this.h0 = i5 + 1;
                            }
                            this.Z++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.Z = i4 + 1;
                        J0();
                        i = this.Z;
                        i2 = this.f0;
                    }
                } else {
                    if (c != '#') {
                        this.Z = i3;
                        return c;
                    }
                    this.Z = i3;
                    g();
                    J0();
                    i = this.Z;
                    i2 = this.f0;
                }
            }
            i = i3;
        }
    }

    public final void V0() throws cp4 {
        do {
            int i = 0;
            while (true) {
                int i2 = this.Z + i;
                if (i2 < this.f0) {
                    char c = this.Y[i2];
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
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        g();
                    }
                    this.Z += i;
                    return;
                }
                this.Z = i2;
            }
        } while (m(1));
    }

    public void X() throws IOException {
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        if (iK != 7) {
            throw a1("null");
        }
        this.i0 = 0;
        int[] iArr = this.p0;
        int i = this.n0 - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final String Y(char c) throws cp4 {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.Z;
            int i3 = this.f0;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    cArr = this.Y;
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (this.q0 == 3 && c2 < ' ') {
                            Z0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c2 == c) {
                            this.Z = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.Z = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(B0());
                            i2 = this.Z;
                            i3 = this.f0;
                        } else {
                            if (c2 == '\n') {
                                this.g0++;
                                this.h0 = i5;
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
            this.Z = i2;
        } while (m(1));
        Z0("Unterminated string");
        throw null;
    }

    public final void Z0(String str) throws cp4 {
        throw new cp4(oi0.p(new StringBuilder(str), J(), "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    public final String a0() throws cp4 {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.Z + i2;
                int i4 = this.f0;
                char[] cArr = this.Y;
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
                    sb.append(cArr, this.Z, i2);
                    this.Z += i2;
                    if (!m(1)) {
                    }
                } else if (!m(i2 + 1)) {
                    i = i2;
                }
                int i5 = this.Z;
                if (sb == null) {
                    string = new String(cArr, i5, i);
                } else {
                    sb.append(cArr, i5, i);
                    string = sb.toString();
                }
                this.Z += i;
                return string;
            }
        }
    }

    public final IllegalStateException a1(String str) {
        String str2 = c0() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbP = p61.p("Expected ", str, " but was ");
        sbP.append(ie2.r(c0()));
        sbP.append(J());
        sbP.append("\nSee ");
        sbP.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbP.toString());
    }

    public final void b1(String str) throws cp4 {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                Z0("String contains non-ASCII characters: ".concat(str));
                throw null;
            }
        }
    }

    public int c0() {
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        switch (iK) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
                return 5;
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i0 = 0;
        this.m0[0] = 8;
        this.n0 = 1;
        this.X.close();
    }

    public String e0() throws IOException {
        String strY;
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 14) {
            strY = a0();
        } else if (iK == 12) {
            strY = Y('\'');
        } else {
            if (iK != 13) {
                throw a1("a name");
            }
            strY = Y('\"');
        }
        this.i0 = 0;
        this.o0[this.n0 - 1] = strY;
        return strY;
    }

    public final void g() throws cp4 {
        if (this.q0 == 1) {
            return;
        }
        Z0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public boolean hasNext() throws IOException {
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        return (iK == 2 || iK == 4 || iK == 17) ? false : true;
    }

    public void j0() throws IOException {
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        if (iK != 2) {
            throw a1("END_OBJECT");
        }
        int i = this.n0;
        int i2 = i - 1;
        this.n0 = i2;
        this.o0[i2] = null;
        int[] iArr = this.p0;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.i0 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x0196  */
    /* JADX WARN: Code duplicated, block: B:126:0x019c  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ad A[PHI: r1 r10
  0x01ad: PHI (r1v56 int) = (r1v55 int), (r1v72 int) binds: [B:122:0x0194, B:130:0x01a9] A[DONT_GENERATE, DONT_INLINE]
  0x01ad: PHI (r10v6 int) = (r10v5 int), (r10v7 int) binds: [B:122:0x0194, B:130:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:176:0x0227  */
    /* JADX WARN: Code duplicated, block: B:177:0x0229  */
    /* JADX WARN: Code duplicated, block: B:190:0x024c A[DONT_INVERT, PHI: r8
  0x024c: PHI (r8v20 char) = (r8v19 char), (r8v21 char) binds: [B:175:0x0225, B:181:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x024e  */
    /* JADX WARN: Code duplicated, block: B:204:0x026a  */
    /* JADX WARN: Code duplicated, block: B:206:0x026d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0272 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x027e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:214:0x027f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0289  */
    /* JADX WARN: Code duplicated, block: B:218:0x0291  */
    /* JADX WARN: Code duplicated, block: B:280:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x01a4 A[SYNTHETIC] */
    public final int k() throws IOException {
        int iU;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        int i4;
        int i5;
        boolean z;
        int i6;
        char c2;
        char c3;
        int i7;
        char c4;
        int[] iArr = this.m0;
        boolean z2 = true;
        int i8 = this.n0 - 1;
        int i9 = iArr[i8];
        char[] cArr = this.Y;
        if (i9 == 1) {
            iArr[i8] = 2;
        } else if (i9 == 2) {
            int iU2 = U(true);
            if (iU2 != 44) {
                if (iU2 != 59) {
                    if (iU2 == 93) {
                        this.i0 = 4;
                        return 4;
                    }
                    Z0("Unterminated array");
                    throw null;
                }
                g();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 == 5 && (iU = U(true)) != 44) {
                    if (iU != 59) {
                        if (iU == 125) {
                            this.i0 = 2;
                            return 2;
                        }
                        Z0("Unterminated object");
                        throw null;
                    }
                    g();
                }
                int iU3 = U(true);
                if (iU3 == 34) {
                    this.i0 = 13;
                    return 13;
                }
                if (iU3 == 39) {
                    g();
                    this.i0 = 12;
                    return 12;
                }
                if (iU3 == 125) {
                    if (i9 != 5) {
                        this.i0 = 2;
                        return 2;
                    }
                    Z0("Expected name");
                    throw null;
                }
                g();
                this.Z--;
                if (D((char) iU3)) {
                    this.i0 = 14;
                    return 14;
                }
                Z0("Expected name");
                throw null;
            }
            if (i9 == 4) {
                iArr[i8] = 5;
                int iU4 = U(true);
                if (iU4 != 58) {
                    if (iU4 != 61) {
                        Z0("Expected ':'");
                        throw null;
                    }
                    g();
                    if (this.Z < this.f0 || m(1)) {
                        int i10 = this.Z;
                        if (cArr[i10] == '>') {
                            this.Z = i10 + 1;
                        }
                    }
                }
            } else if (i9 == 6) {
                if (this.q0 == 1) {
                    U(true);
                    int i11 = this.Z;
                    this.Z = i11 - 1;
                    if (i11 + 4 <= this.f0 || m(5)) {
                        int i12 = this.Z;
                        if (cArr[i12] == ')' && cArr[i12 + 1] == ']' && cArr[i12 + 2] == '}' && cArr[i12 + 3] == '\'' && cArr[i12 + 4] == '\n') {
                            this.Z = i12 + 5;
                        }
                    }
                }
                this.m0[this.n0 - 1] = 7;
            } else if (i9 == 7) {
                if (U(false) == -1) {
                    this.i0 = 17;
                    return 17;
                }
                g();
                this.Z--;
            } else if (i9 == 8) {
                bt.i("JsonReader is closed");
                return 0;
            }
        }
        int iU5 = U(true);
        if (iU5 == 34) {
            this.i0 = 9;
            return 9;
        }
        if (iU5 == 39) {
            g();
            this.i0 = 8;
            return 8;
        }
        if (iU5 == 44 || iU5 == 59) {
            i = 1;
        } else {
            if (iU5 == 91) {
                this.i0 = 3;
                return 3;
            }
            if (iU5 != 93) {
                if (iU5 == 123) {
                    this.i0 = 1;
                    return 1;
                }
                int i13 = this.Z - 1;
                this.Z = i13;
                char c5 = cArr[i13];
                if (c5 == 't' || c5 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                } else {
                    if (c5 != 'f' && c5 != 'F') {
                        if (c5 != 'n' && c5 != 'N') {
                            i3 = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i2 = 7;
                        if (i3 != 0) {
                            return i3;
                        }
                        i4 = this.Z;
                        i5 = this.f0;
                        z = true;
                        i6 = 0;
                        long j = 0;
                        boolean z3 = false;
                        c2 = 0;
                        while (true) {
                            if (i4 + i6 != i5) {
                                c3 = cArr[i4 + i6];
                                if (c3 != '+') {
                                    if (c3 != 'E' || c3 == 'e') {
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        }
                                    } else if (c3 == '-') {
                                        if (c2 == 0) {
                                            z3 = true;
                                            c2 = 1;
                                        } else {
                                            if (c2 != 5) {
                                            }
                                            c2 = 6;
                                        }
                                        i6++;
                                        z2 = true;
                                    } else if (c3 != '.') {
                                        if (c3 >= '0' && c3 <= '9') {
                                            if (c2 == z2 || c2 == 0) {
                                                j = -(c3 - '0');
                                                c2 = 2;
                                            } else if (c2 != 2) {
                                                long j2 = j;
                                                if (c2 == 3) {
                                                    j = j2;
                                                    c2 = 4;
                                                } else if (c2 == 5 || c2 == 6) {
                                                    j = j2;
                                                    c2 = 7;
                                                } else {
                                                    j = j2;
                                                }
                                            } else if (j != 0) {
                                                long j3 = j;
                                                long j4 = (10 * j) - ((long) (c3 - '0'));
                                                z &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                                j = j4;
                                            }
                                            i6++;
                                            z2 = true;
                                        } else if (!D(c3)) {
                                            c4 = 2;
                                            if (c2 != 2) {
                                                if (c2 != c4 || c2 == 4 || c2 == 7) {
                                                    this.k0 = i6;
                                                    i7 = 16;
                                                    this.i0 = 16;
                                                }
                                            } else if (z || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
                                                c4 = 2;
                                                if (c2 != c4) {
                                                }
                                                this.k0 = i6;
                                                i7 = 16;
                                                this.i0 = 16;
                                            } else {
                                                long j5 = j;
                                                if (!z3) {
                                                    j5 = -j5;
                                                }
                                                this.j0 = j5;
                                                this.Z += i6;
                                                i7 = 15;
                                                this.i0 = 15;
                                            }
                                        }
                                    } else if (c2 == 2) {
                                        c2 = 3;
                                        i6++;
                                        z2 = true;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (D(cArr[this.Z])) {
                                        Z0("Expected value");
                                        throw null;
                                    }
                                    g();
                                    this.i0 = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i6++;
                                z2 = true;
                            } else if (i6 != cArr.length) {
                                if (!m(i6 + 1)) {
                                    i4 = this.Z;
                                    i5 = this.f0;
                                    c3 = cArr[i4 + i6];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        } else {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (D(cArr[this.Z])) {
                                            Z0("Expected value");
                                            throw null;
                                        }
                                        g();
                                        this.i0 = 10;
                                        return 10;
                                    }
                                    if (c2 != 5) {
                                    }
                                    c2 = 6;
                                    i6++;
                                    z2 = true;
                                }
                                c4 = 2;
                                if (c2 != 2) {
                                    if (c2 != c4) {
                                    }
                                    this.k0 = i6;
                                    i7 = 16;
                                    this.i0 = 16;
                                } else {
                                    if (z) {
                                    }
                                    c4 = 2;
                                    if (c2 != c4) {
                                    }
                                    this.k0 = i6;
                                    i7 = 16;
                                    this.i0 = 16;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (D(cArr[this.Z])) {
                                    Z0("Expected value");
                                    throw null;
                                }
                                g();
                                this.i0 = 10;
                                return 10;
                            }
                            i7 = 0;
                            if (i7 != 0) {
                                return i7;
                            }
                            if (D(cArr[this.Z])) {
                                Z0("Expected value");
                                throw null;
                            }
                            g();
                            this.i0 = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i2 = 6;
                }
                boolean z4 = this.q0 != 3;
                int length = str.length();
                int i14 = 0;
                while (true) {
                    int i15 = this.Z;
                    int i16 = this.f0;
                    if (i14 >= length) {
                        if ((i15 + length >= i16 && !m(length + 1)) || !D(cArr[this.Z + length])) {
                            this.Z += length;
                            this.i0 = i2;
                            i3 = i2;
                            break;
                        }
                        break;
                    }
                    if ((i15 + i14 < i16 || m(i14 + 1)) && ((c = cArr[this.Z + i14]) == str.charAt(i14) || (z4 && c == str2.charAt(i14)))) {
                        i14++;
                    }
                    i3 = 0;
                    break;
                }
                if (i3 != 0) {
                    return i3;
                }
                i4 = this.Z;
                i5 = this.f0;
                z = true;
                i6 = 0;
                long j6 = 0;
                boolean z5 = false;
                c2 = 0;
                while (true) {
                    if (i4 + i6 != i5) {
                        c3 = cArr[i4 + i6];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z2 = true;
                            } else {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z2 = true;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (D(cArr[this.Z])) {
                                Z0("Expected value");
                                throw null;
                            }
                            g();
                            this.i0 = 10;
                            return 10;
                        }
                        if (c2 != 5) {
                        }
                        c2 = 6;
                        i6++;
                        z2 = true;
                    } else if (i6 != cArr.length) {
                        if (!m(i6 + 1)) {
                            i4 = this.Z;
                            i5 = this.f0;
                            c3 = cArr[i4 + i6];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z2 = true;
                                } else {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z2 = true;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (D(cArr[this.Z])) {
                                    Z0("Expected value");
                                    throw null;
                                }
                                g();
                                this.i0 = 10;
                                return 10;
                            }
                            if (c2 != 5) {
                            }
                            c2 = 6;
                            i6++;
                            z2 = true;
                        }
                        c4 = 2;
                        if (c2 != 2) {
                            if (c2 != c4) {
                            }
                            this.k0 = i6;
                            i7 = 16;
                            this.i0 = 16;
                        } else {
                            if (z) {
                            }
                            c4 = 2;
                            if (c2 != c4) {
                            }
                            this.k0 = i6;
                            i7 = 16;
                            this.i0 = 16;
                        }
                        if (i7 != 0) {
                            return i7;
                        }
                        if (D(cArr[this.Z])) {
                            Z0("Expected value");
                            throw null;
                        }
                        g();
                        this.i0 = 10;
                        return 10;
                    }
                    i7 = 0;
                    if (i7 != 0) {
                        return i7;
                    }
                    if (D(cArr[this.Z])) {
                        Z0("Expected value");
                        throw null;
                    }
                    g();
                    this.i0 = 10;
                    return 10;
                }
            }
            i = 1;
            if (i9 == 1) {
                this.i0 = 4;
                return 4;
            }
        }
        if (i9 != i && i9 != 2) {
            Z0("Unexpected value");
            throw null;
        }
        g();
        this.Z -= i;
        this.i0 = 7;
        return 7;
    }

    public final boolean m(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.h0;
        int i5 = this.Z;
        this.h0 = i4 - i5;
        int i6 = this.f0;
        char[] cArr = this.Y;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f0 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f0 = 0;
        }
        this.Z = 0;
        do {
            int i8 = this.f0;
            int i9 = this.X.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f0 + i9;
            this.f0 = i2;
            if (this.g0 == 0 && (i3 = this.h0) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.Z++;
                this.h0 = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public double nextDouble() throws IOException {
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 15) {
            this.i0 = 0;
            int[] iArr = this.p0;
            int i = this.n0 - 1;
            iArr[i] = iArr[i] + 1;
            return this.j0;
        }
        if (iK == 16) {
            this.l0 = new String(this.Y, this.Z, this.k0);
            this.Z += this.k0;
        } else if (iK == 8 || iK == 9) {
            this.l0 = Y(iK == 8 ? '\'' : '\"');
        } else if (iK == 10) {
            this.l0 = a0();
        } else if (iK != 11) {
            throw a1("a double");
        }
        this.i0 = 11;
        double d = Double.parseDouble(this.l0);
        if (this.q0 != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            Z0("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.l0 = null;
        this.i0 = 0;
        int[] iArr2 = this.p0;
        int i2 = this.n0 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public int nextInt() throws IOException {
        String strY;
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 15) {
            long j = this.j0;
            int i = (int) j;
            if (j == i) {
                this.i0 = 0;
                int[] iArr = this.p0;
                int i2 = this.n0 - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.j0 + J());
        }
        if (iK == 16) {
            this.l0 = new String(this.Y, this.Z, this.k0);
            this.Z += this.k0;
        } else {
            if (iK != 8 && iK != 9 && iK != 10) {
                throw a1("an int");
            }
            if (iK == 10) {
                strY = a0();
                this.l0 = strY;
            } else {
                strY = Y(iK == 8 ? '\'' : '\"');
                this.l0 = strY;
            }
            b1(strY);
            try {
                int i3 = Integer.parseInt(this.l0);
                this.i0 = 0;
                int[] iArr2 = this.p0;
                int i4 = this.n0 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.i0 = 11;
        double d = Double.parseDouble(this.l0);
        int i5 = (int) d;
        if (i5 != d) {
            bt.j("Expected an int but was ", this.l0, J());
            return 0;
        }
        this.l0 = null;
        this.i0 = 0;
        int[] iArr3 = this.p0;
        int i6 = this.n0 - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public long nextLong() throws IOException {
        String strY;
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 15) {
            this.i0 = 0;
            int[] iArr = this.p0;
            int i = this.n0 - 1;
            iArr[i] = iArr[i] + 1;
            return this.j0;
        }
        if (iK == 16) {
            this.l0 = new String(this.Y, this.Z, this.k0);
            this.Z += this.k0;
        } else {
            if (iK != 8 && iK != 9 && iK != 10) {
                throw a1("a long");
            }
            if (iK == 10) {
                strY = a0();
                this.l0 = strY;
            } else {
                strY = Y(iK == 8 ? '\'' : '\"');
                this.l0 = strY;
            }
            b1(strY);
            try {
                long j = Long.parseLong(this.l0);
                this.i0 = 0;
                int[] iArr2 = this.p0;
                int i2 = this.n0 - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.i0 = 11;
        double d = Double.parseDouble(this.l0);
        long j2 = (long) d;
        if (j2 != d) {
            bt.j("Expected a long but was ", this.l0, J());
            return 0L;
        }
        this.l0 = null;
        this.i0 = 0;
        int[] iArr3 = this.p0;
        int i3 = this.n0 - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    public String p() {
        return u(false);
    }

    public String r() {
        String str;
        int iK = this.i0;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 10) {
            str = a0();
        } else if (iK == 8) {
            str = Y('\'');
        } else if (iK == 9) {
            str = Y('\"');
        } else if (iK == 11) {
            str = this.l0;
            this.l0 = null;
        } else if (iK == 15) {
            str = Long.toString(this.j0);
        } else {
            if (iK != 16) {
                throw a1("a string");
            }
            str = new String(this.Y, this.Z, this.k0);
            this.Z += this.k0;
        }
        this.i0 = 0;
        int[] iArr = this.p0;
        int i = this.n0 - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public String toString() {
        return getClass().getSimpleName().concat(J());
    }

    public final String u(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.n0;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.m0[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.p0[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.o0[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    bt.g(pc6.j(i3, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    public final void u0(int i) throws cp4 {
        int i2 = this.n0;
        if (i2 - 1 >= 255) {
            throw new cp4("Nesting limit 255 reached".concat(J()));
        }
        int[] iArr = this.m0;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.m0 = Arrays.copyOf(iArr, i3);
            this.p0 = Arrays.copyOf(this.p0, i3);
            this.o0 = (String[]) Arrays.copyOf(this.o0, i3);
        }
        int[] iArr2 = this.m0;
        int i4 = this.n0;
        this.n0 = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void v() throws IOException {
        int i = 0;
        do {
            int iK = this.i0;
            if (iK == 0) {
                iK = k();
            }
            switch (iK) {
                case 1:
                    u0(3);
                    i++;
                    this.i0 = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.o0[this.n0 - 1] = null;
                    }
                    this.n0--;
                    i--;
                    this.i0 = 0;
                    break;
                case 3:
                    u0(1);
                    i++;
                    this.i0 = 0;
                    break;
                case 4:
                    this.n0--;
                    i--;
                    this.i0 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.i0 = 0;
                    break;
                case 8:
                    H0('\'');
                    this.i0 = 0;
                    break;
                case 9:
                    H0('\"');
                    this.i0 = 0;
                    break;
                case 10:
                    V0();
                    this.i0 = 0;
                    break;
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                    H0('\'');
                    if (i == 0) {
                        this.o0[this.n0 - 1] = "<skipped>";
                    }
                    this.i0 = 0;
                    break;
                case 13:
                    H0('\"');
                    if (i == 0) {
                        this.o0[this.n0 - 1] = "<skipped>";
                    }
                    this.i0 = 0;
                    break;
                case 14:
                    V0();
                    if (i == 0) {
                        this.o0[this.n0 - 1] = "<skipped>";
                    }
                    this.i0 = 0;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    this.Z += this.k0;
                    this.i0 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.p0;
        int i2 = this.n0 - 1;
        iArr[i2] = iArr[i2] + 1;
    }
}
