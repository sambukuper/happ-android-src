package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xw0 extends uy7 implements rn2 {
    public boolean g0;
    public final /* synthetic */ xe2[] h0;
    public final /* synthetic */ int i0;
    public final /* synthetic */ AtomicInteger j0;
    public final /* synthetic */ x90 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(xe2[] xe2VarArr, int i, AtomicInteger atomicInteger, x90 x90Var, q51 q51Var) {
        super(2, q51Var);
        this.h0 = xe2VarArr;
        this.i0 = i;
        this.j0 = atomicInteger;
        this.k0 = x90Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((xw0) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new xw0(this.h0, this.i0, this.j0, this.k0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        boolean z = this.g0;
        AtomicInteger atomicInteger = this.j0;
        x90 x90Var = this.k0;
        try {
            if (!z) {
                w39.n0(obj);
                xe2[] xe2VarArr = this.h0;
                int i = this.i0;
                xe2 xe2Var = xe2VarArr[i];
                ww0 ww0Var = new ww0(x90Var, i);
                this.g0 = true;
                Object objA = xe2Var.a(ww0Var, this);
                c71 c71Var = c71.X;
                if (objA == c71Var) {
                    return c71Var;
                }
            } else {
                if (!z) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                x90Var.d(null);
            }
            return dn8.a;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                x90Var.d(null);
            }
            throw th;
        }
    }
}
