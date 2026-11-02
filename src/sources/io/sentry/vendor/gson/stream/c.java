package io.sentry.vendor.gson.stream;

import defpackage.bt;
import defpackage.u52;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable, Flushable {
    public static final String[] k0 = new String[128];
    public final Writer X;
    public int[] Y;
    public int Z;
    public String f0;
    public String g0;
    public boolean h0;
    public String i0;
    public final boolean j0;

    static {
        for (int i = 0; i <= 31; i++) {
            k0[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = k0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArrCopyOf = new int[8];
        this.Y = iArrCopyOf;
        this.Z = 0;
        if (iArrCopyOf.length == 0) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, 0);
            this.Y = iArrCopyOf;
        }
        int i = this.Z;
        this.Z = i + 1;
        iArrCopyOf[i] = 6;
        this.g0 = ":";
        this.j0 = true;
        this.X = writer;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final void C(String str) throws IOException {
        String str2;
        Writer writer = this.X;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = k0[cCharAt];
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

    public final void D() {
        if (this.i0 != null) {
            int iU = u();
            if (iU == 5) {
                this.X.write(44);
            } else if (iU != 3) {
                bt.i("Nesting problem.");
                return;
            }
            m();
            this.Y[this.Z - 1] = 4;
            C(this.i0);
            this.i0 = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
        int i = this.Z;
        if (i > 1 || (i == 1 && this.Y[i - 1] != 7)) {
            u52.s("Incomplete document");
        } else {
            this.Z = 0;
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.Z != 0) {
            this.X.flush();
        } else {
            bt.i("JsonWriter is closed.");
        }
    }

    public final void g() {
        int iU = u();
        if (iU == 1) {
            this.Y[this.Z - 1] = 2;
            m();
            return;
        }
        Writer writer = this.X;
        if (iU == 2) {
            writer.append(',');
            m();
            return;
        }
        if (iU == 4) {
            writer.append((CharSequence) this.g0);
            this.Y[this.Z - 1] = 5;
            return;
        }
        if (iU != 6) {
            if (iU != 7) {
                bt.i("Nesting problem.");
                return;
            } else if (!this.h0) {
                bt.i("JSON must have only one top-level value.");
                return;
            }
        }
        this.Y[this.Z - 1] = 7;
    }

    public final void k(int i, int i2, char c) {
        int iU = u();
        if (iU != i2 && iU != i) {
            bt.i("Nesting problem.");
            return;
        }
        if (this.i0 != null) {
            bt.p(this.i0, "Dangling name: ");
            return;
        }
        this.Z--;
        if (iU == i2) {
            m();
        }
        this.X.write(c);
    }

    public final void m() throws IOException {
        if (this.f0 == null) {
            return;
        }
        Writer writer = this.X;
        writer.write(10);
        int i = this.Z;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f0);
        }
    }

    public final void p() {
        if (this.i0 != null) {
            if (!this.j0) {
                this.i0 = null;
                return;
            }
            D();
        }
        g();
        this.X.write("null");
    }

    public final int u() {
        int i = this.Z;
        if (i != 0) {
            return this.Y[i - 1];
        }
        bt.i("JsonWriter is closed.");
        return 0;
    }
}
