package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(0, 0);
        layoutParams.X = 1;
        layoutParams.Y = 0.0f;
        layoutParams.Z = 1.0f;
        layoutParams.f0 = -1;
        layoutParams.g0 = -1.0f;
        layoutParams.h0 = -1;
        layoutParams.i0 = -1;
        layoutParams.j0 = 16777215;
        layoutParams.k0 = 16777215;
        layoutParams.X = parcel.readInt();
        layoutParams.Y = parcel.readFloat();
        layoutParams.Z = parcel.readFloat();
        layoutParams.f0 = parcel.readInt();
        layoutParams.g0 = parcel.readFloat();
        layoutParams.h0 = parcel.readInt();
        layoutParams.i0 = parcel.readInt();
        layoutParams.j0 = parcel.readInt();
        layoutParams.k0 = parcel.readInt();
        layoutParams.l0 = parcel.readByte() != 0;
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
        return new FlexboxLayout.LayoutParams[i];
    }
}
