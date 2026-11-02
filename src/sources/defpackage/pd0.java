package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pd0 extends kp0 {
    public final rn2 f0;
    public final rn2 g0;

    public pd0(rn2 rn2Var, s61 s61Var, int i, l90 l90Var) {
        super(s61Var, i, l90Var);
        this.f0 = rn2Var;
        this.g0 = rn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kp0
    public final Object d(kv5 kv5Var, q51 q51Var) {
        od0 od0Var;
        if (q51Var instanceof od0) {
            od0Var = (od0) q51Var;
            int i = od0Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                od0Var.i0 = i - Integer.MIN_VALUE;
            } else {
                od0Var = new od0(this, (s51) q51Var);
            }
        } else {
            od0Var = new od0(this, (s51) q51Var);
        }
        Object obj = od0Var.g0;
        int i2 = od0Var.i0;
        dn8 dn8Var = dn8.a;
        if (i2 == 0) {
            w39.n0(obj);
            od0Var.f0 = kv5Var;
            od0Var.i0 = 1;
            Object objK = this.f0.K(kv5Var, od0Var);
            c71 c71Var = c71.X;
            if (objK != c71Var) {
                objK = dn8Var;
            }
            if (objK == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kv5Var = od0Var.f0;
            w39.n0(obj);
        }
        if (kv5Var.g0.A()) {
            return dn8Var;
        }
        bt.i("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // defpackage.kp0
    public final kp0 f(s61 s61Var, int i, l90 l90Var) {
        return new pd0(this.g0, s61Var, i, l90Var);
    }

    @Override // defpackage.kp0
    public final String toString() {
        return "block[" + this.f0 + "] -> " + super.toString();
    }
}
