package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f97 {
    public static final f97 X;
    public static final f97 Y;
    public static final f97 Z;
    public static final /* synthetic */ f97[] f0;

    static {
        f97 f97Var = new f97("FUNCTION", 0);
        X = f97Var;
        f97 f97Var2 = new f97("PROPERTY", 1);
        Y = f97Var2;
        f97 f97Var3 = new f97("FIELD_IN_JAVA_CLASS", 2);
        Z = f97Var3;
        f0 = new f97[]{f97Var, f97Var2, f97Var3};
    }

    public static f97 valueOf(String str) {
        return (f97) Enum.valueOf(f97.class, str);
    }

    public static f97[] values() {
        return (f97[]) f0.clone();
    }
}
