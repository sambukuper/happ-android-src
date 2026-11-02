package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import defpackage.z88;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z88 {
    public final /* synthetic */ ChipTextInputComboView X;

    public b(ChipTextInputComboView chipTextInputComboView) {
        this.X = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.X;
        if (zIsEmpty) {
            chipTextInputComboView.i0 = ChipTextInputComboView.a(chipTextInputComboView, "00");
            return;
        }
        String strA = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(strA)) {
            strA = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chipTextInputComboView.i0 = strA;
    }
}
