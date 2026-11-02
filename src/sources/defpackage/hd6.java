package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hd6 extends v2 {
    public static final Parcelable.Creator<hd6> CREATOR = new dh5((byte) 24);
    public final Bundle X;
    public vt Y;

    public hd6(Bundle bundle) {
        this.X = bundle;
    }

    public final HashMap c() {
        if (this.Y == null) {
            vt vtVar = new vt(0);
            Bundle bundle = this.X;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        vtVar.put(str, str2);
                    }
                }
            }
            this.Y = vtVar;
        }
        return new HashMap(this.Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.l0(parcel, 2, this.X);
        mb6.t0(parcel, iS0);
    }
}
