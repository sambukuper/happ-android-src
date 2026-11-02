package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dj4 implements kq8 {
    public final kh7 a;
    public final pr8 b;
    public qq8 c;
    public final boolean d;
    public boolean e;
    public final yz4 f;
    public final AtomicInteger g;
    public ux0 h;
    public xg1 i;

    public dj4(jj0 jj0Var, kh7 kh7Var, pr8 pr8Var, lx0 lx0Var) {
        kh7Var.getClass();
        pr8Var.getClass();
        lx0Var.getClass();
        this.a = kh7Var;
        this.b = pr8Var;
        boolean z = false;
        if (jj0Var != null) {
            jj0.h.getClass();
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
            key.getClass();
            int[] iArr = (int[]) ((lf0) jj0Var).c(key);
            if (iArr == null ? false : eu.a0(iArr, 6)) {
                z = true;
            }
        }
        this.d = z;
        this.f = new yz4(-1);
        this.g = new AtomicInteger(-1);
        if (z) {
            lx0Var.a(new cj4(this), pr8Var.e);
        }
    }

    public final void a(List list) {
        if (this.d) {
            if (list.isEmpty()) {
                this.i = vr3.a(Boolean.FALSE);
            } else {
                this.i = w51.j(this.b.f, null, new k(this, list, null, (byte) 19), 3);
            }
        }
    }

    @Override // defpackage.kq8
    public final void b(qq8 qq8Var) {
        this.c = qq8Var;
        if (this.e) {
            if (qq8Var != null) {
                d(true, false);
            } else {
                c(this.f, 0);
            }
        }
    }

    public final void c(yz4 yz4Var, int i) {
        if (this.g.getAndSet(i) != i) {
            if (s08.c()) {
                yz4Var.j(Integer.valueOf(i));
            } else {
                yz4Var.k(Integer.valueOf(i));
            }
        }
    }

    public final ux0 d(boolean z, boolean z2) {
        hi5.i0("CXCP");
        ux0 ux0Var = new ux0();
        if (this.d) {
            w51.G(this.b.f, null, null, new y81((q51) null, this, ux0Var, z, z2), 3);
            return ux0Var;
        }
        ux0Var.l0(new IllegalStateException("Low Light Boost is not supported!"));
        return ux0Var;
    }

    @Override // defpackage.kq8
    public final void reset() {
        ux0 ux0Var = this.h;
        if (ux0Var != null) {
            p61.y("There is a new enableLowLightBoost being set", ux0Var);
        }
        this.h = null;
        d(false, true);
    }
}
