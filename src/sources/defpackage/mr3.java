package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mr3 extends qj6 implements sn2 {
    public boolean Z;
    public /* synthetic */ xd1 f0;
    public final /* synthetic */ fc0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr3(fc0 fc0Var, q51 q51Var) {
        super(3, q51Var);
        this.g0 = fc0Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        fc0 fc0Var = this.g0;
        d7 d7Var = (d7) fc0Var.c;
        xd1 xd1Var = this.f0;
        boolean z = this.Z;
        if (!z) {
            w39.n0(obj);
            byte bE = d7Var.E();
            if (bE == 1) {
                return fc0Var.i(true);
            }
            if (bE == 0) {
                return fc0Var.i(false);
            }
            if (bE != 6) {
                if (bE == 8) {
                    return fc0Var.g();
                }
                d7.s(d7Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f0 = null;
            this.Z = true;
            obj = fc0Var.h(xd1Var, this);
            c71 c71Var = c71.X;
            if (obj == c71Var) {
                return c71Var;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return (ao3) obj;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        mr3 mr3Var = new mr3(this.g0, (q51) obj3);
        mr3Var.f0 = (xd1) obj;
        return mr3Var.q(dn8.a);
    }
}
