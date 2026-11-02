package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lh5 implements Parcelable {
    public static final Parcelable.Creator<lh5> CREATOR = new dh5((byte) 8);
    public final dc4 X;

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    public lh5(Parcel parcel) {
        u91 u91VarA;
        dc4 ac4Var;
        dc4 bc4Var;
        int i = parcel.readInt();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray != null) {
            u91 u91Var = u91.b;
            u91VarA = wl7.A(bArrCreateByteArray);
            u91VarA = u91VarA == null ? u91.b : u91VarA;
        }
        u91VarA.getClass();
        if (i == 1) {
            bc4Var = new bc4();
        } else {
            if (i == 2) {
                ac4Var = new cc4(u91VarA);
            } else {
                if (i != 3) {
                    bt.i(pc6.j(i, "Unknown result type "));
                    throw null;
                }
                ac4Var = new ac4(u91VarA);
            }
            bc4Var = ac4Var;
        }
        this.X = bc4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        dc4 dc4Var = this.X;
        if (dc4Var instanceof bc4) {
            i2 = 1;
        } else if (dc4Var instanceof cc4) {
            i2 = 2;
        } else {
            if (!(dc4Var instanceof ac4)) {
                u52.r(dc4Var, "Unknown Result ");
                return;
            }
            i2 = 3;
        }
        parcel.writeInt(i2);
        u91 u91VarA = dc4Var.a();
        u91VarA.getClass();
        u91 u91Var = u91.b;
        parcel.writeByteArray(wl7.c0(u91VarA));
    }

    public lh5(dc4 dc4Var) {
        this.X = dc4Var;
    }
}
