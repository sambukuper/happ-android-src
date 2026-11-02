package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ms0 extends ks0 {
    public final fx4 i0;
    public final us0 j0;
    public final ft0 k0;
    public et4 l0;
    public Set m0;
    public gs0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(ed1 ed1Var, v15 v15Var, fx4 fx4Var, us0 us0Var, Collection collection, ve4 ve4Var) {
        super(ve4Var, ed1Var, v15Var, ke7.G);
        if (ed1Var == null) {
            z0(0);
            throw null;
        }
        if (v15Var == null) {
            z0(1);
            throw null;
        }
        if (ve4Var == null) {
            z0(6);
            throw null;
        }
        this.i0 = fx4Var;
        this.j0 = us0Var;
        this.k0 = new ft0(this, Collections.EMPTY_LIST, collection, ve4Var);
    }

    public static /* synthetic */ void z0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.sx4
    public final Collection B() {
        Set set = this.m0;
        if (set != null) {
            return set;
        }
        z0(11);
        throw null;
    }

    public final void B0(et4 et4Var, Set set, gs0 gs0Var) {
        this.l0 = et4Var;
        this.m0 = set;
        this.n0 = gs0Var;
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return false;
    }

    @Override // defpackage.sx4
    public final us0 g0() {
        us0 us0Var = this.j0;
        if (us0Var != null) {
            return us0Var;
        }
        z0(15);
        throw null;
    }

    @Override // defpackage.zk
    public final sm getAnnotations() {
        return oy1.f0;
    }

    @Override // defpackage.ts4
    public final boolean j0() {
        return false;
    }

    @Override // defpackage.ot0
    public final lh8 l() {
        ft0 ft0Var = this.k0;
        if (ft0Var != null) {
            return ft0Var;
        }
        z0(10);
        throw null;
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fx4 m() {
        fx4 fx4Var = this.i0;
        if (fx4Var != null) {
            return fx4Var;
        }
        z0(16);
        throw null;
    }

    @Override // defpackage.pt0
    public final boolean n() {
        return false;
    }

    @Override // defpackage.sx4
    public final et4 s0(z14 z14Var) {
        et4 et4Var = this.l0;
        if (et4Var != null) {
            return et4Var;
        }
        z0(13);
        throw null;
    }

    @Override // defpackage.sx4
    public final gs0 t0() {
        return this.n0;
    }

    public String toString() {
        return "class " + getName();
    }
}
