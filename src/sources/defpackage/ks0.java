package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ks0 extends m0 {
    public final ed1 g0;
    public final ke7 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(ve4 ve4Var, ed1 ed1Var, v15 v15Var, ke7 ke7Var) {
        super(ve4Var, v15Var);
        if (ve4Var == null) {
            z0(0);
            throw null;
        }
        if (ed1Var == null) {
            z0(1);
            throw null;
        }
        if (v15Var == null) {
            z0(2);
            throw null;
        }
        this.g0 = ed1Var;
        this.h0 = ke7Var;
    }

    public static /* synthetic */ void z0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.gd1
    public final ke7 getSource() {
        ke7 ke7Var = this.h0;
        if (ke7Var != null) {
            return ke7Var;
        }
        z0(5);
        throw null;
    }

    public boolean k() {
        return false;
    }

    @Override // defpackage.ed1
    public final ed1 p() {
        ed1 ed1Var = this.g0;
        if (ed1Var != null) {
            return ed1Var;
        }
        z0(4);
        throw null;
    }
}
