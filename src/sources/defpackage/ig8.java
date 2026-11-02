package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ig8 {
    public volatile boolean a;
    public final oh7 b;
    public final h76 c;
    public final u77 d;
    public final f76 e;

    public ig8() {
        oh7 oh7VarA = ph7.a(rg8.f0);
        this.b = oh7VarA;
        this.c = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, null);
        this.d = u77VarB;
        this.e = jm4.m(u77VarB);
    }

    public final boolean a() {
        int iOrdinal = ((rg8) this.c.X.getValue()).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3 && iOrdinal != 4) {
                        b61.c();
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(q51 q51Var) {
        hg8 hg8Var;
        dn8 dn8Var = dn8.a;
        if (q51Var instanceof hg8) {
            hg8Var = (hg8) q51Var;
            int i = hg8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                hg8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                hg8Var = new hg8(this, q51Var);
            }
        } else {
            hg8Var = new hg8(this, q51Var);
        }
        Object obj = hg8Var.f0;
        c71 c71Var = c71.X;
        int i2 = hg8Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            if (a() && !this.a) {
                u77 u77Var = this.d;
                hg8Var.h0 = 1;
                if (u77Var.l(dn8Var, hg8Var) == c71Var) {
                    return c71Var;
                }
            }
            return dn8Var;
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        this.a = true;
        return dn8Var;
    }
}
