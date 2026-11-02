package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.b;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.foundation.component.snackbar.HappSnackbarView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v20 {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final u20 i;
    public final HappSnackbarView j;
    public int k;
    public final q20 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public ArrayList s;
    public BaseTransientBottomBar$Behavior t;
    public final AccessibilityManager u;
    public final s20 v;
    public static final c82 w = rk.b;
    public static final LinearInterpolator x = rk.a;
    public static final c82 y = rk.d;
    public static final int[] A = {u26.snackbarStyle};
    public static final Handler z = new Handler(Looper.getMainLooper(), new p20());

    public v20(ViewGroup viewGroup, HappSnackbarView happSnackbarView, HappSnackbarView happSnackbarView2) {
        Context context = viewGroup.getContext();
        byte b = 0;
        this.l = new q20(this, b);
        this.v = new s20(this);
        this.g = viewGroup;
        this.j = happSnackbarView2;
        this.h = context;
        c98.c(context, c98.a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(A);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        u20 u20Var = (u20) layoutInflaterFrom.inflate(resourceId != -1 ? s46.mtrl_layout_snackbar : s46.design_layout_snackbar, viewGroup, false);
        this.i = u20Var;
        u20Var.setBaseTransientBottomBar(this);
        u20Var.addView(happSnackbarView);
        u20Var.setAccessibilityLiveRegion(1);
        u20Var.setImportantForAccessibility(1);
        u20Var.setFitsSystemWindows(true);
        yr2 yr2Var = new yr2((Object) this, (byte) 9);
        WeakHashMap weakHashMap = cw8.a;
        uv8.c(u20Var, yr2Var);
        cw8.n(u20Var, new r20(this, b));
        this.u = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = u70.g0(context, u26.motionDurationLong2, 250);
        this.a = u70.g0(context, u26.motionDurationLong2, 150);
        this.b = u70.g0(context, u26.motionDurationMedium1, 75);
        this.d = z39.D(context, u26.motionEasingEmphasizedInterpolator, x);
        this.f = z39.D(context, u26.motionEasingEmphasizedInterpolator, y);
        this.e = z39.D(context, u26.motionEasingEmphasizedInterpolator, w);
    }

    public final void a(int i) {
        yr6 yr6VarF = yr6.f();
        s20 s20Var = this.v;
        synchronized (yr6VarF.Y) {
            try {
                if (yr6VarF.h(s20Var)) {
                    yr6VarF.c((rc7) yr6VarF.f0, i);
                } else {
                    rc7 rc7Var = (rc7) yr6VarF.g0;
                    if ((rc7Var == null || s20Var == null || rc7Var.a.get() != s20Var) ? false : true) {
                        yr6VarF.c((rc7) yr6VarF.g0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.i.getRootWindowInsets()) == null) {
            return;
        }
        this.p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        f();
    }

    public final void c() {
        yr6 yr6VarF = yr6.f();
        s20 s20Var = this.v;
        synchronized (yr6VarF.Y) {
            try {
                if (yr6VarF.h(s20Var)) {
                    yr6VarF.f0 = null;
                    if (((rc7) yr6VarF.g0) != null) {
                        yr6VarF.p();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.s;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                yx2 yx2Var = (yx2) this.s.get(size);
                yx2Var.getClass();
                l00 l00Var = yx2Var.b;
                if (yx2Var.a) {
                    l00Var.f(false);
                    l00Var.e();
                } else {
                    BaseActivity baseActivity = yx2Var.c;
                    baseActivity.getWindow().setSoftInputMode(ue3.y(baseActivity) ? 1 : Build.VERSION.SDK_INT >= 30 ? 32 : 16);
                }
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void d() {
        yr6 yr6VarF = yr6.f();
        s20 s20Var = this.v;
        synchronized (yr6VarF.Y) {
            try {
                if (yr6VarF.h(s20Var)) {
                    yr6VarF.o((rc7) yr6VarF.f0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.s;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                yx2 yx2Var = (yx2) this.s.get(size);
                yx2Var.getClass();
                if (yx2Var.a) {
                    yx2Var.b.f(true);
                } else {
                    yx2Var.c.getWindow().setSoftInputMode(32);
                }
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.u;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        u20 u20Var = this.i;
        if (z2) {
            u20Var.post(new q20(this, (byte) 2));
            return;
        }
        if (u20Var.getParent() != null) {
            u20Var.setVisibility(0);
        }
        d();
    }

    public final void f() {
        u20 u20Var = this.i;
        ViewGroup.LayoutParams layoutParams = u20Var.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || u20Var.o0 == null || u20Var.getParent() == null) {
            return;
        }
        int i = this.m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = u20Var.o0;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.n;
        int i4 = rect.right + this.o;
        int i5 = rect.top;
        boolean z2 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z2) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            u20Var.requestLayout();
        }
        if ((z2 || this.q != this.p) && Build.VERSION.SDK_INT >= 29 && this.p > 0) {
            ViewGroup.LayoutParams layoutParams2 = u20Var.getLayoutParams();
            if ((layoutParams2 instanceof b) && (((b) layoutParams2).a instanceof SwipeDismissBehavior)) {
                q20 q20Var = this.l;
                u20Var.removeCallbacks(q20Var);
                u20Var.post(q20Var);
            }
        }
    }
}
