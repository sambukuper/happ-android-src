package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ty1 extends pu {
    public final /* synthetic */ uy1 B;

    public ty1(uy1 uy1Var) {
        this.B = uy1Var;
    }

    @Override // defpackage.pu
    public final void D(Throwable th) {
        this.B.a.f(th);
    }

    @Override // defpackage.pu
    public final void E(z47 z47Var) {
        uy1 uy1Var = this.B;
        uy1Var.c = z47Var;
        z47 z47Var2 = uy1Var.c;
        yy1 yy1Var = uy1Var.a;
        uy1Var.b = new lr(z47Var2, yy1Var.g, yy1Var.i, Build.VERSION.SDK_INT >= 34 ? fz1.a() : u70.P());
        yy1 yy1Var2 = uy1Var.a;
        ArrayList arrayList = new ArrayList();
        yy1Var2.a.writeLock().lock();
        try {
            yy1Var2.c = (byte) 1;
            arrayList.addAll(yy1Var2.b);
            yy1Var2.b.clear();
            yy1Var2.a.writeLock().unlock();
            yy1Var2.d.post(new wy1(arrayList, yy1Var2.c, null));
        } catch (Throwable th) {
            yy1Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
