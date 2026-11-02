package su.happ.proxyutility.domain.routing.entity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dh3;
import defpackage.oi0;
import defpackage.pc6;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÊ\u0001\u0002\b\u000f¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;", "Landroid/os/Parcelable;", "InvalidDeeplink", "EmptyName", "DuplicatedName", "Create", "UnknownError", "Ignored", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$EmptyName;", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Ignored;", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$InvalidDeeplink;", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;", "app", "Lsu/happ/proxyutility/util/annotation/HappModel;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface StateCreateProfile extends Parcelable {

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;", "Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;", "id", "Ljava/lang/String;", "getId-gZ1F5W8", "()Ljava/lang/String;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Create implements StateCreateProfile {
        public static final Parcelable.Creator<Create> CREATOR = new Creator();
        private final String id;

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
        public static final class Creator implements Parcelable.Creator<Create> {
            @Override // android.os.Parcelable.Creator
            public final Create createFromParcel(Parcel parcel) {
                parcel.getClass();
                String value = RouteProfileId.CREATOR.createFromParcel(parcel).getValue();
                value.getClass();
                return new Create(value);
            }

            @Override // android.os.Parcelable.Creator
            public final Create[] newArray(int i) {
                return new Create[i];
            }
        }

        public /* synthetic */ Create(String str) {
            this.id = str;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final /* synthetic */ String getId() {
            return this.id;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Create) && dh3.f(this.id, ((Create) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return pc6.p("Create(id=", this.id, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.id);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;", "Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;", "id", "Ljava/lang/String;", "e", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "name", "g", _UrlKt.FRAGMENT_ENCODE_SET, "activateInEnd", "Z", "d", "()Z", "routingSettingsJson", "k", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class DuplicatedName implements StateCreateProfile {
        public static final int $stable = 0;
        public static final Parcelable.Creator<DuplicatedName> CREATOR = new Creator();
        private final boolean activateInEnd;
        private final String id;
        private final String name;
        private final String routingSettingsJson;

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
        public static final class Creator implements Parcelable.Creator<DuplicatedName> {
            @Override // android.os.Parcelable.Creator
            public final DuplicatedName createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DuplicatedName(RouteProfileId.CREATOR.createFromParcel(parcel).getValue(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final DuplicatedName[] newArray(int i) {
                return new DuplicatedName[i];
            }
        }

        public DuplicatedName(String str, String str2, String str3, boolean z) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.name = str2;
            this.activateInEnd = z;
            this.routingSettingsJson = str3;
        }

        public static DuplicatedName c(DuplicatedName duplicatedName, boolean z, String str) {
            String str2 = duplicatedName.id;
            String str3 = duplicatedName.name;
            str2.getClass();
            str3.getClass();
            return new DuplicatedName(str2, str3, str, z);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getActivateInEnd() {
            return this.activateInEnd;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DuplicatedName)) {
                return false;
            }
            DuplicatedName duplicatedName = (DuplicatedName) obj;
            return dh3.f(this.id, duplicatedName.id) && dh3.f(this.name, duplicatedName.name) && this.activateInEnd == duplicatedName.activateInEnd && dh3.f(this.routingSettingsJson, duplicatedName.routingSettingsJson);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final int hashCode() {
            int iF = pc6.f(pc6.e(this.id.hashCode() * 31, 31, this.name), 31, this.activateInEnd);
            String str = this.routingSettingsJson;
            return iF + (str == null ? 0 : str.hashCode());
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getRoutingSettingsJson() {
            return this.routingSettingsJson;
        }

        public final String toString() {
            String str = this.id;
            String str2 = this.name;
            boolean z = this.activateInEnd;
            String str3 = this.routingSettingsJson;
            StringBuilder sbT = oi0.t("DuplicatedName(id=", str, ", name=", str2, ", activateInEnd=");
            sbT.append(z);
            sbT.append(", routingSettingsJson=");
            sbT.append(str3);
            sbT.append(")");
            return sbT.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.id);
            parcel.writeString(this.name);
            parcel.writeInt(this.activateInEnd ? 1 : 0);
            parcel.writeString(this.routingSettingsJson);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$EmptyName;", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class EmptyName implements StateCreateProfile {
        public static final int $stable = 0;
        public static final EmptyName INSTANCE = new EmptyName();
        public static final Parcelable.Creator<EmptyName> CREATOR = new Creator();

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
        public static final class Creator implements Parcelable.Creator<EmptyName> {
            @Override // android.os.Parcelable.Creator
            public final EmptyName createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return EmptyName.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final EmptyName[] newArray(int i) {
                return new EmptyName[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EmptyName);
        }

        public final int hashCode() {
            return -1522680730;
        }

        public final String toString() {
            return "EmptyName";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Ignored;", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Ignored implements StateCreateProfile {
        public static final int $stable = 0;
        public static final Ignored INSTANCE = new Ignored();
        public static final Parcelable.Creator<Ignored> CREATOR = new Creator();

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
        public static final class Creator implements Parcelable.Creator<Ignored> {
            @Override // android.os.Parcelable.Creator
            public final Ignored createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Ignored.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Ignored[] newArray(int i) {
                return new Ignored[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Ignored);
        }

        public final int hashCode() {
            return -938191040;
        }

        public final String toString() {
            return "Ignored";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$InvalidDeeplink;", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class InvalidDeeplink implements StateCreateProfile {
        public static final int $stable = 0;
        public static final InvalidDeeplink INSTANCE = new InvalidDeeplink();
        public static final Parcelable.Creator<InvalidDeeplink> CREATOR = new Creator();

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
        public static final class Creator implements Parcelable.Creator<InvalidDeeplink> {
            @Override // android.os.Parcelable.Creator
            public final InvalidDeeplink createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return InvalidDeeplink.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final InvalidDeeplink[] newArray(int i) {
                return new InvalidDeeplink[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidDeeplink);
        }

        public final int hashCode() {
            return 2038436459;
        }

        public final String toString() {
            return "InvalidDeeplink";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;", "Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class UnknownError implements StateCreateProfile {
        public static final int $stable = 0;
        public static final UnknownError INSTANCE = new UnknownError();
        public static final Parcelable.Creator<UnknownError> CREATOR = new Creator();

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
        public static final class Creator implements Parcelable.Creator<UnknownError> {
            @Override // android.os.Parcelable.Creator
            public final UnknownError createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return UnknownError.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final UnknownError[] newArray(int i) {
                return new UnknownError[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnknownError);
        }

        public final int hashCode() {
            return -1705832912;
        }

        public final String toString() {
            return "UnknownError";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
