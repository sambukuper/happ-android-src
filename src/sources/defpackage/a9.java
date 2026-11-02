package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a9 {
    public static final a9 X;
    public static final a9 Y;
    public static final /* synthetic */ a9[] Z;

    static {
        a9 a9Var = new a9("AM", 0);
        X = a9Var;
        a9 a9Var2 = new a9("PM", 1);
        Y = a9Var2;
        Z = new a9[]{a9Var, a9Var2};
    }

    public static a9 valueOf(String str) {
        return (a9) Enum.valueOf(a9.class, str);
    }

    public static a9[] values() {
        return (a9[]) Z.clone();
    }
}
