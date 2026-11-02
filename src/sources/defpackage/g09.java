package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g09 {
    public static final g09 X;
    public static final g09 Y;
    public static final g09 Z;
    public static final /* synthetic */ g09[] f0;

    static {
        g09 g09Var = new g09("NEVER", 0);
        X = g09Var;
        g09 g09Var2 = new g09("IF_NONZERO", 1);
        Y = g09Var2;
        g09 g09Var3 = new g09("ALWAYS", 2);
        Z = g09Var3;
        f0 = new g09[]{g09Var, g09Var2, g09Var3};
    }

    public static g09 valueOf(String str) {
        return (g09) Enum.valueOf(g09.class, str);
    }

    public static g09[] values() {
        return (g09[]) f0.clone();
    }
}
