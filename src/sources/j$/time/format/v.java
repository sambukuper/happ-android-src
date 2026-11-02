package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class v {
    public static final v LENIENT;
    public static final v SMART;
    public static final v STRICT;
    public static final /* synthetic */ v[] a;

    static {
        v vVar = new v("STRICT", 0);
        STRICT = vVar;
        v vVar2 = new v("SMART", 1);
        SMART = vVar2;
        v vVar3 = new v("LENIENT", 2);
        LENIENT = vVar3;
        a = new v[]{vVar, vVar2, vVar3};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) a.clone();
    }
}
