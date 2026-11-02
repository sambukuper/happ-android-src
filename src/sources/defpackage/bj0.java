package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bj0 {
    public static final bj0 X;
    public static final bj0 Y;
    public static final bj0 Z;
    public static final bj0 f0;
    public static final bj0 g0;
    public static final bj0 h0;
    public static final bj0 i0;
    public static final /* synthetic */ bj0[] j0;

    static {
        bj0 bj0Var = new bj0("RELEASED", 0);
        X = bj0Var;
        bj0 bj0Var2 = new bj0("RELEASING", 1);
        Y = bj0Var2;
        bj0 bj0Var3 = new bj0("CLOSED", 2);
        Z = bj0Var3;
        bj0 bj0Var4 = new bj0("PENDING_OPEN", 3);
        f0 = bj0Var4;
        bj0 bj0Var5 = new bj0("CLOSING", 4);
        g0 = bj0Var5;
        bj0 bj0Var6 = new bj0("OPENING", 5);
        h0 = bj0Var6;
        bj0 bj0Var7 = new bj0("OPEN", 6);
        i0 = bj0Var7;
        j0 = new bj0[]{bj0Var, bj0Var2, bj0Var3, bj0Var4, bj0Var5, bj0Var6, bj0Var7, new bj0("CONFIGURED", 7)};
    }

    public static bj0 valueOf(String str) {
        return (bj0) Enum.valueOf(bj0.class, str);
    }

    public static bj0[] values() {
        return (bj0[]) j0.clone();
    }
}
