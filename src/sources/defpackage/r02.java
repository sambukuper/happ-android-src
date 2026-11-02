package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r02 {
    public static final r02 X;
    public static final r02 Y;
    public static final r02 Z;
    public static final r02 f0;
    public static final r02 g0;
    public static final r02 h0;
    public static final r02 i0;
    public static final /* synthetic */ r02[] j0;

    static {
        r02 r02Var = new r02("ERROR_CORRECTION", 0);
        X = r02Var;
        r02 r02Var2 = new r02("CHARACTER_SET", 1);
        Y = r02Var2;
        r02 r02Var3 = new r02("DATA_MATRIX_SHAPE", 2);
        r02 r02Var4 = new r02("DATA_MATRIX_COMPACT", 3);
        r02 r02Var5 = new r02("MIN_SIZE", 4);
        r02 r02Var6 = new r02("MAX_SIZE", 5);
        r02 r02Var7 = new r02("MARGIN", 6);
        Z = r02Var7;
        r02 r02Var8 = new r02("PDF417_COMPACT", 7);
        r02 r02Var9 = new r02("PDF417_COMPACTION", 8);
        r02 r02Var10 = new r02("PDF417_DIMENSIONS", 9);
        r02 r02Var11 = new r02("PDF417_AUTO_ECI", 10);
        r02 r02Var12 = new r02("AZTEC_LAYERS", 11);
        r02 r02Var13 = new r02("QR_VERSION", 12);
        f0 = r02Var13;
        r02 r02Var14 = new r02("QR_MASK_PATTERN", 13);
        g0 = r02Var14;
        r02 r02Var15 = new r02("QR_COMPACT", 14);
        h0 = r02Var15;
        r02 r02Var16 = new r02("GS1_FORMAT", 15);
        i0 = r02Var16;
        j0 = new r02[]{r02Var, r02Var2, r02Var3, r02Var4, r02Var5, r02Var6, r02Var7, r02Var8, r02Var9, r02Var10, r02Var11, r02Var12, r02Var13, r02Var14, r02Var15, r02Var16, new r02("FORCE_CODE_SET", 16), new r02("FORCE_C40", 17), new r02("CODE128_COMPACT", 18)};
    }

    public static r02 valueOf(String str) {
        return (r02) Enum.valueOf(r02.class, str);
    }

    public static r02[] values() {
        return (r02[]) j0.clone();
    }
}
