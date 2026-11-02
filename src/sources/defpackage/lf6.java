package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lf6 {
    public static final lf6 X;
    public static final lf6 Y;
    public static final /* synthetic */ lf6[] Z;

    static {
        lf6 lf6Var = new lf6("Ltr", 0);
        X = lf6Var;
        lf6 lf6Var2 = new lf6("Rtl", 1);
        Y = lf6Var2;
        Z = new lf6[]{lf6Var, lf6Var2};
    }

    public static lf6 valueOf(String str) {
        return (lf6) Enum.valueOf(lf6.class, str);
    }

    public static lf6[] values() {
        return (lf6[]) Z.clone();
    }
}
