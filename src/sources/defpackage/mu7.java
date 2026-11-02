package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class mu7 extends xw8 {
    public final oh7 b;
    public final h76 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mu7() {
        oh7 oh7VarA = ph7.a(gu7.a);
        this.b = oh7VarA;
        this.c = jm4.n(oh7VarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(lu7 lu7Var) {
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        Object value3;
        boolean z = lu7Var instanceof iu7;
        oh7 oh7Var = this.b;
        if (z) {
            kw4 kw4Var = kw4.a;
            boolean zC = kw4.l().c("pref_reject_duplicates_subscription", true);
            boolean zC2 = kw4.l().c("pref_use_legacy_okhttp", false);
            oh7Var.getClass();
            do {
                value3 = oh7Var.getValue();
                ((hu7) value3).getClass();
            } while (!oh7Var.k(value3, new fu7(zC, zC2)));
            return;
        }
        boolean z2 = lu7Var instanceof ju7;
        gu7 gu7Var = gu7.a;
        if (z2) {
            boolean z3 = ((ju7) lu7Var).a;
            oh7Var.getClass();
            do {
                value2 = oh7Var.getValue();
                hu7 hu7Var = (hu7) value2;
                hu7Var.getClass();
                if (hu7Var instanceof fu7) {
                    objA2 = fu7.a((fu7) hu7Var, z3, false, 2);
                } else {
                    if (!(hu7Var instanceof gu7)) {
                        b61.c();
                        return;
                    }
                    objA2 = gu7Var;
                }
            } while (!oh7Var.k(value2, objA2));
            kw4 kw4Var2 = kw4.a;
            kw4.l().p("pref_reject_duplicates_subscription", z3);
            return;
        }
        if (!(lu7Var instanceof ku7)) {
            b61.c();
            return;
        }
        boolean z4 = ((ku7) lu7Var).a;
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            hu7 hu7Var2 = (hu7) value;
            hu7Var2.getClass();
            if (hu7Var2 instanceof fu7) {
                objA = fu7.a((fu7) hu7Var2, false, z4, 1);
            } else {
                if (!(hu7Var2 instanceof gu7)) {
                    b61.c();
                    return;
                }
                objA = gu7Var;
            }
        } while (!oh7Var.k(value, objA));
        kw4 kw4Var3 = kw4.a;
        kw4.l().p("pref_use_legacy_okhttp", z4);
    }
}
