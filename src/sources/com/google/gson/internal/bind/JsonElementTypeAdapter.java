package com.google.gson.internal.bind;

import defpackage.bo3;
import defpackage.bq3;
import defpackage.bt;
import defpackage.en3;
import defpackage.f44;
import defpackage.hs3;
import defpackage.ie2;
import defpackage.iq3;
import defpackage.om0;
import defpackage.or3;
import defpackage.p61;
import defpackage.rq3;
import defpackage.va4;
import defpackage.wa4;
import defpackage.xa4;
import defpackage.xp3;
import io.sentry.util.c;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class JsonElementTypeAdapter extends com.google.gson.b {
    public static final JsonElementTypeAdapter a = new JsonElementTypeAdapter();

    private JsonElementTypeAdapter() {
    }

    public static bo3 d(rq3 rq3Var) throws IOException {
        bo3 en3Var;
        bo3 en3Var2;
        if (rq3Var instanceof or3) {
            or3 or3Var = (or3) rq3Var;
            int iC0 = or3Var.c0();
            if (iC0 == 5 || iC0 == 2 || iC0 == 4 || iC0 == 10) {
                om0.g("Unexpected ", ie2.r(iC0), " when reading a JsonElement.");
                return null;
            }
            bo3 bo3Var = (bo3) or3Var.g1();
            or3Var.v();
            return bo3Var;
        }
        int iC1 = rq3Var.c0();
        int iB = p61.B(iC1);
        if (iB == 0) {
            rq3Var.Q0();
            en3Var = new en3();
        } else if (iB != 2) {
            en3Var = null;
        } else {
            rq3Var.F0();
            en3Var = new bq3();
        }
        if (en3Var == null) {
            return e(iC1, rq3Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (rq3Var.hasNext()) {
                String strE0 = en3Var instanceof bq3 ? rq3Var.e0() : null;
                int iC2 = rq3Var.c0();
                int iB2 = p61.B(iC2);
                if (iB2 == 0) {
                    rq3Var.Q0();
                    en3Var2 = new en3();
                } else if (iB2 != 2) {
                    en3Var2 = null;
                } else {
                    rq3Var.F0();
                    en3Var2 = new bq3();
                }
                boolean z = en3Var2 != null;
                if (en3Var2 == null) {
                    en3Var2 = e(iC2, rq3Var);
                }
                if (en3Var instanceof en3) {
                    ((en3) en3Var).e(en3Var2);
                } else {
                    ((bq3) en3Var).e(strE0, en3Var2);
                }
                if (z) {
                    arrayDeque.addLast(en3Var);
                    en3Var = en3Var2;
                }
            } else {
                if (en3Var instanceof en3) {
                    rq3Var.K0();
                } else {
                    rq3Var.j0();
                }
                if (arrayDeque.isEmpty()) {
                    return en3Var;
                }
                en3Var = (bo3) arrayDeque.removeLast();
            }
        }
    }

    public static bo3 e(int i, rq3 rq3Var) throws IOException {
        int iB = p61.B(i);
        if (iB == 5) {
            return new iq3(rq3Var.r());
        }
        if (iB == 6) {
            return new iq3(new f44(rq3Var.r()));
        }
        if (iB == 7) {
            return new iq3(Boolean.valueOf(rq3Var.R()));
        }
        if (iB == 8) {
            rq3Var.X();
            return xp3.X;
        }
        bt.i("Unexpected token: ".concat(ie2.r(i)));
        return null;
    }

    public static void f(bo3 bo3Var, hs3 hs3Var) throws IOException {
        if (bo3Var == null || (bo3Var instanceof xp3)) {
            hs3Var.u();
            return;
        }
        if (bo3Var instanceof iq3) {
            iq3 iq3Var = (iq3) bo3Var;
            Serializable serializable = iq3Var.X;
            if (serializable instanceof Number) {
                hs3Var.a0(iq3Var.i());
                return;
            } else if (serializable instanceof Boolean) {
                hs3Var.u0(iq3Var.f());
                return;
            } else {
                hs3Var.c0(iq3Var.d());
                return;
            }
        }
        if (bo3Var instanceof en3) {
            hs3Var.Q0();
            Iterator it = bo3Var.b().X.iterator();
            while (it.hasNext()) {
                f((bo3) it.next(), hs3Var);
            }
            hs3Var.K0();
            return;
        }
        if (!(bo3Var instanceof bq3)) {
            c.a(bo3Var.getClass(), "Couldn't write ");
            return;
        }
        hs3Var.F0();
        Iterator it2 = ((wa4) bo3Var.c().X.entrySet()).iterator();
        while (((va4) it2).hasNext()) {
            xa4 xa4VarA = ((va4) it2).a();
            hs3Var.m((String) xa4VarA.getKey());
            f((bo3) xa4VarA.getValue(), hs3Var);
        }
        hs3Var.j0();
    }

    @Override // com.google.gson.b
    public final /* bridge */ /* synthetic */ Object b(rq3 rq3Var) {
        return d(rq3Var);
    }

    @Override // com.google.gson.b
    public final /* bridge */ /* synthetic */ void c(hs3 hs3Var, Object obj) throws IOException {
        f((bo3) obj, hs3Var);
    }
}
