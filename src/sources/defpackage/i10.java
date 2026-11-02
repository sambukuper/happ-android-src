package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i10 {
    public static final /* synthetic */ i10[] X = {new i10("PRESENT", 0), new i10("ABSENT", 1), new i10("PRESENT_OPTIONAL", 2), new i10("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    i10 EF5;

    public static i10 valueOf(String str) {
        return (i10) Enum.valueOf(i10.class, str);
    }

    public static i10[] values() {
        return (i10[]) X.clone();
    }
}
