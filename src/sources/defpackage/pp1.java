package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pp1 extends fx6 {
    public static final /* synthetic */ long h0 = iu.a.objectFieldOffset(pp1.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.fx6, defpackage.rm3
    public final void d(Object obj) {
        e(obj);
    }

    @Override // defpackage.fx6, defpackage.rm3
    public final void e(Object obj) {
        while (true) {
            Unsafe unsafe = iu.a;
            long j = h0;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    op1.a(mb6.H(this.g0), gv3.Q(obj));
                    return;
                } else {
                    bt.i("Already resumed");
                    return;
                }
            }
            pp1 pp1Var = this;
            if (unsafe.compareAndSwapInt(pp1Var, j, 0, 2)) {
                return;
            } else {
                this = pp1Var;
            }
        }
    }
}
