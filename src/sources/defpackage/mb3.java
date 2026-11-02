package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mb3 {
    public static final mb3 X;
    public static final mb3 Y;
    public static final mb3 Z;
    public static final mb3 f0;
    public static final /* synthetic */ mb3[] g0;

    static {
        mb3 mb3Var = new mb3("Untransformed", 0);
        X = mb3Var;
        mb3 mb3Var2 = new mb3("Insertion", 1);
        Y = mb3Var2;
        mb3 mb3Var3 = new mb3("Replacement", 2);
        Z = mb3Var3;
        mb3 mb3Var4 = new mb3("Deletion", 3);
        f0 = mb3Var4;
        g0 = new mb3[]{mb3Var, mb3Var2, mb3Var3, mb3Var4};
    }

    public static mb3 valueOf(String str) {
        return (mb3) Enum.valueOf(mb3.class, str);
    }

    public static mb3[] values() {
        return (mb3[]) g0.clone();
    }
}
