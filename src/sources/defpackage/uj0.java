package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uj0 {
    public static final uj0 X;
    public static final uj0 Y;
    public static final uj0 Z;
    public static final /* synthetic */ uj0[] f0;

    static {
        uj0 uj0Var = new uj0("CAMERA", 0);
        X = uj0Var;
        uj0 uj0Var2 = new uj0("SCOPE", 1);
        Y = uj0Var2;
        uj0 uj0Var3 = new uj0("THREAD", 2);
        Z = uj0Var3;
        f0 = new uj0[]{uj0Var, uj0Var2, uj0Var3};
    }

    public static uj0 valueOf(String str) {
        return (uj0) Enum.valueOf(uj0.class, str);
    }

    public static uj0[] values() {
        return (uj0[]) f0.clone();
    }
}
