package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sg7 extends bu4 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int x0 = u46.abc_popup_menu_item_layout;
    public final Context Y;
    public final nt4 Z;
    public final kt4 f0;
    public final boolean g0;
    public final int h0;
    public final int i0;
    public final int j0;
    public final b k0;
    public PopupWindow.OnDismissListener n0;
    public View o0;
    public View p0;
    public hu4 q0;
    public ViewTreeObserver r0;
    public boolean s0;
    public boolean t0;
    public int u0;
    public boolean w0;
    public final gq l0 = new gq(this, 3);
    public final ge m0 = new ge(this, 6);
    public int v0 = 0;

    public sg7(int i, int i2, nt4 nt4Var, Context context, View view, boolean z) {
        this.Y = context;
        this.Z = nt4Var;
        this.g0 = z;
        this.f0 = new kt4(nt4Var, LayoutInflater.from(context), z, x0);
        this.i0 = i;
        this.j0 = i2;
        Resources resources = context.getResources();
        this.h0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(l36.abc_config_prefDialogWidth));
        this.o0 = view;
        this.k0 = new b(context, null, i, i2);
        nt4Var.b(this, context);
    }

    @Override // defpackage.v87
    public final boolean a() {
        return !this.s0 && this.k0.B0.isShowing();
    }

    @Override // defpackage.iu4
    public final void b(nt4 nt4Var, boolean z) {
        if (nt4Var != this.Z) {
            return;
        }
        dismiss();
        hu4 hu4Var = this.q0;
        if (hu4Var != null) {
            hu4Var.b(nt4Var, z);
        }
    }

    @Override // defpackage.iu4
    public final boolean c(gn7 gn7Var) {
        boolean z;
        if (gn7Var.hasVisibleItems()) {
            du4 du4Var = new du4(this.i0, this.j0, gn7Var, this.Y, this.p0, this.g0);
            hu4 hu4Var = this.q0;
            du4Var.i = hu4Var;
            bu4 bu4Var = du4Var.j;
            if (bu4Var != null) {
                bu4Var.g(hu4Var);
            }
            int size = gn7Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = gn7Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            du4Var.h = z;
            bu4 bu4Var2 = du4Var.j;
            if (bu4Var2 != null) {
                bu4Var2.o(z);
            }
            du4Var.k = this.n0;
            this.n0 = null;
            this.Z.c(false);
            b bVar = this.k0;
            int width = bVar.h0;
            int iO = bVar.o();
            if ((Gravity.getAbsoluteGravity(this.v0, this.o0.getLayoutDirection()) & 7) == 5) {
                width += this.o0.getWidth();
            }
            if (!du4Var.b()) {
                if (du4Var.f != null) {
                    du4Var.d(width, iO, true, true);
                }
            }
            hu4 hu4Var2 = this.q0;
            if (hu4Var2 != null) {
                hu4Var2.N(gn7Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.iu4
    public final boolean d() {
        return false;
    }

    @Override // defpackage.v87
    public final void dismiss() {
        if (a()) {
            this.k0.dismiss();
        }
    }

    @Override // defpackage.v87
    public final void f() {
        View view;
        if (a()) {
            return;
        }
        if (this.s0 || (view = this.o0) == null) {
            bt.i("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.p0 = view;
        b bVar = this.k0;
        PopupWindow popupWindow = bVar.B0;
        PopupWindow popupWindow2 = bVar.B0;
        popupWindow.setOnDismissListener(this);
        bVar.r0 = this;
        bVar.A0 = true;
        popupWindow2.setFocusable(true);
        View view2 = this.p0;
        boolean z = this.r0 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.r0 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.l0);
        }
        view2.addOnAttachStateChangeListener(this.m0);
        bVar.q0 = view2;
        bVar.n0 = this.v0;
        boolean z2 = this.t0;
        Context context = this.Y;
        kt4 kt4Var = this.f0;
        if (!z2) {
            this.u0 = bu4.m(kt4Var, context, this.h0);
            this.t0 = true;
        }
        bVar.r(this.u0);
        popupWindow2.setInputMethodMode(2);
        Rect rect = this.X;
        bVar.z0 = rect != null ? new Rect(rect) : null;
        bVar.f();
        qw1 qw1Var = bVar.Z;
        qw1Var.setOnKeyListener(this);
        if (this.w0) {
            nt4 nt4Var = this.Z;
            if (nt4Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(u46.abc_popup_menu_header_item_layout, (ViewGroup) qw1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(nt4Var.m);
                }
                frameLayout.setEnabled(false);
                qw1Var.addHeaderView(frameLayout, null, false);
            }
        }
        bVar.p(kt4Var);
        bVar.f();
    }

    @Override // defpackage.iu4
    public final void g(hu4 hu4Var) {
        this.q0 = hu4Var;
    }

    @Override // defpackage.iu4
    public final void i() {
        this.t0 = false;
        kt4 kt4Var = this.f0;
        if (kt4Var != null) {
            kt4Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.v87
    public final qw1 j() {
        return this.k0.Z;
    }

    @Override // defpackage.bu4
    public final void n(View view) {
        this.o0 = view;
    }

    @Override // defpackage.bu4
    public final void o(boolean z) {
        this.f0.Z = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.s0 = true;
        this.Z.c(true);
        ViewTreeObserver viewTreeObserver = this.r0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.r0 = this.p0.getViewTreeObserver();
            }
            this.r0.removeGlobalOnLayoutListener(this.l0);
            this.r0 = null;
        }
        this.p0.removeOnAttachStateChangeListener(this.m0);
        PopupWindow.OnDismissListener onDismissListener = this.n0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.bu4
    public final void p(int i) {
        this.v0 = i;
    }

    @Override // defpackage.bu4
    public final void q(int i) {
        this.k0.h0 = i;
    }

    @Override // defpackage.bu4
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.n0 = onDismissListener;
    }

    @Override // defpackage.bu4
    public final void s(boolean z) {
        this.w0 = z;
    }

    @Override // defpackage.bu4
    public final void t(int i) {
        this.k0.l(i);
    }
}
