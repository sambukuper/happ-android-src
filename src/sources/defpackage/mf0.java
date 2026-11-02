package defpackage;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mf0 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ kv5 b;
    public final /* synthetic */ Object c;

    public mf0(kv5 kv5Var, nf0 nf0Var) {
        this.b = kv5Var;
        this.c = nf0Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        switch (this.a) {
            case 0:
                jm4.c0(this.b, al0.a);
                break;
            default:
                super.onCameraAccessPrioritiesChanged();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        byte b = this.a;
        kv5 kv5Var = this.b;
        Object obj = this.c;
        str.getClass();
        switch (b) {
            case 0:
                if (str.equals(((nf0) obj).Y)) {
                    vi0.a(str);
                    jm4.c0(kv5Var, new zk0(str));
                    break;
                }
                break;
            default:
                ((zf0) obj).c(kv5Var, str, true);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        byte b = this.a;
        kv5 kv5Var = this.b;
        Object obj = this.c;
        str.getClass();
        switch (b) {
            case 0:
                if (str.equals(((nf0) obj).Y)) {
                    vi0.a(str);
                    jm4.c0(kv5Var, new bl0(str));
                    break;
                }
                break;
            default:
                ((zf0) obj).c(kv5Var, str, false);
                break;
        }
    }

    public mf0(zf0 zf0Var, kv5 kv5Var) {
        this.c = zf0Var;
        this.b = kv5Var;
    }
}
