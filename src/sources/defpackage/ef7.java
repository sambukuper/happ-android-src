package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ef7 {
    public static final ef7 Y;
    public static final ef7 Z;
    public static final ef7 f0;
    public static final df7 g0;
    public static final /* synthetic */ ef7[] h0;
    public final Object X;

    static {
        ef7 ef7Var = new ef7(0, null, "NULL");
        Y = ef7Var;
        ef7 ef7Var2 = new ef7(1, -1, "INDEX");
        Z = ef7Var2;
        ef7 ef7Var3 = new ef7(2, Boolean.FALSE, "FALSE");
        f0 = ef7Var3;
        df7 df7Var = new df7(3, null, "MAP_GET_OR_DEFAULT");
        g0 = df7Var;
        h0 = new ef7[]{ef7Var, ef7Var2, ef7Var3, df7Var};
    }

    public ef7(int i, Object obj, String str) {
        super(str, i);
        this.X = obj;
    }

    public static ef7 valueOf(String str) {
        return (ef7) Enum.valueOf(ef7.class, str);
    }

    public static ef7[] values() {
        return (ef7[]) h0.clone();
    }
}
