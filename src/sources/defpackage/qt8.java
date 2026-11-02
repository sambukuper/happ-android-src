package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qt8 extends hd1 implements pt8 {
    public t14 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt8(ed1 ed1Var, sm smVar, v15 v15Var, t14 t14Var, ke7 ke7Var) {
        super(ed1Var, smVar, v15Var, ke7Var);
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
        this.i0 = t14Var;
    }

    public static /* synthetic */ void B(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.jd0
    public final List L() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        B(6);
        throw null;
    }

    public i44 S() {
        return null;
    }

    public List Y() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        B(9);
        throw null;
    }

    @Override // defpackage.cw0, defpackage.i86
    public final t14 c() {
        t14 t14Var = this.i0;
        if (t14Var != null) {
            return t14Var;
        }
        B(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        B(8);
        throw null;
    }

    public t14 j() {
        t14 t14VarC = c();
        if (t14VarC != null) {
            return t14VarC;
        }
        B(10);
        throw null;
    }

    public boolean z() {
        return false;
    }
}
