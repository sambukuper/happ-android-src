package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bz5 extends xp2 {
    public List A0;
    public List B0;
    public ky5 C0;
    public ky5 D0;
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
    public vz5 r0;
    public int s0;
    public int t0;
    public List u0;
    public List v0;
    public List w0;
    public List x0;
    public List y0;
    public List z0;

    public static bz5 h() {
        bz5 bz5Var = new bz5();
        bz5Var.g0 = 518;
        bz5Var.h0 = 2054;
        nz5 nz5Var = nz5.w0;
        bz5Var.j0 = nz5Var;
        List list = Collections.EMPTY_LIST;
        bz5Var.l0 = list;
        bz5Var.m0 = nz5Var;
        bz5Var.o0 = list;
        bz5Var.p0 = list;
        bz5Var.q0 = list;
        bz5Var.r0 = vz5.p0;
        bz5Var.u0 = list;
        bz5Var.v0 = list;
        bz5Var.w0 = list;
        bz5Var.x0 = list;
        bz5Var.y0 = list;
        bz5Var.z0 = list;
        bz5Var.A0 = list;
        bz5Var.B0 = list;
        ky5 ky5Var = ky5.g0;
        bz5Var.C0 = ky5Var;
        bz5Var.D0 = ky5Var;
        return bz5Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        cz5 cz5VarG = g();
        if (cz5VarG.d()) {
            return cz5VarG;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        cz5 cz5Var = null;
        try {
            try {
                cz5.H0.getClass();
                i(new cz5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                cz5 cz5Var2 = (cz5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cz5Var = cz5Var2;
                    if (cz5Var != null) {
                        i(cz5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (cz5Var != null) {
                i(cz5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        bz5 bz5VarH = h();
        bz5VarH.i(g());
        return bz5VarH;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        i((cz5) bq2Var);
        return this;
    }

    public final cz5 g() {
        int i;
        cz5 cz5Var = new cz5(this);
        int i2 = this.f0;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        cz5Var.f0 = this.g0;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        cz5Var.g0 = this.h0;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        cz5Var.h0 = this.i0;
        if ((i2 & 8) == 8) {
            i3 |= 8;
        }
        cz5Var.i0 = this.j0;
        if ((i2 & 16) == 16) {
            i3 |= 16;
        }
        cz5Var.j0 = this.k0;
        if ((i2 & 32) == 32) {
            this.l0 = Collections.unmodifiableList(this.l0);
            i = this.f0 & (-33);
            this.f0 = i;
        } else {
            i = i2;
        }
        cz5Var.k0 = this.l0;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        cz5Var.l0 = this.m0;
        if ((i2 & 128) == 128) {
            i3 |= 64;
        }
        cz5Var.m0 = this.n0;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.o0 = Collections.unmodifiableList(this.o0);
            i = this.f0 & (-257);
            this.f0 = i;
        }
        cz5Var.n0 = this.o0;
        if ((i & 512) == 512) {
            this.p0 = Collections.unmodifiableList(this.p0);
            i = this.f0 & (-513);
            this.f0 = i;
        }
        cz5Var.o0 = this.p0;
        if ((i & 1024) == 1024) {
            this.q0 = Collections.unmodifiableList(this.q0);
            i = this.f0 & (-1025);
            this.f0 = i;
        }
        cz5Var.q0 = this.q0;
        if ((i2 & 2048) == 2048) {
            i3 |= 128;
        }
        cz5Var.r0 = this.r0;
        if ((i2 & 4096) == 4096) {
            i3 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        cz5Var.s0 = this.s0;
        if ((i2 & 8192) == 8192) {
            i3 |= 512;
        }
        cz5Var.t0 = this.t0;
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
            this.u0 = Collections.unmodifiableList(this.u0);
            i = this.f0 & (-16385);
            this.f0 = i;
        }
        cz5Var.u0 = this.u0;
        if ((i & 32768) == 32768) {
            this.v0 = Collections.unmodifiableList(this.v0);
            i = this.f0 & (-32769);
            this.f0 = i;
        }
        cz5Var.v0 = this.v0;
        if ((i & DnsOverHttps.MAX_RESPONSE_SIZE) == 65536) {
            this.w0 = Collections.unmodifiableList(this.w0);
            i = this.f0 & (-65537);
            this.f0 = i;
        }
        cz5Var.w0 = this.w0;
        if ((i & 131072) == 131072) {
            this.x0 = Collections.unmodifiableList(this.x0);
            i = this.f0 & (-131073);
            this.f0 = i;
        }
        cz5Var.x0 = this.x0;
        if ((i & 262144) == 262144) {
            this.y0 = Collections.unmodifiableList(this.y0);
            i = this.f0 & (-262145);
            this.f0 = i;
        }
        cz5Var.y0 = this.y0;
        if ((i & 524288) == 524288) {
            this.z0 = Collections.unmodifiableList(this.z0);
            i = this.f0 & (-524289);
            this.f0 = i;
        }
        cz5Var.z0 = this.z0;
        if ((i & 1048576) == 1048576) {
            this.A0 = Collections.unmodifiableList(this.A0);
            i = this.f0 & (-1048577);
            this.f0 = i;
        }
        cz5Var.A0 = this.A0;
        if ((i & 2097152) == 2097152) {
            this.B0 = Collections.unmodifiableList(this.B0);
            this.f0 &= -2097153;
        }
        cz5Var.B0 = this.B0;
        if ((i2 & 4194304) == 4194304) {
            i3 |= 1024;
        }
        cz5Var.C0 = this.C0;
        if ((i2 & XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) == 8388608) {
            i3 |= 2048;
        }
        cz5Var.D0 = this.D0;
        cz5Var.Z = i3;
        return cz5Var;
    }

    public final void i(cz5 cz5Var) {
        ky5 ky5Var;
        ky5 ky5Var2;
        vz5 vz5Var;
        nz5 nz5Var;
        nz5 nz5Var2;
        if (cz5Var == cz5.G0) {
            return;
        }
        int i = cz5Var.Z;
        if ((i & 1) == 1) {
            int i2 = cz5Var.f0;
            this.f0 = 1 | this.f0;
            this.g0 = i2;
        }
        if ((i & 2) == 2) {
            int i3 = cz5Var.g0;
            this.f0 = 2 | this.f0;
            this.h0 = i3;
        }
        if ((i & 4) == 4) {
            int i4 = cz5Var.h0;
            this.f0 = 4 | this.f0;
            this.i0 = i4;
        }
        if ((i & 8) == 8) {
            nz5 nz5Var3 = cz5Var.i0;
            if ((this.f0 & 8) != 8 || (nz5Var2 = this.j0) == nz5.w0) {
                this.j0 = nz5Var3;
            } else {
                mz5 mz5VarR = nz5.r(nz5Var2);
                mz5VarR.i(nz5Var3);
                this.j0 = mz5VarR.g();
            }
            this.f0 |= 8;
        }
        if ((cz5Var.Z & 16) == 16) {
            int i5 = cz5Var.j0;
            this.f0 = 16 | this.f0;
            this.k0 = i5;
        }
        if (!cz5Var.k0.isEmpty()) {
            if (this.l0.isEmpty()) {
                this.l0 = cz5Var.k0;
                this.f0 &= -33;
            } else {
                if ((this.f0 & 32) != 32) {
                    this.l0 = new ArrayList(this.l0);
                    this.f0 |= 32;
                }
                this.l0.addAll(cz5Var.k0);
            }
        }
        if ((cz5Var.Z & 32) == 32) {
            nz5 nz5Var4 = cz5Var.l0;
            if ((this.f0 & 64) != 64 || (nz5Var = this.m0) == nz5.w0) {
                this.m0 = nz5Var4;
            } else {
                mz5 mz5VarR2 = nz5.r(nz5Var);
                mz5VarR2.i(nz5Var4);
                this.m0 = mz5VarR2.g();
            }
            this.f0 |= 64;
        }
        if ((cz5Var.Z & 64) == 64) {
            int i6 = cz5Var.m0;
            this.f0 |= 128;
            this.n0 = i6;
        }
        if (!cz5Var.n0.isEmpty()) {
            if (this.o0.isEmpty()) {
                this.o0 = cz5Var.n0;
                this.f0 &= -257;
            } else {
                if ((this.f0 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.o0 = new ArrayList(this.o0);
                    this.f0 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.o0.addAll(cz5Var.n0);
            }
        }
        if (!cz5Var.o0.isEmpty()) {
            if (this.p0.isEmpty()) {
                this.p0 = cz5Var.o0;
                this.f0 &= -513;
            } else {
                if ((this.f0 & 512) != 512) {
                    this.p0 = new ArrayList(this.p0);
                    this.f0 |= 512;
                }
                this.p0.addAll(cz5Var.o0);
            }
        }
        if (!cz5Var.q0.isEmpty()) {
            if (this.q0.isEmpty()) {
                this.q0 = cz5Var.q0;
                this.f0 &= -1025;
            } else {
                if ((this.f0 & 1024) != 1024) {
                    this.q0 = new ArrayList(this.q0);
                    this.f0 |= 1024;
                }
                this.q0.addAll(cz5Var.q0);
            }
        }
        if ((cz5Var.Z & 128) == 128) {
            vz5 vz5Var2 = cz5Var.r0;
            if ((this.f0 & 2048) != 2048 || (vz5Var = this.r0) == vz5.p0) {
                this.r0 = vz5Var2;
            } else {
                uz5 uz5VarH = uz5.h();
                uz5VarH.i(vz5Var);
                uz5VarH.i(vz5Var2);
                this.r0 = uz5VarH.g();
            }
            this.f0 |= 2048;
        }
        int i7 = cz5Var.Z;
        if ((i7 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            int i8 = cz5Var.s0;
            this.f0 |= 4096;
            this.s0 = i8;
        }
        if ((i7 & 512) == 512) {
            int i9 = cz5Var.t0;
            this.f0 |= 8192;
            this.t0 = i9;
        }
        if (!cz5Var.u0.isEmpty()) {
            if (this.u0.isEmpty()) {
                this.u0 = cz5Var.u0;
                this.f0 &= -16385;
            } else {
                if ((this.f0 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                    this.u0 = new ArrayList(this.u0);
                    this.f0 |= Http2.INITIAL_MAX_FRAME_SIZE;
                }
                this.u0.addAll(cz5Var.u0);
            }
        }
        if (!cz5Var.v0.isEmpty()) {
            if (this.v0.isEmpty()) {
                this.v0 = cz5Var.v0;
                this.f0 &= -32769;
            } else {
                if ((this.f0 & 32768) != 32768) {
                    this.v0 = new ArrayList(this.v0);
                    this.f0 |= 32768;
                }
                this.v0.addAll(cz5Var.v0);
            }
        }
        if (!cz5Var.w0.isEmpty()) {
            if (this.w0.isEmpty()) {
                this.w0 = cz5Var.w0;
                this.f0 &= -65537;
            } else {
                if ((this.f0 & DnsOverHttps.MAX_RESPONSE_SIZE) != 65536) {
                    this.w0 = new ArrayList(this.w0);
                    this.f0 |= DnsOverHttps.MAX_RESPONSE_SIZE;
                }
                this.w0.addAll(cz5Var.w0);
            }
        }
        if (!cz5Var.x0.isEmpty()) {
            if (this.x0.isEmpty()) {
                this.x0 = cz5Var.x0;
                this.f0 &= -131073;
            } else {
                if ((this.f0 & 131072) != 131072) {
                    this.x0 = new ArrayList(this.x0);
                    this.f0 |= 131072;
                }
                this.x0.addAll(cz5Var.x0);
            }
        }
        if (!cz5Var.y0.isEmpty()) {
            if (this.y0.isEmpty()) {
                this.y0 = cz5Var.y0;
                this.f0 &= -262145;
            } else {
                if ((this.f0 & 262144) != 262144) {
                    this.y0 = new ArrayList(this.y0);
                    this.f0 |= 262144;
                }
                this.y0.addAll(cz5Var.y0);
            }
        }
        if (!cz5Var.z0.isEmpty()) {
            if (this.z0.isEmpty()) {
                this.z0 = cz5Var.z0;
                this.f0 &= -524289;
            } else {
                if ((this.f0 & 524288) != 524288) {
                    this.z0 = new ArrayList(this.z0);
                    this.f0 |= 524288;
                }
                this.z0.addAll(cz5Var.z0);
            }
        }
        if (!cz5Var.A0.isEmpty()) {
            if (this.A0.isEmpty()) {
                this.A0 = cz5Var.A0;
                this.f0 &= -1048577;
            } else {
                if ((this.f0 & 1048576) != 1048576) {
                    this.A0 = new ArrayList(this.A0);
                    this.f0 |= 1048576;
                }
                this.A0.addAll(cz5Var.A0);
            }
        }
        if (!cz5Var.B0.isEmpty()) {
            if (this.B0.isEmpty()) {
                this.B0 = cz5Var.B0;
                this.f0 &= -2097153;
            } else {
                if ((this.f0 & 2097152) != 2097152) {
                    this.B0 = new ArrayList(this.B0);
                    this.f0 |= 2097152;
                }
                this.B0.addAll(cz5Var.B0);
            }
        }
        if ((cz5Var.Z & 1024) == 1024) {
            ky5 ky5Var3 = cz5Var.C0;
            if ((this.f0 & 4194304) != 4194304 || (ky5Var2 = this.C0) == ky5.g0) {
                this.C0 = ky5Var3;
            } else {
                jy5 jy5VarI = ky5.i(ky5Var2);
                jy5VarI.j(ky5Var3);
                this.C0 = jy5VarI.f();
            }
            this.f0 |= 4194304;
        }
        if ((cz5Var.Z & 2048) == 2048) {
            ky5 ky5Var4 = cz5Var.D0;
            if ((this.f0 & XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) != 8388608 || (ky5Var = this.D0) == ky5.g0) {
                this.D0 = ky5Var4;
            } else {
                jy5 jy5VarI2 = ky5.i(ky5Var);
                jy5VarI2.j(ky5Var4);
                this.D0 = jy5VarI2.f();
            }
            this.f0 |= XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
        }
        f(cz5Var);
        this.X = this.X.b(cz5Var.Y);
    }
}
