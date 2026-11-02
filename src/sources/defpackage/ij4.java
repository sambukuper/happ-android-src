package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ij4 {
    public static final ij4 X;
    public static final ij4 Y;
    public static final /* synthetic */ ij4[] Z;

    static {
        ij4 ij4Var = new ij4("OnErrorDiscard", 0);
        X = ij4Var;
        ij4 ij4Var2 = new ij4("OnErrorRecover", 1);
        Y = ij4Var2;
        Z = new ij4[]{ij4Var, ij4Var2};
    }

    public static ij4 valueOf(String str) {
        return (ij4) Enum.valueOf(ij4.class, str);
    }

    public static ij4[] values() {
        return (ij4[]) Z.clone();
    }
}
