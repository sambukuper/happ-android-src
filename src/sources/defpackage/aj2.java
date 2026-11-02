package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aj2 {
    public static final k32 X;
    public static final aj2 Y;
    public static final /* synthetic */ aj2[] Z;
    public static final /* synthetic */ n22 f0;

    /* JADX INFO: Fake field, exist only in values array */
    aj2 EF0;

    static {
        aj2 aj2Var = new aj2("SMALL", 0);
        aj2 aj2Var2 = new aj2("NORMAL", 1);
        Y = aj2Var2;
        aj2[] aj2VarArr = {aj2Var, aj2Var2, new aj2("BIG", 2)};
        Z = aj2VarArr;
        f0 = new n22(aj2VarArr);
        X = new k32();
    }

    public static aj2 valueOf(String str) {
        return (aj2) Enum.valueOf(aj2.class, str);
    }

    public static aj2[] values() {
        return (aj2[]) Z.clone();
    }
}
