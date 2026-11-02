package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vg3 {
    public static final vg3 X;
    public static final vg3 Y;
    public static final /* synthetic */ vg3[] Z;

    static {
        vg3 vg3Var = new vg3("Min", 0);
        X = vg3Var;
        vg3 vg3Var2 = new vg3("Max", 1);
        Y = vg3Var2;
        Z = new vg3[]{vg3Var, vg3Var2};
    }

    public static vg3 valueOf(String str) {
        return (vg3) Enum.valueOf(vg3.class, str);
    }

    public static vg3[] values() {
        return (vg3[]) Z.clone();
    }
}
