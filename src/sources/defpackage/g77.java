package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g77 extends k77 {
    public final i77 c;
    public final float d;
    public final float e;

    public g77(i77 i77Var, float f, float f2) {
        this.c = i77Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.k77
    public final void a(Matrix matrix, v67 v67Var, int i, Canvas canvas) {
        i77 i77Var = this.c;
        float f = i77Var.c;
        float f2 = this.e;
        float f3 = i77Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        v67Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = v67Var.c;
        int[] iArr = v67.i;
        iArr[0] = i2;
        iArr[1] = v67Var.b;
        iArr[2] = v67Var.a;
        Paint paint = (Paint) v67Var.f;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, v67.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        i77 i77Var = this.c;
        return (float) Math.toDegrees(Math.atan((i77Var.c - this.e) / (i77Var.b - this.d)));
    }
}
