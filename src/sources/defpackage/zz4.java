package defpackage;

import java.util.Arrays;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zz4 {
    public long[] a;
    public int b;

    public zz4(int i) {
        this.a = i == 0 ? pi4.a : new long[i];
    }

    public final void a(long j) {
        c(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
    }

    public final void b(int i, zz4 zz4Var) {
        int i2;
        zz4Var.getClass();
        if (i < 0 || i > (i2 = this.b)) {
            kp5.k(_UrlKt.FRAGMENT_ENCODE_SET);
            return;
        }
        int i3 = zz4Var.b;
        if (i3 == 0) {
            return;
        }
        c(i2 + i3);
        long[] jArr = this.a;
        int i4 = this.b;
        if (i != i4) {
            eu.f0(jArr, jArr, zz4Var.b + i, i, i4);
        }
        eu.f0(zz4Var.a, jArr, i, 0, zz4Var.b);
        this.b += zz4Var.b;
    }

    public final void c(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
    }

    public final long d(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        kp5.k("Index must be between 0 and size");
        return 0L;
    }

    public final void e(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            kp5.k("Index must be between 0 and size");
            return;
        }
        if (i2 < i) {
            bt.q("The end index must be < start index");
        } else if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = this.a;
                eu.f0(jArr, jArr, i, i2, i3);
            }
            this.b -= i2 - i;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zz4) {
            zz4 zz4Var = (zz4) obj;
            int i = zz4Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = zz4Var.a;
                kf3 kf3VarA0 = x97.a0(0, i2);
                int i3 = kf3VarA0.X;
                int i4 = kf3VarA0.Y;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i, long j) {
        if (i < 0 || i >= this.b) {
            kp5.k("Index must be between 0 and size");
            return;
        }
        long[] jArr = this.a;
        long j2 = jArr[i];
        jArr[i] = j;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ zz4() {
        this(16);
    }
}
