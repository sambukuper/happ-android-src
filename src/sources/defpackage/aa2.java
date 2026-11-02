package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aa2 {
    public static final aa2 X;
    public static final /* synthetic */ aa2[] Y;

    /* JADX INFO: Fake field, exist only in values array */
    aa2 EF0;

    static {
        aa2 aa2Var = new aa2("TOP_DOWN", 0);
        aa2 aa2Var2 = new aa2("BOTTOM_UP", 1);
        X = aa2Var2;
        Y = new aa2[]{aa2Var, aa2Var2};
    }

    public static aa2 valueOf(String str) {
        return (aa2) Enum.valueOf(aa2.class, str);
    }

    public static aa2[] values() {
        return (aa2[]) Y.clone();
    }
}
