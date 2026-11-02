package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class be6 {
    public static final be6 X;
    public static final /* synthetic */ be6[] Y;

    static {
        be6 be6Var = new be6("Restart", 0);
        X = be6Var;
        Y = new be6[]{be6Var, new be6("Reverse", 1)};
    }

    public static be6 valueOf(String str) {
        return (be6) Enum.valueOf(be6.class, str);
    }

    public static be6[] values() {
        return (be6[]) Y.clone();
    }
}
