package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pk3 extends qk3 {
    public final g44 i0;
    public final g44 j0;
    public final g44 k0;
    public final g44 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk3(ov3 ov3Var, Constructor constructor, Object obj) {
        super(ov3Var, constructor, obj, yu3.k);
        ov3Var.getClass();
        byte b = 0;
        nk3 nk3Var = new nk3(this, b);
        w74 w74Var = w74.X;
        this.i0 = x97.P(w74Var, nk3Var);
        this.j0 = x97.P(w74Var, new ok3(ov3Var, b));
        this.k0 = x97.P(w74Var, new nk3(this, (byte) 1));
        this.l0 = x97.P(w74Var, new nk3(this, (byte) 2));
    }

    @Override // defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        if (yu3Var.equals(yu3.k)) {
            return new pk3(ov3Var, X(), nd0.NO_RECEIVER);
        }
        xw3.z(this, "Constructors cannot have fake overrides: ");
        return null;
    }

    @Override // defpackage.qk3
    public final Type[] T() {
        Type[] genericParameterTypes = X().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }

    @Override // defpackage.qk3
    public final TypeVariable[] U() {
        return (TypeVariable[]) this.i0.getValue();
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

    public final Constructor X() {
        Member member = this.Z;
        member.getClass();
        return (Constructor) member;
    }

    @Override // defpackage.nb6
    public final String a() {
        return km4.K(X());
    }

    @Override // defpackage.xu3
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return (pw3) this.j0.getValue();
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        return (List) this.k0.getValue();
    }

    @Override // defpackage.mk3, defpackage.kb6
    public final ex4 m() {
        return ex4.FINAL;
    }

    @Override // defpackage.pv3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return (wd0) this.l0.getValue();
    }

    @Override // defpackage.kb6
    public final wd0 y() {
        return null;
    }
}
