package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wi1 {
    public static final wi1 X;
    public static final /* synthetic */ wi1[] Y;

    /* JADX INFO: Fake field, exist only in values array */
    wi1 EF0;

    static {
        wi1 wi1Var = new wi1("WARNING", 0);
        wi1 wi1Var2 = new wi1("ERROR", 1);
        X = wi1Var2;
        Y = new wi1[]{wi1Var, wi1Var2, new wi1("HIDDEN", 2)};
    }

    public static wi1 valueOf(String str) {
        return (wi1) Enum.valueOf(wi1.class, str);
    }

    public static wi1[] values() {
        return (wi1[]) Y.clone();
    }
}
