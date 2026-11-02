package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kx7 {
    public static final kx7 X;
    public static final kx7 Y;
    public static final kx7 Z;
    public static final /* synthetic */ kx7[] f0;

    static {
        kx7 kx7Var = new kx7("WITHOUT_FEATURE_COMBO", 0);
        X = kx7Var;
        kx7 kx7Var2 = new kx7("WITH_FEATURE_COMBO", 1);
        Y = kx7Var2;
        kx7 kx7Var3 = new kx7("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);
        Z = kx7Var3;
        f0 = new kx7[]{kx7Var, kx7Var2, kx7Var3};
    }

    public static kx7 valueOf(String str) {
        return (kx7) Enum.valueOf(kx7.class, str);
    }

    public static kx7[] values() {
        return (kx7[]) f0.clone();
    }
}
