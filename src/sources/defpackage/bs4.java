package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bs4 {
    public static final bs4 X;
    public static final bs4 Y;
    public static final /* synthetic */ bs4[] Z;

    static {
        bs4 bs4Var = new bs4("Min", 0);
        X = bs4Var;
        bs4 bs4Var2 = new bs4("Max", 1);
        Y = bs4Var2;
        Z = new bs4[]{bs4Var, bs4Var2};
    }

    public static bs4 valueOf(String str) {
        return (bs4) Enum.valueOf(bs4.class, str);
    }

    public static bs4[] values() {
        return (bs4[]) Z.clone();
    }
}
