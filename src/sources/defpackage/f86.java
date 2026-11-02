package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f86 implements ab7 {
    public final View X;

    public f86(View view) {
        this.X = view;
    }

    public static yo1 b(int i, int i2, int i3) {
        if (i == -2) {
            return xo1.a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            wo1.a(i4);
            return new wo1(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        wo1.a(i5);
        return new wo1(i5);
    }

    @Override // defpackage.ab7
    public final Object a(q51 q51Var) {
        ta7 ta7VarC = c();
        if (ta7VarC != null) {
            return ta7VarC;
        }
        mm0 mm0Var = new mm0(1, mb6.H(q51Var));
        mm0Var.s();
        ViewTreeObserver viewTreeObserver = this.X.getViewTreeObserver();
        vx8 vx8Var = new vx8(this, viewTreeObserver, mm0Var);
        viewTreeObserver.addOnPreDrawListener(vx8Var);
        mm0Var.u(new vt1(this, viewTreeObserver, vx8Var, (byte) 2));
        return mm0Var.q();
    }

    public final ta7 c() {
        View view = this.X;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        yo1 yo1VarB = b(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (yo1VarB == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        yo1 yo1VarB2 = b(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (yo1VarB2 == null) {
            return null;
        }
        return new ta7(yo1VarB, yo1VarB2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f86) && dh3.f(this.X, ((f86) obj).X);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.X.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.X + ", subtractPadding=true)";
    }
}
