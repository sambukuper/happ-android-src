package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hd1 extends fd1 implements gd1 {
    public final ed1 g0;
    public final ke7 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd1(ed1 ed1Var, sm smVar, v15 v15Var, ke7 ke7Var) {
        super(smVar, v15Var);
        if (ed1Var == null) {
            B(0);
            throw null;
        }
        if (smVar == null) {
            B(1);
            throw null;
        }
        if (v15Var == null) {
            B(2);
            throw null;
        }
        if (ke7Var == null) {
            B(3);
            throw null;
        }
        this.g0 = ed1Var;
        this.h0 = ke7Var;
    }

    public static /* synthetic */ void B(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.gd1
    public ke7 getSource() {
        ke7 ke7Var = this.h0;
        if (ke7Var != null) {
            return ke7Var;
        }
        B(6);
        throw null;
    }

    public ed1 p() {
        ed1 ed1Var = this.g0;
        if (ed1Var != null) {
            return ed1Var;
        }
        B(5);
        throw null;
    }

    @Override // defpackage.fd1, defpackage.ed1
    /* JADX INFO: renamed from: G0 */
    public gd1 a() {
        return this;
    }
}
