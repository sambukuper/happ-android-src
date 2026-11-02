package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aj4 {
    public static final aj4 X;
    public static final aj4 Y;
    public static final aj4 Z;
    public static final /* synthetic */ aj4[] f0;

    static {
        aj4 aj4Var = new aj4("IsPlacedInLookahead", 0);
        X = aj4Var;
        aj4 aj4Var2 = new aj4("IsPlacedInApproach", 1);
        Y = aj4Var2;
        aj4 aj4Var3 = new aj4("IsNotPlaced", 2);
        Z = aj4Var3;
        f0 = new aj4[]{aj4Var, aj4Var2, aj4Var3};
    }

    public static aj4 valueOf(String str) {
        return (aj4) Enum.valueOf(aj4.class, str);
    }

    public static aj4[] values() {
        return (aj4[]) f0.clone();
    }
}
