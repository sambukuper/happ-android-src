package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yw1 extends h12 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final st0 i;
    public final tt0 j;
    public final xw1 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [xw1] */
    public yw1(g12 g12Var) {
        super(g12Var);
        byte b = 1;
        this.i = new st0(this, b);
        this.j = new tt0(this, b);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: xw1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                yw1 yw1Var = this.X;
                AutoCompleteTextView autoCompleteTextView = yw1Var.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                yw1Var.d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = u70.g0(g12Var.getContext(), u26.motionDurationShort3, 67);
        this.e = u70.g0(g12Var.getContext(), u26.motionDurationShort3, 50);
        this.g = z39.D(g12Var.getContext(), u26.motionEasingLinearInterpolator, rk.a);
    }

    @Override // defpackage.h12
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && oc.u(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new c1(this, (byte) 17));
    }

    @Override // defpackage.h12
    public final int c() {
        return h56.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.h12
    public final int d() {
        return p36.mtrl_dropdown_arrow;
    }

    @Override // defpackage.h12
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.h12
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.h12
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.h12
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.h12
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.h12
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            kp5.t("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new vw1(this, (byte) 0));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ww1
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                yw1 yw1Var = this.a;
                yw1Var.m = true;
                yw1Var.o = SystemClock.uptimeMillis();
                yw1Var.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.h12
    public final void m(h4 h4Var) {
        if (!oc.u(this.h)) {
            h4Var.m(Spinner.class.getName());
        }
        if (h4Var.h()) {
            h4Var.r(null);
        }
    }

    @Override // defpackage.h12
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || oc.u(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            t();
            this.m = true;
            this.o = SystemClock.uptimeMillis();
        }
    }

    @Override // defpackage.h12
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        byte b = 1;
        valueAnimatorOfFloat.addUpdateListener(new nm1(this, b));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new nm1(this, b));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new z4((Object) this, (byte) 3));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.h12
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
