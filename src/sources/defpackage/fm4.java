package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class fm4 implements rn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ za3 Y;
    public final /* synthetic */ xw8 Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ fm4(p67 p67Var, pv3 pv3Var, za3 za3Var, o87 o87Var, ky2 ky2Var, y05 y05Var) {
        this.Z = p67Var;
        this.f0 = pv3Var;
        this.Y = za3Var;
        this.g0 = o87Var;
        this.h0 = ky2Var;
        this.i0 = y05Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        Object[] objArr;
        Object cf2Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.i0;
        Object obj4 = this.h0;
        Object obj5 = this.g0;
        Object obj6 = this.f0;
        xw8 xw8Var = this.Z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                w39.e((MainViewModel) xw8Var, (sq6) obj6, (gw5) obj5, (dr2) obj4, this.Y, (kr7) obj3, (lp2) obj, w79.P(299593));
                break;
            default:
                p67 p67Var = (p67) xw8Var;
                gn2 gn2Var = (pv3) obj6;
                o87 o87Var = (o87) obj5;
                ky2 ky2Var = (ky2) obj4;
                lh7 lh7Var = (lh7) obj3;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    f76 f76Var = p67Var.f;
                    gn2 gn2Var2 = gn2Var;
                    za3 za3Var = this.Y;
                    boolean zH = lp2Var.h(za3Var);
                    Object objK = lp2Var.K();
                    be beVar = zz0.a;
                    if (zH || objK == beVar) {
                        al5 al5Var = new al5(1, za3Var, za3.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/app_update/IncomingUpdateUiIntent;)V", 0, (byte) 11);
                        lp2Var.g0(al5Var);
                        objK = al5Var;
                    }
                    gn2 gn2Var3 = (pv3) objK;
                    f76Var.getClass();
                    gn2Var2.getClass();
                    gn2Var3.getClass();
                    Context context = (Context) lp2Var.j(pc.b);
                    ky2 ky2Var2 = (ky2) lp2Var.j(ly2.a);
                    Object[] objArr2 = {f76Var, gn2Var2, gn2Var3, ky2Var2};
                    boolean zH2 = lp2Var.h(f76Var) | lp2Var.f(gn2Var3) | lp2Var.f(gn2Var2) | lp2Var.f(ky2Var2) | lp2Var.h(context);
                    Object objK2 = lp2Var.K();
                    if (zH2 || objK2 == beVar) {
                        objArr = objArr2;
                        cf2Var = new cf2(f76Var, gn2Var3, gn2Var2, ky2Var2, context, (q51) null, (byte) 4);
                        lp2Var.g0(cf2Var);
                    } else {
                        cf2Var = objK2;
                        objArr = objArr2;
                    }
                    u70.k(objArr, (rn2) cf2Var, lp2Var);
                    FillElement fillElement = b.c;
                    xr4 xr4VarC = g80.c(pz2.Z, false);
                    int iHashCode = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, fillElement);
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
                    pn7.m(pz2.z0, lp2Var, kx4VarQ);
                    yn0.g(ky2Var, z91.T(l80.a(hx4.X, pz2.f0), z91.d), lp2Var, 6);
                    lp2Var.p(true);
                    if (!((e67) lh7Var.getValue()).a) {
                        lp2Var.W(-472780132);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(-473018460);
                        boolean zF = lp2Var.f(gn2Var);
                        Object objK3 = lp2Var.K();
                        if (zF || objK3 == beVar) {
                            objK3 = new aa3(gn2Var, (byte) 8);
                            lp2Var.g0(objK3);
                        }
                        pu.c(za3Var, (dn2) objK3, o87Var, lp2Var, 8);
                        lp2Var.p(false);
                    }
                }
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ fm4(MainViewModel mainViewModel, sq6 sq6Var, gw5 gw5Var, dr2 dr2Var, za3 za3Var, kr7 kr7Var, int i) {
        this.Z = mainViewModel;
        this.f0 = sq6Var;
        this.g0 = gw5Var;
        this.h0 = dr2Var;
        this.Y = za3Var;
        this.i0 = kr7Var;
    }
}
