package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends i3 {
    public final lh4 Z;
    public final /* synthetic */ k3 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(k3 k3Var, ve4 ve4Var) {
        super(ve4Var);
        lh4 lh4Var = lh4.G0;
        if (ve4Var == null) {
            j(0);
            throw null;
        }
        this.f0 = k3Var;
        this.Z = lh4Var;
    }

    public static /* synthetic */ void j(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.lh8
    public final boolean B() {
        return true;
    }

    @Override // defpackage.i3
    public final Collection a() {
        List listI0 = this.f0.I0();
        if (listI0 != null) {
            return listI0;
        }
        j(1);
        throw null;
    }

    @Override // defpackage.i3
    public final lh4 d() {
        lh4 lh4Var = this.Z;
        if (lh4Var != null) {
            return lh4Var;
        }
        j(5);
        throw null;
    }

    @Override // defpackage.lh8
    public final zz3 f() {
        zz3 zz3VarE = el1.e(this.f0);
        if (zz3VarE != null) {
            return zz3VarE;
        }
        j(4);
        throw null;
    }

    @Override // defpackage.lh8
    public final List g() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        j(2);
        throw null;
    }

    @Override // defpackage.i3
    public final boolean h(ot0 ot0Var) {
        if (!(ot0Var instanceof hi8)) {
            return false;
        }
        return pz2.H0.g(this.f0, (hi8) ot0Var, true, g0.k0);
    }

    @Override // defpackage.i3
    public final List i(List list) {
        List listH0 = this.f0.H0(list);
        if (listH0 != null) {
            return listH0;
        }
        j(8);
        throw null;
    }

    public final String toString() {
        return this.f0.getName().X;
    }

    @Override // defpackage.lh8
    public final ot0 x() {
        return this.f0;
    }
}
