package defpackage;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ya extends xa {
    public final CameraConstrainedHighSpeedCaptureSession g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(za zaVar, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, eg0 eg0Var, Handler handler) {
        super(zaVar, cameraConstrainedHighSpeedCaptureSession, eg0Var, handler);
        eg0Var.getClass();
        handler.getClass();
        this.g0 = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // defpackage.xa, defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        return zu3Var.equals(yb6.a.b(CameraConstrainedHighSpeedCaptureSession.class)) ? this.g0 : super.C0(zu3Var);
    }
}
