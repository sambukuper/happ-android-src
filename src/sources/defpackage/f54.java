package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f54 extends ft4 {
    public static final /* synthetic */ nw3[] m = {new lx5(f54.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new lx5(f54.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new lx5(f54.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};
    public final z47 b;
    public final f54 c;
    public final ne4 d;
    public final te4 e;
    public final pe4 f;
    public final vt1 g;
    public final pe4 h;
    public final te4 i;
    public final te4 j;
    public final te4 k;
    public final pe4 l;

    public f54(z47 z47Var, t44 t44Var) {
        z47Var.getClass();
        this.b = z47Var;
        this.c = t44Var;
        ve4 ve4Var = (ve4) ((c6) z47Var.Y).f0;
        byte b = 0;
        this.d = new ne4(ve4Var, new c54(this, b));
        byte b2 = 1;
        this.e = new te4(ve4Var, new c54(this, b2));
        this.f = ve4Var.b(new d54(this, b));
        this.g = ve4Var.c(new d54(this, b2));
        byte b3 = 2;
        this.h = ve4Var.b(new d54(this, b3));
        this.i = new te4(ve4Var, new c54(this, b3));
        byte b4 = 3;
        this.j = new te4(ve4Var, new c54(this, b4));
        this.k = new te4(ve4Var, new c54(this, (byte) 4));
        this.l = ve4Var.b(new d54(this, b4));
    }

    public static t14 l(cb6 cb6Var, z47 z47Var) {
        cb6Var.getClass();
        Class<?> declaringClass = ((Method) cb6Var.b()).getDeclaringClass();
        declaringClass.getClass();
        return ((f63) z47Var.g0).C(cb6Var.f(), pu.U(zi8.Y, declaringClass.isAnnotation(), null, 6));
    }

    public static fj2 u(z47 z47Var, jo2 jo2Var, List list) {
        qg5 qg5Var;
        v15 v15Var;
        v15 v15VarE;
        f63 f63Var = (f63) z47Var.g0;
        wx4 wx4Var = (wx4) ((c6) z47Var.Y).n0;
        gu guVarD1 = wv0.d1(list);
        ArrayList arrayList = new ArrayList(xv0.Z(guVarD1, 10));
        Iterator it = guVarD1.iterator();
        boolean z = false;
        while (true) {
            rw1 rw1Var = (rw1) it;
            if (!rw1Var.Y.hasNext()) {
                return new fj2(wv0.Y0(arrayList), z);
            }
            pb3 pb3Var = (pb3) rw1Var.next();
            int i = pb3Var.a;
            ib6 ib6Var = (ib6) pb3Var.b;
            n44 n44VarW0 = hi5.w0(z47Var, ib6Var);
            nl3 nl3VarU = pu.U(zi8.Y, false, null, 7);
            boolean z2 = ib6Var.d;
            gb6 gb6Var = ib6Var.a;
            if (z2) {
                na6 na6Var = gb6Var instanceof na6 ? (na6) gb6Var : null;
                if (na6Var == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + ib6Var);
                }
                mo8 mo8VarB = f63Var.B(na6Var, nl3VarU, true);
                qg5Var = new qg5(mo8VarB, wx4Var.h0.f(mo8VarB));
            } else {
                qg5Var = new qg5(f63Var.C(gb6Var, nl3VarU), null);
            }
            t14 t14Var = (t14) qg5Var.X;
            t14 t14Var2 = (t14) qg5Var.Y;
            if (dh3.f(jo2Var.getName().b(), "equals") && list.size() == 1 && wx4Var.h0.p().equals(t14Var)) {
                v15VarE = v15.e("other");
            } else {
                String str = ib6Var.c;
                v15 v15VarD = str != null ? v15.d(str) : null;
                if (v15VarD == null) {
                    z = true;
                }
                if (v15VarD == null) {
                    v15VarE = v15.e("p" + i);
                } else {
                    v15Var = v15VarD;
                }
                arrayList.add(new ot8(jo2Var, null, i, n44VarW0, v15Var, t14Var, false, false, false, t14Var2, lh4.Z0(ib6Var)));
            }
            v15Var = v15VarE;
            arrayList.add(new ot8(jo2Var, null, i, n44VarW0, v15Var, t14Var, false, false, false, t14Var2, lh4.Z0(ib6Var)));
        }
    }

    @Override // defpackage.ft4, defpackage.et4
    public Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        return (Collection) this.d.invoke();
    }

    @Override // defpackage.ft4, defpackage.et4
    public Collection b(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        return !c().contains(v15Var) ? d02.X : (Collection) this.h.B(v15Var);
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set c() {
        return (Set) hi5.e0(this.i, m[0]);
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set d() {
        return (Set) hi5.e0(this.k, m[2]);
    }

    @Override // defpackage.ft4, defpackage.et4
    public Collection f(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        return !g().contains(v15Var) ? d02.X : (Collection) this.l.B(v15Var);
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set g() {
        return (Set) hi5.e0(this.j, m[1]);
    }

    public Set h(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        return m02.X;
    }

    public Set i(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        return m02.X;
    }

    public ld1 k() {
        return kd1.a;
    }

    public Set o(pk1 pk1Var) {
        pk1Var.getClass();
        return m02.X;
    }

    public i44 p() {
        return null;
    }

    public abstract ed1 q();

    public boolean r(dl3 dl3Var) {
        return true;
    }

    public e54 s(cb6 cb6Var, ArrayList arrayList, t14 t14Var, List list) {
        cb6Var.getClass();
        return new e54(t14Var, list, arrayList, d02.X);
    }

    public final dl3 t(cb6 cb6Var) {
        fx4 fx4Var;
        cb6Var.getClass();
        z47 z47Var = this.b;
        dl3 dl3VarV0 = dl3.V0(q(), hi5.w0(z47Var, cb6Var), cb6Var.c(), lh4.Z0(cb6Var), ((ld1) this.e.invoke()).b(cb6Var.c()) != null && ((ArrayList) cb6Var.g()).isEmpty());
        z47Var.getClass();
        z47 z47Var2 = new z47((c6) z47Var.Y, new xm0(z47Var, dl3VarV0, cb6Var, 0), (g44) z47Var.f0);
        ArrayList typeParameters = cb6Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(xv0.Z(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            hi8 hi8VarM = ((ki8) z47Var2.Z).M((hb6) it.next());
            hi8VarM.getClass();
            arrayList.add(hi8VarM);
        }
        fj2 fj2VarU = u(z47Var2, dl3VarV0, cb6Var.g());
        e54 e54VarS = s(cb6Var, arrayList, l(cb6Var, z47Var2), fj2VarU.a);
        List list = e54VarS.d;
        i44 i44VarP = p();
        ArrayList arrayList2 = e54VarS.c;
        List list2 = e54VarS.b;
        t14 t14Var = e54VarS.a;
        boolean zIsAbstract = Modifier.isAbstract(((Method) cb6Var.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) cb6Var.b()).getModifiers());
        fx4.X.getClass();
        if (zIsAbstract) {
            fx4Var = fx4.g0;
        } else {
            fx4Var = !zIsFinal ? fx4.f0 : fx4.Y;
        }
        dl3VarV0.U0(null, i44VarP, d02.X, arrayList2, list2, t14Var, fx4Var, s08.k(cb6Var.e()), e02.X);
        dl3VarV0.s0 = Modifier.isNative(cb6Var.a.getModifiers());
        dl3VarV0.W0(false, fj2VarU.b);
        if (list.isEmpty()) {
            return dl3VarV0;
        }
        u52.k("Should not be called");
        return null;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }

    public void j(v15 v15Var, ArrayList arrayList) {
    }

    public void m(LinkedHashSet linkedHashSet, v15 v15Var) {
    }

    public void n(v15 v15Var, ArrayList arrayList) {
    }
}
