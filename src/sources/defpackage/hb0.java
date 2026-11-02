package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class hb0 implements Iterable, Serializable {
    public static final hb0 Z = new hb0(eg3.b);
    public static final be f0;
    public int X = 0;
    public final byte[] Y;

    static {
        f0 = qa.a() ? new be((byte) 8) : new be((byte) 7);
    }

    public hb0(byte[] bArr) {
        bArr.getClass();
        this.Y = bArr;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            kp5.k(ie2.h("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            kp5.k(pc6.m("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        kp5.k(pc6.m("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static hb0 c(int i, int i2, byte[] bArr) {
        byte[] bArrCopyOfRange;
        b(i, i + i2, bArr.length);
        switch (f0.X) {
            case 7:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new hb0(bArrCopyOfRange);
    }

    public byte a(int i) {
        return this.Y[i];
    }

    public void d(int i, byte[] bArr) {
        System.arraycopy(this.Y, 0, bArr, 0, i);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hb0) || size() != ((hb0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof hb0)) {
            return obj.equals(this);
        }
        hb0 hb0Var = (hb0) obj;
        int i = this.X;
        int i2 = hb0Var.X;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > hb0Var.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > hb0Var.size()) {
            StringBuilder sbL = ie2.l("Ran off end of other: 0, ", size, ", ");
            sbL.append(hb0Var.size());
            throw new IllegalArgumentException(sbL.toString());
        }
        byte[] bArr = hb0Var.Y;
        int iE = e() + size;
        int iE2 = e();
        int iE3 = hb0Var.e();
        while (iE2 < iE) {
            if (this.Y[iE2] != bArr[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    public byte f(int i) {
        return this.Y[i];
    }

    public final int hashCode() {
        int i = this.X;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iE = e();
        int i2 = size;
        for (int i3 = iE; i3 < iE + size; i3++) {
            i2 = (i2 * 31) + this.Y[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.X = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fb0(this);
    }

    public int size() {
        return this.Y.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = ts7.c(this);
        } else {
            int iB = b(0, 47, size());
            strConcat = ts7.c(iB == 0 ? Z : new gb0(this.Y, e(), iB)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return oi0.p(sb, strConcat, "\">");
    }
}
