package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bb implements fi0 {
    public final za X;
    public final CameraExtensionSession Y;
    public final eg0 Z;
    public final hv f0;
    public final sv g0;
    public final HashMap h0;

    public bb(za zaVar, CameraExtensionSession cameraExtensionSession, eg0 eg0Var, hv hvVar) {
        eg0Var.getClass();
        this.X = zaVar;
        this.Y = cameraExtensionSession;
        this.Z = eg0Var;
        this.f0 = hvVar;
        qv qvVar = gj0.a;
        qvVar.getClass();
        qv.b.incrementAndGet(qvVar);
        sv svVar = new sv();
        svVar.a = 0L;
        this.g0 = svVar;
        this.h0 = new HashMap();
    }

    @Override // defpackage.gh0
    public final boolean A0() throws Exception {
        dn8 dn8Var;
        String str = this.X.Z;
        try {
            this.Y.stopRepeating();
            dn8Var = dn8.a;
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            eg0 eg0Var = this.Z;
            if (z) {
                e.getMessage();
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                int i = 3;
                if (reason != 1) {
                    if (reason == 2) {
                        i = 6;
                    } else if (reason == 3) {
                        i = 0;
                    } else if (reason == 4) {
                        i = 1;
                    } else if (reason != 5) {
                        cameraAccessException.toString();
                        i = 11;
                    } else {
                        i = 2;
                    }
                }
                eg0Var.a(i, str, true);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                e.getMessage();
                eg0Var.a(9, str, false);
            } else if (!(e instanceof IllegalStateException)) {
                throw e;
            }
            dn8Var = null;
        }
        return dn8Var != null;
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        if (zu3Var.equals(yb6.a.b(bt.m()))) {
            return this.Y;
        }
        return null;
    }

    @Override // defpackage.gh0
    public final Integer G(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        captureRequest.getClass();
        String str = this.X.Z;
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.Y;
            hv hvVar = this.f0;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.capture(captureRequest, hvVar, new ab(this, (qf0) captureCallback)) : cameraExtensionSession.capture(captureRequest, hvVar, new ab(this, (qf0) captureCallback, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            eg0 eg0Var = this.Z;
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

    @Override // defpackage.gh0
    public final Integer L0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
        if (arrayList.size() == 1) {
            return O0((CaptureRequest) wv0.O0(arrayList), captureCallback);
        }
        bt.i("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
        return null;
    }

    @Override // defpackage.gh0
    public final Integer O0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        captureRequest.getClass();
        String str = this.X.Z;
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.Y;
            hv hvVar = this.f0;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.setRepeatingRequest(captureRequest, hvVar, new ab(this, (qf0) captureCallback)) : cameraExtensionSession.setRepeatingRequest(captureRequest, hvVar, new ab(this, (qf0) captureCallback, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            eg0 eg0Var = this.Z;
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

    @Override // defpackage.gh0
    public final Integer R0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            G((CaptureRequest) it.next(), captureCallback);
        }
        return null;
    }

    @Override // defpackage.gh0
    public final boolean b0() {
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws CameraAccessException {
        this.Y.close();
    }

    @Override // defpackage.gh0
    public final Surface getInputSurface() {
        return null;
    }

    @Override // defpackage.gh0
    public final yh0 i0() {
        return this.X;
    }

    @Override // defpackage.gh0
    public final boolean x0(List list) {
        return false;
    }
}
