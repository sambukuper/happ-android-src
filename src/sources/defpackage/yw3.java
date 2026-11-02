package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yw3 {
    public static final yw3 X;
    public static final yw3 Y;
    public static final yw3 Z;
    public static final /* synthetic */ yw3[] f0;

    static {
        yw3 yw3Var = new yw3("INVARIANT", 0);
        X = yw3Var;
        yw3 yw3Var2 = new yw3("IN", 1);
        Y = yw3Var2;
        yw3 yw3Var3 = new yw3("OUT", 2);
        Z = yw3Var3;
        f0 = new yw3[]{yw3Var, yw3Var2, yw3Var3};
    }

    public static yw3 valueOf(String str) {
        return (yw3) Enum.valueOf(yw3.class, str);
    }

    public static yw3[] values() {
        return (yw3[]) f0.clone();
    }
}
