package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f48 {
    public static final f48 X;
    public static final f48 Y;
    public static final f48 Z;
    public static final /* synthetic */ f48[] f0;

    static {
        f48 f48Var = new f48("Insert", 0);
        X = f48Var;
        f48 f48Var2 = new f48("Delete", 1);
        Y = f48Var2;
        f48 f48Var3 = new f48("Replace", 2);
        Z = f48Var3;
        f0 = new f48[]{f48Var, f48Var2, f48Var3};
    }

    public static f48 valueOf(String str) {
        return (f48) Enum.valueOf(f48.class, str);
    }

    public static f48[] values() {
        return (f48[]) f0.clone();
    }
}
