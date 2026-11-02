package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g02 implements o85 {
    public static final q85 X;
    public static final /* synthetic */ g02[] Y;

    /* JADX INFO: Fake field, exist only in values array */
    g02 EF0;

    static {
        g02 g02Var = new g02("INSTANCE", 0);
        Y = new g02[]{g02Var};
        X = q85.c(g02Var);
    }

    public static g02 valueOf(String str) {
        return (g02) Enum.valueOf(g02.class, str);
    }

    public static g02[] values() {
        return (g02[]) Y.clone();
    }

    @Override // defpackage.w4
    /* JADX INFO: renamed from: a */
    public final void mo8a(Object obj) {
        ((aq7) obj).b();
    }
}
