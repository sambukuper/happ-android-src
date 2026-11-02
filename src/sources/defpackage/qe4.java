package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.receiver.WidgetProvider;
import su.happ.proxyutility.service.XRayTestService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qe4 implements r61, ax, jv4, k28, rr8, po5, xi8, l32, z70, qd7, w58, l29, hu4 {
    public final /* synthetic */ byte X;
    public static final qe4 Y = new qe4(0);
    public static final qe4 Z = new qe4(1);
    public static final /* synthetic */ qe4 f0 = new qe4(3);
    public static final qe4 g0 = new qe4(4);
    public static final qe4 h0 = new qe4(5);
    public static final qe4 i0 = new qe4(6);
    public static final qe4 j0 = new qe4(7);
    public static final qe4 k0 = new qe4(8);
    public static final qe4 l0 = new qe4(9);
    public static final qe4 m0 = new qe4(10);
    public static final qe4 n0 = new qe4(11);
    public static final qe4 o0 = new qe4(12);
    public static final qe4 p0 = new qe4(14);
    public static final qe4 q0 = new qe4(15);
    public static final qe4 r0 = new qe4(16);
    public static final qe4 s0 = new qe4(17);
    public static final qe4 t0 = new qe4(18);
    public static final qe4 u0 = new qe4(20);
    public static final qe4 v0 = new qe4(21);
    public static final qe4 w0 = new qe4(22);
    public static final qe4 x0 = new qe4(23);
    public static final em7 y0 = new em7(2);
    public static final em7 z0 = new em7(3);
    public static final qe4 A0 = new qe4(25);
    public static final qe4 B0 = new qe4(26);
    public static final qe4 C0 = new qe4(27);
    public static final qe4 D0 = new qe4(28);

    public /* synthetic */ qe4(byte b) {
        this.X = b;
    }

    public static o05 K0(FileInputStream fileInputStream) throws j71 {
        byte[] bArr;
        try {
            os5 os5VarO = os5.o(fileInputStream);
            o05 o05Var = new o05(false);
            ks5[] ks5VarArr = (ks5[]) Arrays.copyOf(new ks5[0], 0);
            o05Var.b();
            if (ks5VarArr.length > 0) {
                ks5 ks5Var = ks5VarArr[0];
                throw null;
            }
            Map mapL = os5VarO.l();
            mapL.getClass();
            for (Map.Entry entry : mapL.entrySet()) {
                String str = (String) entry.getKey();
                ss5 ss5Var = (ss5) entry.getValue();
                str.getClass();
                ss5Var.getClass();
                int iU = ss5Var.u();
                switch (iU == 0 ? -1 : ls5.a[p61.B(iU)]) {
                    case -1:
                        throw new j71("Value case is null.", null);
                    case 0:
                    default:
                        b61.c();
                        return null;
                    case 1:
                        o05Var.f(new js5(str), Boolean.valueOf(ss5Var.l()));
                        break;
                    case 2:
                        o05Var.f(new js5(str), Float.valueOf(ss5Var.p()));
                        break;
                    case 3:
                        o05Var.f(new js5(str), Double.valueOf(ss5Var.o()));
                        break;
                    case 4:
                        o05Var.f(new js5(str), Integer.valueOf(ss5Var.q()));
                        break;
                    case 5:
                        o05Var.f(new js5(str), Long.valueOf(ss5Var.r()));
                        break;
                    case 6:
                        o05Var.f(new js5(str), ss5Var.s());
                        break;
                    case 7:
                        js5 js5Var = new js5(str);
                        cg3 cg3VarN = ss5Var.t().n();
                        cg3VarN.getClass();
                        o05Var.f(js5Var, wv0.c1(cg3VarN));
                        break;
                    case 8:
                        js5 js5Var2 = new js5(str);
                        hb0 hb0VarM = ss5Var.m();
                        int size = hb0VarM.size();
                        if (size == 0) {
                            bArr = eg3.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            hb0VarM.d(size, bArr2);
                            bArr = bArr2;
                        }
                        o05Var.f(js5Var2, bArr);
                        break;
                    case 9:
                        throw new j71("Value not set.", null);
                }
            }
            return new o05(new LinkedHashMap(o05Var.a()), true);
        } catch (qh3 e) {
            throw new j71("Unable to parse preferences proto.", e);
        }
    }

    public static void L0(Context context, String str, int i, Serializable serializable) {
        try {
            Intent intent = new Intent();
            intent.setAction(str);
            intent.setPackage("su.happ.proxyutility");
            intent.putExtra("key", i);
            intent.putExtra("content", serializable);
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    public static void M0(int i, Context context, String str) {
        context.getClass();
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, (Class<?>) XRayTestService.class));
            intent.putExtra("key", i);
            intent.putExtra("content", (Serializable) str);
            context.startService(intent);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    public static void N0(Context context, int i, Serializable serializable) {
        context.getClass();
        L0(context, "su.happ.proxyutility.action.activity", i, serializable);
    }

    public static void P0(Service service, int i) {
        service.getClass();
        q15 q15Var = WidgetProvider.a;
        dt7.f(service, Integer.valueOf(i));
    }

    public static void Q0(Object obj) {
        throw new p14("This method should not be called on " + obj + " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue");
    }

    public static void R0(Object obj, tl8 tl8Var) {
        cq2 cq2VarA;
        Map mapA = ((o05) obj).a();
        ms5 ms5VarN = os5.n();
        for (Map.Entry entry : mapA.entrySet()) {
            js5 js5Var = (js5) entry.getKey();
            Object value = entry.getValue();
            String str = js5Var.a;
            if (value instanceof Boolean) {
                rs5 rs5VarV = ss5.v();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                rs5VarV.c();
                ((ss5) rs5VarV.Y).w(zBooleanValue);
                cq2VarA = rs5VarV.a();
            } else if (value instanceof Float) {
                rs5 rs5VarV2 = ss5.v();
                float fFloatValue = ((Number) value).floatValue();
                rs5VarV2.c();
                ((ss5) rs5VarV2.Y).z(fFloatValue);
                cq2VarA = rs5VarV2.a();
            } else if (value instanceof Double) {
                rs5 rs5VarV3 = ss5.v();
                double dDoubleValue = ((Number) value).doubleValue();
                rs5VarV3.c();
                ((ss5) rs5VarV3.Y).y(dDoubleValue);
                cq2VarA = rs5VarV3.a();
            } else if (value instanceof Integer) {
                rs5 rs5VarV4 = ss5.v();
                int iIntValue = ((Number) value).intValue();
                rs5VarV4.c();
                ((ss5) rs5VarV4.Y).A(iIntValue);
                cq2VarA = rs5VarV4.a();
            } else if (value instanceof Long) {
                rs5 rs5VarV5 = ss5.v();
                long jLongValue = ((Number) value).longValue();
                rs5VarV5.c();
                ((ss5) rs5VarV5.Y).B(jLongValue);
                cq2VarA = rs5VarV5.a();
            } else if (value instanceof String) {
                rs5 rs5VarV6 = ss5.v();
                rs5VarV6.c();
                ((ss5) rs5VarV6.Y).C((String) value);
                cq2VarA = rs5VarV6.a();
            } else if (value instanceof Set) {
                rs5 rs5VarV7 = ss5.v();
                ps5 ps5VarO = qs5.o();
                ps5VarO.c();
                ((qs5) ps5VarO.Y).l((Set) value);
                rs5VarV7.c();
                ((ss5) rs5VarV7.Y).D((qs5) ps5VarO.a());
                cq2VarA = rs5VarV7.a();
            } else {
                if (!(value instanceof byte[])) {
                    bt.i("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                rs5 rs5VarV8 = ss5.v();
                byte[] bArr = (byte[]) value;
                hb0 hb0VarC = hb0.c(0, bArr.length, bArr);
                rs5VarV8.c();
                ((ss5) rs5VarV8.Y).x(hb0VarC);
                cq2VarA = rs5VarV8.a();
            }
            ms5VarN.getClass();
            str.getClass();
            ms5VarN.c();
            ((os5) ms5VarN.Y).m().put(str, (ss5) cq2VarA);
        }
        os5 os5Var = (os5) ms5VarN.a();
        int iA = os5Var.a(null);
        Logger logger = mv0.f;
        if (iA > 4096) {
            iA = 4096;
        }
        mv0 mv0Var = new mv0(tl8Var, iA);
        os5Var.b(mv0Var);
        if (mv0Var.d > 0) {
            mv0Var.k();
        }
    }

    public static String[] U(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static i48 c0(iw0 iw0Var, lp2 lp2Var) {
        i48 i48VarA = iw0Var.b0;
        if (i48VarA == null) {
            lp2Var.W(390452338);
            lp2Var.p(false);
            i48VarA = null;
        } else {
            lp2Var.W(390452339);
            h88 h88Var = (h88) lp2Var.j(i88.a);
            if (!dh3.f(i48VarA.k, h88Var)) {
                i48VarA = i48VarA.a(i48VarA.a, i48VarA.b, i48VarA.c, i48VarA.d, i48VarA.e, i48VarA.f, i48VarA.g, i48VarA.h, i48VarA.i, i48VarA.j, h88Var, i48VarA.l, i48VarA.m, i48VarA.n, i48VarA.o, i48VarA.p, i48VarA.q, i48VarA.r, i48VarA.s, i48VarA.t, i48VarA.u, i48VarA.v, i48VarA.w, i48VarA.x, i48VarA.y, i48VarA.z, i48VarA.A, i48VarA.B, i48VarA.C, i48VarA.D, i48VarA.E, i48VarA.F, i48VarA.G, i48VarA.H, i48VarA.I, i48VarA.J, i48VarA.K, i48VarA.L, i48VarA.M, i48VarA.N, i48VarA.O, i48VarA.P, i48VarA.Q);
                iw0Var.b0 = i48VarA;
            }
            lp2Var.p(false);
        }
        if (i48VarA != null) {
            lp2Var.W(-1788515437);
            lp2Var.p(false);
            return i48VarA;
        }
        lp2Var.W(-1788321191);
        long jB = kw0.b(iw0Var, nr4.u);
        long jB2 = kw0.b(iw0Var, nr4.A);
        jw0 jw0Var = nr4.h;
        long jB3 = dw0.b(0.38f, kw0.b(iw0Var, jw0Var));
        long jB4 = kw0.b(iw0Var, nr4.o);
        long j = dw0.f;
        long jB5 = kw0.b(iw0Var, nr4.f);
        long jB6 = kw0.b(iw0Var, nr4.n);
        h88 h88Var2 = (h88) lp2Var.j(i88.a);
        long jB7 = kw0.b(iw0Var, nr4.x);
        long jB8 = kw0.b(iw0Var, nr4.G);
        long jB9 = dw0.b(0.12f, kw0.b(iw0Var, nr4.k));
        long jB10 = kw0.b(iw0Var, nr4.r);
        long jB11 = kw0.b(iw0Var, nr4.w);
        long jB12 = kw0.b(iw0Var, nr4.F);
        long jB13 = dw0.b(0.38f, kw0.b(iw0Var, nr4.j));
        long jB14 = kw0.b(iw0Var, nr4.q);
        long jB15 = kw0.b(iw0Var, nr4.z);
        long jB16 = kw0.b(iw0Var, nr4.I);
        long jB17 = dw0.b(0.38f, kw0.b(iw0Var, nr4.m));
        long jB18 = kw0.b(iw0Var, nr4.t);
        long jB19 = kw0.b(iw0Var, nr4.v);
        long jB20 = kw0.b(iw0Var, nr4.E);
        long jB21 = dw0.b(0.38f, kw0.b(iw0Var, nr4.i));
        long jB22 = kw0.b(iw0Var, nr4.p);
        jw0 jw0Var2 = nr4.B;
        long jB23 = kw0.b(iw0Var, jw0Var2);
        long jB24 = kw0.b(iw0Var, jw0Var2);
        long jB25 = dw0.b(0.38f, kw0.b(iw0Var, jw0Var));
        long jB26 = kw0.b(iw0Var, jw0Var2);
        long jB27 = kw0.b(iw0Var, nr4.y);
        long jB28 = kw0.b(iw0Var, nr4.H);
        long jB29 = dw0.b(0.38f, kw0.b(iw0Var, nr4.l));
        long jB30 = kw0.b(iw0Var, nr4.s);
        jw0 jw0Var3 = nr4.C;
        long jB31 = kw0.b(iw0Var, jw0Var3);
        long jB32 = kw0.b(iw0Var, jw0Var3);
        long jB33 = dw0.b(0.38f, kw0.b(iw0Var, jw0Var3));
        long jB34 = kw0.b(iw0Var, jw0Var3);
        jw0 jw0Var4 = nr4.D;
        i48 i48Var = new i48(jB, jB2, jB3, jB4, j, j, j, j, jB5, jB6, h88Var2, jB7, jB8, jB9, jB10, jB11, jB12, jB13, jB14, jB15, jB16, jB17, jB18, jB19, jB20, jB21, jB22, jB23, jB24, jB25, jB26, jB27, jB28, jB29, jB30, jB31, jB32, jB33, jB34, kw0.b(iw0Var, jw0Var4), kw0.b(iw0Var, jw0Var4), dw0.b(0.38f, kw0.b(iw0Var, jw0Var4)), kw0.b(iw0Var, jw0Var4));
        iw0Var.b0 = i48Var;
        lp2Var.p(false);
        return i48Var;
    }

    public static LinkedHashSet k0(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet m0(String str, String... strArr) {
        return k0("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet r0(String str, String... strArr) {
        return k0("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // defpackage.xi8
    public zk6 A(x14 x14Var) {
        x14Var.getClass();
        fe2 fe2VarO0 = o0(x14Var);
        if (fe2VarO0 != null) {
            return i(fe2VarO0);
        }
        zk6 zk6VarT0 = t0(x14Var);
        zk6VarT0.getClass();
        return zk6VarT0;
    }

    @Override // defpackage.xi8
    public bh8 A0(x14 x14Var, int i) {
        x14Var.getClass();
        return new vw3((uw3) ((pw3) x14Var).L().get(i));
    }

    @Override // defpackage.xi8
    public x14 B(fo0 fo0Var) {
        return (x14) ((wn0) fo0Var).Y;
    }

    @Override // defpackage.xi8
    public boolean B0(x14 x14Var) {
        x14Var.getClass();
        return !dh3.f(E(A(x14Var)), E(a0(x14Var)));
    }

    @Override // defpackage.xi8
    public Collection C(mh8 mh8Var) {
        mh8Var.getClass();
        if (mh8Var instanceof zu3) {
            List<pw3> listC = ((zu3) mh8Var).c();
            ArrayList arrayList = new ArrayList(xv0.Z(listC, 10));
            for (pw3 pw3Var : listC) {
                pw3Var.getClass();
                arrayList.add((x14) pw3Var);
            }
            return arrayList;
        }
        if (mh8Var instanceof rw3) {
            List<pw3> upperBounds = ((rw3) mh8Var).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(xv0.Z(upperBounds, 10));
            for (pw3 pw3Var2 : upperBounds) {
                pw3Var2.getClass();
                arrayList2.add((x14) pw3Var2);
            }
            return arrayList2;
        }
        if (!(mh8Var instanceof xn0)) {
            StringBuilder sbS = oi0.s("Unsupported type constructor: ", mh8Var, " (");
            sbS.append(mh8Var.getClass().getName());
            sbS.append(')');
            throw new IllegalStateException(sbS.toString().toString());
        }
        ArrayList<pw3> arrayList3 = ((xn0) mh8Var).Y;
        if (arrayList3 == null) {
            dh3.T("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList3, 10));
        for (pw3 pw3Var3 : arrayList3) {
            pw3Var3.getClass();
            arrayList4.add((x14) pw3Var3);
        }
        return arrayList4;
    }

    @Override // defpackage.xi8
    public boolean C0(x14 x14Var) {
        x14Var.getClass();
        return ((pw3) x14Var).z();
    }

    @Override // defpackage.xi8
    public boolean D(mh8 mh8Var) {
        return !(mh8Var instanceof xn0);
    }

    @Override // defpackage.xi8
    public mh8 E(zk6 zk6Var) {
        Class<?> componentType;
        zk6Var.getClass();
        if (zk6Var instanceof wn0) {
            return ((wn0) zk6Var).Z;
        }
        u1 u1Var = (u1) zk6Var;
        if (u1Var.B()) {
            return k65.Y;
        }
        lv3 lv3VarM = u1Var.M();
        ev3 ev3Var = lv3VarM instanceof ev3 ? (ev3) lv3VarM : null;
        if (ev3Var != null && (componentType = zc1.M(ev3Var).getComponentType()) != null && !componentType.isPrimitive()) {
            return (mh8) yb6.a.b(Object[].class);
        }
        lv3 lv3VarV = u1Var.v();
        if (lv3VarV == null) {
            lv3VarV = u1Var.M();
        }
        lv3VarV.getClass();
        return (mh8) lv3VarV;
    }

    @Override // defpackage.xi8
    public ah8 E0(zk6 zk6Var) {
        zk6Var.getClass();
        return (ah8) zk6Var;
    }

    @Override // defpackage.xi8
    public un0 F(fo0 fo0Var) {
        return un0.X;
    }

    public da7 F0(zk6 zk6Var) {
        ih1 ih1VarT = T(zk6Var);
        return ih1VarT != null ? ((u1) ih1VarT).N(false) : (da7) zk6Var;
    }

    @Override // defpackage.xi8
    public boolean G(x14 x14Var) {
        x14Var.getClass();
        return ((pw3) A(x14Var)).z() != ((pw3) a0(x14Var)).z();
    }

    @Override // defpackage.xi8
    public boolean G0(x14 x14Var) {
        x14Var.getClass();
        Q0(x14Var);
        throw null;
    }

    @Override // defpackage.xi8
    public boolean H(x14 x14Var) {
        x14Var.getClass();
        zk6 zk6VarT0 = t0(x14Var);
        return (zk6VarT0 != null ? T(zk6VarT0) : null) != null;
    }

    @Override // defpackage.xi8
    public x14 I0(x14 x14Var) {
        return ((u1) x14Var).S(true);
    }

    @Override // defpackage.xi8
    public boolean J(zk6 zk6Var) {
        zk6Var.getClass();
        return T(zk6Var) != null;
    }

    @Override // defpackage.xi8
    public boolean J0(x14 x14Var) {
        t14 t14Var;
        x14Var.getClass();
        if (!(x14Var instanceof u1) || !(((u1) x14Var).M() instanceof t32)) {
            kk1 kk1Var = x14Var instanceof kk1 ? (kk1) x14Var : null;
            if (kk1Var == null || (t14Var = kk1Var.Y) == null || !vr3.J(t14Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.po5
    public boolean K(sx4 sx4Var, jm1 jm1Var) {
        sx4Var.getClass();
        return !jm1Var.getAnnotations().k(qo5.a);
    }

    @Override // defpackage.xi8
    public boolean L(zk6 zk6Var) {
        E(zk6Var).getClass();
        return false;
    }

    @Override // defpackage.ax
    public int M() {
        return 2;
    }

    @Override // defpackage.hu4
    public boolean N(nt4 nt4Var) {
        return false;
    }

    public void O(boolean z, boolean z2, xz4 xz4Var, kx4 kx4Var, i48 i48Var, x67 x67Var, float f, float f2, lp2 lp2Var, int i, int i2) {
        float f3;
        float f4;
        float f5;
        float f6;
        kx4 kx4Var2;
        int i3;
        kx4 kx4Var3;
        ly4 ly4Var;
        float f7;
        boolean z3;
        lh7 lh7VarP;
        lh7 lh7VarP2;
        long j;
        lp2Var.X(1035477640);
        int i4 = i | (lp2Var.g(z) ? 4 : 2) | (lp2Var.g(z2) ? 32 : 16) | (lp2Var.f(xz4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 3072 | (lp2Var.f(i48Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (lp2Var.f(x67Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE);
        if ((i & 1572864) == 0) {
            if ((i2 & 64) == 0) {
                f3 = f;
                int i5 = lp2Var.c(f3) ? 1048576 : 524288;
                i4 |= i5;
            } else {
                f3 = f;
            }
            i4 |= i5;
        } else {
            f3 = f;
        }
        if ((i & 12582912) == 0) {
            if ((i2 & 128) == 0) {
                f4 = f2;
                int i6 = lp2Var.c(f4) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
                i4 |= i6;
            } else {
                f4 = f2;
            }
            i4 |= i6;
        } else {
            f4 = f2;
        }
        if (lp2Var.N(i4 & 1, (38347923 & i4) != 38347922)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                if ((i2 & 64) != 0) {
                    i4 &= -3670017;
                    f3 = 2.0f;
                }
                int i7 = i2 & 128;
                hx4 hx4Var = hx4.X;
                if (i7 != 0) {
                    i4 &= -29360129;
                    f4 = 1.0f;
                }
                i3 = i4;
                kx4Var3 = hx4Var;
            } else {
                lp2Var.Q();
                if ((i2 & 64) != 0) {
                    i4 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    i4 &= -29360129;
                }
                i3 = i4;
                kx4Var3 = kx4Var;
            }
            lp2Var.q();
            boolean zBooleanValue = ((Boolean) km4.s(xz4Var, lp2Var, (i3 >> 6) & 14).getValue()).booleanValue();
            float f8 = f4;
            long jC = i48Var.c(z, z2, zBooleanValue);
            ly4 ly4Var2 = ly4.f0;
            wf7 wf7VarQ0 = w39.q0(ly4Var2, lp2Var);
            if (z) {
                lp2Var.W(-1674507999);
                ly4Var = ly4Var2;
                f7 = f8;
                lh7VarP = oa7.a(jC, wf7VarQ0, null, lp2Var, 0, 12);
                z3 = false;
                lp2Var.p(false);
            } else {
                ly4Var = ly4Var2;
                f7 = f8;
                z3 = false;
                lp2Var.W(-1674427244);
                lh7VarP = z51.P(new dw0(jC), lp2Var);
                lp2Var.p(false);
            }
            wf7 wf7VarQ1 = w39.q0(ly4.Y, lp2Var);
            if (z) {
                lp2Var.W(-1674245832);
                lh7VarP2 = ri.a(zBooleanValue ? f3 : f7, wf7VarQ1, lp2Var);
                lp2Var.p(z3);
            } else {
                lp2Var.W(-1674063769);
                lh7VarP2 = z51.P(new kt1(f7), lp2Var);
                lp2Var.p(z3);
            }
            y05 y05VarP = z51.P(new d70(((kt1) lh7VarP2.getValue()).X, new fe7(((dw0) lh7VarP.getValue()).a)), lp2Var);
            if (!z) {
                j = i48Var.g;
            } else if (z2) {
                j = i48Var.h;
            } else {
                j = r11 != 0 ? i48Var.e : i48Var.f;
            }
            lh7 lh7VarA = oa7.a(j, w39.q0(ly4Var, lp2Var), null, lp2Var, 0, 12);
            d70 d70Var = (d70) y05VarP.getValue();
            g80.a(w79.s(kx4Var3.y(new c70(d70Var.a, d70Var.b, x67Var)), new gq6(x67Var, new a58(new a74(lh7VarA, lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 2)), (byte) 11)), lp2Var, 0);
            f6 = f3;
            f5 = f7;
            kx4Var2 = kx4Var3;
        } else {
            lp2Var.Q();
            f5 = f4;
            f6 = f3;
            kx4Var2 = kx4Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ce5(this, z, z2, xz4Var, kx4Var2, i48Var, x67Var, f6, f5, i, i2, (byte) 0);
        }
    }

    @Override // defpackage.xi8
    public rn2 P() {
        return null;
    }

    @Override // defpackage.xi8
    public ji8 Q(mh8 mh8Var) {
        if (mh8Var instanceof rw3) {
            return (rw3) mh8Var;
        }
        return null;
    }

    @Override // defpackage.z70
    public long R(int i, xr0 xr0Var) {
        return ((x78) xr0Var.e).k(i);
    }

    @Override // defpackage.xi8
    public dt7 S(zk6 zk6Var) {
        ww3 ww3Var = ww3.c;
        return new wb6(mb6.v((pw3) zk6Var));
    }

    public ih1 T(zk6 zk6Var) {
        zk6Var.getClass();
        if ((zk6Var instanceof u1) && ((u1) zk6Var).x()) {
            return (ih1) zk6Var;
        }
        return null;
    }

    @Override // defpackage.xi8
    public Collection V(zk6 zk6Var) {
        Q0(zk6Var);
        throw null;
    }

    @Override // defpackage.xi8
    public x14 W(x14 x14Var) {
        return ((u1) x14Var).N(true);
    }

    @Override // defpackage.qd7
    public boolean X(Object obj, Object obj2) {
        return dh3.f(obj, obj2);
    }

    @Override // defpackage.xi8
    public void Y(zk6 zk6Var) {
        zk6Var.getClass();
    }

    @Override // defpackage.xi8
    public int Z(mh8 mh8Var) {
        mh8Var.getClass();
        if (mh8Var instanceof zu3) {
            return yn0.o((zu3) mh8Var).size();
        }
        return 0;
    }

    @Override // defpackage.xi8
    public boolean a(ji8 ji8Var, mh8 mh8Var) {
        Q0(ji8Var);
        throw null;
    }

    @Override // defpackage.xi8
    public zk6 a0(x14 x14Var) {
        x14Var.getClass();
        fe2 fe2VarO0 = o0(x14Var);
        if (fe2VarO0 != null) {
            return h(fe2VarO0);
        }
        zk6 zk6VarT0 = t0(x14Var);
        zk6VarT0.getClass();
        return zk6VarT0;
    }

    @Override // defpackage.xi8
    public fo0 b0(da7 da7Var) {
        if (da7Var instanceof fo0) {
            return (fo0) da7Var;
        }
        return null;
    }

    @Override // defpackage.xi8
    public int c(x14 x14Var) {
        x14Var.getClass();
        return ((pw3) x14Var).L().size();
    }

    @Override // defpackage.xi8
    public boolean d(fo0 fo0Var) {
        return false;
    }

    @Override // defpackage.xi8
    public x14 d0(ArrayList arrayList) {
        Q0(this);
        throw null;
    }

    @Override // defpackage.k28
    public Map e(we6 we6Var) {
        return e02.X;
    }

    @Override // defpackage.xi8
    public bh8 e0(x14 x14Var) {
        Q0(x14Var);
        throw null;
    }

    @Override // defpackage.xi8
    public bh8 f0(eo0 eo0Var) {
        return new vw3(((xn0) eo0Var).X);
    }

    @Override // defpackage.xi8
    public zk6 g(zk6 zk6Var) {
        return ((u1) zk6Var).S(false);
    }

    @Override // defpackage.xi8
    public boolean g0(zk6 zk6Var, zk6 zk6Var2) {
        zk6Var.getClass();
        zk6Var2.getClass();
        return false;
    }

    @Override // defpackage.xi8
    public zk6 h(fe2 fe2Var) {
        u1 u1VarT = ((u1) fe2Var).T();
        u1VarT.getClass();
        return u1VarT;
    }

    @Override // defpackage.xi8
    public ji8 h0(mh8 mh8Var, int i) {
        Object obj = yn0.o((zu3) mh8Var).get(i);
        obj.getClass();
        return (rw3) obj;
    }

    @Override // defpackage.xi8
    public zk6 i(fe2 fe2Var) {
        u1 u1VarK = ((u1) fe2Var).K();
        u1VarK.getClass();
        return u1VarK;
    }

    @Override // defpackage.xi8
    public boolean i0(mh8 mh8Var, mh8 mh8Var2) {
        mh8Var.getClass();
        mh8Var2.getClass();
        return mh8Var.equals(mh8Var2);
    }

    @Override // defpackage.xi8
    public boolean j(bh8 bh8Var) {
        bh8Var.getClass();
        uw3 uw3Var = ((vw3) bh8Var).a;
        uw3 uw3Var2 = uw3.c;
        return dh3.f(uw3Var, uw3.c);
    }

    @Override // defpackage.xi8
    public boolean j0(zk6 zk6Var) {
        zk6 zk6VarT0 = t0(zk6Var);
        fo0 fo0Var = null;
        if (zk6VarT0 != null) {
            da7 da7VarF0 = F0(zk6VarT0);
            if (da7VarF0 instanceof fo0) {
                fo0Var = (fo0) da7VarF0;
            }
        }
        return fo0Var != null;
    }

    @Override // defpackage.xi8
    public int k(ah8 ah8Var) {
        ah8Var.getClass();
        if (ah8Var instanceof zk6) {
            return c((x14) ah8Var);
        }
        if (ah8Var instanceof at) {
            return ((at) ah8Var).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(ah8Var);
        kp5.o(sb, yb6.a.b(ah8Var.getClass()));
        return 0;
    }

    @Override // defpackage.xi8
    public dj8 l(bh8 bh8Var) {
        bh8Var.getClass();
        yw3 yw3Var = ((vw3) bh8Var).a.a;
        dj8 dj8Var = dj8.OUT;
        if (yw3Var == null) {
            return dj8Var;
        }
        int iOrdinal = yw3Var.ordinal();
        if (iOrdinal == 0) {
            return dj8.INV;
        }
        if (iOrdinal == 1) {
            return dj8.IN;
        }
        if (iOrdinal == 2) {
            return dj8Var;
        }
        b61.c();
        return null;
    }

    @Override // defpackage.xi8
    public boolean l0(x14 x14Var) {
        x14Var.getClass();
        return false;
    }

    @Override // defpackage.xi8
    public boolean m(x14 x14Var) {
        x14Var.getClass();
        Q0(x14Var);
        throw null;
    }

    @Override // defpackage.xi8
    public List n(ji8 ji8Var) {
        ji8Var.getClass();
        List<pw3> upperBounds = ((rw3) ji8Var).getUpperBounds();
        ArrayList arrayList = new ArrayList(xv0.Z(upperBounds, 10));
        for (pw3 pw3Var : upperBounds) {
            pw3Var.getClass();
            arrayList.add((x14) pw3Var);
        }
        return arrayList;
    }

    @Override // defpackage.xi8
    public void o(x14 x14Var) {
        x14Var.getClass();
    }

    @Override // defpackage.xi8
    public fe2 o0(x14 x14Var) {
        x14Var.getClass();
        if (!(x14Var instanceof u1) || ((u1) x14Var).K() == null) {
            return null;
        }
        return (fe2) x14Var;
    }

    @Override // defpackage.xi8
    public x14 p(bh8 bh8Var) {
        bh8Var.getClass();
        return (x14) ((vw3) bh8Var).a.b;
    }

    @Override // defpackage.xi8
    public mh8 p0(x14 x14Var) {
        x14Var.getClass();
        zk6 zk6VarT0 = t0(x14Var);
        if (zk6VarT0 == null) {
            zk6VarT0 = A(x14Var);
        }
        return E(zk6VarT0);
    }

    @Override // defpackage.xi8
    public boolean q(mh8 mh8Var) {
        return false;
    }

    @Override // defpackage.xi8
    public boolean q0(mh8 mh8Var) {
        return false;
    }

    @Override // defpackage.xi8
    public eo0 r(fo0 fo0Var) {
        return ((wn0) fo0Var).Z;
    }

    @Override // defpackage.xi8
    public boolean s(mh8 mh8Var) {
        return mh8Var instanceof zu3;
    }

    @Override // defpackage.xi8
    public zk6 s0(zk6 zk6Var) {
        List listL;
        int i;
        u1 u1Var = (u1) zk6Var;
        lv3 lv3VarM = u1Var.M();
        zu3 zu3Var = lv3VarM instanceof zu3 ? (zu3) lv3VarM : null;
        if (zu3Var != null && ((listL = u1Var.L()) == null || !listL.isEmpty())) {
            Iterator it = listL.iterator();
            while (it.hasNext()) {
                yw3 yw3Var = ((uw3) it.next()).a;
                yw3 yw3Var2 = yw3.X;
                if (yw3Var != yw3Var2) {
                    List listO = yn0.o(zu3Var);
                    if (listO.size() != listL.size()) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList(xv0.Z(listL, 10));
                    Iterator it2 = listL.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        uw3 uw3VarG0 = (uw3) it2.next();
                        yw3 yw3Var3 = uw3VarG0.a;
                        if (yw3Var3 != yw3Var2) {
                            pw3 pw3Var = uw3VarG0.b;
                            if (yw3Var3 != yw3.Y) {
                                pw3Var = null;
                            }
                            uw3 uw3Var = uw3.c;
                            uw3VarG0 = hi5.g0(new wn0(pw3Var, new xn0(uw3VarG0), false));
                        }
                        arrayList.add(uw3VarG0);
                    }
                    ww3 ww3Var = ww3.c;
                    List listO2 = yn0.o(zu3Var);
                    if (listO2.size() != arrayList.size()) {
                        StringBuilder sb = new StringBuilder("Params vs args count mismatch (");
                        sb.append(listO2.size());
                        sb.append(" != ");
                        sb.append(arrayList.size());
                        sb.append(") for class '");
                        sb.append(zu3Var);
                        bt.l(sb, "' with args: ", wv0.y0(arrayList, null, null, null, null, 63));
                        break;
                    }
                    ww3 ww3VarA = listO2.isEmpty() ? ww3.c.a(false) : new ww3(zp4.P(wv0.e1(listO2, arrayList)), false);
                    int size = listL.size();
                    for (i = 0; i < size; i++) {
                        uw3 uw3Var2 = (uw3) listL.get(i);
                        if (uw3Var2.a != yw3Var2) {
                            List upperBounds = ((rw3) listO.get(i)).getUpperBounds();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = upperBounds.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(ww3VarA.c((pw3) it3.next(), null));
                            }
                            if (uw3Var2.a == yw3.Z) {
                                pw3 pw3Var2 = uw3Var2.b;
                                pw3Var2.getClass();
                                arrayList2.add(pw3Var2);
                            }
                            pw3 pw3Var3 = ((uw3) arrayList.get(i)).b;
                            pw3Var3.getClass();
                            ((wn0) pw3Var3).Z.Y = arrayList2;
                        }
                    }
                    return new s97(zu3Var, arrayList, u1Var.z(), u1Var.t(), u1Var.f(), false, false, false, u1Var.v(), null);
                }
            }
        }
        return null;
    }

    @Override // defpackage.l32
    public void t(sx4 sx4Var, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + sx4Var.getName() + ", unresolved classes " + arrayList);
    }

    @Override // defpackage.xi8
    public zk6 t0(x14 x14Var) {
        x14Var.getClass();
        if (o0(x14Var) != null) {
            return null;
        }
        return (zk6) x14Var;
    }

    public String toString() {
        switch (this.X) {
            case 20:
                return "SingleLineCodepointTransformation";
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return "StructuralEqualityPolicy";
            case 22:
            default:
                return super.toString();
            case 23:
                return "TextFieldLineLimits.SingleLine";
        }
    }

    @Override // defpackage.xi8
    public boolean u(zk6 zk6Var) {
        zk6Var.getClass();
        if (!x0(p0(zk6Var))) {
            return false;
        }
        Q0(zk6Var);
        throw null;
    }

    @Override // defpackage.xi8
    public fo0 u0(zk6 zk6Var) {
        da7 da7VarF0 = F0(zk6Var);
        if (da7VarF0 instanceof fo0) {
            return (fo0) da7VarF0;
        }
        return null;
    }

    @Override // defpackage.xi8
    public boolean v(zk6 zk6Var) {
        zk6Var.getClass();
        mh8 mh8VarE = E(zk6Var);
        mh8VarE.getClass();
        return mh8VarE instanceof zu3;
    }

    @Override // defpackage.xi8
    public boolean v0(mh8 mh8Var) {
        return mh8Var.equals(yb6.a.b(Object.class));
    }

    @Override // defpackage.xi8
    public bh8 w(zk6 zk6Var, int i) {
        if (i < 0 || i >= c(zk6Var)) {
            return null;
        }
        return A0(zk6Var, i);
    }

    @Override // defpackage.xi8
    public boolean w0(fo0 fo0Var) {
        return false;
    }

    @Override // defpackage.xi8
    public dj8 x(ji8 ji8Var) {
        ji8Var.getClass();
        int iOrdinal = ((rw3) ji8Var).g0.ordinal();
        if (iOrdinal == 0) {
            return dj8.INV;
        }
        if (iOrdinal == 1) {
            return dj8.IN;
        }
        if (iOrdinal == 2) {
            return dj8.OUT;
        }
        b61.c();
        return null;
    }

    @Override // defpackage.xi8
    public boolean x0(mh8 mh8Var) {
        mh8Var.getClass();
        return mh8Var.equals(k65.Y);
    }

    @Override // defpackage.l29
    public h29 y(Context context, gi1 gi1Var) {
        b80 b80Var;
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            b80.b.getClass();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                b80Var = c80.X;
            } else if (i >= 29) {
                b80Var = oy1.j0;
            } else {
                b80Var = i >= 28 ? pz2.w0 : oy1.i0;
            }
            return new h29(new a80(b80Var.c(activity)), gi1Var.m(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            bt.q("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new h29(new Rect(0, 0, point.x, point.y), gi1Var.m(context));
    }

    @Override // defpackage.xi8
    public bh8 y0(ah8 ah8Var, int i) {
        ah8Var.getClass();
        if (ah8Var instanceof da7) {
            return A0((x14) ah8Var, i);
        }
        if (ah8Var instanceof at) {
            E e = ((at) ah8Var).get(i);
            e.getClass();
            return (bh8) e;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(ah8Var);
        kp5.o(sb, yb6.a.b(ah8Var.getClass()));
        return null;
    }

    @Override // defpackage.l32
    public void z(ld0 ld0Var) {
        throw new IllegalStateException("Cannot infer visibility for " + ld0Var);
    }

    @Override // defpackage.xi8
    public boolean z0(mh8 mh8Var) {
        if (!(mh8Var instanceof ev3)) {
            return false;
        }
        ev3 ev3Var = (ev3) mh8Var;
        return (ev3Var.j0() != ex4.FINAL || ev3Var.g0() == ts0.ENUM_CLASS || ev3Var.g0() == ts0.ENUM_ENTRY || ev3Var.g0() == ts0.ANNOTATION_CLASS) ? false : true;
    }

    @Override // defpackage.xi8
    public void n0(zk6 zk6Var) {
    }

    @Override // defpackage.xi8
    public void D0(zk6 zk6Var, mh8 mh8Var) {
    }

    @Override // defpackage.hu4
    public void b(nt4 nt4Var, boolean z) {
    }
}
