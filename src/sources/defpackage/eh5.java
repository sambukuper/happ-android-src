package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eh5 implements Parcelable {
    public static final Parcelable.Creator<eh5> CREATOR = new dh5((byte) 1);
    public final p31 X;

    public eh5(Parcel parcel) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b45 b45VarK = a28.k(parcel.readInt());
        u35 u35Var = new u35(null);
        boolean z = parcel.readInt() == 1;
        boolean z2 = parcel.readInt() == 1;
        boolean z3 = parcel.readInt() == 1;
        boolean z4 = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            for (o31 o31Var : a28.b(parcel.createByteArray())) {
                linkedHashSet.add(new o31(o31Var.b, o31Var.a));
            }
        }
        long j = parcel.readLong();
        TimeUnit.MILLISECONDS.getClass();
        long j2 = parcel.readLong();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && parcel.readInt() == 1) {
            NetworkRequest networkRequestI = en.i(parcel.createIntArray(), parcel.createIntArray());
            if (i >= 28) {
                if (i >= 31 && b4.h(networkRequestI) != null) {
                    bt.q("NetworkRequests with NetworkSpecifiers set aren't supported.");
                    throw null;
                }
                u35Var = new u35(networkRequestI);
            }
            b45VarK = b45.X;
        }
        this.X = new p31(u35Var, b45VarK, z2, z4, z, z3, j2, j, wv0.c1(linkedHashSet));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        p31 p31Var = this.X;
        parcel.writeInt(a28.p(p31Var.a));
        parcel.writeInt(p31Var.e ? 1 : 0);
        parcel.writeInt(p31Var.c ? 1 : 0);
        parcel.writeInt(p31Var.f ? 1 : 0);
        parcel.writeInt(p31Var.d ? 1 : 0);
        boolean zB = p31Var.b();
        parcel.writeInt(zB ? 1 : 0);
        if (zB) {
            parcel.writeByteArray(a28.s(p31Var.i));
        }
        parcel.writeLong(p31Var.h);
        parcel.writeLong(p31Var.g);
        if (Build.VERSION.SDK_INT >= 28) {
            NetworkRequest networkRequestA = p31Var.a();
            int i2 = networkRequestA != null ? 1 : 0;
            parcel.writeInt(i2);
            if (i2 != 0) {
                parcel.writeIntArray(g33.u(networkRequestA));
                parcel.writeIntArray(g33.B(networkRequestA));
            }
        }
    }

    public eh5(p31 p31Var) {
        this.X = p31Var;
    }
}
