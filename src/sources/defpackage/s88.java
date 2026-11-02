package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s88 {
    public static final s88 X;
    public static final s88 Y;
    public static final s88 Z;
    public static final /* synthetic */ s88[] f0;

    static {
        s88 s88Var = new s88("None", 0);
        X = s88Var;
        s88 s88Var2 = new s88("Cursor", 1);
        Y = s88Var2;
        s88 s88Var3 = new s88("Selection", 2);
        Z = s88Var3;
        f0 = new s88[]{s88Var, s88Var2, s88Var3};
    }

    public static s88 valueOf(String str) {
        return (s88) Enum.valueOf(s88.class, str);
    }

    public static s88[] values() {
        return (s88[]) f0.clone();
    }
}
