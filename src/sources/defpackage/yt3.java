package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yt3 extends jm4 {
    public final fx5 m0;
    public final cz5 n0;
    public final fu3 o0;
    public final w15 p0;
    public final ux4 q0;
    public final String r0;

    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
    public yt3(fx5 fx5Var, cz5 cz5Var, fu3 fu3Var, w15 w15Var, ux4 ux4Var) {
        String string;
        String strN;
        w15Var.getClass();
        this.m0 = fx5Var;
        this.n0 = cz5Var;
        this.o0 = fu3Var;
        this.p0 = w15Var;
        this.q0 = ux4Var;
        if (fu3Var.i()) {
            strN = w15Var.getString(fu3Var.g0.Z).concat(w15Var.getString(fu3Var.g0.f0));
        } else {
            r62 r62Var = mu3.a;
            kt3 kt3VarB = mu3.b(cz5Var, w15Var, ux4Var, true);
            if (kt3VarB == null) {
                xw3.j(fx5Var, "No field signature for property: ");
                throw null;
            }
            String str = kt3VarB.l;
            String str2 = kt3VarB.m;
            StringBuilder sb = new StringBuilder(js3.a(str));
            ed1 ed1VarP = fx5Var.p();
            ed1VarP.getClass();
            if (dh3.f(fx5Var.e(), gl1.d) && (ed1VarP instanceof vl1)) {
                fy5 fy5Var = ((vl1) ed1VarP).g0;
                aq2 aq2Var = lu3.g;
                aq2Var.getClass();
                Integer num = (Integer) ch3.y(fy5Var, aq2Var);
                String strReplaceAll = d25.a.X.matcher(num != null ? w15Var.getString(num.intValue()) : "main").replaceAll("_");
                strReplaceAll.getClass();
                string = "$".concat(strReplaceAll);
            } else if (dh3.f(fx5Var.e(), gl1.a) && (ed1VarP instanceof tf5)) {
                xl1 xl1Var = ((im1) fx5Var).I0;
                if (xl1Var instanceof st3) {
                    st3 st3Var = (st3) xl1Var;
                    if (st3Var.Y != null) {
                        StringBuilder sb2 = new StringBuilder("$");
                        String str3 = st3Var.X.a;
                        if (str3 == null) {
                            zs3.a(10);
                            throw null;
                        }
                        sb2.append(v15.e(fm7.K0('/', str3, str3)).b());
                        string = sb2.toString();
                    } else {
                        string = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                } else {
                    string = _UrlKt.FRAGMENT_ENCODE_SET;
                }
            } else {
                string = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            strN = p61.n(sb, string, "()", str2);
        }
        this.r0 = strN;
    }

    @Override // defpackage.jm4
    public final String o() {
        return this.r0;
    }
}
