package okhttp3;

import defpackage.be;
import defpackage.ge1;
import defpackage.gx1;
import defpackage.lh4;
import defpackage.lx1;
import defpackage.vj8;
import kotlin.Metadata;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.RealDnsCache;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B;\b\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u0012\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\n\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lokhttp3/DnsCache;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/dns/RealDnsCache;", "-delegate", "<init>", "(Lokhttp3/internal/dns/RealDnsCache;)V", "Lgx1;", "minimumTimeToLive", "maximumTimeToLive", "failureTimeToLive", "revalidateBeforeExpire", _UrlKt.FRAGMENT_ENCODE_SET, "maxEntryCount", "(JJJJILge1;)V", "Ldn8;", "evictAll", "()V", "Lokhttp3/internal/dns/RealDnsCache;", "get-delegate$okhttp$annotations", "()J", "maxSize", "()I", "size", "networkCount", "hitCount", "requestCount", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DnsCache {
    public final RealDnsCache -delegate;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DnsCache(long j, long j2, long j3, long j4, int i, int i2, ge1 ge1Var) {
        long jL0;
        long jL1;
        long jL2;
        long jL3;
        int i3 = i2 & 1;
        lx1 lx1Var = lx1.SECONDS;
        if (i3 != 0) {
            be beVar = gx1.Y;
            jL0 = vj8.l0(10, lx1Var);
        } else {
            jL0 = j;
        }
        if ((i2 & 2) != 0) {
            be beVar2 = gx1.Y;
            jL1 = vj8.l0(300, lx1Var);
        } else {
            jL1 = j2;
        }
        if ((i2 & 4) != 0) {
            be beVar3 = gx1.Y;
            jL2 = vj8.l0(10, lx1Var);
        } else {
            jL2 = j3;
        }
        if ((i2 & 8) != 0) {
            be beVar4 = gx1.Y;
            jL3 = vj8.l0(2, lx1Var);
        } else {
            jL3 = j4;
        }
        this(jL0, jL1, jL2, jL3, (i2 & 16) != 0 ? XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax : i, null);
    }

    public final void evictAll() {
        this.-delegate.evictAll();
    }

    public final long failureTimeToLive() {
        return this.-delegate.getFailureTimeToLive();
    }

    public final int hitCount() {
        return this.-delegate.getHitCount$okhttp();
    }

    public final int maxSize() {
        return this.-delegate.getMaxSize$okhttp();
    }

    public final long maximumTimeToLive() {
        return this.-delegate.getMaximumTimeToLive();
    }

    public final long minimumTimeToLive() {
        return this.-delegate.getMinimumTimeToLive();
    }

    public final int networkCount() {
        return this.-delegate.getNetworkCount$okhttp();
    }

    public final int requestCount() {
        return this.-delegate.getRequestCount$okhttp();
    }

    public final long revalidateBeforeExpire() {
        return this.-delegate.getRevalidateBeforeExpire();
    }

    public final int size() {
        return this.-delegate.getSize$okhttp();
    }

    /* JADX INFO: renamed from: get-delegate$okhttp$annotations, reason: not valid java name */
    public static /* synthetic */ void m65getdelegate$okhttp$annotations() {
    }

    public DnsCache(RealDnsCache realDnsCache) {
        realDnsCache.getClass();
        this.-delegate = realDnsCache;
    }

    public /* synthetic */ DnsCache(long j, long j2, long j3, long j4, int i, ge1 ge1Var) {
        this(j, j2, j3, j4, i);
    }

    private DnsCache(long j, long j2, long j3, long j4, int i) {
        this(new RealDnsCache(TaskRunner.INSTANCE, lh4.J0, j, j2, j3, j4, i, null));
    }
}
