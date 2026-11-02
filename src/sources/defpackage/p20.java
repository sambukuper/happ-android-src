package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.b;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p20 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        if (i == 0) {
            v20 v20Var = (v20) message.obj;
            u20 u20Var = v20Var.i;
            if (u20Var.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = u20Var.getLayoutParams();
                if (layoutParams instanceof b) {
                    b bVar = (b) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = v20Var.t;
                    if (baseTransientBottomBar$Behavior == null) {
                        baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    }
                    yr2 yr2Var = baseTransientBottomBar$Behavior.i;
                    yr2Var.getClass();
                    yr2Var.Y = v20Var.v;
                    baseTransientBottomBar$Behavior.b = new wl6((Object) v20Var, (byte) 13);
                    CoordinatorLayout.Behavior behavior = bVar.a;
                    if (behavior != baseTransientBottomBar$Behavior) {
                        if (behavior != null) {
                            behavior.i();
                        }
                        bVar.a = baseTransientBottomBar$Behavior;
                        bVar.b = true;
                    }
                    bVar.g = 80;
                }
                ViewGroup viewGroup = v20Var.g;
                u20Var.p0 = true;
                viewGroup.addView(u20Var);
                u20Var.p0 = false;
                v20Var.f();
                u20Var.setVisibility(4);
            }
            if (u20Var.isLaidOut()) {
                v20Var.e();
                return true;
            }
            v20Var.r = true;
            return true;
        }
        if (i != 1) {
            return false;
        }
        v20 v20Var2 = (v20) message.obj;
        int i2 = message.arg1;
        u20 u20Var2 = v20Var2.i;
        AccessibilityManager accessibilityManager = v20Var2.u;
        if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || u20Var2.getVisibility() != 0) {
            v20Var2.c();
            return true;
        }
        if (u20Var2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setInterpolator(v20Var2.d);
            valueAnimatorOfFloat.addUpdateListener(new o20(v20Var2, (byte) 0));
            valueAnimatorOfFloat.setDuration(v20Var2.b);
            valueAnimatorOfFloat.addListener(new n20(v20Var2, i2, (byte) 0));
            valueAnimatorOfFloat.start();
            return true;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        u20 u20Var3 = v20Var2.i;
        int height = u20Var3.getHeight();
        ViewGroup.LayoutParams layoutParams2 = u20Var3.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        valueAnimator.setIntValues(0, height);
        valueAnimator.setInterpolator(v20Var2.e);
        valueAnimator.setDuration(v20Var2.c);
        valueAnimator.addListener(new n20(v20Var2, i2, (byte) 2));
        valueAnimator.addUpdateListener(new o20(v20Var2, (byte) 3));
        valueAnimator.start();
        return true;
    }
}
