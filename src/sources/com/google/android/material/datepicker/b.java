package com.google.android.material.datepicker;

import defpackage.by4;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ MaterialCalendarGridView X;
    public final /* synthetic */ int Y;

    public /* synthetic */ b(e eVar, MaterialCalendarGridView materialCalendarGridView, int i) {
        this.X = materialCalendarGridView;
        this.Y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int iA;
        MaterialCalendarGridView materialCalendarGridView = this.X;
        if (!materialCalendarGridView.hasFocus() || (i = this.Y) == 0) {
            return;
        }
        by4 by4VarB = materialCalendarGridView.b();
        if (i == 1) {
            iA = by4VarB.b(by4VarB.f() + 1);
            if (iA == -1) {
                iA = by4VarB.f();
            }
        } else {
            iA = by4VarB.a(by4VarB.c() - 1);
            if (iA == -1) {
                iA = by4VarB.c();
            }
        }
        materialCalendarGridView.setSelection(iA);
    }
}
