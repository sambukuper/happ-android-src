package defpackage;

import java.util.List;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k3 extends hd1 implements hi8 {
    public final rt8 i0;
    public final boolean j0;
    public final int k0;
    public final te4 l0;
    public final te4 m0;
    public final ve4 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(int i, sm smVar, ed1 ed1Var, ve4 ve4Var, v15 v15Var, rt8 rt8Var, boolean z) {
        super(ed1Var, smVar, v15Var, ke7.G);
        boolean z2 = false;
        if (ve4Var == null) {
            B(0);
            throw null;
        }
        byte b = 1;
        if (ed1Var == null) {
            B(1);
            throw null;
        }
        byte b2 = 2;
        if (smVar == null) {
            B(2);
            throw null;
        }
        if (v15Var == null) {
            B(3);
            throw null;
        }
        if (rt8Var == null) {
            B(4);
            throw null;
        }
        this.i0 = rt8Var;
        this.j0 = z;
        this.k0 = i;
        this.l0 = new te4(ve4Var, new c3(b, this, ve4Var, z2));
        this.m0 = new te4(ve4Var, new c3(b2, this, v15Var, z2));
        this.n0 = ve4Var;
    }

    public static /* synthetic */ void B(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.hi8
    public final rt8 D() {
        rt8 rt8Var = this.i0;
        if (rt8Var != null) {
            return rt8Var;
        }
        B(7);
        throw null;
    }

    public abstract List I0();

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.f(this, obj);
    }

    @Override // defpackage.hi8
    public final ve4 Q() {
        ve4 ve4Var = this.n0;
        if (ve4Var != null) {
            return ve4Var;
        }
        B(14);
        throw null;
    }

    @Override // defpackage.hi8
    public final boolean U() {
        return false;
    }

    @Override // defpackage.ot0
    public final aa7 X() {
        aa7 aa7Var = (aa7) this.m0.invoke();
        if (aa7Var != null) {
            return aa7Var;
        }
        B(10);
        throw null;
    }

    @Override // defpackage.hi8
    public final int getIndex() {
        return this.k0;
    }

    @Override // defpackage.hi8
    public final List getUpperBounds() {
        return ((j3) l()).c();
    }

    @Override // defpackage.hi8, defpackage.ot0
    public final lh8 l() {
        lh8 lh8Var = (lh8) this.l0.invoke();
        if (lh8Var != null) {
            return lh8Var;
        }
        B(9);
        throw null;
    }

    @Override // defpackage.hi8
    public final boolean y() {
        return this.j0;
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    public final ed1 a() {
        return this;
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    public final hi8 a() {
        return this;
    }

    @Override // defpackage.hd1
    /* JADX INFO: renamed from: G0 */
    public final gd1 a() {
        return this;
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    public final ot0 a() {
        return this;
    }

    public List H0(List list) {
        return list;
    }
}
