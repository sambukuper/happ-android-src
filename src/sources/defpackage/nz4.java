package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nz4 extends ks0 {
    public final us0 i0;
    public fx4 j0;
    public fl1 k0;
    public ft0 l0;
    public ArrayList m0;
    public final ArrayList n0;
    public final ve4 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz4(h02 h02Var, v15 v15Var, ve4 ve4Var) {
        super(ve4Var, h02Var, v15Var, ke7.G);
        if (ve4Var == null) {
            z0(4);
            throw null;
        }
        this.n0 = new ArrayList();
        this.o0 = ve4Var;
        this.i0 = us0.Y;
    }

    public static /* synthetic */ void z0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.sx4
    public final Collection B() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        z0(13);
        throw null;
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return false;
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fl1 e() {
        fl1 fl1Var = this.k0;
        if (fl1Var != null) {
            return fl1Var;
        }
        z0(10);
        throw null;
    }

    @Override // defpackage.sx4
    public final us0 g0() {
        us0 us0Var = this.i0;
        if (us0Var != null) {
            return us0Var;
        }
        z0(8);
        throw null;
    }

    @Override // defpackage.zk
    public final sm getAnnotations() {
        return oy1.f0;
    }

    @Override // defpackage.sx4
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ts4
    public final boolean j0() {
        return false;
    }

    @Override // defpackage.sx4, defpackage.pt0
    public final List k0() {
        ArrayList arrayList = this.m0;
        if (arrayList != null) {
            return arrayList;
        }
        z0(15);
        throw null;
    }

    @Override // defpackage.ot0
    public final lh8 l() {
        ft0 ft0Var = this.l0;
        if (ft0Var != null) {
            return ft0Var;
        }
        z0(11);
        throw null;
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fx4 m() {
        fx4 fx4Var = this.j0;
        if (fx4Var != null) {
            return fx4Var;
        }
        z0(7);
        throw null;
    }

    @Override // defpackage.pt0
    public final boolean n() {
        return false;
    }

    @Override // defpackage.sx4
    public final et4 o0() {
        return dt4.b;
    }

    @Override // defpackage.sx4
    public final gs0 t0() {
        return null;
    }

    public final String toString() {
        return fd1.F0(this);
    }

    @Override // defpackage.sx4
    public final ft8 u0() {
        return null;
    }

    @Override // defpackage.sx4
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean w0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean x0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean y0() {
        return false;
    }
}
