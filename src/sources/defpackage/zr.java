package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class zr {
    public static final zr AUTO;
    public static final zr DARK;
    public static final zr LIGHT;
    public static final /* synthetic */ zr[] X;
    public static final /* synthetic */ n22 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        zr zrVar = new zr("AUTO", 0);
        AUTO = zrVar;
        zr zrVar2 = new zr("LIGHT", 1);
        LIGHT = zrVar2;
        zr zrVar3 = new zr("DARK", 2);
        DARK = zrVar3;
        zr[] zrVarArr = {zrVar, zrVar2, zrVar3};
        X = zrVarArr;
        Y = new n22(zrVarArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static l22 getEntries() {
        return Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zr valueOf(String str) {
        return (zr) Enum.valueOf(zr.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zr[] values() {
        return (zr[]) X.clone();
    }
}
