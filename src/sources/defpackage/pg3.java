package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pg3 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ dn2 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg3(dn2 dn2Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = dn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((pg3) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                ((pg3) n((q51) obj2, (ov5) obj)).q(dn8Var);
                return dn8Var;
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        dn2 dn2Var = this.i0;
        switch (b) {
            case 0:
                pg3 pg3Var = new pg3(dn2Var, q51Var, (byte) 0);
                pg3Var.h0 = obj;
                return pg3Var;
            default:
                pg3 pg3Var2 = new pg3(dn2Var, q51Var, (byte) 1);
                pg3Var2.h0 = obj;
                return pg3Var2;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        Unsafe unsafe;
        long j;
        int intVolatile;
        byte b = this.g0;
        dn2 dn2Var = this.i0;
        Object obj2 = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                s61 coroutineContext = ((b71) obj2).getCoroutineContext();
                try {
                    o98 o98Var = new o98();
                    o98Var.h0 = u70.W(u70.Q(coroutineContext), true, o98Var);
                    try {
                        do {
                            unsafe = iu.a;
                            j = o98.i0;
                            intVolatile = unsafe.getIntVolatile(o98Var, j);
                            if (intVolatile != 0) {
                                if (intVolatile != 2 && intVolatile != 3) {
                                    o98.p(intVolatile);
                                    throw null;
                                }
                            }
                            return dn2Var.invoke();
                        } while (!unsafe.compareAndSwapInt(o98Var, j, intVolatile, 0));
                        return dn2Var.invoke();
                    } finally {
                        o98Var.o();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            default:
                ov5 ov5Var = (ov5) obj2;
                w39.n0(obj);
                if (ov5Var != null) {
                    dn2Var.invoke();
                    return dn8.a;
                }
                b61.c();
                return null;
        }
    }
}
