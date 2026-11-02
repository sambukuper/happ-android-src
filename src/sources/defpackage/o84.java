package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o84 {
    public static final o84 X;
    public static final o84 Y;
    public static final o84 Z;
    public static final o84 f0;
    public static final o84 g0;
    public static final /* synthetic */ o84[] h0;

    static {
        o84 o84Var = new o84("DESTROYED", 0);
        X = o84Var;
        o84 o84Var2 = new o84("INITIALIZED", 1);
        Y = o84Var2;
        o84 o84Var3 = new o84("CREATED", 2);
        Z = o84Var3;
        o84 o84Var4 = new o84("STARTED", 3);
        f0 = o84Var4;
        o84 o84Var5 = new o84("RESUMED", 4);
        g0 = o84Var5;
        h0 = new o84[]{o84Var, o84Var2, o84Var3, o84Var4, o84Var5};
    }

    public static o84 valueOf(String str) {
        return (o84) Enum.valueOf(o84.class, str);
    }

    public static o84[] values() {
        return (o84[]) h0.clone();
    }
}
