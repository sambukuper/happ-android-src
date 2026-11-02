package okhttp3.internal.ech;

import defpackage.ge1;
import defpackage.kb0;
import defpackage.kc6;
import kotlin.Metadata;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ech/EchRetryPlan;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "publicName", "Lkb0;", "configList", "<init>", "(Ljava/lang/String;Lkb0;)V", "Ljava/lang/String;", "getPublicName", "()Ljava/lang/String;", "Lkb0;", "getConfigList", "()Lkb0;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EchRetryPlan {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final kc6 INVALID_PUBLIC_NAME = new kc6("(\\..*)|(.*\\.)|((.*\\.)?[0-9]+)|((.*\\.)?0[xX][0-9a-fA-F]*)");
    private final kb0 configList;
    private final String publicName;

    private EchRetryPlan(String str, kb0 kb0Var) {
        this.publicName = str;
        this.configList = kb0Var;
    }

    public final kb0 getConfigList() {
        return this.configList;
    }

    public final String getPublicName() {
        return this.publicName;
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/ech/EchRetryPlan$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "publicName", "Lkb0;", "configList", "Lokhttp3/internal/ech/EchRetryPlan;", "getOrNull", "(Ljava/lang/String;Lkb0;)Lokhttp3/internal/ech/EchRetryPlan;", "Lkc6;", "INVALID_PUBLIC_NAME", "Lkc6;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(ge1 ge1Var) {
            this();
        }

        public final EchRetryPlan getOrNull(String publicName, kb0 configList) {
            publicName.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(publicName);
            ge1 ge1Var = null;
            if (canonicalHost == null || _HostnamesCommonKt.canParseAsIpAddress(canonicalHost) || EchRetryPlan.INVALID_PUBLIC_NAME.d(canonicalHost)) {
                return null;
            }
            return new EchRetryPlan(publicName, configList, ge1Var);
        }

        private Companion() {
        }
    }

    public /* synthetic */ EchRetryPlan(String str, kb0 kb0Var, ge1 ge1Var) {
        this(str, kb0Var);
    }
}
