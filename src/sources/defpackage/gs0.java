package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class gs0 extends jo2 implements a41 {
    public final boolean H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(sx4 sx4Var, a41 a41Var, sm smVar, boolean z, int i, ke7 ke7Var) {
        super(i, smVar, sx4Var, a41Var, hf7.e, ke7Var);
        if (sx4Var == null) {
            B(0);
            throw null;
        }
        if (smVar == null) {
            B(1);
            throw null;
        }
        if (i == 0) {
            B(2);
            throw null;
        }
        if (ke7Var == null) {
            B(3);
            throw null;
        }
        this.H0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void B(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                case 17:
                case 18:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.ld0
    public final ld0 I(ed1 ed1Var, fx4 fx4Var, fl1 fl1Var) {
        return (gs0) H0(ed1Var, fx4Var, fl1Var);
    }

    @Override // defpackage.jo2, defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.z(this, obj);
    }

    @Override // defpackage.jo2
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public gs0 I0(int i, sm smVar, ed1 ed1Var, ho2 ho2Var, v15 v15Var, ke7 ke7Var) {
        if (ed1Var == null) {
            B(23);
            throw null;
        }
        if (i == 0) {
            B(24);
            throw null;
        }
        if (smVar == null) {
            B(25);
            throw null;
        }
        if (i == 1 || i == 4) {
            return new gs0((sx4) ed1Var, this, smVar, this.H0, 1, ke7Var);
        }
        StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
        sb.append(this);
        sb.append("\nnewOwner: ");
        sb.append(ed1Var);
        String strE = p61.E(i);
        sb.append("\nkind: ");
        sb.append(strE);
        throw new IllegalStateException(sb.toString());
    }

    public final sx4 R0() {
        sx4 sx4VarP = p();
        if (sx4VarP != null) {
            return sx4VarP;
        }
        B(18);
        throw null;
    }

    @Override // defpackage.hd1, defpackage.ed1
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final sx4 p() {
        sx4 sx4Var = (sx4) super.p();
        if (sx4Var != null) {
            return sx4Var;
        }
        B(17);
        throw null;
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final gs0 a() {
        gs0 gs0Var = (gs0) super.a();
        if (gs0Var != null) {
            return gs0Var;
        }
        B(19);
        throw null;
    }

    public final void U0(List list, fl1 fl1Var) {
        if (list == null) {
            B(13);
            throw null;
        }
        if (fl1Var != null) {
            V0(list, fl1Var, p().k0());
        } else {
            B(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void V0(List list, fl1 fl1Var, List list2) {
        i44 i44VarP0;
        List listF0;
        if (list == null) {
            B(10);
            throw null;
        }
        if (fl1Var == null) {
            B(11);
            throw null;
        }
        if (list2 == null) {
            B(12);
            throw null;
        }
        sx4 sx4VarP = p();
        if (sx4VarP.n()) {
            ed1 ed1VarP = sx4VarP.p();
            if (ed1VarP instanceof sx4) {
                i44VarP0 = ((sx4) ed1VarP).p0();
            } else {
                i44VarP0 = null;
            }
        } else {
            i44VarP0 = null;
        }
        sx4 sx4VarP2 = p();
        if (sx4VarP2.f0().isEmpty()) {
            listF0 = Collections.EMPTY_LIST;
            if (listF0 == null) {
                B(16);
                throw null;
            }
        } else {
            listF0 = sx4VarP2.f0();
            if (listF0 == null) {
                B(15);
                throw null;
            }
        }
        L0(null, i44VarP0, listF0, list2, list, null, fx4.Y, fl1Var);
    }

    @Override // defpackage.jo2, defpackage.ho2, defpackage.ew7
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final gs0 g(wi8 wi8Var) {
        if (wi8Var != null) {
            return (gs0) super.g(wi8Var);
        }
        B(20);
        throw null;
    }

    @Override // defpackage.jo2, defpackage.ld0
    public final void e0(Collection collection) {
        if (collection != null) {
            return;
        }
        B(22);
        throw null;
    }

    @Override // defpackage.jo2, defpackage.ld0, defpackage.jd0
    public final Collection q() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        B(21);
        throw null;
    }
}
