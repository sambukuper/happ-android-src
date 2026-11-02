package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.k;
import defpackage.b8;
import defpackage.e96;
import defpackage.o96;
import defpackage.q96;
import defpackage.td2;
import defpackage.td5;
import defpackage.ud2;
import defpackage.vd2;
import defpackage.xd2;
import defpackage.y5;
import defpackage.yd2;
import defpackage.zd2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayoutManager extends j implements td2, o96 {
    public static final Rect P0 = new Rect();
    public q96 A0;
    public yd2 B0;
    public final xd2 C0;
    public td5 D0;
    public td5 E0;
    public zd2 F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public final SparseArray K0;
    public final Context L0;
    public View M0;
    public int N0;
    public final b8 O0;
    public byte r0;
    public final boolean s0;
    public final byte t0;
    public boolean v0;
    public boolean w0;
    public k z0;
    public final int u0 = -1;
    public List x0 = new ArrayList();
    public final y5 y0 = new y5(this);

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class LayoutParams extends RecyclerView.LayoutParams implements ud2 {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new b();
        public float g0;
        public float h0;
        public int i0;
        public float j0;
        public int k0;
        public int l0;
        public int m0;
        public int n0;
        public boolean o0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.g0 = 0.0f;
            this.h0 = 1.0f;
            this.i0 = -1;
            this.j0 = -1.0f;
            this.m0 = 16777215;
            this.n0 = 16777215;
        }

        @Override // defpackage.ud2
        public final int A() {
            return this.m0;
        }

        @Override // defpackage.ud2
        public final int a() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // defpackage.ud2
        public final int b() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // defpackage.ud2
        public final int f() {
            return this.i0;
        }

        @Override // defpackage.ud2
        public final int getOrder() {
            return 1;
        }

        @Override // defpackage.ud2
        public final float h() {
            return this.h0;
        }

        @Override // defpackage.ud2
        public final int i() {
            return this.k0;
        }

        @Override // defpackage.ud2
        public final void j(int i) {
            this.k0 = i;
        }

        @Override // defpackage.ud2
        public final int n() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // defpackage.ud2
        public final int o() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // defpackage.ud2
        public final int q() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // defpackage.ud2
        public final void r(int i) {
            this.l0 = i;
        }

        @Override // defpackage.ud2
        public final float s() {
            return this.g0;
        }

        @Override // defpackage.ud2
        public final float t() {
            return this.j0;
        }

        @Override // defpackage.ud2
        public final int v() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // defpackage.ud2
        public final int w() {
            return this.l0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.g0);
            parcel.writeFloat(this.h0);
            parcel.writeInt(this.i0);
            parcel.writeFloat(this.j0);
            parcel.writeInt(this.k0);
            parcel.writeInt(this.l0);
            parcel.writeInt(this.m0);
            parcel.writeInt(this.n0);
            parcel.writeByte(this.o0 ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // defpackage.ud2
        public final boolean x() {
            return this.o0;
        }

        @Override // defpackage.ud2
        public final int z() {
            return this.n0;
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        xd2 xd2Var = new xd2(this);
        this.C0 = xd2Var;
        this.G0 = -1;
        this.H0 = Integer.MIN_VALUE;
        this.I0 = Integer.MIN_VALUE;
        this.J0 = Integer.MIN_VALUE;
        this.K0 = new SparseArray();
        this.N0 = -1;
        this.O0 = new b8((byte) 2);
        e96 e96VarU = j.U(context, attributeSet, i, i2);
        int i3 = e96VarU.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (e96VarU.c) {
                    q1(3);
                } else {
                    q1(2);
                }
            }
        } else if (e96VarU.c) {
            q1(1);
        } else {
            q1(0);
        }
        boolean z = this.s0;
        if (!z) {
            if (!z) {
                D0();
                this.x0.clear();
                xd2Var.b();
                xd2Var.d = 0;
            }
            this.s0 = true;
            this.D0 = null;
            this.E0 = null;
            K0();
        }
        if (this.t0 != 4) {
            D0();
            this.x0.clear();
            xd2Var.b();
            xd2Var.d = 0;
            this.t0 = (byte) 4;
            K0();
        }
        this.L0 = context;
    }

    public static boolean a0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.j
    public final int A(q96 q96Var) {
        return c1(q96Var);
    }

    @Override // androidx.recyclerview.widget.j
    public final RecyclerView.LayoutParams E() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.g0 = 0.0f;
        layoutParams.h0 = 1.0f;
        layoutParams.i0 = -1;
        layoutParams.j0 = -1.0f;
        layoutParams.m0 = 16777215;
        layoutParams.n0 = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.j
    public final RecyclerView.LayoutParams F(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.j
    public final int M0(int i, q96 q96Var, k kVar) {
        if (!j() || !this.s0) {
            int iN1 = n1(i, q96Var, kVar);
            this.K0.clear();
            return iN1;
        }
        int iO1 = o1(i);
        this.C0.d += iO1;
        this.E0.r(-iO1);
        return iO1;
    }

    @Override // androidx.recyclerview.widget.j
    public final void N0(int i) {
        this.G0 = i;
        this.H0 = Integer.MIN_VALUE;
        zd2 zd2Var = this.F0;
        if (zd2Var != null) {
            zd2Var.X = -1;
        }
        K0();
    }

    @Override // androidx.recyclerview.widget.j
    public final int O0(int i, q96 q96Var, k kVar) {
        if (j() || !(this.s0 || j())) {
            int iN1 = n1(i, q96Var, kVar);
            this.K0.clear();
            return iN1;
        }
        int iO1 = o1(i);
        this.C0.d += iO1;
        this.E0.r(-iO1);
        return iO1;
    }

    @Override // androidx.recyclerview.widget.j
    public final void X0(RecyclerView recyclerView, int i) {
        c cVar = new c(recyclerView.getContext());
        cVar.a = i;
        Y0(cVar);
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean Y() {
        return true;
    }

    @Override // defpackage.o96
    public final PointF a(int i) {
        View viewH;
        if (I() == 0 || (viewH = H(0)) == null) {
            return null;
        }
        int i2 = i < j.T(viewH) ? -1 : 1;
        return j() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    public final int a1(q96 q96Var) {
        if (I() == 0) {
            return 0;
        }
        int iB = q96Var.b();
        d1();
        View viewF1 = f1(iB);
        View viewH1 = h1(iB);
        if (q96Var.b() == 0 || viewF1 == null || viewH1 == null) {
            return 0;
        }
        return Math.min(this.D0.n(), this.D0.d(viewH1) - this.D0.g(viewF1));
    }

    @Override // defpackage.td2
    public final View b(int i) {
        return e(i);
    }

    public final int b1(q96 q96Var) {
        if (I() == 0) {
            return 0;
        }
        int iB = q96Var.b();
        View viewF1 = f1(iB);
        View viewH1 = h1(iB);
        if (q96Var.b() == 0 || viewF1 == null || viewH1 == null) {
            return 0;
        }
        int iT = j.T(viewF1);
        int iT2 = j.T(viewH1);
        int iAbs = Math.abs(this.D0.d(viewH1) - this.D0.g(viewF1));
        int[] iArr = (int[]) this.y0.g0;
        int i = iArr[iT];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((iArr[iT2] - i) + 1))) + (this.D0.m() - this.D0.g(viewF1)));
    }

    @Override // defpackage.td2
    public final int c(int i, int i2, int i3) {
        return j.J(this.p0, p(), this.n0, i2, i3);
    }

    public final int c1(q96 q96Var) {
        if (I() != 0) {
            int iB = q96Var.b();
            View viewF1 = f1(iB);
            View viewH1 = h1(iB);
            if (q96Var.b() != 0 && viewF1 != null && viewH1 != null) {
                View viewJ1 = j1(0, I());
                int iT = viewJ1 == null ? -1 : j.T(viewJ1);
                View viewJ2 = j1(I() - 1, -1);
                return (int) ((Math.abs(this.D0.d(viewH1) - this.D0.g(viewF1)) / (((viewJ2 != null ? j.T(viewJ2) : -1) - iT) + 1)) * q96Var.b());
            }
        }
        return 0;
    }

    @Override // defpackage.td2
    public final void d(View view, int i, int i2, vd2 vd2Var) {
        o(view, P0);
        if (j()) {
            int i3 = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.left + ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.right;
            vd2Var.e += i3;
            vd2Var.f += i3;
        } else {
            int i4 = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.top + ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.bottom;
            vd2Var.e += i4;
            vd2Var.f += i4;
        }
    }

    public final void d1() {
        if (this.D0 != null) {
            return;
        }
        boolean zJ = j();
        boolean z = this.s0;
        if (zJ) {
            if (z) {
                this.D0 = new e(this);
                this.E0 = new d(this);
                return;
            } else {
                this.D0 = new d(this);
                this.E0 = new e(this);
                return;
            }
        }
        if (z) {
            this.D0 = new d(this);
            this.E0 = new e(this);
        } else {
            this.D0 = new e(this);
            this.E0 = new d(this);
        }
    }

    @Override // defpackage.td2
    public final View e(int i) {
        View view = (View) this.K0.get(i);
        return view != null ? view : this.z0.d(i);
    }

    @Override // androidx.recyclerview.widget.j
    public final void e0(f fVar) {
        D0();
    }

    public final int e1(k kVar, q96 q96Var, yd2 yd2Var) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        Rect rect;
        int i6;
        Rect rect2;
        int i7;
        Rect rect3;
        int i8 = yd2Var.f;
        if (i8 != Integer.MIN_VALUE) {
            int i9 = yd2Var.a;
            if (i9 < 0) {
                yd2Var.f = i8 + i9;
            }
            p1(kVar, yd2Var);
        }
        int i10 = yd2Var.a;
        boolean zJ = j();
        int i11 = i10;
        int i12 = 0;
        while (true) {
            if (i11 <= 0 && !this.B0.b) {
                break;
            }
            List list = this.x0;
            int i13 = yd2Var.d;
            if (i13 < 0 || i13 >= q96Var.b() || (i = yd2Var.c) < 0 || i >= list.size()) {
                break;
            }
            vd2 vd2Var = (vd2) this.x0.get(yd2Var.c);
            yd2Var.d = vd2Var.o;
            boolean zJ2 = j();
            xd2 xd2Var = this.C0;
            Rect rect4 = P0;
            y5 y5Var = this.y0;
            if (zJ2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i14 = this.p0;
                int i15 = yd2Var.e;
                if (yd2Var.h == -1) {
                    i15 -= vd2Var.g;
                }
                int i16 = i15;
                int i17 = yd2Var.d;
                float f = xd2Var.d;
                float f2 = paddingLeft - f;
                float measuredWidth = (i14 - paddingRight) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i18 = vd2Var.h;
                int i19 = i17;
                int i20 = 0;
                while (i19 < i17 + i18) {
                    int i21 = i17;
                    View viewE = e(i19);
                    if (viewE == null) {
                        i19 = i19;
                        rect3 = rect4;
                    } else {
                        if (yd2Var.h == 1) {
                            o(viewE, rect4);
                            l(viewE);
                        } else {
                            o(viewE, rect4);
                            m(viewE, i20, false);
                            i20++;
                        }
                        int i22 = i20;
                        float f3 = measuredWidth;
                        long j = ((long[]) y5Var.f0)[i19];
                        int i23 = (int) j;
                        int i24 = (int) (j >> 32);
                        LayoutParams layoutParams = (LayoutParams) viewE.getLayoutParams();
                        if (r1(viewE, i23, i24, layoutParams)) {
                            viewE.measure(i23, i24);
                        }
                        float f4 = f2 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((RecyclerView.LayoutParams) viewE.getLayoutParams()).Y.left;
                        float f5 = f3 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((RecyclerView.LayoutParams) viewE.getLayoutParams()).Y.right);
                        int i25 = i16 + ((RecyclerView.LayoutParams) viewE.getLayoutParams()).Y.top;
                        boolean z2 = this.v0;
                        y5 y5Var2 = this.y0;
                        if (z2) {
                            rect3 = rect4;
                            y5Var2.S(viewE, vd2Var, Math.round(f5) - viewE.getMeasuredWidth(), i25, Math.round(f5), viewE.getMeasuredHeight() + i25);
                        } else {
                            rect3 = rect4;
                            y5Var2.S(viewE, vd2Var, Math.round(f4), i25, viewE.getMeasuredWidth() + Math.round(f4), viewE.getMeasuredHeight() + i25);
                        }
                        float measuredWidth2 = viewE.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((RecyclerView.LayoutParams) viewE.getLayoutParams()).Y.right + fMax + f4;
                        measuredWidth = f5 - (((viewE.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((RecyclerView.LayoutParams) viewE.getLayoutParams()).Y.left) + fMax);
                        f2 = measuredWidth2;
                        i20 = i22;
                    }
                    i19++;
                    zJ = zJ;
                    i18 = i18;
                    i17 = i21;
                    rect4 = rect3;
                }
                z = zJ;
                yd2Var.c += this.B0.h;
                i5 = vd2Var.g;
                i4 = i11;
            } else {
                z = zJ;
                Rect rect5 = rect4;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i26 = this.q0;
                int i27 = yd2Var.e;
                if (yd2Var.h == -1) {
                    int i28 = vd2Var.g;
                    i3 = i27 + i28;
                    i2 = i27 - i28;
                } else {
                    i2 = i27;
                    i3 = i2;
                }
                int i29 = yd2Var.d;
                float f6 = i26 - paddingBottom;
                float f7 = xd2Var.d;
                float f8 = paddingTop - f7;
                float f9 = f6 - f7;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i30 = vd2Var.h;
                float measuredHeight = f9;
                int i31 = i29;
                float f10 = f8;
                int i32 = 0;
                while (i31 < i29 + i30) {
                    int i33 = i29;
                    View viewE2 = e(i31);
                    if (viewE2 == null) {
                        i6 = i33;
                        rect2 = rect5;
                        i7 = i31;
                    } else {
                        float f11 = f10;
                        long j2 = ((long[]) y5Var.f0)[i31];
                        int i34 = (int) j2;
                        int i35 = (int) (j2 >> 32);
                        LayoutParams layoutParams2 = (LayoutParams) viewE2.getLayoutParams();
                        if (r1(viewE2, i34, i35, layoutParams2)) {
                            viewE2.measure(i34, i35);
                        }
                        float f12 = f11 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((RecyclerView.LayoutParams) viewE2.getLayoutParams()).Y.top;
                        float f13 = measuredHeight - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + ((RecyclerView.LayoutParams) viewE2.getLayoutParams()).Y.bottom);
                        if (yd2Var.h == 1) {
                            rect = rect5;
                            o(viewE2, rect);
                            l(viewE2);
                        } else {
                            rect = rect5;
                            o(viewE2, rect);
                            m(viewE2, i32, false);
                            i32++;
                        }
                        int i36 = i2 + ((RecyclerView.LayoutParams) viewE2.getLayoutParams()).Y.left;
                        int i37 = i3 - ((RecyclerView.LayoutParams) viewE2.getLayoutParams()).Y.right;
                        Rect rect6 = rect;
                        boolean z3 = this.v0;
                        boolean z4 = this.w0;
                        y5 y5Var3 = this.y0;
                        if (!z3) {
                            i6 = i33;
                            rect2 = rect6;
                            i7 = i31;
                            if (z4) {
                                y5Var3.T(viewE2, vd2Var, z3, i36, Math.round(f13) - viewE2.getMeasuredHeight(), viewE2.getMeasuredWidth() + i36, Math.round(f13));
                            } else {
                                y5Var3.T(viewE2, vd2Var, z3, i36, Math.round(f12), viewE2.getMeasuredWidth() + i36, viewE2.getMeasuredHeight() + Math.round(f12));
                            }
                        } else if (z4) {
                            i6 = i33;
                            rect2 = rect6;
                            i7 = i31;
                            y5Var3.T(viewE2, vd2Var, z3, i37 - viewE2.getMeasuredWidth(), Math.round(f13) - viewE2.getMeasuredHeight(), i37, Math.round(f13));
                        } else {
                            i6 = i33;
                            rect2 = rect6;
                            i7 = i31;
                            y5Var3.T(viewE2, vd2Var, z3, i37 - viewE2.getMeasuredWidth(), Math.round(f12), i37, viewE2.getMeasuredHeight() + Math.round(f12));
                        }
                        float measuredHeight2 = viewE2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((RecyclerView.LayoutParams) viewE2.getLayoutParams()).Y.bottom + fMax2 + f12;
                        measuredHeight = f13 - (((viewE2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) + ((RecyclerView.LayoutParams) viewE2.getLayoutParams()).Y.top) + fMax2);
                        f10 = measuredHeight2;
                    }
                    i31 = i7 + 1;
                    i11 = i11;
                    i30 = i30;
                    i29 = i6;
                    rect5 = rect2;
                }
                i4 = i11;
                yd2Var.c += this.B0.h;
                i5 = vd2Var.g;
            }
            int i38 = i5;
            i12 += i5;
            if (z || !this.v0) {
                yd2Var.e += yd2Var.h * i38;
            } else {
                yd2Var.e -= yd2Var.h * i38;
            }
            i11 = i4 - i38;
            i10 = i10;
            zJ = z;
        }
        int i39 = i10;
        int i40 = yd2Var.a - i12;
        yd2Var.a = i40;
        int i41 = yd2Var.f;
        if (i41 != Integer.MIN_VALUE) {
            int i42 = i41 + i12;
            yd2Var.f = i42;
            if (i40 < 0) {
                yd2Var.f = i42 + i40;
            }
            p1(kVar, yd2Var);
        }
        return i39 - yd2Var.a;
    }

    @Override // defpackage.td2
    public final int f(View view, int i, int i2) {
        int i3;
        int i4;
        if (j()) {
            i3 = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.left;
            i4 = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.right;
        } else {
            i3 = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.top;
            i4 = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.bottom;
        }
        return i3 + i4;
    }

    public final View f1(int i) {
        View viewK1 = k1(0, I(), i);
        if (viewK1 == null) {
            return null;
        }
        int i2 = ((int[]) this.y0.g0)[j.T(viewK1)];
        if (i2 == -1) {
            return null;
        }
        return g1(viewK1, (vd2) this.x0.get(i2));
    }

    @Override // defpackage.td2
    public final int g(int i, int i2, int i3) {
        return j.J(this.q0, q(), this.o0, i2, i3);
    }

    @Override // androidx.recyclerview.widget.j
    public final void g0(RecyclerView recyclerView) {
        this.M0 = (View) recyclerView.getParent();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View g1(View view, vd2 vd2Var) {
        boolean zJ = j();
        int i = vd2Var.h;
        for (int i2 = 1; i2 < i; i2++) {
            View viewH = H(i2);
            if (viewH != null && viewH.getVisibility() != 8) {
                if (!this.v0 || zJ) {
                    if (this.D0.g(view) > this.D0.g(viewH)) {
                        view = viewH;
                    }
                } else if (this.D0.d(view) < this.D0.d(viewH)) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    @Override // defpackage.td2
    public final int getAlignContent() {
        return 5;
    }

    @Override // defpackage.td2
    public final int getAlignItems() {
        return this.t0;
    }

    @Override // defpackage.td2
    public final int getFlexDirection() {
        return this.r0;
    }

    @Override // defpackage.td2
    public final int getFlexItemCount() {
        return this.A0.b();
    }

    @Override // defpackage.td2
    public final List getFlexLinesInternal() {
        return this.x0;
    }

    @Override // defpackage.td2
    public final int getFlexWrap() {
        return this.s0 ? 1 : 0;
    }

    @Override // defpackage.td2
    public final int getLargestMainSize() {
        if (this.x0.size() == 0) {
            return 0;
        }
        int size = this.x0.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((vd2) this.x0.get(i)).e);
        }
        return iMax;
    }

    @Override // defpackage.td2
    public final int getMaxLine() {
        return this.u0;
    }

    @Override // defpackage.td2
    public final int getSumOfCrossSize() {
        int size = this.x0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((vd2) this.x0.get(i2)).g;
        }
        return i;
    }

    public final View h1(int i) {
        View viewK1 = k1(I() - 1, -1, i);
        if (viewK1 == null) {
            return null;
        }
        return i1(viewK1, (vd2) this.x0.get(((int[]) this.y0.g0)[j.T(viewK1)]));
    }

    @Override // defpackage.td2
    public final void i(View view, int i) {
        this.K0.put(i, view);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View i1(View view, vd2 vd2Var) {
        boolean zJ = j();
        int I = (I() - vd2Var.h) - 1;
        for (int I2 = I() - 2; I2 > I; I2--) {
            View viewH = H(I2);
            if (viewH != null && viewH.getVisibility() != 8) {
                if (!this.v0 || zJ) {
                    if (this.D0.d(view) < this.D0.d(viewH)) {
                        view = viewH;
                    }
                } else if (this.D0.g(view) > this.D0.g(viewH)) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    @Override // defpackage.td2
    public final boolean j() {
        byte b = this.r0;
        return b == 0 || b == 1;
    }

    public final View j1(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewH = H(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.p0 - getPaddingRight();
            int paddingBottom = this.q0 - getPaddingBottom();
            int iN = N(viewH) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewH.getLayoutParams())).leftMargin;
            int iR = R(viewH) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewH.getLayoutParams())).topMargin;
            int iQ = Q(viewH) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewH.getLayoutParams())).rightMargin;
            int iL = L(viewH) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewH.getLayoutParams())).bottomMargin;
            boolean z = iN >= paddingRight || iQ >= paddingLeft;
            boolean z2 = iR >= paddingBottom || iL >= paddingTop;
            if (z && z2) {
                return viewH;
            }
            i += i3;
        }
        return null;
    }

    @Override // defpackage.td2
    public final int k(View view) {
        int i;
        int i2;
        if (j()) {
            i = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.top;
            i2 = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.bottom;
        } else {
            i = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.left;
            i2 = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.right;
        }
        return i + i2;
    }

    public final View k1(int i, int i2, int i3) {
        int iT;
        d1();
        if (this.B0 == null) {
            yd2 yd2Var = new yd2();
            yd2Var.h = 1;
            this.B0 = yd2Var;
        }
        int iM = this.D0.m();
        int i4 = this.D0.i();
        int i5 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewH = H(i);
            if (viewH != null && (iT = j.T(viewH)) >= 0 && iT < i3) {
                if (((RecyclerView.LayoutParams) viewH.getLayoutParams()).X.i()) {
                    if (view2 == null) {
                        view2 = viewH;
                    }
                } else {
                    if (this.D0.g(viewH) >= iM && this.D0.d(viewH) <= i4) {
                        return viewH;
                    }
                    if (view == null) {
                        view = viewH;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    public final int l1(int i, k kVar, q96 q96Var, boolean z) {
        int iN1;
        int i2;
        if (j() || !this.v0) {
            int i3 = this.D0.i() - i;
            if (i3 <= 0) {
                return 0;
            }
            iN1 = -n1(-i3, q96Var, kVar);
        } else {
            int iM = i - this.D0.m();
            if (iM <= 0) {
                return 0;
            }
            iN1 = n1(iM, q96Var, kVar);
        }
        int i4 = i + iN1;
        if (!z || (i2 = this.D0.i() - i4) <= 0) {
            return iN1;
        }
        this.D0.r(i2);
        return i2 + iN1;
    }

    public final int m1(int i, k kVar, q96 q96Var, boolean z) {
        int iN1;
        int iM;
        if (j() || !this.v0) {
            int iM2 = i - this.D0.m();
            if (iM2 <= 0) {
                return 0;
            }
            iN1 = -n1(iM2, q96Var, kVar);
        } else {
            int i2 = this.D0.i() - i;
            if (i2 <= 0) {
                return 0;
            }
            iN1 = n1(-i2, q96Var, kVar);
        }
        int i3 = i + iN1;
        if (!z || (iM = i3 - this.D0.m()) <= 0) {
            return iN1;
        }
        this.D0.r(-iM);
        return iN1 - iM;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01ed  */
    public final int n1(int i, q96 q96Var, k kVar) {
        int i2;
        if (I() != 0 && i != 0) {
            d1();
            this.B0.i = true;
            boolean z = !j() && this.v0;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int iAbs = Math.abs(i);
            this.B0.h = i3;
            boolean zJ = j();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.p0, this.n0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.q0, this.o0);
            boolean z2 = !zJ && this.v0;
            y5 y5Var = this.y0;
            if (i3 == 1) {
                View viewH = H(I() - 1);
                if (viewH != null) {
                    this.B0.e = this.D0.d(viewH);
                    int iT = j.T(viewH);
                    View viewI1 = i1(viewH, (vd2) this.x0.get(((int[]) y5Var.g0)[iT]));
                    yd2 yd2Var = this.B0;
                    yd2Var.getClass();
                    int i4 = iT + 1;
                    yd2Var.d = i4;
                    int[] iArr = (int[]) y5Var.g0;
                    if (iArr.length <= i4) {
                        yd2Var.c = -1;
                    } else {
                        yd2Var.c = iArr[i4];
                    }
                    td5 td5Var = this.D0;
                    if (z2) {
                        yd2Var.e = td5Var.g(viewI1);
                        this.B0.f = this.D0.m() + (-this.D0.g(viewI1));
                        yd2 yd2Var2 = this.B0;
                        yd2Var2.f = Math.max(yd2Var2.f, 0);
                    } else {
                        yd2Var.e = td5Var.d(viewI1);
                        this.B0.f = this.D0.d(viewI1) - this.D0.i();
                    }
                    int i5 = this.B0.c;
                    if ((i5 == -1 || i5 > this.x0.size() - 1) && this.B0.d <= this.A0.b()) {
                        yd2 yd2Var3 = this.B0;
                        int i6 = iAbs - yd2Var3.f;
                        b8 b8Var = this.O0;
                        b8Var.c = null;
                        b8Var.b = 0;
                        if (i6 > 0) {
                            y5 y5Var2 = this.y0;
                            if (zJ) {
                                y5Var2.v(b8Var, iMakeMeasureSpec, iMakeMeasureSpec2, i6, yd2Var3.d, -1, this.x0);
                            } else {
                                y5Var2.v(b8Var, iMakeMeasureSpec2, iMakeMeasureSpec, i6, yd2Var3.d, -1, this.x0);
                                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                                iMakeMeasureSpec = iMakeMeasureSpec;
                            }
                            y5Var.E(iMakeMeasureSpec, iMakeMeasureSpec2, this.B0.d);
                            y5Var.f0(this.B0.d);
                        }
                    }
                    yd2 yd2Var4 = this.B0;
                    yd2Var4.a = iAbs - yd2Var4.f;
                }
            } else {
                View viewH2 = H(0);
                if (viewH2 != null) {
                    this.B0.e = this.D0.g(viewH2);
                    int iT2 = j.T(viewH2);
                    View viewG1 = g1(viewH2, (vd2) this.x0.get(((int[]) y5Var.g0)[iT2]));
                    yd2 yd2Var5 = this.B0;
                    yd2Var5.getClass();
                    int i7 = ((int[]) y5Var.g0)[iT2];
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        vd2 vd2Var = (vd2) this.x0.get(i7 - 1);
                        yd2Var5 = this.B0;
                        yd2Var5.d = iT2 - vd2Var.h;
                    } else {
                        yd2Var5.d = -1;
                    }
                    yd2Var5.c = i7 > 0 ? i7 - 1 : 0;
                    td5 td5Var2 = this.D0;
                    if (z2) {
                        yd2Var5.e = td5Var2.d(viewG1);
                        this.B0.f = this.D0.d(viewG1) - this.D0.i();
                        yd2 yd2Var6 = this.B0;
                        yd2Var6.f = Math.max(yd2Var6.f, 0);
                    } else {
                        yd2Var5.e = td5Var2.g(viewG1);
                        this.B0.f = this.D0.m() + (-this.D0.g(viewG1));
                    }
                    yd2 yd2Var7 = this.B0;
                    yd2Var7.a = iAbs - yd2Var7.f;
                }
            }
            yd2 yd2Var8 = this.B0;
            int iE1 = e1(kVar, q96Var, yd2Var8) + yd2Var8.f;
            if (iE1 >= 0) {
                if (z) {
                    if (iAbs > iE1) {
                        i2 = (-i3) * iE1;
                    } else {
                        i2 = i;
                    }
                } else if (iAbs > iE1) {
                    i2 = i3 * iE1;
                } else {
                    i2 = i;
                }
                this.D0.r(-i2);
                this.B0.g = i2;
                return i2;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final void o0(int i, int i2) {
        s1(i);
    }

    public final int o1(int i) {
        if (I() == 0 || i == 0) {
            return 0;
        }
        d1();
        boolean zJ = j();
        View view = this.M0;
        int width = zJ ? view.getWidth() : view.getHeight();
        int i2 = zJ ? this.p0 : this.q0;
        int layoutDirection = this.Y.getLayoutDirection();
        xd2 xd2Var = this.C0;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + xd2Var.d) - width, iAbs);
            }
            int i3 = xd2Var.d;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - xd2Var.d) - width, i);
            }
            int i4 = xd2Var.d;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean p() {
        if (!this.s0) {
            return j();
        }
        if (!j()) {
            return true;
        }
        int i = this.p0;
        View view = this.M0;
        return i > (view != null ? view.getWidth() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0108 A[EDGE_INSN: B:86:0x0108->B:93:? BREAK  A[LOOP:2: B:52:0x00b7->B:71:0x0104], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0104 A[SYNTHETIC] */
    public final void p1(k kVar, yd2 yd2Var) {
        int I;
        int i;
        int I2;
        int i2;
        View viewH;
        int i3;
        if (yd2Var.i) {
            int i4 = yd2Var.h;
            int i5 = yd2Var.f;
            y5 y5Var = this.y0;
            int i6 = -1;
            if (i4 == -1) {
                if (i5 < 0 || (I2 = I()) == 0 || (viewH = H((i2 = I2 - 1))) == null || (i3 = ((int[]) y5Var.g0)[j.T(viewH)]) == -1) {
                    return;
                }
                vd2 vd2Var = (vd2) this.x0.get(i3);
                for (int i7 = i2; i7 >= 0; i7--) {
                    View viewH2 = H(i7);
                    if (viewH2 != null) {
                        int i8 = yd2Var.f;
                        if (!j() && this.v0) {
                            if (this.D0.d(viewH2) > i8) {
                                break;
                            }
                            if (vd2Var.o != j.T(viewH2)) {
                                continue;
                            } else if (i3 <= 0) {
                                I2 = i7;
                                break;
                            } else {
                                i3 += yd2Var.h;
                                vd2Var = (vd2) this.x0.get(i3);
                                I2 = i7;
                            }
                        } else {
                            if (this.D0.g(viewH2) < this.D0.h() - i8) {
                                break;
                            }
                            if (vd2Var.o != j.T(viewH2)) {
                                continue;
                            } else if (i3 <= 0) {
                                I2 = i7;
                                break;
                            } else {
                                i3 += yd2Var.h;
                                vd2Var = (vd2) this.x0.get(i3);
                                I2 = i7;
                            }
                        }
                    }
                }
                while (i2 >= I2) {
                    H0(i2, kVar);
                    i2--;
                }
                return;
            }
            if (i5 >= 0 && (I = I()) != 0) {
                int i9 = 0;
                View viewH3 = H(0);
                if (viewH3 == null || (i = ((int[]) y5Var.g0)[j.T(viewH3)]) == -1) {
                    return;
                }
                vd2 vd2Var2 = (vd2) this.x0.get(i);
                while (true) {
                    if (i9 < I) {
                        View viewH4 = H(i9);
                        if (viewH4 != null) {
                            int i10 = yd2Var.f;
                            if (j() || !this.v0) {
                                if (this.D0.d(viewH4) <= i10) {
                                    if (vd2Var2.p != j.T(viewH4)) {
                                        continue;
                                    } else {
                                        if (i >= this.x0.size() - 1) {
                                            break;
                                        }
                                        i += yd2Var.h;
                                        vd2Var2 = (vd2) this.x0.get(i);
                                        i6 = i9;
                                    }
                                }
                            } else if (this.D0.h() - this.D0.g(viewH4) <= i10) {
                                if (vd2Var2.p != j.T(viewH4)) {
                                    continue;
                                } else if (i >= this.x0.size() - 1) {
                                    break;
                                    break;
                                } else {
                                    i += yd2Var.h;
                                    vd2Var2 = (vd2) this.x0.get(i);
                                    i6 = i9;
                                }
                            }
                        }
                        i9++;
                    }
                    i9 = i6;
                    break;
                }
                while (i9 >= 0) {
                    H0(i9, kVar);
                    i9--;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean q() {
        if (!this.s0) {
            return !j();
        }
        if (!j()) {
            int i = this.q0;
            View view = this.M0;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.j
    public final void q0(int i, int i2) {
        s1(Math.min(i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q1(int i) {
        if (this.r0 != i) {
            D0();
            this.r0 = i;
            this.D0 = null;
            this.E0 = null;
            this.x0.clear();
            xd2 xd2Var = this.C0;
            xd2Var.b();
            xd2Var.d = 0;
            K0();
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean r(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.j
    public final void r0(int i, int i2) {
        s1(i);
    }

    public final boolean r1(View view, int i, int i2, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.j0 && a0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && a0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.j
    public final void s0(int i, int i2) {
        s1(i);
    }

    public final void s1(int i) {
        View viewJ1 = j1(I() - 1, -1);
        if (i >= (viewJ1 != null ? j.T(viewJ1) : -1)) {
            return;
        }
        int I = I();
        y5 y5Var = this.y0;
        y5Var.G(I);
        y5Var.H(I);
        y5Var.F(I);
        if (i >= ((int[]) y5Var.g0).length) {
            return;
        }
        this.N0 = i;
        View viewH = H(0);
        if (viewH == null) {
            return;
        }
        this.G0 = j.T(viewH);
        if (j() || !this.v0) {
            this.H0 = this.D0.g(viewH) - this.D0.m();
        } else {
            this.H0 = this.D0.j() + this.D0.d(viewH);
        }
    }

    @Override // defpackage.td2
    public final void setFlexLines(List list) {
        this.x0 = list;
    }

    @Override // androidx.recyclerview.widget.j
    public final void t0(RecyclerView recyclerView, int i, int i2) {
        s1(i);
        s1(i);
    }

    public final void t1(xd2 xd2Var, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = j() ? this.o0 : this.n0;
            this.B0.b = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.B0.b = false;
        }
        if (j() || !this.v0) {
            this.B0.a = this.D0.i() - xd2Var.c;
        } else {
            this.B0.a = xd2Var.c - getPaddingRight();
        }
        yd2 yd2Var = this.B0;
        yd2Var.d = xd2Var.a;
        yd2Var.h = 1;
        yd2Var.e = xd2Var.c;
        yd2Var.f = Integer.MIN_VALUE;
        yd2Var.c = xd2Var.b;
        if (!z || this.x0.size() <= 1 || (i = xd2Var.b) < 0 || i >= this.x0.size() - 1) {
            return;
        }
        vd2 vd2Var = (vd2) this.x0.get(xd2Var.b);
        yd2 yd2Var2 = this.B0;
        yd2Var2.c++;
        yd2Var2.d += vd2Var.h;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0175  */
    /* JADX WARN: Code duplicated, block: B:106:0x018c  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:135:0x020f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0215  */
    /* JADX WARN: Code duplicated, block: B:142:0x0222  */
    /* JADX WARN: Code duplicated, block: B:144:0x0231  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x011a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x0131  */
    /* JADX WARN: Code duplicated, block: B:86:0x013d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0143  */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0157  */
    /* JADX WARN: Code duplicated, block: B:97:0x016b  */
    /* JADX WARN: Code duplicated, block: B:98:0x016d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.j
    public final void u0(k kVar, q96 q96Var) {
        View viewF1;
        FlexboxLayoutManager flexboxLayoutManager;
        td5 td5Var;
        int iT;
        int i;
        int size;
        int i2;
        int i3;
        View viewD;
        View viewH;
        boolean z;
        int iG;
        td5 td5Var2;
        boolean z2;
        td5 td5Var3;
        int iG2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        this.z0 = kVar;
        this.A0 = q96Var;
        int iB = q96Var.b();
        if (iB == 0 && q96Var.g) {
            return;
        }
        int layoutDirection = this.Y.getLayoutDirection();
        byte b = this.r0;
        boolean z5 = this.s0;
        if (b == 0) {
            this.v0 = layoutDirection == 1;
            this.w0 = z5 == 2;
        } else if (b == 1) {
            this.v0 = layoutDirection != 1;
            this.w0 = z5 == 2;
        } else if (b == 2) {
            boolean z6 = layoutDirection == 1;
            this.v0 = z6;
            if (z5 == 2) {
                this.v0 = !z6;
            }
            this.w0 = false;
        } else if (b != 3) {
            this.v0 = false;
            this.w0 = false;
        } else {
            boolean z7 = layoutDirection == 1;
            this.v0 = z7;
            if (z5 == 2) {
                this.v0 = !z7;
            }
            this.w0 = true;
        }
        d1();
        if (this.B0 == null) {
            yd2 yd2Var = new yd2();
            yd2Var.h = 1;
            this.B0 = yd2Var;
        }
        y5 y5Var = this.y0;
        y5Var.G(iB);
        y5Var.H(iB);
        y5Var.F(iB);
        this.B0.i = false;
        zd2 zd2Var = this.F0;
        if (zd2Var != null && (i7 = zd2Var.X) >= 0 && i7 < iB) {
            this.G0 = i7;
        }
        xd2 xd2Var = this.C0;
        if (!xd2Var.f || this.G0 != -1 || zd2Var != null) {
            xd2Var.b();
            zd2 zd2Var2 = this.F0;
            if (q96Var.g || (i3 = this.G0) == -1) {
                if (I() != 0) {
                    if (xd2Var.e) {
                        viewF1 = h1(q96Var.b());
                    } else {
                        viewF1 = f1(q96Var.b());
                    }
                    if (viewF1 != null) {
                        flexboxLayoutManager = xd2Var.h;
                        if (flexboxLayoutManager.s0) {
                            td5Var = flexboxLayoutManager.D0;
                        } else {
                            td5Var = flexboxLayoutManager.E0;
                        }
                        if (flexboxLayoutManager.j() && flexboxLayoutManager.v0) {
                            if (xd2Var.e) {
                                xd2Var.c = td5Var.o() + td5Var.g(viewF1);
                            } else {
                                xd2Var.c = td5Var.d(viewF1);
                            }
                        } else if (xd2Var.e) {
                            xd2Var.c = td5Var.o() + td5Var.d(viewF1);
                        } else {
                            xd2Var.c = td5Var.g(viewF1);
                        }
                        iT = j.T(viewF1);
                        xd2Var.a = iT;
                        xd2Var.g = false;
                        int[] iArr = (int[]) flexboxLayoutManager.y0.g0;
                        if (iT == -1) {
                            iT = 0;
                        }
                        i = iArr[iT];
                        if (i == -1) {
                            i = 0;
                        }
                        xd2Var.b = i;
                        size = flexboxLayoutManager.x0.size();
                        i2 = xd2Var.b;
                        if (size > i2) {
                            xd2Var.a = ((vd2) flexboxLayoutManager.x0.get(i2)).o;
                        }
                        boolean z8 = q96Var.g;
                    } else {
                        xd2Var.a();
                        xd2Var.a = 0;
                        xd2Var.b = 0;
                    }
                } else {
                    xd2Var.a();
                    xd2Var.a = 0;
                    xd2Var.b = 0;
                }
            } else if (i3 < 0 || i3 >= q96Var.b()) {
                this.G0 = -1;
                this.H0 = Integer.MIN_VALUE;
                if (I() != 0) {
                    if (xd2Var.e) {
                        viewF1 = h1(q96Var.b());
                    } else {
                        viewF1 = f1(q96Var.b());
                    }
                    if (viewF1 != null) {
                        flexboxLayoutManager = xd2Var.h;
                        if (flexboxLayoutManager.s0) {
                            td5Var = flexboxLayoutManager.E0;
                        } else {
                            td5Var = flexboxLayoutManager.D0;
                        }
                        if (flexboxLayoutManager.j()) {
                            if (xd2Var.e) {
                                xd2Var.c = td5Var.o() + td5Var.d(viewF1);
                            } else {
                                xd2Var.c = td5Var.g(viewF1);
                            }
                        } else if (xd2Var.e) {
                            xd2Var.c = td5Var.o() + td5Var.d(viewF1);
                        } else {
                            xd2Var.c = td5Var.g(viewF1);
                        }
                        iT = j.T(viewF1);
                        xd2Var.a = iT;
                        xd2Var.g = false;
                        int[] iArr2 = (int[]) flexboxLayoutManager.y0.g0;
                        if (iT == -1) {
                            iT = 0;
                        }
                        i = iArr2[iT];
                        if (i == -1) {
                            i = 0;
                        }
                        xd2Var.b = i;
                        size = flexboxLayoutManager.x0.size();
                        i2 = xd2Var.b;
                        if (size > i2) {
                            xd2Var.a = ((vd2) flexboxLayoutManager.x0.get(i2)).o;
                        }
                        boolean z9 = q96Var.g;
                    } else {
                        xd2Var.a();
                        xd2Var.a = 0;
                        xd2Var.b = 0;
                    }
                } else {
                    xd2Var.a();
                    xd2Var.a = 0;
                    xd2Var.b = 0;
                }
            } else {
                int i8 = this.G0;
                xd2Var.a = i8;
                xd2Var.b = ((int[]) y5Var.g0)[i8];
                zd2 zd2Var3 = this.F0;
                if (zd2Var3 != null) {
                    int iB2 = q96Var.b();
                    int i9 = zd2Var3.X;
                    if (i9 >= 0 && i9 < iB2) {
                        xd2Var.c = this.D0.m() + zd2Var2.Y;
                        xd2Var.g = true;
                        xd2Var.b = -1;
                    } else if (this.H0 == Integer.MIN_VALUE) {
                        viewD = D(this.G0);
                        if (viewD != null) {
                            if (I() > 0 && (viewH = H(0)) != null) {
                                if (this.G0 < j.T(viewH)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                xd2Var.e = z;
                            }
                            xd2Var.a();
                        } else if (this.D0.e(viewD) > this.D0.n()) {
                            xd2Var.a();
                        } else {
                            iG = this.D0.g(viewD) - this.D0.m();
                            td5Var2 = this.D0;
                            if (iG < 0) {
                                xd2Var.c = td5Var2.m();
                                xd2Var.e = false;
                            } else if (td5Var2.i() - this.D0.d(viewD) < 0) {
                                xd2Var.c = this.D0.i();
                                xd2Var.e = true;
                            } else {
                                z2 = xd2Var.e;
                                td5Var3 = this.D0;
                                if (z2) {
                                    iG2 = this.D0.o() + td5Var3.d(viewD);
                                } else {
                                    iG2 = td5Var3.g(viewD);
                                }
                                xd2Var.c = iG2;
                            }
                        }
                    } else if (j() && this.v0) {
                        xd2Var.c = this.H0 - this.D0.j();
                    } else {
                        xd2Var.c = this.D0.m() + this.H0;
                    }
                } else if (this.H0 == Integer.MIN_VALUE) {
                    viewD = D(this.G0);
                    if (viewD != null) {
                        if (I() > 0) {
                            if (this.G0 < j.T(viewH)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            xd2Var.e = z;
                        }
                        xd2Var.a();
                    } else if (this.D0.e(viewD) > this.D0.n()) {
                        xd2Var.a();
                    } else {
                        iG = this.D0.g(viewD) - this.D0.m();
                        td5Var2 = this.D0;
                        if (iG < 0) {
                            xd2Var.c = td5Var2.m();
                            xd2Var.e = false;
                        } else if (td5Var2.i() - this.D0.d(viewD) < 0) {
                            xd2Var.c = this.D0.i();
                            xd2Var.e = true;
                        } else {
                            z2 = xd2Var.e;
                            td5Var3 = this.D0;
                            if (z2) {
                                iG2 = this.D0.o() + td5Var3.d(viewD);
                            } else {
                                iG2 = td5Var3.g(viewD);
                            }
                            xd2Var.c = iG2;
                        }
                    }
                } else if (j()) {
                    xd2Var.c = this.D0.m() + this.H0;
                } else {
                    xd2Var.c = this.D0.m() + this.H0;
                }
            }
            xd2Var.f = true;
        }
        B(kVar);
        if (xd2Var.e) {
            u1(xd2Var, false, true);
        } else {
            t1(xd2Var, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.p0, this.n0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.q0, this.o0);
        int i10 = this.p0;
        int i11 = this.q0;
        boolean zJ = j();
        Context context = this.L0;
        if (zJ) {
            int i12 = this.I0;
            z3 = (i12 == Integer.MIN_VALUE || i12 == i10) ? false : true;
            yd2 yd2Var2 = this.B0;
            i4 = yd2Var2.b ? context.getResources().getDisplayMetrics().heightPixels : yd2Var2.a;
        } else {
            int i13 = this.J0;
            z3 = (i13 == Integer.MIN_VALUE || i13 == i11) ? false : true;
            yd2 yd2Var3 = this.B0;
            i4 = yd2Var3.b ? context.getResources().getDisplayMetrics().widthPixels : yd2Var3.a;
        }
        int i14 = i4;
        this.I0 = i10;
        this.J0 = i11;
        int i15 = this.N0;
        b8 b8Var = this.O0;
        if (i15 != -1 || (this.G0 == -1 && !z3)) {
            int iMin = xd2Var.a;
            if (i15 != -1) {
                iMin = Math.min(i15, iMin);
            }
            b8Var.c = null;
            b8Var.b = 0;
            boolean zJ2 = j();
            List list = this.x0;
            if (zJ2) {
                if (list.size() > 0) {
                    y5Var.y(iMin, this.x0);
                    this.y0.v(this.O0, iMakeMeasureSpec, iMakeMeasureSpec2, i14, iMin, xd2Var.a, this.x0);
                } else {
                    y5Var.F(iB);
                    this.y0.v(this.O0, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, -1, this.x0);
                }
            } else if (list.size() > 0) {
                y5Var.y(iMin, this.x0);
                int i16 = iMin;
                this.y0.v(this.O0, iMakeMeasureSpec2, iMakeMeasureSpec, i14, i16, xd2Var.a, this.x0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i16;
            } else {
                y5Var.F(iB);
                this.y0.v(this.O0, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, -1, this.x0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.x0 = (List) b8Var.c;
            y5Var.E(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            y5Var.f0(iMin);
        } else if (!xd2Var.e) {
            this.x0.clear();
            b8Var.c = null;
            b8Var.b = 0;
            boolean zJ3 = j();
            int i17 = xd2Var.a;
            y5 y5Var2 = this.y0;
            b8 b8Var2 = this.O0;
            if (zJ3) {
                y5Var2.v(b8Var2, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, i17, this.x0);
            } else {
                y5Var2.v(b8Var2, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, i17, this.x0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.x0 = (List) b8Var.c;
            y5Var.E(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            y5Var.f0(0);
            int i18 = ((int[]) y5Var.g0)[xd2Var.a];
            xd2Var.b = i18;
            this.B0.c = i18;
        }
        e1(kVar, q96Var, this.B0);
        boolean z10 = xd2Var.e;
        yd2 yd2Var4 = this.B0;
        if (z10) {
            i6 = yd2Var4.e;
            z4 = true;
            t1(xd2Var, true, false);
            e1(kVar, q96Var, this.B0);
            i5 = this.B0.e;
        } else {
            z4 = true;
            i5 = yd2Var4.e;
            u1(xd2Var, true, false);
            e1(kVar, q96Var, this.B0);
            i6 = this.B0.e;
        }
        if (I() > 0) {
            if (xd2Var.e) {
                m1(l1(i5, kVar, q96Var, z4) + i6, kVar, q96Var, false);
            } else {
                l1(m1(i6, kVar, q96Var, z4) + i5, kVar, q96Var, false);
            }
        }
    }

    public final void u1(xd2 xd2Var, boolean z, boolean z2) {
        if (z2) {
            int i = j() ? this.o0 : this.n0;
            this.B0.b = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.B0.b = false;
        }
        if (j() || !this.v0) {
            this.B0.a = xd2Var.c - this.D0.m();
        } else {
            this.B0.a = (this.M0.getWidth() - xd2Var.c) - this.D0.m();
        }
        yd2 yd2Var = this.B0;
        yd2Var.d = xd2Var.a;
        yd2Var.h = -1;
        yd2Var.e = xd2Var.c;
        yd2Var.f = Integer.MIN_VALUE;
        int i2 = xd2Var.b;
        yd2Var.c = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.x0.size();
        int i3 = xd2Var.b;
        if (size > i3) {
            vd2 vd2Var = (vd2) this.x0.get(i3);
            yd2 yd2Var2 = this.B0;
            yd2Var2.c--;
            yd2Var2.d -= vd2Var.h;
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final int v(q96 q96Var) {
        return a1(q96Var);
    }

    @Override // androidx.recyclerview.widget.j
    public final void v0(q96 q96Var) {
        this.F0 = null;
        this.G0 = -1;
        this.H0 = Integer.MIN_VALUE;
        this.N0 = -1;
        this.C0.b();
        this.K0.clear();
    }

    @Override // androidx.recyclerview.widget.j
    public final int w(q96 q96Var) {
        return b1(q96Var);
    }

    @Override // androidx.recyclerview.widget.j
    public final int x(q96 q96Var) {
        return c1(q96Var);
    }

    @Override // androidx.recyclerview.widget.j
    public final int y(q96 q96Var) {
        return a1(q96Var);
    }

    @Override // androidx.recyclerview.widget.j
    public final void y0(Parcelable parcelable) {
        if (parcelable instanceof zd2) {
            this.F0 = (zd2) parcelable;
            K0();
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final int z(q96 q96Var) {
        return b1(q96Var);
    }

    @Override // androidx.recyclerview.widget.j
    public final Parcelable z0() {
        zd2 zd2Var = this.F0;
        if (zd2Var != null) {
            zd2 zd2Var2 = new zd2();
            zd2Var2.X = zd2Var.X;
            zd2Var2.Y = zd2Var.Y;
            return zd2Var2;
        }
        zd2 zd2Var3 = new zd2();
        if (I() <= 0) {
            zd2Var3.X = -1;
            return zd2Var3;
        }
        View viewH = H(0);
        zd2Var3.X = j.T(viewH);
        zd2Var3.Y = this.D0.g(viewH) - this.D0.m();
        return zd2Var3;
    }

    @Override // defpackage.td2
    public final void h(vd2 vd2Var) {
    }

    @Override // androidx.recyclerview.widget.j
    public final void h0(RecyclerView recyclerView) {
    }
}
