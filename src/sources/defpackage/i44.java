package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i44 extends fd1 implements zg5 {
    public final /* synthetic */ byte g0 = 1;
    public final ed1 h0;
    public final i86 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i44(ed1 ed1Var, cw0 cw0Var, sm smVar, v15 v15Var) {
        super(smVar, v15Var);
        if (ed1Var == null) {
            B(3);
            throw null;
        }
        if (smVar == null) {
            B(5);
            throw null;
        }
        if (v15Var == null) {
            B(6);
            throw null;
        }
        this.h0 = ed1Var;
        this.i0 = cw0Var;
    }

    public static /* synthetic */ void B(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void G0(int i) {
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final i86 H0() {
        byte b = this.g0;
        i86 i86Var = this.i0;
        switch (b) {
            case 0:
                return (d83) i86Var;
            default:
                cw0 cw0Var = (cw0) i86Var;
                if (cw0Var != null) {
                    return cw0Var;
                }
                B(7);
                throw null;
        }
    }

    @Override // defpackage.ew7
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final i44 g(wi8 wi8Var) {
        if (wi8Var == null) {
            G0(3);
            throw null;
        }
        if (!wi8Var.a.e()) {
            t14 t14VarH = p() instanceof sx4 ? wi8Var.h(c(), rt8.OUT_VARIANCE) : wi8Var.h(c(), rt8.INVARIANT);
            if (t14VarH == null) {
                return null;
            }
            if (t14VarH != c()) {
                return new i44(p(), new nd8(t14VarH), getAnnotations());
            }
        }
        return this;
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.g(this, obj);
    }

    @Override // defpackage.jd0
    public final List L() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(7);
        throw null;
    }

    @Override // defpackage.jd0
    public final i44 S() {
        return null;
    }

    @Override // defpackage.cw0, defpackage.i86
    public final t14 c() {
        t14 t14VarC = H0().c();
        if (t14VarC != null) {
            return t14VarC;
        }
        G0(6);
        throw null;
    }

    @Override // defpackage.jd1, defpackage.ts4
    public final fl1 e() {
        fl1 fl1Var = gl1.f;
        if (fl1Var != null) {
            return fl1Var;
        }
        G0(9);
        throw null;
    }

    @Override // defpackage.gd1
    public final ke7 getSource() {
        return ke7.G;
    }

    @Override // defpackage.jd0
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(5);
        throw null;
    }

    @Override // defpackage.jd0
    public final t14 j() {
        return c();
    }

    @Override // defpackage.ed1
    public final ed1 p() {
        byte b = this.g0;
        ed1 ed1Var = this.h0;
        switch (b) {
            case 0:
                return (sx4) ed1Var;
            default:
                if (ed1Var != null) {
                    return ed1Var;
                }
                B(8);
                throw null;
        }
    }

    @Override // defpackage.jd0
    public final Collection q() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        G0(8);
        throw null;
    }

    @Override // defpackage.fd1
    public String toString() {
        switch (this.g0) {
            case 0:
                return "class " + ((sx4) this.h0).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.jd0
    public final boolean z() {
        return false;
    }

    @Override // defpackage.fd1, defpackage.ed1
    public final ed1 a() {
        return this;
    }

    @Override // defpackage.fd1, defpackage.ed1
    public final jd0 a() {
        return this;
    }

    public i44(sx4 sx4Var) {
        super(oy1.f0, hf7.d);
        this.h0 = sx4Var;
        this.i0 = new d83(sx4Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i44(ed1 ed1Var, cw0 cw0Var, sm smVar) {
        this(ed1Var, cw0Var, smVar, hf7.d);
        if (ed1Var == null) {
            B(0);
            throw null;
        }
        if (smVar != null) {
        } else {
            B(2);
            throw null;
        }
    }
}
