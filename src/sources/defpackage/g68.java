package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g68 {
    public static final g68 X;
    public static final g68 Y;
    public static final g68 Z;
    public static final /* synthetic */ g68[] f0;

    static {
        g68 g68Var = new g68("None", 0);
        X = g68Var;
        g68 g68Var2 = new g68("Touch", 1);
        Y = g68Var2;
        g68 g68Var3 = new g68("Mouse", 2);
        Z = g68Var3;
        f0 = new g68[]{g68Var, g68Var2, g68Var3};
    }

    public static g68 valueOf(String str) {
        return (g68) Enum.valueOf(g68.class, str);
    }

    public static g68[] values() {
        return (g68[]) f0.clone();
    }
}
