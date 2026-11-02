package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y00 extends jx4 implements rv1, w85, w07 {
    public long q0;
    public d90 r0;
    public float s0;
    public x67 t0;
    public long u0;
    public z24 v0;
    public mb6 w0;
    public x67 x0;
    public mb6 y0;

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        d17.e(f17Var, this.t0);
    }

    @Override // defpackage.w07
    public final boolean k() {
        return false;
    }

    @Override // defpackage.w85
    public final void q0() {
        this.u0 = 9205357640488583168L;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        z68.W(this);
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        mb6 mb6Var;
        d90 d90Var;
        lf lfVar;
        um0 um0Var = p34Var.X;
        if (this.t0 == u70.e) {
            if (!tk8.a(this.q0, dw0.g)) {
                sv1.k0(p34Var, this.q0, 0L, 0L, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
            }
            d90 d90Var2 = this.r0;
            if (d90Var2 != null) {
                sv1.E0(p34Var, d90Var2, 0L, 0L, this.s0, null, 0, 118);
            }
        } else {
            if (ua7.a(um0Var.e(), this.u0) && p34Var.getLayoutDirection() == this.v0 && dh3.f(this.x0, this.t0)) {
                mb6Var = this.w0;
                mb6Var.getClass();
            } else {
                ch3.N(this, new p5(this, p34Var, (byte) 7));
                mb6Var = this.y0;
                this.y0 = null;
            }
            this.w0 = mb6Var;
            this.u0 = um0Var.e();
            this.v0 = p34Var.getLayoutDirection();
            this.x0 = this.t0;
            mb6Var.getClass();
            if (!tk8.a(this.q0, dw0.g)) {
                x97.u(p34Var, mb6Var, this.q0);
            }
            d90 d90Var3 = this.r0;
            if (d90Var3 != null) {
                float f = this.s0;
                boolean z = mb6Var instanceof ae5;
                ea2 ea2Var = ea2.a;
                if (z) {
                    s86 s86Var = ((ae5) mb6Var).j0;
                    float f2 = s86Var.a;
                    p34Var.Y(d90Var3, (4294967295L & ((long) Float.floatToRawIntBits(s86Var.b))) | (Float.floatToRawIntBits(f2) << 32), x97.V(s86Var), f, ea2Var, 3);
                } else {
                    if (mb6Var instanceof be5) {
                        be5 be5Var = (be5) mb6Var;
                        lfVar = be5Var.k0;
                        if (lfVar != null) {
                            d90Var = d90Var3;
                        } else {
                            d90Var = d90Var3;
                            em6 em6Var = be5Var.j0;
                            float f3 = em6Var.b;
                            float f4 = em6Var.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (em6Var.h >> 32));
                            p34Var.c(d90Var, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(em6Var.c - f4)) << 32) | (((long) Float.floatToRawIntBits(em6Var.d - f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f, ea2Var);
                        }
                    } else if (!(mb6Var instanceof zd5)) {
                        b61.c();
                        return;
                    } else {
                        d90Var = d90Var3;
                        lfVar = ((zd5) mb6Var).j0;
                    }
                    p34Var.i(lfVar, d90Var, f, ea2Var, 3);
                }
            }
        }
        p34Var.a();
    }
}
