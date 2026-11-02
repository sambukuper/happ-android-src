package androidx.work.impl.workers;

import defpackage.b71;
import defpackage.bt;
import defpackage.c71;
import defpackage.cc0;
import defpackage.dc4;
import defpackage.dn8;
import defpackage.ec4;
import defpackage.gv3;
import defpackage.l31;
import defpackage.l49;
import defpackage.lh4;
import defpackage.og7;
import defpackage.pi;
import defpackage.q51;
import defpackage.rn2;
import defpackage.uy7;
import defpackage.w39;
import defpackage.w51;
import defpackage.xb4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends uy7 implements rn2 {
    public xb4 g0;
    public og7 h0;
    public boolean i0;
    public /* synthetic */ Object j0;
    public final /* synthetic */ ec4 k0;
    public final /* synthetic */ cc0 l0;
    public final /* synthetic */ l49 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ec4 ec4Var, cc0 cc0Var, l49 l49Var, q51 q51Var) {
        super(2, q51Var);
        this.k0 = ec4Var;
        this.l0 = cc0Var;
        this.m0 = l49Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((a) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        a aVar = new a(this.k0, this.l0, this.m0, q51Var);
        aVar.j0 = obj;
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        og7 og7VarG;
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        xb4 xb4Var;
        boolean z = this.i0;
        ec4 ec4Var = this.k0;
        boolean z2 = true;
        try {
            try {
                if (!z) {
                    w39.n0(obj);
                    b71 b71Var = (b71) this.j0;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    xb4 xb4VarC = ec4Var.c();
                    og7VarG = w51.G(b71Var, null, null, new pi(this.l0, this.m0, atomicInteger2, xb4VarC, null, (byte) 2), 3);
                    try {
                        this.j0 = atomicInteger2;
                        this.g0 = xb4VarC;
                        this.h0 = og7VarG;
                        this.i0 = true;
                        obj = gv3.h(xb4VarC, this);
                        c71 c71Var = c71.X;
                        if (obj == c71Var) {
                            return c71Var;
                        }
                        atomicInteger = atomicInteger2;
                        xb4Var = xb4VarC;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        atomicInteger = atomicInteger2;
                        xb4Var = xb4VarC;
                        int i = l31.a;
                        lh4 lh4VarP0 = lh4.P0();
                        ec4Var.getClass().toString();
                        lh4VarP0.getClass();
                        if (atomicInteger.get() != -256) {
                            z2 = false;
                        }
                        if (xb4Var.isCancelled()) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    og7VarG = this.h0;
                    xb4Var = this.g0;
                    atomicInteger = (AtomicInteger) this.j0;
                    try {
                        w39.n0(obj);
                    } catch (CancellationException e2) {
                        cancellationException = e2;
                        int i2 = l31.a;
                        lh4 lh4VarP1 = lh4.P0();
                        ec4Var.getClass().toString();
                        lh4VarP1.getClass();
                        if (atomicInteger.get() != -256) {
                            z2 = false;
                        }
                        if (xb4Var.isCancelled() || !z2) {
                            throw cancellationException;
                        }
                        throw new ConstraintTrackingWorker.a(atomicInteger.get());
                    }
                }
                dc4 dc4Var = (dc4) obj;
                og7VarG.m(null);
                return dc4Var;
            } catch (Throwable th) {
                og7VarG.m(null);
                throw th;
            }
        } catch (Throwable th2) {
            int i3 = l31.a;
            lh4 lh4VarP2 = lh4.P0();
            ec4Var.getClass().toString();
            lh4VarP2.getClass();
            throw th2;
        }
    }
}
