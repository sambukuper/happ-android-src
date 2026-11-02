package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ft0 extends n0 {
    public final sx4 Z;
    public final List f0;
    public final Collection g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(sx4 sx4Var, List list, Collection collection, ve4 ve4Var) {
        super(ve4Var);
        if (list == null) {
            j(1);
            throw null;
        }
        if (collection == null) {
            j(2);
            throw null;
        }
        if (ve4Var == null) {
            j(3);
            throw null;
        }
        this.Z = sx4Var;
        this.f0 = Collections.unmodifiableList(new ArrayList(list));
        this.g0 = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void j(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
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
        Collection collection = this.g0;
        if (collection != null) {
            return collection;
        }
        j(6);
        throw null;
    }

    @Override // defpackage.lh8
    public final List g() {
        List list = this.f0;
        if (list != null) {
            return list;
        }
        j(4);
        throw null;
    }

    @Override // defpackage.lh8
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final sx4 x() {
        sx4 sx4Var = this.Z;
        if (sx4Var != null) {
            return sx4Var;
        }
        j(5);
        throw null;
    }

    public final String toString() {
        return bl1.f(this.Z).a;
    }
}
