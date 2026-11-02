package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aj8 {
    public static final aj8 X;
    public static final aj8 Y;
    public static final /* synthetic */ aj8[] Z;

    static {
        aj8 aj8Var = new aj8("SUPERTYPE", 0);
        X = aj8Var;
        aj8 aj8Var2 = new aj8("COMMON", 1);
        Y = aj8Var2;
        Z = new aj8[]{aj8Var, aj8Var2};
    }

    public static aj8 valueOf(String str) {
        return (aj8) Enum.valueOf(aj8.class, str);
    }

    public static aj8[] values() {
        return (aj8[]) Z.clone();
    }
}
