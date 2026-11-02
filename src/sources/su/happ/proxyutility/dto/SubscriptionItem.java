package su.happ.proxyutility.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b12;
import defpackage.gq6;
import defpackage.ss8;
import java.util.Map;
import kotlin.Metadata;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.enums.TypeCheck;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002_^R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u0016\u0010\u001f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\"\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010(\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'\"\u0004\b*\u0010+R(\u0010,\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010\u0010\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010\u0014R\"\u00101\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0010\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b2\u0010\u0014R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0004\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR$\u00107\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b%\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00108\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R$\u0010?\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010E\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010@\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010\u0004R\u0016\u0010R\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\u0010R\u0014\u0010S\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0010R\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010\u0004R\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010\u0004R\u0016\u0010X\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010\u0010R$\u0010Y\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010@\u001a\u0004\bZ\u0010B\"\u0004\b[\u0010DR\u0017\u0010\\\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\\\u0010\u0010\u001a\u0004\b]\u0010\u0012¨\u0006`"}, d2 = {"Lsu/happ/proxyutility/dto/SubscriptionItem;", "Landroid/os/Parcelable;", "", "url", "Ljava/lang/String;", "X", "()Ljava/lang/String;", "w0", "(Ljava/lang/String;)V", "originUrl", "Q", "Lsu/happ/proxyutility/dto/HWID;", "hwidLink", "I", "", "encryptedUrl", "Z", "u", "()Z", "j0", "(Z)V", "Lb12;", "encryptedUrlMode", "Lb12;", "y", "()Lb12;", "k0", "(Lb12;)V", "enabled", "getEnabled", "h0", "_hideSettings", "encrypted", "p", "i0", "", "addedTime", "J", "k", "()J", "lastUpdated", "O", "setLastUpdated", "(J)V", "autoUpdate", "l", "g0", "getAutoUpdate$annotations", "()V", "isExpand", "l0", "Lsu/happ/proxyutility/dto/InstallId;", "installId", "M", "q0", "import", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "o0", "(Ljava/lang/Boolean;)V", "importTryAdd", "K", "p0", "extraCheckTimestampMs", "Ljava/lang/Long;", "B", "()Ljava/lang/Long;", "m0", "(Ljava/lang/Long;)V", "extraCheckFailureTimestampMs", "getExtraCheckFailureTimestampMs", "setExtraCheckFailureTimestampMs", "Lsu/happ/proxyutility/dto/SubscriptionItem$Status;", "status", "Lsu/happ/proxyutility/dto/SubscriptionItem$Status;", "Lsu/happ/proxyutility/dto/enums/TypeCheck;", "typeCheck", "Lsu/happ/proxyutility/dto/enums/TypeCheck;", "Lsu/happ/proxyutility/dto/MetaParams;", "metaParams", "Lsu/happ/proxyutility/dto/MetaParams;", "remarks", "manualEnterTitle", "manualSendHwidInCookie", "Lsu/happ/proxyutility/dto/ProviderId;", "providerId", "Lsu/happ/proxyutility/dto/HashedDomain;", "hashedDomain", "firstRun", "lastCheckUpdate", "N", "setLastCheckUpdate", "resetHandled", "S", "Companion", "Status", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class SubscriptionItem implements Parcelable {
    public static final int $stable = 8;
    private static final int EXPIRE_REMINDER_TIME = 259200000;
    private boolean _hideSettings;
    private final long addedTime;
    private boolean autoUpdate;
    private boolean enabled;
    private boolean encrypted;
    private boolean encryptedUrl;
    private b12 encryptedUrlMode;
    private Long extraCheckFailureTimestampMs;
    private Long extraCheckTimestampMs;
    private boolean firstRun;
    private String hashedDomain;
    private final String hwidLink;
    private Boolean import;
    private Boolean importTryAdd;
    private String installId;
    private boolean isExpand;
    private Long lastCheckUpdate;
    private long lastUpdated;
    private boolean manualEnterTitle;
    private final boolean manualSendHwidInCookie;

    @p37("headerMetaParams")
    private MetaParams metaParams;
    private final String originUrl;
    private String providerId;
    private String remarks;
    private final boolean resetHandled;
    private Status status;
    private TypeCheck typeCheck;
    private String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<SubscriptionItem> CREATOR = new Creator();

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/dto/SubscriptionItem$Companion;", "", "", "EXPIRE_REMINDER_TIME", "I", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static Status a(int i) {
            if (i == 0) {
                return Status.BASIC;
            }
            if (i != 1) {
                return null;
            }
            return Status.EXTRA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(k = 3, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 1328)
    public static final class Creator implements Parcelable.Creator<SubscriptionItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Code duplicated, block: B:101:0x019c  */
        /* JADX WARN: Code duplicated, block: B:104:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:105:0x01ab  */
        /* JADX WARN: Code duplicated, block: B:109:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:112:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:113:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:97:0x018b  */
        /* JADX WARN: Code duplicated, block: B:99:0x0190  */
        @Override // android.os.Parcelable.Creator
        public final SubscriptionItem createFromParcel(Parcel parcel) {
            HWID hwidCreateFromParcel;
            InstallId installIdCreateFromParcel;
            Object objValueOf;
            Boolean boolValueOf;
            Object obj;
            String value;
            String str;
            HashedDomain hashedDomainCreateFromParcel;
            String value2;
            boolean z;
            Long lValueOf;
            Long l;
            boolean z2;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String value3 = (parcel.readInt() == 0 || (hwidCreateFromParcel = HWID.CREATOR.createFromParcel(parcel)) == null) ? null : hwidCreateFromParcel.getValue();
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            b12 b12VarCreateFromParcel = parcel.readInt() == 0 ? null : b12.CREATOR.createFromParcel(parcel);
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z3 = true;
            }
            if (parcel.readInt() == 0) {
                z4 = z3;
            }
            b12 b12Var = b12VarCreateFromParcel;
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            boolean z7 = parcel.readInt() != 0;
            boolean z8 = parcel.readInt() != 0;
            String value4 = (parcel.readInt() == 0 || (installIdCreateFromParcel = InstallId.CREATOR.createFromParcel(parcel)) == null) ? lValueOf : installIdCreateFromParcel.getValue();
            if (parcel.readInt() == 0) {
                objValueOf = lValueOf;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf = lValueOf;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object objValueOf2 = parcel.readInt() == 0 ? lValueOf : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? lValueOf : Long.valueOf(parcel.readLong());
            Object obj2 = parcel.readInt() == 0 ? lValueOf : (Status) Status.CREATOR.createFromParcel(parcel);
            TypeCheck typeCheckValueOf = parcel.readInt() == 0 ? lValueOf : TypeCheck.valueOf(parcel.readString());
            Object obj3 = parcel.readInt() == 0 ? lValueOf : (MetaParams) MetaParams.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            boolean z9 = parcel.readInt() != 0;
            boolean z10 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                obj = obj3;
                ProviderId providerIdCreateFromParcel = ProviderId.CREATOR.createFromParcel(parcel);
                if (providerIdCreateFromParcel != null) {
                    value = providerIdCreateFromParcel.getValue();
                }
                if (parcel.readInt() == 0) {
                    str = value;
                    hashedDomainCreateFromParcel = HashedDomain.CREATOR.createFromParcel(parcel);
                    if (hashedDomainCreateFromParcel != null) {
                        value2 = hashedDomainCreateFromParcel.getValue();
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        lValueOf = Long.valueOf(parcel.readLong());
                    }
                    if (parcel.readInt() != 0) {
                        z2 = true;
                        l = lValueOf;
                    } else {
                        l = lValueOf;
                        z2 = false;
                    }
                    return new SubscriptionItem(string, string2, value3, z5, b12Var, z6, z3, z4, j, j2, z7, z8, value4, objValueOf, boolValueOf, objValueOf2, lValueOf2, obj2, typeCheckValueOf, obj, string3, z9, z10, str, value2, z, l, z2);
                }
                str = value;
                value2 = lValueOf;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                    l = lValueOf;
                } else {
                    l = lValueOf;
                    z2 = false;
                }
                return new SubscriptionItem(string, string2, value3, z5, b12Var, z6, z3, z4, j, j2, z7, z8, value4, objValueOf, boolValueOf, objValueOf2, lValueOf2, obj2, typeCheckValueOf, obj, string3, z9, z10, str, value2, z, l, z2);
            }
            obj = obj3;
            value = null;
            if (parcel.readInt() == 0) {
                str = value;
                hashedDomainCreateFromParcel = HashedDomain.CREATOR.createFromParcel(parcel);
                if (hashedDomainCreateFromParcel != null) {
                    value2 = hashedDomainCreateFromParcel.getValue();
                }
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                    l = lValueOf;
                } else {
                    l = lValueOf;
                    z2 = false;
                }
                return new SubscriptionItem(string, string2, value3, z5, b12Var, z6, z3, z4, j, j2, z7, z8, value4, objValueOf, boolValueOf, objValueOf2, lValueOf2, obj2, typeCheckValueOf, obj, string3, z9, z10, str, value2, z, l, z2);
            }
            str = value;
            value2 = lValueOf;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                z2 = true;
                l = lValueOf;
            } else {
                l = lValueOf;
                z2 = false;
            }
            return new SubscriptionItem(string, string2, value3, z5, b12Var, z6, z3, z4, j, j2, z7, z8, value4, objValueOf, boolValueOf, objValueOf2, lValueOf2, obj2, typeCheckValueOf, obj, string3, z9, z10, str, value2, z, l, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final SubscriptionItem[] newArray(int i) {
            return new SubscriptionItem[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/dto/SubscriptionItem$Status;", "Landroid/os/Parcelable;", "", "BASIC", "EXTRA", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final class Status implements Parcelable {
        private static final /* synthetic */ l22 $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status BASIC;
        public static final Parcelable.Creator<Status> CREATOR;
        public static final Status EXTRA;

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(k = 3, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 1328)
        public static final class Creator implements Parcelable.Creator<Status> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final Status createFromParcel(Parcel parcel) {
                parcel.getClass();
                return Status.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final Status[] newArray(int i) {
                return new Status[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            Status status = new Status("BASIC", 0);
            BASIC = status;
            Status status2 = new Status("EXTRA", 1);
            EXTRA = status2;
            Status[] statusArr = {status, status2};
            $VALUES = statusArr;
            $ENTRIES = new n22(statusArr);
            CREATOR = new Creator();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static Status[] values() {
            return (Status[]) $VALUES.clone();
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

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(k = 3, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 1328)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.EXTRA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.BASIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SubscriptionItem(String str, String str2, String str3, boolean z, b12 b12Var, boolean z2, boolean z3, boolean z4, long j, long j2, boolean z5, boolean z6, String str4, Boolean bool, Boolean bool2, Long l, Long l2, Status status, TypeCheck typeCheck, MetaParams metaParams, String str5, boolean z7, boolean z8, String str6, String str7, boolean z9, Long l3, boolean z10) {
        str.getClass();
        str5.getClass();
        this.url = str;
        this.originUrl = str2;
        this.hwidLink = str3;
        this.encryptedUrl = z;
        this.encryptedUrlMode = b12Var;
        this.enabled = z2;
        this._hideSettings = z3;
        this.encrypted = z4;
        this.addedTime = j;
        this.lastUpdated = j2;
        this.autoUpdate = z5;
        this.isExpand = z6;
        this.installId = str4;
        this.import = bool;
        this.importTryAdd = bool2;
        this.extraCheckTimestampMs = l;
        this.extraCheckFailureTimestampMs = l2;
        this.status = status;
        this.typeCheck = typeCheck;
        this.metaParams = metaParams;
        this.remarks = str5;
        this.manualEnterTitle = z7;
        this.manualSendHwidInCookie = z8;
        this.providerId = str6;
        this.hashedDomain = str7;
        this.firstRun = z9;
        this.lastCheckUpdate = l3;
        this.resetHandled = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SubscriptionItem d(SubscriptionItem subscriptionItem, long j, boolean z, MetaParams metaParams, boolean z2, Long l, int i) {
        String str = subscriptionItem.url;
        String str2 = subscriptionItem.originUrl;
        String str3 = subscriptionItem.hwidLink;
        boolean z3 = subscriptionItem.encryptedUrl;
        b12 b12Var = subscriptionItem.encryptedUrlMode;
        boolean z4 = subscriptionItem.enabled;
        boolean z5 = subscriptionItem._hideSettings;
        boolean z6 = subscriptionItem.encrypted;
        long j2 = subscriptionItem.addedTime;
        long j3 = (i & 512) != 0 ? subscriptionItem.lastUpdated : j;
        boolean z7 = subscriptionItem.autoUpdate;
        boolean z8 = (i & 2048) != 0 ? subscriptionItem.isExpand : z;
        String str4 = subscriptionItem.installId;
        Boolean bool = subscriptionItem.import;
        Boolean bool2 = subscriptionItem.importTryAdd;
        Long l2 = subscriptionItem.extraCheckTimestampMs;
        Long l3 = subscriptionItem.extraCheckFailureTimestampMs;
        Status status = subscriptionItem.status;
        TypeCheck typeCheck = subscriptionItem.typeCheck;
        MetaParams metaParams2 = (i & 524288) != 0 ? subscriptionItem.metaParams : metaParams;
        String str5 = subscriptionItem.remarks;
        boolean z9 = subscriptionItem.manualEnterTitle;
        boolean z10 = (i & 4194304) != 0 ? subscriptionItem.manualSendHwidInCookie : z2;
        String str6 = subscriptionItem.providerId;
        String str7 = subscriptionItem.hashedDomain;
        boolean z11 = subscriptionItem.firstRun;
        Long l4 = (i & 67108864) != 0 ? subscriptionItem.lastCheckUpdate : l;
        boolean z12 = (i & 134217728) != 0 ? subscriptionItem.resetHandled : true;
        str.getClass();
        str5.getClass();
        return new SubscriptionItem(str, str2, str3, z3, b12Var, z4, z5, z6, j2, j3, z7, z8, str4, bool, bool2, l2, l3, status, typeCheck, metaParams2, str5, z9, z10, str6, str7, z11, l4, z12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void s0(MetaParams metaParams, MetaParams metaParams2, aa6 aa6Var, StringBuilder sb, String str, p05 p05Var) {
        if (dh3.f(metaParams != null ? p05Var.get(metaParams) : null, metaParams2 != null ? p05Var.get(metaParams2) : null)) {
            return;
        }
        if ((metaParams2 != null ? p05Var.get(metaParams2) : null) == null) {
            aa6Var.X = true;
        }
        sb.append(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void u0(SubscriptionItem subscriptionItem, Status status, TypeCheck typeCheck, int i) {
        if ((i & 4) != 0) {
            typeCheck = null;
        }
        long jA = we3.a.a().a();
        Long l = subscriptionItem.extraCheckFailureTimestampMs;
        int i2 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i2 == 1) {
            subscriptionItem.status = Status.EXTRA;
            subscriptionItem.extraCheckFailureTimestampMs = null;
            Long lValueOf = subscriptionItem.extraCheckTimestampMs;
            if (lValueOf == null) {
                lValueOf = Long.valueOf(jA);
            }
            subscriptionItem.extraCheckTimestampMs = lValueOf;
            if (typeCheck == null) {
                typeCheck = subscriptionItem.typeCheck;
            }
            subscriptionItem.typeCheck = typeCheck;
            return;
        }
        if (i2 == 2 && l == null) {
            Status status2 = subscriptionItem.status;
            Status status3 = Status.EXTRA;
            if (status2 == status3) {
                subscriptionItem.status = status3;
                subscriptionItem.extraCheckFailureTimestampMs = Long.valueOf(jA);
                Long lValueOf2 = subscriptionItem.extraCheckTimestampMs;
                if (lValueOf2 == null) {
                    lValueOf2 = Long.valueOf(jA);
                }
                subscriptionItem.extraCheckTimestampMs = lValueOf2;
                return;
            }
        }
        if (i2 == 2 && l != null && jA - l.longValue() <= 86400000) {
            Status status4 = subscriptionItem.status;
            Status status5 = Status.EXTRA;
            if (status4 == status5) {
                subscriptionItem.status = status5;
                Long lValueOf3 = subscriptionItem.extraCheckTimestampMs;
                if (lValueOf3 == null) {
                    lValueOf3 = Long.valueOf(jA);
                }
                subscriptionItem.extraCheckTimestampMs = lValueOf3;
                return;
            }
        }
        if (i2 == 2) {
            subscriptionItem.status = Status.BASIC;
            subscriptionItem.extraCheckFailureTimestampMs = null;
            Long lValueOf4 = subscriptionItem.extraCheckTimestampMs;
            if (lValueOf4 == null) {
                lValueOf4 = Long.valueOf(jA);
            }
            subscriptionItem.extraCheckTimestampMs = lValueOf4;
            return;
        }
        if (i2 != -1) {
            b61.c();
            return;
        }
        Long lValueOf5 = subscriptionItem.extraCheckTimestampMs;
        if (lValueOf5 == null) {
            lValueOf5 = Long.valueOf(jA);
        }
        subscriptionItem.extraCheckTimestampMs = lValueOf5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B, reason: from getter */
    public final Long getExtraCheckTimestampMs() {
        return this.extraCheckTimestampMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C, reason: from getter */
    public final TypeCheck getTypeCheck() {
        return this.typeCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String D() {
        MetaParams metaParams;
        if (!c() || (metaParams = this.metaParams) == null) {
            return null;
        }
        return metaParams.getFallbackUrl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map E() {
        MetaParams metaParams;
        if (!c() || (metaParams = this.metaParams) == null) {
            return null;
        }
        return metaParams.getFragmentBean();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getHashedDomain() {
        return this.hashedDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean G() {
        return this._hideSettings || this.encrypted || this.encryptedUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String H() {
        MetaParams metaParams;
        if (!c() || (metaParams = this.metaParams) == null) {
            return null;
        }
        return metaParams.getHost();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getHwidLink() {
        return this.hwidLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J, reason: from getter */
    public final Boolean getImport() {
        return this.import;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K, reason: from getter */
    public final Boolean getImportTryAdd() {
        return this.importTryAdd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Boolean L() {
        MetaParams metaParams;
        if (!c() || (metaParams = this.metaParams) == null) {
            return null;
        }
        return metaParams.getInsecure();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getInstallId() {
        return this.installId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N, reason: from getter */
    public final Long getLastCheckUpdate() {
        return this.lastCheckUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P, reason: from getter */
    public final MetaParams getMetaParams() {
        return this.metaParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final String getOriginUrl() {
        return this.originUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S, reason: from getter */
    public final boolean getResetHandled() {
        return this.resetHandled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String T() {
        MetaParams metaParams;
        if (!c() || (metaParams = this.metaParams) == null) {
            return null;
        }
        return metaParams.getResolveAddress();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean U() {
        Boolean boolU0;
        MetaParams metaParams = this.metaParams;
        return (metaParams == null || (boolU0 = metaParams.getSubscriptionHwidInCookieEnable()) == null) ? this.manualSendHwidInCookie : boolU0.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean Y(String str) {
        String strE = e(str);
        int length = strE.length();
        for (int i = 0; i < length; i++) {
            if (strE.charAt(i) == '#') {
                strE = strE.substring(0, i);
                break;
            }
        }
        String strE2 = e(this.url);
        int length2 = strE2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            if (strE2.charAt(i2) == '#') {
                strE2 = strE2.substring(0, i2);
                break;
            }
        }
        String str2 = this.originUrl;
        String strSubstring = null;
        String strE3 = str2 != null ? e(str2) : null;
        if (strE3 != null) {
            int length3 = strE3.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    strSubstring = strE3;
                    break;
                }
                if (strE3.charAt(i3) == '#') {
                    strSubstring = strE3.substring(0, i3);
                    break;
                }
                i3++;
            }
        }
        return strE.equals(strE2) || strE.equals(strSubstring);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z, reason: from getter */
    public final boolean getIsExpand() {
        return this.isExpand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a0() {
        SubscriptionUserInfo subscriptionUserInfoZ0;
        MetaParams metaParams = this.metaParams;
        Long lValueOf = (metaParams == null || (subscriptionUserInfoZ0 = metaParams.getSubscriptionUserInfo()) == null) ? null : Long.valueOf(subscriptionUserInfoZ0.getExpire() * 1000);
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            long jA = we3.a.a().a();
            if (b0()) {
                MetaParams metaParams2 = this.metaParams;
                if (metaParams2 != null ? dh3.f(metaParams2.getNotificationsSubsExpire(), Boolean.TRUE) : false) {
                    long j = jLongValue - jA;
                    if (0 <= j && j < 259200001) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b0() {
        return this.status == Status.EXTRA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        Status status = this.status;
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return true;
            }
            if (i != 2) {
                b61.c();
                return false;
            }
        }
        return this.firstRun;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c0() {
        return this.typeCheck == TypeCheck.FILE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d0() {
        Long l;
        if (this.status == null || (l = this.extraCheckTimestampMs) == null) {
            return true;
        }
        return we3.a.a().a() - l.longValue() >= 86400000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e(String str) {
        b12 b12Var;
        str.getClass();
        return (!this.encryptedUrl || (b12Var = this.encryptedUrlMode) == null) ? str : i21.u(fm7.x0("happ://crypt5/", fm7.x0("happ://crypt4/", fm7.x0("happ://crypt3/", fm7.x0("happ://crypt2/", fm7.x0("happ://crypt/", str))))), b12Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0, reason: from getter */
    public final boolean getManualEnterTitle() {
        return this.manualEnterTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:105:0x0111  */
    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0085  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f9  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionItem)) {
            return false;
        }
        SubscriptionItem subscriptionItem = (SubscriptionItem) obj;
        if (!dh3.f(this.url, subscriptionItem.url) || !dh3.f(this.originUrl, subscriptionItem.originUrl)) {
            return false;
        }
        String str = this.hwidLink;
        String str2 = subscriptionItem.hwidLink;
        if (str == null) {
            if (str2 == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str2 == null) {
            zEquals = false;
        } else {
            zEquals = str.equals(str2);
        }
        if (!zEquals || this.encryptedUrl != subscriptionItem.encryptedUrl || this.encryptedUrlMode != subscriptionItem.encryptedUrlMode || this.enabled != subscriptionItem.enabled || this._hideSettings != subscriptionItem._hideSettings || this.encrypted != subscriptionItem.encrypted || this.addedTime != subscriptionItem.addedTime || this.lastUpdated != subscriptionItem.lastUpdated || this.autoUpdate != subscriptionItem.autoUpdate || this.isExpand != subscriptionItem.isExpand) {
            return false;
        }
        String str3 = this.installId;
        String str4 = subscriptionItem.installId;
        if (str3 == null) {
            if (str4 == null) {
                zEquals2 = true;
            } else {
                zEquals2 = false;
            }
        } else if (str4 == null) {
            zEquals2 = false;
        } else {
            zEquals2 = str3.equals(str4);
        }
        if (!zEquals2 || !dh3.f(this.import, subscriptionItem.import) || !dh3.f(this.importTryAdd, subscriptionItem.importTryAdd) || !dh3.f(this.extraCheckTimestampMs, subscriptionItem.extraCheckTimestampMs) || !dh3.f(this.extraCheckFailureTimestampMs, subscriptionItem.extraCheckFailureTimestampMs) || this.status != subscriptionItem.status || this.typeCheck != subscriptionItem.typeCheck || !dh3.f(this.metaParams, subscriptionItem.metaParams) || !dh3.f(this.remarks, subscriptionItem.remarks) || this.manualEnterTitle != subscriptionItem.manualEnterTitle || this.manualSendHwidInCookie != subscriptionItem.manualSendHwidInCookie) {
            return false;
        }
        String str5 = this.providerId;
        String str6 = subscriptionItem.providerId;
        if (str5 == null) {
            if (str6 == null) {
                zEquals3 = true;
            } else {
                zEquals3 = false;
            }
        } else if (str6 == null) {
            zEquals3 = false;
        } else {
            ProviderId.Companion companion = ProviderId.INSTANCE;
            zEquals3 = str5.equals(str6);
        }
        if (!zEquals3) {
            return false;
        }
        String str7 = this.hashedDomain;
        String str8 = subscriptionItem.hashedDomain;
        if (str7 == null) {
            if (str8 == null) {
                zEquals4 = true;
            } else {
                zEquals4 = false;
            }
        } else if (str8 == null) {
            zEquals4 = false;
        } else {
            zEquals4 = str7.equals(str8);
        }
        return zEquals4 && this.firstRun == subscriptionItem.firstRun && dh3.f(this.lastCheckUpdate, subscriptionItem.lastCheckUpdate) && this.resetHandled == subscriptionItem.resetHandled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f0() {
        MetaParams metaParams = this.metaParams;
        return (metaParams != null ? metaParams.getSubscriptionHwidInCookieEnable() : null) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        this.firstRun = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g0() {
        this.autoUpdate = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h0() {
        this.enabled = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.url.hashCode() * 31;
        String str = this.originUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hwidLink;
        int iF = pc6.f((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.encryptedUrl);
        b12 b12Var = this.encryptedUrlMode;
        int iF2 = pc6.f(pc6.f(p61.g(p61.g(pc6.f(pc6.f(pc6.f((iF + (b12Var == null ? 0 : b12Var.hashCode())) * 31, 31, this.enabled), 31, this._hideSettings), 31, this.encrypted), this.addedTime, 31), this.lastUpdated, 31), 31, this.autoUpdate), 31, this.isExpand);
        String str3 = this.installId;
        int iHashCode4 = (iF2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.import;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.importTryAdd;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.extraCheckTimestampMs;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.extraCheckFailureTimestampMs;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Status status = this.status;
        int iHashCode9 = (iHashCode8 + (status == null ? 0 : status.hashCode())) * 31;
        TypeCheck typeCheck = this.typeCheck;
        int iF3 = pc6.f(pc6.f(pc6.e((((iHashCode9 + (typeCheck == null ? 0 : typeCheck.hashCode())) * 31) + (this.metaParams == null ? 0 : this.metaParams.hashCode())) * 31, 31, this.remarks), 31, this.manualEnterTitle), 31, this.manualSendHwidInCookie);
        String str4 = this.providerId;
        if (str4 == null) {
            iHashCode = 0;
        } else {
            ProviderId.Companion companion = ProviderId.INSTANCE;
            iHashCode = str4.hashCode();
        }
        int i = (iF3 + iHashCode) * 31;
        String str5 = this.hashedDomain;
        int iF4 = pc6.f((i + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.firstRun);
        Long l3 = this.lastCheckUpdate;
        return Boolean.hashCode(this.resetHandled) + ((iF4 + (l3 != null ? l3.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i0(boolean z) {
        this.encrypted = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j0(boolean z) {
        this.encryptedUrl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getAddedTime() {
        return this.addedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k0(b12 b12Var) {
        this.encryptedUrlMode = b12Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l0(boolean z) {
        this.isExpand = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String m() {
        return e(this.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m0(Long l) {
        this.extraCheckTimestampMs = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n0(boolean z) {
        this._hideSettings = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o0(Boolean bool) {
        this.import = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getEncrypted() {
        return this.encrypted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p0() {
        this.importTryAdd = Boolean.FALSE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q0(String str) {
        this.installId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    public final void r0(MetaParams metaParams) {
        String strV;
        String strV0;
        String strV1;
        String str;
        MetaParams metaParams2 = this.metaParams;
        MetaParams metaParamsC = metaParams2 != null ? MetaParams.c(metaParams2, null, null, null, null, null, null, null, -1, -1, 268435455) : null;
        this.metaParams = metaParams;
        if (metaParams != null) {
            if (metaParams.getInstallId() != null) {
                String strV2 = metaParams.getInstallId();
                String str2 = this.installId;
                if (str2 == null) {
                    str2 = null;
                }
                if (!dh3.f(strV2, str2)) {
                    this.status = null;
                    this.extraCheckTimestampMs = null;
                } else if (metaParams.getProviderId() != null) {
                    strV1 = metaParams.getProviderId();
                    str = this.providerId;
                    if (str == null) {
                        str = null;
                    }
                    if (!dh3.f(strV1, str)) {
                        this.status = null;
                        this.extraCheckTimestampMs = null;
                    }
                }
            } else if (metaParams.getProviderId() != null) {
                strV1 = metaParams.getProviderId();
                str = this.providerId;
                if (str == null) {
                    str = null;
                }
                if (!dh3.f(strV1, str)) {
                    this.status = null;
                    this.extraCheckTimestampMs = null;
                }
            }
        }
        if (metaParams == null || (strV = metaParams.getInstallId()) == null) {
            strV = this.installId;
        }
        this.installId = strV;
        if (metaParams == null || (strV0 = metaParams.getProviderId()) == null) {
            strV0 = null;
        } else {
            ProviderId.Companion companion = ProviderId.INSTANCE;
        }
        this.providerId = strV0;
        StringBuilder sb = new StringBuilder();
        aa6 aa6Var = new aa6();
        s0(metaParams, metaParamsC, aa6Var, sb, "i", SubscriptionItem$setMetaParameters$3.INSTANCE);
        s0(metaParams, metaParamsC, aa6Var, sb, "r", SubscriptionItem$setMetaParameters$4.INSTANCE);
        s0(metaParams, metaParamsC, aa6Var, sb, "h", SubscriptionItem$setMetaParameters$5.INSTANCE);
        s0(metaParams, metaParamsC, aa6Var, sb, "f", SubscriptionItem$setMetaParameters$6.INSTANCE);
        String string = sb.toString();
        if (string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            char[] charArray = string.toCharArray();
            charArray.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "");
            int i = 0;
            for (char c : charArray) {
                i++;
                if (i > 1) {
                    sb2.append((CharSequence) " | ");
                }
                sb2.append(c);
            }
            sb2.append((CharSequence) "");
            String string2 = sb2.toString();
            HappApplication happApplication = HappApplication.M0;
            k32.i().d().h(new gq6(string2, aa6Var, (byte) 9));
        }
        ss8 ss8Var = ss8.a;
        Object objQ = ss8.q(this);
        if (objQ instanceof rj6) {
            objQ = null;
        }
        HashedDomain hashedDomain = (HashedDomain) objQ;
        this.hashedDomain = hashedDomain != null ? hashedDomain.getValue() : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t0(String str, String str2) {
        this.providerId = str;
        if (str2 == null) {
            str2 = this.hashedDomain;
        }
        this.hashedDomain = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        String str2 = this.url;
        String str3 = this.originUrl;
        String str4 = this.hwidLink;
        if (str4 == null) {
            str4 = "null";
        }
        boolean z = this.encryptedUrl;
        b12 b12Var = this.encryptedUrlMode;
        boolean z2 = this.enabled;
        boolean z3 = this._hideSettings;
        boolean z4 = this.encrypted;
        long j = this.addedTime;
        long j2 = this.lastUpdated;
        boolean z5 = this.autoUpdate;
        boolean z6 = this.isExpand;
        String str5 = "null";
        String str6 = this.installId;
        String str7 = str6 == null ? str5 : str6;
        Boolean bool = this.import;
        Boolean bool2 = this.importTryAdd;
        Long l = this.extraCheckTimestampMs;
        Long l2 = this.extraCheckFailureTimestampMs;
        Status status = this.status;
        TypeCheck typeCheck = this.typeCheck;
        MetaParams metaParams = this.metaParams;
        String str8 = this.remarks;
        boolean z7 = this.manualEnterTitle;
        boolean z8 = this.manualSendHwidInCookie;
        String str9 = this.providerId;
        if (str9 == null) {
            str = str5;
        } else {
            ProviderId.Companion companion = ProviderId.INSTANCE;
            str = str9;
        }
        String str10 = this.hashedDomain;
        str5 = str10 != null ? str10 : "null";
        boolean z9 = this.firstRun;
        Long l3 = this.lastCheckUpdate;
        boolean z10 = this.resetHandled;
        StringBuilder sbT = oi0.t("SubscriptionItem(url=", str2, ", originUrl=", str3, ", hwidLink=");
        sbT.append(str4);
        sbT.append(", encryptedUrl=");
        sbT.append(z);
        sbT.append(", encryptedUrlMode=");
        sbT.append(b12Var);
        sbT.append(", enabled=");
        sbT.append(z2);
        sbT.append(", _hideSettings=");
        sbT.append(z3);
        sbT.append(", encrypted=");
        sbT.append(z4);
        sbT.append(", addedTime=");
        sbT.append(j);
        sbT.append(", lastUpdated=");
        sbT.append(j2);
        sbT.append(", autoUpdate=");
        sbT.append(z5);
        sbT.append(", isExpand=");
        sbT.append(z6);
        sbT.append(", installId=");
        sbT.append(str7);
        sbT.append(", import=");
        sbT.append(bool);
        sbT.append(", importTryAdd=");
        sbT.append(bool2);
        sbT.append(", extraCheckTimestampMs=");
        sbT.append(l);
        sbT.append(", extraCheckFailureTimestampMs=");
        sbT.append(l2);
        sbT.append(", status=");
        sbT.append(status);
        sbT.append(", typeCheck=");
        sbT.append(typeCheck);
        sbT.append(", metaParams=");
        sbT.append(metaParams);
        sbT.append(", remarks=");
        sbT.append(str8);
        sbT.append(", manualEnterTitle=");
        sbT.append(z7);
        sbT.append(", manualSendHwidInCookie=");
        sbT.append(z8);
        sbT.append(", providerId=");
        sbT.append(str);
        sbT.append(", hashedDomain=");
        sbT.append(str5);
        sbT.append(", firstRun=");
        sbT.append(z9);
        sbT.append(", lastCheckUpdate=");
        sbT.append(l3);
        sbT.append(", resetHandled=");
        sbT.append(z10);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getEncryptedUrl() {
        return this.encryptedUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v0(String str, boolean z) {
        str.getClass();
        boolean z2 = this.manualEnterTitle;
        if (!z2) {
            this.manualEnterTitle = z;
            z2 = z;
        }
        if (z) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                str = this.remarks;
            }
        } else if (z2) {
            String str2 = this.remarks;
            String str3 = str2.length() > 0 ? str2 : null;
            if (str3 != null) {
                str = str3;
            }
        } else {
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                str = this.remarks;
            }
        }
        this.remarks = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w0(String str) {
        str.getClass();
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.url);
        parcel.writeString(this.originUrl);
        String str = this.hwidLink;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeInt(this.encryptedUrl ? 1 : 0);
        b12 b12Var = this.encryptedUrlMode;
        if (b12Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            b12Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this._hideSettings ? 1 : 0);
        parcel.writeInt(this.encrypted ? 1 : 0);
        parcel.writeLong(this.addedTime);
        parcel.writeLong(this.lastUpdated);
        parcel.writeInt(this.autoUpdate ? 1 : 0);
        parcel.writeInt(this.isExpand ? 1 : 0);
        String str2 = this.installId;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str2);
        }
        Boolean bool = this.import;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool);
        }
        Boolean bool2 = this.importTryAdd;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            ie2.p(parcel, 1, bool2);
        }
        Long l = this.extraCheckTimestampMs;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.extraCheckFailureTimestampMs;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            status.writeToParcel(parcel, i);
        }
        TypeCheck typeCheck = this.typeCheck;
        if (typeCheck == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(typeCheck.name());
        }
        MetaParams metaParams = this.metaParams;
        if (metaParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            metaParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.remarks);
        parcel.writeInt(this.manualEnterTitle ? 1 : 0);
        parcel.writeInt(this.manualSendHwidInCookie ? 1 : 0);
        String str3 = this.providerId;
        if (str3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ProviderId.Companion companion = ProviderId.INSTANCE;
            parcel.writeString(str3);
        }
        String str4 = this.hashedDomain;
        if (str4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str4);
        }
        parcel.writeInt(this.firstRun ? 1 : 0);
        Long l3 = this.lastCheckUpdate;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeInt(this.resetHandled ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y, reason: from getter */
    public final b12 getEncryptedUrlMode() {
        return this.encryptedUrlMode;
    }

    public SubscriptionItem(String str, int i, String str2) {
        this("", (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, false, null, true, false, false, we3.a.a().a(), -1L, true, true, null, null, null, null, null, null, null, null, "", false, false, null, null, true, null, false);
    }

    public SubscriptionItem() {
        this(null, 268435455, null);
    }
}
