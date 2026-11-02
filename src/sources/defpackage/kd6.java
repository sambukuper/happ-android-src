package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class kd6 {
    public static final g55 X;
    public static final kd6 Y;
    public static final kd6 Z;
    public static final /* synthetic */ kd6[] f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        kd6 kd6Var = new kd6("FORCE", 0);
        Y = kd6Var;
        kd6 kd6Var2 = new kd6("OPTIONAL", 1);
        Z = kd6Var2;
        f0 = new kd6[]{kd6Var, kd6Var2};
        X = new g55((byte) 13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static kd6 valueOf(String str) {
        return (kd6) Enum.valueOf(kd6.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static kd6[] values() {
        return (kd6[]) f0.clone();
    }
}
