package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rz3 {
    public static final rz3 X;
    public static final rz3 Y;
    public static final rz3 Z;
    public static final /* synthetic */ rz3[] f0;

    static {
        rz3 rz3Var = new rz3("INVARIANT", 0);
        X = rz3Var;
        rz3 rz3Var2 = new rz3("IN", 1);
        Y = rz3Var2;
        rz3 rz3Var3 = new rz3("OUT", 2);
        Z = rz3Var3;
        f0 = new rz3[]{rz3Var, rz3Var2, rz3Var3};
    }

    public static rz3 valueOf(String str) {
        return (rz3) Enum.valueOf(rz3.class, str);
    }

    public static rz3[] values() {
        return (rz3[]) f0.clone();
    }
}
