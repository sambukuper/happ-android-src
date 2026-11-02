package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x32 implements kq8 {
    public final z32 a;
    public a42 b;
    public qq8 c;

    public x32(z32 z32Var) {
        z32Var.getClass();
        this.a = z32Var;
        this.b = new a42(z32Var.d, 0, z32Var.c, z32Var.e);
    }

    public final ux0 a(boolean z) {
        z32 z32Var = this.a;
        boolean z2 = z32Var.d;
        Range range = z32Var.c;
        if (!z2) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
            ux0 ux0Var = new ux0();
            ux0Var.l0(illegalArgumentException);
            return ux0Var;
        }
        if (!range.contains(0)) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + range.getUpper() + " .. " + range.getLower() + ']');
            ux0 ux0Var2 = new ux0();
            ux0Var2.l0(illegalArgumentException2);
            return ux0Var2;
        }
        qq8 qq8Var = this.c;
        if (qq8Var == null) {
            nh0 nh0Var = new nh0("Camera is not active.");
            ux0 ux0Var3 = z32Var.f;
            if (ux0Var3 != null) {
                ux0Var3.l0(nh0Var);
            }
            ux0 ux0Var4 = new ux0();
            ux0Var4.l0(nh0Var);
            return ux0Var4;
        }
        a42 a42Var = this.b;
        this.b = new a42(a42Var.a, 0, a42Var.c, a42Var.d);
        lx0 lx0Var = z32Var.b;
        ux0 ux0Var5 = new ux0();
        ux0 ux0Var6 = z32Var.f;
        if (ux0Var6 != null) {
            if (z) {
                p61.y("Cancelled by another setExposureCompensationIndex()", ux0Var6);
            } else {
                zc1.f0(ux0Var5, ux0Var6);
            }
        }
        z32Var.f = ux0Var5;
        y32 y32Var = z32Var.g;
        if (y32Var != null) {
            lx0Var.b(y32Var);
            z32Var.g = null;
        }
        Map mapSingletonMap = Collections.singletonMap(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0);
        mapSingletonMap.getClass();
        qq8Var.h(mapSingletonMap, oq8.b);
        y32 y32Var2 = new y32(ux0Var5);
        lx0Var.a(y32Var2, z32Var.a.e);
        ux0Var5.D(new p0(z32Var, y32Var2, (byte) 19));
        z32Var.g = y32Var2;
        return ux0Var5;
    }

    @Override // defpackage.kq8
    public final void b(qq8 qq8Var) {
        this.c = qq8Var;
        a(false);
    }

    @Override // defpackage.kq8
    public final void reset() {
        a42 a42Var = this.b;
        this.b = new a42(a42Var.a, 0, a42Var.c, a42Var.d);
        a(true);
    }
}
