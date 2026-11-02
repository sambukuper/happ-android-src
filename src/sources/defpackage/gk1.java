package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gk1 extends ej1 implements pb6 {
    public final ov3 i0;
    public final String j0;
    public final String k0;
    public final Object l0;
    public final g44 m0;
    public final tb6 n0;
    public static final /* synthetic */ nw3[] p0 = {new lx5(gk1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};
    public static final be o0 = new be(21);
    public static final Object q0 = new Object();

    public gk1(ov3 ov3Var, String str, String str2, fx5 fx5Var, Object obj, yu3 yu3Var) {
        super(yu3Var);
        this.i0 = ov3Var;
        this.j0 = str;
        this.k0 = str2;
        this.l0 = obj;
        this.m0 = x97.P(w74.X, new rj1(this, (byte) 0));
        this.n0 = zc1.X(fx5Var, new rj1(this, (byte) 1));
    }

    @Override // defpackage.kb6
    public final ov3 D() {
        return this.i0;
    }

    @Override // defpackage.kb6
    public final Object J() {
        return this.l0;
    }

    @Override // defpackage.ej1
    public final kk1 U() {
        t14 t14VarJ = V().j();
        t14VarJ.getClass();
        return new kk1(t14VarJ, z51.C(this) ? null : new rj1(this, (byte) 2), false);
    }

    public final Member W() {
        if (!V().E()) {
            return null;
        }
        qs0 qs0Var = ir6.a;
        jm4 jm4VarB = ir6.b(V());
        if (jm4VarB instanceof yt3) {
            yt3 yt3Var = (yt3) jm4VarB;
            w15 w15Var = yt3Var.p0;
            fu3 fu3Var = yt3Var.o0;
            if ((fu3Var.Y & 16) == 16) {
                du3 du3Var = fu3Var.i0;
                int i = du3Var.Y;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                return this.i0.T(w15Var.getString(du3Var.Z), w15Var.getString(du3Var.f0));
            }
        }
        return w();
    }

    @Override // defpackage.ej1
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final fx5 V() {
        nw3 nw3Var = p0[0];
        Object objInvoke = this.n0.invoke();
        objInvoke.getClass();
        return (fx5) objInvoke;
    }

    public abstract uj1 Y();

    @Override // defpackage.pb6
    public final String a() {
        return this.k0;
    }

    public final boolean equals(Object obj) {
        pb6 pb6VarC = ms8.c(obj);
        return pb6VarC != null && dh3.f(this.i0, pb6VarC.D()) && dh3.f(this.j0, pb6VarC.getName()) && dh3.f(this.k0, pb6VarC.a()) && dh3.f(this.l0, pb6VarC.J());
    }

    @Override // defpackage.xu3
    public final String getName() {
        return this.j0;
    }

    @Override // defpackage.xu3, defpackage.pv3
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.k0.hashCode() + pc6.e(this.i0.hashCode() * 31, 31, this.j0);
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return Y().r();
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        lh4.L0(sb, this);
        sb.append(this instanceof zv3 ? "var " : "val ");
        lh4.N0(sb, this);
        lh4.M0(sb, this.j0);
        sb.append(": ");
        sb.append(lh4.W0(j(), false));
        return sb.toString();
    }

    @Override // defpackage.h04
    public final GenericDeclaration v() {
        return zc1.G(this.i0, this.k0);
    }

    @Override // defpackage.pb6
    public final Field w() {
        return (Field) this.m0.getValue();
    }

    @Override // defpackage.kb6
    public final wd0 y() {
        Y().getClass();
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gk1(ov3 ov3Var, String str, String str2, Object obj) {
        this(ov3Var, str, str2, null, obj, yu3.k);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gk1(ov3 ov3Var, fx5 fx5Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        String strB = fx5Var.getName().b();
        strB.getClass();
        this(ov3Var, strB, ir6.b(fx5Var).o(), fx5Var, nd0.NO_RECEIVER, yu3Var);
    }
}
