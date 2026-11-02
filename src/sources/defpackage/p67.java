package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class p67 extends xw8 {
    public final vz7 b = new vz7(new r47((byte) 5));
    public final oh7 c;
    public final h76 d;
    public final u77 e;
    public final f76 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p67() {
        oh7 oh7VarA = ph7.a(new e67(false, false));
        this.c = oh7VarA;
        this.d = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.e = u77VarB;
        this.f = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(s51 s51Var) {
        o67 o67Var;
        Object value;
        e67 e67Var;
        Object value2;
        e67 e67Var2;
        if (s51Var instanceof o67) {
            o67Var = (o67) s51Var;
            int i = o67Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o67Var.h0 = i - Integer.MIN_VALUE;
            } else {
                o67Var = new o67(this, s51Var);
            }
        } else {
            o67Var = new o67(this, s51Var);
        }
        Object objA = o67Var.f0;
        int i2 = o67Var.h0;
        c71 c71Var = c71.X;
        oh7 oh7Var = this.c;
        dn8 dn8Var = dn8.a;
        if (i2 == 0) {
            w39.n0(objA);
            if (!((e67) this.d.X.getValue()).b) {
                oh7Var.getClass();
                do {
                    value = oh7Var.getValue();
                    e67Var = (e67) value;
                    e67Var.getClass();
                } while (!oh7Var.k(value, e67.a(e67Var, false, true, 1)));
                mq0 mq0Var = (mq0) this.b.getValue();
                o67Var.h0 = 1;
                objA = mq0Var.a(o67Var);
                if (objA != c71Var) {
                }
                return c71Var;
            }
            return dn8Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                w39.n0(objA);
                return dn8Var;
            }
            if (i2 == 3) {
                w39.n0(objA);
                return dn8Var;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(objA);
        ja3 ja3Var = (ja3) objA;
        oh7Var.getClass();
        do {
            value2 = oh7Var.getValue();
            e67Var2 = (e67) value2;
            e67Var2.getClass();
        } while (!oh7Var.k(value2, e67.a(e67Var2, false, false, 1)));
        u77 u77Var = this.e;
        if (ja3Var == null) {
            o67Var.h0 = 2;
            Object objL = u77Var.l(g67.a, o67Var);
            if (objL != c71Var) {
                objL = dn8Var;
            }
            if (objL == c71Var) {
                return c71Var;
            }
            return dn8Var;
        }
        f67 f67Var = new f67(ja3Var);
        o67Var.h0 = 3;
        Object objL2 = u77Var.l(f67Var, o67Var);
        if (objL2 != c71Var) {
            objL2 = dn8Var;
        }
        if (objL2 == c71Var) {
            return c71Var;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(l67 l67Var) {
        Object value;
        e67 e67Var;
        Object value2;
        e67 e67Var2;
        if (l67Var instanceof i67) {
            jm4.Q(zw8.a(this), (u61) null, new r5(this, (q51) null, (byte) 29), 3);
            return;
        }
        boolean z = l67Var instanceof k67;
        oh7 oh7Var = this.c;
        if (z) {
            oh7Var.getClass();
            do {
                value2 = oh7Var.getValue();
                e67Var2 = (e67) value2;
                e67Var2.getClass();
            } while (!oh7Var.k(value2, e67.a(e67Var2, true, false, 2)));
            return;
        }
        if (!(l67Var instanceof j67)) {
            b61.c();
            return;
        }
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            e67Var = (e67) value;
            e67Var.getClass();
        } while (!oh7Var.k(value, e67.a(e67Var, false, false, 2)));
    }
}
