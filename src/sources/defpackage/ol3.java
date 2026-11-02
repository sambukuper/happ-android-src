package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ol3 {
    public static final ol3 X;
    public static final ol3 Y;
    public static final ol3 Z;
    public static final /* synthetic */ ol3[] f0;

    static {
        ol3 ol3Var = new ol3("INFLEXIBLE", 0);
        X = ol3Var;
        ol3 ol3Var2 = new ol3("FLEXIBLE_UPPER_BOUND", 1);
        Y = ol3Var2;
        ol3 ol3Var3 = new ol3("FLEXIBLE_LOWER_BOUND", 2);
        Z = ol3Var3;
        f0 = new ol3[]{ol3Var, ol3Var2, ol3Var3};
    }

    public static ol3 valueOf(String str) {
        return (ol3) Enum.valueOf(ol3.class, str);
    }

    public static ol3[] values() {
        return (ol3[]) f0.clone();
    }
}
