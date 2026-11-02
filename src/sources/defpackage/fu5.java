package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fu5 {
    public static final fu5 X;
    public static final fu5 Y;
    public static final fu5 Z;
    public static final /* synthetic */ fu5[] f0;

    static {
        fu5 fu5Var = new fu5("DEFAULT", 0);
        X = fu5Var;
        fu5 fu5Var2 = new fu5("VERY_LOW", 1);
        Y = fu5Var2;
        fu5 fu5Var3 = new fu5("HIGHEST", 2);
        Z = fu5Var3;
        f0 = new fu5[]{fu5Var, fu5Var2, fu5Var3};
    }

    public static fu5 valueOf(String str) {
        return (fu5) Enum.valueOf(fu5.class, str);
    }

    public static fu5[] values() {
        return (fu5[]) f0.clone();
    }
}
