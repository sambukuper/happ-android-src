package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kz6 {
    public static final kz6 X;
    public static final kz6 Y;
    public static final /* synthetic */ kz6[] Z;

    static {
        kz6 kz6Var = new kz6("Inherit", 0);
        X = kz6Var;
        kz6 kz6Var2 = new kz6("SecureOn", 1);
        Y = kz6Var2;
        Z = new kz6[]{kz6Var, kz6Var2, new kz6("SecureOff", 2)};
    }

    public static kz6 valueOf(String str) {
        return (kz6) Enum.valueOf(kz6.class, str);
    }

    public static kz6[] values() {
        return (kz6[]) Z.clone();
    }
}
