package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.tencent.mmkv.MMKV;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jh5 implements Parcelable {
    public static final Parcelable.Creator<jh5> CREATOR = new dh5((byte) 6);
    public final String X;
    public final int Y;
    public final int Z;
    public final String f0;

    public jh5(MMKV mmkv) {
        this.Y = -1;
        this.Z = -1;
        this.f0 = null;
        this.X = mmkv.mmapID();
        this.Y = mmkv.ashmemFD();
        this.Z = mmkv.ashmemMetaFD();
        this.f0 = mmkv.cryptKey();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.X);
            ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(this.Y);
            ParcelFileDescriptor parcelFileDescriptorFromFd2 = ParcelFileDescriptor.fromFd(this.Z);
            int i2 = i | 1;
            parcelFileDescriptorFromFd.writeToParcel(parcel, i2);
            parcelFileDescriptorFromFd2.writeToParcel(parcel, i2);
            String str = this.f0;
            if (str != null) {
                parcel.writeString(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public jh5(String str, int i, int i2, String str2) {
        this.X = str;
        this.Y = i;
        this.Z = i2;
        this.f0 = str2;
    }
}
