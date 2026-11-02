package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface er8 extends u18, e63 {
    public static final zx L = new zx("camerax.core.useCase.defaultSessionConfig", f57.class, null);
    public static final zx M = new zx("camerax.core.useCase.defaultCaptureConfig", ym0.class, null);
    public static final zx N = new zx("camerax.core.useCase.sessionConfigUnpacker", rl0.class, null);
    public static final zx O = new zx("camerax.core.useCase.captureConfigUnpacker", ql0.class, null);
    public static final zx P;
    public static final zx Q;
    public static final zx R;
    public static final zx S;
    public static final zx T;
    public static final zx U;
    public static final zx V;
    public static final zx W;
    public static final zx a0;
    public static final zx b0;
    public static final zx c0;
    public static final zx d0;
    public static final zx e0;

    static {
        Class cls = Integer.TYPE;
        P = new zx("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        Q = new zx("camerax.core.useCase.sessionType", cls, null);
        R = new zx("camerax.core.useCase.targetFrameRate", Range.class, null);
        S = new zx("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        T = new zx("camerax.core.useCase.resolutionToMaxFrameRate", Map.class, null);
        Class cls2 = Boolean.TYPE;
        U = new zx("camerax.core.useCase.zslDisabled", cls2, null);
        V = new zx("camerax.core.useCase.highResolutionDisabled", cls2, null);
        W = new zx("camerax.core.useCase.captureType", gr8.class, null);
        a0 = new zx("camerax.core.useCase.previewStabilizationMode", cls, null);
        b0 = new zx("camerax.core.useCase.videoStabilizationMode", cls, null);
        c0 = new zx("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class, null);
        d0 = new zx("camerax.core.useCase.takePictureManagerProvider", cr8.class, null);
        e0 = new zx("camerax.core.useCase.streamUseCase", jl7.class, null);
    }

    default int B() {
        return ((Integer) a(a0, 0)).intValue();
    }

    default jl7 r() {
        jl7 jl7Var = (jl7) a(e0, jl7.DEFAULT);
        Objects.requireNonNull(jl7Var);
        return jl7Var;
    }

    default gr8 s() {
        return (gr8) d(W);
    }

    default int t() {
        return ((Integer) a(b0, 0)).intValue();
    }

    default int v(Size size) {
        Map map = (Map) a(T, null);
        if (map == null || !map.containsKey(size)) {
            return Integer.MAX_VALUE;
        }
        Integer num = (Integer) map.get(size);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
