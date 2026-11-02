package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ev3 extends ov3 implements h04, zu3, sw3, mh8 {
    public static final HashSet f0;
    public final Class Y;
    public final g44 Z = x97.P(w74.X, new av3(this, 0));

    static {
        LinkedHashSet linkedHashSet = gf7.a;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((qs0) it.next()).a().a.toString());
        }
        f0 = hashSet;
    }

    public ev3(Class cls) {
        this.Y = cls;
    }

    public static ms0 e0(qs0 qs0Var, gr6 gr6Var) {
        hl1 hl1Var = gr6Var.a;
        h02 h02Var = new h02(hl1Var.b, qs0Var.a, (byte) 0);
        v15 v15VarF = qs0Var.f();
        List listK = i21.K(hl1Var.b.f().k("Any").X());
        ve4 ve4Var = hl1Var.a;
        ms0 ms0Var = new ms0(h02Var, v15VarF, fx4.Y, us0.X, listK, ve4Var);
        ms0Var.B0(new fo2(ve4Var, ms0Var, (byte) 1), m02.X, null);
        return ms0Var;
    }

    @Override // defpackage.zu3
    public final boolean C() {
        yy3 yy3VarI0 = i0();
        return yy3VarI0 != null && ow.f.x(ow.a[14], yy3VarI0);
    }

    @Override // defpackage.zu3
    public final String E() {
        tb6 tb6Var = ((cv3) this.Z.getValue()).f;
        nw3 nw3Var = cv3.r[2];
        return (String) tb6Var.invoke();
    }

    @Override // defpackage.zu3
    public final boolean I() {
        return j0() == ex4.SEALED;
    }

    @Override // defpackage.zu3
    public final boolean O(Object obj) {
        Map map = ia6.d;
        Class cls = this.Y;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return ci8.B(num.intValue(), obj);
        }
        Class clsE = ia6.e(cls);
        if (clsE != null) {
            cls = clsE;
        }
        return cls.isInstance(obj);
    }

    @Override // defpackage.zu3
    public final Collection P() {
        tb6 tb6Var = ((cv3) this.Z.getValue()).o;
        nw3 nw3Var = cv3.r[11];
        Object objInvoke = tb6Var.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    @Override // defpackage.wu3
    public final List Q() {
        tb6 tb6Var = ((cv3) this.Z.getValue()).e;
        nw3 nw3Var = cv3.r[1];
        Object objInvoke = tb6Var.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.ov3
    public final Collection V() {
        Collection collectionB = h0().B();
        collectionB.getClass();
        return collectionB;
    }

    @Override // defpackage.ov3
    public final Collection W() {
        yy3 yy3VarI0 = i0();
        ArrayList arrayList = yy3VarI0 != null ? yy3VarI0.h : null;
        return arrayList == null ? d02.X : arrayList;
    }

    @Override // defpackage.ov3
    public final Collection X(v15 v15Var) {
        et4 et4VarK = h0().X().K();
        x45 x45Var = x45.Y;
        Collection collectionB = et4VarK.b(v15Var, x45Var);
        et4 et4VarO0 = h0().o0();
        et4VarO0.getClass();
        return wv0.H0(collectionB, et4VarO0.b(v15Var, x45Var));
    }

    @Override // defpackage.ov3
    public final fx5 Y(int i) {
        sx4 sx4VarH0 = h0();
        vl1 vl1Var = sx4VarH0 instanceof vl1 ? (vl1) sx4VarH0 : null;
        if (vl1Var != null) {
            fy5 fy5Var = vl1Var.g0;
            aq2 aq2Var = lu3.h;
            aq2Var.getClass();
            cz5 cz5Var = (cz5) ch3.z(fy5Var, aq2Var, i);
            if (cz5Var != null) {
                qd4 qd4Var = new qd4(this);
                jl1 jl1Var = vl1Var.n0;
                return (fx5) ms8.g(this.Y, qd4Var, cz5Var, (w15) jl1Var.Y, (ux4) jl1Var.f0, vl1Var.h0, g0.l0);
            }
        }
        return null;
    }

    @Override // defpackage.ov3
    public final kz3 Z(int i) {
        yy3 yy3VarI0 = i0();
        if (yy3VarI0 != null) {
            return (kz3) wv0.u0(i, ch3.C(yy3VarI0).a);
        }
        return null;
    }

    @Override // defpackage.ov3
    public final Collection b0(v15 v15Var) {
        et4 et4VarK = h0().X().K();
        x45 x45Var = x45.Y;
        Collection collectionF = et4VarK.f(v15Var, x45Var);
        et4 et4VarO0 = h0().o0();
        et4VarO0.getClass();
        return wv0.H0(collectionF, et4VarO0.f(v15Var, x45Var));
    }

    @Override // defpackage.zu3
    public final List c() {
        tb6 tb6Var = ((cv3) this.Z.getValue()).k;
        nw3 nw3Var = cv3.r[8];
        Object objInvoke = tb6Var.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ev3) && zc1.N(this).equals(zc1.N((zu3) obj));
    }

    public final qs0 f0() {
        du5 du5VarC;
        qs0 qs0Var = ir6.a;
        Class cls = this.Y;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            du5VarC = componentType.isPrimitive() ? ut3.b(componentType.getSimpleName()).c() : null;
            if (du5VarC != null) {
                return new qs0(ug7.k, du5VarC.Y);
            }
            fk2 fk2VarI = tg7.g.i();
            return new qs0(fk2VarI.b(), fk2VarI.a.g());
        }
        if (cls.equals(Void.TYPE)) {
            return ir6.a;
        }
        du5VarC = cls.isPrimitive() ? ut3.b(cls.getSimpleName()).c() : null;
        if (du5VarC != null) {
            return new qs0(ug7.k, du5VarC.X);
        }
        qs0 qs0VarA = ia6.a(cls);
        if (!qs0VarA.c) {
            String str = ll3.a;
            qs0 qs0VarG = ll3.g(qs0VarA.a());
            if (qs0VarG != null) {
                return qs0VarG;
            }
        }
        return qs0VarA;
    }

    public final ts0 g0() {
        ts0 ts0VarA;
        yy3 yy3VarI0 = i0();
        if (yy3VarI0 != null && (ts0VarA = ow.a(yy3VarI0)) != null) {
            return ts0VarA;
        }
        Class cls = this.Y;
        if (cls.isAnnotation()) {
            return ts0.ANNOTATION_CLASS;
        }
        if (cls.isInterface()) {
            return ts0.INTERFACE;
        }
        if (cls.isEnum()) {
            return ts0.ENUM_CLASS;
        }
        return cls.getSuperclass().isEnum() ? ts0.ENUM_ENTRY : ts0.CLASS;
    }

    @Override // defpackage.zu3
    public final List getTypeParameters() {
        tb6 tb6Var = ((cv3) this.Z.getValue()).i;
        nw3 nw3Var = cv3.r[6];
        Object objInvoke = tb6Var.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    public final sx4 h0() {
        return ((cv3) this.Z.getValue()).b();
    }

    @Override // defpackage.zu3
    public final int hashCode() {
        return zc1.N(this).hashCode();
    }

    public final yy3 i0() {
        return ((cv3) this.Z.getValue()).c();
    }

    public final ex4 j0() {
        ex4 ex4Var;
        yy3 yy3VarI0 = i0();
        if (yy3VarI0 != null && (ex4Var = (ex4) ow.b.J(ow.a[7], yy3VarI0)) != null) {
            return ex4Var;
        }
        Class cls = this.Y;
        if (cls.isAnnotation() || cls.isEnum()) {
            return ex4.FINAL;
        }
        if (dh3.f(z68.r0(cls), Boolean.TRUE)) {
            return ex4.SEALED;
        }
        if (Modifier.isAbstract(cls.getModifiers())) {
            return ex4.ABSTRACT;
        }
        return !Modifier.isFinal(cls.getModifiers()) ? ex4.OPEN : ex4.FINAL;
    }

    public final boolean k0() {
        return ((Boolean) ((cv3) this.Z.getValue()).m.getValue()).booleanValue();
    }

    @Override // defpackage.zu3
    public final boolean n() {
        yy3 yy3VarI0 = i0();
        if (yy3VarI0 != null) {
            return ow.e.x(ow.a[10], yy3VarI0);
        }
        Class cls = this.Y;
        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
    }

    @Override // defpackage.zu3
    public final String p() {
        tb6 tb6Var = ((cv3) this.Z.getValue()).g;
        nw3 nw3Var = cv3.r[3];
        return (String) tb6Var.invoke();
    }

    @Override // defpackage.fs0
    public final Class t() {
        return this.Y;
    }

    public final String toString() {
        qs0 qs0VarF0 = f0();
        fk2 fk2Var = qs0VarF0.a;
        return "class ".concat((fk2Var.a.c() ? _UrlKt.FRAGMENT_ENCODE_SET : oi0.o(new StringBuilder(), fk2Var.a.a, '.')).concat(mm7.X(qs0VarF0.b.a.a, '.', '$')));
    }

    @Override // defpackage.zu3
    public final Collection u() {
        tb6 tb6Var = ((cv3) this.Z.getValue()).h;
        nw3 nw3Var = cv3.r[4];
        Object objInvoke = tb6Var.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    @Override // defpackage.h04
    public final GenericDeclaration v() {
        return this.Y;
    }
}
