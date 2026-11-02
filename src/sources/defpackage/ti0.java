package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ti0 implements uh0, AutoCloseable {
    public final s15 X;
    public final it2 Y;
    public final u51 Z;
    public final ri0 f0;
    public final si0 g0;
    public final int h0;

    public ti0(s15 s15Var, it2 it2Var, u51 u51Var, hm2 hm2Var, ri0 ri0Var, si0 si0Var) {
        s15Var.getClass();
        it2Var.getClass();
        u51Var.getClass();
        hm2Var.getClass();
        ri0Var.getClass();
        si0Var.getClass();
        this.X = s15Var;
        this.Y = it2Var;
        this.Z = u51Var;
        this.f0 = ri0Var;
        this.g0 = si0Var;
        qv qvVar = ui0.a;
        qvVar.getClass();
        this.h0 = qv.b.incrementAndGet(qvVar);
    }

    public static ux0 m(ti0 ti0Var, long j, int i) {
        Map map;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = (i & 1) != 0 ? null : bool;
        Boolean bool3 = (i & 4) != 0 ? null : bool;
        long j2 = (i & 32) != 0 ? 3000000000L : j;
        if (ti0Var.X.a()) {
            om0.l("Cannot call unlock3A on ", ti0Var, " after close.");
            return null;
        }
        u51 u51Var = ti0Var.Z;
        Long l = new Long(j2);
        ux0 ux0Var = u51.g;
        it2 it2Var = u51Var.a;
        ij0 ij0Var = jj0.h;
        jj0 jj0Var = u51Var.b;
        ij0Var.getClass();
        Boolean bool4 = !ij0.a(jj0Var) ? null : bool;
        boolean zG0 = false;
        if (!dh3.f(bool2, bool) && !dh3.f(bool4, bool) && !dh3.f(bool3, bool)) {
            return vr3.a(new tj6(0, null));
        }
        if (it2Var.b.m() != null) {
            if (dh3.f(bool4, bool)) {
                Map map2 = u51.f;
                map2.getClass();
                ht2 ht2Var = it2Var.b;
                if (ht2Var.m() != null) {
                    zG0 = ht2Var.i0.g0(new bt2(map2));
                } else {
                    bt.i("Cannot submit parameters without an active repeating request!");
                }
                if (zG0) {
                    qt2.b(u51Var.c, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
                }
            }
            boolean zF = dh3.f(bool2, bool);
            boolean zF2 = dh3.f(bool4, bool);
            boolean zF3 = dh3.f(bool3, bool);
            if (zF || zF2 || zF3) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (zF) {
                    linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, u51.h);
                }
                if (zF2) {
                    linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, u51.i);
                }
                if (zF3) {
                    linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, u51.j);
                }
                map = linkedHashMap;
            } else {
                map = e02.X;
            }
            uj6 uj6Var = new uj6(new uv5(map, (byte) 1), 60, l);
            kc4 kc4Var = u51Var.d;
            kc4Var.getClass();
            kc4Var.X.add(uj6Var);
            Boolean bool5 = dh3.f(bool2, bool) ? Boolean.FALSE : null;
            Boolean bool6 = dh3.f(bool3, bool) ? Boolean.FALSE : null;
            if (bool5 != null || bool6 != null) {
                qt2.b(u51Var.c, null, null, null, null, null, null, null, bool5, null, bool6, 383);
            }
            it2Var.d(u51Var.c.a());
            return uj6Var.f0;
        }
        return ux0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f0.a) {
        }
        synchronized (this.g0.a) {
        }
        this.X.b();
    }

    public final ux0 k() {
        s7 s7Var = null;
        if (this.X.a()) {
            om0.l("Cannot call setTorchOn on ", this, " after close.");
            return null;
        }
        u51 u51Var = this.Z;
        s7 s7Var2 = ((jh7) u51Var.c.a.a).a;
        List list = s7.b;
        int i = 1;
        if ((s7Var2 == null || s7Var2.a != 1) && (s7Var2 == null || s7Var2.a != 0)) {
            s7Var = new s7(i);
        }
        return u51.a(u51Var, s7Var, null, null, new qd2(2), null, null, null, 118);
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.h0;
    }
}
