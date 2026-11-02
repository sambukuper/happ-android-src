package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dl3 extends q97 implements xj3 {
    public static final yl1 J0 = new yl1();
    public static final yl1 K0 = new yl1();
    public int H0;
    public final boolean I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl3(ed1 ed1Var, q97 q97Var, sm smVar, v15 v15Var, int i, ke7 ke7Var, boolean z) {
        super(ed1Var, q97Var, smVar, v15Var, i, ke7Var);
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
        this.H0 = 0;
        this.I0 = z;
    }

    public static /* synthetic */ void B(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                break;
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static dl3 V0(ed1 ed1Var, n44 n44Var, v15 v15Var, hr6 hr6Var, boolean z) {
        if (ed1Var == null) {
            B(5);
            throw null;
        }
        if (v15Var != null) {
            return new dl3(ed1Var, null, n44Var, v15Var, 1, hr6Var, z);
        }
        B(7);
        throw null;
    }

    @Override // defpackage.q97, defpackage.jo2
    public final jo2 I0(int i, sm smVar, ed1 ed1Var, ho2 ho2Var, v15 v15Var, ke7 ke7Var) {
        if (ed1Var == null) {
            B(14);
            throw null;
        }
        if (i == 0) {
            B(15);
            throw null;
        }
        if (smVar == null) {
            B(16);
            throw null;
        }
        q97 q97Var = (q97) ho2Var;
        if (v15Var == null) {
            v15Var = getName();
        }
        dl3 dl3Var = new dl3(ed1Var, q97Var, smVar, v15Var, i, ke7Var, this.I0);
        int i2 = this.H0;
        boolean z = false;
        if (i2 != 1) {
            if (i2 == 2) {
                z = true;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw null;
                }
                z = true;
            }
        }
        dl3Var.W0(z, ie2.c(i2));
        return dl3Var;
    }

    @Override // defpackage.q97
    public final q97 U0(i44 i44Var, i44 i44Var2, List list, List list2, List list3, t14 t14Var, fx4 fx4Var, fl1 fl1Var, Map map) {
        br0 br0Var;
        if (list == null) {
            B(9);
            throw null;
        }
        if (list2 == null) {
            B(10);
            throw null;
        }
        if (list3 == null) {
            B(11);
            throw null;
        }
        if (fl1Var == null) {
            B(12);
            throw null;
        }
        super.U0(i44Var, i44Var2, list, list2, list3, t14Var, fx4Var, fl1Var, map);
        for (er0 er0Var : dd5.a) {
            kc6 kc6Var = er0Var.b;
            v15 v15Var = er0Var.a;
            if (v15Var == null || dh3.f(getName(), v15Var)) {
                if (kc6Var != null) {
                    String strB = getName().b();
                    strB.getClass();
                    if (!kc6Var.d(strB)) {
                        continue;
                    }
                }
                Collection collection = er0Var.c;
                if (collection == null || collection.contains(getName())) {
                    for (jq0 jq0Var : er0Var.e) {
                        if (jq0Var.c(this) != null) {
                            br0Var = new br0(false);
                            this.q0 = br0Var.a;
                            return this;
                        }
                    }
                    br0Var = ((String) er0Var.d.B(this)) != null ? new br0(false) : br0.c;
                    this.q0 = br0Var.a;
                    return this;
                }
            }
        }
        br0Var = br0.b;
        this.q0 = br0Var.a;
        return this;
    }

    public final void W0(boolean z, boolean z2) {
        int i;
        if (z) {
            i = z2 ? 4 : 2;
        } else {
            i = z2 ? 3 : 1;
        }
        this.H0 = i;
    }

    @Override // defpackage.xj3
    public final xj3 d0(t14 t14Var, ArrayList arrayList, t14 t14Var2, qg5 qg5Var) {
        ArrayList arrayListB = xt7.b(arrayList, L(), this);
        i44 i44VarX = t14Var == null ? null : z91.x(this, t14Var, oy1.f0);
        io2 io2VarM0 = M0(wi8.b);
        io2VarM0.i0 = arrayListB;
        io2VarM0.m0 = t14Var2;
        io2VarM0.k0 = i44VarX;
        io2VarM0.r0 = true;
        io2VarM0.q0 = true;
        dl3 dl3Var = (dl3) io2VarM0.z0.J0(io2VarM0);
        if (qg5Var != null) {
            yl1 yl1Var = (yl1) qg5Var.X;
            Object obj = qg5Var.Y;
            Map linkedHashMap = dl3Var.G0;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                dl3Var.G0 = linkedHashMap;
            }
            linkedHashMap.put(yl1Var, obj);
        }
        if (dl3Var != null) {
            return dl3Var;
        }
        B(21);
        throw null;
    }

    @Override // defpackage.jo2, defpackage.jd0
    public final boolean z() {
        return ie2.c(this.H0);
    }
}
