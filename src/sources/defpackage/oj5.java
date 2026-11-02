package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oj5 {
    public static final oj5 X;
    public static final oj5 Y;
    public static final oj5 Z;
    public static final oj5 f0;
    public static final oj5 g0;
    public static final oj5 h0;
    public static final oj5 i0;
    public static final /* synthetic */ oj5[] j0;

    static {
        oj5 oj5Var = new oj5("Invalid", 0);
        X = oj5Var;
        oj5 oj5Var2 = new oj5("Cancelled", 1);
        Y = oj5Var2;
        oj5 oj5Var3 = new oj5("InitialPending", 2);
        Z = oj5Var3;
        oj5 oj5Var4 = new oj5("RecomposePending", 3);
        f0 = oj5Var4;
        oj5 oj5Var5 = new oj5("Recomposing", 4);
        g0 = oj5Var5;
        oj5 oj5Var6 = new oj5("ApplyPending", 5);
        h0 = oj5Var6;
        oj5 oj5Var7 = new oj5("Applied", 6);
        i0 = oj5Var7;
        j0 = new oj5[]{oj5Var, oj5Var2, oj5Var3, oj5Var4, oj5Var5, oj5Var6, oj5Var7};
    }

    public static oj5 valueOf(String str) {
        return (oj5) Enum.valueOf(oj5.class, str);
    }

    public static oj5[] values() {
        return (oj5[]) j0.clone();
    }
}
