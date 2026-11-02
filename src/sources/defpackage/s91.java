package defpackage;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.c2;
import io.sentry.m1;
import io.sentry.p;
import io.sentry.s5;
import io.sentry.time.c;
import io.sentry.transport.o;
import io.sentry.util.a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s91 implements Closeable {
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;
    public Object f0;
    public Object g0;
    public Object h0;
    public Object i0;

    public s91(c cVar, SentryAndroidOptions sentryAndroidOptions) {
        this.X = (byte) 1;
        this.f0 = new ConcurrentHashMap();
        this.g0 = new CopyOnWriteArrayList();
        this.h0 = new ArrayList();
        this.i0 = new a();
        this.Y = cVar;
        this.Z = sentryAndroidOptions;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.X) {
            case 0:
                ((wr6) ((v06) this.f0).get()).close();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.h0;
                a aVar = (a) this.i0;
                aVar.g();
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Future) it.next()).cancel(false);
                    }
                    arrayList.clear();
                    aVar.close();
                    ((CopyOnWriteArrayList) this.g0).clear();
                    return;
                } catch (Throwable th) {
                    try {
                        aVar.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    public void g(p pVar, io.sentry.time.a aVar) {
        long j = aVar.b;
        c cVar = aVar.a;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.Z;
        ArrayList arrayList = (ArrayList) this.h0;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f0;
        io.sentry.time.a aVar2 = (io.sentry.time.a) concurrentHashMap.get(pVar);
        long j2 = 0;
        if (aVar2 != null) {
            c cVar2 = aVar2.a;
            if (cVar != cVar2) {
                c2.k("Cannot compare deadlines from different tickers: ", cVar.getClass().getName(), " and ", cVar2.getClass().getName());
                return;
            } else if (j - aVar2.b <= 0) {
                return;
            }
        }
        concurrentHashMap.put(pVar, aVar);
        Iterator it = ((CopyOnWriteArrayList) this.g0).iterator();
        while (it.hasNext()) {
            ((o) it.next()).p(this);
        }
        a aVar3 = (a) this.i0;
        aVar3.g();
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((Future) it2.next()).isDone()) {
                    it2.remove();
                }
            }
            try {
                m1 timerExecutorService = sentryAndroidOptions.getTimerExecutorService();
                io.sentry.android.core.internal.modules.a aVar4 = new io.sentry.android.core.internal.modules.a((Object) this, (byte) 5);
                long jA = j - cVar.a();
                if (jA > 0) {
                    long j3 = jA / 1000000;
                    j2 = jA % 1000000 == 0 ? j3 : j3 + 1;
                }
                arrayList.add(timerExecutorService.b(aVar4, j2));
            } catch (RejectedExecutionException e) {
                sentryAndroidOptions.getLogger().e(s5.WARNING, "Failed to schedule rate limit lifted notification.", e);
            }
            aVar3.close();
        } catch (Throwable th) {
            try {
                aVar3.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean k(p pVar) {
        io.sentry.time.a aVar;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f0;
        io.sentry.time.a aVar2 = (io.sentry.time.a) concurrentHashMap.get(p.All);
        if (aVar2 == null || aVar2.b()) {
            return (p.Unknown.equals(pVar) || (aVar = (io.sentry.time.a) concurrentHashMap.get(pVar)) == null || aVar.b()) ? false : true;
        }
        return true;
    }

    public /* synthetic */ s91() {
        this.X = (byte) 0;
    }
}
