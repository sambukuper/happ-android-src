package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zi0 implements aj0, bo8 {
    public final qj0 X;
    public final jh0 Y;
    public final ok0 Z;
    public final rh0 f0;
    public final wg0 g0;
    public final ik0 h0;
    public final vk7 i0;
    public final vz7 j0;
    public final vz7 k0;

    public zi0(qj0 qj0Var, jh0 jh0Var, ok0 ok0Var, rh0 rh0Var, wg0 wg0Var, dh2 dh2Var, ik0 ik0Var, w02 w02Var, vk7 vk7Var, bh3 bh3Var, xd6 xd6Var) {
        qj0Var.getClass();
        jh0Var.getClass();
        ok0Var.getClass();
        rh0Var.getClass();
        wg0Var.getClass();
        dh2Var.getClass();
        ik0Var.getClass();
        w02Var.getClass();
        vk7Var.getClass();
        bh3Var.getClass();
        xd6Var.getClass();
        this.X = qj0Var;
        this.Y = jh0Var;
        this.Z = ok0Var;
        this.f0 = rh0Var;
        this.g0 = wg0Var;
        this.h0 = ik0Var;
        this.i0 = vk7Var;
        jj0 jj0Var = qj0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        lf0 lf0Var = (lf0) jj0Var;
        lf0Var.getClass();
        Object objC = lf0Var.c(key);
        hi5.k0();
        final byte b = 0;
        new vz7(new dn2(this) { // from class: yi0
            public final /* synthetic */ zi0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                zi0 zi0Var = this.Y;
                switch (b2) {
                    case 0:
                        qj0 qj0Var2 = zi0Var.X;
                        Set<vi0> set = (Set) ((lf0) qj0Var2.b).j0.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (vi0 vi0Var : set) {
                            String str = vi0Var.a;
                            jh0 jh0Var2 = new jh0(str);
                            lf0 lf0Var2 = (lf0) qj0Var2.b;
                            lf0Var2.getClass();
                            if (!((Set) lf0Var2.j0.getValue()).contains(vi0Var)) {
                                throw new IllegalStateException((((Object) vi0.b(str)) + " is not a valid physical camera on " + lf0Var2).toString());
                            }
                            linkedHashSet.add(new xm5(new qj0(jh0Var2, lf0Var2.Z.a(str))));
                        }
                        return linkedHashSet;
                    case 1:
                        ij0 ij0Var = jj0.h;
                        jj0 jj0Var2 = zi0Var.X.b;
                        ij0Var.getClass();
                        return Boolean.valueOf(ij0.c(jj0Var2));
                    default:
                        qj0 qj0Var3 = zi0Var.X;
                        qj0Var3.getClass();
                        jf0 jf0Var = new jf0();
                        String str2 = qj0Var3.a.Y;
                        return jf0Var;
                }
            }
        });
        final byte b2 = 1;
        this.j0 = new vz7(new dn2(this) { // from class: yi0
            public final /* synthetic */ zi0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                zi0 zi0Var = this.Y;
                switch (b3) {
                    case 0:
                        qj0 qj0Var2 = zi0Var.X;
                        Set<vi0> set = (Set) ((lf0) qj0Var2.b).j0.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (vi0 vi0Var : set) {
                            String str = vi0Var.a;
                            jh0 jh0Var2 = new jh0(str);
                            lf0 lf0Var2 = (lf0) qj0Var2.b;
                            lf0Var2.getClass();
                            if (!((Set) lf0Var2.j0.getValue()).contains(vi0Var)) {
                                throw new IllegalStateException((((Object) vi0.b(str)) + " is not a valid physical camera on " + lf0Var2).toString());
                            }
                            linkedHashSet.add(new xm5(new qj0(jh0Var2, lf0Var2.Z.a(str))));
                        }
                        return linkedHashSet;
                    case 1:
                        ij0 ij0Var = jj0.h;
                        jj0 jj0Var2 = zi0Var.X.b;
                        ij0Var.getClass();
                        return Boolean.valueOf(ij0.c(jj0Var2));
                    default:
                        qj0 qj0Var3 = zi0Var.X;
                        qj0Var3.getClass();
                        jf0 jf0Var = new jf0();
                        String str2 = qj0Var3.a.Y;
                        return jf0Var;
                }
            }
        });
        final byte b3 = 2;
        this.k0 = new vz7(new dn2(this) { // from class: yi0
            public final /* synthetic */ zi0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b4 = b3;
                zi0 zi0Var = this.Y;
                switch (b4) {
                    case 0:
                        qj0 qj0Var2 = zi0Var.X;
                        Set<vi0> set = (Set) ((lf0) qj0Var2.b).j0.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (vi0 vi0Var : set) {
                            String str = vi0Var.a;
                            jh0 jh0Var2 = new jh0(str);
                            lf0 lf0Var2 = (lf0) qj0Var2.b;
                            lf0Var2.getClass();
                            if (!((Set) lf0Var2.j0.getValue()).contains(vi0Var)) {
                                throw new IllegalStateException((((Object) vi0.b(str)) + " is not a valid physical camera on " + lf0Var2).toString());
                            }
                            linkedHashSet.add(new xm5(new qj0(jh0Var2, lf0Var2.Z.a(str))));
                        }
                        return linkedHashSet;
                    case 1:
                        ij0 ij0Var = jj0.h;
                        jj0 jj0Var2 = zi0Var.X.b;
                        ij0Var.getClass();
                        return Boolean.valueOf(ij0.c(jj0Var2));
                    default:
                        qj0 qj0Var3 = zi0Var.X;
                        qj0Var3.getClass();
                        jf0 jf0Var = new jf0();
                        String str2 = qj0Var3.a.Y;
                        return jf0Var;
                }
            }
        });
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        zb6 zb6Var = yb6.a;
        if (zu3Var.equals(zb6Var.b(jf0.class))) {
            jf0 jf0Var = (jf0) this.k0.getValue();
            jf0Var.getClass();
            return jf0Var;
        }
        boolean zEquals = zu3Var.equals(zb6Var.b(qj0.class));
        qj0 qj0Var = this.X;
        if (zEquals) {
            qj0Var.getClass();
            return qj0Var;
        }
        if (!zu3Var.equals(zb6Var.b(jj0.class))) {
            return ((lf0) qj0Var.b).C0(zu3Var);
        }
        jj0 jj0Var = qj0Var.b;
        jj0Var.getClass();
        return jj0Var;
    }

    @Override // defpackage.aj0
    public final Set a() {
        return ((sx1) c4.c(this.X.b).Y).a();
    }

    @Override // defpackage.xi0
    public final qc4 b() {
        return this.Z.c;
    }

    @Override // defpackage.xi0
    public final int c() {
        return n(0);
    }

    @Override // defpackage.aj0
    public final boolean d() {
        jj0 jj0Var = this.X.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        key.getClass();
        int[] iArr = (int[]) ((lf0) jj0Var).c(key);
        return iArr != null && eu.a0(iArr, 1);
    }

    @Override // defpackage.aj0
    public final String e() {
        return this.Y.Y;
    }

    @Override // defpackage.xi0
    public final qc4 f() {
        return this.f0.a.e;
    }

    @Override // defpackage.aj0
    public final Rect h() {
        jj0 jj0Var = this.X.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Rect rect = (Rect) ((lf0) jj0Var).c(key);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // defpackage.xi0
    public final int j() {
        jj0 jj0Var = this.X.b;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object objC = ((lf0) jj0Var).c(key);
        objC.getClass();
        int iIntValue = ((Number) objC).intValue();
        if (iIntValue == 0) {
            return 0;
        }
        int i = 1;
        if (iIntValue != 1) {
            i = 2;
            if (iIntValue != 2) {
                hi5.m0();
                return -1;
            }
        }
        return i;
    }

    @Override // defpackage.xi0
    public final String l() {
        return ((Boolean) this.j0.getValue()).booleanValue() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.xi0
    public final int n(int i) {
        jj0 jj0Var = this.X.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object objC = ((lf0) jj0Var).c(key);
        objC.getClass();
        return w39.Q(w39.m0(i), ((Number) objC).intValue(), 1 == j());
    }

    @Override // defpackage.aj0
    public final Object o() {
        Object objC0 = ((lf0) this.X.b).C0(yb6.a.b(CameraCharacteristics.class));
        objC0.getClass();
        return (CameraCharacteristics) objC0;
    }

    @Override // defpackage.xi0
    public final boolean q() {
        return u70.Y(this.X);
    }

    @Override // defpackage.aj0
    public final void r(Executor executor, pt5 pt5Var) {
        executor.getClass();
        this.g0.a(pt5Var, executor);
    }

    @Override // defpackage.aj0
    public final i26 s() {
        return this.h0.a();
    }

    @Override // defpackage.aj0
    public final List t(int i) {
        Size[] sizeArrA = this.i0.a(i);
        return sizeArrA != null ? eu.K0(sizeArrA) : d02.X;
    }

    public final String toString() {
        return "CameraInfoAdapter<" + this.Y + ".cameraId>";
    }

    @Override // defpackage.aj0
    public final Set v() {
        int length;
        jj0 jj0Var = this.X.b;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((lf0) jj0Var).c(key);
        m02 m02Var = m02.X;
        if (iArr == null || (length = iArr.length) == 0) {
            return m02Var;
        }
        if (length == 1) {
            return w45.U(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(aq4.G(iArr.length));
        for (int i : iArr) {
            linkedHashSet.add(Integer.valueOf(i));
        }
        return linkedHashSet;
    }

    @Override // defpackage.aj0
    public final Set w() {
        Integer[] numArrE = this.i0.c.E();
        return numArrE != null ? eu.L0(numArrE) : m02.X;
    }

    @Override // defpackage.aj0
    public final boolean x() {
        ij0 ij0Var = jj0.h;
        jj0 jj0Var = this.X.b;
        ij0Var.getClass();
        return ij0.b(jj0Var);
    }

    @Override // defpackage.aj0
    public final void y(xg0 xg0Var) {
        xg0Var.getClass();
        wg0 wg0Var = this.g0;
        wg0Var.getClass();
        synchronized (wg0Var.X) {
            wg0Var.X.remove(xg0Var);
            wg0Var.Z = zp4.Q(wg0Var.X);
        }
    }
}
