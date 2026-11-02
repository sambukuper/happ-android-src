package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fp1 {
    public static final fp1 X;
    public static final fp1 Y;
    public static final fp1 Z;
    public static final /* synthetic */ fp1[] f0;

    static {
        fp1 fp1Var = new fp1("Vertical", 0);
        X = fp1Var;
        fp1 fp1Var2 = new fp1("Horizontal", 1);
        Y = fp1Var2;
        fp1 fp1Var3 = new fp1("Both", 2);
        Z = fp1Var3;
        f0 = new fp1[]{fp1Var, fp1Var2, fp1Var3};
    }

    public static fp1 valueOf(String str) {
        return (fp1) Enum.valueOf(fp1.class, str);
    }

    public static fp1[] values() {
        return (fp1[]) f0.clone();
    }
}
