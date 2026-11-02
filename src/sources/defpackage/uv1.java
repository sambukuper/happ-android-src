package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uv1 extends CharacterStyle implements UpdateAppearance {
    public final tv1 X;

    public uv1(tv1 tv1Var) {
        this.X = tv1Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            ea2 ea2Var = ea2.a;
            tv1 tv1Var = this.X;
            if (dh3.f(tv1Var, ea2Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(tv1Var instanceof om7)) {
                b61.c();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            om7 om7Var = (om7) tv1Var;
            textPaint.setStrokeWidth(om7Var.a);
            textPaint.setStrokeMiter(om7Var.b);
            int i = om7Var.d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = om7Var.c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
