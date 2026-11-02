package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j06 {
    public static final j06 X;
    public static final /* synthetic */ j06[] Y;

    static {
        j06 j06Var = new j06("DEFAULT", 0);
        X = j06Var;
        Y = new j06[]{j06Var, new j06("SIGNED", 1), new j06("FIXED", 2)};
    }

    public static j06 valueOf(String str) {
        return (j06) Enum.valueOf(j06.class, str);
    }

    public static j06[] values() {
        return (j06[]) Y.clone();
    }
}
