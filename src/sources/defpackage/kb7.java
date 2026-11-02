package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kb7 {
    public static final kb7 X;
    public static final kb7 Y;
    public static final /* synthetic */ kb7[] Z;

    static {
        kb7 kb7Var = new kb7("THUMB", 0);
        X = kb7Var;
        kb7 kb7Var2 = new kb7("TRACK", 1);
        Y = kb7Var2;
        Z = new kb7[]{kb7Var, kb7Var2};
    }

    public static kb7 valueOf(String str) {
        return (kb7) Enum.valueOf(kb7.class, str);
    }

    public static kb7[] values() {
        return (kb7[]) Z.clone();
    }
}
