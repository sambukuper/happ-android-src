package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.c;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.c2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class km4 {
    public static volatile lv2 a;
    public static final ct b = new ct(0);
    public static final ct c = new ct(1);
    public static final ct d = new ct(2);
    public static final zy0 e = new zy0(641200809, false, new dx0(16));
    public static final int[] f = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] g = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
    public static final boolean[] h = new boolean[3];
    public static final e17 i = new e17("TestTagsAsResourceId", false, new ew6(22));
    public static final e17 j = new e17("AccessibilityClassName", true, new ew6(14));
    public static final e17 k = new e17("CredentialRequest", false, new ew6(23));

    public static long A(int i2, int i3, int i4) {
        int i5 = i2 - 1;
        long j2 = i5;
        return (((((B(j2, 400L) + ((B(j2, 4L) + ((long) (i5 * 365))) + 1721423)) - B(j2, 100L)) + 2) + ((long) g[i3 + (R(i2) ? 12 : 0)])) + ((long) i4)) - 2440588;
    }

    public static long B(long j2, long j3) {
        return j2 >= 0 ? j2 / j3 : ((j2 + 1) / j3) - 1;
    }

    public static pg5 C(int i2, long j2) {
        if (j2 >= 0) {
            long j3 = i2;
            return new pg5(Long.valueOf(B(j2, j3)), Integer.valueOf((int) (j2 % j3)));
        }
        long j4 = i2;
        long jB = B(j2, j4);
        return new pg5(Long.valueOf(jB), Integer.valueOf((int) (j2 - (jB * j4))));
    }

    public static final boolean D(ai2 ai2Var, sn snVar) {
        int iOrdinal = ai2Var.d1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ai2 ai2VarP = u15.p(ai2Var);
                if (ai2VarP != null) {
                    return D(ai2VarP, snVar) || G(ai2Var, ai2VarP, 1, snVar);
                }
                bt.i("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return ai2Var.a1().a ? ((Boolean) snVar.B(ai2Var)).booleanValue() : g0(ai2Var, snVar);
                }
                b61.c();
                return false;
            }
        }
        return g0(ai2Var, snVar);
    }

    public static te3 E(long j2) {
        long j3 = j2 / 1000;
        if ((j2 ^ 1000) < 0 && j3 * 1000 != j2) {
            j3--;
        }
        long j4 = j2 % 1000;
        int i2 = (int) ((j4 + (1000 & (((j4 ^ 1000) & ((-j4) | j4)) >> 63))) * 1000000);
        if (j3 < -31557014167219200L) {
            return te3.Z;
        }
        return j3 > 31556889864403199L ? te3.f0 : F(i2, j3);
    }

    public static te3 F(int i2, long j2) {
        long j3 = i2;
        long j4 = j3 / 1000000000;
        if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
            j4--;
        }
        long j5 = j2 + j4;
        if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
            return j2 > 0 ? te3.f0 : te3.Z;
        }
        if (j5 < -31557014167219200L) {
            return te3.Z;
        }
        if (j5 > 31556889864403199L) {
            return te3.f0;
        }
        long j6 = j3 % 1000000000;
        return new te3(j5, (int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)));
    }

    public static final boolean G(final ai2 ai2Var, final ai2 ai2Var2, final int i2, final sn snVar) {
        if (k0(ai2Var, ai2Var2, i2, snVar)) {
            return true;
        }
        final ai2 ai2VarF = ((gh2) yn0.a0(ai2Var).getFocusOwner()).f();
        Boolean bool = (Boolean) w39.l0(ai2Var, i2, new gn2() { // from class: bb5
            @Override // defpackage.gn2
            public final Object B(Object obj) {
                k50 k50Var = (k50) obj;
                ai2 ai2Var3 = ai2Var;
                if (ai2VarF != ((gh2) yn0.a0(ai2Var3).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zK0 = km4.k0(ai2Var3, ai2Var2, i2, snVar);
                Boolean boolValueOf = Boolean.valueOf(zK0);
                if (zK0 || !k50Var.a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final int H(dj2 dj2Var, int i2) {
        boolean z = dh3.k(dj2Var.X, dj2.f0.X) >= 0;
        boolean z2 = i2 == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final int I(lp2 lp2Var) {
        lp2Var.getClass();
        return Long.hashCode(lp2Var.T);
    }

    public static ScheduledExecutorService J() {
        if (a != null) {
            return a;
        }
        synchronized (km4.class) {
            try {
                if (a == null) {
                    a = new lv2(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public static final String K(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        return eu.x0(parameterTypes, _UrlKt.FRAGMENT_ENCODE_SET, "<init>(", ")V", cd5.v0, 24);
    }

    public static final String L(Field field) {
        String name = field.getName();
        name.getClass();
        StringBuilder sb = new StringBuilder(js3.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        type.getClass();
        sb.append(ia6.b(type));
        return sb.toString();
    }

    public static final String M(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(eu.x0(parameterTypes, _UrlKt.FRAGMENT_ENCODE_SET, "(", ")", cd5.w0, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(ia6.b(returnType));
        return sb.toString();
    }

    public static SharedPreferences N(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final void O(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iG = aq4.G(xv0.Z(setEntrySet, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iG);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static boolean P(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean Q() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Huawei")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Huawei")) {
                return false;
            }
        }
        return "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static final boolean R(int i2) {
        if ((i2 & 3) == 0) {
            return i2 % 100 != 0 || i2 % 400 == 0;
        }
        return false;
    }

    public static boolean S() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Nokia")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Nokia")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str3) || "B2N_sprout".equalsIgnoreCase(str3);
    }

    public static boolean T() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        return "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean U() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        return "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean V() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Redmi")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Redmi")) {
                return false;
            }
        }
        return "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public static boolean W() {
        String upperCase;
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (str2.equalsIgnoreCase("Samsung")) {
                if ("a05s".equalsIgnoreCase(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    str3.getClass();
                    upperCase = str3.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    if (fm7.d0(upperCase, "SM-A057", false)) {
                        return true;
                    }
                }
            }
        } else if ("a05s".equalsIgnoreCase(Build.DEVICE)) {
            String str4 = Build.MODEL;
            str4.getClass();
            upperCase = str4.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (fm7.d0(upperCase, "SM-A057", false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean X() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean Y() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean Z() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        return "q4q".equalsIgnoreCase(str3) || "SCG16".equalsIgnoreCase(str3) || "SC-55C".equalsIgnoreCase(str3);
    }

    public static final void a(fv fvVar, String str, kx4 kx4Var, gn2 gn2Var, q8 q8Var, z41 z41Var, lp2 lp2Var, int i2, int i3) {
        int i4;
        kx4 kx4Var2;
        Object obj;
        Object obj2;
        lp2Var.X(1236588022);
        int i5 = i2 | (lp2Var.f(fvVar) ? 4 : 2) | (lp2Var.f(str) ? 32 : 16) | (lp2Var.h(gn2Var) ? 2048 : 1024) | (lp2Var.h(null) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (lp2Var.f(q8Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE) | (lp2Var.f(z41Var) ? 1048576 : 524288) | (lp2Var.c(1.0f) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304) | (lp2Var.f(null) ? 67108864 : 33554432) | (lp2Var.d(1) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (lp2Var.g(true) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if (lp2Var.N(i5 & 1, ((306783379 & i5) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            v63 v63Var = fvVar.a;
            int i6 = xs8.b;
            lp2Var.W(-329318062);
            lp2Var.W(-1008942344);
            if (v63Var.s.d != null) {
                lp2Var.W(-1008902292);
                lp2Var.p(false);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1008854118);
                boolean zF = dh3.f(z41Var, y41.c);
                boolean zG = lp2Var.g(zF);
                Object objK = lp2Var.K();
                Object obj3 = zz0.a;
                if (zG || objK == obj3) {
                    if (zF) {
                        obj = ab7.F;
                    } else {
                        u31 u31Var = new u31();
                        u31Var.X = xs8.a;
                        u31Var.Y = new ArrayList();
                        obj = u31Var;
                    }
                    Object obj4 = obj;
                    lp2Var.g0(obj4);
                    obj2 = obj4;
                }
                ab7 ab7Var = (ab7) obj2;
                boolean zF2 = lp2Var.f(v63Var) | lp2Var.f(ab7Var);
                Object objK2 = lp2Var.K();
                if (zF2 || objK2 == obj3) {
                    s63 s63VarA = v63.a(v63Var);
                    s63VarA.i = ab7Var;
                    objK2 = s63VarA.a();
                    lp2Var.g0(objK2);
                }
                v63Var = (v63) objK2;
                lp2Var.p(false);
                lp2Var.p(false);
            }
            lp2Var.p(false);
            v63 v63Var2 = v63Var;
            Object obj5 = v63Var2.b;
            if (obj5 instanceof s63) {
                bt.q("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
                return;
            }
            if (obj5 instanceof je) {
                xs8.b("ImageBitmap");
                throw null;
            }
            if (obj5 instanceof g73) {
                xs8.b("ImageVector");
                throw null;
            }
            if (obj5 instanceof og5) {
                xs8.b("Painter");
                throw null;
            }
            if (v63Var2.c != null) {
                bt.q("request.target must be null.");
                return;
            }
            if (((g94) z68.F(v63Var2, b73.e)) != null) {
                bt.q("request.lifecycle must be null.");
                return;
            }
            v76 v76Var = fvVar.c;
            ev evVar = null;
            xu xuVar = fvVar.b;
            if (((Boolean) lp2Var.j(qe3.a)).booleanValue()) {
                lp2Var.W(2019030948);
                evVar = (ev) lp2Var.j(ad4.a);
                lp2Var.p(false);
            } else {
                lp2Var.W(2019088453);
                lp2Var.p(false);
            }
            v41 v41Var = new v41(v63Var2, v76Var, xuVar, gn2Var, q8Var, z41Var, evVar, str);
            kx4Var2 = kx4Var;
            kx4 kx4VarY = kx4Var2.y(v41Var);
            ld ldVar = ld.i;
            int iHashCode = Long.hashCode(lp2Var.T);
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarY);
            kl5 kl5VarL = lp2Var.l();
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, ldVar);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            lp2Var.p(true);
        } else {
            kx4Var2 = kx4Var;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new wu(fvVar, str, kx4Var2, gn2Var, q8Var, z41Var, i2, i3);
        }
    }

    public static boolean a0(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final void b(ce8 ce8Var, kx4 kx4Var, ta2 ta2Var, gn2 gn2Var, zy0 zy0Var, lp2 lp2Var, int i2) {
        gn2 gn2Var2;
        lp2Var.X(-1877370462);
        int i3 = (i2 & 6) == 0 ? (lp2Var.f(ce8Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.h(ta2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= lp2Var.h(zy0Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (lp2Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            Object objK = lp2Var.K();
            Object obj = zz0.a;
            if (objK == obj) {
                objK = ti.j0;
                lp2Var.g0(objK);
            }
            gn2 gn2Var3 = (gn2) objK;
            Object objK2 = lp2Var.K();
            Object obj2 = objK2;
            if (objK2 == obj) {
                vd7 vd7Var = new vd7();
                vd7Var.add(ce8Var.c());
                lp2Var.g0(vd7Var);
                obj2 = vd7Var;
            }
            vd7 vd7Var2 = (vd7) obj2;
            Object objK3 = lp2Var.K();
            if (objK3 == obj) {
                long[] jArr = uw6.a;
                objK3 = new s05();
                lp2Var.g0(objK3);
            }
            s05 s05Var = (s05) objK3;
            Object objC = ce8Var.c();
            rh5 rh5Var = ce8Var.d;
            if (dh3.f(objC, rh5Var.getValue())) {
                lp2Var.W(321145192);
                if (vd7Var2.size() == 1 && dh3.f(vd7Var2.get(0), rh5Var.getValue())) {
                    lp2Var.W(321469824);
                    lp2Var.p(false);
                } else {
                    lp2Var.W(321279546);
                    boolean z = (i4 & 14) == 4;
                    Object objK4 = lp2Var.K();
                    if (z || objK4 == obj) {
                        objK4 = new wi(ce8Var, (byte) 3);
                        lp2Var.g0(objK4);
                    }
                    bw0.h0(vd7Var2, (gn2) objK4);
                    s05Var.a();
                    lp2Var.p(false);
                }
                lp2Var.p(false);
            } else {
                lp2Var.W(321475776);
                lp2Var.p(false);
            }
            if (s05Var.b(rh5Var.getValue())) {
                lp2Var.W(322279296);
                lp2Var.p(false);
            } else {
                lp2Var.W(321536443);
                ListIterator listIterator = vd7Var2.listIterator();
                int i5 = 0;
                while (true) {
                    o03 o03Var = (o03) listIterator;
                    if (!o03Var.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (dh3.f(gn2Var3.B(o03Var.next()), gn2Var3.B(rh5Var.getValue()))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    vd7Var2.add(rh5Var.getValue());
                } else {
                    vd7Var2.set(i5, rh5Var.getValue());
                }
                s05Var.a();
                int size = vd7Var2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Object obj3 = vd7Var2.get(i6);
                    s05Var.l(obj3, jm4.U(-934471669, new t71(ce8Var, ta2Var, obj3, zy0Var), lp2Var));
                }
                lp2Var.p(false);
            }
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4VarC);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.j(lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            lp2Var.W(-1312707512);
            int size2 = vd7Var2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj4 = vd7Var2.get(i7);
                lp2Var.U(1171574969, gn2Var3.B(obj4));
                rn2 rn2Var = (rn2) s05Var.g(obj4);
                if (rn2Var == null) {
                    lp2Var.W(1959122128);
                } else {
                    lp2Var.W(1171576145);
                    rn2Var.K(lp2Var, 0);
                }
                lp2Var.p(false);
                lp2Var.p(false);
            }
            lp2Var.p(false);
            lp2Var.p(true);
            gn2Var2 = gn2Var3;
        } else {
            lp2Var.Q();
            gn2Var2 = gn2Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ui(ce8Var, kx4Var, ta2Var, gn2Var2, zy0Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0179  */
    /* JADX WARN: Code duplicated, block: B:106:0x0182 A[Catch: NumberFormatException -> 0x0176, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0176, blocks: (B:98:0x0168, B:106:0x0182), top: B:130:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x018a  */
    /* JADX WARN: Code duplicated, block: B:110:0x018c  */
    /* JADX WARN: Code duplicated, block: B:132:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[PHI: r5
  0x00c6: PHI (r5v23 java.lang.String) = (r5v22 java.lang.String), (r5v34 java.lang.String) binds: [B:44:0x00ae, B:48:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x010c  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0119  */
    /* JADX WARN: Code duplicated, block: B:79:0x011b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0124  */
    /* JADX WARN: Code duplicated, block: B:83:0x0127  */
    /* JADX WARN: Code duplicated, block: B:86:0x0131  */
    /* JADX WARN: Code duplicated, block: B:87:0x0134  */
    /* JADX WARN: Code duplicated, block: B:92:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x015b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0168 A[Catch: NumberFormatException -> 0x0176, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0176, blocks: (B:98:0x0168, B:106:0x0182), top: B:130:0x0166 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void b0(Intent intent) {
        ue8 ue8Var;
        int iIntValue;
        int i2;
        String string;
        tu4 tu4Var;
        String string2;
        Object[] objArr;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j2;
        long j3;
        xa2 xa2VarB;
        uc2 uc2Var;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        if (m0(intent)) {
            c0("_nr", intent.getExtras());
        }
        int i3 = 0;
        if (!((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : w()) || (ue8Var = (ue8) FirebaseMessaging.m.get()) == null) {
            return;
        }
        vu4 vu4Var = null;
        str = null;
        String str9 = null;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            Object obj = extras.get("google.ttl");
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                if (obj instanceof String) {
                    try {
                        iIntValue = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        i2 = 0;
                    }
                }
                i2 = 0;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        xa2 xa2VarB2 = xa2.b();
                        try {
                            Object obj2 = mb2.l;
                            xa2VarB2.a();
                            string = (String) g28.b(((mb2) xa2VarB2.d.a(nb2.class)).c());
                        } catch (InterruptedException e2) {
                            e = e2;
                            u52.q(e);
                            return;
                        }
                    } catch (InterruptedException | ExecutionException e3) {
                        e = e3;
                    }
                }
                String str10 = string;
                xa2 xa2VarB3 = xa2.b();
                xa2VarB3.a();
                String packageName = xa2VarB3.a.getPackageName();
                if (q02.N(extras)) {
                    tu4Var = tu4.DISPLAY_NOTIFICATION;
                } else {
                    tu4Var = tu4.DATA_MESSAGE;
                }
                tu4 tu4Var2 = tu4Var;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    objArr = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                }
                if (objArr == 2) {
                    i3 = 5;
                } else if (objArr == 1) {
                    i3 = 10;
                }
                int i4 = i3;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                string4 = extras.getString("from");
                if (string4 != null && string4.startsWith("/topics/")) {
                    str9 = string4;
                }
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        j2 = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException unused2) {
                        xa2VarB = xa2.b();
                        uc2Var = xa2VarB.c;
                        xa2VarB.a();
                        str6 = uc2Var.e;
                        if (str6 != null) {
                            try {
                                j2 = Long.parseLong(str6);
                            } catch (NumberFormatException unused3) {
                                xa2VarB.a();
                                str7 = uc2Var.b;
                                try {
                                    if (str7.startsWith("1:")) {
                                        strArrSplit = str7.split(":");
                                        if (strArrSplit.length >= 2) {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j2 = Long.parseLong(str8);
                                            }
                                        }
                                        j2 = 0;
                                    } else {
                                        j2 = Long.parseLong(str7);
                                    }
                                } catch (NumberFormatException unused4) {
                                }
                            }
                        } else {
                            xa2VarB.a();
                            str7 = uc2Var.b;
                            if (str7.startsWith("1:")) {
                                j2 = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length >= 2) {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j2 = Long.parseLong(str8);
                                    }
                                }
                                j2 = 0;
                            }
                        }
                    }
                } else {
                    xa2VarB = xa2.b();
                    uc2Var = xa2VarB.c;
                    xa2VarB.a();
                    str6 = uc2Var.e;
                    if (str6 != null) {
                        j2 = Long.parseLong(str6);
                    } else {
                        xa2VarB.a();
                        str7 = uc2Var.b;
                        if (str7.startsWith("1:")) {
                            j2 = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length >= 2) {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j2 = Long.parseLong(str8);
                                }
                            }
                            j2 = 0;
                        }
                    }
                }
                if (j2 > 0) {
                    j3 = j2;
                } else {
                    j3 = 0;
                }
                vu4Var = new vu4(j3, str, str10, tu4Var2, packageName, str3, i4, i2, str2, str4, str5);
            }
            i2 = iIntValue;
            string = extras.getString("google.to");
            if (TextUtils.isEmpty(string)) {
                xa2 xa2VarB4 = xa2.b();
                Object obj3 = mb2.l;
                xa2VarB4.a();
                string = (String) g28.b(((mb2) xa2VarB4.d.a(nb2.class)).c());
            }
            String str11 = string;
            xa2 xa2VarB5 = xa2.b();
            xa2VarB5.a();
            String packageName2 = xa2VarB5.a.getPackageName();
            if (q02.N(extras)) {
                tu4Var = tu4.DISPLAY_NOTIFICATION;
            } else {
                tu4Var = tu4.DATA_MESSAGE;
            }
            tu4 tu4Var3 = tu4Var;
            string2 = extras.getString("google.delivered_priority");
            if (string2 != null) {
                if ("high".equals(string2)) {
                    objArr = 1;
                } else if ("normal".equals(string2)) {
                    objArr = 2;
                } else {
                    objArr = 0;
                }
            } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                objArr = 2;
            } else {
                string2 = extras.getString("google.priority");
                if ("high".equals(string2)) {
                    objArr = 1;
                } else if ("normal".equals(string2)) {
                    objArr = 2;
                } else {
                    objArr = 0;
                }
            }
            if (objArr == 2) {
                i3 = 5;
            } else if (objArr == 1) {
                i3 = 10;
            }
            int i5 = i3;
            string3 = extras.getString("google.message_id");
            if (string3 == null) {
                string3 = extras.getString("message_id");
            }
            if (string3 != null) {
                str = string3;
            } else {
                str = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            string4 = extras.getString("from");
            if (string4 != null) {
                str9 = string4;
            }
            if (str9 != null) {
                str2 = str9;
            } else {
                str2 = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            string5 = extras.getString("collapse_key");
            if (string5 != null) {
                str3 = string5;
            } else {
                str3 = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            string6 = extras.getString("google.c.a.m_l");
            if (string6 != null) {
                str4 = string6;
            } else {
                str4 = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            string7 = extras.getString("google.c.a.c_l");
            if (string7 != null) {
                str5 = string7;
            } else {
                str5 = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            if (extras.containsKey("google.c.sender.id")) {
                j2 = Long.parseLong(extras.getString("google.c.sender.id"));
            } else {
                xa2VarB = xa2.b();
                uc2Var = xa2VarB.c;
                xa2VarB.a();
                str6 = uc2Var.e;
                if (str6 != null) {
                    j2 = Long.parseLong(str6);
                } else {
                    xa2VarB.a();
                    str7 = uc2Var.b;
                    if (str7.startsWith("1:")) {
                        j2 = Long.parseLong(str7);
                    } else {
                        strArrSplit = str7.split(":");
                        if (strArrSplit.length >= 2) {
                            str8 = strArrSplit[1];
                            if (str8.isEmpty()) {
                                j2 = Long.parseLong(str8);
                            }
                        }
                        j2 = 0;
                    }
                }
            }
            if (j2 > 0) {
                j3 = j2;
            } else {
                j3 = 0;
            }
            vu4Var = new vu4(j3, str, str11, tu4Var3, packageName2, str3, i5, i2, str2, str4, str5);
        }
        if (vu4Var == null) {
            return;
        }
        try {
            cz czVar = new cz(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
            y02 y02Var = new y02("proto");
            ve8 ve8Var = (ve8) ue8Var;
            Set set = ve8Var.a;
            if (!set.contains(y02Var)) {
                throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", y02Var, set));
            }
            qz qzVar = ve8Var.b;
            we8 we8Var = ve8Var.c;
            zv7 zv7Var = new zv7();
            zv7Var.X = qzVar;
            zv7Var.Y = y02Var;
            zv7Var.Z = we8Var;
            zv7Var.w(new iy(new wu4(vu4Var), czVar));
        } catch (RuntimeException unused5) {
        }
    }

    public static final void c(Object obj, kx4 kx4Var, ta2 ta2Var, String str, zy0 zy0Var, lp2 lp2Var, int i2) {
        int i3;
        ta2 ta2Var2;
        String str2;
        lp2Var.X(-513216493);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? lp2Var.f(obj) : lp2Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        int i4 = i3 | 3456;
        if ((i2 & 24576) == 0) {
            i4 |= lp2Var.h(zy0Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (lp2Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            sg8 sg8VarI0 = wl7.i0(0, 7, null);
            b(rq7.o(obj, "Crossfade", lp2Var, (i4 & 14) | ((i4 >> 6) & 112)), kx4Var, sg8VarI0, null, zy0Var, lp2Var, 58352 & i4);
            ta2Var2 = sg8VarI0;
            str2 = "Crossfade";
        } else {
            lp2Var.Q();
            ta2Var2 = ta2Var;
            str2 = str;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ui(obj, kx4Var, ta2Var2, str2, zy0Var, i2, (byte) 1);
        }
    }

    public static void c0(String str, Bundle bundle) {
        try {
            xa2.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = q02.N(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            xa2 xa2VarB = xa2.b();
            xa2VarB.a();
            if (xa2VarB.d.a(b9.class) == null) {
                return;
            }
            c2.m();
        } catch (IllegalStateException unused3) {
        }
    }

    public static final long d(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    public static final wy7 d0(wy7 wy7Var, zn2 zn2Var, Executor executor) {
        zn2Var.getClass();
        executor.getClass();
        m51 m51Var = xy7.a;
        return xy7.a(nr4.x(executor), false, new qk4((Object) zn2Var, (Object) wy7Var, (q51) null, (byte) 14));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0170  */
    /* JADX WARN: Code duplicated, block: B:104:0x0174  */
    /* JADX WARN: Code duplicated, block: B:107:0x0187  */
    /* JADX WARN: Code duplicated, block: B:109:0x018a  */
    /* JADX WARN: Code duplicated, block: B:111:0x018d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0191  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:121:0x021a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0236  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0101  */
    /* JADX WARN: Code duplicated, block: B:76:0x0104  */
    /* JADX WARN: Code duplicated, block: B:80:0x0114  */
    /* JADX WARN: Code duplicated, block: B:81:0x0117  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0138  */
    /* JADX WARN: Code duplicated, block: B:97:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0167  */
    public static final void e(String str, kx4 kx4Var, boolean z, boolean z2, o88 o88Var, int i2, int i3, int i4, int i5, boolean z3, ig5 ig5Var, x67 x67Var, dw0 dw0Var, dw0 dw0Var2, dw0 dw0Var3, dw0 dw0Var4, dn2 dn2Var, lp2 lp2Var, int i6, int i7) {
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        int i10;
        int i11;
        dw0 dw0Var5;
        int i12;
        int i13;
        int i14;
        dw0 dw0Var6;
        int i15;
        int i16;
        int i17;
        int i18;
        dw0 dw0Var7;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z6;
        int i27;
        boolean z7;
        dw0 dw0Var8;
        dw0 dw0Var9;
        dw0 dw0Var10;
        boolean z8;
        dw0 dw0Var11;
        boolean z9;
        int i28;
        int i29;
        int i30;
        x67 x67Var2;
        j86 j86VarR;
        int i31;
        dw0 dw0Var12;
        int i32;
        boolean z10;
        int i33;
        int i34;
        dw0 dw0Var13;
        dw0 dw0Var14;
        x67 x67Var3;
        int i35;
        boolean z11;
        dw0 dw0Var15;
        int i36;
        dw0 dw0Var16;
        boolean z12;
        dw0 dw0Var17;
        int i37;
        str.getClass();
        dn2Var.getClass();
        lp2Var.X(-497765023);
        int i38 = i6 | (lp2Var.f(str) ? 4 : 2);
        if ((i6 & 48) == 0) {
            i38 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        int i39 = i7 & 4;
        if (i39 != 0) {
            i8 = i38 | 384;
            z4 = z;
        } else {
            z4 = z;
            i8 = i38 | (lp2Var.g(z4) ? 256 : 128);
        }
        int i40 = i7 & 8;
        if (i40 != 0) {
            i9 = i8 | 3072;
            z5 = z2;
        } else {
            z5 = z2;
            i9 = i8 | (lp2Var.g(z5) ? 2048 : 1024);
        }
        int i41 = i9 | (lp2Var.f(o88Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        int i42 = 1638400 | i41;
        int i43 = i7 & 128;
        if (i43 == 0) {
            if ((i6 & 12582912) == 0) {
                i42 |= lp2Var.d(i4) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
            }
            i10 = i42 | 905969664;
            i11 = i7 & 4096;
            if (i11 != 0) {
                i13 = 406;
                dw0Var5 = dw0Var;
            } else {
                dw0Var5 = dw0Var;
                if (lp2Var.f(dw0Var5)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i13 = 22 | i12;
            }
            i14 = i7 & 8192;
            if (i14 != 0) {
                i16 = i13 | 3072;
                dw0Var6 = dw0Var2;
            } else {
                dw0Var6 = dw0Var2;
                if (lp2Var.f(dw0Var6)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i16 = i13 | i15;
            }
            i17 = i16 | 24576;
            i18 = i7 & 32768;
            if (i18 != 0) {
                i20 = 221184 | i16;
                dw0Var7 = dw0Var3;
            } else {
                dw0Var7 = dw0Var3;
                if (lp2Var.f(dw0Var7)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i20 = i17 | i19;
            }
            i21 = i7 & DnsOverHttps.MAX_RESPONSE_SIZE;
            if (i21 != 0) {
                i23 = i20 | 1572864;
            } else {
                int i44 = i20;
                if (lp2Var.f(dw0Var4)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i23 = i44 | i22;
            }
            int i45 = i23 | 113246208;
            if (lp2Var.h(dn2Var)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i25 = i45 | i24;
            i26 = 1;
            if ((i10 & 306783379) == 306783378 || (i25 & 306783379) != 306783378) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (lp2Var.N(i10 & 1, z6)) {
                lp2Var.S();
                if ((i6 & 1) != 0 || lp2Var.x()) {
                    if (i39 != 0) {
                        z4 = true;
                    }
                    if (i40 != 0) {
                        z5 = false;
                    }
                    int i46 = i10 & (-458753);
                    if (i43 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i4;
                    }
                    jm6 jm6Var = ((tr) lp2Var.j(ur.a)).c.a;
                    int i47 = i25 & (-113);
                    if (i11 != 0) {
                        dw0Var5 = null;
                    }
                    if (i14 != 0) {
                        dw0Var6 = null;
                    }
                    if (i18 != 0) {
                        dw0Var7 = null;
                    }
                    dw0Var12 = dw0Var7;
                    i32 = i47;
                    z10 = true;
                    i33 = i31;
                    i34 = i46;
                    dw0Var13 = i21 == 0 ? dw0Var4 : null;
                    dw0Var14 = dw0Var6;
                    x67Var3 = jm6Var;
                    i35 = 3;
                    z11 = z5;
                    dw0Var15 = dw0Var5;
                    i36 = 2;
                } else {
                    lp2Var.Q();
                    int i48 = i10 & (-458753);
                    i35 = i2;
                    i26 = i5;
                    z10 = z3;
                    i32 = i25 & (-113);
                    dw0Var12 = dw0Var7;
                    dw0Var14 = dw0Var6;
                    z11 = z5;
                    i33 = i4;
                    x67Var3 = x67Var;
                    i34 = i48;
                    dw0Var15 = dw0Var5;
                    i36 = i3;
                    dw0Var13 = dw0Var4;
                }
                lp2Var.q();
                if (oc.t(lp2Var)) {
                    lp2Var.W(-1610791454);
                    z12 = z4;
                    i37 = i26;
                    dw0 dw0Var18 = dw0Var13;
                    i(str, kx4Var, z12, z11, o88Var, i35, i36, i33, i37, z10, ig5Var, x67Var3, dw0Var15, dw0Var14, dw0Var12, dw0Var18, dn2Var, lp2Var, i34 & 2147483646, i32 & 2147483646);
                    dw0Var17 = dw0Var12;
                    dw0Var16 = dw0Var18;
                    lp2Var.p(false);
                } else {
                    dw0Var16 = dw0Var13;
                    z12 = z4;
                    dw0Var17 = dw0Var12;
                    i37 = i26;
                    lp2Var.W(-1610768548);
                    g(str, kx4Var, z12, z11, o88Var, i35, i36, i33, i37, z10, ig5Var, x67Var3, dw0Var15, dw0Var17, dn2Var, lp2Var, i34 & 2147483646, (i32 & 1022) | 3072 | ((i32 >> 3) & 57344) | 1769472 | ((i32 >> 6) & 29360128));
                    lp2Var.p(false);
                }
                z9 = z11;
                z7 = z10;
                dw0Var10 = dw0Var17;
                dw0Var11 = dw0Var14;
                dw0Var8 = dw0Var16;
                z8 = z12;
                i27 = i37;
                dw0Var9 = dw0Var15;
                i30 = i33;
                x67Var2 = x67Var3;
                i29 = i36;
                i28 = i35;
            } else {
                lp2Var.Q();
                i27 = i5;
                z7 = z3;
                dw0Var8 = dw0Var4;
                dw0Var9 = dw0Var5;
                dw0Var10 = dw0Var7;
                z8 = z4;
                dw0Var11 = dw0Var6;
                z9 = z5;
                i28 = i2;
                i29 = i3;
                i30 = i4;
                x67Var2 = x67Var;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rw2(str, kx4Var, z8, z9, o88Var, i28, i29, i30, i27, z7, ig5Var, x67Var2, dw0Var9, dw0Var11, dw0Var10, dw0Var8, dn2Var, i6, i7, (byte) 0);
            }
        }
        i42 = 14221312 | i41;
        i10 = i42 | 905969664;
        i11 = i7 & 4096;
        if (i11 != 0) {
            i13 = 406;
            dw0Var5 = dw0Var;
        } else {
            dw0Var5 = dw0Var;
            if (lp2Var.f(dw0Var5)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i13 = 22 | i12;
        }
        i14 = i7 & 8192;
        if (i14 != 0) {
            i16 = i13 | 3072;
            dw0Var6 = dw0Var2;
        } else {
            dw0Var6 = dw0Var2;
            if (lp2Var.f(dw0Var6)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i16 = i13 | i15;
        }
        i17 = i16 | 24576;
        i18 = i7 & 32768;
        if (i18 != 0) {
            i20 = 221184 | i16;
            dw0Var7 = dw0Var3;
        } else {
            dw0Var7 = dw0Var3;
            if (lp2Var.f(dw0Var7)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i20 = i17 | i19;
        }
        i21 = i7 & DnsOverHttps.MAX_RESPONSE_SIZE;
        if (i21 != 0) {
            i23 = i20 | 1572864;
        } else {
            int i49 = i20;
            if (lp2Var.f(dw0Var4)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i23 = i49 | i22;
        }
        int i410 = i23 | 113246208;
        if (lp2Var.h(dn2Var)) {
            i24 = 536870912;
        } else {
            i24 = 268435456;
        }
        i25 = i410 | i24;
        i26 = 1;
        if ((i10 & 306783379) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (lp2Var.N(i10 & 1, z6)) {
            lp2Var.S();
            if ((i6 & 1) != 0) {
                if (i39 != 0) {
                    z4 = true;
                }
                if (i40 != 0) {
                    z5 = false;
                }
                int i411 = i10 & (-458753);
                if (i43 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i4;
                }
                jm6 jm6Var2 = ((tr) lp2Var.j(ur.a)).c.a;
                int i412 = i25 & (-113);
                if (i11 != 0) {
                    dw0Var5 = null;
                }
                if (i14 != 0) {
                    dw0Var6 = null;
                }
                if (i18 != 0) {
                    dw0Var7 = null;
                }
                dw0Var12 = dw0Var7;
                i32 = i412;
                z10 = true;
                i33 = i31;
                i34 = i411;
                dw0Var13 = i21 == 0 ? dw0Var4 : null;
                dw0Var14 = dw0Var6;
                x67Var3 = jm6Var2;
                i35 = 3;
                z11 = z5;
                dw0Var15 = dw0Var5;
                i36 = 2;
            } else {
                if (i39 != 0) {
                    z4 = true;
                }
                if (i40 != 0) {
                    z5 = false;
                }
                int i413 = i10 & (-458753);
                if (i43 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i4;
                }
                jm6 jm6Var3 = ((tr) lp2Var.j(ur.a)).c.a;
                int i414 = i25 & (-113);
                if (i11 != 0) {
                    dw0Var5 = null;
                }
                if (i14 != 0) {
                    dw0Var6 = null;
                }
                if (i18 != 0) {
                    dw0Var7 = null;
                }
                dw0Var12 = dw0Var7;
                i32 = i414;
                z10 = true;
                i33 = i31;
                i34 = i413;
                dw0Var13 = i21 == 0 ? dw0Var4 : null;
                dw0Var14 = dw0Var6;
                x67Var3 = jm6Var3;
                i35 = 3;
                z11 = z5;
                dw0Var15 = dw0Var5;
                i36 = 2;
            }
            lp2Var.q();
            if (oc.t(lp2Var)) {
                lp2Var.W(-1610791454);
                z12 = z4;
                i37 = i26;
                dw0 dw0Var19 = dw0Var13;
                i(str, kx4Var, z12, z11, o88Var, i35, i36, i33, i37, z10, ig5Var, x67Var3, dw0Var15, dw0Var14, dw0Var12, dw0Var19, dn2Var, lp2Var, i34 & 2147483646, i32 & 2147483646);
                dw0Var17 = dw0Var12;
                dw0Var16 = dw0Var19;
                lp2Var.p(false);
            } else {
                dw0Var16 = dw0Var13;
                z12 = z4;
                dw0Var17 = dw0Var12;
                i37 = i26;
                lp2Var.W(-1610768548);
                g(str, kx4Var, z12, z11, o88Var, i35, i36, i33, i37, z10, ig5Var, x67Var3, dw0Var15, dw0Var17, dn2Var, lp2Var, i34 & 2147483646, (i32 & 1022) | 3072 | ((i32 >> 3) & 57344) | 1769472 | ((i32 >> 6) & 29360128));
                lp2Var.p(false);
            }
            z9 = z11;
            z7 = z10;
            dw0Var10 = dw0Var17;
            dw0Var11 = dw0Var14;
            dw0Var8 = dw0Var16;
            z8 = z12;
            i27 = i37;
            dw0Var9 = dw0Var15;
            i30 = i33;
            x67Var2 = x67Var3;
            i29 = i36;
            i28 = i35;
        } else {
            lp2Var.Q();
            i27 = i5;
            z7 = z3;
            dw0Var8 = dw0Var4;
            dw0Var9 = dw0Var5;
            dw0Var10 = dw0Var7;
            z8 = z4;
            dw0Var11 = dw0Var6;
            z9 = z5;
            i28 = i2;
            i29 = i3;
            i30 = i4;
            x67Var2 = x67Var;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rw2(str, kx4Var, z8, z9, o88Var, i28, i29, i30, i27, z7, ig5Var, x67Var2, dw0Var9, dw0Var11, dw0Var10, dw0Var8, dn2Var, i6, i7, (byte) 0);
        }
    }

    public static final int e0(int i2, int i3) {
        return f[i3 + (R(i2) ? 12 : 0)];
    }

    public static final void f(kx4 kx4Var, lp2 lp2Var, int i2) {
        lp2Var.X(847316552);
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            kx4 kx4VarF = u15.f(kx4Var, ((dp) lp2Var.j(ep.z)).b.b, u70.e);
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarF);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, tw0VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            oc.b(vj8.j0(y46.title_log_files, lp2Var), os4.w(b.a, ((gr) lp2Var.j(hr.a)).a.a), lp2Var, 0);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new f80(kx4Var, i2, (byte) 3);
        }
    }

    public static final boolean f0(ai2 ai2Var, sn snVar) {
        Object[] objArr = new ai2[16];
        if (!ai2Var.X.p0) {
            wc3.b("visitChildren called on an unattached node");
        }
        c15 c15Var = new c15(0, new jx4[16]);
        jx4 jx4Var = ai2Var.X;
        jx4 jx4Var2 = jx4Var.h0;
        if (jx4Var2 == null) {
            yn0.n(c15Var, jx4Var);
        } else {
            c15Var.b(jx4Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = c15Var.Z;
            if (i3 == 0) {
                break;
            }
            jx4 jx4VarT = (jx4) c15Var.k(i3 - 1);
            if ((jx4VarT.f0 & 1024) == 0) {
                yn0.n(c15Var, jx4VarT);
            } else {
                while (jx4VarT != null) {
                    if ((jx4VarT.Z & 1024) != 0) {
                        c15 c15Var2 = null;
                        while (jx4VarT != null) {
                            if (jx4VarT instanceof ai2) {
                                ai2 ai2Var2 = (ai2) jx4VarT;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = ai2Var2;
                                i2 = i4;
                            } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                int i5 = 0;
                                for (jx4 jx4Var3 = ((oh1) jx4VarT).r0; jx4Var3 != null; jx4Var3 = jx4Var3.h0) {
                                    if ((jx4Var3.Z & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            jx4VarT = jx4Var3;
                                        } else {
                                            if (c15Var2 == null) {
                                                c15Var2 = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT != null) {
                                                c15Var2.b(jx4VarT);
                                                jx4VarT = null;
                                            }
                                            c15Var2.b(jx4Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            jx4VarT = yn0.T(c15Var2);
                        }
                        break;
                    }
                    jx4VarT = jx4VarT.h0;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, l71.Z);
        int i6 = i2 - 1;
        if (i6 < objArr.length) {
            while (i6 >= 0) {
                ai2 ai2Var3 = (ai2) objArr[i6];
                if (u15.B(ai2Var3) && k(ai2Var3, snVar)) {
                    return true;
                }
                i6--;
            }
        }
        return false;
    }

    public static final void g(final String str, final kx4 kx4Var, final boolean z, final boolean z2, final o88 o88Var, final int i2, final int i3, final int i4, final int i5, final boolean z3, final ig5 ig5Var, final x67 x67Var, final dw0 dw0Var, final dw0 dw0Var2, final dn2 dn2Var, lp2 lp2Var, final int i6, final int i7) {
        int i8;
        int i9;
        lp2 lp2Var2;
        long j2;
        long j3;
        lp2Var.X(1854963224);
        if ((i6 & 6) == 0) {
            i8 = (lp2Var.f(str) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        int i10 = i6 & 384;
        int i11 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i10 == 0) {
            i8 |= lp2Var.g(z) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= lp2Var.g(z2) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= lp2Var.f(o88Var) ? 16384 : 8192;
        }
        if ((i6 & 196608) == 0) {
            i8 |= lp2Var.d(i2) ? 131072 : 65536;
        }
        if ((i6 & 1572864) == 0) {
            i8 |= lp2Var.d(i3) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i8 |= lp2Var.d(i4) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i8 |= lp2Var.d(i5) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i8 |= lp2Var.g(z3) ? 536870912 : 268435456;
        }
        if ((i7 & 6) == 0) {
            i9 = (lp2Var.f(ig5Var) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= lp2Var.f(x67Var) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            if (!lp2Var.f(dw0Var)) {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i7 & 3072) == 0) {
            i9 |= lp2Var.f(null) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= lp2Var.f(dw0Var2) ? 16384 : 8192;
        }
        if ((i7 & 196608) == 0) {
            i9 |= lp2Var.f(null) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i9 |= lp2Var.h(null) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i9 |= lp2Var.h(dn2Var) ? 8388608 : 4194304;
        }
        if (lp2Var.N(i8 & 1, ((306783379 & i8) == 306783378 && (4793491 & i9) == 4793490) ? false : true)) {
            lp2Var.S();
            if ((i6 & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            if (dw0Var == null) {
                lp2Var.W(208254022);
                j2 = ((dp) lp2Var.j(ep.z)).g.a;
                lp2Var.p(false);
            } else {
                lp2Var.W(208252379);
                lp2Var.p(false);
                j2 = dw0Var.a;
            }
            long j4 = j2;
            if (dw0Var2 == null) {
                lp2Var.W(208256937);
                j3 = ((dp) lp2Var.j(ep.z)).g.g;
                lp2Var.p(false);
            } else {
                lp2Var.W(208255232);
                lp2Var.p(false);
                j3 = dw0Var2.a;
            }
            lp2Var.W(208260334);
            ox1 ox1Var = ep.z;
            long j5 = ((dp) lp2Var.j(ox1Var)).g.b;
            lp2Var.p(false);
            lp2Var.W(208264017);
            long j6 = ((dp) lp2Var.j(ox1Var)).g.h;
            lp2Var.p(false);
            if (!z || z2) {
                j3 = j6;
            }
            final lh7 lh7VarA = oa7.a(j3, null, "containerColor", lp2Var, 384, 10);
            lh7 lh7VarA2 = oa7.a((!z || z2) ? j5 : j4, null, "contentColor", lp2Var, 384, 10);
            ox1 ox1Var2 = j41.a;
            dw0 dw0Var3 = (dw0) lh7VarA2.getValue();
            long j7 = dw0Var3.a;
            lp2Var2 = lp2Var;
            mb6.a(ox1Var2.a(dw0Var3), jm4.U(-1774673576, new rn2() { // from class: tw2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    lp2 lp2Var3 = (lp2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    boolean z4 = false;
                    if (lp2Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        boolean z5 = z2;
                        Boolean boolValueOf = Boolean.valueOf(z5);
                        hx4 hx4Var = hx4.X;
                        x67 x67Var2 = x67Var;
                        kx4 kx4VarF = u15.f(w39.k(hx4Var, x67Var2).y(kx4Var), ((dw0) lh7VarA.getValue()).a, u70.e);
                        boolean z6 = z;
                        if (z6 && !z5) {
                            z4 = true;
                        }
                        dn2 dn2Var2 = dn2Var;
                        km4.c(boolValueOf, os4.w(vj8.x(kx4VarF, z4, null, null, null, dn2Var2, lp2Var3, 13), ig5Var), null, null, jm4.U(1819387577, new vw2(str, z6, o88Var, i2, i3, i4, i5 ? 1 : 0, z3, x67Var2, dn2Var2, (byte) 1), lp2Var3), lp2Var3, 24576);
                    } else {
                        lp2Var3.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var2), lp2Var2, 56);
        } else {
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: uw2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i6 | 1);
                    int iP2 = w79.P(i7);
                    String str2 = str;
                    kx4 kx4Var2 = kx4Var;
                    boolean z4 = z;
                    boolean z5 = z2;
                    o88 o88Var2 = o88Var;
                    byte b2 = i2;
                    byte b3 = i3;
                    int i12 = i4;
                    boolean z6 = i5;
                    boolean z7 = z3;
                    ig5 ig5Var2 = ig5Var;
                    x67 x67Var2 = x67Var;
                    dw0 dw0Var4 = dw0Var;
                    dw0 dw0Var5 = dw0Var2;
                    dn2 dn2Var2 = dn2Var;
                    km4.g(str2, kx4Var2, z4, z5, o88Var2, b2, b3, i12, z6 ? 1 : 0, z7, ig5Var2, x67Var2, dw0Var4, dw0Var5, dn2Var2, (lp2) obj, iP, iP2);
                    return dn8.a;
                }
            };
        }
    }

    public static final boolean g0(ai2 ai2Var, sn snVar) {
        Object[] objArr = new ai2[16];
        if (!ai2Var.X.p0) {
            wc3.b("visitChildren called on an unattached node");
        }
        c15 c15Var = new c15(0, new jx4[16]);
        jx4 jx4Var = ai2Var.X;
        jx4 jx4Var2 = jx4Var.h0;
        if (jx4Var2 == null) {
            yn0.n(c15Var, jx4Var);
        } else {
            c15Var.b(jx4Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = c15Var.Z;
            if (i3 == 0) {
                break;
            }
            jx4 jx4VarT = (jx4) c15Var.k(i3 - 1);
            if ((jx4VarT.f0 & 1024) == 0) {
                yn0.n(c15Var, jx4VarT);
            } else {
                while (jx4VarT != null) {
                    if ((jx4VarT.Z & 1024) != 0) {
                        c15 c15Var2 = null;
                        while (jx4VarT != null) {
                            if (jx4VarT instanceof ai2) {
                                ai2 ai2Var2 = (ai2) jx4VarT;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = ai2Var2;
                                i2 = i4;
                            } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                int i5 = 0;
                                for (jx4 jx4Var3 = ((oh1) jx4VarT).r0; jx4Var3 != null; jx4Var3 = jx4Var3.h0) {
                                    if ((jx4Var3.Z & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            jx4VarT = jx4Var3;
                                        } else {
                                            if (c15Var2 == null) {
                                                c15Var2 = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT != null) {
                                                c15Var2.b(jx4VarT);
                                                jx4VarT = null;
                                            }
                                            c15Var2.b(jx4Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            jx4VarT = yn0.T(c15Var2);
                        }
                        break;
                    }
                    jx4VarT = jx4VarT.h0;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, l71.Z);
        for (int i6 = 0; i6 < i2; i6++) {
            ai2 ai2Var3 = (ai2) objArr[i6];
            if (u15.B(ai2Var3) && D(ai2Var3, snVar)) {
                return true;
            }
        }
        return false;
    }

    public static final bu5 h(String str) {
        zt5 zt5Var = zt5.U;
        if (fm7.o0(str)) {
            bt.q("Blank serial names are prohibited");
            return null;
        }
        Object it = ((kp4) eu5.a.values()).iterator();
        while (((hp4) it).hasNext()) {
            ow3 ow3Var = (ow3) ((fp4) it).next();
            if (str.equals(ow3Var.d().a())) {
                StringBuilder sbP = p61.p("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbP.append(yb6.a.b(ow3Var.getClass()).E());
                sbP.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                bt.q(gm7.N(sbP.toString()));
                return null;
            }
        }
        return new bu5(str, zt5Var);
    }

    public static final qs0 h0(v15 v15Var) {
        fk2 fk2Var = qg7.a;
        qs0 qs0Var = qg7.m;
        return new qs0(qs0Var.a, v15.e(v15Var.c().concat(qs0Var.f().c())));
    }

    public static final void i(final String str, final kx4 kx4Var, final boolean z, final boolean z2, final o88 o88Var, final int i2, final int i3, final int i4, final int i5, final boolean z3, final ig5 ig5Var, final x67 x67Var, dw0 dw0Var, dw0 dw0Var2, dw0 dw0Var3, dw0 dw0Var4, final dn2 dn2Var, lp2 lp2Var, int i6, int i7) {
        int i8;
        int i9;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        lp2 lp2Var2 = lp2Var;
        lp2Var2.X(886274378);
        if ((i6 & 6) == 0) {
            i8 = (lp2Var2.f(str) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= lp2Var2.f(kx4Var) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= lp2Var2.g(z) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= lp2Var2.g(z2) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= lp2Var2.f(o88Var) ? 16384 : 8192;
        }
        int i10 = i6 & 196608;
        int i11 = DnsOverHttps.MAX_RESPONSE_SIZE;
        if (i10 == 0) {
            i8 |= lp2Var2.d(i2) ? 131072 : 65536;
        }
        if ((i6 & 1572864) == 0) {
            i8 |= lp2Var2.d(i3) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i8 |= lp2Var2.d(i4) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i8 |= lp2Var2.d(i5) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i8 |= lp2Var2.g(z3) ? 536870912 : 268435456;
        }
        if ((i7 & 6) == 0) {
            i9 = i7 | (lp2Var2.f(ig5Var) ? 4 : 2);
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= lp2Var2.f(x67Var) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= lp2Var2.f(dw0Var) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i9 |= lp2Var2.f(dw0Var2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= lp2Var2.f(null) ? 16384 : 8192;
        }
        if ((i7 & 196608) == 0) {
            if (lp2Var2.f(dw0Var3)) {
                i11 = 131072;
            }
            i9 |= i11;
        }
        if ((i7 & 1572864) == 0) {
            i9 |= lp2Var2.f(dw0Var4) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i9 |= lp2Var2.f(null) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i9 |= lp2Var2.h(null) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i9 |= lp2Var2.h(dn2Var) ? 536870912 : 268435456;
        }
        if (lp2Var2.N(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 306783379) == 306783378) ? false : true)) {
            lp2Var2.S();
            if ((i6 & 1) != 0 && !lp2Var2.x()) {
                lp2Var2.Q();
            }
            lp2Var2.q();
            if (dw0Var == null) {
                lp2Var2.W(1306178746);
                j2 = ((dp) lp2Var2.j(ep.z)).g.c;
                lp2Var2.p(false);
            } else {
                lp2Var2.W(1306177103);
                lp2Var2.p(false);
                j2 = dw0Var.a;
            }
            if (dw0Var2 == null) {
                lp2Var2.W(1306182049);
                j3 = ((dp) lp2Var2.j(ep.z)).g.d;
                lp2Var2.p(false);
            } else {
                lp2Var2.W(1306180189);
                lp2Var2.p(false);
                j3 = dw0Var2.a;
            }
            if (dw0Var3 == null) {
                lp2Var2.W(1306185243);
                j4 = ((dp) lp2Var2.j(ep.z)).g.g;
                lp2Var2.p(false);
            } else {
                lp2Var2.W(1306183538);
                lp2Var2.p(false);
                j4 = dw0Var3.a;
            }
            if (dw0Var4 == null) {
                lp2Var2.W(1306188699);
                j5 = ((dp) lp2Var2.j(ep.z)).g.g;
                lp2Var2.p(false);
            } else {
                lp2Var2.W(1306186777);
                lp2Var2.p(false);
                j5 = dw0Var4.a;
            }
            lp2Var2.W(1306192096);
            ox1 ox1Var = ep.z;
            long j7 = j5;
            long j8 = ((dp) lp2Var2.j(ox1Var)).g.b;
            lp2Var2.p(false);
            lp2Var2.W(1306195779);
            long j9 = ((dp) lp2Var2.j(ox1Var)).g.h;
            lp2Var2.p(false);
            Object objK = lp2Var2.K();
            if (objK == zz0.a) {
                objK = z51.H(Boolean.FALSE);
                lp2Var2.g0(objK);
            }
            final y05 y05Var = (y05) objK;
            if (z && !z2) {
                j9 = ((Boolean) y05Var.getValue()).booleanValue() ? j7 : j4;
            }
            lh7 lh7VarA = oa7.a(j9, null, "containerColor", lp2Var2, 384, 10);
            if (!z || z2) {
                j6 = j8;
            } else {
                j6 = ((Boolean) y05Var.getValue()).booleanValue() ? j3 : j2;
            }
            lh7 lh7VarA2 = oa7.a(j6, null, "contentColor", lp2Var, 384, 10);
            final lh7 lh7VarB = ri.b(((Boolean) y05Var.getValue()).booleanValue() ? 1.02f : 1.0f, null, null, lp2Var, 0, 30);
            kx4 kx4VarF = ((Boolean) y05Var.getValue()).booleanValue() ? u15.f(hx4.X, ((dw0) lh7VarA.getValue()).a, u70.e) : new c70(1.0f, new fe7(((dw0) lh7VarA.getValue()).a), x67Var);
            ox1 ox1Var2 = j41.a;
            dw0 dw0Var5 = (dw0) lh7VarA2.getValue();
            long j10 = dw0Var5.a;
            final kx4 kx4Var2 = kx4VarF;
            lp2Var2 = lp2Var;
            mb6.a(ox1Var2.a(dw0Var5), jm4.U(-1597743990, new rn2() { // from class: sw2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    lp2 lp2Var3 = (lp2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (lp2Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        boolean z4 = z2;
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        float fFloatValue = ((Number) lh7VarB.getValue()).floatValue();
                        kx4 kx4VarL = ci8.L(hx4.X, fFloatValue, fFloatValue);
                        x67 x67Var2 = x67Var;
                        kx4 kx4VarY = w39.k(kx4VarL, x67Var2).y(kx4Var);
                        Object objK2 = lp2Var3.K();
                        if (objK2 == zz0.a) {
                            objK2 = new gh(y05Var, (byte) 4);
                            lp2Var3.g0(objK2);
                        }
                        kx4 kx4VarY2 = z51.J(kx4VarY, (gn2) objK2).y(kx4Var2);
                        boolean z5 = z;
                        boolean z6 = z5 && !z4;
                        c cVarA = hl6.a(0.0f, 3, dw0.f, false);
                        boolean z7 = z6;
                        dn2 dn2Var2 = dn2Var;
                        kx4 kx4VarW = os4.w(vj8.x(kx4VarY2, z7, null, cVarA, null, dn2Var2, lp2Var3, 5), ig5Var);
                        String str2 = str;
                        o88 o88Var2 = o88Var;
                        byte b2 = i2;
                        byte b3 = i3;
                        int i12 = i4;
                        boolean z8 = i5;
                        km4.c(boolValueOf, kx4VarW, null, null, jm4.U(-1307152149, new vw2(str2, z5, o88Var2, b2, b3, i12, z8 ? 1 : 0, z3, x67Var2, dn2Var2, (byte) 0), lp2Var3), lp2Var3, 24576);
                    } else {
                        lp2Var3.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var2), lp2Var2, 56);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new rw2(str, kx4Var, z, z2, o88Var, i2, i3, i4, i5, z3, ig5Var, x67Var, dw0Var, dw0Var2, dw0Var3, dw0Var4, dn2Var, i6, i7, (byte) 1);
        }
    }

    public static final qs0 i0(String str) {
        fk2 fk2Var = qg7.a;
        return new qs0(qg7.b, v15.e(str));
    }

    public static final qs0 j(String str) {
        fk2 fk2Var = qg7.a;
        return new qs0(qg7.i, v15.e(str));
    }

    public static final jp2 j0(lp2 lp2Var) {
        lp2 lp2Var2;
        lp2Var.T(206, d01.e);
        if (lp2Var.S) {
            bc7.y(lp2Var.I);
        }
        Object objC = lp2Var.C();
        pp2 ok6Var = objC instanceof pp2 ? (pp2) objC : null;
        if (ok6Var == null) {
            lp2Var2 = lp2Var;
            ok6Var = new ok6(new ip2(new jp2(lp2Var2, lp2Var.T, lp2Var.q, lp2Var.C, lp2Var.h.v0)), -1);
            lp2Var2.h0(ok6Var);
        } else {
            lp2Var2 = lp2Var;
        }
        jp2 jp2Var = ((ip2) ok6Var.a).X;
        jp2Var.f.setValue(lp2Var2.l());
        lp2Var2.p(false);
        return jp2Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean k(ai2 ai2Var, sn snVar) {
        int iOrdinal = ai2Var.d1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ai2 ai2VarP = u15.p(ai2Var);
                if (ai2VarP == null) {
                    bt.i("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = ai2VarP.d1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (k(ai2VarP, snVar) || G(ai2Var, ai2VarP, 2, snVar) || (ai2VarP.a1().a && ((Boolean) snVar.B(ai2VarP)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            b61.c();
                            return false;
                        }
                        bt.i("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return G(ai2Var, ai2VarP, 2, snVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    b61.c();
                    return false;
                }
                if (!f0(ai2Var, snVar)) {
                    if (!(ai2Var.a1().a ? ((Boolean) snVar.B(ai2Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return f0(ai2Var, snVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
  0x013a: PHI (r13v13 jx4) = (r13v7 jx4), (r13v14 jx4) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final boolean k0(ai2 ai2Var, ai2 ai2Var2, int i2, sn snVar) {
        jx4 jx4Var;
        jx4 jx4Var2;
        LayoutNode layoutNodeZ;
        t6 t6Var;
        jx4 jx4VarT;
        c15 c15Var;
        if (ai2Var.d1() != yh2.Y) {
            bt.i("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new ai2[16];
        if (!ai2Var.X.p0) {
            wc3.b("visitChildren called on an unattached node");
        }
        c15 c15Var2 = new c15(0, new jx4[16]);
        jx4 jx4Var3 = ai2Var.X;
        jx4 jx4Var4 = jx4Var3.h0;
        if (jx4Var4 == null) {
            yn0.n(c15Var2, jx4Var3);
        } else {
            c15Var2.b(jx4Var4);
        }
        int i3 = 0;
        while (true) {
            int i4 = c15Var2.Z;
            jx4Var = null;
            if (i4 == 0) {
                break;
            }
            jx4 jx4VarT2 = (jx4) c15Var2.k(i4 - 1);
            if ((jx4VarT2.f0 & 1024) == 0) {
                yn0.n(c15Var2, jx4VarT2);
            } else {
                while (jx4VarT2 != null) {
                    if ((jx4VarT2.Z & 1024) != 0) {
                        c15 c15Var3 = null;
                        while (jx4VarT2 != null) {
                            if (jx4VarT2 instanceof ai2) {
                                ai2 ai2Var3 = (ai2) jx4VarT2;
                                int i5 = i3 + 1;
                                if (objArr.length < i5) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i5, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i3] = ai2Var3;
                                i3 = i5;
                            } else if ((jx4VarT2.Z & 1024) != 0 && (jx4VarT2 instanceof oh1)) {
                                int i6 = 0;
                                for (jx4 jx4Var5 = ((oh1) jx4VarT2).r0; jx4Var5 != null; jx4Var5 = jx4Var5.h0) {
                                    if ((jx4Var5.Z & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            jx4VarT2 = jx4Var5;
                                        } else {
                                            if (c15Var3 == null) {
                                                c15Var3 = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT2 != null) {
                                                c15Var3.b(jx4VarT2);
                                                jx4VarT2 = null;
                                            }
                                            c15Var3.b(jx4Var5);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            jx4VarT2 = yn0.T(c15Var3);
                        }
                        break;
                    }
                    jx4VarT2 = jx4VarT2.h0;
                }
            }
        }
        Arrays.sort(objArr, 0, i3, l71.Z);
        if (i2 != 1) {
            if (i2 != 2) {
                bt.i("This function should only be used for 1-D focus search");
                return false;
            }
            kf3 kf3VarA0 = x97.a0(0, i3);
            int i7 = kf3VarA0.X;
            int i8 = kf3VarA0.Y;
            if (i7 <= i8) {
                boolean z = false;
                while (true) {
                    if (z) {
                        ai2 ai2Var4 = (ai2) objArr[i8];
                        if (u15.B(ai2Var4) && k(ai2Var4, snVar)) {
                            return true;
                        }
                    }
                    if (dh3.f(objArr[i8], ai2Var2)) {
                        z = true;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8--;
                }
            }
            if (i2 != 1) {
                if (!ai2Var.X.p0) {
                    wc3.b("visitAncestors called on an unattached node");
                }
                jx4Var2 = ai2Var.X.g0;
                layoutNodeZ = yn0.Z(ai2Var);
                loop5: while (layoutNodeZ != null) {
                    if ((((jx4) layoutNodeZ.H0.i0).f0 & 1024) != 0) {
                        while (jx4Var2 != null) {
                            if ((jx4Var2.Z & 1024) != 0) {
                                jx4VarT = jx4Var2;
                                c15Var = null;
                                while (jx4VarT != null) {
                                    if (jx4VarT instanceof ai2) {
                                        jx4Var = jx4VarT;
                                        break loop5;
                                    }
                                    if ((jx4VarT.Z & 1024) == 0) {
                                    }
                                    jx4VarT = yn0.T(c15Var);
                                }
                            }
                            jx4Var2 = jx4Var2.g0;
                        }
                    }
                    layoutNodeZ = layoutNodeZ.w();
                    if (layoutNodeZ != null) {
                    }
                }
                if (jx4Var != null) {
                    return ((Boolean) snVar.B(ai2Var)).booleanValue();
                }
            }
            return false;
        }
        kf3 kf3VarA1 = x97.a0(0, i3);
        int i9 = kf3VarA1.X;
        int i10 = kf3VarA1.Y;
        if (i9 <= i10) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    ai2 ai2Var5 = (ai2) objArr[i9];
                    if (u15.B(ai2Var5) && D(ai2Var5, snVar)) {
                        return true;
                    }
                }
                if (dh3.f(objArr[i9], ai2Var2)) {
                    z2 = true;
                }
                if (i9 == i10) {
                    break;
                }
                i9++;
            }
        }
        if (i2 != 1 && ai2Var.a1().a) {
            if (!ai2Var.X.p0) {
                wc3.b("visitAncestors called on an unattached node");
            }
            jx4Var2 = ai2Var.X.g0;
            layoutNodeZ = yn0.Z(ai2Var);
            loop5: while (layoutNodeZ != null) {
                if ((((jx4) layoutNodeZ.H0.i0).f0 & 1024) != 0) {
                    while (jx4Var2 != null) {
                        if ((jx4Var2.Z & 1024) != 0) {
                            jx4VarT = jx4Var2;
                            c15Var = null;
                            while (jx4VarT != null) {
                                if (jx4VarT instanceof ai2) {
                                    jx4Var = jx4VarT;
                                    break loop5;
                                }
                                if ((jx4VarT.Z & 1024) == 0 && (jx4VarT instanceof oh1)) {
                                    int i11 = 0;
                                    for (jx4 jx4Var6 = ((oh1) jx4VarT).r0; jx4Var6 != null; jx4Var6 = jx4Var6.h0) {
                                        if ((jx4Var6.Z & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                jx4VarT = jx4Var6;
                                            } else {
                                                if (c15Var == null) {
                                                    c15Var = new c15(0, new jx4[16]);
                                                }
                                                if (jx4VarT != null) {
                                                    c15Var.b(jx4VarT);
                                                    jx4VarT = null;
                                                }
                                                c15Var.b(jx4Var6);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                jx4VarT = yn0.T(c15Var);
                            }
                        }
                        jx4Var2 = jx4Var2.g0;
                    }
                }
                layoutNodeZ = layoutNodeZ.w();
                jx4Var2 = (layoutNodeZ != null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
            }
            if (jx4Var != null) {
                return ((Boolean) snVar.B(ai2Var)).booleanValue();
            }
        }
        return false;
    }

    public static final qs0 l(String str) {
        fk2 fk2Var = qg7.a;
        return new qs0(qg7.a, v15.e(str));
    }

    public static void l0(ml2 ml2Var, jo1 jo1Var, String str) {
        p0 p0Var = new p0(jo1Var, str, (byte) 15);
        m51 m51Var = ko1.B1;
        nf1 nf1Var = tp1.a;
        jm4.Q(m51Var, dm4.a, new r0((Object) ml2Var, (Object) p0Var, (Object) jo1Var, (q51) null, (byte) 17), 2);
    }

    public static final g37 m(String str, nr4 nr4Var, e37[] e37VarArr, gn2 gn2Var) {
        if (fm7.o0(str)) {
            bt.q("Blank serial names are prohibited");
            return null;
        }
        if (nr4Var.equals(pm7.M)) {
            bt.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        dt0 dt0Var = new dt0(str);
        gn2Var.B(dt0Var);
        return new g37(str, nr4Var, dt0Var.b.size(), eu.K0(e37VarArr), dt0Var);
    }

    public static boolean m0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static g37 n(String str, nr4 nr4Var, e37[] e37VarArr) {
        if (fm7.o0(str)) {
            bt.q("Blank serial names are prohibited");
            return null;
        }
        if (nr4Var.equals(pm7.M)) {
            bt.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        dt0 dt0Var = new dt0(str);
        return new g37(str, nr4Var, dt0Var.b.size(), eu.K0(e37VarArr), dt0Var);
    }

    public static zf6 n0(zf6 zf6Var) {
        if ((zf6Var != null ? zf6Var.i0 : null) == null) {
            return zf6Var;
        }
        yf6 yf6VarK = zf6Var.k();
        yf6VarK.g = null;
        return yf6VarK.a();
    }

    public static final int o(vi4 vi4Var, r8 r8Var) {
        vi4 vi4VarL0 = vi4Var.l0();
        if (vi4VarL0 == null) {
            wc3.b("Child of " + vi4Var + " cannot be null when calculating alignment line");
        }
        if (vi4Var.s0().c().containsKey(r8Var)) {
            Integer num = (Integer) vi4Var.s0().c().get(r8Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iN = vi4VarL0.N(r8Var);
            if (iN != Integer.MIN_VALUE) {
                boolean z = vi4Var.p0;
                boolean z2 = vi4Var.q0;
                vi4VarL0.p0 = true;
                vi4Var.q0 = true;
                vi4Var.F0();
                vi4VarL0.p0 = z;
                vi4Var.q0 = z2;
                return iN + ((int) (r8Var instanceof t03 ? vi4VarL0.u0() & 4294967295L : vi4VarL0.u0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void o0(long j2, int[] iArr) {
        int i2;
        int[] iArr2 = iArr;
        if (iArr2.length < 6) {
            iArr2 = new int[6];
        }
        pg5 pg5VarC = C(86400000, j2);
        long jLongValue = ((Long) pg5VarC.a).longValue();
        int[] iArr3 = iArr2.length < 5 ? new int[5] : iArr2;
        pg5 pg5VarC2 = C(146097, 719162 + jLongValue);
        pg5 pg5VarC3 = C(36524, pg5VarC2.b.intValue());
        pg5 pg5VarC4 = C(1461, pg5VarC3.b.intValue());
        int i3 = 365;
        pg5 pg5VarC5 = C(365, pg5VarC4.b.intValue());
        long jLongValue2 = ((Long) pg5VarC2.a).longValue() * 400;
        Long l = (Long) pg5VarC3.a;
        long jLongValue3 = (((Long) pg5VarC4.a).longValue() * 4) + (l.longValue() * 100) + jLongValue2;
        Long l2 = (Long) pg5VarC5.a;
        int iLongValue = (int) (jLongValue3 + l2.longValue());
        int iIntValue = pg5VarC5.b.intValue();
        if (l.longValue() != 4 && l2.longValue() != 4) {
            iLongValue++;
            i3 = iIntValue;
        }
        pg5 pg5Var = new pg5(Integer.valueOf(iLongValue), Integer.valueOf(i3 + 1));
        int iIntValue2 = ((Integer) pg5Var.a).intValue();
        int iIntValue3 = pg5Var.b.intValue();
        boolean zR = R(iIntValue2);
        if (iIntValue3 > (zR ? 60 : 59)) {
            i2 = zR ? 1 : 2;
        } else {
            i2 = 0;
        }
        int i4 = ((((iIntValue3 - 1) + i2) * 12) + 6) / 367;
        int i5 = iIntValue3 - g[zR ? i4 + 12 : i4];
        int i6 = (int) ((jLongValue + 719164) % 7);
        if (i6 < 1) {
            i6 += 7;
        }
        iArr3[0] = iIntValue2;
        iArr3[1] = i4;
        iArr3[2] = i5;
        iArr3[3] = i6;
        iArr3[4] = iIntValue3;
        iArr2[5] = pg5VarC.b.intValue();
    }

    public static void p(n31 n31Var, ka4 ka4Var, m31 m31Var) {
        m31Var.o = -1;
        u21 u21Var = m31Var.M;
        int[] iArr = m31Var.p0;
        u21 u21Var2 = m31Var.L;
        u21 u21Var3 = m31Var.J;
        u21 u21Var4 = m31Var.K;
        u21 u21Var5 = m31Var.I;
        m31Var.p = -1;
        int[] iArr2 = n31Var.p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = u21Var5.g;
            int iQ = n31Var.q() - u21Var4.g;
            u21Var5.i = ka4Var.k(u21Var5);
            u21Var4.i = ka4Var.k(u21Var4);
            ka4Var.d(u21Var5.i, i2);
            ka4Var.d(u21Var4.i, iQ);
            m31Var.o = 2;
            m31Var.Y = i2;
            int i3 = iQ - i2;
            m31Var.U = i3;
            int i4 = m31Var.b0;
            if (i3 < i4) {
                m31Var.U = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = u21Var3.g;
        int iK = n31Var.k() - u21Var2.g;
        u21Var3.i = ka4Var.k(u21Var3);
        u21Var2.i = ka4Var.k(u21Var2);
        ka4Var.d(u21Var3.i, i5);
        ka4Var.d(u21Var2.i, iK);
        if (m31Var.a0 > 0 || m31Var.g0 == 8) {
            ge7 ge7VarK = ka4Var.k(u21Var);
            u21Var.i = ge7VarK;
            ka4Var.d(ge7VarK, m31Var.a0 + i5);
        }
        m31Var.p = 2;
        m31Var.Z = i5;
        int i6 = iK - i5;
        m31Var.V = i6;
        int i7 = m31Var.c0;
        if (i6 < i7) {
            m31Var.V = i7;
        }
    }

    public static final qs0 p0(qs0 qs0Var) {
        fk2 fk2Var = qg7.a;
        return new qs0(qg7.a, v15.e("U".concat(qs0Var.f().c())));
    }

    public static void q(int i2) {
        if (2 > i2 || i2 >= 37) {
            om0.j(ie2.l("radix ", i2, " was not in valid range "), new kf3(2, 36, 1));
        }
    }

    public static final String r(vm3 vm3Var, e37 e37Var) {
        e37Var.getClass();
        vm3Var.getClass();
        for (Annotation annotation : e37Var.getAnnotations()) {
            if (annotation instanceof ln3) {
                return ((ln3) annotation).discriminator();
            }
        }
        return vm3Var.a.e;
    }

    public static final y05 s(xz4 xz4Var, lp2 lp2Var, int i2) {
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (objK == beVar) {
            objK = z51.H(Boolean.FALSE);
            lp2Var.g0(objK);
        }
        y05 y05Var = (y05) objK;
        boolean z = (((i2 & 14) ^ 6) > 4 && lp2Var.f(xz4Var)) || (i2 & 6) == 4;
        Object objK2 = lp2Var.K();
        if (z || objK2 == beVar) {
            objK2 = new tt1(xz4Var, y05Var, null, (byte) 2);
            lp2Var.g0(objK2);
        }
        u70.h((rn2) objK2, lp2Var, xz4Var);
        return y05Var;
    }

    public static final qs0 t(String str) {
        fk2 fk2Var = qg7.a;
        return new qs0(qg7.c, v15.e(str));
    }

    public static final long u(j76 j76Var, kb0 kb0Var, int i2, long j2, long j3) {
        kb0 kb0Var2;
        i90 i90Var = j76Var.Y;
        kb0Var.getClass();
        long j4 = i2;
        os4.i(kb0Var.e(), 0L, j4);
        if (j76Var.Z) {
            bt.i("closed");
            return 0L;
        }
        long jMax = j2;
        int i3 = i2;
        kb0 kb0Var3 = kb0Var;
        while (true) {
            long jA = b.a(i90Var, kb0Var3, jMax, j3, i3);
            long j5 = jMax;
            if (jA != -1) {
                return jA;
            }
            long j6 = i90Var.Y;
            long j7 = (j6 - j4) + 1;
            if (j7 < j3) {
                if (j6 < j3) {
                    kb0Var2 = kb0Var;
                } else {
                    int iMax = (int) Math.max(1L, (j6 - j3) + 1);
                    int iMin = ((int) Math.min(j4, (i90Var.Y - j5) + 1)) - 1;
                    if (iMax <= iMin) {
                        while (true) {
                            kb0Var2 = kb0Var;
                            if (i90Var.J(iMin, kb0Var2, i90Var.Y - ((long) iMin))) {
                                break;
                            }
                            if (iMin != iMax) {
                                iMin--;
                            }
                        }
                    }
                }
                if (j76Var.X.read(i90Var, 8192L) != -1) {
                    i3 = i2;
                    jMax = Math.max(j5, j7);
                    kb0Var3 = kb0Var2;
                }
            }
            return -1L;
        }
    }

    public static xw8 v(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                kp5.t(pc6.l(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (xw8) objNewInstance;
            } catch (IllegalAccessException e2) {
                xw3.o(pc6.l(cls, "Cannot create an instance of "), e2);
                return null;
            } catch (InstantiationException e3) {
                xw3.o(pc6.l(cls, "Cannot create an instance of "), e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            xw3.o(pc6.l(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }

    public static boolean w() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            xa2.b();
            xa2 xa2VarB = xa2.b();
            xa2VarB.a();
            Context context = xa2VarB.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
    }

    public static void x(ml2 ml2Var) {
        h80 h80Var = new h80((byte) 13);
        m51 m51Var = ko1.B1;
        nf1 nf1Var = tp1.a;
        jm4.Q(m51Var, dm4.a, new r0((Object) ml2Var, (Object) h80Var, (Object) jo1.X, (q51) null, (byte) 17), 2);
    }

    public static final boolean y(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final boolean z(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
