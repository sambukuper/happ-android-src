package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z24 {
    public static final z24 X;
    public static final z24 Y;
    public static final /* synthetic */ z24[] Z;

    static {
        z24 z24Var = new z24("Ltr", 0);
        X = z24Var;
        z24 z24Var2 = new z24("Rtl", 1);
        Y = z24Var2;
        Z = new z24[]{z24Var, z24Var2};
    }

    public static z24 valueOf(String str) {
        return (z24) Enum.valueOf(z24.class, str);
    }

    public static z24[] values() {
        return (z24[]) Z.clone();
    }
}
