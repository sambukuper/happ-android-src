package defpackage;

import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class yt7 extends xw8 {
    public final vz7 b = new vz7(new mq7((byte) 9));
    public final vz7 c = new vz7(new mq7((byte) 10));
    public final oh7 d;
    public final h76 e;
    public final u77 f;
    public final f76 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yt7() {
        SubId.Companion.getClass();
        oh7 oh7VarA = ph7.a(new et7(SubId.c(), false, null));
        this.d = oh7VarA;
        this.e = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.f = u77VarB;
        this.g = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final zt7 e() {
        return (zt7) this.b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f(wt7 wt7Var) {
        Object value;
        et7 et7Var;
        qs7 qs7Var;
        Object value2;
        et7 et7Var2;
        Object value3;
        et7 et7Var3;
        Object value4;
        et7 et7Var4;
        Object value5;
        et7 et7Var5;
        Object value6;
        et7 et7Var6;
        Object value7;
        et7 et7Var7;
        qs7 qs7Var2;
        Object value8;
        et7 et7Var8;
        Object value9;
        et7 et7Var9;
        Object value10;
        et7 et7Var10;
        Object value11;
        et7 et7Var11;
        Object value12;
        et7 et7Var12;
        Object value13;
        et7 et7Var13;
        is7 is7Var;
        Object value14;
        et7 et7Var14;
        Object value15;
        boolean z = wt7Var instanceof pt7;
        byte b = 1;
        b = 1;
        oh7 oh7Var = this.d;
        if (z) {
            String str = ((pt7) wt7Var).a;
            qs7 qs7VarA = e().a(str);
            if (qs7VarA == null) {
                qs7VarA = new qs7();
            }
            qs7 qs7Var3 = qs7VarA;
            e().getClass();
            SubscriptionItem subscriptionItemF = kw4.f(str);
            boolean z2 = subscriptionItemF != null && subscriptionItemF.b0();
            oh7Var.getClass();
            do {
                value15 = oh7Var.getValue();
                ((et7) value15).getClass();
            } while (!oh7Var.k(value15, new et7(str, z2, qs7Var3)));
            return;
        }
        boolean z3 = wt7Var instanceof jt7;
        h76 h76Var = this.e;
        byte b2 = 2;
        if (z3) {
            boolean z4 = ((jt7) wt7Var).a;
            qs7 qs7Var4 = ((et7) h76Var.X.getValue()).c;
            if (qs7Var4 != null) {
                qs7 qs7VarA2 = qs7.a(qs7Var4, is7.a(qs7Var4.a, z4, false, 0, 0, false, 30), false, false, (fs7) null, false, false, (ms7) null, 0, (ps7) null, (SubscriptionSortType) null, 1022);
                oh7Var.getClass();
                do {
                    value14 = oh7Var.getValue();
                    et7Var14 = (et7) value14;
                    et7Var14.getClass();
                } while (!oh7Var.k(value14, et7.a(et7Var14, qs7VarA2)));
                e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA2, b2));
            }
            if (!z4) {
                vz7 vz7Var = ev7.a;
                ev7.a(((et7) h76Var.X.getValue()).a);
                return;
            }
            vz7 vz7Var2 = ev7.a;
            qs7 qs7Var5 = ((et7) h76Var.X.getValue()).c;
            if (qs7Var5 != null && (is7Var = qs7Var5.a) != null) {
                b = is7Var.c;
            }
            ev7.b(b, ((et7) h76Var.X.getValue()).a);
            return;
        }
        Integer num = null;
        if (wt7Var instanceof kt7) {
            Integer numB0 = mm7.b0(((kt7) wt7Var).a);
            if (numB0 != null) {
                int iIntValue = numB0.intValue();
                qs7.Companion.getClass();
                kf3 kf3Var = qs7.l;
                int i = ((if3) kf3Var).X;
                if (iIntValue <= ((if3) kf3Var).Y && i <= iIntValue) {
                    num = numB0;
                }
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    qs7 qs7Var6 = ((et7) h76Var.X.getValue()).c;
                    if (qs7Var6 != null) {
                        qs7 qs7VarA3 = qs7.a(qs7Var6, is7.a(qs7Var6.a, false, false, iIntValue2, 0, false, 27), false, false, (fs7) null, false, false, (ms7) null, 0, (ps7) null, (SubscriptionSortType) null, 1022);
                        oh7Var.getClass();
                        do {
                            value13 = oh7Var.getValue();
                            et7Var13 = (et7) value13;
                            et7Var13.getClass();
                        } while (!oh7Var.k(value13, et7.a(et7Var13, qs7VarA3)));
                        e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA3, b2));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (wt7Var instanceof lt7) {
            boolean z5 = ((lt7) wt7Var).a;
            qs7 qs7Var7 = ((et7) h76Var.X.getValue()).c;
            if (qs7Var7 != null) {
                qs7 qs7VarA4 = qs7.a(qs7Var7, is7.a(qs7Var7.a, false, false, 0, 0, z5, 15), false, false, (fs7) null, false, false, (ms7) null, 0, (ps7) null, (SubscriptionSortType) null, 1022);
                oh7Var.getClass();
                do {
                    value12 = oh7Var.getValue();
                    et7Var12 = (et7) value12;
                    et7Var12.getClass();
                } while (!oh7Var.k(value12, et7.a(et7Var12, qs7VarA4)));
                e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA4, b2));
                return;
            }
            return;
        }
        if (wt7Var instanceof ut7) {
            boolean z6 = ((ut7) wt7Var).a;
            qs7 qs7Var8 = ((et7) h76Var.X.getValue()).c;
            if (qs7Var8 != null) {
                qs7 qs7VarA5 = qs7.a(qs7Var8, (is7) null, z6, false, (fs7) null, false, false, (ms7) null, 0, (ps7) null, (SubscriptionSortType) null, 1021);
                oh7Var.getClass();
                do {
                    value11 = oh7Var.getValue();
                    et7Var11 = (et7) value11;
                    et7Var11.getClass();
                } while (!oh7Var.k(value11, et7.a(et7Var11, qs7VarA5)));
                e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA5, b2));
                return;
            }
            return;
        }
        if (wt7Var instanceof qt7) {
            boolean z7 = ((qt7) wt7Var).a;
            qs7 qs7Var9 = ((et7) h76Var.X.getValue()).c;
            if (qs7Var9 != null) {
                qs7 qs7VarA6 = qs7.a(qs7Var9, (is7) null, false, z7, (fs7) null, false, false, (ms7) null, 0, (ps7) null, (SubscriptionSortType) null, 1019);
                oh7Var.getClass();
                do {
                    value10 = oh7Var.getValue();
                    et7Var10 = (et7) value10;
                    et7Var10.getClass();
                } while (!oh7Var.k(value10, et7.a(et7Var10, qs7VarA6)));
                e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA6, b2));
                return;
            }
            return;
        }
        if (wt7Var instanceof ht7) {
            boolean z8 = ((ht7) wt7Var).a;
            qs7 qs7Var10 = ((et7) h76Var.X.getValue()).c;
            if (qs7Var10 != null) {
                qs7 qs7VarA7 = qs7.a(qs7Var10, (is7) null, false, false, fs7.a(qs7Var10.d, z8, (SubscriptionAutoConnectType) null, 2), false, false, (ms7) null, 0, (ps7) null, (SubscriptionSortType) null, 1015);
                oh7Var.getClass();
                do {
                    value9 = oh7Var.getValue();
                    et7Var9 = (et7) value9;
                    et7Var9.getClass();
                } while (!oh7Var.k(value9, et7.a(et7Var9, qs7VarA7)));
                e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA7, b2));
                return;
            }
            return;
        }
        if (wt7Var instanceof it7) {
            SubscriptionAutoConnectType subscriptionAutoConnectType = (SubscriptionAutoConnectType) wv0.u0(((it7) wt7Var).a, SubscriptionAutoConnectType.c());
            if (subscriptionAutoConnectType == null || (qs7Var2 = ((et7) h76Var.X.getValue()).c) == null) {
                return;
            }
            qs7 qs7VarA8 = qs7.a(qs7Var2, (is7) null, false, false, fs7.a(qs7Var2.d, false, subscriptionAutoConnectType, 1), false, false, (ms7) null, 0, (ps7) null, (SubscriptionSortType) null, 1015);
            oh7Var.getClass();
            do {
                value8 = oh7Var.getValue();
                et7Var8 = (et7) value8;
                et7Var8.getClass();
            } while (!oh7Var.k(value8, et7.a(et7Var8, qs7VarA8)));
            e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA8, b2));
            return;
        }
        if (wt7Var instanceof gt7) {
            boolean z9 = ((gt7) wt7Var).a;
            qs7 qs7Var11 = ((et7) h76Var.X.getValue()).c;
            if (qs7Var11 != null) {
                qs7 qs7VarA9 = qs7.a(qs7Var11, (is7) null, false, false, (fs7) null, z9, false, (ms7) null, 0, (ps7) null, (SubscriptionSortType) null, 1007);
                oh7Var.getClass();
                do {
                    value7 = oh7Var.getValue();
                    et7Var7 = (et7) value7;
                    et7Var7.getClass();
                } while (!oh7Var.k(value7, et7.a(et7Var7, qs7VarA9)));
                e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA9, b2));
                return;
            }
            return;
        }
        if (wt7Var instanceof nt7) {
            boolean z10 = ((nt7) wt7Var).a;
            qs7 qs7Var12 = ((et7) h76Var.X.getValue()).c;
            if (qs7Var12 != null) {
                qs7 qs7VarA10 = qs7.a(qs7Var12, (is7) null, false, false, (fs7) null, false, z10, (ms7) null, 0, (ps7) null, (SubscriptionSortType) null, 991);
                oh7Var.getClass();
                do {
                    value6 = oh7Var.getValue();
                    et7Var6 = (et7) value6;
                    et7Var6.getClass();
                } while (!oh7Var.k(value6, et7.a(et7Var6, qs7VarA10)));
                e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA10, b2));
                return;
            }
            return;
        }
        if (wt7Var instanceof st7) {
            boolean z11 = ((st7) wt7Var).a;
            gk7 gk7Var = (gk7) this.c.getValue();
            String str2 = ((et7) h76Var.X.getValue()).a;
            gk7Var.getClass();
            str2.getClass();
            fk7 fk7Var = (fk7) gk7Var.c.getValue();
            fk7Var.getClass();
            qs7 qs7VarB = fk7Var.a.b(str2, new as((byte) 12, z11));
            oh7Var.getClass();
            do {
                value5 = oh7Var.getValue();
                et7Var5 = (et7) value5;
                et7Var5.getClass();
            } while (!oh7Var.k(value5, et7.a(et7Var5, qs7VarB)));
            return;
        }
        if (wt7Var instanceof rt7) {
            int i2 = ((rt7) wt7Var).a;
            qs7 qs7Var13 = ((et7) h76Var.X.getValue()).c;
            if (qs7Var13 != null) {
                qs7 qs7VarA11 = qs7.a(qs7Var13, (is7) null, false, false, (fs7) null, false, false, (ms7) null, i2, (ps7) null, (SubscriptionSortType) null, 895);
                oh7Var.getClass();
                do {
                    value4 = oh7Var.getValue();
                    et7Var4 = (et7) value4;
                    et7Var4.getClass();
                } while (!oh7Var.k(value4, et7.a(et7Var4, qs7VarA11)));
                e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA11, b2));
                return;
            }
            return;
        }
        if (wt7Var instanceof vt7) {
            String str3 = ((vt7) wt7Var).a;
            qs7 qs7Var14 = ((et7) h76Var.X.getValue()).c;
            if (qs7Var14 != null) {
                qs7 qs7VarA12 = qs7.a(qs7Var14, (is7) null, false, false, (fs7) null, false, false, (ms7) null, 0, ps7.a(qs7Var14.i, str3, false, 2), (SubscriptionSortType) null, 767);
                oh7Var.getClass();
                do {
                    value3 = oh7Var.getValue();
                    et7Var3 = (et7) value3;
                    et7Var3.getClass();
                } while (!oh7Var.k(value3, et7.a(et7Var3, qs7VarA12)));
                e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA12, b2));
                return;
            }
            return;
        }
        if (wt7Var instanceof tt7) {
            SubscriptionSortType subscriptionSortType = (SubscriptionSortType) wv0.u0(((tt7) wt7Var).a, SubscriptionSortType.a());
            if (subscriptionSortType == null || (qs7Var = ((et7) h76Var.X.getValue()).c) == null) {
                return;
            }
            qs7 qs7VarA13 = qs7.a(qs7Var, (is7) null, false, false, (fs7) null, false, false, (ms7) null, 0, (ps7) null, subscriptionSortType, 511);
            oh7Var.getClass();
            do {
                value2 = oh7Var.getValue();
                et7Var2 = (et7) value2;
                et7Var2.getClass();
            } while (!oh7Var.k(value2, et7.a(et7Var2, qs7VarA13)));
            e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA13, b2));
            return;
        }
        if (!(wt7Var instanceof ot7)) {
            if (wt7Var instanceof mt7) {
                jm4.Q(zw8.a(this), (u61) null, new ym7(this, num, b), 3);
                return;
            } else {
                b61.c();
                return;
            }
        }
        Integer numB1 = mm7.b0(((ot7) wt7Var).a);
        if (numB1 != null) {
            int iO = x97.o(numB1.intValue(), new kf3(0, 9, 1));
            qs7 qs7Var15 = ((et7) h76Var.X.getValue()).c;
            if (qs7Var15 != null) {
                qs7 qs7VarA14 = qs7.a(qs7Var15, is7.a(qs7Var15.a, false, false, 0, iO, false, 23), false, false, (fs7) null, false, false, (ms7) null, 0, (ps7) null, (SubscriptionSortType) null, 1022);
                oh7Var.getClass();
                do {
                    value = oh7Var.getValue();
                    et7Var = (et7) value;
                    et7Var.getClass();
                } while (!oh7Var.k(value, et7.a(et7Var, qs7VarA14)));
                e().b(((et7) h76Var.X.getValue()).a, new zo6(qs7VarA14, b2));
            }
        }
    }
}
