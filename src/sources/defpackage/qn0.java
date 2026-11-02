package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qn0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ long j0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(wa7 wa7Var, long j, ya7 ya7Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = wa7Var;
        this.j0 = j;
        this.k0 = ya7Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((qn0) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        long j = this.j0;
        Object obj2 = this.k0;
        switch (b) {
            case 0:
                qn0 qn0Var = new qn0(j, (sn0) obj2, q51Var);
                qn0Var.i0 = obj;
                return qn0Var;
            case 1:
                qn0 qn0Var2 = new qn0((kv1) obj2, j, q51Var);
                qn0Var2.i0 = obj;
                return qn0Var2;
            default:
                return new qn0((wa7) this.i0, this.j0, (ya7) obj2, q51Var);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Exception {
        Object objA;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        long j = this.j0;
        c71 c71Var = c71.X;
        Object obj2 = this.k0;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    Objects.toString((b71) this.i0);
                    this.h0 = true;
                    if (u70.F(j, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                ((sn0) obj2).m(0L);
                return dn8Var;
            case 1:
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                b71 b71Var = (b71) this.i0;
                sn2 sn2Var = ((kv1) obj2).N0;
                z85 z85Var = new z85(j);
                this.h0 = true;
                return sn2Var.x(b71Var, z85Var, this) == c71Var ? c71Var : dn8Var;
            default:
                ya7 ya7Var = (ya7) obj2;
                wa7 wa7Var = (wa7) this.i0;
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    oi oiVar = wa7Var.a;
                    pf3 pf3Var = new pf3(j);
                    wf7 wf7Var = ya7Var.r0;
                    this.h0 = true;
                    objA = oi.a(oiVar, pf3Var, wf7Var, null, this, 12);
                    if (objA == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objA = obj;
                }
                hk hkVar = ((nk) objA).b;
                return dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(kv1 kv1Var, long j, q51 q51Var) {
        super(2, q51Var);
        this.k0 = kv1Var;
        this.j0 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(long j, sn0 sn0Var, q51 q51Var) {
        super(2, q51Var);
        this.j0 = j;
        this.k0 = sn0Var;
    }
}
