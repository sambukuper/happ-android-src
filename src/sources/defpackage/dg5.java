package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dg5 {
    public static final dg5 X;
    public static final dg5 Y;
    public static final dg5 Z;
    public static final /* synthetic */ dg5[] f0;

    static {
        dg5 dg5Var = new dg5("NONE", 0);
        X = dg5Var;
        dg5 dg5Var2 = new dg5("ZERO", 1);
        Y = dg5Var2;
        dg5 dg5Var3 = new dg5("SPACE", 2);
        Z = dg5Var3;
        f0 = new dg5[]{dg5Var, dg5Var2, dg5Var3};
    }

    public static dg5 valueOf(String str) {
        return (dg5) Enum.valueOf(dg5.class, str);
    }

    public static dg5[] values() {
        return (dg5[]) f0.clone();
    }
}
