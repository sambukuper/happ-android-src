package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class md1 {
    public static final md1 X;
    public static final md1 Y;
    public static final md1 Z;
    public static final /* synthetic */ md1[] f0;

    /* JADX INFO: Fake field, exist only in values array */
    md1 EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        md1 md1Var = new md1("OTHER", 0);
        md1 md1Var2 = new md1("PURE_BARCODE", 1);
        md1 md1Var3 = new md1("POSSIBLE_FORMATS", 2);
        X = md1Var3;
        md1 md1Var4 = new md1("TRY_HARDER", 3);
        Y = md1Var4;
        md1 md1Var5 = new md1("CHARACTER_SET", 4);
        Z = md1Var5;
        f0 = new md1[]{md1Var, md1Var2, md1Var3, md1Var4, md1Var5, new md1("ALLOWED_LENGTHS", 5), new md1("ASSUME_CODE_39_CHECK_DIGIT", 6), new md1("ASSUME_GS1", 7), new md1("RETURN_CODABAR_START_END", 8), new md1("NEED_RESULT_POINT_CALLBACK", 9), new md1("ALLOWED_EAN_EXTENSIONS", 10), new md1("ALSO_INVERTED", 11)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static md1 valueOf(String str) {
        return (md1) Enum.valueOf(md1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static md1[] values() {
        return (md1[]) f0.clone();
    }
}
