package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xm0 implements ki8 {
    public final /* synthetic */ byte X;
    public int Y;
    public final Object Z;
    public final Object f0;
    public Object g0;
    public final Object h0;

    public xm0(z47 z47Var, ed1 ed1Var, pl3 pl3Var, int i) {
        this.X = (byte) 2;
        z47Var.getClass();
        pl3Var.getClass();
        this.f0 = z47Var;
        this.g0 = ed1Var;
        this.Y = i;
        ArrayList typeParameters = pl3Var.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.Z = linkedHashMap;
        this.h0 = ((ve4) ((c6) ((z47) this.f0).Y).f0).c(new f0(this, (byte) 22));
    }

    @Override // defpackage.ki8
    public hi8 M(hb6 hb6Var) {
        hb6Var.getClass();
        j54 j54Var = (j54) ((vt1) this.h0).B(hb6Var);
        return j54Var != null ? j54Var : ((ki8) ((z47) this.f0).Z).M(hb6Var);
    }

    public void a() {
        List<qf0> listY0;
        synchronized (((ArrayList) this.Z)) {
            listY0 = wv0.Y0((ArrayList) this.Z);
            ((ArrayList) this.Z).clear();
        }
        for (qf0 qf0Var : listY0) {
            Trace.beginSection("InvokeInternalListeners");
            int size = qf0Var.d.size();
            for (int i = 0; i < size; i++) {
                te6 te6Var = (te6) qf0Var.d.get(i);
                int size2 = qf0Var.e.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((me6) qf0Var.e.get(i2)).a0(te6Var.getRequest());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = qf0Var.d.size();
            for (int i3 = 0; i3 < size3; i3++) {
                te6 te6Var2 = (te6) qf0Var.d.get(i3);
                int size4 = te6Var2.getRequest().d.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((me6) te6Var2.getRequest().d.get(i4)).a0(te6Var2.getRequest());
                }
            }
            Trace.endSection();
        }
        sf0 sf0Var = (sf0) this.f0;
        synchronized (sf0Var.i) {
            sf0Var.toString();
            sf0Var.a.b0();
        }
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((xg0) it.next());
        }
    }

    public void c(xg0 xg0Var) {
        ArrayList arrayList = (ArrayList) this.Z;
        if (arrayList.contains(xg0Var)) {
            return;
        }
        arrayList.add(xg0Var);
    }

    public void d(l11 l11Var) {
        for (zx zxVar : l11Var.b()) {
            ((k05) this.g0).a(zxVar, null);
            ((k05) this.g0).l(zxVar, l11Var.i(zxVar), l11Var.d(zxVar));
        }
    }

    public ym0 e() {
        ArrayList arrayList = new ArrayList((HashSet) this.f0);
        qd5 qd5VarC = qd5.c((k05) this.g0);
        int i = this.Y;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.Z);
        a15 a15Var = (a15) this.h0;
        d18 d18Var = d18.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a15Var.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new ym0(arrayList, qd5VarC, i, arrayList2, new d18(arrayMap));
    }

    public dn8 f() {
        toString();
        boolean zA = ((pv) this.g0).a();
        dn8 dn8Var = dn8.a;
        if (zA) {
            ((sf0) this.f0).b();
        }
        return dn8Var;
    }

    public boolean g(boolean z, List list, Map map, Map map2, Map map3, List list2) throws Throwable {
        Throwable th;
        boolean z2;
        boolean z3;
        map2.getClass();
        map3.getClass();
        list2.getClass();
        if (((pv) this.g0).b()) {
            list.toString();
            toString();
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            qf0 qf0VarA = ((sf0) this.f0).a(z, list, map, map2, map3, (vk1) this.h0, list2);
            Trace.endSection();
            if (qf0VarA == null) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((ne6) it.next()).getClass();
                    }
                }
                list.toString();
                toString();
                return false;
            }
            if (((pv) this.g0).b()) {
                list.toString();
                toString();
                return false;
            }
            if (!qf0VarA.b) {
                synchronized (((ArrayList) this.Z)) {
                    ((ArrayList) this.Z).add(qf0VarA);
                }
            }
            try {
                toString();
                qf0VarA.toString();
                Trace.beginSection("InvokeInternalListeners");
                int size = qf0VarA.d.size();
                for (int i = 0; i < size; i++) {
                    te6 te6Var = (te6) qf0VarA.d.get(i);
                    int size2 = qf0VarA.e.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((me6) qf0VarA.e.get(i2)).m(te6Var);
                    }
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = qf0VarA.d.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    te6 te6Var2 = (te6) qf0VarA.d.get(i3);
                    int size4 = te6Var2.getRequest().d.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((me6) te6Var2.getRequest().d.get(i4)).m(te6Var2);
                    }
                }
                Trace.endSection();
                synchronized (qf0VarA) {
                    if (!((pv) this.g0).b()) {
                        try {
                            Trace.beginSection("CXCP#submit(CaptureSequence)");
                            Integer numC = ((sf0) this.f0).c(qf0VarA);
                            int iIntValue = numC != null ? numC.intValue() : -1;
                            qf0VarA.m = Integer.valueOf(iIntValue);
                            Trace.endSection();
                            if (iIntValue != -1) {
                                Trace.beginSection("InvokeInternalListeners");
                                int size5 = qf0VarA.d.size();
                                for (int i5 = 0; i5 < size5; i5++) {
                                    te6 te6Var3 = (te6) qf0VarA.d.get(i5);
                                    int size6 = qf0VarA.e.size();
                                    for (int i6 = 0; i6 < size6; i6++) {
                                        ((me6) qf0VarA.e.get(i6)).R(te6Var3);
                                    }
                                }
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size7 = qf0VarA.d.size();
                                for (int i7 = 0; i7 < size7; i7++) {
                                    te6 te6Var4 = (te6) qf0VarA.d.get(i7);
                                    int size8 = te6Var4.getRequest().d.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        ((me6) te6Var4.getRequest().d.get(i8)).R(te6Var4);
                                    }
                                }
                                Trace.endSection();
                                z3 = true;
                                try {
                                    toString();
                                    qf0VarA.toString();
                                } catch (CameraAccessException unused) {
                                } catch (Throwable th2) {
                                    z2 = true;
                                    th = th2;
                                    if (z2 || qf0VarA.b) {
                                        throw th;
                                    }
                                    synchronized (((ArrayList) this.Z)) {
                                        ((ArrayList) this.Z).remove(qf0VarA);
                                    }
                                    Trace.beginSection("InvokeInternalListeners");
                                    int size9 = qf0VarA.d.size();
                                    for (int i9 = 0; i9 < size9; i9++) {
                                        te6 te6Var5 = (te6) qf0VarA.d.get(i9);
                                        int size10 = qf0VarA.e.size();
                                        for (int i10 = 0; i10 < size10; i10++) {
                                            ((me6) qf0VarA.e.get(i10)).a0(te6Var5.getRequest());
                                        }
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("InvokeRequestListeners");
                                    int size11 = qf0VarA.d.size();
                                    for (int i11 = 0; i11 < size11; i11++) {
                                        te6 te6Var6 = (te6) qf0VarA.d.get(i11);
                                        int size12 = te6Var6.getRequest().d.size();
                                        for (int i12 = 0; i12 < size12; i12++) {
                                            ((me6) te6Var6.getRequest().d.get(i12)).a0(te6Var6.getRequest());
                                        }
                                    }
                                    Trace.endSection();
                                    throw th;
                                }
                            } else {
                                qf0VarA.toString();
                                toString();
                                z3 = false;
                            }
                            if (z3 || qf0VarA.b) {
                                return z3;
                            }
                            synchronized (((ArrayList) this.Z)) {
                                ((ArrayList) this.Z).remove(qf0VarA);
                            }
                            Trace.beginSection("InvokeInternalListeners");
                            int size13 = qf0VarA.d.size();
                            for (int i13 = 0; i13 < size13; i13++) {
                                te6 te6Var7 = (te6) qf0VarA.d.get(i13);
                                int size14 = qf0VarA.e.size();
                                for (int i14 = 0; i14 < size14; i14++) {
                                    ((me6) qf0VarA.e.get(i14)).a0(te6Var7.getRequest());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size15 = qf0VarA.d.size();
                            for (int i15 = 0; i15 < size15; i15++) {
                                te6 te6Var8 = (te6) qf0VarA.d.get(i15);
                                int size16 = te6Var8.getRequest().d.size();
                                for (int i16 = 0; i16 < size16; i16++) {
                                    ((me6) te6Var8.getRequest().d.get(i16)).a0(te6Var8.getRequest());
                                }
                            }
                            Trace.endSection();
                            return z3;
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                    qf0VarA.toString();
                    toString();
                    if (!qf0VarA.b) {
                        synchronized (((ArrayList) this.Z)) {
                            ((ArrayList) this.Z).remove(qf0VarA);
                        }
                        Trace.beginSection("InvokeInternalListeners");
                        int size17 = qf0VarA.d.size();
                        for (int i17 = 0; i17 < size17; i17++) {
                            te6 te6Var9 = (te6) qf0VarA.d.get(i17);
                            int size18 = qf0VarA.e.size();
                            for (int i18 = 0; i18 < size18; i18++) {
                                ((me6) qf0VarA.e.get(i18)).a0(te6Var9.getRequest());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size19 = qf0VarA.d.size();
                        for (int i19 = 0; i19 < size19; i19++) {
                            te6 te6Var10 = (te6) qf0VarA.d.get(i19);
                            int size20 = te6Var10.getRequest().d.size();
                            for (int i20 = 0; i20 < size20; i20++) {
                                ((me6) te6Var10.getRequest().d.get(i20)).a0(te6Var10.getRequest());
                            }
                        }
                        Trace.endSection();
                        return false;
                    }
                    return false;
                }
            } catch (CameraAccessException unused2) {
                if (!qf0VarA.b) {
                    synchronized (((ArrayList) this.Z)) {
                        ((ArrayList) this.Z).remove(qf0VarA);
                        Trace.beginSection("InvokeInternalListeners");
                        int size21 = qf0VarA.d.size();
                        for (int i21 = 0; i21 < size21; i21++) {
                            te6 te6Var11 = (te6) qf0VarA.d.get(i21);
                            int size22 = qf0VarA.e.size();
                            for (int i22 = 0; i22 < size22; i22++) {
                                ((me6) qf0VarA.e.get(i22)).a0(te6Var11.getRequest());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size23 = qf0VarA.d.size();
                        for (int i23 = 0; i23 < size23; i23++) {
                            te6 te6Var12 = (te6) qf0VarA.d.get(i23);
                            int size24 = te6Var12.getRequest().d.size();
                            for (int i24 = 0; i24 < size24; i24++) {
                                ((me6) te6Var12.getRequest().d.get(i24)).a0(te6Var12.getRequest());
                            }
                        }
                        Trace.endSection();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                z2 = false;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    public String toString() {
        switch (this.X) {
            case 1:
                return "GraphRequestProcessor-" + this.Y;
            default:
                return super.toString();
        }
    }

    public xm0(sf0 sf0Var) {
        this.X = (byte) 1;
        this.f0 = sf0Var;
        qv qvVar = jt2.a;
        qvVar.getClass();
        this.Y = qv.b.incrementAndGet(qvVar);
        this.g0 = nr4.e(false);
        this.Z = new ArrayList();
        this.h0 = new vk1((Object) this, (byte) 14);
    }

    public xm0() {
        this.X = (byte) 0;
        this.f0 = new HashSet();
        this.g0 = k05.j();
        this.Y = -1;
        this.Z = new ArrayList();
        this.h0 = a15.a();
    }
}
