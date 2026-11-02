package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ih4 extends Writer {
    public final /* synthetic */ byte X;
    public final Object Y;

    public ih4() {
        this.X = (byte) 0;
        this.Y = new StringBuilder(128);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        switch (this.X) {
            case 1:
                String string = charSequence.subSequence(i, i2).toString();
                ((b38) this.Y).b(0, string.length(), string);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.X) {
            case 0:
                m();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.X) {
            case 0:
                m();
                break;
        }
    }

    public void m() {
        StringBuilder sb = (StringBuilder) this.Y;
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
    }

    public String p() {
        char[] cArr;
        b38 b38Var = (b38) this.Y;
        String strE = b38Var.e();
        b38Var.b = -1;
        b38Var.g = 0;
        b38Var.i = null;
        if (b38Var.d) {
            b38Var.d = false;
            b38Var.c.clear();
            b38Var.e = 0;
            b38Var.g = 0;
        }
        m90 m90Var = b38Var.a;
        if (m90Var != null && (cArr = b38Var.f) != null) {
            b38Var.f = null;
            AtomicReferenceArray atomicReferenceArray = m90Var.b;
            char[] cArr2 = (char[]) atomicReferenceArray.get(2);
            if (cArr2 == null || cArr.length > cArr2.length) {
                atomicReferenceArray.set(2, cArr);
            }
        }
        return strE;
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        switch (this.X) {
            case 1:
                b38 b38Var = (b38) this.Y;
                char c = (char) i;
                if (b38Var.b >= 0) {
                    b38Var.h(16);
                }
                b38Var.h = null;
                b38Var.i = null;
                char[] cArr = b38Var.f;
                if (b38Var.g >= cArr.length) {
                    b38Var.f();
                    cArr = b38Var.f;
                }
                int i2 = b38Var.g;
                b38Var.g = i2 + 1;
                cArr[i2] = c;
                break;
            default:
                super.write(i);
                break;
        }
    }

    public ih4(m90 m90Var) {
        this.X = (byte) 1;
        this.Y = new b38(m90Var);
    }

    private final void g() {
    }

    private final void k() {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        switch (this.X) {
            case 1:
                append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        switch (this.X) {
            case 1:
                write(c);
                return this;
            default:
                return super.append(c);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(char c) throws IOException {
        switch (this.X) {
            case 1:
                write(c);
                return this;
            default:
                return super.append(c);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.X) {
            case 1:
                String string = charSequence.toString();
                ((b38) this.Y).b(0, string.length(), string);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.X) {
            case 1:
                append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                for (int i3 = 0; i3 < i2; i3++) {
                    char c = cArr[i + i3];
                    if (c == '\n') {
                        m();
                    } else {
                        ((StringBuilder) obj).append(c);
                    }
                }
                break;
            default:
                ((b38) obj).c(cArr, i, i2);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        switch (this.X) {
            case 1:
                ((b38) this.Y).c(cArr, 0, cArr.length);
                break;
            default:
                super.write(cArr);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        switch (this.X) {
            case 1:
                ((b38) this.Y).b(0, str.length(), str);
                break;
            default:
                super.write(str);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        switch (this.X) {
            case 1:
                ((b38) this.Y).b(i, i2, str);
                break;
            default:
                super.write(str, i, i2);
                break;
        }
    }
}
