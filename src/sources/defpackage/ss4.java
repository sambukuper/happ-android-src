package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ss4 {
    public static final ss4 X;
    public static final ss4 Y;
    public static final /* synthetic */ ss4[] Z;

    static {
        ss4 ss4Var = new ss4("DECLARED", 0);
        X = ss4Var;
        ss4 ss4Var2 = new ss4("INHERITED", 1);
        Y = ss4Var2;
        Z = new ss4[]{ss4Var, ss4Var2};
    }

    public static ss4 valueOf(String str) {
        return (ss4) Enum.valueOf(ss4.class, str);
    }

    public static ss4[] values() {
        return (ss4[]) Z.clone();
    }
}
