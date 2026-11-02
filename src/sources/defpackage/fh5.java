package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fh5 implements Parcelable {
    public static final Parcelable.Creator<fh5> CREATOR = new dh5((byte) 2);
    public final u91 X;

    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    public fh5(Parcel parcel) {
        u91 u91VarA;
        parcel.getClass();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray != null) {
            u91 u91Var = u91.b;
            u91VarA = wl7.A(bArrCreateByteArray);
            u91VarA = u91VarA == null ? u91.b : u91VarA;
        }
        u91VarA.getClass();
        this.X = u91VarA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        u91 u91Var = this.X;
        u91Var.getClass();
        u91 u91Var2 = u91.b;
        parcel.writeByteArray(wl7.c0(u91Var));
    }
}
