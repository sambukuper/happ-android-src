package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class io2 implements go2 {
    public ui8 X;
    public ed1 Y;
    public fx4 Z;
    public fl1 f0;
    public ho2 g0;
    public int h0;
    public List i0;
    public final List j0;
    public i44 k0;
    public i44 l0;
    public t14 m0;
    public v15 n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public List t0;
    public sm u0;
    public boolean v0;
    public final LinkedHashMap w0;
    public Boolean x0;
    public boolean y0;
    public final /* synthetic */ jo2 z0;

    public io2(jo2 jo2Var, ui8 ui8Var, ed1 ed1Var, fx4 fx4Var, fl1 fl1Var, int i, List list, List list2, i44 i44Var, t14 t14Var) {
        if (ui8Var == null) {
            b(0);
            throw null;
        }
        if (ed1Var == null) {
            b(1);
            throw null;
        }
        if (fx4Var == null) {
            b(2);
            throw null;
        }
        if (fl1Var == null) {
            b(3);
            throw null;
        }
        if (i == 0) {
            b(4);
            throw null;
        }
        if (list == null) {
            b(5);
            throw null;
        }
        if (list2 == null) {
            b(6);
            throw null;
        }
        if (t14Var == null) {
            b(7);
            throw null;
        }
        this.z0 = jo2Var;
        this.g0 = null;
        this.l0 = jo2Var.n0;
        this.o0 = true;
        this.p0 = false;
        this.q0 = false;
        this.r0 = false;
        this.s0 = jo2Var.w0;
        this.t0 = null;
        this.u0 = null;
        this.v0 = jo2Var.x0;
        this.w0 = new LinkedHashMap();
        this.x0 = null;
        this.y0 = false;
        this.X = ui8Var;
        this.Y = ed1Var;
        this.Z = fx4Var;
        this.f0 = fl1Var;
        this.h0 = i;
        this.i0 = list;
        this.j0 = list2;
        this.k0 = i44Var;
        this.m0 = t14Var;
        this.n0 = null;
    }

    public static /* synthetic */ void b(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
            case 17:
            case 19:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i2 = 2;
                break;
            case 10:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
            case 17:
            case 19:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
            case 17:
            case 19:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case 10:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
            case 17:
            case 19:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.go2
    public final go2 a(List list) {
        this.i0 = list;
        return this;
    }

    @Override // defpackage.go2
    public final ho2 build() {
        return this.z0.J0(this);
    }

    @Override // defpackage.go2
    public final go2 c(int i) {
        if (i != 0) {
            this.h0 = i;
            return this;
        }
        b(14);
        throw null;
    }

    @Override // defpackage.go2
    public final go2 f(i44 i44Var) {
        this.l0 = i44Var;
        return this;
    }

    @Override // defpackage.go2
    public final go2 g() {
        this.q0 = true;
        return this;
    }

    @Override // defpackage.go2
    public final go2 h() {
        this.w0.put(dl3.K0, Boolean.TRUE);
        return this;
    }

    @Override // defpackage.go2
    public final go2 i() {
        this.v0 = true;
        return this;
    }

    @Override // defpackage.go2
    public final go2 k(fl1 fl1Var) {
        if (fl1Var != null) {
            this.f0 = fl1Var;
            return this;
        }
        b(12);
        throw null;
    }

    @Override // defpackage.go2
    public final go2 l() {
        this.o0 = false;
        return this;
    }

    @Override // defpackage.go2
    public final go2 m(fx4 fx4Var) {
        if (fx4Var != null) {
            this.Z = fx4Var;
            return this;
        }
        b(10);
        throw null;
    }

    @Override // defpackage.go2
    public final go2 n(sm smVar) {
        if (smVar != null) {
            this.u0 = smVar;
            return this;
        }
        b(35);
        throw null;
    }

    @Override // defpackage.go2
    public final go2 o() {
        this.t0 = d02.X;
        return this;
    }

    @Override // defpackage.go2
    public final go2 r(t14 t14Var) {
        if (t14Var != null) {
            this.m0 = t14Var;
            return this;
        }
        b(23);
        throw null;
    }

    @Override // defpackage.go2
    public final go2 v() {
        this.s0 = true;
        return this;
    }

    @Override // defpackage.go2
    public final go2 w(ed1 ed1Var) {
        this.Y = ed1Var;
        return this;
    }

    @Override // defpackage.go2
    public final go2 x(v15 v15Var) {
        this.n0 = v15Var;
        return this;
    }

    @Override // defpackage.go2
    public final go2 z() {
        this.p0 = true;
        return this;
    }
}
