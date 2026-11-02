package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k59 {
    public static final k59 a = new k59();

    public final long a(Paint paint) {
        int i = dw0.h;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(wa.L(i));
    }

    public final void c(Paint paint, long j) {
        paint.setColor(g33.U(j));
    }
}
