package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pu5 {
    public static final mu5 X;
    public static final nu5 Y;
    public static final ou5 Z;
    public static final /* synthetic */ pu5[] f0;

    static {
        mu5 mu5Var = new mu5();
        X = mu5Var;
        nu5 nu5Var = new nu5();
        Y = nu5Var;
        ou5 ou5Var = new ou5();
        Z = ou5Var;
        f0 = new pu5[]{mu5Var, nu5Var, ou5Var};
    }

    public static pu5 valueOf(String str) {
        return (pu5) Enum.valueOf(pu5.class, str);
    }

    public static pu5[] values() {
        return (pu5[]) f0.clone();
    }

    public boolean a(boolean z) {
        return !z;
    }
}
