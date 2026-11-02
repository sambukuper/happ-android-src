package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cx5 extends hd1 implements ho2 {
    public boolean i0;
    public final boolean j0;
    public final fx4 k0;
    public final fx5 l0;
    public final boolean m0;
    public final int n0;
    public fl1 o0;
    public ho2 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx5(fx4 fx4Var, fl1 fl1Var, fx5 fx5Var, sm smVar, v15 v15Var, boolean z, boolean z2, boolean z3, int i, ke7 ke7Var) {
        super(fx5Var.p(), smVar, v15Var, ke7Var);
        if (fx4Var == null) {
            B(0);
            throw null;
        }
        if (fl1Var == null) {
            B(1);
            throw null;
        }
        if (smVar == null) {
            B(3);
            throw null;
        }
        if (ke7Var == null) {
            B(5);
            throw null;
        }
        this.p0 = null;
        this.k0 = fx4Var;
        this.o0 = fl1Var;
        this.l0 = fx5Var;
        this.i0 = z;
        this.j0 = z2;
        this.m0 = z3;
        this.n0 = i;
    }

    public static /* synthetic */ void B(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return false;
    }

    @Override // defpackage.ho2
    public final boolean F() {
        return false;
    }

    public final ArrayList H0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (fx5 fx5Var : this.l0.q()) {
            cx5 cx5VarB = z ? fx5Var.b() : fx5Var.d();
            if (cx5VarB != null) {
                arrayList.add(cx5VarB);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ld0
    public final ld0 I(ed1 ed1Var, fx4 fx4Var, fl1 fl1Var) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // defpackage.ho2
    public final ho2 O() {
        return this.p0;
    }

    @Override // defpackage.jd0
    public final i44 P() {
        return this.l0.P();
    }

    @Override // defpackage.jd0
    public final i44 S() {
        return this.l0.S();
    }

    @Override // defpackage.jd0
    public final List Y() {
        List listY = this.l0.Y();
        if (listY != null) {
            return listY;
        }
        B(14);
        throw null;
    }

    @Override // defpackage.ho2
    public final boolean c0() {
        return false;
    }

    @Override // defpackage.jd1, defpackage.ts4
    public final fl1 e() {
        fl1 fl1Var = this.o0;
        if (fl1Var != null) {
            return fl1Var;
        }
        B(11);
        throw null;
    }

    @Override // defpackage.ld0
    public final void e0(Collection collection) {
        if (collection != null) {
            return;
        }
        B(16);
        throw null;
    }

    @Override // defpackage.ho2, defpackage.ew7
    public final ho2 g(wi8 wi8Var) {
        if (wi8Var != null) {
            return this;
        }
        B(7);
        throw null;
    }

    @Override // defpackage.jd0
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        B(9);
        throw null;
    }

    @Override // defpackage.ho2
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ho2
    public final boolean h0() {
        return false;
    }

    @Override // defpackage.ho2
    public final boolean i() {
        return this.m0;
    }

    @Override // defpackage.ts4
    public final boolean j0() {
        return false;
    }

    @Override // defpackage.ts4
    public final boolean k() {
        return this.j0;
    }

    @Override // defpackage.ts4
    public final fx4 m() {
        fx4 fx4Var = this.k0;
        if (fx4Var != null) {
            return fx4Var;
        }
        B(10);
        throw null;
    }

    @Override // defpackage.ho2
    public final boolean o() {
        return false;
    }

    @Override // defpackage.ld0
    public final int r() {
        int i = this.n0;
        if (i != 0) {
            return i;
        }
        B(6);
        throw null;
    }

    @Override // defpackage.ho2
    public final boolean s() {
        return false;
    }

    @Override // defpackage.jd0
    public final Object v(yl1 yl1Var) {
        return null;
    }

    @Override // defpackage.jd0
    public final boolean z() {
        return false;
    }

    @Override // defpackage.ew7
    public final /* bridge */ /* synthetic */ gd1 g(wi8 wi8Var) {
        g(wi8Var);
        return this;
    }
}
