package defpackage;

import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface ih0 extends b76 {
    public static final zx c = new zx("camerax.core.camera.useCaseConfigFactory", hr8.class, null);
    public static final zx d = new zx("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);
    public static final zx e = new zx("camerax.core.camera.SessionProcessor", k57.class, null);
    public static final zx f = new zx("camerax.core.camera.isPostviewSupported", Boolean.class, null);
    public static final zx g = new zx("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    default void u() {
        if (a(e, null) == null) {
            return;
        }
        c2.m();
    }
}
