package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b57 extends a57 {
    public static b57 d(er8 er8Var, Size size) {
        if (((rl0) er8Var.a(er8.N, null)) == null) {
            bt.p((String) er8Var.a(u18.I, er8Var.toString()), "Implementation is missing option unpacker for ");
            return null;
        }
        b57 b57Var = new b57();
        size.getClass();
        f57 f57Var = (f57) er8Var.a(er8.L, null);
        qd5 qd5Var = qd5.Z;
        qd5Var.getClass();
        int i = f57.a().g.c;
        ArrayList arrayList = b57Var.d;
        ArrayList arrayList2 = b57Var.c;
        xm0 xm0Var = b57Var.b;
        if (f57Var != null) {
            ym0 ym0Var = f57Var.g;
            i = ym0Var.c;
            for (CameraDevice.StateCallback stateCallback : f57Var.c) {
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : f57Var.d) {
                if (!arrayList.contains(stateCallback2)) {
                    arrayList.add(stateCallback2);
                }
            }
            xm0Var.b(ym0Var.d);
            qd5Var = ym0Var.b;
        }
        xm0Var.g0 = k05.k(qd5Var);
        byte b = 18;
        if (er8Var instanceof mt5) {
            Rational rational = nt5.a;
            if (((PreviewPixelHDRnetQuirk) um1.a().b(PreviewPixelHDRnetQuirk.class)) != null && !dh3.f(nt5.a, new Rational(size.getWidth(), size.getHeight()))) {
                k05 k05VarJ = k05.j();
                CaptureRequest.Key key = CaptureRequest.TONEMAP_MODE;
                key.getClass();
                k05VarJ.o(w45.B(key), 2);
                xm0Var.d(new gg0(qd5.c(k05VarJ), b));
            }
        }
        Object objA = er8Var.a(gg0.j0, Integer.valueOf(i));
        objA.getClass();
        xm0Var.Y = ((Number) objA).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) er8Var.a(gg0.k0, null);
        if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
            arrayList2.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) er8Var.a(gg0.l0, null);
        if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
            arrayList.add(stateCallback4);
        }
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) er8Var.a(gg0.m0, null);
        if (captureCallback != null) {
            ol0 ol0Var = new ol0(captureCallback);
            xm0Var.c(ol0Var);
            ArrayList arrayList3 = b57Var.e;
            if (!arrayList3.contains(ol0Var)) {
                arrayList3.add(ol0Var);
            }
        }
        int iB = er8Var.B();
        if (iB != 0 && iB != 0) {
            ((k05) xm0Var.g0).o(er8.a0, Integer.valueOf(iB));
        }
        int iT = er8Var.t();
        if (iT != 0 && iT != 0) {
            ((k05) xm0Var.g0).o(er8.b0, Integer.valueOf(iT));
        }
        k05 k05VarJ2 = k05.j();
        zx zxVar = gg0.p0;
        String str = (String) er8Var.a(zxVar, null);
        if (str != null) {
            k05VarJ2.o(zxVar, str);
        }
        zx zxVar2 = gg0.n0;
        Long l = (Long) er8Var.a(zxVar2, null);
        if (l != null) {
            k05VarJ2.o(zxVar2, Long.valueOf(l.longValue()));
        }
        xm0Var.d(k05VarJ2);
        fg0 fg0Var = new fg0((byte) 2);
        er8Var.g(new jn0(fg0Var, er8Var, (byte) 0));
        xm0Var.d(new wl6(qd5.c(fg0Var.Y), b));
        return b57Var;
    }

    public final void a(l11 l11Var) {
        this.b.d(l11Var);
    }

    public final void b(wg1 wg1Var, px1 px1Var, int i) {
        y5 y5VarA = fz.a(wg1Var);
        if (px1Var == null) {
            b61.i("Null dynamicRange");
            return;
        }
        y5VarA.h0 = px1Var;
        y5VarA.g0 = Integer.valueOf(i);
        this.a.add(y5VarA.u());
        ((HashSet) this.b.f0).add(wg1Var);
    }

    public final f57 c() {
        return new f57(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.e(), this.f, this.g, this.h, this.i);
    }
}
