package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dx5 {
    public static final dx5 X;
    public static final dx5 Y;
    public static final /* synthetic */ dx5[] Z;

    /* JADX INFO: Fake field, exist only in values array */
    dx5 EF0;

    static {
        dx5 dx5Var = new dx5("PRETTY", 0);
        dx5 dx5Var2 = new dx5("DEBUG", 1);
        X = dx5Var2;
        dx5 dx5Var3 = new dx5("NONE", 2);
        Y = dx5Var3;
        Z = new dx5[]{dx5Var, dx5Var2, dx5Var3};
    }

    public static dx5 valueOf(String str) {
        return (dx5) Enum.valueOf(dx5.class, str);
    }

    public static dx5[] values() {
        return (dx5[]) Z.clone();
    }
}
