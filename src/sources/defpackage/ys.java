package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ys extends a28 {
    public static volatile ys b;
    public static final nd c = new nd((byte) 1);
    public final kg1 a = new kg1();

    public static ys y() {
        if (b != null) {
            return b;
        }
        synchronized (ys.class) {
            try {
                if (b == null) {
                    b = new ys();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }
}
