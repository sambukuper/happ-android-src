package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ts3 {
    public static final ts3 X;
    public static final ts3 Y;
    public static final ts3 Z;
    public static final ts3 f0;
    public static final ts3 g0;
    public static final /* synthetic */ ts3[] h0;

    static {
        ts3 ts3Var = new ts3("HIDDEN", 0);
        X = ts3Var;
        ts3 ts3Var2 = new ts3("VISIBLE", 1);
        Y = ts3Var2;
        ts3 ts3Var3 = new ts3("DEPRECATED_LIST_METHODS", 2);
        Z = ts3Var3;
        ts3 ts3Var4 = new ts3("NOT_CONSIDERED", 3);
        f0 = ts3Var4;
        ts3 ts3Var5 = new ts3("DROP", 4);
        g0 = ts3Var5;
        h0 = new ts3[]{ts3Var, ts3Var2, ts3Var3, ts3Var4, ts3Var5};
    }

    public static ts3 valueOf(String str) {
        return (ts3) Enum.valueOf(ts3.class, str);
    }

    public static ts3[] values() {
        return (ts3[]) h0.clone();
    }
}
