package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v67 {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};
    public int a;
    public int b;
    public int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public v67() {
        this.h = new Path();
        Paint paint = new Paint();
        this.g = paint;
        this.d = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f = new Paint(paint2);
    }

    public void a(int i2) {
        this.a = qw0.d(i2, 68);
        this.b = qw0.d(i2, 20);
        this.c = qw0.d(i2, 0);
        ((Paint) this.d).setColor(this.a);
    }

    public v67(byte[] bArr, String str, ArrayList arrayList, String str2, int i2, int i3, int i4) {
        this.d = str;
        this.e = arrayList;
        this.f = str2;
        this.a = i3;
        this.b = i2;
        this.c = i4;
    }
}
