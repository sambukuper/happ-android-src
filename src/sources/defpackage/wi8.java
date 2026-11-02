package defpackage;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wi8 {
    public static final wi8 b = new wi8(ui8.a);
    public final ui8 a;

    public wi8(ui8 ui8Var) {
        this.a = ui8Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                                case 31:
                                case 32:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static rt8 b(rt8 rt8Var, rt8 rt8Var2) {
        if (rt8Var == null) {
            a(38);
            throw null;
        }
        if (rt8Var2 == null) {
            a(39);
            throw null;
        }
        rt8 rt8Var3 = rt8.INVARIANT;
        if (rt8Var == rt8Var3) {
            if (rt8Var2 != null) {
                return rt8Var2;
            }
            a(40);
            throw null;
        }
        if (rt8Var2 == rt8Var3) {
            if (rt8Var != null) {
                return rt8Var;
            }
            a(41);
            throw null;
        }
        if (rt8Var == rt8Var2) {
            if (rt8Var2 != null) {
                return rt8Var2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + rt8Var + "' and projection kind '" + rt8Var2 + "' cannot be combined");
    }

    public static int c(rt8 rt8Var, rt8 rt8Var2) {
        rt8 rt8Var3 = rt8.OUT_VARIANCE;
        rt8 rt8Var4 = rt8.IN_VARIANCE;
        if (rt8Var == rt8Var4 && rt8Var2 == rt8Var3) {
            return 3;
        }
        return (rt8Var == rt8Var3 && rt8Var2 == rt8Var4) ? 2 : 1;
    }

    public static wi8 d(t14 t14Var) {
        if (t14Var == null) {
            a(6);
            throw null;
        }
        return new wi8(nh8.b.a(t14Var.n0(), t14Var.l0()));
    }

    public static wi8 e(ui8 ui8Var, ui8 ui8Var2) {
        if (ui8Var == null) {
            a(3);
            throw null;
        }
        if (ui8Var2 == null) {
            a(4);
            throw null;
        }
        if (ui8Var.e()) {
            ui8Var = ui8Var2;
        } else if (!ui8Var2.e()) {
            ui8Var = new hp1(ui8Var, ui8Var2);
        }
        return new wi8(ui8Var);
    }

    public static String g(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (dh3.A(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final t14 f(t14 t14Var, rt8 rt8Var) {
        if (t14Var == null) {
            a(9);
            throw null;
        }
        if (this.a.e()) {
            return t14Var;
        }
        try {
            t14 t14VarB = i(new wg7(t14Var, rt8Var), null, 0).b();
            if (t14VarB != null) {
                return t14VarB;
            }
            a(12);
            throw null;
        } catch (vi8 e) {
            return u32.c(s32.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
        }
    }

    public final t14 h(t14 t14Var, rt8 rt8Var) {
        if (t14Var == null) {
            a(14);
            throw null;
        }
        if (rt8Var == null) {
            a(15);
            throw null;
        }
        ui8 ui8Var = this.a;
        ni8 wg7Var = new wg7(ui8Var.f(t14Var, rt8Var), rt8Var);
        if (!ui8Var.e()) {
            try {
                wg7Var = i(wg7Var, null, 0);
            } catch (vi8 unused) {
                wg7Var = null;
            }
        }
        if (ui8Var.a() || ui8Var.b()) {
            boolean zB = ui8Var.b();
            if (wg7Var == null) {
                wg7Var = null;
            } else if (!wg7Var.c()) {
                t14 t14VarB = wg7Var.b();
                t14VarB.getClass();
                if (cj8.c(t14VarB, ag.o0, null)) {
                    rt8 rt8VarA = wg7Var.a();
                    rt8VarA.getClass();
                    if (rt8VarA == rt8.OUT_VARIANCE) {
                        wg7Var = new wg7((t14) z51.l(t14VarB).b, rt8VarA);
                    } else if (zB) {
                        wg7Var = new wg7((t14) z51.l(t14VarB).a, rt8VarA);
                    } else {
                        ao0 ao0Var = new ao0();
                        wi8 wi8Var = new wi8(ao0Var);
                        if (!ao0Var.e()) {
                            try {
                                wg7Var = wi8Var.i(wg7Var, null, 0);
                            } catch (vi8 unused2) {
                                wg7Var = null;
                            }
                        }
                    }
                }
            }
        }
        if (wg7Var == null) {
            return null;
        }
        return wg7Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:105:0x0212  */
    /* JADX WARN: Code duplicated, block: B:107:0x021a  */
    /* JADX WARN: Code duplicated, block: B:108:0x021d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0220  */
    /* JADX WARN: Code duplicated, block: B:111:0x0223  */
    /* JADX WARN: Code duplicated, block: B:114:0x0228  */
    /* JADX WARN: Code duplicated, block: B:116:0x022c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0234  */
    /* JADX WARN: Code duplicated, block: B:120:0x0243  */
    /* JADX WARN: Code duplicated, block: B:125:0x0264  */
    /* JADX WARN: Code duplicated, block: B:127:0x0288  */
    /* JADX WARN: Code duplicated, block: B:129:0x028b  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0295  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x019e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ni8 i(ni8 ni8Var, hi8 hi8Var, int i) throws vi8 {
        byte b2;
        t14 t14VarB;
        rt8 rt8VarA;
        mo8 mo8VarQ0;
        g gVar;
        aa7 aa7Var;
        rt8 rt8Var;
        List listG;
        List listL0;
        ArrayList arrayList;
        boolean z;
        t14 t14VarE;
        hi8 hi8Var2;
        ni8 ni8Var2;
        ni8 ni8VarI;
        int iB;
        char c;
        wi8 wi8Var;
        nb3 nb3Var;
        int iC;
        zk zkVarQ0;
        p81 p81Var;
        t14 t14VarH;
        sm smVarC;
        int iB2;
        wi8 wi8Var2 = this;
        t14 t14VarH2 = null;
        if (ni8Var == null) {
            a(18);
            throw null;
        }
        ui8 ui8Var = wi8Var2.a;
        if (i > 100) {
            kp5.m("Recursion too deep. Most likely infinite loop while substituting ", g(ni8Var), "; substitution: ", g(ui8Var));
            return null;
        }
        if (!ni8Var.c()) {
            t14 t14VarB2 = ni8Var.b();
            if (t14VarB2 instanceof ej8) {
                ej8 ej8Var = (ej8) t14VarB2;
                mo8 origin = ej8Var.getOrigin();
                t14 t14VarB3 = ej8Var.B();
                ni8 ni8VarI2 = wi8Var2.i(new wg7(origin, ni8Var.a()), hi8Var, i + 1);
                return ni8VarI2.c() ? ni8VarI2 : new wg7(c18.h(ni8VarI2.b().q0(), wi8Var2.h(t14VarB3, ni8Var.a())), ni8VarI2.a());
            }
            t14VarB2.getClass();
            t14VarB2.q0();
            if (!(t14VarB2.q0() instanceof r66)) {
                ni8 ni8VarD = ui8Var.d(t14VarB2);
                if (ni8VarD == null) {
                    ni8VarD = null;
                } else if (t14VarB2.getAnnotations().k(tg7.y)) {
                    lh8 lh8VarN0 = ni8VarD.b().n0();
                    if (lh8VarN0 instanceof d45) {
                        ni8 ni8Var3 = ((d45) lh8VarN0).X;
                        rt8 rt8VarA2 = ni8Var3.a();
                        if (c(ni8Var.a(), rt8VarA2) == 3) {
                            ni8VarD = new wg7(ni8Var3.b());
                        } else if (hi8Var != null && c(hi8Var.D(), rt8VarA2) == 3) {
                            ni8VarD = new wg7(ni8Var3.b());
                        }
                    }
                }
                rt8 rt8VarA3 = ni8Var.a();
                int i2 = 0;
                if (ni8VarD == null && (t14VarB2.q0() instanceof ce2)) {
                    zk zkVarQ1 = t14VarB2.q0();
                    p81 p81Var2 = zkVarQ1 instanceof p81 ? (p81) zkVarQ1 : null;
                    if (!(p81Var2 != null ? p81Var2.g0() : false)) {
                        ce2 ce2Var = (ce2) t14VarB2.q0();
                        aa7 aa7Var2 = ce2Var.Z;
                        aa7 aa7Var3 = ce2Var.Y;
                        int i3 = i + 1;
                        ni8 ni8VarI3 = wi8Var2.i(new wg7(aa7Var3, rt8VarA3), hi8Var, i3);
                        ni8 ni8VarI4 = wi8Var2.i(new wg7(aa7Var2, rt8VarA3), hi8Var, i3);
                        rt8 rt8VarA4 = ni8VarI3.a();
                        if (ni8VarI3.b() != aa7Var3 || ni8VarI4.b() != aa7Var2) {
                            return new wg7(dh3.s(s08.a(ni8VarI3.b()), s08.a(ni8VarI4.b())), rt8VarA4);
                        }
                    } else if (!zz3.F(t14VarB2)) {
                        b2 = 2;
                        if (ni8VarD != null) {
                            iC = c(rt8VarA3, ni8VarD.a());
                            if (!(t14VarB2.n0() instanceof bo0)) {
                                iB2 = p61.B(iC);
                                if (iB2 != 1) {
                                    return new wg7(t14VarB2.n0().f().p(), rt8.OUT_VARIANCE);
                                }
                                if (iB2 == 2) {
                                    throw new vi8("Out-projection in in-position");
                                }
                            }
                            zkVarQ0 = t14VarB2.q0();
                            if (zkVarQ0 instanceof p81) {
                                p81Var = (p81) zkVarQ0;
                            } else {
                                p81Var = null;
                            }
                            if (p81Var != null) {
                                p81Var = null;
                            } else {
                                p81Var = null;
                            }
                            if (ni8VarD.c()) {
                                return ni8VarD;
                            }
                            if (p81Var != null) {
                                t14VarH = p81Var.f0(ni8VarD.b());
                            } else {
                                t14VarH = cj8.h(ni8VarD.b(), t14VarB2.o0());
                            }
                            if (!t14VarB2.getAnnotations().isEmpty()) {
                                smVarC = ui8Var.c(t14VarB2.getAnnotations());
                                if (smVarC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (smVarC.k(tg7.y)) {
                                    smVarC = new ia2(smVarC, new as5(b2));
                                }
                                t14VarH = y08.m(t14VarH, new vm(new sm[]{t14VarH.getAnnotations(), smVarC}));
                            }
                            if (iC == 1) {
                                rt8VarA3 = b(rt8VarA3, ni8VarD.a());
                            }
                            return new wg7(t14VarH, rt8VarA3);
                        }
                        t14VarB = ni8Var.b();
                        rt8VarA = ni8Var.a();
                        if (!(t14VarB.n0().x() instanceof hi8)) {
                            mo8VarQ0 = t14VarB.q0();
                            if (mo8VarQ0 instanceof g) {
                                gVar = (g) mo8VarQ0;
                            } else {
                                gVar = null;
                            }
                            if (gVar != null) {
                                aa7Var = gVar.Z;
                            } else {
                                aa7Var = null;
                            }
                            rt8Var = rt8.INVARIANT;
                            if (aa7Var != null) {
                                if (ui8Var instanceof nb3) {
                                    nb3Var = (nb3) ui8Var;
                                    if (nb3Var.d) {
                                        wi8Var = new wi8(new nb3(nb3Var.b, nb3Var.c, false));
                                    } else {
                                        wi8Var = wi8Var2;
                                    }
                                } else {
                                    wi8Var = wi8Var2;
                                }
                                t14VarH2 = wi8Var.h(aa7Var, rt8Var);
                            }
                            listG = t14VarB.n0().g();
                            listL0 = t14VarB.l0();
                            arrayList = new ArrayList(listG.size());
                            z = false;
                            while (i2 < listG.size()) {
                                hi8Var2 = (hi8) listG.get(i2);
                                ni8Var2 = (ni8) listL0.get(i2);
                                ni8VarI = wi8Var2.i(ni8Var2, hi8Var2, i + 1);
                                iB = p61.B(c(hi8Var2.D(), ni8VarI.a()));
                                if (iB != 0) {
                                    if (iB != 1) {
                                        c = 2;
                                        if (iB == 2) {
                                        }
                                    } else {
                                        c = 2;
                                    }
                                    ni8VarI = cj8.j(hi8Var2);
                                } else {
                                    c = 2;
                                    if (hi8Var2.D() != rt8Var) {
                                        ni8VarI = new wg7(ni8VarI.b(), rt8Var);
                                    }
                                }
                                if (ni8VarI != ni8Var2) {
                                    z = true;
                                }
                                arrayList.add(ni8VarI);
                                i2++;
                                wi8Var2 = this;
                            }
                            if (z) {
                                listL0 = arrayList;
                            }
                            sm smVarC2 = ui8Var.c(t14VarB.getAnnotations());
                            listL0.getClass();
                            smVarC2.getClass();
                            t14VarE = s08.e(t14VarB, listL0, smVarC2, 4);
                            if (t14VarE instanceof aa7) {
                                t14VarE = jm4.d0((aa7) t14VarE, (aa7) t14VarH2);
                            }
                            return new wg7(t14VarE, rt8VarA);
                        }
                    }
                } else if (!zz3.F(t14VarB2) && !vr3.J(t14VarB2)) {
                    b2 = 2;
                    if (ni8VarD != null) {
                        iC = c(rt8VarA3, ni8VarD.a());
                        if (!(t14VarB2.n0() instanceof bo0)) {
                            iB2 = p61.B(iC);
                            if (iB2 != 1) {
                                return new wg7(t14VarB2.n0().f().p(), rt8.OUT_VARIANCE);
                            }
                            if (iB2 == 2) {
                                throw new vi8("Out-projection in in-position");
                            }
                        }
                        zkVarQ0 = t14VarB2.q0();
                        if (zkVarQ0 instanceof p81) {
                            p81Var = (p81) zkVarQ0;
                        } else {
                            p81Var = null;
                        }
                        if (p81Var != null || !p81Var.g0()) {
                            p81Var = null;
                        }
                        if (ni8VarD.c()) {
                            return ni8VarD;
                        }
                        if (p81Var != null) {
                            t14VarH = p81Var.f0(ni8VarD.b());
                        } else {
                            t14VarH = cj8.h(ni8VarD.b(), t14VarB2.o0());
                        }
                        if (!t14VarB2.getAnnotations().isEmpty()) {
                            smVarC = ui8Var.c(t14VarB2.getAnnotations());
                            if (smVarC != null) {
                                a(33);
                                throw null;
                            }
                            if (smVarC.k(tg7.y)) {
                                smVarC = new ia2(smVarC, new as5(b2));
                            }
                            t14VarH = y08.m(t14VarH, new vm(new sm[]{t14VarH.getAnnotations(), smVarC}));
                        }
                        if (iC == 1) {
                            rt8VarA3 = b(rt8VarA3, ni8VarD.a());
                        }
                        return new wg7(t14VarH, rt8VarA3);
                    }
                    t14VarB = ni8Var.b();
                    rt8VarA = ni8Var.a();
                    if (!(t14VarB.n0().x() instanceof hi8)) {
                        mo8VarQ0 = t14VarB.q0();
                        if (mo8VarQ0 instanceof g) {
                            gVar = (g) mo8VarQ0;
                        } else {
                            gVar = null;
                        }
                        if (gVar != null) {
                            aa7Var = gVar.Z;
                        } else {
                            aa7Var = null;
                        }
                        rt8Var = rt8.INVARIANT;
                        if (aa7Var != null) {
                            if (ui8Var instanceof nb3) {
                                nb3Var = (nb3) ui8Var;
                                if (nb3Var.d) {
                                    wi8Var = wi8Var2;
                                } else {
                                    wi8Var = new wi8(new nb3(nb3Var.b, nb3Var.c, false));
                                }
                            } else {
                                wi8Var = wi8Var2;
                            }
                            t14VarH2 = wi8Var.h(aa7Var, rt8Var);
                        }
                        listG = t14VarB.n0().g();
                        listL0 = t14VarB.l0();
                        arrayList = new ArrayList(listG.size());
                        z = false;
                        while (i2 < listG.size()) {
                            hi8Var2 = (hi8) listG.get(i2);
                            ni8Var2 = (ni8) listL0.get(i2);
                            ni8VarI = wi8Var2.i(ni8Var2, hi8Var2, i + 1);
                            iB = p61.B(c(hi8Var2.D(), ni8VarI.a()));
                            if (iB != 0) {
                                if (iB != 1) {
                                    c = 2;
                                    if (iB == 2) {
                                    }
                                } else {
                                    c = 2;
                                }
                                ni8VarI = cj8.j(hi8Var2);
                            } else {
                                c = 2;
                                if (hi8Var2.D() != rt8Var && !ni8VarI.c()) {
                                    ni8VarI = new wg7(ni8VarI.b(), rt8Var);
                                }
                            }
                            if (ni8VarI != ni8Var2) {
                                z = true;
                            }
                            arrayList.add(ni8VarI);
                            i2++;
                            wi8Var2 = this;
                        }
                        if (z) {
                            listL0 = arrayList;
                        }
                        sm smVarC3 = ui8Var.c(t14VarB.getAnnotations());
                        listL0.getClass();
                        smVarC3.getClass();
                        t14VarE = s08.e(t14VarB, listL0, smVarC3, 4);
                        if ((t14VarE instanceof aa7) && (t14VarH2 instanceof aa7)) {
                            t14VarE = jm4.d0((aa7) t14VarE, (aa7) t14VarH2);
                        }
                        return new wg7(t14VarE, rt8VarA);
                    }
                }
            }
        }
        return ni8Var;
    }
}
