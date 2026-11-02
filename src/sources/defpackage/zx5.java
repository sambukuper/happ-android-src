package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.HpkeSuite;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zx5 extends bq2 {
    public static final zx5 r0;
    public static final au3 s0 = new au3((byte) 7);
    public final jb0 X;
    public int Y;
    public yx5 Z;
    public long f0;
    public float g0;
    public double h0;
    public int i0;
    public int j0;
    public int k0;
    public cy5 l0;
    public List m0;
    public int n0;
    public int o0;
    public byte p0;
    public int q0;

    static {
        zx5 zx5Var = new zx5();
        r0 = zx5Var;
        zx5Var.i();
    }

    public zx5(iv0 iv0Var, r62 r62Var) {
        by5 by5Var;
        this.p0 = (byte) -1;
        this.q0 = -1;
        i();
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        byte b = 0;
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = iv0Var.n();
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            int iK = iv0Var.k();
                            yx5 yx5VarB = yx5.b(iK);
                            if (yx5VarB == null) {
                                nv0VarG.e0(iN);
                                nv0VarG.e0(iK);
                            } else {
                                this.Y |= 1;
                                this.Z = yx5VarB;
                                continue;
                            }
                            break;
                        case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                            this.Y |= 2;
                            long jL = iv0Var.l();
                            this.f0 = (-(jL & 1)) ^ (jL >>> 1);
                            continue;
                        case 29:
                            this.Y |= 4;
                            this.g0 = Float.intBitsToFloat(iv0Var.i());
                            continue;
                        case 33:
                            this.Y |= 8;
                            this.h0 = Double.longBitsToDouble(iv0Var.j());
                            continue;
                        case 40:
                            this.Y |= 16;
                            this.i0 = iv0Var.k();
                            continue;
                        case 48:
                            this.Y |= 32;
                            this.j0 = iv0Var.k();
                            continue;
                        case 56:
                            this.Y |= 64;
                            this.k0 = iv0Var.k();
                            continue;
                        case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                            if ((this.Y & 128) == 128) {
                                cy5 cy5Var = this.l0;
                                cy5Var.getClass();
                                by5Var = new by5(b);
                                by5Var.f0 = Collections.EMPTY_LIST;
                                by5Var.h(cy5Var);
                            } else {
                                by5Var = null;
                            }
                            cy5 cy5Var2 = (cy5) iv0Var.g(cy5.j0, r62Var);
                            this.l0 = cy5Var2;
                            if (by5Var != null) {
                                by5Var.h(cy5Var2);
                                this.l0 = by5Var.f();
                            }
                            this.Y |= 128;
                            continue;
                        case 74:
                            if ((c & 256) != 256) {
                                this.m0 = new ArrayList();
                                c = 256;
                            }
                            this.m0.add(iv0Var.g(s0, r62Var));
                            continue;
                        case 80:
                            this.Y |= 512;
                            this.o0 = iv0Var.k();
                            continue;
                        case 88:
                            this.Y |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            this.n0 = iv0Var.k();
                            continue;
                        default:
                            if (!iv0Var.q(iN, nv0VarG)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((c & 256) == 256) {
                        this.m0 = Collections.unmodifiableList(this.m0);
                    }
                    try {
                        nv0VarG.R();
                    } catch (IOException unused) {
                    } finally {
                        this.X = ib0Var.m();
                    }
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
        if ((c & 256) == 256) {
            this.m0 = Collections.unmodifiableList(this.m0);
        }
        try {
            nv0VarG.R();
        } catch (IOException unused2) {
        } finally {
            this.X = ib0Var.m();
        }
    }

    @Override // defpackage.d2
    public final int b() {
        int i = this.q0;
        if (i != -1) {
            return i;
        }
        int iK = (this.Y & 1) == 1 ? nv0.k(1, this.Z.X) : 0;
        if ((this.Y & 2) == 2) {
            long j = this.f0;
            iK += nv0.q((j >> 63) ^ (j << 1)) + nv0.r(2);
        }
        if ((this.Y & 4) == 4) {
            iK += nv0.r(3) + 4;
        }
        if ((this.Y & 8) == 8) {
            iK += nv0.r(4) + 8;
        }
        if ((this.Y & 16) == 16) {
            iK += nv0.l(5, this.i0);
        }
        if ((this.Y & 32) == 32) {
            iK += nv0.l(6, this.j0);
        }
        if ((this.Y & 64) == 64) {
            iK += nv0.l(7, this.k0);
        }
        if ((this.Y & 128) == 128) {
            iK += nv0.n(8, this.l0);
        }
        for (int i2 = 0; i2 < this.m0.size(); i2++) {
            iK += nv0.n(9, (d2) this.m0.get(i2));
        }
        if ((this.Y & 512) == 512) {
            iK += nv0.l(10, this.o0);
        }
        if ((this.Y & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            iK += nv0.l(11, this.n0);
        }
        int size = this.X.size() + iK;
        this.q0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return xx5.g();
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.p0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.Y & 128) == 128 && !this.l0.d()) {
            this.p0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.m0.size(); i++) {
            if (!((zx5) this.m0.get(i)).d()) {
                this.p0 = (byte) 0;
                return false;
            }
        }
        this.p0 = (byte) 1;
        return true;
    }

    @Override // defpackage.d2
    public final up2 e() {
        xx5 xx5VarG = xx5.g();
        xx5VarG.h(this);
        return xx5VarG;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        if ((this.Y & 1) == 1) {
            nv0Var.U(1, this.Z.X);
        }
        if ((this.Y & 2) == 2) {
            long j = this.f0;
            nv0Var.g0(2, 0);
            nv0Var.f0((j >> 63) ^ (j << 1));
        }
        if ((this.Y & 4) == 4) {
            float f = this.g0;
            nv0Var.g0(3, 5);
            nv0Var.c0(Float.floatToRawIntBits(f));
        }
        if ((this.Y & 8) == 8) {
            double d = this.h0;
            nv0Var.g0(4, 1);
            nv0Var.d0(Double.doubleToRawLongBits(d));
        }
        if ((this.Y & 16) == 16) {
            nv0Var.V(5, this.i0);
        }
        if ((this.Y & 32) == 32) {
            nv0Var.V(6, this.j0);
        }
        if ((this.Y & 64) == 64) {
            nv0Var.V(7, this.k0);
        }
        if ((this.Y & 128) == 128) {
            nv0Var.X(8, this.l0);
        }
        for (int i = 0; i < this.m0.size(); i++) {
            nv0Var.X(9, (d2) this.m0.get(i));
        }
        if ((this.Y & 512) == 512) {
            nv0Var.V(10, this.o0);
        }
        if ((this.Y & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            nv0Var.V(11, this.n0);
        }
        nv0Var.a0(this.X);
    }

    public final void i() {
        this.Z = yx5.BYTE;
        this.f0 = 0L;
        this.g0 = 0.0f;
        this.h0 = 0.0d;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = cy5.i0;
        this.m0 = Collections.EMPTY_LIST;
        this.n0 = 0;
        this.o0 = 0;
    }

    public zx5() {
        this.p0 = (byte) -1;
        this.q0 = -1;
        this.X = jb0.X;
    }

    public zx5(xx5 xx5Var) {
        this.p0 = (byte) -1;
        this.q0 = -1;
        this.X = xx5Var.X;
    }
}
