package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.IpPrefix;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jm4 {
    public static volatile Handler X;
    public static pk6 f0;
    public static Boolean i0;
    public static Boolean j0;
    public static Boolean k0;
    public static Boolean l0;
    public static final float[] Y = new float[91];
    public static final zy0 Z = new zy0(129671944, false, new dx0(15));
    public static final hd5 g0 = new hd5(false);
    public static final s86 h0 = new s86(0.0f, 0.0f, 10.0f, 10.0f);

    public jm4(boolean z) {
    }

    public static final vz4 A(b17 b17Var, gn2 gn2Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            y07 y07VarA = b17Var.a();
            LayoutNode layoutNode = y07VarA.c;
            if (layoutNode.L() && layoutNode.K()) {
                s86 s86VarG = y07VarA.g();
                vz4 vz4Var = new vz4(48);
                lr5 lr5Var = new lr5((byte) 12);
                lr5Var.F(os4.L(s86VarG));
                D(gn2Var, vz4Var, new lr5((byte) 12), lr5Var, y07VarA, y07VarA);
                return vz4Var;
            }
            vz4 vz4Var2 = gf3.a;
            vz4Var2.getClass();
            return vz4Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void B(gn2 gn2Var, vz4 vz4Var, lr5 lr5Var, lr5 lr5Var2, y07 y07Var, y07 y07Var2) {
        lr5 lr5Var3 = lr5Var;
        Region region = (Region) lr5Var3.Y;
        lr5 lr5Var4 = lr5Var2;
        Region region2 = (Region) lr5Var4.Y;
        LayoutNode layoutNode = y07Var2.c;
        LayoutNode layoutNode2 = y07Var2.c;
        if (!layoutNode.L() || !layoutNode2.K() || region2.isEmpty()) {
            if (y07Var2.n()) {
                C(vz4Var, y07Var, y07Var2);
                return;
            }
            return;
        }
        s86 s86VarM = y07Var2.m();
        if (s86VarM.h()) {
            nh1 nh1VarF = y07Var2.f();
            if (nh1VarF == null) {
                fd3 fd3Var = (fd3) layoutNode2.H0.f0;
                s86VarM = x(fd3Var).H(fd3Var, false);
            } else {
                jx4 jx4Var = ((jx4) nh1VarF).X;
                Object objG = y07Var2.d.X.g(s07.b);
                if (objG == null) {
                    objG = null;
                }
                s86VarM = ch3.s(jx4Var, objG != null, false);
            }
        }
        lf3 lf3VarL = os4.L(s86VarM);
        lr5Var3.F(lf3VarL);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = y07Var2.f;
            if (i == y07Var.f) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            vz4Var.h(i, new a17(y07Var2, new lf3(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List listI = y07Var2.i((4 & 1) != 0 ? !y07Var2.b : false, (4 & 2) == 0);
            int size = listI.size() - 1;
            while (-1 < size) {
                if (!((Boolean) gn2Var.B(listI.get(size))).booleanValue()) {
                    B(gn2Var, vz4Var, lr5Var3, lr5Var4, y07Var, (y07) listI.get(size));
                }
                size--;
                lr5Var3 = lr5Var;
                lr5Var4 = lr5Var2;
            }
            if (M(y07Var2)) {
                region2.op(lf3VarL.a, lf3VarL.b, lf3VarL.c, lf3VarL.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void C(vz4 vz4Var, y07 y07Var, y07 y07Var2) {
        LayoutNode layoutNode;
        y07 y07VarL = y07Var2.l();
        s86 s86VarG = (y07VarL == null || (layoutNode = y07VarL.c) == null || !layoutNode.L()) ? h0 : y07VarL.g();
        int i = y07Var2.f;
        if (i == y07Var.f) {
            i = -1;
        }
        vz4Var.h(i, new a17(y07Var2, os4.L(s86VarG)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0165  */
    /* JADX WARN: Code duplicated, block: B:82:0x0175  */
    /* JADX WARN: Code duplicated, block: B:83:0x017a  */
    public static final void D(gn2 gn2Var, vz4 vz4Var, lr5 lr5Var, lr5 lr5Var2, y07 y07Var, y07 y07Var2) {
        int size;
        boolean z;
        s86 s86VarS;
        gn2 gn2Var2 = gn2Var;
        vz4 vz4Var2 = vz4Var;
        int i = y07Var.f;
        Region region = (Region) lr5Var.Y;
        lr5 lr5Var3 = lr5Var2;
        Region region2 = (Region) lr5Var3.Y;
        LayoutNode layoutNode = y07Var2.c;
        t07 t07Var = y07Var2.d;
        LayoutNode layoutNode2 = y07Var2.c;
        int i2 = y07Var2.f;
        boolean z2 = (layoutNode.L() && layoutNode2.K()) ? false : true;
        if (!region2.isEmpty() || i2 == i) {
            if (!z2 || y07Var2.n()) {
                lf3 lf3VarL = os4.L(y07Var2.m());
                lr5Var.F(lf3VarL);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (y07Var2.n()) {
                        C(vz4Var2, y07Var, y07Var2);
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            vz4Var2.h(i2, new a17(y07Var2, new lf3(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                vz4Var2.h(i2, new a17(y07Var2, new lf3(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listI = y07Var2.i((4 & 1) != 0 ? !y07Var2.b : false, (4 & 2) == 0);
                if (t07Var.Z) {
                    y07 y07VarL = y07Var2.l();
                    while (true) {
                        if (y07VarL == null) {
                            y07VarL = null;
                            break;
                        }
                        s05 s05Var = y07VarL.d.X;
                        if (s05Var.c(c17.w) || s05Var.c(c17.v)) {
                            break;
                        } else {
                            y07VarL = y07VarL.l();
                        }
                    }
                    if (y07VarL == null) {
                        z = false;
                    } else {
                        i55 i55VarD = y07Var2.d();
                        if (i55VarD == null) {
                            i55VarD = null;
                        } else {
                            if (!i55VarD.V0().p0) {
                                i55VarD = null;
                            }
                            if (i55VarD == null) {
                                i55VarD = null;
                            }
                        }
                        i55 i55VarD2 = y07VarL.d();
                        if (i55VarD2 == null) {
                            i55VarD2 = null;
                        } else {
                            if (!i55VarD2.V0().p0) {
                                i55VarD2 = null;
                            }
                            if (i55VarD2 == null) {
                                i55VarD2 = null;
                            }
                        }
                        if (i55VarD == null || i55VarD2 == null) {
                            z = false;
                        } else {
                            s86 s86VarH = i55VarD2.H(i55VarD, false);
                            z = !s86VarH.equals(s86VarH.g(u70.n(0L, u15.R(i55VarD2.Z))));
                        }
                    }
                    if (z) {
                        lr5 lr5Var4 = new lr5((byte) 12);
                        nh1 nh1VarF = y07Var2.f();
                        if (nh1VarF == null) {
                            fd3 fd3Var = (fd3) layoutNode2.H0.f0;
                            s86VarS = x(fd3Var).H(fd3Var, false);
                        } else {
                            jx4 jx4Var = ((jx4) nh1VarF).X;
                            Object objG = t07Var.X.g(s07.b);
                            s86VarS = ch3.s(jx4Var, (objG == null ? null : objG) != null, false);
                        }
                        lr5Var4.F(os4.L(s86VarS));
                        int size2 = listI.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) gn2Var2.B(listI.get(size2))).booleanValue()) {
                                B(gn2Var2, vz4Var2, new lr5((byte) 12), lr5Var4, y07Var, (y07) listI.get(size2));
                            }
                            size2--;
                            vz4Var2 = vz4Var;
                        }
                    } else {
                        size = listI.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) gn2Var2.B(listI.get(size))).booleanValue()) {
                                D(gn2Var2, vz4Var, lr5Var, lr5Var3, y07Var, (y07) listI.get(size));
                            }
                            size--;
                            gn2Var2 = gn2Var;
                            lr5Var3 = lr5Var2;
                        }
                    }
                } else {
                    size = listI.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) gn2Var2.B(listI.get(size))).booleanValue()) {
                            D(gn2Var2, vz4Var, lr5Var, lr5Var3, y07Var, (y07) listI.get(size));
                        }
                        size--;
                        gn2Var2 = gn2Var;
                        lr5Var3 = lr5Var2;
                    }
                }
                if (M(y07Var2)) {
                    region2.op(lf3VarL.a, lf3VarL.b, lf3VarL.c, lf3VarL.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static IpPrefix E(String str) {
        Object rj6Var;
        qg5 qg5Var;
        str.getClass();
        try {
            if (Build.VERSION.SDK_INT < 33) {
                return null;
            }
            int i = 128;
            if (fm7.d0(str, "/", false)) {
                List listF0 = fm7.F0(str, new String[]{"/"}, 6);
                int i2 = Integer.parseInt((String) listF0.get(1));
                InetAddress byName = InetAddress.getByName((String) listF0.get(0));
                if (byName instanceof Inet4Address) {
                    i = (i2 < 0 || i2 >= 33) ? 32 : i2;
                } else if (!(byName instanceof Inet6Address) || (i2 >= 0 && i2 < 129)) {
                }
                qg5Var = new qg5(byName, Integer.valueOf(i));
            } else {
                InetAddress byName2 = InetAddress.getByName(str);
                qg5Var = new qg5(byName2, Integer.valueOf(byName2 instanceof Inet4Address ? 32 : 128));
            }
            rj6Var = e70.a((InetAddress) qg5Var.X, ((Number) qg5Var.Y).intValue());
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return (IpPrefix) (rj6Var instanceof rj6 ? null : rj6Var);
    }

    public static final kx4 I(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new i60(gn2Var));
    }

    public static kx4 J(kx4 kx4Var, float f, float f2, float f3, float f4, float f5, long j, x67 x67Var, boolean z, long j2, long j3, int i) {
        return kx4Var.y(new yt2((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1.0f : f2, (i & 4) != 0 ? 1.0f : f3, 0.0f, 0.0f, (i & 32) != 0 ? 0.0f : f4, 0.0f, 0.0f, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0.0f : f5, 8.0f, (i & 1024) != 0 ? gd8.b : j, (i & 2048) != 0 ? u70.e : x67Var, (i & 4096) != 0 ? false : z, null, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? bu2.a : j2, (i & 32768) != 0 ? bu2.a : j3, 0, 3, null, u24.e));
    }

    public static kx4 K(kx4 kx4Var, float f, float f2, float f3, float f4, x67 x67Var, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        long j = gd8.b;
        x67 x67Var2 = (i & 2048) != 0 ? u70.e : x67Var;
        long j2 = bu2.a;
        return J(kx4Var, f5, f6, f7, f8, 0.0f, j, x67Var2, false, j2, j2, 524288);
    }

    public static final boolean L(y07 y07Var) {
        i55 i55VarD = y07Var.d();
        s05 s05Var = y07Var.d.X;
        return (i55VarD != null ? i55VarD.e1() : false) || s05Var.c(c17.q) || s05Var.c(c17.p);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[LOOP:0: B:11:0x001d->B:24:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c A[SYNTHETIC] */
    public static final boolean M(y07 y07Var) {
        if (!L(y07Var)) {
            t07 t07Var = y07Var.d;
            if (t07Var.Z) {
                return true;
            }
            s05 s05Var = t07Var.X;
            Object[] objArr = s05Var.b;
            Object[] objArr2 = s05Var.c;
            long[] jArr = s05Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((e17) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    public static boolean N(String str) {
        Object rj6Var;
        boolean zY;
        str.getClass();
        try {
            List listF0 = fm7.F0(str, new String[]{"/"}, 6);
            if (listF0.size() == 2) {
                ss8 ss8Var = ss8.a;
                zY = false;
                if (ss8.y((String) listF0.get(0)) && TextUtils.isDigitsOnly((CharSequence) listF0.get(1))) {
                    int i = Integer.parseInt((String) listF0.get(1));
                    InetAddress byName = InetAddress.getByName((String) listF0.get(0));
                    if (byName instanceof Inet4Address) {
                        if (i >= 0 && i < 33) {
                            zY = true;
                        }
                    } else if ((byName instanceof Inet6Address) && i >= 0 && i < 129) {
                        zY = true;
                    }
                }
            } else {
                ss8 ss8Var2 = ss8.a;
                zY = ss8.y(str);
            }
            rj6Var = Boolean.valueOf(zY);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) != null) {
            rj6Var = Boolean.FALSE;
        }
        return ((Boolean) rj6Var).booleanValue();
    }

    public static boolean O(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (i0 == null) {
            i0 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        Boolean boolValueOf = j0;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            j0 = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            return !zc1.T() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static v27 P(rn2 rn2Var) {
        v27 v27Var = new v27();
        v27Var.f0 = mb6.w(v27Var, v27Var, rn2Var);
        return v27Var;
    }

    public static og7 Q(b71 b71Var, u61 u61Var, rn2 rn2Var, int i) {
        if ((i & 1) != 0) {
            u61Var = tp1.b;
        }
        h71 h71Var = new h71(oy1.p0, (byte) 0);
        b71Var.getClass();
        u61Var.getClass();
        return w51.G(b71Var, g33.K(u61Var, h71Var), null, rn2Var, 2);
    }

    public static final mo8 R(mo8 mo8Var, boolean z) {
        mo8Var.getClass();
        hh1 hh1VarJ = ra.j(mo8Var, z);
        if (hh1VarJ != null) {
            return hh1VarJ;
        }
        aa7 aa7VarS = S(mo8Var);
        return aa7VarS != null ? aa7VarS : mo8Var.r0(false);
    }

    public static final aa7 S(mo8 mo8Var) {
        qg3 qg3Var;
        lh8 lh8VarN0 = mo8Var.n0();
        qg3 qg3Var2 = lh8VarN0 instanceof qg3 ? (qg3) lh8VarN0 : null;
        if (qg3Var2 != null) {
            LinkedHashSet<t14> linkedHashSet = qg3Var2.Y;
            ArrayList arrayList = new ArrayList(xv0.Z(linkedHashSet, 10));
            boolean z = false;
            for (t14 t14VarR : linkedHashSet) {
                if (cj8.e(t14VarR)) {
                    t14VarR = R(t14VarR.q0(), false);
                    z = true;
                }
                arrayList.add(t14VarR);
            }
            if (z) {
                t14 t14VarR2 = qg3Var2.X;
                if (t14VarR2 == null) {
                    t14VarR2 = null;
                } else if (cj8.e(t14VarR2)) {
                    t14VarR2 = R(t14VarR2.q0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                qg3Var = new qg3(linkedHashSet2);
                qg3Var.X = t14VarR2;
            } else {
                qg3Var = null;
            }
            if (qg3Var != null) {
                return qg3Var.a();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0067 A[EDGE_INSN: B:109:0x0067->B:22:0x0067 BREAK  A[LOOP:2: B:16:0x0049->B:20:0x005a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a A[LOOP:2: B:16:0x0049->B:20:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a7  */
    public static hc0 T(nz2 nz2Var) {
        int i;
        int length;
        int length2;
        int i2;
        String string;
        String string2;
        nz2 nz2Var2 = nz2Var;
        int size = nz2Var2.size();
        int i3 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iV = -1;
        int iV2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iV3 = -1;
        int iV4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < size) {
            String strB = nz2Var2.b(i3);
            String strE = nz2Var2.e(i3);
            if (mm7.S(strB, "Cache-Control")) {
                if (str == null) {
                    str = strE;
                }
                i = 0;
                while (i < strE.length()) {
                    length = strE.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strE.length();
                            break;
                        }
                        i2 = size;
                        if (fm7.e0("=,;", strE.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = fm7.R0(strE.substring(i, length2)).toString();
                    if (length2 != strE.length() || strE.charAt(length2) == ',' || strE.charAt(length2) == ';') {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = ks8.a;
                        int length4 = strE.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strE.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strE.length();
                                break;
                            }
                        }
                        if (length3 >= strE.length() || strE.charAt(length3) != '\"') {
                            int length5 = strE.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strE.length();
                                    break;
                                }
                                int i4 = length5;
                                if (fm7.e0(",;", strE.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i4;
                            }
                            int i5 = length6;
                            string2 = fm7.R0(strE.substring(length3, length6)).toString();
                            i = i5;
                        } else {
                            int i6 = length3 + 1;
                            int iL0 = fm7.l0(strE, '\"', i6, 4);
                            string2 = strE.substring(i6, iL0);
                            i = iL0 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iV = ks8.v(string2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iV2 = ks8.v(string2, -1);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iV3 = ks8.v(string2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iV4 = ks8.v(string2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                    size = i2;
                }
                i3++;
                nz2Var2 = nz2Var;
                size = size;
            } else {
                if (mm7.S(strB, "Pragma")) {
                }
                i3++;
                nz2Var2 = nz2Var;
                size = size;
            }
            z = false;
            i = 0;
            while (i < strE.length()) {
                length = strE.length();
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        i2 = size;
                        length2 = strE.length();
                        break;
                    }
                    i2 = size;
                    if (fm7.e0("=,;", strE.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i2;
                }
                string = fm7.R0(strE.substring(i, length2)).toString();
                if (length2 != strE.length()) {
                    i = length2 + 1;
                    string2 = null;
                } else {
                    i = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iV = ks8.v(string2, -1);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iV2 = ks8.v(string2, -1);
                } else if ("private".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iV3 = ks8.v(string2, Integer.MAX_VALUE);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iV4 = ks8.v(string2, -1);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z9 = true;
                }
                size = i2;
            }
            i3++;
            nz2Var2 = nz2Var;
            size = size;
        }
        return new hc0(z2, z3, iV, iV2, z4, z5, z6, iV3, iV4, z7, z8, z9, !z ? null : str);
    }

    public static final zy0 U(int i, on2 on2Var, lp2 lp2Var) {
        Object objK = lp2Var.K();
        if (objK == zz0.a) {
            objK = new zy0(i, true, on2Var);
            lp2Var.g0(objK);
        }
        zy0 zy0Var = (zy0) objK;
        if (!dh3.f(zy0Var.Z, on2Var)) {
            boolean z = zy0Var.Z == null;
            zy0Var.Z = on2Var;
            if (!z && zy0Var.Y) {
                j86 j86Var = zy0Var.f0;
                if (j86Var != null) {
                    r01 r01Var = j86Var.a;
                    if (r01Var != null) {
                        r01Var.s(j86Var, null);
                    }
                    zy0Var.f0 = null;
                }
                ArrayList arrayList = zy0Var.g0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        j86 j86Var2 = (j86) arrayList.get(i2);
                        r01 r01Var2 = j86Var2.a;
                        if (r01Var2 != null) {
                            r01Var2.s(j86Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return zy0Var;
    }

    public static final ow2 V(lp2 lp2Var) {
        Object[] objArr = new Object[0];
        Object objK = lp2Var.K();
        if (objK == zz0.a) {
            objK = new tv2((byte) 12);
            lp2Var.g0(objK);
        }
        return (ow2) Y(objArr, ow2.c, (dn2) objK, lp2Var, 384);
    }

    public static final Object W(Object[] objArr, dn2 dn2Var, lp2 lp2Var) {
        return X(Arrays.copyOf(objArr, objArr.length), z91.b, dn2Var, lp2Var, 3456);
    }

    public static final Object X(Object[] objArr, bw6 bw6Var, dn2 dn2Var, lp2 lp2Var, int i) {
        Object[] objArr2;
        bw6 bw6Var2;
        Object obj;
        Object objE;
        long j = lp2Var.T;
        km4.q(36);
        String string = Long.toString(j, 36);
        string.getClass();
        bw6Var.getClass();
        kv6 kv6Var = (kv6) lp2Var.j(mv6.a);
        Object objK = lp2Var.K();
        Object obj2 = zz0.a;
        if (objK == obj2) {
            Object objY = (kv6Var == null || (objE = kv6Var.e(string)) == null) ? null : bw6Var.y(objE);
            if (objY == null) {
                objY = dn2Var.invoke();
            }
            objArr2 = objArr;
            bw6Var2 = bw6Var;
            Object hv6Var = new hv6(bw6Var2, kv6Var, string, objY, objArr2);
            lp2Var.g0(hv6Var);
            objK = hv6Var;
        } else {
            objArr2 = objArr;
            bw6Var2 = bw6Var;
        }
        hv6 hv6Var2 = (hv6) objK;
        Object objInvoke = Arrays.equals(objArr2, hv6Var2.g0) ? hv6Var2.f0 : null;
        if (objInvoke == null) {
            objInvoke = dn2Var.invoke();
        }
        boolean zH = lp2Var.h(hv6Var2) | ((((i & 112) ^ 48) > 32 && lp2Var.h(bw6Var2)) || (i & 48) == 32) | lp2Var.h(kv6Var) | lp2Var.f(string) | lp2Var.h(objInvoke) | lp2Var.h(objArr2);
        Object objK2 = lp2Var.K();
        if (zH || objK2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object wc6Var = new wc6(hv6Var2, bw6Var2, kv6Var, string, obj, objArr3, (byte) 0);
            lp2Var.g0(wc6Var);
            objK2 = wc6Var;
        } else {
            obj = objInvoke;
        }
        u70.q((dn2) objK2, lp2Var);
        return obj;
    }

    public static final Object Y(Object[] objArr, bw6 bw6Var, dn2 dn2Var, lp2 lp2Var, int i) {
        return X(Arrays.copyOf(objArr, objArr.length), bw6Var, dn2Var, lp2Var, ((i << 3) & 7168) | (i & 112) | 384);
    }

    public static final Object Z(rn2 rn2Var) {
        Thread.interrupted();
        return z51.R(b02.X, new ar6(rn2Var, null, (byte) 0));
    }

    public static final void a(mw2 mw2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        kx4 kx4Var2;
        lp2Var.X(-1029439887);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(mw2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (lp2Var.N(i3 & 1, (i3 & 19) != 18)) {
            kx4Var2 = hx4.X;
            zc1.g(mw2Var.a, kx4Var2, o88.a(((ds) lp2Var.j(es.a)).b, ((dp) lp2Var.j(ep.z)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var, i3 & 112, 504);
        } else {
            lp2Var.Q();
            kx4Var2 = kx4Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new sl((byte) 6, i, mw2Var, kx4Var2);
        }
    }

    public static final h76 a0(xe2 xe2Var, b71 b71Var, i87 i87Var, Object obj) {
        eb9 eb9VarV = v(xe2Var);
        oh7 oh7VarA = ph7.a(obj);
        return new h76(oh7VarA, w51.F(b71Var, (s61) eb9VarV.g0, i87Var.equals(h87.a) ? e71.X : e71.f0, new wu1(i87Var, (xe2) eb9VarV.Z, oh7VarA, obj, (q51) null)));
    }

    public static String b0(long j) {
        return "PointerId(value=" + j + ")";
    }

    public static final void c(dn2 dn2Var, vn1 vn1Var, final zy0 zy0Var, lp2 lp2Var, final int i) {
        int i2;
        Object hdVar;
        final dn2 dn2Var2 = dn2Var;
        final vn1 vn1Var2 = vn1Var;
        lp2Var.X(826668973);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(dn2Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (lp2Var.f(vn1Var2) ? 32 : 16);
        byte b = 0;
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            View view = (View) lp2Var.j(pc.f);
            fi1 fi1Var = (fi1) lp2Var.j(y01.h);
            z24 z24Var = (z24) lp2Var.j(y01.n);
            jp2 jp2VarJ0 = km4.j0(lp2Var);
            y05 y05VarP = z51.P(zy0Var, lp2Var);
            Object[] objArr = new Object[0];
            Object objK = lp2Var.K();
            Object obj = zz0.a;
            if (objK == obj) {
                objK = new x((byte) 12);
                lp2Var.g0(objK);
            }
            UUID uuid = (UUID) W(objArr, (dn2) objK, lp2Var);
            boolean zD = lp2Var.d(vn1Var2.g) | lp2Var.f(view) | lp2Var.f(fi1Var) | lp2Var.f(null);
            Object objK2 = lp2Var.K();
            if (zD || objK2 == obj) {
                oo1 oo1Var = new oo1(dn2Var2, vn1Var2, view, z24Var, fi1Var, uuid);
                zy0 zy0Var2 = new zy0(-1338939603, true, new fd(y05VarP, b));
                un1 un1Var = oo1Var.j0;
                un1Var.setParentCompositionContext(jp2VarJ0);
                un1Var.q0.setValue(zy0Var2);
                un1Var.u0 = true;
                un1Var.d();
                lp2Var.g0(oo1Var);
                objK2 = oo1Var;
            }
            oo1 oo1Var2 = (oo1) objK2;
            boolean zH = lp2Var.h(oo1Var2);
            Object objK3 = lp2Var.K();
            if (zH || objK3 == obj) {
                objK3 = new gd(oo1Var2, b);
                lp2Var.g0(objK3);
            }
            u70.a(oo1Var2, (gn2) objK3, lp2Var);
            boolean zH2 = lp2Var.h(oo1Var2) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | lp2Var.d(z24Var.ordinal());
            Object objK4 = lp2Var.K();
            if (zH2 || objK4 == obj) {
                hdVar = new hd(oo1Var2, dn2Var, vn1Var, z24Var, (byte) 0);
                dn2Var2 = dn2Var;
                vn1Var2 = vn1Var;
                lp2Var.g0(hdVar);
            } else {
                dn2Var2 = dn2Var;
                hdVar = objK4;
                vn1Var2 = vn1Var;
            }
            u70.q((dn2) hdVar, lp2Var);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: id
                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = w79.P(i | 1);
                    jm4.c(dn2Var2, vn1Var2, zy0Var, (lp2) obj2, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final Object c0(n17 n17Var, Object obj) {
        Object objB = n17Var.b(obj);
        if (!(objB instanceof tp0)) {
            return dn8.a;
        }
        return ((up0) z51.R(b02.X, new r0(n17Var, obj, null, (byte) 10))).a;
    }

    public static final aa7 d0(aa7 aa7Var, aa7 aa7Var2) {
        aa7Var.getClass();
        aa7Var2.getClass();
        return vr3.J(aa7Var) ? aa7Var : new g(aa7Var, aa7Var2);
    }

    public static final void e(kx4 kx4Var, rn2 rn2Var, lp2 lp2Var, int i) {
        lp2Var.X(1090521195);
        byte b = 2;
        int i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i | (lp2Var.h(rn2Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = ld.b;
                lp2Var.g0(objK);
            }
            xr4 xr4Var = (xr4) objK;
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
            uz0.j.getClass();
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4Var);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            rn2Var.K(lp2Var, Integer.valueOf((i3 >> 6) & 14));
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i9(b, i, kx4Var, rn2Var);
        }
    }

    public static final void f(final kx4 kx4Var, final b15 b15Var, final y05 y05Var, final ay6 ay6Var, final x67 x67Var, final long j, final float f, final zy0 zy0Var, lp2 lp2Var, final int i) {
        float f2;
        lp2Var.X(848986741);
        int i2 = i | (lp2Var.f(kx4Var) ? 4 : 2) | (lp2Var.f(b15Var) ? 32 : 16) | (lp2Var.f(ay6Var) ? 2048 : 1024) | (lp2Var.f(x67Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (lp2Var.e(j) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE) | (lp2Var.c(0.0f) ? 1048576 : 524288) | (lp2Var.c(f) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304) | (lp2Var.f(null) ? 67108864 : 33554432) | (lp2Var.h(zy0Var) ? 536870912 : 268435456);
        boolean z = false;
        if (lp2Var.N(i2 & 1, (i2 & 306783379) != 306783378)) {
            ce8 ce8VarN = rq7.n(b15Var, "DropDownMenu", lp2Var, ((i2 >> 3) & 14) | 48);
            rh5 rh5Var = ce8VarN.d;
            wf7 wf7VarQ0 = w39.q0(ly4.Y, lp2Var);
            wf7 wf7VarQ1 = w39.q0(ly4.f0, lp2Var);
            ug8 ug8Var = ys0.j0;
            boolean zBooleanValue = ((Boolean) ce8VarN.c()).booleanValue();
            lp2Var.W(143964305);
            float f3 = zBooleanValue ? 1.0f : 0.8f;
            lp2Var.p(false);
            Float fValueOf = Float.valueOf(f3);
            boolean zBooleanValue2 = ((Boolean) rh5Var.getValue()).booleanValue();
            lp2Var.W(143964305);
            float f4 = zBooleanValue2 ? 1.0f : 0.8f;
            lp2Var.p(false);
            Float fValueOf2 = Float.valueOf(f4);
            ce8VarN.f();
            lp2Var.W(-745957716);
            lp2Var.p(false);
            yd8 yd8VarH = rq7.h(ce8VarN, fValueOf, fValueOf2, wf7VarQ0, ug8Var, lp2Var, 0);
            boolean zBooleanValue3 = ((Boolean) ce8VarN.c()).booleanValue();
            lp2Var.W(892761509);
            float f5 = zBooleanValue3 ? 1.0f : 0.0f;
            lp2Var.p(false);
            Float fValueOf3 = Float.valueOf(f5);
            boolean zBooleanValue4 = ((Boolean) rh5Var.getValue()).booleanValue();
            lp2Var.W(892761509);
            float f6 = zBooleanValue4 ? 1.0f : 0.0f;
            lp2Var.p(false);
            Float fValueOf4 = Float.valueOf(f6);
            ce8VarN.f();
            lp2Var.W(2839488);
            lp2Var.p(false);
            yd8 yd8VarH2 = rq7.h(ce8VarN, fValueOf3, fValueOf4, wf7VarQ1, ug8Var, lp2Var, 0);
            boolean zBooleanValue5 = ((Boolean) lp2Var.j(qe3.a)).booleanValue();
            boolean zG = lp2Var.g(zBooleanValue5) | lp2Var.f(yd8VarH) | ((i2 & 112) == 32) | lp2Var.f(yd8VarH2);
            Object objK = lp2Var.K();
            if (zG || objK == zz0.a) {
                f2 = 0.0f;
                Object xt4Var = new xt4(zBooleanValue5, b15Var, y05Var, yd8VarH, yd8VarH2);
                lp2Var.g0(xt4Var);
                objK = xt4Var;
            } else {
                f2 = 0.0f;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            ay7.a(I(hx4.X, (gn2) objK), x67Var, j, 0L, f2, f, U(-1463404422, new zt4(kx4Var, ay6Var, zy0Var, z), lp2Var), lp2Var, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(b15Var, y05Var, ay6Var, x67Var, j, f, zy0Var, i) { // from class: yt4
                public final /* synthetic */ b15 Y;
                public final /* synthetic */ y05 Z;
                public final /* synthetic */ ay6 f0;
                public final /* synthetic */ x67 g0;
                public final /* synthetic */ long h0;
                public final /* synthetic */ float i0;
                public final /* synthetic */ zy0 j0;

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(385);
                    jm4.f(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void h(zy0 zy0Var, dn2 dn2Var, kx4 kx4Var, rn2 rn2Var, boolean z, qt4 qt4Var, gg5 gg5Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-1325192924);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(zy0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(dn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.h(rn2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.h(null) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= lp2Var.g(z) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= lp2Var.f(qt4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= lp2Var.f(gg5Var) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= lp2Var.f(null) ? 67108864 : 33554432;
        }
        if (lp2Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            kx4 kx4VarW = os4.w(b.j(x97.j(kx4Var, null, hl6.a(0.0f, 6, 0L, true), z, null, dn2Var, 24).y(b.a), 112.0f, 48.0f, 280.0f, 8), gg5Var);
            wq6 wq6VarA = vq6.a(ht.a, pz2.o0, lp2Var, 48);
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarW);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, wq6VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            dx0 dx0Var = pz2.C0;
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                p61.v(I, lp2Var, I, dx0Var);
            }
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            u78.a(((wj8) lp2Var.j(yj8.a)).m, U(865999929, new au4(rn2Var, qt4Var, z, zy0Var), lp2Var), lp2Var, 48);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new u43(zy0Var, dn2Var, kx4Var, rn2Var, z, qt4Var, gg5Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void i(b83 b83Var, kx4 kx4Var, ow2 ow2Var, tn2 tn2Var, lp2 lp2Var, int i, int i2) {
        int i3;
        kx4 kx4Var2;
        int i4;
        int i5;
        tn2 tn2Var2;
        int i6;
        boolean z;
        kx4 kx4Var3;
        j86 j86VarR;
        boolean z2;
        boolean z3;
        Object objK;
        int i7;
        b83Var.getClass();
        lp2Var.X(-1254636094);
        byte b = 2;
        if ((i & 6) == 0) {
            i3 = (lp2Var.f(b83Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                kx4Var2 = kx4Var;
                i3 |= lp2Var.f(kx4Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (lp2Var.f(ow2Var)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
            }
            i4 = i3 | 3072;
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    tn2Var2 = tn2Var;
                    if (lp2Var.h(tn2Var2)) {
                        i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (lp2Var.N(i4 & 1, z)) {
                    lp2Var.S();
                    if ((i & 1) != 0 || lp2Var.x()) {
                        if (i8 != 0) {
                            kx4Var3 = hx4.X;
                        } else {
                            kx4Var3 = kx4Var2;
                        }
                        if (i5 != 0) {
                            tn2Var2 = oc.b;
                        }
                    } else {
                        lp2Var.Q();
                        kx4Var3 = kx4Var2;
                    }
                    lp2Var.q();
                    boolean zBooleanValue = ((Boolean) ow2Var.b.getValue()).booleanValue();
                    or5 or5Var = new or5(30);
                    jm6 jm6Var = ((tr) lp2Var.j(ur.a)).a.a;
                    long j = ((dp) lp2Var.j(ep.z)).b.a;
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((((i4 & 896) ^ 384) <= 256 && lp2Var.f(ow2Var)) || (i4 & 384) == 256);
                    objK = lp2Var.K();
                    if (z3 || objK == zz0.a) {
                        objK = new tb2(ow2Var, (byte) 6);
                        lp2Var.g0(objK);
                    }
                    ye.a(zBooleanValue, (dn2) objK, kx4Var3, 0L, null, or5Var, jm6Var, j, 0.0f, U(780941949, new p90(b83Var, ow2Var, tn2Var2, b), lp2Var), lp2Var, ((i4 << 3) & 896) | 196608);
                    tn2Var2 = tn2Var2;
                } else {
                    lp2Var.Q();
                    kx4Var3 = kx4Var2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new xf(b83Var, kx4Var3, ow2Var, tn2Var2, i, i2, (byte) 2);
                }
            }
            i4 = i3 | 27648;
            tn2Var2 = tn2Var;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (lp2Var.N(i4 & 1, z)) {
                lp2Var.S();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        kx4Var3 = hx4.X;
                    } else {
                        kx4Var3 = kx4Var2;
                    }
                    if (i5 != 0) {
                        tn2Var2 = oc.b;
                    }
                } else {
                    if (i8 != 0) {
                        kx4Var3 = hx4.X;
                    } else {
                        kx4Var3 = kx4Var2;
                    }
                    if (i5 != 0) {
                        tn2Var2 = oc.b;
                    }
                }
                lp2Var.q();
                boolean zBooleanValue2 = ((Boolean) ow2Var.b.getValue()).booleanValue();
                or5 or5Var2 = new or5(30);
                jm6 jm6Var2 = ((tr) lp2Var.j(ur.a)).a.a;
                long j2 = ((dp) lp2Var.j(ep.z)).b.a;
                if ((i4 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((((i4 & 896) ^ 384) <= 256 && lp2Var.f(ow2Var)) || (i4 & 384) == 256);
                objK = lp2Var.K();
                if (z3) {
                    objK = new tb2(ow2Var, (byte) 6);
                    lp2Var.g0(objK);
                } else {
                    objK = new tb2(ow2Var, (byte) 6);
                    lp2Var.g0(objK);
                }
                ye.a(zBooleanValue2, (dn2) objK, kx4Var3, 0L, null, or5Var2, jm6Var2, j2, 0.0f, U(780941949, new p90(b83Var, ow2Var, tn2Var2, b), lp2Var), lp2Var, ((i4 << 3) & 896) | 196608);
                tn2Var2 = tn2Var2;
            } else {
                lp2Var.Q();
                kx4Var3 = kx4Var2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new xf(b83Var, kx4Var3, ow2Var, tn2Var2, i, i2, (byte) 2);
            }
        }
        i3 |= 48;
        kx4Var2 = kx4Var;
        if ((i & 384) == 0) {
            if (lp2Var.f(ow2Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        i4 = i3 | 3072;
        i5 = i2 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                tn2Var2 = tn2Var;
                if (lp2Var.h(tn2Var2)) {
                    i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (lp2Var.N(i4 & 1, z)) {
                lp2Var.S();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        kx4Var3 = hx4.X;
                    } else {
                        kx4Var3 = kx4Var2;
                    }
                    if (i5 != 0) {
                        tn2Var2 = oc.b;
                    }
                } else {
                    if (i8 != 0) {
                        kx4Var3 = hx4.X;
                    } else {
                        kx4Var3 = kx4Var2;
                    }
                    if (i5 != 0) {
                        tn2Var2 = oc.b;
                    }
                }
                lp2Var.q();
                boolean zBooleanValue3 = ((Boolean) ow2Var.b.getValue()).booleanValue();
                or5 or5Var3 = new or5(30);
                jm6 jm6Var3 = ((tr) lp2Var.j(ur.a)).a.a;
                long j3 = ((dp) lp2Var.j(ep.z)).b.a;
                if ((i4 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((((i4 & 896) ^ 384) <= 256 && lp2Var.f(ow2Var)) || (i4 & 384) == 256);
                objK = lp2Var.K();
                if (z3) {
                    objK = new tb2(ow2Var, (byte) 6);
                    lp2Var.g0(objK);
                } else {
                    objK = new tb2(ow2Var, (byte) 6);
                    lp2Var.g0(objK);
                }
                ye.a(zBooleanValue3, (dn2) objK, kx4Var3, 0L, null, or5Var3, jm6Var3, j3, 0.0f, U(780941949, new p90(b83Var, ow2Var, tn2Var2, b), lp2Var), lp2Var, ((i4 << 3) & 896) | 196608);
                tn2Var2 = tn2Var2;
            } else {
                lp2Var.Q();
                kx4Var3 = kx4Var2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new xf(b83Var, kx4Var3, ow2Var, tn2Var2, i, i2, (byte) 2);
            }
        }
        i4 = i3 | 27648;
        tn2Var2 = tn2Var;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (lp2Var.N(i4 & 1, z)) {
            lp2Var.S();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    kx4Var3 = hx4.X;
                } else {
                    kx4Var3 = kx4Var2;
                }
                if (i5 != 0) {
                    tn2Var2 = oc.b;
                }
            } else {
                if (i8 != 0) {
                    kx4Var3 = hx4.X;
                } else {
                    kx4Var3 = kx4Var2;
                }
                if (i5 != 0) {
                    tn2Var2 = oc.b;
                }
            }
            lp2Var.q();
            boolean zBooleanValue4 = ((Boolean) ow2Var.b.getValue()).booleanValue();
            or5 or5Var4 = new or5(30);
            jm6 jm6Var4 = ((tr) lp2Var.j(ur.a)).a.a;
            long j4 = ((dp) lp2Var.j(ep.z)).b.a;
            if ((i4 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | ((((i4 & 896) ^ 384) <= 256 && lp2Var.f(ow2Var)) || (i4 & 384) == 256);
            objK = lp2Var.K();
            if (z3) {
                objK = new tb2(ow2Var, (byte) 6);
                lp2Var.g0(objK);
            } else {
                objK = new tb2(ow2Var, (byte) 6);
                lp2Var.g0(objK);
            }
            ye.a(zBooleanValue4, (dn2) objK, kx4Var3, 0L, null, or5Var4, jm6Var4, j4, 0.0f, U(780941949, new p90(b83Var, ow2Var, tn2Var2, b), lp2Var), lp2Var, ((i4 << 3) & 896) | 196608);
            tn2Var2 = tn2Var2;
        } else {
            lp2Var.Q();
            kx4Var3 = kx4Var2;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new xf(b83Var, kx4Var3, ow2Var, tn2Var2, i, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0131  */
    /* JADX WARN: Code duplicated, block: B:79:0x013b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0177  */
    /* JADX WARN: Code duplicated, block: B:85:0x0183  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void j(final lf4 lf4Var, final oh2 oh2Var, final gn2 gn2Var, final kx4 kx4Var, dn2 dn2Var, boolean z, boolean z2, lp2 lp2Var, final int i, final int i2) {
        dn2 dn2Var2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        final dn2 dn2Var3;
        final boolean z6;
        final boolean z7;
        j86 j86VarR;
        dn2 dn2Var4;
        float fS;
        boolean zC;
        Object objK;
        dv1 dv1Var;
        be beVar;
        mj0 mj0Var;
        Object objK2;
        Object objK3;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objK4;
        lf4Var.getClass();
        gn2Var.getClass();
        lp2Var.X(1345803416);
        int i6 = i | (lp2Var.f(lf4Var) ? 4 : 2) | (lp2Var.f(oh2Var) ? 32 : 16) | (lp2Var.h(gn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 = i6 | 24576;
            dn2Var2 = dn2Var;
        } else {
            dn2Var2 = dn2Var;
            i3 = i6 | (lp2Var.h(dn2Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i4 = i3 | 196608;
            z3 = z;
        } else {
            z3 = z;
            i4 = i3 | (lp2Var.g(z3) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE);
        }
        int i9 = i2 & 64;
        if (i9 == 0) {
            if ((i & 1572864) == 0) {
                z4 = z2;
                i4 |= lp2Var.g(z4) ? 1048576 : 524288;
            }
            i5 = i4;
            if ((599187 & i5) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (lp2Var.N(i5 & 1, z5)) {
                if (i7 != 0) {
                    dn2Var4 = null;
                } else {
                    dn2Var4 = dn2Var2;
                }
                if (i8 != 0) {
                    z3 = false;
                }
                if (i9 != 0) {
                    z4 = true;
                }
                fS = os4.S(92.0f, lp2Var);
                zC = lp2Var.c(fS);
                objK = lp2Var.K();
                dv1Var = dv1.X;
                beVar = zz0.a;
                if (zC || objK == beVar) {
                    mj0Var = new mj0((byte) 17);
                    mj0Var.w(dv1Var, 0.0f);
                    if (z4) {
                        mj0Var.w(dv1.Y, fS);
                    }
                    ArrayList arrayList = (ArrayList) mj0Var.Y;
                    float[] fArr = (float[]) mj0Var.Z;
                    int size = arrayList.size();
                    dh3.n(size, fArr.length);
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                    fArrCopyOfRange.getClass();
                    objK = new ke1(arrayList, fArrCopyOfRange);
                    lp2Var.g0(objK);
                }
                ke1 ke1Var = (ke1) objK;
                objK2 = lp2Var.K();
                if (objK2 == beVar) {
                    objK2 = new la(dv1Var);
                    lp2Var.g0(objK2);
                }
                la laVar = (la) objK2;
                objK3 = lp2Var.K();
                if (objK3 == beVar) {
                    objK3 = u70.D(lp2Var);
                    lp2Var.g0(objK3);
                }
                b71 b71Var = (b71) objK3;
                zy0 zy0VarU = U(-779428643, new o90((Object) gn2Var, (Object) lf4Var, (byte) 7), lp2Var);
                if ((i5 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i5 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z8 | z9;
                objK4 = lp2Var.K();
                if (z10 || objK4 == beVar) {
                    objK4 = new zw2(gn2Var, lf4Var, (byte) 12);
                    lp2Var.g0(objK4);
                }
                boolean z11 = z3;
                w51.b(z11, dv1Var, ke1Var, zy0VarU, kx4Var, laVar, false, (gn2) objK4, null, U(1568754915, new df4(lf4Var, gn2Var, oh2Var, b71Var, dn2Var4, laVar, (byte) 0), lp2Var), lp2Var, ((i5 >> 15) & 14) | 805530672);
                z6 = z11;
                dn2Var3 = dn2Var4;
            } else {
                lp2Var.Q();
                dn2Var3 = dn2Var2;
                z6 = z3;
            }
            z7 = z4;
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: ef4
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        jm4.j(lf4Var, oh2Var, gn2Var, kx4Var, dn2Var3, z6, z7, (lp2) obj, w79.P(i | 1), i2);
                        return dn8.a;
                    }
                };
            }
        }
        i4 |= 1572864;
        z4 = z2;
        i5 = i4;
        if ((599187 & i5) != 599186) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (lp2Var.N(i5 & 1, z5)) {
            if (i7 != 0) {
                dn2Var4 = null;
            } else {
                dn2Var4 = dn2Var2;
            }
            if (i8 != 0) {
                z3 = false;
            }
            if (i9 != 0) {
                z4 = true;
            }
            fS = os4.S(92.0f, lp2Var);
            zC = lp2Var.c(fS);
            objK = lp2Var.K();
            dv1Var = dv1.X;
            beVar = zz0.a;
            if (zC) {
                mj0Var = new mj0((byte) 17);
                mj0Var.w(dv1Var, 0.0f);
                if (z4) {
                    mj0Var.w(dv1.Y, fS);
                }
                ArrayList arrayList2 = (ArrayList) mj0Var.Y;
                float[] fArr2 = (float[]) mj0Var.Z;
                int size2 = arrayList2.size();
                dh3.n(size2, fArr2.length);
                float[] fArrCopyOfRange2 = Arrays.copyOfRange(fArr2, 0, size2);
                fArrCopyOfRange2.getClass();
                objK = new ke1(arrayList2, fArrCopyOfRange2);
                lp2Var.g0(objK);
            } else {
                mj0Var = new mj0((byte) 17);
                mj0Var.w(dv1Var, 0.0f);
                if (z4) {
                    mj0Var.w(dv1.Y, fS);
                }
                ArrayList arrayList3 = (ArrayList) mj0Var.Y;
                float[] fArr3 = (float[]) mj0Var.Z;
                int size3 = arrayList3.size();
                dh3.n(size3, fArr3.length);
                float[] fArrCopyOfRange3 = Arrays.copyOfRange(fArr3, 0, size3);
                fArrCopyOfRange3.getClass();
                objK = new ke1(arrayList3, fArrCopyOfRange3);
                lp2Var.g0(objK);
            }
            ke1 ke1Var2 = (ke1) objK;
            objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = new la(dv1Var);
                lp2Var.g0(objK2);
            }
            la laVar2 = (la) objK2;
            objK3 = lp2Var.K();
            if (objK3 == beVar) {
                objK3 = u70.D(lp2Var);
                lp2Var.g0(objK3);
            }
            b71 b71Var2 = (b71) objK3;
            zy0 zy0VarU2 = U(-779428643, new o90((Object) gn2Var, (Object) lf4Var, (byte) 7), lp2Var);
            if ((i5 & 896) == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i5 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z8 | z9;
            objK4 = lp2Var.K();
            if (z10) {
                objK4 = new zw2(gn2Var, lf4Var, (byte) 12);
                lp2Var.g0(objK4);
            } else {
                objK4 = new zw2(gn2Var, lf4Var, (byte) 12);
                lp2Var.g0(objK4);
            }
            boolean z12 = z3;
            w51.b(z12, dv1Var, ke1Var2, zy0VarU2, kx4Var, laVar2, false, (gn2) objK4, null, U(1568754915, new df4(lf4Var, gn2Var, oh2Var, b71Var2, dn2Var4, laVar2, (byte) 0), lp2Var), lp2Var, ((i5 >> 15) & 14) | 805530672);
            z6 = z12;
            dn2Var3 = dn2Var4;
        } else {
            lp2Var.Q();
            dn2Var3 = dn2Var2;
            z6 = z3;
        }
        z7 = z4;
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: ef4
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jm4.j(lf4Var, oh2Var, gn2Var, kx4Var, dn2Var3, z6, z7, (lp2) obj, w79.P(i | 1), i2);
                    return dn8.a;
                }
            };
        }
    }

    public static final void k(lf4 lf4Var, dn2 dn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        lp2 lp2Var2 = lp2Var;
        lp2Var2.X(2130491452);
        int i2 = i | (lp2Var2.f(lf4Var) ? 4 : 2) | (lp2Var2.h(dn2Var) ? 32 : 16) | (lp2Var2.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (lp2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            o50 o50Var = pz2.o0;
            kx4 kx4VarX = vj8.x(u15.f(kx4Var, ys0.y(lp2Var2).b.b, u70.e), false, null, null, null, dn2Var, lp2Var2, 31);
            wq6 wq6VarA = vq6.a(ht.a, o50Var, lp2Var2, 48);
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
            pn7.m(dx0Var, lp2Var2, wq6VarA);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var2, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var2, numValueOf);
            pn7.l(lp2Var2);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var2, kx4VarQ);
            hx4 hx4Var = hx4.X;
            ch3.f(lp2Var2, b.k(hx4Var, 16.0f));
            ft ftVar = new ft(2.0f, new bt());
            kx4 kx4VarZ = os4.z(os4.z(new d44(1.0f, true), 0.0f, 7.0f, 1), 0.0f, 12.0f, 1);
            tw0 tw0VarA = rw0.a(ftVar, pz2.q0, lp2Var2, 6);
            int iHashCode2 = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL2 = lp2Var2.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var2, kx4VarZ);
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(dx0Var, lp2Var2, tw0VarA);
            pn7.m(dx0Var2, lp2Var2, kl5VarL2);
            oi0.u(iHashCode2, lp2Var2, dx0Var3, lp2Var2);
            pn7.m(dx0Var4, lp2Var2, kx4VarQ2);
            String str = lf4Var.a;
            FillElement fillElement = b.a;
            zc1.g(str, fillElement, o88.a(ys0.D(lp2Var2).b, ys0.y(lp2Var2).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 1, 0, false, null, lp2Var2, 12779568, 344);
            lp2Var2 = lp2Var;
            zc1.g(lf4Var.c, fillElement, o88.a(ys0.D(lp2Var).d, ys0.y(lp2Var).c.c, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 1, 0, false, null, lp2Var2, 12779568, 344);
            lp2Var2.p(true);
            ch3.f(lp2Var2, b.k(hx4Var, 12.0f));
            zc1.g(lf4Var.d, null, o88.a(ys0.D(lp2Var2).c, ys0.y(lp2Var2).c.c, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 1, 0, false, null, lp2Var2, 12779520, 346);
            ch3.f(lp2Var2, b.k(hx4Var, 12.0f));
            os4.a(w45.J(), b.g(hx4Var, 20.0f), lf4Var.a, ys0.y(lp2Var2).c.b, lp2Var2, 48, 0);
            ch3.f(lp2Var2, b.k(hx4Var, 12.0f));
            lp2Var2.p(true);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) lf4Var, (Object) dn2Var, kx4Var, i, (byte) 10);
        }
    }

    public static final void l(final long j, final o88 o88Var, final rn2 rn2Var, lp2 lp2Var, final int i) {
        int i2;
        lp2Var.X(-684938728);
        if ((i & 6) == 0) {
            i2 = (lp2Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(o88Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(rn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ox1 ox1Var = u78.a;
            mb6.b(new t06[]{j41.a.a(new dw0(j)), ox1Var.a(((o88) lp2Var.j(ox1Var)).d(o88Var))}, rn2Var, lp2Var, ((i2 >> 3) & 112) | 8);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: s06
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    jm4.l(j, o88Var, rn2Var, (lp2) obj, w79.P(i | 1));
                    return dn8.a;
                }
            };
        }
    }

    public static final f76 m(u77 u77Var) {
        return new f76(u77Var, null);
    }

    public static final h76 n(oh7 oh7Var) {
        return new h76(oh7Var, null);
    }

    public static final int p(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final s86 q(y24 y24Var) {
        y24 y24VarY = y24Var.y();
        return y24VarY != null ? y24VarY.H(y24Var, true) : new s86(0.0f, 0.0f, (int) (y24Var.j() >> 32), (int) (y24Var.j() & 4294967295L));
    }

    public static final s86 r(y24 y24Var, boolean z) {
        y24 y24VarX = x(y24Var);
        float fJ = (int) (y24VarX.j() >> 32);
        float fJ2 = (int) (y24VarX.j() & 4294967295L);
        s86 s86VarH = y24VarX.H(y24Var, z);
        float f = s86VarH.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fJ) {
                f = fJ;
            }
        }
        float f2 = s86VarH.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fJ2) {
                f2 = fJ2;
            }
        }
        float f3 = s86VarH.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fJ) {
                fJ = f3;
            }
            f3 = fJ;
        }
        float f4 = s86VarH.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fJ2) {
                fJ2 = f5;
            }
            f4 = fJ2;
        }
        if (f == f3 || f2 == f4) {
            return s86.e;
        }
        long jB = y24VarX.b((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jB2 = y24VarX.b((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jB3 = y24VarX.b((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jB4 = y24VarX.b((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jB4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jB3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jB & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jB2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jB4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jB3 & 4294967295L));
        return new s86(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final void s(gn2 gn2Var, Object obj, s61 s61Var) {
        xl8 xl8VarT = t(gn2Var, obj, null);
        if (xl8VarT != null) {
            vr3.F(s61Var, xl8VarT);
        }
    }

    public static final xl8 t(gn2 gn2Var, Object obj, xl8 xl8Var) {
        try {
            gn2Var.B(obj);
            return xl8Var;
        } catch (Throwable th) {
            if (xl8Var == null || xl8Var.getCause() == th) {
                return new xl8(oi0.k(obj, "Exception in undelivered element handler for "), th);
            }
            gv3.g(xl8Var, th);
            return xl8Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ed A[Catch: all -> 0x0129, TRY_LEAVE, TryCatch #2 {all -> 0x0129, blocks: (B:50:0x00e7, B:52:0x00ed), top: B:76:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0118 A[LOOP:0: B:76:0x00e7->B:57:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0117 A[SYNTHETIC] */
    public static final Object u(v27 v27Var, s92 s92Var, kt ktVar, oi5 oi5Var, boolean z, boolean z2, r10 r10Var) throws Throwable {
        c cVar;
        kt ktVar2;
        v27 v27Var2;
        boolean z3;
        s92 s92Var2;
        oi5 oi5VarA;
        kt ktVar3;
        oi5 oi5Var2;
        boolean z4;
        Iterator it;
        kt ktVar4;
        oi5 oi5Var3;
        boolean z5;
        boolean z6;
        c cVar2;
        s92 s92Var3;
        v27 v27Var3;
        oi5 oi5Var4 = oi5Var;
        boolean z7 = z2;
        if (r10Var instanceof c) {
            cVar = (c) r10Var;
            int i = cVar.n0;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.n0 = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(r10Var);
            }
        } else {
            cVar = new c(r10Var);
        }
        Object obj = cVar.m0;
        int i2 = cVar.n0;
        dn8 dn8Var = dn8.a;
        oi5 oi5Var5 = null;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(obj);
            if (!z7) {
                cVar.f0 = v27Var;
                cVar.g0 = s92Var;
                cVar.h0 = ktVar;
                cVar.i0 = oi5Var4;
                cVar.k0 = z;
                cVar.l0 = z7;
                cVar.n0 = 1;
                v27Var.b(cVar, oi5Var4);
                return c71Var;
            }
            ktVar2 = ktVar;
            v27Var2 = v27Var;
            z3 = z;
            s92Var2 = s92Var;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z8 = cVar.l0;
                boolean z9 = cVar.k0;
                it = cVar.j0;
                oi5 oi5Var6 = cVar.i0;
                ktVar3 = cVar.h0;
                s92 s92Var4 = cVar.g0;
                v27 v27Var4 = cVar.f0;
                try {
                    w39.n0(obj);
                    z4 = z8;
                    z3 = z9;
                    oi5Var2 = oi5Var6;
                    ktVar2 = ktVar3;
                    s92Var2 = s92Var4;
                    v27Var2 = v27Var4;
                    while (it.hasNext()) {
                        try {
                            oi5Var3 = (oi5) it.next();
                            cVar.f0 = v27Var2;
                            cVar.g0 = s92Var2;
                            cVar.h0 = ktVar2;
                            cVar.i0 = oi5Var2;
                            cVar.j0 = it;
                            cVar.k0 = z3;
                            cVar.l0 = z4;
                            cVar.n0 = 2;
                            z5 = z3;
                            z6 = z4;
                            cVar2 = cVar;
                            ktVar4 = ktVar2;
                            s92Var3 = s92Var2;
                            v27Var3 = v27Var2;
                            try {
                                if (u(v27Var3, s92Var3, ktVar4, oi5Var3, z5, z6, cVar2) == c71Var) {
                                    return c71Var;
                                }
                                v27Var2 = v27Var3;
                                s92Var2 = s92Var3;
                                ktVar2 = ktVar4;
                                z3 = z5;
                                z4 = z6;
                                cVar = cVar2;
                            } catch (Throwable th) {
                                th = th;
                                ktVar3 = ktVar4;
                                ktVar3.removeLast();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            ktVar4 = ktVar2;
                        }
                    }
                    boolean z10 = z4;
                    ktVar2.removeLast();
                    oi5Var4 = oi5Var2;
                    z7 = z10;
                    if (z7) {
                        return dn8Var;
                    }
                    cVar.f0 = null;
                    cVar.g0 = null;
                    cVar.h0 = null;
                    cVar.i0 = null;
                    cVar.j0 = null;
                    cVar.n0 = 3;
                    v27Var2.b(cVar, oi5Var4);
                    return c71Var;
                } catch (Throwable th3) {
                    th = th3;
                    ktVar3.removeLast();
                    throw th;
                }
            }
            boolean z11 = cVar.l0;
            boolean z12 = cVar.k0;
            oi5 oi5Var7 = cVar.i0;
            ktVar2 = cVar.h0;
            s92Var2 = cVar.g0;
            v27Var2 = cVar.f0;
            w39.n0(obj);
            z7 = z11;
            z3 = z12;
            oi5Var4 = oi5Var7;
        }
        List listListOrNull = s92Var2.listOrNull(oi5Var4);
        if (listListOrNull == null) {
            listListOrNull = d02.X;
        }
        if (!listListOrNull.isEmpty()) {
            oi5 oi5Var8 = oi5Var4;
            int i3 = 0;
            while (true) {
                if (z3 && ktVar2.contains(oi5Var8)) {
                    u52.s(oi0.i(oi5Var4, "symlink cycle at "));
                    return oi5Var5;
                }
                oi5Var8.getClass();
                oi5 oi5Var9 = s92Var2.metadata(oi5Var8).c;
                if (oi5Var9 == null) {
                    oi5VarA = oi5Var5;
                } else {
                    oi5 oi5VarC = oi5Var8.c();
                    oi5VarC.getClass();
                    oi5VarA = f.a(oi5VarC, oi5Var9, false);
                }
                if (oi5VarA != null) {
                    i3++;
                    oi5Var8 = oi5VarA;
                    oi5Var5 = null;
                } else if (z3 || i3 == 0) {
                    ktVar2.addLast(oi5Var8);
                    try {
                        Iterator it2 = listListOrNull.iterator();
                        oi5Var2 = oi5Var4;
                        z4 = z7;
                        it = it2;
                        while (it.hasNext()) {
                            oi5Var3 = (oi5) it.next();
                            cVar.f0 = v27Var2;
                            cVar.g0 = s92Var2;
                            cVar.h0 = ktVar2;
                            cVar.i0 = oi5Var2;
                            cVar.j0 = it;
                            cVar.k0 = z3;
                            cVar.l0 = z4;
                            cVar.n0 = 2;
                            z5 = z3;
                            z6 = z4;
                            cVar2 = cVar;
                            ktVar4 = ktVar2;
                            s92Var3 = s92Var2;
                            v27Var3 = v27Var2;
                            if (u(v27Var3, s92Var3, ktVar4, oi5Var3, z5, z6, cVar2) == c71Var) {
                                return c71Var;
                            }
                            v27Var2 = v27Var3;
                            s92Var2 = s92Var3;
                            ktVar2 = ktVar4;
                            z3 = z5;
                            z4 = z6;
                            cVar = cVar2;
                        }
                        boolean z13 = z4;
                        ktVar2.removeLast();
                        oi5Var4 = oi5Var2;
                        z7 = z13;
                    } catch (Throwable th4) {
                        th = th4;
                        ktVar3 = ktVar2;
                        ktVar3.removeLast();
                        throw th;
                    }
                }
            }
        }
        if (z7) {
            return dn8Var;
        }
        cVar.f0 = null;
        cVar.g0 = null;
        cVar.h0 = null;
        cVar.i0 = null;
        cVar.j0 = null;
        cVar.n0 = 3;
        v27Var2.b(cVar, oi5Var4);
        return c71Var;
    }

    public static final eb9 v(xe2 xe2Var) {
        jp0.i.getClass();
        int i = ip0.b;
        if (1 >= i) {
            i = 1;
        }
        int i2 = i - 1;
        boolean z = xe2Var instanceof kp0;
        l90 l90Var = l90.X;
        if (z) {
            kp0 kp0Var = (kp0) xe2Var;
            l90 l90Var2 = kp0Var.Z;
            xe2 xe2VarH = kp0Var.h();
            if (xe2VarH != null) {
                int i3 = kp0Var.Y;
                if (i3 != -3 && i3 != -2 && i3 != 0) {
                    i2 = i3;
                } else if (l90Var2 != l90Var || i3 == 0) {
                    i2 = 0;
                }
                return new eb9(i2, l90Var2, kp0Var.X, xe2VarH);
            }
        }
        return new eb9(i2, l90Var, b02.X, xe2Var);
    }

    public static final boolean w(long j, long j2) {
        return j == j2;
    }

    public static final y24 x(y24 y24Var) {
        y24 y24Var2;
        y24 y24VarY = y24Var.y();
        while (true) {
            y24 y24Var3 = y24VarY;
            y24Var2 = y24Var;
            y24Var = y24Var3;
            if (y24Var == null) {
                break;
            }
            y24VarY = y24Var.y();
        }
        i55 i55Var = y24Var2 instanceof i55 ? (i55) y24Var2 : null;
        if (i55Var == null) {
            return y24Var2;
        }
        i55 i55Var2 = i55Var.y0;
        while (true) {
            i55 i55Var3 = i55Var2;
            i55 i55Var4 = i55Var;
            i55Var = i55Var3;
            if (i55Var == null) {
                return i55Var4;
            }
            i55Var2 = i55Var.y0;
        }
    }

    public static final String z(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public abstract int F(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int G();

    public abstract ViewPropertyAnimator H(View view, int i);

    public abstract String o();
}
