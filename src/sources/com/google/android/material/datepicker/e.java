package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.l;
import defpackage.ay4;
import defpackage.bd0;
import defpackage.bt;
import defpackage.by4;
import defpackage.c46;
import defpackage.dr4;
import defpackage.j36;
import defpackage.q02;
import defpackage.s46;
import defpackage.tr8;
import defpackage.vk1;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    public final bd0 c;
    public final vk1 d;
    public final q02 e;
    public final int f;
    public ay4 g;
    public int h = 0;

    public e(ContextThemeWrapper contextThemeWrapper, bd0 bd0Var, vk1 vk1Var, q02 q02Var) {
        ay4 ay4Var = bd0Var.X;
        ay4 ay4Var2 = bd0Var.Y;
        ay4 ay4Var3 = bd0Var.f0;
        if (ay4Var.X.compareTo(ay4Var3.X) > 0) {
            bt.q("firstPage cannot be after currentPage");
            throw null;
        }
        if (ay4Var3.X.compareTo(ay4Var2.X) > 0) {
            bt.q("currentPage cannot be after lastPage");
            throw null;
        }
        this.f = (contextThemeWrapper.getResources().getDimensionPixelSize(j36.mtrl_calendar_day_height) * by4.f0) + (dr4.a0(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(j36.mtrl_calendar_day_height) : 0);
        this.c = bd0Var;
        this.d = vk1Var;
        this.e = q02Var;
        this.g = ay4Var3;
        if (this.a.a()) {
            bt.i("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.b = true;
    }

    @Override // androidx.recyclerview.widget.f
    public final int a() {
        return this.c.i0;
    }

    @Override // androidx.recyclerview.widget.f
    public final long b(int i) {
        Calendar calendarA = tr8.a(this.c.X.X);
        calendarA.add(2, i);
        calendarA.set(5, 1);
        Calendar calendarA2 = tr8.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.f
    public final void e(l lVar, int i) {
        d dVar = (d) lVar;
        bd0 bd0Var = this.c;
        Calendar calendarA = tr8.a(bd0Var.X.X);
        calendarA.add(2, i);
        ay4 ay4Var = new ay4(calendarA);
        dVar.u.setText(ay4Var.e());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) dVar.v.findViewById(c46.month_grid);
        if (materialCalendarGridView.b() == null || !ay4Var.equals(materialCalendarGridView.b().X)) {
            new by4(ay4Var, bd0Var);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.b().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.f
    public final l g(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(s46.mtrl_calendar_month_labeled, viewGroup, false);
        if (!dr4.a0(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new d(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f));
        return new d(linearLayout, true);
    }

    public final ay4 l(int i) {
        Calendar calendarA = tr8.a(this.c.X.X);
        calendarA.add(2, i);
        return new ay4(calendarA);
    }

    public final int m(ay4 ay4Var) {
        return this.c.X.g(ay4Var);
    }
}
