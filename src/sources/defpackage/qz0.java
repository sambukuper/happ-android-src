package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qz0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qz0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((og7) obj).m(null);
                break;
            default:
                kd8 kd8Var = (kd8) obj;
                y68 y68Var = kd8Var.a;
                de3 de3Var = kd8Var.b;
                y68Var.b.a().A();
                g48 g48Var = y68Var.b;
                g48Var.l0 = null;
                kd8Var.l(g48Var);
                y68Var.b(de3Var, true, e58.X);
                y68Var.f(true);
                y68Var.e(y68Var.b.g0);
                break;
        }
    }
}
