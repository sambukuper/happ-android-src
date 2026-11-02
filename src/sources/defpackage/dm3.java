package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class dm3 extends rm3 {
    public final boolean f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm3(bm3 bm3Var) {
        super(true);
        boolean z = true;
        P(bm3Var);
        Unsafe unsafe = iu.a;
        long j = rm3.X;
        ir0 ir0Var = (ir0) unsafe.getObjectVolatile(this, j);
        jr0 jr0Var = ir0Var instanceof jr0 ? (jr0) ir0Var : null;
        if (jr0Var == null) {
            z = false;
            break;
        }
        rm3 rm3VarJ = jr0Var.j();
        while (!rm3VarJ.I()) {
            ir0 ir0Var2 = (ir0) iu.a.getObjectVolatile(rm3VarJ, j);
            jr0 jr0Var2 = ir0Var2 instanceof jr0 ? (jr0) ir0Var2 : null;
            if (jr0Var2 == null) {
                z = false;
                break;
            }
            rm3VarJ = jr0Var2.j();
        }
        this.f0 = z;
    }

    @Override // defpackage.rm3
    public final boolean I() {
        return this.f0;
    }

    @Override // defpackage.rm3
    public final boolean K() {
        return true;
    }
}
