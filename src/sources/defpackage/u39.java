package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u39 {
    public static final u39 X;
    public static final u39 Y;
    public static final u39 Z;
    public static final u39 f0;
    public static final u39 g0;
    public static final u39 h0;
    public static final /* synthetic */ u39[] i0;

    static {
        u39 u39Var = new u39("ENQUEUED", 0);
        X = u39Var;
        u39 u39Var2 = new u39("RUNNING", 1);
        Y = u39Var2;
        u39 u39Var3 = new u39("SUCCEEDED", 2);
        Z = u39Var3;
        u39 u39Var4 = new u39("FAILED", 3);
        f0 = u39Var4;
        u39 u39Var5 = new u39("BLOCKED", 4);
        g0 = u39Var5;
        u39 u39Var6 = new u39("CANCELLED", 5);
        h0 = u39Var6;
        i0 = new u39[]{u39Var, u39Var2, u39Var3, u39Var4, u39Var5, u39Var6};
    }

    public static u39 valueOf(String str) {
        return (u39) Enum.valueOf(u39.class, str);
    }

    public static u39[] values() {
        return (u39[]) i0.clone();
    }

    public final boolean a() {
        return this == Z || this == f0 || this == h0;
    }
}
