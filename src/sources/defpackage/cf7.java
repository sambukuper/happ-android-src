package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cf7 {
    public static final cf7 X;
    public static final cf7 Y;
    public static final cf7 Z;
    public static final /* synthetic */ cf7[] f0;

    static {
        cf7 cf7Var = new cf7("ONE_COLLECTION_PARAMETER", 0);
        X = cf7Var;
        cf7 cf7Var2 = new cf7("OBJECT_PARAMETER_NON_GENERIC", 1);
        Y = cf7Var2;
        cf7 cf7Var3 = new cf7("OBJECT_PARAMETER_GENERIC", 2);
        Z = cf7Var3;
        f0 = new cf7[]{cf7Var, cf7Var2, cf7Var3};
    }

    public static cf7 valueOf(String str) {
        return (cf7) Enum.valueOf(cf7.class, str);
    }

    public static cf7[] values() {
        return (cf7[]) f0.clone();
    }
}
