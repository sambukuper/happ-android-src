package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tx3 {
    public static final /* synthetic */ tx3[] X = {new tx3("single", 0), new tx3("multiple", 1), new tx3("incremental", 2), new tx3("any", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    tx3 EF5;

    public static tx3 valueOf(String str) {
        return (tx3) Enum.valueOf(tx3.class, str);
    }

    public static tx3[] values() {
        return (tx3[]) X.clone();
    }
}
