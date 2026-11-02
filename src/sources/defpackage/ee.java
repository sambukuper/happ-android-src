package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ee implements yu4, bo8 {
    public final CaptureResult X;
    public final String Y;

    public ee(CaptureResult captureResult, String str) {
        captureResult.getClass();
        str.getClass();
        this.X = captureResult;
        this.Y = str;
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        zb6 zb6Var = yb6.a;
        boolean zEquals = zu3Var.equals(zb6Var.b(CaptureResult.class));
        CaptureResult captureResult = this.X;
        if (zEquals) {
            captureResult.getClass();
            return captureResult;
        }
        if (!zu3Var.equals(zb6Var.b(TotalCaptureResult.class)) || captureResult == null) {
            return null;
        }
        return captureResult;
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) vi0.b(this.Y)) + ", frameNumber: " + this.X.getFrameNumber() + ')';
    }
}
