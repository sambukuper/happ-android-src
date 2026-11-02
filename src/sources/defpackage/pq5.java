package defpackage;

import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public final class pq5 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public final byte[] n = new byte[16];
    public int o = 0;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;

    public static final long b(int i, int i2) {
        return (((long) i) & 4294967295L) * ((long) i2);
    }

    public final void a(q02 q02Var) {
        byte[] bArr = (byte[]) q02Var.Y;
        if (bArr.length != 32) {
            bt.q("Poly1305 key must be 256 bits.");
            return;
        }
        int iD = ci8.D(0, bArr);
        int iD2 = ci8.D(4, bArr);
        int iD3 = ci8.D(8, bArr);
        int iD4 = ci8.D(12, bArr);
        this.a = 67108863 & iD;
        int i = ((iD >>> 26) | (iD2 << 6)) & 67108611;
        this.b = i;
        int i2 = ((iD2 >>> 20) | (iD3 << 12)) & 67092735;
        this.c = i2;
        int i3 = ((iD3 >>> 14) | (iD4 << 18)) & 66076671;
        this.d = i3;
        int i4 = (iD4 >>> 8) & 1048575;
        this.e = i4;
        this.f = i * 5;
        this.g = i2 * 5;
        this.h = i3 * 5;
        this.i = i4 * 5;
        this.j = ci8.D(16, bArr);
        this.k = ci8.D(20, bArr);
        this.l = ci8.D(24, bArr);
        this.m = ci8.D(28, bArr);
        this.o = 0;
        this.t = 0;
        this.s = 0;
        this.r = 0;
        this.q = 0;
        this.p = 0;
    }

    public final void c() {
        int i = this.o;
        byte[] bArr = this.n;
        if (i < 16) {
            bArr[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                bArr[i2] = 0;
            }
        }
        long jD = ci8.D(0, bArr);
        long j = jD & 4294967295L;
        long jD2 = ((long) ci8.D(4, bArr)) & 4294967295L;
        long jD3 = ((long) ci8.D(8, bArr)) & 4294967295L;
        long jD4 = 4294967295L & ((long) ci8.D(12, bArr));
        int i3 = (int) (((long) this.p) + (jD & 67108863));
        this.p = i3;
        this.q = (int) (((long) this.q) + ((((jD2 << 32) | j) >>> 26) & 67108863));
        this.r = (int) (((long) this.r) + ((((jD3 << 32) | jD2) >>> 20) & 67108863));
        this.s = (int) (((long) this.s) + ((((jD4 << 32) | jD3) >>> 14) & 67108863));
        int i4 = (int) (((long) this.t) + (jD4 >>> 8));
        this.t = i4;
        if (this.o == 16) {
            this.t = i4 + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        long jB = b(this.t, this.f) + b(this.s, this.g) + b(this.r, this.h) + b(this.q, this.i) + b(i3, this.a);
        long jB2 = b(this.t, this.g) + b(this.s, this.h) + b(this.r, this.i) + b(this.q, this.a) + b(this.p, this.b);
        long jB3 = b(this.t, this.h) + b(this.s, this.i) + b(this.r, this.a) + b(this.q, this.b) + b(this.p, this.c);
        long jB4 = b(this.t, this.i) + b(this.s, this.a) + b(this.r, this.b) + b(this.q, this.c) + b(this.p, this.d);
        long jB5 = b(this.t, this.a) + b(this.s, this.b) + b(this.r, this.c) + b(this.q, this.d) + b(this.p, this.e);
        long j2 = jB2 + (jB >>> 26);
        long j3 = jB3 + (j2 >>> 26);
        this.r = ((int) j3) & 67108863;
        long j4 = jB4 + (j3 >>> 26);
        this.s = ((int) j4) & 67108863;
        long j5 = jB5 + (j4 >>> 26);
        this.t = ((int) j5) & 67108863;
        int i5 = (((int) (j5 >>> 26)) * 5) + (((int) jB) & 67108863);
        this.q = (((int) j2) & 67108863) + (i5 >>> 26);
        this.p = i5 & 67108863;
    }

    public final void d(int i, int i2, byte[] bArr) {
        int i3 = 0;
        while (i2 > i3) {
            int i4 = this.o;
            if (i4 == 16) {
                c();
                this.o = 0;
                i4 = 0;
            }
            int iMin = Math.min(i2 - i3, 16 - i4);
            System.arraycopy(bArr, i3 + i, this.n, this.o, iMin);
            i3 += iMin;
            this.o += iMin;
        }
    }
}
