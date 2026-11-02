package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g32 {
    public static final /* synthetic */ g32[] X = {new g32("ERROR_CLASS", 0), new g32("ERROR_FUNCTION", 1), new g32("ERROR_SCOPE", 2), new g32("ERROR_MODULE", 3), new g32("ERROR_PROPERTY", 4), new g32("ERROR_TYPE", 5), new g32("PARENT_OF_ERROR_SCOPE", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    g32 EF5;

    public static g32 valueOf(String str) {
        return (g32) Enum.valueOf(g32.class, str);
    }

    public static g32[] values() {
        return (g32[]) X.clone();
    }
}
