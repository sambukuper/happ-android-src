package defpackage;

import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class gl3 extends gx5 implements xj3 {
    public final boolean E0;
    public final qg5 F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl3(ed1 ed1Var, sm smVar, fx4 fx4Var, fl1 fl1Var, boolean z, v15 v15Var, ke7 ke7Var, fx5 fx5Var, int i, boolean z2, qg5 qg5Var) {
        super(ed1Var, fx5Var, smVar, fx4Var, fl1Var, z, v15Var, i, ke7Var, false, false, false, false, false);
        if (ed1Var == null) {
            B(0);
            throw null;
        }
        if (smVar == null) {
            B(1);
            throw null;
        }
        if (fx4Var == null) {
            B(2);
            throw null;
        }
        if (fl1Var == null) {
            B(3);
            throw null;
        }
        if (v15Var == null) {
            B(4);
            throw null;
        }
        if (ke7Var == null) {
            B(5);
            throw null;
        }
        if (i == 0) {
            B(6);
            throw null;
        }
        this.E0 = z2;
        this.F0 = qg5Var;
    }

    public static /* synthetic */ void B(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static gl3 P0(ed1 ed1Var, n44 n44Var, fl1 fl1Var, boolean z, v15 v15Var, hr6 hr6Var, boolean z2) {
        if (ed1Var == null) {
            B(7);
            throw null;
        }
        if (v15Var != null) {
            return new gl3(ed1Var, n44Var, fx4.Y, fl1Var, z, v15Var, hr6Var, null, 1, z2, null);
        }
        B(11);
        throw null;
    }

    @Override // defpackage.gx5
    public final gx5 J0(ed1 ed1Var, fx4 fx4Var, fl1 fl1Var, fx5 fx5Var, int i, v15 v15Var) {
        if (ed1Var == null) {
            B(13);
            throw null;
        }
        if (fx4Var == null) {
            B(14);
            throw null;
        }
        if (fl1Var == null) {
            B(15);
            throw null;
        }
        if (i == 0) {
            B(16);
            throw null;
        }
        if (v15Var == null) {
            B(17);
            throw null;
        }
        return new gl3(ed1Var, getAnnotations(), fx4Var, fl1Var, this.j0, v15Var, ke7.G, fx5Var, i, this.E0, this.F0);
    }

    @Override // defpackage.xj3
    public final xj3 d0(t14 t14Var, ArrayList arrayList, t14 t14Var2, qg5 qg5Var) {
        t14 t14Var3;
        hx5 hx5Var;
        tx5 tx5Var;
        fx5 fx5VarA = a() == this ? null : a();
        gl3 gl3Var = new gl3(p(), getAnnotations(), m(), e(), this.j0, getName(), getSource(), fx5VarA, r(), this.E0, qg5Var);
        hx5 hx5Var2 = this.A0;
        if (hx5Var2 != null) {
            hx5 hx5Var3 = new hx5(gl3Var, hx5Var2.getAnnotations(), hx5Var2.m(), hx5Var2.e(), hx5Var2.i0, hx5Var2.j0, hx5Var2.m0, r(), fx5VarA == null ? null : fx5VarA.b(), hx5Var2.getSource());
            hx5Var3.p0 = hx5Var2.p0;
            t14Var3 = t14Var2;
            hx5Var3.q0 = t14Var3;
            hx5Var = hx5Var3;
        } else {
            t14Var3 = t14Var2;
            hx5Var = null;
        }
        tx5 tx5Var2 = this.B0;
        if (tx5Var2 != null) {
            tx5Var = new tx5(gl3Var, tx5Var2.getAnnotations(), tx5Var2.m(), tx5Var2.e(), tx5Var2.i0, tx5Var2.j0, tx5Var2.m0, r(), fx5VarA == null ? null : fx5VarA.d(), tx5Var2.getSource());
            tx5Var.p0 = tx5Var.p0;
            ot8 ot8Var = (ot8) tx5Var2.L().get(0);
            if (ot8Var == null) {
                tx5.B(6);
                throw null;
            }
            tx5Var.q0 = ot8Var;
        } else {
            tx5Var = null;
        }
        gl3Var.L0(hx5Var, tx5Var, this.C0, this.D0);
        dn2 dn2Var = this.l0;
        if (dn2Var != null) {
            gl3Var.M0(this.k0, dn2Var);
        }
        gl3Var.e0(q());
        gl3Var.O0(t14Var3, getTypeParameters(), this.x0, t14Var != null ? z91.x(this, t14Var, oy1.f0) : null, d02.X);
        return gl3Var;
    }

    @Override // defpackage.gx5, defpackage.jd0
    public final Object v(yl1 yl1Var) {
        qg5 qg5Var = this.F0;
        if (qg5Var == null || !((yl1) qg5Var.X).equals(yl1Var)) {
            return null;
        }
        return qg5Var.Y;
    }

    @Override // defpackage.gx5, defpackage.pt8
    public final boolean w() {
        t14 t14VarC = c();
        if (!this.E0) {
            return false;
        }
        t14VarC.getClass();
        if (((!zz3.H(t14VarC) && !ho8.a(t14VarC)) || cj8.e(t14VarC)) && !zz3.I(t14VarC)) {
            return false;
        }
        vm vmVar = th8.a;
        fk2 fk2Var = ks3.q;
        fk2Var.getClass();
        return !z68.Q(t14VarC, fk2Var) || zz3.I(t14VarC);
    }

    @Override // defpackage.qt8, defpackage.jd0
    public final boolean z() {
        return false;
    }

    @Override // defpackage.gx5
    public final void N0(t14 t14Var) {
    }
}
