package defpackage;

import io.sentry.c2;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class hs3 implements Closeable, Flushable {
    public static final Pattern n0 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] o0 = new String[128];
    public static final String[] p0;
    public final Writer X;
    public int[] Y;
    public int Z;
    public sj2 f0;
    public String g0;
    public String h0;
    public boolean i0;
    public int j0;
    public boolean k0;
    public String l0;
    public boolean m0;

    static {
        for (int i = 0; i <= 31; i++) {
            o0[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = o0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        p0 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public hs3(Writer writer) {
        int[] iArrCopyOf = new int[32];
        this.Y = iArrCopyOf;
        this.Z = 0;
        if (iArrCopyOf.length == 0) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, 0);
            this.Y = iArrCopyOf;
        }
        int i = this.Z;
        this.Z = i + 1;
        iArrCopyOf[i] = 6;
        this.j0 = 2;
        this.m0 = true;
        Objects.requireNonNull(writer, "out == null");
        this.X = writer;
        D(sj2.d);
    }

    public final void B0() throws IOException {
        if (this.l0 != null) {
            int iC = C();
            if (iC == 5) {
                this.X.write(this.h0);
            } else if (iC != 3) {
                bt.i("Nesting problem.");
                return;
            }
            p();
            this.Y[this.Z - 1] = 4;
            R(this.l0);
            this.l0 = null;
        }
    }

    public final int C() {
        int i = this.Z;
        if (i != 0) {
            return this.Y[i - 1];
        }
        bt.i("JsonWriter is closed.");
        return 0;
    }

    public final void D(sj2 sj2Var) {
        Objects.requireNonNull(sj2Var);
        this.f0 = sj2Var;
        this.h0 = ",";
        if (sj2Var.c) {
            this.g0 = ": ";
            if (sj2Var.a.isEmpty()) {
                this.h0 = ", ";
            }
        } else {
            this.g0 = ":";
        }
        this.i0 = this.f0.a.isEmpty() && this.f0.b.isEmpty();
    }

    public void F0() throws IOException {
        B0();
        g();
        int i = this.Z;
        int[] iArrCopyOf = this.Y;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            this.Y = iArrCopyOf;
        }
        int i2 = this.Z;
        this.Z = i2 + 1;
        iArrCopyOf[i2] = 3;
        this.X.write(123);
    }

    public final void J(int i) {
        if (i == 0) {
            throw null;
        }
        this.j0 = i;
    }

    public void K0() throws IOException {
        k(1, 2, ']');
    }

    public void Q0() throws IOException {
        B0();
        g();
        int i = this.Z;
        int[] iArrCopyOf = this.Y;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            this.Y = iArrCopyOf;
        }
        int i2 = this.Z;
        this.Z = i2 + 1;
        iArrCopyOf[i2] = 1;
        this.X.write(91);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void R(String str) throws IOException {
        String str2;
        String[] strArr = this.k0 ? p0 : o0;
        Writer writer = this.X;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public void U(double d) throws IOException {
        B0();
        if (this.j0 != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            c2.i("Numeric values must be finite, but was ", d);
        } else {
            g();
            this.X.append((CharSequence) Double.toString(d));
        }
    }

    public void X(long j) throws IOException {
        B0();
        g();
        this.X.write(Long.toString(j));
    }

    public void Y(Boolean bool) throws IOException {
        if (bool == null) {
            u();
            return;
        }
        B0();
        g();
        this.X.write(bool.booleanValue() ? "true" : "false");
    }

    public void a0(Number number) throws IOException {
        if (number == null) {
            u();
            return;
        }
        B0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.j0 != 1) {
                    bt.q("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !n0.matcher(string).matches()) {
                b61.l("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        g();
        this.X.append((CharSequence) string);
    }

    public void c0(String str) throws IOException {
        if (str == null) {
            u();
            return;
        }
        B0();
        g();
        R(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.close();
        int i = this.Z;
        if (i > 1 || (i == 1 && this.Y[i - 1] != 7)) {
            u52.s("Incomplete document");
        } else {
            this.Z = 0;
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.Z != 0) {
            this.X.flush();
        } else {
            bt.i("JsonWriter is closed.");
        }
    }

    public final void g() throws IOException {
        int iC = C();
        if (iC == 1) {
            this.Y[this.Z - 1] = 2;
            p();
            return;
        }
        Writer writer = this.X;
        if (iC == 2) {
            writer.append((CharSequence) this.h0);
            p();
            return;
        }
        if (iC == 4) {
            writer.append((CharSequence) this.g0);
            this.Y[this.Z - 1] = 5;
            return;
        }
        if (iC != 6) {
            if (iC != 7) {
                bt.i("Nesting problem.");
                return;
            } else if (this.j0 != 1) {
                bt.i("JSON must have only one top-level value.");
                return;
            }
        }
        this.Y[this.Z - 1] = 7;
    }

    public void j0() throws IOException {
        k(3, 5, '}');
    }

    public final void k(int i, int i2, char c) throws IOException {
        int iC = C();
        if (iC != i2 && iC != i) {
            bt.i("Nesting problem.");
            return;
        }
        if (this.l0 != null) {
            bt.p(this.l0, "Dangling name: ");
            return;
        }
        this.Z--;
        if (iC == i2) {
            p();
        }
        this.X.write(c);
    }

    public void m(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.l0 != null) {
            bt.i("Already wrote a name, expecting a value.");
            return;
        }
        int iC = C();
        if (iC == 3 || iC == 5) {
            this.l0 = str;
        } else {
            bt.i("Please begin an object before writing a name.");
        }
    }

    public final void p() throws IOException {
        if (this.i0) {
            return;
        }
        String str = this.f0.a;
        Writer writer = this.X;
        writer.write(str);
        int i = this.Z;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f0.b);
        }
    }

    public hs3 u() throws IOException {
        if (this.l0 != null) {
            if (!this.m0) {
                this.l0 = null;
                return this;
            }
            B0();
        }
        g();
        this.X.write("null");
        return this;
    }

    public void u0(boolean z) throws IOException {
        B0();
        g();
        this.X.write(z ? "true" : "false");
    }
}
