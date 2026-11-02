package defpackage;

import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.routing.entity.RouteProfileId;
import su.happ.proxyutility.domain.routing.entity.SubRoutingState;
import su.happ.proxyutility.domain.sub.SubId;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class np7 extends xw8 {
    public final vz7 b = new vz7(new r47((byte) 28));
    public final vz7 c = new vz7(new r47((byte) 29));
    public final fn6 d = new fn6(this, (byte) 2);
    public final oh7 e;
    public final h76 f;
    public final u77 g;
    public final f76 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public np7() {
        SubId.Companion.getClass();
        oh7 oh7VarA = ph7.a(new qn7(SubId.c(), null, false, false, false, null, null, false, true, null, null, false, false, false, wv5.a));
        this.e = oh7VarA;
        this.f = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.g = u77VarB;
        this.h = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final j2 e(String str) {
        mn6 mn6VarF = f();
        mn6VarF.getClass();
        str.getClass();
        b83<RouteProfile> b83VarO = mn6VarF.o(str);
        ArrayList<qg5> arrayList = new ArrayList(xv0.Z(b83VarO, 10));
        for (RouteProfile routeProfile : b83VarO) {
            arrayList.add(new qg5(routeProfile, Boolean.valueOf(mn6VarF.b(routeProfile.c(), str))));
        }
        qm5 qm5VarC = ec7.Y.c();
        for (qg5 qg5Var : arrayList) {
            qm5VarC.add(new um6((RouteProfile) qg5Var.X, ((Boolean) qg5Var.Y).booleanValue()));
        }
        return qm5VarC.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final mn6 f() {
        return (mn6) this.b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:131:0x03de  */
    public final void g(ap7 ap7Var) {
        Object value;
        qn7 qn7Var;
        Object next;
        String str;
        String str2;
        Object value2;
        qn7 qn7Var2;
        Object value3;
        qn7 qn7Var3;
        Object value4;
        qn7 qn7Var4;
        Object value5;
        qn7 qn7Var5;
        Object value6;
        qn7 qn7Var6;
        Object value7;
        qn7 qn7Var7;
        Object value8;
        qn7 qn7Var8;
        Object value9;
        qn7 qn7Var9;
        b83 b83Var;
        Object value10;
        qn7 qn7Var10;
        q51 q51Var = null;
        if (ap7Var instanceof po7) {
            jm4.Q(zw8.a(this), (u61) null, new hp7(this, ((po7) ap7Var).a, null), 3);
            jm4.Q(zw8.a(this), (u61) null, new bp7(this, null, (byte) 2), 3);
            return;
        }
        if (ap7Var instanceof jo7) {
            jm4.Q(zw8.a(this), (u61) null, new bp7(this, null, (byte) 0), 3);
            return;
        }
        boolean z = ap7Var instanceof ko7;
        oh7 oh7Var = this.e;
        if (z) {
            oh7Var.getClass();
            do {
                value10 = oh7Var.getValue();
                qn7Var10 = (qn7) value10;
                qn7Var10.getClass();
            } while (!oh7Var.k(value10, qn7.a(qn7Var10, null, null, false, false, false, null, null, false, null, null, true, false, false, null, 30719)));
            return;
        }
        boolean z2 = ap7Var instanceof mo7;
        h76 h76Var = this.f;
        if (z2) {
            String strP = f().p(((qn7) h76Var.X.getValue()).a, true);
            if (strP != null) {
                g(new vo7(strP));
                return;
            }
            return;
        }
        if (ap7Var instanceof oo7) {
            ss8 ss8Var = ss8.a;
            HappApplication happApplication = HappApplication.M0;
            jm4.Q(zw8.a(this), (u61) null, new dp7(this, ss8.g(k32.i()), null), 3);
            return;
        }
        if (ap7Var instanceof wo7) {
            boolean z3 = ((wo7) ap7Var).a && (b83Var = ((qn7) h76Var.X.getValue()).f) != null && (b83Var.isEmpty() ^ true);
            b83 b83Var2 = ((qn7) h76Var.X.getValue()).f;
            if (b83Var2 == null || !(!b83Var2.isEmpty())) {
                jm4.Q(zw8.a(this), (u61) null, new bp7(this, null, (byte) 4), 3);
            }
            f().F(((qn7) h76Var.X.getValue()).a, z3);
            oh7Var.getClass();
            do {
                value9 = oh7Var.getValue();
                qn7Var9 = (qn7) value9;
                qn7Var9.getClass();
            } while (!oh7Var.k(value9, qn7.a(qn7Var9, null, null, false, z3, false, null, null, false, null, null, false, false, false, null, 32759)));
            jm4.Q(zw8.a(this), (u61) null, new bp7(this, null, (byte) 5), 3);
            return;
        }
        if (ap7Var instanceof xo7) {
            boolean z4 = ((xo7) ap7Var).a;
            mn6 mn6VarF = f();
            String str3 = ((qn7) h76Var.X.getValue()).a;
            mn6VarF.getClass();
            str3.getClass();
            SubRoutingState subRoutingStateQ = mn6VarF.q(str3);
            if (subRoutingStateQ == null) {
                subRoutingStateQ = new SubRoutingState(false, false);
            }
            MMKV mmkv = mn6VarF.b;
            if (fm7.o0(str3)) {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "Server-List";
            }
            mmkv.o(str3, SubRoutingState.c(subRoutingStateQ, false, z4, 1));
            oh7Var.getClass();
            do {
                value8 = oh7Var.getValue();
                qn7Var8 = (qn7) value8;
                qn7Var8.getClass();
            } while (!oh7Var.k(value8, qn7.a(qn7Var8, null, null, false, false, z4, null, null, false, null, null, false, false, false, null, 32751)));
            jm4.Q(zw8.a(this), (u61) null, new bp7(this, null, (byte) 6), 3);
            return;
        }
        if (ap7Var instanceof uo7) {
            f().B(((uo7) ap7Var).a, ((qn7) h76Var.X.getValue()).a);
            h();
            jm4.Q(zw8.a(this), (u61) null, new bp7(this, null, (byte) 3), 3);
            return;
        }
        if (ap7Var instanceof so7) {
            jm4.Q(zw8.a(this), (u61) null, new t17(this, ((so7) ap7Var).a, q51Var, (byte) 10), 3);
            return;
        }
        if (ap7Var instanceof ro7) {
            String str4 = ((ro7) ap7Var).a;
            oh7Var.getClass();
            do {
                value7 = oh7Var.getValue();
                qn7Var7 = (qn7) value7;
                qn7Var7.getClass();
                str4.getClass();
            } while (!oh7Var.k(value7, qn7.a(qn7Var7, null, null, false, false, false, null, null, false, null, null, false, false, false, new yv5(str4), 15871)));
            return;
        }
        if (ap7Var instanceof to7) {
            String str5 = ((to7) ap7Var).a;
            oh7Var.getClass();
            while (true) {
                Object value11 = oh7Var.getValue();
                qn7 qn7Var11 = (qn7) value11;
                qn7Var11.getClass();
                String str6 = str5;
                if (oh7Var.k(value11, qn7.a(qn7Var11, null, null, false, false, false, null, null, false, str6, null, false, false, false, null, 32255))) {
                    return;
                } else {
                    str5 = str6;
                }
            }
        } else {
            if (ap7Var instanceof vo7) {
                jm4.Q(zw8.a(this), (u61) null, new jp7(f().h(((qn7) h76Var.X.getValue()).a, ((vo7) ap7Var).a), this, null), 3);
                oh7Var.getClass();
                do {
                    value6 = oh7Var.getValue();
                    qn7Var6 = (qn7) value6;
                    qn7Var6.getClass();
                } while (!oh7Var.k(value6, qn7.a(qn7Var6, null, null, false, false, false, null, null, false, null, null, false, false, false, null, 32255)));
                return;
            }
            if (ap7Var instanceof ho7) {
                oh7Var.getClass();
                do {
                    value5 = oh7Var.getValue();
                    qn7Var5 = (qn7) value5;
                    qn7Var5.getClass();
                } while (!oh7Var.k(value5, qn7.a(qn7Var5, null, null, false, false, false, null, null, false, null, null, false, false, false, null, 30719)));
                return;
            }
            if (ap7Var instanceof lo7) {
                jm4.Q(zw8.a(this), (u61) null, new cp7(this, ((lo7) ap7Var).a, null), 3);
                return;
            }
            if (ap7Var instanceof no7) {
                jm4.Q(zw8.a(this), (u61) null, new bp7(this, null, (byte) 1), 3);
                return;
            }
            if (ap7Var instanceof io7) {
                oh7Var.getClass();
                do {
                    value4 = oh7Var.getValue();
                    qn7Var4 = (qn7) value4;
                    qn7Var4.getClass();
                } while (!oh7Var.k(value4, qn7.a(qn7Var4, null, null, false, false, false, null, null, false, null, null, false, false, false, null, 28671)));
                return;
            }
            if (ap7Var instanceof zo7) {
                h();
                return;
            }
            if (!(ap7Var instanceof yo7)) {
                boolean z5 = ap7Var instanceof go7;
                wv5 wv5Var = wv5.a;
                if (z5) {
                    oh7Var.getClass();
                    do {
                        value3 = oh7Var.getValue();
                        qn7Var3 = (qn7) value3;
                        qn7Var3.getClass();
                    } while (!oh7Var.k(value3, qn7.a(qn7Var3, null, null, false, false, false, null, null, false, null, null, false, false, false, wv5Var, 16383)));
                    return;
                }
                if (!(ap7Var instanceof qo7)) {
                    if (!(ap7Var instanceof fo7)) {
                        b61.c();
                        return;
                    }
                    oh7Var.getClass();
                    do {
                        value = oh7Var.getValue();
                        qn7Var = (qn7) value;
                        qn7Var.getClass();
                    } while (!oh7Var.k(value, qn7.a(qn7Var, null, null, false, false, false, null, null, false, null, null, false, false, false, null, 31743)));
                    return;
                }
                String str7 = ((qo7) ap7Var).a;
                b83 b83Var3 = ((qn7) h76Var.X.getValue()).f;
                if (b83Var3 == null) {
                    str2 = null;
                } else {
                    rw1 it = wv0.d1(b83Var3).iterator();
                    do {
                        rw1 rw1Var = it;
                        if (!rw1Var.Y.hasNext()) {
                            next = null;
                            break;
                        }
                        next = rw1Var.next();
                    } while (!dh3.f(((um6) ((pb3) next).b).c, str7));
                    pb3 pb3Var = (pb3) next;
                    Integer numValueOf = pb3Var != null ? Integer.valueOf(pb3Var.a) : null;
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        um6 um6Var = (um6) wv0.u0(iIntValue + 1, b83Var3);
                        if (um6Var != null) {
                            str = um6Var.c;
                        } else {
                            um6 um6Var2 = (um6) wv0.u0(iIntValue - 1, b83Var3);
                            if (um6Var2 != null) {
                                str = um6Var2.c;
                            } else {
                                str2 = null;
                            }
                        }
                        str2 = str;
                    } else {
                        str2 = null;
                    }
                }
                f().y(str7, ((qn7) h76Var.X.getValue()).a);
                oh7Var.getClass();
                do {
                    value2 = oh7Var.getValue();
                    qn7Var2 = (qn7) value2;
                    qn7Var2.getClass();
                } while (!oh7Var.k(value2, qn7.a(qn7Var2, null, null, false, false, false, null, null, false, null, str2, false, false, false, wv5Var, 14847)));
                jm4.Q(zw8.a(this), (u61) null, new ip7(this, null, (byte) 0), 3);
                return;
            }
            boolean z6 = ((yo7) ap7Var).a;
            oh7Var.getClass();
            while (true) {
                Object value12 = oh7Var.getValue();
                qn7 qn7Var12 = (qn7) value12;
                qn7Var12.getClass();
                boolean z7 = z6;
                if (oh7Var.k(value12, qn7.a(qn7Var12, null, null, false, false, false, null, null, false, null, null, false, false, z7, null, 24575))) {
                    return;
                } else {
                    z6 = z7;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        jm4.Q(zw8.a(this), (u61) null, new ip7(this, null, (byte) 1), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object i(co7 co7Var, uy7 uy7Var) {
        Object objL = this.g.l(co7Var, uy7Var);
        return objL == c71.X ? objL : dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object j(b71 b71Var, s51 s51Var) {
        kp7 kp7Var;
        xg1 xg1VarJ;
        yg1 yg1Var;
        xg1 xg1Var;
        b83 b83Var;
        SubRoutingState subRoutingState;
        int i;
        Object objJ0;
        b83 b83Var2;
        int i2;
        String strC;
        boolean z;
        oh7 oh7Var;
        Object value;
        qn7 qn7Var;
        if (s51Var instanceof kp7) {
            kp7Var = (kp7) s51Var;
            int i3 = kp7Var.l0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kp7Var.l0 = i3 - Integer.MIN_VALUE;
            } else {
                kp7Var = new kp7(this, s51Var);
            }
        } else {
            kp7Var = new kp7(this, s51Var);
        }
        Object objH = kp7Var.j0;
        int i4 = kp7Var.l0;
        c71 c71Var = c71.X;
        if (i4 == 0) {
            w39.n0(objH);
            nf1 nf1Var = tp1.a;
            ye1 ye1Var = ye1.Z;
            yg1 yg1VarJ = w51.j(b71Var, ye1Var, new lp7(this, null, (byte) 1), 2);
            yg1 yg1VarJ2 = w51.j(b71Var, ye1Var, new lp7(this, null, (byte) 0), 2);
            xg1VarJ = w51.j(b71Var, ye1Var, new lp7(this, null, (byte) 2), 2);
            kp7Var.f0 = yg1VarJ2;
            kp7Var.g0 = xg1VarJ;
            kp7Var.l0 = 1;
            objH = yg1VarJ.h(kp7Var);
            if (objH != c71Var) {
                yg1Var = yg1VarJ2;
            }
            return c71Var;
        }
        if (i4 == 1) {
            xg1VarJ = kp7Var.g0;
            yg1Var = kp7Var.f0;
            w39.n0(objH);
        } else {
            if (i4 == 2) {
                b83Var = kp7Var.h0;
                xg1Var = kp7Var.g0;
                w39.n0(objH);
                subRoutingState = (SubRoutingState) objH;
                if (subRoutingState == null && subRoutingState.d()) {
                    i = 1;
                } else {
                    i = 0;
                }
                kp7Var.f0 = null;
                kp7Var.g0 = null;
                kp7Var.h0 = b83Var;
                kp7Var.i0 = i;
                kp7Var.l0 = 3;
                objJ0 = xg1Var.J0(kp7Var);
                if (objJ0 != c71Var) {
                    b83Var2 = b83Var;
                    i2 = i;
                    objH = objJ0;
                }
                return c71Var;
            }
            if (i4 != 3) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = kp7Var.i0;
            b83 b83Var3 = kp7Var.h0;
            w39.n0(objH);
            b83Var2 = b83Var3;
        }
        RouteProfileId routeProfileId = (RouteProfileId) objH;
        strC = routeProfileId != null ? routeProfileId.c() : null;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        oh7Var = this.e;
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            qn7Var = (qn7) value;
            qn7Var.getClass();
        } while (!oh7Var.k(value, qn7.a(qn7Var, null, null, false, z, false, b83Var2, strC, false, null, null, false, false, false, null, 32663)));
        return dn8.a;
        b83 b83Var4 = (j2) objH;
        kp7Var.f0 = null;
        kp7Var.g0 = xg1VarJ;
        kp7Var.h0 = b83Var4;
        kp7Var.l0 = 2;
        Object objJ1 = yg1Var.J0(kp7Var);
        if (objJ1 != c71Var) {
            xg1Var = xg1VarJ;
            b83Var = b83Var4;
            objH = objJ1;
            subRoutingState = (SubRoutingState) objH;
            if (subRoutingState == null) {
                i = 0;
            } else {
                i = 0;
            }
            kp7Var.f0 = null;
            kp7Var.g0 = null;
            kp7Var.h0 = b83Var;
            kp7Var.i0 = i;
            kp7Var.l0 = 3;
            objJ0 = xg1Var.J0(kp7Var);
            if (objJ0 != c71Var) {
                b83Var2 = b83Var;
                i2 = i;
                objH = objJ0;
                RouteProfileId routeProfileId2 = (RouteProfileId) objH;
                strC = routeProfileId2 != null ? routeProfileId2.c() : null;
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                oh7Var = this.e;
                oh7Var.getClass();
                do {
                    value = oh7Var.getValue();
                    qn7Var = (qn7) value;
                    qn7Var.getClass();
                } while (!oh7Var.k(value, qn7.a(qn7Var, null, null, false, z, false, b83Var2, strC, false, null, null, false, false, false, null, 32663)));
                return dn8.a;
            }
        }
        return c71Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void k(s51 s51Var) {
        mp7 mp7Var;
        if (s51Var instanceof mp7) {
            mp7Var = (mp7) s51Var;
            int i = mp7Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                mp7Var.h0 = i - Integer.MIN_VALUE;
            } else {
                mp7Var = new mp7(this, s51Var);
            }
        } else {
            mp7Var = new mp7(this, s51Var);
        }
        Object obj = mp7Var.f0;
        int i2 = mp7Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            f76 f76Var = ((ig8) this.c.getValue()).e;
            bp7 bp7Var = new bp7(this, null, (byte) 7);
            mp7Var.h0 = 1;
            if (z91.n(f76Var, bp7Var, mp7Var) == c71.X) {
                return;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w39.n0(obj);
        }
        bt.i("SharedFlow never completes, this call should never return.");
    }
}
