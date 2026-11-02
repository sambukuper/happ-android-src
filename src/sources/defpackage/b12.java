package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class b12 implements Parcelable {
    public static final Parcelable.Creator<b12> CREATOR;
    public static final b12 X;
    public static final b12 Y;
    public static final b12 Z;
    public static final b12 f0;
    public static final b12 g0;
    public static final /* synthetic */ b12[] h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        b12 b12Var = new b12("RSA_1024", 0);
        X = b12Var;
        b12 b12Var2 = new b12("RSA_4096", 1);
        Y = b12Var2;
        b12 b12Var3 = new b12("RSA_4096_2", 2);
        Z = b12Var3;
        b12 b12Var4 = new b12("RSA_4096_3", 3);
        f0 = b12Var4;
        b12 b12Var5 = new b12("CRYPTO_5", 4);
        g0 = b12Var5;
        h0 = new b12[]{b12Var, b12Var2, b12Var3, b12Var4, b12Var5};
        CREATOR = new l99((byte) 12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b12 valueOf(String str) {
        return (b12) Enum.valueOf(b12.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b12[] values() {
        return (b12[]) h0.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
