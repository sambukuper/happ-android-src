package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class gx5 extends qt8 implements fx5 {
    public hx5 A0;
    public tx5 B0;
    public y82 C0;
    public y82 D0;
    public final boolean j0;
    public se4 k0;
    public dn2 l0;
    public final fx4 m0;
    public fl1 n0;
    public Collection o0;
    public final fx5 p0;
    public final int q0;
    public final boolean r0;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public List w0;
    public i44 x0;
    public i44 y0;
    public ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx5(ed1 ed1Var, fx5 fx5Var, sm smVar, fx4 fx4Var, fl1 fl1Var, boolean z, v15 v15Var, int i, ke7 ke7Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(ed1Var, smVar, v15Var, null, ke7Var);
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
        if (i == 0) {
            B(5);
            throw null;
        }
        if (ke7Var == null) {
            B(6);
            throw null;
        }
        this.j0 = z;
        this.o0 = null;
        this.w0 = Collections.EMPTY_LIST;
        this.m0 = fx4Var;
        this.n0 = fl1Var;
        this.p0 = fx5Var == null ? this : fx5Var;
        this.q0 = i;
        this.r0 = z2;
        this.s0 = z3;
        this.t0 = z4;
        this.u0 = z5;
        this.v0 = z6;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void B(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static gx5 I0(ed1 ed1Var, fx4 fx4Var, fl1 fl1Var, boolean z, v15 v15Var, int i, ke7 ke7Var) {
        rm rmVar = oy1.f0;
        if (ed1Var == null) {
            B(7);
            throw null;
        }
        if (fl1Var == null) {
            B(10);
            throw null;
        }
        if (v15Var == null) {
            B(11);
            throw null;
        }
        if (i == 0) {
            B(12);
            throw null;
        }
        if (ke7Var != null) {
            return new gx5(ed1Var, null, rmVar, fx4Var, fl1Var, z, v15Var, i, ke7Var, false, false, false, false, false);
        }
        B(13);
        throw null;
    }

    public static ho2 K0(wi8 wi8Var, cx5 cx5Var) {
        if (cx5Var == null) {
            B(31);
            throw null;
        }
        ho2 ho2Var = cx5Var.p0;
        if (ho2Var != null) {
            return ho2Var.g(wi8Var);
        }
        return null;
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return this.t0;
    }

    @Override // defpackage.fx5
    public final boolean E() {
        return this.v0;
    }

    @Override // defpackage.pt8
    public final s21 H() {
        se4 se4Var = this.k0;
        if (se4Var != null) {
            return (s21) se4Var.invoke();
        }
        return null;
    }

    @Override // defpackage.ld0
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final gx5 I(ed1 ed1Var, fx4 fx4Var, fl1 fl1Var) {
        x7 x7Var = new x7(this);
        x7Var.c = ed1Var;
        x7Var.f = null;
        x7Var.d = fx4Var;
        if (fl1Var != null) {
            x7Var.e = fl1Var;
            x7Var.a = 2;
            x7Var.b = false;
            gx5 gx5VarA = x7Var.a();
            if (gx5VarA != null) {
                return gx5VarA;
            }
            B(42);
            throw null;
        }
        Object[] objArr = new Object[3];
        switch (8) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        switch (8) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.n(this, obj);
    }

    public gx5 J0(ed1 ed1Var, fx4 fx4Var, fl1 fl1Var, fx5 fx5Var, int i, v15 v15Var) {
        if (ed1Var == null) {
            B(32);
            throw null;
        }
        if (fx4Var == null) {
            B(33);
            throw null;
        }
        if (fl1Var == null) {
            B(34);
            throw null;
        }
        if (i == 0) {
            B(35);
            throw null;
        }
        if (v15Var == null) {
            B(36);
            throw null;
        }
        return new gx5(ed1Var, fx5Var, getAnnotations(), fx4Var, fl1Var, this.j0, v15Var, i, ke7.G, this.r0, w(), this.t0, k(), this.v0);
    }

    public final void L0(hx5 hx5Var, tx5 tx5Var, y82 y82Var, y82 y82Var2) {
        this.A0 = hx5Var;
        this.B0 = tx5Var;
        this.C0 = y82Var;
        this.D0 = y82Var2;
    }

    public final void M0(se4 se4Var, dn2 dn2Var) {
        if (dn2Var == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.l0 = dn2Var;
        if (se4Var == null) {
            se4Var = (se4) dn2Var.invoke();
        }
        this.k0 = se4Var;
    }

    public final void O0(t14 t14Var, List list, i44 i44Var, i44 i44Var2, List list2) {
        if (t14Var == null) {
            B(17);
            throw null;
        }
        if (list == null) {
            B(18);
            throw null;
        }
        if (list2 == null) {
            B(19);
            throw null;
        }
        this.i0 = t14Var;
        this.z0 = new ArrayList(list);
        this.y0 = i44Var2;
        this.x0 = i44Var;
        this.w0 = list2;
    }

    @Override // defpackage.jd0
    public final i44 P() {
        return this.x0;
    }

    @Override // defpackage.pt8
    public final boolean R() {
        return this.j0;
    }

    @Override // defpackage.qt8, defpackage.jd0
    public final i44 S() {
        return this.y0;
    }

    @Override // defpackage.fx5
    public final y82 T() {
        return this.D0;
    }

    @Override // defpackage.fx5
    public final y82 V() {
        return this.C0;
    }

    @Override // defpackage.qt8, defpackage.jd0
    public final List Y() {
        List list = this.w0;
        if (list != null) {
            return list;
        }
        B(22);
        throw null;
    }

    @Override // defpackage.pt8
    public final boolean Z() {
        return this.r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [fx5] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    public final fx5 a() {
        fx5 fx5VarA;
        fx5 fx5Var = this.p0;
        ?? r1 = this;
        if (fx5Var != this) {
            fx5VarA = fx5Var.a();
        }
        if (r1 != 0) {
            r1 = fx5VarA;
            return r1;
        }
        r1 = fx5VarA;
        B(38);
        throw null;
    }

    @Override // defpackage.fx5
    public final hx5 b() {
        return this.A0;
    }

    @Override // defpackage.fx5
    public final tx5 d() {
        return this.B0;
    }

    @Override // defpackage.jd1, defpackage.ts4
    public final fl1 e() {
        fl1 fl1Var = this.n0;
        if (fl1Var != null) {
            return fl1Var;
        }
        B(25);
        throw null;
    }

    @Override // defpackage.ld0
    public final void e0(Collection collection) {
        if (collection != null) {
            this.o0 = collection;
        } else {
            B(40);
            throw null;
        }
    }

    @Override // defpackage.ew7
    public final fx5 g(wi8 wi8Var) {
        if (wi8Var == null) {
            B(27);
            throw null;
        }
        ui8 ui8Var = wi8Var.a;
        if (ui8Var.e()) {
            return this;
        }
        x7 x7Var = new x7(this);
        x7Var.g = ui8Var;
        x7Var.f = a();
        return x7Var.a();
    }

    @Override // defpackage.qt8, defpackage.jd0
    public final List getTypeParameters() {
        ArrayList arrayList = this.z0;
        if (arrayList != null) {
            return arrayList;
        }
        u52.r(this, "typeParameters == null for ");
        return null;
    }

    @Override // defpackage.qt8, defpackage.jd0
    public final t14 j() {
        t14 t14VarC = c();
        if (t14VarC != null) {
            return t14VarC;
        }
        B(23);
        throw null;
    }

    @Override // defpackage.ts4
    public final boolean j0() {
        return false;
    }

    @Override // defpackage.ts4
    public boolean k() {
        return this.u0;
    }

    @Override // defpackage.ts4
    public final fx4 m() {
        fx4 fx4Var = this.m0;
        if (fx4Var != null) {
            return fx4Var;
        }
        B(24);
        throw null;
    }

    @Override // defpackage.jd0
    public final Collection q() {
        Collection collection = this.o0;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        B(41);
        throw null;
    }

    @Override // defpackage.ld0
    public final int r() {
        int i = this.q0;
        if (i != 0) {
            return i;
        }
        B(39);
        throw null;
    }

    @Override // defpackage.fx5
    public final ArrayList u() {
        ArrayList arrayList = new ArrayList(2);
        hx5 hx5Var = this.A0;
        if (hx5Var != null) {
            arrayList.add(hx5Var);
        }
        tx5 tx5Var = this.B0;
        if (tx5Var != null) {
            arrayList.add(tx5Var);
        }
        return arrayList;
    }

    public Object v(yl1 yl1Var) {
        return null;
    }

    public boolean w() {
        return this.s0;
    }

    public void N0(t14 t14Var) {
    }
}
