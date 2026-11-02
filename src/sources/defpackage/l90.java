package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l90 {
    public static final l90 X;
    public static final l90 Y;
    public static final l90 Z;
    public static final /* synthetic */ l90[] f0;

    static {
        l90 l90Var = new l90("SUSPEND", 0);
        X = l90Var;
        l90 l90Var2 = new l90("DROP_OLDEST", 1);
        Y = l90Var2;
        l90 l90Var3 = new l90("DROP_LATEST", 2);
        Z = l90Var3;
        f0 = new l90[]{l90Var, l90Var2, l90Var3};
    }

    public static l90 valueOf(String str) {
        return (l90) Enum.valueOf(l90.class, str);
    }

    public static l90[] values() {
        return (l90[]) f0.clone();
    }
}
