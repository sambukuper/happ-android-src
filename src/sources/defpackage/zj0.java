package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ek0 Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ int f0;

    public /* synthetic */ zj0(ek0 ek0Var, List list, int i, byte b) {
        this.X = b;
        this.Y = ek0Var;
        this.Z = list;
        this.f0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ek0 ek0Var = this.Y;
                List list = this.Z;
                int i = this.f0;
                if (ek0Var.l.get() && ek0Var.k.equals(list)) {
                    hi5.z0("CameraPresencePrvdr");
                    bo5 bo5Var = ek0Var.h;
                    if (bo5Var != null) {
                        bo5Var.a();
                    }
                    ek0Var.d(i - 1, list);
                    break;
                }
                break;
            default:
                ek0 ek0Var2 = this.Y;
                ek0Var2.a.execute(new zj0(ek0Var2, this.Z, this.f0, (byte) 0));
                break;
        }
    }
}
