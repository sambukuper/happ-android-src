package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y53 implements er8, i63, ji3 {
    public static final zx Y;
    public static final zx Z;
    public static final zx f0;
    public static final zx g0;
    public static final zx h0;
    public static final zx i0;
    public static final zx j0;
    public static final zx k0;
    public static final zx l0;
    public final qd5 X;

    static {
        Class cls = Integer.TYPE;
        Y = new zx("camerax.core.imageCapture.captureMode", cls, null);
        Z = new zx("camerax.core.imageCapture.flashMode", cls, null);
        f0 = new zx("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        g0 = new zx("camerax.core.imageCapture.outputFormat", Integer.class, null);
        h0 = new zx("camerax.core.imageCapture.imageReaderProxyProvider", r63.class, null);
        i0 = new zx("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        j0 = new zx("camerax.core.imageCapture.flashType", cls, null);
        k0 = new zx("camerax.core.imageCapture.screenFlash", v53.class, null);
        l0 = new zx("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public y53(qd5 qd5Var) {
        this.X = qd5Var;
    }

    @Override // defpackage.b76
    public final l11 m() {
        return this.X;
    }

    @Override // defpackage.e63
    public final int n() {
        return ((Integer) d(e63.p)).intValue();
    }
}
