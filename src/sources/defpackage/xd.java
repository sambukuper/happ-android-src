package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xd extends CameraExtensionSession$StateCallback {
    public final za a;
    public final x62 b;
    public final eg0 c;
    public final dq d;
    public final hv e;
    public final tv f;
    public final tv g;

    public xd(za zaVar, x62 x62Var, n57 n57Var, eg0 eg0Var, dq dqVar, hv hvVar) {
        eg0Var.getClass();
        this.a = zaVar;
        this.b = x62Var;
        this.c = eg0Var;
        this.d = dqVar;
        this.e = hvVar;
        this.f = nr4.g(n57Var);
        this.g = nr4.g(null);
    }

    public final fi0 a(CameraExtensionSession cameraExtensionSession, eg0 eg0Var) {
        fi0 fi0Var = (fi0) this.g.a;
        if (fi0Var != null) {
            return fi0Var;
        }
        bb bbVar = new bb(this.a, cameraExtensionSession, eg0Var, this.e);
        if (this.g.a(null, bbVar)) {
            return bbVar;
        }
        Object obj = this.g.a;
        obj.getClass();
        return (fi0) obj;
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) throws Exception {
        cameraExtensionSession.getClass();
        eg0 eg0Var = this.c;
        a(cameraExtensionSession, eg0Var);
        fi0 fi0VarA = a(cameraExtensionSession, eg0Var);
        x62 x62Var = this.b;
        x62Var.a.d(fi0VarA);
        n57 n57Var = (n57) this.f.b(null);
        if (n57Var != null) {
            n57Var.a();
        }
        x62Var.a();
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.B(this.a.Z);
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) throws Exception {
        cameraExtensionSession.getClass();
        fi0 fi0VarA = a(cameraExtensionSession, this.c);
        x62 x62Var = this.b;
        x62Var.a.h(fi0VarA);
        n57 n57Var = (n57) this.f.b(null);
        if (n57Var != null) {
            n57Var.a();
        }
        x62Var.a();
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.C(this.a.Z);
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        this.b.a.g(a(cameraExtensionSession, this.c));
        n57 n57Var = (n57) this.f.b(null);
        if (n57Var != null) {
            n57Var.a();
        }
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.D(this.a.Z);
        }
    }
}
