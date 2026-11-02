package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zz extends gm3 {
    public static final /* synthetic */ long j0 = iu.a.objectFieldOffset(zz.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final mm0 g0;
    public gq1 h0;
    public final /* synthetic */ b00 i0;

    public zz(b00 b00Var, mm0 mm0Var) {
        this.i0 = b00Var;
        this.g0 = mm0Var;
    }

    @Override // defpackage.gm3
    public final void n(Throwable th) {
        mm0 mm0Var = this.g0;
        if (th != null) {
            z31 z31VarH = mm0Var.H(new xx0(th, false), null);
            if (z31VarH != null) {
                mm0Var.E(z31VarH);
                a00 a00Var = (a00) iu.a.getObjectVolatile(this, j0);
                if (a00Var != null) {
                    a00Var.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b00.b;
        b00 b00Var = this.i0;
        if (atomicIntegerFieldUpdater.decrementAndGet(b00Var) == 0) {
            xg1[] xg1VarArr = b00Var.a;
            ArrayList arrayList = new ArrayList(xg1VarArr.length);
            for (xg1 xg1Var : xg1VarArr) {
                arrayList.add(xg1Var.p());
            }
            mm0Var.f(arrayList);
        }
    }
}
