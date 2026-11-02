package io.sentry.cache;

import io.sentry.s5;
import io.sentry.s6;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ g Y;

    public /* synthetic */ f(g gVar, byte b) {
        this.X = b;
        this.Y = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        byte b2 = 1;
        boolean z = false;
        g gVar = this.Y;
        switch (b) {
            case 0:
                ConcurrentLinkedQueue concurrentLinkedQueue = gVar.d;
                ConcurrentHashMap concurrentHashMap = gVar.c;
                AtomicBoolean atomicBoolean = gVar.e;
                try {
                    try {
                        new f(gVar, b2).run();
                        break;
                    } catch (Throwable th) {
                        gVar.a.getLogger().e(s5.ERROR, "Serialization task failed", th);
                        break;
                    }
                    atomicBoolean.set(false);
                    if (concurrentHashMap.isEmpty() && concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    gVar.k();
                    return;
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    if (!concurrentHashMap.isEmpty() || !concurrentLinkedQueue.isEmpty()) {
                        gVar.k();
                    }
                    throw th2;
                }
            default:
                s6 s6Var = gVar.a;
                ConcurrentHashMap concurrentHashMap2 = gVar.c;
                for (String str : concurrentHashMap2.keySet()) {
                    Object objRemove = concurrentHashMap2.remove(str);
                    if (objRemove != null) {
                        if (objRemove == g.g) {
                            gVar.g(str);
                        } else {
                            a.d(s6Var, objRemove, ".scope-cache", str);
                        }
                    }
                }
                io.sentry.cache.tape.g gVar2 = (io.sentry.cache.tape.g) gVar.b.a();
                while (true) {
                    Object objPoll = gVar.d.poll();
                    if (objPoll == null) {
                        if (z) {
                            try {
                                gVar2.Y();
                                return;
                            } catch (IOException e) {
                                s6Var.getLogger().e(s5.ERROR, "Failed to sync breadcrumbs file queue", e);
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        if (objPoll == g.h) {
                            gVar2.clear();
                        } else {
                            gVar2.R((io.sentry.g) objPoll);
                        }
                        z = true;
                    } catch (IOException e2) {
                        s6Var.getLogger().e(s5.ERROR, "Failed to apply breadcrumb change to file queue", e2);
                    }
                }
                break;
        }
    }
}
