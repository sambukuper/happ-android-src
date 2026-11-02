package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.s5;
import io.sentry.u0;
import io.sentry.v0;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        this.a.m0.set(false);
        io.sentry.util.a aVar = this.a.h0;
        aVar.g();
        try {
            this.a.j0 = null;
            this.a.k0 = null;
            c cVar = this.a;
            cVar.l0 = io.sentry.time.a.a(cVar.f0, 2L, TimeUnit.MINUTES);
            this.a.Y.getLogger().h(s5.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
            Iterator it = this.a.g0.iterator();
            while (it.hasNext()) {
                ((v0) it.next()).u(u0.DISCONNECTED);
            }
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

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.k0 = network;
        if (this.a.m0.getAndSet(true)) {
            return;
        }
        io.sentry.util.a aVar = c.p0;
        aVar.g();
        try {
            Iterator it = c.q0.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
            }
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

    /* JADX WARN: Code duplicated, block: B:33:0x006b A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #1 {all -> 0x0075, blocks: (B:30:0x005d, B:31:0x0065, B:33:0x006b), top: B:61:0x005d }] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        u0 u0VarP;
        io.sentry.util.a aVar;
        Iterator it;
        if (network.equals(this.a.k0)) {
            NetworkCapabilities networkCapabilities2 = this.a.j0;
            int i = 0;
            if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                this.a.U(networkCapabilities);
                u0VarP = this.a.p();
                aVar = this.a.h0;
                aVar.g();
                it = this.a.g0.iterator();
                while (it.hasNext()) {
                    ((v0) it.next()).u(u0VarP);
                }
                aVar.close();
            } else if (networkCapabilities2 != null || networkCapabilities != null) {
                int[] iArr = c.s0;
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        int[] iArr2 = c.r0;
                        int length2 = iArr2.length;
                        while (true) {
                            if (i < length2) {
                                int i3 = iArr2[i];
                                if (networkCapabilities2.hasTransport(i3) == networkCapabilities.hasTransport(i3)) {
                                    i++;
                                }
                            }
                        }
                    } else {
                        int i4 = iArr[i2];
                        if (i4 == 0 || networkCapabilities2.hasCapability(i4) == networkCapabilities.hasCapability(i4)) {
                            i2++;
                        }
                    }
                    this.a.U(networkCapabilities);
                    u0VarP = this.a.p();
                    aVar = this.a.h0;
                    aVar.g();
                    try {
                        it = this.a.g0.iterator();
                        while (it.hasNext()) {
                            ((v0) it.next()).u(u0VarP);
                        }
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
            }
            io.sentry.util.a aVar2 = c.p0;
            aVar2.g();
            try {
                Iterator it2 = c.q0.iterator();
                while (it2.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it2.next()).onCapabilitiesChanged(network, networkCapabilities);
                }
                aVar2.close();
            } catch (Throwable th3) {
                try {
                    aVar2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (network.equals(this.a.k0)) {
            a();
            io.sentry.util.a aVar = c.p0;
            aVar.g();
            try {
                Iterator it = c.q0.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                }
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
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        a();
        io.sentry.util.a aVar = c.p0;
        aVar.g();
        try {
            Iterator it = c.q0.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
            }
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
}
