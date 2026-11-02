package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bh0 {
    public static final bh0 X;
    public static final bh0 Y;
    public static final bh0 Z;
    public static final bh0 f0;
    public static final bh0 g0;
    public static final bh0 h0;
    public static final bh0 i0;
    public static final /* synthetic */ bh0[] j0;

    static {
        bh0 bh0Var = new bh0("UNKNOWN", 0);
        X = bh0Var;
        bh0 bh0Var2 = new bh0("INACTIVE", 1);
        Y = bh0Var2;
        bh0 bh0Var3 = new bh0("SCANNING", 2);
        Z = bh0Var3;
        bh0 bh0Var4 = new bh0("PASSIVE_FOCUSED", 3);
        f0 = bh0Var4;
        bh0 bh0Var5 = new bh0("PASSIVE_NOT_FOCUSED", 4);
        g0 = bh0Var5;
        bh0 bh0Var6 = new bh0("LOCKED_FOCUSED", 5);
        h0 = bh0Var6;
        bh0 bh0Var7 = new bh0("LOCKED_NOT_FOCUSED", 6);
        i0 = bh0Var7;
        j0 = new bh0[]{bh0Var, bh0Var2, bh0Var3, bh0Var4, bh0Var5, bh0Var6, bh0Var7};
    }

    public static bh0 valueOf(String str) {
        return (bh0) Enum.valueOf(bh0.class, str);
    }

    public static bh0[] values() {
        return (bh0[]) j0.clone();
    }
}
