package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class px7 {
    public static final px7 X;
    public static final px7 Y;
    public static final /* synthetic */ px7[] Z;

    static {
        px7 px7Var = new px7("FEATURE_COMBINATION_TABLE", 0);
        X = px7Var;
        px7 px7Var2 = new px7("CAPTURE_SESSION_TABLES", 1);
        Y = px7Var2;
        Z = new px7[]{px7Var, px7Var2};
    }

    public static px7 valueOf(String str) {
        return (px7) Enum.valueOf(px7.class, str);
    }

    public static px7[] values() {
        return (px7[]) Z.clone();
    }
}
