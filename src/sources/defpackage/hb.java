package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Build;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hb extends CameraCaptureSession.StateCallback {
    public final za a;
    public final fh0 b;
    public final eg0 c;
    public final dq d;
    public final Handler e;
    public final tv f;
    public final tv g;

    public hb(za zaVar, fh0 fh0Var, n57 n57Var, eg0 eg0Var, dq dqVar, Handler handler) {
        eg0Var.getClass();
        handler.getClass();
        this.a = zaVar;
        this.b = fh0Var;
        this.c = eg0Var;
        this.d = dqVar;
        this.e = handler;
        this.f = nr4.g(n57Var);
        this.g = nr4.g(null);
    }

    public final gh0 a(CameraCaptureSession cameraCaptureSession, eg0 eg0Var) {
        gh0 gh0Var = (gh0) this.g.a;
        if (gh0Var != null) {
            return gh0Var;
        }
        Handler handler = this.e;
        boolean z = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
        za zaVar = this.a;
        gh0 yaVar = z ? new ya(zaVar, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, eg0Var, handler) : new xa(zaVar, cameraCaptureSession, eg0Var, handler);
        if (this.g.a(null, yaVar)) {
            return yaVar;
        }
        Object obj = this.g.a;
        obj.getClass();
        return (gh0) obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.c(a(cameraCaptureSession, this.c));
        dq dqVar = this.d;
        if (dqVar != null) {
            this.a.Z.getClass();
            Iterator it = ((List) ((tv) dqVar.Z).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive((qc6) dqVar.Y);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        eg0 eg0Var = this.c;
        a(cameraCaptureSession, eg0Var);
        this.b.f(a(cameraCaptureSession, eg0Var));
        dq dqVar = this.d;
        if (dqVar != null) {
            this.a.Z.getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                ue3.C((qc6) dqVar.Y, (tv) dqVar.Z);
            } else {
                hi5.j0();
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        eg0 eg0Var = this.c;
        a(cameraCaptureSession, eg0Var);
        gh0 gh0VarA = a(cameraCaptureSession, eg0Var);
        fh0 fh0Var = this.b;
        fh0Var.d(gh0VarA);
        n57 n57Var = (n57) this.f.b(null);
        if (n57Var != null) {
            n57Var.a();
        }
        fh0Var.a();
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.B(this.a.Z);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        gh0 gh0VarA = a(cameraCaptureSession, this.c);
        fh0 fh0Var = this.b;
        fh0Var.h(gh0VarA);
        n57 n57Var = (n57) this.f.b(null);
        if (n57Var != null) {
            n57Var.a();
        }
        fh0Var.a();
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.C(this.a.Z);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        this.b.g(a(cameraCaptureSession, this.c));
        n57 n57Var = (n57) this.f.b(null);
        if (n57Var != null) {
            n57Var.a();
        }
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.D(this.a.Z);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.e(a(cameraCaptureSession, this.c));
        dq dqVar = this.d;
        if (dqVar != null) {
            this.a.Z.getClass();
            Iterator it = ((List) ((tv) dqVar.Z).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady((qc6) dqVar.Y);
            }
        }
    }
}
