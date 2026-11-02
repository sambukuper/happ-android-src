package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q71 {
    public static final q71 X;
    public static final q71 Y;
    public static final q71 Z;
    public static final /* synthetic */ q71[] f0;

    static {
        q71 q71Var = new q71("CROSSED", 0);
        X = q71Var;
        q71 q71Var2 = new q71("NOT_CROSSED", 1);
        Y = q71Var2;
        q71 q71Var3 = new q71("COLLAPSED", 2);
        Z = q71Var3;
        f0 = new q71[]{q71Var, q71Var2, q71Var3};
    }

    public static q71 valueOf(String str) {
        return (q71) Enum.valueOf(q71.class, str);
    }

    public static q71[] values() {
        return (q71[]) f0.clone();
    }
}
