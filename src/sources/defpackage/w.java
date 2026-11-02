package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import su.happ.proxyutility.dto.ProviderId;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new l99((byte) 1);
    public final String X;
    public final String Y;
    public final String Z;
    public final String f0;
    public final String g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w(String str) {
        String strConcat;
        String strConcat2;
        String strConcat3;
        this.X = str;
        if (str == null) {
            strConcat = "support@happ.su";
        } else {
            ProviderId.Companion companion = ProviderId.INSTANCE;
            strConcat = str.concat("@robot.happ.su");
        }
        this.Y = strConcat;
        this.Z = "mailto:".concat(strConcat);
        if (str == null) {
            strConcat2 = "tg://resolve?domain=happ_support_bot";
        } else {
            ProviderId.Companion companion2 = ProviderId.INSTANCE;
            strConcat2 = "tg://resolve?domain=happ_support_bot&start=".concat(str);
        }
        this.f0 = strConcat2;
        if (str == null) {
            strConcat3 = "t.me/happ_support_bot";
        } else {
            ProviderId.Companion companion3 = ProviderId.INSTANCE;
            strConcat3 = "t.me/happ_support_bot&start=".concat(str);
        }
        this.g0 = strConcat3;
        zb6 zb6Var = yb6.a;
        zb6Var.b(w.class).E();
        if (str != null) {
            ProviderId.Companion companion4 = ProviderId.INSTANCE;
        }
        zb6Var.b(w.class).E();
        zb6Var.b(w.class).E();
        zb6Var.b(w.class).E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        String str = ((w) obj).X;
        String str2 = this.X;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            ProviderId.Companion companion = ProviderId.INSTANCE;
            zEquals = str2.equals(str);
        }
        return zEquals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.X;
        if (str == null) {
            return 0;
        }
        ProviderId.Companion companion = ProviderId.INSTANCE;
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.X;
        if (str == null) {
            str = "null";
        } else {
            ProviderId.Companion companion = ProviderId.INSTANCE;
        }
        return pc6.p("AboutSettingsState(providerId=", str, ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        String str = this.X;
        if (str == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        ProviderId.Companion companion = ProviderId.INSTANCE;
        parcel.writeString(str);
    }
}
