package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ek6 {
    public static final ek6 d = new ek6(0, false, false);
    public static final ek6 e = new ek6(500, true, false);
    public static final ek6 f;
    public final short a;
    public final boolean b;
    public final boolean c;

    static {
        new ek6(100L, true, false);
        f = new ek6(0L, false, true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public ek6(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = (int) j;
        if (z2) {
            mb6.o(!z, "shouldRetry must be false when completeWithoutFailure is set to true");
        }
        this.c = z2;
    }
}
