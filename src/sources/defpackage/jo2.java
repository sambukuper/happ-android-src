package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jo2 extends hd1 implements ho2 {
    public boolean A0;
    public Collection B0;
    public volatile c3 C0;
    public final ho2 D0;
    public final int E0;
    public ho2 F0;
    public Map G0;
    public List i0;
    public List j0;
    public t14 k0;
    public List l0;
    public i44 m0;
    public i44 n0;
    public fx4 o0;
    public fl1 p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo2(int i, sm smVar, ed1 ed1Var, ho2 ho2Var, v15 v15Var, ke7 ke7Var) {
        super(ed1Var, smVar, v15Var, ke7Var);
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
        if (ke7Var == null) {
            B(4);
            throw null;
        }
        this.p0 = gl1.i;
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
        this.t0 = false;
        this.u0 = false;
        this.v0 = false;
        this.w0 = false;
        this.x0 = false;
        this.y0 = false;
        this.z0 = true;
        this.A0 = false;
        this.B0 = null;
        this.C0 = null;
        this.F0 = null;
        this.G0 = null;
        this.D0 = ho2Var == null ? this : ho2Var;
        this.E0 = i;
    }

    public static /* synthetic */ void B(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static ArrayList K0(ho2 ho2Var, List list, wi8 wi8Var, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            B(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ot8 ot8Var = (ot8) it.next();
            t14 t14VarC = ot8Var.c();
            rt8 rt8Var = rt8.IN_VARIANCE;
            t14 t14VarH = wi8Var.h(t14VarC, rt8Var);
            t14 t14Var = ot8Var.n0;
            t14 t14VarH2 = t14Var == null ? null : wi8Var.h(t14Var, rt8Var);
            if (t14VarH == null) {
                return null;
            }
            if ((t14VarH != ot8Var.c() || t14Var != t14VarH2) && zArr != null) {
                zArr[0] = true;
            }
            f3 f3Var = ot8Var instanceof nt8 ? new f3((List) ((nt8) ot8Var).p0.getValue(), (byte) 24) : null;
            ot8 ot8Var2 = z ? null : ot8Var;
            int i = ot8Var.j0;
            sm annotations = ot8Var.getAnnotations();
            v15 name = ot8Var.getName();
            boolean zI0 = ot8Var.I0();
            boolean z3 = ot8Var.l0;
            boolean z4 = ot8Var.m0;
            ke7 source = z2 ? ot8Var.getSource() : ke7.G;
            annotations.getClass();
            name.getClass();
            source.getClass();
            arrayList.add(f3Var == null ? new ot8(ho2Var, ot8Var2, i, annotations, name, t14VarH, zI0, z3, z4, t14VarH2, source) : new nt8(ho2Var, ot8Var2, i, annotations, name, t14VarH, zI0, z3, z4, t14VarH2, source, f3Var));
        }
        return arrayList;
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return this.v0;
    }

    @Override // defpackage.ho2
    public boolean F() {
        return this.u0;
    }

    public final ho2 H0(ed1 ed1Var, fx4 fx4Var, fl1 fl1Var) {
        ho2 ho2VarBuild = i0().w(ed1Var).m(fx4Var).k(fl1Var).c(2).l().build();
        if (ho2VarBuild != null) {
            return ho2VarBuild;
        }
        B(26);
        throw null;
    }

    public abstract jo2 I0(int i, sm smVar, ed1 ed1Var, ho2 ho2Var, v15 v15Var, ke7 ke7Var);

    public Object J(id1 id1Var, Object obj) {
        return id1Var.o(this, obj);
    }

    public jo2 J0(io2 io2Var) {
        sm annotations;
        i44 i44Var;
        jo2 jo2Var;
        i44 i44Var2;
        t14 t14VarH;
        rt8 rt8Var = rt8.IN_VARIANCE;
        boolean[] zArr = new boolean[1];
        boolean z = false;
        if (io2Var.u0 != null) {
            annotations = getAnnotations();
            sm smVar = io2Var.u0;
            annotations.getClass();
            smVar.getClass();
            if (annotations.isEmpty()) {
                annotations = smVar;
            } else if (!smVar.isEmpty()) {
                annotations = new vm(new sm[]{annotations, smVar});
            }
        } else {
            annotations = getAnnotations();
        }
        sm smVar2 = annotations;
        ed1 ed1Var = io2Var.Y;
        ho2 ho2Var = io2Var.g0;
        int i = io2Var.h0;
        v15 v15Var = io2Var.n0;
        ke7 source = io2Var.q0 ? ((hd1) (ho2Var != null ? ho2Var : a())).getSource() : ke7.G;
        if (source == null) {
            B(27);
            throw null;
        }
        jo2 jo2VarI0 = I0(i, smVar2, ed1Var, ho2Var, v15Var, source);
        List typeParameters = io2Var.t0;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        wi8 wi8VarS = dh3.S(typeParameters, io2Var.X, jo2VarI0, arrayList, zArr);
        if (wi8VarS != null) {
            ArrayList arrayList2 = new ArrayList();
            if (!io2Var.j0.isEmpty()) {
                int i2 = 0;
                for (i44 i44Var3 : io2Var.j0) {
                    t14 t14VarH2 = wi8VarS.h(i44Var3.c(), rt8Var);
                    if (t14VarH2 != null) {
                        int i3 = i2 + 1;
                        arrayList2.add(z91.r(jo2VarI0, t14VarH2, ((g51) i44Var3.H0()).F0(), i44Var3.getAnnotations(), i2));
                        zArr[0] = zArr[0] | (t14VarH2 != i44Var3.c());
                        i2 = i3;
                    }
                }
            }
            i44 i44Var4 = io2Var.k0;
            if (i44Var4 != null) {
                t14 t14VarH3 = wi8VarS.h(i44Var4.c(), rt8Var);
                if (t14VarH3 != null) {
                    io2Var.k0.H0();
                    i44 i44Var5 = new i44(jo2VarI0, new o62(jo2VarI0, t14VarH3), io2Var.k0.getAnnotations());
                    zArr[0] = (t14VarH3 != io2Var.k0.c()) | zArr[0];
                    i44Var = i44Var5;
                }
                return null;
            }
            i44Var = null;
            i44 i44Var6 = io2Var.l0;
            if (i44Var6 != null) {
                i44 i44VarG = i44Var6.g(wi8VarS);
                if (i44VarG != null) {
                    zArr[0] = zArr[0] | (i44VarG != io2Var.l0);
                    jo2Var = null;
                    i44Var2 = i44VarG;
                }
                return null;
            }
            jo2Var = null;
            i44Var2 = null;
            ArrayList arrayListK0 = K0(jo2VarI0, io2Var.i0, wi8VarS, io2Var.r0, io2Var.q0, zArr);
            if (arrayListK0 == null || (t14VarH = wi8VarS.h(io2Var.m0, rt8.OUT_VARIANCE)) == null) {
                return jo2Var;
            }
            boolean z2 = zArr[0] | (t14VarH != io2Var.m0);
            zArr[0] = z2;
            if (!z2 && io2Var.y0) {
                return this;
            }
            jo2VarI0.L0(i44Var, i44Var2, arrayList2, arrayList, arrayListK0, t14VarH, io2Var.Z, io2Var.f0);
            jo2VarI0.q0 = this.q0;
            jo2VarI0.r0 = this.r0;
            jo2VarI0.s0 = this.s0;
            jo2VarI0.t0 = this.t0;
            jo2VarI0.u0 = this.u0;
            jo2VarI0.y0 = this.y0;
            jo2VarI0.v0 = this.v0;
            jo2VarI0.N0(this.z0);
            jo2VarI0.w0 = io2Var.s0;
            jo2VarI0.x0 = io2Var.v0;
            Boolean bool = io2Var.x0;
            jo2VarI0.O0(bool != null ? bool.booleanValue() : this.A0);
            if (!io2Var.w0.isEmpty() || this.G0 != null) {
                LinkedHashMap linkedHashMap = io2Var.w0;
                Map map = this.G0;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!linkedHashMap.containsKey(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (linkedHashMap.size() == 1) {
                    jo2VarI0.G0 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                } else {
                    jo2VarI0.G0 = linkedHashMap;
                }
            }
            if (io2Var.p0 || this.F0 != null) {
                ho2 ho2Var2 = this.F0;
                if (ho2Var2 == null) {
                    ho2Var2 = this;
                }
                jo2VarI0.F0 = ho2Var2.g(wi8VarS);
            }
            if (io2Var.o0 && !a().q().isEmpty()) {
                if (io2Var.X.e()) {
                    c3 c3Var = this.C0;
                    if (c3Var != null) {
                        jo2VarI0.C0 = c3Var;
                        return jo2VarI0;
                    }
                    jo2VarI0.e0(q());
                    return jo2VarI0;
                }
                jo2VarI0.C0 = new c3((byte) 13, this, wi8VarS, z);
            }
            return jo2VarI0;
        }
        return null;
    }

    @Override // defpackage.jd0
    public final List L() {
        List list = this.j0;
        if (list != null) {
            return list;
        }
        B(19);
        throw null;
    }

    public void L0(i44 i44Var, i44 i44Var2, List list, List list2, List list3, t14 t14Var, fx4 fx4Var, fl1 fl1Var) {
        if (list == null) {
            B(5);
            throw null;
        }
        if (list2 == null) {
            B(6);
            throw null;
        }
        if (list3 == null) {
            B(7);
            throw null;
        }
        if (fl1Var == null) {
            B(8);
            throw null;
        }
        this.i0 = wv0.Y0(list2);
        this.j0 = wv0.Y0(list3);
        this.k0 = t14Var;
        this.o0 = fx4Var;
        this.p0 = fl1Var;
        this.m0 = i44Var;
        this.n0 = i44Var2;
        this.l0 = list;
        for (int i = 0; i < list2.size(); i++) {
            hi8 hi8Var = (hi8) list2.get(i);
            if (hi8Var.getIndex() != i) {
                StringBuilder sb = new StringBuilder();
                sb.append(hi8Var);
                int index = hi8Var.getIndex();
                sb.append(" index is ");
                sb.append(index);
                sb.append(" but position is ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            ot8 ot8Var = (ot8) list3.get(i2);
            if (ot8Var.j0 != i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ot8Var);
                int i3 = ot8Var.j0;
                sb2.append("index is ");
                sb2.append(i3);
                sb2.append(" but position is ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final io2 M0(wi8 wi8Var) {
        if (wi8Var != null) {
            return new io2(this, wi8Var.a, p(), m(), e(), r(), L(), Y(), this.m0, j());
        }
        B(24);
        throw null;
    }

    public void N0(boolean z) {
        this.z0 = z;
    }

    @Override // defpackage.ho2
    public final ho2 O() {
        return this.F0;
    }

    public void O0(boolean z) {
        this.A0 = z;
    }

    @Override // defpackage.jd0
    public final i44 P() {
        return this.n0;
    }

    public final void P0(aa7 aa7Var) {
        if (aa7Var != null) {
            this.k0 = aa7Var;
        } else {
            B(11);
            throw null;
        }
    }

    @Override // defpackage.jd0
    public final i44 S() {
        return this.m0;
    }

    @Override // defpackage.jd0
    public final List Y() {
        List list = this.l0;
        if (list != null) {
            return list;
        }
        B(13);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ho2] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    public ho2 a() {
        ho2 ho2VarA;
        ho2 ho2Var = this.D0;
        ?? r1 = this;
        if (ho2Var != this) {
            ho2VarA = ho2Var.a();
        }
        if (r1 != 0) {
            r1 = ho2VarA;
            return r1;
        }
        r1 = ho2VarA;
        B(20);
        throw null;
    }

    @Override // defpackage.ho2
    public final boolean c0() {
        return this.w0;
    }

    @Override // defpackage.jd1, defpackage.ts4
    public final fl1 e() {
        fl1 fl1Var = this.p0;
        if (fl1Var != null) {
            return fl1Var;
        }
        B(16);
        throw null;
    }

    public void e0(Collection collection) {
        if (collection == null) {
            B(17);
            throw null;
        }
        this.B0 = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((ho2) it.next()).h0()) {
                this.x0 = true;
                return;
            }
        }
    }

    @Override // defpackage.ew7
    public ho2 g(wi8 wi8Var) {
        if (wi8Var == null) {
            B(22);
            throw null;
        }
        if (wi8Var.a.e()) {
            return this;
        }
        io2 io2VarM0 = M0(wi8Var);
        io2VarM0.g0 = a();
        io2VarM0.q0 = true;
        io2VarM0.y0 = true;
        return io2VarM0.z0.J0(io2VarM0);
    }

    @Override // defpackage.jd0
    public final List getTypeParameters() {
        List list = this.i0;
        if (list != null) {
            return list;
        }
        u52.r(this, "typeParameters == null for ");
        return null;
    }

    public boolean h() {
        return this.y0;
    }

    @Override // defpackage.ho2
    public final boolean h0() {
        return this.x0;
    }

    @Override // defpackage.ho2
    public boolean i() {
        return this.t0;
    }

    public go2 i0() {
        return M0(wi8.b);
    }

    @Override // defpackage.jd0
    public t14 j() {
        return this.k0;
    }

    @Override // defpackage.ts4
    public final boolean j0() {
        return false;
    }

    @Override // defpackage.ts4
    public boolean k() {
        return this.s0;
    }

    @Override // defpackage.ts4
    public final fx4 m() {
        fx4 fx4Var = this.o0;
        if (fx4Var != null) {
            return fx4Var;
        }
        B(15);
        throw null;
    }

    @Override // defpackage.ho2
    public final boolean o() {
        if (this.q0) {
            return true;
        }
        Iterator it = a().q().iterator();
        while (it.hasNext()) {
            if (((ho2) it.next()).o()) {
                return true;
            }
        }
        return false;
    }

    public Collection q() {
        c3 c3Var = this.C0;
        if (c3Var != null) {
            this.B0 = (Collection) c3Var.invoke();
            this.C0 = null;
        }
        Collection collection = this.B0;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        B(14);
        throw null;
    }

    @Override // defpackage.ld0
    public final int r() {
        int i = this.E0;
        if (i != 0) {
            return i;
        }
        B(21);
        throw null;
    }

    @Override // defpackage.ho2
    public final boolean s() {
        if (this.r0) {
            return true;
        }
        Iterator it = a().q().iterator();
        while (it.hasNext()) {
            if (((ho2) it.next()).s()) {
                return true;
            }
        }
        return false;
    }

    public Object v(yl1 yl1Var) {
        Map map = this.G0;
        if (map == null) {
            return null;
        }
        return map.get(yl1Var);
    }

    public boolean z() {
        return this.A0;
    }
}
