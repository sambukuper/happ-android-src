package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nz5 extends yp2 {
    public static final nz5 w0;
    public static final au3 x0 = new au3((byte) 22);
    public final jb0 Y;
    public int Z;
    public List f0;
    public boolean g0;
    public int h0;
    public nz5 i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public nz5 o0;
    public int p0;
    public nz5 q0;
    public int r0;
    public int s0;
    public List t0;
    public byte u0;
    public int v0;

    static {
        nz5 nz5Var = new nz5();
        w0 = nz5Var;
        nz5Var.q();
    }

    public nz5(iv0 iv0Var, r62 r62Var) {
        this.u0 = (byte) -1;
        this.v0 = -1;
        q();
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = iv0Var.n();
                    au3 au3Var = x0;
                    mz5 mz5VarR = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.Z |= 4096;
                            this.s0 = iv0Var.k();
                            continue;
                        case 18:
                            if ((i & 1) != 1) {
                                this.f0 = new ArrayList();
                                i |= 1;
                            }
                            this.f0.add(iv0Var.g(lz5.k0, r62Var));
                            continue;
                        case 24:
                            this.Z |= 1;
                            this.g0 = iv0Var.l() != 0;
                            continue;
                        case 32:
                            this.Z |= 2;
                            this.h0 = iv0Var.k();
                            continue;
                        case 42:
                            if ((this.Z & 4) == 4) {
                                nz5 nz5Var = this.i0;
                                nz5Var.getClass();
                                mz5VarR = r(nz5Var);
                            }
                            nz5 nz5Var2 = (nz5) iv0Var.g(au3Var, r62Var);
                            this.i0 = nz5Var2;
                            if (mz5VarR != null) {
                                mz5VarR.i(nz5Var2);
                                this.i0 = mz5VarR.g();
                            }
                            this.Z |= 4;
                            continue;
                        case 48:
                            this.Z |= 16;
                            this.k0 = iv0Var.k();
                            continue;
                        case 56:
                            this.Z |= 32;
                            this.l0 = iv0Var.k();
                            continue;
                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                            this.Z |= 8;
                            this.j0 = iv0Var.k();
                            continue;
                        case 72:
                            this.Z |= 64;
                            this.m0 = iv0Var.k();
                            continue;
                        case 82:
                            if ((this.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                                nz5 nz5Var3 = this.o0;
                                nz5Var3.getClass();
                                mz5VarR = r(nz5Var3);
                            }
                            nz5 nz5Var4 = (nz5) iv0Var.g(au3Var, r62Var);
                            this.o0 = nz5Var4;
                            if (mz5VarR != null) {
                                mz5VarR.i(nz5Var4);
                                this.o0 = mz5VarR.g();
                            }
                            this.Z |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            continue;
                        case 88:
                            this.Z |= 512;
                            this.p0 = iv0Var.k();
                            continue;
                        case 96:
                            this.Z |= 128;
                            this.n0 = iv0Var.k();
                            continue;
                        case 106:
                            if ((this.Z & 1024) == 1024) {
                                nz5 nz5Var5 = this.q0;
                                nz5Var5.getClass();
                                mz5VarR = r(nz5Var5);
                            }
                            nz5 nz5Var6 = (nz5) iv0Var.g(au3Var, r62Var);
                            this.q0 = nz5Var6;
                            if (mz5VarR != null) {
                                mz5VarR.i(nz5Var6);
                                this.q0 = mz5VarR.g();
                            }
                            this.Z |= 1024;
                            continue;
                        case 112:
                            this.Z |= 2048;
                            this.r0 = iv0Var.k();
                            continue;
                        case 802:
                            if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                                this.t0 = new ArrayList();
                                i |= Http2.INITIAL_MAX_FRAME_SIZE;
                            }
                            this.t0.add(iv0Var.g(cy5.j0, r62Var));
                            continue;
                        default:
                            if (!n(iv0Var, nv0VarG, r62Var, iN)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.f0 = Collections.unmodifiableList(this.f0);
                    }
                    if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                        this.t0 = Collections.unmodifiableList(this.t0);
                    }
                    try {
                        nv0VarG.R();
                    } catch (IOException unused) {
                    } finally {
                        this.Y = ib0Var.m();
                    }
                    m();
                    throw th;
                }
            } catch (rh3 e) {
                e.X = this;
                throw e;
            } catch (IOException e2) {
                rh3 rh3Var = new rh3(e2.getMessage());
                rh3Var.X = this;
                throw rh3Var;
            }
        }
        if ((i & 1) == 1) {
            this.f0 = Collections.unmodifiableList(this.f0);
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
            this.t0 = Collections.unmodifiableList(this.t0);
        }
        try {
            nv0VarG.R();
        } catch (IOException unused2) {
        } finally {
            this.Y = ib0Var.m();
        }
        m();
    }

    public static mz5 r(nz5 nz5Var) {
        mz5 mz5VarH = mz5.h();
        mz5VarH.i(nz5Var);
        return mz5VarH;
    }

    @Override // defpackage.ou4
    public final d2 a() {
        return w0;
    }

    @Override // defpackage.d2
    public final int b() {
        int i = this.v0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Z & 4096) == 4096 ? nv0.l(1, this.s0) : 0;
        for (int i2 = 0; i2 < this.f0.size(); i2++) {
            iL += nv0.n(2, (d2) this.f0.get(i2));
        }
        if ((this.Z & 1) == 1) {
            iL += nv0.r(3) + 1;
        }
        if ((this.Z & 2) == 2) {
            iL += nv0.l(4, this.h0);
        }
        if ((this.Z & 4) == 4) {
            iL += nv0.n(5, this.i0);
        }
        if ((this.Z & 16) == 16) {
            iL += nv0.l(6, this.k0);
        }
        if ((this.Z & 32) == 32) {
            iL += nv0.l(7, this.l0);
        }
        if ((this.Z & 8) == 8) {
            iL += nv0.l(8, this.j0);
        }
        if ((this.Z & 64) == 64) {
            iL += nv0.l(9, this.m0);
        }
        if ((this.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            iL += nv0.n(10, this.o0);
        }
        if ((this.Z & 512) == 512) {
            iL += nv0.l(11, this.p0);
        }
        if ((this.Z & 128) == 128) {
            iL += nv0.l(12, this.n0);
        }
        if ((this.Z & 1024) == 1024) {
            iL += nv0.n(13, this.q0);
        }
        if ((this.Z & 2048) == 2048) {
            iL += nv0.l(14, this.r0);
        }
        for (int i3 = 0; i3 < this.t0.size(); i3++) {
            iL += nv0.n(100, (d2) this.t0.get(i3));
        }
        int size = this.Y.size() + j() + iL;
        this.v0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return mz5.h();
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.u0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f0.size(); i++) {
            if (!((lz5) this.f0.get(i)).d()) {
                this.u0 = (byte) 0;
                return false;
            }
        }
        if ((this.Z & 4) == 4 && !this.i0.d()) {
            this.u0 = (byte) 0;
            return false;
        }
        if ((this.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 && !this.o0.d()) {
            this.u0 = (byte) 0;
            return false;
        }
        if ((this.Z & 1024) == 1024 && !this.q0.d()) {
            this.u0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.t0.size(); i2++) {
            if (!((cy5) this.t0.get(i2)).d()) {
                this.u0 = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.u0 = (byte) 1;
            return true;
        }
        this.u0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        return r(this);
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        mj0 mj0Var = new mj0(this);
        if ((this.Z & 4096) == 4096) {
            nv0Var.V(1, this.s0);
        }
        for (int i = 0; i < this.f0.size(); i++) {
            nv0Var.X(2, (d2) this.f0.get(i));
        }
        if ((this.Z & 1) == 1) {
            boolean z = this.g0;
            nv0Var.g0(3, 0);
            nv0Var.Z(z ? 1 : 0);
        }
        if ((this.Z & 2) == 2) {
            nv0Var.V(4, this.h0);
        }
        if ((this.Z & 4) == 4) {
            nv0Var.X(5, this.i0);
        }
        if ((this.Z & 16) == 16) {
            nv0Var.V(6, this.k0);
        }
        if ((this.Z & 32) == 32) {
            nv0Var.V(7, this.l0);
        }
        if ((this.Z & 8) == 8) {
            nv0Var.V(8, this.j0);
        }
        if ((this.Z & 64) == 64) {
            nv0Var.V(9, this.m0);
        }
        if ((this.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            nv0Var.X(10, this.o0);
        }
        if ((this.Z & 512) == 512) {
            nv0Var.V(11, this.p0);
        }
        if ((this.Z & 128) == 128) {
            nv0Var.V(12, this.n0);
        }
        if ((this.Z & 1024) == 1024) {
            nv0Var.X(13, this.q0);
        }
        if ((this.Z & 2048) == 2048) {
            nv0Var.V(14, this.r0);
        }
        for (int i2 = 0; i2 < this.t0.size(); i2++) {
            nv0Var.X(100, (d2) this.t0.get(i2));
        }
        mj0Var.b0(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, nv0Var);
        nv0Var.a0(this.Y);
    }

    public final boolean p() {
        return (this.Z & 16) == 16;
    }

    public final void q() {
        List list = Collections.EMPTY_LIST;
        this.f0 = list;
        this.g0 = false;
        this.h0 = 0;
        nz5 nz5Var = w0;
        this.i0 = nz5Var;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = nz5Var;
        this.p0 = 0;
        this.q0 = nz5Var;
        this.r0 = 0;
        this.s0 = 0;
        this.t0 = list;
    }

    public nz5() {
        this.u0 = (byte) -1;
        this.v0 = -1;
        this.Y = jb0.X;
    }

    public nz5(mz5 mz5Var) {
        super(mz5Var);
        this.u0 = (byte) -1;
        this.v0 = -1;
        this.Y = mz5Var.X;
    }
}
