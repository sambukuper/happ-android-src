package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AbstractComposeView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ge implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ ge(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                he heVar = (he) obj;
                Context context = view.getContext();
                if (!heVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(heVar.f);
                    heVar.d = true;
                }
                break;
            case 2:
                g12 g12Var = (g12) obj;
                AccessibilityManager accessibilityManager = g12Var.y0;
                if (g12Var.z0 != null && accessibilityManager != null && g12Var.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(g12Var.z0);
                    break;
                }
                break;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = cw8.a;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.X) {
            case 0:
                he heVar = (he) this.Y;
                Context context = view.getContext();
                if (heVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(heVar.f);
                    heVar.d = false;
                }
                dq dqVar = heVar.e;
                if (dqVar != null) {
                    synchronized (dqVar) {
                        try {
                            s05 s05Var = (s05) dqVar.Y;
                            if (s05Var != null) {
                                s05Var.a();
                            }
                            dqVar.Z = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                heVar.e = null;
                return;
            case 1:
                qo0 qo0Var = (qo0) this.Y;
                ViewTreeObserver viewTreeObserver = qo0Var.A0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        qo0Var.A0 = view.getViewTreeObserver();
                    }
                    qo0Var.A0.removeGlobalOnLayoutListener(qo0Var.l0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                g12 g12Var = (g12) this.Y;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = g12Var.z0;
                if (touchExplorationStateChangeListener == null || (accessibilityManager = g12Var.y0) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                return;
            case 3:
                return;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.Y;
                e03 e03Var = hideBottomViewOnScrollBehavior.h;
                if (e03Var == null || (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) == null) {
                    return;
                }
                accessibilityManager2.removeTouchExplorationStateChangeListener(e03Var);
                hideBottomViewOnScrollBehavior.h = null;
                return;
            case 5:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.Y;
                e03 e03Var2 = hideViewOnScrollBehavior.c;
                if (e03Var2 == null || (accessibilityManager3 = hideViewOnScrollBehavior.b) == null) {
                    return;
                }
                accessibilityManager3.removeTouchExplorationStateChangeListener(e03Var2);
                hideViewOnScrollBehavior.c = null;
                return;
            case 6:
                sg7 sg7Var = (sg7) this.Y;
                ViewTreeObserver viewTreeObserver2 = sg7Var.r0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sg7Var.r0 = view.getViewTreeObserver();
                    }
                    sg7Var.r0.removeGlobalOnLayoutListener(sg7Var.l0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 7:
                AbstractComposeView abstractComposeView = (AbstractComposeView) this.Y;
                int i = cr5.a;
                for (Object obj : w27.i0(abstractComposeView.getParent(), tw8.X)) {
                    if (obj instanceof View) {
                        View view2 = (View) obj;
                        view2.getClass();
                        Object tag = view2.getTag(cr5.b);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            return;
                        }
                    }
                }
                abstractComposeView.e();
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((og7) this.Y).m(null);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }
}
