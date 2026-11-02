package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.compose.foundation.layout.b;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u70 {
    public static final y2 a = new y2((byte) 0);
    public static final zy0 b = new zy0(344158860, false, new dx0(9));
    public static final eq1 c = new eq1();
    public static final Object d = new Object();
    public static final x03 e = new x03(2);
    public static g73 f;

    public static final float A(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return (f3 <= 0.0f ? f2 >= f3 : f2 <= f3) ? f2 : f3;
    }

    public static cy0 C(String str, String str2) {
        ry ryVar = new ry(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e26.a(ry.class));
        return new cy0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new ay0(ryVar, (byte) 0), hashSet3);
    }

    public static final b71 D(lp2 lp2Var) {
        return new yc6(lp2Var.R);
    }

    public static int E(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static final Object F(long j, q51 q51Var) {
        if (j > 0) {
            mm0 mm0Var = new mm0(1, mb6.H(q51Var));
            mm0Var.s();
            if (j < Long.MAX_VALUE) {
                M(mm0Var.g0).u0(j, mm0Var);
            }
            Object objQ = mm0Var.q();
            if (objQ == c71.X) {
                return objQ;
            }
        }
        return dn8.a;
    }

    public static final Object G(long j, q51 q51Var) {
        Object objF = F(s0(j), q51Var);
        return objF == c71.X ? objF : dn8.a;
    }

    public static final void I(s61 s61Var) {
        bm3 bm3Var = (bm3) s61Var.H0(oy1.E0);
        if (bm3Var != null && !bm3Var.k()) {
            throw bm3Var.R();
        }
    }

    public static pe1 J(lp2 lp2Var) {
        float f2 = sf7.a;
        fi1 fi1Var = (fi1) lp2Var.j(y01.h);
        boolean zC = lp2Var.c(fi1Var.getDensity());
        Object objK = lp2Var.K();
        Object obj = zz0.a;
        if (zC || objK == obj) {
            objK = new bd1(new y45(fi1Var));
            lp2Var.g0(objK);
        }
        bd1 bd1Var = (bd1) objK;
        boolean zF = lp2Var.f(bd1Var);
        Object objK2 = lp2Var.K();
        if (zF || objK2 == obj) {
            objK2 = new pe1(bd1Var);
            lp2Var.g0(objK2);
        }
        return (pe1) objK2;
    }

    public static cy0 K(String str, u52 u52Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e26.a(ry.class));
        for (Class cls : new Class[0]) {
            jb5.i(cls, "Null interface");
            hashSet.add(e26.a(cls));
        }
        li1 li1VarA = li1.a(Context.class);
        if (hashSet.contains(li1VarA.a)) {
            bt.q("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(li1VarA);
        return new cy0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new jn0(str, u52Var, (byte) 4), hashSet3);
    }

    public static final qs0 L(w15 w15Var, int i) {
        w15Var.getClass();
        return jb5.t(w15Var.a(i), w15Var.b(i));
    }

    public static final kh1 M(s61 s61Var) {
        q61 q61VarH0 = s61Var.H0(pz2.E0);
        kh1 kh1Var = q61VarH0 instanceof kh1 ? (kh1) q61VarH0 : null;
        return kh1Var == null ? ne1.a : kh1Var;
    }

    public static Drawable O(Context context, int i) {
        return rf6.b().c(context, i);
    }

    public static Set P() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final bm3 Q(s61 s61Var) {
        bm3 bm3Var = (bm3) s61Var.H0(oy1.E0);
        if (bm3Var != null) {
            return bm3Var;
        }
        b61.o(s61Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final g73 R() {
        g73 g73Var = f;
        if (g73Var != null) {
            return g73Var;
        }
        f73 f73Var = new f73("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = gu8.a;
        fe7 fe7Var = new fe7(dw0.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new vi5(8.59f, 16.59f));
        arrayList.add(new ui5(13.17f, 12.0f));
        arrayList.add(new ui5(8.59f, 7.41f));
        arrayList.add(new ui5(10.0f, 6.0f));
        arrayList.add(new cj5(6.0f, 6.0f));
        arrayList.add(new cj5(-6.0f, 6.0f));
        arrayList.add(new cj5(-1.41f, -1.41f));
        arrayList.add(ri5.c);
        f73.a(f73Var, arrayList, fe7Var);
        g73 g73VarB = f73Var.b();
        f = g73VarB;
        return g73VarB;
    }

    public static final v15 S(w15 w15Var, int i) {
        w15Var.getClass();
        return v15.d(w15Var.getString(i));
    }

    public static final mm0 T(q51 q51Var) {
        Unsafe unsafe;
        mm0 mm0Var;
        mm0 mm0Var2;
        if (!(q51Var instanceof np1)) {
            return new mm0(1, q51Var);
        }
        np1 np1Var = (np1) q51Var;
        long j = np1.j0;
        loop0: while (true) {
            unsafe = iu.a;
            Object objectVolatile = unsafe.getObjectVolatile(np1Var, j);
            mm0Var = null;
            z31 z31Var = op1.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(np1Var, j, z31Var);
                mm0Var2 = null;
                break;
            }
            if (objectVolatile instanceof mm0) {
                do {
                    unsafe = iu.a;
                    if (unsafe.compareAndSwapObject(np1Var, np1.j0, objectVolatile, z31Var)) {
                        mm0Var2 = (mm0) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(np1Var, j) == objectVolatile);
            } else if (objectVolatile != z31Var && !(objectVolatile instanceof Throwable)) {
                b61.o(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (mm0Var2 != null) {
            long j2 = mm0.j0;
            Object objectVolatile2 = unsafe.getObjectVolatile(mm0Var2, j2);
            if (!(objectVolatile2 instanceof vx0) || ((vx0) objectVolatile2).d == null) {
                unsafe.putIntVolatile(mm0Var2, mm0.h0, 536870911);
                unsafe.putObjectVolatile(mm0Var2, j2, o5.X);
                mm0Var = mm0Var2;
            } else {
                mm0Var2.n();
            }
            if (mm0Var != null) {
                return mm0Var;
            }
        }
        return new mm0(2, q51Var);
    }

    public static final gq1 W(bm3 bm3Var, boolean z, gm3 gm3Var) {
        if (bm3Var instanceof rm3) {
            return ((rm3) bm3Var).Q(z, gm3Var);
        }
        return bm3Var.Y(gm3Var.m(), z, new d0(1, gm3Var, gm3.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, (byte) 17));
    }

    public static final boolean X(s61 s61Var) {
        bm3 bm3Var = (bm3) s61Var.H0(oy1.E0);
        if (bm3Var != null) {
            return bm3Var.k();
        }
        return true;
    }

    public static boolean Y(qj0 qj0Var) {
        Boolean bool;
        qj0Var.getClass();
        try {
            jj0 jj0Var = qj0Var.b;
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            key.getClass();
            bool = (Boolean) ((lf0) jj0Var).c(key);
        } catch (BufferUnderflowException unused) {
            if (um1.a().b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                if (hi5.i0("CXCP")) {
                    String str = Build.MANUFACTURER;
                    String str2 = Build.MODEL;
                }
            } else if (hi5.j0()) {
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            hi5.m0();
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void a(Object obj, gn2 gn2Var, lp2 lp2Var) {
        boolean zF = lp2Var.f(obj);
        Object objK = lp2Var.K();
        if (zF || objK == zz0.a) {
            objK = new cq1(gn2Var);
            lp2Var.g0(objK);
        }
    }

    public static final void b(Object obj, Object obj2, gn2 gn2Var, lp2 lp2Var) {
        boolean zF = lp2Var.f(obj) | lp2Var.f(obj2);
        Object objK = lp2Var.K();
        if (zF || objK == zz0.a) {
            objK = new cq1(gn2Var);
            lp2Var.g0(objK);
        }
    }

    public static final void c(Object[] objArr, gn2 gn2Var, lp2 lp2Var) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zD = lp2Var.d(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zD |= lp2Var.f(obj);
        }
        Object objK = lp2Var.K();
        if (zD || objK == zz0.a) {
            lp2Var.g0(new cq1(gn2Var));
        }
    }

    public static final void d(kx4 kx4Var, lp2 lp2Var, int i) {
        lp2 lp2Var2 = lp2Var;
        lp2Var2.X(-1622767547);
        byte b2 = 1;
        if (lp2Var2.N(i & 1, (i & 3) != 2)) {
            tw0 tw0VarA = rw0.a(new ft(12.0f, new bt()), pz2.r0, lp2Var2, 54);
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4Var);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(pz2.B0, lp2Var2, tw0VarA);
            pn7.m(pz2.A0, lp2Var2, kl5VarL);
            pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
            pn7.l(lp2Var2);
            pn7.m(pz2.z0, lp2Var2, kx4VarQ);
            g73 g73VarP = u28.p(q36.download_complete, lp2Var2);
            ox1 ox1Var = ep.z;
            os4.a(g73VarP, b.g(hx4.X, 48.0f), vj8.j0(y46.toast_success, lp2Var2), ((dp) lp2Var2.j(ox1Var)).c.c, lp2Var2, 48, 0);
            lp2Var2.W(1288905313);
            ol olVar = new ol();
            olVar.b(vj8.j0(y46.geo_file_download_empty_p1, lp2Var2));
            StringBuilder sb = olVar.X;
            sb.append(' ');
            dj2 dj2Var = dj2.f0;
            int iD = olVar.d(new qe7(0L, 0L, dj2Var, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65531));
            try {
                olVar.b(vj8.j0(y46.geo_file_download_empty_p2, lp2Var2));
                sb.append('\n');
                olVar.c(iD);
                olVar.b(vj8.j0(y46.geo_file_download_empty_p3, lp2Var2));
                sb.append(' ');
                int iD2 = olVar.d(new qe7(0L, 0L, dj2Var, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65531));
                try {
                    olVar.b(vj8.j0(y46.geo_file_download_empty_p4, lp2Var2));
                    olVar.c(iD2);
                    ql qlVarE = olVar.e();
                    lp2Var2.p(false);
                    zc1.f(qlVarE, null, o88.a(((ds) lp2Var2.j(es.a)).b, ((dp) lp2Var2.j(ox1Var)).c.c, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, lp2Var, 0, 250);
                    lp2Var2 = lp2Var;
                    lp2Var2.p(true);
                } catch (Throwable th) {
                    olVar.c(iD2);
                    throw th;
                }
            } catch (Throwable th2) {
                olVar.c(iD);
                throw th2;
            }
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new f80(kx4Var, i, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(b83 b83Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        lp2 lp2Var2;
        b83Var.getClass();
        gn2Var.getClass();
        lp2Var.X(-1149787178);
        byte b2 = 2;
        int i2 = (lp2Var.f(b83Var) ? 4 : 2) | i | (lp2Var.h(gn2Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            lp2Var2 = lp2Var;
            km4.c(Boolean.valueOf(((z0) b83Var).isEmpty()), g33.e(kx4Var), null, null, jm4.U(-1038925099, new o90((Object) b83Var, gn2Var, b2), lp2Var), lp2Var2, 24576);
        } else {
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) b83Var, (Object) gn2Var, kx4Var, i, (byte) 3);
        }
    }

    public static TypedValue e0(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    public static final void f(fa3 fa3Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        lp2 lp2Var2;
        ?? r4;
        Object obj;
        lp2 lp2Var3 = lp2Var;
        gn2Var.getClass();
        lp2Var3.X(1160114347);
        int i2 = i | (lp2Var3.f(fa3Var) ? 4 : 2) | (lp2Var3.h(gn2Var) ? 32 : 16);
        if (lp2Var3.N(i2 & 1, (i2 & 147) != 146)) {
            tw0 tw0VarA = rw0.a(new ft(12.0f, new bt()), pz2.r0, lp2Var3, 54);
            int iHashCode = Long.hashCode(lp2Var3.T);
            kl5 kl5VarL = lp2Var3.l();
            kx4 kx4VarQ = w45.Q(lp2Var3, kx4Var);
            uz0.j.getClass();
            lp2Var3.Z();
            if (lp2Var3.S) {
                lp2Var3.k();
            } else {
                lp2Var3.j0();
            }
            pn7.m(pz2.B0, lp2Var3, tw0VarA);
            pn7.m(pz2.A0, lp2Var3, kl5VarL);
            pn7.m(pz2.C0, lp2Var3, Integer.valueOf(iHashCode));
            pn7.l(lp2Var3);
            pn7.m(pz2.z0, lp2Var3, kx4VarQ);
            g73 g73VarP = u28.p(q36.download_complete, lp2Var3);
            q06 q06Var = ep.z;
            long j = ((dp) lp2Var3.j(q06Var)).c.c;
            String strJ0 = vj8.j0(y46.toast_success, lp2Var3);
            hx4 hx4Var = hx4.X;
            os4.a(g73VarP, b.g(hx4Var, 48.0f), strJ0, j, lp2Var3, 48, 0);
            String strJ1 = vj8.j0(y46.update_notification_title, lp2Var3);
            o88 o88VarA = o88.a(((ds) lp2Var3.j(es.a)).b, ((dp) lp2Var3.j(q06Var)).c.c, 0L, null, null, 0L, 0L, null, 16777214);
            lp2 lp2Var4 = lp2Var;
            zc1.g(strJ1, null, o88VarA, 0, 0, 0, 0, false, null, lp2Var4, 0, 506);
            ch3.f(lp2Var4, b.g(hx4Var, 12.0f));
            lp2Var4.p(true);
            if (fa3Var.b) {
                lp2Var4.W(-634395013);
                boolean z = fa3Var.a;
                boolean z2 = (i2 & 112) == 32;
                Object objK = lp2Var4.K();
                if (z2 || objK == zz0.a) {
                    r4 = 0;
                    ba3 ba3Var = new ba3(gn2Var, false ? 1 : 0);
                    lp2Var4.g0(ba3Var);
                    obj = ba3Var;
                } else {
                    r4 = 0;
                    obj = objK;
                }
                ci8.c(r4, (dn2) obj, lp2Var4, null, z);
                lp2Var4.p(r4);
                lp2Var2 = lp2Var4;
            } else {
                lp2Var4.W(-634183593);
                lp2Var4.p(false);
                lp2Var2 = lp2Var4;
            }
        } else {
            lp2Var3.Q();
            lp2Var2 = lp2Var3;
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) fa3Var, (Object) gn2Var, kx4Var, i, (byte) 6);
        }
    }

    public static boolean f0(Resources.Theme theme, int i, boolean z) {
        TypedValue typedValueE0 = e0(theme, i);
        if (typedValueE0 == null || typedValueE0.type != 18) {
            return z;
        }
        return typedValueE0.data != 0;
    }

    public static dm3 g() {
        return new dm3(null);
    }

    public static int g0(Context context, int i, int i2) {
        TypedValue typedValueE0 = e0(context.getTheme(), i);
        return (typedValueE0 == null || typedValueE0.type != 16) ? i2 : typedValueE0.data;
    }

    public static final void h(rn2 rn2Var, lp2 lp2Var, Object obj) {
        s61 s61Var = lp2Var.R;
        boolean zF = lp2Var.f(obj);
        Object objK = lp2Var.K();
        if (zF || objK == zz0.a) {
            objK = new t24(s61Var, rn2Var);
            lp2Var.g0(objK);
        }
    }

    public static int h0(Context context) {
        int i = u26.minTouchTargetSize;
        int i2 = j36.mtrl_min_touch_target_size;
        Resources.Theme theme = context.getTheme();
        TypedValue typedValueE0 = e0(theme, i);
        float dimension = (typedValueE0 == null || typedValueE0.type != 5) ? Float.NaN : typedValueE0.getDimension(theme.getResources().getDisplayMetrics());
        return Float.isNaN(dimension) ? (int) context.getResources().getDimension(i2) : (int) dimension;
    }

    public static final void i(Object obj, Boolean bool, Object obj2, rn2 rn2Var, lp2 lp2Var) {
        s61 s61Var = lp2Var.R;
        boolean zF = lp2Var.f(obj) | lp2Var.f(bool) | lp2Var.f(obj2);
        Object objK = lp2Var.K();
        if (zF || objK == zz0.a) {
            objK = new t24(s61Var, rn2Var);
            lp2Var.g0(objK);
        }
    }

    public static TypedValue i0(int i, Context context, String str) {
        TypedValue typedValueE0 = e0(context.getTheme(), i);
        if (typedValueE0 != null) {
            return typedValueE0;
        }
        kp5.n("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }

    public static final void j(Object obj, Object obj2, rn2 rn2Var, lp2 lp2Var) {
        s61 s61Var = lp2Var.R;
        boolean zF = lp2Var.f(obj) | lp2Var.f(obj2);
        Object objK = lp2Var.K();
        if (zF || objK == zz0.a) {
            objK = new t24(s61Var, rn2Var);
            lp2Var.g0(objK);
        }
    }

    public static TypedValue j0(View view, int i) {
        return i0(i, view.getContext(), view.getClass().getCanonicalName());
    }

    public static final void k(Object[] objArr, rn2 rn2Var, lp2 lp2Var) {
        s61 s61Var = lp2Var.R;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zD = lp2Var.d(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zD |= lp2Var.f(obj);
        }
        Object objK = lp2Var.K();
        if (zD || objK == zz0.a) {
            lp2Var.g0(new t24(s61Var, rn2Var));
        }
    }

    public static final void l(dn2 dn2Var, dn2 dn2Var2, kx4 kx4Var, lp2 lp2Var, int i) {
        kx4 kx4Var2;
        dn2Var.getClass();
        dn2Var2.getClass();
        lp2Var.X(261697257);
        int i2 = (lp2Var.h(dn2Var) ? 4 : 2) | i | (lp2Var.h(dn2Var2) ? 32 : 16) | 384;
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ch3.c(dn2Var, vj8.j0(y46.warning_text, lp2Var), false, null, jm4.U(-914194204, new i9(dn2Var, dn2Var2, (byte) 25), lp2Var), z51.i, lp2Var, (i2 & 14) | 1769856, 24);
            kx4Var2 = hx4.X;
        } else {
            lp2Var.Q();
            kx4Var2 = kx4Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) dn2Var, (Object) dn2Var2, kx4Var2, i, (byte) 14);
        }
    }

    public static final void m(um6 um6Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-4827795);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(um6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            zc1.g(um6Var.a.getData().getName(), w51.g(kx4Var, ((Number) ri.b(um6Var.b ? 0.5f : 1.0f, null, null, lp2Var, 0, 30).getValue()).floatValue()), o88.a(((ds) lp2Var.j(es.a)).b, ((dp) lp2Var.j(ep.z)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var, 0, 504);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new sl((byte) 8, i, um6Var, kx4Var);
        }
    }

    public static final s86 n(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new s86(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void o(final um6 um6Var, final boolean z, final boolean z2, final gn2 gn2Var, final kx4 kx4Var, lp2 lp2Var, final int i) {
        cv1 cv1Var;
        gn2 gn2Var2;
        um6Var.getClass();
        gn2Var.getClass();
        lp2Var.X(-739423132);
        int i2 = (lp2Var.f(um6Var) ? 4 : 2) | i | (lp2Var.g(z) ? 32 : 16) | (lp2Var.g(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.h(gn2Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= lp2Var.f(kx4Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i3 = i2;
        if (lp2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            float fS = os4.S(92.0f, lp2Var);
            boolean zC = lp2Var.c(fS);
            Object objK = lp2Var.K();
            cv1 cv1Var2 = cv1.X;
            Object obj = zz0.a;
            if (zC || objK == obj) {
                mj0 mj0Var = new mj0((byte) 17);
                mj0Var.w(cv1.Z, -fS);
                mj0Var.w(cv1Var2, 0.0f);
                mj0Var.w(cv1.Y, fS);
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
            Object objK2 = lp2Var.K();
            if (objK2 == obj) {
                objK2 = new la(cv1Var2);
                lp2Var.g0(objK2);
            }
            la laVar = (la) objK2;
            Object objK3 = lp2Var.K();
            if (objK3 == obj) {
                oh2 oh2Var = oh2.b;
                objK3 = nh2.a;
                lp2Var.g0(objK3);
            }
            ((nh2) objK3).getClass();
            oh2 oh2Var2 = new oh2();
            oh2 oh2Var3 = new oh2();
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i4 = i3 & 7168;
            boolean zF = (i4 == 2048) | ((i3 & 896) == 256) | lp2Var.f(oh2Var2);
            Object objK4 = lp2Var.K();
            if (zF || objK4 == obj) {
                cv1Var = cv1Var2;
                Object sm6Var = new sm6(z2, oh2Var2, gn2Var, null, (byte) 0);
                gn2Var2 = gn2Var;
                lp2Var.g0(sm6Var);
                objK4 = sm6Var;
            } else {
                cv1Var = cv1Var2;
                gn2Var2 = gn2Var;
            }
            h((rn2) objK4, lp2Var, boolValueOf);
            zy0 zy0VarU = jm4.U(541021225, new o90((Object) gn2Var2, (Object) um6Var, (byte) 9), lp2Var);
            boolean z3 = (i4 == 2048) | ((i3 & 14) == 4);
            Object objK5 = lp2Var.K();
            if (z3 || objK5 == obj) {
                objK5 = new zw2(gn2Var2, um6Var, (byte) 26);
                lp2Var.g0(objK5);
            }
            w51.b(z, cv1Var, ke1Var, zy0VarU, kx4Var, laVar, false, (gn2) objK5, null, jm4.U(1518935343, new zv2(um6Var, gn2Var2, oh2Var2, oh2Var3, laVar, (byte) 1), lp2Var), lp2Var, ((i3 >> 3) & 14) | 805506096 | (57344 & i3));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: rm6
                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    u70.o(um6Var, z, z2, gn2Var, kx4Var, (lp2) obj2, w79.P(i | 1));
                    return dn8.a;
                }
            };
        }
    }

    public static final long o0(float f2, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final void p(um6 um6Var, final gn2 gn2Var, kx4 kx4Var, kx4 kx4Var2, lp2 lp2Var, int i) {
        lp2 lp2Var2 = lp2Var;
        lp2Var2.X(986508982);
        int i2 = i | (lp2Var2.f(um6Var) ? 4 : 2) | (lp2Var2.h(gn2Var) ? 32 : 16) | (lp2Var2.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var2.f(kx4Var2) ? 2048 : 1024);
        final byte b2 = 0;
        if (lp2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            final String str = um6Var.c;
            RouteSettingsCache data = um6Var.a.getData();
            wq6 wq6VarA = vq6.a(new ft(12.0f, new bt()), pz2.o0, lp2Var2, 54);
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4Var);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(pz2.B0, lp2Var2, wq6VarA);
            pn7.m(pz2.A0, lp2Var2, kl5VarL);
            pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
            pn7.l(lp2Var2);
            pn7.m(pz2.z0, lp2Var2, kx4VarQ);
            boolean isSelected = data.getIsSelected();
            boolean z = !um6Var.b;
            int i3 = i2 & 112;
            boolean zF = (i3 == 32) | lp2Var2.f(str);
            Object objK = lp2Var2.K();
            be beVar = zz0.a;
            if (zF || objK == beVar) {
                objK = new dn2() { // from class: pm6
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b3 = b2;
                        dn8 dn8Var = dn8.a;
                        String str2 = str;
                        gn2 gn2Var2 = gn2Var;
                        switch (b3) {
                            case 0:
                                str2.getClass();
                                gn2Var2.B(new uo7(str2));
                                break;
                            default:
                                str2.getClass();
                                gn2Var2.B(new so7(str2));
                                break;
                        }
                        return dn8Var;
                    }
                };
                lp2Var2.g0(objK);
            }
            wl7.c(isSelected, z, (dn2) objK, lp2Var2, 0, 2);
            m(um6Var, xq6.a(), lp2Var2, i2 & 14);
            zc1.b(um6Var.b, null, null, null, null, g33.a, lp2Var, 1572870);
            g73 g73VarR = R();
            String name = data.getName();
            long j = ((dp) lp2Var.j(ep.z)).h.b;
            boolean zF2 = lp2Var.f(str) | (i3 == 32);
            Object objK2 = lp2Var.K();
            if (zF2 || objK2 == beVar) {
                final byte b3 = 1;
                objK2 = new dn2() { // from class: pm6
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b4 = b3;
                        dn8 dn8Var = dn8.a;
                        String str2 = str;
                        gn2 gn2Var2 = gn2Var;
                        switch (b4) {
                            case 0:
                                str2.getClass();
                                gn2Var2.B(new uo7(str2));
                                break;
                            default:
                                str2.getClass();
                                gn2Var2.B(new so7(str2));
                                break;
                        }
                        return dn8Var;
                    }
                };
                lp2Var.g0(objK2);
            }
            os4.a(g73VarR, os4.x(vj8.x(kx4Var2, false, null, null, null, (dn2) objK2, lp2Var, 31), 12.0f), name, j, lp2Var, 0, 0);
            lp2Var2 = lp2Var;
            lp2Var2.p(true);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new j30(um6Var, gn2Var, kx4Var, kx4Var2, i);
        }
    }

    public static final li5 p0(Integer num, Integer num2, Integer num3, bx5 bx5Var, String str, boolean z) {
        int iIntValue;
        d02 d02Var;
        int iIntValue2 = num.intValue() + (z ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return q0(z, bx5Var, str, iIntValue2, iIntValue);
        }
        li5 li5VarQ0 = q0(z, bx5Var, str, iIntValue2, iIntValue2);
        while (true) {
            d02Var = d02.X;
            if (iIntValue2 >= iMin) {
                break;
            }
            iIntValue2++;
            li5VarQ0 = new li5(d02Var, i21.L(q0(z, bx5Var, str, iIntValue2, iIntValue2), pu.l(i21.L(new li5(i21.K(new ko5(" ")), d02Var), li5VarQ0))));
        }
        if (iIntValue3 > iIntValue) {
            return pu.l(i21.L(new li5(i21.K(new ko5(mm7.V(iIntValue3 - iIntValue, " "))), d02Var), li5VarQ0));
        }
        return iIntValue3 == iIntValue ? li5VarQ0 : new li5(d02Var, i21.L(q0(z, bx5Var, str, iIntValue3 + 1, iIntValue), li5VarQ0));
    }

    public static final void q(dn2 dn2Var, lp2 lp2Var) {
        wc5 wc5Var = lp2Var.M.b.i0;
        wc5Var.b0(jc5.d);
        w45.S(wc5Var, 0, dn2Var);
    }

    public static final li5 q0(boolean z, bx5 bx5Var, String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            bt.i("Check failed.");
            return null;
        }
        gb4 gb4VarR = i21.r();
        if (z) {
            gb4VarR.add(new ko5("-"));
        }
        gb4VarR.add(new w75(i21.K(new eo8(Integer.valueOf(i - (z ? 1 : 0)), Integer.valueOf(i2 - (z ? 1 : 0)), bx5Var, str, z))));
        return new li5(i21.j(gb4VarR), d02.X);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(String str, boolean z, kx4 kx4Var, lp2 lp2Var, int i) {
        lp2Var.X(1947603456);
        int i2 = (lp2Var.f(str) ? 4 : 2) | i | (lp2Var.g(z) ? 32 : 16) | (lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 >> 3;
            zc1.c(z, kx4Var, b22.c(null, 3).a(new g22(new be8((u72) null, (eb7) null, (fp0) null, new qw6((2 & 7) != 0 ? 0.0f : 0.92f, gd8.b, (7 & 1) != 0 ? wl7.V(0.0f, 400.0f, null, 5) : null), (LinkedHashMap) null, 119))), b22.d(null, 3).a(new h62(new be8((u72) null, (eb7) null, (fp0) null, new qw6(0.0f, gd8.b, wl7.V(0.0f, 400.0f, null, 5)), (LinkedHashMap) (0 == true ? 1 : 0), 119))), null, jm4.U(1057438936, new hx2(str, (byte) 1), lp2Var), lp2Var, (i3 & 112) | (i3 & 14) | 200064, 16);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new wx2(str, z, kx4Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int s(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u70.s(int, int, int, boolean):int");
    }

    public static final long s0(long j) {
        be beVar = gx1.Y;
        boolean z = j > 0;
        if (z) {
            return gx1.d(gx1.i(j, vj8.m0(999999L, lx1.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        b61.c();
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object t(xx6 xx6Var, float f2, qk qkVar, bd1 bd1Var, gn2 gn2Var, s51 s51Var) {
        zc7 zc7Var;
        float f3;
        ba6 ba6Var;
        if (s51Var instanceof zc7) {
            zc7Var = (zc7) s51Var;
            int i = zc7Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                zc7Var.j0 = i - Integer.MIN_VALUE;
            } else {
                zc7Var = new zc7(s51Var);
            }
        } else {
            zc7Var = new zc7(s51Var);
        }
        Object obj = zc7Var.i0;
        int i2 = zc7Var.j0;
        if (i2 == 0) {
            w39.n0(obj);
            ba6 ba6Var2 = new ba6();
            boolean z = ((Number) qkVar.a()).floatValue() == 0.0f;
            yc7 yc7Var = new yc7(f2, ba6Var2, xx6Var, gn2Var, (byte) 0);
            zc7Var.g0 = qkVar;
            zc7Var.h0 = ba6Var2;
            zc7Var.f0 = f2;
            zc7Var.j0 = 1;
            Object objC = ry7.c(qkVar, bd1Var, !z, yc7Var, zc7Var);
            c71 c71Var = c71.X;
            if (objC == c71Var) {
                return c71Var;
            }
            f3 = f2;
            ba6Var = ba6Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f3 = zc7Var.f0;
            ba6Var = zc7Var.h0;
            qkVar = zc7Var.g0;
            w39.n0(obj);
        }
        return new mk(new Float(f3 - ba6Var.X), qkVar);
    }

    public static final kx4 t0(boolean z, xz4 xz4Var, boolean z2, kl6 kl6Var, gn2 gn2Var) {
        return xv4.X.y(new gb8(z, xz4Var, z2, kl6Var, gn2Var));
    }

    public static final void u(ok okVar, xx6 xx6Var, gn2 gn2Var, float f2) {
        float fA;
        try {
            fA = xx6Var.a(f2);
        } catch (CancellationException unused) {
            okVar.a();
            fA = 0.0f;
        }
        gn2Var.B(Float.valueOf(fA));
        if (Math.abs(f2 - fA) > 0.5f) {
            okVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object v(xx6 xx6Var, float f2, float f3, qk qkVar, pk pkVar, gn2 gn2Var, s51 s51Var) {
        ad7 ad7Var;
        float fFloatValue;
        qk qkVar2;
        ba6 ba6Var;
        float f4 = f2;
        if (s51Var instanceof ad7) {
            ad7Var = (ad7) s51Var;
            int i = ad7Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ad7Var.k0 = i - Integer.MIN_VALUE;
            } else {
                ad7Var = new ad7(s51Var);
            }
        } else {
            ad7Var = new ad7(s51Var);
        }
        ad7 ad7Var2 = ad7Var;
        Object obj = ad7Var2.j0;
        int i2 = ad7Var2.k0;
        if (i2 == 0) {
            w39.n0(obj);
            ba6 ba6Var2 = new ba6();
            fFloatValue = ((Number) qkVar.a()).floatValue();
            Float f5 = new Float(f4);
            boolean z = ((Number) qkVar.a()).floatValue() == 0.0f;
            yc7 yc7Var = new yc7(f3, ba6Var2, xx6Var, gn2Var, (byte) 1);
            ad7Var2.h0 = qkVar;
            ad7Var2.i0 = ba6Var2;
            ad7Var2.f0 = f4;
            ad7Var2.g0 = fFloatValue;
            ad7Var2.k0 = 1;
            Object objD = ry7.d(qkVar, f5, pkVar, !z, yc7Var, ad7Var2);
            c71 c71Var = c71.X;
            if (objD == c71Var) {
                return c71Var;
            }
            qkVar2 = qkVar;
            ba6Var = ba6Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f6 = ad7Var2.g0;
            float f7 = ad7Var2.f0;
            ba6Var = ad7Var2.i0;
            qkVar2 = ad7Var2.h0;
            w39.n0(obj);
            fFloatValue = f6;
            f4 = f7;
        }
        return new mk(new Float(f4 - ba6Var.X), z68.u(qkVar2, 0.0f, A(((Number) qkVar2.a()).floatValue(), fFloatValue), 29));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void w(s51 s51Var) {
        lh1 lh1Var;
        if (s51Var instanceof lh1) {
            lh1Var = (lh1) s51Var;
            int i = lh1Var.g0;
            if ((i & Integer.MIN_VALUE) != 0) {
                lh1Var.g0 = i - Integer.MIN_VALUE;
            } else {
                lh1Var = new lh1(s51Var);
            }
        } else {
            lh1Var = new lh1(s51Var);
        }
        Object obj = lh1Var.f0;
        int i2 = lh1Var.g0;
        if (i2 == 0) {
            w39.n0(obj);
            lh1Var.g0 = 1;
            mm0 mm0Var = new mm0(1, mb6.H(lh1Var));
            mm0Var.s();
            if (mm0Var.q() == c71.X) {
                return;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w39.n0(obj);
        }
        b61.n();
    }

    public static final void x(s61 s61Var, CancellationException cancellationException) {
        bm3 bm3Var = (bm3) s61Var.H0(oy1.E0);
        if (bm3Var != null) {
            bm3Var.m(cancellationException);
        }
    }

    public static void y(bm3 bm3Var) {
        Iterator it = bm3Var.g().iterator();
        while (it.hasNext()) {
            ((bm3) it.next()).m(null);
        }
    }

    public abstract boolean B();

    public abstract void H(boolean z);

    public abstract int N();

    public abstract Context U();

    public boolean V() {
        return false;
    }

    public abstract boolean b0(int i, KeyEvent keyEvent);

    public boolean c0(KeyEvent keyEvent) {
        return false;
    }

    public boolean d0() {
        return false;
    }

    public abstract void l0(boolean z);

    public abstract void n0(CharSequence charSequence);

    public l5 r0(dq dqVar) {
        return null;
    }

    public boolean z() {
        return false;
    }

    public void Z() {
    }

    public void a0() {
    }

    public void k0(boolean z) {
    }

    public void m0(boolean z) {
    }
}
