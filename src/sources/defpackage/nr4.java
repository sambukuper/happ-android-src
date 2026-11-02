package defpackage;

import android.database.SQLException;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.IInterface;
import androidx.compose.foundation.layout.b;
import java.io.EOFException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.internal.dns._DnsMessageKt;
import su.happ.proxyutility.dto.ConfigGroupCache;

/* JADX INFO: loaded from: classes.dex */
public abstract class nr4 {
    public static final jw0 A;
    public static final jw0 B;
    public static final jw0 C;
    public static final jw0 D;
    public static final jw0 E;
    public static final jw0 F;
    public static final jw0 G;
    public static final jw0 H;
    public static final jw0 I;
    public static final d77 J;
    public static final float K;
    public static final float L = 0.38f;
    public static ExecutorService c;
    public static final jw0 f;
    public static final d77 g;
    public static final jw0 h;
    public static final jw0 i;
    public static final jw0 j;
    public static final jw0 k;
    public static final jw0 l;
    public static final jw0 m;
    public static final jw0 n;
    public static final jw0 o;
    public static final jw0 p;
    public static final jw0 q;
    public static final jw0 r;
    public static final jw0 s;
    public static final jw0 t;
    public static final jw0 u;
    public static final jw0 v;
    public static final jw0 w;
    public static final jw0 x;
    public static final jw0 y;
    public static final jw0 z;
    public final /* synthetic */ byte a;
    public static final Object b = new Object();
    public static final zy0 d = new zy0(-1759434350, false, new dx0(17));
    public static final Type[] e = new Type[0];

    static {
        jw0 jw0Var = jw0.k0;
        f = jw0Var;
        g = d77.Z;
        jw0 jw0Var2 = jw0.h0;
        h = jw0Var2;
        i = jw0Var2;
        j = jw0Var2;
        k = jw0Var2;
        l = jw0Var2;
        m = jw0Var2;
        jw0 jw0Var3 = jw0.X;
        n = jw0Var3;
        o = jw0Var2;
        p = jw0Var3;
        jw0 jw0Var4 = jw0.i0;
        q = jw0Var4;
        r = jw0Var3;
        s = jw0Var3;
        t = jw0Var3;
        u = jw0Var2;
        v = jw0Var;
        w = jw0Var4;
        x = jw0Var;
        y = jw0Var4;
        z = jw0Var4;
        A = jw0Var2;
        B = jw0Var4;
        C = jw0Var4;
        D = jw0Var4;
        E = jw0Var4;
        F = jw0Var4;
        G = jw0.j0;
        H = jw0Var4;
        I = jw0Var4;
        J = d77.Y;
        K = 1.0f;
    }

    public /* synthetic */ nr4(byte b2) {
        this.a = b2;
    }

