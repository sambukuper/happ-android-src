package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tz3 {
    public static final tz3 X;
    public static final tz3 Y;
    public static final tz3 Z;
    public static final /* synthetic */ tz3[] f0;

    static {
        tz3 tz3Var = new tz3("WARNING", 0);
        X = tz3Var;
        tz3 tz3Var2 = new tz3("ERROR", 1);
        Y = tz3Var2;
        tz3 tz3Var3 = new tz3("HIDDEN", 2);
        Z = tz3Var3;
        f0 = new tz3[]{tz3Var, tz3Var2, tz3Var3};
    }

    public static tz3 valueOf(String str) {
        return (tz3) Enum.valueOf(tz3.class, str);
    }

    public static tz3[] values() {
        return (tz3[]) f0.clone();
    }
}
