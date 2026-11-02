package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n78 extends b0 {
    public static final Parcelable.Creator<n78> CREATOR = new qh5((byte) 6);
    public CharSequence Z;
    public boolean f0;

    public n78(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.Z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f0 = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.Z) + "}";
    }

    @Override // defpackage.b0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.Z, parcel, i);
        parcel.writeInt(this.f0 ? 1 : 0);
    }
}
