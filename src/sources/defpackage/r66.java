package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r66 extends ce2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r66(aa7 aa7Var, aa7 aa7Var2) {
        super(aa7Var, aa7Var2);
        aa7Var.getClass();
        aa7Var2.getClass();
        v14.a.b(aa7Var, aa7Var2);
    }

    public static final ArrayList w0(wk1 wk1Var, t14 t14Var) throws IOException {
        List<ni8> listL0 = t14Var.l0();
        ArrayList arrayList = new ArrayList(xv0.Z(listL0, 10));
        for (ni8 ni8Var : listL0) {
            ni8Var.getClass();
            StringBuilder sb = new StringBuilder();
            wv0.x0(i21.K(ni8Var), sb, ", ", null, null, new uk1(wk1Var, (byte) 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String x0(String str, String str2) {
        if (!fm7.e0(str, '<')) {
            return str;
        }
        return fm7.M0('<', str) + '<' + str2 + '>' + fm7.K0('>', str, str);
    }

    @Override // defpackage.ce2, defpackage.t14
    public final et4 K() {
        ot0 ot0VarX = n0().x();
        sx4 sx4Var = ot0VarX instanceof sx4 ? (sx4) ot0VarX : null;
        if (sx4Var == null) {
            kp5.q(n0().x(), "Incorrect classifier: ");
            return null;
        }
        et4 et4VarL0 = sx4Var.l0(new q66());
        et4VarL0.getClass();
        return et4VarL0;
    }

    @Override // defpackage.t14
    public final t14 p0(z14 z14Var) {
        aa7 aa7Var = this.Y;
        aa7Var.getClass();
        aa7 aa7Var2 = this.Z;
        aa7Var2.getClass();
        return new r66(aa7Var, aa7Var2);
    }

    @Override // defpackage.mo8
    public final mo8 r0(boolean z) {
        return new r66(this.Y.r0(z), this.Z.r0(z));
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: s0 */
    public final mo8 p0(z14 z14Var) {
        aa7 aa7Var = this.Y;
        aa7Var.getClass();
        aa7 aa7Var2 = this.Z;
        aa7Var2.getClass();
        return new r66(aa7Var, aa7Var2);
    }

    @Override // defpackage.mo8
    public final mo8 t0(ch8 ch8Var) {
        ch8Var.getClass();
        return new r66(this.Y.t0(ch8Var), this.Z.t0(ch8Var));
    }

    @Override // defpackage.ce2
    public final aa7 u0() {
        return this.Y;
    }

    @Override // defpackage.ce2
    public final String v0(wk1 wk1Var, wk1 wk1Var2) throws IOException {
        aa7 aa7Var = this.Y;
        String strP = wk1Var.P(aa7Var);
        aa7 aa7Var2 = this.Z;
        String strP2 = wk1Var.P(aa7Var2);
        if (wk1Var2.a.p()) {
            return "raw (" + strP + ".." + strP2 + ')';
        }
        if (aa7Var2.l0().isEmpty()) {
            return wk1Var.w(strP, strP2, y08.e(this));
        }
        ArrayList arrayListW0 = w0(wk1Var, aa7Var);
        ArrayList arrayListW1 = w0(wk1Var, aa7Var2);
        String strY0 = wv0.y0(arrayListW0, ", ", null, null, cd5.h0, 30);
        ArrayList arrayListE1 = wv0.e1(arrayListW0, arrayListW1);
        if (!arrayListE1.isEmpty()) {
            Iterator it = arrayListE1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strP2 = x0(strP2, strY0);
                    break;
                }
                qg5 qg5Var = (qg5) it.next();
                String str = (String) qg5Var.X;
                String str2 = (String) qg5Var.Y;
                if (!dh3.f(str, fm7.x0("out ", str2)) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strP2 = x0(strP2, strY0);
            break;
        }
        String strX0 = x0(strP, strY0);
        return strX0.equals(strP2) ? strX0 : wk1Var.w(strX0, strP2, y08.e(this));
    }
}
