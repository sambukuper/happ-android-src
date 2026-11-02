package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mw1 {
    public final j20 a;
    public final Path b;
    public final Path c;
    public final PathMeasure d;
    public final Matrix e;

    public mw1(j20 j20Var) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.a = j20Var;
        this.e = new Matrix();
    }

    public static float h(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    public abstract void c(Canvas canvas, Paint paint, kw1 kw1Var, int i);

    public abstract void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    public int e() {
        j20 j20Var = this.a;
        return (((LinearProgressIndicatorSpec) j20Var).l * 2) + ((LinearProgressIndicatorSpec) j20Var).a;
    }

    public int f() {
        return -1;
    }

    public abstract void g();

    public void b(int i, int i2, Canvas canvas, Paint paint) {
    }
}
