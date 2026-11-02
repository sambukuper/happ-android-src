package defpackage;

import com.google.android.gms.common.api.Status;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class pn extends Exception {
    public final Status X;

    public pn(Status status) {
        int i = status.X;
        String str = status.Y;
        str = str == null ? _UrlKt.FRAGMENT_ENCODE_SET : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.X = status;
    }
}
