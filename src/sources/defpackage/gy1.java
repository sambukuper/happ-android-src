package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gy1 {
    public static ny1 a;

    static {
        Color.argb(230, 255, 255, 255);
        Color.argb(128, 27, 27, 27);
    }

    public static final void a(ComponentActivity componentActivity, e08 e08Var, e08 e08Var2) {
        componentActivity.getClass();
        e08Var.getClass();
        e08Var2.getClass();
        View decorView = componentActivity.getWindow().getDecorView();
        decorView.getClass();
        ny1 iy1Var = a;
        if (iy1Var == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                iy1Var = new my1();
            } else if (i >= 30) {
                iy1Var = new ly1();
            } else if (i >= 29) {
                iy1Var = new ky1();
            } else if (i >= 28) {
                iy1Var = new jy1();
            } else {
                iy1Var = i >= 26 ? new iy1() : new hy1();
            }
            a = iy1Var;
        }
        ny1 ny1Var = iy1Var;
        ey1 ey1Var = new ey1(ny1Var, e08Var, e08Var2, componentActivity, decorView, (byte) 0);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                fy1 fy1Var = new fy1(ey1Var, viewGroup.getContext());
                fy1Var.setTag(ny1Var);
                fy1Var.setVisibility(8);
                fy1Var.setWillNotDraw(true);
                viewGroup.addView(fy1Var);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof ny1) {
                break;
            } else {
                i2 = i3;
            }
        }
        ey1Var.run();
        Window window = componentActivity.getWindow();
        window.getClass();
        ny1Var.a(window);
    }
}
