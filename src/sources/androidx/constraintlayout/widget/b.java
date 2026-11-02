package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import defpackage.d30;
import defpackage.e30;
import defpackage.km4;
import defpackage.m31;
import defpackage.n31;
import defpackage.p61;
import defpackage.u21;
import defpackage.ye2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e30 {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(m31 m31Var, d30 d30Var) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z;
        int baseline;
        int i;
        if (m31Var == null) {
            return;
        }
        u21 u21Var = m31Var.K;
        u21 u21Var2 = m31Var.I;
        if (m31Var.g0 == 8) {
            d30Var.e = 0;
            d30Var.f = 0;
            d30Var.g = 0;
            return;
        }
        if (m31Var.T == null) {
            return;
        }
        int i2 = d30Var.a;
        int i3 = d30Var.b;
        int i4 = d30Var.c;
        int i5 = d30Var.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = m31Var.f0;
        int iB = p61.B(i2);
        if (iB == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iB == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (iB == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z2 = m31Var.r == 1;
            int i8 = d30Var.j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == m31Var.k();
                if (d30Var.j == 2 || !z2 || ((z2 && z3) || m31Var.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m31Var.q(), 1073741824);
                }
            }
        } else if (iB != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.f;
            int i10 = u21Var2 != null ? u21Var2.g : 0;
            if (u21Var != null) {
                i10 += u21Var.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iB2 = p61.B(i3);
        if (iB2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iB2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (iB2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = m31Var.s == 1;
            int i11 = d30Var.j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == m31Var.q();
                if (d30Var.j == 2 || !z4 || ((z4 && z5) || m31Var.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m31Var.k(), 1073741824);
                }
            }
        } else if (iB2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.g;
            int i13 = u21Var2 != null ? m31Var.J.g : 0;
            if (u21Var != null) {
                i13 += m31Var.L.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        n31 n31Var = m31Var.T;
        ConstraintLayout constraintLayout = this.h;
        if (n31Var != null && km4.y(constraintLayout.n0, PSKKeyManager.MAX_KEY_LENGTH_BYTES) && view.getMeasuredWidth() == m31Var.q() && view.getMeasuredWidth() < n31Var.q() && view.getMeasuredHeight() == m31Var.k() && view.getMeasuredHeight() < n31Var.k() && view.getBaseline() == m31Var.a0 && !m31Var.z() && a(m31Var.G, iMakeMeasureSpec, m31Var.q()) && a(m31Var.H, iMakeMeasureSpec2, m31Var.k())) {
            d30Var.e = m31Var.q();
            d30Var.f = m31Var.k();
            d30Var.g = m31Var.a0;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && m31Var.W > 0.0f;
        boolean z11 = z7 && m31Var.W > 0.0f;
        if (view == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        int i14 = d30Var.j;
        if (i14 != 1 && i14 != 2 && z6 && m31Var.r == 0 && z7 && m31Var.s == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax2 = 0;
            iMax = 0;
        } else {
            if ((view instanceof VirtualLayout) && (m31Var instanceof ye2)) {
                ((VirtualLayout) view).j((ye2) m31Var, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            m31Var.G = iMakeMeasureSpec;
            m31Var.H = iMakeMeasureSpec2;
            m31Var.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = m31Var.u;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = m31Var.v;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = m31Var.x;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = m31Var.y;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!km4.y(constraintLayout.n0, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * m31Var.W) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / m31Var.W) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                m31Var.G = iMakeMeasureSpec;
                m31Var.H = iMakeMeasureSpec3;
                z = false;
                m31Var.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        d30Var.i = (iMax == d30Var.c && iMax2 == d30Var.d) ? z : true;
        boolean z13 = layoutParams.c0 ? true : z12;
        if (z13 && baseline != -1 && m31Var.a0 != baseline) {
            d30Var.i = true;
        }
        d30Var.e = iMax;
        d30Var.f = iMax2;
        d30Var.h = z13;
        d30Var.g = baseline;
    }
}
