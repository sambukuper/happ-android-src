package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pg0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ol0 Y;
    public final /* synthetic */ CameraCaptureSession Z;
    public final /* synthetic */ CaptureRequest f0;
    public final /* synthetic */ long g0;
    public final /* synthetic */ long h0;

    public /* synthetic */ pg0(ol0 ol0Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2, byte b) {
        this.X = b;
        this.Y = ol0Var;
        this.Z = cameraCaptureSession;
        this.f0 = captureRequest;
        this.g0 = j;
        this.h0 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        ol0 ol0Var = this.Y;
        switch (b) {
            case 0:
                ol0Var.a.onCaptureStarted(this.Z, this.f0, this.g0, this.h0);
                break;
            default:
                u3.x(ol0Var.a, this.Z, this.f0, this.g0, this.h0);
                break;
        }
    }
}
