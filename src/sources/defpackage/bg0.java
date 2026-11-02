package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bg0 {
    public final s98 a;
    public final jg0 b;
    public final hk6 c;

    public bg0(s98 s98Var, jg0 jg0Var, hk6 hk6Var) {
        s98Var.getClass();
        jg0Var.getClass();
        hk6Var.getClass();
        this.a = s98Var;
        this.b = jg0Var;
        this.c = hk6Var;
    }

    public static void c(yh0 yh0Var) throws InterruptedException {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        pv pvVarE = nr4.e(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (yh0Var.c0(i21.K(surface), new ag0(countDownLatch, pvVarE, surface, surfaceTexture))) {
            countDownLatch.await();
        } else if (pvVarE.a()) {
            surface.release();
            surfaceTexture.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [q51] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void a(yh0 yh0Var, CameraDevice cameraDevice, db dbVar, pw pwVar, boolean z, boolean z2) {
        bg0 bg0Var;
        f00 f00Var;
        pwVar.getClass();
        qg5 qg5Var = 0;
        qg5Var = 0;
        CameraDevice cameraDevice2 = yh0Var != null ? (CameraDevice) yh0Var.C0(yb6.a.b(CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                b(cameraDevice, dbVar);
                return;
            }
            return;
        }
        String id = cameraDevice2.getId();
        id.getClass();
        vi0.a(id);
        if (cameraDevice != null && !id.equals(cameraDevice.getId())) {
            StringBuilder sbP = p61.p("Unwrapped camera device has camera ID ", id, ", but the wrapped camera device has camera ID ");
            sbP.append(cameraDevice.getId());
            sbP.append('!');
            throw new IllegalStateException(sbP.toString().toString());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            yh0Var.getClass();
            if (i >= 30) {
                pwVar.e.remove(yh0Var);
            }
        }
        Objects.toString(cameraDevice2);
        String strM = yh0Var.m();
        if (z) {
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                b(cameraDevice2, dbVar);
                hk6 hk6Var = this.c;
                hk6Var.getClass();
                strM.getClass();
                vi0.b(strM);
                bg0Var = this;
                f00Var = (f00) z51.R(hk6Var.h.d, new wu1((Object) hk6Var, (Object) strM, (Object) bg0Var, (q51) qg5Var, (byte) 6));
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            bg0Var = this;
            f00Var = new f00(yh0Var, dbVar);
        }
        yh0 yh0Var2 = f00Var.a;
        db dbVar2 = f00Var.b;
        if (yh0Var2 != null && dbVar2 != null) {
            if (z2) {
                try {
                    Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                    vi0.b(strM);
                    c(yh0Var2);
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            qg5Var = new qg5(yh0Var2, dbVar2);
        }
        if (qg5Var == 0) {
            yh0Var.J();
            yh0Var.B0();
            dbVar.d(cameraDevice2);
            return;
        }
        yh0 yh0Var3 = (yh0) qg5Var.X;
        db dbVar3 = (db) qg5Var.Y;
        Object objC0 = yh0Var3.C0(yb6.a.b(CameraDevice.class));
        if (objC0 == null) {
            bt.i("Required value was null.");
            return;
        }
        yh0Var.J();
        bg0Var.b((CameraDevice) objC0, dbVar3);
        yh0Var.B0();
        if (z) {
            dbVar.d(cameraDevice2);
        }
    }

    public final void b(CameraDevice cameraDevice, db dbVar) {
        cameraDevice.getId().getClass();
        aa6 aa6Var = new aa6();
        String id = cameraDevice.getId();
        id.getClass();
        vi0.a(id);
        jg0 jg0Var = this.b;
        jg0Var.getClass();
        jg0Var.b.getClass();
        ij0 ij0Var = jj0.h;
        jj0 jj0VarA = ((hg0) jg0Var.a).a(id);
        ij0Var.getClass();
        if (ij0.c(jj0VarA) && aa6Var.X) {
            vi0.b(id);
            if (dbVar.r.await(2000L, TimeUnit.MILLISECONDS)) {
                vi0.b(id);
            } else {
                vi0.b(id);
            }
        }
    }
}
