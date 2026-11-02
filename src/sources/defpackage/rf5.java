package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rf5 extends e50 implements Comparable {
    public static final r75 n0 = new r75((byte) 1, 1);
    public final l37 Y;
    public final m85 Z;
    public final jx5 f0;
    public final jx5 g0;
    public jp h0;
    public jp i0;
    public jp j0;
    public jp k0;
    public transient ix5 l0;
    public transient r75 m0;

    public rf5(rf5 rf5Var, jx5 jx5Var) {
        this.Y = rf5Var.Y;
        this.Z = rf5Var.Z;
        this.g0 = rf5Var.g0;
        this.f0 = jx5Var;
        this.h0 = rf5Var.h0;
        this.i0 = rf5Var.i0;
        this.j0 = rf5Var.j0;
        this.k0 = rf5Var.k0;
    }

    public static boolean A(jp jpVar, jx5 jx5Var) {
        while (jpVar != null) {
            if (jpVar.d && jx5Var.equals((jx5) jpVar.c)) {
                return true;
            }
            jpVar = (jp) jpVar.b;
        }
        return false;
    }

    public static yr2 B(int i, jp... jpVarArr) {
        yr2 yr2VarY = y(jpVarArr[i]);
        do {
            i++;
            if (i >= jpVarArr.length) {
                return yr2VarY;
            }
        } while (jpVarArr[i] == null);
        return yr2.q(yr2VarY, B(i, jpVarArr));
    }

    public static boolean q(jp jpVar) {
        while (jpVar != null) {
            if (((jx5) jpVar.c) != null && jpVar.d) {
                return true;
            }
            jpVar = (jp) jpVar.b;
        }
        return false;
    }

    public static boolean r(jp jpVar) {
        while (jpVar != null) {
            jx5 jx5Var = (jx5) jpVar.c;
            if (jx5Var != null && !jx5Var.X.isEmpty()) {
                return true;
            }
            jpVar = (jp) jpVar.b;
        }
        return false;
    }

    public static boolean s(jp jpVar) {
        jx5 jx5Var;
        while (jpVar != null) {
            if (!jpVar.f && (jx5Var = (jx5) jpVar.c) != null && !jx5Var.X.isEmpty()) {
                return true;
            }
            jpVar = (jp) jpVar.b;
        }
        return false;
    }

    public static boolean t(jp jpVar) {
        while (jpVar != null) {
            if (jpVar.f) {
                return true;
            }
            jpVar = (jp) jpVar.b;
        }
        return false;
    }

    public static boolean u(jp jpVar) {
        while (jpVar != null) {
            if (jpVar.e) {
                return true;
            }
            jpVar = (jp) jpVar.b;
        }
        return false;
    }

    public static jp v(jp jpVar, yr2 yr2Var) {
        gl glVar = (gl) ((gl) jpVar.g).E0(yr2Var);
        jp jpVar2 = (jp) jpVar.b;
        if (jpVar2 != null) {
            jpVar = jpVar.f(v(jpVar2, yr2Var));
        }
        return glVar == jpVar.g ? jpVar : new jp(glVar, (jp) jpVar.b, (jx5) jpVar.c, jpVar.d, jpVar.e, jpVar.f);
    }

    public static Set x(jp jpVar, Set set) {
        while (jpVar != null) {
            jx5 jx5Var = (jx5) jpVar.c;
            if (jpVar.d && jx5Var != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(jx5Var);
            }
            jpVar = (jp) jpVar.b;
        }
        return set;
    }

    public static yr2 y(jp jpVar) {
        yr2 yr2Var = ((gl) jpVar.g).C0;
        jp jpVar2 = (jp) jpVar.b;
        return jpVar2 != null ? yr2.q(yr2Var, y(jpVar2)) : yr2Var;
    }

    public static int z(hl hlVar) {
        String name = hlVar.E0.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public final hl C(hl hlVar, hl hlVar2) {
        Class<?> declaringClass = hlVar.E0.getDeclaringClass();
        Class<?> declaringClass2 = hlVar2.E0.getDeclaringClass();
        if (declaringClass != declaringClass2) {
            if (!declaringClass.isAssignableFrom(declaringClass2)) {
                if (!declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
        }
        String name = hlVar2.E0.getName();
        char c = 2;
        char c2 = (!name.startsWith("set") || name.length() <= 3) ? (char) 2 : (char) 1;
        String name2 = hlVar.E0.getName();
        if (name2.startsWith("set") && name2.length() > 3) {
            c = 1;
        }
        if (c2 != c) {
            return c2 < c ? hlVar2 : hlVar;
        }
        m85 m85Var = this.Z;
        if (m85Var == null) {
            return null;
        }
        return m85Var.b0(hlVar, hlVar2);
    }

    public final void D(rf5 rf5Var) {
        jp jpVarA = this.h0;
        jp jpVar = rf5Var.h0;
        if (jpVarA == null) {
            jpVarA = jpVar;
        } else if (jpVar != null) {
            jpVarA = jpVarA.a(jpVar);
        }
        this.h0 = jpVarA;
        jp jpVarA2 = this.i0;
        jp jpVar2 = rf5Var.i0;
        if (jpVarA2 == null) {
            jpVarA2 = jpVar2;
        } else if (jpVar2 != null) {
            jpVarA2 = jpVarA2.a(jpVar2);
        }
        this.i0 = jpVarA2;
        jp jpVarA3 = this.j0;
        jp jpVar3 = rf5Var.j0;
        if (jpVarA3 == null) {
            jpVarA3 = jpVar3;
        } else if (jpVar3 != null) {
            jpVarA3 = jpVarA3.a(jpVar3);
        }
        this.j0 = jpVarA3;
        jp jpVarA4 = this.k0;
        jp jpVar4 = rf5Var.k0;
        if (jpVarA4 == null) {
            jpVarA4 = jpVar4;
        } else if (jpVar4 != null) {
            jpVarA4 = jpVarA4.a(jpVar4);
        }
        this.k0 = jpVarA4;
    }

    public final boolean E() {
        return t(this.h0) || t(this.j0) || t(this.k0) || t(this.i0);
    }

    public final boolean F() {
        return u(this.h0) || u(this.j0) || u(this.k0) || u(this.i0);
    }

    @Override // defpackage.e50
    public final boolean a() {
        if (this.i0 != null || this.k0 != null) {
            return true;
        }
        jp jpVar = this.h0;
        return jpVar != null && u(jpVar);
    }

    @Override // defpackage.e50
    public final ep3 b() {
        gl glVarE = e();
        m85 m85Var = this.Z;
        ep3 ep3VarX = m85Var == null ? null : m85Var.x(glVarE);
        return ep3VarX == null ? ep3.g0 : ep3VarX;
    }

    @Override // defpackage.e50
    public final r75 c() {
        jp jpVar;
        r75 r75Var = this.m0;
        r75 r75VarB = null;
        r75 r75Var2 = n0;
        if (r75Var != null) {
            if (r75Var == r75Var2) {
                return null;
            }
            return r75Var;
        }
        m85 m85Var = this.Z;
        if (m85Var != null) {
            jp jpVar2 = this.j0;
            r75VarB = jpVar2 != null ? m85Var.B((gl) jpVar2.g) : null;
            if (r75VarB == null && (jpVar = this.h0) != null) {
                r75VarB = m85Var.B((gl) jpVar.g);
            }
        }
        if (r75VarB != null) {
            r75Var2 = r75VarB;
        }
        this.m0 = r75Var2;
        return r75VarB;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        rf5 rf5Var = (rf5) obj;
        if (this.i0 != null) {
            if (rf5Var.i0 == null) {
                return -1;
            }
        } else if (rf5Var.i0 != null) {
            return 1;
        }
        return j().compareTo(rf5Var.j());
    }

    @Override // defpackage.e50
    public final Class[] d() {
        jp jpVar;
        m85 m85Var = this.Z;
        if (m85Var == null) {
            return null;
        }
        jp jpVar2 = this.j0;
        Class[] clsArrN = jpVar2 != null ? m85Var.N((gl) jpVar2.g) : null;
        return (clsArrN != null || (jpVar = this.h0) == null) ? clsArrN : m85Var.N((gl) jpVar.g);
    }

    @Override // defpackage.e50
    public final ll f() {
        jp jpVar = this.i0;
        if (jpVar == null) {
            return null;
        }
        do {
            ll llVar = (ll) jpVar.g;
            if (llVar.D0 instanceof cl) {
                return llVar;
            }
            jpVar = (jp) jpVar.b;
        } while (jpVar != null);
        return (ll) this.i0.g;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045 A[SYNTHETIC] */
    @Override // defpackage.e50
    public final el g() {
        boolean zIsStatic;
        jp jpVar = this.h0;
        if (jpVar == null) {
            return null;
        }
        el elVar = (el) jpVar.g;
        for (jp jpVar2 = (jp) jpVar.b; jpVar2 != null; jpVar2 = (jp) jpVar2.b) {
            el elVar2 = (el) jpVar2.g;
            Class<?> declaringClass = elVar.D0.getDeclaringClass();
            Class<?> declaringClass2 = elVar2.D0.getDeclaringClass();
            if (declaringClass == declaringClass2) {
                zIsStatic = Modifier.isStatic(elVar.K());
                if (zIsStatic != Modifier.isStatic(elVar2.K())) {
                    u52.p("Multiple fields representing property \"", j(), "\": ", elVar.A0(), " vs ", elVar2.A0());
                    return null;
                }
                if (zIsStatic) {
                    elVar = elVar2;
                }
            } else if (declaringClass.isAssignableFrom(declaringClass2)) {
                elVar = elVar2;
            } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                continue;
            } else {
                zIsStatic = Modifier.isStatic(elVar.K());
                if (zIsStatic != Modifier.isStatic(elVar2.K())) {
                    u52.p("Multiple fields representing property \"", j(), "\": ", elVar.A0(), " vs ", elVar2.A0());
                    return null;
                }
                if (zIsStatic) {
                    elVar = elVar2;
                }
            }
        }
        return elVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:29:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0044 A[SYNTHETIC] */
    @Override // defpackage.e50
    public final hl h() {
        int iZ;
        int iZ2;
        jp jpVar = this.j0;
        if (jpVar == null) {
            return null;
        }
        jp jpVar2 = (jp) jpVar.b;
        if (jpVar2 == null) {
            return (hl) jpVar.g;
        }
        while (true) {
            Object obj = jpVar.g;
            if (jpVar2 == null) {
                this.j0 = jpVar.h();
                return (hl) obj;
            }
            Object obj2 = jpVar2.g;
            hl hlVar = (hl) obj;
            Class<?> declaringClass = hlVar.E0.getDeclaringClass();
            hl hlVar2 = (hl) obj2;
            Class<?> declaringClass2 = hlVar2.E0.getDeclaringClass();
            if (declaringClass == declaringClass2) {
                iZ = z(hlVar2);
                iZ2 = z(hlVar);
                if (iZ != iZ2) {
                    u52.p("Conflicting getter definitions for property \"", j(), "\": ", hlVar.A0(), " vs ", hlVar2.A0());
                    return null;
                }
                if (iZ < iZ2) {
                    jpVar = jpVar2;
                }
            } else if (declaringClass.isAssignableFrom(declaringClass2)) {
                jpVar = jpVar2;
            } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                continue;
            } else {
                iZ = z(hlVar2);
                iZ2 = z(hlVar);
                if (iZ != iZ2) {
                    u52.p("Conflicting getter definitions for property \"", j(), "\": ", hlVar.A0(), " vs ", hlVar2.A0());
                    return null;
                }
                if (iZ < iZ2) {
                    jpVar = jpVar2;
                }
            }
            jpVar2 = (jp) jpVar2.b;
        }
    }

    @Override // defpackage.e50
    public final ix5 i() {
        gl glVar;
        ix5 ix5Var = this.l0;
        if (ix5Var == null) {
            jp jpVar = this.j0;
            if (jpVar != null) {
                glVar = (gl) jpVar.g;
            } else {
                jp jpVar2 = this.h0;
                glVar = jpVar2 != null ? (gl) jpVar2.g : null;
            }
            if (glVar == null) {
                ix5 ix5Var2 = ix5.j0;
                this.l0 = ix5Var2;
                return ix5Var2;
            }
            m85 m85Var = this.Z;
            Boolean boolV = m85Var.V(glVar);
            String strU = m85Var.u(glVar);
            Integer numZ = m85Var.z(glVar);
            String strT = m85Var.t(glVar);
            if (boolV == null && numZ == null && strT == null) {
                ix5 ix5Var3 = ix5.j0;
                if (strU != null) {
                    ix5Var3 = new ix5(ix5Var3.X, strU, ix5Var3.Y, ix5Var3.Z, null, ix5Var3.f0, ix5Var3.g0);
                }
                this.l0 = ix5Var3;
                return ix5Var3;
            }
            ix5 ix5Var4 = ix5.h0;
            if (strU != null || numZ != null || strT != null) {
                ix5Var = new ix5(boolV, strU, numZ, strT, null, null, null);
            } else if (boolV == null) {
                ix5Var = ix5.j0;
            } else {
                ix5Var = boolV.booleanValue() ? ix5.h0 : ix5.i0;
            }
            this.l0 = ix5Var;
        }
        return ix5Var;
    }

    @Override // defpackage.e50
    public final String j() {
        jx5 jx5Var = this.f0;
        if (jx5Var == null) {
            return null;
        }
        return jx5Var.X;
    }

    @Override // defpackage.e50
    public final dh8 k() {
        vj8 vj8VarH = h();
        return (vj8VarH == null && (vj8VarH = g()) == null) ? uh8.u0 : vj8VarH.Q();
    }

    @Override // defpackage.e50
    public final Class l() {
        return k().j0;
    }

    @Override // defpackage.e50
    public final hl m() {
        Object obj;
        jp jpVar = this.k0;
        if (jpVar == null) {
            return null;
        }
        jp jpVar2 = (jp) jpVar.b;
        if (jpVar2 == null) {
            return (hl) jpVar.g;
        }
        while (true) {
            Object obj2 = jpVar.g;
            if (jpVar2 == null) {
                this.k0 = jpVar.h();
                return (hl) obj2;
            }
            jp jpVar3 = (jp) jpVar2.b;
            Object obj3 = jpVar2.g;
            hl hlVarC = C((hl) obj2, (hl) obj3);
            if (hlVarC != obj2) {
                if (hlVarC != obj3) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj2);
                    arrayList.add(obj3);
                    while (true) {
                        obj = jpVar.g;
                        if (jpVar3 == null) {
                            break;
                        }
                        Object obj4 = jpVar3.g;
                        hl hlVarC2 = C((hl) obj, (hl) obj4);
                        if (hlVarC2 != obj) {
                            if (hlVarC2 == obj4) {
                                arrayList.clear();
                                jpVar = jpVar3;
                            } else {
                                arrayList.add(obj4);
                            }
                        }
                        jpVar3 = (jp) jpVar3.b;
                    }
                    if (arrayList.isEmpty()) {
                        this.k0 = jpVar.h();
                        return (hl) obj;
                    }
                    bt.q(oi0.m("Conflicting setter definitions for property \"", j(), "\": ", (String) arrayList.stream().map(new qf5()).collect(Collectors.joining(" vs "))));
                    return null;
                }
                jpVar = jpVar2;
            }
            jpVar2 = jpVar3;
        }
    }

    @Override // defpackage.e50
    public final boolean o() {
        return r(this.h0) || r(this.j0) || r(this.k0) || q(this.i0);
    }

    @Override // defpackage.e50
    public final boolean p() {
        jp jpVar;
        Boolean boolZ = null;
        m85 m85Var = this.Z;
        if (m85Var != null) {
            jp jpVar2 = this.j0;
            boolZ = jpVar2 != null ? m85Var.Z((gl) jpVar2.g) : null;
            if (boolZ == null && (jpVar = this.h0) != null) {
                boolZ = m85Var.Z((gl) jpVar.g);
            }
        }
        return boolZ != null && boolZ.booleanValue();
    }

    public final String toString() {
        return "[Property '" + this.f0 + "'; ctors: " + this.i0 + ", field(s): " + this.h0 + ", getter(s): " + this.j0 + ", setter(s): " + this.k0 + "]";
    }

    public final void w(Set set, HashMap map, jp jpVar) {
        String strC;
        for (jp jpVar2 = jpVar; jpVar2 != null; jpVar2 = (jp) jpVar2.b) {
            jx5 jx5Var = (jx5) jpVar2.c;
            if (jpVar2.d && jx5Var != null) {
                rf5 rf5Var = (rf5) map.get(jx5Var);
                if (rf5Var == null) {
                    rf5Var = new rf5(this.Y, this.Z, this.g0, jx5Var);
                    map.put(jx5Var, rf5Var);
                }
                if (jpVar == this.h0) {
                    rf5Var.h0 = jpVar2.f(rf5Var.h0);
                } else if (jpVar == this.j0) {
                    rf5Var.j0 = jpVar2.f(rf5Var.j0);
                } else if (jpVar == this.k0) {
                    rf5Var.k0 = jpVar2.f(rf5Var.k0);
                } else {
                    if (jpVar != this.i0) {
                        u52.r(this, "Internal error: mismatched accessors, property: ");
                        return;
                    }
                    rf5Var.i0 = jpVar2.f(rf5Var.i0);
                }
            } else if (jpVar2.e) {
                StringBuilder sb = new StringBuilder("Conflicting/ambiguous property name definitions (implicit name ");
                jx5 jx5Var2 = this.f0;
                if (jx5Var2 == null) {
                    Annotation[] annotationArr = it0.a;
                    strC = "[null]";
                } else {
                    strC = it0.c(jx5Var2.X);
                }
                sb.append(strC);
                sb.append("): found multiple explicit names: ");
                sb.append(set);
                sb.append(", but also implicit accessor: ");
                sb.append(jpVar2);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public rf5(l37 l37Var, m85 m85Var, jx5 jx5Var, jx5 jx5Var2) {
        this.Y = l37Var;
        this.Z = m85Var;
        this.g0 = jx5Var;
        this.f0 = jx5Var2;
    }
}
