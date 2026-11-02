package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class z19 extends eu7 {
    public final WindowInsetsController a;
    public final Window b;

    public z19(Window window, lr5 lr5Var) {
        this.a = window.getInsetsController();
        this.b = window;
    }

    @Override // defpackage.eu7
    public boolean h() {
        Window window = this.b;
        if (window == null) {
            this.a.setSystemBarsAppearance(0, 0);
            if ((this.a.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
        } else if ((window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.eu7
    public void j(boolean z) {
        l(16, 16, z);
    }

    @Override // defpackage.eu7
    public void k(boolean z) {
        l(8192, 8, z);
    }

    public final void l(int i, int i2, boolean z) {
        Window window = this.b;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.a;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
