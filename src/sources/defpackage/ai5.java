package defpackage;

import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ai5 implements Parcelable {
    public static final Parcelable.Creator<ai5> CREATOR = new dh5((byte) 21);
    public final UUID X;
    public final u91 Y;
    public final HashSet Z;
    public final zv7 f0;
    public final int g0;
    public final int h0;

    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    public ai5(Parcel parcel) {
        u91 u91VarA;
        ArrayList arrayList;
        this.X = UUID.fromString(parcel.readString());
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray != null) {
            u91 u91Var = u91.b;
            u91VarA = wl7.A(bArrCreateByteArray);
            u91VarA = u91VarA == null ? u91.b : u91VarA;
        }
        u91VarA.getClass();
        this.Y = u91VarA;
        this.Z = new HashSet(parcel.createStringArrayList());
        ClassLoader classLoader = mh5.class.getClassLoader();
        Network network = parcel.readInt() == 1 ? (Network) parcel.readParcelable(classLoader) : null;
        if (parcel.readInt() == 1) {
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((Uri) parcelable);
            }
        } else {
            arrayList = null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.readInt() == 1 ? parcel.createStringArrayList() : null;
        zv7 zv7Var = new zv7((byte) 12);
        if (Build.VERSION.SDK_INT >= 28) {
            zv7Var.Z = network;
        }
        if (arrayList != null) {
            zv7Var.Y = arrayList;
        }
        if (arrayListCreateStringArrayList != null) {
            zv7Var.X = arrayListCreateStringArrayList;
        }
        this.f0 = zv7Var;
        this.g0 = parcel.readInt();
        this.h0 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X.toString());
        u91 u91Var = this.Y;
        u91Var.getClass();
        u91 u91Var2 = u91.b;
        parcel.writeByteArray(wl7.c0(u91Var));
        parcel.writeStringList(new ArrayList(this.Z));
        mh5 mh5Var = new mh5();
        mh5Var.X = this.f0;
        mh5Var.writeToParcel(parcel, i);
        parcel.writeInt(this.g0);
        parcel.writeInt(this.h0);
    }

    public ai5(WorkerParameters workerParameters) {
        this.X = workerParameters.a;
        this.Y = workerParameters.b;
        this.Z = workerParameters.c;
        this.f0 = workerParameters.d;
        this.g0 = workerParameters.e;
        this.h0 = workerParameters.j;
    }
}
