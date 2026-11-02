package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hx5 extends cx5 {
    public t14 q0;
    public final hx5 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx5(fx5 fx5Var, sm smVar, fx4 fx4Var, fl1 fl1Var, boolean z, boolean z2, boolean z3, int i, hx5 hx5Var, ke7 ke7Var) {
        super(fx4Var, fl1Var, fx5Var, smVar, v15.g("<get-" + fx5Var.getName() + ">"), z, z2, z3, i, ke7Var);
        if (smVar == null) {
            B(1);
            throw null;
        }
        if (fx4Var == null) {
            B(2);
            throw null;
        }
        if (fl1Var == null) {
            B(3);
            throw null;
        }
        if (i == 0) {
            B(4);
            throw null;
        }
        if (ke7Var == null) {
            B(5);
            throw null;
        }
        this.r0 = hx5Var != null ? hx5Var : this;
    }

    public static /* synthetic */ void B(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final hx5 a() {
        hx5 hx5Var = this.r0;
        if (hx5Var != null) {
            return hx5Var;
        }
        B(8);
        throw null;
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.d(this, obj);
    }

    public final void J0(t14 t14Var) {
        if (t14Var == null) {
            t14Var = this.l0.c();
        }
        this.q0 = t14Var;
    }

    @Override // defpackage.jd0
    public final List L() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        B(7);
        throw null;
    }

    @Override // defpackage.jd0
    public final t14 j() {
        return this.q0;
    }

    @Override // defpackage.ld0, defpackage.jd0
    public final Collection q() {
        return H0(true);
    }
}
