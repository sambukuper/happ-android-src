package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zz6 {
    public static final zz6 X;
    public static final /* synthetic */ zz6[] Y;

    static {
        zz6 zz6Var = new zz6("EditableText", 0);
        X = zz6Var;
        Y = new zz6[]{zz6Var, new zz6("StaticText", 1)};
    }

    public static zz6 valueOf(String str) {
        return (zz6) Enum.valueOf(zz6.class, str);
    }

    public static zz6[] values() {
        return (zz6[]) Y.clone();
    }
}
