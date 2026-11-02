package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.HpkeSuite;
import org.conscrypt.metrics.ConscryptStatsLog;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bl1 {
    public static final /* synthetic */ int a = 0;

    static {
        new fk2("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
            case 59:
            case 61:
            case 62:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
            case 59:
            case 61:
            case 62:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
            case 59:
            case 61:
            case 62:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 32:
            case 45:
            case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
            case 59:
            case 61:
            case 62:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
            case 59:
            case 61:
            case 62:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(jd0 jd0Var, LinkedHashSet linkedHashSet) {
        if (jd0Var == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(jd0Var)) {
            return;
        }
        Iterator it = jd0Var.a().q().iterator();
        while (it.hasNext()) {
            jd0 jd0VarA = ((jd0) it.next()).a();
            b(jd0VarA, linkedHashSet);
            linkedHashSet.add(jd0VarA);
        }
    }

    public static vx4 c(ed1 ed1Var) {
        if (ed1Var == null) {
            a(21);
            throw null;
        }
        vx4 vx4VarD = d(ed1Var);
        if (vx4VarD != null) {
            return vx4VarD;
        }
        a(22);
        throw null;
    }

    public static vx4 d(ed1 ed1Var) {
        if (ed1Var == null) {
            a(23);
            throw null;
        }
        while (ed1Var != null) {
            if (ed1Var instanceof vx4) {
                return (vx4) ed1Var;
            }
            if (ed1Var instanceof n74) {
                return ((n74) ed1Var).g0;
            }
            ed1Var = ed1Var.p();
        }
        return null;
    }

    public static lh4 e(ed1 ed1Var) {
        lh4 lh4Var = lh4.F0;
        if (ed1Var instanceof tx5) {
            ed1Var = ((tx5) ed1Var).l0;
        }
        if (ed1Var instanceof gd1) {
            ((gd1) ed1Var).getSource().getClass();
        }
        return lh4Var;
    }

    public static gk2 f(ed1 ed1Var) {
        if (ed1Var != null) {
            fk2 fk2VarG = g(ed1Var);
            return fk2VarG != null ? fk2VarG.a : f(ed1Var.p()).a(ed1Var.getName());
        }
        a(2);
        throw null;
    }

    public static fk2 g(ed1 ed1Var) {
        if (ed1Var == null) {
            a(5);
            throw null;
        }
        if ((ed1Var instanceof vx4) || u32.f(ed1Var)) {
            return fk2.c;
        }
        if (ed1Var instanceof n74) {
            return ((n74) ed1Var).h0;
        }
        if (ed1Var instanceof tf5) {
            return ((uf5) ((tf5) ed1Var)).i0;
        }
        return null;
    }

    public static ed1 h(ed1 ed1Var, Class cls, boolean z) {
        if (ed1Var == null) {
            return null;
        }
        if (z) {
            ed1Var = ed1Var.p();
        }
        while (ed1Var != null) {
            if (cls.isInstance(ed1Var)) {
                return ed1Var;
            }
            ed1Var = ed1Var.p();
        }
        return null;
    }

    public static sx4 i(sx4 sx4Var) {
        if (sx4Var == null) {
            a(44);
            throw null;
        }
        for (t14 t14Var : sx4Var.l().c()) {
            if (t14Var == null) {
                a(45);
                throw null;
            }
            lh8 lh8VarN0 = t14Var.n0();
            if (lh8VarN0 == null) {
                a(46);
                throw null;
            }
            sx4 sx4Var2 = (sx4) lh8VarN0.x();
            if (sx4Var2 == null) {
                a(47);
                throw null;
            }
            if (sx4Var2.g0() != us0.Y) {
                return sx4Var2;
            }
        }
        return null;
    }

    public static boolean j(ed1 ed1Var) {
        return l(ed1Var, us0.X) && ed1Var.getName().equals(hf7.a);
    }

    public static boolean k(ed1 ed1Var) {
        return l(ed1Var, us0.h0) && ((sx4) ed1Var).v0();
    }

    public static boolean l(ed1 ed1Var, us0 us0Var) {
        return (ed1Var instanceof sx4) && ((sx4) ed1Var).g0() == us0Var;
    }

    public static boolean m(ed1 ed1Var) {
        if (ed1Var == null) {
            a(1);
            throw null;
        }
        while (ed1Var != null) {
            if (j(ed1Var) || ((ed1Var instanceof jd1) && ((jd1) ed1Var).e() == gl1.f)) {
                return true;
            }
            ed1Var = ed1Var.p();
        }
        return false;
    }

    public static boolean n(t14 t14Var, ed1 ed1Var) {
        if (t14Var == null) {
            a(30);
            throw null;
        }
        if (ed1Var == null) {
            a(31);
            throw null;
        }
        ot0 ot0VarX = t14Var.n0().x();
        if (ot0VarX == null) {
            return false;
        }
        ed1 ed1VarA = ot0VarX.a();
        return (ed1VarA instanceof ot0) && (ed1Var instanceof ot0) && ((ot0) ed1Var).l().equals(((ot0) ed1VarA).l());
    }

    public static boolean o(ed1 ed1Var) {
        return (l(ed1Var, us0.X) || l(ed1Var, us0.Y)) && ((sx4) ed1Var).m() == fx4.Z;
    }

    public static boolean p(t14 t14Var, ed1 ed1Var) {
        if (t14Var == null) {
            a(32);
            throw null;
        }
        if (ed1Var == null) {
            a(33);
            throw null;
        }
        if (n(t14Var, ed1Var)) {
            return true;
        }
        Iterator it = t14Var.n0().c().iterator();
        while (it.hasNext()) {
            if (p((t14) it.next(), ed1Var)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(ed1 ed1Var) {
        return ed1Var != null && (ed1Var.p() instanceof tf5);
    }

    public static ld0 r(ld0 ld0Var) {
        while (ld0Var.r() == 2) {
            Collection collectionQ = ld0Var.q();
            if (collectionQ.isEmpty()) {
                u52.r(ld0Var, "Fake override should have at least one overridden descriptor: ");
                return null;
            }
            ld0Var = (ld0) collectionQ.iterator().next();
        }
        return ld0Var;
    }
}
