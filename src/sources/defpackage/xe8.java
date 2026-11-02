package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xe8 {
    public static final xe8 X;
    public static final xe8 Y;
    public static final xe8 Z;
    public static final /* synthetic */ xe8[] f0;

    static {
        xe8 xe8Var = new xe8("ContinueTraversal", 0);
        X = xe8Var;
        xe8 xe8Var2 = new xe8("SkipSubtreeAndContinueTraversal", 1);
        Y = xe8Var2;
        xe8 xe8Var3 = new xe8("CancelTraversal", 2);
        Z = xe8Var3;
        f0 = new xe8[]{xe8Var, xe8Var2, xe8Var3};
    }

    public static xe8 valueOf(String str) {
        return (xe8) Enum.valueOf(xe8.class, str);
    }

    public static xe8[] values() {
        return (xe8[]) f0.clone();
    }
}
