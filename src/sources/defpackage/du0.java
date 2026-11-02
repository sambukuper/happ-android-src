package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class du0 {
    public static final du0 X;
    public static final /* synthetic */ du0[] Y;

    /* JADX INFO: Fake field, exist only in values array */
    du0 EF0;

    static {
        du0 du0Var = new du0("UNKNOWN", 0);
        du0 du0Var2 = new du0("ANDROID_FIREBASE", 1);
        X = du0Var2;
        Y = new du0[]{du0Var, du0Var2};
    }

    public static du0 valueOf(String str) {
        return (du0) Enum.valueOf(du0.class, str);
    }

    public static du0[] values() {
        return (du0[]) Y.clone();
    }
}
