package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ui7 {
    public static final ui7 X;
    public static final ui7 Y;
    public static final ui7 Z;
    public static final /* synthetic */ ui7[] f0;

    /* JADX INFO: Fake field, exist only in values array */
    ui7 EF0;

    static {
        ui7 ui7Var = new ui7("Unknown", 0);
        ui7 ui7Var2 = new ui7("Fixed", 1);
        X = ui7Var2;
        ui7 ui7Var3 = new ui7("NotApplicable", 2);
        Y = ui7Var3;
        ui7 ui7Var4 = new ui7("NotFixed", 3);
        Z = ui7Var4;
        f0 = new ui7[]{ui7Var, ui7Var2, ui7Var3, ui7Var4};
    }

    public static ui7 valueOf(String str) {
        return (ui7) Enum.valueOf(ui7.class, str);
    }

    public static ui7[] values() {
        return (ui7[]) f0.clone();
    }
}
