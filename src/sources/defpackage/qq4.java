package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qq4 {
    public static final qq4 X;
    public static final qq4 Y;
    public static final qq4 Z;
    public static final qq4 f0;
    public static final /* synthetic */ qq4[] g0;

    static {
        qq4 qq4Var = new qq4("NONE", 0);
        X = qq4Var;
        qq4 qq4Var2 = new qq4("START", 1);
        Y = qq4Var2;
        qq4 qq4Var3 = new qq4("END", 2);
        Z = qq4Var3;
        qq4 qq4Var4 = new qq4("BOTH", 3);
        f0 = qq4Var4;
        g0 = new qq4[]{qq4Var, qq4Var2, qq4Var3, qq4Var4};
    }

    public static qq4 valueOf(String str) {
        return (qq4) Enum.valueOf(qq4.class, str);
    }

    public static qq4[] values() {
        return (qq4[]) g0.clone();
    }
}
