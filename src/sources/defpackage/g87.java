package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g87 {
    public static final g87 X;
    public static final g87 Y;
    public static final g87 Z;
    public static final /* synthetic */ g87[] f0;

    static {
        g87 g87Var = new g87("START", 0);
        X = g87Var;
        g87 g87Var2 = new g87("STOP", 1);
        Y = g87Var2;
        g87 g87Var3 = new g87("STOP_AND_RESET_REPLAY_CACHE", 2);
        Z = g87Var3;
        f0 = new g87[]{g87Var, g87Var2, g87Var3};
    }

    public static g87 valueOf(String str) {
        return (g87) Enum.valueOf(g87.class, str);
    }

    public static g87[] values() {
        return (g87[]) f0.clone();
    }
}
