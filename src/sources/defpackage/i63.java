package defpackage;

import android.util.Size;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface i63 extends b76 {
    public static final zx A;
    public static final zx B;
    public static final zx s = new zx("camerax.core.imageOutput.targetAspectRatio", pu.class, null);
    public static final zx t;
    public static final zx u;
    public static final zx v;
    public static final zx w;
    public static final zx x;
    public static final zx y;
    public static final zx z;

    static {
        Class cls = Integer.TYPE;
        t = new zx("camerax.core.imageOutput.targetRotation", cls, null);
        u = new zx("camerax.core.imageOutput.appTargetRotation", cls, null);
        v = new zx("camerax.core.imageOutput.mirrorMode", cls, null);
        w = new zx("camerax.core.imageOutput.targetResolution", Size.class, null);
        x = new zx("camerax.core.imageOutput.defaultResolution", Size.class, null);
        y = new zx("camerax.core.imageOutput.maxResolution", Size.class, null);
        z = new zx("camerax.core.imageOutput.supportedResolutions", List.class, null);
        A = new zx("camerax.core.imageOutput.resolutionSelector", ef6.class, null);
        B = new zx("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void G(i63 i63Var) {
        boolean zH = i63Var.h(s);
        boolean z2 = ((Size) i63Var.a(w, null)) != null;
        if (zH && z2) {
            bt.q("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((ef6) i63Var.a(A, null)) != null) {
            if (zH || z2) {
                bt.q("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int H(int i) {
        return ((Integer) a(t, Integer.valueOf(i))).intValue();
    }
}
