package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k34 {
    public static final k34 X;
    public static final k34 Y;
    public static final k34 Z;
    public static final k34 f0;
    public static final k34 g0;
    public static final /* synthetic */ k34[] h0;

    static {
        k34 k34Var = new k34("Measuring", 0);
        X = k34Var;
        k34 k34Var2 = new k34("LookaheadMeasuring", 1);
        Y = k34Var2;
        k34 k34Var3 = new k34("LayingOut", 2);
        Z = k34Var3;
        k34 k34Var4 = new k34("LookaheadLayingOut", 3);
        f0 = k34Var4;
        k34 k34Var5 = new k34("Idle", 4);
        g0 = k34Var5;
        h0 = new k34[]{k34Var, k34Var2, k34Var3, k34Var4, k34Var5};
    }

    public static k34 valueOf(String str) {
        return (k34) Enum.valueOf(k34.class, str);
    }

    public static k34[] values() {
        return (k34[]) h0.clone();
    }
}
