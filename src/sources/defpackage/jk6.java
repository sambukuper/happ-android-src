package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jk6 {
    public static final /* synthetic */ jk6[] X;
    public static final /* synthetic */ n22 Y;

    /* JADX INFO: Fake field, exist only in values array */
    jk6 EF5;

    static {
        jk6[] jk6VarArr = {new jk6("UNSPECIFIED", 0), new jk6("MUST_USE", 1), new jk6("EXPLICITLY_IGNORABLE", 2)};
        X = jk6VarArr;
        Y = new n22(jk6VarArr);
    }

    public static jk6 valueOf(String str) {
        return (jk6) Enum.valueOf(jk6.class, str);
    }

    public static jk6[] values() {
        return (jk6[]) X.clone();
    }
}
