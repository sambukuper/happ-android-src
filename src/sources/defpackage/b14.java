package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b14 extends m04 implements pv3, gw3 {
    /* JADX WARN: Illegal instructions before constructor call */
    public b14() {
        yu3 yu3Var = yu3.k;
        yu3Var.getClass();
        super(yu3Var);
    }

    @Override // defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // defpackage.kb6
    public final ov3 D() {
        return U().Y;
    }

    @Override // defpackage.kb6
    public final Object J() {
        return U().f0;
    }

    @Override // defpackage.wu3
    public final List Q() {
        Annotation[] annotations;
        boolean zC = z51.C(U());
        List list = d02.X;
        if (zC) {
            return list;
        }
        Member memberB = r().b();
        List listK0 = null;
        Method method = memberB instanceof Method ? (Method) memberB : null;
        if (method != null && (annotations = method.getAnnotations()) != null) {
            listK0 = eu.K0(annotations);
        }
        if (listK0 != null) {
            list = listK0;
        }
        return ms8.t(list);
    }

    public lz3 T() {
        return U().g0.d;
    }

    public abstract l14 U();

    @Override // defpackage.xu3
    public final zw3 e() {
        gz8 gz8Var;
        zw3 zw3VarC0;
        lz3 lz3VarT = T();
        return (lz3VarT == null || (gz8Var = (gz8) ow.u.J(ow.a[46], lz3VarT)) == null || (zw3VarC0 = ys0.c0(gz8Var)) == null) ? U().e() : zw3VarC0;
    }

    @Override // defpackage.xu3, defpackage.sw3
    public final List getTypeParameters() {
        return U().getTypeParameters();
    }

    @Override // defpackage.xu3, defpackage.pv3
    public final boolean h() {
        return false;
    }

    @Override // defpackage.pv3
    public final boolean i() {
        lz3 lz3VarT = T();
        return lz3VarT != null && ow.x.x(ow.a[50], lz3VarT);
    }

    @Override // defpackage.pv3
    public final boolean k() {
        lz3 lz3VarT = T();
        return lz3VarT != null && ow.w.x(ow.a[49], lz3VarT);
    }

    @Override // defpackage.kb6
    public final ex4 m() {
        ex4 ex4Var;
        lz3 lz3VarT = T();
        return (lz3VarT == null || (ex4Var = (ex4) ow.v.J(ow.a[47], lz3VarT)) == null) ? U().m() : ex4Var;
    }

    @Override // defpackage.pv3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.pv3
    public final boolean s() {
        return false;
    }

    @Override // defpackage.kb6
    public final wd0 y() {
        return null;
    }
}
