package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, -2);
        layoutParams.g0 = 0.0f;
        layoutParams.h0 = 1.0f;
        layoutParams.i0 = -1;
        layoutParams.j0 = -1.0f;
        layoutParams.m0 = 16777215;
        layoutParams.n0 = 16777215;
        layoutParams.g0 = parcel.readFloat();
        layoutParams.h0 = parcel.readFloat();
        layoutParams.i0 = parcel.readInt();
        layoutParams.j0 = parcel.readFloat();
        layoutParams.k0 = parcel.readInt();
        layoutParams.l0 = parcel.readInt();
        layoutParams.m0 = parcel.readInt();
        layoutParams.n0 = parcel.readInt();
        layoutParams.o0 = parcel.readByte() != 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
        return layoutParams;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FlexboxLayoutManager.LayoutParams[i];
    }
}
