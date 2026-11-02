package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ah0 {
    public static final ah0 X;
    public static final ah0 Y;
    public static final ah0 Z;
    public static final ah0 f0;
    public static final ah0 g0;
    public static final ah0 h0;
    public static final /* synthetic */ ah0[] i0;

    static {
        ah0 ah0Var = new ah0("UNKNOWN", 0);
        X = ah0Var;
        ah0 ah0Var2 = new ah0("INACTIVE", 1);
        Y = ah0Var2;
        ah0 ah0Var3 = new ah0("SEARCHING", 2);
        Z = ah0Var3;
        ah0 ah0Var4 = new ah0("FLASH_REQUIRED", 3);
        f0 = ah0Var4;
        ah0 ah0Var5 = new ah0("CONVERGED", 4);
        g0 = ah0Var5;
        ah0 ah0Var6 = new ah0("LOCKED", 5);
        h0 = ah0Var6;
        i0 = new ah0[]{ah0Var, ah0Var2, ah0Var3, ah0Var4, ah0Var5, ah0Var6};
    }

    public static ah0 valueOf(String str) {
        return (ah0) Enum.valueOf(ah0.class, str);
    }

    public static ah0[] values() {
        return (ah0[]) i0.clone();
    }
}
