package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.fv8;
import defpackage.gv8;
import defpackage.hv8;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(fv8 fv8Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        hv8 hv8VarH = remoteActionCompat.a;
        boolean z = true;
        if (fv8Var.e(1)) {
            hv8VarH = fv8Var.h();
        }
        remoteActionCompat.a = (IconCompat) hv8VarH;
        CharSequence charSequence = remoteActionCompat.b;
        if (fv8Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((gv8) fv8Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (fv8Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((gv8) fv8Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) fv8Var.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (fv8Var.e(5)) {
            z2 = ((gv8) fv8Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!fv8Var.e(6)) {
            z = z3;
        } else if (((gv8) fv8Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, fv8 fv8Var) {
        fv8Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        fv8Var.i(1);
        fv8Var.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        fv8Var.i(2);
        Parcel parcel = ((gv8) fv8Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        fv8Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        fv8Var.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        fv8Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        fv8Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
