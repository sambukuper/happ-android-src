package su.happ.proxyutility.domain.routing.entity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dh3;
import defpackage.ow3;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\t"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;", "Landroid/os/Parcelable;", _UrlKt.FRAGMENT_ENCODE_SET, "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "$serializer", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RouteProfileId implements Parcelable {
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<RouteProfileId> CREATOR = new Creator();

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "Low3;", "Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;", "serializer", "()Low3;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public final ow3 serializer() {
            return RouteProfileId$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
    public static final class Creator implements Parcelable.Creator<RouteProfileId> {
        @Override // android.os.Parcelable.Creator
        public final RouteProfileId createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            string.getClass();
            return new RouteProfileId(string);
        }

        @Override // android.os.Parcelable.Creator
        public final RouteProfileId[] newArray(int i) {
            return new RouteProfileId[i];
        }
    }

    public /* synthetic */ RouteProfileId(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof RouteProfileId) && dh3.f(this.value, ((RouteProfileId) obj).value);
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
