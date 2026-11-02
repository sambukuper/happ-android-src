package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.Spanned;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vr3 {
    public static final jw0 b = jw0.o0;
    public static final jw0 c;
    public static final jw0 d;
    public static final jw0 e;
    public static final jw0 f;
    public static final jw0 g;
    public static final zy0 h;
    public static final k82 i;
    public static final k82[] j;
    public static g73 k;
    public final /* synthetic */ byte a = 19;

    static {
        jw0 jw0Var = jw0.h0;
        c = jw0Var;
        d = jw0.p0;
        jw0 jw0Var2 = jw0.i0;
        e = jw0Var2;
        f = jw0Var;
        g = jw0Var2;
        h = new zy0(1926138719, false, new l4((byte) 14));
        k82 k82Var = new k82(1L, "register", true, -1);
        i = k82Var;
        j = new k82[]{k82Var, new k82(1L, "unregister", true, -1)};
    }

    public static final boolean A(y07 y07Var) {
        Object objG = y07Var.d.X.g(c17.L);
        if (objG == null) {
            objG = null;
        }
        ib8 ib8Var = (ib8) objG;
        s05 s05Var = y07Var.d.X;
        Object objG2 = s05Var.g(c17.z);
        if (objG2 == null) {
            objG2 = null;
        }
        kl6 kl6Var = (kl6) objG2;
        boolean z = ib8Var != null;
        Object objG3 = s05Var.g(c17.K);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (kl6Var != null && kl6Var.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String B(y07 y07Var, Resources resources) {
        int iN;
        t07 t07Var = y07Var.d;
        t07 t07Var2 = y07Var.d;
        Object objG = t07Var.X.g(c17.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        s05 s05Var = t07Var2.X;
        Object objG2 = s05Var.g(c17.L);
        if (objG2 == null) {
            objG2 = null;
        }
        ib8 ib8Var = (ib8) objG2;
        Object objG3 = s05Var.g(c17.z);
        if (objG3 == null) {
            objG3 = null;
        }
        kl6 kl6Var = (kl6) objG3;
        if (ib8Var != null) {
            int iOrdinal = ib8Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        b61.c();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(b56.indeterminate);
                    }
                } else if (kl6Var != null && kl6Var.a == 2 && objG == null) {
                    objG = resources.getString(b56.state_off);
                }
            } else if (kl6Var != null && kl6Var.a == 2 && objG == null) {
                objG = resources.getString(b56.state_on);
            }
        }
        Object objG4 = s05Var.g(c17.K);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((kl6Var == null || kl6Var.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(b56.selected) : resources.getString(b56.not_selected);
            }
        }
        Object objG5 = s05Var.g(c17.c);
        if (objG5 == null) {
            objG5 = null;
        }
        qw5 qw5Var = (qw5) objG5;
        if (qw5Var != null) {
            if (qw5Var != qw5.d) {
                if (objG == null) {
                    uu0 uu0Var = qw5Var.b;
                    float f2 = uu0Var.Y;
                    float f3 = uu0Var.X;
                    float f4 = f2 - f3 == 0.0f ? 0.0f : (qw5Var.a - f3) / (uu0Var.Y - f3);
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    }
                    if (f4 == 0.0f) {
                        iN = 0;
                    } else {
                        iN = f4 == 1.0f ? 100 : x97.n(Math.round(f4 * 100.0f), 1, 99);
                    }
                    objG = resources.getString(b56.template_percent, Integer.valueOf(iN));
                }
            } else if (objG == null) {
                objG = resources.getString(b56.in_progress);
            }
        }
        e17 e17Var = c17.G;
        if (s05Var.c(e17Var)) {
            s05 s05Var2 = new y07(y07Var.a, true, y07Var.c, t07Var2).k().X;
            Object objG6 = s05Var2.g(c17.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = s05Var2.g(c17.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = s05Var2.g(e17Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(b56.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final ql C(y07 y07Var) {
        Object objG = y07Var.d.X.g(c17.G);
        if (objG == null) {
            objG = null;
        }
        ql qlVar = (ql) objG;
        Object objG2 = y07Var.d.X.g(c17.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return qlVar == null ? list != null ? (ql) wv0.t0(list) : null : qlVar;
    }

    public static final ot0 D(ed1 ed1Var) {
        ed1 ed1VarP = ed1Var.p();
        if (ed1VarP == null || (ed1Var instanceof tf5)) {
            return null;
        }
        if (!(ed1VarP.p() instanceof tf5)) {
            return D(ed1VarP);
        }
        if (ed1VarP instanceof ot0) {
            return (ot0) ed1VarP;
        }
        return null;
    }

    public static Object E(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final void F(s61 s61Var, Throwable th) {
        if (th instanceof mp1) {
            th = ((mp1) th).X;
        }
        try {
            v61 v61Var = (v61) s61Var.H0(oy1.p0);
            if (v61Var != null) {
                v61Var.J(s61Var, th);
            } else {
                dh3.y(s61Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                gv3.g(runtimeException, th);
                th = runtimeException;
            }
            dh3.y(s61Var, th);
        }
    }

    public static final boolean G(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static u73 H(Object obj) {
        return obj == null ? u73.Z : new u73(obj, (byte) 0);
    }

    public static final boolean I(y07 y07Var) {
        t07 t07VarK = y07Var.k();
        return t07VarK.X.c(c17.B);
    }

    public static final boolean J(t14 t14Var) {
        t14Var.getClass();
        mo8 mo8VarQ0 = t14Var.q0();
        if (mo8VarQ0 instanceof q32) {
            return true;
        }
        return (mo8VarQ0 instanceof ce2) && (((ce2) mo8VarQ0).u0() instanceof q32);
    }

    public static final boolean K(hq5 hq5Var, long j2, long j3) {
        int i2 = hq5Var.i == 1 ? 1 : 0;
        long j4 = hq5Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        float f2 = i2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) * f2;
        float f3 = ((int) (j2 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f2;
        return (fIntBitsToFloat > f3) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j2 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final boolean L(y07 y07Var, Resources resources) {
        if (jm4.L(y07Var)) {
            return false;
        }
        t07 t07Var = y07Var.d;
        if (t07Var.Z) {
            return true;
        }
        Object objG = t07Var.X.g(c17.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !((list != null ? (String) wv0.t0(list) : null) == null && C(y07Var) == null && B(y07Var, resources) == null && !A(y07Var)) && M(y07Var);
    }

    public static final boolean M(y07 y07Var) {
        if (!y07Var.n()) {
            List listI = y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (I((y07) listI.get(i2))) {
                }
            }
            LayoutNode layoutNodeW = y07Var.c.w();
            while (true) {
                if (layoutNodeW == null) {
                    layoutNodeW = null;
                    break;
                }
                t07 t07VarY = layoutNodeW.y();
                if (t07VarY != null && t07VarY.Z) {
                    break;
                }
                layoutNodeW = layoutNodeW.w();
            }
            return !(layoutNodeW != null);
        }
        return false;
    }

    public static ud0 N(s61 s61Var, rn2 rn2Var) {
        s61Var.getClass();
        return u15.u(new mf1((Object) s61Var, (Object) e71.X, (Object) rn2Var, (byte) 3));
    }

    public static yr4 O(tq6 tq6Var, int i2, int i3, int i4, int i5, int i6, zr4 zr4Var, List list, eo5[] eo5VarArr, int i7) {
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        List list2 = list;
        long j2 = i6;
        int[] iArr = new int[i7];
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int iMin = 0;
        float f3 = 0.0f;
        while (i12 < i7) {
            tr4 tr4Var = (tr4) list2.get(i12);
            float fX = dh3.x(dh3.w(tr4Var));
            if (fX > 0.0f) {
                f3 += fX;
                i13++;
                i9 = i12;
            } else {
                int i15 = i4 - i14;
                eo5 eo5VarO = eo5VarArr[i12];
                if (eo5VarO == null) {
                    if (i4 == Integer.MAX_VALUE) {
                        i9 = i12;
                        i10 = i13;
                        i11 = Integer.MAX_VALUE;
                    } else {
                        i9 = i12;
                        i10 = i13;
                        i11 = i15 < 0 ? 0 : i15;
                    }
                    eo5VarO = tr4Var.o(tq6Var.b(0, i11, i5, false));
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                eo5 eo5Var = eo5VarO;
                int iJ = tq6Var.j(eo5Var);
                int iH = tq6Var.h(eo5Var);
                iArr[i9] = iJ;
                int i16 = i15 - iJ;
                if (i16 < 0) {
                    i16 = 0;
                }
                iMin = Math.min(i6, i16);
                i14 += iJ + iMin;
                iMax = Math.max(iMax, iH);
                eo5VarArr[i9] = eo5Var;
                i13 = i10;
            }
            i12 = i9 + 1;
            j2 = j2;
        }
        long j3 = j2;
        int i17 = i13;
        if (i17 == 0) {
            i14 -= iMin;
            i8 = 0;
        } else {
            long j4 = ((long) (i17 - 1)) * j3;
            long jRound = ((long) ((i4 != Integer.MAX_VALUE ? i4 : i2) - i14)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f3;
            for (int i18 = 0; i18 < i7; i18++) {
                jRound -= (long) Math.round(dh3.x(dh3.w((tr4) list2.get(i18))) * f4);
            }
            int i19 = iMax;
            int i20 = 0;
            int i21 = 0;
            while (i20 < i7) {
                if (eo5VarArr[i20] == null) {
                    tr4 tr4Var2 = (tr4) list2.get(i20);
                    uq6 uq6VarW = dh3.w(tr4Var2);
                    float fX2 = dh3.x(uq6VarW);
                    if (fX2 <= 0.0f) {
                        uc3.b("All weights <= 0 should have placeables");
                    }
                    f2 = f4;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fX2 * f2) + iSignum);
                    eo5 eo5VarO2 = tr4Var2.o(tq6Var.b((!(uq6VarW != null ? uq6VarW.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i5, true));
                    int iJ2 = tq6Var.j(eo5VarO2);
                    int iH2 = tq6Var.h(eo5VarO2);
                    iArr[i20] = iJ2;
                    i21 += iJ2;
                    int iMax3 = Math.max(i19, iH2);
                    eo5VarArr[i20] = eo5VarO2;
                    i19 = iMax3;
                } else {
                    f2 = f4;
                }
                i20++;
                list2 = list;
                f4 = f2;
            }
            i8 = (int) (((long) i21) + j4);
            int i22 = i4 - i14;
            if (i8 < 0) {
                i8 = 0;
            }
            if (i8 > i22) {
                i8 = i22;
            }
            iMax = i19;
        }
        int i23 = i8 + i14;
        if (i23 < 0) {
            i23 = 0;
        }
        int iMax4 = Math.max(i23, i2);
        int iMax5 = Math.max(iMax, Math.max(i3, 0));
        int[] iArr2 = new int[i7];
        tq6Var.a(iMax4, zr4Var, iArr, iArr2);
        return tq6Var.e(eo5VarArr, zr4Var, iArr2, iMax4, iMax5);
    }

    public static xb4 P(xb4 xb4Var) {
        xb4Var.getClass();
        if (xb4Var.isDone()) {
            return xb4Var;
        }
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            T(false, xb4Var, qd0Var, dp1.a());
            qd0Var.a = "nonCancellationPropagating[" + xb4Var + "]";
        } catch (Exception e2) {
            ud0Var.b(e2);
        }
        return ud0Var;
    }

    public static final kx4 Q(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new oa5(gn2Var));
    }

    public static final nz5 R(nz5 nz5Var, ux4 ux4Var) {
        nz5Var.getClass();
        ux4Var.getClass();
        int i2 = nz5Var.Z;
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            return nz5Var.o0;
        }
        if ((i2 & 512) == 512) {
            return ux4Var.a(nz5Var.p0);
        }
        return null;
    }

    public static final long S(hq5 hq5Var, boolean z) {
        long jE = z85.e(hq5Var.c, hq5Var.g);
        if (z || !hq5Var.c()) {
            return jE;
        }
        return 0L;
    }

    public static void T(boolean z, xb4 xb4Var, qd0 qd0Var, dp1 dp1Var) {
        xb4Var.getClass();
        qd0Var.getClass();
        dp1Var.getClass();
        xb4Var.a(new zo2(xb4Var, new q02((Object) qd0Var, (byte) 6), (byte) 0), dp1Var);
        if (z) {
            qd0Var.a(new xb(xb4Var, (byte) 11), dp1.a());
        }
    }

    public static final nz5 U(vy5 vy5Var, ux4 ux4Var) {
        vy5Var.getClass();
        ux4Var.getClass();
        int i2 = vy5Var.Z;
        if ((i2 & 32) == 32) {
            return vy5Var.l0;
        }
        if ((i2 & 64) == 64) {
            return ux4Var.a(vy5Var.m0);
        }
        return null;
    }

    public static final nz5 V(cz5 cz5Var, ux4 ux4Var) {
        cz5Var.getClass();
        ux4Var.getClass();
        int i2 = cz5Var.Z;
        if ((i2 & 32) == 32) {
            return cz5Var.l0;
        }
        if ((i2 & 64) == 64) {
            return ux4Var.a(cz5Var.m0);
        }
        return null;
    }

    public static final sx4 W(vx4 vx4Var, fk2 fk2Var) {
        et4 et4VarQ0;
        vx4Var.getClass();
        fk2Var.getClass();
        gk2 gk2Var = fk2Var.a;
        if (!gk2Var.c()) {
            p74 p74Var = vx4Var.b0(fk2Var.b()).k0;
            v15 v15VarG = gk2Var.g();
            x45 x45Var = x45.X;
            ot0 ot0VarE = p74Var.e(v15VarG, x45Var);
            sx4 sx4Var = ot0VarE instanceof sx4 ? (sx4) ot0VarE : null;
            if (sx4Var != null) {
                return sx4Var;
            }
            sx4 sx4VarW = W(vx4Var, fk2Var.b());
            ot0 ot0VarE2 = (sx4VarW == null || (et4VarQ0 = sx4VarW.q0()) == null) ? null : et4VarQ0.e(gk2Var.g(), x45Var);
            if (ot0VarE2 instanceof sx4) {
                return (sx4) ot0VarE2;
            }
        }
        return null;
    }

    public static final nz5 X(vy5 vy5Var, ux4 ux4Var) {
        vy5Var.getClass();
        ux4Var.getClass();
        int i2 = vy5Var.Z;
        if ((i2 & 8) == 8) {
            nz5 nz5Var = vy5Var.i0;
            nz5Var.getClass();
            return nz5Var;
        }
        if ((i2 & 16) == 16) {
            return ux4Var.a(vy5Var.j0);
        }
        bt.i("No returnType in ProtoBuf.Function");
        return null;
    }

    public static final nz5 Y(cz5 cz5Var, ux4 ux4Var) {
        cz5Var.getClass();
        ux4Var.getClass();
        int i2 = cz5Var.Z;
        if ((i2 & 8) == 8) {
            nz5 nz5Var = cz5Var.i0;
            nz5Var.getClass();
            return nz5Var;
        }
        if ((i2 & 16) == 16) {
            return ux4Var.a(cz5Var.j0);
        }
        bt.i("No returnType in ProtoBuf.Property");
        return null;
    }

    public static final kx4 Z(kx4 kx4Var, j74 j74Var, sd5 sd5Var, td tdVar, boolean z, he2 he2Var, xz4 xz4Var, pj7 pj7Var) {
        sd5 sd5Var2 = sd5.X;
        hx4 hx4Var = hx4.X;
        return kx4Var.y(sd5Var == sd5Var2 ? w39.k(hx4Var, x03.c) : w39.k(hx4Var, x03.b)).y(new by6(tdVar, pj7Var, he2Var, xz4Var, sd5Var, j74Var, z, false));
    }

    public static final ux0 a(Object obj) {
        ux0 ux0Var = new ux0();
        ux0Var.V(obj);
        return ux0Var;
    }

    public static final List a0(fy5 fy5Var, ux4 ux4Var) {
        fy5Var.getClass();
        ux4Var.getClass();
        List arrayList = fy5Var.j0;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = fy5Var.k0;
            list.getClass();
            arrayList = new ArrayList(xv0.Z(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(ux4Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final void b(final dn2 dn2Var, final boolean z, final boolean z2, final zy0 zy0Var, lp2 lp2Var, final int i2) {
        int i3;
        lp2Var.X(963079373);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.h(dn2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.f(hx4.X) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.g(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= lp2Var.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= lp2Var.h(zy0Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (lp2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (objK == beVar) {
                objK = z51.b(0.0f);
                lp2Var.g0(objK);
            }
            final oi oiVar = (oi) objK;
            Object objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = z51.H(Boolean.FALSE);
                lp2Var.g0(objK2);
            }
            final y05 y05Var = (y05) objK2;
            final y05 y05VarP = z51.P(dn2Var, lp2Var);
            Object objK3 = lp2Var.K();
            if (objK3 == beVar) {
                objK3 = new eh(y05Var, (byte) 3);
                lp2Var.g0(objK3);
            }
            final dn2 dn2Var2 = (dn2) objK3;
            jm4.c(dn2Var2, new vn1(z, z, false, false, 228), jm4.U(417409956, new rn2() { // from class: bw2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    boolean z3;
                    lp2 lp2Var2 = (lp2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ViewParent parent = ((View) lp2Var2.j(pc.f)).getParent();
                        parent.getClass();
                        Window window = ((no1) parent).getWindow();
                        be7 be7Var = (be7) lp2Var2.j(y01.q);
                        Configuration configuration = (Configuration) lp2Var2.j(pc.a);
                        WeakHashMap weakHashMap = c29.w;
                        if (((Boolean) hw7.b(lp2Var2).c.d.getValue()).booleanValue()) {
                            lp2Var2.W(1699026412);
                            z3 = hw7.b(lp2Var2).c.e().d == 0;
                            lp2Var2.p(false);
                        } else {
                            lp2Var2.W(1130212457);
                            lp2Var2.p(false);
                            z3 = false;
                        }
                        final float f2 = z3 ? configuration.screenHeightDp / 2.0f : 0.0f;
                        y05 y05Var2 = y05Var;
                        Boolean bool = (Boolean) y05Var2.getValue();
                        bool.getClass();
                        boolean zF = lp2Var2.f(be7Var);
                        oi oiVar2 = oiVar;
                        boolean zH = zF | lp2Var2.h(oiVar2);
                        y05 y05Var3 = y05VarP;
                        boolean zF2 = zH | lp2Var2.f(y05Var3);
                        Object objK4 = lp2Var2.K();
                        be beVar2 = zz0.a;
                        if (zF2 || objK4 == beVar2) {
                            wu1 wu1Var = new wu1(be7Var, oiVar2, y05Var2, y05Var3, null, (byte) 2);
                            lp2Var2.g0(wu1Var);
                            objK4 = wu1Var;
                        }
                        u70.h((rn2) objK4, lp2Var2, bool);
                        boolean zH2 = lp2Var2.h(window);
                        Object objK5 = lp2Var2.K();
                        if (zH2 || objK5 == beVar2) {
                            objK5 = new tb2(window, (byte) 5);
                            lp2Var2.g0(objK5);
                        }
                        u70.q((dn2) objK5, lp2Var2);
                        kx4 kx4VarT = z91.T(b.c, z91.c);
                        xr4 xr4VarC = g80.c(pz2.l0, false);
                        int iHashCode = Long.hashCode(lp2Var2.T);
                        kl5 kl5VarL = lp2Var2.l();
                        kx4 kx4VarQ = w45.Q(lp2Var2, kx4VarT);
                        uz0.j.getClass();
                        lp2Var2.Z();
                        if (lp2Var2.S) {
                            lp2Var2.k();
                        } else {
                            lp2Var2.j0();
                        }
                        pn7.m(pz2.B0, lp2Var2, xr4VarC);
                        pn7.m(pz2.A0, lp2Var2, kl5VarL);
                        pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
                        pn7.l(lp2Var2);
                        pn7.m(pz2.z0, lp2Var2, kx4VarQ);
                        d80 d80Var = new d80(pz2.i0, true);
                        boolean zH3 = lp2Var2.h(oiVar2);
                        Object objK6 = lp2Var2.K();
                        if (zH3 || objK6 == beVar2) {
                            objK6 = new vv2(oiVar2, (byte) 0);
                            lp2Var2.g0(objK6);
                        }
                        kx4 kx4VarI = jm4.I(d80Var, (gn2) objK6);
                        float f3 = n70.a;
                        kx4 kx4VarF = u15.f(kx4VarI, dw0.b(0.32f, kw0.c(ch3.e, lp2Var2)), u70.e);
                        boolean z4 = z;
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        boolean zG = lp2Var2.g(z4);
                        Object objK7 = lp2Var2.K();
                        final dn2 dn2Var3 = dn2Var2;
                        if (zG || objK7 == beVar2) {
                            objK7 = new ew2(dn2Var3, z4);
                            lp2Var2.g0(objK7);
                        }
                        g80.a(yy7.a(kx4VarF, boolValueOf, (PointerInputEventHandler) objK7), lp2Var2, 0);
                        x67 x67VarB = q77.b(nr4.J, lp2Var2);
                        long j2 = ((dp) lp2Var2.j(ep.z)).b.b;
                        kx4 kx4VarY = b.l(hx4.X, n70.a, 1).y(b.a);
                        boolean zH4 = lp2Var2.h(oiVar2);
                        Object objK8 = lp2Var2.K();
                        if (zH4 || objK8 == beVar2) {
                            objK8 = new vv2(oiVar2, (byte) 1);
                            lp2Var2.g0(objK8);
                        }
                        kx4 kx4VarI2 = jm4.I(kx4VarY, (gn2) objK8);
                        final boolean z5 = z2;
                        final zy0 zy0Var2 = zy0Var;
                        ay7.a(kx4VarI2, x67VarB, j2, 0L, 0.0f, 0.0f, jm4.U(-949767483, new rn2() { // from class: wv2
                            @Override // defpackage.rn2
                            public final Object K(Object obj3, Object obj4) {
                                lp2 lp2Var3 = (lp2) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ut8 ut8Var = z91.e;
                                    hx4 hx4Var = hx4.X;
                                    kx4 kx4VarA = os4.A(z91.T(hx4Var, ut8Var), 0.0f, 0.0f, 0.0f, f2, 7);
                                    tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var3, 0);
                                    int iHashCode2 = Long.hashCode(lp2Var3.T);
                                    kl5 kl5VarL2 = lp2Var3.l();
                                    kx4 kx4VarQ2 = w45.Q(lp2Var3, kx4VarA);
                                    uz0.j.getClass();
                                    lp2Var3.Z();
                                    if (lp2Var3.S) {
                                        lp2Var3.k();
                                    } else {
                                        lp2Var3.j0();
                                    }
                                    pn7.m(pz2.B0, lp2Var3, tw0VarA);
                                    pn7.m(pz2.A0, lp2Var3, kl5VarL2);
                                    pn7.m(pz2.C0, lp2Var3, Integer.valueOf(iHashCode2));
                                    pn7.l(lp2Var3);
                                    pn7.m(pz2.z0, lp2Var3, kx4VarQ2);
                                    ch3.f(lp2Var3, b.b(hx4Var, 16.0f));
                                    if (z5) {
                                        lp2Var3.W(839871337);
                                        r03 r03Var = new r03(pz2.r0);
                                        hx4Var.y(r03Var);
                                        vr3.c(r03Var, 0.0f, 0.0f, null, 0L, lp2Var3, 0);
                                        ch3.f(lp2Var3, b.b(hx4Var, 16.0f));
                                        lp2Var3.p(false);
                                    } else {
                                        lp2Var3.W(840034707);
                                        lp2Var3.p(false);
                                    }
                                    zy0Var2.F(uw0.a, dn2Var3, lp2Var3, 54);
                                    lp2Var3.p(true);
                                } else {
                                    lp2Var3.Q();
                                }
                                return dn8.a;
                            }
                        }, lp2Var2), lp2Var2, 12582912, 120);
                        lp2Var2.p(true);
                    } else {
                        lp2Var2.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var), lp2Var, 390);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: cw2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vr3.b(dn2Var, z, z2, zy0Var, (lp2) obj, w79.P(i2 | 1));
                    return dn8.a;
                }
            };
        }
    }

    public static void b0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != 1) {
            throw new g01(arrayList);
        }
        Throwable th = (Throwable) arrayList.get(0);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        u52.q(th);
    }

    public static final void c(final kx4 kx4Var, float f2, float f3, x67 x67Var, long j2, lp2 lp2Var, final int i2) {
        kx4 kx4Var2;
        int i3;
        final float f4;
        final float f5;
        final x67 x67Var2;
        final long j3;
        final float f6;
        final float f7;
        int i4;
        x67 x67VarA;
        long j4;
        lp2Var.X(486614796);
        if ((i2 & 6) == 0) {
            kx4Var2 = kx4Var;
            i3 = i2 | (lp2Var.f(kx4Var2) ? 4 : 2);
        } else {
            kx4Var2 = kx4Var;
            i3 = i2;
        }
        int i5 = i3 | 9648;
        if (lp2Var.N(i5 & 1, (i5 & 9363) != 9362)) {
            lp2Var.S();
            if ((i2 & 1) == 0 || lp2Var.x()) {
                f6 = 32.0f;
                f7 = 4.0f;
                i4 = i5 & (-64513);
                x67VarA = km6.a(24.0f);
                j4 = ((dp) lp2Var.j(ep.z)).m.a;
            } else {
                lp2Var.Q();
                f6 = f2;
                f7 = f3;
                j4 = j2;
                i4 = i5 & (-64513);
                x67VarA = x67Var;
            }
            lp2Var.q();
            ay7.a(kx4Var2, x67VarA, j4, 0L, 0.0f, 0.0f, jm4.U(-177305177, new rn2() { // from class: xv2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    lp2 lp2Var2 = (lp2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        g80.a(b.h(hx4.X, f6, f7), lp2Var2, 0);
                    } else {
                        lp2Var2.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var), lp2Var, (i4 & 14) | 12582912, 120);
            x67Var2 = x67VarA;
            j3 = j4;
            f4 = f6;
            f5 = f7;
        } else {
            lp2Var.Q();
            f4 = f2;
            f5 = f3;
            x67Var2 = x67Var;
            j3 = j2;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: yv2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vr3.c(kx4Var, f4, f5, x67Var2, j3, (lp2) obj, w79.P(i2 | 1));
                    return dn8.a;
                }
            };
        }
    }

    public static void c0(Throwable th) {
        if (th instanceof ka5) {
            throw ((ka5) th);
        }
        if (th instanceof ja5) {
            throw ((ja5) th);
        }
        if (th instanceof ga5) {
            throw ((ga5) th);
        }
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x011a  */
    /* JADX WARN: Code duplicated, block: B:84:0x014d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:87:0x0167  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void d(final dn2 dn2Var, final o87 o87Var, boolean z, boolean z2, boolean z3, boolean z4, final zy0 zy0Var, lp2 lp2Var, final int i2, final int i3) {
        dn2 dn2Var2;
        int i4;
        boolean z5;
        final boolean z6;
        boolean z7;
        final boolean z8;
        final boolean z9;
        final boolean z10;
        j86 j86VarR;
        int i5;
        boolean z11;
        boolean z12;
        boolean zT;
        int i6;
        boolean z13;
        Context context;
        Activity activity;
        Configuration configuration;
        boolean zK;
        boolean z14;
        zy0 zy0Var2;
        boolean z15;
        int i7;
        dn2Var.getClass();
        lp2Var.X(918658164);
        if ((i2 & 6) == 0) {
            dn2Var2 = dn2Var;
            i4 = (lp2Var.h(dn2Var2) ? 4 : 2) | i2;
        } else {
            dn2Var2 = dn2Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= lp2Var.f(hx4.X) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= lp2Var.f(o87Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                z5 = z;
                int i8 = lp2Var.g(z5) ? 2048 : 1024;
                i4 |= i8;
            } else {
                z5 = z;
            }
            i4 |= i8;
        } else {
            z5 = z;
        }
        int i9 = i3 & 16;
        if (i9 == 0) {
            if ((i2 & 24576) == 0) {
                z6 = z2;
                i4 |= lp2Var.g(z6) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            }
            if ((196608 & i2) == 0) {
                i4 |= DnsOverHttps.MAX_RESPONSE_SIZE;
            }
            if ((1572864 & i2) == 0) {
                i4 |= 524288;
            }
            if ((12582912 & i2) == 0) {
                if (lp2Var.h(zy0Var)) {
                    i7 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                } else {
                    i7 = 4194304;
                }
                i4 |= i7;
            }
            if ((4793491 & i4) != 4793490) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (lp2Var.N(i4 & 1, z7)) {
                lp2Var.S();
                if ((i2 & 1) != 0 || lp2Var.x()) {
                    if ((i3 & 8) != 0) {
                        z5 = !oc.t(lp2Var);
                        i4 &= -7169;
                    }
                    if (i9 != 0) {
                        z6 = true;
                    }
                    i5 = i4 & (-4128769);
                    z11 = z5;
                    z12 = !oc.t(lp2Var);
                    zT = oc.t(lp2Var);
                } else {
                    lp2Var.Q();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    i5 = i4 & (-4128769);
                    zT = z4;
                    z11 = z5;
                    z12 = z3;
                }
                i6 = i5;
                z13 = z6;
                lp2Var.q();
                context = (Context) lp2Var.j(pc.b);
                activity = (Activity) lp2Var.j(yc4.a);
                configuration = (Configuration) lp2Var.j(pc.a);
                zK = yn0.K(lp2Var);
                if (zT) {
                    lp2Var.W(214682684);
                    b(dn2Var2, z13, z12, jm4.U(929255082, new mq2(zy0Var, context, activity, configuration, (byte) 1), lp2Var), lp2Var, (i6 & 14) | 24576 | (i6 & 112) | ((i6 >> 6) & 896));
                    z14 = z12;
                    lp2Var.p(false);
                    z15 = z13;
                    z10 = z11;
                } else {
                    z14 = z12;
                    lp2Var.W(215109182);
                    long j2 = ((dp) lp2Var.j(ep.z)).b.b;
                    if (z14) {
                        zy0Var2 = w79.a;
                    } else {
                        zy0Var2 = null;
                    }
                    boolean z16 = !zK;
                    int i10 = ((i6 << 3) & 57344) | (i6 & 1022);
                    z10 = z11;
                    z15 = z13;
                    zw4.a(dn2Var, o87Var, 0.0f, z10, null, j2, 0L, 0L, zy0Var2, null, new ax4(z16, z16, z13, z13), jm4.U(-1638492810, new zv2(zy0Var, dn2Var, context, activity, configuration, (byte) 0), lp2Var), lp2Var, i10);
                    lp2Var.p(false);
                }
                z9 = zT;
                z8 = z14;
                z6 = z15;
            } else {
                lp2Var.Q();
                z8 = z3;
                z9 = z4;
                z10 = z5;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: aw2
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vr3.d(dn2Var, o87Var, z10, z6, z8, z9, zy0Var, (lp2) obj, w79.P(i2 | 1), i3);
                        return dn8.a;
                    }
                };
            }
        }
        i4 |= 24576;
        z6 = z2;
        if ((196608 & i2) == 0) {
            i4 |= DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            if (lp2Var.h(zy0Var)) {
                i7 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
            } else {
                i7 = 4194304;
            }
            i4 |= i7;
        }
        if ((4793491 & i4) != 4793490) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (lp2Var.N(i4 & 1, z7)) {
            lp2Var.S();
            if ((i2 & 1) != 0) {
                if ((i3 & 8) != 0) {
                    z5 = !oc.t(lp2Var);
                    i4 &= -7169;
                }
                if (i9 != 0) {
                    z6 = true;
                }
                i5 = i4 & (-4128769);
                z11 = z5;
                z12 = !oc.t(lp2Var);
                zT = oc.t(lp2Var);
            } else {
                if ((i3 & 8) != 0) {
                    z5 = !oc.t(lp2Var);
                    i4 &= -7169;
                }
                if (i9 != 0) {
                    z6 = true;
                }
                i5 = i4 & (-4128769);
                z11 = z5;
                z12 = !oc.t(lp2Var);
                zT = oc.t(lp2Var);
            }
            i6 = i5;
            z13 = z6;
            lp2Var.q();
            context = (Context) lp2Var.j(pc.b);
            activity = (Activity) lp2Var.j(yc4.a);
            configuration = (Configuration) lp2Var.j(pc.a);
            zK = yn0.K(lp2Var);
            if (zT) {
                lp2Var.W(214682684);
                b(dn2Var2, z13, z12, jm4.U(929255082, new mq2(zy0Var, context, activity, configuration, (byte) 1), lp2Var), lp2Var, (i6 & 14) | 24576 | (i6 & 112) | ((i6 >> 6) & 896));
                z14 = z12;
                lp2Var.p(false);
                z15 = z13;
                z10 = z11;
            } else {
                z14 = z12;
                lp2Var.W(215109182);
                long j3 = ((dp) lp2Var.j(ep.z)).b.b;
                if (z14) {
                    zy0Var2 = w79.a;
                } else {
                    zy0Var2 = null;
                }
                boolean z17 = !zK;
                int i11 = ((i6 << 3) & 57344) | (i6 & 1022);
                z10 = z11;
                z15 = z13;
                zw4.a(dn2Var, o87Var, 0.0f, z10, null, j3, 0L, 0L, zy0Var2, null, new ax4(z17, z17, z13, z13), jm4.U(-1638492810, new zv2(zy0Var, dn2Var, context, activity, configuration, (byte) 0), lp2Var), lp2Var, i11);
                lp2Var.p(false);
            }
            z9 = zT;
            z8 = z14;
            z6 = z15;
        } else {
            lp2Var.Q();
            z8 = z3;
            z9 = z4;
            z10 = z5;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: aw2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vr3.d(dn2Var, o87Var, z10, z6, z8, z9, zy0Var, (lp2) obj, w79.P(i2 | 1), i3);
                    return dn8.a;
                }
            };
        }
    }

    public static void d0(Throwable th, u85 u85Var) {
        c0(th);
        u85Var.onError(th);
    }

    public static final void e(Context context, Activity activity, Configuration configuration, zy0 zy0Var, lp2 lp2Var) {
        mb6.b(new t06[]{pc.b.a(context), yc4.a.a(activity), pc.a.a(configuration)}, jm4.U(-1092899447, new h8(zy0Var, (byte) 6), lp2Var), lp2Var, 48);
    }

    public static void e0(Throwable th, u85 u85Var, Object obj) {
        c0(th);
        ma5.a(obj, th);
        u85Var.onError(th);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(j31 j31Var, q5 q5Var, s51 s51Var) {
        cg2 cg2Var;
        aa6 aa6Var;
        h e2;
        te0 te0Var;
        if (s51Var instanceof cg2) {
            cg2Var = (cg2) s51Var;
            int i2 = cg2Var.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cg2Var.i0 = i2 - Integer.MIN_VALUE;
            } else {
                cg2Var = new cg2(s51Var);
            }
        } else {
            cg2Var = new cg2(s51Var);
        }
        Object obj = cg2Var.h0;
        int i3 = cg2Var.i0;
        if (i3 == 0) {
            w39.n0(obj);
            aa6 aa6Var2 = new aa6();
            te0 te0Var2 = new te0(q5Var, aa6Var2, (byte) 5);
            try {
                cg2Var.f0 = aa6Var2;
                cg2Var.g0 = te0Var2;
                cg2Var.i0 = 1;
                Object objA = j31Var.a(te0Var2, cg2Var);
                Object obj2 = c71.X;
                if (objA == obj2) {
                    return obj2;
                }
                aa6Var = aa6Var2;
            } catch (h e3) {
                aa6Var = aa6Var2;
                e2 = e3;
                te0Var = te0Var2;
                if (e2.X == te0Var) {
                    throw e2;
                }
                s61 s61Var = cg2Var.Y;
                s61Var.getClass();
                u70.I(s61Var);
            }
        } else {
            if (i3 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            te0Var = cg2Var.g0;
            aa6Var = cg2Var.f0;
            try {
                w39.n0(obj);
            } catch (h e4) {
                e2 = e4;
                if (e2.X == te0Var) {
                    throw e2;
                }
                s61 s61Var2 = cg2Var.Y;
                s61Var2.getClass();
                u70.I(s61Var2);
            }
        }
        return Boolean.valueOf(aa6Var.X);
    }

    public static byte[] f0(eb0 eb0Var) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = eb0Var.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return n(arrayDeque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            long j2 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j2 > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
            }
        }
        if (eb0Var.read() == -1) {
            return n(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static zo0 g0(xb4 xb4Var, vu vuVar, Executor executor) {
        zo0 zo0Var = new zo0(vuVar, xb4Var);
        xb4Var.a(zo0Var, executor);
        return zo0Var;
    }

    public static final i76 h(sa7 sa7Var) {
        sa7Var.getClass();
        return new i76(sa7Var);
    }

    public static final nz5 h0(vz5 vz5Var, ux4 ux4Var) {
        vz5Var.getClass();
        ux4Var.getClass();
        int i2 = vz5Var.Z;
        if ((i2 & 4) == 4) {
            nz5 nz5Var = vz5Var.h0;
            nz5Var.getClass();
            return nz5Var;
        }
        if ((i2 & 8) == 8) {
            return ux4Var.a(vz5Var.i0);
        }
        bt.i("No type in ProtoBuf.ValueParameter");
        return null;
    }

    public static final j76 i(je7 je7Var) {
        je7Var.getClass();
        return new j76(je7Var);
    }

    public static final nz5 i0(pz5 pz5Var, ux4 ux4Var) {
        ux4Var.getClass();
        int i2 = pz5Var.Z;
        if ((i2 & 4) == 4) {
            nz5 nz5Var = pz5Var.i0;
            nz5Var.getClass();
            return nz5Var;
        }
        if ((i2 & 8) == 8) {
            return ux4Var.a(pz5Var.j0);
        }
        bt.i("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final boolean j(hq5 hq5Var) {
        return (hq5Var.c() || hq5Var.h || !hq5Var.d) ? false : true;
    }

    public static final List j0(sz5 sz5Var, ux4 ux4Var) {
        sz5Var.getClass();
        ux4Var.getClass();
        List arrayList = sz5Var.j0;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = sz5Var.k0;
            list.getClass();
            arrayList = new ArrayList(xv0.Z(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(ux4Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final boolean k(hq5 hq5Var) {
        return !hq5Var.h && hq5Var.d;
    }

    public static final void k0(int i2, int i3) {
        if (!(i2 > 0 && i3 > 0)) {
            zc3.a("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero");
        }
        if (i2 <= i3) {
            return;
        }
        zc3.a("minLines " + i2 + " must be less than or equal to maxLines " + i3);
    }

    public static final boolean l(hq5 hq5Var) {
        return (hq5Var.c() || !hq5Var.h || hq5Var.d) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l0(s61 s61Var, Object obj, Object obj2, rn2 rn2Var, q51 q51Var) throws Throwable {
        lp0 lp0Var;
        Object objC;
        Object objK;
        if (q51Var instanceof lp0) {
            lp0Var = (lp0) q51Var;
            int i2 = lp0Var.j0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lp0Var.j0 = i2 - Integer.MIN_VALUE;
            } else {
                lp0Var = new lp0(q51Var);
            }
        } else {
            lp0Var = new lp0(q51Var);
        }
        Object obj3 = lp0Var.i0;
        int i3 = lp0Var.j0;
        if (i3 != 0) {
            if (i3 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = lp0Var.h0;
            s61 s61Var2 = lp0Var.g0;
            try {
                w39.n0(obj3);
                objC = obj4;
                s61Var = s61Var2;
                g98.a(s61Var, objC);
                return obj3;
            } catch (Throwable th) {
                objC = obj4;
                s61Var = s61Var2;
                th = th;
                g98.a(s61Var, objC);
                throw th;
            }
        }
        w39.n0(obj3);
        objC = g98.c(s61Var, obj2);
        try {
            lp0Var.f0 = obj;
            lp0Var.g0 = s61Var;
            lp0Var.h0 = objC;
            lp0Var.j0 = 1;
            fg7 fg7Var = new fg7(lp0Var, s61Var);
            if (rn2Var == null) {
                objK = mb6.k0(rn2Var, obj, fg7Var);
            } else {
                ci8.i(2, rn2Var);
                objK = rn2Var.K(obj, fg7Var);
            }
            obj3 = objK;
            Object obj5 = c71.X;
            if (obj3 == obj5) {
                return obj5;
            }
            g98.a(s61Var, objC);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            g98.a(s61Var, objC);
            throw th;
        }
    }

    public static final boolean m(hq5 hq5Var) {
        return hq5Var.h && !hq5Var.d;
    }

    public static byte[] n(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final int o(float f2, float f3, float f4, int i2, int i3) {
        if (i2 == i3) {
            return -1;
        }
        int i4 = i2 - 2;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i2 - 1;
        return nr4.O((f4 * (i5 <= 1 ? i5 : 1)) + (f3 * i4) + f2);
    }

    public static final List p(fy5 fy5Var, ux4 ux4Var) {
        fy5Var.getClass();
        ux4Var.getClass();
        List arrayList = fy5Var.o0;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = fy5Var.p0;
            list.getClass();
            arrayList = new ArrayList(xv0.Z(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(ux4Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final List q(vy5 vy5Var, ux4 ux4Var) {
        vy5Var.getClass();
        ux4Var.getClass();
        List arrayList = vy5Var.n0;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = vy5Var.o0;
            list.getClass();
            arrayList = new ArrayList(xv0.Z(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(ux4Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final List r(cz5 cz5Var, ux4 ux4Var) {
        cz5Var.getClass();
        ux4Var.getClass();
        List arrayList = cz5Var.n0;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = cz5Var.o0;
            list.getClass();
            arrayList = new ArrayList(xv0.Z(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(ux4Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static InputConnection s(InputConnection inputConnection, EditorInfo editorInfo, kd3 kd3Var) {
        g33.N(editorInfo, "editorInfo must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new id3(inputConnection, kd3Var);
        }
        return py1.b(editorInfo).length == 0 ? inputConnection : new jd3(inputConnection, kd3Var);
    }

    public static final boolean t(y07 y07Var) {
        return !y07Var.k().X.c(c17.j);
    }

    public static final ud0 u(Executor executor, String str, dn2 dn2Var) {
        executor.getClass();
        return u15.u(new mf1((Object) executor, (Object) str, (Object) dn2Var, (byte) 2));
    }

    public static final nz5 v(pz5 pz5Var, ux4 ux4Var) {
        ux4Var.getClass();
        int i2 = pz5Var.Z;
        if ((i2 & 16) == 16) {
            nz5 nz5Var = pz5Var.k0;
            nz5Var.getClass();
            return nz5Var;
        }
        if ((i2 & 32) == 32) {
            return ux4Var.a(pz5Var.l0);
        }
        bt.i("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final HashSet w(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setD = ((et4) it.next()).d();
            if (setD == null) {
                return null;
            }
            bw0.d0(hashSet, setD);
        }
        return hashSet;
    }

    public static Object x(Future future) {
        mb6.s("Future was expected to be done, " + future, future.isDone());
        return E(future);
    }

    public static final Type[] y(Constructor constructor) {
        Class declaringClass = constructor.getDeclaringClass();
        Class<?> declaringClass2 = declaringClass.getDeclaringClass();
        if (declaringClass2 == null || Modifier.isStatic(declaringClass.getModifiers())) {
            declaringClass2 = null;
        }
        if (declaringClass2 == null) {
            return z(constructor);
        }
        ps psVar = new ps(2);
        psVar.b(declaringClass2);
        psVar.c(z(constructor));
        ArrayList arrayList = psVar.b;
        return (Type[]) arrayList.toArray(new Type[arrayList.size()]);
    }

    public static final Type[] z(Constructor constructor) {
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        if (genericParameterTypes.length == constructor.getParameterTypes().length) {
            Class declaringClass = constructor.getDeclaringClass();
            if (!Modifier.isStatic(declaringClass.getModifiers()) && declaringClass.getDeclaringClass() != null) {
                return (Type[]) eu.l0(1, genericParameterTypes).toArray(new Type[0]);
            }
        }
        return genericParameterTypes;
    }

    public abstract String g();

    public String toString() {
        switch (this.a) {
            case 19:
                return g();
            default:
                return super.toString();
        }
    }
}
