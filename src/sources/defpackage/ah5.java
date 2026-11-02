package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ah5 {
    public static final ah5 X;
    public static final ah5 Y;
    public static final ah5 Z;
    public static final /* synthetic */ ah5[] f0;

    static {
        ah5 ah5Var = new ah5("ALL", 0);
        X = ah5Var;
        ah5 ah5Var2 = new ah5("ONLY_NON_SYNTHESIZED", 1);
        Y = ah5Var2;
        ah5 ah5Var3 = new ah5("NONE", 2);
        Z = ah5Var3;
        f0 = new ah5[]{ah5Var, ah5Var2, ah5Var3};
    }

    public static ah5 valueOf(String str) {
        return (ah5) Enum.valueOf(ah5.class, str);
    }

    public static ah5[] values() {
        return (ah5[]) f0.clone();
    }
}
