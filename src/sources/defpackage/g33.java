package defpackage;

import android.graphics.PointF;
import android.net.NetworkRequest;
import android.opengl.Matrix;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g33 {
    public static final zy0 a = new zy0(1770207730, false, new l4(12));
    public static final int[] b = {13, 15, 14};
    public static final int[] c = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    public static final byte[] d = new byte[0];
    public static g73 e;

    public static InputStream A(ClassLoader classLoader, String str, boolean z) {
        InputStream resourceAsStream = System.getSecurityManager() != null ? (InputStream) AccessController.doPrivileged(new f33((byte) 0, classLoader, str)) : classLoader.getResourceAsStream(str);
        if (resourceAsStream == null && z) {
            throw new MissingResourceException("could not locate data", classLoader.toString(), str);
        }
        return resourceAsStream;
    }

    public static final int[] B(NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return tc.z(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            if (en.J(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return wv0.X0(arrayList);
    }

    public static final int C(bu buVar, Object obj, int i) {
        int i2 = buVar.Z;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iK = w45.k(i2, i, buVar.X);
            if (iK < 0 || dh3.f(obj, buVar.Y[iK])) {
                return iK;
            }
            int i3 = iK + 1;
            while (i3 < i2 && buVar.X[i3] == i) {
                if (dh3.f(obj, buVar.Y[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iK - 1; i4 >= 0 && buVar.X[i4] == i; i4--) {
                if (dh3.f(obj, buVar.Y[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            bt.c();
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object D(w98 w98Var, sn2 sn2Var, Throwable th, s51 s51Var) {
        jf2 jf2Var;
        if (s51Var instanceof jf2) {
            jf2Var = (jf2) s51Var;
            int i = jf2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                jf2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                jf2Var = new jf2(s51Var);
            }
        } else {
            jf2Var = new jf2(s51Var);
        }
        Object obj = jf2Var.g0;
        int i2 = jf2Var.h0;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                jf2Var.f0 = th;
                jf2Var.h0 = 1;
                Object objX = sn2Var.x(w98Var, th, jf2Var);
                Object obj2 = c71.X;
                if (objX == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = jf2Var.f0;
                w39.n0(obj);
            }
            return dn8.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                gv3.g(th2, th);
            }
            throw th2;
        }
    }

    public static boolean E() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (fm7.d0(str, "Genymotion", false)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        if (fm7.d0(str2, "google_sdk", false)) {
            return true;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        if (fm7.d0(lowerCase, "droid4x", false) || fm7.d0(str2, "Emulator", false) || fm7.d0(str2, "Android SDK built for x86", false)) {
            return true;
        }
        String str3 = Build.HARDWARE;
        if (dh3.f(str3, "goldfish") || dh3.f(str3, "vbox86")) {
            return true;
        }
        str3.getClass();
        String lowerCase2 = str3.toLowerCase(locale);
        lowerCase2.getClass();
        if (fm7.d0(lowerCase2, "nox", false)) {
            return true;
        }
        String str4 = Build.FINGERPRINT;
        str4.getClass();
        if (mm7.Z(str4, false, "generic")) {
            return true;
        }
        String str5 = Build.PRODUCT;
        if (dh3.f(str5, "sdk") || dh3.f(str5, "google_sdk") || dh3.f(str5, "sdk_x86") || dh3.f(str5, "vbox86p")) {
            return true;
        }
        str5.getClass();
        String lowerCase3 = str5.toLowerCase(locale);
        lowerCase3.getClass();
        if (fm7.d0(lowerCase3, "nox", false)) {
            return true;
        }
        String str6 = Build.BOARD;
        str6.getClass();
        String lowerCase4 = str6.toLowerCase(locale);
        lowerCase4.getClass();
        if (fm7.d0(lowerCase4, "nox", false)) {
            return true;
        }
        String str7 = Build.BRAND;
        str7.getClass();
        if (mm7.Z(str7, false, "generic")) {
            String str8 = Build.DEVICE;
            str8.getClass();
            if (mm7.Z(str8, false, "generic")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean F(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean G(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean H(int i) {
        int type;
        return (!G(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static s61 I(q61 q61Var, r61 r61Var) {
        r61Var.getClass();
        return dh3.f(q61Var.getKey(), r61Var) ? b02.X : q61Var;
    }

    public static s61 K(q61 q61Var, s61 s61Var) {
        s61Var.getClass();
        return s61Var == b02.X ? q61Var : (s61) s61Var.U(new dx0((byte) 22), q61Var);
    }

    public static void L(float[] fArr, float f) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void M(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static void N(Object obj, String str) {
        if (obj != null) {
            return;
        }
        b61.i(str);
    }

    public static final String[] O(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 != null) {
            return strArrD1;
        }
        throw new ib3("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null);
    }

    public static final boolean P(ai2 ai2Var) {
        kv6 kv6Var;
        if (ai2Var.u0 == null && (kv6Var = (kv6) hi5.W(ai2Var, mv6.a)) != null) {
            Object objE = kv6Var.e("pfc" + yn0.Z(ai2Var).j0);
            if (objE != null) {
                ai2Var.u0 = (Integer) objE;
            }
        }
        if (ai2Var.u0 != null) {
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
            loop0: while (true) {
                int i = c15Var.Z;
                if (i == 0) {
                    break;
                }
                jx4 jx4VarT = (jx4) c15Var.k(i - 1);
                if ((jx4VarT.f0 & 1024) == 0) {
                    yn0.n(c15Var, jx4VarT);
                } else {
                    while (jx4VarT != null) {
                        if ((jx4VarT.Z & 1024) != 0) {
                            c15 c15Var2 = null;
                            while (jx4VarT != null) {
                                if (jx4VarT instanceof ai2) {
                                    ai2 ai2Var2 = (ai2) jx4VarT;
                                    if (ai2Var2.p0) {
                                        int i2 = yn0.Z(ai2Var2).j0;
                                        Integer num = ai2Var.u0;
                                        if (num != null && i2 == num.intValue()) {
                                            if (P(ai2Var2) || (ai2Var2.a1().a && ai2Var2.g1(7))) {
                                                return true;
                                            }
                                        }
                                    }
                                } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                    int i3 = 0;
                                    for (jx4 jx4Var3 = ((oh1) jx4VarT).r0; jx4Var3 != null; jx4Var3 = jx4Var3.h0) {
                                        if ((jx4Var3.Z & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
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
                                    if (i3 == 1) {
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
        }
        return false;
    }

    public static final boolean Q(ai2 ai2Var) {
        if (ai2Var.d1().a()) {
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
            while (true) {
                int i = c15Var.Z;
                if (i == 0) {
                    break;
                }
                jx4 jx4VarT = (jx4) c15Var.k(i - 1);
                if ((jx4VarT.f0 & 1024) == 0) {
                    yn0.n(c15Var, jx4VarT);
                } else {
                    while (jx4VarT != null) {
                        if ((jx4VarT.Z & 1024) != 0) {
                            c15 c15Var2 = null;
                            while (jx4VarT != null) {
                                if (jx4VarT instanceof ai2) {
                                    ai2 ai2Var2 = (ai2) jx4VarT;
                                    if (ai2Var2.d1().a()) {
                                        int i2 = yn0.Z(ai2Var2).j0;
                                        ai2Var.u0 = Integer.valueOf(i2);
                                        kv6 kv6Var = (kv6) hi5.W(ai2Var, mv6.a);
                                        f63 f63Var = ai2Var.v0;
                                        if (f63Var != null) {
                                            f63Var.D();
                                        }
                                        ai2Var.v0 = kv6Var != null ? kv6Var.a(pc6.j(yn0.Z(ai2Var).j0, "pfc"), new th2((byte) 0, i2)) : null;
                                        return true;
                                    }
                                } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                    int i3 = 0;
                                    for (jx4 jx4Var3 = ((oh1) jx4VarT).r0; jx4Var3 != null; jx4Var3 = jx4Var3.h0) {
                                        if ((jx4Var3.Z & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
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
                                    if (i3 == 1) {
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
        }
        return false;
    }

    public static final long S(long j) {
        long j2 = 63 & j;
        int i = (int) j2;
        if (i <= 15) {
            return j;
        }
        if (i == nw0.u.c) {
            return z51.U(j);
        }
        if ((i == nw0.v.c || i == nw0.w.c) && Build.VERSION.SDK_INT < 34) {
            return z51.U(j);
        }
        return (i != nw0.x.c || Build.VERSION.SDK_INT >= 36) ? (j & (-64)) | (j2 - 1) : z51.U(j);
    }

    public static final long T(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final long U(long j) {
        int i = (int) (63 & j);
        return (i == nw0.x.c || i == nw0.s.c || i == nw0.t.c) ? S(dw0.a(j, nw0.e)) : S(j);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:104:0x0201  */
    /* JADX WARN: Code duplicated, block: B:105:0x0205  */
    /* JADX WARN: Code duplicated, block: B:108:0x0240  */
    /* JADX WARN: Code duplicated, block: B:109:0x0244  */
    /* JADX WARN: Code duplicated, block: B:112:0x029e  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:117:0x0306  */
    /* JADX WARN: Code duplicated, block: B:118:0x0308  */
    /* JADX WARN: Code duplicated, block: B:123:0x0314  */
    /* JADX WARN: Code duplicated, block: B:126:0x0338  */
    /* JADX WARN: Code duplicated, block: B:128:0x0403  */
    /* JADX WARN: Code duplicated, block: B:131:0x0410  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0123  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0145  */
    /* JADX WARN: Code duplicated, block: B:89:0x0147  */
    /* JADX WARN: Code duplicated, block: B:92:0x0155  */
    /* JADX WARN: Code duplicated, block: B:93:0x0158  */
    /* JADX WARN: Code duplicated, block: B:97:0x0164  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final boolean z, final gn2 gn2Var, final kx4 kx4Var, boolean z2, String str2, gn2 gn2Var2, lp2 lp2Var, final int i, final int i2) {
        boolean z3;
        int i3;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        final String str4;
        final boolean z5;
        final gn2 gn2Var3;
        j86 j86VarR;
        boolean z6;
        String str5;
        gn2 gn2Var4;
        boolean z7;
        Object objK;
        be beVar;
        y05 y05Var;
        jc8 jc8VarE;
        Object objK2;
        b71 b71Var;
        Object objK3;
        oh2 oh2Var;
        oh2 oh2Var2;
        boolean zF;
        Object objK4;
        byte b2;
        boolean z8;
        boolean z9;
        int i10;
        boolean z10;
        boolean z11;
        Object objK5;
        String str6;
        boolean z12;
        boolean z13;
        Object objK6;
        lp2 lp2Var2 = lp2Var;
        str.getClass();
        gn2Var.getClass();
        lp2Var2.X(240572578);
        int i11 = (lp2Var2.f(str) ? 4 : 2) | i | (lp2Var2.g(z) ? 32 : 16);
        if ((i & 384) == 0) {
            i11 |= lp2Var2.h(gn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i12 = i2 & 16;
        if (i12 == 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                i11 |= lp2Var2.g(z3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            }
            i3 = 196608 | i11;
            i4 = i2 & 64;
            if (i4 != 0) {
                i6 = i11 | 1769472;
                str3 = str2;
            } else {
                str3 = str2;
                if (lp2Var2.f(str3)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i6 = i3 | i5;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                i9 = i6 | 12582912;
            } else {
                if (lp2Var2.h(gn2Var2)) {
                    i8 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                } else {
                    i8 = 4194304;
                }
                i9 = i6 | i8;
            }
            if ((i9 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (lp2Var2.N(i9 & 1, z4)) {
                if (i12 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i4 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i7 != 0) {
                    gn2Var4 = null;
                } else {
                    gn2Var4 = gn2Var2;
                }
                if ((i9 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objK = lp2Var2.K();
                beVar = zz0.a;
                if (z7 || objK == beVar) {
                    objK = z51.H(Boolean.valueOf(z));
                    lp2Var2.g0(objK);
                }
                y05Var = (y05) objK;
                jc8VarE = ec8.e(lp2Var2, 48, 5);
                objK2 = lp2Var2.K();
                if (objK2 == beVar) {
                    objK2 = u70.D(lp2Var2);
                    lp2Var2.g0(objK2);
                }
                b71Var = (b71) objK2;
                objK3 = lp2Var2.K();
                if (objK3 == beVar) {
                    oh2 oh2Var3 = oh2.b;
                    objK3 = nh2.a;
                    lp2Var2.g0(objK3);
                }
                ((nh2) objK3).getClass();
                oh2Var = new oh2();
                oh2Var2 = new oh2();
                kx4 kx4VarI = zc1.I(kx4Var, oh2Var);
                zF = lp2Var2.f(oh2Var2);
                objK4 = lp2Var2.K();
                if (!zF || objK4 == beVar) {
                    b2 = 1;
                    objK4 = new bz2(oh2Var2, b2);
                    lp2Var2.g0(objK4);
                } else {
                    b2 = 1;
                }
                kx4 kx4VarC = z91.C(kx4VarI, (gn2) objK4);
                if (z6 && gn2Var4 == null) {
                    z8 = 0;
                } else {
                    z8 = b2;
                }
                if ((29360128 & i9) == 8388608) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean zF2 = z9 | lp2Var2.f(y05Var);
                i10 = i9 & 896;
                if (i10 == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zF2 | z10;
                objK5 = lp2Var2.K();
                if (z11 || objK5 == beVar) {
                    objK5 = new g00((Object) gn2Var4, (Object) y05Var, (Object) gn2Var, (byte) 7);
                    lp2Var2.g0(objK5);
                }
                int i13 = i9;
                kx4 kx4VarX = vj8.x(kx4VarC, z8, null, null, null, (dn2) objK5, lp2Var2, 29);
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
                kx4 kx4VarW = os4.w(b.a, ((gr) lp2Var2.j(hr.a)).a.b);
                o50 o50Var = pz2.o0;
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
                kx4 kx4VarA = xq6.a();
                wq6 wq6VarA2 = vq6.a(new ft(8.0f, new bt()), o50Var, lp2Var2, 54);
                int iHashCode3 = Long.hashCode(lp2Var2.T);
                kl5 kl5VarL3 = lp2Var2.l();
                kx4 kx4VarQ3 = w45.Q(lp2Var2, kx4VarA);
                lp2Var2.Z();
                if (lp2Var2.S) {
                    lp2Var2.k();
                } else {
                    lp2Var2.j0();
                }
                pn7.m(dx0Var, lp2Var2, wq6VarA2);
                pn7.m(dx0Var2, lp2Var2, kl5VarL3);
                oi0.u(iHashCode3, lp2Var2, dx0Var3, lp2Var2);
                pn7.m(dx0Var4, lp2Var2, kx4VarQ3);
                str6 = str5;
                gn2 gn2Var5 = gn2Var4;
                zc1.g(str, new d44(1.0f, false), o88.a(ys0.D(lp2Var2).b, ys0.y(lp2Var2).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var, i13 & 14, 504);
                if (str6 != null) {
                    lp2Var.W(-1398809325);
                    ec8.c(zb8.a(lp2Var, 432, 0), jm4.U(-1530598224, new hx2(str6, (byte) 2), lp2Var), jc8VarE, null, false, jm4.U(-1994771048, new j30((Object) oh2Var2, (Object) oh2Var, (Object) b71Var, (Object) jc8VarE, (byte) 3), lp2Var), lp2Var, 100663344);
                    lp2Var.p(false);
                } else {
                    lp2Var.W(-1397024190);
                    lp2Var.p(false);
                }
                lp2Var.p(true);
                hx4 hx4Var = hx4.X;
                ch3.f(lp2Var, b.k(hx4Var, 16.0f));
                boolean zBooleanValue = ((Boolean) y05Var.getValue()).booleanValue();
                boolean zF3 = lp2Var.f(y05Var);
                if (i10 == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zF3 | z12;
                objK6 = lp2Var.K();
                if (z13 || objK6 == beVar) {
                    objK6 = new dz2(gn2Var, y05Var);
                    lp2Var.g0(objK6);
                }
                gn2 gn2Var6 = (gn2) ((pv3) objK6);
                int i14 = (i13 >> 3) & 7168;
                gn2Var6.getClass();
                kx4 kx4VarE = b.e(ci8.L(hx4Var, 0.8f, 0.8f), 32.0f, 20.0f);
                gn2 gn2Var7 = z6 ? gn2Var6 : null;
                long j = ys0.y(lp2Var).e.a;
                long j2 = ys0.y(lp2Var).e.b;
                long j3 = dw0.f;
                long j4 = ys0.y(lp2Var).e.c;
                long j5 = ys0.y(lp2Var).e.d;
                long j6 = ys0.y(lp2Var).e.e;
                long j7 = ys0.y(lp2Var).e.f;
                long j8 = ys0.y(lp2Var).e.g;
                long j9 = ys0.y(lp2Var).e.h;
                long jC = kw0.c(vj8.p0, lp2Var);
                long jC2 = kw0.c(vj8.w0, lp2Var);
                long jB = dw0.b(vj8.j0, kw0.c(vj8.i0, lp2Var));
                ox1 ox1Var = kw0.a;
                boolean z14 = z6;
                oz7.a(zBooleanValue, gn2Var7, kx4VarE, z14, new lz7(j, j2, j3, jC, j4, j5, j3, jC2, j6, j7, j3, z51.s(jB, ((iw0) lp2Var.j(ox1Var)).p), j8, j9, j3, z51.s(dw0.b(vj8.l0, kw0.c(vj8.k0, lp2Var)), ((iw0) lp2Var.j(ox1Var)).p)), lp2Var, 57344 & (i14 << 3));
                lp2Var2 = lp2Var;
                lp2Var2.p(true);
                lp2Var2.W(-2055356694);
                lp2Var2.p(false);
                lp2Var2.p(true);
                str4 = str6;
                z5 = z14;
                gn2Var3 = gn2Var5;
            } else {
                lp2Var2.Q();
                str4 = str3;
                z5 = z3;
                gn2Var3 = gn2Var2;
            }
            j86VarR = lp2Var2.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: cz2
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g33.a(str, z, gn2Var, kx4Var, z5, str4, gn2Var3, (lp2) obj, w79.P(i | 1), i2);
                        return dn8.a;
                    }
                };
            }
        }
        i11 |= 24576;
        z3 = z2;
        i3 = 196608 | i11;
        i4 = i2 & 64;
        if (i4 != 0) {
            i6 = i11 | 1769472;
            str3 = str2;
        } else {
            str3 = str2;
            if (lp2Var2.f(str3)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i6 = i3 | i5;
        }
        i7 = i2 & 128;
        if (i7 != 0) {
            i9 = i6 | 12582912;
        } else {
            if (lp2Var2.h(gn2Var2)) {
                i8 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
            } else {
                i8 = 4194304;
            }
            i9 = i6 | i8;
        }
        if ((i9 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (lp2Var2.N(i9 & 1, z4)) {
            if (i12 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            if (i4 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i7 != 0) {
                gn2Var4 = null;
            } else {
                gn2Var4 = gn2Var2;
            }
            if ((i9 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            objK = lp2Var2.K();
            beVar = zz0.a;
            if (z7) {
                objK = z51.H(Boolean.valueOf(z));
                lp2Var2.g0(objK);
            } else {
                objK = z51.H(Boolean.valueOf(z));
                lp2Var2.g0(objK);
            }
            y05Var = (y05) objK;
            jc8VarE = ec8.e(lp2Var2, 48, 5);
            objK2 = lp2Var2.K();
            if (objK2 == beVar) {
                objK2 = u70.D(lp2Var2);
                lp2Var2.g0(objK2);
            }
            b71Var = (b71) objK2;
            objK3 = lp2Var2.K();
            if (objK3 == beVar) {
                oh2 oh2Var4 = oh2.b;
                objK3 = nh2.a;
                lp2Var2.g0(objK3);
            }
            ((nh2) objK3).getClass();
            oh2Var = new oh2();
            oh2Var2 = new oh2();
            kx4 kx4VarI2 = zc1.I(kx4Var, oh2Var);
            zF = lp2Var2.f(oh2Var2);
            objK4 = lp2Var2.K();
            if (zF) {
                b2 = 1;
                objK4 = new bz2(oh2Var2, b2);
                lp2Var2.g0(objK4);
            } else {
                b2 = 1;
                objK4 = new bz2(oh2Var2, b2);
                lp2Var2.g0(objK4);
            }
            kx4 kx4VarC2 = z91.C(kx4VarI2, (gn2) objK4);
            if (z6) {
                z8 = b2;
            } else {
                z8 = b2;
            }
            if ((29360128 & i9) == 8388608) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean zF4 = z9 | lp2Var2.f(y05Var);
            i10 = i9 & 896;
            if (i10 == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = zF4 | z10;
            objK5 = lp2Var2.K();
            if (z11) {
                objK5 = new g00((Object) gn2Var4, (Object) y05Var, (Object) gn2Var, (byte) 7);
                lp2Var2.g0(objK5);
            } else {
                objK5 = new g00((Object) gn2Var4, (Object) y05Var, (Object) gn2Var, (byte) 7);
                lp2Var2.g0(objK5);
            }
            int i15 = i9;
            kx4 kx4VarX2 = vj8.x(kx4VarC2, z8, null, null, null, (dn2) objK5, lp2Var2, 29);
            tw0 tw0VarA2 = rw0.a(ht.c, pz2.q0, lp2Var2, 0);
            int iHashCode4 = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL4 = lp2Var2.l();
            kx4 kx4VarQ4 = w45.Q(lp2Var2, kx4VarX2);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            dx0 dx0Var5 = pz2.B0;
            pn7.m(dx0Var5, lp2Var2, tw0VarA2);
            dx0 dx0Var6 = pz2.A0;
            pn7.m(dx0Var6, lp2Var2, kl5VarL4);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            dx0 dx0Var7 = pz2.C0;
            pn7.m(dx0Var7, lp2Var2, numValueOf2);
            pn7.l(lp2Var2);
            dx0 dx0Var8 = pz2.z0;
            pn7.m(dx0Var8, lp2Var2, kx4VarQ4);
            kx4 kx4VarW2 = os4.w(b.a, ((gr) lp2Var2.j(hr.a)).a.b);
            o50 o50Var2 = pz2.o0;
            wq6 wq6VarA3 = vq6.a(ht.a, o50Var2, lp2Var2, 48);
            int iHashCode5 = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL5 = lp2Var2.l();
            kx4 kx4VarQ5 = w45.Q(lp2Var2, kx4VarW2);
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(dx0Var5, lp2Var2, wq6VarA3);
            pn7.m(dx0Var6, lp2Var2, kl5VarL5);
            oi0.u(iHashCode5, lp2Var2, dx0Var7, lp2Var2);
            pn7.m(dx0Var8, lp2Var2, kx4VarQ5);
            kx4 kx4VarA2 = xq6.a();
            wq6 wq6VarA4 = vq6.a(new ft(8.0f, new bt()), o50Var2, lp2Var2, 54);
            int iHashCode6 = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL6 = lp2Var2.l();
            kx4 kx4VarQ6 = w45.Q(lp2Var2, kx4VarA2);
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(dx0Var5, lp2Var2, wq6VarA4);
            pn7.m(dx0Var6, lp2Var2, kl5VarL6);
            oi0.u(iHashCode6, lp2Var2, dx0Var7, lp2Var2);
            pn7.m(dx0Var8, lp2Var2, kx4VarQ6);
            str6 = str5;
            gn2 gn2Var8 = gn2Var4;
            zc1.g(str, new d44(1.0f, false), o88.a(ys0.D(lp2Var2).b, ys0.y(lp2Var2).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var, i15 & 14, 504);
            if (str6 != null) {
                lp2Var.W(-1398809325);
                ec8.c(zb8.a(lp2Var, 432, 0), jm4.U(-1530598224, new hx2(str6, (byte) 2), lp2Var), jc8VarE, null, false, jm4.U(-1994771048, new j30((Object) oh2Var2, (Object) oh2Var, (Object) b71Var, (Object) jc8VarE, (byte) 3), lp2Var), lp2Var, 100663344);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1397024190);
                lp2Var.p(false);
            }
            lp2Var.p(true);
            hx4 hx4Var2 = hx4.X;
            ch3.f(lp2Var, b.k(hx4Var2, 16.0f));
            boolean zBooleanValue2 = ((Boolean) y05Var.getValue()).booleanValue();
            boolean zF5 = lp2Var.f(y05Var);
            if (i10 == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = zF5 | z12;
            objK6 = lp2Var.K();
            if (z13) {
                objK6 = new dz2(gn2Var, y05Var);
                lp2Var.g0(objK6);
            } else {
                objK6 = new dz2(gn2Var, y05Var);
                lp2Var.g0(objK6);
            }
            gn2 gn2Var9 = (gn2) ((pv3) objK6);
            int i16 = (i15 >> 3) & 7168;
            gn2Var9.getClass();
            kx4 kx4VarE2 = b.e(ci8.L(hx4Var2, 0.8f, 0.8f), 32.0f, 20.0f);
            if (z6) {
            }
            long j10 = ys0.y(lp2Var).e.a;
            long j11 = ys0.y(lp2Var).e.b;
            long j12 = dw0.f;
            long j13 = ys0.y(lp2Var).e.c;
            long j14 = ys0.y(lp2Var).e.d;
            long j15 = ys0.y(lp2Var).e.e;
            long j16 = ys0.y(lp2Var).e.f;
            long j17 = ys0.y(lp2Var).e.g;
            long j18 = ys0.y(lp2Var).e.h;
            long jC3 = kw0.c(vj8.p0, lp2Var);
            long jC4 = kw0.c(vj8.w0, lp2Var);
            long jB2 = dw0.b(vj8.j0, kw0.c(vj8.i0, lp2Var));
            ox1 ox1Var2 = kw0.a;
            boolean z15 = z6;
            oz7.a(zBooleanValue2, gn2Var7, kx4VarE2, z15, new lz7(j10, j11, j12, jC3, j13, j14, j12, jC4, j15, j16, j12, z51.s(jB2, ((iw0) lp2Var.j(ox1Var2)).p), j17, j18, j12, z51.s(dw0.b(vj8.l0, kw0.c(vj8.k0, lp2Var)), ((iw0) lp2Var.j(ox1Var2)).p)), lp2Var, 57344 & (i16 << 3));
            lp2Var2 = lp2Var;
            lp2Var2.p(true);
            lp2Var2.W(-2055356694);
            lp2Var2.p(false);
            lp2Var2.p(true);
            str4 = str6;
            z5 = z15;
            gn2Var3 = gn2Var8;
        } else {
            lp2Var2.Q();
            str4 = str3;
            z5 = z3;
            gn2Var3 = gn2Var2;
        }
        j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: cz2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g33.a(str, z, gn2Var, kx4Var, z5, str4, gn2Var3, (lp2) obj, w79.P(i | 1), i2);
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(gn2 gn2Var, y05 y05Var, Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = !((Boolean) y05Var.getValue()).booleanValue();
        }
        y05Var.setValue(Boolean.valueOf(zBooleanValue));
        Boolean bool2 = (Boolean) y05Var.getValue();
        bool2.getClass();
        gn2Var.B(bool2);
    }

    public static final sc3 c(ow3 ow3Var, String str) {
        return new sc3(str, new tc3(ow3Var));
    }

    public static final void d(tn6 tn6Var, kx4 kx4Var, lp2 lp2Var, int i) {
        kx4 kx4Var2;
        lp2 lp2Var2;
        lp2Var.X(616352278);
        int i2 = (lp2Var.f(tn6Var) ? 4 : 2) | i | (lp2Var.f(kx4Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            String strJ0 = tn6Var.c;
            if (strJ0 == null) {
                lp2Var.W(-390940992);
                strJ0 = vj8.j0(y46.title_server_list, lp2Var);
            } else {
                lp2Var.W(-390941736);
            }
            lp2Var.p(false);
            kx4Var2 = kx4Var;
            lp2Var2 = lp2Var;
            ci8.a(kx4Var2, strJ0, gv3.b, lp2Var2, ((i2 >> 3) & 14) | 384, 0);
        } else {
            kx4Var2 = kx4Var;
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 29, i, tn6Var, kx4Var2);
        }
    }

    public static kx4 e(kx4 kx4Var) {
        Map map = iz8.a;
        return w39.l(kx4Var).y(new va7(wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1)));
    }

    public static final void f(int i, int i2) {
        if (i < 0 || i >= i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
        }
    }

    public static final void g(int i, int i2) {
        if (i < 0 || i > i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
        }
    }

    public static final void h(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            bt.f(i3, oi0.r(i, "fromIndex: ", i2, ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            bt.q(pc6.m("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    public static final fk2 i(fk2 fk2Var, String str) {
        return fk2Var.a(v15.e(str));
    }

    public static final Object k(q51 q51Var, ze2 ze2Var, dn2 dn2Var, sn2 sn2Var, xe2[] xe2VarArr) {
        yw0 yw0Var = new yw0(null, ze2Var, dn2Var, sn2Var, xe2VarArr);
        af2 af2Var = new af2(q51Var, q51Var.w());
        Object objD = z38.d(af2Var, true, af2Var, yw0Var);
        return objD == c71.X ? objD : dn8.a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:0x0150  */
    /* JADX WARN: Code duplicated, block: B:60:0x0156  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final wd0 l(sj1 sj1Var, boolean z) {
        jt3 jt3Var;
        Method method;
        wd0 je0Var;
        du3 du3Var;
        wd0 le0Var;
        Field fieldW;
        v15 v15Var;
        sx4 sx4Var;
        if (ov3.X.d(sj1Var.X().k0)) {
            return v98.a;
        }
        qs0 qs0Var = ir6.a;
        jm4 jm4VarB = ir6.b(sj1Var.X().V());
        int i = 6;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Class clsQ = null;
        if (jm4VarB instanceof yt3) {
            yt3 yt3Var = (yt3) jm4VarB;
            w15 w15Var = yt3Var.p0;
            fu3 fu3Var = yt3Var.o0;
            if (z) {
                if (fu3Var.i()) {
                    du3Var = fu3Var.g0;
                } else {
                    du3Var = null;
                }
            } else if ((fu3Var.Y & 8) == 8) {
                du3Var = fu3Var.h0;
            } else {
                du3Var = null;
            }
            Method methodT = du3Var != null ? sj1Var.X().i0.T(w15Var.getString(du3Var.Z), w15Var.getString(du3Var.f0)) : null;
            if (methodT == null) {
                fx5 fx5VarX = sj1Var.X().V();
                int i2 = bd3.a;
                if (fx5VarX.S() == null && fx5VarX.Y().isEmpty()) {
                    ed1 ed1VarP = fx5VarX.p();
                    sx4 sx4Var2 = ed1VarP instanceof sx4 ? (sx4) ed1VarP : null;
                    if (sx4Var2 != null) {
                        int i3 = el1.a;
                        ft8 ft8VarU0 = sx4Var2.u0();
                        ad3 ad3Var = ft8VarU0 instanceof ad3 ? (ad3) ft8VarU0 : null;
                        if (ad3Var != null) {
                            v15Var = ad3Var.a;
                        } else {
                            v15Var = null;
                        }
                    } else {
                        v15Var = null;
                    }
                    if (dh3.f(v15Var, fx5VarX.getName()) && dh3.f(sj1Var.X().V().e(), gl1.d)) {
                        ed1 ed1VarP2 = sj1Var.X().V().p();
                        if ((ed1VarP2 instanceof sx4) && bd3.a(ed1VarP2) && (clsQ = ms8.q((sx4Var = (sx4) ed1VarP2))) == null) {
                            StringBuilder sb = new StringBuilder("Class object for the class ");
                            sb.append(sx4Var.getName());
                            qs0 qs0VarF = el1.f((ot0) ed1VarP2);
                            sb.append(" cannot be found (classId=");
                            sb.append(qs0VarF);
                            sb.append(')');
                            throw new p14(sb.toString());
                        }
                        if (clsQ == null) {
                            throw new p14("Underlying property of inline class " + sj1Var.X() + " should have a field");
                        }
                        Method methodF = a28.f(clsQ, sj1Var.X());
                        je0Var = mb6.K(sj1Var) ? new mg3(methodF, mb6.C(sj1Var.X())) : new ng3(methodF);
                    } else {
                        fieldW = sj1Var.X().w();
                        if (fieldW != null) {
                            u52.t(sj1Var.X(), "No accessors or field is found for property ");
                            return null;
                        }
                        je0Var = m(sj1Var, z, fieldW);
                    }
                } else {
                    fieldW = sj1Var.X().w();
                    if (fieldW != null) {
                        u52.t(sj1Var.X(), "No accessors or field is found for property ");
                        return null;
                    }
                    je0Var = m(sj1Var, z, fieldW);
                }
            } else {
                if (!Modifier.isStatic(methodT.getModifiers())) {
                    le0Var = mb6.K(sj1Var) ? new je0(methodT, mb6.C(sj1Var.X())) : new me0(methodT, z2, i, objArr7 == true ? 1 : 0);
                } else if (sj1Var.X().V().getAnnotations().k(ms8.a)) {
                    int i4 = 4;
                    le0Var = mb6.K(sj1Var) ? new ke0(methodT, objArr6 == true ? 1 : 0, i4) : new me0(methodT, true, i4, 1 == true ? 1 : 0);
                } else {
                    le0Var = mb6.K(sj1Var) ? new le0(methodT, false, mb6.C(sj1Var.X())) : new me0(methodT, objArr5 == true ? 1 : 0, i, (byte) 2);
                }
                je0Var = le0Var;
            }
        } else if (jm4VarB instanceof wt3) {
            je0Var = m(sj1Var, z, ((wt3) jm4VarB).m0);
        } else {
            if (!(jm4VarB instanceof xt3)) {
                if (!(jm4VarB instanceof zt3)) {
                    b61.c();
                    return null;
                }
                if (z) {
                    jt3Var = ((zt3) jm4VarB).m0;
                } else {
                    jt3Var = ((zt3) jm4VarB).n0;
                    if (jt3Var == null) {
                        u52.t(sj1Var.X(), "No setter found for property ");
                        return null;
                    }
                }
                ov3 ov3Var = sj1Var.X().i0;
                lt3 lt3Var = jt3Var.g;
                Method methodT2 = ov3Var.T(lt3Var.l, lt3Var.m);
                if (methodT2 != null) {
                    Modifier.isStatic(methodT2.getModifiers());
                    return mb6.K(sj1Var) ? new je0(methodT2, mb6.C(sj1Var.X())) : new me0(methodT2, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
                }
                u52.t(sj1Var.X(), "No accessor found for property ");
                return null;
            }
            if (z) {
                method = ((xt3) jm4VarB).m0;
            } else {
                xt3 xt3Var = (xt3) jm4VarB;
                method = xt3Var.n0;
                if (method == null) {
                    u52.t(xt3Var.m0, "No source found for setter of Java method property: ");
                    return null;
                }
            }
            je0Var = mb6.K(sj1Var) ? new je0(method, mb6.C(sj1Var.X())) : new me0(method, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
        }
        return a28.c(je0Var, sj1Var, d02.X, false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ne0 m(sj1 sj1Var, boolean z, Field field) {
        fx5 fx5VarX = sj1Var.X().V();
        ed1 ed1VarP = fx5VarX.p();
        ed1VarP.getClass();
        boolean z2 = true;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        char c5 = 1;
        char c6 = 1;
        byte b2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (bl1.k(ed1VarP)) {
            ed1 ed1VarP2 = ed1VarP.p();
            if ((bl1.l(ed1VarP2, us0.Y) || bl1.l(ed1VarP2, us0.g0)) && (!(fx5VarX instanceof im1) || !mu3.d(((im1) fx5VarX).E0))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (sj1Var.X().V().getAnnotations().k(ms8.a)) {
                        byte b3 = 2;
                        if (z) {
                        }
                    }
                    if (z) {
                        if (mb6.K(sj1Var)) {
                        }
                    }
                    if (mb6.K(sj1Var)) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (sj1Var.X().V().getAnnotations().k(ms8.a)) {
                byte b4 = 2;
                return z ? new de0(field, objArr2 == true ? 1 : 0, b4) : new he0(field, n(sj1Var), objArr == true ? 1 : 0, b4);
            }
            if (z) {
                return mb6.K(sj1Var) ? new ce0(field, false) : new de0(field, c5 == true ? 1 : 0, c4 == true ? 1 : 0);
            }
            return mb6.K(sj1Var) ? new ge0(field, n(sj1Var), false) : new he0(field, n(sj1Var), c3 == true ? 1 : 0, c2 == true ? 1 : 0);
        }
        if (z) {
            return mb6.K(sj1Var) ? new be0(field, mb6.C(sj1Var.X())) : new de0(field, z2, b2);
        }
        return mb6.K(sj1Var) ? new fe0(field, n(sj1Var), mb6.C(sj1Var.X())) : new he0(field, n(sj1Var), c6 == true ? 1 : 0, objArr3 == true ? 1 : 0);
    }

    public static final boolean n(sj1 sj1Var) {
        return !cj8.e(sj1Var.X().V().c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final gb4 o(m04 m04Var, List list, mz3 mz3Var, List list2, li8 li8Var, boolean z) {
        list.getClass();
        list2.getClass();
        li8Var.getClass();
        gb4 gb4VarR = i21.r();
        if (z) {
            Object objD = m04Var.D();
            if (objD instanceof ev3) {
                if (mb6.L(m04Var)) {
                    if (((ev3) objD).n()) {
                        Class<?> declaringClass = zc1.M((zu3) objD).getDeclaringClass();
                        declaringClass.getClass();
                        gb4VarR.add(new se3(m04Var, yb6.a.b(declaringClass)));
                    }
                } else if (!(m04Var instanceof l14) || !z51.C((pb6) m04Var)) {
                    StringBuilder sb = new StringBuilder("Only top-level callables are supported for now: ");
                    sb.append(objD);
                    String name = m04Var.getName();
                    sb.append('/');
                    sb.append(name);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gb4VarR.add(new z04(m04Var, (qz3) it.next(), gb4VarR.a(), fw3.Y, li8Var));
            }
            if (mz3Var != null) {
                String strB = hf7.d.b();
                strB.getClass();
                qz3 qz3Var = new qz3(0, strB);
                qz3Var.c = mz3Var;
                gb4VarR.add(new z04(m04Var, qz3Var, gb4VarR.a(), fw3.Z, li8Var));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            gb4VarR.add(new z04(m04Var, (qz3) it2.next(), gb4VarR.a(), fw3.f0, li8Var));
        }
        return i21.j(gb4VarR);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final b8 p(u1 u1Var, d3 d3Var, int i, kh8 kh8Var, boolean z) {
        zu3 zu3VarA;
        Boolean bool;
        b8 b8Var;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        kh8 kh8Var2 = kh8.Z;
        pz4 pz4Var = null;
        if (!(kh8Var != kh8Var2) && u1Var.L().isEmpty()) {
            return new b8(pz4Var, z6 ? 1 : 0, z5 ? 1 : 0);
        }
        lv3 lv3VarV = u1Var.v();
        if (lv3VarV == null && (lv3VarV = u1Var.M()) == null) {
            return new b8(pz4Var, z4 ? 1 : 0, z3 ? 1 : 0);
        }
        ql3 ql3Var = (ql3) d3Var.B(Integer.valueOf(i));
        if (kh8Var == kh8Var2 || !(lv3VarV instanceof zu3)) {
            zu3VarA = null;
        } else {
            mz4 mz4Var = ql3Var.b;
            if (mz4Var == mz4.X && kh8Var == kh8.X && (lv3VarV instanceof pz4)) {
                zu3VarA = ((pz4) lv3VarV).q();
            } else if (mz4Var == mz4.Y && kh8Var == kh8.Y && !(lv3VarV instanceof pz4)) {
                zu3VarA = va0.a((zu3) lv3VarV);
            } else {
                zu3VarA = null;
            }
        }
        if (kh8Var == kh8Var2) {
            bool = null;
        } else {
            h75 h75Var = ql3Var.a;
            int i2 = h75Var == null ? -1 : vb6.a[h75Var.ordinal()];
            if (i2 == 1) {
                bool = Boolean.TRUE;
            } else if (i2 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        lv3 lv3Var = zu3VarA == null ? lv3VarV : zu3VarA;
        int i3 = i + 1;
        List<uw3> listL = u1Var.L();
        ArrayList arrayList = new ArrayList(xv0.Z(listL, 10));
        for (uw3 uw3Var : listL) {
            uw3 uw3Var2 = uw3.c;
            if (!dh3.f(uw3Var, uw3Var2)) {
                pw3 pw3Var = uw3Var.b;
                pw3Var.getClass();
                b8Var = q((u1) pw3Var, d3Var, i3);
            } else if (((ql3) d3Var.B(Integer.valueOf(i3))).a == h75.X) {
                pw3 pw3Var2 = uw3Var.b;
                pw3Var2.getClass();
                u1 u1Var2 = (u1) pw3Var2;
                u1 u1VarK = u1Var2.K();
                u1 u1VarS = (u1VarK == null ? u1Var : u1VarK).S(false);
                u1 u1VarT = u1Var2.T();
                u1 u1Var3 = u1VarT;
                if (u1VarT == null) {
                    u1Var3 = u1Var;
                }
                u1 u1VarS2 = u1Var3.S(z2);
                byte b2 = z2;
                if (!u1VarS.equals(u1VarS2)) {
                    u1VarS = new ae2(u1VarS, u1VarS2, false, null);
                    b2 = 1;
                }
                b8Var = new b8(u1VarS, b2, b2);
            } else {
                b8Var = new b8(pz4Var, z2 ? 1 : 0, z2 ? (byte) 1 : (byte) 0);
            }
            int i4 = b8Var.b;
            u1 u1Var4 = (u1) b8Var.c;
            i3 += i4;
            if (u1Var4 != null) {
                uw3Var2 = new uw3(u1Var4, uw3Var.a);
            } else if (zu3VarA != null && !dh3.f(uw3Var, uw3Var2)) {
                uw3Var2 = new uw3(uw3Var.b, uw3Var.a);
            } else if (zu3VarA == null) {
                uw3Var2 = null;
            }
            arrayList.add(uw3Var2);
            z2 = true;
        }
        int i5 = i3 - i;
        if (zu3VarA == null && bool == null) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (((uw3) it.next()) == null);
            }
            return new b8(pz4Var, i5, (byte) 1);
        }
        List listL2 = u1Var.L();
        Iterator it2 = arrayList.iterator();
        Iterator it3 = listL2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(xv0.Z(arrayList, 10), xv0.Z(listL2, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            uw3 uw3Var3 = (uw3) it3.next();
            uw3 uw3Var4 = (uw3) next;
            if (uw3Var4 != null) {
                uw3Var3 = uw3Var4;
            }
            arrayList2.add(uw3Var3);
        }
        return new b8(new s97(lv3Var, arrayList2, bool != null ? bool.booleanValue() : u1Var.z(), u1Var.t(), u1Var.f(), u1Var.x() || ql3Var.c, u1Var.B(), u1Var.G(), zu3VarA instanceof pz4 ? (pz4) zu3VarA : null, null), i5, (byte) 1);
    }

    public static final b8 q(u1 u1Var, d3 d3Var, int i) {
        u1 u1VarK = u1Var.K();
        u1 u1VarT = u1Var.T();
        if (u1VarK == null || u1VarT == null) {
            return p(u1Var, d3Var, i, kh8.Z, false);
        }
        b8 b8VarP = p(u1VarK, d3Var, i, kh8.X, u1Var.F());
        u1 u1Var2 = (u1) p(u1VarT, d3Var, i, kh8.Y, u1Var.F()).c;
        u1 u1Var3 = (u1) b8VarP.c;
        u1 ae2Var = null;
        if (u1Var3 != null || u1Var2 != null) {
            if (u1Var3 != null) {
                u1VarK = u1Var3;
            }
            if (u1Var2 != null) {
                u1VarT = u1Var2;
            }
            ae2Var = u1VarK.equals(u1VarT) ? u1VarK : new ae2(u1VarK, u1VarT, u1Var.F(), null);
        }
        return new b8(ae2Var, b8VarP.b, (byte) 1);
    }

    public static kx4 s(kx4 kx4Var) {
        return kx4Var.y(new sh2(oh2.b));
    }

    public static q61 t(q61 q61Var, r61 r61Var) {
        r61Var.getClass();
        if (dh3.f(q61Var.getKey(), r61Var)) {
            return q61Var;
        }
        return null;
    }

    public static final int[] u(NetworkRequest networkRequest) {
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return tc.a(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            if (en.I(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return wv0.X0(arrayList);
    }

    public static final int v(bz4 bz4Var, long j, fw8 fw8Var) {
        float fG = fw8Var != null ? fw8Var.g() : 0.0f;
        int i = (int) (4294967295L & j);
        int iD = bz4Var.d(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < bz4Var.e(iD) - fG || Float.intBitsToFloat(i) > bz4Var.a(iD) + fG) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fG) || Float.intBitsToFloat(i2) > bz4Var.d + fG) {
            return -1;
        }
        return iD;
    }

    public static final int w(y78 y78Var, long j, fw8 fw8Var) {
        long jE;
        int iV;
        x78 x78VarC = y78Var.c();
        if (x78VarC != null) {
            bz4 bz4Var = x78VarC.b;
            y24 y24VarE = y78Var.e();
            if (y24VarE != null && (iV = v(bz4Var, (jE = y24VarE.E(j)), fw8Var)) != -1) {
                return bz4Var.f(z85.a((bz4Var.a(iV) + bz4Var.e(iV)) / 2.0f, 1, jE));
            }
        }
        return -1;
    }

    public static final Object x(t07 t07Var, e17 e17Var) {
        Object objG = t07Var.X.g(e17Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final long y(y78 y78Var, s86 s86Var, int i) {
        em7 em7Var = qe4.z0;
        x78 x78VarC = y78Var.c();
        bz4 bz4Var = x78VarC != null ? x78VarC.b : null;
        y24 y24VarE = y78Var.e();
        return (bz4Var == null || y24VarE == null) ? f88.b : bz4Var.g(s86Var.k(y24VarE.E(0L)), i, em7Var);
    }

    public static final long z(y78 y78Var, s86 s86Var, s86 s86Var2, int i) {
        long jY = y(y78Var, s86Var, i);
        if (f88.b(jY)) {
            return f88.b;
        }
        long jY2 = y(y78Var, s86Var2, i);
        if (f88.b(jY2)) {
            return f88.b;
        }
        int i2 = (int) (jY >> 32);
        int i3 = (int) (jY2 & 4294967295L);
        return ct7.c(Math.min(i2, i2), Math.max(i3, i3));
    }

    public g33 J(Class cls, ar3 ar3Var) {
        return new rx5(this, cls, ar3Var);
    }

    public ar3 R(Class cls) {
        return null;
    }

    public abstract List j(List list, String str);

    public zz2 r(dh8 dh8Var, t37 t37Var, d50 d50Var) {
        ar3 ar3VarI = t37Var.i(dh8Var, d50Var);
        return new zz2(ar3VarI, J(dh8Var.j0, ar3VarI), (byte) 25);
    }
}
