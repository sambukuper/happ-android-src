package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ae3 {
    public static final ae3 X;
    public static final ae3 Y;
    public static final ae3 Z;
    public static final /* synthetic */ ae3[] f0;

    static {
        ae3 ae3Var = new ae3("Focused", 0);
        X = ae3Var;
        ae3 ae3Var2 = new ae3("UnfocusedEmpty", 1);
        Y = ae3Var2;
        ae3 ae3Var3 = new ae3("UnfocusedNotEmpty", 2);
        Z = ae3Var3;
        f0 = new ae3[]{ae3Var, ae3Var2, ae3Var3};
    }

    public static ae3 valueOf(String str) {
        return (ae3) Enum.valueOf(ae3.class, str);
    }

    public static ae3[] values() {
        return (ae3[]) f0.clone();
    }
}
