package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.sentry.ILogger;
import io.sentry.android.core.d0;
import io.sentry.android.core.g0;
import io.sentry.android.core.m0;
import io.sentry.android.core.n0;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.u0;
import io.sentry.v0;
import io.sentry.w0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements w0, d0 {
    public static volatile ConnectivityManager o0;
    public final Context X;
    public final s6 Y;
    public final n0 Z;
    public final io.sentry.time.c f0;
    public final ArrayList g0;
    public volatile b i0;
    public volatile NetworkCapabilities j0;
    public volatile Network k0;
    public volatile io.sentry.time.a l0;
    public static final io.sentry.util.a n0 = new io.sentry.util.a();
    public static final io.sentry.util.a p0 = new io.sentry.util.a();
    public static final ArrayList q0 = new ArrayList();
    public static final int[] r0 = {1, 0, 3, 2};
    public static final int[] s0 = new int[2];
    public final io.sentry.util.a h0 = new io.sentry.util.a();
    public final AtomicBoolean m0 = new AtomicBoolean(false);

    public c(Context context, s6 s6Var, n0 n0Var, io.sentry.time.c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
        this.Y = s6Var;
        this.Z = n0Var;
        this.f0 = cVar;
        this.l0 = new io.sentry.time.a(cVar, cVar.a());
        this.g0 = new ArrayList();
        int[] iArr = s0;
        iArr[0] = 12;
        iArr[1] = 16;
        J(new a(this, (byte) 0));
        g0.g0.g(this);
    }

    public static ConnectivityManager D(Context context, ILogger iLogger) {
        if (o0 != null) {
            return o0;
        }
        io.sentry.util.a aVar = n0;
        aVar.g();
        try {
            if (o0 != null) {
                ConnectivityManager connectivityManager = o0;
                aVar.close();
                return connectivityManager;
            }
            o0 = (ConnectivityManager) context.getSystemService("connectivity");
            if (o0 == null) {
                iLogger.h(s5.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = o0;
            aVar.close();
            return connectivityManager2;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String u(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    public final String C() {
        NetworkCapabilities networkCapabilities = this.j0;
        if (networkCapabilities != null) {
            return u(networkCapabilities);
        }
        Context context = this.X;
        ILogger logger = this.Y.getLogger();
        n0 n0Var = this.Z;
        ConnectivityManager connectivityManagerD = D(context, logger);
        if (connectivityManagerD != null) {
            if (!io.sentry.config.a.n(context)) {
                logger.h(s5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                n0Var.getClass();
                Network activeNetwork = connectivityManagerD.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.h(s5.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManagerD.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.h(s5.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(3);
                boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
                boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
                if (zHasTransport) {
                    return "ethernet";
                }
                if (zHasTransport2) {
                    return "wifi";
                }
                if (zHasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th) {
                logger.e(s5.ERROR, "Failed to retrieve network info", th);
                return null;
            }
        }
        return null;
    }

    @Override // io.sentry.w0
    public final void I0(v0 v0Var) {
        io.sentry.util.a aVar = this.h0;
        aVar.g();
        try {
            this.g0.remove(v0Var);
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void J(Runnable runnable) {
        s6 s6Var = this.Y;
        try {
            s6Var.getExecutorService().submit(runnable);
        } catch (Throwable th) {
            s6Var.getLogger().e(s5.ERROR, "AndroidConnectionStatusProvider submit failed", th);
        }
    }

    public final void R(boolean z) {
        io.sentry.util.a aVar = this.h0;
        aVar.g();
        if (z) {
            try {
                this.g0.clear();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        b bVar = this.i0;
        this.i0 = null;
        if (bVar != null) {
            Context context = this.X;
            ILogger logger = this.Y.getLogger();
            ConnectivityManager connectivityManagerD = D(context, logger);
            if (connectivityManagerD != null) {
                try {
                    connectivityManagerD.unregisterNetworkCallback(bVar);
                } catch (Throwable th3) {
                    logger.e(s5.WARNING, "unregisterNetworkCallback failed", th3);
                }
            }
        }
        this.j0 = null;
        this.k0 = null;
        io.sentry.time.c cVar = this.f0;
        this.l0 = new io.sentry.time.a(cVar, cVar.a());
        aVar.close();
        this.Y.getLogger().h(s5.DEBUG, "Network callback unregistered", new Object[0]);
    }

    public final void U(NetworkCapabilities networkCapabilities) {
        io.sentry.util.a aVar = this.h0;
        aVar.g();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        try {
            if (networkCapabilities != null) {
                this.j0 = networkCapabilities;
            } else {
                if (!io.sentry.config.a.n(this.X)) {
                    this.Y.getLogger().h(s5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.j0 = null;
                    this.l0 = io.sentry.time.a.a(this.f0, 2L, timeUnit);
                    aVar.close();
                    return;
                }
                this.Z.getClass();
                ConnectivityManager connectivityManagerD = D(this.X, this.Y.getLogger());
                if (connectivityManagerD != null) {
                    Network activeNetwork = connectivityManagerD.getActiveNetwork();
                    this.j0 = activeNetwork != null ? connectivityManagerD.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.j0 = null;
                }
            }
            this.l0 = io.sentry.time.a.a(this.f0, 2L, timeUnit);
            this.Y.getLogger().h(s5.DEBUG, "Cache updated - Status: " + p() + ", Type: " + C(), new Object[0]);
        } catch (Throwable th) {
            try {
                this.Y.getLogger().e(s5.WARNING, "Failed to update connection status cache", th);
                this.j0 = null;
                this.l0 = io.sentry.time.a.a(this.f0, 2L, timeUnit);
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        aVar.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        J(new a(this, (byte) 1));
    }

    @Override // io.sentry.android.core.d0
    public final void g() {
        if (this.i0 != null) {
            return;
        }
        J(new a(this, (byte) 3));
    }

    @Override // io.sentry.android.core.d0
    public final void k() {
        if (this.i0 == null) {
            return;
        }
        J(new a(this, (byte) 2));
    }

    public final void m() {
        if (m0.f() && this.i0 == null) {
            io.sentry.util.a aVar = this.h0;
            aVar.g();
            try {
                if (this.i0 != null) {
                    aVar.close();
                    return;
                }
                b bVar = new b(this);
                Context context = this.X;
                ILogger logger = this.Y.getLogger();
                this.Z.getClass();
                ConnectivityManager connectivityManagerD = D(context, logger);
                if (connectivityManagerD != null) {
                    if (io.sentry.config.a.n(context)) {
                        try {
                            connectivityManagerD.registerDefaultNetworkCallback(bVar);
                            this.i0 = bVar;
                            this.Y.getLogger().h(s5.DEBUG, "Network callback registered successfully", new Object[0]);
                        } catch (Throwable th) {
                            logger.e(s5.WARNING, "registerDefaultNetworkCallback failed", th);
                            this.Y.getLogger().h(s5.WARNING, "Failed to register network callback", new Object[0]);
                        }
                        aVar.close();
                    }
                    logger.h(s5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                }
                this.Y.getLogger().h(s5.WARNING, "Failed to register network callback", new Object[0]);
                aVar.close();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.w0
    public final u0 n0() {
        if (this.l0.b()) {
            U(null);
        }
        return p();
    }

    public final u0 p() {
        if (this.j0 != null) {
            NetworkCapabilities networkCapabilities = this.j0;
            if (networkCapabilities != null) {
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                this.Z.getClass();
                if (zHasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i : r0) {
                        if (networkCapabilities.hasTransport(i)) {
                            return u0.CONNECTED;
                        }
                    }
                }
            }
            return u0.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerD = D(this.X, this.Y.getLogger());
        if (connectivityManagerD == null) {
            return u0.UNKNOWN;
        }
        Context context = this.X;
        ILogger logger = this.Y.getLogger();
        if (!io.sentry.config.a.n(context)) {
            logger.h(s5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return u0.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerD.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? u0.CONNECTED : u0.DISCONNECTED;
            }
            logger.h(s5.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return u0.DISCONNECTED;
        } catch (Throwable th) {
            logger.e(s5.WARNING, "Could not retrieve Connection Status", th);
            return u0.UNKNOWN;
        }
    }

    @Override // io.sentry.w0
    public final boolean s0(v0 v0Var) {
        io.sentry.util.a aVar = this.h0;
        aVar.g();
        try {
            this.g0.add(v0Var);
            aVar.close();
            m();
            return this.i0 != null;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.w0
    public final String y() {
        if (this.l0.b()) {
            U(null);
        }
        return C();
    }
}
