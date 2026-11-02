package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ga9 implements za9, ab5, na5, ba5 {
    public final /* synthetic */ byte X;
    public final Executor Y;
    public final r51 Z;
    public final fb9 f0;

    public /* synthetic */ ga9(Executor executor, r51 r51Var, fb9 fb9Var, byte b) {
        this.X = b;
        this.Y = executor;
        this.Z = r51Var;
        this.f0 = fb9Var;
    }

    @Override // defpackage.za9
    public final void a(fb9 fb9Var) {
        byte b = this.X;
        Executor executor = this.Y;
        boolean z = false;
        switch (b) {
            case 0:
                executor.execute(new zo2((byte) 18, this, fb9Var, z));
                break;
            default:
                executor.execute(new zo2((byte) 19, this, fb9Var, z));
                break;
        }
    }

    @Override // defpackage.ab5
    public void b(Object obj) {
        this.f0.j(obj);
    }

    @Override // defpackage.ba5
    public void c() {
        this.f0.l();
    }

    @Override // defpackage.na5
    public void d(Exception exc) {
        this.f0.k(exc);
    }
}
