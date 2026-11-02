package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ib0 extends OutputStream {
    public static final byte[] g0 = new byte[0];
    public int Y;
    public int f0;
    public final ArrayList X = new ArrayList();
    public byte[] Z = new byte[128];

    public final void g(int i) {
        this.X.add(new mc4(this.Z));
        int length = this.Y + this.Z.length;
        this.Y = length;
        this.Z = new byte[Math.max(128, Math.max(i, length >>> 1))];
        this.f0 = 0;
    }

    public final void k() {
        int i = this.f0;
        byte[] bArr = this.Z;
        int length = bArr.length;
        ArrayList arrayList = this.X;
        if (i >= length) {
            arrayList.add(new mc4(bArr));
            this.Z = g0;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new mc4(bArr2));
        }
        this.Y += this.f0;
        this.f0 = 0;
    }

    public final synchronized jb0 m() {
        ArrayList arrayList;
        k();
        arrayList = this.X;
        return arrayList.isEmpty() ? jb0.X : jb0.a(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.Y + this.f0;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.Z;
            int length = bArr2.length;
            int i3 = this.f0;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f0 += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                g(i4);
                System.arraycopy(bArr, i + length2, this.Z, 0, i4);
                this.f0 = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f0 == this.Z.length) {
                g(1);
            }
            byte[] bArr = this.Z;
            int i2 = this.f0;
            this.f0 = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
