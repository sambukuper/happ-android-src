package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bi3 {
    public static final bi3 X;
    public static final bi3 Y;
    public static final bi3 Z;
    public static final bi3 f0;
    public static final /* synthetic */ bi3[] g0;

    static {
        bi3 bi3Var = new bi3("LookaheadMeasurement", 0);
        X = bi3Var;
        bi3 bi3Var2 = new bi3("LookaheadPlacement", 1);
        Y = bi3Var2;
        bi3 bi3Var3 = new bi3("Measurement", 2);
        Z = bi3Var3;
        bi3 bi3Var4 = new bi3("Placement", 3);
        f0 = bi3Var4;
        g0 = new bi3[]{bi3Var, bi3Var2, bi3Var3, bi3Var4};
    }

    public static bi3 valueOf(String str) {
        return (bi3) Enum.valueOf(bi3.class, str);
    }

    public static bi3[] values() {
        return (bi3[]) g0.clone();
    }
}
