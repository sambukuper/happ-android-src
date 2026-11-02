package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class q97 extends jo2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q97(ed1 ed1Var, q97 q97Var, sm smVar, v15 v15Var, int i, ke7 ke7Var) {
        super(i, smVar, ed1Var, q97Var, v15Var, ke7Var);
        if (ed1Var == null) {
            B(0);
            throw null;
        }
        if (smVar == null) {
            B(1);
            throw null;
        }
        if (v15Var == null) {
            B(2);
            throw null;
        }
        if (i == 0) {
            B(3);
            throw null;
        }
        if (ke7Var != null) {
        } else {
            B(4);
            throw null;
        }
    }

    public static /* synthetic */ void B(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                break;
            case 25:
            case 26:
            case 27:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static q97 R0(ed1 ed1Var, v15 v15Var, int i, ke7 ke7Var) {
        rm rmVar = oy1.f0;
        if (v15Var == null) {
            B(7);
            throw null;
        }
        if (i == 0) {
            B(8);
            throw null;
        }
        if (ke7Var != null) {
            return new q97(ed1Var, null, rmVar, v15Var, i, ke7Var);
        }
        B(9);
        throw null;
    }

    @Override // defpackage.jo2
    public jo2 I0(int i, sm smVar, ed1 ed1Var, ho2 ho2Var, v15 v15Var, ke7 ke7Var) {
        if (ed1Var == null) {
            B(25);
            throw null;
        }
        if (i == 0) {
            B(26);
            throw null;
        }
        if (smVar == null) {
            B(27);
            throw null;
        }
        q97 q97Var = (q97) ho2Var;
        if (v15Var == null) {
            v15Var = getName();
        }
        return new q97(ed1Var, q97Var, smVar, v15Var, i, ke7Var);
    }

    @Override // defpackage.ld0
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public q97 I(ed1 ed1Var, fx4 fx4Var, fl1 fl1Var) {
        return (q97) H0(ed1Var, fx4Var, fl1Var);
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final q97 a() {
        q97 q97Var = (q97) super.a();
        if (q97Var != null) {
            return q97Var;
        }
        B(24);
        throw null;
    }

    @Override // defpackage.jo2
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final q97 L0(i44 i44Var, i44 i44Var2, List list, List list2, List list3, t14 t14Var, fx4 fx4Var, fl1 fl1Var) {
        if (list == null) {
            B(14);
            throw null;
        }
        if (list2 == null) {
            B(15);
            throw null;
        }
        if (list3 == null) {
            B(16);
            throw null;
        }
        if (fl1Var != null) {
            return U0(i44Var, i44Var2, list, list2, list3, t14Var, fx4Var, fl1Var, null);
        }
        B(17);
        throw null;
    }

    public q97 U0(i44 i44Var, i44 i44Var2, List list, List list2, List list3, t14 t14Var, fx4 fx4Var, fl1 fl1Var, Map map) {
        if (list == null) {
            B(19);
            throw null;
        }
        if (list2 == null) {
            B(20);
            throw null;
        }
        if (list3 == null) {
            B(21);
            throw null;
        }
        if (fl1Var == null) {
            B(22);
            throw null;
        }
        super.L0(i44Var, i44Var2, list, list2, list3, t14Var, fx4Var, fl1Var);
        if (map != null && !map.isEmpty()) {
            this.G0 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // defpackage.jo2, defpackage.ho2
    public go2 i0() {
        return M0(wi8.b);
    }
}
