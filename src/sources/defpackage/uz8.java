package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class uz8 extends xw8 {
    public final vz7 b = new vz7(new ng8((byte) 18));
    public final oh7 c;
    public final h76 d;
    public final u77 e;
    public final f76 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uz8() {
        oh7 oh7VarA = ph7.a(new rz8(false));
        this.c = oh7VarA;
        this.d = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.e = u77VarB;
        this.f = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object e(uy7 uy7Var) {
        Object objB = ((ig8) this.b.getValue()).b(uy7Var);
        return objB == c71.X ? objB : dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void f(s51 s51Var) {
        tz8 tz8Var;
        if (s51Var instanceof tz8) {
            tz8Var = (tz8) s51Var;
            int i = tz8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                tz8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                tz8Var = new tz8(this, s51Var);
            }
        } else {
            tz8Var = new tz8(this, s51Var);
        }
        Object obj = tz8Var.f0;
        int i2 = tz8Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            f76 f76Var = ((ig8) this.b.getValue()).e;
            ym7 ym7Var = new ym7(this, null, (byte) 12);
            tz8Var.h0 = 1;
            if (z91.n(f76Var, ym7Var, tz8Var) == c71.X) {
                return;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w39.n0(obj);
        }
        bt.i("SharedFlow never completes, this call should never return.");
    }
}
