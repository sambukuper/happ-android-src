package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.j;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m96 extends b0 {
    public static final Parcelable.Creator<m96> CREATOR = new ud7((byte) 4);
    public Parcelable Z;

    public m96(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.Z = parcel.readParcelable(classLoader == null ? j.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.b0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.Z, 0);
    }
}
