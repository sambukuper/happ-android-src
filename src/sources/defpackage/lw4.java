package defpackage;

import android.content.Context;
import android.view.Window;
import androidx.compose.ui.platform.AbstractComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lw4 extends AbstractComposeView implements no1 {
    public final Window p0;
    public final rh5 q0;
    public boolean r0;

    public lw4(Context context, Window window) {
        super(context);
        this.p0 = window;
        this.q0 = z51.H(dz0.a);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(int i, lp2 lp2Var) {
        lp2Var.X(576708319);
        int i2 = (lp2Var.h(this) ? 4 : 2) | i;
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            ((rn2) this.q0.getValue()).K(lp2Var, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new b1(this, i, (byte) 12);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.r0;
    }

    @Override // defpackage.no1
    public final Window getWindow() {
        return this.p0;
    }
}
