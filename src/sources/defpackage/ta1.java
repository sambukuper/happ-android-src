package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ta1 extends uy7 implements sn2 {
    public final /* synthetic */ byte g0 = 1;
    public boolean h0;
    public /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta1(ib1 ib1Var, q51 q51Var) {
        super(3, q51Var);
        this.i0 = ib1Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws IOException {
        byte b = this.g0;
        c71 c71Var = c71.X;
        byte b2 = 1;
        q51 q51Var = null;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    ib1 ib1Var = (ib1) this.i0;
                    this.h0 = true;
                    if (ib1Var.a(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            default:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    k92 k92Var = (k92) this.i0;
                    this.h0 = true;
                    if (!k92Var.b.get()) {
                        Object objK0 = w39.k0(k92Var.a, new cb1(k92Var, q51Var, b2), this);
                        return objK0 == c71Var ? c71Var : objK0;
                    }
                    bt.i("This scope has already been closed.");
                } else {
                    if (z2) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return new ta1((ib1) this.i0, (q51) obj3).q(dn8Var);
            default:
                ((Boolean) obj2).getClass();
                ta1 ta1Var = new ta1(3, (q51) obj3);
                ta1Var.i0 = (k92) obj;
                return ta1Var.q(dn8Var);
        }
    }

    public /* synthetic */ ta1(int i, q51 q51Var) {
        super(i, q51Var);
    }
}
