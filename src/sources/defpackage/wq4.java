package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.e;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wq4<S> extends dn5 {
    public int e1;
    public bd0 f1;
    public ay4 g1;
    public int h1;
    public lr i1;
    public RecyclerView j1;
    public RecyclerView k1;
    public View l1;
    public View m1;
    public View n1;
    public View o1;
    public MaterialButton p1;
    public AccessibilityManager q1;
    public mg5 r1;
    public boolean s1;

    @Override // defpackage.qk2
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.e1);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.g1);
    }

    @Override // defpackage.dn5
    public final void R(k32 k32Var) {
        this.d1.add(k32Var);
    }

    public final boolean S(boolean z) {
        ay4 ay4Var;
        if (this.s1) {
            return false;
        }
        if (this.k1.getScrollState() != 0) {
            return true;
        }
        e eVar = (e) this.k1.getAdapter();
        if (eVar == null || (ay4Var = this.g1) == null) {
            return false;
        }
        int iM = eVar.m(ay4Var) + (z ? 1 : -1);
        if (iM < 0 || iM >= eVar.c.i0) {
            return false;
        }
        eVar.h = z ? 2 : 1;
        T(eVar.l(iM));
        return true;
    }

    public final void T(ay4 ay4Var) {
        e eVar = (e) this.k1.getAdapter();
        int iM = eVar.m(ay4Var);
        AccessibilityManager accessibilityManager = this.q1;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iM2 = iM - eVar.m(this.g1);
            byte b = 1;
            boolean z = Math.abs(iM2) > 3;
            boolean z2 = iM2 > 0;
            this.g1 = ay4Var;
            if (z && z2) {
                this.k1.j0(iM - 3);
                this.k1.post(new vd0(this, iM, b));
            } else {
                RecyclerView recyclerView = this.k1;
                if (z) {
                    recyclerView.j0(iM + 3);
                    this.k1.post(new vd0(this, iM, b));
                } else {
                    recyclerView.post(new vd0(this, iM, b));
                }
            }
        } else {
            this.g1 = ay4Var;
            this.k1.j0(iM);
        }
        W();
        X(iM);
    }

    public final void U(int i) {
        this.h1 = i;
        if (i == 2) {
            this.j1.getLayoutManager().N0(this.g1.Z - ((u69) this.j1.getAdapter()).c.f1.X.Z);
            this.n1.setVisibility(0);
            this.o1.setVisibility(8);
            this.l1.setVisibility(8);
            this.m1.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.n1.setVisibility(8);
            this.o1.setVisibility(0);
            this.l1.setVisibility(0);
            this.m1.setVisibility(0);
            T(this.g1);
        }
    }

    public final void V(View view) {
        if (view == null) {
            return;
        }
        int i = this.h1;
        if (i == 2) {
            cw8.o(view, p(h56.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            cw8.o(view, p(h56.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void W() {
        ay4 ay4Var;
        e eVar = (e) this.k1.getAdapter();
        if (eVar != null) {
            y86 y86Var = eVar.a;
            if (this.s1 || (ay4Var = this.g1) == null || ay4Var.equals(eVar.g)) {
                return;
            }
            int iM = eVar.m(eVar.g);
            eVar.g = ay4Var;
            int iM2 = eVar.m(ay4Var);
            y86Var.d(iM, 1, null);
            y86Var.d(iM2, 1, null);
        }
    }

    public final void X(int i) {
        View view = this.m1;
        if (view != null) {
            view.setEnabled(i + 1 < this.k1.getAdapter().a());
        }
        View view2 = this.l1;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // defpackage.qk2
    public final void y(Bundle bundle) {
        super.y(bundle);
        if (bundle == null) {
            bundle = this.h0;
        }
        this.e1 = bundle.getInt("THEME_RES_ID_KEY");
        this.f1 = (bd0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.g1 = (ay4) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // defpackage.qk2
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(k(), this.e1);
        this.i1 = new lr(contextThemeWrapper, (byte) 14);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.q1 = (AccessibilityManager) N().getSystemService("accessibility");
        ay4 ay4Var = this.f1.X;
        boolean zA0 = dr4.a0(contextThemeWrapper, R.attr.windowFullscreen);
        this.s1 = zA0;
        byte b = 0;
        byte b2 = 1;
        if (zA0) {
            i = s46.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = s46.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = N().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(j36.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(j36.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(j36.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(j36.mtrl_calendar_days_of_week_height);
        int i3 = by4.f0;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(j36.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(j36.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(j36.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(c46.mtrl_calendar_days_of_week);
        cw8.n(gridView, new hw1(b2));
        int i4 = this.f1.g0;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new xc1(i4) : new xc1()));
        gridView.setNumColumns(ay4Var.f0);
        gridView.setEnabled(false);
        this.k1 = (RecyclerView) viewInflate.findViewById(c46.mtrl_calendar_months);
        this.k1.setLayoutManager(new tq4(this, i2, i2));
        this.k1.setTag("MONTHS_VIEW_GROUP_TAG");
        e eVar = new e(contextThemeWrapper, this.f1, new vk1((Object) this, (byte) 25), new q02((Object) this, (byte) 20));
        this.k1.setAdapter(eVar);
        int integer = contextThemeWrapper.getResources().getInteger(o46.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(c46.mtrl_calendar_year_selector_frame);
        this.j1 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.j1.setLayoutManager(new GridLayoutManager(integer));
            this.j1.setAdapter(new u69(this));
            RecyclerView recyclerView2 = this.j1;
            uq4 uq4Var = new uq4();
            tr8.c(null);
            tr8.c(null);
            recyclerView2.i(uq4Var);
        }
        if (!this.s1) {
            mg5 mg5Var = new mg5();
            this.r1 = mg5Var;
            mg5Var.a(this.k1);
        }
        if (viewInflate.findViewById(c46.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(c46.month_navigation_fragment_toggle);
            this.p1 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            cw8.n(this.p1, new r20(this, (byte) 6));
            View viewFindViewById = viewInflate.findViewById(c46.month_navigation_previous);
            this.l1 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            a38.f(this.l1, p(h56.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(c46.month_navigation_next);
            this.m1 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            a38.f(this.m1, p(h56.mtrl_picker_next_month_tooltip));
            this.n1 = viewInflate.findViewById(c46.mtrl_calendar_year_selector_frame);
            this.o1 = viewInflate.findViewById(c46.mtrl_calendar_day_selector_frame);
            U(1);
            this.p1.setText(this.g1.e());
            this.k1.j(new vq4(this, eVar));
            this.p1.setOnClickListener(new y4(this, (byte) 3));
            this.m1.setOnClickListener(new sq4(this, eVar, b));
            this.l1.setOnClickListener(new sq4(this, eVar, b2));
            X(eVar.m(this.g1));
        }
        this.k1.j0(eVar.m(this.g1));
        cw8.n(this.k1, new hw1((byte) 2));
        V(viewInflate);
        return viewInflate;
    }
}
