package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kg0 implements te6 {
    public final gh0 X;
    public final CaptureRequest Y;
    public final Map Z;
    public final Map f0;
    public final Map g0;
    public final ArrayMap h0;
    public final boolean i0;
    public final ne6 j0;
    public final long k0;

    public kg0(gh0 gh0Var, CaptureRequest captureRequest, Map map, Map map2, Map map3, ArrayMap arrayMap, boolean z, ne6 ne6Var, long j) {
        gh0Var.getClass();
        captureRequest.getClass();
        map2.getClass();
        map3.getClass();
        this.X = gh0Var;
        this.Y = captureRequest;
        this.Z = map;
        this.f0 = map2;
        this.g0 = map3;
        this.h0 = arrayMap;
        this.i0 = z;
        this.j0 = ne6Var;
        this.k0 = j;
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        zb6 zb6Var = yb6.a;
        if (zu3Var.equals(zb6Var.b(CaptureRequest.class))) {
            CaptureRequest captureRequest = this.Y;
            captureRequest.getClass();
            return captureRequest;
        }
        boolean zEquals = zu3Var.equals(zb6Var.b(CameraCaptureSession.class));
        gh0 gh0Var = this.X;
        if (zEquals) {
            Object objC0 = gh0Var.C0(zb6Var.b(CameraCaptureSession.class));
            if (objC0 != null) {
                return objC0;
            }
        } else {
            Class clsM = bt.m();
            if (zu3Var.equals(zb6Var.b(clsM))) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Object objC1 = gh0Var.C0(zb6Var.b(clsM));
                    if (objC1 != null) {
                        return objC1;
                    }
                } else {
                    bt.i("Check failed.");
                }
            }
        }
        return null;
    }

    @Override // defpackage.te6
    public final Map U() {
        return this.h0;
    }

    @Override // defpackage.yu4
    public final Object a(xu4 xu4Var, d18 d18Var) {
        xu4Var.getClass();
        Object objB = b(xu4Var);
        return objB == null ? d18Var : objB;
    }

    @Override // defpackage.te6
    public final boolean a0() {
        return this.i0;
    }

    @Override // defpackage.yu4
    public final Object b(xu4 xu4Var) {
        Map map = this.j0.c;
        xu4Var.getClass();
        Map map2 = this.g0;
        if (map2.containsKey(xu4Var)) {
            return map2.get(xu4Var);
        }
        if (map.containsKey(xu4Var)) {
            return map.get(xu4Var);
        }
        Map map3 = this.f0;
        return map3.containsKey(xu4Var) ? map3.get(xu4Var) : this.Z.get(xu4Var);
    }

    @Override // defpackage.te6
    public final ne6 getRequest() {
        return this.j0;
    }

    @Override // defpackage.te6
    public final long u0() {
        return this.k0;
    }
}
