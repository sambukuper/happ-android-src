package defpackage;

import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.ExcludeSettingsCache;
import su.happ.proxyutility.dto.RouteSettings;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class u42 {
    public final vz7 a = new vz7(new w01((byte) 24));
    public final oh7 b;
    public final h76 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u42() {
        oh7 oh7VarA = ph7.a(m02.X);
        this.b = oh7VarA;
        this.c = jm4.n(oh7VarA);
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Set c(String str) {
        return w27.o0(w27.l0(new la2(new la2(w27.l0(new hu(fm7.F0(fm7.R0(str).toString(), new String[]{","}, 6), (byte) 1), s42.X), true, t42.X), true, new h80((byte) 23)), new h80((byte) 24)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final dn8 a(String str, ub ubVar, ub ubVar2) {
        rj6 rj6Var;
        Object value;
        rj6 rj6Var2 = dn8.a;
        try {
            if (fm7.o0(str)) {
                if (ubVar2 != null) {
                    ubVar2.invoke();
                }
            } else if (!fm7.o0(str)) {
                Set setC = c(str);
                oh7 oh7Var = this.b;
                do {
                    value = oh7Var.getValue();
                } while (!oh7Var.k(value, q57.Z((Set) value, setC)));
                d();
            } else if (ubVar2 != null) {
                ubVar2.invoke();
            }
            rj6Var = rj6Var2;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) == null) {
            if (ubVar != null) {
                ubVar.invoke();
                return rj6Var2;
            }
        } else if (ubVar2 != null) {
            ubVar2.invoke();
            return rj6Var2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        oh7 oh7Var;
        Object value;
        dn8 rj6Var;
        Object value2;
        Object value3;
        do {
            oh7Var = this.b;
            value = oh7Var.getValue();
        } while (!oh7Var.k(value, m02.X));
        String strI = ((MMKV) this.a.getValue()).i("setting_exclude_routes");
        if (strI == null) {
            RouteSettings.INSTANCE.getClass();
            List<String> list = RouteSettings.LAN_ADDRESSES;
            ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
            for (String str : list) {
                arrayList.add(new ExcludeSettingsCache(str, jm4.E(str)));
            }
            Set setC1 = wv0.c1(arrayList);
            do {
                value3 = oh7Var.getValue();
            } while (!oh7Var.k(value3, setC1));
            return;
        }
        try {
            Set set = (Set) new a().d(strI, ((yi8) new r42()).b);
            if (set != null) {
                Set<String> set2 = set;
                ArrayList arrayList2 = new ArrayList(xv0.Z(set2, 10));
                for (String str2 : set2) {
                    arrayList2.add(new ExcludeSettingsCache(str2, jm4.E(str2)));
                }
                Set setC2 = wv0.c1(arrayList2);
                do {
                    value2 = oh7Var.getValue();
                } while (!oh7Var.k(value2, setC2));
            }
            rj6Var = dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Throwable thA = sj6.a(rj6Var);
        if (thA != null) {
            thA.getMessage();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d() {
        oh7 oh7Var = this.b;
        try {
            boolean zIsEmpty = ((Set) oh7Var.getValue()).isEmpty();
            vz7 vz7Var = this.a;
            if (!zIsEmpty) {
                MMKV mmkv = (MMKV) vz7Var.getValue();
                a aVar = new a();
                Iterable iterable = (Iterable) oh7Var.getValue();
                ArrayList arrayList = new ArrayList(xv0.Z(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ExcludeSettingsCache) it.next()).getValue());
                }
                mmkv.q("setting_exclude_routes", aVar.h(arrayList));
            } else if (((MMKV) vz7Var.getValue()).contains("setting_exclude_routes")) {
                ((MMKV) vz7Var.getValue()).q("setting_exclude_routes", "");
            }
            return dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:3:0x0005, B:7:0x0010, B:8:0x001e, B:10:0x0029, B:14:0x0049, B:16:0x004d, B:30:0x0098, B:32:0x00a3, B:37:0x00eb, B:35:0x00b5, B:20:0x0059, B:21:0x0067, B:23:0x0072, B:27:0x008e, B:29:0x0092, B:39:0x00f5, B:40:0x010b), top: B:49:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:3:0x0005, B:7:0x0010, B:8:0x001e, B:10:0x0029, B:14:0x0049, B:16:0x004d, B:30:0x0098, B:32:0x00a3, B:37:0x00eb, B:35:0x00b5, B:20:0x0059, B:21:0x0067, B:23:0x0072, B:27:0x008e, B:29:0x0092, B:39:0x00f5, B:40:0x010b), top: B:49:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0092 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:3:0x0005, B:7:0x0010, B:8:0x001e, B:10:0x0029, B:14:0x0049, B:16:0x004d, B:30:0x0098, B:32:0x00a3, B:37:0x00eb, B:35:0x00b5, B:20:0x0059, B:21:0x0067, B:23:0x0072, B:27:0x008e, B:29:0x0092, B:39:0x00f5, B:40:0x010b), top: B:49:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x008d A[SYNTHETIC] */
    public final Object e(String str, ExcludeSettingsCache excludeSettingsCache) {
        rw1 it;
        Object next;
        pb3 pb3Var;
        pb3 pb3Var2;
        Object value;
        o57 o57Var;
        Object value2;
        Object next2;
        pb3 pb3Var3;
        str.getClass();
        try {
            if (!jm4.N(str)) {
                throw new Exception("value:" + str + " is NOT Ip Prefix");
            }
            oh7 oh7Var = this.b;
            Integer numValueOf = null;
            if (excludeSettingsCache != null) {
                rw1 it2 = wv0.d1((Iterable) oh7Var.getValue()).iterator();
                do {
                    if (!it2.Y.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    pb3Var3 = (pb3) next2;
                    int i = pb3Var3.a;
                } while (!dh3.f(((ExcludeSettingsCache) pb3Var3.b).getValue(), excludeSettingsCache.getValue()));
                pb3 pb3Var4 = (pb3) next2;
                Integer numValueOf2 = pb3Var4 != null ? Integer.valueOf(pb3Var4.a) : null;
                if (numValueOf2 != null) {
                    numValueOf = numValueOf2;
                } else {
                    it = wv0.d1((Iterable) oh7Var.getValue()).iterator();
                    do {
                        if (it.Y.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        pb3Var2 = (pb3) next;
                        int i2 = pb3Var2.a;
                    } while (!dh3.f(((ExcludeSettingsCache) pb3Var2.b).getValue(), str));
                    pb3Var = (pb3) next;
                    if (pb3Var != null) {
                        numValueOf = Integer.valueOf(pb3Var.a);
                    }
                }
            } else {
                it = wv0.d1((Iterable) oh7Var.getValue()).iterator();
                do {
                    if (it.Y.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    pb3Var2 = (pb3) next;
                    int i3 = pb3Var2.a;
                } while (!dh3.f(((ExcludeSettingsCache) pb3Var2.b).getValue(), str));
                pb3Var = (pb3) next;
                if (pb3Var != null) {
                    numValueOf = Integer.valueOf(pb3Var.a);
                }
            }
            ExcludeSettingsCache excludeSettingsCache2 = new ExcludeSettingsCache(str, jm4.E(str));
            if (numValueOf == null) {
                do {
                    value2 = oh7Var.getValue();
                } while (!oh7Var.k(value2, q57.a0((Set) value2, excludeSettingsCache2)));
            } else {
                do {
                    value = oh7Var.getValue();
                    Set set = (Set) value;
                    o57Var = new o57();
                    o57Var.addAll(wv0.U0(set, numValueOf.intValue()));
                    o57Var.add(excludeSettingsCache2);
                    o57Var.addAll(wv0.o0(set, numValueOf.intValue() + 1));
                } while (!oh7Var.k(value, w45.m(o57Var)));
            }
            w39.n0(d());
            return dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }
}
