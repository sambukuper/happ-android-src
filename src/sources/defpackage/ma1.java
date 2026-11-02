package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ma1 {
    public static final ma1 X;
    public static final ma1 Y;
    public static final ma1 Z;
    public static final ma1 f0;
    public static final /* synthetic */ ma1[] g0;

    static {
        ma1 ma1Var = new ma1("MEMORY_CACHE", 0);
        X = ma1Var;
        ma1 ma1Var2 = new ma1("MEMORY", 1);
        Y = ma1Var2;
        ma1 ma1Var3 = new ma1("DISK", 2);
        Z = ma1Var3;
        ma1 ma1Var4 = new ma1("NETWORK", 3);
        f0 = ma1Var4;
        g0 = new ma1[]{ma1Var, ma1Var2, ma1Var3, ma1Var4};
    }

    public static ma1 valueOf(String str) {
        return (ma1) Enum.valueOf(ma1.class, str);
    }

    public static ma1[] values() {
        return (ma1[]) g0.clone();
    }
}
