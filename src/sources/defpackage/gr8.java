package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gr8 {
    public static final gr8 X;
    public static final gr8 Y;
    public static final gr8 Z;
    public static final gr8 f0;
    public static final gr8 g0;
    public static final gr8 h0;
    public static final /* synthetic */ gr8[] i0;

    static {
        gr8 gr8Var = new gr8("IMAGE_CAPTURE", 0);
        X = gr8Var;
        gr8 gr8Var2 = new gr8("PREVIEW", 1);
        Y = gr8Var2;
        gr8 gr8Var3 = new gr8("IMAGE_ANALYSIS", 2);
        Z = gr8Var3;
        gr8 gr8Var4 = new gr8("VIDEO_CAPTURE", 3);
        f0 = gr8Var4;
        gr8 gr8Var5 = new gr8("STREAM_SHARING", 4);
        g0 = gr8Var5;
        gr8 gr8Var6 = new gr8("METERING_REPEATING", 5);
        h0 = gr8Var6;
        i0 = new gr8[]{gr8Var, gr8Var2, gr8Var3, gr8Var4, gr8Var5, gr8Var6};
    }

    public static gr8 valueOf(String str) {
        return (gr8) Enum.valueOf(gr8.class, str);
    }

    public static gr8[] values() {
        return (gr8[]) i0.clone();
    }
}
