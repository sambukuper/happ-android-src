package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ly4 {
    public static final ly4 X;
    public static final ly4 Y;
    public static final ly4 Z;
    public static final ly4 f0;
    public static final ly4 g0;
    public static final /* synthetic */ ly4[] h0;

    static {
        ly4 ly4Var = new ly4("DefaultSpatial", 0);
        X = ly4Var;
        ly4 ly4Var2 = new ly4("FastSpatial", 1);
        Y = ly4Var2;
        ly4 ly4Var3 = new ly4("SlowSpatial", 2);
        ly4 ly4Var4 = new ly4("DefaultEffects", 3);
        Z = ly4Var4;
        ly4 ly4Var5 = new ly4("FastEffects", 4);
        f0 = ly4Var5;
        ly4 ly4Var6 = new ly4("SlowEffects", 5);
        g0 = ly4Var6;
        h0 = new ly4[]{ly4Var, ly4Var2, ly4Var3, ly4Var4, ly4Var5, ly4Var6};
    }

    public static ly4 valueOf(String str) {
        return (ly4) Enum.valueOf(ly4.class, str);
    }

    public static ly4[] values() {
        return (ly4[]) h0.clone();
    }
}
