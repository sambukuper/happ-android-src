package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x09 implements View.OnApplyWindowInsetsListener {
    public final jv0 a;
    public w19 b;

    public x09(View view, jv0 jv0Var) {
        w19 w19VarB;
        this.a = jv0Var;
        WeakHashMap weakHashMap = cw8.a;
        w19 w19VarA = vv8.a(view);
        if (w19VarA != null) {
            int i = Build.VERSION.SDK_INT;
            w19VarB = (i >= 36 ? new j19(w19VarA) : i >= 35 ? new i19(w19VarA) : i >= 34 ? new h19(w19VarA) : i >= 31 ? new g19(w19VarA) : i >= 30 ? new f19(w19VarA) : i >= 29 ? new e19(w19VarA) : new d19(w19VarA)).b();
        } else {
            w19VarB = null;
        }
        this.b = w19VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = w19.g(view, windowInsets);
            return y09.j(view, windowInsets);
        }
        w19 w19VarG = w19.g(view, windowInsets);
        t19 t19Var = w19VarG.a;
        w19 w19VarA = this.b;
        if (w19VarA == null) {
            WeakHashMap weakHashMap = cw8.a;
            w19VarA = vv8.a(view);
            this.b = w19VarA;
        }
        if (w19VarA == null) {
            this.b = w19VarG;
            return y09.j(view, windowInsets);
        }
        jv0 jv0VarK = y09.k(view);
        if (jv0VarK != null && Objects.equals((w19) jv0VarK.Y, w19VarG)) {
            return y09.j(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        w19 w19Var = this.b;
        int i = 1;
        while (i <= 512) {
            fe3 fe3VarH = t19Var.h(i);
            fe3 fe3VarH2 = w19Var.a.h(i);
            int i2 = fe3VarH.a;
            int i3 = fe3VarH.d;
            int i4 = fe3VarH.c;
            int i5 = fe3VarH.b;
            int i6 = fe3VarH2.a;
            int i7 = fe3VarH2.d;
            int i8 = fe3VarH2.c;
            int i9 = fe3VarH2.b;
            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            iArr = iArr;
        }
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = w19VarG;
            return y09.j(view, windowInsets);
        }
        w19 w19Var2 = this.b;
        if ((i10 & 8) != 0) {
            interpolator = y09.e;
        } else if ((i11 & 8) != 0) {
            interpolator = y09.f;
        } else if ((i10 & 519) != 0) {
            interpolator = y09.g;
        } else {
            interpolator = (i11 & 519) != 0 ? y09.h : null;
        }
        c19 c19Var = new c19(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
        c19Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c19Var.a.b());
        fe3 fe3VarH3 = t19Var.h(i12);
        fe3 fe3VarH4 = w19Var2.a.h(i12);
        int iMin = Math.min(fe3VarH3.a, fe3VarH4.a);
        int i13 = fe3VarH3.b;
        int i14 = fe3VarH4.b;
        int iMin2 = Math.min(i13, i14);
        int i15 = fe3VarH3.c;
        int i16 = fe3VarH4.c;
        int iMin3 = Math.min(i15, i16);
        int i17 = fe3VarH3.d;
        int i18 = fe3VarH4.d;
        xd6 xd6Var = new xd6(fe3.c(iMin, iMin2, iMin3, Math.min(i17, i18)), fe3.c(Math.max(fe3VarH3.a, fe3VarH4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), (byte) 26);
        y09.g(view, c19Var, w19VarG, false);
        duration.addUpdateListener(new w09(c19Var, w19VarG, w19Var2, i12, view));
        duration.addListener(new f03(c19Var, view, (byte) 3));
        db5.a(view, new oo0(view, c19Var, xd6Var, duration));
        this.b = w19VarG;
        return y09.j(view, windowInsets);
    }
}
