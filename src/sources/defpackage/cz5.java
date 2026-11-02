package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cz5 extends yp2 {
    public static final cz5 G0;
    public static final au3 H0 = new au3((byte) 18);
    public List A0;
    public List B0;
    public ky5 C0;
    public ky5 D0;
    public byte E0;
    public int F0;
    public final jb0 Y;
    public int Z;
    public int f0;
    public int g0;
    public int h0;
    public nz5 i0;
    public int j0;
    public List k0;
    public nz5 l0;
    public int m0;
    public List n0;
    public List o0;
    public int p0;
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

    static {
        cz5 cz5Var = new cz5();
        G0 = cz5Var;
        cz5Var.p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    public cz5(iv0 iv0Var, r62 r62Var) throws Throwable {
        uz5 uz5VarH;
        this.p0 = -1;
        this.E0 = (byte) -1;
        this.F0 = -1;
        p();
        ib0 ib0VarI = jb0.i();
        boolean z = true;
        nv0 nv0VarG = nv0.G(ib0VarI, 1);
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = z;
            if (z2) {
                if ((i & 32) == 32) {
                    this.k0 = Collections.unmodifiableList(this.k0);
                }
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.n0 = Collections.unmodifiableList(this.n0);
                }
                if ((i & 512) == 512) {
                    this.o0 = Collections.unmodifiableList(this.o0);
                }
                if ((i & DnsOverHttps.MAX_RESPONSE_SIZE) == 65536) {
                    this.w0 = Collections.unmodifiableList(this.w0);
                }
                if ((i & 131072) == 131072) {
                    this.x0 = Collections.unmodifiableList(this.x0);
                }
                if ((i & 262144) == 262144) {
                    this.y0 = Collections.unmodifiableList(this.y0);
                }
                if ((i & 1024) == 1024) {
                    this.q0 = Collections.unmodifiableList(this.q0);
                }
                if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                    this.u0 = Collections.unmodifiableList(this.u0);
                }
                if ((i & 32768) == 32768) {
                    this.v0 = Collections.unmodifiableList(this.v0);
                }
                if ((i & 524288) == 524288) {
                    this.z0 = Collections.unmodifiableList(this.z0);
                }
                if ((i & 1048576) == 1048576) {
                    this.A0 = Collections.unmodifiableList(this.A0);
                }
                if ((i & 2097152) == 2097152) {
                    this.B0 = Collections.unmodifiableList(this.B0);
                }
                try {
                    nv0VarG.y();
                } catch (IOException unused) {
                } finally {
                    this.Y = ib0VarI.m();
                }
                m();
                return;
            }
            try {
                try {
                    int iN = iv0Var.n();
                    Cloneable cloneableI = null;
                    switch (iN) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            break;
                        case 8:
                            this.Z |= 2;
                            this.g0 = iv0Var.k();
                            z = z3;
                            break;
                        case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                            this.Z |= 4;
                            this.h0 = iv0Var.k();
                            z = z3;
                            break;
                        case 26:
                            if ((this.Z & 8) == 8) {
                                nz5 nz5Var = this.i0;
                                nz5Var.getClass();
                                cloneableI = nz5.r(nz5Var);
                            }
                            mz5 mz5Var = cloneableI;
                            nz5 nz5Var2 = (nz5) iv0Var.g(nz5.x0, r62Var);
                            this.i0 = nz5Var2;
                            if (mz5Var != 0) {
                                mz5Var.i(nz5Var2);
                                this.i0 = mz5Var.g();
                            }
                            this.Z |= 8;
                            z = z3;
                            break;
                        case 34:
                            if ((i & 32) != 32) {
                                this.k0 = new ArrayList();
                                i |= 32;
                            }
                            this.k0.add(iv0Var.g(sz5.q0, r62Var));
                            z = z3;
                            break;
                        case 42:
                            if ((this.Z & 32) == 32) {
                                nz5 nz5Var3 = this.l0;
                                nz5Var3.getClass();
                                cloneableI = nz5.r(nz5Var3);
                            }
                            mz5 mz5Var2 = cloneableI;
                            nz5 nz5Var4 = (nz5) iv0Var.g(nz5.x0, r62Var);
                            this.l0 = nz5Var4;
                            if (mz5Var2 != 0) {
                                mz5Var2.i(nz5Var4);
                                this.l0 = mz5Var2.g();
                            }
                            this.Z |= 32;
                            z = z3;
                            break;
                        case 50:
                            if ((this.Z & 128) == 128) {
                                vz5 vz5Var = this.r0;
                                vz5Var.getClass();
                                uz5VarH = uz5.h();
                                uz5VarH.i(vz5Var);
                            } else {
                                uz5VarH = null;
                            }
                            vz5 vz5Var2 = (vz5) iv0Var.g(vz5.q0, r62Var);
                            this.r0 = vz5Var2;
                            if (uz5VarH != null) {
                                uz5VarH.i(vz5Var2);
                                this.r0 = uz5VarH.g();
                            }
                            this.Z |= 128;
                            z = z3;
                            break;
                        case 56:
                            this.Z |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            this.s0 = iv0Var.k();
                            z = z3;
                            break;
                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                            this.Z |= 512;
                            this.t0 = iv0Var.k();
                            z = z3;
                            break;
                        case 72:
                            this.Z |= 16;
                            this.j0 = iv0Var.k();
                            z = z3;
                            break;
                        case 80:
                            this.Z |= 64;
                            this.m0 = iv0Var.k();
                            z = z3;
                            break;
                        case 88:
                            this.Z |= 1;
                            this.f0 = iv0Var.k();
                            z = z3;
                            break;
                        case 98:
                            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                                this.n0 = new ArrayList();
                                i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            }
                            this.n0.add(iv0Var.g(nz5.x0, r62Var));
                            z = z3;
                            break;
                        case 104:
                            if ((i & 512) != 512) {
                                this.o0 = new ArrayList();
                                i |= 512;
                            }
                            this.o0.add(Integer.valueOf(iv0Var.k()));
                            z = z3;
                            break;
                        case 106:
                            int iE = iv0Var.e(iv0Var.k());
                            if ((i & 512) != 512 && iv0Var.c() > 0) {
                                this.o0 = new ArrayList();
                                i |= 512;
                            }
                            while (iv0Var.c() > 0) {
                                this.o0.add(Integer.valueOf(iv0Var.k()));
                            }
                            iv0Var.d(iE);
                            z = z3;
                            break;
                        case 114:
                            if ((i & DnsOverHttps.MAX_RESPONSE_SIZE) != 65536) {
                                this.w0 = new ArrayList();
                                i |= DnsOverHttps.MAX_RESPONSE_SIZE;
                            }
                            this.w0.add(iv0Var.g(cy5.j0, r62Var));
                            z = z3;
                            break;
                        case 122:
                            if ((i & 131072) != 131072) {
                                this.x0 = new ArrayList();
                                i |= 131072;
                            }
                            this.x0.add(iv0Var.g(cy5.j0, r62Var));
                            z = z3;
                            break;
                        case 130:
                            if ((i & 262144) != 262144) {
                                this.y0 = new ArrayList();
                                i |= 262144;
                            }
                            this.y0.add(iv0Var.g(cy5.j0, r62Var));
                            z = z3;
                            break;
                        case 138:
                            if ((i & 1024) != 1024) {
                                this.q0 = new ArrayList();
                                i |= 1024;
                            }
                            this.q0.add(iv0Var.g(vz5.q0, r62Var));
                            z = z3;
                            break;
                        case 248:
                            if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                                this.u0 = new ArrayList();
                                i |= Http2.INITIAL_MAX_FRAME_SIZE;
                            }
                            this.u0.add(Integer.valueOf(iv0Var.k()));
                            z = z3;
                            break;
                        case 250:
                            int iE2 = iv0Var.e(iv0Var.k());
                            if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 16384 && iv0Var.c() > 0) {
                                this.u0 = new ArrayList();
                                i |= Http2.INITIAL_MAX_FRAME_SIZE;
                            }
                            while (iv0Var.c() > 0) {
                                this.u0.add(Integer.valueOf(iv0Var.k()));
                            }
                            iv0Var.d(iE2);
                            z = z3;
                            break;
                        case 258:
                            if ((i & 32768) != 32768) {
                                this.v0 = new ArrayList();
                                i |= 32768;
                            }
                            this.v0.add(iv0Var.g(gy5.j0, r62Var));
                            z = z3;
                            break;
                        case 266:
                            if ((i & 524288) != 524288) {
                                this.z0 = new ArrayList();
                                i |= 524288;
                            }
                            this.z0.add(iv0Var.g(cy5.j0, r62Var));
                            z = z3;
                            break;
                        case 274:
                            if ((i & 1048576) != 1048576) {
                                this.A0 = new ArrayList();
                                i |= 1048576;
                            }
                            this.A0.add(iv0Var.g(cy5.j0, r62Var));
                            z = z3;
                            break;
                        case 282:
                            if ((i & 2097152) != 2097152) {
                                this.B0 = new ArrayList();
                                i |= 2097152;
                            }
                            this.B0.add(iv0Var.g(cy5.j0, r62Var));
                            z = z3;
                            break;
                        case 322:
                            if ((this.Z & 1024) == 1024) {
                                ky5 ky5Var = this.C0;
                                ky5Var.getClass();
                                cloneableI = ky5.i(ky5Var);
                            }
                            jy5 jy5Var = cloneableI;
                            ky5 ky5Var2 = (ky5) iv0Var.g(ky5.h0, r62Var);
                            this.C0 = ky5Var2;
                            if (jy5Var != 0) {
                                jy5Var.j(ky5Var2);
                                this.C0 = jy5Var.f();
                            }
                            this.Z |= 1024;
                            z = z3;
                            break;
                        case 330:
                            try {
                                if ((this.Z & 2048) == 2048) {
                                    ky5 ky5Var3 = this.D0;
                                    ky5Var3.getClass();
                                    cloneableI = ky5.i(ky5Var3);
                                }
                                jy5 jy5Var2 = cloneableI;
                                ky5 ky5Var4 = (ky5) iv0Var.g(ky5.h0, r62Var);
                                this.D0 = ky5Var4;
                                if (jy5Var2 != 0) {
                                    jy5Var2.j(ky5Var4);
                                    this.D0 = jy5Var2.f();
                                }
                                this.Z |= 2048;
                                z = z3;
                            } catch (rh3 e) {
                                e = e;
                                e.X = this;
                                throw e;
                            } catch (IOException e2) {
                                e = e2;
                                rh3 rh3Var = new rh3(e.getMessage());
                                rh3Var.X = this;
                                throw rh3Var;
                            } catch (Throwable th) {
                                th = th;
                                if ((i & 32) == 32) {
                                    this.k0 = Collections.unmodifiableList(this.k0);
                                }
                                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                                    this.n0 = Collections.unmodifiableList(this.n0);
                                }
                                if ((i & 512) == 512) {
                                    this.o0 = Collections.unmodifiableList(this.o0);
                                }
                                if ((i & DnsOverHttps.MAX_RESPONSE_SIZE) == 65536) {
                                    this.w0 = Collections.unmodifiableList(this.w0);
                                }
                                if ((i & 131072) == 131072) {
                                    this.x0 = Collections.unmodifiableList(this.x0);
                                }
                                if ((i & 262144) == 262144) {
                                    this.y0 = Collections.unmodifiableList(this.y0);
                                }
                                if ((i & 1024) == 1024) {
                                    this.q0 = Collections.unmodifiableList(this.q0);
                                }
                                if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                                    this.u0 = Collections.unmodifiableList(this.u0);
                                }
                                if ((i & 32768) == 32768) {
                                    this.v0 = Collections.unmodifiableList(this.v0);
                                }
                                if ((i & 524288) == 524288) {
                                    this.z0 = Collections.unmodifiableList(this.z0);
                                }
                                if ((i & 1048576) == 1048576) {
                                    this.A0 = Collections.unmodifiableList(this.A0);
                                }
                                if ((i & 2097152) == 2097152) {
                                    this.B0 = Collections.unmodifiableList(this.B0);
                                }
                                try {
                                    nv0VarG.y();
                                    break;
                                } catch (IOException unused2) {
                                } finally {
                                    this.Y = ib0VarI.m();
                                }
                                m();
                                throw th;
                            }
                            break;
                        default:
                            if (!n(iv0Var, nv0VarG, r62Var, iN)) {
                                z2 = z3;
                            }
                            z = z3;
                            break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (rh3 e3) {
                e = e3;
            } catch (IOException e4) {
                e = e4;
            }
        }
    }

    @Override // defpackage.ou4
    public final d2 a() {
        return G0;
    }

    @Override // defpackage.d2
    public final int b() {
        List list;
        List list2;
        int i = this.F0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Z & 2) == 2 ? nv0.l(1, this.g0) : 0;
        if ((this.Z & 4) == 4) {
            iL += nv0.l(2, this.h0);
        }
        if ((this.Z & 8) == 8) {
            iL += nv0.n(3, this.i0);
        }
        for (int i2 = 0; i2 < this.k0.size(); i2++) {
            iL += nv0.n(4, (d2) this.k0.get(i2));
        }
        if ((this.Z & 32) == 32) {
            iL += nv0.n(5, this.l0);
        }
        if ((this.Z & 128) == 128) {
            iL += nv0.n(6, this.r0);
        }
        if ((this.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            iL += nv0.l(7, this.s0);
        }
        if ((this.Z & 512) == 512) {
            iL += nv0.l(8, this.t0);
        }
        if ((this.Z & 16) == 16) {
            iL += nv0.l(9, this.j0);
        }
        if ((this.Z & 64) == 64) {
            iL += nv0.l(10, this.m0);
        }
        if ((this.Z & 1) == 1) {
            iL += nv0.l(11, this.f0);
        }
        for (int i3 = 0; i3 < this.n0.size(); i3++) {
            iL += nv0.n(12, (d2) this.n0.get(i3));
        }
        int i4 = 0;
        int iM = 0;
        while (true) {
            int size = this.o0.size();
            list = this.o0;
            if (i4 >= size) {
                break;
            }
            iM += nv0.m(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int iN = iL + iM;
        if (!list.isEmpty()) {
            iN = iN + 1 + nv0.m(iM);
        }
        this.p0 = iM;
        for (int i5 = 0; i5 < this.w0.size(); i5++) {
            iN += nv0.n(14, (d2) this.w0.get(i5));
        }
        for (int i6 = 0; i6 < this.x0.size(); i6++) {
            iN += nv0.n(15, (d2) this.x0.get(i6));
        }
        for (int i7 = 0; i7 < this.y0.size(); i7++) {
            iN += nv0.n(16, (d2) this.y0.get(i7));
        }
        for (int i8 = 0; i8 < this.q0.size(); i8++) {
            iN += nv0.n(17, (d2) this.q0.get(i8));
        }
        int i9 = 0;
        int iM2 = 0;
        while (true) {
            int size2 = this.u0.size();
            list2 = this.u0;
            if (i9 >= size2) {
                break;
            }
            iM2 += nv0.m(((Integer) list2.get(i9)).intValue());
            i9++;
        }
        int size3 = (list2.size() * 2) + iN + iM2;
        for (int i10 = 0; i10 < this.v0.size(); i10++) {
            size3 += nv0.n(32, (d2) this.v0.get(i10));
        }
        for (int i11 = 0; i11 < this.z0.size(); i11++) {
            size3 += nv0.n(33, (d2) this.z0.get(i11));
        }
        for (int i12 = 0; i12 < this.A0.size(); i12++) {
            size3 += nv0.n(34, (d2) this.A0.get(i12));
        }
        for (int i13 = 0; i13 < this.B0.size(); i13++) {
            size3 += nv0.n(35, (d2) this.B0.get(i13));
        }
        if ((this.Z & 1024) == 1024) {
            size3 += nv0.n(40, this.C0);
        }
        if ((this.Z & 2048) == 2048) {
            size3 += nv0.n(41, this.D0);
        }
        int size4 = this.Y.size() + j() + size3;
        this.F0 = size4;
        return size4;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return bz5.h();
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.E0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.Z;
        if ((i & 4) != 4) {
            this.E0 = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.i0.d()) {
            this.E0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.k0.size(); i2++) {
            if (!((sz5) this.k0.get(i2)).d()) {
                this.E0 = (byte) 0;
                return false;
            }
        }
        if ((this.Z & 32) == 32 && !this.l0.d()) {
            this.E0 = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.n0.size(); i3++) {
            if (!((nz5) this.n0.get(i3)).d()) {
                this.E0 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.q0.size(); i4++) {
            if (!((vz5) this.q0.get(i4)).d()) {
                this.E0 = (byte) 0;
                return false;
            }
        }
        if ((this.Z & 128) == 128 && !this.r0.d()) {
            this.E0 = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.v0.size(); i5++) {
            if (!((gy5) this.v0.get(i5)).d()) {
                this.E0 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.w0.size(); i6++) {
            if (!((cy5) this.w0.get(i6)).d()) {
                this.E0 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.x0.size(); i7++) {
            if (!((cy5) this.x0.get(i7)).d()) {
                this.E0 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.y0.size(); i8++) {
            if (!((cy5) this.y0.get(i8)).d()) {
                this.E0 = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.z0.size(); i9++) {
            if (!((cy5) this.z0.get(i9)).d()) {
                this.E0 = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.A0.size(); i10++) {
            if (!((cy5) this.A0.get(i10)).d()) {
                this.E0 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.B0.size(); i11++) {
            if (!((cy5) this.B0.get(i11)).d()) {
                this.E0 = (byte) 0;
                return false;
            }
        }
        if ((this.Z & 1024) == 1024 && !this.C0.d()) {
            this.E0 = (byte) 0;
            return false;
        }
        if ((this.Z & 2048) == 2048 && !this.D0.d()) {
            this.E0 = (byte) 0;
            return false;
        }
        if (i()) {
            this.E0 = (byte) 1;
            return true;
        }
        this.E0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        bz5 bz5VarH = bz5.h();
        bz5VarH.i(this);
        return bz5VarH;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        mj0 mj0Var = new mj0(this);
        if ((this.Z & 2) == 2) {
            nv0Var.V(1, this.g0);
        }
        if ((this.Z & 4) == 4) {
            nv0Var.V(2, this.h0);
        }
        if ((this.Z & 8) == 8) {
            nv0Var.X(3, this.i0);
        }
        for (int i = 0; i < this.k0.size(); i++) {
            nv0Var.X(4, (d2) this.k0.get(i));
        }
        if ((this.Z & 32) == 32) {
            nv0Var.X(5, this.l0);
        }
        if ((this.Z & 128) == 128) {
            nv0Var.X(6, this.r0);
        }
        if ((this.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            nv0Var.V(7, this.s0);
        }
        if ((this.Z & 512) == 512) {
            nv0Var.V(8, this.t0);
        }
        if ((this.Z & 16) == 16) {
            nv0Var.V(9, this.j0);
        }
        if ((this.Z & 64) == 64) {
            nv0Var.V(10, this.m0);
        }
        if ((this.Z & 1) == 1) {
            nv0Var.V(11, this.f0);
        }
        for (int i2 = 0; i2 < this.n0.size(); i2++) {
            nv0Var.X(12, (d2) this.n0.get(i2));
        }
        if (this.o0.size() > 0) {
            nv0Var.e0(106);
            nv0Var.e0(this.p0);
        }
        for (int i3 = 0; i3 < this.o0.size(); i3++) {
            nv0Var.W(((Integer) this.o0.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.w0.size(); i4++) {
            nv0Var.X(14, (d2) this.w0.get(i4));
        }
        for (int i5 = 0; i5 < this.x0.size(); i5++) {
            nv0Var.X(15, (d2) this.x0.get(i5));
        }
        for (int i6 = 0; i6 < this.y0.size(); i6++) {
            nv0Var.X(16, (d2) this.y0.get(i6));
        }
        for (int i7 = 0; i7 < this.q0.size(); i7++) {
            nv0Var.X(17, (d2) this.q0.get(i7));
        }
        for (int i8 = 0; i8 < this.u0.size(); i8++) {
            nv0Var.V(31, ((Integer) this.u0.get(i8)).intValue());
        }
        for (int i9 = 0; i9 < this.v0.size(); i9++) {
            nv0Var.X(32, (d2) this.v0.get(i9));
        }
        for (int i10 = 0; i10 < this.z0.size(); i10++) {
            nv0Var.X(33, (d2) this.z0.get(i10));
        }
        for (int i11 = 0; i11 < this.A0.size(); i11++) {
            nv0Var.X(34, (d2) this.A0.get(i11));
        }
        for (int i12 = 0; i12 < this.B0.size(); i12++) {
            nv0Var.X(35, (d2) this.B0.get(i12));
        }
        if ((this.Z & 1024) == 1024) {
            nv0Var.X(40, this.C0);
        }
        if ((this.Z & 2048) == 2048) {
            nv0Var.X(41, this.D0);
        }
        mj0Var.b0(19000, nv0Var);
        nv0Var.a0(this.Y);
    }

    public final void p() {
        this.f0 = 518;
        this.g0 = 2054;
        this.h0 = 0;
        nz5 nz5Var = nz5.w0;
        this.i0 = nz5Var;
        this.j0 = 0;
        List list = Collections.EMPTY_LIST;
        this.k0 = list;
        this.l0 = nz5Var;
        this.m0 = 0;
        this.n0 = list;
        this.o0 = list;
        this.q0 = list;
        this.r0 = vz5.p0;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = list;
        this.v0 = list;
        this.w0 = list;
        this.x0 = list;
        this.y0 = list;
        this.z0 = list;
        this.A0 = list;
        this.B0 = list;
        ky5 ky5Var = ky5.g0;
        this.C0 = ky5Var;
        this.D0 = ky5Var;
    }

    public cz5() {
        this.p0 = -1;
        this.E0 = (byte) -1;
        this.F0 = -1;
        this.Y = jb0.X;
    }

    public cz5(bz5 bz5Var) {
        super(bz5Var);
        this.p0 = -1;
        this.E0 = (byte) -1;
        this.F0 = -1;
        this.Y = bz5Var.X;
    }
}
