package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hj4 {
    public static final hj4 X;
    public static final hj4 Y;
    public static final hj4 Z;
    public static final hj4 f0;
    public static final hj4 g0;
    public static final /* synthetic */ hj4[] h0;

    static {
        hj4 hj4Var = new hj4("LevelDebug", 0);
        X = hj4Var;
        hj4 hj4Var2 = new hj4("LevelInfo", 1);
        Y = hj4Var2;
        hj4 hj4Var3 = new hj4("LevelWarning", 2);
        Z = hj4Var3;
        hj4 hj4Var4 = new hj4("LevelError", 3);
        f0 = hj4Var4;
        hj4 hj4Var5 = new hj4("LevelNone", 4);
        g0 = hj4Var5;
        h0 = new hj4[]{hj4Var, hj4Var2, hj4Var3, hj4Var4, hj4Var5};
    }

    public static hj4 valueOf(String str) {
        return (hj4) Enum.valueOf(hj4.class, str);
    }

    public static hj4[] values() {
        return (hj4[]) h0.clone();
    }
}
