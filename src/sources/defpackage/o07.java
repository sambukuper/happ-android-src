package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o07 {
    public static final tk a = new tk(Float.NaN, Float.NaN);
    public static final ug8 b = new ug8(new zx6((byte) 1), new zx6((byte) 2));
    public static final long c;
    public static final wf7 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new wf7(new z85(jFloatToRawIntBits));
    }
}
