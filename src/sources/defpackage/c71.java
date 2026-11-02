package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c71 {
    public static final c71 X;
    public static final c71 Y;
    public static final c71 Z;
    public static final /* synthetic */ c71[] f0;

    static {
        c71 c71Var = new c71("COROUTINE_SUSPENDED", 0);
        X = c71Var;
        c71 c71Var2 = new c71("UNDECIDED", 1);
        Y = c71Var2;
        c71 c71Var3 = new c71("RESUMED", 2);
        Z = c71Var3;
        f0 = new c71[]{c71Var, c71Var2, c71Var3};
    }

    public static c71 valueOf(String str) {
        return (c71) Enum.valueOf(c71.class, str);
    }

    public static c71[] values() {
        return (c71[]) f0.clone();
    }
}
