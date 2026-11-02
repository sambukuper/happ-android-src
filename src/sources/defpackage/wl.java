package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum wl {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);

    public final boolean X;
    public final boolean Y;

    /* synthetic */ wl(int i) {
        this((i & 1) == 0, false);
    }

    wl(boolean z, boolean z2) {
        this.X = z;
        this.Y = z2;
    }
}
