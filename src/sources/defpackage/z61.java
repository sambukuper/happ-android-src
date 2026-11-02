package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z61 {
    public static final z61 X;
    public static final z61 Y;
    public static final z61 Z;
    public static final z61 f0;
    public static final z61 g0;
    public static final /* synthetic */ z61[] h0;

    static {
        z61 z61Var = new z61("CPU_ACQUIRED", 0);
        X = z61Var;
        z61 z61Var2 = new z61("BLOCKING", 1);
        Y = z61Var2;
        z61 z61Var3 = new z61("PARKING", 2);
        Z = z61Var3;
        z61 z61Var4 = new z61("DORMANT", 3);
        f0 = z61Var4;
        z61 z61Var5 = new z61("TERMINATED", 4);
        g0 = z61Var5;
        h0 = new z61[]{z61Var, z61Var2, z61Var3, z61Var4, z61Var5};
    }

    public static z61 valueOf(String str) {
        return (z61) Enum.valueOf(z61.class, str);
    }

    public static z61[] values() {
        return (z61[]) h0.clone();
    }
}
