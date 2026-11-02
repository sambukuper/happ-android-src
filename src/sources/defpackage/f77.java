package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f77 extends k77 {
    public final h77 c;

    public f77(h77 h77Var) {
        this.c = h77Var;
    }

    @Override // defpackage.k77
    public final void a(Matrix matrix, v67 v67Var, int i, Canvas canvas) {
        RectF rectF = h77.h;
        h77 h77Var = this.c;
        float f = h77Var.f;
        float f2 = h77Var.g;
        RectF rectF2 = new RectF(h77Var.b, h77Var.c, h77Var.d, h77Var.e);
        Paint paint = (Paint) v67Var.e;
        boolean z = f2 < 0.0f;
        Path path = (Path) v67Var.h;
        int[] iArr = v67.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = v67Var.c;
            iArr[2] = v67Var.b;
            iArr[3] = v67Var.a;
        } else {
            path.rewind();
            path.moveTo(rectF2.centerX(), rectF2.centerY());
            path.arcTo(rectF2, f, f2);
            path.close();
            float f3 = -i;
            rectF2.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = v67Var.a;
            iArr[2] = v67Var.b;
            iArr[3] = v67Var.c;
        }
        float fWidth = rectF2.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = v67.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF2.centerX(), rectF2.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF2.height() / rectF2.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, (Paint) v67Var.g);
        }
        canvas.drawArc(rectF2, f, f2, true, paint);
        canvas.restore();
    }
}
