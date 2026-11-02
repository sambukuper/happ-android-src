package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tr5 {
    public static final tr5 X;
    public static final tr5 Y;
    public static final /* synthetic */ tr5[] Z;

    static {
        tr5 tr5Var = new tr5("EXACT", 0);
        X = tr5Var;
        tr5 tr5Var2 = new tr5("INEXACT", 1);
        Y = tr5Var2;
        Z = new tr5[]{tr5Var, tr5Var2};
    }

    public static tr5 valueOf(String str) {
        return (tr5) Enum.valueOf(tr5.class, str);
    }

    public static tr5[] values() {
        return (tr5[]) Z.clone();
    }
}
