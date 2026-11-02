package defpackage;

import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gy0 implements a94 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ gy0(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.a94
    public final void k(d94 d94Var, n84 n84Var) {
        Window window;
        View viewPeekDecorView;
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i = ComponentActivity.x0;
                if (n84Var == n84.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                ComponentActivity componentActivity2 = (ComponentActivity) obj;
                int i2 = ComponentActivity.x0;
                if (n84Var == n84.ON_DESTROY) {
                    componentActivity2.Y.a = null;
                    if (!componentActivity2.isChangingConfigurations()) {
                        componentActivity2.e().a();
                    }
                    ky0 ky0Var = componentActivity2.h0;
                    ComponentActivity componentActivity3 = ky0Var.f0;
                    componentActivity3.getWindow().getDecorView().removeCallbacks(ky0Var);
                    componentActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(ky0Var);
                }
                break;
            default:
                xv6 xv6Var = (xv6) obj;
                if (n84Var == n84.ON_START) {
                    xv6Var.h = true;
                } else if (n84Var == n84.ON_STOP) {
                    xv6Var.h = false;
                }
                break;
        }
    }
}
