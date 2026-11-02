package defpackage;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jb0 implements Iterable {
    public static final mc4 X = new mc4(new byte[0]);

    public static jb0 a(Iterator it, int i) {
        if (i == 1) {
            return (jb0) it.next();
        }
        int i2 = i >>> 1;
        return a(it, i2).b(a(it, i - i2));
    }

    public static ib0 i() {
        return new ib0();
    }

    public final jb0 b(jb0 jb0Var) {
        int size = size();
        int size2 = jb0Var.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = zl6.j0;
        zl6 zl6Var = this instanceof zl6 ? (zl6) this : null;
        if (jb0Var.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return jb0Var;
        }
        int size3 = jb0Var.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = jb0Var.size();
            byte[] bArr = new byte[size4 + size5];
            c(bArr, 0, 0, size4);
            jb0Var.c(bArr, 0, size4, size5);
            return new mc4(bArr);
        }
        if (zl6Var != null) {
            jb0 jb0Var2 = zl6Var.f0;
            if (jb0Var.size() + jb0Var2.size() < 128) {
                int size6 = jb0Var2.size();
                int size7 = jb0Var.size();
                byte[] bArr2 = new byte[size6 + size7];
                jb0Var2.c(bArr2, 0, 0, size6);
                jb0Var.c(bArr2, 0, size6, size7);
                return new zl6(zl6Var.Z, new mc4(bArr2));
            }
        }
        if (zl6Var != null) {
            jb0 jb0Var3 = zl6Var.f0;
            jb0 jb0Var4 = zl6Var.Z;
            if (jb0Var4.e() > jb0Var3.e() && zl6Var.h0 > jb0Var.e()) {
                return new zl6(jb0Var4, new zl6(jb0Var3, jb0Var));
            }
        }
        if (size3 >= zl6.j0[Math.max(e(), jb0Var.e()) + 1]) {
            return new zl6(this, jb0Var);
        }
        y45 y45Var = new y45((byte) 14);
        y45Var.B(this);
        y45Var.B(jb0Var);
        Stack stack = (Stack) y45Var.X;
        jb0 zl6Var2 = (jb0) stack.pop();
        while (!stack.isEmpty()) {
            zl6Var2 = new zl6((jb0) stack.pop(), zl6Var2);
        }
        return zl6Var2;
    }

    public final void c(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            bt.e(30, i, "Source offset < 0: ");
            return;
        }
        if (i2 < 0) {
            bt.e(30, i2, "Target offset < 0: ");
            return;
        }
        if (i3 < 0) {
            bt.e(23, i3, "Length < 0: ");
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            bt.e(34, i4, "Source end offset < 0: ");
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            bt.e(34, i5, "Target end offset < 0: ");
        } else if (i3 > 0) {
            d(bArr, i, i2, i3);
        }
    }

    public abstract void d(byte[] bArr, int i, int i2, int i3);

    public int e() {
        return 0;
    }

    public boolean f() {
        return true;
    }

    public abstract boolean h();

    public abstract int j(int i, int i2, int i3);

    public abstract int l(int i, int i2, int i3);

    public abstract int n();

    public final byte[] o() {
        int size = size();
        if (size == 0) {
            return dg3.a;
        }
        byte[] bArr = new byte[size];
        d(bArr, 0, 0, size);
        return bArr;
    }

    public String q() {
        return new String(o(), "UTF-8");
    }

    public final String r() {
        try {
            return q();
        } catch (UnsupportedEncodingException e) {
            xw3.o("UTF-8 not supported?", e);
            return null;
        }
    }

    public abstract void s(OutputStream outputStream, int i, int i2);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
