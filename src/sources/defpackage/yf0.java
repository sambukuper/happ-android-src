package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yf0 extends uy7 implements rn2 {
    public final /* synthetic */ String g0;
    public final /* synthetic */ zf0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(String str, zf0 zf0Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = str;
        this.h0 = zf0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((yf0) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new yf0(this.g0, this.h0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Exception {
        Boolean boolValueOf;
        int i;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        w39.n0(obj);
        String str = this.g0;
        zf0 zf0Var = this.h0;
        v06 v06Var = zf0Var.a;
        eg0 eg0Var = zf0Var.c;
        int i2 = 6;
        try {
            boolValueOf = Boolean.valueOf(((CameraManager) v06Var.get()).isCameraDeviceSetupSupported(str));
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                e.getMessage();
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                if (reason == 1) {
                    i = 3;
                } else if (reason == 2) {
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
                eg0Var.a(i, str, true);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                e.getMessage();
                eg0Var.a(9, str, false);
            } else if (!(e instanceof IllegalStateException)) {
                throw e;
            }
            boolValueOf = null;
        }
        if (!dh3.f(boolValueOf, Boolean.TRUE)) {
            return null;
        }
        vi0.b(str);
        try {
            cameraDeviceSetup = ((CameraManager) v06Var.get()).getCameraDeviceSetup(str);
        } catch (Exception e2) {
            if (e2 instanceof CameraAccessException) {
                e2.getMessage();
                CameraAccessException cameraAccessException2 = (CameraAccessException) e2;
                int reason2 = cameraAccessException2.getReason();
                if (reason2 == 1) {
                    i2 = 3;
                } else if (reason2 != 2) {
                    if (reason2 == 3) {
                        i2 = 0;
                    } else if (reason2 == 4) {
                        i2 = 1;
                    } else if (reason2 != 5) {
                        cameraAccessException2.toString();
                        i2 = 11;
                    } else {
                        i2 = 2;
                    }
                }
                eg0Var.a(i2, str, true);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                e2.getMessage();
                eg0Var.a(9, str, false);
            } else if (!(e2 instanceof IllegalStateException)) {
                throw e2;
            }
            cameraDeviceSetup = null;
        }
        if (cameraDeviceSetup != null) {
            return new cg0(cameraDeviceSetup, str, eg0Var);
        }
        return null;
    }
}
