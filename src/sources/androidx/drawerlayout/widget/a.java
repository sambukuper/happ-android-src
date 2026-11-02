package androidx.drawerlayout.widget;

import android.view.View;
import defpackage.mw8;
import defpackage.qp7;
import defpackage.xb;
import io.sentry.c2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends qp7 {
    public final byte a;
    public mw8 b;
    public final xb c = new xb(this, 5);
    public final /* synthetic */ DrawerLayout d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(DrawerLayout drawerLayout, int i) {
        this.d = drawerLayout;
        this.a = i;
    }

    @Override // defpackage.qp7
    public final int b(View view, int i) {
        DrawerLayout drawerLayout = this.d;
        if (drawerLayout.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // defpackage.qp7
    public final int c(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.qp7
    public final int e(View view) {
        if (DrawerLayout.j(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.qp7
    public final void j(int i, int i2) {
        int i3 = i & 1;
        DrawerLayout drawerLayout = this.d;
        View viewD = i3 == 1 ? drawerLayout.d(3) : drawerLayout.d(5);
        if (viewD == null || drawerLayout.f(viewD) != 0) {
            return;
        }
        this.b.b(viewD, i2);
    }

    @Override // defpackage.qp7
    public final void k() {
        this.d.postDelayed(this.c, 160L);
    }

    @Override // defpackage.qp7
    public final void l(View view, int i) {
        ((DrawerLayout.LayoutParams) view.getLayoutParams()).c = false;
        int i2 = this.a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.d;
        View viewD = drawerLayout.d(i2);
        if (viewD != null) {
            drawerLayout.b(viewD);
        }
    }

    @Override // defpackage.qp7
    public final void m(int i) {
        int i2;
        int size;
        int size2;
        View rootView;
        int size3;
        View view = this.b.t;
        DrawerLayout drawerLayout = this.d;
        byte b = drawerLayout.k0.a;
        byte b2 = drawerLayout.l0.a;
        if (b == 1 || b2 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (b != 2 && b2 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((DrawerLayout.LayoutParams) view.getLayoutParams()).b;
            if (f == 0.0f) {
                DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) view.getLayoutParams();
                if ((layoutParams.d & 1) == 1) {
                    layoutParams.d = 0;
                    ArrayList arrayList = drawerLayout.w0;
                    if (arrayList != null && (size3 = arrayList.size() - 1) >= 0) {
                        drawerLayout.w0.get(size3).getClass();
                        c2.m();
                        return;
                    } else {
                        drawerLayout.o(view, false);
                        drawerLayout.n(view);
                        if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                }
            } else if (f == 1.0f) {
                DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) view.getLayoutParams();
                if ((layoutParams2.d & 1) == 0) {
                    layoutParams2.d = 1;
                    ArrayList arrayList2 = drawerLayout.w0;
                    if (arrayList2 != null && (size2 = arrayList2.size() - 1) >= 0) {
                        drawerLayout.w0.get(size2).getClass();
                        c2.m();
                        return;
                    } else {
                        drawerLayout.o(view, true);
                        drawerLayout.n(view);
                        if (drawerLayout.hasWindowFocus()) {
                            drawerLayout.sendAccessibilityEvent(32);
                        }
                    }
                }
            }
        }
        if (i2 != drawerLayout.o0) {
            drawerLayout.o0 = i2;
            ArrayList arrayList3 = drawerLayout.w0;
            if (arrayList3 == null || (size = arrayList3.size() - 1) < 0) {
                return;
            }
            drawerLayout.w0.get(size).getClass();
            c2.m();
        }
    }

    @Override // defpackage.qp7
    public final void n(View view, int i, int i2) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.d;
        float width2 = (drawerLayout.a(view, 3) ? i + width : drawerLayout.getWidth() - i) / width;
        drawerLayout.m(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // defpackage.qp7
    public final void o(View view, float f, float f2) {
        int i;
        int[] iArr = DrawerLayout.G0;
        float f3 = ((DrawerLayout.LayoutParams) view.getLayoutParams()).b;
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.d;
        if (drawerLayout.a(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.b.p(i, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // defpackage.qp7
    public final boolean p(View view, int i) {
        if (!DrawerLayout.j(view)) {
            return false;
        }
        byte b = this.a;
        DrawerLayout drawerLayout = this.d;
        return drawerLayout.a(view, b) && drawerLayout.f(view) == 0;
    }
}
