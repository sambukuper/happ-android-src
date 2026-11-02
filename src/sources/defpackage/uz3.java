package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uz3 {
    public static final uz3 X;
    public static final uz3 Y;
    public static final uz3 Z;
    public static final uz3 f0;
    public static final /* synthetic */ uz3[] g0;

    static {
        uz3 uz3Var = new uz3("LANGUAGE_VERSION", 0);
        X = uz3Var;
        uz3 uz3Var2 = new uz3("COMPILER_VERSION", 1);
        Y = uz3Var2;
        uz3 uz3Var3 = new uz3("API_VERSION", 2);
        Z = uz3Var3;
        uz3 uz3Var4 = new uz3("UNKNOWN", 3);
        f0 = uz3Var4;
        g0 = new uz3[]{uz3Var, uz3Var2, uz3Var3, uz3Var4};
    }

    public static uz3 valueOf(String str) {
        return (uz3) Enum.valueOf(uz3.class, str);
    }

    public static uz3[] values() {
        return (uz3[]) g0.clone();
    }
}
