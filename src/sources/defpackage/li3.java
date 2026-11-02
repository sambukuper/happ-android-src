package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class li3 implements jq0 {
    public static final li3 b = new li3(0);
    public static final li3 c = new li3(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ li3(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.jq0
    public final String a() {
        switch (this.a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }

    @Override // defpackage.jq0
    public final boolean b(dl3 dl3Var) {
        aa7 aa7VarM;
        switch (this.a) {
            case 0:
                ot8 ot8Var = (ot8) dl3Var.L().get(1);
                we5 we5Var = hc6.c;
                ot8Var.getClass();
                int i = el1.a;
                vx4 vx4VarC = bl1.c(ot8Var);
                vx4VarC.getClass();
                we5Var.getClass();
                sx4 sx4VarM = oc.m(vx4VarC, tg7.R);
                if (sx4VarM == null) {
                    aa7VarM = null;
                } else {
                    ch8.Y.getClass();
                    ch8 ch8Var = ch8.Z;
                    List listG = sx4VarM.l().g();
                    listG.getClass();
                    Object objO0 = wv0.O0(listG);
                    objO0.getClass();
                    aa7VarM = dh3.M(ch8Var, sx4VarM, i21.K(new wg7((hi8) objO0)));
                }
                if (aa7VarM == null) {
                    return false;
                }
                t14 t14VarC = ot8Var.c();
                t14VarC.getClass();
                return y08.i(aa7VarM, cj8.g(t14VarC, false));
            default:
                List<ot8> listL = dl3Var.L();
                listL.getClass();
                if (!listL.isEmpty()) {
                    for (ot8 ot8Var2 : listL) {
                        ot8Var2.getClass();
                        if (el1.a(ot8Var2) || ot8Var2.n0 != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // defpackage.jq0
    public final /* bridge */ String c(dl3 dl3Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return nr4.F(this, dl3Var);
    }
}
