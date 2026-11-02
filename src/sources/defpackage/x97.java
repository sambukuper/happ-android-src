package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.hardware.camera2.CameraAccessException;
import android.os.Build;
import android.os.Bundle;
import android.util.Range;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.compose.material3.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x97 {
    public static final l71 a = new l71(14);
    public static final StackTraceElement[] b = new StackTraceElement[0];
    public static final Object c = new Object();

    public static final long A(pt1 pt1Var) {
        DragEvent dragEvent = pt1Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final Bundle B(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        bt.q(pc6.p("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static boolean C(ld0 ld0Var) {
        if (!ua0.d.contains(ld0Var.getName())) {
            return false;
        }
        if (wv0.m0(ua0.c, el1.c(ld0Var)) && ld0Var.L().isEmpty()) {
            return true;
        }
        if (!zz3.A(ld0Var)) {
            return false;
        }
        Collection collectionQ = ld0Var.q();
        collectionQ.getClass();
        Collection<ld0> collection = collectionQ;
        if (collection.isEmpty()) {
            return false;
        }
        for (ld0 ld0Var2 : collection) {
            ld0Var2.getClass();
            if (C(ld0Var2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean D(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static boolean E() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Blu")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Blu")) {
                return false;
            }
        }
        return "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static final boolean F(long j) {
        if (tk8.a(j, dw0.f)) {
            return false;
        }
        lw0 lw0VarE = dw0.e(j);
        if (!z91.B(lw0VarE.b, 12884901888L)) {
            vc3.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(z91.R(lw0VarE.b)));
        }
        sk6 sk6Var = ((wk6) lw0VarE).p;
        float fA = (float) ((sk6Var.a(dw0.d(j)) * 0.0722d) + (sk6Var.a(dw0.f(j)) * 0.7152d) + (sk6Var.a(dw0.g(j)) * 0.2126d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            fA = 1.0f;
        }
        return ((double) fA) <= 0.5d;
    }

    public static final boolean G(KeyEvent keyEvent) {
        long jN = w39.N(keyEvent);
        int i = ax3.O;
        return ax3.a(jN, ax3.h) || ax3.a(jN, ax3.r) || ax3.a(jN, ax3.E) || ax3.a(jN, ax3.q);
    }

    public static final boolean H(float f, float f2, lf lfVar) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        lf lfVarA = nf.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            nf.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = lfVarA.b;
        if (rectF == null) {
            rectF = new RectF();
            lfVarA.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = lfVarA.a;
        RectF rectF2 = lfVarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        lf lfVarA2 = nf.a();
        lfVarA2.f(lfVar, lfVarA, 1);
        boolean zIsEmpty = lfVarA2.a.isEmpty();
        lfVarA2.g();
        lfVarA.g();
        return !zIsEmpty;
    }

    public static boolean I() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Itel")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Itel")) {
                return false;
            }
        }
        return "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean J() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Positivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Positivo")) {
                return false;
            }
        }
        return "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean K() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.a;
        String str3 = Build.MODEL;
        str3.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = str3.toUpperCase(locale);
        upperCase.getClass();
        if (!linkedHashMap.containsKey(upperCase)) {
            return false;
        }
        String upperCase2 = str3.toUpperCase(locale);
        upperCase2.getClass();
        Range range = (Range) linkedHashMap.get(upperCase2);
        if (range != null) {
            return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
        }
        return true;
    }

    public static boolean L() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Vivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Vivo")) {
                return false;
            }
        }
        return "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    public static final boolean M(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static boolean N(oi5 oi5Var) {
        return !mm7.R(oi5Var.b(), true, ".class");
    }

    public static final kx4 O(kx4 kx4Var, Object obj) {
        return kx4Var.y(new c34(obj));
    }

    public static g44 P(w74 w74Var, dn2 dn2Var) {
        lh4 lh4Var = lh4.L0;
        dn2Var.getClass();
        int iOrdinal = w74Var.ordinal();
        if (iOrdinal == 0) {
            return new vz7(dn2Var);
        }
        if (iOrdinal == 1) {
            bv6 bv6Var = new bv6();
            bv6Var.X = dn2Var;
            bv6Var.Y = lh4Var;
            return bv6Var;
        }
        if (iOrdinal != 2) {
            b61.c();
            return null;
        }
        zl zlVar = new zl();
        zlVar.Y = dn2Var;
        zlVar.Z = lh4Var;
        return zlVar;
    }

    public static vz7 Q(dn2 dn2Var) {
        dn2Var.getClass();
        return new vz7(dn2Var);
    }

    public static is5 R(String str, lr5 lr5Var, vj2 vj2Var, int i) {
        if ((i & 2) != 0) {
            lr5Var = null;
        }
        gn2 dx4Var = vj2Var;
        if ((i & 4) != 0) {
            dx4Var = new dx4((byte) 26);
        }
        nf1 nf1Var = tp1.a;
        ye1 ye1Var = ye1.Z;
        ow7 ow7VarB = pw7.b();
        ye1Var.getClass();
        return new is5(str, lr5Var, dx4Var, gv3.c(g33.K(ye1Var, ow7VarB)));
    }

    public static final Object S(kl5 kl5Var, q06 q06Var) {
        q06Var.getClass();
        Object objB = kl5Var.get(q06Var);
        if (objB == null) {
            objB = q06Var.b();
        }
        return ((jt8) objB).a(kl5Var);
    }

    public static oi5 T(oi5 oi5Var, oi5 oi5Var2) {
        oi5Var.getClass();
        String strT = oi5Var2.X.t();
        oi5 oi5Var3 = of6.f0;
        String strReplace = fm7.x0(strT, oi5Var.X.t()).replace('\\', '/');
        strReplace.getClass();
        return oi5Var3.f(strReplace);
    }

    public static final void U(View view, final h91 h91Var) {
        view.getClass();
        view.setOnKeyListener(new View.OnKeyListener() { // from class: i91
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                h91 h91Var2 = h91Var;
                if (i == 4) {
                    return h91Var2.e();
                }
                switch (i) {
                    case 19:
                        return h91Var2.d();
                    case 20:
                        return h91Var2.g();
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        ss8 ss8Var = ss8.a;
                        return ss8.w() ? h91Var2.i() : h91Var2.c();
                    case 22:
                        ss8 ss8Var2 = ss8.a;
                        return ss8.w() ? h91Var2.c() : h91Var2.i();
                    case 23:
                        return h91Var2.h();
                    default:
                        return false;
                }
            }
        });
    }

    public static final long V(s86 s86Var) {
        float f = s86Var.c - s86Var.a;
        return (((long) Float.floatToRawIntBits(s86Var.d - s86Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static if3 W(kf3 kf3Var, int i) {
        kf3Var.getClass();
        h(i > 0, Integer.valueOf(i));
        int i2 = kf3Var.X;
        int i3 = kf3Var.Y;
        if (kf3Var.Z <= 0) {
            i = -i;
        }
        return new if3(i2, i3, i);
    }

    public static li4 X(long j, ni4 ni4Var) {
        ni4Var.getClass();
        h(j > 0, Long.valueOf(j));
        long j2 = ni4Var.X;
        long j3 = ni4Var.Y;
        if (ni4Var.Z <= 0) {
            j = -j;
        }
        return new li4(j2, j3, j);
    }

    public static final Shader.TileMode Y(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3) {
            return Build.VERSION.SDK_INT >= 31 ? tc.l() : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final String Z(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        return b2 == 127 ? "invalid token" : "valid token";
    }

    public static final void a(String str, gn2 gn2Var, kx4 kx4Var, y68 y68Var, o88 o88Var, boolean z, wx3 wx3Var, w58 w58Var, de3 de3Var, lp2 lp2Var, int i) {
        wx3 wx3Var2;
        w58 w58Var2;
        wx3 wx3Var3;
        w58 w58Var3;
        o88 o88Var2;
        str.getClass();
        gn2Var.getClass();
        lp2Var.X(-236937229);
        int i2 = i | (lp2Var.f(str) ? 4 : 2) | (lp2Var.f(y68Var) ? 2048 : 1024) | (lp2Var.f(o88Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | 14352384 | (lp2Var.g(z) ? 67108864 : 33554432) | 805306368;
        boolean z2 = true;
        byte b2 = 0;
        if (lp2Var.N(i2 & 1, (306783379 & i2) != 306783378)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                wx3Var3 = wx3.g;
                w58Var3 = qe4.x0;
            } else {
                lp2Var.Q();
                wx3Var3 = wx3Var;
                w58Var3 = w58Var;
            }
            lp2Var.q();
            if ((((i2 & 7168) ^ 3072) <= 2048 || !lp2Var.f(y68Var)) && (i2 & 3072) != 2048) {
                z2 = false;
            }
            Object objK = lp2Var.K();
            if (z2 || objK == zz0.a) {
                objK = new kx2(gn2Var, y68Var, null, b2);
                lp2Var.g0(objK);
            }
            int i3 = (i2 >> 9) & 14;
            u70.h((rn2) objK, lp2Var, y68Var);
            if (o88Var == null) {
                lp2Var.W(-63379942);
                o88Var2 = (o88) lp2Var.j(u78.a);
                lp2Var.p(false);
            } else {
                lp2Var.W(-63380686);
                lp2Var.p(false);
                o88Var2 = o88Var;
            }
            long j = ys0.y(lp2Var).c.a;
            long j2 = ys0.y(lp2Var).c.a;
            wx3 wx3Var4 = wx3Var3;
            long j3 = ys0.y(lp2Var).c.c;
            long j4 = ys0.y(lp2Var).c.e;
            long j5 = dw0.f;
            long j6 = ys0.y(lp2Var).k.a;
            long j7 = ys0.y(lp2Var).k.c;
            long j8 = ys0.y(lp2Var).k.a;
            long j9 = ys0.y(lp2Var).k.a;
            long j10 = ys0.y(lp2Var).k.b;
            long j11 = ys0.y(lp2Var).k.c;
            long j12 = ys0.y(lp2Var).c.a;
            long j13 = ys0.y(lp2Var).c.a;
            long j14 = ys0.y(lp2Var).c.c;
            long j15 = ys0.y(lp2Var).c.e;
            long j16 = ys0.y(lp2Var).c.a;
            long j17 = ys0.y(lp2Var).c.a;
            long j18 = ys0.y(lp2Var).c.c;
            long j19 = ys0.y(lp2Var).c.e;
            long j20 = ys0.y(lp2Var).k.a;
            long j21 = ys0.y(lp2Var).c.a;
            long j22 = ys0.y(lp2Var).c.c;
            long j23 = ys0.y(lp2Var).k.c;
            long j24 = ys0.y(lp2Var).c.b;
            long j25 = ys0.y(lp2Var).c.b;
            long j26 = ys0.y(lp2Var).c.c;
            long j27 = ys0.y(lp2Var).c.e;
            long j28 = dw0.g;
            wl7.g(y68Var, kx4Var, false, o88Var2, null, jm4.U(-144426312, new hx2(str, (byte) 0), lp2Var), z, de3Var, wx3Var4, w58Var3, null, null, qe4.c0((iw0) lp2Var.j(kw0.a), lp2Var).a(j, j2, j3, j4, j5, j5, j5, j5, j6, j7, null, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j28, j28, j28, j28, j24, j25, j26, j27, j28, j28, j28, j28, j28, j28, j28, j28), null, lp2Var, i3 | 907542576, ((i2 >> 15) & 8064) | 102260736);
            wx3Var2 = wx3Var4;
            w58Var2 = w58Var3;
        } else {
            lp2Var.Q();
            wx3Var2 = wx3Var;
            w58Var2 = w58Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ix2(str, gn2Var, kx4Var, y68Var, o88Var, z, wx3Var2, w58Var2, de3Var, i);
        }
    }

    public static kf3 a0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new kf3(i, i2 - 1, 1);
        }
        kf3 kf3Var = kf3.f0;
        return kf3.f0;
    }

    public static final void b(th4 th4Var, kx4 kx4Var, lp2 lp2Var, int i) {
        th4Var.getClass();
        lp2Var.X(-786533340);
        y05 y05VarO = i21.o(th4Var.e, lp2Var);
        boolean zH = lp2Var.h(th4Var);
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (zH || objK == beVar) {
            d0 d0Var = new d0(1, th4Var, th4.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/logs/settings/LogSettingsUiIntent;)V", 0, (byte) 22);
            lp2Var.g0(d0Var);
            objK = d0Var;
        }
        pv3 pv3Var = (pv3) objK;
        Object objK2 = lp2Var.K();
        if (objK2 == beVar) {
            objK2 = new oh2();
            lp2Var.g0(objK2);
        }
        oh2 oh2Var = (oh2) objK2;
        sx2.b(kx4Var, jm4.U(2109838119, new oh4(oh2Var, (byte) 0), lp2Var), null, null, 0, 0L, null, jm4.U(1569082430, new h64(th4Var, y05VarO, oh2Var, pv3Var, (byte) 2), lp2Var), lp2Var, 12582966);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 20, i, th4Var, kx4Var);
        }
    }

    public static ni4 b0(long j) {
        return j <= Long.MIN_VALUE ? ni4.f0 : new ni4(0L, j - 1);
    }

    public static final void c(final dn2 dn2Var, final long j, final ax4 ax4Var, final oi oiVar, final zy0 zy0Var, lp2 lp2Var, final int i) {
        int i2;
        long j2;
        ax4 ax4Var2;
        z24 z24Var;
        boolean z;
        boolean z2;
        Object obj;
        lp2Var.X(766784632);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(dn2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= lp2Var.e(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            ax4Var2 = ax4Var;
            i2 |= lp2Var.f(ax4Var2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            ax4Var2 = ax4Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? lp2Var.f(oiVar) : lp2Var.h(oiVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.h(zy0Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (lp2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) lp2Var.j(pc.f);
            fi1 fi1Var = (fi1) lp2Var.j(y01.h);
            z24 z24Var2 = (z24) lp2Var.j(y01.n);
            jp2 jp2VarJ0 = km4.j0(lp2Var);
            y05 y05VarP = z51.P(zy0Var, lp2Var);
            Object[] objArr = new Object[0];
            Object objK = lp2Var.K();
            Object obj2 = zz0.a;
            if (objK == obj2) {
                objK = new dw4((byte) 7);
                lp2Var.g0(objK);
            }
            UUID uuid = (UUID) jm4.W(objArr, (dn2) objK, lp2Var);
            Object objK2 = lp2Var.K();
            if (objK2 == obj2) {
                objK2 = u70.D(lp2Var);
                lp2Var.g0(objK2);
            }
            b71 b71Var = (b71) objK2;
            boolean zF = lp2Var.f(view) | lp2Var.f(fi1Var);
            Object objK3 = lp2Var.K();
            if (zF || objK3 == obj2) {
                z24Var = z24Var2;
                z = true;
                z2 = false;
                ow4 ow4Var = new ow4(dn2Var, ax4Var2, j2, view, z24Var, fi1Var, uuid, oiVar, b71Var);
                zy0 zy0Var2 = new zy0(-1051373467, true, new sb(y05VarP, (byte) 4));
                lw4 lw4Var = ow4Var.k0;
                lw4Var.setParentCompositionContext(jp2VarJ0);
                lw4Var.q0.setValue(zy0Var2);
                lw4Var.r0 = true;
                lw4Var.d();
                lp2Var.g0(ow4Var);
                obj = ow4Var;
            } else {
                z24Var = z24Var2;
                z = true;
                z2 = false;
                obj = objK3;
            }
            final ow4 ow4Var2 = (ow4) obj;
            boolean zH = lp2Var.h(ow4Var2);
            Object objK4 = lp2Var.K();
            if (zH || objK4 == obj2) {
                objK4 = new vj2((Object) ow4Var2, (byte) 18);
                lp2Var.g0(objK4);
            }
            u70.a(ow4Var2, (gn2) objK4, lp2Var);
            int i3 = i2;
            boolean zH2 = lp2Var.h(ow4Var2) | ((i3 & 14) == 4 ? z : z2) | ((i3 & 896) == 256 ? z : z2) | ((i3 & 112) == 32 ? z : z2) | lp2Var.d(z24Var.ordinal());
            Object objK5 = lp2Var.K();
            if (zH2 || objK5 == obj2) {
                final z24 z24Var3 = z24Var;
                objK5 = new dn2() { // from class: bx4
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        ow4Var2.g(dn2Var, ax4Var, j, z24Var3);
                        return dn8.a;
                    }
                };
                lp2Var.g0(objK5);
            }
            u70.q((dn2) objK5, lp2Var);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: cx4
                @Override // defpackage.rn2
                public final Object K(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    x97.c(dn2Var, j, ax4Var, oiVar, zy0Var, (lp2) obj3, w79.P(i | 1));
                    return dn8.a;
                }
            };
        }
    }

    public static final kl5 c0(t06[] t06VarArr, kl5 kl5Var, kl5 kl5Var2) {
        jl5 jl5Var = new jl5(kl5.f0);
        for (t06 t06Var : t06VarArr) {
            q06 q06Var = t06Var.a;
            if (t06Var.g || !kl5Var.containsKey(q06Var)) {
                jl5Var.put(q06Var, q06Var.d(t06Var, (jt8) kl5Var2.get(q06Var)));
            }
        }
        return jl5Var.f();
    }

    public static final void d(kx4 kx4Var, q06 q06Var, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        zy0 zy0Var2 = w39.X;
        lp2Var.X(-714464401);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(q06Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(zy0Var2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 2048 : 1024;
        }
        if (lp2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                Object rh5Var = new rh5(null, lh4.i0);
                lp2Var.g0(rh5Var);
                objK = rh5Var;
            }
            i30 i30VarF = f(zy0Var2, lp2Var, (i2 >> 6) & 14);
            mb6.a(q06Var.a(i30VarF), jm4.U(274270255, new j30((Object) kx4Var, objK, (Object) zy0Var, (Object) i30VarF, (byte) 0), lp2Var), lp2Var, 56);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) kx4Var, (Object) q06Var, (Object) zy0Var, i, (byte) 2);
        }
    }

    public static final void e(gb4 gb4Var, qj2 qj2Var) {
        if (qj2Var instanceof c30) {
            gb4Var.add(((c30) qj2Var).a);
            return;
        }
        if (qj2Var instanceof b11) {
            Iterator it = ((b11) qj2Var).a.iterator();
            while (it.hasNext()) {
                e(gb4Var, (s55) it.next());
            }
            return;
        }
        if (qj2Var instanceof q21) {
            return;
        }
        if (qj2Var instanceof i97) {
            e(gb4Var, ((i97) qj2Var).a);
            return;
        }
        if (!(qj2Var instanceof z8)) {
            if (qj2Var instanceof ld5) {
                e(gb4Var, ((ld5) qj2Var).b);
                return;
            } else {
                b61.c();
                return;
            }
        }
        z8 z8Var = (z8) qj2Var;
        e(gb4Var, z8Var.a);
        Iterator it2 = z8Var.b.iterator();
        while (it2.hasNext()) {
            e(gb4Var, (qj2) it2.next());
        }
    }

    public static final i30 f(zy0 zy0Var, lp2 lp2Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && lp2Var.f(zy0Var)) || (i & 6) == 4;
        Object objK = lp2Var.K();
        Object obj = zz0.a;
        if (z || objK == obj) {
            objK = new i30(zy0Var);
            lp2Var.g0(objK);
        }
        i30 i30Var = (i30) objK;
        boolean zF = lp2Var.f(i30Var);
        Object objK2 = lp2Var.K();
        if (zF || objK2 == obj) {
            objK2 = new y0((Object) i30Var, (byte) 11);
            lp2Var.g0(objK2);
        }
        u70.a(i30Var, (gn2) objK2, lp2Var);
        return i30Var;
    }

    public static final byte g(char c2) {
        if (c2 < '~') {
            return zp0.b[c2];
        }
        return (byte) 0;
    }

    public static final void h(boolean z, Number number) {
        if (z) {
            return;
        }
        kp5.j(number, "Step must be positive, was: ");
    }

    public static final kx4 i(kx4 kx4Var, xz4 xz4Var, tb3 tb3Var, boolean z, kl6 kl6Var, dn2 dn2Var) {
        kx4 kx4VarY;
        if (tb3Var != null) {
            kx4VarY = new yt0(xz4Var, tb3Var, false, z, null, kl6Var, dn2Var);
        } else if (tb3Var == null) {
            kx4VarY = new yt0(xz4Var, null, false, z, null, kl6Var, dn2Var);
        } else {
            hx4 hx4Var = hx4.X;
            kx4VarY = xz4Var != null ? qb3.a(hx4Var, xz4Var, tb3Var).y(new yt0(xz4Var, null, false, z, null, kl6Var, dn2Var)) : w45.x(hx4Var, new au0(tb3Var, z, kl6Var, dn2Var));
        }
        return kx4Var.y(kx4VarY);
    }

    public static /* synthetic */ kx4 j(kx4 kx4Var, xz4 xz4Var, c cVar, boolean z, kl6 kl6Var, dn2 dn2Var, int i) {
        if ((i & 16) != 0) {
            kl6Var = null;
        }
        return i(kx4Var, xz4Var, cVar, z, kl6Var, dn2Var);
    }

    public static kx4 k(kx4 kx4Var, boolean z, String str, dn2 dn2Var) {
        return kx4Var.y(new yt0(null, null, true, z, str, null, dn2Var));
    }

    public static double l(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float m(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int n(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int o(int i, vu0 vu0Var) {
        vu0Var.getClass();
        if (vu0Var instanceof uu0) {
            return ((Number) r(Integer.valueOf(i), (uu0) vu0Var)).intValue();
        }
        if (vu0Var.isEmpty()) {
            kp5.j(vu0Var, "Cannot coerce value to an empty range: ");
            return 0;
        }
        if (i < ((Number) vu0Var.a()).intValue()) {
            return ((Number) vu0Var.a()).intValue();
        }
        return i > ((Number) vu0Var.b()).intValue() ? ((Number) vu0Var.b()).intValue() : i;
    }

    public static long p(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        StringBuilder sbS = pc6.s(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbS.append(j2);
        sbS.append('.');
        throw new IllegalArgumentException(sbS.toString());
    }

    public static long q(long j, ni4 ni4Var) {
        long j2 = ni4Var.Y;
        long j3 = ni4Var.X;
        if (ni4Var.isEmpty()) {
            kp5.j(ni4Var, "Cannot coerce value to an empty range: ");
            return 0L;
        }
        if (j < Long.valueOf(j3).longValue()) {
            return Long.valueOf(j3).longValue();
        }
        return j > Long.valueOf(j2).longValue() ? Long.valueOf(j2).longValue() : j;
    }

    public static Comparable r(Comparable comparable, uu0 uu0Var) {
        uu0Var.getClass();
        float f = uu0Var.Y;
        float f2 = uu0Var.X;
        if (uu0Var.isEmpty()) {
            kp5.j(uu0Var, "Cannot coerce value to an empty range: ");
            return null;
        }
        if (!uu0.c(comparable, Float.valueOf(f2)) || uu0.c(Float.valueOf(f2), comparable)) {
            return (!uu0.c(Float.valueOf(f), comparable) || uu0.c(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f);
        }
        return Float.valueOf(f2);
    }

    public static kx4 s(kx4 kx4Var, xz4 xz4Var, tb3 tb3Var, boolean z, dn2 dn2Var, dn2 dn2Var2, int i) {
        kx4 kx4VarY;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            dn2Var = null;
        }
        dn2 dn2Var3 = dn2Var;
        if (tb3Var != null) {
            kx4VarY = new zw0(dn2Var2, dn2Var3, tb3Var, xz4Var, z2);
        } else if (tb3Var == null) {
            kx4VarY = new zw0(dn2Var2, dn2Var3, null, xz4Var, z2);
        } else {
            hx4 hx4Var = hx4.X;
            kx4VarY = xz4Var != null ? qb3.a(hx4Var, xz4Var, tb3Var).y(new zw0(dn2Var2, dn2Var3, null, xz4Var, z2)) : w45.x(hx4Var, new au0(tb3Var, z2, dn2Var2, dn2Var3));
        }
        return kx4Var.y(kx4VarY);
    }

    public static final Object t(ue7 ue7Var, int i) {
        Object obj;
        ue7Var.getClass();
        int iK = w45.k(ue7Var.Z, i, ue7Var.X);
        if (iK < 0 || (obj = ue7Var.Y[iK]) == c) {
            return null;
        }
        return obj;
    }

    public static void u(sv1 sv1Var, mb6 mb6Var, long j) {
        if (mb6Var instanceof ae5) {
            s86 s86Var = ((ae5) mb6Var).j0;
            sv1Var.H0(j, (((long) Float.floatToRawIntBits(s86Var.a)) << 32) | (((long) Float.floatToRawIntBits(s86Var.b)) & 4294967295L), V(s86Var), 1.0f, 3);
            return;
        }
        if (!(mb6Var instanceof be5)) {
            if (mb6Var instanceof zd5) {
                sv1Var.C0(((zd5) mb6Var).j0, j);
                return;
            } else {
                b61.c();
                return;
            }
        }
        be5 be5Var = (be5) mb6Var;
        lf lfVar = be5Var.k0;
        if (lfVar != null) {
            sv1Var.C0(lfVar, j);
            return;
        }
        em6 em6Var = be5Var.j0;
        float f = em6Var.b;
        float f2 = em6Var.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (em6Var.h >> 32));
        sv1Var.f0(j, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(em6Var.c - f2)) << 32) | (((long) Float.floatToRawIntBits(em6Var.d - f)) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final pw3 v(pw3 pw3Var, pw3 pw3Var2, boolean z) {
        uw3 uw3VarG0;
        pw3 pw3Var3 = (pw3) w27.k0(w27.i0(pw3Var, cl1.y0));
        pw3Var3.getClass();
        u1 u1Var = (u1) pw3Var3;
        List listL = u1Var.L();
        if (listL.isEmpty()) {
            return pw3Var3;
        }
        qe4 qe4Var = qe4.q0;
        mh8 mh8VarE = qe4Var.E((zk6) pw3Var3);
        int iZ = qe4Var.Z(mh8VarE);
        ArrayList<rw3> arrayList = new ArrayList(iZ);
        for (int i = 0; i < iZ; i++) {
            arrayList.add((rw3) qe4Var.h0(mh8VarE, i));
        }
        if (arrayList.size() != listL.size()) {
            StringBuilder sb = new StringBuilder("Error inside type '");
            sb.append(pw3Var2);
            sb.append("'. '");
            sb.append(pw3Var3);
            int size = arrayList.size();
            int size2 = listL.size();
            sb.append("' params (");
            sb.append(size);
            sb.append(") vs args (");
            sb.append(size2);
            sb.append(") mismatch.");
            throw new IllegalStateException(sb.toString().toString());
        }
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        for (rw3 rw3Var : arrayList) {
            if (z) {
                uw3VarG0 = uw3.c;
            } else {
                pw3 pw3Var4 = (pw3) wv0.t0(rw3Var.getUpperBounds());
                if (pw3Var4 == null) {
                    xw3.n("Error inside type '", pw3Var2, "'. Parameter '", rw3Var, "' has no upper bounds. There must always be at least the default 'Any?' upper bound");
                    return null;
                }
                pw3 pw3VarV = v(pw3Var4, pw3Var2, true);
                uw3 uw3Var = uw3.c;
                uw3VarG0 = hi5.g0(pw3VarV);
            }
            arrayList2.add(uw3VarG0);
        }
        lv3 lv3VarM = u1Var.M();
        if (lv3VarM == null) {
            xw3.n("Error inside type '", pw3Var2, "'. The current type '", pw3Var3, "' is not denotable");
            return null;
        }
        u1 u1VarG = w45.G(lv3VarM, arrayList2, u1Var.z(), null, 12);
        int size3 = arrayList.size();
        ArrayList arrayList3 = new ArrayList(size3);
        for (int i2 = 0; i2 < size3; i2++) {
            arrayList3.add(uw3.c);
        }
        return eu7.e(u1VarG, w45.G(lv3VarM, arrayList3, true, null, 12), !z);
    }

    public static final int w(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int x(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static int y(Exception exc) {
        boolean zF = false;
        if (!(exc instanceof CameraAccessException)) {
            if (exc instanceof IllegalArgumentException) {
                return 7;
            }
            if (exc instanceof SecurityException) {
                return 8;
            }
            if (Build.VERSION.SDK_INT == 28) {
                if (exc instanceof RuntimeException) {
                    StackTraceElement[] stackTrace = ((RuntimeException) exc).getStackTrace();
                    stackTrace.getClass();
                    zF = dh3.f(stackTrace.length == 0 ? null : stackTrace[0].getMethodName(), "_enableShutterSound");
                }
                if (zF) {
                    return 10;
                }
            }
            exc.toString();
            return 11;
        }
        CameraAccessException cameraAccessException = (CameraAccessException) exc;
        int reason = cameraAccessException.getReason();
        if (reason == 1) {
            return 3;
        }
        if (reason == 2) {
            return 6;
        }
        if (reason == 3) {
            return 0;
        }
        if (reason == 4) {
            return 1;
        }
        if (reason == 5) {
            return 2;
        }
        cameraAccessException.toString();
        return 11;
    }

    public static final Object z(tr4 tr4Var) {
        Object objW = tr4Var.w();
        d34 d34Var = objW instanceof d34 ? (d34) objW : null;
        if (d34Var != null) {
            return d34Var.q0;
        }
        return null;
    }
}
