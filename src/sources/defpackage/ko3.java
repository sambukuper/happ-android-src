package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ko3 {
    public static final ko3 X;
    public static final ko3 Y;
    public static final /* synthetic */ ko3[] Z;

    /* JADX INFO: Fake field, exist only in values array */
    ko3 EF0;

    static {
        ko3 ko3Var = new ko3("ACCEPT_SINGLE_VALUE_AS_ARRAY", 0);
        ko3 ko3Var2 = new ko3("ACCEPT_CASE_INSENSITIVE_PROPERTIES", 1);
        ko3 ko3Var3 = new ko3("READ_UNKNOWN_ENUM_VALUES_AS_NULL", 2);
        ko3 ko3Var4 = new ko3("READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE", 3);
        ko3 ko3Var5 = new ko3("READ_DATE_TIMESTAMPS_AS_NANOSECONDS", 4);
        ko3 ko3Var6 = new ko3("ACCEPT_CASE_INSENSITIVE_VALUES", 5);
        ko3 ko3Var7 = new ko3("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 6);
        ko3 ko3Var8 = new ko3("WRITE_DATES_WITH_ZONE_ID", 7);
        ko3 ko3Var9 = new ko3("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 8);
        X = ko3Var9;
        ko3 ko3Var10 = new ko3("WRITE_SORTED_MAP_ENTRIES", 9);
        Y = ko3Var10;
        Z = new ko3[]{ko3Var, ko3Var2, ko3Var3, ko3Var4, ko3Var5, ko3Var6, ko3Var7, ko3Var8, ko3Var9, ko3Var10, new ko3("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 10)};
    }

    public static ko3 valueOf(String str) {
        return (ko3) Enum.valueOf(ko3.class, str);
    }

    public static ko3[] values() {
        return (ko3[]) Z.clone();
    }
}
