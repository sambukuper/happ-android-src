package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mz5 extends xp2 {
    public int f0;
    public List g0;
    public boolean h0;
    public int i0;
    public nz5 j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public nz5 p0;
    public int q0;
    public nz5 r0;
    public int s0;
    public int t0;
    public List u0;

    public static mz5 h() {
        mz5 mz5Var = new mz5();
        List list = Collections.EMPTY_LIST;
        mz5Var.g0 = list;
        nz5 nz5Var = nz5.w0;
        mz5Var.j0 = nz5Var;
        mz5Var.p0 = nz5Var;
        mz5Var.r0 = nz5Var;
        mz5Var.u0 = list;
        return mz5Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        nz5 nz5VarG = g();
        if (nz5VarG.d()) {
            return nz5VarG;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        nz5 nz5Var = null;
        try {
            try {
                nz5.x0.getClass();
                i(new nz5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                nz5 nz5Var2 = (nz5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    nz5Var = nz5Var2;
                    if (nz5Var != null) {
                        i(nz5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (nz5Var != null) {
                i(nz5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        mz5 mz5VarH = h();
        mz5VarH.i(g());
        return mz5VarH;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        i((nz5) bq2Var);
        return this;
    }

    public final nz5 g() {
        int i;
        nz5 nz5Var = new nz5(this);
        int i2 = this.f0;
        if ((i2 & 1) == 1) {
            this.g0 = Collections.unmodifiableList(this.g0);
            i = this.f0 & (-2);
            this.f0 = i;
        } else {
            i = i2;
        }
        nz5Var.f0 = this.g0;
        int i3 = (i2 & 2) != 2 ? 0 : 1;
        nz5Var.g0 = this.h0;
        if ((i2 & 4) == 4) {
            i3 |= 2;
        }
        nz5Var.h0 = this.i0;
        if ((i2 & 8) == 8) {
            i3 |= 4;
        }
        nz5Var.i0 = this.j0;
        if ((i2 & 16) == 16) {
            i3 |= 8;
        }
        nz5Var.j0 = this.k0;
        if ((i2 & 32) == 32) {
            i3 |= 16;
        }
        nz5Var.k0 = this.l0;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        nz5Var.l0 = this.m0;
        if ((i2 & 128) == 128) {
            i3 |= 64;
        }
        nz5Var.m0 = this.n0;
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            i3 |= 128;
        }
        nz5Var.n0 = this.o0;
        if ((i2 & 512) == 512) {
            i3 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        nz5Var.o0 = this.p0;
        if ((i2 & 1024) == 1024) {
            i3 |= 512;
        }
        nz5Var.p0 = this.q0;
        if ((i2 & 2048) == 2048) {
            i3 |= 1024;
        }
        nz5Var.q0 = this.r0;
        if ((i2 & 4096) == 4096) {
            i3 |= 2048;
        }
        nz5Var.r0 = this.s0;
        if ((i2 & 8192) == 8192) {
            i3 |= 4096;
        }
        nz5Var.s0 = this.t0;
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
            this.u0 = Collections.unmodifiableList(this.u0);
            this.f0 &= -16385;
        }
        nz5Var.t0 = this.u0;
        nz5Var.Z = i3;
        return nz5Var;
    }

    public final mz5 i(nz5 nz5Var) {
        nz5 nz5Var2;
        nz5 nz5Var3;
        nz5 nz5Var4;
        nz5 nz5Var5 = nz5.w0;
        if (nz5Var == nz5Var5) {
            return this;
        }
        if (!nz5Var.f0.isEmpty()) {
            if (this.g0.isEmpty()) {
                this.g0 = nz5Var.f0;
                this.f0 &= -2;
            } else {
                if ((this.f0 & 1) != 1) {
                    this.g0 = new ArrayList(this.g0);
                    this.f0 |= 1;
                }
                this.g0.addAll(nz5Var.f0);
            }
        }
        int i = nz5Var.Z;
        if ((i & 1) == 1) {
            boolean z = nz5Var.g0;
            this.f0 |= 2;
            this.h0 = z;
        }
        if ((i & 2) == 2) {
            int i2 = nz5Var.h0;
            this.f0 |= 4;
            this.i0 = i2;
        }
        if ((i & 4) == 4) {
            nz5 nz5Var6 = nz5Var.i0;
            if ((this.f0 & 8) != 8 || (nz5Var4 = this.j0) == nz5Var5) {
                this.j0 = nz5Var6;
            } else {
                mz5 mz5VarR = nz5.r(nz5Var4);
                mz5VarR.i(nz5Var6);
                this.j0 = mz5VarR.g();
            }
            this.f0 |= 8;
        }
        if ((nz5Var.Z & 8) == 8) {
            int i3 = nz5Var.j0;
            this.f0 |= 16;
            this.k0 = i3;
        }
        if (nz5Var.p()) {
            int i4 = nz5Var.k0;
            this.f0 |= 32;
            this.l0 = i4;
        }
        int i5 = nz5Var.Z;
        if ((i5 & 32) == 32) {
            int i6 = nz5Var.l0;
            this.f0 |= 64;
            this.m0 = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = nz5Var.m0;
            this.f0 |= 128;
            this.n0 = i7;
        }
        if ((i5 & 128) == 128) {
            int i8 = nz5Var.n0;
            this.f0 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            this.o0 = i8;
        }
        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            nz5 nz5Var7 = nz5Var.o0;
            if ((this.f0 & 512) != 512 || (nz5Var3 = this.p0) == nz5Var5) {
                this.p0 = nz5Var7;
            } else {
                mz5 mz5VarR2 = nz5.r(nz5Var3);
                mz5VarR2.i(nz5Var7);
                this.p0 = mz5VarR2.g();
            }
            this.f0 |= 512;
        }
        int i9 = nz5Var.Z;
        if ((i9 & 512) == 512) {
            int i10 = nz5Var.p0;
            this.f0 |= 1024;
            this.q0 = i10;
        }
        if ((i9 & 1024) == 1024) {
            nz5 nz5Var8 = nz5Var.q0;
            if ((this.f0 & 2048) != 2048 || (nz5Var2 = this.r0) == nz5Var5) {
                this.r0 = nz5Var8;
            } else {
                mz5 mz5VarR3 = nz5.r(nz5Var2);
                mz5VarR3.i(nz5Var8);
                this.r0 = mz5VarR3.g();
            }
            this.f0 |= 2048;
        }
        int i11 = nz5Var.Z;
        if ((i11 & 2048) == 2048) {
            int i12 = nz5Var.r0;
            this.f0 |= 4096;
            this.s0 = i12;
        }
        if ((i11 & 4096) == 4096) {
            int i13 = nz5Var.s0;
            this.f0 |= 8192;
            this.t0 = i13;
        }
        if (!nz5Var.t0.isEmpty()) {
            if (this.u0.isEmpty()) {
                this.u0 = nz5Var.t0;
                this.f0 &= -16385;
            } else {
                if ((this.f0 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                    this.u0 = new ArrayList(this.u0);
                    this.f0 |= Http2.INITIAL_MAX_FRAME_SIZE;
                }
                this.u0.addAll(nz5Var.t0);
            }
        }
        f(nz5Var);
        this.X = this.X.b(nz5Var.Y);
        return this;
    }
}
