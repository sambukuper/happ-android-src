package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cg0 implements dg0 {
    public final CameraDevice.CameraDeviceSetup a;
    public final String b;
    public final eg0 c;

    public cg0(CameraDevice.CameraDeviceSetup cameraDeviceSetup, String str, eg0 eg0Var) {
        str.getClass();
        eg0Var.getClass();
        this.a = cameraDeviceSetup;
        this.b = str;
        this.c = eg0Var;
    }

    public final CaptureRequest.Builder a(int i) throws Exception {
        try {
            return this.a.createCaptureRequest(i);
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            String str = this.b;
            eg0 eg0Var = this.c;
            if (!z) {
                if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    eg0Var.a(9, str, false);
                    return null;
                }
                if (e instanceof IllegalStateException) {
                    return null;
                }
                throw e;
            }
            e.getMessage();
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    cameraAccessException.toString();
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            eg0Var.a(i2, str, true);
            return null;
        }
    }
}
