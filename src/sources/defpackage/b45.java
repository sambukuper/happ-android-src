package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b45 {
    public static final b45 X;
    public static final b45 Y;
    public static final b45 Z;
    public static final b45 f0;
    public static final b45 g0;
    public static final b45 h0;
    public static final /* synthetic */ b45[] i0;

    static {
        b45 b45Var = new b45("NOT_REQUIRED", 0);
        X = b45Var;
        b45 b45Var2 = new b45("CONNECTED", 1);
        Y = b45Var2;
        b45 b45Var3 = new b45("UNMETERED", 2);
        Z = b45Var3;
        b45 b45Var4 = new b45("NOT_ROAMING", 3);
        f0 = b45Var4;
        b45 b45Var5 = new b45("METERED", 4);
        g0 = b45Var5;
        b45 b45Var6 = new b45("TEMPORARILY_UNMETERED", 5);
        h0 = b45Var6;
        i0 = new b45[]{b45Var, b45Var2, b45Var3, b45Var4, b45Var5, b45Var6};
    }

    public static b45 valueOf(String str) {
        return (b45) Enum.valueOf(b45.class, str);
    }

    public static b45[] values() {
        return (b45[]) i0.clone();
    }
}
