package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rj3 extends lb6 implements bo2, vo2, nb6 {
    public final ev3 Y;
    public final List Z;
    public final g44 f0;
    public final g44 g0;
    public final g44 h0;
    public final g44 i0;
    public final g44 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj3(ev3 ev3Var) {
        super(yu3.k);
        ev3Var.getClass();
        this.Y = ev3Var;
        Method[] declaredMethods = zc1.M(ev3Var).getDeclaredMethods();
        declaredMethods.getClass();
        this.Z = eu.H0(declaredMethods, new l71((byte) 22));
        qj3 qj3Var = new qj3(this, (byte) 0);
        w74 w74Var = w74.X;
        this.f0 = x97.P(w74Var, qj3Var);
        this.g0 = x97.P(w74Var, new qj3(this, (byte) 1));
        this.h0 = x97.P(w74Var, new qj3(this, (byte) 2));
        this.i0 = x97.P(w74Var, new qj3(this, (byte) 3));
        this.j0 = x97.P(w74Var, new qj3(this, (byte) 4));
    }

    @Override // defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        if (yu3Var.equals(yu3.k)) {
            return new rj3(this.Y);
        }
        xw3.z(this, "Constructors cannot have fake overrides: ");
        return null;
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
        return null;
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
        return d02.X;
    }

    @Override // defpackage.kb6
    public final boolean R() {
        int modifiers = zc1.M(this.Y).getModifiers();
        fk2 fk2Var = ms8.a;
        return (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || Modifier.isPrivate(modifiers)) ? false : true;
    }

    @Override // defpackage.nb6
    public final String a() {
        return (String) this.f0.getValue();
    }

    @Override // defpackage.xu3
    public final zw3 e() {
        int modifiers = zc1.M(this.Y).getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return zw3.X;
        }
        if (Modifier.isPrivate(modifiers)) {
            return zw3.f0;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        nb6 nb6VarB = ms8.b(obj);
        return nb6VarB != null && dh3.f(this.Y, nb6VarB.D()) && "<init>".equals(nb6VarB.getName()) && dh3.f(a(), nb6VarB.a()) && dh3.f(null, nb6VarB.J());
    }

    @Override // defpackage.xu3
    public final List g() {
        return (List) this.h0.getValue();
    }

    @Override // defpackage.xu3
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.xu3, defpackage.sw3
    public final List getTypeParameters() {
        return d02.X;
    }

    @Override // defpackage.xu3, defpackage.pv3
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return a().hashCode() + (((this.Y.hashCode() * 31) + 1818100338) * 31);
    }

    @Override // defpackage.pv3
    public final boolean i() {
        return false;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        return S(new Object[0]);
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return (pw3) this.g0.getValue();
    }

    @Override // defpackage.pv3
    public final boolean k() {
        return false;
    }

    @Override // defpackage.kb6
    public final ex4 m() {
        return ex4.FINAL;
    }

    @Override // defpackage.pv3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return (wd0) this.i0.getValue();
    }

    @Override // defpackage.pv3
    public final boolean s() {
        return false;
    }

    @Override // defpackage.bo2
    public final int t() {
        return this.Z.size();
    }

    public final String toString() {
        return lh4.U0(this);
    }

    @Override // defpackage.h04
    public final GenericDeclaration v() {
        return zc1.G(this.Y, a());
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
