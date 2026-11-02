package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.HpkeSuite;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pz5 extends yp2 {
    public static final pz5 r0;
    public static final au3 s0 = new au3((byte) 24);
    public final jb0 Y;
    public int Z;
    public int f0;
    public int g0;
    public List h0;
    public nz5 i0;
    public int j0;
    public nz5 k0;
    public int l0;
    public List m0;
    public List n0;
    public List o0;
    public byte p0;
    public int q0;

    static {
        pz5 pz5Var = new pz5();
        r0 = pz5Var;
        pz5Var.f0 = 6;
        pz5Var.g0 = 0;
        List list = Collections.EMPTY_LIST;
        pz5Var.h0 = list;
        nz5 nz5Var = nz5.w0;
        pz5Var.i0 = nz5Var;
        pz5Var.j0 = 0;
        pz5Var.k0 = nz5Var;
        pz5Var.l0 = 0;
        pz5Var.m0 = list;
        pz5Var.n0 = list;
        pz5Var.o0 = list;
    }

    public pz5(iv0 iv0Var, r62 r62Var) {
        this.p0 = (byte) -1;
        this.q0 = -1;
        this.f0 = 6;
        boolean z = false;
        this.g0 = 0;
        List list = Collections.EMPTY_LIST;
        this.h0 = list;
        nz5 nz5Var = nz5.w0;
        this.i0 = nz5Var;
        this.j0 = 0;
        this.k0 = nz5Var;
        this.l0 = 0;
        this.m0 = list;
        this.n0 = list;
        this.o0 = list;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = iv0Var.n();
                    mz5 mz5VarR = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.Z |= 1;
                            this.f0 = iv0Var.k();
                            continue;
                        case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                            this.Z |= 2;
                            this.g0 = iv0Var.k();
                            continue;
                        case 26:
                            if ((i & 4) != 4) {
                                this.h0 = new ArrayList();
                                i |= 4;
                            }
                            this.h0.add(iv0Var.g(sz5.q0, r62Var));
                            continue;
                        case 34:
                            if ((this.Z & 4) == 4) {
                                nz5 nz5Var2 = this.i0;
                                nz5Var2.getClass();
                                mz5VarR = nz5.r(nz5Var2);
                            }
                            nz5 nz5Var3 = (nz5) iv0Var.g(nz5.x0, r62Var);
                            this.i0 = nz5Var3;
                            if (mz5VarR != null) {
                                mz5VarR.i(nz5Var3);
                                this.i0 = mz5VarR.g();
                            }
                            this.Z |= 4;
                            continue;
                        case 40:
                            this.Z |= 8;
                            this.j0 = iv0Var.k();
                            continue;
                        case 50:
                            if ((this.Z & 16) == 16) {
                                nz5 nz5Var4 = this.k0;
                                nz5Var4.getClass();
                                mz5VarR = nz5.r(nz5Var4);
                            }
                            nz5 nz5Var5 = (nz5) iv0Var.g(nz5.x0, r62Var);
                            this.k0 = nz5Var5;
                            if (mz5VarR != null) {
                                mz5VarR.i(nz5Var5);
                                this.k0 = mz5VarR.g();
                            }
                            this.Z |= 16;
                            continue;
                        case 56:
                            this.Z |= 32;
                            this.l0 = iv0Var.k();
                            continue;
                        case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                            if ((i & 128) != 128) {
                                this.m0 = new ArrayList();
                                i |= 128;
                            }
                            this.m0.add(iv0Var.g(cy5.j0, r62Var));
                            continue;
                        case 248:
                            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                                this.n0 = new ArrayList();
                                i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            }
                            this.n0.add(Integer.valueOf(iv0Var.k()));
                            continue;
                        case 250:
                            int iE = iv0Var.e(iv0Var.k());
                            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256 && iv0Var.c() > 0) {
                                this.n0 = new ArrayList();
                                i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            }
                            while (iv0Var.c() > 0) {
                                this.n0.add(Integer.valueOf(iv0Var.k()));
                            }
                            iv0Var.d(iE);
                            continue;
                        case 258:
                            if ((i & 512) != 512) {
                                this.o0 = new ArrayList();
                                i |= 512;
                            }
                            this.o0.add(iv0Var.g(gy5.j0, r62Var));
                            continue;
                        default:
                            if (!n(iv0Var, nv0VarG, r62Var, iN)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (rh3 e) {
                    e.X = this;
                    throw e;
                } catch (IOException e2) {
                    rh3 rh3Var = new rh3(e2.getMessage());
                    rh3Var.X = this;
                    throw rh3Var;
                }
            } catch (Throwable th) {
                if ((i & 4) == 4) {
                    this.h0 = Collections.unmodifiableList(this.h0);
                }
                if ((i & 128) == 128) {
                    this.m0 = Collections.unmodifiableList(this.m0);
                }
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.n0 = Collections.unmodifiableList(this.n0);
                }
                if ((i & 512) == 512) {
                    this.o0 = Collections.unmodifiableList(this.o0);
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
        }
        if ((i & 4) == 4) {
            this.h0 = Collections.unmodifiableList(this.h0);
        }
        if ((i & 128) == 128) {
            this.m0 = Collections.unmodifiableList(this.m0);
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.n0 = Collections.unmodifiableList(this.n0);
        }
        if ((i & 512) == 512) {
            this.o0 = Collections.unmodifiableList(this.o0);
        }
        try {
            nv0VarG.R();
        } catch (IOException unused2) {
        } finally {
            this.Y = ib0Var.m();
        }
        m();
    }

    @Override // defpackage.ou4
    public final d2 a() {
        return r0;
    }

    @Override // defpackage.d2
    public final int b() {
        List list;
        int i = this.q0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Z & 1) == 1 ? nv0.l(1, this.f0) : 0;
        if ((this.Z & 2) == 2) {
            iL += nv0.l(2, this.g0);
        }
        for (int i2 = 0; i2 < this.h0.size(); i2++) {
            iL += nv0.n(3, (d2) this.h0.get(i2));
        }
        if ((this.Z & 4) == 4) {
            iL += nv0.n(4, this.i0);
        }
        if ((this.Z & 8) == 8) {
            iL += nv0.l(5, this.j0);
        }
        if ((this.Z & 16) == 16) {
            iL += nv0.n(6, this.k0);
        }
        if ((this.Z & 32) == 32) {
            iL += nv0.l(7, this.l0);
        }
        for (int i3 = 0; i3 < this.m0.size(); i3++) {
            iL += nv0.n(8, (d2) this.m0.get(i3));
        }
        int i4 = 0;
        int iM = 0;
        while (true) {
            int size = this.n0.size();
            list = this.n0;
            if (i4 >= size) {
                break;
            }
            iM += nv0.m(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int size2 = (list.size() * 2) + iL + iM;
        for (int i5 = 0; i5 < this.o0.size(); i5++) {
            size2 += nv0.n(32, (d2) this.o0.get(i5));
        }
        int size3 = this.Y.size() + j() + size2;
        this.q0 = size3;
        return size3;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return oz5.h();
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
        if ((this.Z & 2) != 2) {
            this.p0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.h0.size(); i++) {
            if (!((sz5) this.h0.get(i)).d()) {
                this.p0 = (byte) 0;
                return false;
            }
        }
        if ((this.Z & 4) == 4 && !this.i0.d()) {
            this.p0 = (byte) 0;
            return false;
        }
        if ((this.Z & 16) == 16 && !this.k0.d()) {
            this.p0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.m0.size(); i2++) {
            if (!((cy5) this.m0.get(i2)).d()) {
                this.p0 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.o0.size(); i3++) {
            if (!((gy5) this.o0.get(i3)).d()) {
                this.p0 = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.p0 = (byte) 1;
            return true;
        }
        this.p0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        oz5 oz5VarH = oz5.h();
        oz5VarH.i(this);
        return oz5VarH;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        mj0 mj0Var = new mj0(this);
        if ((this.Z & 1) == 1) {
            nv0Var.V(1, this.f0);
        }
        if ((this.Z & 2) == 2) {
            nv0Var.V(2, this.g0);
        }
        for (int i = 0; i < this.h0.size(); i++) {
            nv0Var.X(3, (d2) this.h0.get(i));
        }
        if ((this.Z & 4) == 4) {
            nv0Var.X(4, this.i0);
        }
        if ((this.Z & 8) == 8) {
            nv0Var.V(5, this.j0);
        }
        if ((this.Z & 16) == 16) {
            nv0Var.X(6, this.k0);
        }
        if ((this.Z & 32) == 32) {
            nv0Var.V(7, this.l0);
        }
        for (int i2 = 0; i2 < this.m0.size(); i2++) {
            nv0Var.X(8, (d2) this.m0.get(i2));
        }
        for (int i3 = 0; i3 < this.n0.size(); i3++) {
            nv0Var.V(31, ((Integer) this.n0.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.o0.size(); i4++) {
            nv0Var.X(32, (d2) this.o0.get(i4));
        }
        mj0Var.b0(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, nv0Var);
        nv0Var.a0(this.Y);
    }

    public pz5() {
        this.p0 = (byte) -1;
        this.q0 = -1;
        this.Y = jb0.X;
    }

    public pz5(oz5 oz5Var) {
        super(oz5Var);
        this.p0 = (byte) -1;
        this.q0 = -1;
        this.Y = oz5Var.X;
    }
}
