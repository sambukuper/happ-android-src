package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g62 {
    public static final g62 X;
    public static final g62 Y;
    public static final g62 Z;
    public static final g62 f0;
    public static final /* synthetic */ g62[] g0;

    static {
        g62 g62Var = new g62("REPLACE", 0);
        X = g62Var;
        g62 g62Var2 = new g62("KEEP", 1);
        Y = g62Var2;
        g62 g62Var3 = new g62("APPEND", 2);
        Z = g62Var3;
        g62 g62Var4 = new g62("APPEND_OR_REPLACE", 3);
        f0 = g62Var4;
        g0 = new g62[]{g62Var, g62Var2, g62Var3, g62Var4};
    }

    public static g62 valueOf(String str) {
        return (g62) Enum.valueOf(g62.class, str);
    }

    public static g62[] values() {
        return (g62[]) g0.clone();
    }
}
