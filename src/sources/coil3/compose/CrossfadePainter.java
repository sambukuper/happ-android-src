package coil3.compose;

import defpackage.g60;
import defpackage.gx1;
import defpackage.ka8;
import defpackage.og5;
import defpackage.oh5;
import defpackage.qx0;
import defpackage.sv1;
import defpackage.ua7;
import defpackage.wl6;
import defpackage.x97;
import defpackage.yx4;
import defpackage.z41;
import defpackage.z68;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/CrossfadePainter;", "Log5;", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CrossfadePainter extends og5 {
    public final og5 h0;
    public final z41 i0;
    public final long j0;
    public final boolean k0;
    public qx0 m0;
    public boolean n0;
    public g60 p0;
    public og5 q0;
    public final long r0;
    public final oh5 l0 = new oh5(0);
    public float o0 = 1.0f;

    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    public CrossfadePainter(og5 og5Var, og5 og5Var2, z41 z41Var, long j, boolean z, boolean z2) {
        this.h0 = og5Var2;
        this.i0 = z41Var;
        this.j0 = j;
        this.k0 = z;
        this.q0 = og5Var;
        long r0 = og5Var != null ? og5Var.getR0() : 0L;
        long r1 = og5Var2 != null ? og5Var2.getR0() : 0L;
        boolean z3 = r0 != 9205357640488583168L;
        boolean z4 = r1 != 9205357640488583168L;
        if (z2) {
            if (z4) {
                r0 = r1;
            } else if (!z3) {
                if (z3) {
                    r0 = 9205357640488583168L;
                } else {
                    r0 = 9205357640488583168L;
                }
            }
        } else if (z3 || !z4) {
            r0 = 9205357640488583168L;
        } else {
            r0 = (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (r0 >> 32)), Float.intBitsToFloat((int) (r1 >> 32))))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (r0 & 4294967295L)), Float.intBitsToFloat((int) (r1 & 4294967295L))))));
        }
        this.r0 = r0;
    }

    @Override // defpackage.og5
    public final boolean d(float f) {
        this.o0 = f;
        return true;
    }

    @Override // defpackage.og5
    public final boolean e(g60 g60Var) {
        this.p0 = g60Var;
        return true;
    }

    @Override // defpackage.og5
    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getR0() {
        return this.r0;
    }

    @Override // defpackage.og5
    public final void i(sv1 sv1Var) {
        boolean z = this.n0;
        og5 og5Var = this.h0;
        if (z) {
            j(sv1Var, og5Var, this.o0);
            return;
        }
        qx0 ka8Var = this.m0;
        if (ka8Var == null) {
            ka8Var = new ka8(yx4.a());
            this.m0 = ka8Var;
        }
        float fD = gx1.d(ka8.b(((ka8) ka8Var).X)) / gx1.d(this.j0);
        float fM = x97.m(fD, 0.0f, 1.0f);
        float f = this.o0;
        float f2 = fM * f;
        if (this.k0) {
            f -= f2;
        }
        this.n0 = fD >= 1.0f;
        j(sv1Var, this.q0, f);
        j(sv1Var, og5Var, f2);
        if (this.n0) {
            this.q0 = null;
        } else {
            oh5 oh5Var = this.l0;
            oh5Var.m(oh5Var.l() + 1);
        }
    }

    public final void j(sv1 sv1Var, og5 og5Var, float f) {
        if (og5Var == null || f <= 0.0f) {
            return;
        }
        long jE = sv1Var.e();
        long r0 = og5Var.getR0();
        long jJ0 = (r0 == 9205357640488583168L || ua7.e(r0) || jE == 9205357640488583168L || ua7.e(jE)) ? jE : z68.J0(r0, this.i0.b(r0, jE));
        if (jE == 9205357640488583168L || ua7.e(jE)) {
            og5Var.g(sv1Var, jJ0, f, this.p0);
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jE >> 32)) - Float.intBitsToFloat((int) (jJ0 >> 32))) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jE & 4294967295L)) - Float.intBitsToFloat((int) (jJ0 & 4294967295L))) / 2.0f;
        ((wl6) sv1Var.n0().Y).Q(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            og5Var.g(sv1Var, jJ0, f, this.p0);
        } finally {
            float f2 = -fIntBitsToFloat;
            float f3 = -fIntBitsToFloat2;
            ((wl6) sv1Var.n0().Y).Q(f2, f3, f2, f3);
        }
    }
}
