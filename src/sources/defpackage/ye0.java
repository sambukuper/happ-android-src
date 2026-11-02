package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ye0 implements me6 {
    public final Object X = new Object();
    public final Object Y = new Object();
    public fg0 Z = new fg0((byte) 0);
    public ux0 f0;
    public ux0 g0;

    @Override // defpackage.me6
    public final void Y(te6 te6Var, long j, de deVar) {
        synchronized (this.Y) {
            ux0 ux0Var = this.f0;
            if (ux0Var != null) {
                if (dh3.f(((d18) te6Var.a(e18.a, d18.b)).a.get("Camera2CameraControl.tag"), Integer.valueOf(ux0Var.hashCode()))) {
                    ux0Var.V(null);
                    this.f0 = null;
                    ux0 ux0Var2 = this.g0;
                    if (ux0Var2 != null) {
                        ux0Var2.V(null);
                        this.g0 = null;
                    }
                }
            }
        }
    }

    public final ux0 a(qq8 qq8Var, boolean z) {
        gg0 gg0VarA;
        ux0 ux0Var = new ux0();
        synchronized (this.X) {
            gg0VarA = this.Z.a();
        }
        synchronized (this.Y) {
            try {
                if (qq8Var != null) {
                    ux0 ux0Var2 = this.f0;
                    if (z) {
                        if (ux0Var2 != null) {
                            ux0Var2.l0(new nh0("Camera2CameraControl was updated with new options."));
                        }
                    } else if (ux0Var2 != null) {
                        zc1.f0(ux0Var, ux0Var2);
                    }
                    this.f0 = ux0Var;
                    Map mapSingletonMap = Collections.singletonMap("Camera2CameraControl.tag", Integer.valueOf(ux0Var.hashCode()));
                    mapSingletonMap.getClass();
                    qq8Var.c(gg0VarA, mapSingletonMap);
                } else {
                    ux0 ux0Var3 = this.g0;
                    if (ux0Var3 != null) {
                        ux0Var3.l0(new nh0("Camera2CameraControl was updated with new options."));
                    }
                    this.g0 = ux0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ux0Var;
    }
}
