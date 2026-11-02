package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.HpkeSuite;
import org.conscrypt.metrics.ConscryptStatsLog;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zz3 {
    public static final v15 e = v15.g("<built-ins module>");
    public wx4 a;
    public final te4 b;
    public final pe4 c;
    public final ve4 d;

    public zz3(ve4 ve4Var) {
        this.d = ve4Var;
        ve4Var.a(new xz3(this, (byte) 0));
        byte b = 1;
        this.b = new te4(ve4Var, new xz3(this, b));
        this.c = ve4Var.b(new om(this, b));
    }

    public static boolean A(ed1 ed1Var) {
        if (ed1Var != null) {
            return bl1.h(ed1Var, oa0.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(t14 t14Var, gk2 gk2Var) {
        if (t14Var == null) {
            a(97);
            throw null;
        }
        if (gk2Var != null) {
            return J(t14Var.n0(), gk2Var);
        }
        a(98);
        throw null;
    }

    public static boolean C(t14 t14Var, gk2 gk2Var) {
        if (gk2Var != null) {
            return B(t14Var, gk2Var) && !t14Var.o0();
        }
        a(135);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean D(hd1 hd1Var) {
        if (hd1Var.a().getAnnotations().k(tg7.m)) {
            return true;
        }
        if (!(hd1Var instanceof fx5)) {
            return false;
        }
        fx5 fx5Var = (fx5) hd1Var;
        boolean zR = fx5Var.R();
        hx5 hx5VarB = fx5Var.b();
        tx5 tx5VarD = fx5Var.d();
        if (hx5VarB == null || !D(hx5VarB)) {
            return false;
        }
        if (zR) {
            return tx5VarD != null && D(tx5VarD);
        }
        return true;
    }

    public static boolean E(t14 t14Var, gk2 gk2Var) {
        if (t14Var == null) {
            a(105);
            throw null;
        }
        if (gk2Var != null) {
            return !t14Var.o0() && B(t14Var, gk2Var);
        }
        a(106);
        throw null;
    }

    public static boolean F(t14 t14Var) {
        if (t14Var != null) {
            return B(t14Var, tg7.b) && !cj8.e(t14Var);
        }
        a(136);
        throw null;
    }

    public static boolean G(t14 t14Var) {
        ot0 ot0VarX = t14Var.n0().x();
        return (ot0VarX == null || s(ot0VarX) == null) ? false : true;
    }

    public static boolean H(t14 t14Var) {
        if (t14Var.o0()) {
            return false;
        }
        ot0 ot0VarX = t14Var.n0().x();
        return (ot0VarX instanceof sx4) && u((sx4) ot0VarX) != null;
    }

    public static boolean I(t14 t14Var) {
        return E(t14Var, tg7.f);
    }

    public static boolean J(lh8 lh8Var, gk2 gk2Var) {
        if (lh8Var == null) {
            a(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS);
            throw null;
        }
        if (gk2Var != null) {
            ot0 ot0VarX = lh8Var.x();
            return (ot0VarX instanceof sx4) && b((sx4) ot0VarX, gk2Var);
        }
        a(HttpStatusCodesKt.HTTP_PROCESSING);
        throw null;
    }

    public static boolean K(ed1 ed1Var) {
        while (ed1Var != null) {
            if (ed1Var instanceof tf5) {
                fk2 fk2Var = ((uf5) ((tf5) ed1Var)).i0;
                v15 v15Var = ug7.j;
                fk2Var.getClass();
                v15Var.getClass();
                return fk2Var.a.h(v15Var);
            }
            ed1Var = ed1Var.p();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                        case 65:
                                        case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case _DnsMessageKt.TYPE_AAAA /* 28 */:
                        case 29:
                        case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case _DnsMessageKt.TYPE_AAAA /* 28 */:
                        case 29:
                        case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                        case 65:
                                        case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                                        case 67:
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
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 65:
            case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 98:
            case 100:
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
            case 161:
                objArr[0] = "type";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i == 81 || i == 84) {
            objArr[1] = "getArrayType";
        } else if (i == 86) {
            objArr[1] = "getEnumType";
        } else if (i != 87) {
            switch (i) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case _DnsMessageKt.TYPE_AAAA /* 28 */:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case 38:
                            objArr[1] = "getMutableList";
                            break;
                        case 39:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 65:
            case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
                objArr[2] = "isNullableAny";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case _DnsMessageKt.TYPE_AAAA /* 28 */:
                        case 29:
                        case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                        case 65:
                                        case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                                        case 67:
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

    public static boolean b(sx4 sx4Var, gk2 gk2Var) {
        if (sx4Var == null) {
            a(HttpStatusCodesKt.HTTP_EARLY_HINTS);
            throw null;
        }
        if (gk2Var != null) {
            return sx4Var.getName().equals(gk2Var.g()) && gk2Var.equals(bl1.f(sx4Var));
        }
        a(104);
        throw null;
    }

    public static du5 s(ot0 ot0Var) {
        if (tg7.e0.contains(ot0Var.getName())) {
            return (du5) tg7.g0.get(bl1.f(ot0Var));
        }
        return null;
    }

    public static du5 u(sx4 sx4Var) {
        if (tg7.d0.contains(sx4Var.getName())) {
            return (du5) tg7.f0.get(bl1.f(sx4Var));
        }
        return null;
    }

    public static boolean y(t14 t14Var) {
        if (t14Var != null) {
            return B(t14Var, tg7.a);
        }
        a(139);
        throw null;
    }

    public static boolean z(t14 t14Var) {
        if (t14Var != null) {
            return B(t14Var, tg7.g);
        }
        a(88);
        throw null;
    }

    public final void c() {
        wx4 wx4Var;
        ve4 ve4Var;
        oa0 oa0Var;
        v15 v15Var = e;
        v15Var.getClass();
        ve4 ve4Var2 = this.d;
        wx4 wx4Var2 = new wx4(v15Var, ve4Var2, this, 48);
        this.a = wx4Var2;
        ma0.a.getClass();
        ma0 ma0Var = (ma0) la0.b.getValue();
        wx4 wx4Var3 = this.a;
        Iterable iterableM = m();
        po5 po5VarQ = q();
        i7 i7VarD = d();
        na0 na0Var = (na0) ma0Var;
        na0Var.getClass();
        wx4Var3.getClass();
        iterableM.getClass();
        po5VarQ.getClass();
        i7VarD.getClass();
        Set<fk2> set = ug7.q;
        d0 d0Var = new d0(1, na0Var.b, qa0.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0, (byte) 4);
        set.getClass();
        ArrayList arrayList = new ArrayList();
        for (fk2 fk2Var : set) {
            ja0.m.getClass();
            InputStream inputStream = (InputStream) d0Var.B(ja0.a(fk2Var));
            if (inputStream != null) {
                qg5 qg5VarZ0 = z68.z0(inputStream);
                az5 az5Var = (az5) qg5VarZ0.X;
                ka0 ka0Var = (ka0) qg5VarZ0.Y;
                if (az5Var == null) {
                    throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ka0.f + ", actual " + ka0Var + ". Please update Kotlin");
                }
                wx4Var = wx4Var3;
                ve4Var = ve4Var2;
                oa0Var = new oa0(fk2Var, ve4Var, wx4Var, az5Var, ka0Var);
            } else {
                wx4Var = wx4Var3;
                ve4Var = ve4Var2;
                oa0Var = null;
            }
            if (oa0Var != null) {
                arrayList.add(oa0Var);
            }
            ve4Var2 = ve4Var;
            wx4Var3 = wx4Var;
        }
        wx4 wx4Var4 = wx4Var3;
        ve4 ve4Var3 = ve4Var2;
        vf5 vf5Var = new vf5(arrayList);
        z47 z47Var = new z47(ve4Var3, wx4Var4);
        vk1 vk1Var = new vk1((Object) vf5Var, (byte) 1);
        ja0 ja0Var = ja0.m;
        hl1 hl1Var = new hl1(ve4Var3, wx4Var4, vk1Var, new dq(wx4Var4, z47Var, ja0Var), vf5Var, iterableM, z47Var, i7VarD, po5VarQ, ja0Var.a, null, new g55(ve4Var3), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((oa0) it.next()).I0(hl1Var);
        }
        wx4Var2.l0 = vf5Var;
        wx4 wx4Var5 = this.a;
        wx4Var5.getClass();
        wx4Var5.k0 = new ux4(eu.K0(new wx4[]{wx4Var5}));
    }

    public i7 d() {
        return oy1.Z;
    }

    public final aa7 e() {
        aa7 aa7VarX = k("Any").X();
        if (aa7VarX != null) {
            return aa7VarX;
        }
        a(51);
        throw null;
    }

    public final t14 f(t14 t14Var) {
        if (t14Var == null) {
            a(68);
            throw null;
        }
        t14 t14VarG = g(t14Var);
        if (t14VarG != null) {
            return t14VarG;
        }
        u52.r(t14Var, "not array: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    public final t14 g(t14 t14Var) {
        qs0 qs0VarF;
        qs0 qs0Var;
        sx4 sx4VarM;
        aa7 aa7VarX;
        if (t14Var == null) {
            a(70);
            throw null;
        }
        if (!z(t14Var)) {
            mo8 mo8VarG = cj8.g(t14Var, false);
            t14 t14Var2 = (t14) ((yz3) this.b.invoke()).b.get(mo8VarG);
            if (t14Var2 != null) {
                return t14Var2;
            }
            int i = bl1.a;
            ot0 ot0VarX = mo8VarG.n0().x();
            vx4 vx4VarD = ot0VarX == null ? null : bl1.d(ot0VarX);
            if (vx4VarD != null) {
                ot0 ot0VarX2 = mo8VarG.n0().x();
                if (ot0VarX2 == null) {
                    aa7VarX = null;
                } else {
                    Set set = ho8.a;
                    v15 name = ot0VarX2.getName();
                    name.getClass();
                    if (!ho8.d.contains(name) || (qs0VarF = el1.f(ot0VarX2)) == null || (qs0Var = (qs0) ho8.b.get(qs0VarF)) == null || (sx4VarM = oc.m(vx4VarD, qs0Var)) == null) {
                        aa7VarX = null;
                    } else {
                        aa7VarX = sx4VarM.X();
                    }
                }
                if (aa7VarX != null) {
                    return aa7VarX;
                }
            }
        } else if (t14Var.l0().size() == 1) {
            return ((ni8) t14Var.l0().get(0)).b();
        }
        return null;
    }

    public final aa7 h(t14 t14Var) {
        if (t14Var != null) {
            return i(rt8.INVARIANT, t14Var, oy1.f0);
        }
        a(83);
        throw null;
    }

    public final aa7 i(rt8 rt8Var, t14 t14Var, sm smVar) {
        if (t14Var != null) {
            return dh3.M(bt7.j(smVar), k("Array"), Collections.singletonList(new wg7(t14Var, rt8Var)));
        }
        a(79);
        throw null;
    }

    public final sx4 j(fk2 fk2Var) {
        if (fk2Var == null) {
            a(12);
            throw null;
        }
        sx4 sx4VarW = vr3.W(l(), fk2Var);
        if (sx4VarW != null) {
            return sx4VarW;
        }
        a(13);
        throw null;
    }

    public final sx4 k(String str) {
        if (str != null) {
            return (sx4) this.c.B(v15.e(str));
        }
        a(14);
        throw null;
    }

    public final wx4 l() {
        this.a.getClass();
        wx4 wx4Var = this.a;
        if (wx4Var != null) {
            return wx4Var;
        }
        a(7);
        throw null;
    }

    public Iterable m() {
        List listSingletonList = Collections.singletonList(new ha0(this.d, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final aa7 n() {
        aa7 aa7VarP = p();
        if (aa7VarP != null) {
            return aa7VarP;
        }
        a(53);
        throw null;
    }

    public final aa7 o() {
        aa7 aa7VarX = k("Nothing").X();
        if (aa7VarX != null) {
            return aa7VarX;
        }
        a(49);
        throw null;
    }

    public final aa7 p() {
        aa7 aa7VarU0 = e().r0(true);
        if (aa7VarU0 != null) {
            return aa7VarU0;
        }
        a(52);
        throw null;
    }

    public po5 q() {
        return qe4.o0;
    }

    public final aa7 r(du5 du5Var) {
        if (du5Var == null) {
            a(73);
            throw null;
        }
        aa7 aa7Var = (aa7) ((yz3) this.b.invoke()).a.get(du5Var);
        if (aa7Var != null) {
            return aa7Var;
        }
        a(74);
        throw null;
    }

    public final aa7 t(du5 du5Var) {
        if (du5Var == null) {
            a(54);
            throw null;
        }
        aa7 aa7VarX = k(du5Var.X.b()).X();
        if (aa7VarX != null) {
            return aa7VarX;
        }
        a(55);
        throw null;
    }

    public final aa7 v() {
        aa7 aa7VarX = k("String").X();
        if (aa7VarX != null) {
            return aa7VarX;
        }
        a(66);
        throw null;
    }

    public final sx4 w(int i) {
        sx4 sx4VarJ = j(ug7.f.a(v15.e(ro2.d.b + i)));
        if (sx4VarJ != null) {
            return sx4VarJ;
        }
        a(18);
        throw null;
    }

    public final aa7 x() {
        aa7 aa7VarX = k("Unit").X();
        if (aa7VarX != null) {
            return aa7VarX;
        }
        a(65);
        throw null;
    }
}
