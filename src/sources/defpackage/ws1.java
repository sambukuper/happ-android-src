package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ws1 {
    public static final ws1 X;
    public static final ws1 Y;
    public static final ws1 Z;
    public static final ws1 f0;
    public static final /* synthetic */ ws1[] g0;

    static {
        ws1 ws1Var = new ws1("Up", 0);
        X = ws1Var;
        ws1 ws1Var2 = new ws1("Drag", 1);
        Y = ws1Var2;
        ws1 ws1Var3 = new ws1("Timeout", 2);
        Z = ws1Var3;
        ws1 ws1Var4 = new ws1("Cancel", 3);
        f0 = ws1Var4;
        g0 = new ws1[]{ws1Var, ws1Var2, ws1Var3, ws1Var4};
    }

    public static ws1 valueOf(String str) {
        return (ws1) Enum.valueOf(ws1.class, str);
    }

    public static ws1[] values() {
        return (ws1[]) g0.clone();
    }
}
