package defpackage;

import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zt4 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public zt4(ce8 ce8Var, zy0 zy0Var, hc8 hc8Var) {
        this.X = (byte) 2;
        this.Y = ce8Var;
        this.f0 = zy0Var;
        this.Z = hc8Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        c83 c83Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.Z;
        Object obj4 = this.f0;
        Object obj5 = this.Y;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kx4 kx4VarV = dh3.V(hi5.C0(os4.z((kx4) obj5, 0.0f, 8.0f, 1)), (ay6) obj3);
                    zy0 zy0Var = (zy0) obj4;
                    tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
                    int I = km4.I(lp2Var);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, kx4VarV);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, tw0VarA);
                    pn7.m(pz2.A0, lp2Var, kl5VarL);
                    dx0 dx0Var = pz2.C0;
                    if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                        p61.v(I, lp2Var, I, dx0Var);
                    }
                    pn7.m(pz2.z0, lp2Var, kx4VarQ);
                    zy0Var.x(uw0.a, lp2Var, 6);
                    lp2Var.p(true);
                } else {
                    lp2Var.Q();
                }
                return dn8Var;
            case 1:
                ServerCache serverCache = (ServerCache) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ConfigGroupCache configGroupCache = (ConfigGroupCache) obj3;
                serverCache.getClass();
                String guid = serverCache.getGuid();
                guid.getClass();
                mh7 mh7Var = ((dw7) obj5).e;
                Object obj6 = null;
                if (mh7Var != null && (c83Var = (c83) mh7Var.getValue()) != null) {
                    for (Object obj7 : c83Var) {
                        if (dh3.f((nv7) obj7, new lv7(guid))) {
                            obj6 = obj7;
                            obj6 = (nv7) obj6;
                        }
                    }
                    obj6 = (nv7) obj6;
                }
                if (obj6 != null) {
                    z2 = true;
                    z = false;
                } else {
                    z = false;
                    z2 = false;
                }
                String subId = configGroupCache.getSubId();
                SubscriptionItem subscriptionItem = configGroupCache.getSubscriptionItem();
                return new pv7(serverCache, subId, zBooleanValue, subscriptionItem != null ? subscriptionItem.G() : z, (vn5) obj4, z2, (configGroupCache.getSubscriptionItem() == null || configGroupCache.getSubscriptionItem().b0()) ? true : z);
            default:
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    yz0 yz0Var = new yz0(new mg1((ce8) obj5, (byte) 3));
                    zy0 zy0Var2 = (zy0) obj4;
                    hc8 hc8Var = (hc8) obj3;
                    xr4 xr4VarC = g80.c(pz2.Z, false);
                    int I2 = km4.I(lp2Var2);
                    kl5 kl5VarL2 = lp2Var2.l();
                    kx4 kx4VarQ2 = w45.Q(lp2Var2, yz0Var);
                    uz0.j.getClass();
                    lp2Var2.Z();
                    if (lp2Var2.S) {
                        lp2Var2.k();
                    } else {
                        lp2Var2.j0();
                    }
                    pn7.m(pz2.B0, lp2Var2, xr4VarC);
                    pn7.m(pz2.A0, lp2Var2, kl5VarL2);
                    dx0 dx0Var2 = pz2.C0;
                    if (lp2Var2.S || !dh3.f(lp2Var2.K(), Integer.valueOf(I2))) {
                        p61.v(I2, lp2Var2, I2, dx0Var2);
                    }
                    pn7.m(pz2.z0, lp2Var2, kx4VarQ2);
                    zy0Var2.x(hc8Var, lp2Var2, 6);
                    lp2Var2.p(true);
                } else {
                    lp2Var2.Q();
                }
                return dn8Var;
        }
    }

    public /* synthetic */ zt4(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }
}
