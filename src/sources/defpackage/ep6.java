package defpackage;

import com.tencent.mmkv.MMKV;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.enums.GeoUserAgent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ep6 extends xw8 {
    public final vz7 b = new vz7(new w76((byte) 12));
    public final vz7 c = new vz7(new w76((byte) 13));
    public final vz7 d = new vz7(new w76((byte) 14));
    public final oh7 e;
    public final h76 f;
    public final u77 g;
    public final f76 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ep6() {
        GeoUserAgent.INSTANCE.getClass();
        GeoUserAgent geoUserAgent = GeoUserAgent.f4default;
        dm5 dm5Var = dm5.f0;
        dm5Var.getClass();
        oh7 oh7VarA = ph7.a(new sn6(geoUserAgent, dm5Var, null, null, jw5.a, op7.X, false, true, xv5.a));
        this.e = oh7VarA;
        this.f = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.g = u77VarB;
        this.h = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static tn6 g(String str) {
        if (dh3.f(str, "")) {
            return new tn6(str, false, null);
        }
        kw4 kw4Var = kw4.a;
        SubscriptionItem subscriptionItemF = kw4.f(str);
        if (subscriptionItemF == null) {
            return null;
        }
        return new tn6(str, kw4.o(str), subscriptionItemF.getRemarks());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final mn6 e() {
        return (mn6) this.b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final j2 f(b83 b83Var) {
        qm5 qm5VarC = ec7.Y.c();
        Iterator it = b83Var.iterator();
        while (it.hasNext()) {
            RouteProfile routeProfile = (RouteProfile) it.next();
            qm5VarC.add(new vo6(routeProfile, e().b(routeProfile.c(), routeProfile.d())));
        }
        return qm5VarC.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        Object value;
        sn6 sn6Var;
        oh7 oh7Var = this.e;
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            sn6Var = (sn6) value;
            sn6Var.getClass();
        } while (!oh7Var.k(value, sn6.a(sn6Var, null, null, null, null, jw5.a, null, false, null, 495)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    public final void i(uo6 uo6Var) {
        Object value;
        sn6 sn6Var;
        Object value2;
        sn6 sn6Var2;
        Object next;
        Object value3;
        sn6 sn6Var3;
        Object next2;
        b83 b83Var;
        vo6 vo6Var;
        b83 b83Var2;
        vo6 vo6Var2;
        Object value4;
        sn6 sn6Var4;
        Object value5;
        sn6 sn6Var5;
        Object value6;
        sn6 sn6Var6;
        Object value7;
        sn6 sn6Var7;
        Object value8;
        sn6 sn6Var8;
        Object value9;
        sn6 sn6Var9;
        GeoUserAgent geoUserAgent;
        Object value10;
        sn6 sn6Var10;
        boolean z = uo6Var instanceof qo6;
        vz7 vz7Var = this.d;
        String str = null;
        oh7 oh7Var = this.e;
        if (z) {
            int iE = ((MMKV) vz7Var.getValue()).e(-1, "pref_geo_custom_ua");
            Integer numValueOf = Integer.valueOf(iE);
            if (iE == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                geoUserAgent = (GeoUserAgent) GeoUserAgent.b().get(numValueOf.intValue());
                if (geoUserAgent == null) {
                    GeoUserAgent.INSTANCE.getClass();
                    geoUserAgent = GeoUserAgent.f4default;
                }
            } else {
                GeoUserAgent.INSTANCE.getClass();
                geoUserAgent = GeoUserAgent.f4default;
            }
            GeoUserAgent geoUserAgent2 = geoUserAgent;
            oh7Var.getClass();
            do {
                value10 = oh7Var.getValue();
                sn6Var10 = (sn6) value10;
                sn6Var10.getClass();
            } while (!oh7Var.k(value10, sn6.a(sn6Var10, geoUserAgent2, null, null, null, null, null, false, null, 510)));
            jm4.Q(zw8.a(this), (u61) null, new wo6(this, null, (byte) 2), 3);
            jm4.Q(zw8.a(this), (u61) null, new wo6(this, null, (byte) 3), 3);
            return;
        }
        if (uo6Var instanceof ro6) {
            int i = ((ro6) uo6Var).a;
            GeoUserAgent geoUserAgent3 = (GeoUserAgent) wv0.u0(i, GeoUserAgent.b());
            if (geoUserAgent3 == null) {
                return;
            }
            oh7Var.getClass();
            do {
                value9 = oh7Var.getValue();
                sn6Var9 = (sn6) value9;
                sn6Var9.getClass();
            } while (!oh7Var.k(value9, sn6.a(sn6Var9, geoUserAgent3, null, null, null, null, null, false, null, 510)));
            ((MMKV) vz7Var.getValue()).l(i, "pref_geo_custom_ua");
            jm4.Q(zw8.a(this), (u61) null, new wo6(this, null, (byte) 4), 3);
            return;
        }
        if (uo6Var instanceof ho6) {
            jm4.Q(zw8.a(this), (u61) null, new wo6(this, null, (byte) 0), 3);
            return;
        }
        if (uo6Var instanceof po6) {
            jm4.Q(zw8.a(this), (u61) null, new wo6(this, null, (byte) 1), 3);
            return;
        }
        if (uo6Var instanceof lo6) {
            jm4.Q(zw8.a(this), (u61) null, new jy2(this, ((lo6) uo6Var).a, (q51) null, (byte) 25), 3);
            return;
        }
        if (uo6Var instanceof no6) {
            String str2 = ((no6) uo6Var).a;
            oh7Var.getClass();
            do {
                value8 = oh7Var.getValue();
                sn6Var8 = (sn6) value8;
                sn6Var8.getClass();
            } while (!oh7Var.k(value8, sn6.a(sn6Var8, null, null, str2, null, null, null, false, null, 507)));
            return;
        }
        if (uo6Var instanceof ko6) {
            ko6 ko6Var = (ko6) uo6Var;
            String str3 = ko6Var.a;
            String str4 = ko6Var.b;
            oh7Var.getClass();
            do {
                value7 = oh7Var.getValue();
                sn6Var7 = (sn6) value7;
                sn6Var7.getClass();
            } while (!oh7Var.k(value7, sn6.a(sn6Var7, null, null, null, null, null, null, false, new zv5(str4, str3), 251)));
            return;
        }
        if (uo6Var instanceof so6) {
            so6 so6Var = (so6) uo6Var;
            jm4.Q(zw8.a(this), (u61) null, new cp6(e().h(so6Var.a, so6Var.b), this, null), 3);
            oh7Var.getClass();
            do {
                value6 = oh7Var.getValue();
                sn6Var6 = (sn6) value6;
                sn6Var6.getClass();
            } while (!oh7Var.k(value6, sn6.a(sn6Var6, null, null, null, null, null, null, false, null, 507)));
            return;
        }
        if (uo6Var instanceof mo6) {
            oh7Var.getClass();
            do {
                value5 = oh7Var.getValue();
                sn6Var5 = (sn6) value5;
                sn6Var5.getClass();
            } while (!oh7Var.k(value5, sn6.a(sn6Var5, null, null, null, null, null, op7.X, false, null, 479)));
            return;
        }
        if (uo6Var instanceof go6) {
            String str5 = ((go6) uo6Var).a;
            oh7Var.getClass();
            do {
                value4 = oh7Var.getValue();
                sn6Var4 = (sn6) value4;
                sn6Var4.getClass();
            } while (!oh7Var.k(value4, sn6.a(sn6Var4, null, null, null, null, new kw5(str5), null, false, null, 495)));
            return;
        }
        if (uo6Var instanceof oo6) {
            String str6 = ((oo6) uo6Var).a;
            ss8 ss8Var = ss8.a;
            HappApplication happApplication = HappApplication.M0;
            jm4.Q(zw8.a(this), (u61) null, new yo6(this, ss8.g(k32.i()), str6, null), 3);
            return;
        }
        if (uo6Var instanceof fo6) {
            h();
            return;
        }
        if (uo6Var instanceof io6) {
            io6 io6Var = (io6) uo6Var;
            jm4.Q(zw8.a(this), (u61) null, new xo6(this, io6Var.a, io6Var.b, null), 3);
            return;
        }
        if (uo6Var instanceof to6) {
            j(false);
            return;
        }
        boolean z2 = uo6Var instanceof jo6;
        xv5 xv5Var = xv5.a;
        if (!z2) {
            if (uo6Var instanceof eo6) {
                oh7Var.getClass();
                do {
                    value2 = oh7Var.getValue();
                    sn6Var2 = (sn6) value2;
                    sn6Var2.getClass();
                } while (!oh7Var.k(value2, sn6.a(sn6Var2, null, null, null, null, null, null, false, xv5Var, 255)));
                return;
            }
            if (!(uo6Var instanceof do6)) {
                b61.c();
                return;
            }
            oh7Var.getClass();
            do {
                value = oh7Var.getValue();
                sn6Var = (sn6) value;
                sn6Var.getClass();
            } while (!oh7Var.k(value, sn6.a(sn6Var, null, null, null, null, null, null, false, null, 503)));
            return;
        }
        jo6 jo6Var = (jo6) uo6Var;
        String str7 = jo6Var.a;
        String str8 = jo6Var.b;
        List listY0 = wv0.Y0(((sn6) this.f.X.getValue()).b.a());
        rw1 it = wv0.d1(listY0).iterator();
        do {
            rw1 rw1Var = it;
            if (!rw1Var.Y.hasNext()) {
                next = null;
                break;
            }
            next = rw1Var.next();
        } while (!dh3.f(((tn6) ((Map.Entry) ((pb3) next).b).getKey()).a, str7));
        pb3 pb3Var = (pb3) next;
        Integer numValueOf2 = pb3Var != null ? Integer.valueOf(pb3Var.a) : null;
        if (numValueOf2 != null) {
            int iIntValue = numValueOf2.intValue();
            b83 b83Var3 = (b83) ((Map.Entry) listY0.get(iIntValue)).getValue();
            rw1 it2 = wv0.d1(b83Var3).iterator();
            do {
                rw1 rw1Var2 = it2;
                if (!rw1Var2.Y.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = rw1Var2.next();
            } while (!dh3.f(((vo6) ((pb3) next2).b).c, str8));
            pb3 pb3Var2 = (pb3) next2;
            Integer numValueOf3 = pb3Var2 != null ? Integer.valueOf(pb3Var2.a) : null;
            if (numValueOf3 != null) {
                int iIntValue2 = numValueOf3.intValue();
                vo6 vo6Var3 = (vo6) wv0.u0(iIntValue2 + 1, b83Var3);
                if (vo6Var3 == null) {
                    vo6Var3 = (vo6) wv0.u0(iIntValue2 - 1, b83Var3);
                }
                if (vo6Var3 != null) {
                    str = vo6Var3.c;
                } else {
                    Map.Entry entry = (Map.Entry) wv0.u0(iIntValue + 1, listY0);
                    if (entry == null || (b83Var2 = (b83) entry.getValue()) == null || (vo6Var2 = (vo6) wv0.t0(b83Var2)) == null) {
                        Map.Entry entry2 = (Map.Entry) wv0.u0(iIntValue - 1, listY0);
                        if (entry2 != null && (b83Var = (b83) entry2.getValue()) != null && (vo6Var = (vo6) wv0.B0(b83Var)) != null) {
                            str = vo6Var.c;
                        }
                    } else {
                        str = vo6Var2.c;
                    }
                }
            }
        }
        String str9 = str;
        e().y(str8, str7);
        oh7Var.getClass();
        do {
            value3 = oh7Var.getValue();
            sn6Var3 = (sn6) value3;
            sn6Var3.getClass();
        } while (!oh7Var.k(value3, sn6.a(sn6Var3, null, null, null, str9, null, null, false, xv5Var, 243)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(boolean z) {
        oh7 oh7Var = this.e;
        oh7Var.getClass();
        while (true) {
            Object value = oh7Var.getValue();
            sn6 sn6Var = (sn6) value;
            sn6Var.getClass();
            boolean z2 = z;
            if (oh7Var.k(value, sn6.a(sn6Var, null, null, null, null, null, null, z2, null, 447))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object k(co6 co6Var, uy7 uy7Var) {
        Object objL = this.g.l(co6Var, uy7Var);
        return objL == c71.X ? objL : dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void l(s51 s51Var) {
        dp6 dp6Var;
        if (s51Var instanceof dp6) {
            dp6Var = (dp6) s51Var;
            int i = dp6Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                dp6Var.h0 = i - Integer.MIN_VALUE;
            } else {
                dp6Var = new dp6(this, s51Var);
            }
        } else {
            dp6Var = new dp6(this, s51Var);
        }
        Object obj = dp6Var.f0;
        int i2 = dp6Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            f76 f76Var = ((ig8) this.c.getValue()).e;
            wo6 wo6Var = new wo6(this, null, (byte) 5);
            dp6Var.h0 = 1;
            if (z91.n(f76Var, wo6Var, dp6Var) == c71.X) {
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
