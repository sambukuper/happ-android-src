package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fx4 {
    public static final k32 X;
    public static final fx4 Y;
    public static final fx4 Z;
    public static final fx4 f0;
    public static final fx4 g0;
    public static final /* synthetic */ fx4[] h0;

    static {
        fx4 fx4Var = new fx4("FINAL", 0);
        Y = fx4Var;
        fx4 fx4Var2 = new fx4("SEALED", 1);
        Z = fx4Var2;
        fx4 fx4Var3 = new fx4("OPEN", 2);
        f0 = fx4Var3;
        fx4 fx4Var4 = new fx4("ABSTRACT", 3);
        g0 = fx4Var4;
        h0 = new fx4[]{fx4Var, fx4Var2, fx4Var3, fx4Var4};
        X = new k32();
    }

    public static fx4 valueOf(String str) {
        return (fx4) Enum.valueOf(fx4.class, str);
    }

    public static fx4[] values() {
        return (fx4[]) h0.clone();
    }
}
