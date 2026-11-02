package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gi8 {
    public static final gi8 X;
    public static final gi8 Y;
    public static final gi8 Z;
    public static final /* synthetic */ gi8[] f0;

    static {
        gi8 gi8Var = new gi8("NOT_NULL", 0);
        X = gi8Var;
        gi8 gi8Var2 = new gi8("NULLABLE", 1);
        Y = gi8Var2;
        gi8 gi8Var3 = new gi8("FLEXIBLE", 2);
        Z = gi8Var3;
        f0 = new gi8[]{gi8Var, gi8Var2, gi8Var3};
    }

    public static gi8 valueOf(String str) {
        return (gi8) Enum.valueOf(gi8.class, str);
    }

    public static gi8[] values() {
        return (gi8[]) f0.clone();
    }
}
