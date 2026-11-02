package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g41 {
    public static final g41 X;
    public static final g41 Y;
    public static final /* synthetic */ g41[] Z;

    static {
        g41 g41Var = new g41("VIEW_APPEAR", 0);
        X = g41Var;
        g41 g41Var2 = new g41("VIEW_DISAPPEAR", 1);
        Y = g41Var2;
        Z = new g41[]{g41Var, g41Var2};
    }

    public static g41 valueOf(String str) {
        return (g41) Enum.valueOf(g41.class, str);
    }

    public static g41[] values() {
        return (g41[]) Z.clone();
    }
}
