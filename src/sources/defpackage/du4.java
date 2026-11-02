package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class du4 {
    public final Context a;
    public final nt4 b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public hu4 i;
    public bu4 j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final cu4 l = new cu4(this);

    public du4(int i, int i2, nt4 nt4Var, Context context, View view, boolean z) {
        this.a = context;
        this.b = nt4Var;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final bu4 a() {
        bu4 sg7Var;
        bu4 bu4Var = this.j;
        if (bu4Var != null) {
            return bu4Var;
        }
        Context context = this.a;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(l36.abc_cascading_menus_min_smallest_width)) {
            sg7Var = new qo0(this.a, this.f, this.d, this.e, this.c);
        } else {
            View view = this.f;
            sg7Var = new sg7(this.d, this.e, this.b, this.a, view, this.c);
        }
        sg7Var.l(this.b);
        sg7Var.r(this.l);
        sg7Var.n(this.f);
        sg7Var.g(this.i);
        sg7Var.o(this.h);
        sg7Var.p(this.g);
        this.j = sg7Var;
        return sg7Var;
    }

    public final boolean b() {
        bu4 bu4Var = this.j;
        return bu4Var != null && bu4Var.a();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        bu4 bu4VarA = a();
        bu4VarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            bu4VarA.q(i);
            bu4VarA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            bu4VarA.X = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        bu4VarA.f();
    }
}
