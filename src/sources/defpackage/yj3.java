package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yj3 extends gs0 implements xj3 {
    public Boolean I0;
    public Boolean J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj3(sx4 sx4Var, yj3 yj3Var, sm smVar, boolean z, int i, ke7 ke7Var) {
        super(sx4Var, yj3Var, smVar, z, i, ke7Var);
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
        this.I0 = null;
        this.J0 = null;
    }

    public static /* synthetic */ void B(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static yj3 X0(sx4 sx4Var, sm smVar, boolean z, hr6 hr6Var) {
        if (sx4Var != null) {
            return new yj3(sx4Var, null, smVar, z, 1, hr6Var);
        }
        B(4);
        throw null;
    }

    @Override // defpackage.gs0, defpackage.jo2
    public final /* bridge */ /* synthetic */ jo2 I0(int i, sm smVar, ed1 ed1Var, ho2 ho2Var, v15 v15Var, ke7 ke7Var) {
        return Y0(ed1Var, ho2Var, i, smVar, ke7Var);
    }

    @Override // defpackage.jo2
    public final void N0(boolean z) {
        this.I0 = Boolean.valueOf(z);
    }

    @Override // defpackage.jo2
    public final void O0(boolean z) {
        this.J0 = Boolean.valueOf(z);
    }

    @Override // defpackage.gs0
    /* JADX INFO: renamed from: Q0 */
    public final /* bridge */ /* synthetic */ gs0 I0(int i, sm smVar, ed1 ed1Var, ho2 ho2Var, v15 v15Var, ke7 ke7Var) {
        return Y0(ed1Var, ho2Var, i, smVar, ke7Var);
    }

    public final yj3 Y0(ed1 ed1Var, ho2 ho2Var, int i, sm smVar, ke7 ke7Var) {
        if (ed1Var == null) {
            B(7);
            throw null;
        }
        if (i == 0) {
            B(8);
            throw null;
        }
        if (smVar == null) {
            B(9);
            throw null;
        }
        if (ke7Var == null) {
            B(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(ed1Var);
            String strE = p61.E(i);
            sb.append("\nkind: ");
            sb.append(strE);
            throw new IllegalStateException(sb.toString());
        }
        sx4 sx4Var = (sx4) ed1Var;
        yj3 yj3Var = (yj3) ho2Var;
        if (i == 0) {
            B(13);
            throw null;
        }
        yj3 yj3Var2 = new yj3(sx4Var, yj3Var, smVar, this.H0, i, ke7Var);
        Boolean bool = this.I0;
        bool.getClass();
        yj3Var2.I0 = bool;
        Boolean bool2 = this.J0;
        bool2.getClass();
        yj3Var2.J0 = bool2;
        return yj3Var2;
    }

    @Override // defpackage.xj3
    public final xj3 d0(t14 t14Var, ArrayList arrayList, t14 t14Var2, qg5 qg5Var) {
        yj3 yj3VarY0 = Y0(p(), null, r(), getAnnotations(), getSource());
        yj3VarY0.L0(t14Var == null ? null : z91.x(yj3VarY0, t14Var, oy1.f0), this.n0, d02.X, getTypeParameters(), xt7.b(arrayList, L(), yj3VarY0), t14Var2, m(), e());
        if (qg5Var != null) {
            yl1 yl1Var = (yl1) qg5Var.X;
            Object obj = qg5Var.Y;
            Map linkedHashMap = yj3VarY0.G0;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                yj3VarY0.G0 = linkedHashMap;
            }
            linkedHashMap.put(yl1Var, obj);
        }
        return yj3VarY0;
    }

    @Override // defpackage.jo2, defpackage.jd0
    public final boolean z() {
        return this.J0.booleanValue();
    }
}
