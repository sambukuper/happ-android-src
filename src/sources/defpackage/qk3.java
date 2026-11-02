package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qk3 extends mk3 implements bo2, vo2, nb6 {
    public final g44 g0;
    public final g44 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk3(ov3 ov3Var, Member member, Object obj, yu3 yu3Var) {
        super(ov3Var, member, obj, yu3Var);
        ov3Var.getClass();
        yu3Var.getClass();
        c3 c3Var = new c3((Object) this, (Object) ov3Var, (byte) 17);
        w74 w74Var = w74.X;
        this.g0 = x97.P(w74Var, c3Var);
        this.h0 = x97.P(w74Var, new f3(this, (byte) 28));
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return S(obj);
    }

    @Override // defpackage.tn2
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        return S(obj, obj2, obj3, obj4);
    }

    @Override // defpackage.xn2
    public final Object G(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, lp2 lp2Var, Integer num) {
        return S(hx4.X, obj, bool, obj2, obj3, obj4, lp2Var, num);
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return S(obj, obj2);
    }

    @Override // defpackage.un2
    public final Object N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return S(obj, obj2, obj3, obj4, obj5);
    }

    public abstract Type[] T();

    public abstract TypeVariable[] U();

    public abstract Class[] V();

    public abstract boolean W();

    public final boolean equals(Object obj) {
        nb6 nb6VarB = ms8.b(obj);
        return nb6VarB != null && dh3.f(this.Y, nb6VarB.D()) && dh3.f(getName(), nb6VarB.getName()) && dh3.f(a(), nb6VarB.a()) && dh3.f(this.f0, nb6VarB.J());
    }

    @Override // defpackage.xu3
    public final List g() {
        return (List) this.g0.getValue();
    }

    @Override // defpackage.xu3, defpackage.sw3
    public final List getTypeParameters() {
        return (List) this.h0.getValue();
    }

    public final int hashCode() {
        return a().hashCode() + ((getName().hashCode() + (this.Y.hashCode() * 31)) * 31);
    }

    @Override // defpackage.pv3
    public final boolean i() {
        return false;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        return S(new Object[0]);
    }

    @Override // defpackage.pv3
    public final boolean k() {
        return Modifier.isNative(this.Z.getModifiers());
    }

    @Override // defpackage.pv3
    public final boolean s() {
        return false;
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
        return zc1.G(this.Y, a());
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        return S(obj, obj2, obj3);
    }
}
