package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w09 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ c19 a;
    public final /* synthetic */ w19 b;
    public final /* synthetic */ w19 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public w09(c19 c19Var, w19 w19Var, w19 w19Var2, int i, View view) {
        this.a = c19Var;
        this.b = w19Var;
        this.c = w19Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        k19 e19Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        c19 c19Var = this.a;
        b19 b19Var = c19Var.a;
        b19Var.e(animatedFraction);
        float fC = b19Var.c();
        PathInterpolator pathInterpolator = y09.e;
        int i = Build.VERSION.SDK_INT;
        w19 w19Var = this.b;
        if (i >= 36) {
            e19Var = new j19(w19Var);
        } else if (i >= 35) {
            e19Var = new i19(w19Var);
        } else if (i >= 34) {
            e19Var = new h19(w19Var);
        } else if (i >= 31) {
            e19Var = new g19(w19Var);
        } else if (i >= 30) {
            e19Var = new f19(w19Var);
        } else {
            e19Var = i >= 29 ? new e19(w19Var) : new d19(w19Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            t19 t19Var = w19Var.a;
            if (i3 == 0) {
                e19Var.d(i2, t19Var.h(i2));
            } else {
                fe3 fe3VarH = t19Var.h(i2);
                fe3 fe3VarH2 = this.c.a.h(i2);
                float f = 1.0f - fC;
                e19Var.d(i2, w19.e(fe3VarH, (int) (((double) ((fe3VarH.a - fe3VarH2.a) * f)) + 0.5d), (int) (((double) ((fe3VarH.b - fe3VarH2.b) * f)) + 0.5d), (int) (((double) ((fe3VarH.c - fe3VarH2.c) * f)) + 0.5d), (int) (((double) ((fe3VarH.d - fe3VarH2.d) * f)) + 0.5d)));
            }
        }
        y09.h(this.e, e19Var.b(), Collections.singletonList(c19Var));
    }
}
