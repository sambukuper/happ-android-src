package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.by4;
import defpackage.wq4;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView X;
    public final /* synthetic */ e Y;

    public c(e eVar, MaterialCalendarGridView materialCalendarGridView) {
        this.Y = eVar;
        this.X = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.X;
        by4 by4VarB = materialCalendarGridView.b();
        if (i < by4VarB.c() || i > by4VarB.f()) {
            return;
        }
        if (materialCalendarGridView.b().getItem(i).longValue() >= ((wq4) this.Y.d.Y).f1.Z.X) {
            throw null;
        }
    }
}
