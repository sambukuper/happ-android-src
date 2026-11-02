package defpackage;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lj0 {
    public final CameraDevice.StateCallback a;
    public final dq b;
    public final jx1 c;

    public lj0(CameraDevice.StateCallback stateCallback, dq dqVar, jx1 jx1Var) {
        this.a = stateCallback;
        this.b = dqVar;
        this.c = jx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj0)) {
            return false;
        }
        lj0 lj0Var = (lj0) obj;
        return dh3.f(this.a, lj0Var.a) && dh3.f(this.b, lj0Var.b) && dh3.f(this.c, lj0Var.c);
    }

    public final int hashCode() {
        CameraDevice.StateCallback stateCallback = this.a;
        int iHashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
        dq dqVar = this.b;
        int iHashCode2 = (iHashCode + (dqVar == null ? 0 : dqVar.hashCode())) * 31;
        jx1 jx1Var = this.c;
        return iHashCode2 + (jx1Var != null ? Long.hashCode(jx1Var.a) : 0);
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + this.a + ", cameraCaptureSessionListener=" + this.b + ", cameraOpenRetryMaxTimeoutNs=" + this.c + ')';
    }
}
