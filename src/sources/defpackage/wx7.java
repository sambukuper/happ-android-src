package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wx7 extends wg1 {
    public final ud0 n;
    public final qd0 o;
    public wg1 p;
    public by7 q;

    public wx7(int i, Size size) {
        super(i, size);
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            this.o = qd0Var;
            qd0Var.a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            ud0Var.b(e);
        }
        this.n = ud0Var;
    }

    @Override // defpackage.wg1
    public final void a() {
        super.a();
        s08.g(new tx7(this, (byte) 2));
    }

    @Override // defpackage.wg1
    public final xb4 f() {
        return this.n;
    }

    public final boolean g(wg1 wg1Var, Runnable runnable) {
        boolean z;
        Size size = this.h;
        s08.b();
        wg1Var.getClass();
        int i = wg1Var.i;
        Size size2 = wg1Var.h;
        wg1 wg1Var2 = this.p;
        if (wg1Var2 == wg1Var) {
            return false;
        }
        mb6.s("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", wg1Var2 == null);
        mb6.o(size.equals(size2), "The provider's size(" + size + ") must match the parent(" + size2 + ")");
        int i2 = this.i;
        mb6.o(i2 == i, pc6.k(i2, "The provider's format(", i, ") must match the parent(", ")"));
        synchronized (this.a) {
            z = this.c;
        }
        mb6.s("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.p = wg1Var;
        vr3.T(true, wg1Var.c(), this.o, dp1.a());
        wg1Var.d();
        vr3.P(this.e).a(new tg1(wg1Var, (byte) 2), dp1.a());
        vr3.P(wg1Var.g).a(runnable, km4.J());
        return true;
    }
}
