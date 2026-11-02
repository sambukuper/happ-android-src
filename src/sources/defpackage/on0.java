package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class on0 {
    public static final on0 X;
    public static final on0 Y;
    public static final on0 Z;
    public static final on0 f0;
    public static final on0 g0;
    public static final /* synthetic */ on0[] h0;

    static {
        on0 on0Var = new on0("PENDING", 0);
        X = on0Var;
        on0 on0Var2 = new on0("CREATING", 1);
        Y = on0Var2;
        on0 on0Var3 = new on0("CREATED", 2);
        Z = on0Var3;
        on0 on0Var4 = new on0("CLOSING", 3);
        f0 = on0Var4;
        on0 on0Var5 = new on0("CLOSED", 4);
        g0 = on0Var5;
        h0 = new on0[]{on0Var, on0Var2, on0Var3, on0Var4, on0Var5};
    }

    public static on0 valueOf(String str) {
        return (on0) Enum.valueOf(on0.class, str);
    }

    public static on0[] values() {
        return (on0[]) h0.clone();
    }
}
