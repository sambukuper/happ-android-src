package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lf {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public lf(Path path) {
        this.a = path;
    }

    public static void a(lf lfVar, lf lfVar2) {
        Path path = lfVar.a;
        if (lfVar2 instanceof lf) {
            path.addPath(lfVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            u52.k("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(lf lfVar, s86 s86Var) {
        float f = s86Var.a;
        float f2 = s86Var.d;
        float f3 = s86Var.c;
        float f4 = s86Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            nf.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = lfVar.b;
        if (rectF == null) {
            rectF = new RectF();
            lfVar.b = rectF;
        }
        rectF.set(f, f4, f3, f2);
        Path path = lfVar.a;
        RectF rectF2 = lfVar.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void c(lf lfVar, em6 em6Var) {
        RectF rectF = lfVar.b;
        if (rectF == null) {
            rectF = new RectF();
            lfVar.b = rectF;
        }
        float f = em6Var.a;
        long j = em6Var.h;
        long j2 = em6Var.g;
        long j3 = em6Var.f;
        long j4 = em6Var.e;
        rectF.set(f, em6Var.b, em6Var.c, em6Var.d);
        float[] fArr = lfVar.c;
        if (fArr == null) {
            fArr = new float[8];
            lfVar.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = lfVar.a;
        RectF rectF2 = lfVar.b;
        rectF2.getClass();
        float[] fArr2 = lfVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final s86 d() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new s86(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean f(lf lfVar, lf lfVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(lfVar instanceof lf)) {
            u52.k("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = lfVar.a;
        if (lfVar2 instanceof lf) {
            return this.a.op(path, lfVar2.a, op);
        }
        u52.k("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void g() {
        this.a.reset();
    }

    public final void h(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
