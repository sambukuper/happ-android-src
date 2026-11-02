package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r12 {
    public static final r12 X;
    public static final r12 Y;
    public static final r12 Z;
    public static final /* synthetic */ r12[] f0;

    static {
        r12 r12Var = new r12("PreEnter", 0);
        X = r12Var;
        r12 r12Var2 = new r12("Visible", 1);
        Y = r12Var2;
        r12 r12Var3 = new r12("PostExit", 2);
        Z = r12Var3;
        f0 = new r12[]{r12Var, r12Var2, r12Var3};
    }

    public static r12 valueOf(String str) {
        return (r12) Enum.valueOf(r12.class, str);
    }

    public static r12[] values() {
        return (r12[]) f0.clone();
    }
}
