package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vq3 {
    public static final vq3 X;
    public static final /* synthetic */ vq3[] Y;

    /* JADX INFO: Fake field, exist only in values array */
    vq3 EF0;

    static {
        vq3 vq3Var = new vq3("ALWAYS", 0);
        vq3 vq3Var2 = new vq3("NON_NULL", 1);
        vq3 vq3Var3 = new vq3("NON_DEFAULT", 2);
        vq3 vq3Var4 = new vq3("NON_EMPTY", 3);
        vq3 vq3Var5 = new vq3("DEFAULT_INCLUSION", 4);
        X = vq3Var5;
        Y = new vq3[]{vq3Var, vq3Var2, vq3Var3, vq3Var4, vq3Var5};
    }

    public static vq3 valueOf(String str) {
        return (vq3) Enum.valueOf(vq3.class, str);
    }

    public static vq3[] values() {
        return (vq3[]) Y.clone();
    }
}
