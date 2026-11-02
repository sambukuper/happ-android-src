package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import libxray.XRayVPNServiceSupportsSet;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f08 implements qd7, bw6, r61, y23, lu8, XRayVPNServiceSupportsSet, r51 {
    public static f08 Y;
    public static final /* synthetic */ f08 Z = new f08((byte) 18);
    public static final /* synthetic */ f08 f0 = new f08((byte) 19);
    public final /* synthetic */ byte X;

    public f08(o7 o7Var) {
        this.X = (byte) 1;
    }

    public static void b(xr6 xr6Var, Object obj) {
        l49 l49Var = (l49) obj;
        xr6Var.getClass();
        String str = l49Var.a;
        xr6Var.T(1, str);
        xr6Var.i(2, a28.u(l49Var.b));
        xr6Var.T(3, l49Var.c);
        xr6Var.T(4, l49Var.d);
        u91 u91Var = u91.b;
        xr6Var.j(5, wl7.c0(l49Var.e));
        xr6Var.j(6, wl7.c0(l49Var.f));
        xr6Var.i(7, l49Var.g);
        xr6Var.i(8, l49Var.h);
        xr6Var.i(9, l49Var.i);
        xr6Var.i(10, l49Var.k);
        xr6Var.i(11, a28.a(l49Var.l));
        xr6Var.i(12, l49Var.m);
        xr6Var.i(13, l49Var.n);
        xr6Var.i(14, l49Var.o);
        xr6Var.i(15, l49Var.p);
        xr6Var.i(16, l49Var.q ? 1L : 0L);
        xr6Var.i(17, a28.r(l49Var.r));
        xr6Var.i(18, l49Var.s);
        xr6Var.i(19, l49Var.t);
        xr6Var.i(20, l49Var.u);
        xr6Var.i(21, l49Var.v);
        xr6Var.i(22, l49Var.w);
        String str2 = l49Var.x;
        if (str2 == null) {
            xr6Var.l(23);
        } else {
            xr6Var.T(23, str2);
        }
        Boolean bool = l49Var.y;
        Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
        if (numValueOf == null) {
            xr6Var.l(24);
        } else {
            xr6Var.i(24, numValueOf.intValue());
        }
        p31 p31Var = l49Var.j;
        xr6Var.i(25, a28.p(p31Var.a));
        xr6Var.j(26, a28.d(p31Var.b));
        xr6Var.i(27, p31Var.c ? 1L : 0L);
        xr6Var.i(28, p31Var.d ? 1L : 0L);
        xr6Var.i(29, p31Var.e ? 1L : 0L);
        xr6Var.i(30, p31Var.f ? 1L : 0L);
        xr6Var.i(31, p31Var.g);
        xr6Var.i(32, p31Var.h);
        xr6Var.j(33, a28.s(p31Var.i));
        xr6Var.T(34, str);
    }

    public static e69 i(int i) {
        e69 e69Var = (e69) wv0.u0(i, e69.i0);
        return e69Var == null ? e69.f0 : e69Var;
    }

    @Override // defpackage.bw6
    public Object U(hv6 hv6Var, Object obj) {
        u88 u88Var = (u88) obj;
        Integer numValueOf = Integer.valueOf(u88Var.a);
        String str = u88Var.b;
        String str2 = u88Var.c;
        long j = u88Var.d;
        int i = f88.c;
        Integer numValueOf2 = Integer.valueOf((int) (j >> 32));
        Integer numValueOf3 = Integer.valueOf((int) (j & 4294967295L));
        long j2 = u88Var.e;
        return i21.L(numValueOf, str, str2, numValueOf2, numValueOf3, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (4294967295L & j2)), Long.valueOf(u88Var.f));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x003b A[RETURN] */
    @Override // defpackage.qd7
    public boolean X(Object obj, Object obj2) {
        t58 t58Var = (t58) obj;
        t58 t58Var2 = (t58) obj2;
        if (t58Var == null || t58Var2 == null) {
            if ((t58Var == null) ^ (t58Var2 == null)) {
                return false;
            }
            return true;
        }
        if (t58Var.a == t58Var2.a && dh3.f(t58Var.b, t58Var2.b) && t58Var.c == t58Var2.c && t58Var.d == t58Var2.d && t58Var.e == t58Var2.e) {
            return true;
        }
        return false;
    }

    public void c(sm smVar, sm smVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = smVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((gm) it.next()).d());
        }
        Iterator it2 = smVar2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((gm) it2.next()).d());
        }
    }

    public aa7 e(yr6 yr6Var, ch8 ch8Var, boolean z, int i, boolean z2) {
        ch8 ch8VarK;
        km1 km1Var = (km1) yr6Var.Z;
        ni8 ni8VarF = f(new wg7(km1Var.J0(), rt8.INVARIANT), yr6Var, null, i);
        t14 t14VarB = ni8VarF.b();
        t14VarB.getClass();
        aa7 aa7VarA = s08.a(t14VarB);
        if (vr3.J(aa7VarA)) {
            return aa7VarA;
        }
        ni8VarF.a();
        c(aa7VarA.getAnnotations(), xm.a(ch8Var));
        if (!vr3.J(aa7VarA)) {
            if (vr3.J(aa7VarA)) {
                ch8VarK = aa7VarA.m0();
            } else {
                ch8 ch8VarM0 = aa7VarA.m0();
                xd6 xd6Var = ch8.Y;
                ch8VarM0.getClass();
                if (ch8Var.isEmpty() && ch8VarM0.isEmpty()) {
                    ch8VarK = ch8Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) xd6Var.Y).values();
                    collectionValues.getClass();
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        wm wmVar = (wm) ch8Var.X.get(iIntValue);
                        wm wmVar2 = (wm) ch8VarM0.X.get(iIntValue);
                        if (wmVar != null) {
                            if (wmVar2 != null) {
                                sm vmVar = wmVar.a;
                                sm smVar = wmVar2.a;
                                vmVar.getClass();
                                smVar.getClass();
                                if (vmVar.isEmpty()) {
                                    vmVar = smVar;
                                } else if (!smVar.isEmpty()) {
                                    vmVar = new vm(new sm[]{vmVar, smVar});
                                }
                                wmVar = new wm(vmVar);
                            }
                            wmVar2 = wmVar;
                        } else if (wmVar2 == null) {
                            wmVar2 = null;
                        } else if (wmVar != null) {
                            sm vmVar2 = wmVar2.a;
                            sm smVar2 = wmVar.a;
                            vmVar2.getClass();
                            smVar2.getClass();
                            if (vmVar2.isEmpty()) {
                                vmVar2 = smVar2;
                            } else if (!smVar2.isEmpty()) {
                                vmVar2 = new vm(new sm[]{vmVar2, smVar2});
                            }
                            wmVar2 = new wm(vmVar2);
                        }
                        if (wmVar2 != null) {
                            arrayList.add(wmVar2);
                        }
                    }
                    ch8VarK = xd6.k(arrayList);
                }
            }
            aa7VarA = s08.f(aa7VarA, null, ch8VarK, 1);
        }
        aa7 aa7VarI = cj8.i(aa7VarA, z);
        if (!z2) {
            return aa7VarI;
        }
        g3 g3Var = km1Var.l0;
        g3Var.getClass();
        return jm4.d0(aa7VarI, dh3.O(dt4.b, ch8Var, g3Var, (List) yr6Var.f0, z));
    }

    public ni8 f(ni8 ni8Var, yr6 yr6Var, hi8 hi8Var, int i) {
        rt8 rt8VarD;
        km1 km1Var = (km1) yr6Var.Z;
        if (i > 100) {
            om0.f(km1Var.getName(), "Too deep recursion while expanding type alias ");
            return null;
        }
        if (ni8Var.c()) {
            hi8Var.getClass();
            return cj8.j(hi8Var);
        }
        t14 t14VarB = ni8Var.b();
        t14VarB.getClass();
        lh8 lh8VarN0 = t14VarB.n0();
        lh8VarN0.getClass();
        ot0 ot0VarX = lh8VarN0.x();
        ni8 ni8Var2 = ot0VarX instanceof hi8 ? (ni8) ((Map) yr6Var.g0).get(ot0VarX) : null;
        int i2 = 0;
        rt8 rt8Var = rt8.INVARIANT;
        if (ni8Var2 == null) {
            aa7 aa7VarA = s08.a(ni8Var.b().q0());
            if (!vr3.J(aa7VarA) && cj8.c(aa7VarA, ve7.l0, null)) {
                lh8 lh8VarN1 = aa7VarA.n0();
                ot0 ot0VarX2 = lh8VarN1.x();
                lh8VarN1.g().size();
                aa7VarA.l0().size();
                if (!(ot0VarX2 instanceof hi8)) {
                    if (!(ot0VarX2 instanceof km1)) {
                        aa7 aa7VarK = k(aa7VarA, yr6Var, i);
                        wi8.d(aa7VarK);
                        for (Object obj : aa7VarK.l0()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                i21.X();
                                throw null;
                            }
                            ni8 ni8Var3 = (ni8) obj;
                            if (!ni8Var3.c()) {
                                t14 t14VarB2 = ni8Var3.b();
                                t14VarB2.getClass();
                                if (!cj8.c(t14VarB2, ve7.k0, null)) {
                                }
                            }
                            i2 = i3;
                        }
                        return new wg7(aa7VarK, ni8Var.a());
                    }
                    km1 km1Var2 = (km1) ot0VarX2;
                    if (yr6Var.i(km1Var2)) {
                        String str = km1Var2.getName().X;
                        str.getClass();
                        return new wg7(u32.c(s32.RECURSIVE_TYPE_ALIAS, str), rt8Var);
                    }
                    List listL0 = aa7VarA.l0();
                    ArrayList arrayList = new ArrayList(xv0.Z(listL0, 10));
                    for (Object obj2 : listL0) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            i21.X();
                            throw null;
                        }
                        arrayList.add(f((ni8) obj2, yr6Var, (hi8) lh8VarN1.g().get(i2), i + 1));
                        i2 = i4;
                    }
                    List listG = km1Var2.l0.g();
                    ArrayList arrayList2 = new ArrayList(xv0.Z(listG, 10));
                    Iterator it = listG.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((hi8) it.next()).a());
                    }
                    return new wg7(jm4.d0(e(new yr6(yr6Var, km1Var2, arrayList, zp4.P(wv0.e1(arrayList2, arrayList)), (byte) 8), aa7VarA.m0(), aa7VarA.o0(), i + 1, false), k(aa7VarA, yr6Var, i)), ni8Var.a());
                }
            }
            return ni8Var;
        }
        if (ni8Var2.c()) {
            hi8Var.getClass();
            return cj8.j(hi8Var);
        }
        mo8 mo8VarQ0 = ni8Var2.b().q0();
        rt8 rt8VarA = ni8Var2.a();
        rt8VarA.getClass();
        rt8 rt8VarA2 = ni8Var.a();
        rt8VarA2.getClass();
        if (rt8VarA2 != rt8VarA && rt8VarA2 != rt8Var && rt8VarA == rt8Var) {
            rt8VarA = rt8VarA2;
        }
        if (hi8Var == null || (rt8VarD = hi8Var.D()) == null) {
            rt8VarD = rt8Var;
        }
        if (rt8VarD == rt8VarA || rt8VarD == rt8Var || rt8VarA != rt8Var) {
            rt8Var = rt8VarA;
        }
        c(t14VarB.getAnnotations(), mo8VarQ0.getAnnotations());
        aa7 aa7VarI = cj8.i(s08.a(mo8VarQ0), t14VarB.o0());
        ch8 ch8VarM0 = t14VarB.m0();
        if (!vr3.J(aa7VarI)) {
            if (vr3.J(aa7VarI)) {
                ch8VarM0 = aa7VarI.m0();
            } else {
                ch8 ch8VarM1 = aa7VarI.m0();
                ch8VarM0.getClass();
                xd6 xd6Var = ch8.Y;
                ch8VarM1.getClass();
                if (!ch8VarM0.isEmpty() || !ch8VarM1.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) xd6Var.Y).values();
                    collectionValues.getClass();
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        wm wmVar = (wm) ch8VarM0.X.get(iIntValue);
                        wm wmVar2 = (wm) ch8VarM1.X.get(iIntValue);
                        if (wmVar != null) {
                            if (wmVar2 != null) {
                                sm vmVar = wmVar.a;
                                sm smVar = wmVar2.a;
                                vmVar.getClass();
                                smVar.getClass();
                                if (vmVar.isEmpty()) {
                                    vmVar = smVar;
                                } else if (!smVar.isEmpty()) {
                                    vmVar = new vm(new sm[]{vmVar, smVar});
                                }
                                wmVar = new wm(vmVar);
                            }
                            wmVar2 = wmVar;
                        } else if (wmVar2 == null) {
                            wmVar2 = null;
                        } else if (wmVar != null) {
                            sm vmVar2 = wmVar2.a;
                            sm smVar2 = wmVar.a;
                            vmVar2.getClass();
                            smVar2.getClass();
                            if (vmVar2.isEmpty()) {
                                vmVar2 = smVar2;
                            } else if (!smVar2.isEmpty()) {
                                vmVar2 = new vm(new sm[]{vmVar2, smVar2});
                            }
                            wmVar2 = new wm(vmVar2);
                        }
                        if (wmVar2 != null) {
                            arrayList3.add(wmVar2);
                        }
                    }
                    ch8VarM0 = xd6.k(arrayList3);
                }
            }
            aa7VarI = s08.f(aa7VarI, null, ch8VarM0, 1);
        }
        return new wg7(aa7VarI, rt8Var);
    }

    @Override // defpackage.r51
    public /* synthetic */ Object g(fb9 fb9Var) throws IOException {
        switch (this.X) {
            case 18:
                Intent intent = (Intent) ((Bundle) fb9Var.g()).getParcelable("notification_data");
                if (intent != null) {
                    return new av0(intent);
                }
                return null;
            default:
                if (fb9Var.i()) {
                    return (Bundle) fb9Var.g();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(fb9Var.f()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", fb9Var.f());
        }
    }

    @Override // defpackage.y23
    public boolean h(byte[] bArr) {
        return bArr[0] == 2;
    }

    public long j() {
        switch (this.X) {
            case 9:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    public aa7 k(aa7 aa7Var, yr6 yr6Var, int i) {
        lh8 lh8VarN0 = aa7Var.n0();
        List listL0 = aa7Var.l0();
        ArrayList arrayList = new ArrayList(xv0.Z(listL0, 10));
        int i2 = 0;
        for (Object obj : listL0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i21.X();
                throw null;
            }
            ni8 ni8Var = (ni8) obj;
            ni8 ni8VarF = f(ni8Var, yr6Var, (hi8) lh8VarN0.g().get(i2), i + 1);
            if (!ni8VarF.c()) {
                ni8VarF = new wg7(cj8.h(ni8VarF.b(), ni8Var.b().o0()), ni8VarF.a());
            }
            arrayList.add(ni8VarF);
            i2 = i3;
        }
        return s08.f(aa7Var, arrayList, null, 2);
    }

    @Override // libxray.XRayVPNServiceSupportsSet
    public long onEmitStatus(long j, String str) {
        return 0L;
    }

    @Override // libxray.XRayVPNServiceSupportsSet
    public long shutdown() {
        w47 w47Var;
        Object rj6Var;
        SoftReference softReference = x59.c;
        if (softReference == null || (w47Var = (w47) softReference.get()) == null) {
            return -1L;
        }
        try {
            w47Var.b();
            rj6Var = 0L;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = -1L;
        }
        return ((Number) rj6Var).longValue();
    }

    @Override // libxray.XRayVPNServiceSupportsSet
    public long startup() {
        w47 w47Var;
        Object rj6Var;
        SoftReference softReference = x59.c;
        if (softReference == null || (w47Var = (w47) softReference.get()) == null) {
            return -1L;
        }
        try {
            w47Var.j(null);
            rj6Var = 0L;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = -1L;
        }
        return ((Number) rj6Var).longValue();
    }

    public String toString() {
        switch (this.X) {
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                int iHashCode = hashCode();
                km4.q(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return pc6.q("CreationExtras.Key@", string, "<", yb6.a.b(Application.class).E(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lu8
    public int v() {
        return 0;
    }

    @Override // defpackage.lu8
    public int x() {
        return 0;
    }

    @Override // defpackage.bw6
    public Object y(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        String str = (String) obj3;
        Object obj4 = list.get(2);
        obj4.getClass();
        String str2 = (String) obj4;
        Object obj5 = list.get(3);
        obj5.getClass();
        int iIntValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        obj6.getClass();
        long jC = ct7.c(iIntValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        obj7.getClass();
        int iIntValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        obj8.getClass();
        long jC2 = ct7.c(iIntValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        obj9.getClass();
        return new u88(iIntValue, str, str2, jC, jC2, ((Long) obj9).longValue(), false, 64);
    }

    @Override // defpackage.ju8
    public wk z(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        return j < 0 ? wkVar : wkVar2;
    }

    public /* synthetic */ f08(byte b) {
        this.X = b;
    }

    @Override // defpackage.ju8
    public wk m(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        return wkVar3;
    }
}
