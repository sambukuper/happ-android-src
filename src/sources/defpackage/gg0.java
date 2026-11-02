package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 extends wl6 {
    public static final zx j0;
    public static final zx k0;
    public static final zx l0;
    public static final zx m0;
    public static final zx n0;
    public static final zx o0;
    public static final zx p0;

    static {
        Class cls = Integer.TYPE;
        cls.getClass();
        j0 = new zx("camera2.captureRequest.templateType", cls, null);
        k0 = new zx("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
        l0 = new zx("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
        m0 = new zx("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
        Class cls2 = Long.TYPE;
        cls2.getClass();
        n0 = new zx("camera2.cameraCaptureSession.streamUseCase", cls2, null);
        o0 = new zx("camera2.cameraCaptureSession.streamUseHint", cls2, null);
        p0 = new zx("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }
}
