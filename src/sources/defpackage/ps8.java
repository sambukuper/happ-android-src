package defpackage;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ps8 implements dn2 {
    public final /* synthetic */ short X;
    public final /* synthetic */ Request.Builder Y;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public /* synthetic */ ps8(long j, Request.Builder builder) {
        this.X = (int) j;
        this.Y = builder;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        long j = this.X;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder builderCache = builder.callTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).connectTimeout(j, timeUnit).cache(null);
        HappApplication happApplication = HappApplication.M0;
        return k32.i().e().a(builderCache, (int) j).build().newCall(this.Y.build()).execute();
    }
}
