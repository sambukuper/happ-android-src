package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bm0 implements u18 {
    public static final zx Y = new zx("camerax.core.appConfig.cameraFactoryProvider", gi0.class, null);
    public static final zx Z = new zx("camerax.core.appConfig.deviceSurfaceManagerProvider", uf0.class, null);
    public static final zx f0 = new zx("camerax.core.appConfig.useCaseConfigFactoryProvider", vf0.class, null);
    public static final zx g0 = new zx("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final zx h0 = new zx("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final zx i0 = new zx("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final zx j0 = new zx("camerax.core.appConfig.availableCamerasLimiter", lk0.class, null);
    public static final zx k0 = new zx("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final zx l0 = new zx("camerax.core.appConfig.cameraProviderInitRetryPolicy", fk6.class, null);
    public static final zx m0 = new zx("camerax.core.appConfig.quirksSettings", g26.class, null);
    public static final zx n0 = new zx("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    public final qd5 X;

    public bm0(qd5 qd5Var) {
        this.X = qd5Var;
    }

    public final lk0 c() {
        return (lk0) this.X.a(j0, null);
    }

    public final gi0 j() {
        return (gi0) this.X.a(Y, null);
    }

    public final long k() {
        return ((Long) this.X.a(k0, -1L)).longValue();
    }

    public final uf0 l() {
        return (uf0) this.X.a(Z, null);
    }

    @Override // defpackage.b76
    public final l11 m() {
        return this.X;
    }

    public final vf0 o() {
        return (vf0) this.X.a(f0, null);
    }
}
