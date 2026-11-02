package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class my0 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(ComponentActivity componentActivity, zy0 zy0Var) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(zy0Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 6, 0);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(zy0Var);
        View decorView = componentActivity.getWindow().getDecorView();
        if (us7.b(decorView) == null) {
            decorView.setTag(v36.view_tree_lifecycle_owner, componentActivity);
        }
        if (gs8.j(decorView) == null) {
            decorView.setTag(w36.view_tree_view_model_store_owner, componentActivity);
        }
        if (ys7.d(decorView) == null) {
            decorView.setTag(z36.view_tree_saved_state_registry_owner, componentActivity);
        }
        componentActivity.setContentView(composeView2, a);
    }
}
