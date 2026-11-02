package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e03 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ CoordinatorLayout.Behavior Z;

    public /* synthetic */ e03(CoordinatorLayout.Behavior behavior, View view, byte b) {
        this.X = b;
        this.Z = behavior;
        this.Y = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        byte b = this.X;
        View view = this.Y;
        CoordinatorLayout.Behavior behavior = this.Z;
        switch (b) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) behavior;
                int i = HideBottomViewOnScrollBehavior.n;
                if (z && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.v(view);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) behavior;
                int i2 = HideViewOnScrollBehavior.o;
                if (hideViewOnScrollBehavior.d && z && hideViewOnScrollBehavior.k == 1) {
                    hideViewOnScrollBehavior.w(view);
                    break;
                }
                break;
        }
    }
}
