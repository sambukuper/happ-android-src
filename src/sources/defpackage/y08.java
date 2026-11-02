package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y08 {
    public static final boolean a(t14 t14Var, lh8 lh8Var, Set set) {
        boolean zA;
        if (dh3.f(t14Var.n0(), lh8Var)) {
            return true;
        }
        ot0 ot0VarX = t14Var.n0().x();
        pt0 pt0Var = ot0VarX instanceof pt0 ? (pt0) ot0VarX : null;
        List listK0 = pt0Var != null ? pt0Var.k0() : null;
        Iterable iterableD1 = wv0.d1(t14Var.l0());
        if (!(iterableD1 instanceof Collection) || !((Collection) iterableD1).isEmpty()) {
            Iterator it = iterableD1.iterator();
            do {
                rw1 rw1Var = (rw1) it;
                if (rw1Var.Y.hasNext()) {
                    pb3 pb3Var = (pb3) rw1Var.next();
                    int i = pb3Var.a;
                    ni8 ni8Var = (ni8) pb3Var.b;
                    hi8 hi8Var = listK0 != null ? (hi8) wv0.u0(i, listK0) : null;
                    if ((hi8Var == null || set == null || !set.contains(hi8Var)) && !ni8Var.c()) {
                        t14 t14VarB = ni8Var.b();
                        t14VarB.getClass();
                        zA = a(t14VarB, lh8Var, set);
                    } else {
                        zA = false;
                    }
                }
            } while (!zA);
            return true;
        }
        return false;
    }

    public static final wg7 b(t14 t14Var, rt8 rt8Var, hi8 hi8Var) {
        t14Var.getClass();
        if ((hi8Var != null ? hi8Var.D() : null) == rt8Var) {
            rt8Var = rt8.INVARIANT;
        }
        return new wg7(t14Var, rt8Var);
    }

    public static final long c() {
        return we3.a.a().a() / 1000;
    }

    public static final void d(t14 t14Var, aa7 aa7Var, LinkedHashSet linkedHashSet, Set set) {
        ot0 ot0VarX = t14Var.n0().x();
        if (ot0VarX instanceof hi8) {
            if (!dh3.f(t14Var.n0(), aa7Var.n0())) {
                linkedHashSet.add(ot0VarX);
                return;
            }
            for (t14 t14Var2 : ((hi8) ot0VarX).getUpperBounds()) {
                t14Var2.getClass();
                d(t14Var2, aa7Var, linkedHashSet, set);
            }
            return;
        }
        ot0 ot0VarX2 = t14Var.n0().x();
        pt0 pt0Var = ot0VarX2 instanceof pt0 ? (pt0) ot0VarX2 : null;
        List listK0 = pt0Var != null ? pt0Var.k0() : null;
        int i = 0;
        for (ni8 ni8Var : t14Var.l0()) {
            int i2 = i + 1;
            hi8 hi8Var = listK0 != null ? (hi8) wv0.u0(i, listK0) : null;
            if ((hi8Var == null || set == null || !set.contains(hi8Var)) && !ni8Var.c() && !wv0.m0(linkedHashSet, ni8Var.b().n0().x()) && !dh3.f(ni8Var.b().n0(), aa7Var.n0())) {
                t14 t14VarB = ni8Var.b();
                t14VarB.getClass();
                d(t14VarB, aa7Var, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final zz3 e(t14 t14Var) {
        t14Var.getClass();
        zz3 zz3VarF = t14Var.n0().f();
        zz3VarF.getClass();
        return zz3VarF;
    }

    public static final t14 f(hi8 hi8Var) {
        Object obj;
        List upperBounds = hi8Var.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List upperBounds2 = hi8Var.getUpperBounds();
        upperBounds2.getClass();
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ot0 ot0VarX = ((t14) next).n0().x();
            sx4 sx4Var = ot0VarX instanceof sx4 ? (sx4) ot0VarX : null;
            if (sx4Var != null && sx4Var.g0() != us0.Y && sx4Var.g0() != us0.g0) {
                obj = next;
                break;
            }
        }
        t14 t14Var = (t14) obj;
        if (t14Var != null) {
            return t14Var;
        }
        List upperBounds3 = hi8Var.getUpperBounds();
        upperBounds3.getClass();
        Object objR0 = wv0.r0(upperBounds3);
        objR0.getClass();
        return (t14) objR0;
    }

    public static final boolean g(hi8 hi8Var, lh8 lh8Var, Set set) {
        hi8Var.getClass();
        List<t14> upperBounds = hi8Var.getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (t14 t14Var : upperBounds) {
            t14Var.getClass();
            if (a(t14Var, hi8Var.X().n0(), set) && (lh8Var == null || dh3.f(t14Var.n0(), lh8Var))) {
                return true;
            }
        }
        return false;
    }

    public static final int h(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean i(t14 t14Var, t14 t14Var2) {
        t14Var.getClass();
        t14Var2.getClass();
        return v14.a.b(t14Var, t14Var2);
    }

    public static final mo8 j(t14 t14Var) {
        t14Var.getClass();
        mo8 mo8VarG = cj8.g(t14Var, true);
        mo8VarG.getClass();
        return mo8VarG;
    }

    public static final void k(Context context) {
        Map map;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            lh4 lh4VarP0 = lh4.P0();
            String[] strArr = m39.a;
            lh4VarP0.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            String[] strArr2 = m39.a;
            int iG = aq4.G(strArr2.length);
            if (iG < 16) {
                iG = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
            for (String str : strArr2) {
                linkedHashMap.put(new File(pc6.o(databasePath2.getPath(), str)), new File(pc6.o(file.getPath(), str)));
            }
            if (linkedHashMap.isEmpty()) {
                Map mapSingletonMap = Collections.singletonMap(databasePath2, file);
                mapSingletonMap.getClass();
                map = mapSingletonMap;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        lh4 lh4VarP1 = lh4.P0();
                        String[] strArr3 = m39.a;
                        file3.toString();
                        lh4VarP1.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    lh4 lh4VarP2 = lh4.P0();
                    String[] strArr4 = m39.a;
                    lh4VarP2.getClass();
                }
            }
        }
    }

    public static b18 l(qr6 qr6Var, String str) {
        Map mapB;
        o57 o57Var;
        qr6Var.getClass();
        xr6 xr6VarX0 = qr6Var.X0("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (xr6VarX0.S0()) {
                int iU = w45.u(xr6VarX0, "name");
                int iU2 = w45.u(xr6VarX0, "type");
                int iU3 = w45.u(xr6VarX0, "notnull");
                int iU4 = w45.u(xr6VarX0, "pk");
                int iU5 = w45.u(xr6VarX0, "dflt_value");
                ip4 ip4Var = new ip4();
                do {
                    String strP0 = xr6VarX0.p0(iU);
                    ip4Var.put(strP0, new x08(strP0, xr6VarX0.p0(iU2), xr6VarX0.getLong(iU3) != 0, (int) xr6VarX0.getLong(iU4), xr6VarX0.isNull(iU5) ? null : xr6VarX0.p0(iU5), 2));
                } while (xr6VarX0.S0());
                mapB = ip4Var.b();
                u15.h(xr6VarX0, null);
            } else {
                mapB = e02.X;
                u15.h(xr6VarX0, null);
            }
            xr6 xr6VarX1 = qr6Var.X0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iU6 = w45.u(xr6VarX1, "id");
                int iU7 = w45.u(xr6VarX1, "seq");
                int iU8 = w45.u(xr6VarX1, "table");
                int iU9 = w45.u(xr6VarX1, "on_delete");
                int iU10 = w45.u(xr6VarX1, "on_update");
                List listB0 = vj8.b0(xr6VarX1);
                xr6VarX1.reset();
                o57 o57Var2 = new o57();
                while (xr6VarX1.S0()) {
                    if (xr6VarX1.getLong(iU7) == j) {
                        int i = (int) xr6VarX1.getLong(iU6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iU6;
                        ArrayList<mj2> arrayList3 = new ArrayList();
                        for (Object obj : listB0) {
                            int i3 = iU7;
                            List list = listB0;
                            if (((mj2) obj).X == i) {
                                arrayList3.add(obj);
                            }
                            iU7 = i3;
                            listB0 = list;
                        }
                        int i4 = iU7;
                        List list2 = listB0;
                        for (mj2 mj2Var : arrayList3) {
                            arrayList.add(mj2Var.Z);
                            arrayList2.add(mj2Var.f0);
                        }
                        o57Var2.add(new z08(xr6VarX1.p0(iU8), xr6VarX1.p0(iU9), xr6VarX1.p0(iU10), arrayList, arrayList2));
                        iU6 = i2;
                        iU7 = i4;
                        listB0 = list2;
                        j = 0;
                    }
                }
                o57 o57VarM = w45.m(o57Var2);
                u15.h(xr6VarX1, null);
                xr6 xr6VarX2 = qr6Var.X0("PRAGMA index_list(`" + str + "`)");
                try {
                    int iU11 = w45.u(xr6VarX2, "name");
                    int iU12 = w45.u(xr6VarX2, "origin");
                    int iU13 = w45.u(xr6VarX2, "unique");
                    if (iU11 == -1 || iU12 == -1 || iU13 == -1) {
                        u15.h(xr6VarX2, null);
                        o57Var = null;
                    } else {
                        o57 o57Var3 = new o57();
                        while (xr6VarX2.S0()) {
                            if ("c".equals(xr6VarX2.p0(iU12))) {
                                a18 a18VarC0 = vj8.c0(qr6Var, xr6VarX2.p0(iU11), xr6VarX2.getLong(iU13) == 1);
                                if (a18VarC0 == null) {
                                    u15.h(xr6VarX2, null);
                                    o57Var = null;
                                } else {
                                    o57Var3.add(a18VarC0);
                                }
                            }
                        }
                        o57 o57VarM2 = w45.m(o57Var3);
                        u15.h(xr6VarX2, null);
                        o57Var = o57VarM2;
                    }
                    return new b18(str, mapB, o57VarM, o57Var);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u15.h(xr6VarX2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    u15.h(xr6VarX1, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                u15.h(xr6VarX0, th5);
                throw th6;
            }
        }
    }

    public static final t14 m(t14 t14Var, sm smVar) {
        return (t14Var.getAnnotations().isEmpty() && smVar.isEmpty()) ? t14Var : t14Var.q0().t0(bt7.i(t14Var.m0(), smVar));
    }

    public static final mo8 n(t14 t14Var) {
        aa7 aa7Var;
        mo8 mo8VarF;
        t14Var.getClass();
        mo8 mo8VarQ0 = t14Var.q0();
        if (mo8VarQ0 instanceof ce2) {
            ce2 ce2Var = (ce2) mo8VarQ0;
            aa7 aa7VarF = ce2Var.Y;
            if (!aa7VarF.n0().g().isEmpty() && aa7VarF.n0().x() != null) {
                List listG = aa7VarF.n0().g();
                listG.getClass();
                ArrayList arrayList = new ArrayList(xv0.Z(listG, 10));
                Iterator it = listG.iterator();
                while (it.hasNext()) {
                    arrayList.add(new wg7((hi8) it.next()));
                }
                aa7VarF = s08.f(aa7VarF, arrayList, null, 2);
            }
            aa7 aa7VarF2 = ce2Var.Z;
            if (!aa7VarF2.n0().g().isEmpty() && aa7VarF2.n0().x() != null) {
                List listG2 = aa7VarF2.n0().g();
                listG2.getClass();
                ArrayList arrayList2 = new ArrayList(xv0.Z(listG2, 10));
                Iterator it2 = listG2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new wg7((hi8) it2.next()));
                }
                aa7VarF2 = s08.f(aa7VarF2, arrayList2, null, 2);
            }
            mo8VarF = dh3.s(aa7VarF, aa7VarF2);
        } else {
            if (!(mo8VarQ0 instanceof aa7)) {
                b61.c();
                return null;
            }
            aa7Var = (aa7) mo8VarQ0;
            if (!aa7Var.n0().g().isEmpty() && aa7Var.n0().x() != null) {
                mo8VarF = aa7Var;
                mo8VarF = aa7Var;
                List listG3 = aa7Var.n0().g();
                listG3.getClass();
                ArrayList arrayList3 = new ArrayList(xv0.Z(listG3, 10));
                Iterator it3 = listG3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new wg7((hi8) it3.next()));
                }
                mo8VarF = s08.f(aa7Var, arrayList3, null, 2);
            }
        }
        mo8VarF = aa7Var;
        mo8VarF = aa7Var;
        mo8VarF = aa7Var;
        return c18.g(mo8VarF, mo8VarQ0);
    }
}
