package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements l {
    public static final c0 BEFORE_ROC;
    public static final c0 ROC;
    public static final /* synthetic */ c0[] a;

    static {
        c0 c0Var = new c0("BEFORE_ROC", 0);
        BEFORE_ROC = c0Var;
        c0 c0Var2 = new c0("ROC", 1);
        ROC = c0Var2;
        a = new c0[]{c0Var, c0Var2};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) a.clone();
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return ordinal();
    }
}
