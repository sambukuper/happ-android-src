package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vk3 extends qk3 {
    public final g44 i0;
    public final g44 j0;
    public final g44 k0;
    public final g44 l0;
    public final g44 m0;
    public final g44 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk3(ov3 ov3Var, Method method, Object obj, yu3 yu3Var) {
        super(ov3Var, method, obj, yu3Var);
        ov3Var.getClass();
        yu3Var.getClass();
        tk3 tk3Var = new tk3(this, (byte) 0);
        w74 w74Var = w74.X;
        this.i0 = x97.P(w74Var, tk3Var);
        this.j0 = x97.P(w74Var, new c3((Object) yu3Var, (Object) this, (byte) 18));
        byte b = 1;
        this.k0 = x97.P(w74Var, new em1(this, ov3Var, yu3Var, b));
        this.l0 = x97.P(w74Var, new ub(0, X(), w51.class, "isJavaMethodAnOperator", "isJavaMethodAnOperator(Ljava/lang/reflect/Method;)Z", 1, (byte) 15));
        this.m0 = x97.P(w74Var, new tk3(this, b));
        x97.P(w74Var, new tk3(this, (byte) 2));
        this.n0 = x97.P(w74Var, new tk3(this, (byte) 3));
    }

    @Override // defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        return new vk3(ov3Var, X(), nd0.NO_RECEIVER, yu3Var);
    }

    @Override // defpackage.qk3
    public final Type[] T() {
        Type[] genericParameterTypes = X().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }

    @Override // defpackage.qk3
    public final TypeVariable[] U() {
        Object value = this.m0.getValue();
        value.getClass();
        return (TypeVariable[]) value;
    }

    @Override // defpackage.qk3
    public final Class[] V() {
        Class<?>[] parameterTypes = X().getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes;
    }

    @Override // defpackage.qk3
    public final boolean W() {
        return X().isVarArgs();
    }

    public final Method X() {
        Member member = this.Z;
        member.getClass();
        return (Method) member;
    }

    @Override // defpackage.nb6
    public final String a() {
        return km4.M(X());
    }

    @Override // defpackage.xu3
    public final String getName() {
        String name = this.Z.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        uk3 uk3Var = (uk3) this.k0.getValue();
        return uk3Var != null ? uk3Var.b : (u1) this.j0.getValue();
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        uk3 uk3Var = (uk3) this.k0.getValue();
        return uk3Var != null ? uk3Var.a : (List) this.i0.getValue();
    }

    @Override // defpackage.pv3
    public final boolean o() {
        return ((Boolean) this.l0.getValue()).booleanValue();
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return (wd0) this.n0.getValue();
    }

    @Override // defpackage.kb6
    public final wd0 y() {
        return null;
    }
}
