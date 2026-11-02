package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ir5 extends AbstractComposeView {
    public static final dx4 J0 = new dx4(25);
    public final rh5 A0;
    public lf3 B0;
    public final zi1 C0;
    public final Rect D0;
    public final xd7 E0;
    public kn F0;
    public final rh5 G0;
    public boolean H0;
    public final int[] I0;
    public dn2 p0;
    public or5 q0;
    public String r0;
    public final View s0;
    public final boolean t0;
    public final we5 u0;
    public final WindowManager v0;
    public final WindowManager.LayoutParams w0;
    public nr5 x0;
    public z24 y0;
    public final rh5 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir5(dn2 dn2Var, or5 or5Var, String str, View view, fi1 fi1Var, nr5 nr5Var, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        byte b = 5;
        we5 kr5Var = i >= 30 ? new kr5(b) : i >= 29 ? new jr5(b) : new we5(b);
        this.p0 = dn2Var;
        this.q0 = or5Var;
        this.r0 = str;
        this.s0 = view;
        this.t0 = z;
        this.u0 = kr5Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.v0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        or5 or5Var2 = this.q0;
        boolean zB = bg.b(view);
        boolean z2 = or5Var2.b;
        int i2 = or5Var2.a;
        if (z2 && zB) {
            i2 |= 8192;
        } else if (z2 && !zB) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.q0.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(b56.default_popup_window_title));
        this.w0 = layoutParams;
        this.x0 = nr5Var;
        this.y0 = z24.X;
        this.z0 = z51.H(null);
        this.A0 = z51.H(null);
        this.C0 = rd7.b(new hr5(this, (byte) 0));
        this.D0 = new Rect();
        this.E0 = new xd7(new uf(this, (byte) 2));
        setId(R.id.content);
        setTag(v36.view_tree_lifecycle_owner, us7.b(view));
        setTag(w36.view_tree_view_model_store_owner, gs8.j(view));
        setTag(z36.view_tree_saved_state_registry_owner, ys7.d(view));
        setTag(g46.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(fi1Var.h0(8.0f));
        setOutlineProvider(new nu0((byte) 3));
        this.G0 = z51.H(ci8.a);
        this.I0 = new int[2];
    }

    private final rn2 getContent() {
        return (rn2) this.G0.getValue();
    }

    private final lf3 getDisplayBounds() {
        int i = this.q0.a & 512;
        View view = this.s0;
        Rect rect = this.D0;
        we5 we5Var = this.u0;
        if (i == 0) {
            we5Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            we5Var.n(view, rect);
        }
        return new lf3(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final y24 getParentLayoutCoordinates() {
        return (y24) this.A0.getValue();
    }

    public static final boolean l(ir5 ir5Var) {
        y24 parentLayoutCoordinates = ir5Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.g()) {
            parentLayoutCoordinates = null;
        }
        return (parentLayoutCoordinates == null || ir5Var.m20getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    private final void setContent(rn2 rn2Var) {
        this.G0.setValue(rn2Var);
    }

    private final void setParentLayoutCoordinates(y24 y24Var) {
        this.A0.setValue(y24Var);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(int i, lp2 lp2Var) {
        lp2Var.X(-857613600);
        int i2 = (lp2Var.h(this) ? 4 : 2) | i;
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            getContent().K(lp2Var, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new b1(this, i, (byte) 15);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.q0.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                dn2 dn2Var = this.p0;
                if (dn2Var != null) {
                    dn2Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void g(int i, boolean z, int i2, int i3, int i4) {
        super.g(i, z, i2, i3, i4);
        this.q0.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.w0;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.u0.getClass();
        this.v0.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.C0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.w0;
    }

    public final z24 getParentLayoutDirection() {
        return this.y0;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final pf3 m20getPopupContentSizebOM6tXw() {
        return (pf3) this.z0.getValue();
    }

    public final nr5 getPositionProvider() {
        return this.x0;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.H0;
    }

    public final String getTestTag() {
        return this.r0;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void h(int i, int i2) {
        this.q0.getClass();
        lf3 displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    public final void m(m01 m01Var, rn2 rn2Var) {
        setParentCompositionContext(m01Var);
        setContent(rn2Var);
        this.H0 = true;
    }

    public final void n(dn2 dn2Var, or5 or5Var, String str, z24 z24Var) {
        int i;
        this.p0 = dn2Var;
        this.r0 = str;
        if (!dh3.f(this.q0, or5Var)) {
            or5Var.getClass();
            this.q0 = or5Var;
            boolean zB = bg.b(this.s0);
            boolean z = or5Var.b;
            int i2 = or5Var.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.w0;
            layoutParams.flags = i2;
            this.u0.getClass();
            this.v0.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = z24Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                b61.c();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void o() {
        y24 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.g()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long j = parentLayoutCoordinates.j();
            long jN = this.t0 ? parentLayoutCoordinates.n(0L) : parentLayoutCoordinates.b(0L);
            lf3 lf3VarB = os4.b((((long) Math.round(Float.intBitsToFloat((int) (jN >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jN & 4294967295L))))), j);
            if (lf3VarB.equals(this.B0)) {
                return;
            }
            this.B0 = lf3VarB;
            q();
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E0.d();
        if (!this.q0.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        kn knVar = this.F0;
        if (knVar == null) {
            kn knVar2 = new kn(this.p0, (byte) 0);
            this.F0 = knVar2;
            knVar = knVar2;
        }
        c4.w(this, knVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xd7 xd7Var = this.E0;
        o61 o61Var = xd7Var.h;
        if (o61Var != null) {
            o61Var.h();
        }
        xd7Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            c4.x(this, this.F0);
        }
        this.F0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.q0.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            dn2 dn2Var = this.p0;
            if (dn2Var != null) {
                dn2Var.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            dn2 dn2Var2 = this.p0;
            if (dn2Var2 != null) {
                dn2Var2.invoke();
            }
        }
        return true;
    }

    public final void p(y24 y24Var) {
        setParentLayoutCoordinates(y24Var);
        o();
    }

    public final void q() {
        pf3 pf3VarM20getPopupContentSizebOM6tXw;
        final lf3 lf3Var = this.B0;
        if (lf3Var == null || (pf3VarM20getPopupContentSizebOM6tXw = m20getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = pf3VarM20getPopupContentSizebOM6tXw.a;
        lf3 displayBounds = getDisplayBounds();
        final long jB = (((long) displayBounds.b()) & 4294967295L) | (((long) displayBounds.d()) << 32);
        final da6 da6Var = new da6();
        da6Var.X = 0L;
        this.E0.c(this, J0, new dn2() { // from class: gr5
            @Override // defpackage.dn2
            public final Object invoke() {
                ir5 ir5Var = this;
                da6Var.X = ir5Var.x0.x(lf3Var, jB, ir5Var.y0, j);
                return dn8.a;
            }
        });
        long j2 = da6Var.X;
        WindowManager.LayoutParams layoutParams = this.w0;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.q0.e;
        we5 we5Var = this.u0;
        if (z) {
            we5Var.o(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        we5Var.getClass();
        this.v0.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(z24 z24Var) {
        this.y0 = z24Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m21setPopupContentSizefhxjrPA(pf3 pf3Var) {
        this.z0.setValue(pf3Var);
    }

    public final void setPositionProvider(nr5 nr5Var) {
        this.x0 = nr5Var;
    }

    public final void setTestTag(String str) {
        this.r0 = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
