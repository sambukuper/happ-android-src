package defpackage;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ii8 extends k3 {
    public final ArrayList o0;
    public boolean p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii8(int i, sm smVar, ed1 ed1Var, ve4 ve4Var, v15 v15Var, rt8 rt8Var, boolean z) {
        super(i, smVar, ed1Var, ve4Var, v15Var, rt8Var, z);
        if (ed1Var == null) {
            B(19);
            throw null;
        }
        if (smVar == null) {
            B(20);
            throw null;
        }
        if (rt8Var == null) {
            B(21);
            throw null;
        }
        if (v15Var == null) {
            B(22);
            throw null;
        }
        if (ve4Var == null) {
            B(25);
            throw null;
        }
        this.o0 = new ArrayList(1);
        this.p0 = false;
    }

    public static /* synthetic */ void B(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static ii8 J0(int i, sm smVar, ed1 ed1Var, ve4 ve4Var, v15 v15Var, rt8 rt8Var, boolean z) {
        if (ed1Var == null) {
            B(6);
            throw null;
        }
        if (smVar == null) {
            B(7);
            throw null;
        }
        if (rt8Var == null) {
            B(8);
            throw null;
        }
        if (v15Var == null) {
            B(9);
            throw null;
        }
        if (ve4Var != null) {
            return new ii8(i, smVar, ed1Var, ve4Var, v15Var, rt8Var, z);
        }
        B(11);
        throw null;
    }

    public static ii8 K0(m0 m0Var, rt8 rt8Var, v15 v15Var, int i, ve4 ve4Var) {
        rm rmVar = oy1.f0;
        if (ve4Var == null) {
            B(4);
            throw null;
        }
        ii8 ii8VarJ0 = J0(i, rmVar, m0Var, ve4Var, v15Var, rt8Var, false);
        aa7 aa7VarN = el1.e(m0Var).n();
        if (ii8VarJ0.p0) {
            bt.i("Type parameter descriptor is already initialized: ".concat(ii8VarJ0.L0()));
            return null;
        }
        if (!vr3.J(aa7VarN)) {
            ii8VarJ0.o0.add(aa7VarN);
        }
        if (ii8VarJ0.p0) {
            bt.i("Type parameter descriptor is already initialized: ".concat(ii8VarJ0.L0()));
            return null;
        }
        ii8VarJ0.p0 = true;
        return ii8VarJ0;
    }

    @Override // defpackage.k3
    public final List I0() {
        if (!this.p0) {
            bt.i("Type parameter descriptor is not initialized: ".concat(L0()));
            return null;
        }
        ArrayList arrayList = this.o0;
        if (arrayList != null) {
            return arrayList;
        }
        B(28);
        throw null;
    }

    public final String L0() {
        return getName() + " declared in " + bl1.f(p());
    }
}
