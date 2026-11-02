package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i70 extends qp7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CoordinatorLayout.Behavior b;

    public /* synthetic */ i70(CoordinatorLayout.Behavior behavior, byte b) {
        this.a = b;
        this.b = behavior;
    }

    @Override // defpackage.qp7
    public final int b(View view, int i) {
        switch (this.a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                return z91.m(i, sideSheetBehavior.a.J(), sideSheetBehavior.a.I());
        }
    }

    @Override // defpackage.qp7
    public final int c(View view, int i) {
        switch (this.a) {
            case 0:
                return z91.m(i, ((BottomSheetBehavior) this.b).F(), f());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.qp7
    public int e(View view) {
        switch (this.a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.e(view);
        }
    }

    @Override // defpackage.qp7
    public int f() {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                int i = BottomSheetBehavior.p0;
                return bottomSheetBehavior.J ? bottomSheetBehavior.X : bottomSheetBehavior.H;
            default:
                return super.f();
        }
    }

    @Override // defpackage.qp7
    public final void m(int i) {
        byte b = this.a;
        CoordinatorLayout.Behavior behavior = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    if (bottomSheetBehavior.L) {
                        bottomSheetBehavior.O(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) behavior;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.w(1);
                    }
                }
                break;
        }
    }

    @Override // defpackage.qp7
    public final void n(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        byte b = this.a;
        CoordinatorLayout.Behavior behavior = this.b;
        switch (b) {
            case 0:
                ((BottomSheetBehavior) behavior).B(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) behavior;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.k0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.a.q(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw p61.k(it);
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    @Override // defpackage.qp7
    public final void o(View view, float f, float f2) {
        byte b = this.a;
        int i = 3;
        CoordinatorLayout.Behavior behavior = this.b;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        if (top > bottomSheetBehavior.F) {
                            i = 6;
                        }
                    }
                } else if (bottomSheetBehavior.J && bottomSheetBehavior.P(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                        if (view.getTop() > (bottomSheetBehavior.F() + bottomSheetBehavior.X) / 2) {
                            i = 5;
                        } else if (!bottomSheetBehavior.b && Math.abs(view.getTop() - bottomSheetBehavior.F()) >= Math.abs(view.getTop() - bottomSheetBehavior.F)) {
                            i = 6;
                        }
                    } else {
                        i = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.b) {
                        int i2 = bottomSheetBehavior.F;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior.H)) {
                            }
                        } else if (Math.abs(top2 - i2) >= Math.abs(top2 - bottomSheetBehavior.H)) {
                            i = 4;
                        }
                        i = 6;
                    } else if (Math.abs(top2 - bottomSheetBehavior.E) >= Math.abs(top2 - bottomSheetBehavior.H)) {
                        i = 4;
                    }
                } else {
                    if (!bottomSheetBehavior.b) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - bottomSheetBehavior.F) < Math.abs(top3 - bottomSheetBehavior.H)) {
                            i = 6;
                        }
                    }
                    i = 4;
                }
                bottomSheetBehavior.Q(view, i, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) behavior;
                int i3 = SideSheetBehavior.x;
                if (!sideSheetBehavior.a.O(f)) {
                    if (sideSheetBehavior.a.U(view, f)) {
                        if (sideSheetBehavior.a.Q(f, f2) || sideSheetBehavior.a.P(view)) {
                            i = 5;
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.a.G()) >= Math.abs(left - sideSheetBehavior.a.H())) {
                            i = 5;
                        }
                    } else {
                        i = 5;
                    }
                }
                sideSheetBehavior.y(view, i, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    @Override // defpackage.qp7
    public final boolean p(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        byte b = this.a;
        CoordinatorLayout.Behavior behavior = this.b;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
                int i2 = bottomSheetBehavior.P;
                if (i2 != 1 && !bottomSheetBehavior.i0) {
                    if (i2 == 3 && bottomSheetBehavior.f0 == i) {
                        View view2 = null;
                        if (bottomSheetBehavior.e) {
                            WeakReference weakReference3 = bottomSheetBehavior.h0;
                            if (weakReference3 != null) {
                                view2 = (View) weakReference3.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.b0;
                            if (!arrayList.isEmpty()) {
                                view2 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            SystemClock.uptimeMillis();
                            weakReference = bottomSheetBehavior.Y;
                            if (weakReference != null) {
                                return true;
                            }
                        }
                    } else {
                        SystemClock.uptimeMillis();
                        weakReference = bottomSheetBehavior.Y;
                        if (weakReference != null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) behavior;
                return (sideSheetBehavior.h == 1 || (weakReference2 = sideSheetBehavior.p) == null || weakReference2.get() != view) ? false : true;
        }
    }
}
