package defpackage;

import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pk6 implements fi1 {
    public mb6 A0;
    public int X;
    public float Y = 1.0f;
    public float Z = 1.0f;
    public float f0 = 1.0f;
    public float g0;
    public float h0;
    public float i0;
    public long j0;
    public long k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public long p0;
    public x67 q0;
    public boolean r0;
    public int s0;
    public long t0;
    public u24 u0;
    public fi1 v0;
    public z24 w0;
    public o60 x0;
    public g60 y0;
    public int z0;

    public pk6() {
        long j = bu2.a;
        this.j0 = j;
        this.k0 = j;
        this.o0 = 8.0f;
        this.p0 = gd8.b;
        this.q0 = u70.e;
        this.s0 = 0;
        this.t0 = 9205357640488583168L;
        this.u0 = u24.e;
        this.v0 = i21.b();
        this.w0 = z24.X;
        this.z0 = 3;
    }

    public final void a() {
        g(1.0f);
        h(1.0f);
        b(1.0f);
        n(0.0f);
        o(0.0f);
        j(0.0f);
        long j = bu2.a;
        c(j);
        l(j);
        if (this.l0 != 0.0f) {
            this.X |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            this.l0 = 0.0f;
        }
        if (this.m0 != 0.0f) {
            this.X |= 512;
            this.m0 = 0.0f;
        }
        if (this.n0 != 0.0f) {
            this.X |= 1024;
            this.n0 = 0.0f;
        }
        if (this.o0 != 8.0f) {
            this.X |= 2048;
            this.o0 = 8.0f;
        }
        m(gd8.b);
        k(u70.e);
        d(false);
        if (!dh3.f(this.x0, null)) {
            this.X |= 131072;
            this.x0 = null;
        }
        if (!dh3.f(this.y0, null)) {
            this.X |= 262144;
            this.y0 = null;
        }
        if (this.z0 != 3) {
            this.X |= 524288;
            this.z0 = 3;
        }
        if (this.s0 != 0) {
            this.X |= 32768;
            this.s0 = 0;
        }
        f(u24.e);
        this.t0 = 9205357640488583168L;
        this.A0 = null;
        this.X = 0;
    }

    public final void b(float f) {
        if (this.f0 == f) {
            return;
        }
        this.X |= 4;
        this.f0 = f;
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.v0.b0();
    }

    public final void c(long j) {
        long j2 = this.j0;
        int i = dw0.h;
        if (tk8.a(j2, j)) {
            return;
        }
        this.X |= 64;
        this.j0 = j;
    }

    public final void d(boolean z) {
        if (this.r0 != z) {
            this.X |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.r0 = z;
        }
    }

    public final void f(u24 u24Var) {
        if (dh3.f(this.u0, u24Var)) {
            return;
        }
        this.X |= 1048576;
        this.u0 = u24Var;
    }

    public final void g(float f) {
        if (this.Y == f) {
            return;
        }
        this.X |= 1;
        this.Y = f;
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.v0.getDensity();
    }

    public final void h(float f) {
        if (this.Z == f) {
            return;
        }
        this.X |= 2;
        this.Z = f;
    }

    public final void j(float f) {
        if (this.i0 == f) {
            return;
        }
        this.X |= 32;
        this.i0 = f;
    }

    public final void k(x67 x67Var) {
        if (dh3.f(this.q0, x67Var)) {
            return;
        }
        this.X |= 8192;
        this.q0 = x67Var;
    }

    public final void l(long j) {
        long j2 = this.k0;
        int i = dw0.h;
        if (tk8.a(j2, j)) {
            return;
        }
        this.X |= 128;
        this.k0 = j;
    }

    public final void m(long j) {
        if (gd8.a(this.p0, j)) {
            return;
        }
        this.X |= 4096;
        this.p0 = j;
    }

    public final void n(float f) {
        if (this.g0 == f) {
            return;
        }
        this.X |= 8;
        this.g0 = f;
    }

    public final void o(float f) {
        if (this.h0 == f) {
            return;
        }
        this.X |= 16;
        this.h0 = f;
    }
}
