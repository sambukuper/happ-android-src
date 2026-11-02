package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum ut3 {
    BOOLEAN(du5.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(du5.CHAR, "char", "C", "java.lang.Character"),
    BYTE(du5.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(du5.SHORT, "short", "S", "java.lang.Short"),
    INT(du5.INT, "int", "I", "java.lang.Integer"),
    FLOAT(du5.FLOAT, "float", "F", "java.lang.Float"),
    LONG(du5.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(du5.DOUBLE, "double", "D", "java.lang.Double");

    public static final HashMap o0 = new HashMap();
    public static final EnumMap p0 = new EnumMap(du5.class);
    public static final HashMap q0 = new HashMap();
    public static final HashSet r0 = new HashSet();
    public static final HashMap s0 = new HashMap();
    public final du5 X;
    public final String Y;
    public final String Z;
    public final fk2 f0;

    static {
        for (ut3 ut3Var : values()) {
            HashMap map = o0;
            String str = ut3Var.Y;
            String str2 = ut3Var.Z;
            map.put(str, ut3Var);
            p0.put(ut3Var.c(), ut3Var);
            q0.put(str2, ut3Var);
            String strReplace = ut3Var.f0.a.a.replace('.', '/');
            r0.add(strReplace);
            s0.put(strReplace, pc6.q("(", str2, ")L", strReplace, ";"));
        }
    }

    ut3(du5 du5Var, String str, String str2, String str3) {
        if (du5Var == null) {
            a(8);
            throw null;
        }
        this.X = du5Var;
        this.Y = str;
        this.Z = str2;
        this.f0 = new fk2(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 6) {
            switch (i) {
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                case 13:
                case 14:
                case 15:
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
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 6) {
            switch (i) {
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static ut3 b(String str) {
        ut3 ut3Var = (ut3) o0.get(str);
        if (ut3Var != null) {
            return ut3Var;
        }
        bt.g("Non-primitive type name passed: ".concat(str));
        return null;
    }

    public final du5 c() {
        du5 du5Var = this.X;
        if (du5Var != null) {
            return du5Var;
        }
        a(12);
        throw null;
    }
}
