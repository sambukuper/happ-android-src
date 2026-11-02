package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z00 {
    public static final z00 X;
    public static final z00 Y;
    public static final /* synthetic */ z00[] Z;

    static {
        z00 z00Var = new z00("EXPONENTIAL", 0);
        X = z00Var;
        z00 z00Var2 = new z00("LINEAR", 1);
        Y = z00Var2;
        Z = new z00[]{z00Var, z00Var2};
    }

    public static z00 valueOf(String str) {
        return (z00) Enum.valueOf(z00.class, str);
    }

    public static z00[] values() {
        return (z00[]) Z.clone();
    }
}
