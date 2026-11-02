package io.sentry.android.core;

import io.sentry.a5;
import io.sentry.a6;
import io.sentry.l3;
import io.sentry.n3;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements io.sentry.android.core.internal.util.s, io.sentry.d1 {
    public static final a6 h = new a6(0, 0);
    public final boolean a;
    public final io.sentry.android.core.internal.util.t c;
    public volatile String d;
    public final TreeSet e;
    public final io.sentry.util.a b = new io.sentry.util.a();
    public final ConcurrentSkipListSet f = new ConcurrentSkipListSet();
    public long g = 16666666;

    public f2(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.t tVar) {
        boolean z = false;
        z = false;
        this.e = new TreeSet(new d2(z ? (byte) 1 : (byte) 0));
        this.c = tVar;
        if (sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking()) {
            z = true;
        }
        this.a = z;
    }

    public static long g(a5 a5Var) {
        if (a5Var instanceof a6) {
            return a5Var.b(h);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - a5Var.d());
    }

    @Override // io.sentry.android.core.internal.util.s
    public final void b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j5 = (long) (1.0E9d / ((double) f));
        this.g = j5;
        if (z || z2) {
            concurrentSkipListSet.add(new e2(j, j2, j3, j4, z, z2, j5));
        }
    }

    public final void d() {
        io.sentry.util.a aVar = this.b;
        aVar.g();
        try {
            if (this.d != null) {
                this.c.d(this.d);
                this.d = null;
            }
            this.f.clear();
            this.e.clear();
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

    public final void e(io.sentry.q1 q1Var) throws Throwable {
        io.sentry.util.a aVar;
        a5 a5VarU;
        TreeSet treeSet;
        ConcurrentSkipListSet concurrentSkipListSet;
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        Iterator it;
        ConcurrentSkipListSet concurrentSkipListSet2;
        TreeSet treeSet2 = this.e;
        if (!this.a || (q1Var instanceof l3) || (q1Var instanceof n3)) {
            return;
        }
        io.sentry.util.a aVar2 = this.b;
        aVar2.g();
        try {
            if (!treeSet2.contains(q1Var)) {
                aVar2.close();
                return;
            }
            aVar2.close();
            aVar2.g();
            try {
                boolean zRemove = treeSet2.remove(q1Var);
                ConcurrentSkipListSet concurrentSkipListSet3 = this.f;
                if (zRemove && (a5VarU = q1Var.u()) != null) {
                    long jG = g(q1Var.w());
                    long jG2 = g(a5VarU);
                    long j4 = jG2 - jG;
                    if (j4 <= 0) {
                        aVar2.close();
                        treeSet = treeSet2;
                        aVar = aVar2;
                        concurrentSkipListSet = concurrentSkipListSet3;
                    } else {
                        long j5 = this.g;
                        int i3 = 1;
                        if (concurrentSkipListSet3.isEmpty()) {
                            treeSet = treeSet2;
                            aVar = aVar2;
                            concurrentSkipListSet = concurrentSkipListSet3;
                            i = 0;
                            i2 = 0;
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                        } else {
                            Iterator it2 = concurrentSkipListSet3.tailSet(new e2(jG)).iterator();
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                            i = 0;
                            i2 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    treeSet = treeSet2;
                                    aVar = aVar2;
                                    break;
                                }
                                e2 e2Var = (e2) it2.next();
                                treeSet = treeSet2;
                                aVar = aVar2;
                                try {
                                    long j6 = e2Var.X;
                                    long j7 = e2Var.f0;
                                    long j8 = e2Var.i0;
                                    long j9 = e2Var.Y;
                                    if (j6 > jG2) {
                                        break;
                                    }
                                    if (j6 < jG || j9 > jG2) {
                                        if ((jG > j6 && jG < j9) || (jG2 > j6 && jG2 < j9)) {
                                            it = it2;
                                            concurrentSkipListSet2 = concurrentSkipListSet3;
                                            long jMin = Math.min(j7 - Math.max(0L, Math.max(0L, jG - j6) - j8), j4);
                                            long jMin2 = Math.min(jG2, j9) - Math.max(jG, e2Var.X);
                                            boolean z = jMin2 > j8;
                                            j3 += jMin2;
                                            if (jMin2 > 700000000) {
                                                j2 += jMin;
                                                i2++;
                                            } else if (z) {
                                                j += jMin;
                                                i++;
                                            }
                                        }
                                        treeSet2 = treeSet;
                                        aVar2 = aVar;
                                        concurrentSkipListSet3 = concurrentSkipListSet2;
                                        it2 = it;
                                        j5 = j8;
                                    } else {
                                        long j10 = e2Var.Z;
                                        boolean z2 = e2Var.g0;
                                        j3 += j10;
                                        if (e2Var.h0) {
                                            j2 += j7;
                                            i2++;
                                        } else if (z2) {
                                            j += j7;
                                            i++;
                                        }
                                    }
                                    it = it2;
                                    concurrentSkipListSet2 = concurrentSkipListSet3;
                                    treeSet2 = treeSet;
                                    aVar2 = aVar;
                                    concurrentSkipListSet3 = concurrentSkipListSet2;
                                    it2 = it;
                                    j5 = j8;
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    try {
                                        aVar.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            }
                            concurrentSkipListSet = concurrentSkipListSet3;
                        }
                        int iCeil = i + i2;
                        long jA = this.c.a();
                        if (jA != -1) {
                            long jMax = Math.max(0L, jG2 - jA);
                            if (jMax > j5) {
                                boolean z3 = jMax > 700000000;
                                long jMax2 = Math.max(0L, jMax - j5);
                                j3 += jMax;
                                if (z3) {
                                    j2 += jMax2;
                                    i2++;
                                } else {
                                    j += jMax2;
                                    i++;
                                }
                            } else {
                                i3 = 0;
                            }
                            long j11 = j4 - j3;
                            iCeil = iCeil + i3 + (j11 > 0 ? (int) Math.ceil(j11 / j5) : 0);
                        }
                        double d = (j + j2) / 1.0E9d;
                        q1Var.j(Integer.valueOf(iCeil), "frames.total");
                        q1Var.j(Integer.valueOf(i), "frames.slow");
                        q1Var.j(Integer.valueOf(i2), "frames.frozen");
                        q1Var.j(Double.valueOf(d), "frames.delay");
                        if (q1Var instanceof io.sentry.s1) {
                            q1Var.g(Integer.valueOf(iCeil), "frames_total");
                            q1Var.g(Integer.valueOf(i), "frames_slow");
                            q1Var.g(Integer.valueOf(i2), "frames_frozen");
                            q1Var.g(Double.valueOf(d), "frames_delay");
                        }
                        aVar.close();
                    }
                } else {
                    aVar2.close();
                    treeSet = treeSet2;
                    aVar = aVar2;
                    concurrentSkipListSet = concurrentSkipListSet3;
                }
                aVar.g();
                try {
                    if (treeSet.isEmpty()) {
                        d();
                    } else {
                        concurrentSkipListSet.headSet(new e2(g(((io.sentry.q1) treeSet.first()).w()))).clear();
                    }
                    aVar.close();
                } catch (Throwable th4) {
                    try {
                        aVar.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                aVar = aVar2;
            }
        } catch (Throwable th7) {
            try {
                aVar2.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    public final void f(io.sentry.q1 q1Var) {
        if (!this.a || (q1Var instanceof l3) || (q1Var instanceof n3)) {
            return;
        }
        io.sentry.util.a aVar = this.b;
        aVar.g();
        try {
            this.e.add(q1Var);
            if (this.d == null) {
                this.d = this.c.c(this);
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
