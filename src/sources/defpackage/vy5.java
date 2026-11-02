package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vy5 extends yp2 {
    public static final vy5 A0;
    public static final au3 B0 = new au3((byte) 15);
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
    public List r0;
    public tz5 s0;
    public List t0;
    public ky5 u0;
    public List v0;
    public List w0;
    public List x0;
    public byte y0;
    public int z0;

    static {
        vy5 vy5Var = new vy5();
        A0 = vy5Var;
        vy5Var.p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    /* JADX WARN: Code duplicated, block: B:134:0x0339  */
    /* JADX WARN: Code duplicated, block: B:137:0x0345  */
    /* JADX WARN: Code duplicated, block: B:140:0x0351  */
    /* JADX WARN: Code duplicated, block: B:143:0x035d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0369  */
    /* JADX WARN: Code duplicated, block: B:149:0x0375  */
    /* JADX WARN: Code duplicated, block: B:152:0x0381  */
    /* JADX WARN: Code duplicated, block: B:155:0x038f  */
    /* JADX WARN: Code duplicated, block: B:158:0x039d  */
    /* JADX WARN: Multi-variable type inference failed */
    public vy5(iv0 iv0Var, r62 r62Var) throws Throwable {
        int i;
        this.p0 = -1;
        this.y0 = (byte) -1;
        this.z0 = -1;
        p();
        ib0 ib0Var = new ib0();
        boolean z = true;
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            int i3 = 32768;
            int i4 = 131072;
            boolean z3 = z;
            if (z2) {
                if ((i2 & 32) == 32) {
                    this.k0 = Collections.unmodifiableList(this.k0);
                }
                if ((i2 & 2048) == 2048) {
                    this.r0 = Collections.unmodifiableList(this.r0);
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.n0 = Collections.unmodifiableList(this.n0);
                }
                if ((i2 & 512) == 512) {
                    this.o0 = Collections.unmodifiableList(this.o0);
                }
                if ((i2 & DnsOverHttps.MAX_RESPONSE_SIZE) == 65536) {
                    this.w0 = Collections.unmodifiableList(this.w0);
                }
                if ((i2 & 1024) == 1024) {
                    this.q0 = Collections.unmodifiableList(this.q0);
                }
                if ((i2 & 8192) == 8192) {
                    this.t0 = Collections.unmodifiableList(this.t0);
                }
                if ((i2 & 32768) == 32768) {
                    this.v0 = Collections.unmodifiableList(this.v0);
                }
                if ((i2 & 131072) == 131072) {
                    this.x0 = Collections.unmodifiableList(this.x0);
                }
                try {
                    nv0VarG.R();
                } catch (IOException unused) {
                } finally {
                    this.Y = ib0Var.m();
                }
                m();
                return;
            }
            try {
                int iN = iv0Var.n();
                Cloneable cloneableR = null;
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
                            cloneableR = nz5.r(nz5Var);
                        }
                        mz5 mz5Var = cloneableR;
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
                        if ((i2 & 32) != 32) {
                            this.k0 = new ArrayList();
                            i2 |= 32;
                        }
                        this.k0.add(iv0Var.g(sz5.q0, r62Var));
                        z = z3;
                        break;
                    case 42:
                        if ((this.Z & 32) == 32) {
                            nz5 nz5Var3 = this.l0;
                            nz5Var3.getClass();
                            cloneableR = nz5.r(nz5Var3);
                        }
                        mz5 mz5Var2 = cloneableR;
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
                        if ((i2 & 2048) != 2048) {
                            this.r0 = new ArrayList();
                            i2 |= 2048;
                        }
                        this.r0.add(iv0Var.g(vz5.q0, r62Var));
                        z = z3;
                        break;
                    case 56:
                        this.Z |= 16;
                        this.j0 = iv0Var.k();
                        z = z3;
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        this.Z |= 64;
                        this.m0 = iv0Var.k();
                        z = z3;
                        break;
                    case 72:
                        this.Z |= 1;
                        this.f0 = iv0Var.k();
                        z = z3;
                        break;
                    case 82:
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                            this.n0 = new ArrayList();
                            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        }
                        this.n0.add(iv0Var.g(nz5.x0, r62Var));
                        z = z3;
                        break;
                    case 88:
                        if ((i2 & 512) != 512) {
                            this.o0 = new ArrayList();
                            i2 |= 512;
                        }
                        this.o0.add(Integer.valueOf(iv0Var.k()));
                        z = z3;
                        break;
                    case 90:
                        int iE = iv0Var.e(iv0Var.k());
                        if ((i2 & 512) != 512 && iv0Var.c() > 0) {
                            this.o0 = new ArrayList();
                            i2 |= 512;
                        }
                        while (iv0Var.c() > 0) {
                            this.o0.add(Integer.valueOf(iv0Var.k()));
                        }
                        iv0Var.d(iE);
                        z = z3;
                        break;
                    case 98:
                        if ((i2 & DnsOverHttps.MAX_RESPONSE_SIZE) != 65536) {
                            this.w0 = new ArrayList();
                            i2 |= DnsOverHttps.MAX_RESPONSE_SIZE;
                        }
                        this.w0.add(iv0Var.g(cy5.j0, r62Var));
                        z = z3;
                        break;
                    case 106:
                        if ((i2 & 1024) != 1024) {
                            this.q0 = new ArrayList();
                            i2 |= 1024;
                        }
                        this.q0.add(iv0Var.g(vz5.q0, r62Var));
                        z = z3;
                        break;
                    case 242:
                        if ((this.Z & 128) == 128) {
                            tz5 tz5Var = this.s0;
                            tz5Var.getClass();
                            cloneableR = tz5.i(tz5Var);
                        }
                        by5 by5Var = cloneableR;
                        tz5 tz5Var2 = (tz5) iv0Var.g(tz5.j0, r62Var);
                        this.s0 = tz5Var2;
                        if (by5Var != 0) {
                            by5Var.i(tz5Var2);
                            this.s0 = by5Var.g();
                        }
                        this.Z |= 128;
                        z = z3;
                        break;
                    case 248:
                        if ((i2 & 8192) != 8192) {
                            this.t0 = new ArrayList();
                            i2 |= 8192;
                        }
                        this.t0.add(Integer.valueOf(iv0Var.k()));
                        z = z3;
                        break;
                    case 250:
                        i4 = 131072;
                        int iE2 = iv0Var.e(iv0Var.k());
                        if ((i2 & 8192) != 8192 && iv0Var.c() > 0) {
                            this.t0 = new ArrayList();
                            i2 |= 8192;
                        }
                        while (iv0Var.c() > 0) {
                            i = i3;
                            try {
                                try {
                                    this.t0.add(Integer.valueOf(iv0Var.k()));
                                    i3 = i;
                                } catch (Throwable th) {
                                    th = th;
                                    if ((i2 & 32) == 32) {
                                        this.k0 = Collections.unmodifiableList(this.k0);
                                    }
                                    if ((i2 & 2048) == 2048) {
                                        this.r0 = Collections.unmodifiableList(this.r0);
                                    }
                                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                                        this.n0 = Collections.unmodifiableList(this.n0);
                                    }
                                    if ((i2 & 512) == 512) {
                                        this.o0 = Collections.unmodifiableList(this.o0);
                                    }
                                    if ((i2 & DnsOverHttps.MAX_RESPONSE_SIZE) == 65536) {
                                        this.w0 = Collections.unmodifiableList(this.w0);
                                    }
                                    if ((i2 & 1024) == 1024) {
                                        this.q0 = Collections.unmodifiableList(this.q0);
                                    }
                                    if ((i2 & 8192) == 8192) {
                                        this.t0 = Collections.unmodifiableList(this.t0);
                                    }
                                    if ((i2 & i) == i) {
                                        this.v0 = Collections.unmodifiableList(this.v0);
                                    }
                                    if ((i2 & i4) == i4) {
                                        this.x0 = Collections.unmodifiableList(this.x0);
                                    }
                                    try {
                                        nv0VarG.R();
                                        break;
                                    } catch (IOException unused2) {
                                    } finally {
                                        this.Y = ib0Var.m();
                                    }
                                    m();
                                    throw th;
                                }
                            } catch (rh3 e) {
                                e = e;
                                e.X = this;
                                throw e;
                            } catch (IOException e2) {
                                e = e2;
                                rh3 rh3Var = new rh3(e.getMessage());
                                rh3Var.X = this;
                                throw rh3Var;
                            }
                        }
                        iv0Var.d(iE2);
                        z = z3;
                        break;
                    case 258:
                        if ((this.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                            ky5 ky5Var = this.u0;
                            ky5Var.getClass();
                            cloneableR = ky5.i(ky5Var);
                        }
                        jy5 jy5Var = cloneableR;
                        ky5 ky5Var2 = (ky5) iv0Var.g(ky5.h0, r62Var);
                        this.u0 = ky5Var2;
                        if (jy5Var != 0) {
                            jy5Var.j(ky5Var2);
                            this.u0 = jy5Var.f();
                        }
                        this.Z |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        z = z3;
                        break;
                    case 266:
                        if ((i2 & 32768) != 32768) {
                            this.v0 = new ArrayList();
                            i2 |= 32768;
                        }
                        this.v0.add(iv0Var.g(gy5.j0, r62Var));
                        z = z3;
                        break;
                    case 274:
                        if ((i2 & 131072) != 131072) {
                            this.x0 = new ArrayList();
                            i2 |= 131072;
                        }
                        try {
                            try {
                                this.x0.add(iv0Var.g(cy5.j0, r62Var));
                                z = z3;
                            } catch (rh3 e3) {
                                e = e3;
                                e.X = this;
                                throw e;
                            } catch (IOException e4) {
                                e = e4;
                                rh3 rh3Var2 = new rh3(e.getMessage());
                                rh3Var2.X = this;
                                throw rh3Var2;
                            } catch (Throwable th2) {
                                th = th2;
                                i = 32768;
                                if ((i2 & 32) == 32) {
                                    this.k0 = Collections.unmodifiableList(this.k0);
                                }
                                if ((i2 & 2048) == 2048) {
                                    this.r0 = Collections.unmodifiableList(this.r0);
                                }
                                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                                    this.n0 = Collections.unmodifiableList(this.n0);
                                }
                                if ((i2 & 512) == 512) {
                                    this.o0 = Collections.unmodifiableList(this.o0);
                                }
                                if ((i2 & DnsOverHttps.MAX_RESPONSE_SIZE) == 65536) {
                                    this.w0 = Collections.unmodifiableList(this.w0);
                                }
                                if ((i2 & 1024) == 1024) {
                                    this.q0 = Collections.unmodifiableList(this.q0);
                                }
                                if ((i2 & 8192) == 8192) {
                                    this.t0 = Collections.unmodifiableList(this.t0);
                                }
                                if ((i2 & i) == i) {
                                    this.v0 = Collections.unmodifiableList(this.v0);
                                }
                                if ((i2 & i4) == i4) {
                                    this.x0 = Collections.unmodifiableList(this.x0);
                                }
                                nv0VarG.R();
                                m();
                                throw th;
                            }
                        } catch (rh3 e5) {
                            e = e5;
                        } catch (IOException e6) {
                            e = e6;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        break;
                    default:
                        if (!n(iv0Var, nv0VarG, r62Var, iN)) {
                            z2 = z3;
                        }
                        z = z3;
                        break;
                }
            } catch (rh3 e7) {
                e = e7;
            } catch (IOException e8) {
                e = e8;
            } catch (Throwable th4) {
                th = th4;
                i = 32768;
                i4 = 131072;
            }
        }
    }

    @Override // defpackage.ou4
    public final d2 a() {
        return A0;
    }

    @Override // defpackage.d2
    public final int b() {
        List list;
        List list2;
        int i = this.z0;
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
        for (int i3 = 0; i3 < this.r0.size(); i3++) {
            iL += nv0.n(6, (d2) this.r0.get(i3));
        }
        if ((this.Z & 16) == 16) {
            iL += nv0.l(7, this.j0);
        }
        if ((this.Z & 64) == 64) {
            iL += nv0.l(8, this.m0);
        }
        if ((this.Z & 1) == 1) {
            iL += nv0.l(9, this.f0);
        }
        for (int i4 = 0; i4 < this.n0.size(); i4++) {
            iL += nv0.n(10, (d2) this.n0.get(i4));
        }
        int i5 = 0;
        int iM = 0;
        while (true) {
            int size = this.o0.size();
            list = this.o0;
            if (i5 >= size) {
                break;
            }
            iM += nv0.m(((Integer) list.get(i5)).intValue());
            i5++;
        }
        int iN = iL + iM;
        if (!list.isEmpty()) {
            iN = iN + 1 + nv0.m(iM);
        }
        this.p0 = iM;
        for (int i6 = 0; i6 < this.w0.size(); i6++) {
            iN += nv0.n(12, (d2) this.w0.get(i6));
        }
        for (int i7 = 0; i7 < this.q0.size(); i7++) {
            iN += nv0.n(13, (d2) this.q0.get(i7));
        }
        if ((this.Z & 128) == 128) {
            iN += nv0.n(30, this.s0);
        }
        int i8 = 0;
        int iM2 = 0;
        while (true) {
            int size2 = this.t0.size();
            list2 = this.t0;
            if (i8 >= size2) {
                break;
            }
            iM2 += nv0.m(((Integer) list2.get(i8)).intValue());
            i8++;
        }
        int size3 = (list2.size() * 2) + iN + iM2;
        if ((this.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            size3 += nv0.n(32, this.u0);
        }
        for (int i9 = 0; i9 < this.v0.size(); i9++) {
            size3 += nv0.n(33, (d2) this.v0.get(i9));
        }
        for (int i10 = 0; i10 < this.x0.size(); i10++) {
            size3 += nv0.n(34, (d2) this.x0.get(i10));
        }
        int size4 = this.Y.size() + j() + size3;
        this.z0 = size4;
        return size4;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return uy5.h();
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.y0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.Z;
        if ((i & 4) != 4) {
            this.y0 = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.i0.d()) {
            this.y0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.k0.size(); i2++) {
            if (!((sz5) this.k0.get(i2)).d()) {
                this.y0 = (byte) 0;
                return false;
            }
        }
        if ((this.Z & 32) == 32 && !this.l0.d()) {
            this.y0 = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.n0.size(); i3++) {
            if (!((nz5) this.n0.get(i3)).d()) {
                this.y0 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.q0.size(); i4++) {
            if (!((vz5) this.q0.get(i4)).d()) {
                this.y0 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.r0.size(); i5++) {
            if (!((vz5) this.r0.get(i5)).d()) {
                this.y0 = (byte) 0;
                return false;
            }
        }
        if ((this.Z & 128) == 128 && !this.s0.d()) {
            this.y0 = (byte) 0;
            return false;
        }
        if ((this.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 && !this.u0.d()) {
            this.y0 = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.v0.size(); i6++) {
            if (!((gy5) this.v0.get(i6)).d()) {
                this.y0 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.w0.size(); i7++) {
            if (!((cy5) this.w0.get(i7)).d()) {
                this.y0 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.x0.size(); i8++) {
            if (!((cy5) this.x0.get(i8)).d()) {
                this.y0 = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.y0 = (byte) 1;
            return true;
        }
        this.y0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        uy5 uy5VarH = uy5.h();
        uy5VarH.i(this);
        return uy5VarH;
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
        for (int i2 = 0; i2 < this.r0.size(); i2++) {
            nv0Var.X(6, (d2) this.r0.get(i2));
        }
        if ((this.Z & 16) == 16) {
            nv0Var.V(7, this.j0);
        }
        if ((this.Z & 64) == 64) {
            nv0Var.V(8, this.m0);
        }
        if ((this.Z & 1) == 1) {
            nv0Var.V(9, this.f0);
        }
        for (int i3 = 0; i3 < this.n0.size(); i3++) {
            nv0Var.X(10, (d2) this.n0.get(i3));
        }
        if (this.o0.size() > 0) {
            nv0Var.e0(90);
            nv0Var.e0(this.p0);
        }
        for (int i4 = 0; i4 < this.o0.size(); i4++) {
            nv0Var.W(((Integer) this.o0.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.w0.size(); i5++) {
            nv0Var.X(12, (d2) this.w0.get(i5));
        }
        for (int i6 = 0; i6 < this.q0.size(); i6++) {
            nv0Var.X(13, (d2) this.q0.get(i6));
        }
        if ((this.Z & 128) == 128) {
            nv0Var.X(30, this.s0);
        }
        for (int i7 = 0; i7 < this.t0.size(); i7++) {
            nv0Var.V(31, ((Integer) this.t0.get(i7)).intValue());
        }
        if ((this.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            nv0Var.X(32, this.u0);
        }
        for (int i8 = 0; i8 < this.v0.size(); i8++) {
            nv0Var.X(33, (d2) this.v0.get(i8));
        }
        for (int i9 = 0; i9 < this.x0.size(); i9++) {
            nv0Var.X(34, (d2) this.x0.get(i9));
        }
        mj0Var.b0(19000, nv0Var);
        nv0Var.a0(this.Y);
    }

    public final void p() {
        this.f0 = 6;
        this.g0 = 6;
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
        this.r0 = list;
        this.s0 = tz5.i0;
        this.t0 = list;
        this.u0 = ky5.g0;
        this.v0 = list;
        this.w0 = list;
        this.x0 = list;
    }

    public vy5() {
        this.p0 = -1;
        this.y0 = (byte) -1;
        this.z0 = -1;
        this.Y = jb0.X;
    }

    public vy5(uy5 uy5Var) {
        super(uy5Var);
        this.p0 = -1;
        this.y0 = (byte) -1;
        this.z0 = -1;
        this.Y = uy5Var.X;
    }
}
