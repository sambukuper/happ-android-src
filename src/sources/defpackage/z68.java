package defpackage;

import android.media.ImageReader;
import androidx.compose.foundation.layout.b;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z68 {
    public static final zy0 a = new zy0(210148896, false, new dx0(2));
    public static final jw0 b = jw0.k0;
    public static final xj8 c = xj8.f0;
    public static final jw0 d = jw0.h0;
    public static final xj8 e = xj8.Z;
    public static final jw0 f = jw0.i0;
    public static final xj8 g = xj8.X;
    public static final jw0 h = jw0.m0;
    public static final ow3[] i = new ow3[0];
    public static final ot1 j = new ot1();
    public static z47 k;
    public static Field l;
    public static boolean m;
    public static Class n;
    public static boolean o;
    public static Field p;
    public static boolean q;
    public static Field r;
    public static boolean s;

    public static long A(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    s31.l(i7);
                    b61.n();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return s31.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static final y68 A0(String str, lp2 lp2Var, int i2) {
        if ((i2 & 1) != 0) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int length = str.length();
        long jC = ct7.c(length, length);
        Object[] objArr = new Object[0];
        lh4 lh4Var = lh4.I0;
        boolean zF = lp2Var.f(str) | lp2Var.e(jC);
        Object objK = lp2Var.K();
        if (zF || objK == zz0.a) {
            objK = new oh(str, jC, (byte) 3);
            lp2Var.g0(objK);
        }
        return (y68) jm4.Y(objArr, lh4Var, (dn2) objK, lp2Var, 48);
    }

    public static long B(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i2, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    s31.l(i7);
                    b61.n();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return s31.a(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static t14 B0(wi8 wi8Var, x14 x14Var) {
        wi8Var.getClass();
        x14Var.getClass();
        if (x14Var instanceof mo8) {
            return wi8Var.f((t14) x14Var, rt8.INVARIANT);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(x14Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
        return null;
    }

    public static final wi0 C(a7 a7Var, a7 a7Var2) {
        String strE = a7Var2 != null ? a7Var2.X.e() : null;
        ny nyVar = ((lh0) a7Var.Z).X;
        String strE2 = a7Var.X.e();
        strE2.getClass();
        return v(strE2, strE, nyVar);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0169 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    public static final long C0(long j2, long j3) {
        long j4;
        long j5;
        long j6;
        lx1 lx1Var = lx1.NANOSECONDS;
        long j7 = gx1.j(j3, lx1Var);
        long jA = 0;
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (!gx1.h(j3) || (j2 ^ j7) >= 0) {
                return j2;
            }
            bt.q("Summing infinities of different signs");
            return 0L;
        }
        if (((j7 - 1) | 1) != Long.MAX_VALUE) {
            long j8 = j2 + j7;
            if (((j7 ^ j8) & (j2 ^ j8)) < 0) {
                return j2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            return j8;
        }
        long j9 = gx1.f0;
        long j10 = gx1.Z;
        int i2 = ((int) j3) & 1;
        if (i2 != 0) {
            if (gx1.h(j3)) {
                j4 = 1;
                int iSignum = Integer.signum(2);
                if (gx1.h(j3)) {
                    if (iSignum == 0) {
                        bt.q("Multiplying infinite duration by zero yields an undefined result.");
                        return 0L;
                    }
                    jA = iSignum > 0 ? j3 : gx1.k(j3);
                } else if (iSignum != 0) {
                    long j11 = j3 >> 1;
                    j5 = Long.MAX_VALUE;
                    long j12 = iSignum;
                    long j13 = j11 * j12;
                    if (i2 == 0) {
                        if (-2147483647L <= j11 && j11 < 2147483648L) {
                            jA = vj8.B(j13);
                        } else if (j13 / j12 == j11) {
                            jA = (-4611686018426999999L > j13 || j13 >= 4611686018427000000L) ? vj8.A(j13 / 1000000) : vj8.B(j13);
                        } else {
                            long j14 = j11 / 1000000;
                            long j15 = j14 * j12;
                            long j16 = (((j11 - (j14 * 1000000)) * j12) / 1000000) + j15;
                            if (j15 / j12 != j14 || (j16 ^ j15) < 0) {
                                if (Integer.signum(iSignum) * Long.signum(j11) > 0) {
                                    jA = j10;
                                } else {
                                    jA = j9;
                                }
                            } else {
                                jA = vj8.A(x97.q(j16, new ni4(-4611686018427387903L, 4611686018427387903L)));
                            }
                        }
                    } else if (j13 / j12 == j11) {
                        jA = vj8.A(x97.q(j13, new ni4(-4611686018427387903L, 4611686018427387903L)));
                    } else {
                        if (Integer.signum(iSignum) * Long.signum(j11) > 0) {
                            jA = j10;
                        } else {
                            jA = j9;
                        }
                    }
                }
            } else {
                j4 = 1;
                j5 = Long.MAX_VALUE;
                long j17 = j3 >> 1;
                long j18 = j17 / 2;
                if (-4611686018426L > j18 || j18 >= 4611686018427L) {
                    jA = vj8.A(j18);
                } else {
                    jA = vj8.B((j18 * 1000000) + (((j17 - (j18 * 2)) * 1000000) / 2));
                }
            }
            j6 = gx1.j(jA, lx1Var);
            if (((j6 - j4) | j4) == j5) {
                return j6;
            }
            return C0(C0(j2, jA), gx1.i(j3, gx1.k(jA)));
        }
        jA = vj8.B((j3 >> 1) / 2);
        j4 = 1;
        j5 = Long.MAX_VALUE;
        j6 = gx1.j(jA, lx1Var);
        if (((j6 - j4) | j4) == j5) {
            return j6;
        }
        return C0(C0(j2, jA), gx1.i(j3, gx1.k(jA)));
    }

    public static bh8 D(x14 x14Var, int i2) {
        x14Var.getClass();
        if (x14Var instanceof t14) {
            return (bh8) ((t14) x14Var).l0().get(i2);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(x14Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
        return null;
    }

    public static final long D0(long j2, long j3) {
        long j4 = j2 - j3;
        long j5 = (j4 ^ j2) & (~(j4 ^ j3));
        lx1 lx1Var = lx1.NANOSECONDS;
        if (j5 >= 0) {
            return vj8.m0(j4, lx1Var);
        }
        lx1 lx1Var2 = lx1.MILLISECONDS;
        if (lx1Var.compareTo(lx1Var2) >= 0) {
            return gx1.k(U(j4));
        }
        long j6 = (j2 / 1000000) - (j3 / 1000000);
        long j7 = (j2 % 1000000) - (j3 % 1000000);
        be beVar = gx1.Y;
        return gx1.i(vj8.m0(j6, lx1Var2), vj8.m0(j7, lx1Var));
    }

    public static List E(x14 x14Var) {
        x14Var.getClass();
        if (x14Var instanceof t14) {
            return ((t14) x14Var).l0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(x14Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
        return null;
    }

    public static final Collection E0(Collection collection, gn2 gn2Var) {
        collection.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        pc7 pc7Var = new pc7();
        while (!linkedList.isEmpty()) {
            Object objR0 = wv0.r0(linkedList);
            pc7 pc7Var2 = new pc7();
            ArrayList arrayListG = hf5.g(objR0, linkedList, gn2Var, new f0(pc7Var2, (byte) 26));
            if (arrayListG.size() == 1 && pc7Var2.isEmpty()) {
                Object objN0 = wv0.N0(arrayListG);
                objN0.getClass();
                pc7Var.add(objN0);
            } else {
                Object objS = hf5.s(arrayListG, gn2Var);
                jd0 jd0Var = (jd0) gn2Var.B(objS);
                for (Object obj : arrayListG) {
                    obj.getClass();
                    if (!hf5.k(jd0Var, (jd0) gn2Var.B(obj))) {
                        pc7Var2.add(obj);
                    }
                }
                if (!pc7Var2.isEmpty()) {
                    pc7Var.addAll(pc7Var2);
                }
                pc7Var.add(objS);
            }
        }
        return pc7Var;
    }

    public static final Object F(v63 v63Var, f4 f4Var) {
        Object obj = v63Var.r.a.get(f4Var);
        if (obj != null) {
            return obj;
        }
        Object obj2 = v63Var.t.n.a.get(f4Var);
        return obj2 == null ? f4Var.X : obj2;
    }

    public static final kx4 F0(kx4 kx4Var, boolean z, boolean z2, dn2 dn2Var) {
        if (!z || !tm7.a) {
            return kx4Var;
        }
        if (z2) {
            kx4Var = kx4Var.y(new um7(j));
        }
        return kx4Var.y(new rm7(dn2Var));
    }

    public static final Object G(pd5 pd5Var, f4 f4Var) {
        Object obj = pd5Var.j.a.get(f4Var);
        return obj == null ? f4Var.X : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mt0 G0(nt0 nt0Var, zk6 zk6Var) {
        if (zk6Var instanceof aa7) {
            t14 t14Var = (t14) zk6Var;
            return new mt0(nt0Var, new wi8(nh8.b.a(t14Var.n0(), t14Var.l0())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zk6Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, zk6Var.getClass(), sb));
        return null;
    }

    public static final ai H(s61 s61Var) {
        ai aiVar = (ai) s61Var.H0(qe4.f0);
        if (aiVar != null) {
            return aiVar;
        }
        bt.i("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static Collection H0(mh8 mh8Var) {
        mh8Var.getClass();
        if (mh8Var instanceof lh8) {
            Collection collectionC = ((lh8) mh8Var).c();
            collectionC.getClass();
            return collectionC;
        }
        StringBuilder sbS = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ");
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), sbS));
        return null;
    }

    public static ji8 I(mh8 mh8Var, int i2) {
        if (mh8Var instanceof lh8) {
            Object obj = ((lh8) mh8Var).g().get(i2);
            obj.getClass();
            return (ji8) obj;
        }
        StringBuilder sbS = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ");
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), sbS));
        return null;
    }

    public static final fk2 I0(fk2 fk2Var, fk2 fk2Var2) {
        fk2Var.getClass();
        gk2 gk2Var = fk2Var.a;
        fk2Var2.getClass();
        gk2 gk2Var2 = fk2Var2.a;
        if (!fk2Var.equals(fk2Var2) && !gk2Var2.c()) {
            String str = gk2Var.a;
            String str2 = gk2Var2.a;
            if (!mm7.Z(str, false, str2) || str.charAt(str2.length()) != '.') {
                return fk2Var;
            }
        }
        if (gk2Var2.c()) {
            return fk2Var;
        }
        return fk2Var.equals(fk2Var2) ? fk2.c : new fk2(gk2Var.a.substring(gk2Var2.a.length() + 1));
    }

    public static t14 J(ji8 ji8Var) {
        ji8Var.getClass();
        if (ji8Var instanceof hi8) {
            return y08.f((hi8) ji8Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(ji8Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, ji8Var.getClass(), sb));
        return null;
    }

    public static final long J0(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * Float.intBitsToFloat((int) (j2 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) * Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final c78 K(g48 g48Var) {
        p88 p88Var = g48Var.f0;
        if (p88Var != null) {
            return new c78(new p88(p88Var, false), g48Var.Z.length());
        }
        return null;
    }

    public static d45 K0(fo0 fo0Var) {
        if (fo0Var instanceof c45) {
            return ((c45) fo0Var).Z;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fo0Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, fo0Var.getClass(), sb));
        return null;
    }

    public static mo8 L(nt0 nt0Var, bh8 bh8Var) {
        bh8Var.getClass();
        if (nt0Var.j(bh8Var)) {
            return null;
        }
        if (bh8Var instanceof ni8) {
            return ((ni8) bh8Var).b().q0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bh8Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, bh8Var.getClass(), sb));
        return null;
    }

    public static lh8 L0(zk6 zk6Var) {
        zk6Var.getClass();
        if (zk6Var instanceof aa7) {
            return ((aa7) zk6Var).n0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zk6Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, zk6Var.getClass(), sb));
        return null;
    }

    public static hi8 M(mh8 mh8Var) {
        mh8Var.getClass();
        if (mh8Var instanceof lh8) {
            ot0 ot0VarX = ((lh8) mh8Var).x();
            if (ot0VarX instanceof hi8) {
                return (hi8) ot0VarX;
            }
            return null;
        }
        StringBuilder sbS = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ");
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), sbS));
        return null;
    }

    public static aa7 M0(fe2 fe2Var) {
        if (fe2Var instanceof ce2) {
            return ((ce2) fe2Var).Z;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fe2Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, fe2Var.getClass(), sb));
        return null;
    }

    public static List N(ji8 ji8Var) {
        ji8Var.getClass();
        if (ji8Var instanceof hi8) {
            List upperBounds = ((hi8) ji8Var).getUpperBounds();
            upperBounds.getClass();
            return upperBounds;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(ji8Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, ji8Var.getClass(), sb));
        return null;
    }

    public static x14 N0(nt0 nt0Var, x14 x14Var) {
        if (x14Var instanceof zk6) {
            return nt0Var.g((zk6) x14Var);
        }
        if (x14Var instanceof fe2) {
            fe2 fe2Var = (fe2) x14Var;
            return nt0Var.H0(nt0Var.g((zk6) nt0Var.i(fe2Var)), nt0Var.g((zk6) nt0Var.h(fe2Var)));
        }
        bt.i("sealed");
        return null;
    }

    public static dj8 O(bh8 bh8Var) {
        bh8Var.getClass();
        if (bh8Var instanceof ni8) {
            rt8 rt8VarA = ((ni8) bh8Var).a();
            rt8VarA.getClass();
            return t08.a(rt8VarA);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bh8Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, bh8Var.getClass(), sb));
        return null;
    }

    public static aa7 O0(zk6 zk6Var, boolean z) {
        zk6Var.getClass();
        if (zk6Var instanceof aa7) {
            return ((aa7) zk6Var).r0(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zk6Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, zk6Var.getClass(), sb));
        return null;
    }

    public static dj8 P(ji8 ji8Var) {
        ji8Var.getClass();
        if (ji8Var instanceof hi8) {
            rt8 rt8VarD = ((hi8) ji8Var).D();
            rt8VarD.getClass();
            return t08.a(rt8VarD);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(ji8Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, ji8Var.getClass(), sb));
        return null;
    }

    public static Class P0(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }

    public static boolean Q(t14 t14Var, fk2 fk2Var) {
        return t14Var.getAnnotations().k(fk2Var);
    }

    public static boolean R(jh8 jh8Var, zk6 zk6Var, dt7 dt7Var) {
        ih8 ih8Var = ih8.c;
        jh8Var.getClass();
        zk6Var.getClass();
        xi8 xi8Var = jh8Var.c;
        if ((xi8Var.v(zk6Var) && !xi8Var.C0(zk6Var)) || xi8Var.J(zk6Var)) {
            return true;
        }
        jh8Var.b();
        ArrayDeque arrayDeque = jh8Var.g;
        arrayDeque.getClass();
        pc7 pc7Var = jh8Var.h;
        pc7Var.getClass();
        arrayDeque.push(zk6Var);
        while (!arrayDeque.isEmpty()) {
            zk6 zk6Var2 = (zk6) arrayDeque.pop();
            zk6Var2.getClass();
            if (pc7Var.add(zk6Var2)) {
                dt7 dt7Var2 = xi8Var.C0(zk6Var2) ? ih8Var : dt7Var;
                if (dt7Var2.equals(ih8Var)) {
                    dt7Var2 = null;
                }
                if (dt7Var2 == null) {
                    continue;
                } else {
                    Iterator it = xi8Var.C(xi8Var.E(zk6Var2)).iterator();
                    while (it.hasNext()) {
                        zk6 zk6VarG = dt7Var2.g(jh8Var, (x14) it.next());
                        if ((xi8Var.v(zk6VarG) && !xi8Var.C0(zk6VarG)) || xi8Var.J(zk6VarG)) {
                            jh8Var.a();
                            return true;
                        }
                        arrayDeque.add(zk6VarG);
                    }
                }
            }
        }
        jh8Var.a();
        return false;
    }

    public static boolean S(ji8 ji8Var, mh8 mh8Var) {
        if (!(ji8Var instanceof hi8)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(ji8Var);
            sb.append(", ");
            em7.c(oi0.j(yb6.a, ji8Var.getClass(), sb));
            return false;
        }
        hi8 hi8Var = (hi8) ji8Var;
        if (mh8Var == null ? true : mh8Var instanceof lh8) {
            return y08.g(hi8Var, (lh8) mh8Var, null);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hi8Var);
        sb2.append(", ");
        em7.c(oi0.j(yb6.a, hi8Var.getClass(), sb2));
        return false;
    }

    public static boolean T(zk6 zk6Var, zk6 zk6Var2) {
        zk6Var.getClass();
        zk6Var2.getClass();
        if (!(zk6Var instanceof aa7)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zk6Var);
            sb.append(", ");
            em7.c(oi0.j(yb6.a, zk6Var.getClass(), sb));
            return false;
        }
        if (zk6Var2 instanceof aa7) {
            return ((aa7) zk6Var).l0() == ((aa7) zk6Var2).l0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(zk6Var2);
        sb2.append(", ");
        em7.c(oi0.j(yb6.a, zk6Var2.getClass(), sb2));
        return false;
    }

    public static final long U(long j2) {
        if (j2 < 0) {
            be beVar = gx1.Y;
            return gx1.f0;
        }
        be beVar2 = gx1.Y;
        return gx1.Z;
    }

    public static z47 V() {
        z47 z47Var;
        z47 z47Var2 = k;
        if (z47Var2 != null) {
            return z47Var2;
        }
        Object obj = null;
        try {
            z47Var = new z47(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 21);
        } catch (NoSuchMethodException unused) {
            z47Var = new z47(obj, obj, obj, obj, (byte) 21);
        }
        k = z47Var;
        return z47Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void W(rv1 rv1Var) {
        if (((jx4) rv1Var).X.p0) {
            yn0.X(rv1Var, 1).d1();
        }
    }

    public static boolean X(mh8 mh8Var) {
        if (mh8Var instanceof lh8) {
            return zz3.J((lh8) mh8Var, tg7.a);
        }
        StringBuilder sbS = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ");
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), sbS));
        return false;
    }

    public static boolean Y(jh8 jh8Var, zk6 zk6Var, mh8 mh8Var) {
        xi8 xi8Var = jh8Var.c;
        if (xi8Var.u(zk6Var)) {
            return true;
        }
        if (xi8Var.C0(zk6Var)) {
            return false;
        }
        if (jh8Var.b) {
            xi8Var.Y(zk6Var);
        }
        return xi8Var.i0(xi8Var.E(zk6Var), mh8Var);
    }

    public static boolean Z(mh8 mh8Var) {
        mh8Var.getClass();
        if (mh8Var instanceof lh8) {
            return ((lh8) mh8Var).x() instanceof sx4;
        }
        StringBuilder sbS = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ");
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), sbS));
        return false;
    }

    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        switch (i2) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        if (i2 == 5 || i2 == 6) {
            objArr[2] = "reportSignatureErrors";
        } else {
            objArr[2] = "resolvePropagatedSignature";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean a0(mh8 mh8Var) {
        if (mh8Var instanceof lh8) {
            ot0 ot0VarX = ((lh8) mh8Var).x();
            sx4 sx4Var = ot0VarX instanceof sx4 ? (sx4) ot0VarX : null;
            return (sx4Var == null || sx4Var.m() != fx4.Y || sx4Var.g0() == us0.Z || sx4Var.g0() == us0.f0 || sx4Var.g0() == us0.g0) ? false : true;
        }
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ")));
        return false;
    }

    public static qk b(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new qk(ys0.j0, Float.valueOf(f2), new sk(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static boolean b0(mh8 mh8Var) {
        if (mh8Var instanceof lh8) {
            return ((lh8) mh8Var).B();
        }
        StringBuilder sbS = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ");
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), sbS));
        return false;
    }

    public static final void c(nr5 nr5Var, zy0 zy0Var, jc8 jc8Var, zy0 zy0Var2, lp2 lp2Var, int i2) {
        nr5 nr5Var2;
        int i3;
        y05 y05Var;
        lp2Var.X(-1221877520);
        if ((i2 & 6) == 0) {
            nr5Var2 = nr5Var;
            i3 = (lp2Var.f(nr5Var2) ? 4 : 2) | i2;
        } else {
            nr5Var2 = nr5Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? lp2Var.f(jc8Var) : lp2Var.h(jc8Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i4 = i2 & 3072;
        hx4 hx4Var = hx4.X;
        if (i4 == 0) {
            i3 |= lp2Var.f(hx4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= lp2Var.h(null) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        boolean z = false;
        if ((i2 & 196608) == 0) {
            i3 |= lp2Var.g(false) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= lp2Var.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= lp2Var.g(false) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= lp2Var.h(zy0Var2) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (lp2Var.N(i5 & 1, (38347923 & i5) != 38347922)) {
            Object objK = lp2Var.K();
            Object obj = zz0.a;
            if (objK == obj) {
                objK = u70.D(lp2Var);
                lp2Var.g0(objK);
            }
            b71 b71Var = (b71) objK;
            Object objK2 = lp2Var.K();
            if (objK2 == obj) {
                objK2 = z51.H(Boolean.FALSE);
                lp2Var.g0(objK2);
            }
            y05 y05Var2 = (y05) objK2;
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, hx4Var);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4VarC);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            dx0 dx0Var = pz2.C0;
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                p61.v(I, lp2Var, I, dx0Var);
            }
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            if (jc8Var.b()) {
                lp2Var.W(-1891243071);
                y05Var = y05Var2;
                g(nr5Var2, jc8Var, b71Var, false, y05Var, zy0Var, lp2Var, (i5 & 14) | 196608 | ((i5 >> 3) & 112) | ((i5 >> 6) & 896) | ((i5 << 15) & 3670016));
                lp2Var.p(false);
            } else {
                y05Var = y05Var2;
                lp2Var.W(-1890863476);
                lp2Var.p(false);
            }
            h(jc8Var, y05Var, zy0Var2, lp2Var, ((i5 >> 18) & 14) | 384 | ((i5 >> 3) & 112) | ((i5 >> 12) & 7168) | (57344 & (i5 << 3)) | ((i5 >> 9) & 458752));
            lp2Var.p(true);
            if ((i5 & 896) == 256 || ((i5 & 512) != 0 && lp2Var.h(jc8Var))) {
                z = true;
            }
            Object objK3 = lp2Var.K();
            if (z || objK3 == obj) {
                objK3 = new y0((Object) jc8Var, (byte) 12);
                lp2Var.g0(objK3);
            }
            u70.a(jc8Var, (gn2) objK3, lp2Var);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i40(nr5Var, zy0Var, jc8Var, zy0Var2, i2);
        }
    }

    public static boolean c0(x14 x14Var) {
        x14Var.getClass();
        if (x14Var instanceof t14) {
            return vr3.J((t14) x14Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(x14Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
        return false;
    }

    public static final void d(b83 b83Var, int i2, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i3) {
        b83Var.getClass();
        gn2Var.getClass();
        lp2Var.X(1772515775);
        int i4 = (lp2Var.f(b83Var) ? 4 : 2) | i3 | (lp2Var.d(i2) ? 32 : 16) | (lp2Var.h(gn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (lp2Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            w79.a(kx4Var, null, jm4.U(1901406730, new nx2(b83Var, i2, gn2Var, b.a), lp2Var), lp2Var, 390);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new nx2(b83Var, i2, gn2Var, kx4Var, i3);
        }
    }

    public static boolean d0(mh8 mh8Var) {
        mh8Var.getClass();
        if (mh8Var instanceof lh8) {
            ot0 ot0VarX = ((lh8) mh8Var).x();
            sx4 sx4Var = ot0VarX instanceof sx4 ? (sx4) ot0VarX : null;
            return (sx4Var != null ? sx4Var.u0() : null) instanceof ad3;
        }
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ")));
        return false;
    }

    public static final void e(ox2 ox2Var, boolean z, dn2 dn2Var, kx4 kx4Var, ig5 ig5Var, lp2 lp2Var, int i2) {
        lp2 lp2Var2 = lp2Var;
        lp2Var2.X(-1379154468);
        int i3 = i2 | (lp2Var2.f(ox2Var) ? 4 : 2) | (lp2Var2.g(z) ? 32 : 16) | (lp2Var2.h(dn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var2.f(ig5Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (lp2Var2.N(i3 & 1, (i3 & 9363) != 9362)) {
            kx4 kx4VarX = vj8.x(kx4Var, true, null, null, null, dn2Var, lp2Var, 29);
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarX);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var, xr4VarC);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var, numValueOf);
            pn7.l(lp2Var);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var, kx4VarQ);
            kx4 kx4VarW = os4.w(b.a, ig5Var);
            wq6 wq6VarA = vq6.a(new ft(16.0f, new bt()), pz2.o0, lp2Var, 54);
            int iHashCode2 = Long.hashCode(lp2Var.T);
            kl5 kl5VarL2 = lp2Var.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarW);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, wq6VarA);
            pn7.m(dx0Var2, lp2Var, kl5VarL2);
            oi0.u(iHashCode2, lp2Var, dx0Var3, lp2Var);
            pn7.m(dx0Var4, lp2Var, kx4VarQ2);
            wl7.c(z, true, dn2Var, lp2Var, ((i3 >> 3) & 14) | ((i3 << 3) & 7168), 2);
            zc1.g(ox2Var.a, new d44(1.0f, true), o88.a(((ds) lp2Var.j(es.a)).b, ((dp) lp2Var.j(ep.z)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var, 0, 504);
            lp2Var2 = lp2Var;
            lp2Var2.p(true);
            lp2Var2.p(true);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new mx2(ox2Var, z, dn2Var, kx4Var, ig5Var, i2);
        }
    }

    public static boolean e0(mh8 mh8Var) {
        mh8Var.getClass();
        if (mh8Var instanceof lh8) {
            return mh8Var instanceof sf3;
        }
        StringBuilder sbS = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ");
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), sbS));
        return false;
    }

    public static final d7 f(vm3 vm3Var, String str) {
        vm3Var.getClass();
        str.getClass();
        return new d7(str, vm3Var.a);
    }

    public static boolean f0(mh8 mh8Var) {
        if (mh8Var instanceof lh8) {
            return mh8Var instanceof qg3;
        }
        StringBuilder sbS = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ");
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), sbS));
        return false;
    }

    public static final void g(nr5 nr5Var, jc8 jc8Var, b71 b71Var, boolean z, y05 y05Var, zy0 zy0Var, lp2 lp2Var, int i2) {
        nr5 nr5Var2;
        int i3;
        lp2Var.X(-1413720282);
        if ((i2 & 6) == 0) {
            nr5Var2 = nr5Var;
            i3 = (lp2Var.f(nr5Var2) ? 4 : 2) | i2;
        } else {
            nr5Var2 = nr5Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? lp2Var.f(jc8Var) : lp2Var.h(jc8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= lp2Var.h(b71Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= lp2Var.g(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= lp2Var.f(y05Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= lp2Var.h(zy0Var) ? 1048576 : 524288;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (lp2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            String strJ0 = vj8.j0(z46.tooltip_description, lp2Var);
            boolean zH = ((i3 & 112) == 32 || ((i3 & 64) != 0 && lp2Var.h(jc8Var))) | ((i3 & 896) == 256) | lp2Var.h(b71Var) | ((458752 & i3) == 131072);
            Object objK = lp2Var.K();
            if (zH || objK == zz0.a) {
                objK = new g00(jc8Var, b71Var, y05Var, b3);
                lp2Var.g0(objK);
            }
            int i4 = (i3 & 14) | 3072;
            bg.a(nr5Var2, (dn2) objK, new or5(z), jm4.U(-1287705660, new n40(strJ0, zy0Var, b2), lp2Var), lp2Var, i4, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new j40(nr5Var, jc8Var, b71Var, z, y05Var, zy0Var, i2);
        }
    }

    public static boolean g0(x14 x14Var) {
        x14Var.getClass();
        return (x14Var instanceof aa7) && ((aa7) x14Var).o0();
    }

    public static final void h(jc8 jc8Var, y05 y05Var, zy0 zy0Var, lp2 lp2Var, int i2) {
        int i3;
        lp2Var.X(1873232064);
        byte b2 = 1;
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.g(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? lp2Var.f(jc8Var) : lp2Var.h(jc8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.f(y05Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        byte b3 = 0;
        if ((i2 & 3072) == 0) {
            i3 |= lp2Var.g(false) ? 2048 : 1024;
        }
        int i4 = i2 & 24576;
        hx4 hx4Var = hx4.X;
        if (i4 == 0) {
            i3 |= lp2Var.f(hx4Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= lp2Var.h(zy0Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if (lp2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = u70.D(lp2Var);
                lp2Var.g0(objK);
            }
            b71 b71Var = (b71) objK;
            kx4 kx4VarT = mb6.T(z51.J(yy7.a(yy7.a(hx4Var, jc8Var, new s40(jc8Var, b3)), jc8Var, new s40(jc8Var, b2)).y(new ei5(new sn(vj8.j0(z46.tooltip_label, lp2Var), b71Var, jc8Var, b2))), new p0(b71Var, jc8Var, (byte) 7)), new d3(jc8Var, y05Var, (byte) 5));
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarT);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4VarC);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            dx0 dx0Var = pz2.C0;
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                p61.v(I, lp2Var, I, dx0Var);
            }
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            zy0Var.K(lp2Var, Integer.valueOf((i3 >> 15) & 14));
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8(jc8Var, y05Var, zy0Var, i2);
        }
    }

    public static boolean h0(mh8 mh8Var) {
        mh8Var.getClass();
        if (mh8Var instanceof lh8) {
            return zz3.J((lh8) mh8Var, tg7.b);
        }
        StringBuilder sbS = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ");
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), sbS));
        return false;
    }

    public static final void i(cc1 cc1Var, gn2[] gn2VarArr, gn2 gn2Var) {
        cc1Var.getClass();
        if (!(cc1Var instanceof h1)) {
            bt.i("impossible");
            return;
        }
        h1 h1Var = (h1) cc1Var;
        gn2[] gn2VarArr2 = (gn2[]) Arrays.copyOf(gn2VarArr, gn2VarArr.length);
        ci8.i(1, gn2Var);
        ArrayList arrayList = new ArrayList(gn2VarArr2.length);
        for (gn2 gn2Var2 : gn2VarArr2) {
            h1 h1VarO = h1Var.o();
            gn2Var2.B(h1VarO);
            arrayList.add(new b11(h1VarO.i().b));
        }
        h1 h1VarO2 = h1Var.o();
        gn2Var.B(h1VarO2);
        h1Var.i().a(new z8(new b11(h1VarO2.i().b), arrayList));
    }

    public static boolean i0(x14 x14Var) {
        x14Var.getClass();
        if (x14Var instanceof t14) {
            return cj8.e((t14) x14Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(x14Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
        return false;
    }

    public static boolean j(mh8 mh8Var, mh8 mh8Var2) {
        mh8Var.getClass();
        mh8Var2.getClass();
        if (!(mh8Var instanceof lh8)) {
            StringBuilder sbS = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ");
            em7.c(oi0.j(yb6.a, mh8Var.getClass(), sbS));
            return false;
        }
        if (mh8Var2 instanceof lh8) {
            return mh8Var.equals(mh8Var2);
        }
        StringBuilder sbS2 = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var2, ", ");
        em7.c(oi0.j(yb6.a, mh8Var2.getClass(), sbS2));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean j0(da7 da7Var) {
        if (da7Var instanceof t14) {
            return zz3.H((t14) da7Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(da7Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, da7Var.getClass(), sb));
        return false;
    }

    public static int k(x14 x14Var) {
        x14Var.getClass();
        if (x14Var instanceof t14) {
            return ((t14) x14Var).l0().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(x14Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
        return 0;
    }

    public static boolean k0(fo0 fo0Var) {
        if (fo0Var instanceof c45) {
            return ((c45) fo0Var).i0;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fo0Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, fo0Var.getClass(), sb));
        return false;
    }

    public static ah8 l(zk6 zk6Var) {
        zk6Var.getClass();
        if (zk6Var instanceof aa7) {
            return (ah8) zk6Var;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zk6Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, zk6Var.getClass(), sb));
        return null;
    }

    public static boolean l0(x14 x14Var) {
        x14Var.getClass();
        if (x14Var instanceof t14) {
            return x14Var instanceof r66;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(x14Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
        return false;
    }

    public static fo0 m(nt0 nt0Var, da7 da7Var) {
        if (da7Var instanceof aa7) {
            if (da7Var instanceof fa7) {
                return nt0Var.b0(((fa7) da7Var).Y);
            }
            if (da7Var instanceof c45) {
                return (c45) da7Var;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(da7Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, da7Var.getClass(), sb));
        return null;
    }

    public static boolean m0(bh8 bh8Var) {
        bh8Var.getClass();
        if (bh8Var instanceof ni8) {
            return ((ni8) bh8Var).c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bh8Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, bh8Var.getClass(), sb));
        return false;
    }

    public static hh1 n(zk6 zk6Var) {
        zk6Var.getClass();
        if (zk6Var instanceof aa7) {
            if (zk6Var instanceof hh1) {
                return (hh1) zk6Var;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zk6Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, zk6Var.getClass(), sb));
        return null;
    }

    public static void n0(zk6 zk6Var) {
        zk6Var.getClass();
        if (zk6Var instanceof aa7) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zk6Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, zk6Var.getClass(), sb));
    }

    public static ce2 o(x14 x14Var) {
        x14Var.getClass();
        if (x14Var instanceof t14) {
            mo8 mo8VarQ0 = ((t14) x14Var).q0();
            if (mo8VarQ0 instanceof ce2) {
                return (ce2) mo8VarQ0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(x14Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
        return null;
    }

    public static void o0(zk6 zk6Var) {
        if (zk6Var instanceof aa7) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zk6Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, zk6Var.getClass(), sb));
    }

    public static aa7 p(x14 x14Var) {
        x14Var.getClass();
        if (x14Var instanceof t14) {
            mo8 mo8VarQ0 = ((t14) x14Var).q0();
            if (mo8VarQ0 instanceof aa7) {
                return (aa7) mo8VarQ0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(x14Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
        return null;
    }

    public static final boolean p0(pw3 pw3Var, pw3 pw3Var2) {
        pw3Var.getClass();
        pw3Var2.getClass();
        if (q08.a) {
            return y08.i(((kk1) pw3Var).Y, ((kk1) pw3Var2).Y);
        }
        qe4 qe4Var = qe4.q0;
        jh8 jh8Var = new jh8(false, false, false, qe4Var, l3.i, m3.t);
        u1 u1Var = (u1) pw3Var;
        u1 u1Var2 = (u1) pw3Var2;
        if (u1Var == u1Var2) {
            return true;
        }
        rn2 rn2VarP = qe4Var.P();
        Boolean bool = rn2VarP != null ? (Boolean) rn2VarP.K(u1Var, u1Var2) : null;
        return bool != null ? bool.booleanValue() : oy1.Y.u(jh8Var, qe4Var, u1Var, u1Var2);
    }

    public static wg7 q(x14 x14Var) {
        if (x14Var instanceof t14) {
            return new wg7((t14) x14Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(x14Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
        return null;
    }

    public static final kx4 q0(kx4 kx4Var, sn2 sn2Var) {
        return kx4Var.y(new a34(sn2Var));
    }

    public static aa7 r(zk6 zk6Var) {
        List listL0;
        ArrayList arrayList;
        pl1 pl1Var = null;
        if (!(zk6Var instanceof aa7)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zk6Var);
            sb.append(", ");
            em7.c(oi0.j(yb6.a, zk6Var.getClass(), sb));
            return null;
        }
        aa7 aa7Var = (aa7) zk6Var;
        y14 y14Var = y14.i;
        if (aa7Var.l0().size() == aa7Var.n0().g().size() && ((listL0 = aa7Var.l0()) == null || !listL0.isEmpty())) {
            Iterator it = listL0.iterator();
            while (it.hasNext()) {
                rt8 rt8VarA = ((ni8) it.next()).a();
                rt8 rt8Var = rt8.INVARIANT;
                if (rt8VarA != rt8Var) {
                    List listG = aa7Var.n0().g();
                    listG.getClass();
                    ArrayList<qg5> arrayListE1 = wv0.e1(listL0, listG);
                    arrayList = new ArrayList(xv0.Z(arrayListE1, 10));
                    for (qg5 qg5Var : arrayListE1) {
                        ni8 wg7Var = (ni8) qg5Var.X;
                        hi8 hi8Var = (hi8) qg5Var.Y;
                        if (wg7Var.a() != rt8Var) {
                            mo8 mo8VarQ0 = (wg7Var.c() || wg7Var.a() != rt8.IN_VARIANCE) ? null : wg7Var.b().q0();
                            hi8Var.getClass();
                            wg7Var = new wg7(new c45(un0.X, new d45(wg7Var, pl1Var, hi8Var, 6), mo8VarQ0, (ch8) null, false, 56));
                        }
                        arrayList.add(wg7Var);
                    }
                    wi8 wi8Var = new wi8(nh8.b.a(aa7Var.n0(), arrayList));
                    int size = listL0.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ni8 ni8Var = (ni8) listL0.get(i2);
                        ni8 ni8Var2 = (ni8) arrayList.get(i2);
                        if (ni8Var.a() != rt8Var) {
                            List upperBounds = ((hi8) aa7Var.n0().g().get(i2)).getUpperBounds();
                            upperBounds.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(y14Var.L(wi8Var.f((t14) it2.next(), rt8Var).q0()));
                            }
                            if (!ni8Var.c() && ni8Var.a() == rt8.OUT_VARIANCE) {
                                arrayList2.add(y14Var.L(ni8Var.b().q0()));
                            }
                            t14 t14VarB = ni8Var2.b();
                            t14VarB.getClass();
                            d45 d45Var = ((c45) t14VarB).Z;
                            d45Var.getClass();
                            d45Var.Y = new pl1(arrayList2, (byte) 2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return dh3.N(aa7Var.m0(), aa7Var.n0(), arrayList, aa7Var.o0());
        }
        return null;
    }

    public static Boolean r0(Class cls) throws IllegalAccessException, InvocationTargetException {
        Method method = (Method) V().Y;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }

    public static un0 s(fo0 fo0Var) {
        if (fo0Var instanceof c45) {
            return ((c45) fo0Var).Y;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fo0Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, fo0Var.getClass(), sb));
        return null;
    }

    public static aa7 s0(fe2 fe2Var) {
        if (fe2Var instanceof ce2) {
            return ((ce2) fe2Var).Y;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fe2Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, fe2Var.getClass(), sb));
        return null;
    }

    public static final void t(cc1 cc1Var, char c2) {
        cc1Var.getClass();
        cc1Var.a(String.valueOf(c2));
    }

    public static mo8 t0(fo0 fo0Var) {
        if (fo0Var instanceof c45) {
            return ((c45) fo0Var).f0;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fo0Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, fo0Var.getClass(), sb));
        return null;
    }

    public static qk u(qk qkVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) qkVar.Y.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((sk) qkVar.Z).a;
        }
        return new qk(qkVar.X, Float.valueOf(f2), new sk(f3), qkVar.f0, qkVar.g0, qkVar.h0);
    }

    public static mo8 u0(x14 x14Var) {
        if (x14Var instanceof mo8) {
            return jm4.R((mo8) x14Var, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(x14Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, x14Var.getClass(), sb));
        return null;
    }

    public static final wi0 v(String str, String str2, ny nyVar) {
        str.getClass();
        ArrayList arrayListN = i21.N(str);
        if (str2 != null) {
            arrayListN.add(str2);
        }
        return new wi0(arrayListN, nyVar);
    }

    public static final void v0(cc1 cc1Var, String str, gn2 gn2Var) {
        if (!(cc1Var instanceof h1)) {
            bt.i("impossible");
            return;
        }
        h1 h1Var = (h1) cc1Var;
        ci8.i(1, gn2Var);
        ps psVarI = h1Var.i();
        h1 h1VarO = h1Var.o();
        gn2Var.B(h1VarO);
        psVarI.a(new ld5(str, new b11(h1VarO.i().b)));
    }

    public static mo8 w(nt0 nt0Var, zk6 zk6Var, zk6 zk6Var2) {
        zk6Var.getClass();
        zk6Var2.getClass();
        if (!(zk6Var instanceof aa7)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(nt0Var);
            sb.append(", ");
            em7.c(oi0.j(yb6.a, nt0Var.getClass(), sb));
            return null;
        }
        if (zk6Var2 instanceof aa7) {
            return dh3.s((aa7) zk6Var, (aa7) zk6Var2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(nt0Var);
        sb2.append(", ");
        em7.c(oi0.j(yb6.a, nt0Var.getClass(), sb2));
        return null;
    }

    public static int w0(mh8 mh8Var) {
        if (mh8Var instanceof lh8) {
            return ((lh8) mh8Var).g().size();
        }
        StringBuilder sbS = oi0.s("ClassicTypeSystemContext couldn't handle: ", mh8Var, ", ");
        em7.c(oi0.j(yb6.a, mh8Var.getClass(), sbS));
        return 0;
    }

    public static o8 x(int i2, int i3, int i4, int i5) {
        return new o8(ImageReader.newInstance(i2, i3, i4, i5));
    }

    public static Collection x0(nt0 nt0Var, zk6 zk6Var) {
        mh8 mh8VarE = nt0Var.E(zk6Var);
        if (mh8VarE instanceof sf3) {
            return ((sf3) mh8VarE).X;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zk6Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, zk6Var.getClass(), sb));
        return null;
    }

    public static final List y(f88 f88Var, c15 c15Var) {
        if (c15Var != null && c15Var.Z != 0) {
            return wv0.Y0(c15Var.f());
        }
        if (f88Var != null) {
            long j2 = f88Var.a;
            if (!f88.b(j2)) {
                return i21.K(new pl(f88.d(j2), f88.c(j2), new qe7(0L, 0L, (dj2) null, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, x38.c, (t67) null, 61439)));
            }
        }
        return d02.X;
    }

    public static ni8 y0(eo0 eo0Var) {
        if (eo0Var instanceof d45) {
            return ((d45) eo0Var).X;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eo0Var);
        sb.append(", ");
        em7.c(oi0.j(yb6.a, eo0Var.getClass(), sb));
        return null;
    }

    public static final int z(int i2, z64 z64Var, Object obj) {
        int iE;
        return (obj == null || z64Var.c() == 0 || (i2 < z64Var.c() && obj.equals(z64Var.d(i2))) || (iE = z64Var.d.e(obj)) == -1) ? i2 : iE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[Catch: all -> 0x0056, TryCatch #2 {all -> 0x0056, blocks: (B:2:0x0000, B:9:0x001e, B:11:0x0035, B:12:0x0038, B:14:0x003e, B:23:0x0059, B:15:0x0041, B:16:0x0051, B:18:0x0053, B:19:0x0055), top: B:34:0x0000, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[Catch: all -> 0x0056, TryCatch #2 {all -> 0x0056, blocks: (B:2:0x0000, B:9:0x001e, B:11:0x0035, B:12:0x0038, B:14:0x003e, B:23:0x0059, B:15:0x0041, B:16:0x0051, B:18:0x0053, B:19:0x0055), top: B:34:0x0000, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    public static final qg5 z0(InputStream inputStream) {
        az5 az5Var;
        d2 d2Var;
        try {
            ka0 ka0Var = ka0.f;
            ka0 ka0VarN = z91.N(inputStream);
            ka0 ka0Var2 = ka0.f;
            int i2 = ka0VarN.c;
            ka0Var2.getClass();
            int i3 = ka0Var2.c;
            int i4 = ka0VarN.b;
            int i5 = ka0Var2.b;
            if (i4 == 0) {
                if (i5 == 0 && i2 == i3) {
                    r62 r62VarH = hi5.H(z66.X);
                    au3 au3Var = az5.n0;
                    au3Var.getClass();
                    iv0 iv0Var = new iv0(inputStream);
                    d2Var = (d2) au3Var.b(iv0Var, r62VarH);
                    try {
                        iv0Var.a(0);
                        if (d2Var.d()) {
                            rh3 rh3Var = new rh3(new xm8().getMessage());
                            rh3Var.X = d2Var;
                            throw rh3Var;
                        }
                        az5Var = (az5) d2Var;
                    } catch (rh3 e2) {
                        e2.X = d2Var;
                        throw e2;
                    }
                } else {
                    az5Var = null;
                }
            } else if (i4 != i5 || i2 > i3) {
                az5Var = null;
            } else {
                r62 r62VarH2 = hi5.H(z66.X);
                au3 au3Var2 = az5.n0;
                au3Var2.getClass();
                iv0 iv0Var2 = new iv0(inputStream);
                d2Var = (d2) au3Var2.b(iv0Var2, r62VarH2);
                iv0Var2.a(0);
                if (d2Var.d()) {
                    rh3 rh3Var2 = new rh3(new xm8().getMessage());
                    rh3Var2.X = d2Var;
                    throw rh3Var2;
                }
                az5Var = (az5) d2Var;
            }
            qg5 qg5Var = new qg5(az5Var, ka0VarN);
            inputStream.close();
            return qg5Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                oc.h(inputStream, th);
                throw th2;
            }
        }
    }
}
