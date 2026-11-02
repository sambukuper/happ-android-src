package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class di3 {
    public static final di3 X;
    public static final di3 Y;
    public static final di3 Z;
    public static final di3 f0;
    public static final /* synthetic */ di3[] g0;

    static {
        di3 di3Var = new di3("IGNORED", 0);
        X = di3Var;
        di3 di3Var2 = new di3("SCHEDULED", 1);
        Y = di3Var2;
        di3 di3Var3 = new di3("DEFERRED", 2);
        Z = di3Var3;
        di3 di3Var4 = new di3("IMMINENT", 3);
        f0 = di3Var4;
        g0 = new di3[]{di3Var, di3Var2, di3Var3, di3Var4};
    }

    public static di3 valueOf(String str) {
        return (di3) Enum.valueOf(di3.class, str);
    }

    public static di3[] values() {
        return (di3[]) g0.clone();
    }
}
