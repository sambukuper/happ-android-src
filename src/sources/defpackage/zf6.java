package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zf6 implements Closeable {
    public final y5 X;
    public final p06 Y;
    public final String Z;
    public final int f0;
    public final ov2 g0;
    public final nz2 h0;
    public final b86 i0;
    public final zf6 j0;
    public final zf6 k0;
    public final zf6 l0;
    public final long m0;
    public final long n0;
    public final wg o0;

    public zf6(y5 y5Var, p06 p06Var, String str, int i, ov2 ov2Var, nz2 nz2Var, b86 b86Var, zf6 zf6Var, zf6 zf6Var2, zf6 zf6Var3, long j, long j2, wg wgVar) {
        y5Var.getClass();
        p06Var.getClass();
        str.getClass();
        this.X = y5Var;
        this.Y = p06Var;
        this.Z = str;
        this.f0 = i;
        this.g0 = ov2Var;
        this.h0 = nz2Var;
        this.i0 = b86Var;
        this.j0 = zf6Var;
        this.k0 = zf6Var2;
        this.l0 = zf6Var3;
        this.m0 = j;
        this.n0 = j2;
        this.o0 = wgVar;
    }

    public static String g(zf6 zf6Var, String str) {
        zf6Var.getClass();
        String strA = zf6Var.h0.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b86 b86Var = this.i0;
        if (b86Var != null) {
            b86Var.close();
        } else {
            bt.i("response is not eligible for a body and must not be closed");
        }
    }

    public final yf6 k() {
        yf6 yf6Var = new yf6();
        yf6Var.a = this.X;
        yf6Var.b = this.Y;
        yf6Var.c = this.f0;
        yf6Var.d = this.Z;
        yf6Var.e = this.g0;
        yf6Var.f = this.h0.c();
        yf6Var.g = this.i0;
        yf6Var.h = this.j0;
        yf6Var.i = this.k0;
        yf6Var.j = this.l0;
        yf6Var.k = this.m0;
        yf6Var.l = this.n0;
        yf6Var.m = this.o0;
        return yf6Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.Y + ", code=" + this.f0 + ", message=" + this.Z + ", url=" + ((u23) this.X.Y) + '}';
    }
}
