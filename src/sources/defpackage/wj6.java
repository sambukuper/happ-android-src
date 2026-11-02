package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wj6 {
    public static final wj6 X;
    public static final wj6 Y;
    public static final wj6 Z;
    public static final wj6 f0;
    public static final wj6 g0;
    public static final wj6 h0;
    public static final /* synthetic */ wj6[] i0;

    /* JADX INFO: Fake field, exist only in values array */
    wj6 EF0;

    static {
        wj6 wj6Var = new wj6("OTHER", 0);
        wj6 wj6Var2 = new wj6("ORIENTATION", 1);
        wj6 wj6Var3 = new wj6("BYTE_SEGMENTS", 2);
        X = wj6Var3;
        wj6 wj6Var4 = new wj6("ERROR_CORRECTION_LEVEL", 3);
        Y = wj6Var4;
        wj6 wj6Var5 = new wj6("ERRORS_CORRECTED", 4);
        Z = wj6Var5;
        wj6 wj6Var6 = new wj6("ERASURES_CORRECTED", 5);
        wj6 wj6Var7 = new wj6("ISSUE_NUMBER", 6);
        wj6 wj6Var8 = new wj6("SUGGESTED_PRICE", 7);
        wj6 wj6Var9 = new wj6("POSSIBLE_COUNTRY", 8);
        wj6 wj6Var10 = new wj6("UPC_EAN_EXTENSION", 9);
        wj6 wj6Var11 = new wj6("PDF417_EXTRA_METADATA", 10);
        wj6 wj6Var12 = new wj6("STRUCTURED_APPEND_SEQUENCE", 11);
        f0 = wj6Var12;
        wj6 wj6Var13 = new wj6("STRUCTURED_APPEND_PARITY", 12);
        g0 = wj6Var13;
        wj6 wj6Var14 = new wj6("SYMBOLOGY_IDENTIFIER", 13);
        h0 = wj6Var14;
        i0 = new wj6[]{wj6Var, wj6Var2, wj6Var3, wj6Var4, wj6Var5, wj6Var6, wj6Var7, wj6Var8, wj6Var9, wj6Var10, wj6Var11, wj6Var12, wj6Var13, wj6Var14};
    }

    public static wj6 valueOf(String str) {
        return (wj6) Enum.valueOf(wj6.class, str);
    }

    public static wj6[] values() {
        return (wj6[]) i0.clone();
    }
}
