package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wg0 implements me6 {
    public final LinkedHashMap X = new LinkedHashMap();
    public final vz7 Y = new vz7(new w60((byte) 2));
    public volatile Map Z = e02.X;

    public static int c(te6 te6Var) {
        d18 d18Var = (d18) te6Var.b(e18.a);
        Object obj = d18Var != null ? d18Var.a.get("CAPTURE_CONFIG_ID_KEY") : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.me6
    public final void C(te6 te6Var, long j, long j2) {
        te6Var.getClass();
        for (Map.Entry entry : this.Z.entrySet()) {
            xg0 xg0Var = (xg0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (xg0Var instanceof ol0) {
                CameraCaptureSession cameraCaptureSessionB = b(te6Var);
                CaptureRequest captureRequest = (CaptureRequest) te6Var.C0(yb6.a.b(CaptureRequest.class));
                if (cameraCaptureSessionB != null && captureRequest != null) {
                    executor.execute(new pg0((ol0) xg0Var, cameraCaptureSessionB, captureRequest, j2, j, (byte) 0));
                }
            } else {
                executor.execute(new qg0(xg0Var, this, te6Var, (byte) 0));
            }
        }
    }

    @Override // defpackage.me6
    public final void D(te6 te6Var, int i) {
        te6Var.getClass();
        for (Map.Entry entry : this.Z.entrySet()) {
            xg0 xg0Var = (xg0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (xg0Var instanceof ol0) {
                zb6 zb6Var = yb6.a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) te6Var.C0(zb6Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) te6Var.C0(zb6Var.b(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) te6Var.C0(zb6Var.b(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new sg0((ol0) xg0Var, cameraCaptureSession, captureRequest, captureResult, (byte) 0));
                }
            } else {
                executor.execute(new tg0(xg0Var, this, te6Var, i));
            }
        }
    }

    @Override // defpackage.me6
    public final void U(te6 te6Var, long j, ee eeVar) {
        te6Var.getClass();
        for (Map.Entry entry : this.Z.entrySet()) {
            xg0 xg0Var = (xg0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (xg0Var instanceof ol0) {
                zb6 zb6Var = yb6.a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) te6Var.C0(zb6Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) te6Var.C0(zb6Var.b(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) eeVar.C0(zb6Var.b(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new sg0((ol0) xg0Var, cameraCaptureSession, captureRequest, captureResult, (byte) 1));
                }
            }
        }
    }

    @Override // defpackage.me6
    public final void X(te6 te6Var, long j, se6 se6Var) {
        for (Map.Entry entry : this.Z.entrySet()) {
            xg0 xg0Var = (xg0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (xg0Var instanceof ol0) {
                CameraCaptureSession cameraCaptureSessionB = b(te6Var);
                zb6 zb6Var = yb6.a;
                CaptureRequest captureRequest = (CaptureRequest) te6Var.C0(zb6Var.b(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) se6Var.C0(zb6Var.b(CaptureFailure.class));
                if (cameraCaptureSessionB != null && captureRequest != null && captureFailure != null) {
                    executor.execute(new rg0((ol0) xg0Var, cameraCaptureSessionB, captureRequest, captureFailure, (byte) 1));
                }
            } else {
                executor.execute(new j0(xg0Var, this, te6Var, new ra((byte) 9, false), (byte) 3));
            }
        }
    }

    @Override // defpackage.me6
    public final void Y(te6 te6Var, long j, de deVar) {
        for (Map.Entry entry : this.Z.entrySet()) {
            xg0 xg0Var = (xg0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (xg0Var instanceof ol0) {
                CameraCaptureSession cameraCaptureSessionB = b(te6Var);
                zb6 zb6Var = yb6.a;
                CaptureRequest captureRequest = (CaptureRequest) te6Var.C0(zb6Var.b(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) deVar.C0(zb6Var.b(TotalCaptureResult.class));
                if (cameraCaptureSessionB != null && captureRequest != null && totalCaptureResult != null) {
                    executor.execute(new rg0((ol0) xg0Var, cameraCaptureSessionB, captureRequest, totalCaptureResult, (byte) 0));
                }
            } else {
                executor.execute(new j0(xg0Var, this, te6Var, new de(te6Var, deVar), (byte) 2));
            }
        }
    }

    public final void a(xg0 xg0Var, Executor executor) {
        xg0Var.getClass();
        executor.getClass();
        if (this.Z.containsKey(xg0Var)) {
            throw new IllegalStateException((xg0Var + " was already registered!").toString());
        }
        synchronized (this.X) {
            this.X.put(xg0Var, executor);
            this.Z = zp4.Q(this.X);
        }
    }

    @Override // defpackage.me6
    public final void a0(ne6 ne6Var) {
        ne6Var.getClass();
        for (Map.Entry entry : this.Z.entrySet()) {
            xg0 xg0Var = (xg0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            Object obj = ne6Var.c.get(e18.a);
            d18 d18Var = obj instanceof d18 ? (d18) obj : null;
            Object obj2 = d18Var != null ? d18Var.a.get("CAPTURE_CONFIG_ID_KEY") : null;
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            executor.execute(new rh(xg0Var, num != null ? num.intValue() : -1, (byte) 2));
        }
    }

    public final CameraCaptureSession b(te6 te6Var) {
        zb6 zb6Var = yb6.a;
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) te6Var.C0(zb6Var.b(CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || ((CameraExtensionSession) te6Var.C0(zb6Var.b(bt.m()))) == null) {
            return null;
        }
        return (CameraCaptureSession) this.Y.getValue();
    }

    @Override // defpackage.me6
    public final void g(te6 te6Var, long j, int i, int i2) {
        for (Map.Entry entry : this.Z.entrySet()) {
            xg0 xg0Var = (xg0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (xg0Var instanceof ol0) {
                zb6 zb6Var = yb6.a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) te6Var.C0(zb6Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) te6Var.C0(zb6Var.b(CaptureRequest.class));
                Surface surface = (Surface) te6Var.U().get(new dl7(i));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    executor.execute(new ug0((ol0) xg0Var, cameraCaptureSession, captureRequest, surface, j));
                }
            }
        }
    }

    @Override // defpackage.me6
    public final void k(te6 te6Var, long j, long j2) {
        te6Var.getClass();
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        for (Map.Entry entry : this.Z.entrySet()) {
            xg0 xg0Var = (xg0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (xg0Var instanceof ol0) {
                zb6 zb6Var = yb6.a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) te6Var.C0(zb6Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) te6Var.C0(zb6Var.b(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new pg0((ol0) xg0Var, cameraCaptureSession, captureRequest, j2, j, (byte) 1));
                }
            }
        }
    }

    @Override // defpackage.me6
    public final void p(te6 te6Var, long j) {
        te6Var.getClass();
        for (Map.Entry entry : this.Z.entrySet()) {
            xg0 xg0Var = (xg0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (xg0Var instanceof ol0) {
                CameraCaptureSession cameraCaptureSessionB = b(te6Var);
                CaptureRequest captureRequest = (CaptureRequest) te6Var.C0(yb6.a.b(CaptureRequest.class));
                if (cameraCaptureSessionB != null && captureRequest != null) {
                    executor.execute(new vg0((ol0) xg0Var, cameraCaptureSessionB, j, (byte) 0));
                }
            }
        }
    }

    @Override // defpackage.me6
    public final void u(te6 te6Var) {
        te6Var.getClass();
        for (Map.Entry entry : this.Z.entrySet()) {
            xg0 xg0Var = (xg0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (xg0Var instanceof ol0) {
                zb6 zb6Var = yb6.a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) te6Var.C0(zb6Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) te6Var.C0(zb6Var.b(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new sc((ol0) xg0Var, cameraCaptureSession, (byte) 3));
                }
            } else {
                executor.execute(new qg0(xg0Var, this, te6Var, (byte) 1));
            }
        }
    }
}
