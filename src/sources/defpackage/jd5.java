package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jd5 {
    public static final jd5 X;
    public static final jd5 Y;
    public static final /* synthetic */ jd5[] Z;

    static {
        jd5 jd5Var = new jd5("TRUE", 0);
        X = jd5Var;
        jd5 jd5Var2 = new jd5("FALSE", 1);
        jd5 jd5Var3 = new jd5("DEFAULT", 2);
        Y = jd5Var3;
        Z = new jd5[]{jd5Var, jd5Var2, jd5Var3};
    }

    public static jd5 valueOf(String str) {
        return (jd5) Enum.valueOf(jd5.class, str);
    }

    public static jd5[] values() {
        return (jd5[]) Z.clone();
    }

    public final Boolean a() {
        if (this == Y) {
            return null;
        }
        return this == X ? Boolean.TRUE : Boolean.FALSE;
    }
}
