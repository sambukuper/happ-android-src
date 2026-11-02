package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hs5 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ rn2 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs5(rn2 rn2Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = rn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((hs5) n((q51) obj2, (o05) obj)).q(dn8Var);
            case 1:
                return ((hs5) n((q51) obj2, (o05) obj)).q(dn8Var);
            default:
                return ((hs5) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        rn2 rn2Var = this.j0;
        switch (b) {
            case 0:
                hs5 hs5Var = new hs5(rn2Var, q51Var, (byte) 0);
                hs5Var.i0 = obj;
                return hs5Var;
            case 1:
                hs5 hs5Var2 = new hs5(rn2Var, q51Var, (byte) 1);
                hs5Var2.i0 = obj;
                return hs5Var2;
            default:
                hs5 hs5Var3 = new hs5(rn2Var, q51Var, (byte) 2);
                hs5Var3.i0 = obj;
                return hs5Var3;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        rn2 rn2Var = this.j0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    o05 o05Var = (o05) this.i0;
                    this.h0 = true;
                    obj = rn2Var.K(o05Var, this);
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
                o05 o05Var2 = (o05) obj;
                o05Var2.getClass();
                ((AtomicBoolean) o05Var2.b.Y).set(true);
                return o05Var2;
            case 1:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    o05 o05Var3 = new o05(new LinkedHashMap(((o05) this.i0).a()), false);
                    this.i0 = o05Var3;
                    this.h0 = true;
                    return rn2Var.K(o05Var3, this) == c71Var ? c71Var : o05Var3;
                }
                if (!z2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o05 o05Var4 = (o05) this.i0;
                w39.n0(obj);
                return o05Var4;
            default:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    b71 b71Var = (b71) this.i0;
                    this.h0 = true;
                    if (rn2Var.K(b71Var, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
        }
    }
}
