package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class no5 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ kx4 Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    public /* synthetic */ no5(kx4 kx4Var, y05 y05Var, zy0 zy0Var, i30 i30Var, dn2 dn2Var) {
        this.X = (byte) 0;
        this.Y = kx4Var;
        this.Z = y05Var;
        this.f0 = zy0Var;
        this.g0 = i30Var;
        this.h0 = dn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        be beVar = zz0.a;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.h0;
        Object obj4 = this.g0;
        Object obj5 = this.f0;
        Object obj6 = this.Z;
        switch (b) {
            case 0:
                y05 y05Var = (y05) obj6;
                zy0 zy0Var = (zy0) obj5;
                i30 i30Var = (i30) obj4;
                dn2 dn2Var = (dn2) obj3;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    Object objK = lp2Var.K();
                    if (objK == beVar) {
                        objK = new gh(y05Var, (byte) 9);
                        lp2Var.g0(objK);
                    }
                    kx4 kx4VarQ = vr3.Q(this.Y, (gn2) objK);
                    xr4 xr4VarC = g80.c(pz2.Z, true);
                    int iHashCode = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarQ);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, xr4VarC);
                    pn7.m(pz2.A0, lp2Var, kl5VarL);
                    pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var);
                    pn7.m(pz2.z0, lp2Var, kx4VarQ2);
                    zy0Var.K(lp2Var, 0);
                    i30Var.b(dn2Var, lp2Var, 6);
                    lp2Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                yn0.m((b83) obj6, (String) obj5, (String) obj4, (gn2) obj3, this.Y, (lp2) obj, w79.P(24577));
                break;
            case 2:
                ((Integer) obj2).getClass();
                pn7.g((np7) obj6, (vv5) obj5, (gw5) obj4, (fn6) obj3, this.Y, (lp2) obj, w79.P(25161));
                break;
            default:
                is7 is7Var = (is7) obj6;
                gn2 gn2Var = (gn2) obj5;
                y68 y68Var = (y68) obj4;
                y68 y68Var2 = (y68) obj3;
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lp2Var2.Q();
                } else {
                    String strJ0 = vj8.j0(y46.sub_properties_auto_update_enable, lp2Var2);
                    boolean z = is7Var.a;
                    boolean z2 = !is7Var.b;
                    boolean zF = lp2Var2.f(gn2Var);
                    Object objK2 = lp2Var2.K();
                    if (zF || objK2 == beVar) {
                        objK2 = new pr2(gn2Var, (byte) 12);
                        lp2Var2.g0(objK2);
                    }
                    kx4 kx4Var = this.Y;
                    g33.a(strJ0, z, (gn2) objK2, kx4Var, z2, null, null, lp2Var2, 3072, 224);
                    String strJ1 = vj8.j0(y46.sub_properties_auto_update_interval, lp2Var2);
                    String strJ2 = vj8.j0(y46.sub_properties_auto_update_interval_placeholder, lp2Var2);
                    String strJ3 = vj8.j0(y46.sub_properties_auto_update_interval_description, lp2Var2);
                    wx3 wx3Var = new wx3(123);
                    ha2 ha2Var = new ha2(new rr4(3));
                    boolean zF2 = lp2Var2.f(gn2Var);
                    Object objK3 = lp2Var2.K();
                    if (zF2 || objK3 == beVar) {
                        objK3 = new pr2(gn2Var, (byte) 13);
                        lp2Var2.g0(objK3);
                    }
                    w45.b(strJ1, strJ2, (gn2) objK3, kx4Var, y68Var, strJ3, z2, wx3Var, ha2Var, lp2Var2, 113249280, 0);
                    ss8 ss8Var = ss8.a;
                    if (ss8.t()) {
                        lp2Var2.W(-1780618699);
                        wx3 wx3Var2 = new wx3(123);
                        ha2 ha2Var2 = new ha2(new rr4(1));
                        boolean zF3 = lp2Var2.f(gn2Var);
                        Object objK4 = lp2Var2.K();
                        if (zF3 || objK4 == beVar) {
                            objK4 = new pr2(gn2Var, (byte) 14);
                            lp2Var2.g0(objK4);
                        }
                        w45.b("Начальная задержка (QA Dev)", "1", (gn2) objK4, kx4Var, y68Var2, "Укажите 0 и переключите тогл 'Авто обновления' (выкл -> вкл или вкл -> выкл -> вкл), чтобы мгновенно запустить обновление (dev версия)", false, wx3Var2, ha2Var2, lp2Var2, 113249286, 64);
                        lp2Var2.p(false);
                    } else {
                        lp2Var2.W(-1779796610);
                        lp2Var2.p(false);
                    }
                    String strJ4 = vj8.j0(y46.sub_properties_auto_update_show_notifications, lp2Var2);
                    boolean z3 = is7Var.e;
                    boolean zF4 = lp2Var2.f(gn2Var);
                    Object objK5 = lp2Var2.K();
                    if (zF4 || objK5 == beVar) {
                        objK5 = new pr2(gn2Var, (byte) 15);
                        lp2Var2.g0(objK5);
                    }
                    g33.a(strJ4, z3, (gn2) objK5, kx4Var, false, null, null, lp2Var2, 3072, 240);
                }
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ no5(is7 is7Var, gn2 gn2Var, kx4 kx4Var, y68 y68Var, y68 y68Var2) {
        this.X = (byte) 3;
        this.Z = is7Var;
        this.f0 = gn2Var;
        this.Y = kx4Var;
        this.g0 = y68Var;
        this.h0 = y68Var2;
    }

    public /* synthetic */ no5(Object obj, Object obj2, Object obj3, Object obj4, kx4 kx4Var, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.g0 = obj3;
        this.h0 = obj4;
        this.Y = kx4Var;
    }
}
