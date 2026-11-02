package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.android.core.g0;
import io.sentry.u0;
import io.sentry.v0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ c Y;

    public /* synthetic */ a(c cVar, byte b) {
        this.X = b;
        this.Y = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        c cVar = this.Y;
        switch (b) {
            case 0:
                cVar.m();
                return;
            case 1:
                cVar.R(true);
                io.sentry.util.a aVar = c.p0;
                aVar.g();
                try {
                    c.q0.clear();
                    aVar.close();
                    io.sentry.util.a aVar2 = c.n0;
                    aVar2.g();
                    try {
                        c.o0 = null;
                        aVar2.close();
                        g0.g0.p(cVar);
                        return;
                    } catch (Throwable th) {
                        try {
                            aVar2.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        aVar.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 2:
                cVar.R(false);
                return;
            default:
                cVar.U(null);
                u0 u0VarP = cVar.p();
                if (u0VarP == u0.DISCONNECTED) {
                    cVar.m0.set(false);
                    io.sentry.util.a aVar3 = c.p0;
                    aVar3.g();
                    try {
                        Iterator it = c.q0.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                        }
                        aVar3.close();
                    } catch (Throwable th5) {
                        try {
                            aVar3.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                io.sentry.util.a aVar4 = cVar.h0;
                aVar4.g();
                try {
                    Iterator it2 = cVar.g0.iterator();
                    while (it2.hasNext()) {
                        ((v0) it2.next()).u(u0VarP);
                    }
                    aVar4.close();
                    cVar.m();
                    return;
                } catch (Throwable th7) {
                    try {
                        aVar4.close();
                        break;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
        }
    }
}
