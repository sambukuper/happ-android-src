package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k11 {
    public static final k11 X;
    public static final k11 Y;
    public static final k11 Z;
    public static final k11 f0;
    public static final /* synthetic */ k11[] g0;

    static {
        k11 k11Var = new k11("ALWAYS_OVERRIDE", 0);
        X = k11Var;
        k11 k11Var2 = new k11("HIGH_PRIORITY_REQUIRED", 1);
        Y = k11Var2;
        k11 k11Var3 = new k11("REQUIRED", 2);
        Z = k11Var3;
        k11 k11Var4 = new k11("OPTIONAL", 3);
        f0 = k11Var4;
        g0 = new k11[]{k11Var, k11Var2, k11Var3, k11Var4};
    }

    public static k11 valueOf(String str) {
        return (k11) Enum.valueOf(k11.class, str);
    }

    public static k11[] values() {
        return (k11[]) g0.clone();
    }
}
