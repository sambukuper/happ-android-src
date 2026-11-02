package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zt1 {
    public static final zt1 X;
    public static final zt1 Y;
    public static final zt1 Z;
    public static final /* synthetic */ zt1[] f0;

    static {
        zt1 zt1Var = new zt1("Yes", 0);
        X = zt1Var;
        zt1 zt1Var2 = new zt1("No", 1);
        Y = zt1Var2;
        zt1 zt1Var3 = new zt1("NotInitialized", 2);
        Z = zt1Var3;
        f0 = new zt1[]{zt1Var, zt1Var2, zt1Var3};
    }

    public static zt1 valueOf(String str) {
        return (zt1) Enum.valueOf(zt1.class, str);
    }

    public static zt1[] values() {
        return (zt1[]) f0.clone();
    }
}
