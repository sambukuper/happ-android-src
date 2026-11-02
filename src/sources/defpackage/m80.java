package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m80 implements zf3 {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public m80(String str) {
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.zf3
    public final zf6 a(y76 y76Var) {
        boolean z;
        b86 b86Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                d61 d61Var = (d61) obj;
                y5 y5Var = y76Var.e;
                z47 z47VarV = y5Var.V();
                u23 u23Var = (u23) y5Var.Y;
                nz2 nz2Var = (nz2) y5Var.g0;
                byte b2 = 0;
                if (nz2Var.a("Host") == null) {
                    z47VarV.M("Host", ks8.t(u23Var, false));
                }
                if (nz2Var.a("Connection") == null) {
                    z47VarV.M("Connection", "Keep-Alive");
                }
                if (nz2Var.a("Accept-Encoding") == null && nz2Var.a("Range") == null) {
                    z47VarV.M("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                List listT = d61Var.t(u23Var);
                if (!listT.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    for (Object obj2 : listT) {
                        int i2 = i + 1;
                        if (i < 0) {
                            i21.X();
                            throw null;
                        }
                        c61 c61Var = (c61) obj2;
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append(c61Var.a);
                        sb.append('=');
                        sb.append(c61Var.b);
                        i = i2;
                    }
                    z47VarV.M("Cookie", sb.toString());
                }
                if (nz2Var.a("User-Agent") == null) {
                    z47VarV.M("User-Agent", "okhttp/4.12.0");
                }
                zf6 zf6VarB = y76Var.b(z47VarV.o());
                nz2 nz2Var2 = zf6VarB.h0;
                s23.b(d61Var, u23Var, nz2Var2);
                yf6 yf6VarK = zf6VarB.k();
                yf6VarK.a = y5Var;
                if (z && "gzip".equalsIgnoreCase(zf6.g(zf6VarB, "Content-Encoding")) && s23.a(zf6VarB) && (b86Var = zf6VarB.i0) != null) {
                    dv2 dv2Var = new dv2(b86Var.source());
                    ps psVarC = nz2Var2.c();
                    psVarC.e("Content-Encoding");
                    psVarC.e("Content-Length");
                    yf6VarK.f = psVarC.d().c();
                    zf6.g(zf6VarB, "Content-Type");
                    yf6VarK.g = new b86(-1L, new j76(dv2Var), b2);
                }
                return yf6VarK.a();
            default:
                z47 z47VarV2 = y76Var.e.V();
                z47VarV2.M("Host", (String) obj);
                return y76Var.b(z47VarV2.o());
        }
    }

    public m80(d61 d61Var) {
        this.b = d61Var;
    }
}
