package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final String f;

    public e1(NetworkCapabilities networkCapabilities, n0 n0Var, long j) {
        io.sentry.util.b.s(networkCapabilities, "NetworkCapabilities is required");
        this.a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.c = signalStrength > -100 ? signalStrength : 0;
        this.e = networkCapabilities.hasTransport(4);
        String strU = io.sentry.android.core.internal.util.c.u(networkCapabilities);
        this.f = strU == null ? _UrlKt.FRAGMENT_ENCODE_SET : strU;
        this.d = j;
    }
}
