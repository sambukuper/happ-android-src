package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jz7 extends qp7 {
    public int a;
    public int b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public jz7(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // defpackage.qp7
    public final int b(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        byte b = this.c.e;
        if (b == 0) {
            width = this.a;
            if (z) {
                width -= view.getWidth();
                width2 = this.a;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i2 = this.a;
            if (b != 1) {
                width = i2 - view.getWidth();
                width2 = this.a + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i2;
                width = i2;
            } else {
                width = i2 - view.getWidth();
                width2 = this.a;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.qp7
    public final int e(View view) {
        return view.getWidth();
    }

    @Override // defpackage.qp7
    public final void l(View view, int i) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // defpackage.qp7
    public final void m(int i) {
        wl6 wl6Var = this.c.b;
        if (wl6Var != null) {
            s20 s20Var = ((v20) wl6Var.Y).v;
            if (i == 0) {
                yr6.f().n(s20Var);
            } else if (i == 1 || i == 2) {
                yr6.f().l(s20Var);
            }
        }
    }

    @Override // defpackage.qp7
    public final void n(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float fAbs = Math.abs(i - this.a);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    @Override // defpackage.qp7
    public final void o(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        wl6 wl6Var;
        this.b = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            byte b = swipeDismissBehavior.e;
            if (b != 2 && (b != 0 ? b != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.a;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.a;
                    if (left < i2) {
                        i = this.a - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.a - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.a) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.a;
                    if (left < i2) {
                        i = this.a - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.a - width;
                }
                z = true;
            } else {
                i = this.a;
            }
        }
        if (swipeDismissBehavior.a.p(i, view.getTop())) {
            view.postOnAnimation(new x47(swipeDismissBehavior, view, z));
        } else {
            if (!z || (wl6Var = swipeDismissBehavior.b) == null) {
                return;
            }
            wl6Var.R(view);
        }
    }

    @Override // defpackage.qp7
    public final boolean p(View view, int i) {
        int i2 = this.b;
        return (i2 == -1 || i2 == i) && this.c.v(view);
    }
}
