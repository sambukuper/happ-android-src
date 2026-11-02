package defpackage;

import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q22 extends ks0 {
    public final ft0 i0;
    public final p22 j0;
    public final h65 k0;
    public final sm l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q22(ve4 ve4Var, sx4 sx4Var, aa7 aa7Var, v15 v15Var, h65 h65Var, sm smVar, ke7 ke7Var) {
        super(ve4Var, sx4Var, v15Var, ke7Var);
        if (ve4Var == null) {
            z0(6);
            throw null;
        }
        if (sx4Var == null) {
            z0(7);
            throw null;
        }
        if (aa7Var == null) {
            z0(8);
            throw null;
        }
        if (h65Var == null) {
            z0(10);
            throw null;
        }
        this.l0 = smVar;
        this.i0 = new ft0(this, Collections.EMPTY_LIST, Collections.singleton(aa7Var), ve4Var);
        this.j0 = new p22(this, ve4Var);
        this.k0 = h65Var;
    }

    public static q22 B0(ve4 ve4Var, sx4 sx4Var, v15 v15Var, te4 te4Var, sm smVar, ke7 ke7Var) {
        if (ve4Var == null) {
            z0(0);
            throw null;
        }
        if (sx4Var == null) {
            z0(1);
            throw null;
        }
        if (te4Var != null) {
            return new q22(ve4Var, sx4Var, sx4Var.X(), v15Var, te4Var, smVar, ke7Var);
        }
        z0(3);
        throw null;
    }

    public static /* synthetic */ void z0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return false;
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fl1 e() {
        fl1 fl1Var = gl1.e;
        if (fl1Var != null) {
            return fl1Var;
        }
        z0(20);
        throw null;
    }

    @Override // defpackage.zk
    public final sm getAnnotations() {
        sm smVar = this.l0;
        if (smVar != null) {
            return smVar;
        }
        z0(21);
        throw null;
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
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        z0(22);
        throw null;
    }

    @Override // defpackage.ot0
    public final lh8 l() {
        ft0 ft0Var = this.i0;
        if (ft0Var != null) {
            return ft0Var;
        }
        z0(17);
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
    public final et4 s0(z14 z14Var) {
        p22 p22Var = this.j0;
        if (p22Var != null) {
            return p22Var;
        }
        z0(14);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
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
