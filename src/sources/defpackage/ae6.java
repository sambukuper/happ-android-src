package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ae6 {
    public static final zd6 X;
    public static final yd6 Y;
    public static final /* synthetic */ ae6[] Z;

    static {
        zd6 zd6Var = new zd6();
        X = zd6Var;
        yd6 yd6Var = new yd6();
        Y = yd6Var;
        Z = new ae6[]{zd6Var, yd6Var};
    }

    public static ae6 valueOf(String str) {
        return (ae6) Enum.valueOf(ae6.class, str);
    }

    public static ae6[] values() {
        return (ae6[]) Z.clone();
    }

    public String a(String str) {
        return mm7.W(mm7.W(str, "<", "&lt;", false), ">", "&gt;", false);
    }
}
