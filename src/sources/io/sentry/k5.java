package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k5 {
    public final z a;

    public static io.sentry.protocol.v c(Throwable th, io.sentry.protocol.o oVar, Long l, List list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        io.sentry.protocol.v vVar = new io.sentry.protocol.v();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", _UrlKt.FRAGMENT_ENCODE_SET);
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.c0 c0Var = new io.sentry.protocol.c0(list);
            if (z) {
                c0Var.Z = Boolean.TRUE;
            }
            vVar.g0 = c0Var;
        }
        vVar.f0 = l;
        vVar.X = name;
        vVar.h0 = oVar;
        vVar.Z = name2;
        vVar.Y = message;
        return vVar;
    }

    public void a(Throwable th, AtomicInteger atomicInteger, HashSet hashSet, ArrayDeque arrayDeque, String str) {
        Thread threadCurrentThread;
        io.sentry.protocol.o oVar;
        boolean z;
        int iIncrementAndGet = atomicInteger.get();
        String str2 = str;
        while (th != null && hashSet.add(th)) {
            if (str2 == null) {
                str2 = "chained";
            }
            if (th instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) th;
                io.sentry.protocol.o oVar2 = aVar.X;
                Throwable th2 = aVar.Y;
                threadCurrentThread = aVar.Z;
                z = aVar.f0;
                th = th2;
                oVar = oVar2;
            } else {
                io.sentry.protocol.o oVar3 = new io.sentry.protocol.o();
                threadCurrentThread = Thread.currentThread();
                oVar = oVar3;
                z = false;
            }
            io.sentry.protocol.v vVarC = c(th, oVar, threadCurrentThread != null ? Long.valueOf(threadCurrentThread.getId()) : null, this.a.b(th.getStackTrace(), Boolean.FALSE.equals(oVar.f0)), z);
            ArrayDeque arrayDeque2 = arrayDeque;
            arrayDeque2.addFirst(vVarC);
            if (oVar.X == null) {
                oVar.X = str2;
            }
            if (atomicInteger.get() >= 0) {
                oVar.k0 = Integer.valueOf(iIncrementAndGet);
            }
            iIncrementAndGet = atomicInteger.incrementAndGet();
            oVar.j0 = Integer.valueOf(iIncrementAndGet);
            Throwable[] suppressed = th.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                int i = 0;
                while (i < length) {
                    a(suppressed[i], atomicInteger, hashSet, arrayDeque2, "suppressed");
                    i++;
                    arrayDeque2 = arrayDeque;
                }
            }
            th = th.getCause();
            str2 = null;
        }
    }

    public ArrayList b(Map map, ArrayList arrayList, boolean z, boolean z2) {
        ArrayList arrayListB;
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z3 = (thread == threadCurrentThread && !z) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            io.sentry.protocol.e0 e0Var = new io.sentry.protocol.e0();
            e0Var.Z = thread2.getName();
            e0Var.Y = Integer.valueOf(thread2.getPriority());
            e0Var.X = Long.valueOf(thread2.getId());
            e0Var.i0 = Boolean.valueOf(thread2.isDaemon());
            e0Var.f0 = thread2.getState().name();
            e0Var.g0 = Boolean.valueOf(z3);
            if (z2 && (arrayListB = this.a.b(stackTraceElementArr, false)) != null && !arrayListB.isEmpty()) {
                io.sentry.protocol.c0 c0Var = new io.sentry.protocol.c0(arrayListB);
                c0Var.Z = Boolean.TRUE;
                e0Var.k0 = c0Var;
            }
            arrayList2.add(e0Var);
        }
        return arrayList2;
    }
}
