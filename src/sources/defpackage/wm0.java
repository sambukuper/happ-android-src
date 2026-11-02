package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wm0 implements rn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ int Y;
    public final /* synthetic */ gn2 Z;
    public final /* synthetic */ kx4 f0;

    public /* synthetic */ wm0(int i, gn2 gn2Var, kx4 kx4Var) {
        this.Y = i;
        this.Z = gn2Var;
        this.f0 = kx4Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        kx4 kx4Var = this.f0;
        gn2 gn2Var = this.Z;
        int i = this.Y;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                yn0.b(w79.P(i | 1), gn2Var, (lp2) obj, kx4Var);
                break;
            default:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    final float f = i;
                    String strJ0 = vj8.j0(y46.sub_properties_request_timeout_min, lp2Var);
                    String strJ1 = vj8.j0(y46.sub_properties_request_timeout_max, lp2Var);
                    uu0 uu0Var = new uu0(5.0f, 15.0f);
                    boolean zF = lp2Var.f(gn2Var);
                    Object objK = lp2Var.K();
                    be beVar = zz0.a;
                    if (zF || objK == beVar) {
                        objK = new pr2(gn2Var, (byte) 21);
                        lp2Var.g0(objK);
                    }
                    gn2 gn2Var2 = (gn2) objK;
                    gn2Var2.getClass();
                    strJ0.getClass();
                    strJ1.getClass();
                    Object objK2 = lp2Var.K();
                    if (objK2 == beVar) {
                        objK2 = new xz4();
                        lp2Var.g0(objK2);
                    }
                    final xz4 xz4Var = (xz4) objK2;
                    n50 n50Var = pz2.q0;
                    tw0 tw0VarA = rw0.a(ht.c, n50Var, lp2Var, 0);
                    int iHashCode = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    dx0 dx0Var = pz2.B0;
                    pn7.m(dx0Var, lp2Var, tw0VarA);
                    dx0 dx0Var2 = pz2.A0;
                    pn7.m(dx0Var2, lp2Var, kl5VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    dx0 dx0Var3 = pz2.C0;
                    pn7.m(dx0Var3, lp2Var, numValueOf);
                    pn7.l(lp2Var);
                    dx0 dx0Var4 = pz2.z0;
                    pn7.m(dx0Var4, lp2Var, kx4VarQ);
                    FillElement fillElement = b.a;
                    kx4 kx4VarW = os4.w(fillElement, ((gr) lp2Var.j(hr.a)).a.b);
                    Object objK3 = lp2Var.K();
                    if (objK3 == beVar) {
                        objK3 = new ya2((byte) 16);
                        lp2Var.g0(objK3);
                    }
                    final gn2 gn2Var3 = (gn2) objK3;
                    Object objK4 = lp2Var.K();
                    if (objK4 == beVar) {
                        objK4 = z51.H(Boolean.FALSE);
                        lp2Var.g0(objK4);
                    }
                    y05 y05Var = (y05) objK4;
                    boolean zF2 = lp2Var.f(xz4Var);
                    Object objK5 = lp2Var.K();
                    q51 q51Var = null;
                    if (zF2 || objK5 == beVar) {
                        objK5 = new tt1(xz4Var, y05Var, q51Var, (byte) 1);
                        lp2Var.g0(objK5);
                    }
                    u70.h((rn2) objK5, lp2Var, xz4Var);
                    Object objK6 = lp2Var.K();
                    if (objK6 == beVar) {
                        objK6 = z51.H(Boolean.FALSE);
                        lp2Var.g0(objK6);
                    }
                    y05 y05Var2 = (y05) objK6;
                    boolean zF3 = lp2Var.f(xz4Var);
                    Object objK7 = lp2Var.K();
                    if (zF3 || objK7 == beVar) {
                        objK7 = new tt1(xz4Var, y05Var2, null, (byte) 3);
                        lp2Var.g0(objK7);
                    }
                    u70.h((rn2) objK7, lp2Var, xz4Var);
                    boolean z = ((Boolean) y05Var.getValue()).booleanValue() || ((Boolean) y05Var2.getValue()).booleanValue();
                    eh2 eh2Var = (eh2) lp2Var.j(y01.i);
                    pb7 pb7Var = pb7.a;
                    long j = ys0.y(lp2Var).o.a;
                    long j2 = ys0.y(lp2Var).o.b;
                    long j3 = ys0.y(lp2Var).o.c;
                    long j4 = ys0.y(lp2Var).o.d;
                    long j5 = ys0.y(lp2Var).o.e;
                    long j6 = ys0.y(lp2Var).o.f;
                    long j7 = ys0.y(lp2Var).o.g;
                    long j8 = ys0.y(lp2Var).o.h;
                    long j9 = ys0.y(lp2Var).o.i;
                    long j10 = ys0.y(lp2Var).o.j;
                    jb7 jb7VarE = pb7.e((iw0) lp2Var.j(kw0.a));
                    final jb7 jb7Var = new jb7(j != 16 ? j : jb7VarE.a, j2 != 16 ? j2 : jb7VarE.b, j4 != 16 ? j4 : jb7VarE.c, j3 != 16 ? j3 : jb7VarE.d, j5 != 16 ? j5 : jb7VarE.e, j6 != 16 ? j6 : jb7VarE.f, j7 != 16 ? j7 : jb7VarE.g, j9 != 16 ? j9 : jb7VarE.h, j8 != 16 ? j8 : jb7VarE.i, j10 != 16 ? j10 : jb7VarE.j);
                    tw0 tw0VarA2 = rw0.a(new ft(4.0f, new bt()), n50Var, lp2Var, 6);
                    int iHashCode2 = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL2 = lp2Var.l();
                    kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarW);
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(dx0Var, lp2Var, tw0VarA2);
                    pn7.m(dx0Var2, lp2Var, kl5VarL2);
                    oi0.u(iHashCode2, lp2Var, dx0Var3, lp2Var);
                    pn7.m(dx0Var4, lp2Var, kx4VarQ2);
                    boolean zH = lp2Var.h(eh2Var);
                    Object objK8 = lp2Var.K();
                    if (zH || objK8 == beVar) {
                        objK8 = new f0(eh2Var, (byte) 15);
                        lp2Var.g0(objK8);
                    }
                    final boolean z2 = z;
                    vb7.a(f, gn2Var2, mb6.T(fillElement, (gn2) objK8), jb7Var, xz4Var, 9, jm4.U(-861778246, new sn2() { // from class: xx2
                        @Override // defpackage.sn2
                        public final Object x(Object obj3, Object obj4, Object obj5) {
                            lp2 lp2Var2 = (lp2) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ((wb7) obj3).getClass();
                            if (lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                xr4 xr4VarC = g80.c(pz2.i0, false);
                                int iHashCode3 = Long.hashCode(lp2Var2.T);
                                kl5 kl5VarL3 = lp2Var2.l();
                                hx4 hx4Var = hx4.X;
                                kx4 kx4VarQ3 = w45.Q(lp2Var2, hx4Var);
                                uz0.j.getClass();
                                lp2Var2.Z();
                                if (lp2Var2.S) {
                                    lp2Var2.k();
                                } else {
                                    lp2Var2.j0();
                                }
                                pn7.m(pz2.B0, lp2Var2, xr4VarC);
                                pn7.m(pz2.A0, lp2Var2, kl5VarL3);
                                pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode3));
                                pn7.l(lp2Var2);
                                pn7.m(pz2.z0, lp2Var2, kx4VarQ3);
                                pb7.a.a(xz4Var, null, jb7Var, 0L, lp2Var2, 196608);
                                String str = (String) gn2Var3.B(Float.valueOf(f));
                                Object objK9 = lp2Var2.K();
                                if (objK9 == zz0.a) {
                                    objK9 = new l4((byte) 16);
                                    lp2Var2.g0(objK9);
                                }
                                u70.r(str, z2, z68.q0(hx4Var, (sn2) objK9), lp2Var2, 0);
                                lp2Var2.p(true);
                            } else {
                                lp2Var2.Q();
                            }
                            return dn8.a;
                        }
                    }, lp2Var), null, uu0Var, lp2Var, 100663296, 0);
                    wq6 wq6VarA = vq6.a(km4.d, pz2.o0, lp2Var, 54);
                    int iHashCode3 = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL3 = lp2Var.l();
                    kx4 kx4VarQ3 = w45.Q(lp2Var, fillElement);
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(dx0Var, lp2Var, wq6VarA);
                    pn7.m(dx0Var2, lp2Var, kl5VarL3);
                    oi0.u(iHashCode3, lp2Var, dx0Var3, lp2Var);
                    pn7.m(dx0Var4, lp2Var, kx4VarQ3);
                    o88 o88VarA = o88.a(ys0.D(lp2Var).c, ys0.y(lp2Var).c.a, 0L, null, null, 0L, 0L, null, 16777214);
                    zc1.g(strJ0, null, o88VarA, 0, 0, 0, 0, false, null, lp2Var, 0, 506);
                    zc1.g(strJ1, null, o88VarA, 0, 0, 0, 0, false, null, lp2Var, 0, 506);
                    lp2Var.p(true);
                    lp2Var.p(true);
                    lp2Var.W(-595699652);
                    lp2Var.p(false);
                    lp2Var.p(true);
                }
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ wm0(kx4 kx4Var, gn2 gn2Var, int i) {
        this.f0 = kx4Var;
        this.Z = gn2Var;
        this.Y = i;
    }
}
