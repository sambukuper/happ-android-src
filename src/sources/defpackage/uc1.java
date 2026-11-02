package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uc1 {
    public static final /* synthetic */ uc1[] X;
    public static final /* synthetic */ n22 Y;

    /* JADX INFO: Fake field, exist only in values array */
    uc1 EF5;

    static {
        uc1[] uc1VarArr = {new uc1("MONDAY", 0), new uc1("TUESDAY", 1), new uc1("WEDNESDAY", 2), new uc1("THURSDAY", 3), new uc1("FRIDAY", 4), new uc1("SATURDAY", 5), new uc1("SUNDAY", 6)};
        X = uc1VarArr;
        Y = new n22(uc1VarArr);
    }

    public static uc1 valueOf(String str) {
        return (uc1) Enum.valueOf(uc1.class, str);
    }

    public static uc1[] values() {
        return (uc1[]) X.clone();
    }
}
