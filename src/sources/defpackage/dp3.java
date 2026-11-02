package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dp3 {
    public static final dp3 X;
    public static final dp3 Y;
    public static final dp3 Z;
    public static final dp3 f0;
    public static final dp3 g0;
    public static final /* synthetic */ dp3[] h0;

    static {
        dp3 dp3Var = new dp3("ALWAYS", 0);
        X = dp3Var;
        dp3 dp3Var2 = new dp3("NON_NULL", 1);
        Y = dp3Var2;
        dp3 dp3Var3 = new dp3("NON_ABSENT", 2);
        dp3 dp3Var4 = new dp3("NON_EMPTY", 3);
        Z = dp3Var4;
        dp3 dp3Var5 = new dp3("NON_DEFAULT", 4);
        f0 = dp3Var5;
        dp3 dp3Var6 = new dp3("CUSTOM", 5);
        dp3 dp3Var7 = new dp3("USE_DEFAULTS", 6);
        g0 = dp3Var7;
        h0 = new dp3[]{dp3Var, dp3Var2, dp3Var3, dp3Var4, dp3Var5, dp3Var6, dp3Var7};
    }

    public static dp3 valueOf(String str) {
        return (dp3) Enum.valueOf(dp3.class, str);
    }

    public static dp3[] values() {
        return (dp3[]) h0.clone();
    }
}
