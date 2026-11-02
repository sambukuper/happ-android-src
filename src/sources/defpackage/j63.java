package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j63 implements xj2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ n63 Y;

    public /* synthetic */ j63(n63 n63Var, n63 n63Var2, byte b) {
        this.X = b;
        this.Y = n63Var2;
    }

    @Override // defpackage.xj2
    public final void c(yj2 yj2Var) throws Exception {
        byte b = this.X;
        n63 n63Var = this.Y;
        switch (b) {
            case 0:
                int i = ImageProcessingUtil.a;
                n63Var.close();
                break;
            default:
                int i2 = ImageProcessingUtil.a;
                n63Var.close();
                break;
        }
    }
}
