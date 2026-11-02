package su.happ.proxyutility.dto;

import kotlin.Metadata;
import su.happ.proxyutility.dto.enums.TypeCheck;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;", "", "Lsu/happ/proxyutility/dto/HashedDomain;", "hashedDomain", "Ljava/lang/String;", "getHashedDomain-cC-V1V8", "()Ljava/lang/String;", "Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;", "restrictedStatusResult", "Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;", "d", "()Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;", "Lsu/happ/proxyutility/dto/enums/TypeCheck;", "typeCheck", "Lsu/happ/proxyutility/dto/enums/TypeCheck;", "getTypeCheck", "()Lsu/happ/proxyutility/dto/enums/TypeCheck;", "", "isRestricted", "Z", "e", "()Z", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class CheckSubscriptionRestrictedResult {
    public static final int $stable = SubscriptionRestrictedStatus.$stable;
    private final String hashedDomain;
    private final boolean isRestricted;
    private final SubscriptionRestrictedStatus restrictedStatusResult;
    private final TypeCheck typeCheck;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CheckSubscriptionRestrictedResult(String str, SubscriptionRestrictedStatus subscriptionRestrictedStatus, TypeCheck typeCheck) {
        this.hashedDomain = str;
        this.restrictedStatusResult = subscriptionRestrictedStatus;
        this.typeCheck = typeCheck;
        boolean z = false;
        if (subscriptionRestrictedStatus != null && !subscriptionRestrictedStatus.getImport()) {
            z = true;
        }
        this.isRestricted = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHashedDomain() {
        return this.hashedDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final SubscriptionRestrictedStatus getRestrictedStatusResult() {
        return this.restrictedStatusResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TypeCheck getTypeCheck() {
        return this.typeCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SubscriptionRestrictedStatus d() {
        return this.restrictedStatusResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsRestricted() {
        return this.isRestricted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckSubscriptionRestrictedResult)) {
            return false;
        }
        CheckSubscriptionRestrictedResult checkSubscriptionRestrictedResult = (CheckSubscriptionRestrictedResult) obj;
        String str = this.hashedDomain;
        String str2 = checkSubscriptionRestrictedResult.hashedDomain;
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
        return zEquals && dh3.f(this.restrictedStatusResult, checkSubscriptionRestrictedResult.restrictedStatusResult) && this.typeCheck == checkSubscriptionRestrictedResult.typeCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.hashedDomain;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SubscriptionRestrictedStatus subscriptionRestrictedStatus = this.restrictedStatusResult;
        int iHashCode2 = (iHashCode + (subscriptionRestrictedStatus == null ? 0 : subscriptionRestrictedStatus.hashCode())) * 31;
        TypeCheck typeCheck = this.typeCheck;
        return iHashCode2 + (typeCheck != null ? typeCheck.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.hashedDomain;
        if (str == null) {
            str = "null";
        }
        return "CheckSubscriptionRestrictedResult(hashedDomain=" + str + ", restrictedStatusResult=" + this.restrictedStatusResult + ", typeCheck=" + this.typeCheck + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap su.happ.proxyutility.dto.SubscriptionRestrictedStatus:?: CAST (su.happ.proxyutility.dto.SubscriptionRestrictedStatus) (null su.happ.proxyutility.dto.SubscriptionRestrictedStatus))
  (r3v0 su.happ.proxyutility.dto.enums.TypeCheck)
 A[MD:(java.lang.String, su.happ.proxyutility.dto.SubscriptionRestrictedStatus, su.happ.proxyutility.dto.enums.TypeCheck):void (m)] (LINE:23) call: su.happ.proxyutility.dto.CheckSubscriptionRestrictedResult.<init>(java.lang.String, su.happ.proxyutility.dto.SubscriptionRestrictedStatus, su.happ.proxyutility.dto.enums.TypeCheck):void type: THIS */
    public /* synthetic */ CheckSubscriptionRestrictedResult(String str, TypeCheck typeCheck, int i) {
        this((i & 1) != 0 ? null : str, (SubscriptionRestrictedStatus) null, typeCheck);
    }
}
