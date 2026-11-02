package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ys5 {
    public static final ys5 X;
    public static final ys5 Y;
    public static final ys5 Z;
    public static final ys5 f0;
    public static final ys5 g0;
    public static final ys5 h0;
    public static final ys5 i0;
    public static final ys5 j0;
    public static final ys5 k0;
    public static final ys5 l0;
    public static final /* synthetic */ ys5[] m0;

    static {
        ys5 ys5Var = new ys5("none", 0);
        X = ys5Var;
        ys5 ys5Var2 = new ys5("xMinYMin", 1);
        Y = ys5Var2;
        ys5 ys5Var3 = new ys5("xMidYMin", 2);
        Z = ys5Var3;
        ys5 ys5Var4 = new ys5("xMaxYMin", 3);
        f0 = ys5Var4;
        ys5 ys5Var5 = new ys5("xMinYMid", 4);
        g0 = ys5Var5;
        ys5 ys5Var6 = new ys5("xMidYMid", 5);
        h0 = ys5Var6;
        ys5 ys5Var7 = new ys5("xMaxYMid", 6);
        i0 = ys5Var7;
        ys5 ys5Var8 = new ys5("xMinYMax", 7);
        j0 = ys5Var8;
        ys5 ys5Var9 = new ys5("xMidYMax", 8);
        k0 = ys5Var9;
        ys5 ys5Var10 = new ys5("xMaxYMax", 9);
        l0 = ys5Var10;
        m0 = new ys5[]{ys5Var, ys5Var2, ys5Var3, ys5Var4, ys5Var5, ys5Var6, ys5Var7, ys5Var8, ys5Var9, ys5Var10};
    }

    public static ys5 valueOf(String str) {
        return (ys5) Enum.valueOf(ys5.class, str);
    }

    public static ys5[] values() {
        return (ys5[]) m0.clone();
    }
}
