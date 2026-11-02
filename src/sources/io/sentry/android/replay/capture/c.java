package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import defpackage.bw0;
import defpackage.dh3;
import defpackage.e86;
import defpackage.gn2;
import defpackage.i21;
import defpackage.nw3;
import defpackage.o76;
import defpackage.p05;
import defpackage.wv0;
import defpackage.xv0;
import io.sentry.android.replay.d0;
import io.sentry.i1;
import io.sentry.protocol.w;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t2;
import io.sentry.t6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final /* synthetic */ nw3[] u = {new p05(c.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0), new p05(c.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0), new p05(c.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0), new p05(c.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0), new p05(c.class, "currentSegment", "getCurrentSegment()I", 0), new p05(c.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0), new p05(c.class, "isFlushed", "isFlushed()Z", 0)};
    public final s6 a;
    public final i1 b;
    public final io.sentry.transport.f c;
    public final ScheduledExecutorService d;
    public final ScheduledExecutorService e;
    public final e86 f;
    public final AtomicBoolean g;
    public io.sentry.android.replay.l h;
    public final a i;
    public final a j;
    public final AtomicLong k;
    public final a l;
    public final a m;
    public final a n;
    public final a o;
    public final a p;
    public final ConcurrentLinkedDeque q;
    public final Object r;
    public final LinkedHashSet s;
    public final LinkedHashSet t;

    public c(s6 s6Var, i1 i1Var, io.sentry.transport.f fVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        s6Var.getClass();
        scheduledExecutorService.getClass();
        scheduledExecutorService2.getClass();
        this.a = s6Var;
        this.b = i1Var;
        this.c = fVar;
        this.d = scheduledExecutorService;
        this.e = scheduledExecutorService2;
        this.f = new e86(fVar);
        this.g = new AtomicBoolean(false);
        this.i = new a(this, this, (byte) 4);
        this.j = new a(this, this, (byte) 5);
        this.k = new AtomicLong();
        this.l = new a(this, this, (byte) 6);
        this.m = new a(w.Y, this, this);
        this.n = new a(this, this, (byte) 1);
        this.o = new a(this, this, (byte) 2);
        this.p = new a(this, this, (byte) 3);
        this.q = new ConcurrentLinkedDeque();
        this.r = new Object();
        this.s = new LinkedHashSet();
        this.t = new LinkedHashSet();
    }

    public static k c(c cVar, long j, Date date, w wVar, int i, int i2, int i3, int i4, int i5) {
        List listY0;
        List listY1;
        a aVar = cVar.o;
        nw3[] nw3VarArr = u;
        t6 t6Var = (t6) aVar.a(nw3VarArr[5], cVar);
        io.sentry.android.replay.l lVar = cVar.h;
        String str = (String) cVar.l.a(nw3VarArr[2], cVar);
        ConcurrentLinkedDeque concurrentLinkedDeque = cVar.q;
        wVar.getClass();
        t6Var.getClass();
        concurrentLinkedDeque.getClass();
        synchronized (cVar.r) {
            listY0 = wv0.Y0(cVar.s);
            listY1 = wv0.Y0(cVar.t);
            cVar.s.clear();
            cVar.t.clear();
        }
        return h.a(cVar.b, cVar.a, j, date, wVar, i, i2, i3, t6Var, lVar, i4, i5, str, null, concurrentLinkedDeque, listY0, listY1);
    }

    public abstract void a(gn2 gn2Var, boolean z);

    public final w d() {
        return (w) this.m.a(u[3], this);
    }

    public final int e() {
        return ((Number) this.n.a(u[4], this)).intValue();
    }

    public final d0 f() {
        return (d0) this.i.a(u[0], this);
    }

    public abstract void g(d0 d0Var);

    public abstract void h(io.sentry.android.replay.w wVar);

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX WARN: Code duplicated, block: B:47:0x0163  */
    /* JADX WARN: Code duplicated, block: B:50:0x0174  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b3  */
    public void i(MotionEvent motionEvent) {
        int pointerId;
        int iFindPointerIndex;
        List listK;
        List list;
        int pointerId2;
        int iFindPointerIndex2;
        List listK2;
        long j;
        List listK3;
        d0 d0VarF = f();
        if (d0VarF != null) {
            e86 e86Var = this.f;
            io.sentry.transport.f fVar = (io.sentry.transport.f) e86Var.f0;
            LinkedHashMap linkedHashMap = (LinkedHashMap) e86Var.Z;
            float f = d0VarF.d;
            float f2 = d0VarF.c;
            int actionMasked = motionEvent.getActionMasked();
            int i = 10;
            int i2 = -1;
            if (actionMasked == 0) {
                pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex != -1) {
                    list = null;
                } else {
                    linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                    io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
                    gVar.Y = fVar.d();
                    gVar.h0 = motionEvent.getX(iFindPointerIndex) * f2;
                    gVar.i0 = motionEvent.getY(iFindPointerIndex) * f;
                    gVar.g0 = 0;
                    gVar.k0 = pointerId;
                    gVar.f0 = io.sentry.rrweb.f.TouchStart;
                    listK = i21.K(gVar);
                }
            } else if (actionMasked == 1) {
                pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                if (iFindPointerIndex2 != -1) {
                    list = null;
                } else {
                    linkedHashMap.remove(Integer.valueOf(pointerId2));
                    io.sentry.rrweb.g gVar2 = new io.sentry.rrweb.g();
                    gVar2.Y = fVar.d();
                    gVar2.h0 = motionEvent.getX(iFindPointerIndex2) * f2;
                    gVar2.i0 = motionEvent.getY(iFindPointerIndex2) * f;
                    gVar2.g0 = 0;
                    gVar2.k0 = pointerId2;
                    gVar2.f0 = io.sentry.rrweb.f.TouchEnd;
                    listK2 = i21.K(gVar2);
                }
            } else if (actionMasked == 2) {
                long jD = fVar.d();
                long j2 = e86Var.Y;
                long j3 = 0;
                if (j2 == 0 || j2 + 50 <= jD) {
                    e86Var.Y = jD;
                    Set<Integer> setKeySet = linkedHashMap.keySet();
                    setKeySet.getClass();
                    for (Integer num : setKeySet) {
                        num.getClass();
                        int iFindPointerIndex3 = motionEvent.findPointerIndex(num.intValue());
                        if (iFindPointerIndex3 == i2) {
                            j = j3;
                        } else {
                            j = j3;
                            if (e86Var.X == j) {
                                e86Var.X = jD;
                            }
                            Object obj = linkedHashMap.get(num);
                            obj.getClass();
                            io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                            hVar.Y = motionEvent.getX(iFindPointerIndex3) * f2;
                            hVar.Z = motionEvent.getY(iFindPointerIndex3) * f;
                            hVar.X = 0;
                            hVar.f0 = jD - e86Var.X;
                            ((Collection) obj).add(hVar);
                        }
                        j3 = j;
                        i2 = -1;
                    }
                    long j4 = j3;
                    long j5 = jD - e86Var.X;
                    if (j5 > 500) {
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            int iIntValue = ((Number) entry.getKey()).intValue();
                            ArrayList<io.sentry.rrweb.h> arrayList2 = (ArrayList) entry.getValue();
                            if (!arrayList2.isEmpty()) {
                                io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
                                iVar.Y = jD;
                                ArrayList arrayList3 = new ArrayList(xv0.Z(arrayList2, i));
                                for (io.sentry.rrweb.h hVar2 : arrayList2) {
                                    hVar2.f0 -= j5;
                                    arrayList3.add(hVar2);
                                    iVar = iVar;
                                }
                                io.sentry.rrweb.i iVar2 = iVar;
                                iVar2.g0 = arrayList3;
                                iVar2.f0 = iIntValue;
                                arrayList.add(iVar2);
                                Object obj2 = linkedHashMap.get(Integer.valueOf(iIntValue));
                                obj2.getClass();
                                ((ArrayList) obj2).clear();
                                i = 10;
                            }
                        }
                        e86Var.X = j4;
                        list = arrayList;
                    } else {
                        list = null;
                    }
                } else {
                    list = null;
                }
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                    if (iFindPointerIndex != -1) {
                        linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                        io.sentry.rrweb.g gVar3 = new io.sentry.rrweb.g();
                        gVar3.Y = fVar.d();
                        gVar3.h0 = motionEvent.getX(iFindPointerIndex) * f2;
                        gVar3.i0 = motionEvent.getY(iFindPointerIndex) * f;
                        gVar3.g0 = 0;
                        gVar3.k0 = pointerId;
                        gVar3.f0 = io.sentry.rrweb.f.TouchStart;
                        listK = i21.K(gVar3);
                    }
                } else if (actionMasked == 6) {
                    pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                    if (iFindPointerIndex2 != -1) {
                        linkedHashMap.remove(Integer.valueOf(pointerId2));
                        io.sentry.rrweb.g gVar4 = new io.sentry.rrweb.g();
                        gVar4.Y = fVar.d();
                        gVar4.h0 = motionEvent.getX(iFindPointerIndex2) * f2;
                        gVar4.i0 = motionEvent.getY(iFindPointerIndex2) * f;
                        gVar4.g0 = 0;
                        gVar4.k0 = pointerId2;
                        gVar4.f0 = io.sentry.rrweb.f.TouchEnd;
                        listK2 = i21.K(gVar4);
                    }
                }
                list = null;
            } else {
                linkedHashMap.clear();
                io.sentry.rrweb.g gVar5 = new io.sentry.rrweb.g();
                gVar5.Y = fVar.d();
                gVar5.h0 = motionEvent.getX() * f2;
                gVar5.i0 = motionEvent.getY() * f;
                gVar5.g0 = 0;
                gVar5.k0 = 0;
                gVar5.f0 = io.sentry.rrweb.f.TouchCancel;
                listK3 = i21.K(gVar5);
            }
            if (list == null) {
                list = listK;
                list = listK2;
                list = listK3;
                return;
            } else {
                list = listK;
                list = listK2;
                list = listK3;
                bw0.d0(this.q, list);
            }
        }
    }

    public abstract void j();

    public final void k(int i) {
        nw3 nw3Var = u[4];
        Integer numValueOf = Integer.valueOf(i);
        a aVar = this.n;
        aVar.getClass();
        nw3Var.getClass();
        Object andSet = aVar.b.getAndSet(numValueOf);
        if (dh3.f(andSet, numValueOf)) {
            return;
        }
        byte b = 2;
        o76 o76Var = new o76(andSet, numValueOf, aVar.d, b);
        c cVar = aVar.c;
        s6 s6Var = cVar.a;
        if (s6Var.getThreadChecker().c()) {
            cVar.e.submit(new io.sentry.android.replay.util.h(new t2(o76Var, b), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            o76Var.invoke();
        } catch (Throwable th) {
            s6Var.getLogger().e(s5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public final void l(d0 d0Var) {
        nw3 nw3Var = u[0];
        a aVar = this.i;
        aVar.getClass();
        nw3Var.getClass();
        Object andSet = aVar.b.getAndSet(d0Var);
        if (dh3.f(andSet, d0Var)) {
            return;
        }
        b bVar = new b(andSet, d0Var, aVar.d, (byte) 0);
        c cVar = aVar.c;
        s6 s6Var = cVar.a;
        if (s6Var.getThreadChecker().c()) {
            cVar.e.submit(new io.sentry.android.replay.util.h(new t2(bVar, (byte) 5), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            bVar.invoke();
        } catch (Throwable th) {
            s6Var.getLogger().e(s5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public final void m(Date date) {
        nw3 nw3Var = u[1];
        a aVar = this.j;
        aVar.getClass();
        nw3Var.getClass();
        Object andSet = aVar.b.getAndSet(date);
        if (dh3.f(andSet, date)) {
            return;
        }
        b bVar = new b(andSet, date, aVar.d, (byte) 1);
        c cVar = aVar.c;
        s6 s6Var = cVar.a;
        if (s6Var.getThreadChecker().c()) {
            cVar.e.submit(new io.sentry.android.replay.util.h(new t2(bVar, (byte) 6), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            bVar.invoke();
        } catch (Throwable th) {
            s6Var.getLogger().e(s5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public void n(int i, w wVar, t6 t6Var) {
        wVar.getClass();
        this.h = new io.sentry.android.replay.l(this.a, wVar);
        nw3[] nw3VarArr = u;
        byte b = 3;
        nw3 nw3Var = nw3VarArr[3];
        a aVar = this.m;
        aVar.getClass();
        nw3Var.getClass();
        Object andSet = aVar.b.getAndSet(wVar);
        if (!dh3.f(andSet, wVar)) {
            byte b2 = 1;
            o76 o76Var = new o76(andSet, wVar, aVar.d, b2);
            c cVar = aVar.c;
            s6 s6Var = cVar.a;
            if (s6Var.getThreadChecker().c()) {
                cVar.e.submit(new io.sentry.android.replay.util.h(new t2(o76Var, b2), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    o76Var.invoke();
                } catch (Throwable th) {
                    s6Var.getLogger().e(s5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }
        }
        k(i);
        if (t6Var == null) {
            t6Var = this instanceof m ? t6.SESSION : t6.BUFFER;
        }
        t6Var.getClass();
        nw3 nw3Var2 = nw3VarArr[5];
        a aVar2 = this.o;
        aVar2.getClass();
        nw3Var2.getClass();
        Object andSet2 = aVar2.b.getAndSet(t6Var);
        if (!dh3.f(andSet2, t6Var)) {
            o76 o76Var2 = new o76(andSet2, t6Var, aVar2.d, b);
            c cVar2 = aVar2.c;
            s6 s6Var2 = cVar2.a;
            if (s6Var2.getThreadChecker().c()) {
                cVar2.e.submit(new io.sentry.android.replay.util.h(new t2(o76Var2, b), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    o76Var2.invoke();
                } catch (Throwable th2) {
                    s6Var2.getLogger().e(s5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }
        }
        m(new Date());
        this.k.set(this.c.d());
    }

    public void o() {
        io.sentry.android.replay.l lVar = this.h;
        io.sentry.android.replay.util.h hVar = new io.sentry.android.replay.util.h(new io.sentry.android.core.anr.f(lVar != null ? lVar.m() : null, this, (byte) 5), "BufferCaptureStrategy.stop");
        ScheduledExecutorService scheduledExecutorService = this.d;
        scheduledExecutorService.submit(hVar);
        scheduledExecutorService.submit(new io.sentry.android.replay.util.h(new io.sentry.android.core.internal.modules.a((Object) this, (byte) 4), "CaptureStrategy.stop"));
    }

    public c b() {
        return this;
    }
}
