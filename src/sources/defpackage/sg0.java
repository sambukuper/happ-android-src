package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sg0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ol0 Y;
    public final /* synthetic */ CameraCaptureSession Z;
    public final /* synthetic */ CaptureRequest f0;
    public final /* synthetic */ CaptureResult g0;

    public /* synthetic */ sg0(ol0 ol0Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult, byte b) {
        this.X = b;
        this.Y = ol0Var;
        this.Z = cameraCaptureSession;
        this.f0 = captureRequest;
        this.g0 = captureResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        CaptureResult captureResult = this.g0;
        CaptureRequest captureRequest = this.f0;
        CameraCaptureSession cameraCaptureSession = this.Z;
        ol0 ol0Var = this.Y;
        switch (b) {
            case 0:
                ol0Var.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
            default:
                ol0Var.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }
}
