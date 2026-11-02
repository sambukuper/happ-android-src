package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sn0 implements fh0 {
    public final it2 a;
    public final mn0 b;
    public final y5 c;
    public final jl0 d;
    public final u08 e;
    public final ji0 f;
    public final cl7 g;
    public final s98 h;
    public final b71 i;
    public final int j;
    public final Object k;
    public final tv l;
    public final Map m;
    public final Map n;
    public ya8 o;
    public final y45 p;
    public yh0 q;
    public nn0 r;
    public Map s;
    public LinkedHashMap t;
    public on0 u;
    public final CountDownLatch v;
    public boolean w;
    public final CountDownLatch x;
    public Map y;
    public final LinkedHashMap z;

    public sn0(it2 it2Var, mn0 mn0Var, y5 y5Var, jl0 jl0Var, u08 u08Var, ji0 ji0Var, wl7 wl7Var, cl7 cl7Var, tl7 tl7Var, s98 s98Var, b71 b71Var) {
        y45 y45Var;
        mn0Var.getClass();
        jl0Var.getClass();
        u08Var.getClass();
        tl7Var.getClass();
        s98Var.getClass();
        b71Var.getClass();
        this.a = it2Var;
        this.b = mn0Var;
        this.c = y5Var;
        this.d = jl0Var;
        this.e = u08Var;
        this.f = ji0Var;
        this.g = cl7Var;
        this.h = s98Var;
        this.i = b71Var;
        qv qvVar = tn0.a;
        qvVar.getClass();
        this.j = qv.b.incrementAndGet(qvVar);
        this.k = new Object();
        this.l = nr4.g(Boolean.FALSE);
        this.m = Collections.synchronizedMap(new HashMap());
        this.n = Collections.synchronizedMap(new HashMap());
        if (wl7Var != null) {
            wl7Var.getClass();
            y45Var = new y45();
            y45Var.X = nr4.g(l57.X);
        } else {
            y45Var = null;
        }
        this.p = y45Var;
        this.u = on0.X;
        this.v = new CountDownLatch(1);
        this.x = new CountDownLatch(1);
        this.z = new LinkedHashMap();
    }

    @Override // defpackage.n57
    public final void a() throws Exception {
        if (this.l.a(Boolean.FALSE, Boolean.TRUE)) {
            toString();
            Trace.beginSection(this + "#onSessionFinalized");
            n();
            m(0L);
            Trace.endSection();
        }
    }

    @Override // defpackage.n57
    public final void b() {
        toString();
        Trace.beginSection(this + "#onSessionDisconnected");
        k();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.v.await();
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.fh0
    public final void c(gh0 gh0Var) {
        toString();
    }

    @Override // defpackage.fh0
    public final void d(gh0 gh0Var) throws Exception {
        toString();
        Trace.beginSection(this + "#onClosed");
        n();
        this.x.countDown();
        y45 y45Var = this.p;
        if (y45Var != null) {
            y45Var.J();
        }
        Trace.endSection();
    }

    @Override // defpackage.fh0
    public final void e(gh0 gh0Var) {
        toString();
    }

    @Override // defpackage.fh0
    public final void f(gh0 gh0Var) {
        toString();
    }

    @Override // defpackage.fh0
    public final void g(gh0 gh0Var) {
        toString();
        Trace.beginSection(this + "#configure");
        i(gh0Var);
        this.x.countDown();
        y45 y45Var = this.p;
        if (y45Var != null) {
            y45Var.J();
        }
        Trace.endSection();
    }

    @Override // defpackage.fh0
    public final void h(gh0 gh0Var) throws Exception {
        toString();
        Trace.beginSection(this + "#onConfigureFailed");
        this.a.a(new mt2(9, false));
        n();
        this.x.countDown();
        y45 y45Var = this.p;
        if (y45Var != null) {
            y45Var.J();
        }
        Trace.endSection();
    }

    public final void i(gh0 gh0Var) {
        synchronized (this.k) {
            try {
                nn0 nn0Var = this.r;
                if (nn0Var == null && gh0Var != null) {
                    y5 y5Var = this.c;
                    Map map = this.m;
                    map.getClass();
                    Map map2 = this.n;
                    map2.getClass();
                    sf0 sf0VarA = y5Var.A(gh0Var, map, map2);
                    nn0 nn0Var2 = new nn0(gh0Var, new xm0(sf0VarA), sf0VarA);
                    this.r = nn0Var2;
                    nn0Var = nn0Var2;
                }
                if (this.u == on0.Z && nn0Var != null) {
                    boolean z = (this.s == null || this.t == null) ? false : true;
                    if (z) {
                        l(false);
                    }
                    synchronized (this.k) {
                        this.e.getClass();
                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        ya8 ya8Var = this.o;
                        ya8Var.getClass();
                        long j = jElapsedRealtimeNanos - ya8Var.a;
                        toString();
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1));
                        it2 it2Var = this.a;
                        xm0 xm0Var = nn0Var.b;
                        it2Var.toString();
                        oh7 oh7Var = it2Var.d;
                        nt2 nt2Var = nt2.b;
                        oh7Var.m(nt2Var);
                        it2Var.b.X(xm0Var);
                        for (st2 st2Var : it2Var.c) {
                            st2Var.a.b(st2Var.a(), nt2Var);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Map map) {
        map.getClass();
        synchronized (this.k) {
            try {
                on0 on0Var = this.u;
                if (on0Var != on0.f0 && on0Var != on0.g0) {
                    Map map2 = this.y;
                    if (map2 == null) {
                        map2 = e02.X;
                    }
                    p(map2, map);
                    this.y = map;
                    Map map3 = this.s;
                    byte b = 1;
                    q51 q51Var = null;
                    if (map3 != null && this.t == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (map3.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == map3.size()) {
                            this.t = linkedHashMap;
                            w51.G(this.i, null, null, new l40(this, q51Var, b), 3);
                        }
                    }
                    w51.G(this.i, null, null, new pn0(this, q51Var, b), 3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        nn0 nn0Var;
        synchronized (this.k) {
            try {
                on0 on0Var = this.u;
                on0 on0Var2 = on0.f0;
                if (on0Var != on0Var2 && on0Var != on0.g0) {
                    this.u = on0Var2;
                    nn0 nn0Var2 = this.r;
                    q51 q51Var = null;
                    boolean z = false;
                    if (nn0Var2 != null) {
                        this.r = null;
                    } else {
                        if (this.f.d && this.w) {
                            z = true;
                        }
                        nn0Var2 = null;
                    }
                    y45 y45Var = this.p;
                    if (y45Var != null) {
                        y45Var.J();
                    }
                    byte b = 2;
                    if (z) {
                        synchronized (this.k) {
                            nn0Var = this.r;
                            this.r = null;
                        }
                        nn0Var2 = nn0Var;
                    }
                    Trace.beginSection(this.a + "#onGraphStopping");
                    it2 it2Var = this.a;
                    it2Var.toString();
                    it2Var.d.m(pt2.b);
                    it2Var.b.X(null);
                    for (st2 st2Var : it2Var.c) {
                        st2Var.a.b(st2Var.a(), pt2.b);
                    }
                    Trace.endSection();
                    if (nn0Var2 != null) {
                        xm0 xm0Var = nn0Var2.b;
                        toString();
                        Trace.beginSection(this + "#shutdown");
                        if (this.f.a) {
                        }
                        Trace.beginSection(this + "#disconnect");
                        nn0Var2.c.b();
                        Trace.endSection();
                        if (this.f.d) {
                        }
                        Trace.beginSection(this.a + "#onGraphStopped");
                        this.a.b();
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        Trace.beginSection(this.a + "#onGraphStopped");
                        this.a.b();
                        Trace.endSection();
                    }
                    this.v.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(boolean z) {
        nn0 nn0Var;
        Map map;
        LinkedHashMap linkedHashMap;
        boolean z2;
        synchronized (this.k) {
            nn0Var = this.r;
            map = this.s;
            linkedHashMap = this.t;
        }
        if (nn0Var == null || map == null || linkedHashMap == null) {
            return;
        }
        Trace.beginSection(this + "#finalizeOutputConfigurations");
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        for (Map.Entry entry : map.entrySet()) {
            dl7 dl7Var = (dl7) entry.getKey();
            int i = dl7Var.a;
            af afVar = (af) entry.getValue();
            Object obj = linkedHashMap.get(dl7Var);
            if (obj == null) {
                bt.i("Required value was null.");
                return;
            }
            afVar.a((Surface) obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add((af) ((Map.Entry) it.next()).getValue());
        }
        nn0Var.a.x0(wv0.Y0(linkedHashSet));
        synchronized (this.k) {
            try {
                if (this.u == on0.Z) {
                    this.m.putAll(linkedHashMap);
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (true) {
                        z2 = true;
                        if (!it2.hasNext()) {
                            this.e.getClass();
                            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                            ArrayList arrayList = new ArrayList(map.size());
                            Iterator it3 = map.entrySet().iterator();
                            while (it3.hasNext()) {
                                dl7 dl7Var2 = (dl7) ((Map.Entry) it3.next()).getKey();
                                int i2 = dl7Var2.a;
                                arrayList.add(dl7Var2);
                            }
                            arrayList.toString();
                            toString();
                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1));
                            break;
                        }
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int i3 = ((dl7) entry2.getKey()).a;
                        Surface surface = (Surface) entry2.getValue();
                        fl0 fl0VarG = this.g.g(i3);
                        if (fl0VarG == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (fl0VarG.b.size() != 1) {
                            throw new IllegalStateException("Cannot finalize a multi-output stream!");
                        }
                        Map map2 = this.n;
                        map2.getClass();
                        map2.put(new pe5(((bl7) wv0.O0(fl0VarG.b)).a), surface);
                    }
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2 && z) {
            it2 it2Var = this.a;
            it2Var.toString();
            it2Var.b.i0.g0(vs2.b);
        }
        Trace.endSection();
    }

    public final void m(long j) throws Exception {
        List<AutoCloseable> listY0;
        boolean zIsTerminated;
        if (j != 0) {
            w51.G(this.i, null, null, new qn0(j, this, (q51) null), 3);
            return;
        }
        toString();
        synchronized (this.k) {
            listY0 = wv0.Y0(this.z.values());
            this.z.clear();
        }
        for (AutoCloseable autoCloseable : listY0) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    kp5.e();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0027  */
    public final void n() throws Exception {
        long j;
        boolean z;
        int i;
        k();
        synchronized (this.k) {
            try {
                on0 on0Var = this.u;
                on0 on0Var2 = on0.g0;
                j = 0;
                if (on0Var != on0Var2) {
                    z = true;
                    if (this.q != null && this.w && (i = this.f.c) != 1) {
                        if (i == 2) {
                            j = 2000;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                this.q = null;
                this.u = on0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7 A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:55:0x00e7, B:57:0x00ed, B:60:0x00f3, B:62:0x00f7, B:64:0x011b, B:66:0x0142, B:67:0x014f, B:69:0x0155, B:71:0x0165, B:76:0x0176, B:78:0x0180, B:82:0x0189, B:83:0x01a0, B:84:0x01a1), top: B:97:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x011b A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:55:0x00e7, B:57:0x00ed, B:60:0x00f3, B:62:0x00f7, B:64:0x011b, B:66:0x0142, B:67:0x014f, B:69:0x0155, B:71:0x0165, B:76:0x0176, B:78:0x0180, B:82:0x0189, B:83:0x01a0, B:84:0x01a1), top: B:97:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142 A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:55:0x00e7, B:57:0x00ed, B:60:0x00f3, B:62:0x00f7, B:64:0x011b, B:66:0x0142, B:67:0x014f, B:69:0x0155, B:71:0x0165, B:76:0x0176, B:78:0x0180, B:82:0x0189, B:83:0x01a0, B:84:0x01a1), top: B:97:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0155 A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:55:0x00e7, B:57:0x00ed, B:60:0x00f3, B:62:0x00f7, B:64:0x011b, B:66:0x0142, B:67:0x014f, B:69:0x0155, B:71:0x0165, B:76:0x0176, B:78:0x0180, B:82:0x0189, B:83:0x01a0, B:84:0x01a1), top: B:97:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:82:0x0189 A[Catch: all -> 0x0171, TRY_ENTER, TryCatch #0 {all -> 0x0171, blocks: (B:55:0x00e7, B:57:0x00ed, B:60:0x00f3, B:62:0x00f7, B:64:0x011b, B:66:0x0142, B:67:0x014f, B:69:0x0155, B:71:0x0165, B:76:0x0176, B:78:0x0180, B:82:0x0189, B:83:0x01a0, B:84:0x01a1), top: B:97:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x0189, please report this as an issue */
    public final Object o(s51 s51Var) {
        rn0 rn0Var;
        ea6 ea6Var;
        ea6 ea6Var2;
        ea6 ea6Var3;
        ea6 ea6Var4;
        yh0 yh0Var;
        String strM;
        yh0 yh0Var2;
        String strM2;
        ln0 ln0VarA;
        on0 on0Var;
        Map map;
        Map map2;
        LinkedHashMap linkedHashMap;
        if (s51Var instanceof rn0) {
            rn0Var = (rn0) s51Var;
            int i = rn0Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                rn0Var.j0 = i - Integer.MIN_VALUE;
            } else {
                rn0Var = new rn0(this, s51Var);
            }
        } else {
            rn0Var = new rn0(this, s51Var);
        }
        Object obj = rn0Var.h0;
        c71 c71Var = c71.X;
        int i2 = rn0Var.j0;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                ea6Var = new ea6();
                ea6Var2 = new ea6();
                synchronized (this.k) {
                    if (this.u != on0.X) {
                        return dn8.a;
                    }
                    ea6Var.X = this.y;
                    yh0 yh0Var3 = this.q;
                    ea6Var2.X = yh0Var3;
                    if (ea6Var.X != null && yh0Var3 != null) {
                        this.u = on0.Y;
                        this.w = true;
                        this.e.getClass();
                        this.o = new ya8(SystemClock.elapsedRealtimeNanos());
                        y45 y45Var = this.p;
                        if (y45Var != null) {
                            rn0Var.f0 = ea6Var;
                            rn0Var.g0 = ea6Var2;
                            rn0Var.j0 = 1;
                            if (y45Var.x(rn0Var) == c71Var) {
                                return c71Var;
                            }
                            ea6Var3 = ea6Var;
                            ea6Var4 = ea6Var2;
                        }
                        yh0Var = (yh0) ea6Var2.X;
                        if (yh0Var != null) {
                            strM = yh0Var.m();
                        } else {
                            strM = null;
                        }
                        if (strM != null) {
                            vi0.b(strM);
                        }
                        toString();
                        Objects.toString(ea6Var.X);
                        StringBuilder sb = new StringBuilder("CameraDevice-");
                        yh0Var2 = (yh0) ea6Var2.X;
                        if (yh0Var2 != null) {
                            strM2 = yh0Var2.m();
                        } else {
                            strM2 = null;
                        }
                        Trace.beginSection(oi0.p(sb, strM2, "#createCaptureSession"));
                        mn0 mn0Var = this.b;
                        Object obj2 = ea6Var2.X;
                        obj2.getClass();
                        Object obj3 = ea6Var.X;
                        obj3.getClass();
                        ln0VarA = mn0Var.a((yh0) obj2, (Map) obj3, this);
                        Trace.endSection();
                        if (!(ln0VarA instanceof kn0)) {
                            toString();
                            return dn8.a;
                        }
                        synchronized (this.k) {
                            try {
                                on0Var = this.u;
                                if (on0Var != on0.f0 && on0Var != on0.g0) {
                                    if (on0Var == on0.Y) {
                                        throw new IllegalStateException(("Unexpected state: " + this.u).toString());
                                    }
                                    this.u = on0.Z;
                                    Map map3 = this.m;
                                    Object obj4 = ea6Var.X;
                                    obj4.getClass();
                                    map3.putAll((Map) obj4);
                                    this.n.putAll(((kn0) ln0VarA).Y);
                                    map = ((kn0) ln0VarA).X;
                                    if (!map.isEmpty()) {
                                        toString();
                                        wv0.Y0(((Map) ea6Var.X).keySet()).toString();
                                        wv0.Y0(map.keySet()).toString();
                                        this.s = map;
                                        map2 = this.y;
                                        if (map2 != null) {
                                            linkedHashMap = new LinkedHashMap();
                                            for (Map.Entry entry : map2.entrySet()) {
                                                if (map.containsKey(entry.getKey())) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                        } else {
                                            linkedHashMap = null;
                                        }
                                        if (linkedHashMap != null && linkedHashMap.size() == map.size()) {
                                            this.t = linkedHashMap;
                                        }
                                    }
                                    i(null);
                                    return dn8.a;
                                }
                                toString();
                                Objects.toString(this.u);
                                return dn8.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return dn8.a;
                }
            }
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ea6Var4 = rn0Var.g0;
            ea6Var3 = rn0Var.f0;
            w39.n0(obj);
            Trace.beginSection(oi0.p(sb, strM2, "#createCaptureSession"));
            mn0 mn0Var2 = this.b;
            Object obj5 = ea6Var2.X;
            obj5.getClass();
            Object obj6 = ea6Var.X;
            obj6.getClass();
            ln0VarA = mn0Var2.a((yh0) obj5, (Map) obj6, this);
            Trace.endSection();
            if (!(ln0VarA instanceof kn0)) {
                toString();
                return dn8.a;
            }
            synchronized (this.k) {
                on0Var = this.u;
                if (on0Var != on0.f0) {
                    if (on0Var == on0.Y) {
                        throw new IllegalStateException(("Unexpected state: " + this.u).toString());
                    }
                    this.u = on0.Z;
                    Map map4 = this.m;
                    Object obj7 = ea6Var.X;
                    obj7.getClass();
                    map4.putAll((Map) obj7);
                    this.n.putAll(((kn0) ln0VarA).Y);
                    map = ((kn0) ln0VarA).X;
                    if (!map.isEmpty()) {
                        toString();
                        wv0.Y0(((Map) ea6Var.X).keySet()).toString();
                        wv0.Y0(map.keySet()).toString();
                        this.s = map;
                        map2 = this.y;
                        if (map2 != null) {
                            linkedHashMap = new LinkedHashMap();
                            while (r11.hasNext()) {
                                if (map.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else {
                            linkedHashMap = null;
                        }
                        if (linkedHashMap != null) {
                            this.t = linkedHashMap;
                        }
                    }
                    i(null);
                    return dn8.a;
                }
                toString();
                Objects.toString(this.u);
                return dn8.a;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
        ea6Var = ea6Var3;
        ea6Var2 = ea6Var4;
        yh0Var = (yh0) ea6Var2.X;
        if (yh0Var != null) {
            strM = yh0Var.m();
        } else {
            strM = null;
        }
        if (strM != null) {
            vi0.b(strM);
        }
        toString();
        Objects.toString(ea6Var.X);
        StringBuilder sb2 = new StringBuilder("CameraDevice-");
        yh0Var2 = (yh0) ea6Var2.X;
        if (yh0Var2 != null) {
            strM2 = yh0Var2.m();
        } else {
            strM2 = null;
        }
    }

    public final void p(Map map, Map map2) throws Exception {
        Surface surface;
        AutoCloseable autoCloseable;
        boolean zIsTerminated;
        Set setC1 = wv0.c1(map.values());
        Set setC2 = wv0.c1(map2.values());
        Iterator it = q57.Y(setC1, setC2).iterator();
        do {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.z;
            if (!zHasNext) {
                for (Surface surface2 : q57.Y(setC2, setC1)) {
                    linkedHashMap.put(surface2, this.d.a(surface2));
                }
                return;
            }
            surface = (Surface) it.next();
            autoCloseable = (AutoCloseable) linkedHashMap.remove(surface);
            if (autoCloseable == null) {
                autoCloseable = null;
            } else if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    kp5.e();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        } while (autoCloseable != null);
        om0.l("Surface ", surface, " doesn't have a matching surface token!");
    }

    public final String toString() {
        return "CaptureSessionState-" + this.j;
    }
}
