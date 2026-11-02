package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l14 extends m04 implements pb6 {
    public final ov3 Y;
    public final String Z;
    public final Object f0;
    public final kz3 g0;
    public final g44 h0;
    public final g44 i0;
    public final g44 j0;
    public final g44 k0;
    public final g44 l0;
    public final g44 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l14(ov3 ov3Var, String str, Object obj, kz3 kz3Var, yu3 yu3Var) {
        super(yu3Var);
        ov3Var.getClass();
        str.getClass();
        kz3Var.getClass();
        yu3Var.getClass();
        this.Y = ov3Var;
        this.Z = str;
        this.f0 = obj;
        this.g0 = kz3Var;
        a14 a14Var = new a14(this, (byte) 0);
        w74 w74Var = w74.X;
        this.h0 = x97.P(w74Var, a14Var);
        this.i0 = x97.P(w74Var, new a14(this, (byte) 1));
        this.j0 = x97.P(w74Var, new a14(this, (byte) 2));
        this.k0 = x97.P(w74Var, new a14(this, (byte) 3));
        this.l0 = x97.P(w74Var, new a14(this, (byte) 4));
        this.m0 = x97.P(w74Var, new a14(this, (byte) 5));
    }

    @Override // defpackage.kb6
    public final ov3 D() {
        return this.Y;
    }

    @Override // defpackage.kb6
    public final Object J() {
        return this.f0;
    }

    @Override // defpackage.wu3
    public final List Q() {
        Annotation[] annotations;
        boolean zC = z51.C(this);
        kz3 kz3Var = this.g0;
        ov3 ov3Var = this.Y;
        if (zC || ov3Var.t().isAnnotation()) {
            ArrayList arrayList = kz3Var.m;
            ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ys0.W((dy3) it.next(), ia6.d(ov3Var.t())));
            }
            return arrayList2;
        }
        if (!(ov3Var instanceof ew3)) {
            StringBuilder sb = new StringBuilder("Annotations are only supported for top-level properties for now: ");
            sb.append(ov3Var);
            xw3.p(sb, kz3Var.b, this.Z);
            return null;
        }
        kz3Var.getClass();
        pt3 pt3Var = ch3.F(kz3Var).e;
        if (pt3Var == null) {
            return d02.X;
        }
        Method methodT = ov3Var.T(pt3Var.d, pt3Var.e);
        if (methodT != null && (annotations = methodT.getAnnotations()) != null) {
            return ms8.t(eu.K0(annotations));
        }
        xw3.j(this, "No synthetic method found: ");
        return null;
    }

    public final Member T() {
        nw3[] nw3VarArr = ow.a;
        kz3 kz3Var = this.g0;
        kz3Var.getClass();
        if (!ow.s.x(ow.a[42], kz3Var)) {
            return null;
        }
        pt3 pt3Var = ch3.F(kz3Var).f;
        if (pt3Var == null) {
            return w();
        }
        return this.Y.T(pt3Var.d, pt3Var.e);
    }

    public abstract c14 U();

    @Override // defpackage.pb6
    public final String a() {
        return this.Z;
    }

    @Override // defpackage.xu3
    public final zw3 e() {
        return ys0.c0(ow.b(this.g0));
    }

    public final boolean equals(Object obj) {
        pb6 pb6VarC = ms8.c(obj);
        return pb6VarC != null && dh3.f(this.Y, pb6VarC.D()) && dh3.f(this.g0.b, pb6VarC.getName()) && dh3.f(this.Z, pb6VarC.a()) && dh3.f(this.f0, pb6VarC.J());
    }

    @Override // defpackage.xu3
    public final List g() {
        return (List) this.j0.getValue();
    }

    @Override // defpackage.xu3
    public final String getName() {
        return this.g0.b;
    }

    @Override // defpackage.xu3, defpackage.sw3
    public final List getTypeParameters() {
        return ((li8) this.l0.getValue()).a;
    }

    @Override // defpackage.xu3, defpackage.pv3
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.Z.hashCode() + pc6.e(this.Y.hashCode() * 31, 31, this.g0.b);
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return (pw3) this.k0.getValue();
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        return (List) this.i0.getValue();
    }

    @Override // defpackage.kb6
    public final ex4 m() {
        nw3[] nw3VarArr = ow.a;
        kz3 kz3Var = this.g0;
        kz3Var.getClass();
        return (ex4) ow.q.J(ow.a[35], kz3Var);
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return U().r();
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        lh4.L0(sb, this);
        sb.append(this instanceof zv3 ? "var " : "val ");
        lh4.N0(sb, this);
        lh4.M0(sb, this.g0.b);
        sb.append(": ");
        sb.append(lh4.W0(j(), false));
        return sb.toString();
    }

    @Override // defpackage.h04
    public final GenericDeclaration v() {
        return zc1.G(this.Y, this.Z);
    }

    @Override // defpackage.pb6
    public final Field w() {
        return (Field) this.m0.getValue();
    }

    @Override // defpackage.kb6
    public final wd0 y() {
        U().getClass();
        return null;
    }
}
