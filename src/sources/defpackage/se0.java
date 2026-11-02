package defpackage;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class se0 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ kv5 a;

    public se0(kv5 kv5Var) {
        this.a = kv5Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        vi0.a(str);
        jm4.c0(this.a, new vi0(str));
    }
}
