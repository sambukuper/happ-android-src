package defpackage;

import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sl6 implements dx7 {
    public static final TreeMap j0 = new TreeMap();
    public volatile String X;
    public final long[] Y;
    public final double[] Z;
    public final String[] f0;
    public final byte[][] g0;
    public final int[] h0;
    public int i0;

    public sl6(int i) {
        int i2 = i + 1;
        this.h0 = new int[i2];
        this.Y = new long[i2];
        this.Z = new double[i2];
        this.f0 = new String[i2];
        this.g0 = new byte[i2][];
    }

    @Override // defpackage.dx7
    public final void h(int i, double d) {
        this.h0[i] = 3;
        this.Z[i] = d;
    }

    @Override // defpackage.dx7
    public final void i(int i, long j) {
        this.h0[i] = 2;
        this.Y[i] = j;
    }

    @Override // defpackage.dx7
    public final void j(int i, byte[] bArr) {
        this.h0[i] = 5;
        this.g0[i] = bArr;
    }

    @Override // defpackage.dx7
    public final void l(int i) {
        this.h0[i] = 1;
    }

    @Override // defpackage.dx7
    public final void t(int i, String str) {
        this.h0[i] = 4;
        this.f0[i] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
