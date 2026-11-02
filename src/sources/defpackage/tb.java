package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tb extends jx4 implements n80, w07, gx3, g34, ye8 {
    public final y0 q0 = new y0((Object) this, (byte) 5);
    public final /* synthetic */ AndroidComposeView r0;

    public tb(AndroidComposeView androidComposeView) {
        this.r0 = androidComposeView;
    }

    @Override // defpackage.gx3
    public final boolean F(KeyEvent keyEvent) {
        ug2 ug2Var;
        int[] iArr = ah2.a;
        long jN = w39.N(keyEvent);
        byte b = 4;
        if (ax3.a(jN, ax3.b)) {
            ug2Var = new ug2(2);
        } else if (ax3.a(jN, ax3.c)) {
            ug2Var = new ug2(1);
        } else if (ax3.a(jN, ax3.p)) {
            ug2Var = new ug2(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (ax3.a(jN, ax3.g)) {
            ug2Var = new ug2(4);
        } else if (ax3.a(jN, ax3.f)) {
            ug2Var = new ug2(3);
        } else if (ax3.a(jN, ax3.d) || ax3.a(jN, ax3.C)) {
            ug2Var = new ug2(5);
        } else if (ax3.a(jN, ax3.e) || ax3.a(jN, ax3.D)) {
            ug2Var = new ug2(6);
        } else if (ax3.a(jN, ax3.h) || ax3.a(jN, ax3.r) || ax3.a(jN, ax3.E)) {
            ug2Var = new ug2(7);
        } else {
            ug2Var = (ax3.a(jN, ax3.a) || ax3.a(jN, ax3.u)) ? new ug2(8) : null;
        }
        if (ug2Var != null) {
            int i = ug2Var.a;
            if (w39.S(keyEvent) == 2) {
                AndroidComposeView androidComposeView = this.r0;
                ((gh2) androidComposeView.getFocusOwner()).f();
                Boolean boolE = ((gh2) androidComposeView.getFocusOwner()).e(i, androidComposeView.getEmbeddedViewFocusRect(), new y0(ug2Var, b));
                if (boolE == null) {
                    return true;
                }
                if (boolE.booleanValue()) {
                    androidComposeView.getPlayNavigationSoundEffect().K(ug2Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (i != 1 && i != 2) {
                    return false;
                }
                Integer numB = ah2.b(i);
                int iIntValue = numB != null ? numB.intValue() : 2;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = androidComposeView.getRootView();
                rootView.getClass();
                View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, androidComposeView.getView(), iIntValue);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(androidComposeView)) {
                    return ((gh2) androidComposeView.getFocusOwner()).h(i);
                }
            }
        }
        return false;
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        eo5 eo5VarO = tr4Var.o(j);
        return zr4Var.u(eo5VarO.X, eo5VarO.Y, e02.X, this.q0, new d1(eo5VarO, (byte) 1));
    }

    @Override // defpackage.n80
    public final Object T(i55 i55Var, p5 p5Var, s51 s51Var) {
        long jI = i55Var.I(0L);
        s86 s86Var = (s86) p5Var.invoke();
        s86 s86VarK = s86Var != null ? s86Var.k(jI) : null;
        if (s86VarK != null) {
            this.r0.requestRectangleOnScreen(new Rect((int) s86VarK.a, (int) s86VarK.b, (int) s86VarK.c, (int) s86VarK.d), false);
        }
        return dn8.a;
    }

    @Override // defpackage.gx3
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ye8
    public final Object o() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
    }
}
