package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n41 extends uy7 implements rn2 {
    public boolean g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ o41 i0;
    public final /* synthetic */ qo8 j0;
    public final /* synthetic */ w80 k0;
    public final /* synthetic */ long l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n41(o41 o41Var, qo8 qo8Var, w80 w80Var, long j, q51 q51Var) {
        super(2, q51Var);
        this.i0 = o41Var;
        this.j0 = qo8Var;
        this.k0 = w80Var;
        this.l0 = j;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((n41) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        n41 n41Var = new n41(this.i0, this.j0, this.k0, this.l0, q51Var);
        n41Var.h0 = obj;
        return n41Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        o41 o41Var = this.i0;
        yr2 yr2Var = o41Var.v0;
        boolean z = this.g0;
        try {
            try {
                if (!z) {
                    w39.n0(obj);
                    bm3 bm3VarQ = u70.Q(((b71) this.h0).getCoroutineContext());
                    o41Var.y0 = true;
                    sy6 sy6Var = o41Var.r0;
                    f15 f15Var = f15.X;
                    m41 m41Var = new m41(this.j0, o41Var, this.k0, this.l0, bm3VarQ, null);
                    this.g0 = true;
                    Object objG = sy6Var.g(f15Var, m41Var, this);
                    c71 c71Var = c71.X;
                    if (objG == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                yr2Var.t();
                o41Var.y0 = false;
                yr2Var.i(null);
                o41Var.w0 = false;
                return dn8.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            o41Var.y0 = false;
            yr2Var.i(null);
            o41Var.w0 = false;
            throw th;
        }
    }
}
