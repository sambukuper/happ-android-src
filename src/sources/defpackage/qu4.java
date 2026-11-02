package defpackage;

import io.sentry.c2;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.HpkeSuite;
import org.conscrypt.PSKKeyManager;
import org.conscrypt.metrics.ConscryptStatsLog;
import su.happ.proxyutility.dto.XRayConfig;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qu4 implements bx6 {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final e2 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final m45 j;
    public final ib4 k;
    public final gn8 l;
    public final qp4 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new yn8());
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public qu4(int[] iArr, Object[] objArr, int i, int i2, e2 e2Var, int[] iArr2, int i3, int i4, m45 m45Var, ib4 ib4Var, gn8 gn8Var, u62 u62Var, qp4 qp4Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = e2Var instanceof cq2;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = m45Var;
        this.k = ib4Var;
        this.l = gn8Var;
        this.e = e2Var;
        this.m = qp4Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbP = p61.p("Field ", str, " for ");
            sbP.append(cls.getName());
            sbP.append(" not found. Known fields are ");
            sbP.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbP.toString());
        }
    }

    public static int I(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof cq2) {
            return ((cq2) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0272  */
    /* JADX WARN: Code duplicated, block: B:129:0x0288  */
    /* JADX WARN: Code duplicated, block: B:130:0x028b  */
    public static qu4 w(p66 p66Var, m45 m45Var, ib4 ib4Var, gn8 gn8Var, u62 u62Var, qp4 qp4Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int iObjectFieldOffset3;
        Field fieldF;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldF2;
        int i26;
        Object obj2;
        Field fieldF3;
        int i27;
        char cCharAt10;
        int i28;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(p66Var instanceof p66)) {
            c2.m();
            return null;
        }
        String str = p66Var.b;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = str.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = n;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = str.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = str.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = str.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = str.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = str.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = str.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = str.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = str.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = str.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = str.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = str.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = str.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = str.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = str.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = str.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i60 = (iCharAt3 * 2) + iCharAt4;
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            i4 = iCharAt3;
            i33 = i57;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i60;
            i7 = iCharAt9;
        }
        Object[] objArr = p66Var.c;
        Class<?> cls = p66Var.a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i62 = i7 + i3;
        int i63 = i62;
        int i64 = i7;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int iCharAt10 = str.charAt(i33);
            if (iCharAt10 >= c) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = str.charAt(i69);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i30;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i16 = i30;
            } else {
                i16 = i67;
            }
            int i71 = i16 + 1;
            int iCharAt11 = str.charAt(i16);
            if (iCharAt11 >= c) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = str.charAt(i73);
                    i17 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i29;
                    length = i17;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i18 = i29;
            } else {
                i17 = length;
                i18 = i71;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int i77 = i4;
            Unsafe unsafe = o;
            if (i75 >= 51) {
                int i78 = i18 + 1;
                int iCharAt12 = str.charAt(i18);
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i27 = i80 + 1;
                        cCharAt10 = str.charAt(i80);
                        i28 = i79;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i79 = i28 | ((cCharAt10 & 8191) << i81);
                        i81 += 13;
                        i80 = i27;
                    }
                    iCharAt12 = i28 | (cCharAt10 << i81);
                    i23 = i27;
                } else {
                    i23 = i78;
                }
                int i82 = iCharAt12;
                int i83 = i75 - 51;
                int i84 = i23;
                if (i83 == 9 || i83 == 17) {
                    i24 = i6 + 1;
                    objArr2[((i66 / 3) * 2) + 1] = objArr[i6];
                } else {
                    if (i83 == 12 && (p61.a(p66Var.a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i24 = i6 + 1;
                        objArr2[((i66 / 3) * 2) + 1] = objArr[i6];
                    }
                    i25 = i82 * 2;
                    obj = objArr[i25];
                    if (obj instanceof Field) {
                        fieldF2 = (Field) obj;
                    } else {
                        fieldF2 = F(cls, (String) obj);
                        objArr[i25] = fieldF2;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF2);
                    i26 = i25 + 1;
                    obj2 = objArr[i26];
                    if (obj2 instanceof Field) {
                        fieldF3 = (Field) obj2;
                    } else {
                        fieldF3 = F(cls, (String) obj2);
                        objArr[i26] = fieldF3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF3);
                    objArr2 = objArr2;
                    i20 = i84;
                    i21 = 0;
                }
                i6 = i24;
                i25 = i82 * 2;
                obj = objArr[i25];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr[i25] = fieldF2;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF2);
                i26 = i25 + 1;
                obj2 = objArr[i26];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr[i26] = fieldF3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF3);
                objArr2 = objArr2;
                i20 = i84;
                i21 = 0;
            } else {
                int i85 = i6 + 1;
                Field fieldF4 = F(cls, (String) objArr[i6]);
                if (i75 == 9 || i75 == 17) {
                    i19 = i85;
                    objArr2[((i66 / 3) * 2) + 1] = fieldF4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i22 = i6 + 2;
                        objArr2[((i66 / 3) * 2) + 1] = objArr[i85];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i19 = i85;
                        if (p66Var.a() == 1 || (iCharAt11 & 2048) != 0) {
                            i22 = i6 + 2;
                            objArr2[((i66 / 3) * 2) + 1] = objArr[i19];
                        }
                    } else if (i75 == 50) {
                        int i86 = i64 + 1;
                        iArr[i64] = i66;
                        int i87 = (i66 / 3) * 2;
                        i19 = i6 + 2;
                        objArr2[i87] = objArr[i85];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr2[i87 + 1] = objArr[i19];
                            i19 = i6 + 3;
                        }
                        i64 = i86;
                    } else {
                        i19 = i85;
                    }
                    i19 = i22;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & 4096) == 0 || i75 > 17) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i18;
                    i21 = 0;
                } else {
                    int i88 = i18 + 1;
                    int iCharAt13 = str.charAt(i18);
                    if (iCharAt13 >= 55296) {
                        int i89 = iCharAt13 & 8191;
                        int i90 = 13;
                        while (true) {
                            i20 = i88 + 1;
                            cCharAt9 = str.charAt(i88);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i89 |= (cCharAt9 & 8191) << i90;
                            i90 += 13;
                            i88 = i20;
                        }
                        iCharAt13 = i89 | (cCharAt9 << i90);
                    } else {
                        i20 = i88;
                    }
                    int i91 = (iCharAt13 / 32) + (i77 * 2);
                    Object obj3 = objArr[i91];
                    if (obj3 instanceof Field) {
                        fieldF = (Field) obj3;
                    } else {
                        fieldF = F(cls, (String) obj3);
                        objArr[i91] = fieldF;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                    i21 = iCharAt13 % 32;
                }
                if (i75 < 18 || i75 > 49) {
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                } else {
                    iArr[i63] = iObjectFieldOffset;
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                    i63++;
                }
                i6 = i19;
            }
            int i92 = i66 + 1;
            iArr3[i66] = i76;
            int i93 = i66 + 2;
            String str2 = str;
            iArr3[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | iObjectFieldOffset;
            i66 += 3;
            iArr3[i93] = (i21 << 20) | iObjectFieldOffset3;
            objArr2 = objArr2;
            str = str2;
            i33 = i20;
            length = i17;
            i4 = i77;
            iArr3 = iArr3;
            i62 = i62;
            c = 55296;
        }
        return new qu4(iArr3, objArr2, i2, i5, p66Var.a, iArr, i7, i62, m45Var, ib4Var, gn8Var, u62Var, qp4Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) ao8.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) ao8.h(j, obj)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void B(Object obj, long j, kv0 kv0Var, bx6 bx6Var, s62 s62Var) throws qh3.a {
        int iY;
        this.k.getClass();
        cg3 cg3VarA = ib4.a(j, obj);
        jv0 jv0Var = kv0Var.a;
        int i = kv0Var.b;
        if ((i & 7) != 3) {
            throw qh3.b();
        }
        do {
            cq2 cq2VarI = bx6Var.i();
            kv0Var.b(cq2VarI, bx6Var, s62Var);
            bx6Var.b(cq2VarI);
            ((m06) cg3VarA).add(cq2VarI);
            if (jv0Var.c() || kv0Var.d != 0) {
                return;
            } else {
                iY = jv0Var.y();
            }
        } while (iY == i);
        kv0Var.d = iY;
    }

    public final void C(Object obj, int i, kv0 kv0Var, bx6 bx6Var, s62 s62Var) throws qh3 {
        int iY;
        this.k.getClass();
        cg3 cg3VarA = ib4.a(i & 1048575, obj);
        jv0 jv0Var = kv0Var.a;
        int i2 = kv0Var.b;
        if ((i2 & 7) != 2) {
            throw qh3.b();
        }
        do {
            cq2 cq2VarI = bx6Var.i();
            kv0Var.c(cq2VarI, bx6Var, s62Var);
            bx6Var.b(cq2VarI);
            ((m06) cg3VarA).add(cq2VarI);
            if (jv0Var.c() || kv0Var.d != 0) {
                return;
            } else {
                iY = jv0Var.y();
            }
        } while (iY == i2);
        kv0Var.d = iY;
    }

    public final void D(int i, kv0 kv0Var, Object obj) throws qh3.a {
        jv0 jv0Var = kv0Var.a;
        if ((536870912 & i) != 0) {
            kv0Var.w(2);
            ao8.o(i & 1048575, obj, jv0Var.x());
        } else if (!this.f) {
            ao8.o(i & 1048575, obj, kv0Var.e());
        } else {
            kv0Var.w(2);
            ao8.o(i & 1048575, obj, jv0Var.w());
        }
    }

    public final void E(int i, kv0 kv0Var, Object obj) throws qh3.a {
        boolean z = (536870912 & i) != 0;
        ib4 ib4Var = this.k;
        if (z) {
            ib4Var.getClass();
            kv0Var.s(ib4.a(i & 1048575, obj), true);
        } else {
            ib4Var.getClass();
            kv0Var.s(ib4.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        ao8.m(obj, j, (1 << (i2 >>> 20)) | ao8.f(j, obj));
    }

    public final void H(int i, int i2, Object obj) {
        ao8.m(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // defpackage.bx6
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            bt.q(oi0.k(obj, "Mutating immutable message: "));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                ex6.k(this.l, obj, obj2);
                return;
            }
            int iJ = J(i);
            long j = 1048575 & iJ;
            int i2 = iArr[i];
            switch (I(iJ)) {
                case 0:
                    if (!n(i, obj2)) {
                        obj3 = obj;
                    } else {
                        cw0 cw0Var = ao8.c;
                        obj3 = obj;
                        cw0Var.z0(obj3, j, cw0Var.t0(j, obj2));
                        G(i, obj3);
                    }
                    break;
                case 1:
                    if (n(i, obj2)) {
                        cw0 cw0Var2 = ao8.c;
                        cw0Var2.A0(obj, j, cw0Var2.u0(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        ao8.n(obj, j, ao8.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        ao8.n(obj, j, ao8.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        ao8.m(obj, j, ao8.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        ao8.n(obj, j, ao8.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        ao8.m(obj, j, ao8.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i, obj2)) {
                        cw0 cw0Var3 = ao8.c;
                        cw0Var3.x0(obj, j, cw0Var3.s0(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        ao8.o(j, obj, ao8.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        ao8.o(j, obj, ao8.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        ao8.m(obj, j, ao8.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                    if (n(i, obj2)) {
                        ao8.m(obj, j, ao8.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        ao8.m(obj, j, ao8.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        ao8.n(obj, j, ao8.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        ao8.m(obj, j, ao8.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    if (n(i, obj2)) {
                        ao8.n(obj, j, ao8.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
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
                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                case 48:
                case 49:
                    this.k.getClass();
                    cg3 cg3VarC = (cg3) ao8.h(j, obj);
                    cg3 cg3Var = (cg3) ao8.h(j, obj2);
                    int i3 = ((m06) cg3VarC).Z;
                    int i4 = ((m06) cg3Var).Z;
                    if (i3 > 0 && i4 > 0) {
                        if (!((m06) cg3VarC).X) {
                            cg3VarC = ((m06) cg3VarC).c(i4 + i3);
                        }
                        ((m06) cg3VarC).addAll(cg3Var);
                    }
                    if (i3 > 0) {
                        cg3Var = cg3VarC;
                    }
                    ao8.o(j, obj, cg3Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = ex6.a;
                    Object objH = ao8.h(j, obj);
                    Object objH2 = ao8.h(j, obj2);
                    this.m.getClass();
                    ao8.o(j, obj, qp4.a(objH, objH2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(i2, i, obj2)) {
                        ao8.o(j, obj, ao8.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                case 65:
                case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                case 67:
                    if (q(i2, i, obj2)) {
                        ao8.o(j, obj, ao8.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[SYNTHETIC] */
    @Override // defpackage.bx6
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof cq2) {
                cq2 cq2Var = (cq2) obj;
                cq2Var.k(Integer.MAX_VALUE);
                cq2Var.memoizedHashCode = 0;
                cq2Var.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iJ = J(i);
                long j = 1048575 & iJ;
                int I = I(iJ);
                Unsafe unsafe = o;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
                            case 17:
                                if (n(i, obj)) {
                                    m(i).b(unsafe.getObject(obj, j));
                                }
                                break;
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
                            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                            case 48:
                            case 49:
                                this.k.getClass();
                                m06 m06Var = (m06) ((cg3) ao8.h(j, obj));
                                if (m06Var.X) {
                                    m06Var.X = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((pp4) object).X = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).b(unsafe.getObject(obj, j));
                    }
                } else if (n(i, obj)) {
                    m(i).b(unsafe.getObject(obj, j));
                }
            }
            ((in8) this.l).getClass();
            hn8 hn8Var = ((cq2) obj).unknownFields;
            if (hn8Var.e) {
                hn8Var.e = false;
            }
        }
    }

    @Override // defpackage.bx6
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.h) {
            int i6 = this.g[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iJ = J(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iJ) == 0 || o(obj, i6, i, i2, i10)) {
                int I = I(iJ);
                if (I != 9 && I != 17) {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (!q(i7, i6, obj) || m(i6).c(ao8.h(iJ & 1048575, obj))) {
                                i5++;
                                i3 = i;
                                i4 = i2;
                            }
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object objH = ao8.h(iJ & 1048575, obj);
                                this.m.getClass();
                                pp4 pp4Var = (pp4) objH;
                                if (pp4Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((b39) ((np4) this.b[(i6 / 3) * 2]).a.Z).X != d39.MESSAGE) {
                                        continue;
                                    } else {
                                        bx6 bx6VarA = null;
                                        for (Object obj2 : pp4Var.values()) {
                                            if (bx6VarA == null) {
                                                bx6VarA = l06.c.a(obj2.getClass());
                                            }
                                            if (!bx6VarA.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) ao8.h(iJ & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        bx6 bx6VarM = m(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (bx6VarM.c(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else if (!o(obj, i6, i, i2, i10) || m(i6).c(ao8.h(iJ & 1048575, obj))) {
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // defpackage.bx6
    public final boolean d(cq2 cq2Var, cq2 cq2Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iJ = J(i);
                long j = iJ & 1048575;
                switch (I(iJ)) {
                    case 0:
                        if (!j(cq2Var, cq2Var2, i)) {
                            zL = false;
                        } else {
                            cw0 cw0Var = ao8.c;
                            if (Double.doubleToLongBits(cw0Var.t0(j, cq2Var)) != Double.doubleToLongBits(cw0Var.t0(j, cq2Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(cq2Var, cq2Var2, i)) {
                            zL = false;
                        } else {
                            cw0 cw0Var2 = ao8.c;
                            if (Float.floatToIntBits(cw0Var2.u0(j, cq2Var)) != Float.floatToIntBits(cw0Var2.u0(j, cq2Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(cq2Var, cq2Var2, i) || ao8.g(j, cq2Var) != ao8.g(j, cq2Var2)) {
                            zL = false;
                        }
                        break;
                    case 3:
                        if (!j(cq2Var, cq2Var2, i) || ao8.g(j, cq2Var) != ao8.g(j, cq2Var2)) {
                            zL = false;
                        }
                        break;
                    case 4:
                        if (!j(cq2Var, cq2Var2, i) || ao8.f(j, cq2Var) != ao8.f(j, cq2Var2)) {
                            zL = false;
                        }
                        break;
                    case 5:
                        if (!j(cq2Var, cq2Var2, i) || ao8.g(j, cq2Var) != ao8.g(j, cq2Var2)) {
                            zL = false;
                        }
                        break;
                    case 6:
                        if (!j(cq2Var, cq2Var2, i) || ao8.f(j, cq2Var) != ao8.f(j, cq2Var2)) {
                            zL = false;
                        }
                        break;
                    case 7:
                        if (!j(cq2Var, cq2Var2, i)) {
                            zL = false;
                        } else {
                            cw0 cw0Var3 = ao8.c;
                            if (cw0Var3.s0(j, cq2Var) != cw0Var3.s0(j, cq2Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(cq2Var, cq2Var2, i) || !ex6.l(ao8.h(j, cq2Var), ao8.h(j, cq2Var2))) {
                            zL = false;
                        }
                        break;
                    case 9:
                        if (!j(cq2Var, cq2Var2, i) || !ex6.l(ao8.h(j, cq2Var), ao8.h(j, cq2Var2))) {
                            zL = false;
                        }
                        break;
                    case 10:
                        if (!j(cq2Var, cq2Var2, i) || !ex6.l(ao8.h(j, cq2Var), ao8.h(j, cq2Var2))) {
                            zL = false;
                        }
                        break;
                    case 11:
                        if (!j(cq2Var, cq2Var2, i) || ao8.f(j, cq2Var) != ao8.f(j, cq2Var2)) {
                            zL = false;
                        }
                        break;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        if (!j(cq2Var, cq2Var2, i) || ao8.f(j, cq2Var) != ao8.f(j, cq2Var2)) {
                            zL = false;
                        }
                        break;
                    case 13:
                        if (!j(cq2Var, cq2Var2, i) || ao8.f(j, cq2Var) != ao8.f(j, cq2Var2)) {
                            zL = false;
                        }
                        break;
                    case 14:
                        if (!j(cq2Var, cq2Var2, i) || ao8.g(j, cq2Var) != ao8.g(j, cq2Var2)) {
                            zL = false;
                        }
                        break;
                    case 15:
                        if (!j(cq2Var, cq2Var2, i) || ao8.f(j, cq2Var) != ao8.f(j, cq2Var2)) {
                            zL = false;
                        }
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        if (!j(cq2Var, cq2Var2, i) || ao8.g(j, cq2Var) != ao8.g(j, cq2Var2)) {
                            zL = false;
                        }
                        break;
                    case 17:
                        if (!j(cq2Var, cq2Var2, i) || !ex6.l(ao8.h(j, cq2Var), ao8.h(j, cq2Var2))) {
                            zL = false;
                        }
                        break;
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
                    case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                    case 48:
                    case 49:
                        zL = ex6.l(ao8.h(j, cq2Var), ao8.h(j, cq2Var2));
                        break;
                    case 50:
                        zL = ex6.l(ao8.h(j, cq2Var), ao8.h(j, cq2Var2));
                        break;
                    case 51:
                    case 52:
                    case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                    case 54:
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
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (ao8.f(j2, cq2Var) != ao8.f(j2, cq2Var2) || !ex6.l(ao8.h(j, cq2Var), ao8.h(j, cq2Var2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i += 3;
                }
            } else {
                in8 in8Var = (in8) this.l;
                in8Var.getClass();
                hn8 hn8Var = cq2Var.unknownFields;
                in8Var.getClass();
                if (hn8Var.equals(cq2Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x07ee A[Catch: all -> 0x04e0, TryCatch #0 {all -> 0x04e0, blocks: (B:158:0x07e9, B:160:0x07ee, B:161:0x07f3, B:114:0x04db, B:117:0x04e3, B:118:0x04fb, B:119:0x0513, B:120:0x052b, B:121:0x0543, B:122:0x055b, B:123:0x0573, B:124:0x058b, B:125:0x05a3, B:126:0x05cb, B:127:0x05e9, B:128:0x0607, B:129:0x0626, B:130:0x0645, B:131:0x0666, B:132:0x0684, B:133:0x069d, B:134:0x06c5, B:135:0x06d6, B:136:0x06f6, B:137:0x0715, B:138:0x0734, B:139:0x0752, B:140:0x0770, B:141:0x078d, B:142:0x07ad, B:148:0x07cd), top: B:179:0x07e9 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x07fd A[LOOP:2: B:164:0x07fb->B:165:0x07fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x0814 A[LOOP:3: B:170:0x0812->B:171:0x0814, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x081e  */
    /* JADX WARN: Code duplicated, block: B:208:0x07f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bx6
    public final void e(Object obj, kv0 kv0Var, s62 s62Var) throws Throwable {
        int[] iArr;
        int i;
        int i2;
        kv0 kv0Var2;
        s62 s62Var2;
        int i3;
        qu4 qu4Var = this;
        Object obj2 = obj;
        kv0 kv0Var3 = kv0Var;
        s62 s62Var3 = s62Var;
        s62Var3.getClass();
        if (!p(obj2)) {
            bt.q(oi0.k(obj2, "Mutating immutable message: "));
            return;
        }
        gn8 gn8Var = qu4Var.l;
        int[] iArr2 = qu4Var.g;
        int i4 = qu4Var.i;
        int i5 = qu4Var.h;
        hn8 hn8VarA = null;
        while (true) {
            try {
                int iA = kv0Var3.a();
                int iA2 = qu4Var.A(iA);
                if (iA2 >= 0) {
                    int iJ = qu4Var.J(iA2);
                    try {
                        try {
                            int I = I(iJ);
                            Unsafe unsafe = o;
                            ib4 ib4Var = qu4Var.k;
                            switch (I) {
                                case 0:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX = x(iJ);
                                    kv0Var2.w(1);
                                    try {
                                        try {
                                            ao8.c.z0(obj, jX, kv0Var2.a.l());
                                            obj2 = obj;
                                            qu4Var.G(iA2, obj2);
                                        } catch (qh3.a unused) {
                                            obj2 = obj;
                                            try {
                                                gn8Var.getClass();
                                                if (hn8VarA == null) {
                                                    hn8VarA = gn8Var.a(obj2);
                                                }
                                                if (!gn8Var.b(0, kv0Var2, hn8VarA)) {
                                                    i3 = i2;
                                                    while (i5 < i3) {
                                                        qu4Var.k(iArr[i5], obj2, hn8VarA);
                                                        i5++;
                                                    }
                                                    if (hn8VarA == null) {
                                                        return;
                                                    }
                                                    ((cq2) obj2).unknownFields = hn8VarA;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                i = i2;
                                                while (i5 < i) {
                                                    qu4Var.k(iArr[i5], obj2, hn8VarA);
                                                    i5++;
                                                }
                                                if (hn8VarA != null) {
                                                    ((in8) gn8Var).getClass();
                                                    ((cq2) obj2).unknownFields = hn8VarA;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = obj;
                                            i = i2;
                                            while (i5 < i) {
                                                qu4Var.k(iArr[i5], obj2, hn8VarA);
                                                i5++;
                                            }
                                            if (hn8VarA != null) {
                                                ((in8) gn8Var).getClass();
                                                ((cq2) obj2).unknownFields = hn8VarA;
                                            }
                                            throw th;
                                        }
                                    } catch (qh3.a unused2) {
                                        obj2 = obj;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj;
                                    }
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 1:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX2 = x(iJ);
                                    kv0Var2.w(5);
                                    ao8.c.A0(obj2, jX2, kv0Var2.a.p());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 2:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX3 = x(iJ);
                                    kv0Var2.w(0);
                                    ao8.n(obj2, jX3, kv0Var2.a.r());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 3:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX4 = x(iJ);
                                    kv0Var2.w(0);
                                    ao8.n(obj2, jX4, kv0Var2.a.A());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 4:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX5 = x(iJ);
                                    kv0Var2.w(0);
                                    ao8.m(obj2, jX5, kv0Var2.a.q());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 5:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX6 = x(iJ);
                                    kv0Var2.w(1);
                                    ao8.n(obj2, jX6, kv0Var2.a.o());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 6:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX7 = x(iJ);
                                    kv0Var2.w(5);
                                    ao8.m(obj2, jX7, kv0Var2.a.n());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 7:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX8 = x(iJ);
                                    kv0Var2.w(0);
                                    ao8.c.x0(obj2, jX8, kv0Var2.a.j());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 8:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    qu4Var.D(iJ, kv0Var2, obj2);
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 9:
                                    qu4Var = qu4Var;
                                    iArr = iArr2;
                                    i2 = i4;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    e2 e2Var = (e2) qu4Var.u(iA2, obj2);
                                    bx6 bx6VarM = qu4Var.m(iA2);
                                    kv0Var2.w(2);
                                    kv0Var2.c(e2Var, bx6VarM, s62Var2);
                                    unsafe.putObject(obj2, qu4Var.J(iA2) & 1048575, e2Var);
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 10:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    ao8.o(x(iJ), obj2, kv0Var2.e());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 11:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX9 = x(iJ);
                                    kv0Var2.w(0);
                                    ao8.m(obj2, jX9, kv0Var2.a.z());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case FileClientSessionCache.MAX_SIZE /* 12 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var2.w(0);
                                    int iM = kv0Var2.a.m();
                                    qu4Var.l(iA2);
                                    ao8.m(obj2, x(iJ), iM);
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 13:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX10 = x(iJ);
                                    kv0Var2.w(5);
                                    ao8.m(obj2, jX10, kv0Var2.a.s());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 14:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX11 = x(iJ);
                                    kv0Var2.w(1);
                                    ao8.n(obj2, jX11, kv0Var2.a.t());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 15:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX12 = x(iJ);
                                    kv0Var2.w(0);
                                    ao8.m(obj2, jX12, kv0Var2.a.u());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX13 = x(iJ);
                                    kv0Var2.w(0);
                                    ao8.n(obj2, jX13, kv0Var2.a.v());
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 17:
                                    qu4Var = qu4Var;
                                    iArr = iArr2;
                                    i2 = i4;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    e2 e2Var2 = (e2) qu4Var.u(iA2, obj2);
                                    bx6 bx6VarM2 = qu4Var.m(iA2);
                                    kv0Var2.w(3);
                                    kv0Var2.b(e2Var2, bx6VarM2, s62Var2);
                                    unsafe.putObject(obj2, qu4Var.J(iA2) & 1048575, e2Var2);
                                    qu4Var.G(iA2, obj2);
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 18:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX14 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var2.g(ib4.a(jX14, obj2));
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 19:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX15 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var2.l(ib4.a(jX15, obj2));
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 20:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX16 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var2.n(ib4.a(jX16, obj2));
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX17 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var2.u(ib4.a(jX17, obj2));
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 22:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX18 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var2.m(ib4.a(jX18, obj2));
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 23:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX19 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var2.k(ib4.a(jX19, obj2));
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 24:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX20 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var2.j(ib4.a(jX20, obj2));
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 25:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    long jX21 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var2.d(ib4.a(jX21, obj2));
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 26:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    try {
                                        qu4Var.E(iJ, kv0Var2, obj2);
                                    } catch (qh3.a unused3) {
                                        gn8Var.getClass();
                                        if (hn8VarA == null) {
                                            hn8VarA = gn8Var.a(obj2);
                                        }
                                        if (!gn8Var.b(0, kv0Var2, hn8VarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                qu4Var.k(iArr[i5], obj2, hn8VarA);
                                                i5++;
                                            }
                                            if (hn8VarA == null) {
                                                return;
                                            }
                                            ((cq2) obj2).unknownFields = hn8VarA;
                                        }
                                    }
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 27:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        qu4Var.C(obj2, iJ, kv0Var3, qu4Var.m(iA2), s62Var);
                                        kv0Var2 = kv0Var3;
                                        s62Var2 = s62Var;
                                        qu4Var = qu4Var;
                                    } catch (qh3.a unused4) {
                                        kv0Var2 = kv0Var3;
                                        s62Var2 = s62Var;
                                        qu4Var = qu4Var;
                                        gn8Var.getClass();
                                        if (hn8VarA == null) {
                                            hn8VarA = gn8Var.a(obj2);
                                        }
                                        if (!gn8Var.b(0, kv0Var2, hn8VarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                qu4Var.k(iArr[i5], obj2, hn8VarA);
                                                i5++;
                                            }
                                            if (hn8VarA == null) {
                                                return;
                                            }
                                            ((cq2) obj2).unknownFields = hn8VarA;
                                        }
                                    }
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case _DnsMessageKt.TYPE_AAAA /* 28 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX22 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.f(ib4.a(jX22, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 29:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX23 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.t(ib4.a(jX23, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX24 = x(iJ);
                                    ib4Var.getClass();
                                    cg3 cg3VarA = ib4.a(jX24, obj2);
                                    kv0Var3.h(cg3VarA);
                                    qu4Var.l(iA2);
                                    ex6.j(obj2, iA, cg3VarA, hn8VarA, gn8Var);
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 31:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX25 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.o(ib4.a(jX25, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 32:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX26 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.p(ib4.a(jX26, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 33:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX27 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.q(ib4.a(jX27, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 34:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX28 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.r(ib4.a(jX28, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 35:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX29 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.g(ib4.a(jX29, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 36:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX30 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.l(ib4.a(jX30, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 37:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX31 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.n(ib4.a(jX31, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 38:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX32 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.u(ib4.a(jX32, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 39:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX33 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.m(ib4.a(jX33, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 40:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX34 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.k(ib4.a(jX34, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 41:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX35 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.j(ib4.a(jX35, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 42:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX36 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.d(ib4.a(jX36, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 43:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX37 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.t(ib4.a(jX37, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 44:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX38 = x(iJ);
                                    ib4Var.getClass();
                                    cg3 cg3VarA2 = ib4.a(jX38, obj2);
                                    kv0Var3.h(cg3VarA2);
                                    qu4Var.l(iA2);
                                    ex6.j(obj2, iA, cg3VarA2, hn8VarA, gn8Var);
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 45:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX39 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.o(ib4.a(jX39, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 46:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX40 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.p(ib4.a(jX40, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX41 = x(iJ);
                                    ib4Var.getClass();
                                    kv0Var3.q(ib4.a(jX41, obj2));
                                    s62Var2 = s62Var;
                                    qu4Var = qu4Var;
                                    kv0Var2 = kv0Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 48:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        long jX42 = x(iJ);
                                        ib4Var.getClass();
                                        kv0Var3.r(ib4.a(jX42, obj2));
                                        s62Var2 = s62Var;
                                        qu4Var = qu4Var;
                                        kv0Var2 = kv0Var3;
                                    } catch (qh3.a unused5) {
                                        s62Var2 = s62Var;
                                        qu4Var = qu4Var;
                                        kv0Var2 = kv0Var3;
                                        gn8Var.getClass();
                                        if (hn8VarA == null) {
                                            hn8VarA = gn8Var.a(obj2);
                                        }
                                        if (!gn8Var.b(0, kv0Var2, hn8VarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                qu4Var.k(iArr[i5], obj2, hn8VarA);
                                                i5++;
                                            }
                                            if (hn8VarA == null) {
                                                return;
                                            }
                                            ((cq2) obj2).unknownFields = hn8VarA;
                                        }
                                    }
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 49:
                                    iArr = iArr2;
                                    i2 = i4;
                                    obj2 = obj;
                                    try {
                                        qu4Var.B(obj2, x(iJ), kv0Var, qu4Var.m(iA2), s62Var);
                                        kv0Var3 = kv0Var;
                                        s62Var2 = s62Var;
                                        qu4Var = qu4Var;
                                        kv0Var2 = kv0Var3;
                                    } catch (qh3.a unused6) {
                                        s62Var2 = s62Var;
                                        qu4Var = qu4Var;
                                        kv0Var2 = kv0Var;
                                        gn8Var.getClass();
                                        if (hn8VarA == null) {
                                            hn8VarA = gn8Var.a(obj2);
                                        }
                                        if (!gn8Var.b(0, kv0Var2, hn8VarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                qu4Var.k(iArr[i5], obj2, hn8VarA);
                                                i5++;
                                            }
                                            if (hn8VarA == null) {
                                                return;
                                            }
                                            ((cq2) obj2).unknownFields = hn8VarA;
                                        }
                                    }
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 50:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        qu4Var.r(obj2, iA2, qu4Var.b[(iA2 / 3) * 2], s62Var3, kv0Var3);
                                        obj2 = obj;
                                        kv0Var2 = kv0Var;
                                        s62Var2 = s62Var;
                                        qu4Var = qu4Var;
                                    } catch (qh3.a unused7) {
                                        obj2 = obj;
                                        kv0Var2 = kv0Var;
                                        s62Var2 = s62Var;
                                        qu4Var = qu4Var;
                                        gn8Var.getClass();
                                        if (hn8VarA == null) {
                                            hn8VarA = gn8Var.a(obj2);
                                        }
                                        if (!gn8Var.b(0, kv0Var2, hn8VarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                qu4Var.k(iArr[i5], obj2, hn8VarA);
                                                i5++;
                                            }
                                            if (hn8VarA == null) {
                                                return;
                                            }
                                            ((cq2) obj2).unknownFields = hn8VarA;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj;
                                        qu4Var = qu4Var;
                                        i = i2;
                                        while (i5 < i) {
                                            qu4Var.k(iArr[i5], obj2, hn8VarA);
                                            i5++;
                                        }
                                        if (hn8VarA != null) {
                                            ((in8) gn8Var).getClass();
                                            ((cq2) obj2).unknownFields = hn8VarA;
                                        }
                                        throw th;
                                    }
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 51:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX43 = x(iJ);
                                    kv0Var3.w(1);
                                    ao8.o(jX43, obj2, Double.valueOf(kv0Var3.a.l()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 52:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX44 = x(iJ);
                                    kv0Var3.w(5);
                                    ao8.o(jX44, obj2, Float.valueOf(kv0Var3.a.p()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX45 = x(iJ);
                                    kv0Var3.w(0);
                                    ao8.o(jX45, obj2, Long.valueOf(kv0Var3.a.r()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 54:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX46 = x(iJ);
                                    kv0Var3.w(0);
                                    ao8.o(jX46, obj2, Long.valueOf(kv0Var3.a.A()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 55:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX47 = x(iJ);
                                    kv0Var3.w(0);
                                    ao8.o(jX47, obj2, Integer.valueOf(kv0Var3.a.q()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 56:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX48 = x(iJ);
                                    kv0Var3.w(1);
                                    ao8.o(jX48, obj2, Long.valueOf(kv0Var3.a.o()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 57:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX49 = x(iJ);
                                    kv0Var3.w(5);
                                    ao8.o(jX49, obj2, Integer.valueOf(kv0Var3.a.n()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 58:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX50 = x(iJ);
                                    kv0Var3.w(0);
                                    ao8.o(jX50, obj2, Boolean.valueOf(kv0Var3.a.j()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 59:
                                    iArr = iArr2;
                                    i2 = i4;
                                    qu4Var.D(iJ, kv0Var3, obj2);
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 60:
                                    iArr = iArr2;
                                    i2 = i4;
                                    e2 e2Var3 = (e2) qu4Var.v(iA, iA2, obj2);
                                    bx6 bx6VarM3 = qu4Var.m(iA2);
                                    kv0Var3.w(2);
                                    kv0Var3.c(e2Var3, bx6VarM3, s62Var3);
                                    unsafe.putObject(obj2, qu4Var.J(iA2) & 1048575, e2Var3);
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 61:
                                    iArr = iArr2;
                                    i2 = i4;
                                    ao8.o(x(iJ), obj2, kv0Var3.e());
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 62:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX51 = x(iJ);
                                    kv0Var3.w(0);
                                    ao8.o(jX51, obj2, Integer.valueOf(kv0Var3.a.z()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 63:
                                    iArr = iArr2;
                                    i2 = i4;
                                    kv0Var3.w(0);
                                    int iM2 = kv0Var3.a.m();
                                    qu4Var.l(iA2);
                                    ao8.o(x(iJ), obj2, Integer.valueOf(iM2));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX52 = x(iJ);
                                    kv0Var3.w(5);
                                    ao8.o(jX52, obj2, Integer.valueOf(kv0Var3.a.s()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 65:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX53 = x(iJ);
                                    kv0Var3.w(1);
                                    ao8.o(jX53, obj2, Long.valueOf(kv0Var3.a.t()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX54 = x(iJ);
                                    kv0Var3.w(0);
                                    ao8.o(jX54, obj2, Integer.valueOf(kv0Var3.a.u()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 67:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX55 = x(iJ);
                                    kv0Var3.w(0);
                                    ao8.o(jX55, obj2, Long.valueOf(kv0Var3.a.v()));
                                    qu4Var.H(iA, iA2, obj2);
                                    kv0Var2 = kv0Var3;
                                    s62Var2 = s62Var3;
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                case 68:
                                    try {
                                        e2 e2Var4 = (e2) qu4Var.v(iA, iA2, obj2);
                                        bx6 bx6VarM4 = qu4Var.m(iA2);
                                        kv0Var3.w(3);
                                        kv0Var3.b(e2Var4, bx6VarM4, s62Var3);
                                        iArr = iArr2;
                                        i2 = i4;
                                        try {
                                            try {
                                                unsafe.putObject(obj2, qu4Var.J(iA2) & 1048575, e2Var4);
                                                qu4Var.H(iA, iA2, obj2);
                                                kv0Var2 = kv0Var3;
                                                s62Var2 = s62Var3;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                qu4Var = qu4Var;
                                                i = i2;
                                                while (i5 < i) {
                                                    qu4Var.k(iArr[i5], obj2, hn8VarA);
                                                    i5++;
                                                }
                                                if (hn8VarA != null) {
                                                    ((in8) gn8Var).getClass();
                                                    ((cq2) obj2).unknownFields = hn8VarA;
                                                }
                                                throw th;
                                            }
                                        } catch (qh3.a unused8) {
                                            kv0Var2 = kv0Var3;
                                            s62Var2 = s62Var3;
                                            gn8Var.getClass();
                                            if (hn8VarA == null) {
                                                hn8VarA = gn8Var.a(obj2);
                                            }
                                            if (!gn8Var.b(0, kv0Var2, hn8VarA)) {
                                                i3 = i2;
                                                while (i5 < i3) {
                                                    qu4Var.k(iArr[i5], obj2, hn8VarA);
                                                    i5++;
                                                }
                                                if (hn8VarA == null) {
                                                    return;
                                                }
                                                ((cq2) obj2).unknownFields = hn8VarA;
                                            }
                                        }
                                    } catch (qh3.a unused9) {
                                        iArr = iArr2;
                                        i2 = i4;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        iArr = iArr2;
                                        i2 = i4;
                                    }
                                    kv0Var3 = kv0Var2;
                                    s62Var3 = s62Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    qu4Var = qu4Var;
                                    break;
                                default:
                                    if (hn8VarA == null) {
                                        hn8VarA = gn8Var.a(obj2);
                                    }
                                    if (gn8Var.b(0, kv0Var3, hn8VarA)) {
                                        iArr = iArr2;
                                        i2 = i4;
                                        kv0Var2 = kv0Var3;
                                        s62Var2 = s62Var3;
                                        kv0Var3 = kv0Var2;
                                        s62Var3 = s62Var2;
                                        iArr2 = iArr;
                                        i4 = i2;
                                        qu4Var = qu4Var;
                                    } else {
                                        while (i5 < i4) {
                                            qu4Var.k(iArr2[i5], obj2, hn8VarA);
                                            i5++;
                                        }
                                        if (hn8VarA == null) {
                                            return;
                                        }
                                    }
                                    break;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            qu4Var = qu4Var;
                            iArr = iArr2;
                            i2 = i4;
                        }
                    } catch (qh3.a unused10) {
                        iArr = iArr2;
                        i2 = i4;
                    }
                } else if (iA == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        qu4Var.k(iArr2[i5], obj2, hn8VarA);
                        i5++;
                    }
                    if (hn8VarA == null) {
                        return;
                    } else {
                        ((in8) gn8Var).getClass();
                    }
                } else {
                    gn8Var.getClass();
                    if (hn8VarA == null) {
                        hn8VarA = gn8Var.a(obj2);
                    }
                    if (!gn8Var.b(0, kv0Var3, hn8VarA)) {
                        while (i5 < i4) {
                            qu4Var.k(iArr2[i5], obj2, hn8VarA);
                            i5++;
                        }
                        if (hn8VarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                qu4Var = qu4Var;
                iArr = iArr2;
                i = i4;
            }
        }
        ((cq2) obj2).unknownFields = hn8VarA;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.bx6
    public final int f(cq2 cq2Var) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iJ = J(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iJ;
            int i6 = 1237;
            int iHashCode = 37;
            switch (I(iJ)) {
                case 0:
                    i = i3 * 53;
                    iB = eg3.b(Double.doubleToLongBits(ao8.c.t0(j, cq2Var)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(ao8.c.u0(j, cq2Var));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = eg3.b(ao8.g(j, cq2Var));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = eg3.b(ao8.g(j, cq2Var));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = ao8.f(j, cq2Var);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = eg3.b(ao8.g(j, cq2Var));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = ao8.f(j, cq2Var);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zS0 = ao8.c.s0(j, cq2Var);
                    Charset charset = eg3.a;
                    if (zS0) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) ao8.h(j, cq2Var)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objH = ao8.h(j, cq2Var);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = ao8.h(j, cq2Var).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = ao8.f(j, cq2Var);
                    i3 = iB + i;
                    break;
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                    i = i3 * 53;
                    iB = ao8.f(j, cq2Var);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = ao8.f(j, cq2Var);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = eg3.b(ao8.g(j, cq2Var));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = ao8.f(j, cq2Var);
                    i3 = iB + i;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    i = i3 * 53;
                    iB = eg3.b(ao8.g(j, cq2Var));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objH2 = ao8.h(j, cq2Var);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
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
                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                case 48:
                case 49:
                    i = i3 * 53;
                    iB = ao8.h(j, cq2Var).hashCode();
                    i3 = iB + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = ao8.h(j, cq2Var).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = eg3.b(Double.doubleToLongBits(((Double) ao8.h(j, cq2Var)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) ao8.h(j, cq2Var)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = eg3.b(z(j, cq2Var));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = eg3.b(z(j, cq2Var));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = y(j, cq2Var);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = eg3.b(z(j, cq2Var));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = y(j, cq2Var);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (q(i5, i4, cq2Var)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) ao8.h(j, cq2Var)).booleanValue();
                        Charset charset2 = eg3.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = ((String) ao8.h(j, cq2Var)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = ao8.h(j, cq2Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = ao8.h(j, cq2Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = y(j, cq2Var);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = y(j, cq2Var);
                        i3 = iB + i;
                    }
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = y(j, cq2Var);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = eg3.b(z(j, cq2Var));
                        i3 = iB + i;
                    }
                    break;
                case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = y(j, cq2Var);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = eg3.b(z(j, cq2Var));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (q(i5, i4, cq2Var)) {
                        i = i3 * 53;
                        iB = ao8.h(j, cq2Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        ((in8) this.l).getClass();
        return cq2Var.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01ce  */
    @Override // defpackage.bx6
    public final int g(cq2 cq2Var) {
        int i;
        int iH;
        int iH2;
        int iH3;
        int iJ;
        int iH4;
        int iJ2;
        int iH5;
        int iH6;
        int iH7;
        int iA;
        int i2;
        int iF;
        int iH8;
        int iA2;
        int iC;
        int iH9;
        int size;
        int i3;
        int iH10;
        int iH11;
        int size2;
        int iH12;
        int i4;
        int iA3;
        int iH13;
        int iH14;
        int iJ3;
        int iH15;
        int iJ4;
        int i5;
        qu4 qu4Var = this;
        cq2 cq2Var2 = cq2Var;
        int i6 = 0;
        int i7 = 0;
        int iF2 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = qu4Var.a;
            if (i6 >= iArr.length) {
                ((in8) qu4Var.l).getClass();
                return cq2Var2.unknownFields.b() + iF2;
            }
            int iJ5 = qu4Var.J(i6);
            int I = I(iJ5);
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & 1048575;
            Unsafe unsafe = o;
            if (I <= 17) {
                if (i11 != i8) {
                    i7 = i11 == 1048575 ? 0 : unsafe.getInt(cq2Var2, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iJ5 & 1048575;
            if (I >= d92.Y.X) {
                byte b = d92.Z.X;
            }
            switch (I) {
                case 0:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        iH = mv0.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 1:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        iH2 = mv0.h(i9);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    qu4Var = this;
                    cq2Var2 = cq2Var;
                    break;
                case 2:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        long j2 = unsafe.getLong(cq2Var2, j);
                        iH3 = mv0.h(i9);
                        iJ = mv0.j(j2);
                        iF2 += iJ + iH3;
                    }
                    qu4Var = this;
                    break;
                case 3:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        long j3 = unsafe.getLong(cq2Var2, j);
                        iH3 = mv0.h(i9);
                        iJ = mv0.j(j3);
                        iF2 += iJ + iH3;
                    }
                    qu4Var = this;
                    break;
                case 4:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        int i12 = unsafe.getInt(cq2Var2, j);
                        iH4 = mv0.h(i9);
                        iJ2 = mv0.j(i12);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    qu4Var = this;
                    break;
                case 5:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        iH5 = mv0.h(i9);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    qu4Var = this;
                    cq2Var2 = cq2Var;
                    break;
                case 6:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        iH2 = mv0.h(i9);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    qu4Var = this;
                    cq2Var2 = cq2Var;
                    break;
                case 7:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        iH6 = mv0.h(i9) + 1;
                        iF2 += iH6;
                    }
                    qu4Var = this;
                    cq2Var2 = cq2Var;
                    break;
                case 8:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        Object object = unsafe.getObject(cq2Var2, j);
                        iF2 = (object instanceof hb0 ? mv0.f(i9, (hb0) object) : mv0.g((String) object) + mv0.h(i9)) + iF2;
                    }
                    qu4Var = this;
                    break;
                case 9:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        Object object2 = unsafe.getObject(cq2Var2, j);
                        bx6 bx6VarM = qu4Var.m(i6);
                        Class cls = ex6.a;
                        iH7 = mv0.h(i9);
                        iA = ((e2) object2).a(bx6VarM);
                        i2 = mv0.i(iA);
                        i5 = i2 + iA + iH7;
                        iF2 += i5;
                    }
                    break;
                case 10:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        iF = mv0.f(i9, (hb0) unsafe.getObject(cq2Var2, j));
                        iF2 += iF;
                    }
                    qu4Var = this;
                    break;
                case 11:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        int i13 = unsafe.getInt(cq2Var2, j);
                        iH4 = mv0.h(i9);
                        iJ2 = mv0.i(i13);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    qu4Var = this;
                    break;
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        int i14 = unsafe.getInt(cq2Var2, j);
                        iH4 = mv0.h(i9);
                        iJ2 = mv0.j(i14);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    qu4Var = this;
                    break;
                case 13:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        iH2 = mv0.h(i9);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    qu4Var = this;
                    cq2Var2 = cq2Var;
                    break;
                case 14:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        iH5 = mv0.h(i9);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    qu4Var = this;
                    cq2Var2 = cq2Var;
                    break;
                case 15:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        int i15 = unsafe.getInt(cq2Var2, j);
                        iH4 = mv0.h(i9);
                        iJ2 = mv0.i((i15 >> 31) ^ (i15 << 1));
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    qu4Var = this;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        long j4 = unsafe.getLong(cq2Var2, j);
                        iH3 = mv0.h(i9);
                        iJ = mv0.j((j4 << 1) ^ (j4 >> 63));
                        iF2 += iJ + iH3;
                    }
                    qu4Var = this;
                    break;
                case 17:
                    if (qu4Var.o(cq2Var2, i6, i8, i7, i)) {
                        e2 e2Var = (e2) unsafe.getObject(cq2Var2, j);
                        bx6 bx6VarM2 = qu4Var.m(i6);
                        iH8 = mv0.h(i9) * 2;
                        iA2 = e2Var.a(bx6VarM2);
                        iC = iA2 + iH8;
                        iF2 += iC;
                    }
                    break;
                case 18:
                    iC = ex6.c(i9, (List) unsafe.getObject(cq2Var2, j));
                    iF2 += iC;
                    break;
                case 19:
                    iC = ex6.b(i9, (List) unsafe.getObject(cq2Var2, j));
                    iF2 += iC;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(cq2Var2, j);
                    Class cls2 = ex6.a;
                    if (list.size() == 0) {
                        iH9 = 0;
                    } else {
                        iH9 = (mv0.h(i9) * list.size()) + ex6.e(list);
                    }
                    iF2 += iH9;
                    break;
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                    List list2 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls3 = ex6.a;
                    size = list2.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = ex6.i(list2);
                        iH10 = mv0.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls4 = ex6.a;
                    size = list3.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = ex6.d(list3);
                        iH10 = mv0.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 23:
                    iC = ex6.c(i9, (List) unsafe.getObject(cq2Var2, j));
                    iF2 += iC;
                    break;
                case 24:
                    iC = ex6.b(i9, (List) unsafe.getObject(cq2Var2, j));
                    iF2 += iC;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls5 = ex6.a;
                    int size3 = list4.size();
                    iF2 += size3 == 0 ? 0 : (mv0.h(i9) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls6 = ex6.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iH9 = 0;
                    } else {
                        iH9 = mv0.h(i9) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof hb0) {
                                int size5 = ((hb0) obj).size();
                                iH9 = mv0.i(size5) + size5 + iH9;
                            } else {
                                iH9 = mv0.g((String) obj) + iH9;
                            }
                        }
                    }
                    iF2 += iH9;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(cq2Var2, j);
                    bx6 bx6VarM3 = qu4Var.m(i6);
                    Class cls7 = ex6.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iH11 = 0;
                    } else {
                        iH11 = mv0.h(i9) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int iA4 = ((e2) list6.get(i17)).a(bx6VarM3);
                            iH11 += mv0.i(iA4) + iA4;
                        }
                    }
                    iF2 += iH11;
                    break;
                case _DnsMessageKt.TYPE_AAAA /* 28 */:
                    List list7 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls8 = ex6.a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iH9 = 0;
                    } else {
                        iH9 = mv0.h(i9) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((hb0) list7.get(i18)).size();
                            iH9 += mv0.i(size8) + size8;
                        }
                    }
                    iF2 += iH9;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls9 = ex6.a;
                    size = list8.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = ex6.h(list8);
                        iH10 = mv0.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                    List list9 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls10 = ex6.a;
                    size = list9.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = ex6.a(list9);
                        iH10 = mv0.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 31:
                    iC = ex6.b(i9, (List) unsafe.getObject(cq2Var2, j));
                    iF2 += iC;
                    break;
                case 32:
                    iC = ex6.c(i9, (List) unsafe.getObject(cq2Var2, j));
                    iF2 += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls11 = ex6.a;
                    size = list10.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = ex6.f(list10);
                        iH10 = mv0.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls12 = ex6.a;
                    size = list11.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = ex6.g(list11);
                        iH10 = mv0.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls13 = ex6.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls14 = ex6.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 37:
                    size2 = ex6.e((List) unsafe.getObject(cq2Var2, j));
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 38:
                    size2 = ex6.i((List) unsafe.getObject(cq2Var2, j));
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 39:
                    size2 = ex6.d((List) unsafe.getObject(cq2Var2, j));
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls15 = ex6.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls16 = ex6.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls17 = ex6.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 43:
                    size2 = ex6.h((List) unsafe.getObject(cq2Var2, j));
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 44:
                    size2 = ex6.a((List) unsafe.getObject(cq2Var2, j));
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls18 = ex6.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(cq2Var2, j);
                    Class cls19 = ex6.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                    size2 = ex6.f((List) unsafe.getObject(cq2Var2, j));
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 48:
                    size2 = ex6.g((List) unsafe.getObject(cq2Var2, j));
                    if (size2 > 0) {
                        iH12 = mv0.h(i9);
                        i4 = mv0.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(cq2Var2, j);
                    bx6 bx6VarM4 = qu4Var.m(i6);
                    Class cls20 = ex6.a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iA3 = 0;
                    } else {
                        iA3 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            iA3 += ((e2) list19.get(i19)).a(bx6VarM4) + (mv0.h(i9) * 2);
                        }
                    }
                    iF2 += iA3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(cq2Var2, j);
                    Object obj2 = qu4Var.b[(i6 / 3) * 2];
                    qu4Var.m.getClass();
                    pp4 pp4Var = (pp4) object3;
                    np4 np4Var = (np4) obj2;
                    if (pp4Var.isEmpty()) {
                        iH9 = 0;
                    } else {
                        iH9 = 0;
                        for (Map.Entry entry : pp4Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            np4Var.getClass();
                            int iH16 = mv0.h(i9);
                            int iA5 = np4.a(np4Var.a, key, value);
                            iH9 += mv0.i(iA5) + iA5 + iH16;
                        }
                    }
                    iF2 += iH9;
                    break;
                case 51:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        iH = mv0.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 52:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        iH13 = mv0.h(i9);
                        iC = iH13 + 4;
                        iF2 += iC;
                    }
                    break;
                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        long jZ = z(j, cq2Var2);
                        iH14 = mv0.h(i9);
                        iJ3 = mv0.j(jZ);
                        i5 = iJ3 + iH14;
                        iF2 += i5;
                    }
                    break;
                case 54:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        long jZ2 = z(j, cq2Var2);
                        iH14 = mv0.h(i9);
                        iJ3 = mv0.j(jZ2);
                        i5 = iJ3 + iH14;
                        iF2 += i5;
                    }
                    break;
                case 55:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        int iY = y(j, cq2Var2);
                        iH15 = mv0.h(i9);
                        iJ4 = mv0.j(iY);
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case 56:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        iH = mv0.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 57:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        iH13 = mv0.h(i9);
                        iC = iH13 + 4;
                        iF2 += iC;
                    }
                    break;
                case 58:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        iC = mv0.h(i9) + 1;
                        iF2 += iC;
                    }
                    break;
                case 59:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        Object object4 = unsafe.getObject(cq2Var2, j);
                        iF2 = (object4 instanceof hb0 ? mv0.f(i9, (hb0) object4) : mv0.g((String) object4) + mv0.h(i9)) + iF2;
                    }
                    break;
                case 60:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        Object object5 = unsafe.getObject(cq2Var2, j);
                        bx6 bx6VarM5 = qu4Var.m(i6);
                        Class cls21 = ex6.a;
                        iH7 = mv0.h(i9);
                        iA = ((e2) object5).a(bx6VarM5);
                        i2 = mv0.i(iA);
                        i5 = i2 + iA + iH7;
                        iF2 += i5;
                    }
                    break;
                case 61:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        iC = mv0.f(i9, (hb0) unsafe.getObject(cq2Var2, j));
                        iF2 += iC;
                    }
                    break;
                case 62:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        int iY2 = y(j, cq2Var2);
                        iH15 = mv0.h(i9);
                        iJ4 = mv0.i(iY2);
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case 63:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        int iY3 = y(j, cq2Var2);
                        iH15 = mv0.h(i9);
                        iJ4 = mv0.j(iY3);
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        iH13 = mv0.h(i9);
                        iC = iH13 + 4;
                        iF2 += iC;
                    }
                    break;
                case 65:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        iH = mv0.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        int iY4 = y(j, cq2Var2);
                        iH15 = mv0.h(i9);
                        iJ4 = mv0.i((iY4 >> 31) ^ (iY4 << 1));
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case 67:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        long jZ3 = z(j, cq2Var2);
                        iH14 = mv0.h(i9);
                        iJ3 = mv0.j((jZ3 << 1) ^ (jZ3 >> 63));
                        i5 = iJ3 + iH14;
                        iF2 += i5;
                    }
                    break;
                case 68:
                    if (qu4Var.q(i9, i6, cq2Var2)) {
                        e2 e2Var2 = (e2) unsafe.getObject(cq2Var2, j);
                        bx6 bx6VarM6 = qu4Var.m(i6);
                        iH8 = mv0.h(i9) * 2;
                        iA2 = e2Var2.a(bx6VarM6);
                        iC = iA2 + iH8;
                        iF2 += iC;
                    }
                    break;
            }
            i6 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bx6
    public final void h(Object obj, yr2 yr2Var) throws IOException {
        int i;
        int i2;
        boolean z;
        qu4 qu4Var = this;
        yr2Var.getClass();
        mv0 mv0Var = (mv0) yr2Var.Y;
        int[] iArr = qu4Var.a;
        int length = iArr.length;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iJ = qu4Var.J(i5);
            int i7 = iArr[i5];
            int I = I(iJ);
            Unsafe unsafe = o;
            if (I <= 17) {
                int i8 = iArr[i5 + 2];
                i = 1;
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i = 1;
                i2 = 0;
            }
            long j = iJ & i3;
            switch (I) {
                case 0:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.t(i7, Double.doubleToRawLongBits(ao8.c.t0(j, obj)));
                    }
                    break;
                case 1:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.r(i7, Float.floatToRawIntBits(ao8.c.u0(j, obj)));
                    }
                    qu4Var = this;
                    break;
                case 2:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.E(i7, unsafe.getLong(obj, j));
                    }
                    qu4Var = this;
                    break;
                case 3:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.E(i7, unsafe.getLong(obj, j));
                    }
                    qu4Var = this;
                    break;
                case 4:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.v(i7, unsafe.getInt(obj, j));
                    }
                    qu4Var = this;
                    break;
                case 5:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.t(i7, unsafe.getLong(obj, j));
                    }
                    qu4Var = this;
                    break;
                case 6:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.r(i7, unsafe.getInt(obj, j));
                    }
                    qu4Var = this;
                    break;
                case 7:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.o(i7, ao8.c.s0(j, obj));
                    }
                    qu4Var = this;
                    break;
                case 8:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            mv0Var.z(i7, (String) object);
                        } else {
                            mv0Var.p(i7, (hb0) object);
                        }
                    }
                    qu4Var = this;
                    break;
                case 9:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.y(i7, (e2) unsafe.getObject(obj, j), qu4Var.m(i5));
                    }
                    break;
                case 10:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.p(i7, (hb0) unsafe.getObject(obj, j));
                    }
                    qu4Var = this;
                    break;
                case 11:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.C(i7, unsafe.getInt(obj, j));
                    }
                    qu4Var = this;
                    break;
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.v(i7, unsafe.getInt(obj, j));
                    }
                    qu4Var = this;
                    break;
                case 13:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.r(i7, unsafe.getInt(obj, j));
                    }
                    qu4Var = this;
                    break;
                case 14:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        mv0Var.t(i7, unsafe.getLong(obj, j));
                    }
                    qu4Var = this;
                    break;
                case 15:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        int i10 = unsafe.getInt(obj, j);
                        mv0Var.C(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    qu4Var = this;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        mv0Var.E(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    qu4Var = this;
                    break;
                case 17:
                    if (qu4Var.o(obj, i5, i4, i6, i2)) {
                        yr2Var.y(i7, unsafe.getObject(obj, j), qu4Var.m(i5));
                    }
                    break;
                case 18:
                    ex6.n(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 19:
                    ex6.r(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 20:
                    ex6.t(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                    ex6.z(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 22:
                    ex6.s(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 23:
                    ex6.q(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 24:
                    ex6.p(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 25:
                    ex6.m(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 26:
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = ex6.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            mv0Var.z(i11, (String) list.get(i12));
                        }
                    }
                    break;
                case 27:
                    int i13 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    bx6 bx6VarM = qu4Var.m(i5);
                    Class cls2 = ex6.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            mv0Var.y(i13, (e2) list2.get(i14), bx6VarM);
                        }
                    }
                    break;
                case _DnsMessageKt.TYPE_AAAA /* 28 */:
                    int i15 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = ex6.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            mv0Var.p(i15, (hb0) list3.get(i16));
                        }
                    }
                    break;
                case 29:
                    z = false;
                    ex6.y(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                    z = false;
                    ex6.o(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 31:
                    z = false;
                    ex6.u(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 32:
                    z = false;
                    ex6.v(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 33:
                    z = false;
                    ex6.w(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 34:
                    z = false;
                    ex6.x(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, false);
                    break;
                case 35:
                    ex6.n(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 36:
                    ex6.r(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 37:
                    ex6.t(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 38:
                    ex6.z(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 39:
                    ex6.s(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 40:
                    ex6.q(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 41:
                    ex6.p(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 42:
                    ex6.m(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 43:
                    ex6.y(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 44:
                    ex6.o(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 45:
                    ex6.u(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 46:
                    ex6.v(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                    ex6.w(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, i);
                    break;
                case 48:
                    ex6.x(iArr[i5], (List) unsafe.getObject(obj, j), yr2Var, true);
                    break;
                case 49:
                    int i17 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    bx6 bx6VarM2 = qu4Var.m(i5);
                    Class cls4 = ex6.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            yr2Var.y(i17, list4.get(i18), bx6VarM2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i19 = 2;
                        Object obj2 = qu4Var.b[(i5 / 3) * 2];
                        qu4Var.m.getClass();
                        f63 f63Var = ((np4) obj2).a;
                        for (Map.Entry entry : ((pp4) object2).entrySet()) {
                            mv0Var.B(i7, i19);
                            mv0Var.D(np4.a(f63Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c92.b(mv0Var, (b39) f63Var.Y, i, key);
                            i19 = 2;
                            c92.b(mv0Var, (b39) f63Var.Z, 2, value);
                            i = 1;
                        }
                    }
                    break;
                case 51:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.t(i7, Double.doubleToRawLongBits(((Double) ao8.h(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.r(i7, Float.floatToRawIntBits(((Float) ao8.h(j, obj)).floatValue()));
                    }
                    break;
                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.E(i7, z(j, obj));
                    }
                    break;
                case 54:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.E(i7, z(j, obj));
                    }
                    break;
                case 55:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.v(i7, y(j, obj));
                    }
                    break;
                case 56:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.t(i7, z(j, obj));
                    }
                    break;
                case 57:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.r(i7, y(j, obj));
                    }
                    break;
                case 58:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.o(i7, ((Boolean) ao8.h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (qu4Var.q(i7, i5, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            mv0Var.z(i7, (String) object3);
                        } else {
                            mv0Var.p(i7, (hb0) object3);
                        }
                    }
                    break;
                case 60:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.y(i7, (e2) unsafe.getObject(obj, j), qu4Var.m(i5));
                    }
                    break;
                case 61:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.p(i7, (hb0) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.C(i7, y(j, obj));
                    }
                    break;
                case 63:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.v(i7, y(j, obj));
                    }
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.r(i7, y(j, obj));
                    }
                    break;
                case 65:
                    if (qu4Var.q(i7, i5, obj)) {
                        mv0Var.t(i7, z(j, obj));
                    }
                    break;
                case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                    if (qu4Var.q(i7, i5, obj)) {
                        int iY = y(j, obj);
                        mv0Var.C(i7, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (qu4Var.q(i7, i5, obj)) {
                        long jZ = z(j, obj);
                        mv0Var.E(i7, (jZ << i) ^ (jZ >> 63));
                    }
                    break;
                case 68:
                    if (qu4Var.q(i7, i5, obj)) {
                        yr2Var.y(i7, unsafe.getObject(obj, j), qu4Var.m(i5));
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        ((in8) qu4Var.l).getClass();
        ((cq2) obj).unknownFields.d(yr2Var);
    }

    @Override // defpackage.bx6
    public final cq2 i() {
        this.j.getClass();
        return ((cq2) this.e).i();
    }

    public final boolean j(cq2 cq2Var, cq2 cq2Var2, int i) {
        return n(i, cq2Var) == n(i, cq2Var2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (ao8.h(J(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        c2.m();
    }

    public final bx6 m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        bx6 bx6Var = (bx6) objArr[i2];
        if (bx6Var != null) {
            return bx6Var;
        }
        bx6 bx6VarA = l06.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = bx6VarA;
        return bx6VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & ao8.f(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iJ = J(i);
        long j2 = iJ & 1048575;
        switch (I(iJ)) {
            case 0:
                if (Double.doubleToRawLongBits(ao8.c.t0(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(ao8.c.u0(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (ao8.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (ao8.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (ao8.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (ao8.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (ao8.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return ao8.c.s0(j2, obj);
            case 8:
                Object objH = ao8.h(j2, obj);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof hb0) {
                    return !hb0.Z.equals(objH);
                }
                kp5.e();
                return false;
            case 9:
                if (ao8.h(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !hb0.Z.equals(ao8.h(j2, obj));
            case 11:
                if (ao8.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                if (ao8.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (ao8.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (ao8.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (ao8.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                if (ao8.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (ao8.h(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                kp5.e();
                return false;
        }
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return n(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return ao8.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void r(Object obj, int i, Object obj2, s62 s62Var, kv0 kv0Var) throws qh3.a {
        long J = J(i) & 1048575;
        Object objH = ao8.h(J, obj);
        qp4 qp4Var = this.m;
        if (objH == null) {
            qp4Var.getClass();
            objH = pp4.Y.b();
            ao8.o(J, obj, objH);
        } else {
            qp4Var.getClass();
            if (!((pp4) objH).X) {
                Object objB = pp4.Y.b();
                qp4.a(objB, objH);
                ao8.o(J, obj, objB);
                objH = objB;
            }
        }
        qp4Var.getClass();
        pp4 pp4Var = (pp4) objH;
        f63 f63Var = ((np4) obj2).a;
        kv0Var.w(2);
        jv0 jv0Var = kv0Var.a;
        int i2 = jv0Var.i(jv0Var.z());
        Object obj3 = f63Var.f0;
        Object objI = _UrlKt.FRAGMENT_ENCODE_SET;
        Object objI2 = obj3;
        while (true) {
            try {
                int iA = kv0Var.a();
                if (iA == Integer.MAX_VALUE || jv0Var.c()) {
                    break;
                }
                if (iA == 1) {
                    objI = kv0Var.i((b39) f63Var.Y, null, null);
                } else if (iA != 2) {
                    try {
                        if (!kv0Var.x()) {
                            throw new qh3("Unable to parse map entry.");
                        }
                    } catch (qh3.a unused) {
                        if (!kv0Var.x()) {
                            throw new qh3("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = kv0Var.i((b39) f63Var.Z, obj3.getClass(), s62Var);
                }
            } catch (Throwable th) {
                jv0Var.h(i2);
                throw th;
            }
        }
        pp4Var.put(objI, objI2);
        jv0Var.h(i2);
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            bx6 bx6VarM = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    cq2 cq2VarI = bx6VarM.i();
                    bx6VarM.a(cq2VarI, object);
                    unsafe.putObject(obj, J, cq2VarI);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                cq2 cq2VarI2 = bx6VarM.i();
                bx6VarM.a(cq2VarI2, object2);
                unsafe.putObject(obj, J, cq2VarI2);
                object2 = cq2VarI2;
            }
            bx6VarM.a(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            bx6 bx6VarM = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    cq2 cq2VarI = bx6VarM.i();
                    bx6VarM.a(cq2VarI, object);
                    unsafe.putObject(obj, J, cq2VarI);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                cq2 cq2VarI2 = bx6VarM.i();
                bx6VarM.a(cq2VarI2, object2);
                unsafe.putObject(obj, J, cq2VarI2);
                object2 = cq2VarI2;
            }
            bx6VarM.a(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        bx6 bx6VarM = m(i);
        long J = J(i) & 1048575;
        if (!n(i, obj)) {
            return bx6VarM.i();
        }
        Object object = o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        cq2 cq2VarI = bx6VarM.i();
        if (object != null) {
            bx6VarM.a(cq2VarI, object);
        }
        return cq2VarI;
    }

    public final Object v(int i, int i2, Object obj) {
        bx6 bx6VarM = m(i2);
        if (!q(i, i2, obj)) {
            return bx6VarM.i();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        cq2 cq2VarI = bx6VarM.i();
        if (object != null) {
            bx6VarM.a(cq2VarI, object);
        }
        return cq2VarI;
    }
}
