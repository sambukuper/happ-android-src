package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.bt;
import defpackage.bu4;
import defpackage.f20;
import defpackage.g5;
import defpackage.gn7;
import defpackage.h5;
import defpackage.hu4;
import defpackage.i5;
import defpackage.ju4;
import defpackage.nt4;
import defpackage.st4;
import defpackage.tt4;
import defpackage.u46;
import defpackage.yr2;
import defpackage.zo2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f20 {
    public i5 k0;
    public Drawable l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public int r0;
    public boolean s0;
    public final SparseBooleanArray t0;
    public g5 u0;
    public g5 v0;
    public zo2 w0;
    public h5 x0;
    public final yr2 y0;

    public a(Context context) {
        int i = u46.abc_action_menu_layout;
        int i2 = u46.abc_action_menu_item_layout;
        this.X = context;
        this.f0 = LayoutInflater.from(context);
        this.h0 = i;
        this.i0 = i2;
        this.t0 = new SparseBooleanArray();
        this.y0 = new yr2((Object) this, (byte) 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(st4 st4Var, View view, ViewGroup viewGroup) {
        View actionView = st4Var.getActionView();
        if (actionView == null || st4Var.e()) {
            ju4 ju4Var = view instanceof ju4 ? (ju4) view : (ju4) this.f0.inflate(this.i0, viewGroup, false);
            ju4Var.c(st4Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) ju4Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.j0);
            h5 h5Var = this.x0;
            if (h5Var == null) {
                h5Var = new h5(this);
                this.x0 = h5Var;
            }
            actionMenuItemView.setPopupCallback(h5Var);
            actionView = (View) ju4Var;
        }
        actionView.setVisibility(st4Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.LayoutParams)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.iu4
    public final void b(nt4 nt4Var, boolean z) {
        f();
        g5 g5Var = this.v0;
        if (g5Var != null && g5Var.b()) {
            g5Var.j.dismiss();
        }
        hu4 hu4Var = this.g0;
        if (hu4Var != null) {
            hu4Var.b(nt4Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iu4
    public final boolean c(gn7 gn7Var) {
        boolean z;
        if (gn7Var.hasVisibleItems()) {
            gn7 gn7Var2 = gn7Var;
            while (true) {
                nt4 nt4Var = gn7Var2.z;
                if (nt4Var == this.Z) {
                    break;
                }
                gn7Var2 = (gn7) nt4Var;
            }
            st4 st4Var = gn7Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.j0;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof ju4) && ((ju4) childAt).getItemData() == st4Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                int size = gn7Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = gn7Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                g5 g5Var = new g5(this, this.Y, gn7Var, view);
                this.v0 = g5Var;
                g5Var.h = z;
                bu4 bu4Var = g5Var.j;
                if (bu4Var != null) {
                    bu4Var.o(z);
                }
                g5 g5Var2 = this.v0;
                if (!g5Var2.b()) {
                    if (g5Var2.f == null) {
                        bt.i("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    g5Var2.d(0, 0, false, false);
                }
                hu4 hu4Var = this.g0;
                if (hu4Var != null) {
                    hu4Var.N(gn7Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.iu4
    public final boolean d() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        a aVar = this;
        nt4 nt4Var = aVar.Z;
        if (nt4Var != null) {
            arrayListL = nt4Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = aVar.r0;
        int i3 = aVar.q0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.j0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            st4 st4Var = (st4) arrayListL.get(i4);
            int i7 = st4Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (aVar.s0 && st4Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (aVar.n0 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = aVar.t0;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            st4 st4Var2 = (st4) arrayListL.get(i9);
            int i11 = st4Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = st4Var2.b;
            if (z3) {
                View viewA = aVar.a(st4Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                st4Var2.f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = aVar.a(st4Var2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            st4 st4Var3 = (st4) arrayListL.get(i13);
                            if (st4Var3.b == i12) {
                                if ((st4Var3.x & 32) == 32) {
                                    i8++;
                                }
                                st4Var3.f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    st4Var2.f(z5);
                } else {
                    st4Var2.f(false);
                }
                i9++;
                i = 2;
                aVar = this;
                z = true;
            }
            i9++;
            i = 2;
            aVar = this;
            z = true;
        }
        return z;
    }

    public final boolean f() {
        Object obj;
        zo2 zo2Var = this.w0;
        if (zo2Var != null && (obj = this.j0) != null) {
            ((View) obj).removeCallbacks(zo2Var);
            this.w0 = null;
            return true;
        }
        g5 g5Var = this.u0;
        if (g5Var == null) {
            return false;
        }
        if (g5Var.b()) {
            g5Var.j.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iu4
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.j0;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            nt4 nt4Var = this.Z;
            if (nt4Var != null) {
                nt4Var.i();
                ArrayList arrayListL = this.Z.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    st4 st4Var = (st4) arrayListL.get(i2);
                    if ((st4Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        st4 itemData = childAt instanceof ju4 ? ((ju4) childAt).getItemData() : null;
                        View viewA = a(st4Var, childAt, viewGroup);
                        if (st4Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.j0).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.k0) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.j0).requestLayout();
        nt4 nt4Var2 = this.Z;
        if (nt4Var2 != null) {
            nt4Var2.i();
            ArrayList arrayList2 = nt4Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                tt4 tt4Var = ((st4) arrayList2.get(i3)).A;
            }
        }
        nt4 nt4Var3 = this.Z;
        if (nt4Var3 != null) {
            nt4Var3.i();
            arrayList = nt4Var3.j;
        }
        if (this.n0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((st4) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        i5 i5Var = this.k0;
        if (z) {
            if (i5Var == null) {
                i5Var = new i5(this, this.X);
                this.k0 = i5Var;
            }
            ViewGroup viewGroup3 = (ViewGroup) i5Var.getParent();
            if (viewGroup3 != this.j0) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.k0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.j0;
                i5 i5Var2 = this.k0;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams layoutParamsJ = ActionMenuView.j();
                layoutParamsJ.a = true;
                actionMenuView.addView(i5Var2, layoutParamsJ);
            }
        } else if (i5Var != null) {
            Object parent = i5Var.getParent();
            Object obj = this.j0;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.k0);
            }
        }
        ((ActionMenuView) this.j0).setOverflowReserved(this.n0);
    }

    public final boolean j() {
        g5 g5Var = this.u0;
        return g5Var != null && g5Var.b();
    }

    @Override // defpackage.iu4
    public final void k(Context context, nt4 nt4Var) {
        this.Y = context;
        LayoutInflater.from(context);
        this.Z = nt4Var;
        Resources resources = context.getResources();
        if (!this.o0) {
            this.n0 = true;
        }
        int i = 2;
        this.p0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.r0 = i;
        int measuredWidth = this.p0;
        if (this.n0) {
            if (this.k0 == null) {
                i5 i5Var = new i5(this, this.X);
                this.k0 = i5Var;
                if (this.m0) {
                    i5Var.setImageDrawable(this.l0);
                    this.l0 = null;
                    this.m0 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.k0.getMeasuredWidth();
        } else {
            this.k0 = null;
        }
        this.q0 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        nt4 nt4Var;
        boolean z = false;
        if (this.n0 && !j() && (nt4Var = this.Z) != null && this.j0 != null && this.w0 == null) {
            nt4Var.i();
            if (!nt4Var.j.isEmpty()) {
                zo2 zo2Var = new zo2((byte) 1, this, new g5(this, this.Y, this.Z, this.k0), z);
                this.w0 = zo2Var;
                ((View) this.j0).post(zo2Var);
                return true;
            }
        }
        return false;
    }
}
