package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p04 extends m04 implements bo2, vo2, nb6 {
    public final ov3 Y;
    public final String Z;
    public final Object f0;
    public final g44 g0;
    public final g44 h0;
    public final g44 i0;
    public final g44 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p04(ov3 ov3Var, String str, Object obj, yu3 yu3Var) {
        super(yu3Var);
        ov3Var.getClass();
        str.getClass();
        yu3Var.getClass();
        this.Y = ov3Var;
        this.Z = str;
        this.f0 = obj;
        o04 o04Var = new o04(this, (byte) 0);
        w74 w74Var = w74.X;
        this.g0 = x97.P(w74Var, o04Var);
        this.h0 = x97.P(w74Var, new o04(this, (byte) 1));
        this.i0 = x97.P(w74Var, new o04(this, (byte) 2));
        this.j0 = x97.P(w74Var, new o04(this, (byte) 3));
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return S(obj);
    }

    @Override // defpackage.kb6
    public final ov3 D() {
        return this.Y;
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
        return this.f0;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return S(obj, obj2);
    }

    @Override // defpackage.un2
    public final Object N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return S(obj, obj2, obj3, obj4, obj5);
    }

    @Override // defpackage.wu3
    public final List Q() {
        Member memberB = r().b();
        AnnotatedElement annotatedElement = memberB instanceof AnnotatedElement ? (AnnotatedElement) memberB : null;
        if (annotatedElement == null) {
            return d02.X;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return ms8.t(eu.K0(annotations));
    }

    public final ne0 T(Constructor constructor, boolean z) {
        List listG;
        if (!z && (this instanceof n04)) {
            n04 n04Var = (n04) this;
            if (n04Var.e() != zw3.f0) {
                fs0 fs0Var = n04Var.Y;
                fs0Var.getClass();
                if (!((zu3) fs0Var).I() && ((listG = n04Var.g()) == null || !listG.isEmpty())) {
                    Iterator it = listG.iterator();
                    while (it.hasNext()) {
                        zu3 zu3VarV = ci8.v(((ob6) it.next()).B());
                        if (zu3VarV.C() && !zu3VarV.equals(yb6.a.b(sj6.class))) {
                            return mb6.K(this) ? new xd0(constructor, mb6.C(this), zc1.U(constructor)) : new yd0(constructor, zc1.U(constructor));
                        }
                    }
                }
            }
        }
        return mb6.K(this) ? new zd0(constructor, mb6.C(this)) : new ae0(constructor);
    }

    public final ee0 U(Method method, boolean z) {
        if (!mb6.K(this)) {
            return new me0(method, false, 6, (byte) 2);
        }
        ov3 ov3Var = this.Y;
        if (ov3Var instanceof ew3) {
            return new le0(method, z, mb6.C(this));
        }
        StringBuilder sb = new StringBuilder("Only top-level functions are supported for now: ");
        sb.append(ov3Var);
        xw3.p(sb, getName(), this.Z);
        return null;
    }

    public List V() {
        return d02.X;
    }

    public mz3 W() {
        return null;
    }

    public abstract pt3 X();

    public li8 Y() {
        ov3 ov3Var = this.Y;
        ov3Var.getClass();
        return ((cv3) ((ev3) ov3Var).Z.getValue()).d();
    }

    public abstract List Z();

    @Override // defpackage.nb6
    public final String a() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        nb6 nb6VarB = ms8.b(obj);
        return nb6VarB != null && dh3.f(this.Y, nb6VarB.D()) && dh3.f(getName(), nb6VarB.getName()) && dh3.f(this.Z, nb6VarB.a()) && dh3.f(this.f0, nb6VarB.J());
    }

    @Override // defpackage.xu3
    public final List g() {
        return (List) this.h0.getValue();
    }

    @Override // defpackage.xu3, defpackage.sw3
    public final List getTypeParameters() {
        return Y().a;
    }

    public final int hashCode() {
        return this.Z.hashCode() + ((getName().hashCode() + (this.Y.hashCode() * 31)) * 31);
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        return S(new Object[0]);
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        return (List) this.g0.getValue();
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return (wd0) this.i0.getValue();
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
        return zc1.G(this.Y, this.Z);
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        return S(obj, obj2, obj3);
    }

    @Override // defpackage.kb6
    public final wd0 y() {
        return (wd0) this.j0.getValue();
    }
}
