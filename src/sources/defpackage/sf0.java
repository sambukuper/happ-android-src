package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.media.ImageWriter;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sf0 {
    public final gh0 a;
    public final s98 b;
    public final Map c;
    public final Map d;
    public final cl7 e;
    public final tl7 f;
    public final boolean g;
    public final int h;
    public final Object i;
    public boolean j;
    public qf0 k;
    public final me l;

    public sf0(gh0 gh0Var, s98 s98Var, Map map, Map map2, cl7 cl7Var, tl7 tl7Var, boolean z) {
        ImageWriter imageWriterNewInstance;
        gh0Var.getClass();
        s98Var.getClass();
        map.getClass();
        map2.getClass();
        tl7Var.getClass();
        this.a = gh0Var;
        this.b = s98Var;
        this.c = map;
        this.d = map2;
        this.e = cl7Var;
        this.f = tl7Var;
        this.g = z;
        qv qvVar = tf0.a;
        qvVar.getClass();
        this.h = qv.b.incrementAndGet(qvVar);
        this.i = new Object();
        List list = cl7Var.h0;
        me meVar = null;
        if (!list.isEmpty()) {
            zk7 zk7Var = (zk7) wv0.r0(list);
            Surface inputSurface = gh0Var.getInputSurface();
            if (inputSurface == null) {
                bt.i("inputSurface is required to create instance of imageWriter.");
                throw null;
            }
            try {
                int i = zk7Var.a;
                int i2 = zk7Var.b;
                Handler handlerA = s98Var.a();
                handlerA.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    imageWriterNewInstance = wa.t(i2, inputSurface);
                } else {
                    yk7.b(i2);
                    imageWriterNewInstance = ImageWriter.newInstance(inputSurface, 1);
                    imageWriterNewInstance.getClass();
                }
                me meVar2 = new me(imageWriterNewInstance, i);
                imageWriterNewInstance.setOnImageReleasedListener(meVar2, handlerA);
                meVar = meVar2;
            } catch (RuntimeException unused) {
                Objects.toString(this.a);
            }
            if (meVar != null) {
                meVar.toString();
                Objects.toString(this.a);
            }
        }
        this.l = meVar;
    }

    public final qf0 a(boolean z, List list, Map map, Map map2, Map map3, vk1 vk1Var, List list2) {
        ArrayMap arrayMap;
        String str;
        ArrayMap arrayMap2;
        long j;
        boolean zA;
        Iterator it;
        String str2;
        boolean z2;
        boolean z3;
        Map map4 = map;
        Map map5 = map3;
        map2.getClass();
        map5.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        ArrayMap arrayMap5 = new ArrayMap();
        String str3 = "build(...) should never be called with an empty request list!";
        if (list.isEmpty()) {
            bt.i("build(...) should never be called with an empty request list!");
            return null;
        }
        gh0 gh0Var = this.a;
        boolean z4 = gh0Var instanceof ya;
        cl7 cl7Var = this.e;
        if (z4) {
            Iterator it2 = list.iterator();
            Boolean bool = null;
            Boolean bool2 = null;
            while (it2.hasNext()) {
                ne6 ne6Var = (ne6) it2.next();
                List list3 = ne6Var.a;
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            it = it2;
                            int i = ((dl7) it3.next()).a;
                            ArrayList arrayList3 = cl7Var.j0;
                            if (arrayList3 == null || !arrayList3.isEmpty()) {
                                Iterator it4 = arrayList3.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        Iterator it5 = it4;
                                        bl7 bl7Var = (bl7) it4.next();
                                        str2 = str3;
                                        cf5 cf5Var = bl7Var.g;
                                        df5 df5Var = bl7Var.i;
                                        if (!(cf5Var == null ? false : cf5.a(cf5Var.a, 1L))) {
                                            if (!(df5Var == null ? false : df5.a(df5Var.a, 0L)) && df5Var != null) {
                                                str3 = str2;
                                                it4 = it5;
                                                gh0Var = gh0Var;
                                                arrayList = arrayList;
                                                it3 = it3;
                                            }
                                        }
                                        z2 = true;
                                    }
                                }
                            }
                            str3 = str3;
                            it2 = it;
                            gh0Var = gh0Var;
                            arrayList = arrayList;
                            it3 = it3;
                        } else {
                            it = it2;
                            str2 = str3;
                            gh0Var = gh0Var;
                            arrayList = arrayList;
                            z2 = false;
                        }
                    }
                } else {
                    it = it2;
                    str2 = str3;
                    gh0Var = gh0Var;
                    arrayList = arrayList;
                    z2 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                if (bool2 != null) {
                    bool2.equals(boolValueOf);
                }
                List list4 = ne6Var.a;
                if (list4 == null || !list4.isEmpty()) {
                    Iterator it6 = list4.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            int i2 = ((dl7) it6.next()).a;
                            ArrayList arrayList4 = cl7Var.j0;
                            if (arrayList4 == null || !arrayList4.isEmpty()) {
                                Iterator it7 = arrayList4.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        bl7 bl7Var2 = (bl7) it7.next();
                                        cf5 cf5Var2 = bl7Var2.g;
                                        if (!(cf5Var2 == null ? false : cf5.a(cf5Var2.a, 3L))) {
                                            df5 df5Var2 = bl7Var2.i;
                                            if (!(df5Var2 == null ? false : df5.a(df5Var2.a, 1L))) {
                                                it6 = it6;
                                                it7 = it7;
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            }
                            it6 = it6;
                        } else {
                            z3 = false;
                        }
                    }
                } else {
                    z3 = false;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z3);
                if (bool != null) {
                    bool.equals(boolValueOf2);
                }
                ArrayList arrayList5 = cl7Var.j0;
                if (arrayList5 == null || !arrayList5.isEmpty()) {
                    Iterator it8 = arrayList5.iterator();
                    while (it8.hasNext()) {
                        if (!((bl7) it8.next()).a()) {
                            Objects.toString(cl7Var.j0);
                            return null;
                        }
                    }
                }
                bool2 = boolValueOf;
                bool = boolValueOf2;
                str3 = str2;
                it2 = it;
                gh0Var = gh0Var;
                arrayList = arrayList;
            }
        }
        String str4 = str3;
        gh0 gh0Var2 = gh0Var;
        ArrayList arrayList6 = arrayList;
        if (list.isEmpty()) {
            bt.i(str4);
            return null;
        }
        Iterator it9 = list.iterator();
        while (true) {
            String str5 = "Check failed.";
            if (!it9.hasNext()) {
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    ne6 ne6Var2 = (ne6) it10.next();
                    Objects.toString(ne6Var2);
                    we6 we6Var = ne6Var2.e;
                    int i3 = we6Var != null ? we6Var.a : 1;
                    CaptureRequest.Builder builderY = gh0Var2.i0().Y(i3);
                    if (builderY == null) {
                        we6.b(i3);
                        builderY = null;
                    }
                    if (builderY == null) {
                        return null;
                    }
                    xu4 xu4Var = sj0.b;
                    Object obj = map5.get(xu4Var);
                    if (obj == null) {
                        obj = map4.get(xu4Var);
                    }
                    builderY.setTag(obj);
                    int size = ne6Var2.a.size();
                    boolean z5 = false;
                    for (int i4 = 0; i4 < size; i4++) {
                        Surface surface = (Surface) arrayMap5.get(ne6Var2.a.get(i4));
                        if (surface != null) {
                            builderY.addTarget(surface);
                            z5 = true;
                        }
                    }
                    if (!z5) {
                        bt.i(str5);
                        return null;
                    }
                    jb5.X(builderY, map4);
                    jb5.X(builderY, map2);
                    jb5.X(builderY, ne6Var2.b);
                    jb5.X(builderY, map5);
                    sv svVar = tf0.c;
                    svVar.getClass();
                    long jIncrementAndGet = sv.b.incrementAndGet(svVar);
                    CaptureRequest captureRequestBuild = builderY.build();
                    captureRequestBuild.getClass();
                    gh0 gh0Var3 = this.a;
                    if (gh0Var3 instanceof ya) {
                        ya yaVar = (ya) gh0Var3;
                        za zaVar = yaVar.X;
                        try {
                            Trace.beginSection("CXCP#createHighSpeedRequestList");
                            List<CaptureRequest> listCreateHighSpeedRequestList = yaVar.g0.createHighSpeedRequestList(captureRequestBuild);
                            try {
                                Trace.endSection();
                            } catch (IllegalArgumentException unused) {
                                Objects.toString(zaVar);
                                listCreateHighSpeedRequestList = null;
                            } catch (IllegalStateException unused2) {
                                Objects.toString(zaVar);
                                listCreateHighSpeedRequestList = null;
                            } catch (UnsupportedOperationException unused3) {
                                Objects.toString(zaVar);
                                listCreateHighSpeedRequestList = null;
                            }
                            if (listCreateHighSpeedRequestList == null) {
                                return null;
                            }
                            List list5 = ne6Var2.a;
                            if (list5 == null || !list5.isEmpty()) {
                                Iterator it11 = list5.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        int i5 = ((dl7) it11.next()).a;
                                        ArrayList arrayList7 = cl7Var.j0;
                                        if (arrayList7 == null || !arrayList7.isEmpty()) {
                                            Iterator it12 = arrayList7.iterator();
                                            while (true) {
                                                if (it12.hasNext()) {
                                                    arrayMap = arrayMap4;
                                                    bl7 bl7Var3 = (bl7) it12.next();
                                                    Iterator it13 = it11;
                                                    cf5 cf5Var3 = bl7Var3.g;
                                                    if (cf5Var3 == null ? false : cf5.a(cf5Var3.a, 3L)) {
                                                        j = 1;
                                                    } else {
                                                        df5 df5Var3 = bl7Var3.i;
                                                        if (df5Var3 == null) {
                                                            zA = false;
                                                            j = 1;
                                                        } else {
                                                            j = 1;
                                                            zA = df5.a(df5Var3.a, 1L);
                                                        }
                                                        if (!zA) {
                                                            it11 = it13;
                                                            cl7Var = cl7Var;
                                                            arrayMap4 = arrayMap;
                                                        }
                                                    }
                                                    int size2 = listCreateHighSpeedRequestList.size();
                                                    int i6 = 0;
                                                    while (i6 < size2) {
                                                        int i7 = size2;
                                                        int i8 = i6;
                                                        kg0 kg0Var = new kg0(this.a, listCreateHighSpeedRequestList.get(i6), map, map2, map5, arrayMap5, z, ne6Var2, jIncrementAndGet);
                                                        arrayList2.add(listCreateHighSpeedRequestList.get(i8));
                                                        arrayList6.add(kg0Var);
                                                        map5 = map3;
                                                        str5 = str5;
                                                        arrayMap3 = arrayMap3;
                                                        j = j;
                                                        i6 = i8 + 1;
                                                        size2 = i7;
                                                    }
                                                    arrayMap2 = arrayMap3;
                                                    map4 = map;
                                                    map5 = map3;
                                                }
                                            }
                                        }
                                        map5 = map3;
                                        arrayList6 = arrayList6;
                                        str5 = str5;
                                        arrayMap3 = arrayMap3;
                                        cl7Var = cl7Var;
                                        arrayMap4 = arrayMap4;
                                        it11 = it11;
                                    }
                                    arrayMap3 = arrayMap2;
                                    cl7Var = cl7Var;
                                    arrayMap4 = arrayMap;
                                }
                            }
                            arrayMap = arrayMap4;
                            cl7Var = cl7Var;
                            str = str5;
                            arrayMap2 = arrayMap3;
                            arrayList6 = arrayList6;
                            map4 = map;
                            map5 = map3;
                            kg0 kg0Var2 = new kg0(this.a, listCreateHighSpeedRequestList.get(0), map4, map2, map5, arrayMap5, z, ne6Var2, jIncrementAndGet);
                            arrayList2.add(listCreateHighSpeedRequestList.get(0));
                            arrayList6.add(kg0Var2);
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        arrayMap = arrayMap4;
                        cl7Var = cl7Var;
                        str = str5;
                        arrayMap2 = arrayMap3;
                        map4 = map;
                        map5 = map3;
                        kg0 kg0Var3 = new kg0(gh0Var3, captureRequestBuild, map4, map2, map5, arrayMap5, z, ne6Var2, jIncrementAndGet);
                        arrayList2.add(captureRequestBuild);
                        arrayList6.add(kg0Var3);
                    }
                    str5 = str;
                    arrayMap3 = arrayMap2;
                    cl7Var = cl7Var;
                    arrayMap4 = arrayMap;
                }
                return new qf0(gh0Var2.i0().m(), z, arrayList2, arrayList6, list2, vk1Var, arrayMap3, arrayMap4, this.e, this.f);
            }
            ne6 ne6Var3 = (ne6) it9.next();
            boolean z6 = false;
            for (dl7 dl7Var : ne6Var3.a) {
                int i9 = dl7Var.a;
                if (!arrayMap5.containsKey(dl7Var)) {
                    Surface surface2 = (Surface) this.c.get(dl7Var);
                    if (surface2 != null) {
                        arrayMap3.put(surface2, dl7Var);
                        arrayMap5.put(dl7Var, surface2);
                        fl0 fl0VarG = cl7Var.g(i9);
                        if (fl0VarG == null) {
                            bt.i("Required value was null.");
                            return null;
                        }
                        for (bl7 bl7Var4 : fl0VarG.b) {
                            Iterator it14 = it9;
                            Object obj2 = this.d.get(new pe5(bl7Var4.a));
                            if (obj2 == null) {
                                bt.i("Required value was null.");
                                return null;
                            }
                            arrayMap4.put((Surface) obj2, new pe5(bl7Var4.a));
                            it9 = it14;
                        }
                    } else {
                        continue;
                    }
                }
                z6 = true;
            }
            Iterator it15 = it9;
            if (!z6) {
                ne6Var3.toString();
                return null;
            }
            if (!z6) {
                bt.i("Check failed.");
                return null;
            }
            it9 = it15;
        }
    }

    public final void b() {
        q51 q51Var;
        qf0 qf0Var;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.i) {
                try {
                    q51Var = null;
                    if (this.j) {
                        qf0Var = null;
                    } else {
                        this.j = true;
                        me meVar = this.l;
                        if (meVar != null) {
                            p61.z(meVar);
                        }
                        Surface inputSurface = this.a.getInputSurface();
                        if (inputSurface != null) {
                            inputSurface.release();
                        }
                        qf0Var = this.k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.g && qf0Var != null) {
                Objects.toString(qf0Var);
                if (((dn8) this.b.b(2000L, new rf0(qf0Var, q51Var, (byte) 0))) == null) {
                    toString();
                    Objects.toString(qf0Var);
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046 A[Catch: all -> 0x0010, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x0012, B:14:0x001b, B:16:0x0021, B:18:0x0026, B:20:0x002a, B:21:0x002c, B:22:0x0039, B:23:0x0046, B:26:0x004e, B:27:0x0053), top: B:32:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e A[Catch: all -> 0x0010, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x0012, B:14:0x001b, B:16:0x0021, B:18:0x0026, B:20:0x002a, B:21:0x002c, B:22:0x0039, B:23:0x0046, B:26:0x004e, B:27:0x0053), top: B:32:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0053 A[Catch: all -> 0x0010, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x0012, B:14:0x001b, B:16:0x0021, B:18:0x0026, B:20:0x002a, B:21:0x002c, B:22:0x0039, B:23:0x0046, B:26:0x004e, B:27:0x0053), top: B:32:0x0003 }] */
    public final Integer c(qf0 qf0Var) {
        boolean z;
        gh0 gh0Var;
        ArrayList arrayList;
        Integer numR0;
        synchronized (this.i) {
            if (this.j) {
                toString();
                qf0Var.toString();
                return null;
            }
            if (qf0Var.c.size() == 1) {
                gh0 gh0Var2 = this.a;
                if (gh0Var2 instanceof ya) {
                    z = qf0Var.b;
                    gh0Var = this.a;
                    arrayList = qf0Var.c;
                    if (z) {
                        numR0 = gh0Var.L0(arrayList, qf0Var);
                    } else {
                        numR0 = gh0Var.R0(arrayList, qf0Var);
                    }
                } else if (qf0Var.b) {
                    if (this.g) {
                        this.k = qf0Var;
                    }
                    numR0 = gh0Var2.O0((CaptureRequest) qf0Var.c.get(0), qf0Var);
                } else {
                    numR0 = gh0Var2.G((CaptureRequest) qf0Var.c.get(0), qf0Var);
                }
            } else {
                z = qf0Var.b;
                gh0Var = this.a;
                arrayList = qf0Var.c;
                if (z) {
                    numR0 = gh0Var.L0(arrayList, qf0Var);
                } else {
                    numR0 = gh0Var.R0(arrayList, qf0Var);
                }
            }
            return numR0;
        }
    }

    public final String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.h;
    }
}
