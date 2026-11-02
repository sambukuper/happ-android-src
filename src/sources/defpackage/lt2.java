package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lt2 {
    public final q15 a = r15.a();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s51 s51Var) {
        kt2 kt2Var;
        q15 q15Var;
        if (s51Var instanceof kt2) {
            kt2Var = (kt2) s51Var;
            int i = kt2Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                kt2Var.i0 = i - Integer.MIN_VALUE;
            } else {
                kt2Var = new kt2(this, s51Var);
            }
        } else {
            kt2Var = new kt2(this, s51Var);
        }
        Object obj = kt2Var.g0;
        int i2 = kt2Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            q15Var = this.a;
            kt2Var.f0 = q15Var;
            kt2Var.i0 = 1;
            Object objG = q15Var.g(kt2Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q15Var = kt2Var.f0;
            w39.n0(obj);
        }
        return new s15(q15Var);
    }
}
