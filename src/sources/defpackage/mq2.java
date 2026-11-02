package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class mq2 implements tn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mq2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        lp2 lp2Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj5 = this.g0;
        Object obj6 = this.f0;
        Object obj7 = this.Z;
        Object obj8 = this.Y;
        switch (b) {
            case 0:
                dr2 dr2Var = (dr2) obj8;
                gn2 gn2Var = (pv3) obj7;
                dn2 dn2Var = (dn2) obj6;
                lh7 lh7Var = (lh7) obj5;
                lp2 lp2Var2 = (lp2) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((uw0) obj).getClass();
                ((dn2) obj2).getClass();
                if (!lp2Var2.N(iIntValue & 1, (iIntValue & 129) != 128)) {
                    lp2Var2.Q();
                } else {
                    f76 f76Var = dr2Var.f;
                    gn2 gn2Var2 = gn2Var;
                    f76Var.getClass();
                    gn2Var2.getClass();
                    dn2Var.getClass();
                    Activity activity = (Activity) lp2Var2.j(yc4.a);
                    boolean zH = lp2Var2.h(f76Var) | lp2Var2.f(dn2Var) | lp2Var2.f(gn2Var2) | lp2Var2.h(activity);
                    Object objK = lp2Var2.K();
                    be beVar = zz0.a;
                    if (zH || objK == beVar) {
                        lp2Var = lp2Var2;
                        pi piVar = new pi(f76Var, dn2Var, gn2Var2, activity, (q51) null, (byte) 10);
                        lp2Var.g0(piVar);
                        objK = piVar;
                    } else {
                        lp2Var = lp2Var2;
                    }
                    u70.j(f76Var, activity, (rn2) objK, lp2Var);
                    o50 o50Var = pz2.o0;
                    ft ftVar = new ft(16.0f, new bt());
                    FillElement fillElement = b.a;
                    kx4 kx4VarZ = os4.z(fillElement, 16.0f, 0.0f, 2);
                    wq6 wq6VarA = vq6.a(ftVar, o50Var, lp2Var, 54);
                    int iHashCode = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, kx4VarZ);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, wq6VarA);
                    pn7.m(pz2.A0, lp2Var, kl5VarL);
                    pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var);
                    pn7.m(pz2.z0, lp2Var, kx4VarQ);
                    d44 d44Var = new d44(1.0f, true);
                    String strJ0 = vj8.j0(y46.geo_file_download_title, lp2Var);
                    ox1 ox1Var = es.a;
                    o88 o88Var = ((ds) lp2Var.j(ox1Var)).a.c;
                    ox1 ox1Var2 = ep.z;
                    zc1.g(strJ0, d44Var, o88.a(o88Var, ((dp) lp2Var.j(ox1Var2)).c.a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214), 0, 0, 1, 0, false, (gn2) null, lp2Var, 196608, 472);
                    String strJ1 = vj8.j0(y46.close, lp2Var);
                    o88 o88VarA = o88.a(((ds) lp2Var.j(ox1Var)).b, ((dp) lp2Var.j(ox1Var2)).c.a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214);
                    boolean zF = lp2Var.f(gn2Var) | lp2Var.f(dn2Var);
                    Object objK2 = lp2Var.K();
                    if (zF || objK2 == beVar) {
                        objK2 = new nq2(gn2Var, dn2Var, (byte) 0);
                        lp2Var.g0(objK2);
                    }
                    z51.g(strJ1, (kx4) null, false, o88VarA, 6, 0, 1, 0, false, (ig5) null, (x67) null, (dn2) objK2, lp2Var, 1572864, 4006);
                    lp2Var.p(true);
                    ch3.f(lp2Var, b.b(hx4.X, 12.0f));
                    hi5.J(((pq2) lh7Var.getValue()).b, fillElement, os4.z(fillElement, 0.0f, 12.0f, 1), jm4.U(-1547160247, new oq2(gn2Var, lh7Var, (byte) 0), lp2Var), lp2Var, 3504);
                }
                break;
            default:
                zy0 zy0Var = (zy0) obj8;
                Context context = (Context) obj7;
                Activity activity2 = (Activity) obj6;
                Configuration configuration = (Configuration) obj5;
                uw0 uw0Var = (uw0) obj;
                dn2 dn2Var2 = (dn2) obj2;
                lp2 lp2Var3 = (lp2) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                uw0Var.getClass();
                dn2Var2.getClass();
                int i = (iIntValue2 & 6) == 0 ? (lp2Var3.f(uw0Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= lp2Var3.h(dn2Var2) ? 32 : 16;
                }
                if (!lp2Var3.N(i & 1, (i & 147) != 146)) {
                    lp2Var3.Q();
                } else {
                    vr3.e(context, activity2, configuration, jm4.U(-1799606783, new dw2(zy0Var, uw0Var, dn2Var2, (byte) 0), lp2Var3), lp2Var3);
                }
                break;
        }
        return dn8Var;
    }
}
