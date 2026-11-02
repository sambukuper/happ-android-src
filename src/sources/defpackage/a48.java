package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a48 {
    public static final a48 X;
    public static final a48 Y;
    public static final a48 Z;
    public static final a48 f0;
    public static final /* synthetic */ a48[] g0;

    static {
        a48 a48Var = new a48("Start", 0);
        X = a48Var;
        a48 a48Var2 = new a48("End", 1);
        Y = a48Var2;
        a48 a48Var3 = new a48("Inner", 2);
        Z = a48Var3;
        a48 a48Var4 = new a48("NotByUser", 3);
        f0 = a48Var4;
        g0 = new a48[]{a48Var, a48Var2, a48Var3, a48Var4};
    }

    public static a48 valueOf(String str) {
        return (a48) Enum.valueOf(a48.class, str);
    }

    public static a48[] values() {
        return (a48[]) g0.clone();
    }
}
