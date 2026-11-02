package su.happ.proxyutility.domain.sub;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cn7;
import defpackage.dh3;
import defpackage.lg7;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0002\b\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lsu/happ/proxyutility/domain/sub/SubId;", "Landroid/os/Parcelable;", _UrlKt.FRAGMENT_ENCODE_SET, "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "cn7", "bn7", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SubId implements Parcelable {
    private static final String EMPTY = "";
    public static final String SERVER_LIST_NAME = "Server-List";
    private final String value;
    public static final cn7 Companion = new cn7();
    public static final Parcelable.Creator<SubId> CREATOR = new lg7(1);

    public /* synthetic */ SubId(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SubId) && dh3.f(this.value, ((SubId) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
