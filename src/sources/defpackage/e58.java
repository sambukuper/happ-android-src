package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e58 {
    public static final e58 X;
    public static final e58 Y;
    public static final /* synthetic */ e58[] Z;

    static {
        e58 e58Var = new e58("MergeIfPossible", 0);
        X = e58Var;
        e58 e58Var2 = new e58("ClearHistory", 1);
        e58 e58Var3 = new e58("NeverMerge", 2);
        Y = e58Var3;
        Z = new e58[]{e58Var, e58Var2, e58Var3};
    }

    public static e58 valueOf(String str) {
        return (e58) Enum.valueOf(e58.class, str);
    }

    public static e58[] values() {
        return (e58[]) Z.clone();
    }
}
