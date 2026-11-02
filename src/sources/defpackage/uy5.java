package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uy5 extends xp2 {
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public nz5 j0;
    public int k0;
    public List l0;
    public nz5 m0;
    public int n0;
    public List o0;
    public List p0;
    public List q0;
    public List r0;
    public tz5 s0;
    public List t0;
    public ky5 u0;
    public List v0;
    public List w0;
    public List x0;

    public static uy5 h() {
        uy5 uy5Var = new uy5();
        uy5Var.g0 = 6;
        uy5Var.h0 = 6;
        nz5 nz5Var = nz5.w0;
        uy5Var.j0 = nz5Var;
        List list = Collections.EMPTY_LIST;
        uy5Var.l0 = list;
        uy5Var.m0 = nz5Var;
        uy5Var.o0 = list;
        uy5Var.p0 = list;
        uy5Var.q0 = list;
        uy5Var.r0 = list;
        uy5Var.s0 = tz5.i0;
        uy5Var.t0 = list;
        uy5Var.u0 = ky5.g0;
        uy5Var.v0 = list;
        uy5Var.w0 = list;
        uy5Var.x0 = list;
        return uy5Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        vy5 vy5VarG = g();
        if (vy5VarG.d()) {
            return vy5VarG;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        vy5 vy5Var = null;
        try {
            try {
                vy5.B0.getClass();
                i(new vy5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                vy5 vy5Var2 = (vy5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    vy5Var = vy5Var2;
                    if (vy5Var != null) {
                        i(vy5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (vy5Var != null) {
                i(vy5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        uy5 uy5VarH = h();
        uy5VarH.i(g());
        return uy5VarH;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        i((vy5) bq2Var);
        return this;
    }

    public final vy5 g() {
        int i;
        vy5 vy5Var = new vy5(this);
        int i2 = this.f0;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        vy5Var.f0 = this.g0;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        vy5Var.g0 = this.h0;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        vy5Var.h0 = this.i0;
        if ((i2 & 8) == 8) {
            i3 |= 8;
        }
        vy5Var.i0 = this.j0;
        if ((i2 & 16) == 16) {
            i3 |= 16;
        }
        vy5Var.j0 = this.k0;
        if ((i2 & 32) == 32) {
            this.l0 = Collections.unmodifiableList(this.l0);
            i = this.f0 & (-33);
            this.f0 = i;
        } else {
            i = i2;
        }
        vy5Var.k0 = this.l0;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        vy5Var.l0 = this.m0;
        if ((i2 & 128) == 128) {
            i3 |= 64;
        }
        vy5Var.m0 = this.n0;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.o0 = Collections.unmodifiableList(this.o0);
            i = this.f0 & (-257);
            this.f0 = i;
        }
        vy5Var.n0 = this.o0;
        if ((i & 512) == 512) {
            this.p0 = Collections.unmodifiableList(this.p0);
            i = this.f0 & (-513);
            this.f0 = i;
        }
        vy5Var.o0 = this.p0;
        if ((i & 1024) == 1024) {
            this.q0 = Collections.unmodifiableList(this.q0);
            i = this.f0 & (-1025);
            this.f0 = i;
        }
        vy5Var.q0 = this.q0;
        if ((i & 2048) == 2048) {
            this.r0 = Collections.unmodifiableList(this.r0);
            i = this.f0 & (-2049);
            this.f0 = i;
        }
        vy5Var.r0 = this.r0;
        if ((i2 & 4096) == 4096) {
            i3 |= 128;
        }
        vy5Var.s0 = this.s0;
        if ((i & 8192) == 8192) {
            this.t0 = Collections.unmodifiableList(this.t0);
            i = this.f0 & (-8193);
            this.f0 = i;
        }
        vy5Var.t0 = this.t0;
        if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
            i3 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        vy5Var.u0 = this.u0;
        if ((i & 32768) == 32768) {
            this.v0 = Collections.unmodifiableList(this.v0);
            i = (-32769) & this.f0;
            this.f0 = i;
        }
        vy5Var.v0 = this.v0;
        if ((i & DnsOverHttps.MAX_RESPONSE_SIZE) == 65536) {
            this.w0 = Collections.unmodifiableList(this.w0);
            i = (-65537) & this.f0;
            this.f0 = i;
        }
        vy5Var.w0 = this.w0;
        if ((i & 131072) == 131072) {
            this.x0 = Collections.unmodifiableList(this.x0);
            this.f0 &= -131073;
        }
        vy5Var.x0 = this.x0;
        vy5Var.Z = i3;
        return vy5Var;
    }

    public final void i(vy5 vy5Var) {
        ky5 ky5Var;
        tz5 tz5Var;
        nz5 nz5Var;
        nz5 nz5Var2;
        if (vy5Var == vy5.A0) {
            return;
        }
        int i = vy5Var.Z;
        if ((i & 1) == 1) {
            int i2 = vy5Var.f0;
            this.f0 = 1 | this.f0;
            this.g0 = i2;
        }
        if ((i & 2) == 2) {
            int i3 = vy5Var.g0;
            this.f0 = 2 | this.f0;
            this.h0 = i3;
        }
        if ((i & 4) == 4) {
            int i4 = vy5Var.h0;
            this.f0 = 4 | this.f0;
            this.i0 = i4;
        }
        if ((i & 8) == 8) {
            nz5 nz5Var3 = vy5Var.i0;
            if ((this.f0 & 8) != 8 || (nz5Var2 = this.j0) == nz5.w0) {
                this.j0 = nz5Var3;
            } else {
                mz5 mz5VarR = nz5.r(nz5Var2);
                mz5VarR.i(nz5Var3);
                this.j0 = mz5VarR.g();
            }
            this.f0 |= 8;
        }
        if ((vy5Var.Z & 16) == 16) {
            int i5 = vy5Var.j0;
            this.f0 = 16 | this.f0;
            this.k0 = i5;
        }
        if (!vy5Var.k0.isEmpty()) {
            if (this.l0.isEmpty()) {
                this.l0 = vy5Var.k0;
                this.f0 &= -33;
            } else {
                if ((this.f0 & 32) != 32) {
                    this.l0 = new ArrayList(this.l0);
                    this.f0 |= 32;
                }
                this.l0.addAll(vy5Var.k0);
            }
        }
        if ((vy5Var.Z & 32) == 32) {
            nz5 nz5Var4 = vy5Var.l0;
            if ((this.f0 & 64) != 64 || (nz5Var = this.m0) == nz5.w0) {
                this.m0 = nz5Var4;
            } else {
                mz5 mz5VarR2 = nz5.r(nz5Var);
                mz5VarR2.i(nz5Var4);
                this.m0 = mz5VarR2.g();
            }
            this.f0 |= 64;
        }
        if ((vy5Var.Z & 64) == 64) {
            int i6 = vy5Var.m0;
            this.f0 |= 128;
            this.n0 = i6;
        }
        if (!vy5Var.n0.isEmpty()) {
            if (this.o0.isEmpty()) {
                this.o0 = vy5Var.n0;
                this.f0 &= -257;
            } else {
                if ((this.f0 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.o0 = new ArrayList(this.o0);
                    this.f0 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.o0.addAll(vy5Var.n0);
            }
        }
        if (!vy5Var.o0.isEmpty()) {
            if (this.p0.isEmpty()) {
                this.p0 = vy5Var.o0;
                this.f0 &= -513;
            } else {
                if ((this.f0 & 512) != 512) {
                    this.p0 = new ArrayList(this.p0);
                    this.f0 |= 512;
                }
                this.p0.addAll(vy5Var.o0);
            }
        }
        if (!vy5Var.q0.isEmpty()) {
            if (this.q0.isEmpty()) {
                this.q0 = vy5Var.q0;
                this.f0 &= -1025;
            } else {
                if ((this.f0 & 1024) != 1024) {
                    this.q0 = new ArrayList(this.q0);
                    this.f0 |= 1024;
                }
                this.q0.addAll(vy5Var.q0);
            }
        }
        if (!vy5Var.r0.isEmpty()) {
            if (this.r0.isEmpty()) {
                this.r0 = vy5Var.r0;
                this.f0 &= -2049;
            } else {
                if ((this.f0 & 2048) != 2048) {
                    this.r0 = new ArrayList(this.r0);
                    this.f0 |= 2048;
                }
                this.r0.addAll(vy5Var.r0);
            }
        }
        if ((vy5Var.Z & 128) == 128) {
            tz5 tz5Var2 = vy5Var.s0;
            if ((this.f0 & 4096) != 4096 || (tz5Var = this.s0) == tz5.i0) {
                this.s0 = tz5Var2;
            } else {
                by5 by5VarI = tz5.i(tz5Var);
                by5VarI.i(tz5Var2);
                this.s0 = by5VarI.g();
            }
            this.f0 |= 4096;
        }
        if (!vy5Var.t0.isEmpty()) {
            if (this.t0.isEmpty()) {
                this.t0 = vy5Var.t0;
                this.f0 &= -8193;
            } else {
                if ((this.f0 & 8192) != 8192) {
                    this.t0 = new ArrayList(this.t0);
                    this.f0 |= 8192;
                }
                this.t0.addAll(vy5Var.t0);
            }
        }
        if ((vy5Var.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            ky5 ky5Var2 = vy5Var.u0;
            if ((this.f0 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384 || (ky5Var = this.u0) == ky5.g0) {
                this.u0 = ky5Var2;
            } else {
                jy5 jy5VarI = ky5.i(ky5Var);
                jy5VarI.j(ky5Var2);
                this.u0 = jy5VarI.f();
            }
            this.f0 |= Http2.INITIAL_MAX_FRAME_SIZE;
        }
        if (!vy5Var.v0.isEmpty()) {
            if (this.v0.isEmpty()) {
                this.v0 = vy5Var.v0;
                this.f0 &= -32769;
            } else {
                if ((this.f0 & 32768) != 32768) {
                    this.v0 = new ArrayList(this.v0);
                    this.f0 |= 32768;
                }
                this.v0.addAll(vy5Var.v0);
            }
        }
        if (!vy5Var.w0.isEmpty()) {
            if (this.w0.isEmpty()) {
                this.w0 = vy5Var.w0;
                this.f0 &= -65537;
            } else {
                if ((this.f0 & DnsOverHttps.MAX_RESPONSE_SIZE) != 65536) {
                    this.w0 = new ArrayList(this.w0);
                    this.f0 |= DnsOverHttps.MAX_RESPONSE_SIZE;
                }
                this.w0.addAll(vy5Var.w0);
            }
        }
        if (!vy5Var.x0.isEmpty()) {
            if (this.x0.isEmpty()) {
                this.x0 = vy5Var.x0;
                this.f0 &= -131073;
            } else {
                if ((this.f0 & 131072) != 131072) {
                    this.x0 = new ArrayList(this.x0);
                    this.f0 |= 131072;
                }
                this.x0.addAll(vy5Var.x0);
            }
        }
        f(vy5Var);
        this.X = this.X.b(vy5Var.Y);
    }
}
