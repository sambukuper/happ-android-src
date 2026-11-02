package defpackage;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Size;
import android.util.SizeF;
import androidx.compose.ui.node.LayoutNode;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dh3 {
    public static final zy0 b;
    public static final j72 c;
    public static boolean e;
    public static int f;
    public static final xj8 a = xj8.g0;
    public static final Object d = new Object();

    static {
        byte b2 = 13;
        b = new zy0(2137952738, false, new l4(b2));
        c = new j72(b2);
    }

    public static final boolean A(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!f(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final int C(wy5 wy5Var) {
        int i = wy5Var == null ? -1 : i06.a[wy5Var.ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                    }
                }
            }
            return i2;
        }
        return 1;
    }

    public static nz2 D(String... strArr) {
        if (strArr.length % 2 != 0) {
            bt.q("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                bt.q("Headers cannot be null");
                return null;
            }
            strArr2[i2] = fm7.R0(str).toString();
        }
        int iB = z51.B(0, strArr2.length - 1, 2);
        if (iB >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                i(str2);
                j(str3, str2);
                if (i == iB) {
                    break;
                }
                i += 2;
            }
        }
        return new nz2(strArr2);
    }

    public static final kx4 E(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new h95(gn2Var));
    }

    public static final Object F(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final ay6 G(lp2 lp2Var) {
        Object[] objArr = new Object[0];
        boolean zD = lp2Var.d(0);
        Object objK = lp2Var.K();
        if (zD || objK == zz0.a) {
            objK = new w76((byte) 22);
            lp2Var.g0(objK);
        }
        return (ay6) jm4.Y(objArr, ay6.n0, (dn2) objK, lp2Var, 0);
    }

    public static final float H(long j, float f2, fi1 fi1Var) {
        float fC;
        long jB = v88.b(j);
        if (w88.a(jB, 4294967296L)) {
            if (fi1Var.b0() <= 1.05d) {
                return fi1Var.G0(j);
            }
            fC = v88.c(j) / v88.c(fi1Var.M(f2));
        } else {
            if (!w88.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = v88.c(j);
        }
        return fC * f2;
    }

    public static void I(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final void J(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(z51.U(j)), i, i2, 33);
        }
    }

    public static final void K(Spannable spannable, long j, fi1 fi1Var, int i, int i2) {
        long jB = v88.b(j);
        if (w88.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(nr4.O(fi1Var.G0(j)), false), i, i2, 33);
        } else if (w88.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(v88.c(j)), i, i2, 33);
        }
    }

    public static final void L(Spannable spannable, ge4 ge4Var, int i, int i2) {
        if (ge4Var != null) {
            ArrayList arrayList = new ArrayList(xv0.Z(ge4Var, 10));
            Iterator it = ge4Var.X.iterator();
            while (it.hasNext()) {
                arrayList.add(((ce4) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final aa7 M(ch8 ch8Var, sx4 sx4Var, List list) {
        ch8Var.getClass();
        sx4Var.getClass();
        list.getClass();
        lh8 lh8VarL = sx4Var.l();
        lh8VarL.getClass();
        return N(ch8Var, lh8VarL, list, false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a A[PHI: r1
  0x006a: PHI (r1v10 et4) = (r1v9 et4), (r1v11 et4) binds: [B:33:0x0087, B:24:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    public static aa7 N(ch8 ch8Var, lh8 lh8Var, List list, boolean z) {
        et4 et4VarB;
        sx4 sx4Var;
        et4 et4VarM0;
        et4 et4Var;
        ch8Var.getClass();
        lh8Var.getClass();
        list.getClass();
        if (ch8Var.isEmpty() && list.isEmpty() && !z && lh8Var.x() != null) {
            ot0 ot0VarX = lh8Var.x();
            ot0VarX.getClass();
            aa7 aa7VarX = ot0VarX.X();
            aa7VarX.getClass();
            return aa7VarX;
        }
        ot0 ot0VarX2 = lh8Var.x();
        if (ot0VarX2 instanceof hi8) {
            et4VarB = ((hi8) ot0VarX2).X().K();
        } else {
            if (ot0VarX2 instanceof sx4) {
                int i = el1.a;
                vx4 vx4VarC = bl1.c(ot0VarX2);
                vx4VarC.getClass();
                el1.h(vx4VarC);
                z14 z14Var = z14.t;
                if (list.isEmpty()) {
                    sx4 sx4Var2 = (sx4) ot0VarX2;
                    sx4Var = sx4Var2 instanceof sx4 ? sx4Var2 : null;
                    if (sx4Var == null || (et4VarM0 = sx4Var.s0(z14Var)) == null) {
                        et4VarB = sx4Var2.r0();
                        et4VarB.getClass();
                    } else {
                        et4Var = et4VarM0;
                    }
                } else {
                    sx4 sx4Var3 = (sx4) ot0VarX2;
                    ui8 ui8VarA = nh8.b.a(lh8Var, list);
                    sx4Var = sx4Var3 instanceof sx4 ? sx4Var3 : null;
                    if (sx4Var == null || (et4VarM0 = sx4Var.m0(ui8VarA, z14Var)) == null) {
                        et4VarB = sx4Var3.l0(ui8VarA);
                        et4VarB.getClass();
                    } else {
                        et4Var = et4VarM0;
                    }
                }
                return P(ch8Var, lh8Var, list, z, et4Var, new w14(ch8Var, lh8Var, list, z));
            }
            if (ot0VarX2 instanceof km1) {
                String str = ((km1) ot0VarX2).getName().X;
                str.getClass();
                et4VarB = u32.a(o32.SCOPE_FOR_ABBREVIATION_TYPE, true, str);
            } else {
                if (!(lh8Var instanceof qg3)) {
                    throw new IllegalStateException("Unsupported classifier: " + ot0VarX2 + " for constructor: " + lh8Var);
                }
                et4VarB = du7.b("member scope for intersection type", ((qg3) lh8Var).Y);
            }
        }
        et4Var = et4VarB;
        return P(ch8Var, lh8Var, list, z, et4Var, new w14(ch8Var, lh8Var, list, z));
    }

    public static final aa7 O(et4 et4Var, ch8 ch8Var, lh8 lh8Var, List list, boolean z) {
        ch8Var.getClass();
        lh8Var.getClass();
        list.getClass();
        et4Var.getClass();
        ca7 ca7Var = new ca7(lh8Var, list, z, et4Var, new w14(et4Var, ch8Var, lh8Var, list, z));
        return ch8Var.isEmpty() ? ca7Var : new ea7(ca7Var, ch8Var);
    }

    public static final aa7 P(ch8 ch8Var, lh8 lh8Var, List list, boolean z, et4 et4Var, gn2 gn2Var) {
        ch8Var.getClass();
        lh8Var.getClass();
        list.getClass();
        et4Var.getClass();
        ca7 ca7Var = new ca7(lh8Var, list, z, et4Var, gn2Var);
        return ch8Var.isEmpty() ? ca7Var : new ea7(ca7Var, ch8Var);
    }

    public static final mv Q(InputStream inputStream) {
        inputStream.getClass();
        return new mv(inputStream, new ta8());
    }

    public static wi8 R(List list, ui8 ui8Var, ed1 ed1Var, ArrayList arrayList) {
        if (ui8Var == null) {
            a(1);
            throw null;
        }
        if (ed1Var == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        wi8 wi8VarS = S(list, ui8Var, ed1Var, arrayList, null);
        if (wi8VarS != null) {
            return wi8VarS;
        }
        bt.g("Substitution failed");
        return null;
    }

    public static wi8 S(List list, ui8 ui8Var, ed1 ed1Var, List list2, boolean[] zArr) {
        if (ui8Var == null) {
            a(6);
            throw null;
        }
        if (ed1Var == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            hi8 hi8Var = (hi8) it.next();
            int i2 = i + 1;
            ii8 ii8VarJ0 = ii8.J0(i, hi8Var.getAnnotations(), ed1Var, hi8Var.Q(), hi8Var.getName(), hi8Var.D(), hi8Var.y());
            map.put(hi8Var.l(), new wg7(ii8VarJ0.X()));
            map2.put(hi8Var, ii8VarJ0);
            list2.add(ii8VarJ0);
            i = i2;
        }
        byte b2 = 1;
        xg7 xg7Var = new xg7(map, b2);
        wi8 wi8VarE = wi8.e(ui8Var, xg7Var);
        wi8 wi8VarE2 = wi8.e(new do0(ui8Var, b2), xg7Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hi8 hi8Var2 = (hi8) it2.next();
            ii8 ii8Var = (ii8) map2.get(hi8Var2);
            for (t14 t14Var : hi8Var2.getUpperBounds()) {
                ot0 ot0VarX = t14Var.n0().x();
                t14 t14VarH = (((ot0VarX instanceof hi8) && y08.g((hi8) ot0VarX, null, null)) ? wi8VarE : wi8VarE2).h(t14Var, rt8.OUT_VARIANCE);
                if (t14VarH == null) {
                    return null;
                }
                if (t14VarH != t14Var && zArr != null) {
                    zArr[0] = true;
                }
                if (ii8Var.p0) {
                    bt.i("Type parameter descriptor is already initialized: ".concat(ii8Var.L0()));
                    return null;
                }
                if (!vr3.J(t14VarH)) {
                    ii8Var.o0.add(t14VarH);
                }
            }
            if (ii8Var.p0) {
                bt.i("Type parameter descriptor is already initialized: ".concat(ii8Var.L0()));
                return null;
            }
            ii8Var.p0 = true;
        }
        return wi8VarE;
    }

    public static void T(String str) {
        zm8 zm8Var = new zm8(pc6.p("lateinit property ", str, " has not been initialized"));
        I(zm8Var, dh3.class.getName());
        throw zm8Var;
    }

    public static final String U(e37 e37Var) {
        return wv0.y0(x97.a0(0, e37Var.e()), ", ", e37Var.a() + '(', ")", new vj2((Object) e37Var, (byte) 24), 24);
    }

    public static kx4 V(kx4 kx4Var, ay6 ay6Var) {
        return kx4Var.y(w39.k(hx4.X, x03.c)).y(new by6(null, null, null, ay6Var.g0, sd5.X, ay6Var, true, true)).y(new oy6(ay6Var));
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:62:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x012d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:77:0x0136  */
    /* JADX WARN: Code duplicated, block: B:79:0x0173  */
    /* JADX WARN: Code duplicated, block: B:82:0x017e  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, kx4 kx4Var, dn2 dn2Var, sn2 sn2Var, lp2 lp2Var, int i, int i2) {
        int i3;
        kx4 kx4Var2;
        dn2 dn2Var2;
        int i4;
        sn2 sn2Var2;
        int i5;
        boolean z;
        dn2 dn2Var3;
        sn2 sn2Var3;
        j86 j86VarR;
        dn2 dn2Var4;
        sn2 sn2Var4;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        iw0 iw0Var;
        kc8 kc8Var;
        long j6;
        long j7;
        long j8;
        str.getClass();
        lp2Var.X(962735438);
        if ((i & 6) == 0) {
            i3 = (lp2Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            kx4Var2 = kx4Var;
            i3 |= lp2Var.f(kx4Var2) ? 32 : 16;
        } else {
            kx4Var2 = kx4Var;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                dn2Var2 = dn2Var;
                i3 |= lp2Var.h(dn2Var2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    sn2Var2 = sn2Var;
                    if (lp2Var.h(sn2Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (lp2Var.N(i3 & 1, z)) {
                    if (i6 != 0) {
                        dn2Var4 = null;
                    } else {
                        dn2Var4 = dn2Var2;
                    }
                    if (i4 != 0) {
                        sn2Var4 = z39.X;
                    } else {
                        sn2Var4 = sn2Var2;
                    }
                    Activity activity = (Activity) lp2Var.j(yc4.a);
                    ox1 ox1Var = ep.z;
                    j = ((dp) lp2Var.j(ox1Var)).b.a;
                    j2 = ((dp) lp2Var.j(ox1Var)).c.a;
                    dn2 dn2Var5 = dn2Var4;
                    j3 = ((dp) lp2Var.j(ox1Var)).c.a;
                    sn2 sn2Var5 = sn2Var4;
                    j4 = ((dp) lp2Var.j(ox1Var)).c.a;
                    j5 = dw0.g;
                    iw0Var = (iw0) lp2Var.j(kw0.a);
                    kc8Var = iw0Var.W;
                    if (kc8Var == null) {
                        kc8Var = new kc8(kw0.b(iw0Var, vr3.b), kw0.b(iw0Var, vr3.d), kw0.b(iw0Var, vr3.c), kw0.b(iw0Var, vr3.f), kw0.b(iw0Var, vr3.g), kw0.b(iw0Var, vr3.e));
                        iw0Var.W = kc8Var;
                    }
                    if (j == 16) {
                        j = kc8Var.a;
                    }
                    long j9 = j;
                    if (j5 != 16) {
                        j6 = j5;
                    } else {
                        j6 = kc8Var.b;
                    }
                    if (j2 == 16) {
                        j2 = kc8Var.c;
                    }
                    long j10 = j2;
                    if (j3 == 16) {
                        j3 = kc8Var.d;
                    }
                    long j11 = j3;
                    if (j4 != 16) {
                        j7 = j4;
                    } else {
                        j7 = kc8Var.e;
                    }
                    if (j5 != 16) {
                        j8 = j5;
                    } else {
                        j8 = kc8Var.f;
                    }
                    zo.b(jm4.U(-2019735798, new rv2(str, (byte) 1), lp2Var), kx4Var2, jm4.U(2010584008, new i9(dn2Var5, activity, (byte) 12), lp2Var), sn2Var5, 0.0f, null, new kc8(j9, j6, j10, j11, j7, j8), lp2Var, (i3 & 112) | 390 | (i3 & 7168));
                    sn2Var3 = sn2Var5;
                    dn2Var3 = dn2Var5;
                } else {
                    lp2Var.Q();
                    dn2Var3 = dn2Var2;
                    sn2Var3 = sn2Var2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new xf(str, kx4Var, dn2Var3, sn2Var3, i, i2);
                }
            }
            i3 |= 3072;
            sn2Var2 = sn2Var;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (lp2Var.N(i3 & 1, z)) {
                if (i6 != 0) {
                    dn2Var4 = null;
                } else {
                    dn2Var4 = dn2Var2;
                }
                if (i4 != 0) {
                    sn2Var4 = z39.X;
                } else {
                    sn2Var4 = sn2Var2;
                }
                Activity activity2 = (Activity) lp2Var.j(yc4.a);
                ox1 ox1Var2 = ep.z;
                j = ((dp) lp2Var.j(ox1Var2)).b.a;
                j2 = ((dp) lp2Var.j(ox1Var2)).c.a;
                dn2 dn2Var6 = dn2Var4;
                j3 = ((dp) lp2Var.j(ox1Var2)).c.a;
                sn2 sn2Var6 = sn2Var4;
                j4 = ((dp) lp2Var.j(ox1Var2)).c.a;
                j5 = dw0.g;
                iw0Var = (iw0) lp2Var.j(kw0.a);
                kc8Var = iw0Var.W;
                if (kc8Var == null) {
                    kc8Var = new kc8(kw0.b(iw0Var, vr3.b), kw0.b(iw0Var, vr3.d), kw0.b(iw0Var, vr3.c), kw0.b(iw0Var, vr3.f), kw0.b(iw0Var, vr3.g), kw0.b(iw0Var, vr3.e));
                    iw0Var.W = kc8Var;
                }
                if (j == 16) {
                    j = kc8Var.a;
                }
                long j12 = j;
                if (j5 != 16) {
                    j6 = j5;
                } else {
                    j6 = kc8Var.b;
                }
                if (j2 == 16) {
                    j2 = kc8Var.c;
                }
                long j13 = j2;
                if (j3 == 16) {
                    j3 = kc8Var.d;
                }
                long j14 = j3;
                if (j4 != 16) {
                    j7 = j4;
                } else {
                    j7 = kc8Var.e;
                }
                if (j5 != 16) {
                    j8 = j5;
                } else {
                    j8 = kc8Var.f;
                }
                zo.b(jm4.U(-2019735798, new rv2(str, (byte) 1), lp2Var), kx4Var2, jm4.U(2010584008, new i9(dn2Var6, activity2, (byte) 12), lp2Var), sn2Var6, 0.0f, null, new kc8(j12, j6, j13, j14, j7, j8), lp2Var, (i3 & 112) | 390 | (i3 & 7168));
                sn2Var3 = sn2Var6;
                dn2Var3 = dn2Var6;
            } else {
                lp2Var.Q();
                dn2Var3 = dn2Var2;
                sn2Var3 = sn2Var2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new xf(str, kx4Var, dn2Var3, sn2Var3, i, i2);
            }
        }
        i3 |= 384;
        dn2Var2 = dn2Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                sn2Var2 = sn2Var;
                if (lp2Var.h(sn2Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (lp2Var.N(i3 & 1, z)) {
                if (i6 != 0) {
                    dn2Var4 = null;
                } else {
                    dn2Var4 = dn2Var2;
                }
                if (i4 != 0) {
                    sn2Var4 = z39.X;
                } else {
                    sn2Var4 = sn2Var2;
                }
                Activity activity3 = (Activity) lp2Var.j(yc4.a);
                ox1 ox1Var3 = ep.z;
                j = ((dp) lp2Var.j(ox1Var3)).b.a;
                j2 = ((dp) lp2Var.j(ox1Var3)).c.a;
                dn2 dn2Var7 = dn2Var4;
                j3 = ((dp) lp2Var.j(ox1Var3)).c.a;
                sn2 sn2Var7 = sn2Var4;
                j4 = ((dp) lp2Var.j(ox1Var3)).c.a;
                j5 = dw0.g;
                iw0Var = (iw0) lp2Var.j(kw0.a);
                kc8Var = iw0Var.W;
                if (kc8Var == null) {
                    kc8Var = new kc8(kw0.b(iw0Var, vr3.b), kw0.b(iw0Var, vr3.d), kw0.b(iw0Var, vr3.c), kw0.b(iw0Var, vr3.f), kw0.b(iw0Var, vr3.g), kw0.b(iw0Var, vr3.e));
                    iw0Var.W = kc8Var;
                }
                if (j == 16) {
                    j = kc8Var.a;
                }
                long j15 = j;
                if (j5 != 16) {
                    j6 = j5;
                } else {
                    j6 = kc8Var.b;
                }
                if (j2 == 16) {
                    j2 = kc8Var.c;
                }
                long j16 = j2;
                if (j3 == 16) {
                    j3 = kc8Var.d;
                }
                long j17 = j3;
                if (j4 != 16) {
                    j7 = j4;
                } else {
                    j7 = kc8Var.e;
                }
                if (j5 != 16) {
                    j8 = j5;
                } else {
                    j8 = kc8Var.f;
                }
                zo.b(jm4.U(-2019735798, new rv2(str, (byte) 1), lp2Var), kx4Var2, jm4.U(2010584008, new i9(dn2Var7, activity3, (byte) 12), lp2Var), sn2Var7, 0.0f, null, new kc8(j15, j6, j16, j17, j7, j8), lp2Var, (i3 & 112) | 390 | (i3 & 7168));
                sn2Var3 = sn2Var7;
                dn2Var3 = dn2Var7;
            } else {
                lp2Var.Q();
                dn2Var3 = dn2Var2;
                sn2Var3 = sn2Var2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new xf(str, kx4Var, dn2Var3, sn2Var3, i, i2);
            }
        }
        i3 |= 3072;
        sn2Var2 = sn2Var;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (lp2Var.N(i3 & 1, z)) {
            if (i6 != 0) {
                dn2Var4 = null;
            } else {
                dn2Var4 = dn2Var2;
            }
            if (i4 != 0) {
                sn2Var4 = z39.X;
            } else {
                sn2Var4 = sn2Var2;
            }
            Activity activity4 = (Activity) lp2Var.j(yc4.a);
            ox1 ox1Var4 = ep.z;
            j = ((dp) lp2Var.j(ox1Var4)).b.a;
            j2 = ((dp) lp2Var.j(ox1Var4)).c.a;
            dn2 dn2Var8 = dn2Var4;
            j3 = ((dp) lp2Var.j(ox1Var4)).c.a;
            sn2 sn2Var8 = sn2Var4;
            j4 = ((dp) lp2Var.j(ox1Var4)).c.a;
            j5 = dw0.g;
            iw0Var = (iw0) lp2Var.j(kw0.a);
            kc8Var = iw0Var.W;
            if (kc8Var == null) {
                kc8Var = new kc8(kw0.b(iw0Var, vr3.b), kw0.b(iw0Var, vr3.d), kw0.b(iw0Var, vr3.c), kw0.b(iw0Var, vr3.f), kw0.b(iw0Var, vr3.g), kw0.b(iw0Var, vr3.e));
                iw0Var.W = kc8Var;
            }
            if (j == 16) {
                j = kc8Var.a;
            }
            long j18 = j;
            if (j5 != 16) {
                j6 = j5;
            } else {
                j6 = kc8Var.b;
            }
            if (j2 == 16) {
                j2 = kc8Var.c;
            }
            long j19 = j2;
            if (j3 == 16) {
                j3 = kc8Var.d;
            }
            long j110 = j3;
            if (j4 != 16) {
                j7 = j4;
            } else {
                j7 = kc8Var.e;
            }
            if (j5 != 16) {
                j8 = j5;
            } else {
                j8 = kc8Var.f;
            }
            zo.b(jm4.U(-2019735798, new rv2(str, (byte) 1), lp2Var), kx4Var2, jm4.U(2010584008, new i9(dn2Var8, activity4, (byte) 12), lp2Var), sn2Var8, 0.0f, null, new kc8(j18, j6, j19, j110, j7, j8), lp2Var, (i3 & 112) | 390 | (i3 & 7168));
            sn2Var3 = sn2Var8;
            dn2Var3 = dn2Var8;
        } else {
            lp2Var.Q();
            dn2Var3 = dn2Var2;
            sn2Var3 = sn2Var2;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new xf(str, kx4Var, dn2Var3, sn2Var3, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0064 A[LOOP:0: B:4:0x000d->B:35:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0067 A[EDGE_INSN: B:43:0x0067->B:36:0x0067 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0064], SYNTHETIC] */
    public static final y07 c(LayoutNode layoutNode, boolean z) {
        jx4 jx4Var = (jx4) layoutNode.H0.i0;
        nh1 nh1Var = null;
        if ((jx4Var.f0 & 8) != 0) {
            loop0: while (jx4Var != null) {
                if ((jx4Var.Z & 8) == 0) {
                    if ((jx4Var.f0 & 8) != 0) {
                        break;
                        break;
                    }
                    jx4Var = jx4Var.h0;
                } else {
                    jx4 jx4VarT = jx4Var;
                    c15 c15Var = null;
                    while (jx4VarT != null) {
                        if (jx4VarT instanceof w07) {
                            nh1Var = jx4VarT;
                            break loop0;
                        }
                        if ((jx4VarT.Z & 8) != 0 && (jx4VarT instanceof oh1)) {
                            int i = 0;
                            for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                if ((jx4Var2.Z & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        jx4VarT = jx4Var2;
                                    } else {
                                        if (c15Var == null) {
                                            c15Var = new c15(0, new jx4[16]);
                                        }
                                        if (jx4VarT != null) {
                                            c15Var.b(jx4VarT);
                                            jx4VarT = null;
                                        }
                                        c15Var.b(jx4Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        jx4VarT = yn0.T(c15Var);
                    }
                    if ((jx4Var.f0 & 8) != 0) {
                        break;
                    }
                    jx4Var = jx4Var.h0;
                }
            }
        }
        nh1Var.getClass();
        jx4 jx4Var3 = ((jx4) ((w07) nh1Var)).X;
        t07 t07VarY = layoutNode.y();
        if (t07VarY == null) {
            t07VarY = new t07();
        }
        return new y07(jx4Var3, z, layoutNode, t07VarY);
    }

    public static final void d(h4 h4Var, y07 y07Var) {
        t07 t07Var = y07Var.d;
        s05 s05Var = t07Var.X;
        Object objG = t07Var.X.g(c17.z);
        if (objG == null) {
            objG = null;
        }
        kl6 kl6Var = (kl6) objG;
        if (vr3.t(y07Var)) {
            if (kl6Var != null && kl6Var.a == 8) {
                return;
            }
            Object objG2 = s05Var.g(s07.y);
            if (objG2 == null) {
                objG2 = null;
            }
            q3 q3Var = (q3) objG2;
            if (q3Var != null) {
                h4Var.b(new a4(R.id.accessibilityActionPageUp, q3Var.a));
            }
            Object objG3 = s05Var.g(s07.A);
            if (objG3 == null) {
                objG3 = null;
            }
            q3 q3Var2 = (q3) objG3;
            if (q3Var2 != null) {
                h4Var.b(new a4(R.id.accessibilityActionPageDown, q3Var2.a));
            }
            Object objG4 = s05Var.g(s07.z);
            if (objG4 == null) {
                objG4 = null;
            }
            q3 q3Var3 = (q3) objG4;
            if (q3Var3 != null) {
                h4Var.b(new a4(R.id.accessibilityActionPageLeft, q3Var3.a));
            }
            Object objG5 = s05Var.g(s07.B);
            q3 q3Var4 = (q3) (objG5 != null ? objG5 : null);
            if (q3Var4 != null) {
                h4Var.b(new a4(R.id.accessibilityActionPageRight, q3Var4.a));
            }
        }
    }

    public static boolean e(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final Bundle h(qg5... qg5VarArr) {
        Bundle bundle = new Bundle(qg5VarArr.length);
        for (qg5 qg5Var : qg5VarArr) {
            String str = (String) qg5Var.X;
            Object obj = qg5Var.Y;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        bt.k("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    bt.k("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void i(String str) {
        if (str.length() <= 0) {
            bt.q("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                em7.c(ks8.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    public static void j(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                em7.c(ks8.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2).concat(ks8.o(str2) ? _UrlKt.FRAGMENT_ENCODE_SET : ": ".concat(str)));
                return;
            }
        }
    }

    public static int k(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int l(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static int m(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void n(int i, int i2) {
        if (i <= i2) {
            return;
        }
        kp5.k(pc6.k(i, "toIndex (", i2, ") is greater than size (", ")."));
    }

    public static et4 o(String str, Iterable iterable) {
        dt4 dt4Var;
        oc7 oc7Var = new oc7();
        Iterator it = iterable.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dt4Var = dt4.b;
            if (!zHasNext) {
                break;
            }
            et4 et4Var = (et4) it.next();
            if (et4Var != dt4Var) {
                if (et4Var instanceof yo0) {
                    bw0.e0(oc7Var, ((yo0) et4Var).c);
                } else {
                    oc7Var.add(et4Var);
                }
            }
        }
        int i = oc7Var.X;
        if (i != 0) {
            return i != 1 ? new yo0(str, (et4[]) oc7Var.toArray(new et4[0])) : (et4) oc7Var.get(0);
        }
        return dt4Var;
    }

    public static final kx4 p(k44 k44Var, kx4 kx4Var) {
        k44Var.getClass();
        kx4Var.getClass();
        return kx4Var.y(new p54(wl7.i0(300, 6, null), wl7.V(0.75f, 200.0f, null, 4), wl7.i0(300, 6, null)));
    }

    public static final fl1 q(b06 b06Var) {
        switch (b06Var == null ? -1 : i06.b[b06Var.ordinal()]) {
            case 1:
                fl1 fl1Var = gl1.d;
                fl1Var.getClass();
                return fl1Var;
            case 2:
                fl1 fl1Var2 = gl1.a;
                fl1Var2.getClass();
                return fl1Var2;
            case 3:
                fl1 fl1Var3 = gl1.b;
                fl1Var3.getClass();
                return fl1Var3;
            case 4:
                fl1 fl1Var4 = gl1.c;
                fl1Var4.getClass();
                return fl1Var4;
            case 5:
                fl1 fl1Var5 = gl1.e;
                fl1Var5.getClass();
                return fl1Var5;
            case 6:
                fl1 fl1Var6 = gl1.f;
                fl1Var6.getClass();
                return fl1Var6;
            default:
                fl1 fl1Var7 = gl1.a;
                fl1Var7.getClass();
                return fl1Var7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void r(ze2 ze2Var, Object obj, Object obj2, s51 s51Var) {
        uf2 uf2Var;
        if (s51Var instanceof uf2) {
            uf2Var = (uf2) s51Var;
            int i = uf2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                uf2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                uf2Var = new uf2(s51Var);
            }
        } else {
            uf2Var = new uf2(s51Var);
        }
        Object obj3 = uf2Var.g0;
        int i2 = uf2Var.h0;
        if (i2 == 0) {
            w39.n0(obj3);
            uf2Var.f0 = obj2;
            uf2Var.h0 = 1;
            if (ze2Var.l(obj, uf2Var) == c71.X) {
                return;
            }
        } else if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return;
        } else {
            obj2 = uf2Var.f0;
            w39.n0(obj3);
        }
        throw new h(obj2);
    }

    public static final mo8 s(aa7 aa7Var, aa7 aa7Var2) {
        aa7Var.getClass();
        aa7Var2.getClass();
        return aa7Var.equals(aa7Var2) ? aa7Var : new ee2(aa7Var, aa7Var2);
    }

    public static final uq6 w(tr4 tr4Var) {
        Object objW = tr4Var.w();
        if (objW instanceof uq6) {
            return (uq6) objW;
        }
        return null;
    }

    public static final float x(uq6 uq6Var) {
        if (uq6Var != null) {
            return uq6Var.a;
        }
        return 0.0f;
    }

    public static final void y(s61 s61Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = w61.a.iterator();
        while (it.hasNext()) {
            try {
                ((v61) it.next()).J(s61Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    gv3.g(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            gv3.g(th, new xm1(s61Var));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused2) {
        }
    }

    public static final int z(e37 e37Var, e37[] e37VarArr) {
        e37VarArr.getClass();
        int iHashCode = (e37Var.a().hashCode() * 31) + Arrays.hashCode(e37VarArr);
        int iE = e37Var.e();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i2 = iE - 1;
            int i3 = i * 31;
            String strA = e37Var.h(e37Var.e() - iE).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i3 + iHashCode2;
            iE = i2;
        }
        int iE2 = e37Var.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iE2 - 1;
            int i5 = iHashCode3 * 31;
            nr4 nr4VarR = e37Var.h(e37Var.e() - iE2).r();
            iHashCode3 = i5 + (nr4VarR != null ? nr4VarR.hashCode() : 0);
            iE2 = i4;
        }
    }

    public boolean B(Class cls) {
        return false;
    }

    public abstract String g();

    public Method t(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    public Constructor u(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    public String[] v(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }
}
