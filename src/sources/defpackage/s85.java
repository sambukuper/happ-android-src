package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s85 {
    public static final s85 X;
    public static final s85 Y;
    public static final s85 Z;
    public static final /* synthetic */ s85[] f0;

    static {
        s85 s85Var = new s85("NO_OP", 0);
        X = s85Var;
        s85 s85Var2 = new s85("ADD", 1);
        Y = s85Var2;
        s85 s85Var3 = new s85("REMOVE", 2);
        Z = s85Var3;
        f0 = new s85[]{s85Var, s85Var2, s85Var3};
    }

    public static s85 valueOf(String str) {
        return (s85) Enum.valueOf(s85.class, str);
    }

    public static s85[] values() {
        return (s85[]) f0.clone();
    }
}