    public static Class A(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) A(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return A(((WildcardType) type).getUpperBounds()[0]);
        }
        b61.l("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static Type B(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return L(type, cls, z(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    public static final ArrayList C(xu3 xu3Var) {
        xu3Var.getClass();
        List listG = xu3Var.g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (((ob6) obj).x() == fw3.f0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final f09 D(long j2) {
        int i2 = (int) (j2 & 4294967295L);
        if (i2 < 0) {
            return null;
        }
        return i2 == 0 ? f09.X : f09.Y;
    }

    public static final void E(g34 g34Var) {
        yn0.Z(g34Var).H();
    }

    public static String F(jq0 jq0Var, dl3 dl3Var) {
        if (jq0Var.b(dl3Var)) {
            return null;
        }
        return jq0Var.a();
    }

    public static boolean G(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i2 != 130) {
                bt.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static int H(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                bt.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int I(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        bt.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final long J(long j2, long j3) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L)))) & 4294967295L);
    }

    public static w35 K(j76 j76Var) throws EOFException {
        int i2 = Integer.parseInt(j76Var.V(Long.MAX_VALUE));
        long j2 = Long.parseLong(j76Var.V(Long.MAX_VALUE));
        long j3 = Long.parseLong(j76Var.V(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = Integer.parseInt(j76Var.V(Long.MAX_VALUE));
        for (int i4 = 0; i4 < i3; i4++) {
            String strV = j76Var.V(Long.MAX_VALUE);
            int iL0 = fm7.l0(strV, ':', 0, 6);
            if (iL0 == -1) {
                em7.c("Unexpected header: ".concat(strV));
                return null;
            }
            String string = fm7.R0(strV.substring(0, iL0)).toString();
            String strSubstring = strV.substring(iL0 + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new w35(i2, j2, j3, new q35(zp4.Q(linkedHashMap)), null, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:77:0x012c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:93:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [vu2] */
    /* JADX WARN: Type inference failed for: r12v4, types: [vu2] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static Type L(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeL;
        Type[] upperBounds2;
        Type typeL2;
        Type[] lowerBounds2;
        boolean zEquals;
        int length;
        Type[] typeArr;
        boolean z2;
        Type uu2Var;
        Type typeL3;
        Type genericComponentType;
        Type typeL4;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            int i2 = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                if (typeL instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeL).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeL};
                                }
                                type2 = new vu2(upperBounds2, e);
                                break;
                            }
                            typeL2 = L(type, cls, lowerBounds[0], map);
                            if (typeL2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeL2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeL2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeL2};
                            }
                            type2 = new vu2(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        Type typeL5 = L(type, cls, ownerType, map);
                        zEquals = Objects.equals(typeL5, ownerType);
                        Type[] actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        typeArr = actualTypeArguments;
                        z2 = false;
                        while (i2 < length) {
                            typeL3 = L(type, cls, typeArr[i2], map);
                            if (Objects.equals(typeL3, typeArr[i2])) {
                                if (!z2) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z2 = true;
                                }
                                typeArr[i2] = typeL3;
                            }
                            i2++;
                        }
                        if (!zEquals) {
                        }
                        uu2Var = new uu2(typeL5, (Class) type2.getRawType(), typeArr);
                        type2 = uu2Var;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeL4 = L(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeL4)) {
                        uu2Var = new tu2(typeL4);
                        type2 = uu2Var;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeL = L(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    if (typeL instanceof WildcardType) {
                                        upperBounds2 = ((WildcardType) typeL).getUpperBounds();
                                    } else {
                                        upperBounds2 = new Type[]{typeL};
                                    }
                                    type2 = new vu2(upperBounds2, e);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeL2 = L(type, cls, lowerBounds[0], map);
                            if (typeL2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeL2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeL2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeL2};
                            }
                            type2 = new vu2(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        Type typeL6 = L(type, cls, ownerType2, map);
                        zEquals = Objects.equals(typeL6, ownerType2);
                        Type[] actualTypeArguments2 = type2.getActualTypeArguments();
                        length = actualTypeArguments2.length;
                        typeArr = actualTypeArguments2;
                        z2 = false;
                        while (i2 < length) {
                            typeL3 = L(type, cls, typeArr[i2], map);
                            if (Objects.equals(typeL3, typeArr[i2])) {
                                if (!z2) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z2 = true;
                                }
                                typeArr[i2] = typeL3;
                            }
                            i2++;
                        }
                        if (!zEquals && !z2) {
                            break;
                        }
                        uu2Var = new uu2(typeL6, (Class) type2.getRawType(), typeArr);
                        type2 = uu2Var;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeL4 = L(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeL4)) {
                        break;
                    }
                    uu2Var = new tu2(typeL4);
                    type2 = uu2Var;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeL7 = L(type, cls, componentType, map);
                if (!Objects.equals(componentType, typeL7)) {
                    uu2Var = new tu2(typeL7);
                    type2 = uu2Var;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type3 != null) {
                return type3 == cls3 ? type2 : type3;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls4 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls4 == null) {
                type2 = typeVariable;
            } else {
                Type typeZ = z(type, cls, cls4);
                if (typeZ instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls4.getTypeParameters();
                    int length2 = typeParameters.length;
                    while (true) {
                        if (i2 >= length2) {
                            bt.n();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i2])) {
                            type2 = ((ParameterizedType) typeZ).getActualTypeArguments()[i2];
                            break;
                        }
                        i2++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    public static final long M(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static int N(double d2) {
        if (Double.isNaN(d2)) {
            bt.q("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int O(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        bt.q("Cannot round NaN value.");
        return 0;
    }

    public static long P(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        bt.q("Cannot round NaN value.");
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public static final int Q(qz6 qz6Var, int i2) {
        int i3;
        int[] iArr = qz6Var.h0;
        int i4 = i2 + 1;
        int length = qz6Var.g0.length - 1;
        int i5 = 0;
        while (i5 <= length) {
            i3 = (i5 + length) >>> 1;
            int i6 = iArr[i3];
            if (i6 < i4) {
                i5 = i3 + 1;
            } else {
                if (i6 <= i4) {
                    if (i3 >= 0) {
                        return i3;
                    }
                    return ~i3;
                }
                length = i3 - 1;
            }
        }
        i3 = (-i5) - 1;
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }

    public static final void R(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void S(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final void T(int i2, String str) {
        throw new SQLException(pc6.j(i2, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final String U(String str) {
        int i2;
        str.getClass();
        int i3 = 0;
        int i4 = -1;
        if (fm7.d0(str, ":", false)) {
            InetAddress inetAddressP = (mm7.Z(str, false, "[") && mm7.R(str, false, "]")) ? p(1, str.length() - 1, str) : p(0, str.length(), str);
            if (inetAddressP != null) {
                byte[] address = inetAddressP.getAddress();
                if (address.length != 16) {
                    if (address.length == 4) {
                        return inetAddressP.getHostAddress();
                    }
                    bt.g(p61.l('\'', "Invalid IPv6 address: '", str));
                    return null;
                }
                int i5 = 0;
                int i6 = 0;
                while (i5 < address.length) {
                    int i7 = i5;
                    while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                        i7 += 2;
                    }
                    int i8 = i7 - i5;
                    if (i8 > i6 && i8 >= 4) {
                        i4 = i5;
                        i6 = i8;
                    }
                    i5 = i7 + 2;
                }
                i90 i90Var = new i90();
                while (i3 < address.length) {
                    if (i3 == i4) {
                        i90Var.H0(58);
                        i3 += i6;
                        if (i3 == 16) {
                            i90Var.H0(58);
                        }
                    } else {
                        if (i3 > 0) {
                            i90Var.H0(58);
                        }
                        byte b2 = address[i3];
                        byte[] bArr = ks8.a;
                        i90Var.V0(((b2 & 255) << 8) | (address[i3 + 1] & 255));
                        i3 += 2;
                    }
                }
                return i90Var.Y();
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() != 0) {
                    int length = lowerCase.length();
                    for (0; i2 < length; i2 + 1) {
                        char cCharAt = lowerCase.charAt(i2);
                        i2 = (dh3.k(cCharAt, 31) > 0 && dh3.k(cCharAt, 127) < 0 && fm7.l0(" #%/:?@[\\]", cCharAt, 0, 6) == -1) ? i2 + 1 : 0;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [d76, sz0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList V(xb7 xb7Var, int i2, Integer num) {
        ?? d76Var = new d76(xb7Var);
        i2 = xb7Var.q(i2);
        gp2 gp2VarA = xb7Var.a(i2);
        while (i2 >= 0) {
            d76Var.g(xb7Var.i(i2), xb7Var.k(i2) ? xb7Var.p(xb7Var.b, i2) : zz0.a, xb7Var.a.h(i2), num);
            if (i2 >= 0) {
                gp2 gp2Var = gp2VarA;
                gp2VarA = xb7Var.a(i2);
                i2 = xb7Var.q(i2);
                num = gp2Var;
            } else {
                num = gp2VarA;
            }
        }
        return d76Var.X;
    }

    public static String W(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static void X(w35 w35Var, i76 i76Var) {
        i76Var.U0(w35Var.a);
        i76Var.writeByte(10);
        i76Var.U0(w35Var.b);
        i76Var.writeByte(10);
        i76Var.U0(w35Var.c);
        i76Var.writeByte(10);
        Set<Map.Entry> setEntrySet = w35Var.d.a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        i76Var.U0(size);
        i76Var.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                i76Var.f0((String) entry.getKey());
                i76Var.f0(":");
                i76Var.f0(str);
                i76Var.writeByte(10);
            }
        }
    }

    public static final void a(String str, dn2 dn2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        lp2 lp2Var2 = lp2Var;
        str.getClass();
        dn2Var.getClass();
        lp2Var2.X(2071392035);
        int i3 = i2 | (lp2Var2.f(str) ? 4 : 2) | (lp2Var2.h(dn2Var) ? 32 : 16) | 27648;
        if (lp2Var2.N(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 << 6;
            kx4 kx4VarX = vj8.x(kx4Var, false, null, null, null, dn2Var, lp2Var2, 15);
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var2, 0);
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4VarX);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var2, tw0VarA);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var2, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var2, numValueOf);
            pn7.l(lp2Var2);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var2, kx4VarQ);
            o50 o50Var = pz2.o0;
            kx4 kx4VarW = os4.w(b.a, ((gr) lp2Var2.j(hr.a)).a.b);
            wq6 wq6VarA = vq6.a(ht.a, o50Var, lp2Var2, 48);
            int iHashCode2 = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL2 = lp2Var2.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var2, kx4VarW);
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(dx0Var, lp2Var2, wq6VarA);
            pn7.m(dx0Var2, lp2Var2, kl5VarL2);
            oi0.u(iHashCode2, lp2Var2, dx0Var3, lp2Var2);
            pn7.m(dx0Var4, lp2Var2, kx4VarQ2);
            o88 o88Var = ((ds) lp2Var2.j(es.a)).b;
            ox1 ox1Var = ep.z;
            zc1.g(str, null, o88.a(o88Var, ((dp) lp2Var2.j(ox1Var)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var, i3 & 14, 506);
            lp2Var2 = lp2Var;
            hx4 hx4Var = hx4.X;
            ch3.f(lp2Var2, b.k(hx4Var, 16.0f));
            ch3.f(lp2Var2, new d44(1.0f, true));
            os4.a(w45.J(), b.g(hx4Var, 20.0f), str, ((dp) lp2Var2.j(ox1Var)).c.b, lp2Var2, (i4 & 896) | 48, 0);
            lp2Var2.p(true);
            lp2Var2.W(-1757786635);
            lp2Var2.p(false);
            lp2Var2.p(true);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) str, (Object) dn2Var, kx4Var, i2, (byte) 4);
        }
    }

    public static final void b(kx4 kx4Var, lp2 lp2Var, int i2) {
        kx4 kx4Var2;
        lp2 lp2Var2;
        lp2Var.X(1264200520);
        byte b2 = 4;
        int i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i2;
        if (lp2Var.N(i3 & 1, (i3 & 3) != 2)) {
            kx4Var2 = kx4Var;
            lp2Var2 = lp2Var;
            dh3.b(vj8.j0(y46.title_logs, lp2Var), kx4Var2, null, null, lp2Var2, (i3 << 3) & 112, 12);
        } else {
            kx4Var2 = kx4Var;
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new f80(kx4Var2, i2, b2);
        }
    }

    public static final pv e(boolean z2) {
        pv pvVar = new pv();
        pvVar.a = z2 ? 1 : 0;
        return pvVar;
    }

    public static final qv f(int i2) {
        qv qvVar = new qv();
        qvVar.a = i2;
        return qvVar;
    }

    public static final tv g(Object obj) {
        tv tvVar = new tv();
        tvVar.a = obj;
        return tvVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static boolean h(int i2, Rect rect, Rect rect2, Rect rect3) {
        int iH;
        int i3;
        int i4;
        boolean zI = i(i2, rect, rect2);
        if (!i(i2, rect, rect3) && zI) {
            if (i2 != 17) {
                if (i2 != 33) {
                    if (i2 != 66) {
                        if (i2 != 130) {
                            bt.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        if (rect.bottom <= rect3.top) {
                            if (i2 != 17 && i2 != 66) {
                                iH = H(i2, rect, rect2);
                                if (i2 != 17) {
                                    i3 = rect.left;
                                    i4 = rect3.left;
                                } else if (i2 != 33) {
                                    i3 = rect.top;
                                    i4 = rect3.top;
                                } else if (i2 != 66) {
                                    i3 = rect3.right;
                                    i4 = rect.right;
                                } else {
                                    if (i2 == 130) {
                                        bt.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                        return false;
                                    }
                                    i3 = rect3.bottom;
                                    i4 = rect.bottom;
                                }
                                if (iH < Math.max(1, i3 - i4)) {
                                }
                            }
                        }
                    } else if (rect.right <= rect3.left) {
                        if (i2 != 17) {
                            iH = H(i2, rect, rect2);
                            if (i2 != 17) {
                                i3 = rect.left;
                                i4 = rect3.left;
                            } else if (i2 != 33) {
                                i3 = rect.top;
                                i4 = rect3.top;
                            } else if (i2 != 66) {
                                i3 = rect3.right;
                                i4 = rect.right;
                            } else {
                                if (i2 == 130) {
                                    bt.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i3 = rect3.bottom;
                                i4 = rect.bottom;
                            }
                            if (iH < Math.max(1, i3 - i4)) {
                            }
                        }
                    }
                } else if (rect.top >= rect3.bottom) {
                    if (i2 != 17) {
                        iH = H(i2, rect, rect2);
                        if (i2 != 17) {
                            i3 = rect.left;
                            i4 = rect3.left;
                        } else if (i2 != 33) {
                            i3 = rect.top;
                            i4 = rect3.top;
                        } else if (i2 != 66) {
                            i3 = rect3.right;
                            i4 = rect.right;
                        } else {
                            if (i2 == 130) {
                                bt.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i3 = rect3.bottom;
                            i4 = rect.bottom;
                        }
                        if (iH < Math.max(1, i3 - i4)) {
                        }
                    }
                }
            } else if (rect.left >= rect3.right) {
                if (i2 != 17) {
                    iH = H(i2, rect, rect2);
                    if (i2 != 17) {
                        i3 = rect.left;
                        i4 = rect3.left;
                    } else if (i2 != 33) {
                        i3 = rect.top;
                        i4 = rect3.top;
                    } else if (i2 != 66) {
                        i3 = rect3.right;
                        i4 = rect.right;
                    } else {
                        if (i2 == 130) {
                            bt.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i3 = rect3.bottom;
                        i4 = rect.bottom;
                    }
                    if (iH < Math.max(1, i3 - i4)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    public static boolean i(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        bt.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static String j(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > -1 && bArr[i7] != 10) {
                i7--;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i3 = i8 + i9;
                if (bArr[i3] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i3 - i8;
            int i11 = i2;
            boolean z3 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z3) {
                    i4 = 46;
                    z2 = false;
                } else {
                    byte b2 = bArr2[i11][i12];
                    byte[] bArr3 = ks8.a;
                    int i14 = b2 & 255;
                    z2 = z3;
                    i4 = i14;
                }
                byte b3 = bArr[i8 + i13];
                byte[] bArr4 = ks8.a;
                i5 = i4 - (b3 & 255);
                if (i5 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i10) {
                    break;
                }
                if (bArr2[i11].length != i12) {
                    z3 = z2;
                } else {
                    if (i11 == bArr2.length - 1) {
                        break;
                    }
                    i11++;
                    i12 = -1;
                    z3 = true;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i15 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    int length3 = bArr2.length;
                    for (int i16 = i11 + 1; i16 < length3; i16++) {
                        length2 += bArr2[i16].length;
                    }
                    if (length2 >= i15) {
                        if (length2 <= i15) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            return new String(bArr, i8, i10, charset);
                        }
                    }
                }
                i6 = i3 + 1;
            }
            length = i7;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [d76, sz0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [gp2] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List k(bc7 bc7Var, Integer num, int i2, Integer num2) {
        int iD;
        int iR;
        j05 j05Var;
        if (bc7Var.w || bc7Var.o() == 0) {
            return d02.X;
        }
        ?? d76Var = new d76(bc7Var);
        if (num2 != null) {
            iD = num2.intValue();
        } else {
            iD = bc7Var.v;
            if (iD < 0) {
                iD = bc7Var.D(bc7Var.b, i2);
            }
        }
        if (num == 0) {
            int iM = bc7Var.i - bc7Var.M(bc7Var.b, bc7Var.q(i2));
            vz4 vz4Var = bc7Var.s;
            num = Integer.valueOf(iM + ((vz4Var == null || (j05Var = (j05) vz4Var.b(i2)) == null) ? 0 : j05Var.b));
        }
        int iQ = bc7Var.q(i2) * 5;
        int[] iArr = bc7Var.b;
        if (iQ < iArr.length) {
            iR = bc7Var.r(i2);
        } else {
            int iD2 = iD >= 0 ? bc7Var.D(iArr, iD) : iD;
            iR = bc7Var.r(iD);
            int i3 = iD;
            iD = iD2;
            i2 = i3;
        }
        while (i2 >= 0) {
            d76Var.g(iR, (bc7Var.b[(bc7Var.q(i2) * 5) + 1] & 536870912) != 0 ? bc7Var.s(i2) : zz0.a, bc7Var.N(i2), num);
            num = bc7Var.b(i2);
            if (iD >= 0) {
                int iD3 = bc7Var.D(bc7Var.b, iD);
                iR = bc7Var.r(iD);
                int i4 = iD;
                iD = iD3;
                i2 = i4;
            } else {
                i2 = iD;
            }
        }
        return d76Var.X;
    }

    public static Type l(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new tu2(l(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new uu2(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new tu2(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new vu2(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void m(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            bt.q("Primitive type is not allowed");
        }
    }

    public static long n(int i2, f09 f09Var) {
        int i3 = g81.a[f09Var.ordinal()];
        int i4 = -1;
        if (i3 != -1) {
            i4 = 1;
            if (i3 == 1) {
                i4 = 0;
            } else if (i3 != 2) {
                b61.c();
                return 0L;
            }
        }
        return (((long) i2) << 32) | (((long) i4) & 4294967295L);
    }

    public static xu4 o(zu3 zu3Var, String str) {
        xu4 xu4Var;
        zu3Var.getClass();
        HashMap map = xu4.c;
        synchronized (map) {
            try {
                Object xu4Var2 = map.get(str);
                if (xu4Var2 == null) {
                    xu4Var2 = new xu4(zu3Var, str);
                    map.put(str, xu4Var2);
                }
                xu4Var = (xu4) xu4Var2;
                if (!dh3.f(xu4Var.b, zu3Var)) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[LOOP:1: B:54:0x00a0->B:57:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[EDGE_INSN: B:79:0x00b2->B:58:0x00b2 BREAK  A[LOOP:1: B:54:0x00a0->B:57:0x00ac], SYNTHETIC] */
    public static final InetAddress p(int i2, int i3, String str) {
        int i4;
        int i5;
        int iP;
        byte[] bArr = new byte[16];
        int i6 = i2;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        while (i6 < i3) {
            if (i7 == 16) {
                return null;
            }
            int i10 = i6 + 2;
            if (i10 <= i3 && mm7.Y(str, "::", i6, false)) {
                if (i8 != -1) {
                    return null;
                }
                i7 += 2;
                i8 = i7;
                if (i10 == i3) {
                    break;
                }
                i9 = i10;
                i4 = 0;
                i6 = i9;
                while (i6 < i3) {
                    iP = ks8.p(str.charAt(i6));
                    if (iP != -1) {
                        break;
                        break;
                    }
                    i4 = (i4 << 4) + iP;
                    i6++;
                }
                i5 = i6 - i9;
                return i5 == 0 ? null : null;
            }
            if (i7 != 0) {
                if (!mm7.Y(str, ":", i6, false)) {
                    if (!mm7.Y(str, ".", i6, false)) {
                        return null;
                    }
                    int i11 = i7 - 2;
                    int i12 = i11;
                    while (i9 < i3) {
                        if (i12 == 16) {
                            return null;
                        }
                        if (i12 != i11) {
                            if (str.charAt(i9) != '.') {
                                return null;
                            }
                            i9++;
                        }
                        int i13 = 0;
                        int i14 = i9;
                        while (i14 < i3) {
                            char cCharAt = str.charAt(i14);
                            if (dh3.k(cCharAt, 48) < 0 || dh3.k(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i13 == 0 && i9 != i14) || (i13 = ((i13 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i14++;
                        }
                        if (i14 - i9 == 0) {
                            return null;
                        }
                        bArr[i12] = (byte) i13;
                        i12++;
                        i9 = i14;
                    }
                    if (i12 != i7 + 2) {
                        return null;
                    }
                    i7 += 2;
                    break;
                }
                i6++;
            }
            i9 = i6;
            i4 = 0;
            i6 = i9;
            while (i6 < i3) {
                iP = ks8.p(str.charAt(i6));
                if (iP != -1) {
                    break;
                }
                i4 = (i4 << 4) + iP;
                i6++;
            }
            i5 = i6 - i9;
            if (i5 == 0 && i5 <= 4) {
                int i15 = i7 + 1;
                bArr[i7] = (byte) (255 & (i4 >>> 8));
                i7 += 2;
                bArr[i15] = (byte) (i4 & 255);
            }
        }
        if (i7 != 16) {
            if (i8 == -1) {
                return null;
            }
            int i16 = i7 - i8;
            System.arraycopy(bArr, i8, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i8, (16 - i7) + i8, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static boolean q(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return q(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static final void r(qr6 qr6Var, String str) {
        qr6Var.getClass();
        xr6 xr6VarX0 = qr6Var.X0(str);
        try {
            xr6VarX0.S0();
            u15.h(xr6VarX0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(xr6VarX0, th);
                throw th2;
            }
        }
    }

    public static final wy7 s(Executor executor, xb4 xb4Var, bd6 bd6Var) {
        executor.getClass();
        m51 m51Var = xy7.a;
        return xy7.a(g33.K(x(executor), u70.g()), false, new y9(xb4Var, bd6Var, null, (byte) 15));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [ea6] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    public static final Serializable t(IInterface iInterface, bd6 bd6Var, s51 s51Var) {
        dd6 dd6Var;
        Throwable th;
        ?? r11;
        ?? r10;
        ea6 ea6Var;
        IBinder iBinder;
        ?? r12;
        IBinder.DeathRecipient deathRecipient;
        if (s51Var instanceof dd6) {
            dd6Var = (dd6) s51Var;
            int i2 = dd6Var.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dd6Var.i0 = i2 - Integer.MIN_VALUE;
            } else {
                dd6Var = new dd6(s51Var);
            }
        } else {
            dd6Var = new dd6(s51Var);
        }
        Object objA = dd6Var.h0;
        int i3 = dd6Var.i0;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    iBinder = dd6Var.g0;
                    ea6Var = dd6Var.f0;
                    w39.n0(objA);
                    r12 = (byte[]) objA;
                } else {
                    if (i3 != 2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iBinder = dd6Var.g0;
                    ea6Var = dd6Var.f0;
                    w39.n0(objA);
                }
                deathRecipient = (IBinder.DeathRecipient) ea6Var.X;
                if (deathRecipient != null) {
                    iBinder.getClass();
                    try {
                        iBinder.unlinkToDeath(deathRecipient, 0);
                    } catch (NoSuchElementException unused) {
                    }
                }
                return r12;
            }
            w39.n0(objA);
            ea6 ea6Var2 = new ea6();
            IBinder iBinderAsBinder = iInterface.asBinder();
            ii iiVar = new ii(ea6Var2, iBinderAsBinder, bd6Var, iInterface, (byte) 6);
            try {
                dd6Var.f0 = ea6Var2;
                dd6Var.g0 = iBinderAsBinder;
                dd6Var.i0 = 2;
                try {
                    tu6 tu6Var = new tu6(mb6.H(dd6Var), c71.Y);
                    iiVar.B(tu6Var);
                    objA = tu6Var.a();
                    c71 c71Var = c71.X;
                    if (objA == c71Var) {
                        return c71Var;
                    }
                    ea6Var = ea6Var2;
                    iBinder = iBinderAsBinder;
                } catch (Throwable th2) {
                    th = th2;
                    r11 = ea6Var2;
                    r10 = iBinderAsBinder;
                    try {
                        if (th instanceof CancellationException) {
                            throw th;
                        }
                        lh4 lh4VarP0 = lh4.P0();
                        int i4 = jc4.e;
                        lh4VarP0.getClass();
                        throw th;
                    } catch (Throwable th3) {
                        IBinder.DeathRecipient deathRecipient2 = (IBinder.DeathRecipient) r11.X;
                        if (deathRecipient2 == null) {
                            throw th3;
                        }
                        r10.getClass();
                        try {
                            r10.unlinkToDeath(deathRecipient2, 0);
                            throw th3;
                        } catch (NoSuchElementException unused2) {
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
            r12 = (byte[]) objA;
            deathRecipient = (IBinder.DeathRecipient) ea6Var.X;
            if (deathRecipient != null) {
                iBinder.getClass();
                iBinder.unlinkToDeath(deathRecipient, 0);
            }
            return r12;
        } catch (Throwable th5) {
            th = th5;
            r10 = iInterface;
            r11 = bd6Var;
        }
    }

    public static final ow3 u(m2 m2Var, f01 f01Var, String str) {
        ow3 ow3VarE = m2Var.e(f01Var, str);
        if (ow3VarE != null) {
            return ow3VarE;
        }
        ci8.N(m2Var.g(), str);
        throw null;
    }

    public static final ow3 v(m2 m2Var, ol7 ol7Var, Object obj) {
        obj.getClass();
        ow3 ow3VarF = m2Var.f(ol7Var, obj);
        if (ow3VarF != null) {
            return ow3VarF;
        }
        zu3 zu3VarB = yb6.a.b(obj.getClass());
        zu3 zu3VarG = m2Var.g();
        zu3VarG.getClass();
        String strE = zu3VarB.E();
        if (strE == null) {
            strE = String.valueOf(zu3VarB);
        }
        ci8.N(zu3VarG, strE);
        throw null;
    }

    public static final Integer w(xb7 xb7Var, m01 m01Var, int i2, int i3) {
        Integer numW;
        int[] iArr = xb7Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (xb7Var.j(i2) && xb7Var.i(i2) == 206 && dh3.f(xb7Var.p(iArr, i2), d01.e)) {
                Object objH = xb7Var.h(i2, 0);
                pp2 pp2Var = objH instanceof pp2 ? (pp2) objH : null;
                vc6 vc6Var = pp2Var != null ? pp2Var.a : null;
                ip2 ip2Var = vc6Var instanceof ip2 ? (ip2) vc6Var : null;
                if (ip2Var != null && ip2Var.X == m01Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (xb7Var.d(i2) && (numW = w(xb7Var, m01Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(numW.intValue());
            }
            i2 = i4;
        }
    }

    public static final u61 x(Executor executor) {
        u61 u61Var;
        rp1 rp1Var = executor instanceof rp1 ? (rp1) executor : null;
        return (rp1Var == null || (u61Var = rp1Var.X) == null) ? new t52(executor) : u61Var;
    }

    public static Type z(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return z(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return z(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public boolean c(Object obj, Object obj2) {
        tv7 tv7Var = (tv7) obj;
        tv7 tv7Var2 = (tv7) obj2;
        if (tv7Var instanceof pv7) {
            if (tv7Var2 instanceof pv7) {
                return tv7Var.equals(tv7Var2);
            }
        } else if (tv7Var instanceof rv7) {
            if (tv7Var2 instanceof rv7) {
                rv7 rv7Var = (rv7) tv7Var;
                rv7 rv7Var2 = (rv7) tv7Var2;
                ConfigGroupCache configGroupCache = rv7Var.b;
                ConfigGroupCache configGroupCache2 = rv7Var2.b;
                if (rv7Var.c == rv7Var2.c && rv7Var.d == rv7Var2.d && dh3.f(rv7Var.e, rv7Var2.e) && dh3.f(configGroupCache.getSubscriptionItem(), configGroupCache2.getSubscriptionItem()) && configGroupCache.getIsExpand() == configGroupCache2.getIsExpand() && dh3.f(configGroupCache.getSubId(), configGroupCache2.getSubId()) && configGroupCache.getIsPinned() == configGroupCache2.getIsPinned() && configGroupCache.getConfigs().isEmpty() == configGroupCache2.getConfigs().isEmpty()) {
                    return true;
                }
            }
        } else {
            if (!(tv7Var instanceof ov7)) {
                if (tv7Var instanceof sv7) {
                    return tv7Var2 instanceof sv7;
                }
                if (tv7Var instanceof qv7) {
                    return tv7Var2 instanceof qv7;
                }
                b61.c();
                return false;
            }
            if (tv7Var2 instanceof ov7) {
                return tv7Var.equals(tv7Var2);
            }
        }
        return false;
    }

    public boolean d(Object obj, Object obj2) {
        tv7 tv7Var = (tv7) obj;
        tv7 tv7Var2 = (tv7) obj2;
        if (tv7Var instanceof pv7) {
            if (tv7Var2 instanceof pv7) {
                return dh3.f(((pv7) tv7Var).a.getGuid(), ((pv7) tv7Var2).a.getGuid());
            }
        } else {
            if (!(tv7Var instanceof rv7)) {
                if (tv7Var instanceof sv7) {
                    return tv7Var2 instanceof sv7;
                }
                if (tv7Var instanceof qv7) {
                    return tv7Var2 instanceof qv7;
                }
                if (tv7Var instanceof ov7) {
                    return tv7Var2 instanceof ov7;
                }
                b61.c();
                return false;
            }
            if (tv7Var2 instanceof rv7) {
                return dh3.f(((rv7) tv7Var).a.getSubId(), ((rv7) tv7Var2).a.getSubId());
            }
        }
        return false;
    }

    public int hashCode() {
        switch (this.a) {
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                String strE = yb6.a.b(getClass()).E();
                strE.getClass();
                return strE;
            default:
                return super.toString();
        }
    }

    public Object y(Object obj, Object obj2) {
        return null;
    }
}
