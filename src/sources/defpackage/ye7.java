package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ye7 {
    public static final ye7 X;
    public static final ye7 Y;
    public static final ye7 Z;
    public static final /* synthetic */ ye7[] f0;

    static {
        ye7 ye7Var = new ye7("NONE", 0);
        X = ye7Var;
        ye7 ye7Var2 = new ye7("ADDING", 1);
        Y = ye7Var2;
        ye7 ye7Var3 = new ye7("REMOVING", 2);
        Z = ye7Var3;
        f0 = new ye7[]{ye7Var, ye7Var2, ye7Var3};
    }

    public static ye7 valueOf(String str) {
        return (ye7) Enum.valueOf(ye7.class, str);
    }

    public static ye7[] values() {
        return (ye7[]) f0.clone();
    }
}
