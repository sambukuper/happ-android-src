package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eo2 {

    /* JADX INFO: Fake field, exist only in values array */
    eo2 EF5;
    public static final /* synthetic */ eo2[] Y = {new eo2("Function", 0), new eo2("SuspendFunction", 1), new eo2("KFunction", 2), new eo2("KSuspendFunction", 3), new eo2("UNKNOWN", 4)};
    public static final k42 X = new k42();

    public static eo2 valueOf(String str) {
        return (eo2) Enum.valueOf(eo2.class, str);
    }

    public static eo2[] values() {
        return (eo2[]) Y.clone();
    }
}
