package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import io.sentry.c2;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import libxray.Libxray;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.RouteSettings;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u15 {
    public static final String[] a = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
    public static final String[] b = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"};
    public static final String[] c = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/system_ext/bin/", "/cache/", "/data/", "/dev/"};
    public static final String[] d = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};
    public static final jw0 e = jw0.Z;
    public static final d77 f = d77.Z;
    public static final jw0 g = jw0.Y;
    public static final xj8 h = xj8.Y;
    public static final jw0 i;
    public static final jw0 j;
    public static final float k;
    public static final jw0 l;
    public static final float m;
    public static final jw0 n;
    public static final float o;
    public static final jw0 p;
    public static final float q;
    public static final d77 r;
    public static final float s;
    public static final jw0 t;
    public static final float u;
    public static final float v;
    public static g73 w;

    static {
        jw0 jw0Var = jw0.k0;
        i = jw0Var;
        jw0 jw0Var2 = jw0.h0;
        j = jw0Var2;
        k = 0.38f;
        l = jw0Var2;
        m = 0.38f;
        n = jw0Var2;
        o = 0.12f;
        p = jw0Var;
        q = 44.0f;
        r = d77.g0;
        s = 4.0f;
        t = jw0.n0;
        u = 16.0f;
        v = 4.0f;
    }

    public static final void A(Service service) {
        RouteSettingsCache data;
        RouteSettings routeSettings;
        HappApplication happApplication = HappApplication.M0;
        mn6 mn6VarF = k32.i().f();
        ss8 ss8Var = ss8.a;
        String strL = ss8.L(service);
        mn6VarF.v();
        RouteProfile routeProfileK = mn6.k(mn6VarF);
        if (routeProfileK != null && (data = routeProfileK.getData()) != null && (routeSettings = data.getRouteSettings()) != null && routeSettings.getDateLastUpdateIp() != null && routeSettings.getDateLastUpdateSite() != null) {
            strL = routeSettings.getLocalPathGeo();
        }
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = "android_id".getBytes(charsetForName);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(Arrays.copyOf(bytes, 32), 9);
        strEncodeToString.getClass();
        Libxray.initXEnv(strL, strEncodeToString);
    }

    public static final boolean B(ai2 ai2Var) {
        LayoutNode layoutNode;
        i55 i55Var;
        LayoutNode layoutNode2;
        i55 i55Var2 = ai2Var.j0;
        return (i55Var2 == null || (layoutNode = i55Var2.w0) == null || !layoutNode.L() || (i55Var = ai2Var.j0) == null || (layoutNode2 = i55Var.w0) == null || !layoutNode2.K()) ? false : true;
    }

    public static boolean C() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return mm7.S(Build.DEVICE, "m55xq");
    }

    public static final void D(q15 q15Var, uy7 uy7Var) {
        if (mb6.k0(t15.X, q15Var, uy7Var) != c71.X) {
            mb6.H(uy7Var).f(dn8.a);
        }
    }

    public static ParameterizedType E(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return E(upperBounds[0]);
            }
        }
        return null;
    }

    public static TypeVariable F(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return F(upperBounds[0]);
            }
        }
        return null;
    }

    public static final Object G(ql6 ql6Var, boolean z, boolean z2, gn2 gn2Var) {
        ql6Var.getClass();
        ql6Var.a();
        if (!ql6Var.j() || ql6Var.k() || ql6Var.h.get() == null) {
            return jm4.Z(new y81((q51) null, gn2Var, ql6Var, z, z2));
        }
        bt.i("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object H(ql6 ql6Var, boolean z, ut8 ut8Var, s51 s51Var) {
        a91 a91Var;
        if (s51Var instanceof a91) {
            a91Var = (a91) s51Var;
            int i2 = a91Var.j0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a91Var.j0 = i2 - Integer.MIN_VALUE;
            } else {
                a91Var = new a91(s51Var);
            }
        } else {
            a91Var = new a91(s51Var);
        }
        Object objS = a91Var.i0;
        int i3 = a91Var.j0;
        Object obj = c71.X;
        if (i3 == 0) {
            w39.n0(objS);
            if (ql6Var.j() && ql6Var.m() && ql6Var.k()) {
                b91 b91Var = new b91(null, ut8Var, ql6Var, z);
                a91Var.j0 = 1;
                Object objQ = ql6Var.q(z, b91Var, a91Var);
                if (objQ != obj) {
                    return objQ;
                }
            } else {
                a91Var.f0 = ql6Var;
                a91Var.g0 = ut8Var;
                a91Var.h0 = z;
                a91Var.j0 = 2;
                objS = s(ql6Var, a91Var);
                if (objS != obj) {
                }
            }
        }
        if (i3 == 1) {
            w39.n0(objS);
            return objS;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                w39.n0(objS);
                return objS;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = a91Var.h0;
        ut8Var = a91Var.g0;
        ql6Var = a91Var.f0;
        w39.n0(objS);
        z81 z81Var = new z81((q51) null, ut8Var, ql6Var, z);
        a91Var.f0 = null;
        a91Var.g0 = null;
        a91Var.j0 = 3;
        Object objW = w51.W((s61) objS, z81Var, a91Var);
        return objW == obj ? obj : objW;
    }

    public static final boolean I(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static boolean J(al alVar, dh8 dh8Var, Type type) {
        if (dh8Var.L0(alVar.d(type).j0)) {
            ParameterizedType parameterizedTypeE = E(type);
            if (parameterizedTypeE == null || !Objects.equals(dh8Var.j0, parameterizedTypeE.getRawType())) {
                return true;
            }
            Type[] actualTypeArguments = parameterizedTypeE.getActualTypeArguments();
            gh8 gh8VarY0 = dh8Var.y0();
            if (gh8VarY0.Y.length == actualTypeArguments.length) {
                for (int i2 = 0; i2 < gh8VarY0.Y.length; i2++) {
                    if (J(alVar, gh8VarY0.d(i2), actualTypeArguments[i2])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final void K(bc7 bc7Var, rs rsVar, int i2) {
        while (true) {
            int i3 = bc7Var.v;
            if (i2 > i3 && i2 < bc7Var.u) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            bc7Var.L();
            if (bc7Var.x(bc7Var.v)) {
                rsVar.l();
            }
            bc7Var.i();
        }
    }

    public static final Object L(d94 d94Var, rn2 rn2Var, q51 q51Var) {
        Object objM = M(d94Var.getH0(), o84.f0, rn2Var, q51Var);
        return objM == c71.X ? objM : dn8.a;
    }

    public static final Object M(g94 g94Var, o84 o84Var, rn2 rn2Var, q51 q51Var) {
        Object objN;
        if (o84Var != o84.Y) {
            return (g94Var.i != o84.X && (objN = gv3.n(new pi((Object) g94Var, (Object) o84Var, (Object) rn2Var, (q51) null, (byte) 16), q51Var)) == c71.X) ? objN : dn8.a;
        }
        bt.q("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final void N(mm0 mm0Var, q51 q51Var, boolean z) {
        Object objR = mm0Var.r();
        Throwable thE = mm0Var.e(objR);
        Object rj6Var = thE != null ? new rj6(thE) : mm0Var.g(objR);
        if (!z) {
            q51Var.f(rj6Var);
            return;
        }
        q51Var.getClass();
        np1 np1Var = (np1) q51Var;
        s51 s51Var = np1Var.g0;
        Object obj = np1Var.i0;
        s61 s61VarW = s51Var.w();
        Object objC = g98.c(s61VarW, obj);
        am8 am8VarT = objC != g98.a ? ch3.T(s51Var, s61VarW, objC) : null;
        try {
            s51Var.f(rj6Var);
        } finally {
            if (am8VarT == null || am8VarT.p0()) {
                g98.a(s61VarW, objC);
            }
        }
    }

    public static int O(int i2) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i2 - 1));
    }

    public static final x14 P(x14 x14Var, x14 x14Var2) {
        ce2 ce2VarO;
        lh4 lh4Var = lh4.E0;
        aa7 aa7VarP = z68.p(x14Var);
        if (aa7VarP == null && ((ce2VarO = z68.o(x14Var)) == null || (aa7VarP = z68.s0(ce2VarO)) == null)) {
            aa7VarP = z68.p(x14Var);
            aa7VarP.getClass();
        }
        if (z68.M(z68.L0(aa7VarP)) != null) {
            return z68.i0(x14Var) ? lh4Var.Q0(x14Var2) : x14Var2;
        }
        bh8 bh8Var = (bh8) wv0.O0(z68.E(x14Var));
        if (i62.a[z68.O(bh8Var).ordinal()] == 1) {
            lh4Var.f();
            throw null;
        }
        mo8 mo8VarL = z68.L(lh4Var, bh8Var);
        mo8VarL.getClass();
        x14 x14VarP = P(mo8VarL, x14Var2);
        x14VarP.getClass();
        if (x14VarP instanceof t14) {
            lh4Var.f();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(lh4Var);
        sb.append(", ");
        throw new IllegalArgumentException(oi0.j(yb6.a, lh4Var.getClass(), sb).toString());
    }

    public static final int Q(int i2, int i3) {
        if (i2 == Integer.MAX_VALUE) {
            return i2;
        }
        int i4 = i2 - i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    public static final long R(long j2) {
        return (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    public static final void S(oh7 oh7Var, gn2 gn2Var) {
        Object value;
        oh7Var.getClass();
        gn2Var.getClass();
        do {
            value = oh7Var.getValue();
        } while (!oh7Var.k(value, gn2Var.B(value)));
    }

    public static final void a(String str, String str2, kx4 kx4Var, lp2 lp2Var, int i2) {
        lp2 lp2Var2 = lp2Var;
        str.getClass();
        str2.getClass();
        lp2Var2.X(-97642414);
        int i3 = i2 | (lp2Var2.f(str) ? 4 : 2) | (lp2Var2.f(str2) ? 32 : 16) | 27648;
        if (lp2Var2.N(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) lp2Var2.j(pc.b);
            int i4 = i3 & 112;
            boolean zH = lp2Var2.h(context) | (i4 == 32);
            Object objK = lp2Var2.K();
            be beVar = zz0.a;
            if (zH || objK == beVar) {
                objK = new jq6(context, str2);
                lp2Var2.g0(objK);
            }
            dn2 dn2Var = (dn2) ((pv3) objK);
            boolean zH2 = lp2Var2.h(context) | (i4 == 32);
            Object objK2 = lp2Var2.K();
            if (zH2 || objK2 == beVar) {
                objK2 = new tv2(context, str2);
                lp2Var2.g0(objK2);
            }
            kx4 kx4VarX = vj8.x(kx4Var, false, null, null, dn2Var, (dn2) objK2, lp2Var2, 15);
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
            ox1 ox1Var = es.a;
            o88 o88Var = ((ds) lp2Var2.j(ox1Var)).b;
            ox1 ox1Var2 = ep.z;
            zc1.g(str, null, o88.a(o88Var, ((dp) lp2Var2.j(ox1Var2)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var, i3 & 14, 506);
            ch3.f(lp2Var, b.k(hx4.X, 16.0f));
            zc1.g(str2, new d44(1.0f, true), o88.a(((ds) lp2Var.j(ox1Var)).b, ((dp) lp2Var.j(ox1Var2)).c.b, 0L, null, null, 0L, 0L, null, 16777214), 6, 0, 1, 0, false, null, lp2Var, ((i3 >> 3) & 14) | 12779520, 336);
            lp2Var2 = lp2Var;
            lp2Var2.W(1154871286);
            lp2Var2.p(false);
            lp2Var2.p(true);
            lp2Var2.W(-1635348102);
            lp2Var2.p(false);
            lp2Var2.p(true);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) str, (Object) str2, kx4Var, i2, (byte) 5);
        }
    }

    public static final void b(lg4 lg4Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        gn2Var.getClass();
        lp2Var.X(-1893281919);
        byte b2 = 4;
        int i3 = (lp2Var.f(lg4Var) ? 4 : 2) | i2 | (lp2Var.h(gn2Var) ? 32 : 16);
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            dh3.b(vj8.j0(y46.logs_view, lp2Var), kx4Var, null, jm4.U(1582103070, new p90(jm4.V(lp2Var), lg4Var, gn2Var, b2), lp2Var), lp2Var, 3120, 4);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) lg4Var, (Object) gn2Var, kx4Var, i2, (byte) 11);
        }
    }

    public static final df c() {
        return new df(new Paint(7));
    }

    public static final ji8 d(x14 x14Var) {
        boolean z;
        mo8 mo8VarQ0;
        ce2 ce2VarO;
        aa7 aa7VarP = z68.p(x14Var);
        if (aa7VarP == null && ((ce2VarO = z68.o(x14Var)) == null || (aa7VarP = z68.s0(ce2VarO)) == null)) {
            aa7VarP = z68.p(x14Var);
            aa7VarP.getClass();
        }
        hi8 hi8VarM = z68.M(z68.L0(aa7VarP));
        if (hi8VarM != null) {
            return hi8VarM;
        }
        if (x14Var instanceof t14) {
            z = zz3.z((t14) x14Var);
        } else {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(x14Var);
            sb.append(", ");
            em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
            z = false;
        }
        if (z) {
            bh8 bh8Var = (bh8) wv0.O0(z68.E(x14Var));
            bh8Var.getClass();
            if (z68.m0(bh8Var)) {
                mo8VarQ0 = null;
            } else {
                if (!(bh8Var instanceof ni8)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(bh8Var);
                    sb2.append(", ");
                    em7.c(oi0.j(yb6.a, bh8Var.getClass(), sb2));
                    return null;
                }
                mo8VarQ0 = ((ni8) bh8Var).b().q0();
            }
            if (mo8VarQ0 != null) {
                return d(mo8VarQ0);
            }
        }
        return null;
    }

    public static kx4 e(kx4 kx4Var, ea4 ea4Var, jm6 jm6Var) {
        return kx4Var.y(new x00(0L, ea4Var, jm6Var, 1));
    }

    public static final kx4 f(kx4 kx4Var, long j2, x67 x67Var) {
        return kx4Var.y(new x00(j2, null, x67Var, 2));
    }

    public static kx4 g(long j2, kx4 kx4Var) {
        return f(kx4Var, j2, u70.e);
    }

    public static final void h(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    pc6.w(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    gv3.g(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    kp5.e();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:91:0x01eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f3  */
    public static final x14 i(x14 x14Var, HashSet hashSet) {
        List<ji8> listG;
        aa7 aa7Var;
        ji8 ji8VarD;
        x14 x14VarP;
        x14 x14VarI;
        lh8 lh8VarL;
        lh4 lh4Var = lh4.E0;
        mh8 mh8VarP0 = lh4Var.p0(x14Var);
        if (hashSet.add(mh8VarP0)) {
            hi8 hi8VarM = z68.M(mh8VarP0);
            byte b2 = 1;
            int i2 = 0;
            if (hi8VarM != null) {
                x14 x14VarJ = z68.J(hi8VarM);
                x14 x14VarI2 = i(x14VarJ, hashSet);
                if (x14VarI2 != null) {
                    if (!z68.d0(lh4Var.p0(x14VarJ)) && (!(x14VarJ instanceof da7) || !z68.j0((da7) x14VarJ))) {
                        b2 = 0;
                    }
                    if ((x14VarI2 instanceof da7) && z68.j0((da7) x14VarI2) && z68.i0(x14Var) && b2 != 0) {
                        return lh4Var.Q0(x14VarJ);
                    }
                    return (z68.i0(x14VarI2) || !z68.g0(x14Var)) ? x14VarI2 : lh4Var.Q0(x14VarI2);
                }
            } else {
                if (!z68.d0(mh8VarP0)) {
                    return x14Var;
                }
                mh8 mh8VarP1 = lh4Var.p0(x14Var);
                mh8VarP1.getClass();
                if (mh8VarP1 instanceof lh8) {
                    listG = ((lh8) mh8VarP1).g();
                    listG.getClass();
                } else {
                    em7.c(oi0.j(yb6.a, mh8VarP1.getClass(), oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8VarP1, ", ")));
                    listG = null;
                }
                List listE = z68.E(x14Var);
                ArrayList arrayList = new ArrayList(xv0.Z(listE, 10));
                for (Object obj : listE) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        i21.X();
                        throw null;
                    }
                    zk zkVarL = z68.L(lh4Var, (bh8) obj);
                    if (zkVarL == null) {
                        zkVarL = z68.J((ji8) listG.get(i2));
                    }
                    arrayList.add(zkVarL);
                    i2 = i3;
                }
                ArrayList arrayList2 = new ArrayList(xv0.Z(listG, 10));
                for (ji8 ji8Var : listG) {
                    ji8Var.getClass();
                    if (ji8Var instanceof hi8) {
                        lh8VarL = ((hi8) ji8Var).l();
                        lh8VarL.getClass();
                    } else {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(ji8Var);
                        sb.append(", ");
                        em7.c(oi0.j(yb6.a, ji8Var.getClass(), sb));
                        lh8VarL = null;
                    }
                    arrayList2.add(lh8VarL);
                }
                Map mapP = zp4.P(wv0.e1(arrayList2, arrayList));
                ArrayList arrayList3 = new ArrayList(mapP.size());
                for (Map.Entry entry : mapP.entrySet()) {
                    mh8 mh8Var = (mh8) entry.getKey();
                    x14 x14Var2 = (x14) entry.getValue();
                    mh8Var.getClass();
                    x14Var2.getClass();
                    arrayList3.add(new qg5((lh8) mh8Var, new wg7((t14) x14Var2)));
                }
                wi8 wi8Var = new wi8(new xg7(zp4.P(arrayList3), b2));
                x14Var.getClass();
                if (x14Var instanceof t14) {
                    int i4 = bd3.a;
                    ot0 ot0VarX = ((t14) x14Var).n0().x();
                    sx4 sx4Var = ot0VarX instanceof sx4 ? (sx4) ot0VarX : null;
                    if (sx4Var != null) {
                        int i5 = el1.a;
                        ft8 ft8VarU0 = sx4Var.u0();
                        ad3 ad3Var = ft8VarU0 instanceof ad3 ? (ad3) ft8VarU0 : null;
                        aa7Var = ad3Var != null ? (aa7) ad3Var.b : null;
                    }
                    if (aa7Var == null) {
                        x14VarP = null;
                    } else {
                        ji8VarD = d(aa7Var);
                        if (ji8VarD == null) {
                            x14VarP = z68.B0(wi8Var, aa7Var);
                        } else {
                            x14VarP = P(aa7Var, z68.B0(wi8Var, z68.J(ji8VarD)));
                        }
                    }
                    if (x14VarP != null && (x14VarI = i(x14VarP, hashSet)) != null) {
                        if (!z68.i0(x14Var)) {
                            return x14VarI;
                        }
                        if (z68.i0(x14VarI)) {
                            return x14Var;
                        }
                        return ((x14VarI instanceof da7) || !z68.j0((da7) x14VarI)) ? lh4Var.Q0(x14VarI) : x14Var;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(x14Var);
                    sb2.append(", ");
                    em7.c(oi0.j(yb6.a, x14Var.getClass(), sb2));
                }
                if (aa7Var == null) {
                    x14VarP = null;
                } else {
                    ji8VarD = d(aa7Var);
                    if (ji8VarD == null) {
                        x14VarP = z68.B0(wi8Var, aa7Var);
                    } else {
                        x14VarP = P(aa7Var, z68.B0(wi8Var, z68.J(ji8VarD)));
                    }
                }
                if (x14VarP != null) {
                    if (!z68.i0(x14Var)) {
                        return x14VarI;
                    }
                    if (z68.i0(x14VarI)) {
                        return x14Var;
                    }
                    if (x14VarI instanceof da7) {
                    }
                }
            }
        }
        return null;
    }

    public static final u1 j(zu3 zu3Var) {
        zu3Var.getClass();
        List listO = yn0.o(zu3Var);
        ArrayList arrayList = new ArrayList(xv0.Z(listO, 10));
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add(new uw3(w45.E((rw3) it.next(), null, 7), yw3.X));
        }
        return w45.G(zu3Var, arrayList, false, null, 14);
    }

    public static void k(Serializable serializable) {
        y();
        String.valueOf(serializable);
        y();
        String.valueOf(serializable);
    }

    public static final ai2 l(ai2 ai2Var) {
        ai2 ai2VarF = ((gh2) yn0.a0(ai2Var).getFocusOwner()).f();
        if (ai2VarF == null || !ai2VarF.p0) {
            return null;
        }
        return ai2VarF;
    }

    public static final int m(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object objD = ts7.d(view);
            view = objD instanceof View ? (View) objD : null;
        }
        return i4;
    }

    public static final View n(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(m(view, v36.view_tree_lifecycle_owner), m(view, z36.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (r(view) == null) {
                i2++;
                Object objD = ts7.d(view);
                View view4 = view2;
                view2 = view;
                view = objD instanceof View ? (View) objD : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final s86 o(ai2 ai2Var) {
        i55 i55Var;
        if (ai2Var.p0 && (i55Var = ai2Var.j0) != null) {
            y24 y24VarX = jm4.x(i55Var);
            if (!y24VarX.g()) {
                y24VarX = null;
            }
            if (y24VarX != null) {
                return ai2Var.b1(y24VarX);
            }
        }
        return s86.e;
    }

    public static final ai2 p(ai2 ai2Var) {
        boolean z = ai2Var.X.p0;
        if (z) {
            if (!z) {
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
                int i2 = c15Var.Z;
                if (i2 == 0) {
                    break;
                }
                jx4 jx4VarT = (jx4) c15Var.k(i2 - 1);
                if ((jx4VarT.f0 & 1024) == 0) {
                    yn0.n(c15Var, jx4VarT);
                } else {
                    while (jx4VarT != null) {
                        if ((jx4VarT.Z & 1024) != 0) {
                            c15 c15Var2 = null;
                            while (jx4VarT != null) {
                                if (jx4VarT instanceof ai2) {
                                    ai2 ai2Var2 = (ai2) jx4VarT;
                                    if (ai2Var2.X.p0) {
                                        int iOrdinal = ai2Var2.d1().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return ai2Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            b61.c();
                                            return null;
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
        return null;
    }

    public static final int q(xr6 xr6Var, String str) {
        xr6Var.getClass();
        int iU = w45.u(xr6Var, str);
        if (iU >= 0) {
            return iU;
        }
        int columnCount = xr6Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i2 = 0; i2 < columnCount; i2++) {
            arrayList.add(xr6Var.getColumnName(i2));
        }
        bt.k("Column '", str, "' does not exist. Available columns: [", wv0.y0(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final xz0 r(View view) {
        Object tag = view.getTag(g46.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (xz0) weakReference.get();
        }
        return null;
    }

    public static final s61 s(ql6 ql6Var, s51 s51Var) {
        if (!ql6Var.j()) {
            m51 m51Var = ql6Var.a;
            if (m51Var != null) {
                return m51Var.Y;
            }
            dh3.T("coroutineScope");
            throw null;
        }
        if (s51Var.w().H0(cd8.X) != null) {
            c2.m();
            return null;
        }
        m51 m51Var2 = ql6Var.a;
        if (m51Var2 != null) {
            return m51Var2.Y;
        }
        dh3.T("coroutineScope");
        throw null;
    }

    public static final ArrayList t(ev3 ev3Var) {
        Collection collectionP = ev3Var.P();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionP) {
            if (obj instanceof pv3) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ud0 u(sd0 sd0Var) {
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = sd0Var.getClass();
        try {
            Object objT = sd0Var.t(qd0Var);
            if (objT == null) {
                return ud0Var;
            }
            qd0Var.a = objT;
            return ud0Var;
        } catch (Exception e2) {
            ud0Var.b(e2);
            return ud0Var;
        }
    }

    public static final Object v(tr4 tr4Var) {
        Object objW = tr4Var.w();
        d34 d34Var = objW instanceof d34 ? (d34) objW : null;
        if (d34Var != null) {
            return d34Var.q0;
        }
        return null;
    }

    public static final Paint w(df dfVar) {
        if (dfVar == null) {
            vc3.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + yb6.a.b(dfVar.getClass()).p());
        }
        return dfVar.a;
    }

    public static String[] x() {
        ArrayList arrayList = new ArrayList(Arrays.asList(c));
        String str = System.getenv("PATH");
        if (str == null || _UrlKt.FRAGMENT_ENCODE_SET.equals(str)) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        String[] strArrSplit = str.split(":");
        int length = strArrSplit.length;
        for (int i2 = 0; i2 < length; i2++) {
            String strConcat = strArrSplit[i2];
            if (!strConcat.endsWith("/")) {
                strConcat = strConcat.concat("/");
            }
            if (!arrayList.contains(strConcat)) {
                arrayList.add(strConcat);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void y() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        stackTrace[2].getLineNumber();
        className.substring(className.lastIndexOf(46) + 1);
    }

    public static kx4 z(kx4 kx4Var, xz4 xz4Var) {
        return kx4Var.y(new f13(xz4Var));
    }
}
