package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class oj6 implements rn2 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ dn2 Y;
    public final /* synthetic */ Context Z;
    public final /* synthetic */ Intent f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ oj6(boolean z, dn2 dn2Var, Context context, Intent intent) {
        this.X = z;
        this.Y = dn2Var;
        this.Z = context;
        this.f0 = intent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            wq6 wq6VarA = vq6.a(new ft(8.0f, new bt()), pz2.o0, lp2Var, 54);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, hx4.X);
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
            boolean z = this.X;
            dn2 dn2Var = this.Y;
            if (z) {
                lp2Var.W(1245645236);
                lp2Var.p(false);
            } else {
                lp2Var.W(1245190683);
                z51.g(vj8.j0(y46.dialog_input_in_center_button_negative, lp2Var), (kx4) null, false, o88.a(((ds) lp2Var.j(es.a)).c, ((dp) lp2Var.j(ep.z)).c.a, 0L, dj2.f0, (gi2) null, 0L, 0L, (aa4) null, 16777210), 0, 0, 1, 0, false, (ig5) null, (x67) null, dn2Var, lp2Var, 1572864, 4022);
                lp2Var.p(false);
            }
            String strJ0 = vj8.j0(y46.title_settings, lp2Var);
            o88 o88VarA = o88.a(((ds) lp2Var.j(es.a)).c, ((dp) lp2Var.j(ep.z)).a, 0L, dj2.f0, (gi2) null, 0L, 0L, (aa4) null, 16777210);
            Context context = this.Z;
            boolean zH = lp2Var.h(context);
            Intent intent = this.f0;
            boolean zH2 = zH | lp2Var.h(intent) | lp2Var.f(dn2Var);
            Object objK = lp2Var.K();
            if (zH2 || objK == zz0.a) {
                objK = new g00(context, intent, dn2Var, (byte) 18);
                lp2Var.g0(objK);
            }
            z51.g(strJ0, (kx4) null, false, o88VarA, 0, 0, 1, 0, false, (ig5) null, (x67) null, (dn2) objK, lp2Var, 1572864, 4022);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
