package defpackage;

import io.sentry.c2;
import io.sentry.util.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.HpkeSuite;
import org.conscrypt.metrics.ConscryptStatsLog;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hf5 {
    public static final List b = wv0.Y0(ServiceLoader.load(f72.class, f72.class.getClassLoader()));
    public static final hf5 c;
    public static final g55 d;
    public final u14 a;

    static {
        g55 g55Var = new g55((byte) 1);
        d = g55Var;
        c = new hf5(g55Var);
    }

    public hf5(u14 u14Var) {
        if (u14Var != null) {
            this.a = u14Var;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
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
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                objArr[0] = "overrider";
                break;
            case 98:
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i == 11 || i == 12) {
            objArr[1] = "filterOverrides";
        } else if (i == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i) {
                        case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i) {
                        case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
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

    public static boolean b(t14 t14Var, t14 t14Var2, jh8 jh8Var) {
        if (t14Var == null) {
            a(44);
            throw null;
        }
        if (t14Var2 == null) {
            a(45);
            throw null;
        }
        if (vr3.J(t14Var) && vr3.J(t14Var2)) {
            return true;
        }
        return oy1.v(jh8Var, t14Var.q0(), t14Var2.q0());
    }

    public static void c(ld0 ld0Var, LinkedHashSet linkedHashSet) {
        if (ld0Var == null) {
            a(17);
            throw null;
        }
        if (ld0Var.r() != 2) {
            linkedHashSet.add(ld0Var);
        } else {
            if (ld0Var.q().isEmpty()) {
                u52.r(ld0Var, "No overridden descriptors found for (fake override) ");
                return;
            }
            Iterator it = ld0Var.q().iterator();
            while (it.hasNext()) {
                c((ld0) it.next(), linkedHashSet);
            }
        }
    }

    public static ArrayList d(jd0 jd0Var) {
        i44 i44VarS = jd0Var.S();
        ArrayList arrayList = new ArrayList();
        if (i44VarS != null) {
            arrayList.add(i44VarS.c());
        }
        Iterator it = jd0Var.L().iterator();
        while (it.hasNext()) {
            arrayList.add(((ot8) it.next()).c());
        }
        return arrayList;
    }

    public static void e(Collection collection, sx4 sx4Var, z51 z51Var) {
        fx4 fx4VarM;
        fx4 fx4Var;
        if (collection == null) {
            a(83);
            throw null;
        }
        if (sx4Var == null) {
            a(84);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            ld0 ld0Var = (ld0) obj;
            if (!gl1.e(ld0Var.e()) && gl1.f(ld0Var, sx4Var)) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        if (!zIsEmpty) {
            collection = arrayList;
        }
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                boolean zC = sx4Var.C();
                fx4 fx4Var2 = fx4.g0;
                if (zC && sx4Var.m() != fx4Var2 && sx4Var.m() != fx4.Z) {
                    z = true;
                }
                if (z2 && !z3) {
                    fx4Var = fx4.f0;
                    break;
                }
                if (z2 || !z3) {
                    HashSet<ld0> hashSet = new HashSet();
                    for (ld0 ld0Var2 : collection) {
                        if (ld0Var2 == null) {
                            a(15);
                            throw null;
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        c(ld0Var2, linkedHashSet);
                        hashSet.addAll(linkedHashSet);
                    }
                    if (!hashSet.isEmpty()) {
                        ed1 ed1Var = (ed1) hashSet.iterator().next();
                        int i = el1.a;
                        ed1Var.getClass();
                        vx4 vx4VarC = bl1.c(ed1Var);
                        vx4VarC.getClass();
                        if (vx4VarC.W(a24.a) != null) {
                            c2.m();
                            return;
                        }
                    }
                    if (hashSet.size() > 1) {
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        for (Object obj2 : hashSet) {
                            Iterator it2 = linkedHashSet2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    linkedHashSet2.add(obj2);
                                    break;
                                }
                                jd0 jd0Var = (jd0) obj2;
                                jd0 jd0Var2 = (jd0) it2.next();
                                if (!q(jd0Var, jd0Var2)) {
                                    if (q(jd0Var2, jd0Var)) {
                                        break;
                                    }
                                } else {
                                    it2.remove();
                                }
                            }
                        }
                        hashSet = linkedHashSet2;
                    }
                    fx4 fx4VarM2 = sx4Var.m();
                    if (fx4VarM2 == null) {
                        a(92);
                        throw null;
                    }
                    fx4VarM = fx4Var2;
                    for (ld0 ld0Var3 : hashSet) {
                        fx4 fx4VarM3 = (z && ld0Var3.m() == fx4Var2) ? fx4VarM2 : ld0Var3.m();
                        if (fx4VarM3.compareTo(fx4VarM) < 0) {
                            fx4VarM = fx4VarM3;
                        }
                    }
                } else {
                    fx4VarM = z ? sx4Var.m() : fx4Var2;
                    if (fx4VarM == null) {
                        a(90);
                        throw null;
                    }
                }
                fx4Var = fx4VarM;
                break;
            }
            ld0 ld0Var4 = (ld0) it.next();
            int iOrdinal = ld0Var4.m().ordinal();
            if (iOrdinal == 0) {
                fx4Var = fx4.Y;
                break;
            } else if (iOrdinal == 1) {
                u52.r(ld0Var4, "Member cannot have SEALED modality: ");
                return;
            } else if (iOrdinal == 2) {
                z2 = true;
            } else if (iOrdinal == 3) {
                z3 = true;
            }
        }
        ld0 ld0VarI = ((ld0) s(collection, new ve7((byte) 16))).I(sx4Var, fx4Var, zIsEmpty ? gl1.h : gl1.g);
        z51Var.T(ld0VarI, collection);
        z51Var.k(ld0VarI);
    }

    public static ArrayList g(Object obj, LinkedList linkedList, gn2 gn2Var, gn2 gn2Var2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        jd0 jd0Var = (jd0) gn2Var.B(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            jd0 jd0Var2 = (jd0) gn2Var.B(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(jd0Var, jd0Var2);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    gn2Var2.B(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static gf5 i(jd0 jd0Var, jd0 jd0Var2) {
        boolean z;
        gf5 gf5VarC;
        if (jd0Var == null) {
            a(38);
            throw null;
        }
        if (jd0Var2 == null) {
            a(39);
            throw null;
        }
        boolean z2 = jd0Var instanceof ho2;
        if ((z2 && !(jd0Var2 instanceof ho2)) || (((z = jd0Var instanceof fx5)) && !(jd0Var2 instanceof fx5))) {
            return gf5.c("Member kind mismatch");
        }
        if (!z2 && !z) {
            u52.j(jd0Var, "This type of CallableDescriptor cannot be checked for overridability: ");
            return null;
        }
        if (!jd0Var.getName().equals(jd0Var2.getName())) {
            return gf5.c("Name mismatch");
        }
        if ((jd0Var.S() == null) != (jd0Var2.S() == null)) {
            gf5VarC = gf5.c("Receiver presence mismatch");
        } else {
            gf5VarC = jd0Var.L().size() != jd0Var2.L().size() ? gf5.c("Value parameter number mismatch") : null;
        }
        if (gf5VarC != null) {
            return gf5VarC;
        }
        return null;
    }

    public static int j(jd0 jd0Var, jd0 jd0Var2) {
        hf5 hf5Var = c;
        int iB = hf5Var.l(jd0Var2, jd0Var, null).b();
        int iB2 = hf5Var.m(jd0Var, jd0Var2, null, false).b();
        if (iB == 1 && iB2 == 1) {
            return 1;
        }
        return (iB == 3 || iB2 == 3) ? 3 : 2;
    }

    public static boolean k(jd0 jd0Var, jd0 jd0Var2) {
        if (jd0Var == null) {
            a(65);
            throw null;
        }
        if (jd0Var2 == null) {
            a(66);
            throw null;
        }
        t14 t14VarJ = jd0Var.j();
        t14 t14VarJ2 = jd0Var2.j();
        if (p(jd0Var, jd0Var2)) {
            jh8 jh8VarF = c.f(jd0Var.getTypeParameters(), jd0Var2.getTypeParameters());
            if (jd0Var instanceof ho2) {
                return o(jd0Var, t14VarJ, jd0Var2, t14VarJ2, jh8VarF);
            }
            if (!(jd0Var instanceof fx5)) {
                c.a(jd0Var.getClass(), "Unexpected callable: ");
                return false;
            }
            fx5 fx5Var = (fx5) jd0Var;
            fx5 fx5Var2 = (fx5) jd0Var2;
            tx5 tx5VarD = fx5Var.d();
            tx5 tx5VarD2 = fx5Var2.d();
            if ((tx5VarD == null || tx5VarD2 == null) ? true : p(tx5VarD, tx5VarD2)) {
                if (fx5Var.R() && fx5Var2.R()) {
                    return oy1.v(jh8VarF, t14VarJ.q0(), t14VarJ2.q0());
                }
                if ((fx5Var.R() || !fx5Var2.R()) && o(jd0Var, t14VarJ, jd0Var2, t14VarJ2, jh8VarF)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(jd0 jd0Var, t14 t14Var, jd0 jd0Var2, t14 t14Var2, jh8 jh8Var) {
        if (jd0Var == null) {
            a(71);
            throw null;
        }
        if (t14Var == null) {
            a(72);
            throw null;
        }
        if (jd0Var2 == null) {
            a(73);
            throw null;
        }
        if (t14Var2 == null) {
            a(74);
            throw null;
        }
        mo8 mo8VarQ0 = t14Var.q0();
        mo8 mo8VarQ1 = t14Var2.q0();
        xi8 xi8Var = jh8Var.c;
        if (mo8VarQ0 == mo8VarQ1) {
            return true;
        }
        rn2 rn2VarP = xi8Var.P();
        Boolean bool = rn2VarP != null ? (Boolean) rn2VarP.K(mo8VarQ0, mo8VarQ1) : null;
        return bool != null ? bool.booleanValue() : oy1.Y.u(jh8Var, xi8Var, mo8VarQ0, mo8VarQ1);
    }

    public static boolean p(jd0 jd0Var, jd0 jd0Var2) {
        Integer numB = gl1.b(jd0Var.e(), jd0Var2.e());
        return numB == null || numB.intValue() >= 0;
    }

    public static boolean q(jd0 jd0Var, jd0 jd0Var2) {
        pz2 pz2Var = pz2.H0;
        if (jd0Var == null) {
            a(13);
            throw null;
        }
        if (jd0Var2 == null) {
            a(14);
            throw null;
        }
        if (!jd0Var.equals(jd0Var2) && pz2Var.f(jd0Var.a(), jd0Var2.a(), false)) {
            return true;
        }
        jd0 jd0VarA = jd0Var2.a();
        int i = bl1.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        bl1.b(jd0Var.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (pz2Var.f(jd0VarA, (jd0) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(ld0 ld0Var, gn2 gn2Var) {
        fl1 fl1Var;
        fl1 fl1VarG;
        fl1 fl1Var2;
        if (ld0Var == null) {
            a(105);
            throw null;
        }
        for (ld0 ld0Var2 : ld0Var.q()) {
            if (ld0Var2.e() == gl1.g) {
                r(ld0Var2, gn2Var);
            }
        }
        if (ld0Var.e() != gl1.g) {
            return;
        }
        Collection<ld0> collectionQ = ld0Var.q();
        if (collectionQ == null) {
            a(107);
            throw null;
        }
        if (!collectionQ.isEmpty()) {
            Iterator it = collectionQ.iterator();
            loop3: while (true) {
                fl1Var = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    fl1 fl1VarE = ((ld0) it.next()).e();
                    if (fl1Var != null) {
                        Integer numB = gl1.b(fl1VarE, fl1Var);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    fl1Var = fl1VarE;
                }
            }
            if (fl1Var == null) {
                fl1VarG = null;
                break;
            }
            Iterator it2 = collectionQ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    fl1VarG = fl1Var;
                    break;
                }
                Integer numB2 = gl1.b(fl1Var, ((ld0) it2.next()).e());
                if (numB2 == null || numB2.intValue() < 0) {
                    fl1VarG = null;
                    break;
                }
            }
        } else {
            fl1VarG = gl1.j;
        }
        if (fl1VarG == null) {
            fl1VarG = null;
            break;
        }
        if (ld0Var.r() == 2) {
            for (ld0 ld0Var3 : collectionQ) {
                if (ld0Var3.m() != fx4.g0 && !ld0Var3.e().equals(fl1VarG)) {
                    fl1VarG = null;
                    break;
                }
            }
        } else {
            fl1VarG = gl1.g(fl1VarG.a.k());
        }
        if (fl1VarG == null) {
            if (gn2Var != null) {
                gn2Var.B(ld0Var);
            }
            fl1Var2 = gl1.e;
        } else {
            fl1Var2 = fl1VarG;
        }
        if (ld0Var instanceof gx5) {
            gx5 gx5Var = (gx5) ld0Var;
            if (fl1Var2 == null) {
                gx5.B(20);
                throw null;
            }
            gx5Var.n0 = fl1Var2;
            Iterator it3 = ((fx5) ld0Var).u().iterator();
            while (it3.hasNext()) {
                r((cx5) it3.next(), fl1VarG == null ? null : gn2Var);
            }
            return;
        }
        if (ld0Var instanceof jo2) {
            jo2 jo2Var = (jo2) ld0Var;
            if (fl1Var2 != null) {
                jo2Var.p0 = fl1Var2;
                return;
            } else {
                jo2.B(10);
                throw null;
            }
        }
        cx5 cx5Var = (cx5) ld0Var;
        cx5Var.o0 = fl1Var2;
        if (fl1Var2 != cx5Var.l0.e()) {
            cx5Var.i0 = false;
        }
    }

    public static Object s(Collection collection, gn2 gn2Var) {
        Object next;
        t14 t14VarJ;
        if (collection.size() == 1) {
            Object objQ0 = wv0.q0(collection);
            if (objQ0 != null) {
                return objQ0;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(xv0.Z(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(gn2Var.B(it.next()));
        }
        Object objQ1 = wv0.q0(collection);
        jd0 jd0Var = (jd0) gn2Var.B(objQ1);
        for (Object obj : collection) {
            jd0 jd0Var2 = (jd0) gn2Var.B(obj);
            if (jd0Var2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (k(jd0Var2, (jd0) it2.next()));
            if (k(jd0Var2, jd0Var) && !k(jd0Var, jd0Var2)) {
                objQ1 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objQ1 != null) {
                return objQ1;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objQ2 = wv0.q0(arrayList);
            if (objQ2 != null) {
                return objQ2;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            t14VarJ = ((jd0) gn2Var.B(next)).j();
            t14VarJ.getClass();
        } while (t14VarJ.q0() instanceof ce2);
        if (next != null) {
            return next;
        }
        Object objQ3 = wv0.q0(arrayList);
        if (objQ3 != null) {
            return objQ3;
        }
        a(82);
        throw null;
    }

    public final jh8 f(List list, List list2) {
        z14 z14Var = z14.t;
        y14 y14Var = y14.i;
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        u14 u14Var = this.a;
        if (zIsEmpty) {
            return new jh8(true, true, true, new zz2((HashMap) null, u14Var), y14Var, z14Var);
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((hi8) list.get(i)).l(), ((hi8) list2.get(i)).l());
        }
        return new jh8(true, true, true, new zz2(map, u14Var), y14Var, z14Var);
    }

    public final void h(v15 v15Var, Collection collection, Collection collection2, sx4 sx4Var, z51 z51Var) {
        Integer numB;
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (sx4Var == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            ld0 ld0Var = (ld0) it.next();
            if (ld0Var == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            pc7 pc7Var = new pc7();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                ld0 ld0Var2 = (ld0) it2.next();
                int iB = l(ld0Var2, ld0Var, sx4Var).b();
                boolean z = !gl1.e(ld0Var2.e()) && gl1.f(ld0Var2, ld0Var);
                int iB2 = p61.B(iB);
                if (iB2 == 0) {
                    if (z) {
                        pc7Var.add(ld0Var2);
                    }
                    arrayList.add(ld0Var2);
                } else if (iB2 == 2) {
                    if (z) {
                        z51Var.u(ld0Var2, ld0Var);
                    }
                    arrayList.add(ld0Var2);
                }
            }
            z51Var.T(ld0Var, pc7Var);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            ed1 ed1VarP = ((ld0) linkedHashSet.iterator().next()).p();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((ld0) it3.next()).p() != ed1VarP) {
                        LinkedList<ld0> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            ld0 ld0Var3 = null;
                            for (ld0 ld0Var4 : linkedList) {
                                if (ld0Var3 == null || ((numB = gl1.b(ld0Var3.e(), ld0Var4.e())) != null && numB.intValue() < 0)) {
                                    ld0Var3 = ld0Var4;
                                }
                            }
                            ld0Var3.getClass();
                            e(g(ld0Var3, linkedList, new ve7((byte) 17), new d3(z51Var, ld0Var3, (byte) 15)), sx4Var, z51Var);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((ld0) it4.next()), sx4Var, z51Var);
        }
    }

    public final gf5 l(jd0 jd0Var, jd0 jd0Var2, sx4 sx4Var) {
        if (jd0Var == null) {
            a(19);
            throw null;
        }
        if (jd0Var2 != null) {
            return m(jd0Var, jd0Var2, sx4Var, false);
        }
        a(20);
        throw null;
    }

    public final gf5 m(jd0 jd0Var, jd0 jd0Var2, sx4 sx4Var, boolean z) {
        if (jd0Var == null) {
            a(22);
            throw null;
        }
        if (jd0Var2 == null) {
            a(23);
            throw null;
        }
        gf5 gf5VarN = n(jd0Var, jd0Var2, z);
        boolean z2 = gf5VarN.b() == 1;
        List<f72> list = b;
        for (f72 f72Var : list) {
            if (f72Var.a() != 1 && (!z2 || f72Var.a() != 2)) {
                int iB = p61.B(f72Var.b(jd0Var, jd0Var2, sx4Var));
                if (iB == 0) {
                    z2 = true;
                } else if (iB == 1) {
                    return gf5.c("External condition");
                }
            }
        }
        if (!z2) {
            return gf5VarN;
        }
        for (f72 f72Var2 : list) {
            if (f72Var2.a() == 1) {
                int iB2 = p61.B(f72Var2.b(jd0Var, jd0Var2, sx4Var));
                if (iB2 == 0) {
                    om0.g("Contract violation in ", f72Var2.getClass().getName(), " condition. It's not supposed to end with success");
                    return null;
                }
                if (iB2 == 1) {
                    return gf5.c("External condition");
                }
            }
        }
        gf5 gf5Var = gf5.c;
        if (gf5Var != null) {
            return gf5Var;
        }
        gf5.a(0);
        throw null;
    }

    public final gf5 n(jd0 jd0Var, jd0 jd0Var2, boolean z) {
        boolean zBooleanValue;
        if (jd0Var == null) {
            a(28);
            throw null;
        }
        if (jd0Var2 == null) {
            a(29);
            throw null;
        }
        gf5 gf5VarI = i(jd0Var, jd0Var2);
        if (gf5VarI != null) {
            return gf5VarI;
        }
        ArrayList arrayListD = d(jd0Var);
        ArrayList arrayListD2 = d(jd0Var2);
        List typeParameters = jd0Var.getTypeParameters();
        List typeParameters2 = jd0Var2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i = 0; i < arrayListD.size(); i++) {
                if (!v14.a.a((t14) arrayListD.get(i), (t14) arrayListD2.get(i))) {
                    return gf5.c("Type parameter number mismatch");
                }
            }
            return new gf5(3, "Type parameter number mismatch");
        }
        jh8 jh8VarF = f(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            hi8 hi8Var = (hi8) typeParameters.get(i2);
            hi8 hi8Var2 = (hi8) typeParameters2.get(i2);
            if (hi8Var == null) {
                a(47);
                throw null;
            }
            if (hi8Var2 == null) {
                a(48);
                throw null;
            }
            List<t14> upperBounds = hi8Var.getUpperBounds();
            ArrayList arrayList = new ArrayList(hi8Var2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (t14 t14Var : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(t14Var, (t14) listIterator.next(), jh8VarF));
                    listIterator.remove();
                }
            }
            return gf5.c("Type parameter bounds mismatch");
        }
        for (int i3 = 0; i3 < arrayListD.size(); i3++) {
            if (!b((t14) arrayListD.get(i3), (t14) arrayListD2.get(i3), jh8VarF)) {
                return gf5.c("Value parameter type mismatch");
            }
        }
        if ((jd0Var instanceof ho2) && (jd0Var2 instanceof ho2) && ((ho2) jd0Var).h() != ((ho2) jd0Var2).h()) {
            return new gf5(3, "Incompatible suspendability");
        }
        if (z) {
            t14 t14VarJ = jd0Var.j();
            t14 t14VarJ2 = jd0Var2.j();
            if (t14VarJ != null && t14VarJ2 != null && (!vr3.J(t14VarJ2) || !vr3.J(t14VarJ))) {
                mo8 mo8VarQ0 = t14VarJ2.q0();
                mo8 mo8VarQ1 = t14VarJ.q0();
                xi8 xi8Var = jh8VarF.c;
                if (mo8VarQ0 == mo8VarQ1) {
                    zBooleanValue = true;
                } else {
                    rn2 rn2VarP = xi8Var.P();
                    Boolean bool = rn2VarP != null ? (Boolean) rn2VarP.K(mo8VarQ0, mo8VarQ1) : null;
                    zBooleanValue = bool != null ? bool.booleanValue() : oy1.Y.u(jh8VarF, xi8Var, mo8VarQ0, mo8VarQ1);
                }
                if (!zBooleanValue) {
                    return new gf5(3, "Return type mismatch");
                }
            }
        }
        gf5 gf5Var = gf5.c;
        if (gf5Var != null) {
            return gf5Var;
        }
        gf5.a(0);
        throw null;
    }
}
