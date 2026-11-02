package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ez3 {
    public static final ez3 X;
    public static final ez3 Y;
    public static final ez3 Z;
    public static final ez3 f0;
    public static final /* synthetic */ ez3[] g0;

    static {
        ez3 ez3Var = new ez3("RETURNS_CONSTANT", 0);
        X = ez3Var;
        ez3 ez3Var2 = new ez3("CALLS", 1);
        Y = ez3Var2;
        ez3 ez3Var3 = new ez3("RETURNS_NOT_NULL", 2);
        Z = ez3Var3;
        ez3 ez3Var4 = new ez3("RETURNS_RESULT_OF", 3);
        f0 = ez3Var4;
        g0 = new ez3[]{ez3Var, ez3Var2, ez3Var3, ez3Var4};
    }

    public static ez3 valueOf(String str) {
        return (ez3) Enum.valueOf(ez3.class, str);
    }

    public static ez3[] values() {
        return (ez3[]) g0.clone();
    }
}
