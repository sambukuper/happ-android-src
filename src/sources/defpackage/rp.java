package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rp implements Window.Callback {
    public final Window.Callback X;
    public qb8 Y;
    public boolean Z;
    public boolean f0;
    public boolean g0;
    public final /* synthetic */ wp h0;

    public rp(wp wpVar, Window.Callback callback) {
        this.h0 = wpVar;
        if (callback != null) {
            this.X = callback;
        } else {
            bt.q("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.Z = true;
            callback.onContentChanged();
        } finally {
            this.Z = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.X.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.X.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        this.X.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.X.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f0;
        Window.Callback callback = this.X;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.h0.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.X.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            wp wpVar = this.h0;
            wpVar.z();
            u70 u70Var = wpVar.p0;
            if (u70Var == null || !u70Var.b0(keyCode, keyEvent)) {
                vp vpVar = wpVar.M0;
                if (vpVar == null || !wpVar.F(vpVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (wpVar.M0 == null) {
                        vp vpVarY = wpVar.y(0);
                        wpVar.G(vpVarY, keyEvent);
                        boolean zF = wpVar.F(vpVarY, keyEvent.getKeyCode(), keyEvent);
                        vpVarY.k = false;
                        if (zF) {
                        }
                    }
                    return false;
                }
                vp vpVar2 = wpVar.M0;
                if (vpVar2 != null) {
                    vpVar2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.X.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.X.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.X.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.X.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.X.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.X.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.Z) {
            this.X.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof nt4)) {
            return this.X.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        qb8 qb8Var = this.Y;
        if (qb8Var != null) {
            View view = i == 0 ? new View(qb8Var.a.g.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.X.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.X.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.X.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            wp wpVar = this.h0;
            wpVar.z();
            u70 u70Var = wpVar.p0;
            if (u70Var != null) {
                u70Var.H(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.g0) {
            this.X.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        wp wpVar = this.h0;
        if (i == 108) {
            wpVar.z();
            u70 u70Var = wpVar.p0;
            if (u70Var != null) {
                u70Var.H(false);
                return;
            }
            return;
        }
        if (i == 0) {
            vp vpVarY = wpVar.y(i);
            if (vpVarY.m) {
                wpVar.r(vpVarY, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        gw8.f(this.X, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        nt4 nt4Var = menu instanceof nt4 ? (nt4) menu : null;
        if (i == 0 && nt4Var == null) {
            return false;
        }
        if (nt4Var != null) {
            nt4Var.x = true;
        }
        qb8 qb8Var = this.Y;
        if (qb8Var != null && i == 0) {
            sb8 sb8Var = qb8Var.a;
            if (!sb8Var.j) {
                sb8Var.g.l = true;
                sb8Var.j = true;
            }
        }
        boolean zOnPreparePanel = this.X.onPreparePanel(i, view, menu);
        if (nt4Var != null) {
            nt4Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        nt4 nt4Var = this.h0.y(0).h;
        if (nt4Var != null) {
            d(list, nt4Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.X.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.X.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.X.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        wp wpVar = this.h0;
        Context context = wpVar.m0;
        if (i != 0) {
            return this.X.onWindowStartingActionMode(callback, i);
        }
        yr6 yr6Var = new yr6(context, callback);
        l5 l5Var = wpVar.v0;
        if (l5Var != null) {
            l5Var.b();
        }
        dq dqVar = new dq(wpVar, yr6Var);
        wpVar.z();
        u70 u70Var = wpVar.p0;
        if (u70Var != null) {
            wpVar.v0 = u70Var.r0(dqVar);
        }
        if (wpVar.v0 == null) {
            qx8 qx8Var = wpVar.z0;
            if (qx8Var != null) {
                qx8Var.b();
            }
            l5 l5Var2 = wpVar.v0;
            if (l5Var2 != null) {
                l5Var2.b();
            }
            if (wpVar.w0 == null) {
                if (wpVar.I0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(w26.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        n51 n51Var = new n51(context, 0);
                        n51Var.getTheme().setTo(themeNewTheme);
                        context = n51Var;
                    }
                    wpVar.w0 = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, w26.actionModePopupWindowStyle);
                    wpVar.x0 = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    wpVar.x0.setContentView(wpVar.w0);
                    wpVar.x0.setWidth(-1);
                    context.getTheme().resolveAttribute(w26.actionBarSize, typedValue, true);
                    wpVar.w0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    wpVar.x0.setHeight(-2);
                    wpVar.y0 = new np(wpVar, (byte) 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) wpVar.B0.findViewById(d46.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        wpVar.z();
                        u70 u70Var2 = wpVar.p0;
                        Context contextU = u70Var2 != null ? u70Var2.U() : null;
                        if (contextU != null) {
                            context = contextU;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        wpVar.w0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (wpVar.w0 != null) {
                qx8 qx8Var2 = wpVar.z0;
                if (qx8Var2 != null) {
                    qx8Var2.b();
                }
                wpVar.w0.e();
                Context context2 = wpVar.w0.getContext();
                ActionBarContextView actionBarContextView = wpVar.w0;
                ng7 ng7Var = new ng7();
                ng7Var.f0 = context2;
                ng7Var.g0 = actionBarContextView;
                ng7Var.h0 = dqVar;
                nt4 nt4Var = new nt4(actionBarContextView.getContext());
                nt4Var.l = true;
                ng7Var.k0 = nt4Var;
                nt4Var.e = ng7Var;
                if (((yr6) dqVar.Y).k(ng7Var, nt4Var)) {
                    ng7Var.i();
                    wpVar.w0.c(ng7Var);
                    wpVar.v0 = ng7Var;
                    boolean z = wpVar.A0 && (viewGroup = wpVar.B0) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = wpVar.w0;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        qx8 qx8VarA = cw8.a(wpVar.w0);
                        qx8VarA.a(1.0f);
                        wpVar.z0 = qx8VarA;
                        qx8VarA.d(new qp(wpVar, (byte) 1));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        wpVar.w0.setVisibility(0);
                        if (wpVar.w0.getParent() instanceof View) {
                            View view = (View) wpVar.w0.getParent();
                            WeakHashMap weakHashMap = cw8.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (wpVar.x0 != null) {
                        wpVar.n0.getDecorView().post(wpVar.y0);
                    }
                } else {
                    wpVar.v0 = null;
                }
            }
            wpVar.I();
            wpVar.v0 = wpVar.v0;
        }
        wpVar.I();
        l5 l5Var3 = wpVar.v0;
        if (l5Var3 != null) {
            return yr6Var.e(l5Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.X.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
