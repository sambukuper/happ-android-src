package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ue4 {
    public static final ue4 X;
    public static final ue4 Y;
    public static final ue4 Z;
    public static final /* synthetic */ ue4[] f0;

    static {
        ue4 ue4Var = new ue4("NOT_COMPUTED", 0);
        X = ue4Var;
        ue4 ue4Var2 = new ue4("COMPUTING", 1);
        Y = ue4Var2;
        ue4 ue4Var3 = new ue4("RECURSION_WAS_DETECTED", 2);
        Z = ue4Var3;
        f0 = new ue4[]{ue4Var, ue4Var2, ue4Var3};
    }

    public static ue4 valueOf(String str) {
        return (ue4) Enum.valueOf(ue4.class, str);
    }

    public static ue4[] values() {
        return (ue4[]) f0.clone();
    }
}
