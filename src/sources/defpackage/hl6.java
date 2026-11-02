package defpackage;

import androidx.compose.material3.c;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hl6 {
    public static final ox1 a = new ox1(new w76((byte) 8), (byte) 0);
    public static final c b;
    public static final c c;

    static {
        long j = dw0.g;
        b = new c(true, Float.NaN, j);
        c = new c(false, Float.NaN, j);
    }

    public static c a(float f, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = dw0.g;
        }
        if (kt1.b(f, Float.NaN) && tk8.a(j, dw0.g)) {
            return z ? b : c;
        }
        return new c(z, f, j);
    }
}
