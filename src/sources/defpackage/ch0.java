package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ch0 {
    public static final ch0 X;
    public static final ch0 Y;
    public static final ch0 Z;
    public static final ch0 f0;
    public static final ch0 g0;
    public static final /* synthetic */ ch0[] h0;

    static {
        ch0 ch0Var = new ch0("UNKNOWN", 0);
        X = ch0Var;
        ch0 ch0Var2 = new ch0("INACTIVE", 1);
        Y = ch0Var2;
        ch0 ch0Var3 = new ch0("METERING", 2);
        Z = ch0Var3;
        ch0 ch0Var4 = new ch0("CONVERGED", 3);
        f0 = ch0Var4;
        ch0 ch0Var5 = new ch0("LOCKED", 4);
        g0 = ch0Var5;
        h0 = new ch0[]{ch0Var, ch0Var2, ch0Var3, ch0Var4, ch0Var5};
    }

    public static ch0 valueOf(String str) {
        return (ch0) Enum.valueOf(ch0.class, str);
    }

    public static ch0[] values() {
        return (ch0[]) h0.clone();
    }
}
