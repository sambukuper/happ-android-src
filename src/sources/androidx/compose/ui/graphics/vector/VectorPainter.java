package androidx.compose.ui.graphics.vector;

import defpackage.dn8;
import defpackage.g60;
import defpackage.lh4;
import defpackage.lr;
import defpackage.og5;
import defpackage.ou2;
import defpackage.p61;
import defpackage.rh5;
import defpackage.sv1;
import defpackage.tt8;
import defpackage.ua7;
import defpackage.v38;
import defpackage.wl6;
import defpackage.z24;
import defpackage.z51;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Log5;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VectorPainter extends og5 {
    public final rh5 h0 = z51.H(new ua7(0));
    public final rh5 i0 = z51.H(Boolean.FALSE);
    public final tt8 j0;
    public final rh5 k0;
    public float l0;
    public g60 m0;

    public VectorPainter(ou2 ou2Var) {
        tt8 tt8Var = new tt8(ou2Var);
        tt8Var.f = new v38((Object) this, (byte) 10);
        this.j0 = tt8Var;
        this.k0 = new rh5(dn8.a, lh4.i0);
        this.l0 = 1.0f;
    }

    @Override // defpackage.og5
    public final boolean d(float f) {
        this.l0 = f;
        return true;
    }

    @Override // defpackage.og5
    public final boolean e(g60 g60Var) {
        this.m0 = g60Var;
        return true;
    }

    @Override // defpackage.og5
    public final long h() {
        return ((ua7) this.h0.getValue()).a;
    }

    @Override // defpackage.og5
    public final void i(sv1 sv1Var) {
        g60 g60Var = this.m0;
        tt8 tt8Var = this.j0;
        if (g60Var == null) {
            g60Var = (g60) tt8Var.g.getValue();
        }
        if (((Boolean) this.i0.getValue()).booleanValue() && sv1Var.getLayoutDirection() == z24.Y) {
            long jA0 = sv1Var.A0();
            lr lrVarN0 = sv1Var.n0();
            long jP = lrVarN0.p();
            lrVarN0.k().g();
            try {
                ((wl6) lrVarN0.Y).U(-1.0f, 1.0f, jA0);
                tt8Var.e(sv1Var, this.l0, g60Var);
                p61.w(lrVarN0, jP);
            } catch (Throwable th) {
                p61.w(lrVarN0, jP);
                throw th;
            }
        } else {
            tt8Var.e(sv1Var, this.l0, g60Var);
        }
        this.k0.getValue();
    }
}
