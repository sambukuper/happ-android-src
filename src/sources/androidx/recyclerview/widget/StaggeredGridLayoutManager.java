package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.bt;
import defpackage.c44;
import defpackage.cw8;
import defpackage.e96;
import defpackage.g4;
import defpackage.h4;
import defpackage.jg7;
import defpackage.kg7;
import defpackage.mg7;
import defpackage.o96;
import defpackage.oi0;
import defpackage.q96;
import defpackage.td5;
import defpackage.xb;
import defpackage.xr0;
import defpackage.yn0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends j implements o96 {
    public final BitSet A0;
    public final m D0;
    public final byte E0;
    public boolean F0;
    public boolean G0;
    public mg7 H0;
    public final Rect I0;
    public final jg7 J0;
    public final boolean K0;
    public int[] L0;
    public final xb M0;
    public final int r0;
    public final n[] s0;
    public final td5 t0;
    public final td5 u0;
    public final int v0;
    public int w0;
    public final c44 x0;
    public boolean y0;
    public boolean z0 = false;
    public int B0 = -1;
    public int C0 = Integer.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public n g0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.r0 = -1;
        this.y0 = false;
        m mVar = new m();
        this.D0 = mVar;
        this.E0 = (byte) 2;
        this.I0 = new Rect();
        this.J0 = new jg7(this);
        this.K0 = true;
        this.M0 = new xb(this, (byte) 20);
        e96 e96VarU = j.U(context, attributeSet, i, i2);
        int i3 = e96VarU.a;
        if (i3 != 0 && i3 != 1) {
            bt.q("invalid orientation.");
            throw null;
        }
        n(null);
        if (i3 != this.v0) {
            this.v0 = i3;
            td5 td5Var = this.t0;
            this.t0 = this.u0;
            this.u0 = td5Var;
            K0();
        }
        int i4 = e96VarU.b;
        n(null);
        if (i4 != this.r0) {
            mVar.a();
            K0();
            this.r0 = i4;
            this.A0 = new BitSet(this.r0);
            this.s0 = new n[this.r0];
            for (int i5 = 0; i5 < this.r0; i5++) {
                this.s0[i5] = new n(this, i5);
            }
            K0();
        }
        boolean z = e96VarU.c;
        n(null);
        mg7 mg7Var = this.H0;
        if (mg7Var != null && mg7Var.j0 != z) {
            mg7Var.j0 = z;
        }
        this.y0 = z;
        K0();
        c44 c44Var = new c44();
        c44Var.a = true;
        c44Var.f = 0;
        c44Var.g = 0;
        this.x0 = c44Var;
        this.t0 = td5.b(this, this.v0);
        this.u0 = td5.b(this, 1 - this.v0);
    }

    public static int A1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.j
    public final int A(q96 q96Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.K0;
        return yn0.y(q96Var, this.t0, e1(z), d1(z), this, this.K0);
    }

    @Override // androidx.recyclerview.widget.j
    public final void A0(int i) {
        if (i == 0) {
            a1();
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final RecyclerView.LayoutParams E() {
        return this.v0 == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.j
    public final RecyclerView.LayoutParams F(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.j
    public final RecyclerView.LayoutParams G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.j
    public final int K(k kVar, q96 q96Var) {
        if (this.v0 == 1) {
            return Math.min(this.r0, q96Var.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.j
    public final int M0(int i, q96 q96Var, k kVar) {
        return w1(i, q96Var, kVar);
    }

    @Override // androidx.recyclerview.widget.j
    public final void N0(int i) {
        mg7 mg7Var = this.H0;
        if (mg7Var != null && mg7Var.X != i) {
            mg7Var.f0 = null;
            mg7Var.Z = 0;
            mg7Var.X = -1;
            mg7Var.Y = -1;
        }
        this.B0 = i;
        this.C0 = Integer.MIN_VALUE;
        K0();
    }

    @Override // androidx.recyclerview.widget.j
    public final int O0(int i, q96 q96Var, k kVar) {
        return w1(i, q96Var, kVar);
    }

    @Override // androidx.recyclerview.widget.j
    public final void R0(Rect rect, int i, int i2) {
        int iS;
        int iS2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.v0;
        int i4 = this.r0;
        if (i3 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.Y;
            WeakHashMap weakHashMap = cw8.a;
            iS2 = j.s(i2, iHeight, recyclerView.getMinimumHeight());
            iS = j.s(i, (this.w0 * i4) + paddingRight, this.Y.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.Y;
            WeakHashMap weakHashMap2 = cw8.a;
            iS = j.s(i, iWidth, recyclerView2.getMinimumWidth());
            iS2 = j.s(i2, (this.w0 * i4) + paddingBottom, this.Y.getMinimumHeight());
        }
        this.Y.setMeasuredDimension(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.j
    public final int V(k kVar, q96 q96Var) {
        if (this.v0 == 0) {
            return Math.min(this.r0, q96Var.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.j
    public final void X0(RecyclerView recyclerView, int i) {
        c cVar = new c(recyclerView.getContext());
        cVar.a = i;
        Y0(cVar);
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean Y() {
        return this.E0 != 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean Z() {
        return this.y0;
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean Z0() {
        return this.H0 == null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // defpackage.o96
    public final PointF a(int i) {
        int i2 = -1;
        if (I() != 0) {
            if ((i < h1()) == this.z0) {
                i2 = 1;
            }
        } else if (this.z0) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.v0 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    public final boolean a1() {
        int iH1;
        if (I() != 0 && this.E0 != 0 && this.i0) {
            if (this.z0) {
                iH1 = i1();
                h1();
            } else {
                iH1 = h1();
                i1();
            }
            if (iH1 == 0 && m1() != null) {
                this.D0.a();
                this.h0 = true;
                K0();
                return true;
            }
        }
        return false;
    }

    public final int b1(q96 q96Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.K0;
        return yn0.x(q96Var, this.t0, e1(z), d1(z), this, this.K0, this.z0);
    }

    @Override // androidx.recyclerview.widget.j
    public final void c0(int i) {
        super.c0(i);
        for (int i2 = 0; i2 < this.r0; i2++) {
            n nVar = this.s0[i2];
            int i3 = nVar.b;
            if (i3 != Integer.MIN_VALUE) {
                nVar.b = i3 + i;
            }
            int i4 = nVar.c;
            if (i4 != Integer.MIN_VALUE) {
                nVar.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    public final int c1(k kVar, c44 c44Var, q96 q96Var) {
        int i;
        int i2;
        n[] nVarArr;
        int iJ1;
        BitSet bitSet;
        int i3;
        n[] nVarArr2;
        n nVar;
        ?? r4;
        int iH;
        int iE;
        int iE2;
        int i4;
        BitSet bitSet2;
        int i5;
        int i6;
        int i7;
        k kVar2 = kVar;
        BitSet bitSet3 = this.A0;
        int i8 = this.r0;
        bitSet3.set(0, i8, true);
        c44 c44Var2 = this.x0;
        if (c44Var2.i) {
            i = c44Var.e;
            i2 = i == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = c44Var.e;
            i2 = i == 1 ? c44Var.g + c44Var.b : c44Var.f - c44Var.b;
        }
        int i9 = 0;
        while (true) {
            nVarArr = this.s0;
            if (i9 >= i8) {
                break;
            }
            if (!nVarArr[i9].a.isEmpty()) {
                z1(nVarArr[i9], i, i2);
            }
            i9++;
        }
        boolean z = this.z0;
        td5 td5Var = this.t0;
        int i10 = z ? td5Var.i() : td5Var.m();
        boolean z2 = false;
        while (true) {
            int i11 = c44Var.c;
            if (i11 < 0 || i11 >= q96Var.b() || (!c44Var2.i && bitSet3.isEmpty())) {
                break;
            }
            View viewD = kVar2.d(c44Var.c);
            c44Var.c += c44Var.d;
            LayoutParams layoutParams = (LayoutParams) viewD.getLayoutParams();
            int iC = layoutParams.X.c();
            m mVar = this.D0;
            int[] iArr = mVar.a;
            int i12 = (iArr == null || iC >= iArr.length) ? -1 : iArr[iC];
            if (i12 == -1) {
                if (q1(c44Var.e)) {
                    i6 = i8 - 1;
                    i3 = i8;
                    i5 = -1;
                    i7 = -1;
                } else {
                    i5 = i8;
                    i3 = i5;
                    i6 = 0;
                    i7 = 1;
                }
                n nVar2 = null;
                int i13 = i6;
                if (c44Var.e == 1) {
                    int iM = td5Var.m();
                    nVarArr2 = nVarArr;
                    int i14 = i13;
                    int i15 = Integer.MAX_VALUE;
                    while (i14 != i5) {
                        int i16 = i14;
                        n nVar3 = nVarArr2[i16];
                        BitSet bitSet4 = bitSet3;
                        int iF = nVar3.f(iM);
                        if (iF < i15) {
                            i15 = iF;
                            nVar2 = nVar3;
                        }
                        i14 = i16 + i7;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    nVarArr2 = nVarArr;
                    int i17 = td5Var.i();
                    int i18 = i13;
                    int i19 = Integer.MIN_VALUE;
                    while (i18 != i5) {
                        n nVar4 = nVarArr2[i18];
                        int i20 = i18;
                        int iH2 = nVar4.h(i17);
                        if (iH2 > i19) {
                            i19 = iH2;
                            nVar2 = nVar4;
                        }
                        i18 = i20 + i7;
                    }
                }
                nVar = nVar2;
                mVar.b(iC);
                mVar.a[iC] = nVar.e;
            } else {
                bitSet = bitSet3;
                i3 = i8;
                nVarArr2 = nVarArr;
                nVar = nVarArr2[i12];
            }
            layoutParams.g0 = nVar;
            if (c44Var.e == 1) {
                l(viewD);
                r4 = 0;
            } else {
                r4 = 0;
                m(viewD, 0, false);
            }
            int i21 = this.v0;
            if (i21 == 1) {
                o1(viewD, j.J(this.w0, r4, this.n0, r4, ((ViewGroup.MarginLayoutParams) layoutParams).width), j.J(this.q0, true, this.o0, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
            } else {
                o1(viewD, j.J(this.p0, true, this.n0, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width), j.J(this.w0, false, this.o0, 0, ((ViewGroup.MarginLayoutParams) layoutParams).height));
            }
            if (c44Var.e == 1) {
                iE = nVar.f(i10);
                iH = td5Var.e(viewD) + iE;
            } else {
                iH = nVar.h(i10);
                iE = iH - td5Var.e(viewD);
            }
            int i22 = c44Var.e;
            n nVar5 = layoutParams.g0;
            if (i22 == 1) {
                nVar5.getClass();
                LayoutParams layoutParams2 = (LayoutParams) viewD.getLayoutParams();
                layoutParams2.g0 = nVar5;
                ArrayList arrayList = nVar5.a;
                arrayList.add(viewD);
                nVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    nVar5.b = Integer.MIN_VALUE;
                }
                if (layoutParams2.X.i() || layoutParams2.X.l()) {
                    nVar5.d = nVar5.f.t0.e(viewD) + nVar5.d;
                }
            } else {
                nVar5.getClass();
                LayoutParams layoutParams3 = (LayoutParams) viewD.getLayoutParams();
                layoutParams3.g0 = nVar5;
                ArrayList arrayList2 = nVar5.a;
                arrayList2.add(0, viewD);
                nVar5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    nVar5.c = Integer.MIN_VALUE;
                }
                if (layoutParams3.X.i() || layoutParams3.X.l()) {
                    nVar5.d = nVar5.f.t0.e(viewD) + nVar5.d;
                }
            }
            boolean zN1 = n1();
            td5 td5Var2 = this.u0;
            if (zN1 && i21 == 1) {
                i4 = td5Var2.i() - (((i3 - 1) - nVar.e) * this.w0);
                iE2 = i4 - td5Var2.e(viewD);
            } else {
                int iM2 = (nVar.e * this.w0) + td5Var2.m();
                int iE3 = td5Var2.e(viewD) + iM2;
                iE2 = iM2;
                i4 = iE3;
            }
            z2 = true;
            if (i21 == 1) {
                j.b0(viewD, iE2, iE, i4, iH);
            } else {
                j.b0(viewD, iE, iE2, iH, i4);
            }
            z1(nVar, c44Var2.e, i2);
            kVar2 = kVar;
            s1(kVar2, c44Var2);
            if (c44Var2.h && viewD.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(nVar.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i8 = i3;
            nVarArr = nVarArr2;
        }
        if (!z2) {
            s1(kVar2, c44Var2);
        }
        if (c44Var2.e == -1) {
            iJ1 = td5Var.m() - k1(td5Var.m());
        } else {
            iJ1 = j1(td5Var.i()) - td5Var.i();
        }
        if (iJ1 > 0) {
            return Math.min(c44Var.b, iJ1);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final void d0(int i) {
        super.d0(i);
        for (int i2 = 0; i2 < this.r0; i2++) {
            n nVar = this.s0[i2];
            int i3 = nVar.b;
            if (i3 != Integer.MIN_VALUE) {
                nVar.b = i3 + i;
            }
            int i4 = nVar.c;
            if (i4 != Integer.MIN_VALUE) {
                nVar.c = i4 + i;
            }
        }
    }

    public final View d1(boolean z) {
        td5 td5Var = this.t0;
        int iM = td5Var.m();
        int i = td5Var.i();
        View view = null;
        for (int I = I() - 1; I >= 0; I--) {
            View viewH = H(I);
            int iG = td5Var.g(viewH);
            int iD = td5Var.d(viewH);
            if (iD > iM && iG < i) {
                if (iD <= i || !z) {
                    return viewH;
                }
                if (view == null) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.j
    public final void e0(f fVar) {
        this.D0.a();
        for (int i = 0; i < this.r0; i++) {
            this.s0[i].b();
        }
    }

    public final View e1(boolean z) {
        td5 td5Var = this.t0;
        int iM = td5Var.m();
        int i = td5Var.i();
        int I = I();
        View view = null;
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = H(i2);
            int iG = td5Var.g(viewH);
            if (td5Var.d(viewH) > iM && iG < i) {
                if (iG >= iM || !z) {
                    return viewH;
                }
                if (view == null) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    public final void f1(k kVar, q96 q96Var, boolean z) {
        int i;
        int iJ1 = j1(Integer.MIN_VALUE);
        if (iJ1 != Integer.MIN_VALUE && (i = this.t0.i() - iJ1) > 0) {
            int i2 = i - (-w1(-i, q96Var, kVar));
            if (!z || i2 <= 0) {
                return;
            }
            this.t0.r(i2);
        }
    }

    public final void g1(k kVar, q96 q96Var, boolean z) {
        int iM;
        int iK1 = k1(Integer.MAX_VALUE);
        if (iK1 != Integer.MAX_VALUE && (iM = iK1 - this.t0.m()) > 0) {
            int iW1 = iM - w1(iM, q96Var, kVar);
            if (!z || iW1 <= 0) {
                return;
            }
            this.t0.r(-iW1);
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final void h0(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.Y;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.M0);
        }
        for (int i = 0; i < this.r0; i++) {
            this.s0[i].b();
        }
        recyclerView.requestLayout();
    }

    public final int h1() {
        if (I() == 0) {
            return 0;
        }
        return j.T(H(0));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0032  */
    /* JADX WARN: Code duplicated, block: B:26:0x0039  */
    @Override // androidx.recyclerview.widget.j
    public final View i0(View view, int i, k kVar, q96 q96Var) {
        View viewC;
        int i2;
        if (I() == 0 || (viewC = C(view)) == null) {
            return null;
        }
        v1();
        int i3 = this.v0;
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                            i2 = 1;
                        }
                    } else if (i3 == 1) {
                        i2 = -1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (i3 == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (i3 != 1 && n1()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (i3 != 1 && n1()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewC.getLayoutParams();
        layoutParams.getClass();
        n nVar = layoutParams.g0;
        int iI1 = i2 == 1 ? i1() : h1();
        y1(iI1, q96Var);
        x1(i2);
        c44 c44Var = this.x0;
        c44Var.c = c44Var.d + iI1;
        c44Var.b = (int) (this.t0.n() * 0.33333334f);
        c44Var.h = true;
        c44Var.a = false;
        c1(kVar, c44Var, q96Var);
        this.F0 = this.z0;
        View viewG = nVar.g(iI1, i2);
        if (viewG != null && viewG != viewC) {
            return viewG;
        }
        boolean zQ1 = q1(i2);
        n[] nVarArr = this.s0;
        int i4 = this.r0;
        if (zQ1) {
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                View viewG2 = nVarArr[i5].g(iI1, i2);
                if (viewG2 != null && viewG2 != viewC) {
                    return viewG2;
                }
            }
        } else {
            for (int i6 = 0; i6 < i4; i6++) {
                View viewG3 = nVarArr[i6].g(iI1, i2);
                if (viewG3 != null && viewG3 != viewC) {
                    return viewG3;
                }
            }
        }
        boolean z = (this.y0 ^ true) == (i2 == -1);
        View viewD = D(z ? nVar.c() : nVar.d());
        if (viewD != null && viewD != viewC) {
            return viewD;
        }
        if (!q1(i2)) {
            for (int i7 = 0; i7 < i4; i7++) {
                View viewD2 = D(z ? nVarArr[i7].c() : nVarArr[i7].d());
                if (viewD2 != null && viewD2 != viewC) {
                    return viewD2;
                }
            }
            return null;
        }
        for (int i8 = i4 - 1; i8 >= 0; i8--) {
            if (i8 != nVar.e) {
                View viewD3 = D(z ? nVarArr[i8].c() : nVarArr[i8].d());
                if (viewD3 != null && viewD3 != viewC) {
                    return viewD3;
                }
            }
        }
        return null;
    }

    public final int i1() {
        int I = I();
        if (I == 0) {
            return 0;
        }
        return j.T(H(I - 1));
    }

    @Override // androidx.recyclerview.widget.j
    public final void j0(AccessibilityEvent accessibilityEvent) {
        super.j0(accessibilityEvent);
        if (I() > 0) {
            View viewE1 = e1(false);
            View viewD1 = d1(false);
            if (viewE1 == null || viewD1 == null) {
                return;
            }
            int iT = j.T(viewE1);
            int iT2 = j.T(viewD1);
            if (iT < iT2) {
                accessibilityEvent.setFromIndex(iT);
                accessibilityEvent.setToIndex(iT2);
            } else {
                accessibilityEvent.setFromIndex(iT2);
                accessibilityEvent.setToIndex(iT);
            }
        }
    }

    public final int j1(int i) {
        int iF = this.s0[0].f(i);
        for (int i2 = 1; i2 < this.r0; i2++) {
            int iF2 = this.s0[i2].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // androidx.recyclerview.widget.j
    public final void k0(k kVar, q96 q96Var, h4 h4Var) {
        super.k0(kVar, q96Var, h4Var);
        h4Var.m("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final int k1(int i) {
        int iH = this.s0[0].h(i);
        for (int i2 = 1; i2 < this.r0; i2++) {
            int iH2 = this.s0[i2].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    /* JADX WARN: Code duplicated, block: B:22:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0036  */
    /* JADX WARN: Code duplicated, block: B:26:0x003d  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a A[LOOP:0: B:25:0x003b->B:29:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b A[LOOP:1: B:34:0x005c->B:38:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x004e A[EDGE_INSN: B:64:0x004e->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x006f A[EDGE_INSN: B:66:0x006f->B:40:0x006f BREAK  A[LOOP:1: B:34:0x005c->B:38:0x006b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final void l1(int i, int i2, int i3) {
        int i4;
        int i5;
        m mVar;
        int[] iArr;
        int iI1;
        ArrayList arrayList;
        kg7 kg7Var;
        int size;
        int i6;
        int i7;
        int size2;
        int[] iArr2;
        int iI2 = this.z0 ? i1() : h1();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            mVar = this.D0;
            iArr = mVar.a;
            if (iArr != null && i5 < iArr.length) {
                arrayList = mVar.b;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                kg7Var = null;
                                break;
                            }
                            kg7Var = (kg7) mVar.b.get(size2);
                            if (kg7Var.X == i5) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        kg7Var = null;
                        break;
                    }
                    if (kg7Var != null) {
                        mVar.b.remove(kg7Var);
                    }
                    size = mVar.b.size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            i6 = -1;
                            break;
                        } else if (((kg7) mVar.b.get(i6)).X >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        kg7 kg7Var2 = (kg7) mVar.b.get(i6);
                        mVar.b.remove(i6);
                        i7 = kg7Var2.X;
                    } else {
                        i7 = -1;
                    }
                } else {
                    i7 = -1;
                }
                iArr2 = mVar.a;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = mVar.a.length;
                } else {
                    Arrays.fill(mVar.a, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                mVar.c(i, i2);
            } else if (i3 != 2) {
                mVar.d(i, i2);
            } else if (i3 == 8) {
                mVar.d(i, 1);
                mVar.c(i2, 1);
            }
            if (i4 <= iI2) {
                return;
            }
            if (this.z0) {
                iI1 = h1();
            } else {
                iI1 = i1();
            }
            if (i5 <= iI1) {
                K0();
            }
        }
        i4 = i + i2;
        i5 = i;
        mVar = this.D0;
        iArr = mVar.a;
        if (iArr != null) {
            arrayList = mVar.b;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            kg7Var = null;
                            break;
                        }
                        kg7Var = (kg7) mVar.b.get(size2);
                        if (kg7Var.X == i5) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    kg7Var = null;
                    break;
                }
                if (kg7Var != null) {
                    mVar.b.remove(kg7Var);
                }
                size = mVar.b.size();
                i6 = 0;
                while (true) {
                    if (i6 < size) {
                        i6 = -1;
                        break;
                    } else {
                        if (((kg7) mVar.b.get(i6)).X >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    kg7 kg7Var3 = (kg7) mVar.b.get(i6);
                    mVar.b.remove(i6);
                    i7 = kg7Var3.X;
                } else {
                    i7 = -1;
                }
            } else {
                i7 = -1;
            }
            iArr2 = mVar.a;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = mVar.a.length;
            } else {
                Arrays.fill(mVar.a, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            mVar.c(i, i2);
        } else if (i3 != 2) {
            mVar.d(i, i2);
        } else if (i3 == 8) {
            mVar.d(i, 1);
            mVar.c(i2, 1);
        }
        if (i4 <= iI2) {
            return;
        }
        if (this.z0) {
            iI1 = h1();
        } else {
            iI1 = i1();
        }
        if (i5 <= iI1) {
            K0();
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final void m0(k kVar, q96 q96Var, View view, h4 h4Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            l0(view, h4Var);
            return;
        }
        n nVar = ((LayoutParams) layoutParams).g0;
        if (this.v0 == 0) {
            h4Var.o(g4.a(nVar == null ? -1 : nVar.e, false, 1, -1, -1));
        } else {
            h4Var.o(g4.a(-1, false, -1, nVar == null ? -1 : nVar.e, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    public final View m1() {
        boolean z;
        boolean z2;
        int I = I();
        int i = I - 1;
        int i2 = this.r0;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.v0 == 1 && n1()) ? (byte) 1 : (byte) -1;
        if (this.z0) {
            I = -1;
        } else {
            i = 0;
        }
        int i3 = i < I ? 1 : -1;
        while (i != I) {
            View viewH = H(i);
            LayoutParams layoutParams = (LayoutParams) viewH.getLayoutParams();
            boolean z3 = bitSet.get(layoutParams.g0.e);
            td5 td5Var = this.t0;
            if (z3) {
                n nVar = layoutParams.g0;
                if (this.z0) {
                    int i4 = nVar.c;
                    if (i4 == Integer.MIN_VALUE) {
                        nVar.a();
                        i4 = nVar.c;
                    }
                    if (i4 < td5Var.i()) {
                        ((LayoutParams) ((View) oi0.h(1, nVar.a)).getLayoutParams()).getClass();
                        return viewH;
                    }
                } else {
                    int i5 = nVar.b;
                    ArrayList arrayList = nVar.a;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                        nVar.b = nVar.f.t0.g(view);
                        layoutParams2.getClass();
                        i5 = nVar.b;
                    }
                    if (i5 > td5Var.m()) {
                        ((LayoutParams) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewH;
                    }
                }
                bitSet.clear(layoutParams.g0.e);
            }
            i += i3;
            if (i != I) {
                View viewH2 = H(i);
                if (this.z0) {
                    int iD = td5Var.d(viewH);
                    int iD2 = td5Var.d(viewH2);
                    if (iD >= iD2) {
                        if (iD == iD2) {
                            if (layoutParams.g0.e - ((LayoutParams) viewH2.getLayoutParams()).g0.e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewH;
                }
                int iG = td5Var.g(viewH);
                int iG2 = td5Var.g(viewH2);
                if (iG <= iG2) {
                    if (iG == iG2) {
                        if (layoutParams.g0.e - ((LayoutParams) viewH2.getLayoutParams()).g0.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewH;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.j
    public final void n(String str) {
        if (this.H0 == null) {
            super.n(str);
        }
    }

    public final boolean n1() {
        return this.Y.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.j
    public final void o0(int i, int i2) {
        l1(i, i2, 1);
    }

    public final void o1(View view, int i, int i2) {
        Rect rect = this.I0;
        o(view, rect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iA1 = A1(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int iA2 = A1(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (U0(view, iA1, iA2, layoutParams)) {
            view.measure(iA1, iA2);
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean p() {
        return this.v0 == 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final void p0() {
        this.D0.a();
        K0();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
    public final void p1(k kVar, q96 q96Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        mg7 mg7Var;
        int I;
        int i2;
        int iT;
        int iT2;
        int I2;
        boolean z4;
        int i3;
        boolean z5;
        mg7 mg7Var2 = this.H0;
        jg7 jg7Var = this.J0;
        if (!(mg7Var2 == null && this.B0 == -1) && q96Var.b() == 0) {
            E0(kVar);
            jg7Var.a();
            return;
        }
        boolean z6 = jg7Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = jg7Var.g;
        boolean z7 = (z6 && this.B0 == -1 && this.H0 == null) ? false : true;
        n[] nVarArr = this.s0;
        int i4 = this.r0;
        m mVar = this.D0;
        if (z7) {
            jg7Var.a();
            mg7 mg7Var3 = this.H0;
            td5 td5Var = this.t0;
            if (mg7Var3 != null) {
                int i5 = mg7Var3.Z;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            nVarArr[i6].b();
                            mg7 mg7Var4 = this.H0;
                            int i7 = mg7Var4.f0[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += mg7Var4.k0 ? td5Var.i() : td5Var.m();
                            }
                            n nVar = nVarArr[i6];
                            nVar.b = i7;
                            nVar.c = i7;
                        }
                    } else {
                        mg7Var3.f0 = null;
                        mg7Var3.Z = 0;
                        mg7Var3.g0 = 0;
                        mg7Var3.h0 = null;
                        mg7Var3.i0 = null;
                        mg7Var3.X = mg7Var3.Y;
                    }
                }
                mg7 mg7Var5 = this.H0;
                this.G0 = mg7Var5.l0;
                boolean z8 = mg7Var5.j0;
                n(null);
                mg7 mg7Var6 = this.H0;
                if (mg7Var6 != null && mg7Var6.j0 != z8) {
                    mg7Var6.j0 = z8;
                }
                this.y0 = z8;
                K0();
                v1();
                mg7 mg7Var7 = this.H0;
                int i8 = mg7Var7.X;
                if (i8 != -1) {
                    this.B0 = i8;
                    jg7Var.c = mg7Var7.k0;
                } else {
                    jg7Var.c = this.z0;
                }
                if (mg7Var7.g0 > 1) {
                    mVar.a = mg7Var7.h0;
                    mVar.b = mg7Var7.i0;
                }
            } else {
                v1();
                jg7Var.c = this.z0;
            }
            if (q96Var.g || (i3 = this.B0) == -1) {
                if (this.F0) {
                    int iB = q96Var.b();
                    I2 = I() - 1;
                    while (true) {
                        if (I2 < 0) {
                            iT2 = 0;
                            break;
                        }
                        iT2 = j.T(H(I2));
                        if (iT2 < 0 && iT2 < iB) {
                            break;
                        } else {
                            I2--;
                        }
                    }
                } else {
                    int iB2 = q96Var.b();
                    I = I();
                    i2 = 0;
                    while (true) {
                        if (i2 >= I) {
                            iT2 = 0;
                            break;
                        }
                        iT = j.T(H(i2));
                        if (iT < 0 && iT < iB2) {
                            iT2 = iT;
                            break;
                        }
                        i2++;
                    }
                }
                jg7Var.a = iT2;
                jg7Var.b = Integer.MIN_VALUE;
                z4 = true;
            } else if (i3 < 0 || i3 >= q96Var.b()) {
                this.B0 = -1;
                this.C0 = Integer.MIN_VALUE;
                if (this.F0) {
                    int iB3 = q96Var.b();
                    I2 = I() - 1;
                    while (true) {
                        if (I2 < 0) {
                            iT2 = 0;
                            break;
                        } else {
                            iT2 = j.T(H(I2));
                            if (iT2 < 0) {
                            }
                            I2--;
                        }
                    }
                } else {
                    int iB4 = q96Var.b();
                    I = I();
                    i2 = 0;
                    while (true) {
                        if (i2 >= I) {
                            iT2 = 0;
                            break;
                        } else {
                            iT = j.T(H(i2));
                            if (iT < 0) {
                            }
                            i2++;
                        }
                    }
                }
                jg7Var.a = iT2;
                jg7Var.b = Integer.MIN_VALUE;
                z4 = true;
            } else {
                mg7 mg7Var8 = this.H0;
                if (mg7Var8 == null || mg7Var8.X == -1 || mg7Var8.Z < 1) {
                    View viewD = D(this.B0);
                    if (viewD != null) {
                        jg7Var.a = this.z0 ? i1() : h1();
                        if (this.C0 != Integer.MIN_VALUE) {
                            if (jg7Var.c) {
                                jg7Var.b = (td5Var.i() - this.C0) - td5Var.d(viewD);
                            } else {
                                jg7Var.b = (td5Var.m() + this.C0) - td5Var.g(viewD);
                            }
                        } else if (td5Var.e(viewD) > td5Var.n()) {
                            jg7Var.b = jg7Var.c ? td5Var.i() : td5Var.m();
                        } else {
                            int iG = td5Var.g(viewD) - td5Var.m();
                            if (iG < 0) {
                                jg7Var.b = -iG;
                            } else {
                                int i9 = td5Var.i() - td5Var.d(viewD);
                                if (i9 < 0) {
                                    jg7Var.b = i9;
                                } else {
                                    jg7Var.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i10 = this.B0;
                        jg7Var.a = i10;
                        int i11 = this.C0;
                        if (i11 == Integer.MIN_VALUE) {
                            if (I() != 0) {
                                if ((i10 < h1()) != this.z0) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.z0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            jg7Var.c = z5;
                            td5 td5Var2 = staggeredGridLayoutManager.t0;
                            jg7Var.b = z5 ? td5Var2.i() : td5Var2.m();
                        } else {
                            boolean z9 = jg7Var.c;
                            td5 td5Var3 = staggeredGridLayoutManager.t0;
                            if (z9) {
                                jg7Var.b = td5Var3.i() - i11;
                            } else {
                                jg7Var.b = td5Var3.m() + i11;
                            }
                        }
                        z4 = true;
                        jg7Var.d = true;
                    }
                } else {
                    jg7Var.b = Integer.MIN_VALUE;
                    jg7Var.a = this.B0;
                }
                z4 = true;
            }
            jg7Var.e = z4;
        }
        if (this.H0 == null && this.B0 == -1 && !(jg7Var.c == this.F0 && n1() == this.G0)) {
            mVar.a();
            i = 1;
            jg7Var.d = true;
        } else {
            i = 1;
        }
        if (I() > 0 && ((mg7Var = this.H0) == null || mg7Var.Z < i)) {
            if (jg7Var.d) {
                for (int i12 = 0; i12 < i4; i12++) {
                    nVarArr[i12].b();
                    int i13 = jg7Var.b;
                    if (i13 != Integer.MIN_VALUE) {
                        n nVar2 = nVarArr[i12];
                        nVar2.b = i13;
                        nVar2.c = i13;
                    }
                }
            } else if (z7 || jg7Var.f == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    n nVar3 = nVarArr[i14];
                    boolean z10 = this.z0;
                    int i15 = jg7Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = nVar3.f;
                    int iF = z10 ? nVar3.f(Integer.MIN_VALUE) : nVar3.h(Integer.MIN_VALUE);
                    nVar3.b();
                    if (iF != Integer.MIN_VALUE && ((!z10 || iF >= staggeredGridLayoutManager2.t0.i()) && (z10 || iF <= staggeredGridLayoutManager2.t0.m()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            iF += i15;
                        }
                        nVar3.c = iF;
                        nVar3.b = iF;
                    }
                }
                int length = nVarArr.length;
                int[] iArr = jg7Var.f;
                if (iArr == null || iArr.length < length) {
                    jg7Var.f = new int[staggeredGridLayoutManager.s0.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    jg7Var.f[i16] = nVarArr[i16].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    n nVar4 = nVarArr[i17];
                    nVar4.b();
                    int i18 = jg7Var.f[i17];
                    nVar4.b = i18;
                    nVar4.c = i18;
                }
            }
        }
        B(kVar);
        c44 c44Var = this.x0;
        c44Var.a = false;
        td5 td5Var4 = this.u0;
        int iN = td5Var4.n();
        this.w0 = iN / i4;
        View.MeasureSpec.makeMeasureSpec(iN, td5Var4.k());
        y1(jg7Var.a, q96Var);
        if (jg7Var.c) {
            x1(-1);
            c1(kVar, c44Var, q96Var);
            x1(1);
            c44Var.c = jg7Var.a + c44Var.d;
            c1(kVar, c44Var, q96Var);
        } else {
            x1(1);
            c1(kVar, c44Var, q96Var);
            x1(-1);
            c44Var.c = jg7Var.a + c44Var.d;
            c1(kVar, c44Var, q96Var);
        }
        if (td5Var4.k() != 1073741824) {
            int I3 = I();
            float fMax = 0.0f;
            for (int i19 = 0; i19 < I3; i19++) {
                View viewH = H(i19);
                float fE = td5Var4.e(viewH);
                if (fE >= fMax) {
                    ((LayoutParams) viewH.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fE);
                }
            }
            int i20 = this.w0;
            int iRound = Math.round(fMax * i4);
            if (td5Var4.k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, td5Var4.n());
            }
            this.w0 = iRound / i4;
            View.MeasureSpec.makeMeasureSpec(iRound, td5Var4.k());
            if (this.w0 != i20) {
                for (int i21 = 0; i21 < I3; i21++) {
                    View viewH2 = H(i21);
                    LayoutParams layoutParams = (LayoutParams) viewH2.getLayoutParams();
                    layoutParams.getClass();
                    boolean zN1 = n1();
                    int i22 = this.v0;
                    if (zN1 && i22 == 1) {
                        int i23 = -((i4 - 1) - layoutParams.g0.e);
                        viewH2.offsetLeftAndRight((this.w0 * i23) - (i23 * i20));
                    } else {
                        int i24 = layoutParams.g0.e;
                        int i25 = this.w0 * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            viewH2.offsetLeftAndRight(i25 - i26);
                        } else {
                            viewH2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (I() <= 0) {
            z2 = true;
        } else if (this.z0) {
            z2 = true;
            f1(kVar, q96Var, true);
            g1(kVar, q96Var, false);
        } else {
            z2 = true;
            g1(kVar, q96Var, true);
            f1(kVar, q96Var, false);
        }
        if (!z || q96Var.g || this.E0 == 0 || I() <= 0 || m1() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.Y;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.M0);
            }
            if (a1()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (q96Var.g) {
            jg7Var.a();
        }
        this.F0 = jg7Var.c;
        this.G0 = n1();
        if (z3) {
            jg7Var.a();
            p1(kVar, q96Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean q() {
        return this.v0 == 1;
    }

    @Override // androidx.recyclerview.widget.j
    public final void q0(int i, int i2) {
        l1(i, i2, 8);
    }

    public final boolean q1(int i) {
        if (this.v0 == 0) {
            return (i == -1) != this.z0;
        }
        return ((i == -1) == this.z0) == n1();
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean r(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.j
    public final void r0(int i, int i2) {
        l1(i, i2, 2);
    }

    public final void r1(int i, q96 q96Var) {
        int iH1;
        int i2;
        if (i > 0) {
            iH1 = i1();
            i2 = 1;
        } else {
            iH1 = h1();
            i2 = -1;
        }
        c44 c44Var = this.x0;
        c44Var.a = true;
        y1(iH1, q96Var);
        x1(i2);
        c44Var.c = iH1 + c44Var.d;
        c44Var.b = Math.abs(i);
    }

    public final void s1(k kVar, c44 c44Var) {
        if (!c44Var.a || c44Var.i) {
            return;
        }
        int i = c44Var.b;
        int i2 = c44Var.e;
        if (i == 0) {
            if (i2 == -1) {
                t1(c44Var.g, kVar);
                return;
            } else {
                u1(c44Var.f, kVar);
                return;
            }
        }
        int i3 = this.r0;
        n[] nVarArr = this.s0;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = c44Var.f;
            int iH = nVarArr[0].h(i5);
            while (i4 < i3) {
                int iH2 = nVarArr[i4].h(i5);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i4++;
            }
            int i6 = i5 - iH;
            int iMin = c44Var.g;
            if (i6 >= 0) {
                iMin -= Math.min(i6, c44Var.b);
            }
            t1(iMin, kVar);
            return;
        }
        int i7 = c44Var.g;
        int iF = nVarArr[0].f(i7);
        while (i4 < i3) {
            int iF2 = nVarArr[i4].f(i7);
            if (iF2 < iF) {
                iF = iF2;
            }
            i4++;
        }
        int i8 = iF - c44Var.g;
        int iMin2 = c44Var.f;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, c44Var.b);
        }
        u1(iMin2, kVar);
    }

    @Override // androidx.recyclerview.widget.j
    public final void t(int i, int i2, q96 q96Var, xr0 xr0Var) {
        c44 c44Var;
        int iF;
        if (this.v0 != 0) {
            i = i2;
        }
        if (I() == 0 || i == 0) {
            return;
        }
        r1(i, q96Var);
        int[] iArr = this.L0;
        int i3 = this.r0;
        if (iArr == null || iArr.length < i3) {
            this.L0 = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            c44Var = this.x0;
            if (i4 >= i3) {
                break;
            }
            int i6 = c44Var.d;
            n[] nVarArr = this.s0;
            if (i6 == -1) {
                int i7 = c44Var.f;
                iF = i7 - nVarArr[i4].h(i7);
            } else {
                iF = nVarArr[i4].f(c44Var.g) - c44Var.g;
            }
            if (iF >= 0) {
                this.L0[i5] = iF;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.L0, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c44Var.c;
            if (i9 < 0 || i9 >= q96Var.b()) {
                return;
            }
            xr0Var.b(c44Var.c, this.L0[i8]);
            c44Var.c += c44Var.d;
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final void t0(RecyclerView recyclerView, int i, int i2) {
        l1(i, i2, 4);
    }

    public final void t1(int i, k kVar) {
        for (int I = I() - 1; I >= 0; I--) {
            View viewH = H(I);
            td5 td5Var = this.t0;
            if (td5Var.g(viewH) < i || td5Var.q(viewH) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewH.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams.g0.a.size() == 1) {
                return;
            }
            n nVar = layoutParams.g0;
            ArrayList arrayList = nVar.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.g0 = null;
            if (layoutParams2.X.i() || layoutParams2.X.l()) {
                nVar.d -= nVar.f.t0.e(view);
            }
            if (size == 1) {
                nVar.b = Integer.MIN_VALUE;
            }
            nVar.c = Integer.MIN_VALUE;
            G0(viewH, kVar);
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final void u0(k kVar, q96 q96Var) {
        p1(kVar, q96Var, true);
    }

    public final void u1(int i, k kVar) {
        while (I() > 0) {
            View viewH = H(0);
            td5 td5Var = this.t0;
            if (td5Var.d(viewH) > i || td5Var.p(viewH) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewH.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams.g0.a.size() == 1) {
                return;
            }
            n nVar = layoutParams.g0;
            ArrayList arrayList = nVar.a;
            View view = (View) arrayList.remove(0);
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.g0 = null;
            if (arrayList.size() == 0) {
                nVar.c = Integer.MIN_VALUE;
            }
            if (layoutParams2.X.i() || layoutParams2.X.l()) {
                nVar.d -= nVar.f.t0.e(view);
            }
            nVar.b = Integer.MIN_VALUE;
            G0(viewH, kVar);
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final int v(q96 q96Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.K0;
        return yn0.w(q96Var, this.t0, e1(z), d1(z), this, this.K0);
    }

    @Override // androidx.recyclerview.widget.j
    public final void v0(q96 q96Var) {
        this.B0 = -1;
        this.C0 = Integer.MIN_VALUE;
        this.H0 = null;
        this.J0.a();
    }

    public final void v1() {
        if (this.v0 == 1 || !n1()) {
            this.z0 = this.y0;
        } else {
            this.z0 = !this.y0;
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final int w(q96 q96Var) {
        return b1(q96Var);
    }

    public final int w1(int i, q96 q96Var, k kVar) {
        if (I() == 0 || i == 0) {
            return 0;
        }
        r1(i, q96Var);
        c44 c44Var = this.x0;
        int iC1 = c1(kVar, c44Var, q96Var);
        if (c44Var.b >= iC1) {
            i = i < 0 ? -iC1 : iC1;
        }
        this.t0.r(-i);
        this.F0 = this.z0;
        c44Var.b = 0;
        s1(kVar, c44Var);
        return i;
    }

    @Override // androidx.recyclerview.widget.j
    public final int x(q96 q96Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.K0;
        return yn0.y(q96Var, this.t0, e1(z), d1(z), this, this.K0);
    }

    public final void x1(int i) {
        c44 c44Var = this.x0;
        c44Var.e = i;
        c44Var.d = this.z0 != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.j
    public final int y(q96 q96Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.K0;
        return yn0.w(q96Var, this.t0, e1(z), d1(z), this, this.K0);
    }

    @Override // androidx.recyclerview.widget.j
    public final void y0(Parcelable parcelable) {
        if (parcelable instanceof mg7) {
            mg7 mg7Var = (mg7) parcelable;
            this.H0 = mg7Var;
            if (this.B0 != -1) {
                mg7Var.X = -1;
                mg7Var.Y = -1;
                mg7Var.f0 = null;
                mg7Var.Z = 0;
                mg7Var.g0 = 0;
                mg7Var.h0 = null;
                mg7Var.i0 = null;
            }
            K0();
        }
    }

    public final void y1(int i, q96 q96Var) {
        int iN;
        int iN2;
        int i2;
        c44 c44Var = this.x0;
        boolean z = false;
        c44Var.b = 0;
        c44Var.c = i;
        c cVar = this.g0;
        td5 td5Var = this.t0;
        if (cVar == null || !cVar.e || (i2 = q96Var.a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.z0 == (i2 < i)) {
                iN = td5Var.n();
                iN2 = 0;
            } else {
                iN2 = td5Var.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.Y;
        if (recyclerView == null || !recyclerView.m0) {
            c44Var.g = td5Var.h() + iN;
            c44Var.f = -iN2;
        } else {
            c44Var.f = td5Var.m() - iN2;
            c44Var.g = td5Var.i() + iN;
        }
        c44Var.h = false;
        c44Var.a = true;
        if (td5Var.k() == 0 && td5Var.h() == 0) {
            z = true;
        }
        c44Var.i = z;
    }

    @Override // androidx.recyclerview.widget.j
    public final int z(q96 q96Var) {
        return b1(q96Var);
    }

    @Override // androidx.recyclerview.widget.j
    public final Parcelable z0() {
        int iH;
        int iM;
        int[] iArr;
        mg7 mg7Var = this.H0;
        if (mg7Var != null) {
            mg7 mg7Var2 = new mg7();
            mg7Var2.Z = mg7Var.Z;
            mg7Var2.X = mg7Var.X;
            mg7Var2.Y = mg7Var.Y;
            mg7Var2.f0 = mg7Var.f0;
            mg7Var2.g0 = mg7Var.g0;
            mg7Var2.h0 = mg7Var.h0;
            mg7Var2.j0 = mg7Var.j0;
            mg7Var2.k0 = mg7Var.k0;
            mg7Var2.l0 = mg7Var.l0;
            mg7Var2.i0 = mg7Var.i0;
            return mg7Var2;
        }
        mg7 mg7Var3 = new mg7();
        mg7Var3.j0 = this.y0;
        mg7Var3.k0 = this.F0;
        mg7Var3.l0 = this.G0;
        m mVar = this.D0;
        if (mVar == null || (iArr = mVar.a) == null) {
            mg7Var3.g0 = 0;
        } else {
            mg7Var3.h0 = iArr;
            mg7Var3.g0 = iArr.length;
            mg7Var3.i0 = mVar.b;
        }
        if (I() <= 0) {
            mg7Var3.X = -1;
            mg7Var3.Y = -1;
            mg7Var3.Z = 0;
            return mg7Var3;
        }
        mg7Var3.X = this.F0 ? i1() : h1();
        View viewD1 = this.z0 ? d1(true) : e1(true);
        mg7Var3.Y = viewD1 != null ? j.T(viewD1) : -1;
        int i = this.r0;
        mg7Var3.Z = i;
        mg7Var3.f0 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.F0;
            td5 td5Var = this.t0;
            n[] nVarArr = this.s0;
            if (z) {
                iH = nVarArr[i2].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = td5Var.i();
                    iH -= iM;
                }
            } else {
                iH = nVarArr[i2].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = td5Var.m();
                    iH -= iM;
                }
            }
            mg7Var3.f0[i2] = iH;
        }
        return mg7Var3;
    }

    public final void z1(n nVar, int i, int i2) {
        int i3 = nVar.d;
        int i4 = nVar.e;
        BitSet bitSet = this.A0;
        if (i != -1) {
            int i5 = nVar.c;
            if (i5 == Integer.MIN_VALUE) {
                nVar.a();
                i5 = nVar.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = nVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) nVar.a.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            nVar.b = nVar.f.t0.g(view);
            layoutParams.getClass();
            i6 = nVar.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }
}
