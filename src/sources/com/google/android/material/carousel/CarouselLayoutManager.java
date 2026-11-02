package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.k;
import defpackage.bt;
import defpackage.ho0;
import defpackage.io0;
import defpackage.j36;
import defpackage.jo0;
import defpackage.ko0;
import defpackage.lo0;
import defpackage.mo0;
import defpackage.o96;
import defpackage.pc6;
import defpackage.q96;
import defpackage.s56;
import defpackage.v56;
import defpackage.yy4;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends j implements o96 {
    public final yy4 r0;
    public mo0 s0;
    public final View.OnLayoutChangeListener t0;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new jo0();
        this.t0 = new ho0(this, (byte) 0);
        this.r0 = new yy4();
        K0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v56.Carousel);
            typedArrayObtainStyledAttributes.getInt(v56.Carousel_carousel_alignment, 0);
            K0();
            d1(typedArrayObtainStyledAttributes.getInt(s56.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final int A(q96 q96Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final RecyclerView.LayoutParams E() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean J0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.j
    public final void M(View view, Rect rect) {
        super.M(view, rect);
        rect.centerY();
        if (b1()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.j
    public final int M0(int i, q96 q96Var, k kVar) {
        if (!b1() || I() == 0 || i == 0) {
            return 0;
        }
        kVar.d(0);
        bt.i("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final int O0(int i, q96 q96Var, k kVar) {
        if (!q() || I() == 0 || i == 0) {
            return 0;
        }
        kVar.d(0);
        bt.i("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final void X0(RecyclerView recyclerView, int i) {
        io0 io0Var = new io0(this, recyclerView.getContext());
        io0Var.a = i;
        Y0(io0Var);
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean Y() {
        return true;
    }

    @Override // defpackage.o96
    public final PointF a(int i) {
        return null;
    }

    public final float a1(float f, float f2) {
        return c1() ? f - f2 : f + f2;
    }

    public final boolean b1() {
        return !this.s0.a;
    }

    public final boolean c1() {
        return b1() && this.Y.getLayoutDirection() == 1;
    }

    public final void d1(int i) {
        mo0 lo0Var;
        if (i != 0 && i != 1) {
            bt.q(pc6.j(i, "invalid orientation:"));
            return;
        }
        n(null);
        mo0 mo0Var = this.s0;
        if (mo0Var == null || i != mo0Var.a) {
            if (i == 0) {
                lo0Var = new lo0(this);
            } else {
                if (i != 1) {
                    bt.q("invalid orientation");
                    return;
                }
                lo0Var = new ko0(this);
            }
            this.s0 = lo0Var;
            K0();
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final void g0(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        yy4 yy4Var = this.r0;
        float dimension = yy4Var.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(j36.m3_carousel_small_item_size_min);
        }
        yy4Var.a = dimension;
        float dimension2 = yy4Var.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(j36.m3_carousel_small_item_size_max);
        }
        yy4Var.b = dimension2;
        K0();
        recyclerView.addOnLayoutChangeListener(this.t0);
    }

    @Override // androidx.recyclerview.widget.j
    public final void h0(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.t0);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x002a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0034  */
    @Override // androidx.recyclerview.widget.j
    public final View i0(View view, int i, k kVar, q96 q96Var) {
        byte b;
        if (I() != 0) {
            boolean z = this.s0.a;
            if (i == 1) {
                b = -1;
            } else if (i == 2) {
                b = 1;
            } else if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i == 130 && z) {
                            b = 1;
                        } else {
                            b = -2147483648;
                        }
                    } else if (z) {
                        b = -2147483648;
                    } else if (c1()) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                } else if (z) {
                    b = -1;
                } else {
                    b = -2147483648;
                }
            } else if (z) {
                b = -2147483648;
            } else if (c1()) {
                b = 1;
            } else {
                b = -1;
            }
            if (b != -2147483648) {
                if (b == -1) {
                    if (j.T(view) != 0) {
                        int iT = j.T(H(0)) - 1;
                        if (iT < 0 || iT >= S()) {
                            return H(c1() ? I() - 1 : 0);
                        }
                        this.s0.d();
                        throw null;
                    }
                } else if (j.T(view) != S() - 1) {
                    int iT2 = j.T(H(I() - 1)) + 1;
                    if (iT2 < 0 || iT2 >= S()) {
                        return H(c1() ? 0 : I() - 1);
                    }
                    this.s0.d();
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.j
    public final void j0(AccessibilityEvent accessibilityEvent) {
        super.j0(accessibilityEvent);
        if (I() > 0) {
            accessibilityEvent.setFromIndex(j.T(H(0)));
            accessibilityEvent.setToIndex(j.T(H(I() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final void o0(int i, int i2) {
        S();
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean p() {
        return b1();
    }

    @Override // androidx.recyclerview.widget.j
    public final void p0() {
        S();
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean q() {
        return !b1();
    }

    @Override // androidx.recyclerview.widget.j
    public final void r0(int i, int i2) {
        S();
    }

    @Override // androidx.recyclerview.widget.j
    public final void u0(k kVar, q96 q96Var) {
        if (q96Var.b() > 0) {
            if ((b1() ? this.p0 : this.q0) > 0.0f) {
                c1();
                kVar.d(0);
                bt.i("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        E0(kVar);
    }

    @Override // androidx.recyclerview.widget.j
    public final int v(q96 q96Var) {
        I();
        return 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final void v0(q96 q96Var) {
        if (I() == 0) {
            return;
        }
        j.T(H(0));
    }

    @Override // androidx.recyclerview.widget.j
    public final int w(q96 q96Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final int x(q96 q96Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final int y(q96 q96Var) {
        I();
        return 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final int z(q96 q96Var) {
        return 0;
    }

    public CarouselLayoutManager() {
        yy4 yy4Var = new yy4();
        new jo0();
        this.t0 = new ho0(this, (byte) 0);
        this.r0 = yy4Var;
        K0();
        d1(0);
    }
}
