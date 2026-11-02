package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fw3 {
    public static final fw3 X;
    public static final fw3 Y;
    public static final fw3 Z;
    public static final fw3 f0;
    public static final /* synthetic */ fw3[] g0;

    static {
        fw3 fw3Var = new fw3("INSTANCE", 0);
        X = fw3Var;
        fw3 fw3Var2 = new fw3("CONTEXT", 1);
        Y = fw3Var2;
        fw3 fw3Var3 = new fw3("EXTENSION_RECEIVER", 2);
        Z = fw3Var3;
        fw3 fw3Var4 = new fw3("VALUE", 3);
        f0 = fw3Var4;
        g0 = new fw3[]{fw3Var, fw3Var2, fw3Var3, fw3Var4};
    }

    public static fw3 valueOf(String str) {
        return (fw3) Enum.valueOf(fw3.class, str);
    }

    public static fw3[] values() {
        return (fw3[]) g0.clone();
    }
}
