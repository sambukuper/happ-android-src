package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bq5 {
    public static final bq5 X;
    public static final bq5 Y;
    public static final bq5 Z;
    public static final /* synthetic */ bq5[] f0;

    static {
        bq5 bq5Var = new bq5("Initial", 0);
        X = bq5Var;
        bq5 bq5Var2 = new bq5("Main", 1);
        Y = bq5Var2;
        bq5 bq5Var3 = new bq5("Final", 2);
        Z = bq5Var3;
        f0 = new bq5[]{bq5Var, bq5Var2, bq5Var3};
    }

    public static bq5 valueOf(String str) {
        return (bq5) Enum.valueOf(bq5.class, str);
    }

    public static bq5[] values() {
        return (bq5[]) f0.clone();
    }
}
