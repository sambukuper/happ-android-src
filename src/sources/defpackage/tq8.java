package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tq8 extends uy7 implements gn2 {
    public int g0;
    public boolean h0;
    public final /* synthetic */ wq8 i0;
    public final /* synthetic */ int j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq8(wq8 wq8Var, int i, q51 q51Var) {
        super(1, q51Var);
        this.i0 = wq8Var;
        this.j0 = i;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return ((tq8) m((q51) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        return new tq8(this.i0, this.j0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        int i;
        ux0 ux0VarA;
        boolean z = this.h0;
        try {
            if (!z) {
                w39.n0(obj);
                hi5.i0("CXCP");
                wq8 wq8Var = this.i0;
                int i2 = this.j0;
                qi0 qi0VarA = wq8Var.c.a();
                this.g0 = i2;
                this.h0 = true;
                obj = qi0VarA.k(this);
                c71 c71Var = c71.X;
                if (obj == c71Var) {
                    return c71Var;
                }
                i = i2;
            } else {
                if (!z) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.g0;
                w39.n0(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                ti0 ti0Var = (ti0) autoCloseable;
                s7 s7Var = new s7(i);
                if (ti0Var.X.a()) {
                    om0.l("Cannot call setTorchOff on ", ti0Var, " after close.");
                    ux0VarA = null;
                } else {
                    u51 u51Var = ti0Var.Z;
                    u51Var.getClass();
                    ux0VarA = u51.a(u51Var, s7Var, null, null, new qd2(0), null, null, null, 118);
                }
                u15.h(autoCloseable, null);
                return ux0VarA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u15.h(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (CancellationException unused) {
            hi5.i0("CXCP");
            return wq8.l;
        }
    }
}
