package defpackage;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sp4 extends e41 implements p51 {
    public static final ba7 t0 = uh8.u0;
    public static final dp3 u0 = dp3.Z;
    public final d50 Z;
    public final boolean f0;
    public final dh8 g0;
    public final dh8 h0;
    public final ar3 i0;
    public final ar3 j0;
    public final ri8 k0;
    public g33 l0;
    public final Set m0;
    public final Set n0;
    public final Object o0;
    public final Object p0;
    public final boolean q0;
    public final zl r0;
    public final boolean s0;

    public sp4(sp4 sp4Var, d50 d50Var, ar3 ar3Var, ar3 ar3Var2, Set set, Set set2) {
        super(0, Map.class);
        zl zlVar = null;
        set = (set == null || set.isEmpty()) ? null : set;
        this.m0 = set;
        this.n0 = set2;
        this.g0 = sp4Var.g0;
        this.h0 = sp4Var.h0;
        this.f0 = sp4Var.f0;
        this.k0 = sp4Var.k0;
        this.i0 = ar3Var;
        this.j0 = ar3Var2;
        this.l0 = px5.f;
        this.Z = d50Var;
        this.o0 = sp4Var.o0;
        this.s0 = sp4Var.s0;
        this.p0 = sp4Var.p0;
        this.q0 = sp4Var.q0;
        if (set2 != null || (set != null && !set.isEmpty())) {
            zlVar = new zl(set, set2);
        }
        this.r0 = zlVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[RETURN] */
    public static sp4 q(Set set, Set set2, dh8 dh8Var, boolean z, si8 si8Var, ar3 ar3Var, ar3 ar3Var2, Object obj) {
        dh8 dh8VarZ0;
        dh8 dh8Var2;
        boolean z2;
        sp4 sp4Var;
        if (dh8Var == null) {
            dh8Var2 = t0;
            dh8VarZ0 = dh8Var2;
        } else {
            dh8 dh8VarC0 = dh8Var.C0();
            dh8VarZ0 = dh8Var.H0(Properties.class) ? uh8.u0 : dh8Var.z0();
            dh8Var2 = dh8VarC0;
        }
        if (z) {
            if (dh8VarZ0.j0 == Object.class) {
                z2 = false;
            }
            sp4Var = new sp4(set, set2, dh8Var2, dh8VarZ0, z2, si8Var, ar3Var, ar3Var2);
            if (obj != null) {
                return sp4Var;
            }
            it0.x(sp4.class, sp4Var, "withFilterId");
            return new sp4(sp4Var, obj, false);
        }
        z = dh8VarZ0 != null && Modifier.isFinal(dh8VarZ0.j0.getModifiers());
        z2 = z;
        sp4Var = new sp4(set, set2, dh8Var2, dh8VarZ0, z2, si8Var, ar3Var, ar3Var2);
        if (obj != null) {
            return sp4Var;
        }
        it0.x(sp4.class, sp4Var, "withFilterId");
        return new sp4(sp4Var, obj, false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094 A[LOOP:0: B:45:0x008e->B:47:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be A[LOOP:1: B:54:0x00b8->B:56:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:76:0x012a  */
    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        ar3 ar3VarD;
        ar3 ar3VarD2;
        ar3 ar3VarJ;
        dh8 dh8Var;
        ar3 ar3VarV;
        Set hashSet;
        Set hashSet2;
        Set set;
        Set set2;
        boolean zBooleanValue;
        no3 no3VarK;
        boolean z;
        sp4 sp4Var;
        ep3 ep3VarE;
        dp3 dp3Var;
        Object objR;
        Object objG;
        Boolean boolA;
        yo3 yo3VarV;
        Set set3;
        Set set4;
        Iterator it;
        Iterator it2;
        l37 l37Var = t37Var.X;
        m85 m85VarD = l37Var.d();
        gl glVarB = d50Var == null ? null : d50Var.b();
        if (glVarB != null) {
            Object objK = m85VarD.k(glVarB);
            ar3VarD = objK != null ? t37Var.D(glVarB, objK) : null;
            Object objC = m85VarD.c(glVarB);
            ar3VarD2 = objC != null ? t37Var.D(glVarB, objC) : null;
            if (ar3VarD2 == null) {
                ar3VarD2 = this.j0;
            }
            ar3VarJ = lj7.j(t37Var, d50Var, ar3VarD2);
            dh8Var = this.h0;
            if (ar3VarJ == null && this.f0 && !dh8Var.K0()) {
                ar3VarJ = t37Var.i(dh8Var, d50Var);
            }
            ar3 ar3Var = ar3VarJ;
            if (ar3VarD == null) {
                ar3VarD = this.i0;
            }
            if (ar3VarD == null) {
                ar3VarV = t37Var.k(this.g0, d50Var);
            } else {
                ar3VarV = t37Var.v(ar3VarD, d50Var);
            }
            ar3 ar3Var2 = ar3VarV;
            boolean zX = false;
            hashSet = this.m0;
            hashSet2 = this.n0;
            if (glVarB != null) {
                yo3VarV = m85VarD.v(glVarB);
                if (yo3VarV.Z) {
                    set3 = Collections.EMPTY_SET;
                } else {
                    set3 = yo3VarV.X;
                }
                if (set3 != null && !set3.isEmpty()) {
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    } else {
                        hashSet = new HashSet(hashSet);
                    }
                    it2 = set3.iterator();
                    while (it2.hasNext()) {
                        hashSet.add((String) it2.next());
                    }
                }
                set4 = m85VarD.y(glVarB).X;
                if (set4 != null) {
                    if (hashSet2 == null) {
                        hashSet2 = new HashSet();
                    } else {
                        hashSet2 = new HashSet(hashSet2);
                    }
                    it = set4.iterator();
                    while (it.hasNext()) {
                        hashSet2.add((String) it.next());
                    }
                }
                Set set5 = hashSet2;
                set2 = hashSet;
                zBooleanValue = Boolean.TRUE.equals(m85VarD.G(glVarB));
                set = set5;
            } else {
                set = hashSet2;
                set2 = hashSet;
                zBooleanValue = false;
            }
            no3VarK = lj7.k(t37Var, d50Var, Map.class);
            if (no3VarK != null && (boolA = no3VarK.a(ko3.Y)) != null) {
                zBooleanValue = boolA.booleanValue();
            }
            z = zBooleanValue;
            it0.x(sp4.class, this, "withResolved");
            sp4Var = new sp4(this, d50Var, ar3Var2, ar3Var, set2, set);
            if (z != sp4Var.s0) {
                sp4Var = new sp4(sp4Var, this.o0, z);
            }
            if (glVarB != null && (objG = m85VarD.g(glVarB)) != null && sp4Var.o0 != objG) {
                it0.x(sp4.class, sp4Var, "withFilterId");
                sp4Var = new sp4(sp4Var, objG, sp4Var.s0);
            }
            if (d50Var != null) {
                ep3VarE = d50Var.e(l37Var, Map.class);
            } else {
                l37Var.getClass();
                ep3VarE = ep3.g0;
            }
            if (ep3VarE == null && (dp3Var = ep3VarE.Y) != dp3.g0) {
                int iOrdinal = dp3Var.ordinal();
                if (iOrdinal != 1) {
                    dp3 dp3Var2 = u0;
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            zX = true;
                            objR = dp3Var2;
                        } else if (iOrdinal == 4) {
                            objR = ci8.r(dh8Var);
                            if (objR != null && objR.getClass().isArray()) {
                                objR = z51.y(objR);
                            }
                        } else if (iOrdinal == 5) {
                            objR = t37Var.w(ep3VarE.f0);
                            if (objR != null) {
                                zX = t37Var.x(objR);
                            }
                        }
                        return sp4Var.t(objR, zX);
                    }
                    objR = dh8Var.M() ? dp3Var2 : null;
                    zX = true;
                    return sp4Var.t(objR, zX);
                }
                zX = true;
                objR = null;
                return sp4Var.t(objR, zX);
            }
        }
        ar3VarD = null;
        if (ar3VarD2 == null) {
            ar3VarD2 = this.j0;
        }
        ar3VarJ = lj7.j(t37Var, d50Var, ar3VarD2);
        dh8Var = this.h0;
        if (ar3VarJ == null) {
            ar3VarJ = t37Var.i(dh8Var, d50Var);
        }
        ar3 ar3Var3 = ar3VarJ;
        if (ar3VarD == null) {
            ar3VarD = this.i0;
        }
        if (ar3VarD == null) {
            ar3VarV = t37Var.k(this.g0, d50Var);
        } else {
            ar3VarV = t37Var.v(ar3VarD, d50Var);
        }
        ar3 ar3Var4 = ar3VarV;
        boolean zX2 = false;
        hashSet = this.m0;
        hashSet2 = this.n0;
        if (glVarB != null) {
            yo3VarV = m85VarD.v(glVarB);
            if (yo3VarV.Z) {
                set3 = Collections.EMPTY_SET;
            } else {
                set3 = yo3VarV.X;
            }
            if (set3 != null) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                } else {
                    hashSet = new HashSet(hashSet);
                }
                it2 = set3.iterator();
                while (it2.hasNext()) {
                    hashSet.add((String) it2.next());
                }
            }
            set4 = m85VarD.y(glVarB).X;
            if (set4 != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet();
                } else {
                    hashSet2 = new HashSet(hashSet2);
                }
                it = set4.iterator();
                while (it.hasNext()) {
                    hashSet2.add((String) it.next());
                }
            }
            Set set6 = hashSet2;
            set2 = hashSet;
            zBooleanValue = Boolean.TRUE.equals(m85VarD.G(glVarB));
            set = set6;
        } else {
            set = hashSet2;
            set2 = hashSet;
            zBooleanValue = false;
        }
        no3VarK = lj7.k(t37Var, d50Var, Map.class);
        if (no3VarK != null) {
            zBooleanValue = boolA.booleanValue();
        }
        z = zBooleanValue;
        it0.x(sp4.class, this, "withResolved");
        sp4Var = new sp4(this, d50Var, ar3Var4, ar3Var3, set2, set);
        if (z != sp4Var.s0) {
            sp4Var = new sp4(sp4Var, this.o0, z);
        }
        if (glVarB != null) {
            it0.x(sp4.class, sp4Var, "withFilterId");
            sp4Var = new sp4(sp4Var, objG, sp4Var.s0);
        }
        if (d50Var != null) {
            ep3VarE = d50Var.e(l37Var, Map.class);
        } else {
            l37Var.getClass();
            ep3VarE = ep3.g0;
        }
        return ep3VarE == null ? sp4Var : sp4Var;
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            boolean z = this.q0;
            Object obj2 = this.p0;
            if (obj2 != null || z) {
                boolean z2 = u0 == obj2;
                ar3 ar3Var = this.j0;
                if (ar3Var != null) {
                    for (Object obj3 : map.values()) {
                        if (obj3 == null) {
                            if (z) {
                            }
                        } else if (z2) {
                            if (!ar3Var.c(t37Var, obj3)) {
                            }
                        } else if (obj2 == null || !obj2.equals(obj3)) {
                        }
                    }
                } else {
                    for (Object obj4 : map.values()) {
                        if (obj4 != null) {
                            try {
                                ar3 ar3VarP = p(t37Var, obj4);
                                if (z2) {
                                    if (!ar3VarP.c(t37Var, obj4)) {
                                    }
                                } else if (obj2 == null || !obj2.equals(obj4)) {
                                }
                            } catch (mb1 unused) {
                            }
                        } else if (z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) throws IOException {
        Map map = (Map) obj;
        ro3Var.a1(map);
        s(map, ro3Var, t37Var);
        ro3Var.J();
    }

    @Override // defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) throws IOException {
        Map map = (Map) obj;
        ro3Var.m(map);
        z76 z76VarE = ri8Var.e(ro3Var, ri8Var.d(map, gr3.START_OBJECT));
        s(map, ro3Var, t37Var);
        ri8Var.f(ro3Var, z76VarE);
    }

    @Override // defpackage.e41
    public final e41 o(ri8 ri8Var) {
        if (this.k0 == ri8Var) {
            return this;
        }
        it0.x(sp4.class, this, "_withValueTypeSerializer");
        return new sp4(this, ri8Var, this.p0, this.q0);
    }

    public final ar3 p(t37 t37Var, Object obj) {
        Class<?> cls = obj.getClass();
        ar3 ar3VarR = this.l0.R(cls);
        if (ar3VarR != null) {
            return ar3VarR;
        }
        dh8 dh8Var = this.h0;
        boolean zF0 = dh8Var.F0();
        g33 g33Var = this.l0;
        d50 d50Var = this.Z;
        if (zF0) {
            zz2 zz2VarR = g33Var.r(t37Var.e(dh8Var, cls), t37Var, d50Var);
            g33 g33Var2 = (g33) zz2VarR.Z;
            if (g33Var != g33Var2) {
                this.l0 = g33Var2;
            }
            return (ar3) zz2VarR.Y;
        }
        g33Var.getClass();
        ar3 ar3VarJ = t37Var.j(cls, d50Var);
        g33 g33VarJ = g33Var.J(cls, ar3VarJ);
        if (g33Var != g33VarJ) {
            this.l0 = g33VarJ;
        }
        return ar3VarJ;
    }

    public final void r(Map map, ro3 ro3Var, t37 t37Var, Object obj) throws IOException {
        ar3 ar3Var;
        ar3 ar3VarP;
        boolean z = u0 == obj;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                ar3Var = t37Var.i0;
            } else {
                zl zlVar = this.r0;
                if (zlVar == null || !zlVar.g(key)) {
                    ar3Var = this.i0;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                ar3VarP = this.j0;
                if (ar3VarP == null) {
                    ar3VarP = p(t37Var, value);
                }
                if (z) {
                    if (ar3VarP.c(t37Var, value)) {
                        continue;
                    } else {
                        ar3Var.e(key, ro3Var, t37Var);
                        ar3VarP.f(value, ro3Var, t37Var, this.k0);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    ar3Var.e(key, ro3Var, t37Var);
                    ar3VarP.f(value, ro3Var, t37Var, this.k0);
                }
            } else if (this.q0) {
                continue;
            } else {
                ar3VarP = t37Var.h0;
                ar3Var.e(key, ro3Var, t37Var);
                try {
                    ar3VarP.f(value, ro3Var, t37Var, this.k0);
                } catch (Exception e) {
                    lj7.n(t37Var, e, map, String.valueOf(key));
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x01e9 A[EXC_TOP_SPLITTER, PHI: r15
  0x01e9: PHI (r15v1 ar3) = (r15v0 ar3), (r15v3 ar3), (r15v3 ar3), (r15v3 ar3) binds: [B:134:0x01cc, B:140:0x01dd, B:142:0x01e0, B:144:0x01e6] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    public final void s(Map map, ro3 ro3Var, t37 t37Var) throws IOException {
        Object next;
        TreeMap treeMap;
        Class<?> cls;
        ar3 ar3Var;
        ar3 ar3VarP;
        Object key;
        Map map2 = map;
        if (map2.isEmpty()) {
            return;
        }
        boolean z = this.s0;
        Object obj = u0;
        Object obj2 = this.p0;
        boolean z2 = this.q0;
        ar3 ar3Var2 = this.j0;
        if (!z) {
            if (t37Var.X.j(n37.x0)) {
                if (!(map2 instanceof SortedMap) && !map2.isEmpty()) {
                    next = map2.keySet().iterator().next();
                    if (!Comparable.class.isInstance(next)) {
                        if ((map2 instanceof HashMap) || !map2.containsKey(null)) {
                            treeMap = new TreeMap(map2);
                        } else {
                            treeMap = new TreeMap();
                            Iterator it = map2.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    Object key2 = entry.getKey();
                                    if (key2 == null) {
                                        Object value = entry.getValue();
                                        c75 c75Var = t37Var.i0;
                                        if (value == null) {
                                            if (z2) {
                                            }
                                            try {
                                                c75Var.e(null, ro3Var, t37Var);
                                                throw null;
                                            } catch (Exception e) {
                                                lj7.n(t37Var, e, value, _UrlKt.FRAGMENT_ENCODE_SET);
                                                throw null;
                                            }
                                        }
                                        ar3 ar3VarP2 = ar3Var2 == null ? p(t37Var, value) : ar3Var2;
                                        if (obj2 == obj) {
                                            if (ar3VarP2.c(t37Var, value)) {
                                            }
                                            c75Var.e(null, ro3Var, t37Var);
                                            throw null;
                                        }
                                        if (obj2 != null && obj2.equals(value)) {
                                        }
                                        c75Var.e(null, ro3Var, t37Var);
                                        throw null;
                                    }
                                    treeMap.put(key2, entry.getValue());
                                }
                            }
                        }
                        map2 = treeMap;
                    } else if (t37Var.X.j(n37.y0)) {
                        if (next == null) {
                            cls = Object.class;
                        } else {
                            cls = next.getClass();
                        }
                        t37Var.z(cls, "Cannot order Map entries by key of incomparable type " + it0.e(next) + ", consider disabling `SerializationFeature.FAIL_ON_ORDER_MAP_BY_INCOMPARABLE_KEY` to simply skip sorting");
                        throw null;
                    }
                }
            }
        } else if (!(map2 instanceof SortedMap)) {
            next = map2.keySet().iterator().next();
            if (!Comparable.class.isInstance(next)) {
                if (map2 instanceof HashMap) {
                    treeMap = new TreeMap(map2);
                } else {
                    treeMap = new TreeMap(map2);
                }
                map2 = treeMap;
            } else if (t37Var.X.j(n37.y0)) {
                if (next == null) {
                    cls = Object.class;
                } else {
                    cls = next.getClass();
                }
                t37Var.z(cls, "Cannot order Map entries by key of incomparable type " + it0.e(next) + ", consider disabling `SerializationFeature.FAIL_ON_ORDER_MAP_BY_INCOMPARABLE_KEY` to simply skip sorting");
                throw null;
            }
        }
        Object obj3 = this.o0;
        if (obj3 != null) {
            l(t37Var, obj3);
            throw null;
        }
        zl zlVar = this.r0;
        ri8 ri8Var = this.k0;
        ar3 ar3Var3 = this.i0;
        if (obj2 != null || z2) {
            if (ri8Var != null) {
                r(map2, ro3Var, t37Var, obj2);
                return;
            }
            boolean z3 = obj == obj2;
            for (Map.Entry entry2 : map2.entrySet()) {
                Object key3 = entry2.getKey();
                if (key3 == null) {
                    ar3Var = t37Var.i0;
                } else if (zlVar == null || !zlVar.g(key3)) {
                    ar3Var = ar3Var3;
                }
                Object value2 = entry2.getValue();
                if (value2 != null) {
                    ar3VarP = ar3Var2 == null ? p(t37Var, value2) : ar3Var2;
                    if (z3) {
                        if (ar3VarP.c(t37Var, value2)) {
                            continue;
                        } else {
                            ar3Var.e(key3, ro3Var, t37Var);
                            ar3VarP.e(value2, ro3Var, t37Var);
                        }
                    } else if (obj2 == null || !obj2.equals(value2)) {
                        ar3Var.e(key3, ro3Var, t37Var);
                        ar3VarP.e(value2, ro3Var, t37Var);
                    }
                } else if (z2) {
                    continue;
                } else {
                    ar3VarP = t37Var.h0;
                    try {
                        ar3Var.e(key3, ro3Var, t37Var);
                        ar3VarP.e(value2, ro3Var, t37Var);
                    } catch (Exception e2) {
                        lj7.n(t37Var, e2, map2, String.valueOf(key3));
                        throw null;
                    }
                }
            }
            return;
        }
        if (ar3Var2 != null) {
            for (Map.Entry entry3 : map2.entrySet()) {
                Object key4 = entry3.getKey();
                if (zlVar == null || !zlVar.g(key4)) {
                    if (key4 == null) {
                        t37Var.i0.e(null, ro3Var, t37Var);
                        throw null;
                    }
                    ar3Var3.e(key4, ro3Var, t37Var);
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        t37Var.h(ro3Var);
                    } else if (ri8Var == null) {
                        try {
                            ar3Var2.e(value3, ro3Var, t37Var);
                        } catch (Exception e3) {
                            lj7.n(t37Var, e3, map2, String.valueOf(key4));
                            throw null;
                        }
                    } else {
                        ar3Var2.f(value3, ro3Var, t37Var, ri8Var);
                    }
                }
            }
            return;
        }
        if (ri8Var != null) {
            r(map2, ro3Var, t37Var, null);
            return;
        }
        try {
            key = null;
            for (Map.Entry entry4 : map2.entrySet()) {
                try {
                    Object value4 = entry4.getValue();
                    key = entry4.getKey();
                    if (key == null) {
                        t37Var.i0.e(null, ro3Var, t37Var);
                        throw null;
                    }
                    if (zlVar == null || !zlVar.g(key)) {
                        ar3Var3.e(key, ro3Var, t37Var);
                        if (value4 == null) {
                            t37Var.h(ro3Var);
                        } else {
                            (ar3Var2 == null ? p(t37Var, value4) : ar3Var2).e(value4, ro3Var, t37Var);
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    lj7.n(t37Var, e, map2, String.valueOf(key));
                    throw null;
                }
            }
        } catch (Exception e5) {
            e = e5;
            key = null;
        }
    }

    public final sp4 t(Object obj, boolean z) {
        if (obj == this.p0 && z == this.q0) {
            return this;
        }
        it0.x(sp4.class, this, "withContentInclusion");
        return new sp4(this, this.k0, obj, z);
    }

    public sp4(Set set, Set set2, dh8 dh8Var, dh8 dh8Var2, boolean z, ri8 ri8Var, ar3 ar3Var, ar3 ar3Var2) {
        super(0, Map.class);
        zl zlVar = null;
        set = (set == null || set.isEmpty()) ? null : set;
        this.m0 = set;
        this.n0 = set2;
        this.g0 = dh8Var;
        this.h0 = dh8Var2;
        this.f0 = z;
        this.k0 = ri8Var;
        this.i0 = ar3Var;
        this.j0 = ar3Var2;
        this.l0 = px5.f;
        this.Z = null;
        this.o0 = null;
        this.s0 = false;
        this.p0 = null;
        this.q0 = false;
        if (set2 != null || (set != null && !set.isEmpty())) {
            zlVar = new zl(set, set2);
        }
        this.r0 = zlVar;
    }

    public sp4(sp4 sp4Var, ri8 ri8Var, Object obj, boolean z) {
        super(0, Map.class);
        this.m0 = sp4Var.m0;
        this.n0 = sp4Var.n0;
        this.g0 = sp4Var.g0;
        this.h0 = sp4Var.h0;
        this.f0 = sp4Var.f0;
        this.k0 = ri8Var;
        this.i0 = sp4Var.i0;
        this.j0 = sp4Var.j0;
        this.l0 = sp4Var.l0;
        this.Z = sp4Var.Z;
        this.o0 = sp4Var.o0;
        this.s0 = sp4Var.s0;
        this.p0 = obj;
        this.q0 = z;
        this.r0 = sp4Var.r0;
    }

    public sp4(sp4 sp4Var, Object obj, boolean z) {
        super(0, Map.class);
        this.m0 = sp4Var.m0;
        this.n0 = sp4Var.n0;
        this.g0 = sp4Var.g0;
        this.h0 = sp4Var.h0;
        this.f0 = sp4Var.f0;
        this.k0 = sp4Var.k0;
        this.i0 = sp4Var.i0;
        this.j0 = sp4Var.j0;
        this.l0 = px5.f;
        this.Z = sp4Var.Z;
        this.o0 = obj;
        this.s0 = z;
        this.p0 = sp4Var.p0;
        this.q0 = sp4Var.q0;
        this.r0 = sp4Var.r0;
    }
}
