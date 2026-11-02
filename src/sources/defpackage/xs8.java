package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xs8 {
    public static final long a = s31.b(0, 0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final long a(long j) {
        int iO = nr4.O(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) nr4.O(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iO) << 32);
    }

    public static void b(String str) {
        throw new IllegalArgumentException(oi0.m("Unsupported type: ", str, ". ", pc6.p("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
