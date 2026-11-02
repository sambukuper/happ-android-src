package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nn3 {
    public static final nn3 X;
    public static final nn3 Y;
    public static final /* synthetic */ nn3[] Z;

    static {
        nn3 nn3Var = new nn3("DEFAULT", 0);
        X = nn3Var;
        nn3 nn3Var2 = new nn3("DELEGATING", 1);
        nn3 nn3Var3 = new nn3("PROPERTIES", 2);
        nn3 nn3Var4 = new nn3("DISABLED", 3);
        Y = nn3Var4;
        Z = new nn3[]{nn3Var, nn3Var2, nn3Var3, nn3Var4};
    }

    public static nn3 valueOf(String str) {
        return (nn3) Enum.valueOf(nn3.class, str);
    }

    public static nn3[] values() {
        return (nn3[]) Z.clone();
    }
}
