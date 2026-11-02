package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yd5 {
    public static final yd5 X;
    public static final yd5 Y;
    public static final /* synthetic */ yd5[] Z;

    static {
        yd5 yd5Var = new yd5("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        X = yd5Var;
        yd5 yd5Var2 = new yd5("DROP_WORK_REQUEST", 1);
        Y = yd5Var2;
        Z = new yd5[]{yd5Var, yd5Var2};
    }

    public static yd5 valueOf(String str) {
        return (yd5) Enum.valueOf(yd5.class, str);
    }

    public static yd5[] values() {
        return (yd5[]) Z.clone();
    }
}
