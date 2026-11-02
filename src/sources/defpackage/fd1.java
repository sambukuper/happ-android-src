package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fd1 extends cw0 implements ed1 {
    public final v15 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd1(sm smVar, v15 v15Var) {
        super(smVar);
        if (smVar == null) {
            B(0);
            throw null;
        }
        if (v15Var == null) {
            B(1);
            throw null;
        }
        this.f0 = v15Var;
    }

    public static /* synthetic */ void B(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String F0(ed1 ed1Var) {
        try {
            return wk1.e.n(ed1Var) + "[" + ed1Var.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(ed1Var)) + "]";
        } catch (Throwable unused) {
            return ed1Var.getClass().getSimpleName() + " " + ed1Var.getName();
        }
    }

    @Override // defpackage.ed1
    public final v15 getName() {
        v15 v15Var = this.f0;
        if (v15Var != null) {
            return v15Var;
        }
        B(2);
        throw null;
    }

    public String toString() {
        return F0(this);
    }

    @Override // defpackage.ed1
    public ed1 a() {
        return this;
    }
}
