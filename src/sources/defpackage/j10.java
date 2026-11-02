package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class j10 {
    public static final h10 c = new h10(-1, false, false);
    public final boolean a;
    public final boolean b;

    static {
        new j10(-1, true, false);
        new j10(76, false, true);
        new j10(64, false, true);
    }

    public j10(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && z2) {
            bt.q("Failed requirement.");
            throw null;
        }
    }
}
