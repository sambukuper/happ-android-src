package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z32 {
    public final pr8 a;
    public final lx0 b;
    public final Range c;
    public final boolean d;
    public final Rational e;
    public ux0 f;
    public y32 g;

    public z32(qj0 qj0Var, pr8 pr8Var, lx0 lx0Var) {
        Integer num;
        Rational rational;
        qj0Var.getClass();
        pr8Var.getClass();
        lx0Var.getClass();
        this.a = pr8Var;
        this.b = lx0Var;
        jj0 jj0Var = qj0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        key.getClass();
        Object obj = w32.a;
        lf0 lf0Var = (lf0) jj0Var;
        lf0Var.getClass();
        Object objC = lf0Var.c(key);
        obj = objC != null ? objC : obj;
        obj.getClass();
        Range range = (Range) obj;
        this.c = range;
        Integer num2 = (Integer) range.getUpper();
        boolean z = (num2 == null || num2.intValue() != 0) && ((num = (Integer) range.getLower()) == null || num.intValue() != 0);
        this.d = z;
        if (z) {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
            key2.getClass();
            Object objC2 = lf0Var.c(key2);
            objC2.getClass();
            rational = (Rational) objC2;
        } else {
            rational = Rational.ZERO;
            rational.getClass();
        }
        this.e = rational;
    }
}
