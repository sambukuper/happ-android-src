package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class da1 implements Parcelable {
    public final ga1 X;
    public final ga1 Y;
    public final ga1 Z;
    public final ga1 f0;
    public final ga1 g0;
    public static final ca1 Companion = new ca1();
    public static final Parcelable.Creator<da1> CREATOR = new l99((byte) 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ da1(int i, ga1 ga1Var, ga1 ga1Var2, ga1 ga1Var3, ga1 ga1Var4, ga1 ga1Var5) {
        if (1 != (i & 1)) {
            ch3.S(i, 1, ba1.a.d());
            throw null;
        }
        this.X = ga1Var;
        if ((i & 2) == 0) {
            this.Y = null;
        } else {
            this.Y = ga1Var2;
        }
        if ((i & 4) == 0) {
            this.Z = null;
        } else {
            this.Z = ga1Var3;
        }
        if ((i & 8) == 0) {
            this.f0 = null;
        } else {
            this.f0 = ga1Var4;
        }
        if ((i & 16) == 0) {
            this.g0 = null;
        } else {
            this.g0 = ga1Var5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    public final ga1 c() {
        ga1 ga1Var;
        ss8 ss8Var = ss8.a;
        String language = ss8.n().getLanguage();
        if (language == null) {
            ga1Var = null;
        } else {
            int iHashCode = language.hashCode();
            if (iHashCode != 3241) {
                if (iHashCode != 3259) {
                    if (iHashCode != 3651) {
                        if (iHashCode == 3886 && language.equals("zh")) {
                            ga1Var = this.f0;
                        } else {
                            ga1Var = null;
                        }
                    } else if (language.equals("ru")) {
                        ga1Var = this.Z;
                    } else {
                        ga1Var = null;
                    }
                } else if (language.equals("fa")) {
                    ga1Var = this.g0;
                } else {
                    ga1Var = null;
                }
            } else if (language.equals("en")) {
                ga1Var = this.Y;
            } else {
                ga1Var = null;
            }
        }
        return ga1Var == null ? this.X : ga1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da1)) {
            return false;
        }
        da1 da1Var = (da1) obj;
        return dh3.f(this.X, da1Var.X) && dh3.f(this.Y, da1Var.Y) && dh3.f(this.Z, da1Var.Z) && dh3.f(this.f0, da1Var.f0) && dh3.f(this.g0, da1Var.g0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.X.hashCode() * 31;
        ga1 ga1Var = this.Y;
        int iHashCode2 = (iHashCode + (ga1Var == null ? 0 : ga1Var.hashCode())) * 31;
        ga1 ga1Var2 = this.Z;
        int iHashCode3 = (iHashCode2 + (ga1Var2 == null ? 0 : ga1Var2.hashCode())) * 31;
        ga1 ga1Var3 = this.f0;
        int iHashCode4 = (iHashCode3 + (ga1Var3 == null ? 0 : ga1Var3.hashCode())) * 31;
        ga1 ga1Var4 = this.g0;
        return iHashCode4 + (ga1Var4 != null ? ga1Var4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DataLocale(defaultItem=" + this.X + ", en=" + this.Y + ", ru=" + this.Z + ", cn=" + this.f0 + ", fa=" + this.g0 + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.X.writeToParcel(parcel, i);
        ga1 ga1Var = this.Y;
        if (ga1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ga1Var.writeToParcel(parcel, i);
        }
        ga1 ga1Var2 = this.Z;
        if (ga1Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ga1Var2.writeToParcel(parcel, i);
        }
        ga1 ga1Var3 = this.f0;
        if (ga1Var3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ga1Var3.writeToParcel(parcel, i);
        }
        ga1 ga1Var4 = this.g0;
        if (ga1Var4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ga1Var4.writeToParcel(parcel, i);
        }
    }

    public da1(ga1 ga1Var, ga1 ga1Var2, ga1 ga1Var3, ga1 ga1Var4, ga1 ga1Var5) {
        ga1Var.getClass();
        this.X = ga1Var;
        this.Y = ga1Var2;
        this.Z = ga1Var3;
        this.f0 = ga1Var4;
        this.g0 = ga1Var5;
    }
}
