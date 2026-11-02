package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.material3.c;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vj8 {
    public static Field A0 = null;
    public static final zy0 Y;
    public static final bz0 h0;
    public static final jw0 k0;
    public static final float l0;
    public static final d77 m0;
    public static final float n0;
    public static final float o0;
    public static final jw0 p0;
    public static final float q0;
    public static final float r0;
    public static final float s0;
    public static final d77 t0;
    public static final float u0;
    public static final float v0;
    public static final jw0 w0;
    public static boolean x0 = false;
    public static Method y0 = null;
    public static boolean z0 = false;
    public static final zy0 X = new zy0(-1571120048, false, new az0());
    public static final d30 Z = new d30();
    public static final z54[] f0 = new z54[0];
    public static final dx4 g0 = new dx4(28);
    public static final jw0 i0 = jw0.h0;
    public static final float j0 = 0.38f;

    static {
        byte b = 2;
        Y = new zy0(-1455401925, false, new l4(b));
        h0 = new bz0(b);
        jw0 jw0Var = jw0.r0;
        k0 = jw0Var;
        l0 = 0.38f;
        d77 d77Var = d77.g0;
        m0 = d77Var;
        n0 = 28.0f;
        o0 = 24.0f;
        p0 = jw0.g0;
        q0 = 40.0f;
        r0 = 32.0f;
        s0 = 2.0f;
        t0 = d77Var;
        u0 = 52.0f;
        v0 = 16.0f;
        w0 = jw0Var;
    }

    public static final long A(long j) {
        long j2 = (j << 1) + 1;
        gx1.Y.getClass();
        int i = ix1.a;
        return j2;
    }

    public static final long B(long j) {
        be beVar = gx1.Y;
        long j2 = j << 1;
        int i = ix1.a;
        return j2;
    }

    public static final fu D(jj0 jj0Var) {
        jj0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key.getClass();
        Object objC = ((lf0) jj0Var).c(key);
        Object obj = {0};
        if (objC != null) {
            obj = objC;
        }
        return new fu((int[]) obj);
    }

    public static final fu E(jj0 jj0Var) {
        jj0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key.getClass();
        Object objC = ((lf0) jj0Var).c(key);
        Object obj = {0};
        if (objC != null) {
            obj = objC;
        }
        return new fu((int[]) obj);
    }

    public static final fu F(jj0 jj0Var) {
        jj0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
        key.getClass();
        Object objC = ((lf0) jj0Var).c(key);
        Object obj = {0};
        if (objC != null) {
            obj = objC;
        }
        return new fu((int[]) obj);
    }

    public static final long G(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final String[] H(c51 c51Var) {
        c51Var.getClass();
        return (String[]) ((xc) c51Var).b.toArray(new String[0]);
    }

    public static final int I(int i) {
        return md2.b(md2.c.e(i).booleanValue(), (b06) md2.d.e(i), (xy5) md2.e.e(i));
    }

    public static final Type J(uw3 uw3Var) {
        yw3 yw3Var = uw3Var.a;
        if (yw3Var == null) {
            return l09.Z;
        }
        pw3 pw3Var = uw3Var.b;
        pw3Var.getClass();
        int iOrdinal = yw3Var.ordinal();
        if (iOrdinal == 0) {
            return v(pw3Var, true);
        }
        if (iOrdinal == 1) {
            return new l09(null, v(pw3Var, true));
        }
        if (iOrdinal == 2) {
            return new l09(v(pw3Var, true), null);
        }
        b61.c();
        return null;
    }

    public static String M() {
        SecretKey secretKeyC;
        Object rj6Var;
        String strEncodeToString;
        Object rj6Var2;
        qg5 qg5Var;
        oe oeVar = oe.a;
        synchronized (oeVar) {
            secretKeyC = oe.c();
            if (secretKeyC == null) {
                secretKeyC = oe.a();
            }
        }
        if (secretKeyC == null) {
            return O();
        }
        HappApplication happApplication = HappApplication.M0;
        HappApplication happApplicationI = k32.i();
        SharedPreferences sharedPreferences = happApplicationI.getSharedPreferences(happApplicationI.getPackageName() + "_preferences", 0);
        String string = sharedPreferences.getString("pref_socks_server", null);
        if (string == null) {
            string = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String string2 = sharedPreferences.getString("pref_proxy_mode", null);
        if (string2 == null) {
            string2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        synchronized (oeVar) {
            try {
                Charset charset = iq0.a;
                byte[] bytes = string.getBytes(charset);
                bytes.getClass();
                byte[] bArrDoFinal = oe.b(string2, 2, secretKeyC).doFinal(Base64.decode(bytes, 0));
                bArrDoFinal.getClass();
                rj6Var = new String(bArrDoFinal, charset);
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            if (rj6Var instanceof rj6) {
                rj6Var = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            strEncodeToString = (String) rj6Var;
        }
        if (strEncodeToString.length() == 0) {
            strEncodeToString = Base64.encodeToString(new SecureRandom().generateSeed(12), 0);
            strEncodeToString.getClass();
            synchronized (oe.a) {
                try {
                    String strEncodeToString2 = Base64.encodeToString(new SecureRandom().generateSeed(12), 0);
                    strEncodeToString2.getClass();
                    Cipher cipherB = oe.b(strEncodeToString2, 1, secretKeyC);
                    byte[] bytes2 = strEncodeToString.getBytes(iq0.a);
                    bytes2.getClass();
                    rj6Var2 = new qg5(strEncodeToString2, Base64.encodeToString(cipherB.doFinal(bytes2), 0));
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    rj6Var2 = new rj6(th2);
                }
                if (sj6.a(rj6Var2) != null) {
                    rj6Var2 = new qg5(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
                }
                qg5Var = (qg5) rj6Var2;
            }
            String str = (String) qg5Var.X;
            String str2 = (String) qg5Var.Y;
            if (str.length() == 0 || str2.length() == 0) {
                return O();
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("pref_proxy_mode", str);
            editorEdit.putString("pref_socks_server", str2);
            editorEdit.apply();
        }
        return strEncodeToString;
    }

    public static String O() {
        String strC0 = fm7.C0(new kf3(0, 3, 1));
        String str = Build.HOST;
        String strC1 = fm7.C0(new kf3(4, 7, 1));
        String str2 = Build.BRAND;
        String strC2 = fm7.C0(new kf3(10, 12, 1));
        String str3 = Build.MANUFACTURER;
        StringBuilder sbT = oi0.t(strC0, str, strC1, str2, strC2);
        sbT.append(str3);
        return sbT.toString();
    }

    public static final int P(jj0 jj0Var, int i) {
        jj0Var.getClass();
        if (D(jj0Var).contains(Integer.valueOf(i))) {
            return i;
        }
        return D(jj0Var).contains(1) ? 1 : 0;
    }

    public static void R(int i, e30 e30Var, m31 m31Var, boolean z) {
        u21 u21Var;
        u21 u21Var2;
        boolean z2;
        u21 u21Var3;
        u21 u21Var4;
        if (m31Var.m) {
            return;
        }
        if (!(m31Var instanceof n31) && m31Var.z() && q(m31Var)) {
            n31.V(m31Var, e30Var, new d30());
        }
        u21 u21VarI = m31Var.i(2);
        u21 u21VarI2 = m31Var.i(4);
        int iD = u21VarI.d();
        int iD2 = u21VarI2.d();
        HashSet<u21> hashSet = u21VarI.a;
        if (hashSet != null && u21VarI.c) {
            for (u21 u21Var5 : hashSet) {
                m31 m31Var2 = u21Var5.d;
                int i2 = i + 1;
                boolean zQ = q(m31Var2);
                u21 u21Var6 = m31Var2.I;
                u21 u21Var7 = m31Var2.K;
                if (m31Var2.z() && zQ) {
                    z2 = true;
                    n31.V(m31Var2, e30Var, new d30());
                } else {
                    z2 = true;
                }
                boolean z3 = ((u21Var5 == u21Var6 && (u21Var4 = u21Var7.f) != null && u21Var4.c) || (u21Var5 == u21Var7 && (u21Var3 = u21Var6.f) != null && u21Var3.c)) ? z2 : false;
                int i3 = m31Var2.p0[0];
                if (i3 != 3 || zQ) {
                    if (!m31Var2.z()) {
                        if (u21Var5 == u21Var6 && u21Var7.f == null) {
                            int iE = u21Var6.e() + iD;
                            m31Var2.J(iE, m31Var2.q() + iE);
                            R(i2, e30Var, m31Var2, z);
                        } else if (u21Var5 == u21Var7 && u21Var6.f == null) {
                            int iE2 = iD - u21Var7.e();
                            m31Var2.J(iE2 - m31Var2.q(), iE2);
                            R(i2, e30Var, m31Var2, z);
                        } else if (z3 && !m31Var2.x()) {
                            f0(i2, e30Var, m31Var2, z);
                        }
                    }
                } else if (i3 == 3 && m31Var2.v >= 0 && m31Var2.u >= 0 && (m31Var2.g0 == 8 || (m31Var2.r == 0 && m31Var2.W == 0.0f))) {
                    if (!m31Var2.x() && !m31Var2.F && z3 && !m31Var2.x()) {
                        g0(i2, m31Var, e30Var, m31Var2, z);
                    }
                }
            }
        }
        if (m31Var instanceof av2) {
            return;
        }
        HashSet<u21> hashSet2 = u21VarI2.a;
        if (hashSet2 != null && u21VarI2.c) {
            for (u21 u21Var8 : hashSet2) {
                m31 m31Var3 = u21Var8.d;
                int i4 = i + 1;
                boolean zQ2 = q(m31Var3);
                u21 u21Var9 = m31Var3.I;
                u21 u21Var10 = m31Var3.K;
                if (m31Var3.z() && zQ2) {
                    n31.V(m31Var3, e30Var, new d30());
                }
                boolean z4 = (u21Var8 == u21Var9 && (u21Var2 = u21Var10.f) != null && u21Var2.c) || (u21Var8 == u21Var10 && (u21Var = u21Var9.f) != null && u21Var.c);
                int i5 = m31Var3.p0[0];
                if (i5 != 3 || zQ2) {
                    if (!m31Var3.z()) {
                        if (u21Var8 == u21Var9 && u21Var10.f == null) {
                            int iE3 = u21Var9.e() + iD2;
                            m31Var3.J(iE3, m31Var3.q() + iE3);
                            R(i4, e30Var, m31Var3, z);
                        } else if (u21Var8 == u21Var10 && u21Var9.f == null) {
                            int iE4 = iD2 - u21Var10.e();
                            m31Var3.J(iE4 - m31Var3.q(), iE4);
                            R(i4, e30Var, m31Var3, z);
                        } else if (z4 && !m31Var3.x()) {
                            f0(i4, e30Var, m31Var3, z);
                        }
                    }
                } else if (i5 == 3 && m31Var3.v >= 0 && m31Var3.u >= 0) {
                    if (m31Var3.g0 == 8 || (m31Var3.r == 0 && m31Var3.W == 0.0f)) {
                        if (!m31Var3.x() && !m31Var3.F && z4 && !m31Var3.x()) {
                            g0(i4, m31Var, e30Var, m31Var3, z);
                        }
                    }
                }
            }
        }
        m31Var.m = true;
    }

    public static final boolean S(wf5 wf5Var, fk2 fk2Var) {
        wf5Var.getClass();
        fk2Var.getClass();
        return wf5Var.a(fk2Var);
    }

    public static final boolean T(jj0 jj0Var) {
        jj0Var.getClass();
        return Build.VERSION.SDK_INT >= 28 && P(jj0Var, 5) == 5;
    }

    public static boolean U(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final boolean V(fx5 fx5Var) {
        fx5Var.getClass();
        return fx5Var.b() == null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0199 A[LOOP:7: B:106:0x0197->B:107:0x0199, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x0221  */
    /* JADX WARN: Code duplicated, block: B:139:0x0225  */
    /* JADX WARN: Code duplicated, block: B:141:0x0229  */
    /* JADX WARN: Code duplicated, block: B:143:0x022d  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:0x0235  */
    /* JADX WARN: Code duplicated, block: B:148:0x0238  */
    /* JADX WARN: Code duplicated, block: B:149:0x023a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0213 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0192 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    public static long Y(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        long j2;
        char cCharAt;
        lx1 lx1Var;
        char cCharAt2;
        lx1 lx1Var2;
        long jM;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        int i15;
        double d;
        long jP;
        char cCharAt3;
        int i16;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        int i17;
        int i18;
        char cCharAt7;
        if (str.length() == 0) {
            bt.q("The string is empty");
            return 0L;
        }
        char cCharAt8 = str.charAt(0);
        int i19 = 1;
        char c = '-';
        char c2 = '+';
        if (cCharAt8 != '+') {
            i2 = cCharAt8 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            bt.q("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
            return 0L;
        }
        int i20 = i2 + 1;
        if (i20 == str.length()) {
            bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
            return 0L;
        }
        int i21 = 0;
        lx1 lx1Var3 = null;
        long jO = 0;
        long j3 = 0;
        while (i20 < str.length()) {
            char cCharAt9 = str.charAt(i20);
            if (cCharAt9 != 'T') {
                gi4 gi4Var = gi4.c;
                int i22 = i19;
                char cCharAt10 = str.charAt(i20);
                if (cCharAt10 != c2) {
                    if (cCharAt10 != c) {
                        i3 = i20;
                    } else {
                        i3 = i20 + 1;
                        i4 = -1;
                    }
                    while (i3 < str.length() && str.charAt(i3) == '0') {
                        i3++;
                    }
                    j = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            cCharAt6 = str.charAt(i3);
                            i5 = i20;
                            if ('0' > cCharAt6 && cCharAt6 < ':') {
                                i17 = cCharAt6 - '0';
                                i18 = i;
                                long j4 = gi4Var.a;
                                if (j > j4 || (j == j4 && i17 > gi4Var.b)) {
                                    i6 = i18;
                                    while (i3 < str.length() && '0' <= (cCharAt7 = str.charAt(i3)) && cCharAt7 < ':') {
                                        i3++;
                                    }
                                    if (i3 != str.length()) {
                                        if (i3 != i5 + ((cCharAt9 == '+' || cCharAt9 == '-') ? i22 : 0)) {
                                            j = 4611686018427387903L;
                                        }
                                    }
                                    bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                    return 0L;
                                }
                                j = (j << 3) + (j << i22) + ((long) i17);
                                i3++;
                                i20 = i5;
                                gi4Var = gi4Var;
                                i = i18;
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            lx1Var = lx1.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                for (i9 = i8; i9 < iMin; i9++) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                        for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                            i10 = (i10 << 1) + (i10 << 3);
                                        }
                                        iMin2 = Math.min(i9 + 9, str.length());
                                        i12 = i9;
                                        i13 = 0;
                                        while (true) {
                                            if (i12 < iMin2) {
                                                i16 = iMin2;
                                                cCharAt4 = str.charAt(i12);
                                                i14 = i12;
                                                if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                    i12 = i14 + 1;
                                                    iMin2 = i16;
                                                }
                                            } else {
                                                i14 = i12;
                                            }
                                        }
                                        for (i15 = 0; i15 < 9 - (i14 - i9); i15++) {
                                            i13 = (i13 << 1) + (i13 << 3);
                                        }
                                        i3 = i14;
                                        while (i3 < str.length() && '0' <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < ':') {
                                            i3++;
                                        }
                                        if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                            bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                            return 0L;
                                        }
                                        long j5 = (((long) i10) * 1000000000) + ((long) i13);
                                        long j6 = i4;
                                        double d2 = j5;
                                        switch (lx1Var.ordinal()) {
                                            case 0:
                                                d = 1.0E-15d;
                                                jP = nr4.P(d2 * d);
                                                break;
                                            case 1:
                                                d = 1.0E-12d;
                                                jP = nr4.P(d2 * d);
                                                break;
                                            case 2:
                                                d = 1.0E-9d;
                                                jP = nr4.P(d2 * d);
                                                break;
                                            case 3:
                                                d = 1.0E-6d;
                                                jP = nr4.P(d2 * d);
                                                break;
                                            case 4:
                                                d = 6.0E-5d;
                                                jP = nr4.P(d2 * d);
                                                break;
                                            case 5:
                                                d = 0.0036d;
                                                jP = nr4.P(d2 * d);
                                                break;
                                            case 6:
                                                d = 0.0864d;
                                                jP = nr4.P(d2 * d);
                                                break;
                                            default:
                                                b61.o(lx1Var, "Unknown unit: ");
                                                jP = 0;
                                                break;
                                        }
                                        j3 = jP * j6;
                                    } else {
                                        i10 = (cCharAt5 - '0') + (i10 << 3) + (i10 << 1);
                                    }
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            lx1Var2 = lx1.DAYS;
                            if (cCharAt2 == 'D') {
                                lx1Var = lx1Var2;
                            } else if (cCharAt2 == 'H') {
                                lx1Var = lx1.HOURS;
                            } else if (cCharAt2 == 'M') {
                                lx1Var = lx1.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                lx1Var = null;
                            }
                            if (lx1Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (lx1Var3 == null && lx1Var3.compareTo(lx1Var) <= 0) {
                                bt.q("Unexpected order of duration components");
                                return 0L;
                            }
                            if (lx1Var == lx1Var2) {
                                if (i21 != 0) {
                                    bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                    return 0L;
                                }
                                jO = w39.o(j2, lx1Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                    return 0L;
                                }
                                jM = m(jO, w39.o(j2, lx1Var) * ((long) i4));
                                if (jM == 9223372036854759646L) {
                                    bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                    return 0L;
                                }
                                jO = jM;
                            }
                            i20 = i3 + 1;
                            lx1Var3 = lx1Var;
                            i19 = i22;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        } else {
                            i5 = i20;
                        }
                        i6 = i;
                        if (i3 == str.length()) {
                            if (cCharAt9 != '+' || cCharAt9 == '-') {
                                i7 = i22;
                            } else {
                                i7 = 0;
                            }
                            if (i3 == i5 + i7) {
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            lx1Var = lx1.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        if (i12 < iMin2) {
                                            i16 = iMin2;
                                            cCharAt4 = str.charAt(i12);
                                            i14 = i12;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                        i12 = i14 + 1;
                                        iMin2 = i16;
                                    }
                                    while (i15 < 9 - (i14 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i14;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            lx1Var2 = lx1.DAYS;
                            if (cCharAt2 == 'D') {
                                lx1Var = lx1Var2;
                            } else if (cCharAt2 == 'H') {
                                lx1Var = lx1.HOURS;
                            } else if (cCharAt2 == 'M') {
                                lx1Var = lx1.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                lx1Var = null;
                            }
                            if (lx1Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (lx1Var3 == null) {
                            }
                            if (lx1Var == lx1Var2) {
                                if (i21 != 0) {
                                    bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                    return 0L;
                                }
                                jO = w39.o(j2, lx1Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                    return 0L;
                                }
                                jM = m(jO, w39.o(j2, lx1Var) * ((long) i4));
                                if (jM == 9223372036854759646L) {
                                    bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                    return 0L;
                                }
                                jO = jM;
                            }
                            i20 = i3 + 1;
                            lx1Var3 = lx1Var;
                            i19 = i22;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        }
                        bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                        return 0L;
                    }
                }
                i3 = i20 + 1;
                i4 = i22;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        cCharAt6 = str.charAt(i3);
                        i5 = i20;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        i5 = i20;
                    }
                    i6 = i;
                    if (i3 == str.length()) {
                        if (cCharAt9 != '+') {
                            i7 = i22;
                        } else {
                            i7 = i22;
                        }
                        if (i3 == i5 + i7) {
                        }
                        j2 = j;
                        cCharAt = str.charAt(i3);
                        lx1Var = lx1.SECONDS;
                        if (cCharAt == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            while (i9 < iMin) {
                                cCharAt5 = str.charAt(i9);
                                if ('0' <= cCharAt5) {
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                return 0L;
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i12 = i9;
                            i13 = 0;
                            while (true) {
                                if (i12 < iMin2) {
                                    i16 = iMin2;
                                    cCharAt4 = str.charAt(i12);
                                    i14 = i12;
                                    if ('0' > cCharAt4) {
                                    }
                                } else {
                                    i14 = i12;
                                }
                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                i12 = i14 + 1;
                                iMin2 = i16;
                            }
                            while (i15 < 9 - (i14 - i9)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            i3 = i14;
                            while (i3 < str.length()) {
                                i3++;
                            }
                            if (i3 != i8) {
                            }
                            bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                            return 0L;
                        }
                        cCharAt2 = str.charAt(i3);
                        lx1Var2 = lx1.DAYS;
                        if (cCharAt2 == 'D') {
                            lx1Var = lx1Var2;
                        } else if (cCharAt2 == 'H') {
                            lx1Var = lx1.HOURS;
                        } else if (cCharAt2 == 'M') {
                            lx1Var = lx1.MINUTES;
                        } else if (cCharAt2 != 'S') {
                            lx1Var = null;
                        }
                        if (lx1Var == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (lx1Var3 == null) {
                        }
                        if (lx1Var == lx1Var2) {
                            if (i21 != 0) {
                                bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                return 0L;
                            }
                            jO = w39.o(j2, lx1Var) * ((long) i4);
                        } else {
                            if (i21 == 0) {
                                bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                return 0L;
                            }
                            jM = m(jO, w39.o(j2, lx1Var) * ((long) i4));
                            if (jM == 9223372036854759646L) {
                                bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                                return 0L;
                            }
                            jO = jM;
                        }
                        i20 = i3 + 1;
                        lx1Var3 = lx1Var;
                        i19 = i22;
                        i = i6;
                        c = '-';
                        c2 = '+';
                    }
                    bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                    return 0L;
                    j = (j << 3) + (j << i22) + ((long) i17);
                    i3++;
                    i20 = i5;
                    gi4Var = gi4Var;
                    i = i18;
                }
            } else {
                if (i21 != 0 || (i20 = i20 + 1) == str.length()) {
                    bt.q(_UrlKt.FRAGMENT_ENCODE_SET);
                    return 0L;
                }
                i21 = i19;
            }
        }
        int i23 = i;
        long jI = gx1.i(m0(jO, lx1.MILLISECONDS), m0(j3, lx1.NANOSECONDS));
        return (i23 == 0 || jI == gx1.g0) ? jI : gx1.k(jI);
    }

    public static final List b0(xr6 xr6Var) {
        int iU = w45.u(xr6Var, "id");
        int iU2 = w45.u(xr6Var, "seq");
        int iU3 = w45.u(xr6Var, "from");
        int iU4 = w45.u(xr6Var, "to");
        gb4 gb4VarR = i21.r();
        while (xr6Var.S0()) {
            gb4VarR.add(new mj2(xr6Var.p0(iU3), (int) xr6Var.getLong(iU), (int) xr6Var.getLong(iU2), xr6Var.p0(iU4)));
        }
        return wv0.R0(i21.j(gb4VarR));
    }

    public static final xc c(String str) {
        return new xc(w45.U(str));
    }

    public static final a18 c0(qr6 qr6Var, String str, boolean z) {
        xr6 xr6VarX0 = qr6Var.X0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iU = w45.u(xr6VarX0, "seqno");
            int iU2 = w45.u(xr6VarX0, "cid");
            int iU3 = w45.u(xr6VarX0, "name");
            int iU4 = w45.u(xr6VarX0, "desc");
            if (iU != -1 && iU2 != -1 && iU3 != -1 && iU4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (xr6VarX0.S0()) {
                    if (((int) xr6VarX0.getLong(iU2)) >= 0) {
                        int i = (int) xr6VarX0.getLong(iU);
                        String strP0 = xr6VarX0.p0(iU3);
                        String str2 = xr6VarX0.getLong(iU4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strP0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listS0 = wv0.S0(linkedHashMap.entrySet(), new mv4((byte) 6));
                ArrayList arrayList = new ArrayList(xv0.Z(listS0, 10));
                Iterator it = listS0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listY0 = wv0.Y0(arrayList);
                List listS1 = wv0.S0(linkedHashMap2.entrySet(), new mv4((byte) 7));
                ArrayList arrayList2 = new ArrayList(xv0.Z(listS1, 10));
                Iterator it2 = listS1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                a18 a18Var = new a18(str, z, listY0, wv0.Y0(arrayList2));
                u15.h(xr6VarX0, null);
                return a18Var;
            }
            u15.h(xr6VarX0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(xr6VarX0, th);
                throw th2;
            }
        }
    }

    public static final y5 d0(int i, rm1 rm1Var) {
        cv8 cv8Var;
        vi1 vi1Var;
        y5 y5Var;
        uz3 uz3Var;
        tz3 tz3Var;
        y5 y5Var2 = new y5((byte) 14, false);
        w15 w15Var = (w15) rm1Var.b;
        dv8 dv8Var = (dv8) rm1Var.d;
        w15Var.getClass();
        dv8Var.getClass();
        zz5 zz5Var = (zz5) wv0.u0(i, dv8Var.a);
        cv8 cv8Var2 = cv8.d;
        if (zz5Var == null) {
            y5Var = null;
        } else {
            Integer numValueOf = (zz5Var.Y & 1) == 1 ? Integer.valueOf(zz5Var.Z) : null;
            Integer numValueOf2 = (zz5Var.Y & 2) == 2 ? Integer.valueOf(zz5Var.f0) : null;
            if (numValueOf2 != null) {
                cv8Var = new cv8(numValueOf2.intValue() & 255, (numValueOf2.intValue() >> 8) & 255, (numValueOf2.intValue() >> 16) & 255);
            } else {
                cv8Var = numValueOf != null ? new cv8(numValueOf.intValue() & 7, (numValueOf.intValue() >> 3) & 15, (numValueOf.intValue() >> 7) & 127) : cv8Var2;
            }
            xz5 xz5Var = zz5Var.g0;
            xz5Var.getClass();
            int iOrdinal = xz5Var.ordinal();
            if (iOrdinal == 0) {
                vi1Var = vi1.X;
            } else if (iOrdinal == 1) {
                vi1Var = vi1.Y;
            } else {
                if (iOrdinal != 2) {
                    b61.c();
                    return null;
                }
                vi1Var = vi1.Z;
            }
            vi1 vi1Var2 = vi1Var;
            Integer numValueOf3 = (zz5Var.Y & 8) == 8 ? Integer.valueOf(zz5Var.h0) : null;
            String string = (zz5Var.Y & 16) == 16 ? w15Var.getString(zz5Var.i0) : null;
            yz5 yz5Var = zz5Var.j0;
            yz5Var.getClass();
            y5Var = new y5(cv8Var, yz5Var, vi1Var2, numValueOf3, string);
        }
        if (y5Var == null && !rm1Var.a) {
            throw new ib3("No VersionRequirement with the given id in the table", null);
        }
        yz5 yz5Var2 = y5Var != null ? (yz5) y5Var.Z : null;
        int i2 = yz5Var2 == null ? -1 : e76.a[yz5Var2.ordinal()];
        if (i2 == -1) {
            uz3Var = uz3.f0;
        } else if (i2 == 1) {
            uz3Var = uz3.X;
        } else if (i2 == 2) {
            uz3Var = uz3.Y;
        } else {
            if (i2 != 3) {
                b61.c();
                return null;
            }
            uz3Var = uz3.Z;
        }
        vi1 vi1Var3 = y5Var != null ? (vi1) y5Var.g0 : null;
        int i3 = vi1Var3 == null ? -1 : e76.b[vi1Var3.ordinal()];
        if (i3 == -1) {
            tz3Var = tz3.Z;
        } else if (i3 == 1) {
            tz3Var = tz3.X;
        } else if (i3 != 2) {
            if (i3 != 3) {
                b61.c();
                return null;
            }
            tz3Var = tz3.Z;
        } else {
            tz3Var = tz3.Y;
        }
        y5Var2.Y = uz3Var;
        y5Var2.Z = tz3Var;
        y5Var2.g0 = y5Var != null ? (Integer) y5Var.f0 : null;
        y5Var2.f0 = y5Var != null ? (String) y5Var.h0 : null;
        if (y5Var != null) {
            cv8Var2 = (cv8) y5Var.Y;
        }
        y5Var2.h0 = new sz3(cv8Var2.a, cv8Var2.b, cv8Var2.c);
        return y5Var2;
    }

    public static final kx4 e0(kx4 kx4Var, dn2 dn2Var, lp2 lp2Var, int i) {
        kx4Var.getClass();
        dn2Var.getClass();
        Object objK = lp2Var.K();
        if (objK == zz0.a) {
            objK = new xz4();
            lp2Var.g0(objK);
        }
        return x(kx4Var, true, (xz4) objK, hl6.a(Float.NaN, 4, 0L, false), null, dn2Var, lp2Var, 1);
    }

    public static void f0(int i, e30 e30Var, m31 m31Var, boolean z) {
        float f = m31Var.d0;
        u21 u21Var = m31Var.I;
        int iD = u21Var.f.d();
        u21 u21Var2 = m31Var.K;
        int iD2 = u21Var2.f.d();
        int iE = u21Var.e() + iD;
        int iE2 = iD2 - u21Var2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = m31Var.q();
        int i2 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i2 = (iD - iD2) - iQ;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iD;
        int i4 = i3 + iQ;
        if (iD > iD2) {
            i4 = i3 - iQ;
        }
        m31Var.J(i3, i4);
        R(i + 1, e30Var, m31Var, z);
    }

    public static final void g(String str, kx4 kx4Var, lp2 lp2Var, int i) {
        str.getClass();
        zc1.g(str, kx4Var, o88.a(((ds) lp2Var.j(es.a)).d, ((dp) lp2Var.j(ep.z)).c.c, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var, i & WebSocketProtocol.PAYLOAD_SHORT, 504);
    }

    public static void g0(int i, m31 m31Var, e30 e30Var, m31 m31Var2, boolean z) {
        float f = m31Var2.d0;
        u21 u21Var = m31Var2.I;
        int iE = u21Var.e() + u21Var.f.d();
        u21 u21Var2 = m31Var2.K;
        int iD = u21Var2.f.d() - u21Var2.e();
        if (iD >= iE) {
            int iQ = m31Var2.q();
            if (m31Var2.g0 != 8) {
                int i2 = m31Var2.r;
                if (i2 == 2) {
                    iQ = (int) (m31Var2.d0 * 0.5f * (m31Var instanceof n31 ? m31Var.q() : m31Var.T.q()));
                } else if (i2 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(m31Var2.u, iQ);
                int i3 = m31Var2.v;
                if (i3 > 0) {
                    iQ = Math.min(i3, iQ);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iQ)) + 0.5f));
            m31Var2.J(i4, iQ + i4);
            R(i + 1, e30Var, m31Var2, z);
        }
    }

    public static void h0(int i, e30 e30Var, m31 m31Var) {
        float f = m31Var.e0;
        u21 u21Var = m31Var.J;
        int iD = u21Var.f.d();
        u21 u21Var2 = m31Var.L;
        int iD2 = u21Var2.f.d();
        int iE = u21Var.e() + iD;
        int iE2 = iD2 - u21Var2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = m31Var.k();
        int i2 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i2 = (iD - iD2) - iK;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iD + i3;
        int i5 = i4 + iK;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iK;
        }
        m31Var.K(i4, i5);
        x0(i + 1, e30Var, m31Var);
    }

    public static h92 i(oi5 oi5Var, s92 s92Var, String str, q76 q76Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            q76Var = null;
        }
        return new h92(oi5Var, s92Var, str, q76Var);
    }

    public static void i0(int i, m31 m31Var, e30 e30Var, m31 m31Var2) {
        float f = m31Var2.e0;
        u21 u21Var = m31Var2.J;
        int iE = u21Var.e() + u21Var.f.d();
        u21 u21Var2 = m31Var2.L;
        int iD = u21Var2.f.d() - u21Var2.e();
        if (iD >= iE) {
            int iK = m31Var2.k();
            if (m31Var2.g0 != 8) {
                int i2 = m31Var2.s;
                if (i2 == 2) {
                    iK = (int) (f * 0.5f * (m31Var instanceof n31 ? m31Var.k() : m31Var.T.k()));
                } else if (i2 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(m31Var2.x, iK);
                int i3 = m31Var2.y;
                if (i3 > 0) {
                    iK = Math.min(i3, iK);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iK)) + 0.5f));
            m31Var2.K(i4, iK + i4);
            x0(i + 1, e30Var, m31Var2);
        }
    }

    public static me7 j(ba0 ba0Var, s92 s92Var) {
        return new me7(ba0Var, s92Var, null);
    }

    public static final String j0(int i, lp2 lp2Var) {
        return ((Resources) lp2Var.j(pc.c)).getString(i);
    }

    public static final void k(final Object obj, final int i, final m64 m64Var, final zy0 zy0Var, lp2 lp2Var, final int i2) {
        int i3;
        lp2Var.X(872548579);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.h(m64Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= lp2Var.h(zy0Var) ? 2048 : 1024;
        }
        if (lp2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zF = lp2Var.f(obj) | lp2Var.f(m64Var);
            Object objK = lp2Var.K();
            Object obj2 = zz0.a;
            if (zF || objK == obj2) {
                objK = new k64(obj, m64Var);
                lp2Var.g0(objK);
            }
            k64 k64Var = (k64) objK;
            k64Var.c = i;
            rh5 rh5Var = k64Var.g;
            q06 q06Var = zn5.a;
            k64 k64Var2 = (k64) lp2Var.j(q06Var);
            dd7 dd7VarD = yn0.D();
            gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
            dd7 dd7VarP = yn0.P(dd7VarD);
            try {
                if (k64Var2 != ((k64) rh5Var.getValue())) {
                    rh5Var.setValue(k64Var2);
                    if (k64Var.d > 0) {
                        k64 k64Var3 = k64Var.e;
                        if (k64Var3 != null) {
                            k64Var3.b();
                        }
                        if (k64Var2 != null) {
                            k64Var2.a();
                        } else {
                            k64Var2 = null;
                        }
                        k64Var.e = k64Var2;
                    }
                }
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                boolean zF2 = lp2Var.f(k64Var);
                Object objK2 = lp2Var.K();
                if (zF2 || objK2 == obj2) {
                    objK2 = new vj2((Object) k64Var, (byte) 11);
                    lp2Var.g0(objK2);
                }
                u70.a(k64Var, (gn2) objK2, lp2Var);
                mb6.a(q06Var.a(k64Var), zy0Var, lp2Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                throw th;
            }
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: l64
                @Override // defpackage.rn2
                public final Object K(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    vj8.k(obj, i, m64Var, zy0Var, (lp2) obj3, w79.P(i2 | 1));
                    return dn8.a;
                }
            };
        }
    }

    public static final int k0(uz4 uz4Var) {
        int iC;
        int i = uz4Var.b;
        int iC2 = uz4Var.c(0);
        while (uz4Var.b != 0 && uz4Var.c(0) == iC2) {
            int i2 = uz4Var.b;
            if (i2 == 0) {
                em7.g("IntList is empty.");
                return 0;
            }
            uz4Var.e(0, uz4Var.a[i2 - 1]);
            uz4Var.d(uz4Var.b - 1);
            int i3 = uz4Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iC3 = uz4Var.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iC4 = uz4Var.c(i7);
                if (i6 < i3 && (iC = uz4Var.c(i6)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    uz4Var.e(i5, iC);
                    uz4Var.e(i6, iC3);
                    i5 = i6;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    uz4Var.e(i5, iC4);
                    uz4Var.e(i7, iC3);
                    i5 = i7;
                }
            }
        }
        return iC2;
    }

    public static final void l(uz4 uz4Var, int i) {
        if (uz4Var.b == 0 || !(uz4Var.c(0) == i || uz4Var.c(uz4Var.b - 1) == i)) {
            int i2 = uz4Var.b;
            uz4Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = uz4Var.c(i3);
                if (i <= iC) {
                    break;
                }
                uz4Var.e(i2, iC);
                i2 = i3;
            }
            uz4Var.e(i2, i);
        }
    }

    public static final long l0(int i, lx1 lx1Var) {
        if (lx1Var.compareTo(lx1.SECONDS) > 0) {
            return m0(i, lx1Var);
        }
        return B(TimeUnit.NANOSECONDS.convert(i, lx1Var.X));
    }

    public static final long m(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : x97.p(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final long m0(long j, lx1 lx1Var) {
        TimeUnit timeUnit = lx1Var.X;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            return B(timeUnit2.convert(j, timeUnit));
        }
        if (lx1Var.compareTo(lx1.MILLISECONDS) < 0) {
            return A(x97.p(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return A(w39.o(Math.abs(j), lx1Var) * jSignum);
    }

    public static void n(StringBuilder sb, String str, Map map) {
        String strValueOf;
        if (map.isEmpty()) {
            sb.append(str.concat(": (None)\n"));
            return;
        }
        sb.append(str.concat("\n"));
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            byte b = 10;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (key instanceof CameraCharacteristics.Key) {
                strValueOf = ((CameraCharacteristics.Key) key).getName();
                strValueOf.getClass();
            } else if (key instanceof CaptureRequest.Key) {
                strValueOf = ((CaptureRequest.Key) key).getName();
                strValueOf.getClass();
            } else if (key instanceof CaptureResult.Key) {
                strValueOf = ((CaptureResult.Key) key).getName();
                strValueOf.getClass();
            } else {
                strValueOf = String.valueOf(key);
            }
            Object value = entry.getValue();
            arrayList.add(new qg5(strValueOf, value instanceof Object[] ? eu.x0((Object[]) value, null, "[", "]", new h80(b), 25) : String.valueOf(value)));
        }
        for (qg5 qg5Var : wv0.S0(arrayList, new l71((byte) 13))) {
            sb.append("  " + fm7.t0(50, (String) qg5Var.X) + ' ' + ((String) qg5Var.Y) + '\n');
        }
    }

    /* JADX WARN: Code duplicated, block: B:97:0x02c7  */
    public static yy3 n0(fy5 fy5Var, w15 w15Var, boolean z, int i) {
        boolean z2 = false;
        boolean z3 = (i & 2) != 0 ? false : z;
        fy5Var.getClass();
        w15Var.getClass();
        yy3 yy3Var = new yy3();
        tz5 tz5Var = fy5Var.C0;
        tz5Var.getClass();
        ux4 ux4Var = new ux4(tz5Var);
        dv8 dv8Var = dv8.b;
        a06 a06Var = fy5Var.E0;
        a06Var.getClass();
        rm1 rm1Var = new rm1(w15Var, ux4Var, z38.b(a06Var), z3, d02.X, 16);
        List list = fy5Var.i0;
        list.getClass();
        rm1 rm1VarD = rm1Var.d(list);
        w15 w15Var2 = (w15) rm1VarD.b;
        List list2 = (List) rm1VarD.h;
        ux4 ux4Var2 = (ux4) rm1VarD.c;
        yy3Var.a = fy5Var.f0;
        yy3Var.b = ci8.q(w15Var2, fy5Var.g0);
        List<sz5> list3 = fy5Var.i0;
        list3.getClass();
        for (sz5 sz5Var : list3) {
            sz5Var.getClass();
            yy3Var.c.add(t0(sz5Var, rm1VarD));
        }
        Iterator it = vr3.a0(fy5Var, ux4Var2).iterator();
        while (it.hasNext()) {
            yy3Var.d.add(s0((nz5) it.next(), rm1VarD));
        }
        List list4 = fy5Var.r0;
        list4.getClass();
        Iterator it2 = list4.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            iy5 iy5Var = (iy5) it2.next();
            iy5Var.getClass();
            cz3 cz3Var = new cz3(iy5Var.f0);
            List<vz5> list5 = iy5Var.g0;
            list5.getClass();
            for (vz5 vz5Var : list5) {
                vz5Var.getClass();
                cz3Var.b.add(u0(vz5Var, rm1VarD));
            }
            List<Integer> list6 = iy5Var.h0;
            list6.getClass();
            for (Integer num : list6) {
                num.getClass();
                cz3Var.c.add(d0(num.intValue(), rm1VarD));
            }
            List<gy5> list7 = iy5Var.i0;
            list7.getClass();
            for (gy5 gy5Var : list7) {
                cz3Var.d.put(w15Var2.getString(gy5Var.Z), gy5Var.f0.o());
            }
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((nt3) ((bv4) it3.next())).getClass();
                at3 at3VarD = ch3.D(cz3Var);
                List<cy5> list8 = iy5Var.j0;
                list8.getClass();
                for (cy5 cy5Var : list8) {
                    cy5Var.getClass();
                    cz3Var.e.add(ci8.J(cy5Var, w15Var2));
                }
                r62 r62Var = mu3.a;
                lt3 lt3VarA = mu3.a(iy5Var, w15Var2, ux4Var2);
                at3VarD.a = lt3VarA != null ? new pt3(lt3VarA.l, lt3VarA.m) : null;
            }
            yy3Var.h.add(cz3Var);
        }
        List list9 = fy5Var.s0;
        list9.getClass();
        List list10 = fy5Var.t0;
        list10.getClass();
        List list11 = fy5Var.u0;
        list11.getClass();
        y0(yy3Var, list9, list10, list11, rm1VarD);
        if ((fy5Var.Z & 4) == 4) {
            w15Var2.getString(fy5Var.h0);
        }
        List<Integer> list12 = fy5Var.m0;
        list12.getClass();
        for (Integer num2 : list12) {
            num2.getClass();
            yy3Var.i.add(w15Var2.getString(num2.intValue()));
        }
        for (qy5 qy5Var : fy5Var.v0) {
            if ((qy5Var.Z & 1) != 1) {
                throw new ib3("No name for EnumEntry", null);
            }
            yy3Var.j.add(w15Var2.getString(qy5Var.f0));
            lo2 lo2Var = new lo2(w15Var2.getString(qy5Var.f0));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                ((nt3) ((bv4) it4.next())).getClass();
                for (cy5 cy5Var2 : qy5Var.g0) {
                    cy5Var2.getClass();
                    lo2Var.c.add(ci8.J(cy5Var2, w15Var2));
                }
            }
            yy3Var.k.add(lo2Var);
        }
        List<Integer> list13 = fy5Var.w0;
        list13.getClass();
        for (Integer num3 : list13) {
            num3.getClass();
            yy3Var.l.add(ci8.q(w15Var2, num3.intValue()));
        }
        if ((fy5Var.Z & 8) == 8) {
            yy3Var.m = w15Var2.getString(fy5Var.y0);
        }
        int i2 = fy5Var.Z;
        nz5 nz5VarA = (i2 & 16) == 16 ? fy5Var.z0 : (i2 & 32) == 32 ? ux4Var2.a(fy5Var.A0) : null;
        if (nz5VarA == null) {
            if ((fy5Var.Z & 8) == 8) {
                List list14 = fy5Var.t0;
                list14.getClass();
                Iterator it5 = list14.iterator();
                Object obj = null;
                while (true) {
                    if (!it5.hasNext()) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Object next = it5.next();
                    cz5 cz5Var = (cz5) next;
                    cz5Var.getClass();
                    if (vr3.V(cz5Var, ux4Var2) == null && w15Var2.getString(cz5Var.h0).equals(w15Var2.getString(fy5Var.y0))) {
                        if (!z2) {
                            z2 = true;
                            obj = next;
                        }
                    }
                    obj = null;
                    break;
                }
                cz5 cz5Var2 = (cz5) obj;
                if (cz5Var2 != null) {
                    nz5VarA = vr3.Y(cz5Var2, ux4Var2);
                } else {
                    nz5VarA = null;
                }
            } else {
                nz5VarA = null;
            }
        }
        yy3Var.n = nz5VarA != null ? s0(nz5VarA, rm1VarD) : null;
        Iterator it6 = vr3.p(fy5Var, ux4Var2).iterator();
        while (it6.hasNext()) {
            yy3Var.p.add(s0((nz5) it6.next(), rm1VarD));
        }
        List<Integer> list15 = fy5Var.D0;
        list15.getClass();
        for (Integer num4 : list15) {
            num4.getClass();
            yy3Var.q.add(d0(num4.intValue(), rm1VarD));
        }
        List<gy5> list16 = fy5Var.F0;
        list16.getClass();
        for (gy5 gy5Var2 : list16) {
            yy3Var.r.put(w15Var2.getString(gy5Var2.Z), gy5Var2.f0.o());
        }
        Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            ((nt3) ((bv4) it7.next())).getClass();
            ys3 ys3VarC = ch3.C(yy3Var);
            List<cy5> list17 = fy5Var.B0;
            list17.getClass();
            for (cy5 cy5Var3 : list17) {
                cy5Var3.getClass();
                yy3Var.o.add(ci8.J(cy5Var3, w15Var2));
            }
            aq2 aq2Var = lu3.i;
            aq2Var.getClass();
            Integer num5 = (Integer) ch3.y(fy5Var, aq2Var);
            if (num5 != null) {
                w15Var2.getString(num5.intValue());
            }
            for (cz5 cz5Var3 : (List) fy5Var.k(lu3.h)) {
                ArrayList arrayList = ys3VarC.a;
                cz5Var3.getClass();
                arrayList.add(r0(cz5Var3, rm1VarD));
            }
            aq2 aq2Var2 = lu3.g;
            aq2Var2.getClass();
            Integer num6 = (Integer) ch3.y(fy5Var, aq2Var2);
            ys3VarC.b = num6 != null ? w15Var2.getString(num6.intValue()) : "main";
            aq2 aq2Var3 = lu3.j;
            aq2Var3.getClass();
        }
        return yy3Var;
    }

    public static IOException o(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static final zz2 o0(ty5 ty5Var, rm1 rm1Var) {
        zz2 zz2Var = new zz2((byte) 6);
        int i = ty5Var.Z;
        nz5 nz5VarA = null;
        if ((ty5Var.Y & 4) == 4) {
            sy5 sy5Var = ty5Var.g0;
            if (sy5Var == null) {
                bt.q("Required value was null.");
                return null;
            }
            int iOrdinal = sy5Var.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                b61.c();
                return null;
            }
        }
        ux4 ux4Var = (ux4) rm1Var.c;
        ux4Var.getClass();
        int i2 = ty5Var.Y;
        if ((i2 & 8) == 8) {
            nz5VarA = ty5Var.h0;
        } else if ((i2 & 16) == 16) {
            nz5VarA = ux4Var.a(ty5Var.i0);
        }
        if (nz5VarA != null) {
            s0(nz5VarA, rm1Var);
        }
        List<ty5> list = ty5Var.j0;
        list.getClass();
        ArrayList arrayList = (ArrayList) zz2Var.Y;
        for (ty5 ty5Var2 : list) {
            ty5Var2.getClass();
            arrayList.add(o0(ty5Var2, rm1Var));
        }
        List<ty5> list2 = ty5Var.k0;
        list2.getClass();
        ArrayList arrayList2 = (ArrayList) zz2Var.Z;
        for (ty5 ty5Var3 : list2) {
            ty5Var3.getClass();
            arrayList2.add(o0(ty5Var3, rm1Var));
        }
        return zz2Var;
    }

    public static IOException p(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return o(file, iOException);
        }
        if (!parentFile.exists()) {
            return o(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? o(file, iOException) : o(file, iOException);
            }
            return parentFile.canWrite() ? o(file, iOException) : o(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? o(file, iOException) : o(file, iOException);
        }
        return parentFile.canWrite() ? o(file, iOException) : o(file, iOException);
    }

    public static final iz3 p0(vy5 vy5Var, rm1 rm1Var) {
        ArrayList arrayList;
        ez3 ez3Var;
        iz3 iz3Var = new iz3(vy5Var.f0, ((w15) rm1Var.b).getString(vy5Var.h0));
        List list = vy5Var.k0;
        list.getClass();
        rm1 rm1VarD = rm1Var.d(list);
        w15 w15Var = (w15) rm1VarD.b;
        ux4 ux4Var = (ux4) rm1VarD.c;
        List<sz5> list2 = vy5Var.k0;
        list2.getClass();
        for (sz5 sz5Var : list2) {
            sz5Var.getClass();
            iz3Var.c.add(t0(sz5Var, rm1VarD));
        }
        nz5 nz5VarU = vr3.U(vy5Var, ux4Var);
        iz3Var.d = nz5VarU != null ? s0(nz5VarU, rm1VarD) : null;
        List list3 = vy5Var.q0;
        list3.getClass();
        Iterator it = list3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = iz3Var.g;
            if (!zHasNext) {
                break;
            }
            vz5 vz5Var = (vz5) it.next();
            vz5Var.getClass();
            arrayList.add(u0(vz5Var, rm1VarD));
        }
        if (vy5Var.q0.isEmpty()) {
            List list4 = vy5Var.n0;
            list4.getClass();
            if (!list4.isEmpty()) {
                Iterator it2 = vr3.q(vy5Var, ux4Var).iterator();
                while (it2.hasNext()) {
                    mz3 mz3VarS0 = s0((nz5) it2.next(), rm1VarD);
                    qz3 qz3Var = new qz3(0, "_");
                    qz3Var.c = mz3VarS0;
                    arrayList.add(qz3Var);
                }
            }
        }
        List<vz5> list5 = vy5Var.r0;
        list5.getClass();
        for (vz5 vz5Var2 : list5) {
            vz5Var2.getClass();
            iz3Var.f.add(u0(vz5Var2, rm1VarD));
        }
        iz3Var.h = s0(vr3.X(vy5Var, ux4Var), rm1VarD);
        if ((vy5Var.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            ky5 ky5Var = vy5Var.u0;
            ky5Var.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            for (oy5 oy5Var : ky5Var.Y) {
                if ((oy5Var.Y & 1) == 1) {
                    my5 my5Var = oy5Var.Z;
                    if (my5Var == null) {
                        bt.q("Required value was null.");
                        return null;
                    }
                    int iOrdinal = my5Var.ordinal();
                    if (iOrdinal == 0) {
                        ez3Var = ez3.X;
                    } else if (iOrdinal == 1) {
                        ez3Var = ez3.Y;
                    } else if (iOrdinal == 2) {
                        ez3Var = ez3.Z;
                    } else {
                        if (iOrdinal != 3) {
                            b61.c();
                            return null;
                        }
                        ez3Var = ez3.f0;
                    }
                    if ((oy5Var.Y & 4) == 4) {
                        ny5 ny5Var = oy5Var.h0;
                        if (ny5Var == null) {
                            bt.q("Required value was null.");
                            return null;
                        }
                        int iOrdinal2 = ny5Var.ordinal();
                        if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
                            b61.c();
                            return null;
                        }
                    }
                    cc0 cc0Var = new cc0(ez3Var);
                    List<ty5> list6 = oy5Var.f0;
                    list6.getClass();
                    ArrayList arrayList3 = cc0Var.b;
                    for (ty5 ty5Var : list6) {
                        ty5Var.getClass();
                        arrayList3.add(o0(ty5Var, rm1VarD));
                    }
                    if ((oy5Var.Y & 2) == 2) {
                        ty5 ty5Var2 = oy5Var.g0;
                        ty5Var2.getClass();
                        o0(ty5Var2, rm1VarD);
                    }
                    arrayList2.add(cc0Var);
                }
            }
        }
        List<Integer> list7 = vy5Var.t0;
        list7.getClass();
        for (Integer num : list7) {
            num.getClass();
            iz3Var.i.add(d0(num.intValue(), rm1VarD));
        }
        List<gy5> list8 = vy5Var.v0;
        list8.getClass();
        for (gy5 gy5Var : list8) {
            iz3Var.j.put(w15Var.getString(gy5Var.Z), gy5Var.f0.o());
        }
        Iterator it3 = ((List) rm1VarD.h).iterator();
        while (it3.hasNext()) {
            ((nt3) ((bv4) it3.next())).getClass();
            et3 et3VarE = ch3.E(iz3Var);
            List<cy5> list9 = vy5Var.w0;
            list9.getClass();
            for (cy5 cy5Var : list9) {
                cy5Var.getClass();
                iz3Var.k.add(ci8.J(cy5Var, w15Var));
            }
            List<cy5> list10 = vy5Var.x0;
            list10.getClass();
            for (cy5 cy5Var2 : list10) {
                cy5Var2.getClass();
                iz3Var.e.add(ci8.J(cy5Var2, w15Var));
            }
            r62 r62Var = mu3.a;
            lt3 lt3VarC = mu3.c(vy5Var, w15Var, ux4Var);
            et3VarE.a = lt3VarC != null ? new pt3(lt3VarC.l, lt3VarC.m) : null;
            aq2 aq2Var = lu3.c;
            aq2Var.getClass();
            Integer num2 = (Integer) ch3.y(vy5Var, aq2Var);
            if (num2 != null) {
                w15Var.getString(num2.intValue());
            }
        }
        return iz3Var;
    }

    public static boolean q(m31 m31Var) {
        int[] iArr = m31Var.p0;
        int i = iArr[0];
        int i2 = iArr[1];
        n31 n31Var = m31Var.T;
        if (n31Var == null) {
            n31Var = null;
        }
        if (n31Var != null) {
            int i3 = n31Var.p0[0];
        }
        if (n31Var != null) {
            int i4 = n31Var.p0[1];
        }
        boolean z = i == 1 || m31Var.A() || i == 2 || (i == 3 && m31Var.r == 0 && m31Var.W == 0.0f && m31Var.t(0)) || (i == 3 && m31Var.r == 1 && m31Var.u(0, m31Var.q()));
        boolean z2 = i2 == 1 || m31Var.B() || i2 == 2 || (i2 == 3 && m31Var.s == 0 && m31Var.W == 0.0f && m31Var.t(1)) || (i2 == 3 && m31Var.s == 1 && m31Var.u(1, m31Var.k()));
        return (m31Var.W > 0.0f && (z || z2)) || (z && z2);
    }

    public static jz3 q0(zy5 zy5Var, w15 w15Var, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        zy5Var.getClass();
        w15Var.getClass();
        jz3 jz3Var = new jz3();
        tz5 tz5Var = zy5Var.i0;
        tz5Var.getClass();
        ux4 ux4Var = new ux4(tz5Var);
        dv8 dv8Var = dv8.b;
        a06 a06Var = zy5Var.j0;
        a06Var.getClass();
        rm1 rm1Var = new rm1(w15Var, ux4Var, z38.b(a06Var), z2, d02.X, 16);
        List list = zy5Var.f0;
        list.getClass();
        List list2 = zy5Var.g0;
        list2.getClass();
        List list3 = zy5Var.h0;
        list3.getClass();
        y0(jz3Var, list, list2, list3, rm1Var);
        Iterator it = ((List) rm1Var.h).iterator();
        while (it.hasNext()) {
            ((nt3) ((bv4) it.next())).getClass();
            gz3 gz3Var = rt3.b;
            gz3Var.getClass();
            rt3 rt3Var = (rt3) jb5.N(jz3Var.d, gz3Var);
            for (cz5 cz5Var : (List) zy5Var.k(lu3.l)) {
                ArrayList arrayList = rt3Var.a;
                cz5Var.getClass();
                arrayList.add(r0(cz5Var, rm1Var));
            }
            aq2 aq2Var = lu3.k;
            aq2Var.getClass();
            Integer num = (Integer) ch3.y(zy5Var, aq2Var);
            if (num != null) {
                ((w15) rm1Var.b).getString(num.intValue());
            }
        }
        return jz3Var;
    }

    public static final kz3 r0(cz5 cz5Var, rm1 rm1Var) {
        ArrayList arrayList;
        cz5Var.getClass();
        kz3 kz3Var = new kz3(((w15) rm1Var.b).getString(cz5Var.h0), cz5Var.f0, (cz5Var.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? cz5Var.s0 : I(cz5Var.f0), (cz5Var.Z & 512) == 512 ? cz5Var.t0 : I(cz5Var.f0));
        List list = cz5Var.k0;
        list.getClass();
        rm1 rm1VarD = rm1Var.d(list);
        w15 w15Var = (w15) rm1VarD.b;
        ux4 ux4Var = (ux4) rm1VarD.c;
        List<sz5> list2 = cz5Var.k0;
        list2.getClass();
        for (sz5 sz5Var : list2) {
            sz5Var.getClass();
            kz3Var.e.add(t0(sz5Var, rm1VarD));
        }
        nz5 nz5VarV = vr3.V(cz5Var, ux4Var);
        kz3Var.f = nz5VarV != null ? s0(nz5VarV, rm1VarD) : null;
        List list3 = cz5Var.q0;
        list3.getClass();
        Iterator it = list3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = kz3Var.h;
            if (!zHasNext) {
                break;
            }
            vz5 vz5Var = (vz5) it.next();
            vz5Var.getClass();
            arrayList.add(u0(vz5Var, rm1VarD));
        }
        if (cz5Var.q0.isEmpty()) {
            List list4 = cz5Var.n0;
            list4.getClass();
            if (!list4.isEmpty()) {
                Iterator it2 = vr3.r(cz5Var, ux4Var).iterator();
                while (it2.hasNext()) {
                    mz3 mz3VarS0 = s0((nz5) it2.next(), rm1VarD);
                    qz3 qz3Var = new qz3(0, "_");
                    qz3Var.c = mz3VarS0;
                    arrayList.add(qz3Var);
                }
            }
        }
        if ((cz5Var.Z & 128) == 128) {
            vz5 vz5Var2 = cz5Var.r0;
            vz5Var2.getClass();
            kz3Var.i = u0(vz5Var2, rm1VarD);
        }
        kz3Var.j = s0(vr3.Y(cz5Var, ux4Var), rm1VarD);
        List<Integer> list5 = cz5Var.u0;
        list5.getClass();
        for (Integer num : list5) {
            num.getClass();
            kz3Var.k.add(d0(num.intValue(), rm1VarD));
        }
        List<gy5> list6 = cz5Var.v0;
        list6.getClass();
        for (gy5 gy5Var : list6) {
            kz3Var.l.put(w15Var.getString(gy5Var.Z), gy5Var.f0.o());
        }
        Iterator it3 = ((List) rm1VarD.h).iterator();
        while (it3.hasNext()) {
            ((nt3) ((bv4) it3.next())).getClass();
            vt3 vt3VarF = ch3.F(kz3Var);
            List<cy5> list7 = cz5Var.w0;
            list7.getClass();
            for (cy5 cy5Var : list7) {
                cy5Var.getClass();
                kz3Var.m.add(ci8.J(cy5Var, w15Var));
            }
            List<cy5> list8 = cz5Var.x0;
            list8.getClass();
            ArrayList arrayList2 = kz3Var.c.b;
            for (cy5 cy5Var2 : list8) {
                cy5Var2.getClass();
                arrayList2.add(ci8.J(cy5Var2, w15Var));
            }
            lz3 lz3Var = kz3Var.d;
            if (lz3Var != null) {
                List<cy5> list9 = cz5Var.y0;
                list9.getClass();
                ArrayList arrayList3 = lz3Var.b;
                for (cy5 cy5Var3 : list9) {
                    cy5Var3.getClass();
                    arrayList3.add(ci8.J(cy5Var3, w15Var));
                }
            }
            List<cy5> list10 = cz5Var.z0;
            list10.getClass();
            for (cy5 cy5Var4 : list10) {
                cy5Var4.getClass();
                kz3Var.g.add(ci8.J(cy5Var4, w15Var));
            }
            List<cy5> list11 = cz5Var.A0;
            list11.getClass();
            for (cy5 cy5Var5 : list11) {
                cy5Var5.getClass();
                kz3Var.n.add(ci8.J(cy5Var5, w15Var));
            }
            List<cy5> list12 = cz5Var.B0;
            list12.getClass();
            for (cy5 cy5Var6 : list12) {
                cy5Var6.getClass();
                kz3Var.o.add(ci8.J(cy5Var6, w15Var));
            }
            r62 r62Var = mu3.a;
            kt3 kt3VarB = mu3.b(cz5Var, w15Var, ux4Var, true);
            aq2 aq2Var = lu3.d;
            aq2Var.getClass();
            fu3 fu3Var = (fu3) ch3.y(cz5Var, aq2Var);
            du3 du3Var = (fu3Var == null || !fu3Var.i()) ? null : fu3Var.g0;
            du3 du3Var2 = (fu3Var == null || (fu3Var.Y & 8) != 8) ? null : fu3Var.h0;
            Object objK = cz5Var.k(lu3.e);
            objK.getClass();
            vt3VarF.a = ((Number) objK).intValue();
            vt3VarF.b = kt3VarB != null ? new bt3(kt3VarB.l, kt3VarB.m) : null;
            vt3VarF.c = du3Var != null ? new pt3(w15Var.getString(du3Var.Z), w15Var.getString(du3Var.f0)) : null;
            vt3VarF.d = du3Var2 != null ? new pt3(w15Var.getString(du3Var2.Z), w15Var.getString(du3Var2.f0)) : null;
            du3 du3Var3 = (fu3Var == null || (fu3Var.Y & 2) != 2) ? null : fu3Var.f0;
            vt3VarF.e = du3Var3 != null ? new pt3(w15Var.getString(du3Var3.Z), w15Var.getString(du3Var3.f0)) : null;
            du3 du3Var4 = (fu3Var == null || (fu3Var.Y & 16) != 16) ? null : fu3Var.i0;
            vt3VarF.f = du3Var4 != null ? new pt3(w15Var.getString(du3Var4.Z), w15Var.getString(du3Var4.f0)) : null;
        }
        return kz3Var;
    }

    public static final mz3 s0(nz5 nz5Var, rm1 rm1Var) {
        i21 bz3Var;
        rz3 rz3Var;
        ux4 ux4Var = (ux4) rm1Var.c;
        w15 w15Var = (w15) rm1Var.b;
        mz3 mz3Var = new mz3((nz5Var.g0 ? 1 : 0) + (nz5Var.s0 << 1));
        hz3 hz3Var = null;
        if (nz5Var.p()) {
            bz3Var = new zy3(ci8.q(w15Var, nz5Var.k0));
        } else {
            int i = nz5Var.Z;
            if ((i & 128) == 128) {
                bz3Var = new az3(ci8.q(w15Var, nz5Var.n0));
            } else if ((i & 32) == 32) {
                bz3Var = new bz3(nz5Var.l0);
            } else {
                if ((i & 64) != 64) {
                    throw new ib3("No classifier (class, type alias or type parameter) recorded for Type", null);
                }
                Integer numA = rm1Var.a(nz5Var.m0);
                if (numA == null) {
                    throw new ib3("No type parameter id for ".concat(w15Var.getString(nz5Var.m0)), null);
                }
                bz3Var = new bz3(numA.intValue());
            }
        }
        mz3Var.b = bz3Var;
        for (lz5 lz5Var : nz5Var.f0) {
            kz5 kz5Var = lz5Var.Z;
            if (kz5Var == null) {
                bt.q("Required value was null.");
                return null;
            }
            int iOrdinal = kz5Var.ordinal();
            if (iOrdinal == 0) {
                rz3Var = rz3.Y;
            } else if (iOrdinal == 1) {
                rz3Var = rz3.Z;
            } else if (iOrdinal == 2) {
                rz3Var = rz3.X;
            } else {
                if (iOrdinal != 3) {
                    b61.c();
                    return null;
                }
                rz3Var = null;
            }
            ArrayList arrayList = mz3Var.c;
            if (rz3Var != null) {
                ux4Var.getClass();
                int i2 = lz5Var.Y;
                nz5 nz5VarA = (i2 & 2) == 2 ? lz5Var.f0 : (i2 & 4) == 4 ? ux4Var.a(lz5Var.g0) : null;
                if (nz5VarA == null) {
                    throw new ib3("No type argument for non-STAR projection in Type", null);
                }
                arrayList.add(new pz3(rz3Var, s0(nz5VarA, rm1Var)));
            } else {
                arrayList.add(pz3.c);
            }
        }
        ux4Var.getClass();
        int i3 = nz5Var.Z;
        nz5 nz5VarA2 = (i3 & 1024) == 1024 ? nz5Var.q0 : (i3 & 2048) == 2048 ? ux4Var.a(nz5Var.r0) : null;
        mz3Var.d = nz5VarA2 != null ? s0(nz5VarA2, rm1Var) : null;
        nz5 nz5VarR = vr3.R(nz5Var, ux4Var);
        mz3Var.e = nz5VarR != null ? s0(nz5VarR, rm1Var) : null;
        int i4 = nz5Var.Z;
        nz5 nz5VarA3 = (i4 & 4) == 4 ? nz5Var.i0 : (i4 & 8) == 8 ? ux4Var.a(nz5Var.j0) : null;
        if (nz5VarA3 != null) {
            mz3 mz3VarS0 = s0(nz5VarA3, rm1Var);
            String string = (nz5Var.Z & 2) == 2 ? w15Var.getString(nz5Var.h0) : null;
            hz3 hz3Var2 = new hz3();
            hz3Var2.a = mz3VarS0;
            hz3Var2.b = string;
            hz3Var = hz3Var2;
        }
        mz3Var.f = hz3Var;
        Iterator it = ((List) rm1Var.h).iterator();
        while (it.hasNext()) {
            ((nt3) ((bv4) it.next())).getClass();
            gz3 gz3Var = tu3.c;
            gz3Var.getClass();
            tu3 tu3Var = (tu3) jb5.N(mz3Var.g, gz3Var);
            Object objK = nz5Var.k(lu3.f);
            objK.getClass();
            tu3Var.a = ((Boolean) objK).booleanValue();
            for (cy5 cy5Var : nz5Var.t0) {
                ArrayList arrayList2 = tu3Var.b;
                cy5Var.getClass();
                arrayList2.add(ci8.J(cy5Var, w15Var));
            }
        }
        return mz3Var;
    }

    public static final oz3 t0(sz5 sz5Var, rm1 rm1Var) {
        rz3 rz3Var;
        w15 w15Var = (w15) rm1Var.b;
        rz5 rz5Var = sz5Var.i0;
        if (rz5Var == null) {
            bt.q("Required value was null.");
            return null;
        }
        int iOrdinal = rz5Var.ordinal();
        if (iOrdinal == 0) {
            rz3Var = rz3.Y;
        } else if (iOrdinal == 1) {
            rz3Var = rz3.Z;
        } else {
            if (iOrdinal != 2) {
                b61.c();
                return null;
            }
            rz3Var = rz3.X;
        }
        boolean z = sz5Var.h0;
        oz3 oz3Var = new oz3(z ? 1 : 0, w15Var.getString(sz5Var.g0), sz5Var.f0, rz3Var);
        Iterator it = vr3.j0(sz5Var, (ux4) rm1Var.c).iterator();
        while (it.hasNext()) {
            oz3Var.e.add(s0((nz5) it.next(), rm1Var));
        }
        Iterator it2 = ((List) rm1Var.h).iterator();
        while (it2.hasNext()) {
            ((nt3) ((bv4) it2.next())).getClass();
            gz3 gz3Var = uu3.b;
            gz3Var.getClass();
            uu3 uu3Var = (uu3) jb5.N(oz3Var.f, gz3Var);
            for (cy5 cy5Var : sz5Var.m0) {
                ArrayList arrayList = uu3Var.a;
                cy5Var.getClass();
                arrayList.add(ci8.J(cy5Var, w15Var));
            }
        }
        return oz3Var;
    }

    public static final void u(wf5 wf5Var, fk2 fk2Var, ArrayList arrayList) {
        wf5Var.getClass();
        fk2Var.getClass();
        wf5Var.b(fk2Var, arrayList);
    }

    public static final qz3 u0(vz5 vz5Var, rm1 rm1Var) {
        int i = vz5Var.f0;
        int i2 = vz5Var.g0;
        w15 w15Var = (w15) rm1Var.b;
        qz3 qz3Var = new qz3(i, w15Var.getString(i2));
        ux4 ux4Var = (ux4) rm1Var.c;
        qz3Var.c = s0(vr3.h0(vz5Var, ux4Var), rm1Var);
        int i3 = vz5Var.Z;
        nz5 nz5VarA = (i3 & 16) == 16 ? vz5Var.j0 : (i3 & 32) == 32 ? ux4Var.a(vz5Var.k0) : null;
        qz3Var.d = nz5VarA != null ? s0(nz5VarA, rm1Var) : null;
        if ((vz5Var.Z & 64) == 64) {
            zx5 zx5Var = vz5Var.m0;
            zx5Var.getClass();
            ci8.K(zx5Var, w15Var);
        }
        Iterator it = ((List) rm1Var.h).iterator();
        while (it.hasNext()) {
            ((nt3) ((bv4) it.next())).getClass();
            List<cy5> list = vz5Var.l0;
            list.getClass();
            for (cy5 cy5Var : list) {
                cy5Var.getClass();
                qz3Var.e.add(ci8.J(cy5Var, w15Var));
            }
        }
        return qz3Var;
    }

    public static final Type v(pw3 pw3Var, boolean z) {
        lv3 lv3VarM = pw3Var.M();
        if (lv3VarM instanceof rw3) {
            rw3 rw3Var = (rw3) lv3VarM;
            GenericDeclaration genericDeclaration = (GenericDeclaration) rw3Var.Y.getValue();
            if (genericDeclaration == null) {
                em7.j(pw3Var, "javaType is not supported for this type: ");
                return null;
            }
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            typeParameters.getClass();
            TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (TypeVariable<?> typeVariable2 : typeParameters) {
                if (dh3.f(typeVariable2.getName(), rw3Var.f0)) {
                    if (z2) {
                        bt.q("Array contains more than one matching element.");
                        return null;
                    }
                    z2 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z2) {
                typeVariable.getClass();
                return typeVariable;
            }
            em7.g("Array contains no element matching the predicate.");
            return null;
        }
        if (!(lv3VarM instanceof zu3)) {
            em7.j(pw3Var, "Unsupported type classifier: ");
            return null;
        }
        zu3 zu3Var = (zu3) lv3VarM;
        Class clsN = z ? zc1.N(zu3Var) : zc1.M(zu3Var);
        List listL = pw3Var.L();
        if (listL.isEmpty()) {
            return clsN;
        }
        if (!clsN.isArray()) {
            return w(clsN, listL);
        }
        if (clsN.getComponentType().isPrimitive()) {
            return clsN;
        }
        uw3 uw3Var = (uw3) wv0.Q0(listL);
        if (uw3Var == null) {
            u52.j(pw3Var, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        yw3 yw3Var = uw3Var.a;
        pw3 pw3Var2 = uw3Var.b;
        int i = yw3Var == null ? -1 : tj8.a[yw3Var.ordinal()];
        if (i == -1 || i == 1) {
            return clsN;
        }
        if (i != 2 && i != 3) {
            b61.c();
            return null;
        }
        pw3Var2.getClass();
        Type typeV = v(pw3Var2, false);
        return typeV instanceof Class ? clsN : new gq2(typeV);
    }

    public static final Serializable v0(List list) {
        try {
            ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj = ((sj6) it.next()).X;
                w39.n0(obj);
                arrayList.add(obj);
            }
            return arrayList;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    public static final ch5 w(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(J((uw3) it.next()));
            }
            return new ch5(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(xv0.Z(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(J((uw3) it2.next()));
            }
            return new ch5(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        ch5 ch5VarW = w(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(xv0.Z(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(J((uw3) it3.next()));
        }
        return new ch5(cls, ch5VarW, arrayList3);
    }

    public static final String w0(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        u27 u27VarI0 = w27.i0(type, uj8.X);
        return ((Class) w27.k0(u27VarI0)).getName() + mm7.V(w27.e0(u27VarI0), _UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
    }

    public static final kx4 x(kx4 kx4Var, boolean z, xz4 xz4Var, c cVar, dn2 dn2Var, dn2 dn2Var2, lp2 lp2Var, int i) {
        kx4Var.getClass();
        dn2Var2.getClass();
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            xz4Var = null;
        }
        if ((i & 8) != 0) {
            cVar = hl6.a(0.0f, 3, ((dp) lp2Var.j(ep.z)).a, false);
        }
        c cVar2 = cVar;
        dn2 dn2Var3 = (i & 16) != 0 ? null : dn2Var;
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (objK == beVar) {
            objK = new ph5(0L);
            lp2Var.g0(objK);
        }
        c3 c3Var = new c3((Object) dn2Var2, objK, (byte) 7);
        if (xz4Var == null) {
            lp2Var.W(-393170509);
            Object objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = new xz4();
                lp2Var.g0(objK2);
            }
            xz4Var = (xz4) objK2;
        } else {
            lp2Var.W(-1398156892);
        }
        lp2Var.p(false);
        return x97.s(kx4Var, xz4Var, cVar2, z2, dn2Var3, c3Var, 440);
    }

    public static void x0(int i, e30 e30Var, m31 m31Var) {
        boolean z;
        u21 u21Var;
        u21 u21Var2;
        u21 u21Var3;
        u21 u21Var4;
        if (m31Var.n) {
            return;
        }
        if (!(m31Var instanceof n31) && m31Var.z() && q(m31Var)) {
            n31.V(m31Var, e30Var, new d30());
        }
        u21 u21VarI = m31Var.i(3);
        u21 u21VarI2 = m31Var.i(5);
        int iD = u21VarI.d();
        int iD2 = u21VarI2.d();
        HashSet<u21> hashSet = u21VarI.a;
        if (hashSet != null && u21VarI.c) {
            for (u21 u21Var5 : hashSet) {
                m31 m31Var2 = u21Var5.d;
                int i2 = i + 1;
                boolean zQ = q(m31Var2);
                u21 u21Var6 = m31Var2.J;
                u21 u21Var7 = m31Var2.L;
                if (m31Var2.z() && zQ) {
                    n31.V(m31Var2, e30Var, new d30());
                }
                boolean z2 = (u21Var5 == u21Var6 && (u21Var4 = u21Var7.f) != null && u21Var4.c) || (u21Var5 == u21Var7 && (u21Var3 = u21Var6.f) != null && u21Var3.c);
                int i3 = m31Var2.p0[1];
                if (i3 != 3 || zQ) {
                    if (!m31Var2.z()) {
                        if (u21Var5 == u21Var6 && u21Var7.f == null) {
                            int iE = u21Var6.e() + iD;
                            m31Var2.K(iE, m31Var2.k() + iE);
                            x0(i2, e30Var, m31Var2);
                        } else if (u21Var5 == u21Var7 && u21Var6.f == null) {
                            int iE2 = iD - u21Var7.e();
                            m31Var2.K(iE2 - m31Var2.k(), iE2);
                            x0(i2, e30Var, m31Var2);
                        } else if (z2 && !m31Var2.y()) {
                            h0(i2, e30Var, m31Var2);
                        }
                    }
                } else if (i3 == 3 && m31Var2.y >= 0 && m31Var2.x >= 0 && (m31Var2.g0 == 8 || (m31Var2.s == 0 && m31Var2.W == 0.0f))) {
                    if (!m31Var2.y() && !m31Var2.F && z2 && !m31Var2.y()) {
                        i0(i2, m31Var, e30Var, m31Var2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (m31Var instanceof av2) {
            return;
        }
        HashSet<u21> hashSet2 = u21VarI2.a;
        if (hashSet2 != null && u21VarI2.c) {
            for (u21 u21Var8 : hashSet2) {
                m31 m31Var3 = u21Var8.d;
                int i4 = i + 1;
                boolean zQ2 = q(m31Var3);
                u21 u21Var9 = m31Var3.J;
                u21 u21Var10 = m31Var3.L;
                if (m31Var3.z() && zQ2) {
                    n31.V(m31Var3, e30Var, new d30());
                }
                boolean z4 = (u21Var8 == u21Var9 && (u21Var2 = u21Var10.f) != null && u21Var2.c) || (u21Var8 == u21Var10 && (u21Var = u21Var9.f) != null && u21Var.c);
                int i5 = m31Var3.p0[1];
                if (i5 != 3 || zQ2) {
                    if (!m31Var3.z()) {
                        if (u21Var8 == u21Var9 && u21Var10.f == null) {
                            int iE3 = u21Var9.e() + iD2;
                            m31Var3.K(iE3, m31Var3.k() + iE3);
                            x0(i4, e30Var, m31Var3);
                        } else if (u21Var8 == u21Var10 && u21Var9.f == null) {
                            int iE4 = iD2 - u21Var10.e();
                            m31Var3.K(iE4 - m31Var3.k(), iE4);
                            x0(i4, e30Var, m31Var3);
                        } else if (z4 && !m31Var3.y()) {
                            h0(i4, e30Var, m31Var3);
                        }
                    }
                } else if (i5 == 3 && m31Var3.y >= 0 && m31Var3.x >= 0 && (m31Var3.g0 == 8 || (m31Var3.s == 0 && m31Var3.W == 0.0f))) {
                    if (!m31Var3.y() && !m31Var3.F && z4 && !m31Var3.y()) {
                        i0(i4, m31Var, e30Var, m31Var3);
                    }
                }
            }
        }
        u21 u21VarI3 = m31Var.i(6);
        if (u21VarI3.a != null && u21VarI3.c) {
            int iD3 = u21VarI3.d();
            for (u21 u21Var11 : u21VarI3.a) {
                m31 m31Var4 = u21Var11.d;
                int i6 = i + 1;
                boolean zQ3 = q(m31Var4);
                u21 u21Var12 = m31Var4.M;
                if (m31Var4.z() && zQ3) {
                    n31.V(m31Var4, e30Var, new d30());
                }
                if (m31Var4.p0[z3 ? 1 : 0] != 3 || zQ3) {
                    if (!m31Var4.z()) {
                        if (u21Var11 == u21Var12) {
                            int iE5 = u21Var11.e() + iD3;
                            if (m31Var4.E) {
                                int i7 = iE5 - m31Var4.a0;
                                int i8 = m31Var4.V + i7;
                                m31Var4.Z = i7;
                                m31Var4.J.l(i7);
                                m31Var4.L.l(i8);
                                u21Var12.l(iE5);
                                z = z3 ? 1 : 0;
                                m31Var4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            x0(i6, e30Var, m31Var4);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        m31Var.n = z3;
    }

    public static boolean y(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = y(file2) && z;
        }
        return z;
    }

    public static final void y0(dz3 dz3Var, List list, List list2, List list3, rm1 rm1Var) {
        List listB = dz3Var.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            listB.add(p0((vy5) it.next(), rm1Var));
        }
        ArrayList arrayListA = dz3Var.a();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA.add(r0((cz5) it2.next(), rm1Var));
        }
        ArrayList arrayListC = dz3Var.c();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            pz5 pz5Var = (pz5) it3.next();
            nz3 nz3Var = new nz3(pz5Var.f0, ((w15) rm1Var.b).getString(pz5Var.g0));
            List list4 = pz5Var.h0;
            list4.getClass();
            rm1 rm1VarD = rm1Var.d(list4);
            w15 w15Var = (w15) rm1VarD.b;
            ux4 ux4Var = (ux4) rm1VarD.c;
            List<sz5> list5 = pz5Var.h0;
            list5.getClass();
            for (sz5 sz5Var : list5) {
                sz5Var.getClass();
                nz3Var.b.add(t0(sz5Var, rm1VarD));
            }
            s0(vr3.i0(pz5Var, ux4Var), rm1VarD);
            s0(vr3.v(pz5Var, ux4Var), rm1VarD);
            List<cy5> list6 = pz5Var.m0;
            list6.getClass();
            for (cy5 cy5Var : list6) {
                cy5Var.getClass();
                nz3Var.c.add(ci8.J(cy5Var, w15Var));
            }
            List<Integer> list7 = pz5Var.n0;
            list7.getClass();
            for (Integer num : list7) {
                num.getClass();
                nz3Var.d.add(d0(num.intValue(), rm1VarD));
            }
            List<gy5> list8 = pz5Var.o0;
            list8.getClass();
            for (gy5 gy5Var : list8) {
                nz3Var.e.put(w15Var.getString(gy5Var.Z), gy5Var.f0.o());
            }
            Iterator it4 = ((List) rm1VarD.h).iterator();
            while (it4.hasNext()) {
                ((bv4) it4.next()).getClass();
            }
            arrayListC.add(nz3Var);
        }
    }

    public static boolean z(dx3 dx3Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (dx3Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return dx3Var.g(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!x0) {
                            try {
                                y0 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            x0 = true;
                        }
                        Method method = y0;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (cw8.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!z0) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        A0 = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    z0 = true;
                }
                Field field = A0;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (cw8.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && cw8.c(view, keyEvent)) || dx3Var.g(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public abstract Annotation C(Class cls);

    public int K() {
        return 0;
    }

    public String L() {
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public abstract Class N();

    public abstract dh8 Q();

    public abstract View W(int i);

    public abstract boolean X();

    public void Z(t2 t2Var, t2 t2Var2) {
        t2Var.b = t2Var2;
    }

    public void a0(t2 t2Var, Thread thread) {
        t2Var.a = thread;
    }

    public boolean r(u2 u2Var, q2 q2Var, q2 q2Var2) {
        synchronized (u2Var) {
            try {
                if (u2Var.Y != q2Var) {
                    return false;
                }
                u2Var.Y = q2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean s(u2 u2Var, Object obj, Object obj2) {
        synchronized (u2Var) {
            try {
                if (u2Var.X != obj) {
                    return false;
                }
                u2Var.X = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean t(u2 u2Var, t2 t2Var, t2 t2Var2) {
        synchronized (u2Var) {
            try {
                if (u2Var.Z != t2Var) {
                    return false;
                }
                u2Var.Z = t2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
