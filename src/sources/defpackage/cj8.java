package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.metrics.ConscryptStatsLog;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cj8 {
    public static final q32 a = u32.c(s32.DONT_CARE, new String[0]);
    public static final q32 b = u32.c(s32.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);
    public static final bj8 c = new bj8("NO_EXPECTED_TYPE");
    public static final bj8 d = new bj8("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
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
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(t14 t14Var) {
        if (t14Var == null) {
            a(28);
            throw null;
        }
        if (t14Var.o0()) {
            return true;
        }
        return (t14Var.q0() instanceof ce2) && b(((ce2) t14Var.q0()).Z);
    }

    public static boolean c(t14 t14Var, gn2 gn2Var, pc7 pc7Var) {
        if (t14Var == null) {
            return false;
        }
        mo8 mo8VarQ0 = t14Var.q0();
        if (l(t14Var)) {
            return ((Boolean) gn2Var.B(mo8VarQ0)).booleanValue();
        }
        if (pc7Var != null && pc7Var.contains(t14Var)) {
            return false;
        }
        if (((Boolean) gn2Var.B(mo8VarQ0)).booleanValue()) {
            return true;
        }
        if (pc7Var == null) {
            pc7Var = new pc7();
        }
        pc7Var.add(t14Var);
        ce2 ce2Var = mo8VarQ0 instanceof ce2 ? (ce2) mo8VarQ0 : null;
        if (ce2Var != null && (c(ce2Var.Y, gn2Var, pc7Var) || c(ce2Var.Z, gn2Var, pc7Var))) {
            return true;
        }
        if ((mo8VarQ0 instanceof hh1) && c(((hh1) mo8VarQ0).Y, gn2Var, pc7Var)) {
            return true;
        }
        lh8 lh8VarN0 = t14Var.n0();
        if (lh8VarN0 instanceof qg3) {
            Iterator it = ((qg3) lh8VarN0).Y.iterator();
            while (it.hasNext()) {
                if (c((t14) it.next(), gn2Var, pc7Var)) {
                    return true;
                }
            }
            return false;
        }
        for (ni8 ni8Var : t14Var.l0()) {
            if (!ni8Var.c() && c(ni8Var.b(), gn2Var, pc7Var)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new wg7(((hi8) it.next()).X()));
        }
        return wv0.Y0(arrayList);
    }

    public static boolean e(t14 t14Var) {
        if (t14Var == null) {
            a(27);
            throw null;
        }
        if (!t14Var.o0() && (!(t14Var.q0() instanceof ce2) || !e(((ce2) t14Var.q0()).Z))) {
            if (!(t14Var.q0() instanceof hh1)) {
                if (f(t14Var)) {
                    if (!(t14Var.n0().x() instanceof sx4)) {
                        wi8 wi8VarD = wi8.d(t14Var);
                        Collection<t14> collectionC = t14Var.n0().c();
                        ArrayList arrayList = new ArrayList(collectionC.size());
                        for (t14 t14Var2 : collectionC) {
                            if (t14Var2 == null) {
                                a(21);
                                throw null;
                            }
                            t14 t14VarH = wi8VarD.h(t14Var2, rt8.INVARIANT);
                            t14 t14VarH2 = t14VarH != null ? h(t14VarH, t14Var.o0()) : null;
                            if (t14VarH2 != null) {
                                arrayList.add(t14VarH2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((t14) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                lh8 lh8VarN0 = t14Var.n0();
                if (lh8VarN0 instanceof qg3) {
                    Iterator it2 = ((qg3) lh8VarN0).Y.iterator();
                    while (it2.hasNext()) {
                        if (e((t14) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(t14 t14Var) {
        if (t14Var == null) {
            a(60);
            throw null;
        }
        if ((t14Var.n0().x() instanceof hi8 ? (hi8) t14Var.n0().x() : null) != null) {
            return true;
        }
        t14Var.n0();
        return false;
    }

    public static mo8 g(t14 t14Var, boolean z) {
        if (t14Var == null) {
            a(3);
            throw null;
        }
        mo8 mo8VarR0 = t14Var.q0().r0(z);
        if (mo8VarR0 != null) {
            return mo8VarR0;
        }
        a(4);
        throw null;
    }

    public static t14 h(t14 t14Var, boolean z) {
        if (t14Var != null) {
            return z ? g(t14Var, true) : t14Var;
        }
        a(8);
        throw null;
    }

    public static aa7 i(aa7 aa7Var, boolean z) {
        if (aa7Var == null) {
            a(5);
            throw null;
        }
        if (!z) {
            return aa7Var;
        }
        aa7 aa7VarU0 = aa7Var.r0(true);
        if (aa7VarU0 != null) {
            return aa7VarU0;
        }
        a(6);
        throw null;
    }

    public static wg7 j(hi8 hi8Var) {
        if (hi8Var != null) {
            return new wg7(hi8Var);
        }
        a(45);
        throw null;
    }

    public static ni8 k(hi8 hi8Var, nl3 nl3Var) {
        if (hi8Var != null) {
            return nl3Var.a == zi8.X ? new wg7(os4.O(hi8Var)) : new wg7(hi8Var);
        }
        a(46);
        throw null;
    }

    public static boolean l(t14 t14Var) {
        if (t14Var != null) {
            return t14Var == c || t14Var == d;
        }
        a(0);
        throw null;
    }
}
