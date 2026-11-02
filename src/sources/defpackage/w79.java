package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import io.sentry.util.c;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w79 implements v02 {
    public static final zy0 a = new zy0(17582204, false, new dx0(5));
    public static final pn3 b = new pn3((byte) 2);
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static final Object g = new Object();
    public static g73 h;

    public static final t14 A(t14 t14Var) {
        t14Var.getClass();
        F(t14Var);
        if (t14Var.getAnnotations().p(tg7.p) == null) {
            return null;
        }
        return ((ni8) t14Var.l0().get(o(t14Var))).b();
    }

    public static final String B(int i, lp2 lp2Var) {
        lp2Var.j(pc.a);
        return ((Context) lp2Var.j(pc.b)).getResources().getString(i);
    }

    public static final List C(t14 t14Var) {
        t14Var.getClass();
        F(t14Var);
        List listL0 = t14Var.l0();
        return listL0.subList(((!F(t14Var) || t14Var.getAnnotations().p(tg7.p) == null) ? 0 : 1) + o(t14Var), listL0.size() - 1);
    }

    public static final void D(g48 g48Var, int i, int i2) {
        g48Var.g0 = false;
        f88 f88Var = g48Var.j0;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        g48Var.c(iMin, iMax, _UrlKt.FRAGMENT_ENCODE_SET);
        if (f88Var != null) {
            long jC = mn7.c(f88Var.a, iMin, iMax, 0);
            if (f88.b(jC)) {
                g48Var.f(null);
            } else {
                g48Var.e(f88.d(jC), f88.c(jC), null);
            }
        }
    }

    public static final void E(g48 g48Var, int i, int i2, CharSequence charSequence) {
        g48 g48Var2;
        mi5 mi5Var = g48Var.Z;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == mi5Var.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        int i5 = iMax;
        while (i5 > i4 && length > i3 && charSequence.charAt(length - 1) == mi5Var.charAt(i5 - 1)) {
            length--;
            i5--;
        }
        if (i4 == i5 && i3 == length) {
            g48Var.f(null);
            g48Var.l0 = null;
            g48Var2 = g48Var;
        } else {
            CharSequence charSequenceSubSequence = (i3 == 0 && length == charSequence.length()) ? charSequence : charSequence.subSequence(i3, length);
            g48Var2 = g48Var;
            g48.d(g48Var2, i4, i5, charSequenceSubSequence, 0, false, 24);
        }
        int length2 = charSequence.length() + iMin;
        g48Var2.g(ct7.c(length2, length2));
    }

    public static final boolean F(t14 t14Var) {
        so2 so2VarX;
        t14Var.getClass();
        ot0 ot0VarX = t14Var.n0().x();
        if (ot0VarX == null) {
            return false;
        }
        if ((ot0VarX instanceof sx4) && zz3.K(ot0VarX)) {
            int i = el1.a;
            gk2 gk2VarF = bl1.f(ot0VarX);
            gk2VarF.getClass();
            so2VarX = x(gk2VarF);
        } else {
            so2VarX = null;
        }
        return dh3.f(so2VarX, oo2.d) || dh3.f(so2VarX, ro2.d);
    }

    public static final boolean G(float f2) {
        return Float.isNaN(f2) || Math.abs(f2) < 0.5f;
    }

    public static boolean H(int i) {
        return i == 6 || i == 1 || i == 2 || i == 4;
    }

    public static final boolean I(t14 t14Var) {
        t14Var.getClass();
        ot0 ot0VarX = t14Var.n0().x();
        so2 so2VarX = null;
        if (ot0VarX != null && (ot0VarX instanceof sx4) && zz3.K(ot0VarX)) {
            int i = el1.a;
            gk2 gk2VarF = bl1.f(ot0VarX);
            gk2VarF.getClass();
            so2VarX = x(gk2VarF);
        }
        return dh3.f(so2VarX, ro2.d);
    }

    public static final kx4 J(kx4 kx4Var, jw3 jw3Var, s64 s64Var, sd5 sd5Var, boolean z) {
        return kx4Var.y(new t64(jw3Var, s64Var, sd5Var, z));
    }

    public static byte[] K(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0008  */
    /* JADX WARN: Code duplicated, block: B:9:0x000c A[PHI: r1
  0x000c: PHI (r1v6 int) = (r1v0 int), (r1v1 int), (r1v2 int) binds: [B:8:0x000a, B:11:0x0010, B:30:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public static vx M(int i) {
        int i2 = 6;
        if (i != 0) {
            int i3 = 1;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = i3;
            } else {
                i3 = 5;
                if (i == 3) {
                    i2 = i3;
                } else if (i == 4) {
                    i2 = 3;
                } else if (i != 5) {
                    if (i == 6) {
                        i2 = 2;
                    } else {
                        i3 = 7;
                        if (i != 7 && i != 8) {
                            if (i == 9) {
                                i2 = 4;
                            } else if (i == 10) {
                                i2 = i3;
                            } else if (i != 11 && i != 12 && i != 13) {
                                c.a(ai0.a(i), "Unexpected CameraError: ");
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return new vx(i2);
    }

    public static int N(yo1 yo1Var, pw6 pw6Var) {
        if (yo1Var instanceof wo1) {
            return ((wo1) yo1Var).a;
        }
        int iOrdinal = pw6Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        b61.c();
        return 0;
    }

    public static Object O(byte[] bArr, Parcelable.Creator creator) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static final int P(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void Q(y07 y07Var, int i, kx6 kx6Var) {
        c15 c15Var = new c15(0, new y07[16]);
        List listI = y07Var.i(false, false);
        while (true) {
            c15Var.d(c15Var.Z, listI);
            while (true) {
                int i2 = c15Var.Z;
                if (i2 == 0) {
                    return;
                }
                y07 y07Var2 = (y07) c15Var.k(i2 - 1);
                boolean zL = jm4.L(y07Var2);
                t07 t07Var = y07Var2.d;
                s05 s05Var = t07Var.X;
                if (!zL && !s05Var.c(c17.j)) {
                    i55 i55VarD = y07Var2.d();
                    if (i55VarD == null) {
                        throw p61.j("Expected semantics node to have a coordinator.");
                    }
                    lf3 lf3VarL = os4.L(jm4.r(i55VarD, true));
                    if (lf3VarL.a < lf3VarL.c && lf3VarL.b < lf3VarL.d) {
                        Object objG = t07Var.X.g(s07.e);
                        if (objG == null) {
                            objG = null;
                        }
                        rn2 rn2Var = (rn2) objG;
                        Object objG2 = s05Var.g(c17.w);
                        jx6 jx6Var = (jx6) (objG2 != null ? objG2 : null);
                        if (rn2Var == null || jx6Var == null || ((Number) jx6Var.b.invoke()).floatValue() <= 0.0f) {
                            listI = y07Var2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            kx6Var.B(new lx6(y07Var2, i3, lf3VarL, i55VarD));
                            Q(y07Var2, i3, kx6Var);
                        }
                    }
                }
            }
        }
    }

    public static final void a(kx4 kx4Var, rn2 rn2Var, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-2140596423);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= lp2Var.h(zy0Var) ? 256 : 128;
        }
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            rn2Var = u70.b;
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objK = lp2Var.K();
            if (z || objK == zz0.a) {
                objK = new h8(zy0Var, (byte) 7);
                lp2Var.g0(objK);
            }
            sp7.a(kx4Var, (rn2) objK, lp2Var, i3 & 14, 0);
        } else {
            lp2Var.Q();
        }
        rn2 rn2Var2 = rn2Var;
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) kx4Var, (Object) rn2Var2, (Object) zy0Var, i, (byte) 8);
        }
    }

    public static final void b(zy0 zy0Var, lp2 lp2Var, int i) {
        lp2Var.X(-709502251);
        byte b2 = 2;
        if (lp2Var.N(i & 1, (i & 3) != 2)) {
            q06 q06Var = mv6.a;
            Object obj = (kv6) lp2Var.j(q06Var);
            lp2Var.W(1967007413);
            Object[] objArr = new Object[0];
            Object objK = lp2Var.K();
            Object obj2 = zz0.a;
            if (objK == obj2) {
                objK = new w76((byte) 20);
                lp2Var.g0(objK);
            }
            jv6 jv6Var = (jv6) jm4.Y(objArr, jv6.g0, (dn2) objK, lp2Var, 384);
            jv6Var.Z = (kv6) lp2Var.j(q06Var);
            lp2Var.p(false);
            Object[] objArr2 = {obj};
            xd6 xd6Var = new xd6(new nw2(b2), new zw2(obj, jv6Var, (byte) 10), (byte) 6);
            boolean zH = lp2Var.h(obj) | lp2Var.h(jv6Var);
            Object objK2 = lp2Var.K();
            if (zH || objK2 == obj2) {
                objK2 = new a23(obj, (Object) jv6Var, (byte) 3);
                lp2Var.g0(objK2);
            }
            Object obj3 = (o74) jm4.Y(objArr2, xd6Var, (dn2) objK2, lp2Var, 0);
            mb6.a(q06Var.a(obj3), jm4.U(-412824043, new i9(zy0Var, obj3, (byte) 19), lp2Var), lp2Var, 56);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new h8(zy0Var, i, (byte) 8);
        }
    }

    public static final void c(vv5 vv5Var, dn2 dn2Var, dn2 dn2Var2, o87 o87Var, lp2 lp2Var, int i) {
        vv5Var.getClass();
        dn2Var.getClass();
        dn2Var2.getClass();
        lp2Var.X(574644717);
        y05 y05VarO = i21.o(vv5Var.e, lp2Var);
        boolean zH = lp2Var.h(vv5Var);
        Object objK = lp2Var.K();
        if (zH || objK == zz0.a) {
            al5 al5Var = new al5(1, vv5Var, vv5.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/routing/profile_copy/ProfileCopyUiIntent;)V", 0, (byte) 2);
            lp2Var.g0(al5Var);
            objK = al5Var;
        }
        vr3.d(dn2Var, o87Var, false, false, false, false, jm4.U(-443635768, new lv5(vv5Var, dn2Var2, (pv3) objK, dn2Var, y05VarO), lp2Var), lp2Var, 12582912, 120);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new j30(vv5Var, dn2Var, dn2Var2, o87Var, i);
        }
    }

    public static float d(EdgeEffect edgeEffect, float f2, float f3, fi1 fi1Var) {
        float f4 = cy1.a;
        double density = fi1Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f2) * 0.35f;
        double d2 = ((double) cy1.a) * density;
        float fExp = (float) (Math.exp((cy1.b / cy1.c) * Math.log(dAbs / d2)) * d2);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? tc.k(edgeEffect) : 0.0f) * f3) {
            return 0.0f;
        }
        int iO = nr4.O(f2);
        if (i >= 31) {
            edgeEffect.onAbsorb(iO);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iO);
        }
        return f2;
    }

    public static float e(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
        return f8 < 0.0f ? -f8 : f8;
    }

    public static int f(int i, int i2, int i3) {
        int i4 = i2 & ((i >>> i3) ^ i);
        return i ^ (i4 ^ (i4 << i3));
    }

    public static int i(Context context, String str) {
        g33.N(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new y65(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static final void j(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            em7.c(i != i2 ? pc6.k(i, "Both size ", i2, " and step ", " must be greater than zero.") : ie2.h("size ", i, " must be greater than zero."));
        }
    }

    public static final ne0 k(yk3 yk3Var, boolean z) {
        Field fieldU = yk3Var.T().U();
        if (Modifier.isStatic(fieldU.getModifiers())) {
            return z ? new de0(fieldU, false, (byte) 2) : new he0(fieldU, false, false, (byte) 2);
        }
        if (z) {
            return mb6.K(yk3Var) ? new be0(fieldU, mb6.C(yk3Var.T())) : new de0(fieldU, true, (byte) 0);
        }
        return mb6.K(yk3Var) ? new fe0(fieldU, false, mb6.C(yk3Var.T())) : new he0(fieldU, false, true, (byte) 0);
    }

    public static final long l(int i, int i2, ta7 ta7Var, pw6 pw6Var, ta7 ta7Var2) {
        int i3;
        int i4;
        if (!dh3.f(ta7Var, ta7.c)) {
            i = N(ta7Var.a, pw6Var);
            i2 = N(ta7Var.b, pw6Var);
        }
        yo1 yo1Var = ta7Var2.a;
        yo1 yo1Var2 = ta7Var2.b;
        if ((yo1Var instanceof wo1) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = ((wo1) yo1Var).a)) {
            i = i4;
        }
        if ((yo1Var2 instanceof wo1) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = ((wo1) yo1Var2).a)) {
            i2 = i3;
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final void m(cl3 cl3Var) {
        if (Modifier.isStatic(cl3Var.U().getModifiers())) {
            return;
        }
        xw3.z(cl3Var.U(), "Only static properties are supported for now: ");
    }

    public static final double n(int i, int i2, int i3, int i4, pw6 pw6Var, ta7 ta7Var) {
        double dMax;
        double d2 = i;
        double d3 = ((double) i3) / d2;
        double d4 = i2;
        double d5 = ((double) i4) / d4;
        int iOrdinal = pw6Var.ordinal();
        if (iOrdinal == 0) {
            dMax = Math.max(d3, d5);
        } else {
            if (iOrdinal != 1) {
                b61.c();
                return 0.0d;
            }
            dMax = Math.min(d3, d5);
        }
        yo1 yo1Var = ta7Var.a;
        if (yo1Var instanceof wo1) {
            double d6 = ((double) ((wo1) yo1Var).a) / d2;
            if (dMax > d6) {
                dMax = d6;
            }
        }
        yo1 yo1Var2 = ta7Var.b;
        if (yo1Var2 instanceof wo1) {
            double d7 = ((double) ((wo1) yo1Var2).a) / d4;
            if (dMax > d7) {
                return d7;
            }
        }
        return dMax;
    }

    public static final int o(t14 t14Var) {
        t14Var.getClass();
        gm gmVarP = t14Var.getAnnotations().p(tg7.q);
        if (gmVarP == null) {
            return 0;
        }
        s21 s21Var = (s21) zp4.H(gmVarP.e(), ug7.e);
        s21Var.getClass();
        return ((Number) ((rf3) s21Var).a).intValue();
    }

    public static final aa7 p(zz3 zz3Var, sm smVar, t14 t14Var, List list, ArrayList arrayList, t14 t14Var2, boolean z) {
        sx4 sx4VarK;
        sm vmVar = oy1.f0;
        list.getClass();
        byte b2 = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (t14Var != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(xv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t14 t14Var3 = (t14) it.next();
            t14Var3.getClass();
            arrayList3.add(new wg7(t14Var3));
        }
        arrayList2.addAll(arrayList3);
        wg7 wg7Var = t14Var != null ? new wg7(t14Var) : null;
        if (wg7Var != null) {
            arrayList2.add(wg7Var);
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                i21.X();
                throw null;
            }
            t14 t14Var4 = (t14) obj;
            t14Var4.getClass();
            arrayList2.add(new wg7(t14Var4));
            i = i2;
        }
        arrayList2.add(new wg7(t14Var2));
        int size = list.size() + arrayList.size() + (t14Var == null ? 0 : 1);
        if (z) {
            sx4VarK = zz3Var.w(size);
        } else {
            v15 v15Var = ug7.a;
            sx4VarK = zz3Var.k("Function" + size);
        }
        if (t14Var != null) {
            fk2 fk2Var = tg7.p;
            if (!smVar.k(fk2Var)) {
                ArrayList arrayListG0 = wv0.G0(smVar, new ga0(zz3Var, fk2Var, e02.X));
                smVar = arrayListG0.isEmpty() ? vmVar : new vm(arrayListG0, b2);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            fk2 fk2Var2 = tg7.q;
            if (!smVar.k(fk2Var2)) {
                Map mapSingletonMap = Collections.singletonMap(ug7.e, new rf3(size2));
                mapSingletonMap.getClass();
                ArrayList arrayListG1 = wv0.G0(smVar, new ga0(zz3Var, fk2Var2, mapSingletonMap));
                if (!arrayListG1.isEmpty()) {
                    vmVar = new vm(arrayListG1, b2);
                }
                smVar = vmVar;
            }
        }
        return dh3.M(bt7.j(smVar), sx4VarK, arrayList2);
    }

    public static final xg7 q(sx4 sx4Var, sx4 sx4Var2) {
        sx4Var.getClass();
        sx4Var2.getClass();
        sx4Var.k0().size();
        sx4Var2.k0().size();
        List listK0 = sx4Var.k0();
        listK0.getClass();
        ArrayList arrayList = new ArrayList(xv0.Z(listK0, 10));
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            arrayList.add(((hi8) it.next()).l());
        }
        List listK1 = sx4Var2.k0();
        listK1.getClass();
        ArrayList arrayList2 = new ArrayList(xv0.Z(listK1, 10));
        Iterator it2 = listK1.iterator();
        while (it2.hasNext()) {
            aa7 aa7VarX = ((hi8) it2.next()).X();
            aa7VarX.getClass();
            arrayList2.add(new wg7(aa7VarX));
        }
        return new xg7(zp4.P(wv0.e1(arrayList, arrayList2)), (byte) 1);
    }

    public static final kx4 r(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new nv1(gn2Var));
    }

    public static final kx4 s(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new vv1(gn2Var));
    }

    public static final kx4 t(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new wv1(gn2Var));
    }

    public static final v15 u(t14 t14Var) {
        String str;
        gm gmVarP = t14Var.getAnnotations().p(tg7.r);
        if (gmVarP != null) {
            Object objP0 = wv0.P0(gmVarP.e().values());
            bm7 bm7Var = objP0 instanceof bm7 ? (bm7) objP0 : null;
            if (bm7Var != null && (str = (String) bm7Var.a) != null) {
                if (!v15.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return v15.e(str);
                }
            }
        }
        return null;
    }

    public static ColorStateList v(Context context, int i) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        uf6 uf6Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        vf6 vf6Var = new vf6(resources, theme);
        synchronized (xf6.c) {
            try {
                SparseArray sparseArray = (SparseArray) xf6.b.get(vf6Var);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (uf6Var = (uf6) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (uf6Var.b.equals(resources.getConfiguration())) {
                        if (theme != null || uf6Var.c != 0) {
                            if (theme == null || uf6Var.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = uf6Var.a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = xf6.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListA = ow0.a(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (xf6.c) {
            try {
                WeakHashMap weakHashMap = xf6.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(vf6Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(vf6Var, sparseArray2);
                }
                sparseArray2.append(i, new uf6(colorStateListA, vf6Var.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static final List w(t14 t14Var) {
        t14Var.getClass();
        F(t14Var);
        int iO = o(t14Var);
        if (iO == 0) {
            return d02.X;
        }
        List listSubList = t14Var.l0().subList(0, iO);
        ArrayList arrayList = new ArrayList(xv0.Z(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((ni8) it.next()).b());
        }
        return arrayList;
    }

    public static final so2 x(gk2 gk2Var) {
        if (!gk2Var.d() || gk2Var.c()) {
            return null;
        }
        uo2 uo2Var = uo2.b;
        fk2 fk2VarB = gk2Var.i().b();
        String strB = gk2Var.g().b();
        strB.getClass();
        uo2Var.getClass();
        to2 to2VarA = uo2Var.a(fk2VarB, strB);
        if (to2VarA != null) {
            return to2VarA.a;
        }
        return null;
    }

    public static Executor y(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? en.r(context) : new r52(new Handler(context.getMainLooper()), (byte) 0);
    }

    public static final int z(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public x14 L(x14 x14Var) {
        x14Var.getClass();
        return x14Var;
    }

    public is2 g(Context context, Looper looper, fu6 fu6Var, Object obj, ps2 ps2Var, qs2 qs2Var) {
        return h(context, looper, fu6Var, obj, (i89) ps2Var, (i89) qs2Var);
    }

    public is2 h(Context context, Looper looper, fu6 fu6Var, Object obj, i89 i89Var, i89 i89Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
