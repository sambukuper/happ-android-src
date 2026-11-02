package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q66 extends ui8 {
    public static final nl3 c;
    public static final nl3 d;
    public final xd6 b = new xd6(new we5((byte) 9));

    static {
        zi8 zi8Var = zi8.Y;
        c = nl3.a(pu.U(zi8Var, false, null, 5), ol3.Z, false, null, null, 61);
        d = nl3.a(pu.U(zi8Var, false, null, 5), ol3.Y, false, null, null, 61);
    }

    @Override // defpackage.ui8
    public final ni8 d(t14 t14Var) {
        return new wg7(h(t14Var, new nl3(zi8.Y, false, false, null, 62)));
    }

    public final qg5 g(aa7 aa7Var, sx4 sx4Var, nl3 nl3Var) {
        if (aa7Var.n0().g().isEmpty()) {
            return new qg5(aa7Var, Boolean.FALSE);
        }
        if (zz3.z(aa7Var)) {
            ni8 ni8Var = (ni8) aa7Var.l0().get(0);
            rt8 rt8VarA = ni8Var.a();
            t14 t14VarB = ni8Var.b();
            t14VarB.getClass();
            return new qg5(dh3.N(aa7Var.m0(), aa7Var.n0(), i21.K(new wg7(h(t14VarB, nl3Var), rt8VarA)), aa7Var.o0()), Boolean.FALSE);
        }
        if (vr3.J(aa7Var)) {
            return new qg5(u32.c(s32.ERROR_RAW_TYPE, aa7Var.n0().toString()), Boolean.FALSE);
        }
        et4 et4VarL0 = sx4Var.l0(this);
        et4VarL0.getClass();
        ch8 ch8VarM0 = aa7Var.m0();
        lh8 lh8VarL = sx4Var.l();
        lh8VarL.getClass();
        List<hi8> listG = sx4Var.l().g();
        listG.getClass();
        ArrayList arrayList = new ArrayList(xv0.Z(listG, 10));
        for (hi8 hi8Var : listG) {
            hi8Var.getClass();
            xd6 xd6Var = this.b;
            arrayList.add(we5.e(hi8Var, nl3Var, xd6Var, xd6Var.q(hi8Var, nl3Var)));
        }
        return new qg5(dh3.P(ch8VarM0, lh8VarL, arrayList, aa7Var.o0(), et4VarL0, new f0(sx4Var, this, aa7Var, nl3Var)), Boolean.TRUE);
    }

    public final t14 h(t14 t14Var, nl3 nl3Var) {
        ot0 ot0VarX = t14Var.n0().x();
        if (ot0VarX instanceof hi8) {
            nl3Var.getClass();
            return h(this.b.q((hi8) ot0VarX, nl3.a(nl3Var, null, true, null, null, 59)), nl3Var);
        }
        if (!(ot0VarX instanceof sx4)) {
            b61.o(ot0VarX, "Unexpected declaration kind: ");
            return null;
        }
        ot0 ot0VarX2 = yn0.h0(t14Var).n0().x();
        if (!(ot0VarX2 instanceof sx4)) {
            om0.i("For some reason declaration for upper bound is not a class but \"", ot0VarX2, "\" while for lower it's \"", ot0VarX, 34);
            return null;
        }
        qg5 qg5VarG = g(yn0.O(t14Var), (sx4) ot0VarX, c);
        aa7 aa7Var = (aa7) qg5VarG.X;
        boolean zBooleanValue = ((Boolean) qg5VarG.Y).booleanValue();
        qg5 qg5VarG2 = g(yn0.h0(t14Var), (sx4) ot0VarX2, d);
        aa7 aa7Var2 = (aa7) qg5VarG2.X;
        return (zBooleanValue || ((Boolean) qg5VarG2.Y).booleanValue()) ? new r66(aa7Var, aa7Var2) : dh3.s(aa7Var, aa7Var2);
    }
}
