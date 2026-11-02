package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cl7 implements AutoCloseable {
    public static final qv k0 = nr4.f(0);
    public static final qv l0 = nr4.f(0);
    public static final qv m0 = nr4.f(0);
    public static final qv n0 = nr4.f(0);
    public static final qv o0 = nr4.f(0);
    public static final List p0 = i21.L(lh4.o0, lh4.p0);
    public static final mv4 q0 = new mv4(8);
    public static final List r0 = i21.L(new yk7(0), new yk7(34));
    public static final mv4 s0 = new mv4(9);
    public final hi0 X;
    public final LinkedHashMap Y;
    public final List Z;
    public final LinkedHashMap f0;
    public final ip4 g0;
    public final List h0;
    public final ArrayList i0;
    public final ArrayList j0;

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:75:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [xe5] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [d02] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public cl7(jj0 jj0Var, hi0 hi0Var, k32 k32Var, yr2 yr2Var) {
        boolean z;
        hi0 hi0Var2;
        ?? arrayList;
        lh4 lh4Var;
        ?? r15;
        xe5 xe5Var;
        Integer num;
        jj0Var.getClass();
        yr2Var.getClass();
        this.X = hi0Var;
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || hi0Var.h != 0) {
            z = false;
        } else {
            jj0.h.getClass();
            if (ij0.c(jj0Var)) {
                z = false;
            } else {
                CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                key.getClass();
                lf0 lf0Var = (lf0) jj0Var;
                Integer num2 = (Integer) lf0Var.c(key);
                if ((num2 != null && num2.intValue() == 0) || (i >= 28 && (num = (Integer) lf0Var.c(key)) != null && num.intValue() == 4)) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = hi0Var.c.iterator();
        while (true) {
            lh4 lh4Var2 = null;
            if (!it.hasNext()) {
                Iterator it2 = this.X.b.iterator();
                while (it2.hasNext()) {
                    el0 el0Var = (el0) it2.next();
                    for (ze5 ze5Var : el0Var.a) {
                        if (!linkedHashMap.containsKey(ze5Var)) {
                            qv qvVar = n0;
                            qvVar.getClass();
                            int iIncrementAndGet = qv.b.incrementAndGet(qvVar);
                            Size size = ze5Var.a;
                            int i2 = ze5Var.b;
                            String str = ze5Var.c;
                            String str2 = str == null ? this.X.a : str;
                            Integer num3 = (Integer) linkedHashMap3.get(el0Var);
                            if (z) {
                                if (ze5Var instanceof xe5) {
                                    xe5Var = (xe5) ze5Var;
                                } else {
                                    r15 = lh4Var2;
                                }
                                if (r15 != 0) {
                                    r15 = xe5Var;
                                    lh4Var = r15.i;
                                } else {
                                    r15 = xe5Var;
                                    lh4Var = lh4Var2;
                                }
                            } else {
                                r15 = xe5Var;
                                lh4Var = lh4Var2;
                            }
                            al7 al7Var = new al7(iIncrementAndGet, size, i2, str2, num3, lh4Var, ze5Var.d, ze5Var.e, ze5Var.f, ze5Var.g, ze5Var.h);
                            linkedHashMap.put(ze5Var, al7Var);
                            arrayList2.add(al7Var);
                            it2 = it2;
                            lh4Var2 = null;
                        }
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                int size2 = this.X.b.size();
                int i3 = 0;
                while (true) {
                    hi0Var2 = this.X;
                    if (i3 >= size2) {
                        break;
                    }
                    el0 el0Var2 = (el0) hi0Var2.b.get(i3);
                    List list = el0Var2.a;
                    ArrayList<bl7> arrayList4 = new ArrayList(xv0.Z(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Object obj = linkedHashMap.get((ze5) it3.next());
                        obj.getClass();
                        al7 al7Var2 = (al7) obj;
                        qv qvVar2 = l0;
                        qvVar2.getClass();
                        bl7 bl7Var = new bl7(qv.b.incrementAndGet(qvVar2), al7Var2.c, al7Var2.f, al7Var2.h, al7Var2.g, al7Var2.i, al7Var2.j, al7Var2.b, al7Var2.d);
                        linkedHashMap4.put(bl7Var, al7Var2);
                        arrayList4.add(bl7Var);
                        size2 = size2;
                    }
                    int i4 = size2;
                    qv qvVar3 = k0;
                    qvVar3.getClass();
                    fl0 fl0Var = new fl0(qv.b.incrementAndGet(qvVar3), arrayList4);
                    linkedHashMap2.put(el0Var2, fl0Var);
                    arrayList3.add(fl0Var);
                    for (bl7 bl7Var2 : arrayList4) {
                        bl7Var2.getClass();
                        bl7Var2.j = fl0Var;
                    }
                    Iterator it4 = el0Var2.a.iterator();
                    while (it4.hasNext()) {
                        Object obj2 = linkedHashMap.get((ze5) it4.next());
                        obj2.getClass();
                        ((al7) obj2).l.add(fl0Var);
                    }
                    i3++;
                    size2 = i4;
                }
                ArrayList<be3> arrayList5 = hi0Var2.d;
                if (arrayList5 != null) {
                    arrayList = new ArrayList(xv0.Z(arrayList5, 10));
                    for (be3 be3Var : arrayList5) {
                        qv qvVar4 = m0;
                        qvVar4.getClass();
                        int iIncrementAndGet2 = qv.b.incrementAndGet(qvVar4);
                        be3Var.getClass();
                        arrayList.add(new zk7(iIncrementAndGet2, be3Var.b));
                    }
                } else {
                    arrayList = d02.X;
                }
                this.h0 = arrayList;
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    ArrayList arrayList8 = ((fl0) obj3).b;
                    if (!arrayList8.isEmpty()) {
                        Iterator it5 = arrayList8.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                cf5 cf5Var = ((bl7) it5.next()).g;
                                if (cf5Var == null ? false : cf5.a(cf5Var.a, 1L)) {
                                    arrayList6.add(obj3);
                                    break;
                                }
                            }
                        }
                    }
                    arrayList7.add(obj3);
                }
                if (arrayList6.isEmpty()) {
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj4 : arrayList3) {
                        ArrayList arrayList11 = ((fl0) obj4).b;
                        if (!arrayList11.isEmpty()) {
                            Iterator it6 = arrayList11.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    if (wv0.m0(p0, ((bl7) it6.next()).h)) {
                                        arrayList9.add(obj4);
                                        break;
                                    }
                                }
                            }
                        }
                        arrayList10.add(obj4);
                    }
                    if (arrayList9.isEmpty()) {
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj5 : arrayList3) {
                            ArrayList arrayList14 = ((fl0) obj5).b;
                            if (!arrayList14.isEmpty()) {
                                Iterator it7 = arrayList14.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        if (r0.contains(new yk7(((bl7) it7.next()).c))) {
                                            arrayList12.add(obj5);
                                            break;
                                        }
                                    }
                                }
                            }
                            arrayList13.add(obj5);
                        }
                        if (!arrayList12.isEmpty()) {
                            arrayList3 = wv0.H0(wv0.S0(arrayList12, s0), arrayList13);
                        }
                    } else {
                        arrayList3 = wv0.H0(wv0.S0(arrayList9, q0), arrayList10);
                    }
                } else {
                    arrayList3 = wv0.H0(arrayList6, arrayList7);
                }
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                for (Object obj6 : arrayList3) {
                    ArrayList arrayList17 = ((fl0) obj6).b;
                    if (arrayList17.isEmpty()) {
                        arrayList16.add(obj6);
                        break;
                    }
                    Iterator it8 = arrayList17.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            cf5 cf5Var2 = ((bl7) it8.next()).g;
                            if (cf5Var2 == null ? false : cf5.a(cf5Var2.a, 3L)) {
                                arrayList15.add(obj6);
                                break;
                            }
                        } else {
                            arrayList16.add(obj6);
                            break;
                            break;
                        }
                    }
                }
                if (arrayList15.isEmpty()) {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = new ArrayList();
                    for (Object obj7 : arrayList3) {
                        ArrayList arrayList20 = ((fl0) obj7).b;
                        if (!arrayList20.isEmpty()) {
                            Iterator it9 = arrayList20.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    df5 df5Var = ((bl7) it9.next()).i;
                                    if (df5Var == null ? false : df5.a(df5Var.a, 1L)) {
                                        arrayList18.add(obj7);
                                    }
                                }
                            }
                        }
                        arrayList19.add(obj7);
                    }
                    if (!arrayList18.isEmpty()) {
                        arrayList3 = wv0.H0(arrayList19, arrayList18);
                    }
                } else {
                    arrayList3 = wv0.H0(arrayList16, arrayList15);
                }
                this.i0 = arrayList3;
                ArrayList arrayList21 = new ArrayList(xv0.Z(arrayList3, 10));
                Iterator it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    arrayList21.add(new dl7(((fl0) it10.next()).a));
                }
                wv0.c1(arrayList21);
                this.Y = linkedHashMap2;
                this.Z = wv0.S0(arrayList2, new x72(this, (byte) 5));
                this.f0 = linkedHashMap4;
                ArrayList arrayList22 = this.i0;
                ArrayList arrayList23 = new ArrayList();
                Iterator it11 = arrayList22.iterator();
                while (it11.hasNext()) {
                    bw0.d0(arrayList23, ((fl0) it11.next()).b);
                }
                this.j0 = arrayList23;
                ip4 ip4Var = new ip4();
                Iterator it12 = this.X.b.iterator();
                while (it12.hasNext()) {
                    ((el0) it12.next()).getClass();
                }
                this.g0 = ip4Var.b();
                return;
            }
            List<el0> list2 = (List) it.next();
            if (list2.isEmpty()) {
                bt.i("Check failed.");
                throw null;
            }
            List list3 = this.X.b;
            ArrayList arrayList24 = new ArrayList();
            Iterator it13 = list3.iterator();
            while (it13.hasNext()) {
                bw0.d0(arrayList24, ((el0) it13.next()).a);
            }
            ArrayList arrayList25 = new ArrayList();
            Iterator it14 = arrayList24.iterator();
            while (it14.hasNext()) {
                it14.next();
            }
            ArrayList arrayList26 = new ArrayList();
            Iterator it15 = arrayList25.iterator();
            if (it15.hasNext()) {
                throw p61.k(it15);
            }
            qv qvVar5 = o0;
            qvVar5.getClass();
            int iIncrementAndGet3 = qv.b.incrementAndGet(qvVar5);
            while (arrayList26.contains(Integer.valueOf(iIncrementAndGet3))) {
                iIncrementAndGet3 = qv.b.incrementAndGet(qvVar5);
            }
            for (el0 el0Var3 : list2) {
                if (linkedHashMap3.containsKey(el0Var3)) {
                    bt.i("Check failed.");
                    throw null;
                }
                linkedHashMap3.put(el0Var3, Integer.valueOf(iIncrementAndGet3));
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        for (AutoCloseable autoCloseable : (kp4) this.g0.values()) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    kp5.e();
                    return;
                }
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
            }
        }
    }

    public final fl0 g(int i) {
        Object next;
        Iterator it = this.i0.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((fl0) next).a == i) {
                return (fl0) next;
            }
        }
        next = null;
        return (fl0) next;
    }

    public final el0 k(int i) {
        Object next;
        Iterator it = this.Y.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((fl0) ((Map.Entry) next).getValue()).a != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (el0) entry.getKey();
        }
        return null;
    }

    public final String toString() {
        return "StreamGraph(" + this.Y + ')';
    }
}
