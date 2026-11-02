package defpackage;

import android.hardware.camera2.CaptureFailure;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gb implements se6 {
    public final CaptureFailure X;
    public final int Y;
    public final boolean Z;

    public gb(te6 te6Var, CaptureFailure captureFailure) {
        te6Var.getClass();
        this.X = captureFailure;
        captureFailure.getFrameNumber();
        this.Y = captureFailure.getReason();
        this.Z = captureFailure.wasImageCaptured();
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        if (zu3Var.equals(yb6.a.b(CaptureFailure.class))) {
            return this.X;
        }
        return null;
    }

    @Override // defpackage.se6
    public final boolean D() {
        return this.Z;
    }

    @Override // defpackage.se6
    public final int R() {
        return this.Y;
    }
}
