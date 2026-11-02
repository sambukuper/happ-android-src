package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 {
    public final oh7 a;

    public jb1() {
        this.a = ph7.a(sl8.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void a(qp0 qp0Var, s51 s51Var) {
        t85 t85Var;
        if (s51Var instanceof t85) {
            t85Var = (t85) s51Var;
            int i = t85Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                t85Var.h0 = i - Integer.MIN_VALUE;
            } else {
                t85Var = new t85(this, s51Var);
            }
        } else {
            t85Var = new t85(this, s51Var);
        }
        Object obj = t85Var.f0;
        int i2 = t85Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            t85Var.h0 = 1;
            this.a.a(qp0Var, t85Var);
        } else if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
        } else {
            w39.n0(obj);
            b61.n();
        }
    }

    public hh7 b() {
        return (hh7) this.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    public void c(hh7 hh7Var) {
        oh7 oh7Var;
        Object value;
        hh7 hh7Var2;
        hh7Var.getClass();
        do {
            oh7Var = this.a;
            value = oh7Var.getValue();
            hh7Var2 = (hh7) value;
            if ((hh7Var2 instanceof u66) || dh3.f(hh7Var2, sl8.b)) {
                hh7Var2 = hh7Var;
            } else if (hh7Var2 instanceof v91) {
                if (hh7Var.a > ((v91) hh7Var2).a) {
                    hh7Var2 = hh7Var;
                }
            } else if (!(hh7Var2 instanceof ma2)) {
                if (hh7Var2 instanceof a55) {
                    bt.i("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return;
                } else {
                    b61.c();
                    return;
                }
            }
        } while (!oh7Var.k(value, hh7Var2));
    }

    public jb1(int i) {
        this.a = ph7.a(new int[i]);
    }
}
