package androidx.compose.ui.graphics.shadow;

import defpackage.dq;
import defpackage.g60;
import defpackage.og5;
import defpackage.s05;
import defpackage.s67;
import defpackage.sg;
import defpackage.sv1;
import defpackage.tw1;
import defpackage.u70;
import defpackage.wl6;
import defpackage.x67;
import defpackage.x97;
import defpackage.z24;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "Log5;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DropShadowPainter extends og5 {
    public final x67 h0;
    public final s67 i0;
    public final dq j0;
    public float k0 = 1.0f;
    public g60 l0;

    public DropShadowPainter(x67 x67Var, s67 s67Var, dq dqVar) {
        this.h0 = x67Var;
        this.i0 = s67Var;
        this.j0 = dqVar;
    }

    @Override // defpackage.og5
    public final boolean d(float f) {
        this.k0 = f;
        return true;
    }

    @Override // defpackage.og5
    public final boolean e(g60 g60Var) {
        this.l0 = g60Var;
        return true;
    }

    @Override // defpackage.og5
    public final void i(sv1 sv1Var) {
        tw1 tw1Var;
        dq dqVar = this.j0;
        x67 x67Var = this.h0;
        long jE = sv1Var.e();
        z24 layoutDirection = sv1Var.getLayoutDirection();
        s67 s67Var = this.i0;
        synchronized (dqVar) {
            sg sgVar = (sg) dqVar.Z;
            if (sgVar == null) {
                sg sgVar2 = new sg(u70.e, 0L, z24.X, 1.0f, null);
                dqVar.Z = sgVar2;
                sgVar = sgVar2;
            }
            sgVar.a = x67Var;
            sgVar.b = jE;
            sgVar.c = layoutDirection;
            sgVar.d = sv1Var.getDensity();
            sgVar.e = new s67(s67Var.a, s67Var.b, s67Var.e, s67Var.c, s67Var.d);
            s05 s05Var = (s05) dqVar.Y;
            if (s05Var == null) {
                s05Var = new s05();
                dqVar.Y = s05Var;
            }
            tw1Var = (tw1) s05Var.g(sgVar);
            if (tw1Var == null) {
                tw1Var = new tw1(s67Var, x67Var.a(jE, layoutDirection, sv1Var));
                s05 s05Var2 = (s05) dqVar.Y;
                if (s05Var2 == null) {
                    s05Var2 = new s05();
                    dqVar.Y = s05Var2;
                }
                s05Var2.l(new sg(sgVar.a, sgVar.b, sgVar.c, sgVar.d, sgVar.e), tw1Var);
            }
        }
        this.i0.getClass();
        float fH0 = sv1Var.h0(Float.intBitsToFloat(0));
        this.i0.getClass();
        float fH1 = sv1Var.h0(Float.intBitsToFloat(0));
        ((wl6) sv1Var.n0().Y).V(fH0, fH1);
        try {
            g60 g60Var = this.l0;
            long jE2 = sv1Var.e();
            s67 s67Var2 = tw1Var.i;
            tw1Var.a(sv1Var, g60Var, jE2, s67Var2.d, x97.m(this.k0 * s67Var2.e, 0.0f, 1.0f), tw1Var.i.c);
        } finally {
            ((wl6) sv1Var.n0().Y).V(-fH0, -fH1);
        }
    }
}
