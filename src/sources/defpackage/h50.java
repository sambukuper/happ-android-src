package defpackage;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h50 extends lj7 implements p51 {
    public static final f50[] l0;
    public final dh8 Z;
    public final f50[] f0;
    public final f50[] g0;
    public final Object h0;
    public final gl i0;
    public final wg j0;
    public final mo3 k0;

    static {
        new jx5("#object-ref", null);
        l0 = new f50[0];
    }

    public h50(h50 h50Var, Set set, Set set2) {
        super(h50Var.X);
        this.Z = h50Var.Z;
        f50[] f50VarArr = h50Var.f0;
        f50[] f50VarArr2 = h50Var.g0;
        int length = f50VarArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = f50VarArr2 == null ? null : new ArrayList(length);
        for (int i = 0; i < length; i++) {
            f50 f50Var = f50VarArr[i];
            if (!hi5.x0(f50Var.Y.X, set, set2)) {
                arrayList.add(f50Var);
                if (f50VarArr2 != null) {
                    arrayList2.add(f50VarArr2[i]);
                }
            }
        }
        this.f0 = (f50[]) arrayList.toArray(new f50[arrayList.size()]);
        this.g0 = arrayList2 != null ? (f50[]) arrayList2.toArray(new f50[arrayList2.size()]) : null;
        this.i0 = h50Var.i0;
        this.j0 = h50Var.j0;
        this.h0 = h50Var.h0;
        this.k0 = h50Var.k0;
    }

    public static final f50[] s(f50[] f50VarArr, c25 c25Var) {
        if (f50VarArr == null || f50VarArr.length == 0 || c25Var == null || c25Var == c25.X) {
            return f50VarArr;
        }
        int length = f50VarArr.length;
        f50[] f50VarArr2 = new f50[length];
        for (int i = 0; i < length; i++) {
            f50 f50Var = f50VarArr[i];
            if (f50Var != null) {
                f50VarArr2[i] = f50Var.i(c25Var);
            }
        }
        return f50VarArr2;
    }

    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) throws nh3 {
        mo3 mo3Var;
        int i;
        wg wgVarP;
        int i2;
        Object objG;
        Set set;
        Set set2;
        f50[] f50VarArr;
        f85 f85VarQ;
        mo3 mo3Var2;
        h50 h50VarX = this;
        l37 l37Var = t37Var.X;
        m85 m85VarD = l37Var.d();
        Object obj = null;
        gl glVarB = d50Var != null ? d50Var.b() : null;
        Class cls = h50VarX.X;
        no3 no3VarK = lj7.k(t37Var, d50Var, cls);
        mo3 mo3Var3 = h50VarX.k0;
        if (no3VarK == null || (mo3Var = no3VarK.Y) == (mo3Var2 = mo3.k0)) {
            mo3Var = null;
        } else if (mo3Var != mo3Var2 && mo3Var != mo3Var3) {
            dh8 dh8Var = h50VarX.Z;
            if (dh8Var.J0()) {
                int iOrdinal = mo3Var.ordinal();
                if (iOrdinal == 2 || iOrdinal == 4 || iOrdinal == 5) {
                    ((b30) l37Var.Y.Y).getClass();
                    z20 z20VarE0 = b30.E0(l37Var, dh8Var);
                    if (z20VarE0 == null) {
                        z20VarE0 = z20.d(l37Var, dh8Var, bl.g(l37Var, dh8Var, l37Var));
                    }
                    return t37Var.u(v22.s(dh8Var.j0, l37Var, z20VarE0, no3VarK), d50Var);
                }
            } else if (mo3Var == mo3.l0 && ((!(dh8Var instanceof tp4) || !Map.class.isAssignableFrom(cls)) && Map.Entry.class.isAssignableFrom(cls))) {
                dh8 dh8VarX0 = dh8Var.x0(Map.Entry.class);
                dh8 dh8VarD = dh8VarX0.q0.d(0);
                if (dh8VarD == null) {
                    dh8VarD = uh8.u0;
                }
                dh8 dh8Var2 = dh8VarD;
                dh8 dh8VarD2 = dh8VarX0.q0.d(1);
                if (dh8VarD2 == null) {
                    dh8VarD2 = uh8.u0;
                }
                return t37Var.u(new op4(h50VarX.Z, dh8Var2, dh8VarD2, false, null, d50Var), d50Var);
            }
        }
        f50[] f50VarArr2 = h50VarX.f0;
        wg wgVar = h50VarX.j0;
        if (glVarB != null) {
            yo3 yo3VarV = m85VarD.v(glVarB);
            set = yo3VarV.Z ? Collections.EMPTY_SET : yo3VarV.X;
            set2 = m85VarD.y(glVarB).X;
            f85 f85VarP = m85VarD.p(glVarB);
            if (f85VarP == null) {
                if (wgVar == null || (f85VarQ = m85VarD.q(glVarB, null)) == null) {
                    wgVarP = wgVar;
                } else {
                    boolean z = f85VarQ.e;
                    wgVarP = z == wgVar.a ? wgVar : new wg((dh8) wgVar.b, (r37) wgVar.c, (ex5) wgVar.d, (ar3) wgVar.e, z);
                }
                mo3Var3 = mo3Var3;
                i2 = 0;
                i = 0;
                mo3Var = mo3Var;
            } else {
                f85 f85VarQ2 = m85VarD.q(glVarB, f85VarP);
                Class cls2 = f85VarQ2.b;
                i = 0;
                boolean z2 = f85VarQ2.e;
                jx5 jx5Var = f85VarQ2.a;
                dh8 dh8VarB = cls2 == null ? null : t37Var.s().b(null, cls2, uh8.f0);
                t37Var.s().getClass();
                dh8 dh8Var3 = uh8.h(dh8VarB, d85.class)[0];
                if (cls2 == ex5.class) {
                    String str = jx5Var.X;
                    int length = f50VarArr2.length;
                    i2 = 0;
                    while (true) {
                        if (i2 == length) {
                            t37Var.A("Invalid Object Id definition for " + it0.u(cls) + ": cannot find property with name " + (str == null ? "[null]" : it0.c(str)));
                            throw null;
                        }
                        f50 f50Var = f50VarArr2[i2];
                        if (str.equals(f50Var.Y.X)) {
                            wgVarP = wg.p(f50Var.f0, null, new ex5(f85VarQ2.d, f50Var), z2);
                            obj = null;
                            break;
                        }
                        i2++;
                    }
                } else {
                    obj = null;
                    wgVarP = wg.p(dh8Var3, jx5Var, t37Var.y(f85VarQ2), z2);
                    i2 = 0;
                }
            }
            objG = m85VarD.g(glVarB);
            if (objG == null || objG.equals(h50VarX.h0)) {
                objG = obj;
            }
        } else {
            obj = null;
            mo3Var3 = mo3Var3;
            i = 0;
            mo3Var = mo3Var;
            wgVarP = wgVar;
            i2 = 0;
            objG = null;
            set = null;
            set2 = null;
        }
        if (i2 > 0) {
            f50[] f50VarArr3 = (f50[]) Arrays.copyOf(f50VarArr2, f50VarArr2.length);
            f50 f50Var2 = f50VarArr3[i2];
            int i3 = i;
            System.arraycopy(f50VarArr3, i3, f50VarArr3, 1, i2);
            f50VarArr3[i3] = f50Var2;
            f50[] f50VarArr4 = h50VarX.g0;
            if (f50VarArr4 == null) {
                f50VarArr = obj;
            } else {
                f50[] f50VarArr5 = (f50[]) Arrays.copyOf(f50VarArr4, f50VarArr4.length);
                f50 f50Var3 = f50VarArr5[i2];
                System.arraycopy(f50VarArr5, i3, f50VarArr5, 1, i2);
                f50VarArr5[i3] = f50Var3;
                f50VarArr = f50VarArr5;
            }
            h50VarX = h50VarX.z(f50VarArr3, f50VarArr);
        }
        if (wgVarP != null) {
            wg wgVar2 = new wg((dh8) wgVarP.b, (r37) wgVarP.c, (ex5) wgVarP.d, t37Var.p((dh8) wgVarP.b, d50Var), wgVarP.a);
            if (wgVar2 != wgVar) {
                h50VarX = h50VarX.y(wgVar2);
            }
        }
        if ((set != null && !set.isEmpty()) || set2 != null) {
            h50VarX = h50VarX.w(set, set2);
        }
        if (objG != null) {
            h50VarX = h50VarX.x(objG);
        }
        return (mo3Var == null ? mo3Var3 : mo3Var) == mo3.i0 ? h50VarX.r() : h50VarX;
    }

    @Override // defpackage.ar3
    public void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) {
        if (this.j0 != null) {
            o(obj, ro3Var, t37Var, ri8Var);
            return;
        }
        z76 z76VarQ = q(ri8Var, obj, gr3.START_OBJECT);
        ri8Var.e(ro3Var, z76VarQ);
        ro3Var.m(obj);
        if (this.h0 != null) {
            v(obj, ro3Var, t37Var);
            throw null;
        }
        u(obj, ro3Var, t37Var);
        ri8Var.f(ro3Var, z76VarQ);
    }

    @Override // defpackage.ar3
    public final boolean h() {
        return this.j0 != null;
    }

    public final void o(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) {
        wg wgVar = this.j0;
        ex5 ex5Var = (ex5) wgVar.d;
        boolean z = wgVar.a;
        ar3 ar3Var = (ar3) wgVar.e;
        p59 p59VarL = t37Var.l(obj, ex5Var);
        if (p59VarL.b != null && (p59VarL.c || z)) {
            ro3Var.getClass();
            ar3Var.e(p59VarL.b, ro3Var, t37Var);
            return;
        }
        Object objA = p59VarL.a(obj);
        if (z) {
            ar3Var.e(objA, ro3Var, t37Var);
            return;
        }
        z76 z76VarQ = q(ri8Var, obj, gr3.START_OBJECT);
        ri8Var.e(ro3Var, z76VarQ);
        ro3Var.m(obj);
        p59VarL.c = true;
        r37 r37Var = (r37) wgVar.c;
        if (r37Var != null) {
            ro3Var.R(r37Var);
            ar3Var.e(p59VarL.b, ro3Var, t37Var);
        }
        if (this.h0 != null) {
            v(obj, ro3Var, t37Var);
            throw null;
        }
        u(obj, ro3Var, t37Var);
        ri8Var.f(ro3Var, z76VarQ);
    }

    public final void p(Object obj, ro3 ro3Var, t37 t37Var, boolean z) {
        wg wgVar = this.j0;
        ex5 ex5Var = (ex5) wgVar.d;
        boolean z2 = wgVar.a;
        ar3 ar3Var = (ar3) wgVar.e;
        p59 p59VarL = t37Var.l(obj, ex5Var);
        Object obj2 = p59VarL.b;
        if (obj2 != null && (p59VarL.c || z2)) {
            ar3Var.e(obj2, ro3Var, t37Var);
            return;
        }
        Object objA = p59VarL.a(obj);
        if (z2) {
            ar3Var.e(objA, ro3Var, t37Var);
            return;
        }
        if (z) {
            ro3Var.a1(obj);
        }
        p59VarL.c = true;
        r37 r37Var = (r37) wgVar.c;
        if (r37Var != null) {
            ro3Var.R(r37Var);
            ar3Var.e(p59VarL.b, ro3Var, t37Var);
        }
        if (this.h0 != null) {
            v(obj, ro3Var, t37Var);
            throw null;
        }
        u(obj, ro3Var, t37Var);
        if (z) {
            ro3Var.J();
        }
    }

    public final z76 q(ri8 ri8Var, Object obj, gr3 gr3Var) {
        gl glVar = this.i0;
        if (glVar == null) {
            return ri8Var.d(obj, gr3Var);
        }
        Object objC0 = glVar.C0(obj);
        if (objC0 == null) {
            objC0 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        z76 z76VarD = ri8Var.d(obj, gr3Var);
        z76VarD.g0 = objC0;
        return z76VarD;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0069 A[PHI: r6
  0x0069: PHI (r6v5 dh8) = (r6v4 dh8), (r6v10 dh8) binds: [B:31:0x0049, B:33:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    public final void t(t37 t37Var) {
        ar3 ar3VarP;
        f50 f50Var;
        ri8 ri8Var;
        Object objE;
        ar3 ar3Var;
        f50 f50Var2;
        f50[] f50VarArr = this.g0;
        int length = f50VarArr == null ? 0 : f50VarArr.length;
        f50[] f50VarArr2 = this.f0;
        int length2 = f50VarArr2.length;
        for (int i = 0; i < length2; i++) {
            f50 f50Var3 = f50VarArr2[i];
            boolean z = f50Var3.p0;
            gl glVar = f50Var3.i0;
            if (!z && f50Var3.m0 == null && (ar3Var = t37Var.h0) != null) {
                f50Var3.f(ar3Var);
                if (i < length && (f50Var2 = f50VarArr[i]) != null) {
                    f50Var2.f(ar3Var);
                }
            }
            if (f50Var3.l0 == null) {
                m85 m85VarD = t37Var.X.d();
                if (glVar != null && (objE = m85VarD.E(glVar)) != null) {
                    t37Var.f(objE);
                    t37Var.s();
                    throw null;
                }
                dh8 dh8Var = f50Var3.g0;
                if (dh8Var == null) {
                    dh8Var = f50Var3.f0;
                    if (Modifier.isFinal(dh8Var.j0.getModifiers())) {
                        ar3VarP = t37Var.p(dh8Var, f50Var3);
                        if (dh8Var.I0() && (ri8Var = (ri8) dh8Var.z0().m0) != null && (ar3VarP instanceof e41)) {
                            ar3VarP = ((e41) ar3VarP).o(ri8Var);
                        }
                        if (i < length || (f50Var = f50VarArr[i]) == null) {
                            f50Var3.g(ar3VarP);
                        } else {
                            f50Var.g(ar3VarP);
                        }
                    } else if (dh8Var.I0() || dh8Var.q0.Y.length > 0) {
                        f50Var3.h0 = dh8Var;
                    }
                } else {
                    ar3VarP = t37Var.p(dh8Var, f50Var3);
                    if (dh8Var.I0()) {
                        ar3VarP = ((e41) ar3VarP).o(ri8Var);
                    }
                    if (i < length) {
                        f50Var3.g(ar3VarP);
                    } else {
                        f50Var3.g(ar3VarP);
                    }
                }
            }
        }
        for (f50 f50Var4 : f50VarArr2) {
            if (f50Var4 instanceof zm) {
                zm zmVar = (zm) f50Var4;
                ar3 ar3Var2 = zmVar.v0;
                if (ar3Var2 instanceof p51) {
                    ar3 ar3VarU = t37Var.u(ar3Var2, zmVar.t0);
                    zmVar.v0 = ar3VarU;
                    if (ar3VarU instanceof sp4) {
                        zmVar.w0 = (sp4) ar3VarU;
                    }
                }
            }
        }
    }

    public final void u(Object obj, ro3 ro3Var, t37 t37Var) {
        if (this.g0 != null) {
            t37Var.getClass();
        }
        f50[] f50VarArr = this.f0;
        int i = 0;
        try {
            int length = f50VarArr.length;
            while (i < length) {
                f50 f50Var = f50VarArr[i];
                if (f50Var != null) {
                    f50Var.k(obj, ro3Var, t37Var);
                }
                i++;
            }
        } catch (Exception e) {
            lj7.n(t37Var, e, obj, i != f50VarArr.length ? f50VarArr[i].Y.X : "[anySetter]");
            throw null;
        } catch (StackOverflowError e2) {
            pp3 pp3Var = new pp3(ro3Var, "Infinite recursion (StackOverflowError)", e2);
            op3 op3Var = new op3(obj, i != f50VarArr.length ? f50VarArr[i].Y.X : "[anySetter]");
            LinkedList linkedList = pp3Var.X;
            if (linkedList == null) {
                linkedList = new LinkedList();
                pp3Var.X = linkedList;
            }
            if (linkedList.size() >= 1000) {
                throw pp3Var;
            }
            pp3Var.X.addFirst(op3Var);
            throw pp3Var;
        }
    }

    public final void v(Object obj, ro3 ro3Var, t37 t37Var) {
        if (this.g0 != null) {
            t37Var.getClass();
        }
        l(t37Var, this.h0);
        throw null;
    }

    public h50 w(Set set, Set set2) {
        return new g50(this, set, set2);
    }

    public h50 x(Object obj) {
        return new g50(this, this.j0, obj);
    }

    public h50 y(wg wgVar) {
        return new g50(this, wgVar, this.h0);
    }

    public h50 r() {
        return this;
    }

    public h50 z(f50[] f50VarArr, f50[] f50VarArr2) {
        return this;
    }

    public h50(h50 h50Var, f50[] f50VarArr, f50[] f50VarArr2) {
        super(h50Var.X);
        this.Z = h50Var.Z;
        this.f0 = f50VarArr;
        this.g0 = f50VarArr2;
        this.i0 = h50Var.i0;
        this.j0 = h50Var.j0;
        this.h0 = h50Var.h0;
        this.k0 = h50Var.k0;
    }

    public h50(h50 h50Var, wg wgVar, Object obj) {
        super(h50Var.X);
        this.Z = h50Var.Z;
        this.f0 = h50Var.f0;
        this.g0 = h50Var.g0;
        this.i0 = h50Var.i0;
        this.j0 = wgVar;
        this.h0 = obj;
        this.k0 = h50Var.k0;
    }

    public h50(dh8 dh8Var, xy0 xy0Var, f50[] f50VarArr, f50[] f50VarArr2) {
        super(dh8Var);
        this.Z = dh8Var;
        this.f0 = f50VarArr;
        this.g0 = f50VarArr2;
        this.i0 = (gl) xy0Var.i0;
        this.h0 = xy0Var.h0;
        this.j0 = (wg) xy0Var.j0;
        this.k0 = ((z20) xy0Var.Y).b().Y;
    }
}
