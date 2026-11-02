package defpackage;

import com.tencent.mmkv.MMKV;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.domain.routing.entity.GeoFileKey;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;
import su.happ.proxyutility.dto.RouteSettings;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ht1 {
    public final List a;
    public final oh7 b;
    public final h76 c;
    public final vz7 d;
    public final vz7 e;
    public final m51 f;
    public final q15 g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [d02] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    public ht1() {
        Object rj6Var;
        ?? arrayList;
        Object value;
        em5 em5Var;
        Object next;
        Object success;
        Object obj;
        StateDownloadFile stateDownloadFile;
        Type type = new gt1().b;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.a = listSynchronizedList;
        dm5 dm5Var = dm5.f0;
        dm5Var.getClass();
        oh7 oh7VarA = ph7.a(dm5Var);
        this.b = oh7VarA;
        this.c = jm4.n(oh7VarA);
        this.d = new vz7(new w01((byte) 20));
        vz7 vz7Var = new vz7(new w01((byte) 21));
        this.e = vz7Var;
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        this.f = gv3.c(g33.K(ow7VarB, dm4.a));
        this.g = r15.a();
        String strI = ((MMKV) vz7Var.getValue()).i("listDataDownloadGeoFilesInStorage");
        if (strI != null) {
            listSynchronizedList.clear();
            try {
                List list = (List) yw2.b.d(strI, type);
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        at1 at1Var = (at1) obj2;
                        if (((mn6) this.d.getValue()).n(at1Var.a, at1Var.b) != null) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = d02.X;
                }
                ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
                for (at1 at1Var2 : arrayList) {
                    Iterator it = StateDownloadFile.a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next2 = it.next();
                        if (dh3.f(((StateDownloadFile) next2).name(), at1Var2.d.name())) {
                            obj = next2;
                            break;
                        }
                    }
                    StateDownloadFile stateDownloadFile2 = (StateDownloadFile) obj;
                    int i = stateDownloadFile2 == null ? -1 : bt1.a[stateDownloadFile2.ordinal()];
                    if (i == -1) {
                        stateDownloadFile = StateDownloadFile.SUCCESS;
                    } else if (i == 1 || i == 2 || i == 3) {
                        stateDownloadFile = StateDownloadFile.FAILURE;
                    } else if (i == 4) {
                        stateDownloadFile = StateDownloadFile.LINK_NOT_CORRECT;
                    } else {
                        if (i != 5) {
                            throw new b55();
                        }
                        stateDownloadFile = StateDownloadFile.SUCCESS;
                    }
                    StateDownloadFile stateDownloadFile3 = stateDownloadFile;
                    String str = at1Var2.a;
                    String str2 = at1Var2.b;
                    mr2 mr2Var = at1Var2.c;
                    bm3 bm3Var = at1Var2.e;
                    List list2 = at1Var2.f;
                    str.getClass();
                    str2.getClass();
                    mr2Var.getClass();
                    stateDownloadFile3.getClass();
                    arrayList2.add(new at1(str, str2, mr2Var, stateDownloadFile3, bm3Var, list2));
                }
                listSynchronizedList.addAll(arrayList2);
                oh7 oh7Var = this.b;
                do {
                    value = oh7Var.getValue();
                    dm5 dm5Var2 = dm5.f0;
                    dm5Var2.getClass();
                    em5Var = new em5(dm5Var2);
                    for (at1 at1Var3 : arrayList) {
                        GeoFileKey geoFileKey = new GeoFileKey(at1Var3.c, at1Var3.a, at1Var3.b);
                        Iterator it2 = StateDownloadFile.a().iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!dh3.f(((StateDownloadFile) next).name(), at1Var3.d.name()));
                        StateDownloadFile stateDownloadFile4 = (StateDownloadFile) next;
                        int i2 = stateDownloadFile4 == null ? -1 : bt1.a[stateDownloadFile4.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1 || i2 == 2 || i2 == 3) {
                                success = new StateDownloadFileV2.Error.Failure(System.currentTimeMillis());
                            } else if (i2 == 4) {
                                success = new StateDownloadFileV2.Error.LinkNotCorrect(System.currentTimeMillis());
                            } else if (i2 != 5) {
                                throw new b55();
                            }
                            em5Var.put(geoFileKey, success);
                        }
                        success = new StateDownloadFileV2.Success(System.currentTimeMillis());
                        em5Var.put(geoFileKey, success);
                    }
                } while (!oh7Var.k(value, em5Var.f()));
                rj6Var = dn8.a;
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            if (sj6.a(rj6Var) != null) {
                ((MMKV) this.e.getValue()).remove("listDataDownloadGeoFilesInStorage");
            }
        }
    }

    public static String c(mr2 mr2Var, String str) {
        return str + "/" + mr2Var.X;
    }

    public static final void d(ht1 ht1Var, String str, String str2, mr2 mr2Var) {
        File file = new File(c(mr2Var, str));
        File file2 = new File(c(mr2Var, str2));
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (file.exists()) {
            file.renameTo(file2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(s51 s51Var, mr2 mr2Var, String str, String str2, RouteSettings routeSettings, fn6[] fn6VarArr) {
        ct1 ct1Var;
        RouteSettings routeSettings2;
        fn6[] fn6VarArr2;
        mr2 mr2Var2;
        String str3;
        String str4;
        q15 q15Var;
        Object next;
        boolean z;
        String geoSiteUrl;
        List list = this.a;
        if (s51Var instanceof ct1) {
            ct1Var = (ct1) s51Var;
            int i = ct1Var.n0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ct1Var.n0 = i - Integer.MIN_VALUE;
            } else {
                ct1Var = new ct1(this, s51Var);
            }
        } else {
            ct1Var = new ct1(this, s51Var);
        }
        Object obj = ct1Var.l0;
        int i2 = ct1Var.n0;
        Object obj2 = null;
        if (i2 == 0) {
            w39.n0(obj);
            ct1Var.f0 = mr2Var;
            ct1Var.g0 = str;
            ct1Var.h0 = str2;
            routeSettings2 = routeSettings;
            ct1Var.i0 = routeSettings2;
            fn6VarArr2 = fn6VarArr;
            ct1Var.j0 = fn6VarArr2;
            q15 q15Var2 = this.g;
            ct1Var.k0 = q15Var2;
            ct1Var.n0 = 1;
            Object objG = q15Var2.g(ct1Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
            mr2Var2 = mr2Var;
            str3 = str;
            str4 = str2;
            q15Var = q15Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q15Var = ct1Var.k0;
            fn6[] fn6VarArr3 = (fn6[]) ct1Var.j0;
            routeSettings2 = ct1Var.i0;
            String str5 = ct1Var.h0;
            String str6 = ct1Var.g0;
            mr2 mr2Var3 = ct1Var.f0;
            w39.n0(obj);
            mr2Var2 = mr2Var3;
            str4 = str5;
            str3 = str6;
            fn6VarArr2 = fn6VarArr3;
        }
        try {
            list.getClass();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                at1 at1Var = (at1) next;
                if (dh3.f(at1Var.a, str3) && at1Var.c == mr2Var2) {
                    break;
                }
            }
            at1 at1Var2 = (at1) next;
            StateDownloadFile stateDownloadFile = at1Var2 != null ? at1Var2.d : null;
            int i3 = stateDownloadFile == null ? -1 : bt1.a[stateDownloadFile.ordinal()];
            if (i3 == 1 || i3 == 2) {
                z = true;
            } else {
                e(mr2Var2, str3);
                StateDownloadFile stateDownloadFile2 = StateDownloadFile.START;
                fn6VarArr2.getClass();
                z = false;
                list.add(new at1(str3, str4, mr2Var2, stateDownloadFile2, null, new ArrayList(new jt(fn6VarArr2, false))));
            }
            q15Var.m(null);
            if (z) {
                return null;
            }
            int iOrdinal = mr2Var2.ordinal();
            if (iOrdinal == 0) {
                geoSiteUrl = routeSettings2.getGeoSiteUrl();
            } else {
                if (iOrdinal != 1) {
                    b61.c();
                    return null;
                }
                geoSiteUrl = routeSettings2.getGeoIpUrl();
            }
            String str7 = geoSiteUrl;
            nf1 nf1Var = tp1.a;
            og7 og7VarQ = jm4.Q(this.f, dm4.a, new ft1(str7, mr2Var2, routeSettings2, this, str3, str4, fn6VarArr2, null), 2);
            for (Object obj3 : list) {
                at1 at1Var3 = (at1) obj3;
                if (dh3.f(at1Var3.a, str3) && at1Var3.c == mr2Var2) {
                    obj2 = obj3;
                    break;
                }
            }
            at1 at1Var4 = (at1) obj2;
            if (at1Var4 != null) {
                at1Var4.e = og7VarQ;
            }
            f();
            return og7VarQ;
        } catch (Throwable th) {
            q15Var.m(null);
            throw th;
        }
    }

    public final void b(mr2 mr2Var, String str, String str2, boolean z) {
        Object next;
        vz7 vz7Var = this.d;
        ((mn6) vz7Var.getValue()).D(str, str2, new zs1((Object) mr2Var, z, (byte) 0));
        List list = this.a;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (dh3.f(((at1) obj).a, str)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((at1) next).c != mr2Var);
        at1 at1Var = (at1) next;
        if (at1Var != null) {
            StateDownloadFile stateDownloadFile = z ? StateDownloadFile.SUCCESS : StateDownloadFile.FAILURE;
            stateDownloadFile.getClass();
            at1Var.d = stateDownloadFile;
            List list2 = at1Var.f;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((fn6) it2.next()).a(str, z);
                }
            }
            f();
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((at1) it3.next()).d != StateDownloadFile.SUCCESS) {
                    return;
                }
            }
        }
        ((mn6) vz7Var.getValue()).D(str, str2, new y0((Object) this, (byte) 24));
    }

    public final void e(mr2 mr2Var, String str) {
        Object next;
        List list = this.a;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            at1 at1Var = (at1) next;
            if (dh3.f(at1Var.a, str) && at1Var.c == mr2Var) {
                break;
            }
        }
        at1 at1Var2 = (at1) next;
        if (at1Var2 != null) {
            bm3 bm3Var = at1Var2.e;
            if (bm3Var != null) {
                bm3Var.m(null);
            }
            list.remove(at1Var2);
            f();
        }
    }

    public final void f() {
        List list = this.a;
        list.getClass();
        boolean zIsEmpty = list.isEmpty();
        vz7 vz7Var = this.e;
        if (zIsEmpty) {
            ((MMKV) vz7Var.getValue()).remove("listDataDownloadGeoFilesInStorage");
        } else {
            ((MMKV) vz7Var.getValue()).q("listDataDownloadGeoFilesInStorage", yw2.b.h(list));
        }
    }
}
