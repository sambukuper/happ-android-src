package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;
import org.conscrypt.metrics.ConscryptStatsLog;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z51 implements a61 {
    public static ru0 k;
    public static je m;
    public static eb n;
    public static um0 o;
    public static final sk a = new sk(Float.POSITIVE_INFINITY);
    public static final tk b = new tk(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final uk c = new uk(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final vk d = new vk(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final sk e = new sk(Float.NEGATIVE_INFINITY);
    public static final tk f = new tk(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final uk g = new uk(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final vk h = new vk(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final zy0 i = new zy0(-1776498365, false, new dx0(11));
    public static final ru0 j = new ru0(null, null, null);
    public static final int[] l = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A(pb6 pb6Var, Member member) throws c53 {
        try {
            gk1.o0.getClass();
            Object obj = gk1.q0;
            if (obj == null || obj == null) {
                List listG = pb6Var.g();
                if (listG == null || !listG.isEmpty()) {
                    Iterator it = listG.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (((ob6) it.next()).x() != fw3.Z);
                }
                throw new RuntimeException('\'' + pb6Var + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objC = mb6.K(pb6Var) ? mb6.C(pb6Var) : null;
            gk1.o0.getClass();
            if (objC == gk1.q0) {
                objC = null;
            }
            mb6.K(pb6Var);
            AccessibleObject accessibleObject = member != 0 ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(os4.s(pb6Var));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objC);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objC == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    cls.getClass();
                    objC = ms8.f(cls);
                }
                return method.invoke(null, objC);
            }
            if (length == 2) {
                Method method2 = (Method) member;
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                cls2.getClass();
                return method2.invoke(null, objC, ms8.f(cls2));
            }
            throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
        } catch (IllegalAccessException e2) {
            throw new c53("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e2);
        }
    }

    public static final int B(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                bt.q("Step is zero.");
                return 0;
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    public static final boolean C(pb6 pb6Var) {
        pb6Var.getClass();
        return ov3.X.d(pb6Var.a());
    }

    public static float D(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final long E(long j2, long j3, float f2) {
        n95 n95Var = nw0.x;
        long jA = dw0.a(j2, n95Var);
        long jA2 = dw0.a(j3, n95Var);
        float fC = dw0.c(jA);
        float fG = dw0.g(jA);
        float f3 = dw0.f(jA);
        float fD = dw0.d(jA);
        float fC2 = dw0.c(jA2);
        float fG2 = dw0.g(jA2);
        float f4 = dw0.f(jA2);
        float fD2 = dw0.d(jA2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return dw0.a(j(w51.H(fG, fG2, f2), w51.H(f3, f4, f2), w51.H(fD, fD2, f2), w51.H(fC, fC2, f2), n95Var), dw0.e(j3));
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:1: B:79:0x01ef->B:162:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f5  */
    public static final Object F(t14 t14Var, ei8 ei8Var, sn2 sn2Var) {
        du5 du5VarU;
        du5 du5VarS;
        boolean z;
        gk2 gk2VarF;
        qs0 qs0VarH;
        Object qu3Var;
        List list;
        Iterator it;
        ru3 ru3Var;
        boolean z2;
        t14 t14Var2;
        ei8 ei8Var2;
        Object objF;
        ce2 ce2VarO;
        qe4 qe4Var = qe4.A0;
        t14Var.getClass();
        sn2Var.getClass();
        if (w79.I(t14Var)) {
            nz4 nz4Var = ty7.a;
            w79.I(t14Var);
            zz3 zz3VarE = y08.e(t14Var);
            sm annotations = t14Var.getAnnotations();
            t14 t14VarA = w79.A(t14Var);
            List listW = w79.w(t14Var);
            List listC = w79.C(t14Var);
            ArrayList arrayList = new ArrayList(xv0.Z(listC, 10));
            Iterator it2 = listC.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ni8) it2.next()).b());
            }
            ch8.Y.getClass();
            ch8 ch8Var = ch8.Z;
            lh8 lh8VarL = ty7.a.l();
            w79.F(t14Var);
            t14 t14VarB = ((ni8) wv0.A0(t14Var.l0())).b();
            t14VarB.getClass();
            ArrayList arrayListI0 = wv0.I0(arrayList, dh3.N(ch8Var, lh8VarL, i21.K(new wg7(t14VarB)), false));
            aa7 aa7VarP = y08.e(t14Var).p();
            aa7VarP.getClass();
            return F(w79.p(zz3VarE, annotations, t14VarA, listW, arrayListI0, aa7VarP, false).r0(t14Var.o0()), ei8Var, sn2Var);
        }
        aa7 aa7VarP2 = z68.p(t14Var);
        if (aa7VarP2 == null && ((ce2VarO = z68.o(t14Var)) == null || (aa7VarP2 = z68.s0(ce2VarO)) == null)) {
            aa7VarP2 = z68.p(t14Var);
            aa7VarP2.getClass();
        }
        lh8 lh8VarL0 = z68.L0(aa7VarP2);
        if (z68.Z(lh8VarL0)) {
            lh8VarL0.getClass();
            if (lh8VarL0 instanceof lh8) {
                ot0 ot0VarX = lh8VarL0.x();
                ot0VarX.getClass();
                du5VarU = zz3.u((sx4) ot0VarX);
            } else {
                em7.c(oi0.j(yb6.a, lh8VarL0.getClass(), oi0.s("ClassicTypeSystemContext couldn't handle: ", lh8VarL0, ", ")));
                du5VarU = null;
            }
            if (du5VarU != null) {
                switch (du5VarU.ordinal()) {
                    case 0:
                        ru3Var = su3.a;
                        break;
                    case 1:
                        ru3Var = su3.b;
                        break;
                    case 2:
                        ru3Var = su3.c;
                        break;
                    case 3:
                        ru3Var = su3.d;
                        break;
                    case 4:
                        ru3Var = su3.e;
                        break;
                    case 5:
                        ru3Var = su3.f;
                        break;
                    case 6:
                        ru3Var = su3.g;
                        break;
                    case 7:
                        ru3Var = su3.h;
                        break;
                    default:
                        b61.c();
                        return null;
                }
                if (z68.i0(t14Var)) {
                    z2 = true;
                } else {
                    fk2 fk2Var = ks3.q;
                    fk2Var.getClass();
                    if (z68.Q(t14Var, fk2Var)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                qu3Var = ry7.e(ru3Var, z2);
            } else {
                lh8VarL0.getClass();
                if (lh8VarL0 instanceof lh8) {
                    ot0 ot0VarX2 = lh8VarL0.x();
                    ot0VarX2.getClass();
                    du5VarS = zz3.s((sx4) ot0VarX2);
                } else {
                    em7.c(oi0.j(yb6.a, lh8VarL0.getClass(), oi0.s("ClassicTypeSystemContext couldn't handle: ", lh8VarL0, ", ")));
                    du5VarS = null;
                }
                if (du5VarS != null) {
                    ut3 ut3Var = (ut3) ut3.p0.get(du5VarS);
                    if (ut3Var == null) {
                        ut3.a(6);
                        throw null;
                    }
                    qu3Var = pz2.k("[".concat(ut3Var.Z));
                } else {
                    lh8VarL0.getClass();
                    if (lh8VarL0 instanceof lh8) {
                        ot0 ot0VarX3 = lh8VarL0.x();
                        if (ot0VarX3 != null && zz3.K(ot0VarX3)) {
                            z = true;
                        }
                        if (z) {
                            lh8VarL0.getClass();
                            if (lh8VarL0 instanceof lh8) {
                                ot0 ot0VarX4 = lh8VarL0.x();
                                ot0VarX4.getClass();
                                int i2 = el1.a;
                                gk2VarF = bl1.f((sx4) ot0VarX4);
                                gk2VarF.getClass();
                            } else {
                                em7.c(oi0.j(yb6.a, lh8VarL0.getClass(), oi0.s("ClassicTypeSystemContext couldn't handle: ", lh8VarL0, ", ")));
                                gk2VarF = null;
                            }
                            String str = ll3.a;
                            qs0VarH = ll3.h(gk2VarF);
                            if (qs0VarH == null) {
                                qu3Var = null;
                            } else {
                                if (!ei8Var.d && ((list = ll3.o) == null || !list.isEmpty())) {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((kl3) it.next()).a.equals(qs0VarH)) {
                                                qu3Var = null;
                                            }
                                        }
                                    }
                                }
                                qu3Var = new qu3(zs3.b(qs0VarH));
                            }
                        } else {
                            qu3Var = null;
                        }
                    } else {
                        em7.c(oi0.j(yb6.a, lh8VarL0.getClass(), oi0.s("ClassicTypeSystemContext couldn't handle: ", lh8VarL0, ", ")));
                    }
                    z = false;
                    if (z) {
                        lh8VarL0.getClass();
                        if (lh8VarL0 instanceof lh8) {
                            ot0 ot0VarX5 = lh8VarL0.x();
                            ot0VarX5.getClass();
                            int i3 = el1.a;
                            gk2VarF = bl1.f((sx4) ot0VarX5);
                            gk2VarF.getClass();
                        } else {
                            em7.c(oi0.j(yb6.a, lh8VarL0.getClass(), oi0.s("ClassicTypeSystemContext couldn't handle: ", lh8VarL0, ", ")));
                            gk2VarF = null;
                        }
                        String str2 = ll3.a;
                        qs0VarH = ll3.h(gk2VarF);
                        if (qs0VarH == null) {
                            qu3Var = null;
                        } else {
                            if (!ei8Var.d) {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((kl3) it.next()).a.equals(qs0VarH)) {
                                            qu3Var = null;
                                        }
                                    }
                                }
                            }
                            qu3Var = new qu3(zs3.b(qs0VarH));
                        }
                    } else {
                        qu3Var = null;
                    }
                }
            }
        } else {
            qu3Var = null;
        }
        if (qu3Var != null) {
            Object objE = ry7.e(qu3Var, ei8Var.a);
            sn2Var.x(t14Var, objE, ei8Var);
            return objE;
        }
        lh8 lh8VarN0 = t14Var.n0();
        if (lh8VarN0 instanceof qg3) {
            qg3 qg3Var = (qg3) lh8VarN0;
            t14 t14Var3 = qg3Var.X;
            if (t14Var3 != null) {
                return F(y08.n(t14Var3), ei8Var, sn2Var);
            }
            bt.g("There should be no intersection type in existing descriptors, but found: ".concat(wv0.y0(qg3Var.Y, null, null, null, null, 63)));
            return null;
        }
        ot0 ot0VarX6 = lh8VarN0.x();
        if (ot0VarX6 == null) {
            em7.j(t14Var, "no descriptor for type constructor of ");
            return null;
        }
        if (u32.f(ot0VarX6)) {
            return new qu3("error/NonExistentClass");
        }
        boolean z3 = ot0VarX6 instanceof sx4;
        if (z3 && zz3.z(t14Var)) {
            if (t14Var.l0().size() != 1) {
                u52.k("arrays must have one type argument");
                return null;
            }
            ni8 ni8Var = (ni8) t14Var.l0().get(0);
            t14 t14VarB2 = ni8Var.b();
            t14VarB2.getClass();
            if (ni8Var.a() == rt8.IN_VARIANCE) {
                objF = new qu3("java/lang/Object");
            } else {
                rt8 rt8VarA = ni8Var.a();
                rt8VarA.getClass();
                int iOrdinal = rt8VarA.ordinal();
                if (iOrdinal == 0 ? (ei8Var2 = ei8Var.f) != null : iOrdinal == 1 ? (ei8Var2 = ei8Var.e) != null : (ei8Var2 = ei8Var.c) != null) {
                    ei8Var = ei8Var2;
                }
                objF = F(t14VarB2, ei8Var, sn2Var);
            }
            return pz2.k("[".concat(pz2.p((su3) objF)));
        }
        if (!z3) {
            if (ot0VarX6 instanceof hi8) {
                t14 t14VarF = y08.f((hi8) ot0VarX6);
                if (t14Var.o0()) {
                    t14VarF = y08.j(t14VarF);
                }
                return F(t14VarF, ei8Var, oe0.Z);
            }
            if ((ot0VarX6 instanceof km1) && ei8Var.g) {
                return F(((km1) ot0VarX6).I0(), ei8Var, sn2Var);
            }
            em7.j(t14Var, "Unknown type ");
            return null;
        }
        if (bd3.a(ot0VarX6) && !ei8Var.b && (t14Var2 = (t14) u15.i(t14Var, new HashSet())) != null) {
            return F(t14Var2, new ei8(ei8Var.a, true, ei8Var.c, ei8Var.d, ei8Var.e, ei8Var.f, ei8Var.g, ei8Var.h), sn2Var);
        }
        sx4 sx4Var = (sx4) ot0VarX6;
        sx4Var.a().getClass();
        if (sx4Var.g0() == us0.f0) {
            ed1 ed1VarP = sx4Var.p();
            ed1VarP.getClass();
            sx4Var = (sx4) ed1VarP;
        }
        sx4 sx4VarN0 = sx4Var.a();
        sx4VarN0.getClass();
        qu3 qu3Var2 = new qu3(t(sx4VarN0, qe4Var));
        sn2Var.x(t14Var, qu3Var2, ei8Var);
        return qu3Var2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bc A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:39:0x00b4, B:41:0x00bc, B:43:0x00c8, B:45:0x00d4, B:36:0x009a), top: B:87:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:39:0x00b4, B:41:0x00bc, B:43:0x00c8, B:45:0x00d4, B:36:0x009a), top: B:87:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:39:0x00b4, B:41:0x00bc, B:43:0x00c8, B:45:0x00d4, B:36:0x009a), top: B:87:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:95:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015f, code lost:
    
        if (r3 == r13) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(defpackage.bz7 r17, defpackage.h68 r18, defpackage.ne r19, defpackage.aq5 r20, defpackage.r10 r21) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z51.G(bz7, h68, ne, aq5, r10):java.lang.Object");
    }

    public static rh5 H(Object obj) {
        return new rh5(obj, qe4.v0);
    }

    public static final kx4 I(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new b41(gn2Var));
    }

    public static final kx4 J(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new sg2(gn2Var));
    }

    public static bo3 K(rq3 rq3Var) {
        int i2 = rq3Var.q0;
        if (i2 == 2) {
            rq3Var.q0 = 1;
        }
        try {
            try {
                bo3 bo3VarU = mb6.U(rq3Var);
                rq3Var.C0(i2);
                return bo3VarU;
            } catch (Throwable th) {
                rq3Var.C0(i2);
                throw th;
            }
        } catch (OutOfMemoryError | StackOverflowError e2) {
            throw new eq3("Failed parsing JSON source: " + rq3Var + " to Json", e2);
        }
    }

    public static bo3 L(String str) {
        try {
            try {
                rq3 rq3Var = new rq3(new StringReader(str));
                bo3 bo3VarK = K(rq3Var);
                try {
                    bo3VarK.getClass();
                    if (!(bo3VarK instanceof xp3) && rq3Var.c0() != 10) {
                        throw new fr3("Did not consume the entire document.");
                    }
                    return bo3VarK;
                } catch (NumberFormatException e2) {
                    e = e2;
                    throw new fr3(e);
                }
            } catch (IOException e3) {
                throw new uo3(e3);
            }
        } catch (cp4 | NumberFormatException e4) {
            e = e4;
        }
    }

    public static final long M(ac3 ac3Var, sd5 sd5Var, zb3 zb3Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j2;
        long j3 = ac3Var.g;
        if (sd5Var != null) {
            int i2 = zb3Var.a;
            if (i2 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            } else if (i2 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L));
            }
            if (sd5Var == sd5.Y) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j2 = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j2 = jFloatToRawIntBits3 << 32;
            }
            j3 = j2 | (jFloatToRawIntBits & 4294967295L);
        }
        long jE = z85.e(N(ac3Var, sd5Var, zb3Var), j3);
        if (z || !ac3Var.i) {
            return jE;
        }
        return 0L;
    }

    public static final long N(ac3 ac3Var, sd5 sd5Var, zb3 zb3Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j2;
        if (sd5Var == null) {
            return ac3Var.c;
        }
        int i2 = zb3Var.a;
        if (i2 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (ac3Var.c >> 32));
        } else {
            if (i2 != 2) {
                return ac3Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (ac3Var.c & 4294967295L));
        }
        if (sd5Var == sd5.Y) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j2 = jFloatToRawIntBits3 << 32;
        }
        return j2 | (4294967295L & jFloatToRawIntBits);
    }

    public static z91 O(Metadata metadata) {
        String string;
        if (metadata.mv().length == 0) {
            bt.q("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
            return null;
        }
        hv4 hv4Var = new hv4((metadata.xi() & 8) != 0, metadata.mv());
        boolean zA = hv4Var.a(1, 1, 0);
        if (!zA) {
            if (zA) {
                StringBuilder sb = new StringBuilder("while maximum supported version is ");
                sb.append(hv4Var.f ? hv4.g : hv4.h);
                sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                string = sb.toString();
            } else {
                string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
            }
            b61.l("Provided Metadata instance has version ", hv4Var, ", ", string);
            return null;
        }
        try {
            int iK = metadata.k();
            if (iK == 1) {
                return new c04(metadata);
            }
            if (iK == 2) {
                return new d04(metadata);
            }
            if (iK == 3) {
                return new g04(metadata);
            }
            if (iK != 4) {
                if (iK == 5) {
                    return new f04(metadata);
                }
                g04 g04Var = new g04();
                new ot3(metadata.mv());
                metadata.xi();
                return g04Var;
            }
            List listX = eu.X(metadata.d1());
            new ot3(metadata.mv());
            metadata.xi();
            e04 e04Var = new e04();
            e04Var.f = listX;
            return e04Var;
        } catch (Throwable th) {
            if ((th instanceof IllegalArgumentException) || (th instanceof VirtualMachineError) || (th instanceof ThreadDeath)) {
                throw th;
            }
            throw new ib3("Exception occurred when reading Kotlin metadata", th);
        }
    }

    public static final y05 P(Object obj, lp2 lp2Var) {
        Object objK = lp2Var.K();
        if (objK == zz0.a) {
            objK = H(obj);
            lp2Var.g0(objK);
        }
        y05 y05Var = (y05) objK;
        y05Var.setValue(obj);
        return y05Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    public static final t14 Q(t14 t14Var, ArrayList arrayList) {
        wg7 wg7Var;
        t14Var.l0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zg8 zg8Var = (zg8) it.next();
            zg8Var.getClass();
            t14 t14Var2 = zg8Var.c;
            t14 t14Var3 = zg8Var.b;
            hi8 hi8Var = zg8Var.a;
            v14.a.b(t14Var3, t14Var2);
            if (dh3.f(t14Var3, t14Var2)) {
                wg7Var = new wg7(t14Var3);
            } else {
                rt8 rt8VarD = hi8Var.D();
                rt8 rt8Var = rt8.IN_VARIANCE;
                if (rt8VarD == rt8Var) {
                    wg7Var = new wg7(t14Var3);
                } else {
                    boolean zF = zz3.F(t14Var3);
                    rt8 rt8Var2 = rt8.OUT_VARIANCE;
                    rt8 rt8Var3 = rt8.INVARIANT;
                    if (zF && hi8Var.D() != rt8Var) {
                        if (rt8Var2 == hi8Var.D()) {
                            rt8Var2 = rt8Var3;
                        }
                        wg7Var = new wg7(t14Var2, rt8Var2);
                    } else {
                        if (t14Var2 == null) {
                            zz3.a(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA);
                            throw null;
                        }
                        if (zz3.y(t14Var2) && t14Var2.o0()) {
                            if (rt8Var == hi8Var.D()) {
                                rt8Var = rt8Var3;
                            }
                            wg7Var = new wg7(t14Var3, rt8Var);
                        } else {
                            if (rt8Var2 == hi8Var.D()) {
                                rt8Var2 = rt8Var3;
                            }
                            wg7Var = new wg7(t14Var2, rt8Var2);
                        }
                    }
                }
            }
            arrayList2.add(wg7Var);
        }
        return s08.e(t14Var, arrayList2, null, 6);
    }

    public static final Object R(s61 s61Var, rn2 rn2Var) throws Throwable {
        d42 d42VarA;
        s61 s61VarW;
        long jG1;
        r61 r61Var = pz2.E0;
        u61 u61Var = (u61) s61Var.H0(r61Var);
        b02 b02Var = b02.X;
        if (u61Var == null) {
            d42VarA = j98.a();
            s61VarW = ch3.w(b02Var, s61Var.B0(d42VarA), true);
            nf1 nf1Var = tp1.a;
            if (s61VarW != nf1Var && s61VarW.H0(r61Var) == null) {
                s61VarW = s61VarW.B0(nf1Var);
            }
        } else {
            d42VarA = (d42) j98.a.get();
            s61VarW = ch3.w(b02Var, s61Var, true);
            nf1 nf1Var2 = tp1.a;
            if (s61VarW != nf1Var2 && s61VarW.H0(r61Var) == null) {
                s61VarW = s61VarW.B0(nf1Var2);
            }
        }
        m60 m60Var = new m60(s61VarW, Thread.currentThread(), d42VarA);
        m60Var.n0(e71.X, m60Var, rn2Var);
        d42 d42Var = m60Var.h0;
        if (d42Var != null) {
            int i2 = d42.h0;
            d42Var.f1(false);
        }
        while (true) {
            if (d42Var != null) {
                try {
                    jG1 = d42Var.g1();
                } catch (Throwable th) {
                    if (d42Var != null) {
                        int i3 = d42.h0;
                        d42Var.d1(false);
                    }
                    throw th;
                }
            } else {
                jG1 = Long.MAX_VALUE;
            }
            if (m60Var.S()) {
                break;
            }
            LockSupport.parkNanos(m60Var, jG1);
            if (Thread.interrupted()) {
                m60Var.i(new InterruptedException());
            }
        }
        if (d42Var != null) {
            int i4 = d42.h0;
            d42Var.d1(false);
        }
        Object objA = sm3.a(m60Var.M());
        xx0 xx0Var = objA instanceof xx0 ? (xx0) objA : null;
        if (xx0Var == null) {
            return objA;
        }
        throw xx0Var.a;
    }

    public static ColorStateList S(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(l, 0));
        }
        return colorStateList;
    }

    public static final int U(long j2) {
        float[] fArr = nw0.a;
        return (int) (dw0.a(j2, nw0.e) >>> 32);
    }

    public static String V(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3) ? pc6.p("CornerRadius.circular(", yn0.g0(Float.intBitsToFloat(i2)), ")") : pc6.q("CornerRadius.elliptical(", yn0.g0(Float.intBitsToFloat(i2)), ", ", yn0.g0(Float.intBitsToFloat(i3)), ")");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W(defpackage.bz7 r12, defpackage.i68 r13, defpackage.aq5 r14, defpackage.r10 r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z51.W(bz7, i68, aq5, r10):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object X(defpackage.bz7 r11, defpackage.i68 r12, defpackage.aq5 r13, int r14, defpackage.r10 r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z51.X(bz7, i68, aq5, int, r10):java.lang.Object");
    }

    public static final kx4 Y(kx4 kx4Var, v09 v09Var) {
        return kx4Var.y(new le3(v09Var));
    }

    public static final l49 Z(List list, l49 l49Var) {
        l49 l49VarB;
        list.getClass();
        boolean zB = l49Var.e.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zB2 = l49Var.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zB3 = l49Var.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!zB && zB2 && zB3) {
            String str = l49Var.c;
            t91 t91Var = new t91((byte) 0);
            u91 u91Var = l49Var.e;
            u91Var.getClass();
            t91Var.b(u91Var.a);
            LinkedHashMap linkedHashMap = t91Var.a;
            linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            u91 u91Var2 = new u91(linkedHashMap);
            wl7.c0(u91Var2);
            l49VarB = l49.b(l49Var, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", u91Var2, 0, 0L, 0, 0, 0L, 0, 33554411);
        } else {
            l49VarB = l49Var;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            p31 p31Var = l49VarB.j;
            String str2 = l49VarB.c;
            if (!dh3.f(str2, ConstraintTrackingWorker.class.getName()) && (p31Var.e || p31Var.f)) {
                t91 t91Var2 = new t91((byte) 0);
                u91 u91Var3 = l49VarB.e;
                u91Var3.getClass();
                t91Var2.b(u91Var3.a);
                LinkedHashMap linkedHashMap2 = t91Var2.a;
                linkedHashMap2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
                u91 u91Var4 = new u91(linkedHashMap2);
                wl7.c0(u91Var4);
                return l49.b(l49VarB, null, null, ConstraintTrackingWorker.class.getName(), u91Var4, 0, 0L, 0, 0, 0L, 0, 33554411);
            }
        }
        return l49VarB;
    }

    public static final void a(final dn2 dn2Var, final zy0 zy0Var, final rn2 rn2Var, final rn2 rn2Var2, final x67 x67Var, final long j2, long j3, long j4, long j5, final vn1 vn1Var, lp2 lp2Var, final int i2) {
        dn2 dn2Var2;
        int i3;
        zy0 zy0Var2;
        rn2 rn2Var3;
        rn2 rn2Var4;
        x67 x67Var2;
        long j6;
        final long j7;
        final long j8;
        final long j9;
        long jC;
        int i4;
        int i5;
        long jC2;
        long jC3;
        lp2Var.X(94478519);
        if ((i2 & 6) == 0) {
            dn2Var2 = dn2Var;
            i3 = (lp2Var.h(dn2Var2) ? 4 : 2) | i2;
        } else {
            dn2Var2 = dn2Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            zy0Var2 = zy0Var;
            i3 |= lp2Var.h(zy0Var2) ? 32 : 16;
        } else {
            zy0Var2 = zy0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.f(hx4.X) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i6 = i3 | 27648;
        if ((196608 & i2) == 0) {
            rn2Var3 = rn2Var;
            i6 |= lp2Var.h(rn2Var3) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        } else {
            rn2Var3 = rn2Var;
        }
        if ((1572864 & i2) == 0) {
            rn2Var4 = rn2Var2;
            i6 |= lp2Var.h(rn2Var4) ? 1048576 : 524288;
        } else {
            rn2Var4 = rn2Var2;
        }
        if ((12582912 & i2) == 0) {
            x67Var2 = x67Var;
            i6 |= lp2Var.f(x67Var2) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        } else {
            x67Var2 = x67Var;
        }
        if ((100663296 & i2) == 0) {
            j6 = j2;
            i6 |= lp2Var.e(j6) ? 67108864 : 33554432;
        } else {
            j6 = j2;
        }
        if ((805306368 & i2) == 0) {
            i6 |= 268435456;
        }
        int i7 = (lp2Var.f(vn1Var) ? 2048 : 1024) | 402;
        if (lp2Var.N(i6 & 1, ((306783379 & i6) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            lp2Var.S();
            if ((i2 & 1) == 0 || lp2Var.x()) {
                jC = kw0.c(z68.h, lp2Var);
                i4 = i6 & (-1879048193);
                i5 = i7 & (-127);
                jC2 = kw0.c(z68.d, lp2Var);
                jC3 = kw0.c(z68.f, lp2Var);
            } else {
                lp2Var.Q();
                i4 = i6 & (-1879048193);
                jC = j3;
                jC3 = j5;
                i5 = i7 & (-127);
                jC2 = j4;
            }
            lp2Var.q();
            long j10 = jC;
            n8.c(dn2Var2, zy0Var2, rn2Var3, rn2Var4, x67Var2, j6, j10, jC2, jC3, vn1Var, lp2Var, i4 & 2147483646, i5 & 8190);
            j9 = jC3;
            j8 = jC2;
            j7 = j10;
        } else {
            lp2Var.Q();
            j7 = j3;
            j8 = j4;
            j9 = j5;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: sa
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i2 | 1);
                    z51.a(dn2Var, zy0Var, rn2Var, rn2Var2, x67Var, j2, j7, j8, j9, vn1Var, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static oi b(float f2) {
        return new oi(Float.valueOf(f2), ys0.j0, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    /* JADX WARN: Code duplicated, block: B:109:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x016a  */
    /* JADX WARN: Code duplicated, block: B:114:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0176  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0184  */
    /* JADX WARN: Code duplicated, block: B:122:0x0186  */
    /* JADX WARN: Code duplicated, block: B:124:0x018c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0138  */
    public static final long c(float f2, float f3, float f4, float f5, lw0 lw0Var) {
        int i2;
        int i3;
        int i4;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f6;
        if (lw0Var.c()) {
            float f7 = f5 < 0.0f ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < 0.0f ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i23 = i22 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            f6 = f4 >= 0.0f ? f4 : 0.0f;
            long j2 = ((long) (i23 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i24 = dw0.h;
            return j2;
        }
        int i25 = lw0Var.c;
        if (i25 == -1) {
            vc3.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i26 = 0;
        float fB3 = lw0Var.b(0);
        float fA3 = lw0Var.a(0);
        if (f2 >= fB3) {
            fB3 = f2;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        if (i28 == 255) {
            i3 = i29 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i28 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else {
                if (i2 > 0) {
                    int i30 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i30) + 1) | (i27 << 15);
                    } else {
                        i3 = i30;
                    }
                    short s = (short) i4;
                    fB = lw0Var.b(1);
                    fA = lw0Var.a(1);
                    if (f3 >= fB) {
                        fB = f3;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i10 = 0;
                            i8 = 49;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s2 = (short) i11;
                                fB2 = lw0Var.b(2);
                                fA2 = lw0Var.a(2);
                                if (f4 >= fB2) {
                                    fB2 = f4;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i18 = i15 != 0 ? 512 : 0;
                                    i26 = 31;
                                } else {
                                    i16 = i14 - 112;
                                    if (i16 >= 31) {
                                        i18 = 0;
                                        i26 = 49;
                                    } else {
                                        if (i16 <= 0) {
                                            i17 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                            } else {
                                                i18 = i17;
                                                i26 = i16;
                                            }
                                            short s3 = (short) i19;
                                            f6 = f5 >= 0.0f ? f5 : 0.0f;
                                            long j3 = (((long) i25) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s3)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i31 = dw0.h;
                                            return j3;
                                        }
                                        if (i16 >= -10) {
                                            i20 = (i15 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i16);
                                            if ((i20 & 4096) != 0) {
                                                i20 += 8192;
                                            }
                                            i18 = i20 >> 13;
                                        } else {
                                            i18 = 0;
                                        }
                                    }
                                }
                                i19 = i18 | (i13 << 15) | (i26 << 10);
                                short s4 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j4 = (((long) i25) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s4)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = dw0.h;
                                return j4;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s5 = (short) i11;
                    fB2 = lw0Var.b(2);
                    fA2 = lw0Var.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s6 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j5 = (((long) i25) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s5) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s6)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i33 = dw0.h;
                                return j5;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s7 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j6 = (((long) i25) & 63) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s5) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s7)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i34 = dw0.h;
                    return j6;
                }
                if (i2 >= -10) {
                    int i35 = (i29 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i2);
                    if ((i35 & 4096) != 0) {
                        i35 += 8192;
                    }
                    i3 = i35 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i27 << 15) | (i2 << 10);
        short s8 = (short) i4;
        fB = lw0Var.b(1);
        fA = lw0Var.a(1);
        if (f3 >= fB) {
            fB = f3;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i10 = 0;
                i8 = 49;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s9 = (short) i11;
                    fB2 = lw0Var.b(2);
                    fA2 = lw0Var.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s10 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j7 = (((long) i25) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s10)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i36 = dw0.h;
                                return j7;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s11 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j8 = (((long) i25) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s11)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = dw0.h;
                    return j8;
                }
                if (i8 >= -10) {
                    i12 = (i7 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s12 = (short) i11;
        fB2 = lw0Var.b(2);
        fA2 = lw0Var.a(2);
        if (f4 >= fB2) {
            fB2 = f4;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i18 = i15 != 0 ? 512 : 0;
            i26 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i26 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                        i26 = i16;
                    }
                    short s13 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j9 = (((long) i25) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s13)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i38 = dw0.h;
                    return j9;
                }
                if (i16 >= -10) {
                    i20 = (i15 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                } else {
                    i18 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i26 << 10);
        short s14 = (short) i19;
        if (f5 >= 0.0f) {
        }
        long j10 = (((long) i25) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s14)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i39 = dw0.h;
        return j10;
    }

    public static final long d(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = dw0.h;
        return j2;
    }

    public static final long e(long j2) {
        long j3 = j2 << 32;
        int i2 = dw0.h;
        return j3;
    }

    public static long f(int i2, int i3, int i4) {
        return d(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final void g(String str, kx4 kx4Var, boolean z, o88 o88Var, int i2, int i3, int i4, int i5, boolean z2, ig5 ig5Var, x67 x67Var, dn2 dn2Var, lp2 lp2Var, int i6, int i7) {
        lp2 lp2Var2;
        x67 x67Var2;
        str.getClass();
        dn2Var.getClass();
        int i8 = i7 & 2;
        hx4 hx4Var = hx4.X;
        kx4 kx4Var2 = i8 != 0 ? hx4Var : kx4Var;
        boolean z3 = (i7 & 4) != 0 ? true : z;
        int i9 = (i7 & 16) != 0 ? 5 : i2;
        int i10 = (i7 & 32) != 0 ? 2 : i3;
        int i11 = (i7 & 128) != 0 ? 1 : i5;
        boolean z4 = (i7 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? z2 : true;
        ig5 ig5Var2 = (i7 & 512) != 0 ? new ig5(8.0f, 8.0f, 8.0f, 8.0f) : ig5Var;
        if ((i7 & 1024) != 0) {
            lp2Var2 = lp2Var;
            x67Var2 = ((tr) lp2Var2.j(ur.a)).c.a;
        } else {
            lp2Var2 = lp2Var;
            x67Var2 = x67Var;
        }
        zc1.g(str, os4.w(vj8.x(w39.k(hx4Var, x67Var2).y(kx4Var2), z3, null, null, null, dn2Var, lp2Var2, 13), ig5Var2), o88Var, i9, i10, i4, i11, z4, null, lp2Var, (i6 >> 3) & 458752, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public static final void h(final vo6 vo6Var, final boolean z, final boolean z2, final boolean z3, final gn2 gn2Var, final kx4 kx4Var, lp2 lp2Var, final int i2) {
        Object sm6Var;
        oh2 oh2Var;
        int i3;
        boolean z4;
        gn2Var.getClass();
        lp2Var.X(2145886414);
        int i4 = i2 | (lp2Var.f(vo6Var) ? 4 : 2) | (lp2Var.g(z) ? 32 : 16) | (lp2Var.g(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.g(z3) ? 2048 : 1024) | (lp2Var.h(gn2Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (lp2Var.f(kx4Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE);
        if (lp2Var.N(i4 & 1, (74899 & i4) != 74898)) {
            float fS = os4.S(92.0f, lp2Var);
            boolean zC = lp2Var.c(fS);
            Object objK = lp2Var.K();
            bv1 bv1Var = bv1.X;
            be beVar = zz0.a;
            if (zC || objK == beVar) {
                mj0 mj0Var = new mj0((byte) 17);
                mj0Var.w(bv1.Z, -fS);
                mj0Var.w(bv1Var, 0.0f);
                if (z2) {
                    mj0Var.w(bv1.Y, fS);
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
            Object objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = new la(bv1Var);
                lp2Var.g0(objK2);
            }
            la laVar = (la) objK2;
            Object objK3 = lp2Var.K();
            if (objK3 == beVar) {
                objK3 = new oh2();
                lp2Var.g0(objK3);
            }
            oh2 oh2Var2 = (oh2) objK3;
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i5 = i4 & 57344;
            boolean z5 = ((i4 & 7168) == 2048) | (i5 == 16384);
            Object objK4 = lp2Var.K();
            if (z5 || objK4 == beVar) {
                oh2Var = oh2Var2;
                i3 = i5;
                z4 = false;
                sm6Var = new sm6(z3, oh2Var, gn2Var, null, (byte) 1);
                lp2Var.g0(sm6Var);
            } else {
                sm6Var = objK4;
                z4 = false;
                oh2Var = oh2Var2;
                i3 = i5;
            }
            u70.h((rn2) sm6Var, lp2Var, boolValueOf);
            zy0 zy0VarU = jm4.U(142811475, new o90((Object) gn2Var, (Object) vo6Var, (byte) 12), lp2Var);
            boolean z6 = (i3 == 16384 ? true : z4) | ((i4 & 14) != 4 ? z4 : true);
            Object objK5 = lp2Var.K();
            if (z6 || objK5 == beVar) {
                objK5 = new zw2(gn2Var, vo6Var, (byte) 27);
                lp2Var.g0(objK5);
            }
            int i6 = i4 >> 3;
            w51.b(z, bv1Var, ke1Var, zy0VarU, kx4Var, laVar, false, (gn2) objK5, null, jm4.U(994768089, new h64(vo6Var, oh2Var, gn2Var, laVar, (byte) 4), lp2Var), lp2Var, (i6 & 14) | 805506096 | (i6 & 57344));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(z, z2, z3, gn2Var, kx4Var, i2) { // from class: qn6
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ boolean f0;
                public final /* synthetic */ gn2 g0;
                public final /* synthetic */ kx4 h0;

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(1);
                    z51.h(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void i(vo6 vo6Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        lp2 lp2Var2 = lp2Var;
        RouteProfile routeProfile = vo6Var.a;
        lp2Var2.X(2134225054);
        int i3 = i2 | (lp2Var2.f(vo6Var) ? 4 : 2) | (lp2Var2.f(kx4Var) ? 32 : 16);
        if (lp2Var2.N(i3 & 1, (i3 & 19) != 18)) {
            RouteSettingsCache routeSettingsCacheB = routeProfile.getData();
            wq6 wq6VarA = vq6.a(ht.a, pz2.o0, lp2Var2, 48);
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
            hx4 hx4Var = hx4.X;
            ch3.f(lp2Var2, b.k(hx4Var, 16.0f));
            String strE = routeProfile.getData().getName();
            kx4 kx4VarA = xq6.a();
            o88 o88Var = ((ds) lp2Var2.j(es.a)).b;
            ox1 ox1Var = ep.z;
            zc1.g(strE, kx4VarA, o88.a(o88Var, ((dp) lp2Var2.j(ox1Var)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var, 0, 504);
            ch3.f(lp2Var, b.k(hx4Var, 12.0f));
            zc1.b(vo6Var.b, null, null, null, null, dh3.b, lp2Var, 1572870);
            lp2Var2 = lp2Var;
            ch3.f(lp2Var2, b.k(hx4Var, 12.0f));
            os4.a(u70.R(), os4.y(hx4Var, 16.0f, 12.0f), routeSettingsCacheB.getName(), ((dp) lp2Var2.j(ox1Var)).h.b, lp2Var2, 0, 0);
            lp2Var2.p(true);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 28, i2, vo6Var, kx4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long j(float f2, float f3, float f4, float f5, lw0 lw0Var) {
        int i2;
        int i3;
        int i4;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (lw0Var.c()) {
            long j2 = ((long) ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f)))) << 32;
            int i19 = dw0.h;
            return j2;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f2);
        int i20 = iFloatToRawIntBits3 >>> 31;
        int i21 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i22 = iFloatToRawIntBits3 & 8388607;
        int i23 = 49;
        int i24 = 0;
        if (i21 == 255) {
            i3 = i22 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i21 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else {
                if (i2 > 0) {
                    int i25 = i22 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i25) + 1) | (i20 << 15);
                    } else {
                        i3 = i25;
                    }
                    short s = (short) i4;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f3);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i8 = 49;
                            i10 = 0;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s2 = (short) i11;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i16 = i14 - 112;
                                    if (i16 < 31) {
                                        if (i16 <= 0) {
                                            i24 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                            } else {
                                                i23 = i16;
                                            }
                                        } else if (i16 >= -10) {
                                            i18 = (i15 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i16);
                                            if ((i18 & 4096) != 0) {
                                                i18 += 8192;
                                            }
                                            i23 = 0;
                                            i24 = i18 >> 13;
                                        } else {
                                            i23 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i17)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lw0Var.c) & 63);
                                    int i26 = dw0.h;
                                    return jMax;
                                }
                                i24 = i15 == 0 ? 0 : 512;
                                i23 = 31;
                                i17 = (i13 << 15) | (i23 << 10) | i24;
                                long jMax2 = ((((long) ((short) i17)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lw0Var.c) & 63);
                                int i27 = dw0.h;
                                return jMax2;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s3 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i24 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i16);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i23 = 0;
                                i24 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i17)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s3) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lw0Var.c) & 63);
                        int i28 = dw0.h;
                        return jMax3;
                    }
                    i24 = i15 == 0 ? 0 : 512;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i24;
                    long jMax4 = ((((long) ((short) i17)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s3) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lw0Var.c) & 63);
                    int i29 = dw0.h;
                    return jMax4;
                }
                if (i2 >= -10) {
                    int i30 = (i22 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i2);
                    if ((i30 & 4096) != 0) {
                        i30 += 8192;
                    }
                    i3 = i30 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i20 << 15) | (i2 << 10);
        short s4 = (short) i4;
        iFloatToRawIntBits = Float.floatToRawIntBits(f3);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i8 = 49;
                i10 = 0;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s5 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i24 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i16);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i23 = 0;
                                i24 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i17)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s4) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s5) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lw0Var.c) & 63);
                        int i210 = dw0.h;
                        return jMax5;
                    }
                    i24 = i15 == 0 ? 0 : 512;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i24;
                    long jMax6 = ((((long) ((short) i17)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s4) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s5) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lw0Var.c) & 63);
                    int i211 = dw0.h;
                    return jMax6;
                }
                if (i8 >= -10) {
                    i12 = (i7 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s6 = (short) i11;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i16 = i14 - 112;
            if (i16 < 31) {
                if (i16 <= 0) {
                    i24 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                    } else {
                        i23 = i16;
                    }
                } else if (i16 >= -10) {
                    i18 = (i15 | XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW) >> (1 - i16);
                    if ((i18 & 4096) != 0) {
                        i18 += 8192;
                    }
                    i23 = 0;
                    i24 = i18 >> 13;
                } else {
                    i23 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i17)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s4) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s6) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lw0Var.c) & 63);
            int i212 = dw0.h;
            return jMax7;
        }
        i24 = i15 == 0 ? 0 : 512;
        i23 = 31;
        i17 = (i13 << 15) | (i23 << 10) | i24;
        long jMax8 = ((((long) ((short) i17)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s4) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s6) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lw0Var.c) & 63);
        int i213 = dw0.h;
        return jMax8;
    }

    public static final ws l(t14 t14Var) {
        zg8 zg8Var;
        zg8 zg8Var2;
        t14Var.getClass();
        if (t14Var.q0() instanceof ce2) {
            ws wsVarL = l(yn0.O(t14Var));
            ws wsVarL2 = l(yn0.h0(t14Var));
            return new ws(c18.g(dh3.s(yn0.O((t14) wsVarL.a), yn0.h0((t14) wsVarL2.a)), t14Var), c18.g(dh3.s(yn0.O((t14) wsVarL.b), yn0.h0((t14) wsVarL2.b)), t14Var));
        }
        lh8 lh8VarN0 = t14Var.n0();
        boolean z = true;
        if (t14Var.n0() instanceof bo0) {
            lh8VarN0.getClass();
            ni8 ni8VarF = ((bo0) lh8VarN0).F();
            t14 t14VarB = ni8VarF.b();
            t14VarB.getClass();
            t14 t14VarH = cj8.h(t14VarB, t14Var.o0());
            int iOrdinal = ni8VarF.a().ordinal();
            if (iOrdinal == 1) {
                return new ws(t14VarH, y08.e(t14Var).p());
            }
            if (iOrdinal == 2) {
                return new ws(cj8.h(y08.e(t14Var).o(), t14Var.o0()), t14VarH);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + ni8VarF);
        }
        if (t14Var.l0().isEmpty() || t14Var.l0().size() != lh8VarN0.g().size()) {
            return new ws(t14Var, t14Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listL0 = t14Var.l0();
        List listG = lh8VarN0.g();
        listG.getClass();
        for (qg5 qg5Var : wv0.e1(listL0, listG)) {
            ni8 ni8Var = (ni8) qg5Var.X;
            hi8 hi8Var = (hi8) qg5Var.Y;
            hi8Var.getClass();
            rt8 rt8VarD = hi8Var.D();
            if (rt8VarD == null) {
                wi8.a(35);
                throw null;
            }
            if (ni8Var == null) {
                wi8.a(36);
                throw null;
            }
            wi8 wi8Var = wi8.b;
            int iOrdinal2 = (ni8Var.c() ? rt8.OUT_VARIANCE : wi8.b(rt8VarD, ni8Var.a())).ordinal();
            if (iOrdinal2 == 0) {
                t14 t14VarB2 = ni8Var.b();
                t14VarB2.getClass();
                t14 t14VarB3 = ni8Var.b();
                t14VarB3.getClass();
                zg8Var2 = new zg8(hi8Var, t14VarB2, t14VarB3);
            } else if (iOrdinal2 == 1) {
                t14 t14VarB4 = ni8Var.b();
                t14VarB4.getClass();
                aa7 aa7VarP = el1.e(hi8Var).p();
                aa7VarP.getClass();
                zg8Var2 = new zg8(hi8Var, t14VarB4, aa7VarP);
            } else {
                if (iOrdinal2 != 2) {
                    b61.c();
                    return null;
                }
                aa7 aa7VarO = el1.e(hi8Var).o();
                t14 t14VarB5 = ni8Var.b();
                t14VarB5.getClass();
                zg8Var2 = new zg8(hi8Var, aa7VarO, t14VarB5);
            }
            if (ni8Var.c()) {
                arrayList.add(zg8Var2);
                arrayList2.add(zg8Var2);
            } else {
                ws wsVarL3 = l(zg8Var2.b);
                t14 t14Var2 = (t14) wsVarL3.a;
                t14 t14Var3 = (t14) wsVarL3.b;
                ws wsVarL4 = l(zg8Var2.c);
                t14 t14Var4 = (t14) wsVarL4.a;
                t14 t14Var5 = (t14) wsVarL4.b;
                hi8 hi8Var2 = zg8Var2.a;
                zg8 zg8Var3 = new zg8(hi8Var2, t14Var3, t14Var4);
                zg8 zg8Var4 = new zg8(hi8Var2, t14Var2, t14Var5);
                arrayList.add(zg8Var3);
                arrayList2.add(zg8Var4);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            zg8Var = (zg8) it.next();
            zg8Var.getClass();
        } while (v14.a.b(zg8Var.b, zg8Var.c));
        return new ws(z ? y08.e(t14Var).o() : Q(t14Var, arrayList), Q(t14Var, arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object m(defpackage.bz7 r6, defpackage.r10 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.f07
            if (r0 == 0) goto L13
            r0 = r7
            f07 r0 = (defpackage.f07) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h0 = r1
            goto L18
        L13:
            f07 r0 = new f07
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.g0
            int r1 = r0.h0
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            bz7 r6 = r0.f0
            defpackage.w39.n0(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.w39.n0(r7)
        L31:
            r0.f0 = r6
            r0.h0 = r2
            bq5 r7 = defpackage.bq5.Y
            java.lang.Object r7 = r6.a(r7, r0)
            c71 r1 = defpackage.c71.X
            if (r7 != r1) goto L40
            return r1
        L40:
            aq5 r7 = (defpackage.aq5) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            hq5 r5 = (defpackage.hq5) r5
            boolean r5 = defpackage.vr3.j(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z51.m(bz7, r10):java.lang.Object");
    }

    public static final Object n(mq5 mq5Var, h68 h68Var, i68 i68Var, q51 q51Var) {
        cz7 cz7Var = (cz7) mq5Var;
        cz7Var.getClass();
        Object objI = mb6.i(mq5Var, new at5(new ne(yn0.Z(cz7Var).C0), h68Var, i68Var, null), q51Var);
        return objI == c71.X ? objI : dn8.a;
    }

    public static final boolean o(ac3 ac3Var) {
        return !ac3Var.h && ac3Var.d;
    }

    public static final boolean p(ac3 ac3Var) {
        return ac3Var.h && !ac3Var.d;
    }

    public static final void q(WorkDatabase workDatabase, xy0 xy0Var, l39 l39Var) {
        int i2;
        workDatabase.getClass();
        xy0Var.getClass();
        ArrayList arrayListN = i21.N(l39Var);
        int i3 = 0;
        while (!arrayListN.isEmpty()) {
            l39 l39Var2 = (l39) bw0.j0(arrayListN);
            List list = l39Var2.d;
            list.getClass();
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (((g49) it.next()).b.j.b() && (i2 = i2 + 1) < 0) {
                        i21.W();
                        throw null;
                    }
                }
            }
            i3 += i2;
            List list2 = l39Var2.g;
            if (list2 != null) {
                arrayListN.addAll(list2);
            }
        }
        if (i3 == 0) {
            return;
        }
        int iIntValue = ((Number) u15.G(workDatabase.x().a, true, false, new ut8((byte) 19))).intValue();
        if (iIntValue + i3 <= 8) {
            return;
        }
        bt.q(pc6.k(iIntValue, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: ", i3, ";\ncurrent enqueue operation count: ", ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    public static final void r(int i2) {
        if (i2 >= 1) {
            return;
        }
        em7.c(pc6.j(i2, "Expected positive parallelism level, but got "));
    }

    public static final long s(long j2, long j3) {
        float f2;
        float f3;
        long jA = dw0.a(j2, dw0.e(j3));
        float fC = dw0.c(j3);
        float fC2 = dw0.c(jA);
        float f4 = 1.0f - fC2;
        float f5 = (fC * f4) + fC2;
        float fG = dw0.g(jA);
        float fG2 = dw0.g(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fC) * f4) + (fG * fC2)) / f5;
        }
        float f7 = dw0.f(jA);
        float f8 = dw0.f(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((f8 * fC) * f4) + (f7 * fC2)) / f5;
        }
        float fD = dw0.d(jA);
        float fD2 = dw0.d(j3);
        if (f5 != 0.0f) {
            f6 = (((fD2 * fC) * f4) + (fD * fC2)) / f5;
        }
        return j(f2, f3, f6, f5, dw0.e(j3));
    }

    public static final String t(sx4 sx4Var, qe4 qe4Var) {
        qe4Var.getClass();
        ed1 ed1VarP = sx4Var.p();
        ed1VarP.getClass();
        v15 name = sx4Var.getName();
        v15 v15Var = hf7.a;
        if (name == null || name.Y) {
            name = hf7.c;
        }
        String strC = name.c();
        if (ed1VarP instanceof tf5) {
            fk2 fk2Var = ((uf5) ((tf5) ed1VarP)).i0;
            if (fk2Var.a.c()) {
                return strC;
            }
            return mm7.X(fk2Var.a.a, '.', '/') + '/' + strC;
        }
        sx4 sx4Var2 = ed1VarP instanceof sx4 ? (sx4) ed1VarP : null;
        if (sx4Var2 == null) {
            b61.l("Unexpected container: ", ed1VarP, " for ", sx4Var);
            return null;
        }
        return t(sx4Var2, qe4Var) + '$' + strC;
    }

    public static final kx4 v(kx4 kx4Var, wc2 wc2Var) {
        return kx4Var.y(new bn8(wc2Var));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.l(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.ze2 r7, defpackage.jp0 r8, boolean r9, defpackage.s51 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.ff2
            if (r0 == 0) goto L13
            r0 = r10
            ff2 r0 = (defpackage.ff2) r0
            int r1 = r0.k0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k0 = r1
            goto L18
        L13:
            ff2 r0 = new ff2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.j0
            int r1 = r0.k0
            r2 = 2
            r3 = 1
            r4 = 0
            c71 r5 = defpackage.c71.X
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            boolean r9 = r0.i0
            q90 r7 = r0.h0
            jp0 r8 = r0.g0
            ze2 r1 = r0.f0
            defpackage.w39.n0(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r7)
            return r4
        L3d:
            boolean r9 = r0.i0
            q90 r7 = r0.h0
            jp0 r8 = r0.g0
            ze2 r1 = r0.f0
            defpackage.w39.n0(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.w39.n0(r10)
            boolean r10 = r7 instanceof defpackage.w98
            if (r10 != 0) goto La9
            q90 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.f0 = r7     // Catch: java.lang.Throwable -> L35
            r0.g0 = r8     // Catch: java.lang.Throwable -> L35
            r0.h0 = r10     // Catch: java.lang.Throwable -> L35
            r0.i0 = r9     // Catch: java.lang.Throwable -> L35
            r0.k0 = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f0 = r1     // Catch: java.lang.Throwable -> L35
            r0.g0 = r8     // Catch: java.lang.Throwable -> L35
            r0.h0 = r7     // Catch: java.lang.Throwable -> L35
            r0.i0 = r9     // Catch: java.lang.Throwable -> L35
            r0.k0 = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.l(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.m(r4)
        L8b:
            dn8 r7 = defpackage.dn8.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto La8
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L99
            r4 = r7
            java.util.concurrent.CancellationException r4 = (java.util.concurrent.CancellationException) r4
        L99:
            if (r4 != 0) goto La5
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r4.<init>(r9)
            r4.initCause(r7)
        La5:
            r8.m(r4)
        La8:
            throw r10
        La9:
            w98 r7 = (defpackage.w98) r7
            java.lang.Throwable r7 = r7.X
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z51.w(ze2, jp0, boolean, s51):java.lang.Object");
    }

    public static final boolean x(long j2, long j3) {
        return j2 == j3;
    }

    public static ne y(Object obj) {
        return new ne(obj.getClass(), Array.getLength(obj), obj, (byte) 2);
    }

    public static Calendar z(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public void T(ld0 ld0Var, Collection collection) {
        ld0Var.getClass();
        ld0Var.e0(collection);
    }

    public abstract void k(ld0 ld0Var);

    public void u(ld0 ld0Var, ld0 ld0Var2) {
    }
}
