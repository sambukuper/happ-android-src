package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class cl3 extends mk3 implements jw3, pb6 {
    public final g44 g0;
    public final g44 h0;
    public final g44 i0;
    public final g44 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl3(ov3 ov3Var, Field field, Object obj, yu3 yu3Var) {
        super(ov3Var, field, obj, yu3Var);
        ov3Var.getClass();
        yu3Var.getClass();
        xk3 xk3Var = new xk3(this, (byte) 0);
        w74 w74Var = w74.X;
        this.g0 = x97.P(w74Var, xk3Var);
        this.h0 = x97.P(w74Var, new xk3(this, (byte) 1));
        this.i0 = x97.P(w74Var, new xk3(this, (byte) 2));
        this.j0 = x97.P(w74Var, new xk3(this, (byte) 3));
    }

    @Override // defpackage.kb6
    public kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        return new cl3(ov3Var, U(), this.f0, yu3Var);
    }

    @Override // defpackage.jw3, defpackage.nw3
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final bl3 b() {
        return (bl3) this.j0.getValue();
    }

    public final Field U() {
        Member member = this.Z;
        member.getClass();
        return (Field) member;
    }

    @Override // defpackage.pb6
    public final String a() {
        return km4.L(U());
    }

    public final boolean equals(Object obj) {
        pb6 pb6VarC = ms8.c(obj);
        return pb6VarC != null && dh3.f(this.Y, pb6VarC.D()) && getName().equals(pb6VarC.getName()) && a().equals(pb6VarC.a()) && dh3.f(this.f0, pb6VarC.J());
    }

    @Override // defpackage.xu3
    public final List g() {
        return (List) this.h0.getValue();
    }

    @Override // defpackage.jw3
    public final Object get() {
        return b().S(new Object[0]);
    }

    @Override // defpackage.xu3
    public final String getName() {
        String name = U().getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.xu3, defpackage.sw3
    public final List getTypeParameters() {
        return d02.X;
    }

    public final int hashCode() {
        return a().hashCode() + ((getName().hashCode() + (this.Y.hashCode() * 31)) * 31);
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return (pw3) this.i0.getValue();
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        return (List) this.g0.getValue();
    }

    @Override // defpackage.mk3, defpackage.kb6
    public final ex4 m() {
        return ex4.FINAL;
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return b().r();
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        lh4.L0(sb, this);
        sb.append(this instanceof zv3 ? "var " : "val ");
        lh4.N0(sb, this);
        lh4.M0(sb, getName());
        sb.append(": ");
        sb.append(lh4.W0(j(), false));
        return sb.toString();
    }

    @Override // defpackage.h04
    public final GenericDeclaration v() {
        return zc1.G(this.Y, a());
    }

    @Override // defpackage.pb6
    public final Field w() {
        return U();
    }

    @Override // defpackage.kb6
    public final wd0 y() {
        b().getClass();
        return null;
    }
}
