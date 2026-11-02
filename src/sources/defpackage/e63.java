package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface e63 extends b76 {
    public static final zx p;
    public static final zx q;
    public static final zx r;

    static {
        Class cls = Integer.TYPE;
        p = new zx("camerax.core.imageInput.inputFormat", cls, null);
        q = new zx("camerax.core.imageInput.secondaryInputFormat", cls, null);
        r = new zx("camerax.core.imageInput.inputDynamicRange", px1.class, null);
    }

    default int n() {
        return ((Integer) d(p)).intValue();
    }
}
