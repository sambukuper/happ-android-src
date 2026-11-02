package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.tistory.zladnrms.roundablelayout.RoundableLayout;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 implements ov8 {
    public final /* synthetic */ byte X = 0;
    public final Object Y;
    public final Object Z;
    public final Object f0;
    public final Object g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;
    public final Object o0;
    public final Object p0;
    public final Object q0;
    public final Object r0;

    public c6(ve4 ve4Var, lr5 lr5Var, y45 y45Var, zl1 zl1Var, g55 g55Var, lr5 lr5Var2, qe4 qe4Var, wx4 wx4Var, hc6 hc6Var, mm mmVar, we5 we5Var, p45 p45Var, o8 o8Var, ra raVar) {
        a08.H.getClass();
        p45Var.getClass();
        ra raVar2 = zz7.b;
        raVar2.getClass();
        this.f0 = ve4Var;
        this.Y = lr5Var;
        this.i0 = y45Var;
        this.j0 = zl1Var;
        this.k0 = g55Var;
        this.l0 = lr5Var2;
        this.m0 = qe4Var;
        this.n0 = wx4Var;
        this.o0 = hc6Var;
        this.p0 = mmVar;
        this.q0 = we5Var;
        this.Z = p45Var;
        this.g0 = o8Var;
        this.h0 = raVar;
        this.r0 = raVar2;
    }

    @Override // defpackage.ov8
    public View getRoot() {
        switch (this.X) {
            case 0:
                return (RelativeLayout) this.f0;
            default:
                return (RoundableLayout) this.i0;
        }
    }

    public c6(RoundableLayout roundableLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, View view, RoundableLayout roundableLayout2, AppCompatImageView appCompatImageView, HappTextView happTextView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, MaterialCheckBox materialCheckBox, RelativeLayout relativeLayout3, HappTextView happTextView2, AppCompatImageView appCompatImageView2, CircularProgressIndicator circularProgressIndicator, HappTextView happTextView3) {
        this.i0 = roundableLayout;
        this.j0 = constraintLayout;
        this.k0 = frameLayout;
        this.Y = view;
        this.l0 = roundableLayout2;
        this.m0 = appCompatImageView;
        this.Z = happTextView;
        this.f0 = relativeLayout;
        this.n0 = relativeLayout2;
        this.o0 = materialCheckBox;
        this.p0 = relativeLayout3;
        this.g0 = happTextView2;
        this.q0 = appCompatImageView2;
        this.r0 = circularProgressIndicator;
        this.h0 = happTextView3;
    }

    public c6(RelativeLayout relativeLayout, View view, View view2, View view3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ProgressBar progressBar, View view4, HappSnackbarHost happSnackbarHost, Toolbar toolbar, HappTextView happTextView, HappTextView happTextView2, HappTextView happTextView3, HappTextView happTextView4) {
        this.f0 = relativeLayout;
        this.Y = view;
        this.i0 = view2;
        this.j0 = view3;
        this.l0 = linearLayout;
        this.m0 = linearLayout2;
        this.n0 = linearLayout3;
        this.o0 = progressBar;
        this.k0 = view4;
        this.p0 = happSnackbarHost;
        this.q0 = toolbar;
        this.Z = happTextView;
        this.g0 = happTextView2;
        this.h0 = happTextView3;
        this.r0 = happTextView4;
    }
}
