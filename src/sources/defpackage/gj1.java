package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gj1 extends ej1 implements bo2, vo2, nb6 {
    public static final /* synthetic */ nw3[] o0 = {new lx5(gj1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};
    public final ov3 i0;
    public final String j0;
    public final Object k0;
    public final tb6 l0;
    public final g44 m0;
    public final g44 n0;

    public gj1(ov3 ov3Var, String str, String str2, ho2 ho2Var, Object obj, yu3 yu3Var) {
        super(yu3Var);
        this.i0 = ov3Var;
        this.j0 = str2;
        this.k0 = obj;
        this.l0 = zc1.X(ho2Var, new c3((Object) this, (Object) str, (byte) 9));
        fj1 fj1Var = new fj1(this, (byte) 0);
        w74 w74Var = w74.X;
        this.m0 = x97.P(w74Var, fj1Var);
        this.n0 = x97.P(w74Var, new fj1(this, (byte) 1));
    }

    @Override // defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        return new gj1(ov3Var, V(), yu3Var);
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return S(obj);
    }

    @Override // defpackage.kb6
    public final ov3 D() {
        return this.i0;
    }

    @Override // defpackage.tn2
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        return S(obj, obj2, obj3, obj4);
    }

    @Override // defpackage.xn2
    public final Object G(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, lp2 lp2Var, Integer num) {
        return S(hx4.X, obj, bool, obj2, obj3, obj4, lp2Var, num);
    }

    @Override // defpackage.kb6
    public final Object J() {
        return this.k0;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return S(obj, obj2);
    }

    @Override // defpackage.un2
    public final Object N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return S(obj, obj2, obj3, obj4, obj5);
    }

    @Override // defpackage.ej1
    public final kk1 U() {
        t14 t14VarJ = V().j();
        t14VarJ.getClass();
        return new kk1(t14VarJ, new fj1(this, (byte) 2), false);
    }

    public final ne0 W(Constructor constructor, ho2 ho2Var, boolean z) {
        if (!z) {
            gs0 gs0Var = ho2Var instanceof gs0 ? (gs0) ho2Var : null;
            if (gs0Var != null && !gl1.e(gs0Var.e())) {
                sx4 sx4VarR0 = gs0Var.R0();
                sx4VarR0.getClass();
                if (!bd3.a(sx4VarR0) && !bl1.o(gs0Var.R0())) {
                    List listL = gs0Var.L();
                    listL.getClass();
                    if (!listL.isEmpty()) {
                        Iterator it = listL.iterator();
                        while (it.hasNext()) {
                            t14 t14VarC = ((ot8) it.next()).c();
                            t14VarC.getClass();
                            if (ch3.O(t14VarC)) {
                                return mb6.K(this) ? new xd0(constructor, mb6.C(this), zc1.U(constructor)) : new yd0(constructor, zc1.U(constructor));
                            }
                        }
                    }
                }
            }
        }
        return mb6.K(this) ? new zd0(constructor, mb6.C(this)) : new ae0(constructor);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    public final ee0 X(Method method, boolean z) {
        Object objC;
        if (!mb6.K(this)) {
            return new me0(method, false, 6, (byte) 2);
        }
        i44 i44VarP = V().P();
        if (i44VarP != null) {
            t14 t14VarC = i44VarP.c();
            int i = bd3.a;
            ot0 ot0VarX = t14VarC.n0().x();
            if (ot0VarX != null ? bd3.a(ot0VarX) : false) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                Class<?> cls = parameterTypes.length == 0 ? null : parameterTypes[0];
                if (cls == null || !cls.isInterface()) {
                    objC = mb6.C(this);
                } else {
                    objC = this.k0;
                }
            } else {
                objC = mb6.C(this);
            }
        } else {
            objC = mb6.C(this);
        }
        return new le0(method, z, objC);
    }

    @Override // defpackage.ej1
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final ho2 V() {
        nw3 nw3Var = o0[0];
        Object objInvoke = this.l0.invoke();
        objInvoke.getClass();
        return (ho2) objInvoke;
    }

    @Override // defpackage.nb6
    public final String a() {
        return this.j0;
    }

    public final boolean equals(Object obj) {
        nb6 nb6VarB = ms8.b(obj);
        return nb6VarB != null && dh3.f(this.i0, nb6VarB.D()) && getName().equals(nb6VarB.getName()) && dh3.f(this.j0, nb6VarB.a()) && dh3.f(this.k0, nb6VarB.J());
    }

    @Override // defpackage.xu3
    public final String getName() {
        String strB = ((fd1) V()).getName().b();
        strB.getClass();
        return strB;
    }

    @Override // defpackage.xu3, defpackage.pv3
    public final boolean h() {
        return V().h();
    }

    public final int hashCode() {
        return this.j0.hashCode() + ((getName().hashCode() + (this.i0.hashCode() * 31)) * 31);
    }

    @Override // defpackage.pv3
    public final boolean i() {
        return this.X.j || V().i();
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        return S(new Object[0]);
    }

    @Override // defpackage.pv3
    public final boolean k() {
        return this.X.g || V().k();
    }

    @Override // defpackage.pv3
    public final boolean o() {
        return this.X.h || V().o();
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return (wd0) this.m0.getValue();
    }

    @Override // defpackage.pv3
    public final boolean s() {
        return this.X.i || V().s();
    }

    @Override // defpackage.bo2
    public final int t() {
        wd0 wd0VarR = r();
        wd0VarR.getClass();
        return wd0VarR.a().size();
    }

    public final String toString() {
        return lh4.U0(this);
    }

    @Override // defpackage.h04
    public final GenericDeclaration v() {
        return zc1.G(this.i0, this.j0);
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        return S(obj, obj2, obj3);
    }

    @Override // defpackage.kb6
    public final wd0 y() {
        return (wd0) this.n0.getValue();
    }

    public /* synthetic */ gj1(ov3 ov3Var, ho2 ho2Var) {
        this(ov3Var, ho2Var, yu3.k);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public gj1(ov3 ov3Var, ho2 ho2Var, yu3 yu3Var) {
        ov3Var.getClass();
        ho2Var.getClass();
        yu3Var.getClass();
        String strB = ((fd1) ho2Var).getName().b();
        strB.getClass();
        this(ov3Var, strB, ir6.c(ho2Var).g(), ho2Var, nd0.NO_RECEIVER, yu3Var);
    }
}
