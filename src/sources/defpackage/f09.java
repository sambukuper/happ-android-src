package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f09 {
    public static final f09 X;
    public static final f09 Y;
    public static final /* synthetic */ f09[] Z;

    static {
        f09 f09Var = new f09("Start", 0);
        X = f09Var;
        f09 f09Var2 = new f09("End", 1);
        Y = f09Var2;
        Z = new f09[]{f09Var, f09Var2};
    }

    public static f09 valueOf(String str) {
        return (f09) Enum.valueOf(f09.class, str);
    }

    public static f09[] values() {
        return (f09[]) Z.clone();
    }
}
