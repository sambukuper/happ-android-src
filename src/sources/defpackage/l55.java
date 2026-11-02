package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l55 {
    public static final l55 X;
    public static final l55 Y;
    public static final /* synthetic */ l55[] Z;

    static {
        l55 l55Var = new l55("Min", 0);
        X = l55Var;
        l55 l55Var2 = new l55("Max", 1);
        Y = l55Var2;
        Z = new l55[]{l55Var, l55Var2};
    }

    public static l55 valueOf(String str) {
        return (l55) Enum.valueOf(l55.class, str);
    }

    public static l55[] values() {
        return (l55[]) Z.clone();
    }
}
