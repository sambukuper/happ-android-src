package androidx.camera.camera2;

import defpackage.am0;
import defpackage.bm0;
import defpackage.fg0;
import defpackage.gi0;
import defpackage.k05;
import defpackage.qd5;
import defpackage.uf0;
import defpackage.vf0;
import defpackage.zx;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/camera/camera2/Camera2Config$DefaultProvider", "Lam0;", "<init>", "()V", "Lbm0;", "getCameraXConfig", "()Lbm0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2Config$DefaultProvider implements am0 {
    @Override // defpackage.am0
    public bm0 getCameraXConfig() {
        gi0 gi0Var = new gi0();
        fg0 fg0Var = new fg0((byte) 1);
        zx zxVar = bm0.Y;
        k05 k05Var = fg0Var.Y;
        k05Var.o(zxVar, gi0Var);
        k05Var.o(bm0.Z, new uf0());
        k05Var.o(bm0.f0, new vf0());
        k05Var.o(bm0.n0, Boolean.TRUE);
        return new bm0(qd5.c(k05Var));
    }
}
