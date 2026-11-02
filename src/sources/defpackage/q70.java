package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q70 extends yp {
    public BottomSheetBehavior i0;
    public FrameLayout j0;
    public CoordinatorLayout k0;
    public FrameLayout l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public p70 p0;
    public boolean q0;
    public f63 r0;
    public o70 s0;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.i0 == null) {
            j();
        }
        super.cancel();
    }

    public final void j() {
        if (this.j0 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), s46.design_bottom_sheet_dialog, null);
            this.j0 = frameLayout;
            this.k0 = (CoordinatorLayout) this.j0.findViewById(c46.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.j0.findViewById(c46.design_bottom_sheet);
            this.l0 = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorD = BottomSheetBehavior.D(frameLayout2);
            this.i0 = bottomSheetBehaviorD;
            o70 o70Var = this.s0;
            ArrayList arrayList = bottomSheetBehaviorD.c0;
            if (!arrayList.contains(o70Var)) {
                arrayList.add(o70Var);
            }
            this.i0.L(this.m0);
            this.r0 = new f63(this.i0, this.l0);
        }
    }

    public final FrameLayout k(View view, int i, ViewGroup.LayoutParams layoutParams) {
        j();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.j0.findViewById(c46.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.q0) {
            FrameLayout frameLayout = this.j0;
            wl6 wl6Var = new wl6((Object) this, (byte) 14);
            WeakHashMap weakHashMap = cw8.a;
            uv8.c(frameLayout, wl6Var);
        }
        this.l0.removeAllViews();
        FrameLayout frameLayout2 = this.l0;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(c46.touch_outside).setOnClickListener(new y4(this, (byte) 2));
        cw8.n(this.l0, new r20(this, (byte) 1));
        this.l0.setOnTouchListener(new t20((byte) 1));
        return this.j0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.q0) {
                if (Color.alpha(Build.VERSION.SDK_INT < 35 ? window.getNavigationBarColor() : 0) < 255) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            FrameLayout frameLayout = this.j0;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.k0;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            xt7.f(window, !z);
            p70 p70Var = this.p0;
            if (p70Var != null) {
                p70Var.e(window);
            }
        }
        f63 f63Var = this.r0;
        if (f63Var == null) {
            return;
        }
        View view = (View) f63Var.f0;
        boolean z2 = this.m0;
        jq4 jq4Var = (jq4) f63Var.Y;
        if (z2) {
            if (jq4Var != null) {
                jq4Var.b((iq4) f63Var.Z, view, false);
            }
        } else if (jq4Var != null) {
            jq4Var.c(view);
        }
    }

    @Override // defpackage.yp, defpackage.py0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        jq4 jq4Var;
        p70 p70Var = this.p0;
        if (p70Var != null) {
            p70Var.e(null);
        }
        f63 f63Var = this.r0;
        if (f63Var == null || (jq4Var = (jq4) f63Var.Y) == null) {
            return;
        }
        jq4Var.c((View) f63Var.f0);
    }

    @Override // defpackage.py0, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.i0;
        if (bottomSheetBehavior == null || bottomSheetBehavior.P != 5) {
            return;
        }
        bottomSheetBehavior.N(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        f63 f63Var;
        super.setCancelable(z);
        if (this.m0 != z) {
            this.m0 = z;
            BottomSheetBehavior bottomSheetBehavior = this.i0;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.L(z);
            }
            if (getWindow() == null || (f63Var = this.r0) == null) {
                return;
            }
            View view = (View) f63Var.f0;
            boolean z2 = this.m0;
            jq4 jq4Var = (jq4) f63Var.Y;
            if (z2) {
                if (jq4Var != null) {
                    jq4Var.b((iq4) f63Var.Z, view, false);
                }
            } else if (jq4Var != null) {
                jq4Var.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.m0) {
            this.m0 = true;
        }
        this.n0 = z;
        this.o0 = true;
    }

    @Override // defpackage.yp, defpackage.py0, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(k(view, 0, null));
    }

    @Override // defpackage.yp, defpackage.py0, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(k(null, i, null));
    }

    @Override // defpackage.yp, defpackage.py0, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(k(view, 0, layoutParams));
    }
}
