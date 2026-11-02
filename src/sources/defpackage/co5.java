package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class co5 {
    public static final co5 X;
    public static final co5 Y;
    public static final /* synthetic */ co5[] Z;

    static {
        co5 co5Var = new co5("UNCHANGED", 0);
        X = co5Var;
        co5 co5Var2 = new co5("TRANSLUCENT", 1);
        co5 co5Var3 = new co5("OPAQUE", 2);
        Y = co5Var3;
        Z = new co5[]{co5Var, co5Var2, co5Var3};
    }

    public static co5 valueOf(String str) {
        return (co5) Enum.valueOf(co5.class, str);
    }

    public static co5[] values() {
        return (co5[]) Z.clone();
    }
}
