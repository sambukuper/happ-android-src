package defpackage;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 extends py0 {
    public dn2 g0;
    public vn1 h0;
    public final View i0;
    public final un1 j0;
    public boolean k0;

    public oo1(dn2 dn2Var, vn1 vn1Var, View view, z24 z24Var, fi1 fi1Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), vn1Var.e ? l56.DialogWindowTheme : l56.FloatingDialogWindowTheme), 0);
        this.g0 = dn2Var;
        this.h0 = vn1Var;
        this.i0 = view;
        Window window = getWindow();
        if (window == null) {
            bt.i("Dialog has no window");
            throw null;
        }
        vn1 vn1Var2 = this.h0;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = vn1Var2.g;
            window2.setAttributes(attributes);
        }
        byte b = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        xt7.f(window, this.h0.e);
        window.setGravity(17);
        if (!this.h0.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                gn.a.a(attributes2);
            }
            if (i >= 30) {
                hn hnVar = hn.a;
                hnVar.b(attributes2, 0);
                hnVar.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        un1 un1Var = new un1(getContext(), window);
        setTitle(this.h0.f);
        un1Var.setTag(g46.compose_view_saveable_id_tag, "Dialog:" + uuid);
        un1Var.setClipChildren(false);
        un1Var.setElevation(fi1Var.h0(8.0f));
        un1Var.setOutlineProvider(new nu0((byte) 1));
        this.j0 = un1Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            g(viewGroup);
        }
        setContentView(un1Var);
        un1Var.setTag(v36.view_tree_lifecycle_owner, us7.b(view));
        un1Var.setTag(w36.view_tree_view_model_store_owner, gs8.j(view));
        un1Var.setTag(z36.view_tree_saved_state_registry_owner, ys7.d(view));
        i(this.g0, this.h0, z24Var);
        gv3.f(b(), this, new gd(this, b));
    }

    public static final void g(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof un1) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                g(viewGroup2);
            }
        }
    }

    public final void i(dn2 dn2Var, vn1 vn1Var, z24 z24Var) {
        int i;
        this.g0 = dn2Var;
        this.h0 = vn1Var;
        kz6 kz6Var = vn1Var.c;
        boolean zB = bg.b(this.i0);
        int iOrdinal = kz6Var.ordinal();
        int i2 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    b61.c();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = z24Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                b61.c();
                return;
            }
            i = 1;
        }
        un1 un1Var = this.j0;
        un1Var.setLayoutDirection(i);
        boolean z = vn1Var.e;
        boolean z2 = vn1Var.d;
        Window window2 = un1Var.p0;
        boolean z3 = (un1Var.t0 && z2 == un1Var.r0 && z == un1Var.s0) ? false : true;
        un1Var.r0 = z2;
        un1Var.s0 = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z2 ? -2 : -1;
            if (i3 != attributes.width || !un1Var.t0) {
                window2.setLayout(i3, -2);
                un1Var.t0 = true;
            }
        }
        setCanceledOnTouchOutside(vn1Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z) {
                i2 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i2);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.h0.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.g0.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iO;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.h0.b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.k0 = false;
            return zOnTouchEvent;
        }
        un1 un1Var = this.j0;
        un1Var.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = un1Var.getChildAt(0)) != null) {
            int left = childAt.getLeft() + un1Var.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + un1Var.getTop();
            int height = childAt.getHeight() + top;
            int iO2 = nr4.O(motionEvent.getX());
            if (left <= iO2 && iO2 <= width && top <= (iO = nr4.O(motionEvent.getY())) && iO <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.k0 = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.k0 = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.k0 = false;
                return zOnTouchEvent;
            }
        } else if (this.k0) {
            this.g0.invoke();
            this.k0 = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
