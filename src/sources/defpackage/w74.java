package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w74 {
    public static final w74 X;
    public static final w74 Y;
    public static final /* synthetic */ w74[] Z;

    /* JADX INFO: Fake field, exist only in values array */
    w74 EF0;

    static {
        w74 w74Var = new w74("SYNCHRONIZED", 0);
        w74 w74Var2 = new w74("PUBLICATION", 1);
        X = w74Var2;
        w74 w74Var3 = new w74("NONE", 2);
        Y = w74Var3;
        Z = new w74[]{w74Var, w74Var2, w74Var3};
    }

    public static w74 valueOf(String str) {
        return (w74) Enum.valueOf(w74.class, str);
    }

    public static w74[] values() {
        return (w74[]) Z.clone();
    }
}
