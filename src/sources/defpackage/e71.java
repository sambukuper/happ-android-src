package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e71 {
    public static final e71 X;
    public static final e71 Y;
    public static final e71 Z;
    public static final e71 f0;
    public static final /* synthetic */ e71[] g0;

    static {
        e71 e71Var = new e71("DEFAULT", 0);
        X = e71Var;
        e71 e71Var2 = new e71("LAZY", 1);
        Y = e71Var2;
        e71 e71Var3 = new e71("ATOMIC", 2);
        Z = e71Var3;
        e71 e71Var4 = new e71("UNDISPATCHED", 3);
        f0 = e71Var4;
        g0 = new e71[]{e71Var, e71Var2, e71Var3, e71Var4};
    }

    public static e71 valueOf(String str) {
        return (e71) Enum.valueOf(e71.class, str);
    }

    public static e71[] values() {
        return (e71[]) g0.clone();
    }
}
