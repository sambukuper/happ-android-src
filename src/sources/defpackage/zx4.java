package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zx4 {
    public static final /* synthetic */ zx4[] X;
    public static final /* synthetic */ n22 Y;

    /* JADX INFO: Fake field, exist only in values array */
    zx4 EF5;

    static {
        zx4[] zx4VarArr = {new zx4("JANUARY", 0), new zx4("FEBRUARY", 1), new zx4("MARCH", 2), new zx4("APRIL", 3), new zx4("MAY", 4), new zx4("JUNE", 5), new zx4("JULY", 6), new zx4("AUGUST", 7), new zx4("SEPTEMBER", 8), new zx4("OCTOBER", 9), new zx4("NOVEMBER", 10), new zx4("DECEMBER", 11)};
        X = zx4VarArr;
        Y = new n22(zx4VarArr);
    }

    public static zx4 valueOf(String str) {
        return (zx4) Enum.valueOf(zx4.class, str);
    }

    public static zx4[] values() {
        return (zx4[]) X.clone();
    }
}
