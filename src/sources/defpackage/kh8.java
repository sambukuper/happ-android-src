package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kh8 {
    public static final kh8 X;
    public static final kh8 Y;
    public static final kh8 Z;
    public static final /* synthetic */ kh8[] f0;

    static {
        kh8 kh8Var = new kh8("FLEXIBLE_LOWER", 0);
        X = kh8Var;
        kh8 kh8Var2 = new kh8("FLEXIBLE_UPPER", 1);
        Y = kh8Var2;
        kh8 kh8Var3 = new kh8("INFLEXIBLE", 2);
        Z = kh8Var3;
        f0 = new kh8[]{kh8Var, kh8Var2, kh8Var3};
    }

    public static kh8 valueOf(String str) {
        return (kh8) Enum.valueOf(kh8.class, str);
    }

    public static kh8[] values() {
        return (kh8[]) f0.clone();
    }
}
