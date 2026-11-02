package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;
import su.happ.proxyutility.dto.RouteSettings;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ft1 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;
    public final /* synthetic */ Object m0;
    public final /* synthetic */ Object n0;
    public final /* synthetic */ Object o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft1(String str, mr2 mr2Var, RouteSettings routeSettings, ht1 ht1Var, String str2, String str3, fn6[] fn6VarArr, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 0;
        this.i0 = str;
        this.l0 = mr2Var;
        this.m0 = routeSettings;
        this.n0 = ht1Var;
        this.j0 = str2;
        this.k0 = str3;
        this.o0 = fn6VarArr;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                return ((ft1) n(q51Var, b71Var)).q(dn8Var);
            case 1:
                return ((ft1) n(q51Var, b71Var)).q(dn8Var);
            case 2:
                return ((ft1) n(q51Var, b71Var)).q(dn8Var);
            case 3:
                ((ft1) n(q51Var, b71Var)).q(dn8Var);
                return c71Var;
            default:
                ((ft1) n(q51Var, b71Var)).q(dn8Var);
                return c71Var;
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.m0;
        Object obj3 = this.k0;
        Object obj4 = this.o0;
        Object obj5 = this.n0;
        Object obj6 = this.l0;
        Object obj7 = this.j0;
        Object obj8 = this.i0;
        switch (b) {
            case 0:
                return new ft1((String) obj8, (mr2) obj6, (RouteSettings) obj2, (ht1) obj5, (String) obj7, (String) obj3, (fn6[]) obj4, q51Var);
            case 1:
                return new ft1((n12) obj8, (ea6) obj7, (ea6) obj3, (v63) obj6, this.m0, (ea6) obj5, (oy1) obj4, q51Var, (byte) 1);
            case 2:
                return new ft1((n12) obj8, (v63) obj7, this.k0, (pd5) obj6, (oy1) obj2, (ht4) obj5, (z76) obj4, q51Var, (byte) 2);
            case 3:
                return new ft1((r77) obj8, (Context) obj7, (ky2) obj3, (Resources) obj6, (Activity) obj2, (ng4) obj5, (j74) obj4, q51Var, (byte) 3);
            default:
                return new ft1((r77) obj8, (ky2) obj7, (Resources) obj3, (Context) obj6, (Activity) obj2, (dn2) obj5, (gn2) obj4, q51Var, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:114:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:117:0x0304 A[LOOP:1: B:115:0x02fe->B:117:0x0304, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        at1 at1Var;
        List list;
        Iterator it;
        Object objB;
        Object[] objArr;
        a86 a86VarC;
        Object obj2 = null;
        Object[] objArr2 = 0;
        switch (this.g0) {
            case 0:
                String str = (String) this.i0;
                String str2 = (String) this.j0;
                ht1 ht1Var = (ht1) this.n0;
                mr2 mr2Var = (mr2) this.l0;
                c71 c71Var = c71.X;
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    ss8 ss8Var = ss8.a;
                    if (ss8.z(str)) {
                        String strConcat = mr2Var.X.concat(".temp");
                        File file = new File(((RouteSettings) this.m0).getLocalPathGeo());
                        str.getClass();
                        String path = new File(file, strConcat).getPath();
                        path.getClass();
                        j31 j31Var = new j31(new it1(path, 0L, str, 0L, null), (byte) 7);
                        nf1 nf1Var = tp1.a;
                        ye1 ye1Var = ye1.Z;
                        sf2 sf2Var = new sf2(new sf2(zc1.H(zc1.H(j31Var, ye1Var), ye1Var), new et1((String) this.j0, (String) this.k0, mr2Var, (ht1) this.n0, (fn6[]) this.o0, null), (byte) 2), new q5(2, objArr2 == true ? 1 : 0, (byte) 8), (byte) 1);
                        zj zjVar = new zj(ht1Var, str2, mr2Var, (byte) 2);
                        this.h0 = true;
                        if (sf2Var.a(zjVar, this) == c71Var) {
                            return c71Var;
                        }
                    } else {
                        ((mn6) ht1Var.d.getValue()).D(str2, (String) this.k0, new y0((Object) mr2Var, (byte) 25));
                        List list2 = ht1Var.a;
                        list2.getClass();
                        for (Object obj3 : list2) {
                            at1 at1Var2 = (at1) obj3;
                            if (dh3.f(at1Var2.a, str2) && at1Var2.c == mr2Var) {
                                obj2 = obj3;
                                at1Var = (at1) obj2;
                                if (at1Var != null) {
                                    StateDownloadFile stateDownloadFile = StateDownloadFile.LINK_NOT_CORRECT;
                                    stateDownloadFile.getClass();
                                    at1Var.d = stateDownloadFile;
                                    list = at1Var.f;
                                    if (list != null) {
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            ((fn6) it.next()).a(str2, false);
                                        }
                                    }
                                }
                                ht1Var.f();
                            }
                        }
                        at1Var = (at1) obj2;
                        if (at1Var != null) {
                            StateDownloadFile stateDownloadFile2 = StateDownloadFile.LINK_NOT_CORRECT;
                            stateDownloadFile2.getClass();
                            at1Var.d = stateDownloadFile2;
                            list = at1Var.f;
                            if (list != null) {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    ((fn6) it.next()).a(str2, false);
                                }
                            }
                        }
                        ht1Var.f();
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 1:
                c71 c71Var2 = c71.X;
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                n12 n12Var = (n12) this.i0;
                le7 le7Var = (le7) ((ea6) this.j0).X;
                uy0 uy0Var = (uy0) ((ea6) this.k0).X;
                v63 v63Var = (v63) this.l0;
                Object obj4 = this.m0;
                pd5 pd5Var = (pd5) ((ea6) this.n0).X;
                oy1 oy1Var = (oy1) this.o0;
                this.h0 = true;
                Object objA = n12Var.a(le7Var, uy0Var, v63Var, obj4, pd5Var, oy1Var, this);
                return objA == c71Var2 ? c71Var2 : objA;
            case 2:
                Object jw7Var = c71.X;
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    n12 n12Var2 = (n12) this.i0;
                    v63 v63Var2 = (v63) this.j0;
                    Object obj5 = this.k0;
                    pd5 pd5Var2 = (pd5) this.l0;
                    oy1 oy1Var2 = (oy1) this.m0;
                    this.h0 = true;
                    objB = n12Var2.b(v63Var2, obj5, pd5Var2, oy1Var2, this);
                    if (objB != jw7Var) {
                    }
                    return jw7Var;
                }
                if (!z3) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                objB = obj;
                i12 i12Var = (i12) objB;
                wg wgVar = ((n12) this.i0).b;
                synchronized (wgVar) {
                    try {
                        v76 v76Var = (v76) ((WeakReference) wgVar.b).get();
                        if (v76Var == null) {
                            wgVar.z();
                        } else if (((Context) wgVar.e) == null) {
                            Context context = v76Var.a.a;
                            wgVar.e = context;
                            context.registerComponentCallbacks((fe) wgVar.d);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                vk1 vk1Var = ((n12) this.i0).d;
                ht4 ht4Var = (ht4) this.n0;
                v63 v63Var3 = (v63) this.j0;
                if (ht4Var == null || !v63Var3.i.Y || !i12Var.a.c() || (a86VarC = ((v76) vk1Var.Y).c()) == null) {
                    objArr = false;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("coil#is_sampled", Boolean.valueOf(i12Var.b));
                    String str3 = i12Var.d;
                    if (str3 != null) {
                        linkedHashMap.put("coil#disk_cache_key", str3);
                    }
                    d53 d53Var = i12Var.a;
                    Map mapP = w51.P(linkedHashMap);
                    synchronized (a86VarC.c) {
                        long jE = d53Var.e();
                        if (jE < 0) {
                            throw new IllegalStateException(("Image size must be non-negative: " + jE).toString());
                        }
                        a86VarC.a.h(ht4Var, d53Var, mapP, jE);
                    }
                    objArr = true;
                }
                d53 d53Var2 = i12Var.a;
                v63 v63Var4 = (v63) this.j0;
                ma1 ma1Var = i12Var.c;
                ht4 ht4Var2 = objArr != false ? (ht4) this.n0 : null;
                String str4 = i12Var.d;
                boolean z4 = i12Var.b;
                z76 z76Var = (z76) this.o0;
                jw7Var = new jw7(d53Var2, v63Var4, ma1Var, ht4Var2, str4, z4, z76Var != null && z76Var.Y);
                return jw7Var;
            case 3:
                c71 c71Var3 = c71.X;
                boolean z5 = this.h0;
                if (!z5) {
                    w39.n0(obj);
                    r77 r77Var = (r77) this.i0;
                    ug4 ug4Var = new ug4((Context) this.j0, (ky2) this.k0, (Resources) this.l0, (Activity) this.m0, (ng4) this.n0, (j74) this.o0);
                    this.h0 = true;
                    if (r77Var.a(ug4Var, this) == c71Var3) {
                        return c71Var3;
                    }
                } else {
                    if (!z5) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                b61.n();
                return null;
            default:
                c71 c71Var4 = c71.X;
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    r77 r77Var2 = (r77) this.i0;
                    kg3 kg3Var = new kg3((ky2) this.j0, (Resources) this.k0, (Context) this.l0, (Activity) this.m0, (dn2) this.n0, (gn2) this.o0, null);
                    r77Var2.getClass();
                    this.h0 = true;
                    if (z91.n(r77Var2, kg3Var, this) == c71Var4) {
                        return c71Var4;
                    }
                } else {
                    if (!z6) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.j0 = obj2;
        this.k0 = obj3;
        this.l0 = obj4;
        this.m0 = obj5;
        this.n0 = obj6;
        this.o0 = obj7;
    }
}
