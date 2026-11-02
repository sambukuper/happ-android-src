package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kh4 {
    public static final /* synthetic */ kh4[] X = {new kh4("Verbose", 0), new kh4("Debug", 1), new kh4("Info", 2), new kh4("Warn", 3), new kh4("Error", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    kh4 EF5;

    public static kh4 valueOf(String str) {
        return (kh4) Enum.valueOf(kh4.class, str);
    }

    public static kh4[] values() {
        return (kh4[]) X.clone();
    }
}
