package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dy5 extends xp2 {
    public List A0;
    public a06 B0;
    public List C0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public List j0;
    public List k0;
    public List l0;
    public List m0;
    public List n0;
    public List o0;
    public List p0;
    public List q0;
    public List r0;
    public List s0;
    public List t0;
    public List u0;
    public int v0;
    public nz5 w0;
    public int x0;
    public List y0;
    public tz5 z0;

    public static dy5 h() {
        dy5 dy5Var = new dy5();
        dy5Var.g0 = 6;
        List list = Collections.EMPTY_LIST;
        dy5Var.j0 = list;
        dy5Var.k0 = list;
        dy5Var.l0 = list;
        dy5Var.m0 = list;
        dy5Var.n0 = list;
        dy5Var.o0 = list;
        dy5Var.p0 = list;
        dy5Var.q0 = list;
        dy5Var.r0 = list;
        dy5Var.s0 = list;
        dy5Var.t0 = list;
        dy5Var.u0 = list;
        dy5Var.w0 = nz5.w0;
        dy5Var.y0 = list;
        dy5Var.z0 = tz5.i0;
        dy5Var.A0 = list;
        dy5Var.B0 = a06.g0;
        dy5Var.C0 = list;
        return dy5Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        fy5 fy5VarG = g();
        if (fy5VarG.d()) {
            return fy5VarG;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        fy5 fy5Var = null;
        try {
            try {
                fy5.J0.getClass();
                i(new fy5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                fy5 fy5Var2 = (fy5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    fy5Var = fy5Var2;
                    if (fy5Var != null) {
                        i(fy5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (fy5Var != null) {
                i(fy5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        dy5 dy5VarH = h();
        dy5VarH.i(g());
        return dy5VarH;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        i((fy5) bq2Var);
        return this;
    }

    public final fy5 g() {
        int i;
        fy5 fy5Var = new fy5(this);
        int i2 = this.f0;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        fy5Var.f0 = this.g0;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        fy5Var.g0 = this.h0;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        fy5Var.h0 = this.i0;
        if ((i2 & 8) == 8) {
            this.j0 = Collections.unmodifiableList(this.j0);
            i = this.f0 & (-9);
            this.f0 = i;
        } else {
            i = i2;
        }
        fy5Var.i0 = this.j0;
        if ((i & 16) == 16) {
            this.k0 = Collections.unmodifiableList(this.k0);
            i = this.f0 & (-17);
            this.f0 = i;
        }
        fy5Var.j0 = this.k0;
        if ((i & 32) == 32) {
            this.l0 = Collections.unmodifiableList(this.l0);
            i = this.f0 & (-33);
            this.f0 = i;
        }
        fy5Var.k0 = this.l0;
        if ((i & 64) == 64) {
            this.m0 = Collections.unmodifiableList(this.m0);
            i = this.f0 & (-65);
            this.f0 = i;
        }
        fy5Var.m0 = this.m0;
        if ((i & 128) == 128) {
            this.n0 = Collections.unmodifiableList(this.n0);
            i = this.f0 & (-129);
            this.f0 = i;
        }
        fy5Var.o0 = this.n0;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.o0 = Collections.unmodifiableList(this.o0);
            i = this.f0 & (-257);
            this.f0 = i;
        }
        fy5Var.p0 = this.o0;
        if ((i & 512) == 512) {
            this.p0 = Collections.unmodifiableList(this.p0);
            i = this.f0 & (-513);
            this.f0 = i;
        }
        fy5Var.r0 = this.p0;
        if ((i & 1024) == 1024) {
            this.q0 = Collections.unmodifiableList(this.q0);
            i = this.f0 & (-1025);
            this.f0 = i;
        }
        fy5Var.s0 = this.q0;
        if ((i & 2048) == 2048) {
            this.r0 = Collections.unmodifiableList(this.r0);
            i = this.f0 & (-2049);
            this.f0 = i;
        }
        fy5Var.t0 = this.r0;
        if ((i & 4096) == 4096) {
            this.s0 = Collections.unmodifiableList(this.s0);
            i = this.f0 & (-4097);
            this.f0 = i;
        }
        fy5Var.u0 = this.s0;
        if ((i & 8192) == 8192) {
            this.t0 = Collections.unmodifiableList(this.t0);
            i = this.f0 & (-8193);
            this.f0 = i;
        }
        fy5Var.v0 = this.t0;
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
            this.u0 = Collections.unmodifiableList(this.u0);
            i = this.f0 & (-16385);
            this.f0 = i;
        }
        fy5Var.w0 = this.u0;
        if ((i2 & 32768) == 32768) {
            i3 |= 8;
        }
        fy5Var.y0 = this.v0;
        if ((i2 & DnsOverHttps.MAX_RESPONSE_SIZE) == 65536) {
            i3 |= 16;
        }
        fy5Var.z0 = this.w0;
        if ((i2 & 131072) == 131072) {
            i3 |= 32;
        }
        fy5Var.A0 = this.x0;
        if ((i & 262144) == 262144) {
            this.y0 = Collections.unmodifiableList(this.y0);
            i = this.f0 & (-262145);
            this.f0 = i;
        }
        fy5Var.B0 = this.y0;
        if ((i2 & 524288) == 524288) {
            i3 |= 64;
        }
        fy5Var.C0 = this.z0;
        if ((i & 1048576) == 1048576) {
            this.A0 = Collections.unmodifiableList(this.A0);
            i = this.f0 & (-1048577);
            this.f0 = i;
        }
        fy5Var.D0 = this.A0;
        if ((i2 & 2097152) == 2097152) {
            i3 |= 128;
        }
        fy5Var.E0 = this.B0;
        if ((i & 4194304) == 4194304) {
            this.C0 = Collections.unmodifiableList(this.C0);
            this.f0 &= -4194305;
        }
        fy5Var.F0 = this.C0;
        fy5Var.Z = i3;
        return fy5Var;
    }

    public final void i(fy5 fy5Var) {
        a06 a06Var;
        tz5 tz5Var;
        nz5 nz5Var;
        if (fy5Var == fy5.I0) {
            return;
        }
        int i = fy5Var.Z;
        if ((i & 1) == 1) {
            int i2 = fy5Var.f0;
            this.f0 = 1 | this.f0;
            this.g0 = i2;
        }
        byte b = 2;
        if ((i & 2) == 2) {
            int i3 = fy5Var.g0;
            this.f0 |= 2;
            this.h0 = i3;
        }
        if ((i & 4) == 4) {
            int i4 = fy5Var.h0;
            this.f0 = 4 | this.f0;
            this.i0 = i4;
        }
        if (!fy5Var.i0.isEmpty()) {
            if (this.j0.isEmpty()) {
                this.j0 = fy5Var.i0;
                this.f0 &= -9;
            } else {
                if ((this.f0 & 8) != 8) {
                    this.j0 = new ArrayList(this.j0);
                    this.f0 |= 8;
                }
                this.j0.addAll(fy5Var.i0);
            }
        }
        if (!fy5Var.j0.isEmpty()) {
            if (this.k0.isEmpty()) {
                this.k0 = fy5Var.j0;
                this.f0 &= -17;
            } else {
                if ((this.f0 & 16) != 16) {
                    this.k0 = new ArrayList(this.k0);
                    this.f0 |= 16;
                }
                this.k0.addAll(fy5Var.j0);
            }
        }
        if (!fy5Var.k0.isEmpty()) {
            if (this.l0.isEmpty()) {
                this.l0 = fy5Var.k0;
                this.f0 &= -33;
            } else {
                if ((this.f0 & 32) != 32) {
                    this.l0 = new ArrayList(this.l0);
                    this.f0 |= 32;
                }
                this.l0.addAll(fy5Var.k0);
            }
        }
        if (!fy5Var.m0.isEmpty()) {
            if (this.m0.isEmpty()) {
                this.m0 = fy5Var.m0;
                this.f0 &= -65;
            } else {
                if ((this.f0 & 64) != 64) {
                    this.m0 = new ArrayList(this.m0);
                    this.f0 |= 64;
                }
                this.m0.addAll(fy5Var.m0);
            }
        }
        if (!fy5Var.o0.isEmpty()) {
            if (this.n0.isEmpty()) {
                this.n0 = fy5Var.o0;
                this.f0 &= -129;
            } else {
                if ((this.f0 & 128) != 128) {
                    this.n0 = new ArrayList(this.n0);
                    this.f0 |= 128;
                }
                this.n0.addAll(fy5Var.o0);
            }
        }
        if (!fy5Var.p0.isEmpty()) {
            if (this.o0.isEmpty()) {
                this.o0 = fy5Var.p0;
                this.f0 &= -257;
            } else {
                if ((this.f0 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.o0 = new ArrayList(this.o0);
                    this.f0 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.o0.addAll(fy5Var.p0);
            }
        }
        if (!fy5Var.r0.isEmpty()) {
            if (this.p0.isEmpty()) {
                this.p0 = fy5Var.r0;
                this.f0 &= -513;
            } else {
                if ((this.f0 & 512) != 512) {
                    this.p0 = new ArrayList(this.p0);
                    this.f0 |= 512;
                }
                this.p0.addAll(fy5Var.r0);
            }
        }
        if (!fy5Var.s0.isEmpty()) {
            if (this.q0.isEmpty()) {
                this.q0 = fy5Var.s0;
                this.f0 &= -1025;
            } else {
                if ((this.f0 & 1024) != 1024) {
                    this.q0 = new ArrayList(this.q0);
                    this.f0 |= 1024;
                }
                this.q0.addAll(fy5Var.s0);
            }
        }
        if (!fy5Var.t0.isEmpty()) {
            if (this.r0.isEmpty()) {
                this.r0 = fy5Var.t0;
                this.f0 &= -2049;
            } else {
                if ((this.f0 & 2048) != 2048) {
                    this.r0 = new ArrayList(this.r0);
                    this.f0 |= 2048;
                }
                this.r0.addAll(fy5Var.t0);
            }
        }
        if (!fy5Var.u0.isEmpty()) {
            if (this.s0.isEmpty()) {
                this.s0 = fy5Var.u0;
                this.f0 &= -4097;
            } else {
                if ((this.f0 & 4096) != 4096) {
                    this.s0 = new ArrayList(this.s0);
                    this.f0 |= 4096;
                }
                this.s0.addAll(fy5Var.u0);
            }
        }
        if (!fy5Var.v0.isEmpty()) {
            if (this.t0.isEmpty()) {
                this.t0 = fy5Var.v0;
                this.f0 &= -8193;
            } else {
                if ((this.f0 & 8192) != 8192) {
                    this.t0 = new ArrayList(this.t0);
                    this.f0 |= 8192;
                }
                this.t0.addAll(fy5Var.v0);
            }
        }
        if (!fy5Var.w0.isEmpty()) {
            if (this.u0.isEmpty()) {
                this.u0 = fy5Var.w0;
                this.f0 &= -16385;
            } else {
                if ((this.f0 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                    this.u0 = new ArrayList(this.u0);
                    this.f0 |= Http2.INITIAL_MAX_FRAME_SIZE;
                }
                this.u0.addAll(fy5Var.w0);
            }
        }
        int i5 = fy5Var.Z;
        if ((i5 & 8) == 8) {
            int i6 = fy5Var.y0;
            this.f0 |= 32768;
            this.v0 = i6;
        }
        if ((i5 & 16) == 16) {
            nz5 nz5Var2 = fy5Var.z0;
            if ((this.f0 & DnsOverHttps.MAX_RESPONSE_SIZE) != 65536 || (nz5Var = this.w0) == nz5.w0) {
                this.w0 = nz5Var2;
            } else {
                mz5 mz5VarR = nz5.r(nz5Var);
                mz5VarR.i(nz5Var2);
                this.w0 = mz5VarR.g();
            }
            this.f0 |= DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((fy5Var.Z & 32) == 32) {
            int i7 = fy5Var.A0;
            this.f0 |= 131072;
            this.x0 = i7;
        }
        if (!fy5Var.B0.isEmpty()) {
            if (this.y0.isEmpty()) {
                this.y0 = fy5Var.B0;
                this.f0 &= -262145;
            } else {
                if ((this.f0 & 262144) != 262144) {
                    this.y0 = new ArrayList(this.y0);
                    this.f0 |= 262144;
                }
                this.y0.addAll(fy5Var.B0);
            }
        }
        if ((fy5Var.Z & 64) == 64) {
            tz5 tz5Var2 = fy5Var.C0;
            if ((this.f0 & 524288) != 524288 || (tz5Var = this.z0) == tz5.i0) {
                this.z0 = tz5Var2;
            } else {
                by5 by5VarI = tz5.i(tz5Var);
                by5VarI.i(tz5Var2);
                this.z0 = by5VarI.g();
            }
            this.f0 |= 524288;
        }
        if (!fy5Var.D0.isEmpty()) {
            if (this.A0.isEmpty()) {
                this.A0 = fy5Var.D0;
                this.f0 &= -1048577;
            } else {
                if ((this.f0 & 1048576) != 1048576) {
                    this.A0 = new ArrayList(this.A0);
                    this.f0 |= 1048576;
                }
                this.A0.addAll(fy5Var.D0);
            }
        }
        if ((fy5Var.Z & 128) == 128) {
            a06 a06Var2 = fy5Var.E0;
            if ((this.f0 & 2097152) != 2097152 || (a06Var = this.B0) == a06.g0) {
                this.B0 = a06Var2;
            } else {
                jy5 jy5Var = new jy5(b);
                jy5Var.f0 = Collections.EMPTY_LIST;
                jy5Var.m(a06Var);
                jy5Var.m(a06Var2);
                this.B0 = jy5Var.i();
            }
            this.f0 |= 2097152;
        }
        if (!fy5Var.F0.isEmpty()) {
            if (this.C0.isEmpty()) {
                this.C0 = fy5Var.F0;
                this.f0 &= -4194305;
            } else {
                if ((this.f0 & 4194304) != 4194304) {
                    this.C0 = new ArrayList(this.C0);
                    this.f0 |= 4194304;
                }
                this.C0.addAll(fy5Var.F0);
            }
        }
        f(fy5Var);
        this.X = this.X.b(fy5Var.Y);
    }
}
