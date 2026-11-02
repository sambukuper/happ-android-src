package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cp2 {
    public static final cp2 X;
    public static final cp2 Y;
    public static final cp2 Z;
    public static final /* synthetic */ cp2[] f0;

    static {
        cp2 cp2Var = new cp2("UNKNOWN", 0);
        X = cp2Var;
        cp2 cp2Var2 = new cp2("DEFAULT", 1);
        Y = cp2Var2;
        cp2 cp2Var3 = new cp2("YUV", 2);
        Z = cp2Var3;
        f0 = new cp2[]{cp2Var, cp2Var2, cp2Var3};
    }

    public static cp2 valueOf(String str) {
        return (cp2) Enum.valueOf(cp2.class, str);
    }

    public static cp2[] values() {
        return (cp2[]) f0.clone();
    }
}
