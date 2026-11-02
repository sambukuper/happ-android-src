package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bc3 {
    public static final bc3 X;
    public static final bc3 Y;
    public static final bc3 Z;
    public static final /* synthetic */ bc3[] f0;

    static {
        bc3 bc3Var = new bc3("Yes", 0);
        X = bc3Var;
        bc3 bc3Var2 = new bc3("No", 1);
        Y = bc3Var2;
        bc3 bc3Var3 = new bc3("NotInitialized", 2);
        Z = bc3Var3;
        f0 = new bc3[]{bc3Var, bc3Var2, bc3Var3};
    }

    public static bc3 valueOf(String str) {
        return (bc3) Enum.valueOf(bc3.class, str);
    }

    public static bc3[] values() {
        return (bc3[]) f0.clone();
    }
}
