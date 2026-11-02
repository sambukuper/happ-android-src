package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l57 {
    public static final l57 X;
    public static final l57 Y;
    public static final l57 Z;
    public static final /* synthetic */ l57[] f0;

    static {
        l57 l57Var = new l57("PENDING", 0);
        X = l57Var;
        l57 l57Var2 = new l57("CREATING", 1);
        Y = l57Var2;
        l57 l57Var3 = new l57("CREATED", 2);
        Z = l57Var3;
        f0 = new l57[]{l57Var, l57Var2, l57Var3};
    }

    public static l57 valueOf(String str) {
        return (l57) Enum.valueOf(l57.class, str);
    }

    public static l57[] values() {
        return (l57[]) f0.clone();
    }
}
