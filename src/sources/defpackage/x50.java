package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x50 {
    public int a;
    public byte[] b;
    public int c;

    public x50(byte b, byte[] bArr) {
        switch (b) {
            case 2:
                int length = bArr.length;
                this.b = bArr;
                this.a = 0;
                this.c = length;
                break;
            default:
                this.b = bArr;
                break;
        }
    }

    public static void c(int i, int i2, int i3) throws IOException {
        String str;
        if (i2 == i3) {
            return;
        }
        StringBuilder sbL = ie2.l("Field ", i, ": expected ");
        String str2 = "varint";
        if (i2 == 0) {
            str = "varint";
        } else if (i2 == 1) {
            str = "fixed64";
        } else if (i2 != 2) {
            str = i2 != 5 ? "unknown" : "fixed32";
        } else {
            str = "length-delimited";
        }
        sbL.append(str);
        sbL.append(" (wire type ");
        sbL.append(i2);
        sbL.append(") but got ");
        if (i3 != 0) {
            if (i3 == 1) {
                str2 = "fixed64";
            } else if (i3 != 2) {
                str2 = i3 != 5 ? "unknown" : "fixed32";
            } else {
                str2 = "length-delimited";
            }
        }
        sbL.append(str2);
        sbL.append(" (wire type ");
        sbL.append(i3);
        sbL.append(")");
        throw new IOException(sbL.toString());
    }

    public void a(int i, int i2, byte[] bArr) {
        int i3 = this.c + i2;
        byte[] bArr2 = this.b;
        if (bArr2.length < i3) {
            bArr2 = new byte[Math.min(bArr2.length * 2, i3 * 2)];
            System.arraycopy(this.b, 0, bArr2, 0, this.c);
            this.b = bArr2;
        }
        System.arraycopy(bArr, i, bArr2, this.c, i2);
        this.c += i2;
    }

    public int b() {
        return ((this.b.length - this.a) * 8) - this.c;
    }

    public int d(int i) {
        byte[] bArr = this.b;
        int i2 = 0;
        if (i < 1 || i > 32 || i > b()) {
            bt.q(String.valueOf(i));
            return 0;
        }
        int i3 = this.c;
        if (i3 > 0) {
            int i4 = 8 - i3;
            int iMin = Math.min(i, i4);
            int i5 = i4 - iMin;
            int i6 = this.a;
            int i7 = (((255 >> (8 - iMin)) << i5) & bArr[i6]) >> i5;
            i -= iMin;
            int i8 = this.c + iMin;
            this.c = i8;
            if (i8 == 8) {
                this.c = 0;
                this.a = i6 + 1;
            }
            i2 = i7;
        }
        if (i > 0) {
            while (i >= 8) {
                int i9 = this.a;
                i2 = (i2 << 8) | (bArr[i9] & 255);
                this.a = i9 + 1;
                i -= 8;
            }
            if (i > 0) {
                int i10 = 8 - i;
                int i11 = ((bArr[this.a] & ((255 >> i10) << i10)) >> i10) | (i2 << i);
                this.c += i;
                return i11;
            }
        }
        return i2;
    }

    public boolean e() {
        return j() != 0;
    }

    public byte[] f() throws IOException {
        int iJ = (int) j();
        if (iJ < 0) {
            u52.s(pc6.j(iJ, "Negative length: "));
            return null;
        }
        int i = this.c;
        int i2 = this.a;
        if (i - i2 < iJ) {
            throw new EOFException("Not enough bytes for length-delimited field");
        }
        byte[] bArr = new byte[iJ];
        System.arraycopy(this.b, i2, bArr, 0, iJ);
        this.a += iJ;
        return bArr;
    }

    public x50 g() {
        return new x50((byte) 2, f());
    }

    public String h() {
        return new String(f(), StandardCharsets.UTF_8);
    }

    public int i() {
        if (this.a < this.c) {
            return (int) j();
        }
        return 0;
    }

    public long j() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.a;
            if (i2 >= this.c) {
                throw new EOFException("Truncated varint");
            }
            byte[] bArr = this.b;
            this.a = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        u52.s("Malformed varint");
        return 0L;
    }

    public void k(int i) throws IOException {
        int i2 = this.c;
        if (i == 0) {
            j();
            return;
        }
        if (i == 1) {
            int i3 = this.a;
            if (i2 - i3 < 8) {
                throw new EOFException("Not enough bytes to skip fixed64");
            }
            this.a = i3 + 8;
            return;
        }
        if (i == 2) {
            int iJ = (int) j();
            int i4 = this.a;
            if (i2 - i4 < iJ) {
                throw new EOFException("Not enough bytes to skip length-delimited");
            }
            this.a = i4 + iJ;
            return;
        }
        if (i != 5) {
            u52.s(pc6.j(i, "Unknown wire type: "));
            return;
        }
        int i5 = this.a;
        if (i2 - i5 < 4) {
            throw new EOFException("Not enough bytes to skip fixed32");
        }
        this.a = i5 + 4;
    }
}
