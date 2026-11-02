package defpackage;

import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qt0 {
    public static final qt0 b = new qt0(0);
    public static final qt0 c = new qt0(1);
    public static final qt0 d = new qt0(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ qt0(byte b2) {
        this.a = b2;
    }

    public static String a(ot0 ot0Var) {
        String strJ;
        v15 name = ot0Var.getName();
        name.getClass();
        String strK = pu.K(name);
        if (!(ot0Var instanceof hi8)) {
            ed1 ed1VarP = ot0Var.p();
            ed1VarP.getClass();
            if (ed1VarP instanceof sx4) {
                strJ = a((ot0) ed1VarP);
            } else {
                strJ = ed1VarP instanceof tf5 ? pu.J(((uf5) ((tf5) ed1VarP)).i0.a) : null;
            }
            if (strJ != null && !strJ.equals(_UrlKt.FRAGMENT_ENCODE_SET)) {
                return strJ + '.' + strK;
            }
        }
        return strK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ed1, ot0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ed1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ed1] */
    public final String b(ot0 ot0Var, wk1 wk1Var) {
        switch (this.a) {
            case 0:
                if (ot0Var instanceof hi8) {
                    v15 name = ((hi8) ot0Var).getName();
                    name.getClass();
                    return wk1Var.F(name, false);
                }
                gk2 gk2VarF = bl1.f(ot0Var);
                gk2VarF.getClass();
                return wk1Var.l(os4.I(gk2.f(gk2VarF)));
            case 1:
                if (ot0Var instanceof hi8) {
                    v15 name2 = ((hi8) ot0Var).getName();
                    name2.getClass();
                    return wk1Var.F(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(ot0Var.getName());
                    ot0Var = ot0Var.p();
                } while (ot0Var instanceof sx4);
                return os4.I(new rk6(arrayList));
            default:
                return a(ot0Var);
        }
    }
}
