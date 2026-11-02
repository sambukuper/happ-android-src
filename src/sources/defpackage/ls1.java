package defpackage;

import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ls1 {
    public static final /* synthetic */ nw3[] b = {new mx5(ls1.class)};
    public final is5 a = x97.R("dnstt_statistics", (lr5) null, (vj2) null, 14);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s51 s51Var) {
        ks1 ks1Var;
        if (s51Var instanceof ks1) {
            ks1Var = (ks1) s51Var;
            int i = ks1Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ks1Var.h0 = i - Integer.MIN_VALUE;
            } else {
                ks1Var = new ks1(this, s51Var);
            }
        } else {
            ks1Var = new ks1(this, s51Var);
        }
        Object obj = ks1Var.f0;
        int i2 = ks1Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            HappApplication happApplication = HappApplication.M0;
            HappApplication happApplicationI = k32.i();
            na1 na1Var = (na1) this.a.a(b[0], happApplicationI);
            q5 q5Var = new q5(2, (q51) null, (byte) 6);
            ks1Var.h0 = 1;
            Object objX = wl7.x(na1Var, q5Var, ks1Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }
}
