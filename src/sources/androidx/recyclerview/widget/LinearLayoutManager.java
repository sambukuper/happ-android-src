package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a4;
import defpackage.bt;
import defpackage.e96;
import defpackage.h4;
import defpackage.ia4;
import defpackage.ja4;
import defpackage.o96;
import defpackage.pc6;
import defpackage.q96;
import defpackage.td5;
import defpackage.xr0;
import defpackage.yn0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends j implements o96 {
    public int A0;
    public ja4 B0;
    public final a C0;
    public final ia4 D0;
    public final byte E0;
    public final int[] F0;
    public int r0;
    public b s0;
    public td5 t0;
    public boolean u0;
    public final boolean v0;
    public boolean w0;
    public boolean x0;
    public final boolean y0;
    public int z0;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.r0 = 1;
        this.v0 = false;
        this.w0 = false;
        this.x0 = false;
        this.y0 = true;
        this.z0 = -1;
        this.A0 = Integer.MIN_VALUE;
        this.B0 = null;
        this.C0 = new a();
        this.D0 = new ia4();
        this.E0 = (byte) 2;
        this.F0 = new int[2];
        e96 e96VarU = j.U(context, attributeSet, i, i2);
        A1(e96VarU.a);
        boolean z = e96VarU.c;
        n(null);
        if (z != this.v0) {
            this.v0 = z;
            K0();
        }
        B1(e96VarU.d);
    }

    @Override // androidx.recyclerview.widget.j
    public int A(q96 q96Var) {
        return e1(q96Var);
    }

    public final void A1(int i) {
        if (i != 0 && i != 1) {
            bt.q(pc6.j(i, "invalid orientation:"));
            return;
        }
        n(null);
        if (i != this.r0 || this.t0 == null) {
            td5 td5VarB = td5.b(this, i);
            this.t0 = td5VarB;
            this.C0.a = td5VarB;
            this.r0 = i;
            K0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    @Override // androidx.recyclerview.widget.j
    public boolean B0(int i, Bundle bundle) {
        int iMin;
        ja4 ja4Var;
        if (super.B0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.r0 == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 >= 0) {
                    RecyclerView recyclerView = this.Y;
                    iMin = Math.min(i2, V(recyclerView.h0, recyclerView.k1) - 1);
                    if (iMin >= 0) {
                        this.z0 = iMin;
                        this.A0 = 0;
                        ja4Var = this.B0;
                        if (ja4Var != null) {
                            ja4Var.X = -1;
                        }
                        K0();
                        return true;
                    }
                }
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 >= 0) {
                    RecyclerView recyclerView2 = this.Y;
                    iMin = Math.min(i3, K(recyclerView2.h0, recyclerView2.k1) - 1);
                    if (iMin >= 0) {
                        this.z0 = iMin;
                        this.A0 = 0;
                        ja4Var = this.B0;
                        if (ja4Var != null) {
                            ja4Var.X = -1;
                        }
                        K0();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void B1(boolean z) {
        n(null);
        if (this.x0 == z) {
            return;
        }
        this.x0 = z;
        K0();
    }

    public final void C1(int i, int i2, boolean z, q96 q96Var) {
        int iM;
        this.s0.l = this.t0.k() == 0 && this.t0.h() == 0;
        this.s0.f = i;
        int[] iArr = this.F0;
        iArr[0] = 0;
        iArr[1] = 0;
        a1(q96Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        b bVar = this.s0;
        int i3 = z2 ? iMax2 : iMax;
        bVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        bVar.i = iMax;
        if (z2) {
            bVar.h = this.t0.j() + i3;
            View viewR1 = r1();
            b bVar2 = this.s0;
            bVar2.e = this.w0 ? -1 : 1;
            int iT = j.T(viewR1);
            b bVar3 = this.s0;
            bVar2.d = iT + bVar3.e;
            bVar3.b = this.t0.d(viewR1);
            iM = this.t0.d(viewR1) - this.t0.i();
        } else {
            View viewS1 = s1();
            b bVar4 = this.s0;
            bVar4.h = this.t0.m() + bVar4.h;
            b bVar5 = this.s0;
            bVar5.e = this.w0 ? 1 : -1;
            int iT2 = j.T(viewS1);
            b bVar6 = this.s0;
            bVar5.d = iT2 + bVar6.e;
            bVar6.b = this.t0.g(viewS1);
            iM = (-this.t0.g(viewS1)) + this.t0.m();
        }
        b bVar7 = this.s0;
        bVar7.c = i2;
        if (z) {
            bVar7.c = i2 - iM;
        }
        bVar7.g = iM;
    }

    @Override // androidx.recyclerview.widget.j
    public final View D(int i) {
        int I = I();
        if (I == 0) {
            return null;
        }
        int iT = i - j.T(H(0));
        if (iT >= 0 && iT < I) {
            View viewH = H(iT);
            if (j.T(viewH) == i) {
                return viewH;
            }
        }
        return super.D(i);
    }

    public final void D1(int i, int i2) {
        this.s0.c = this.t0.i() - i2;
        b bVar = this.s0;
        bVar.e = this.w0 ? -1 : 1;
        bVar.d = i;
        bVar.f = 1;
        bVar.b = i2;
        bVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.j
    public RecyclerView.LayoutParams E() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final void E1(int i, int i2) {
        this.s0.c = i2 - this.t0.m();
        b bVar = this.s0;
        bVar.d = i;
        bVar.e = this.w0 ? 1 : -1;
        bVar.f = -1;
        bVar.b = i2;
        bVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.j
    public int M0(int i, q96 q96Var, k kVar) {
        if (this.r0 == 1) {
            return 0;
        }
        return z1(i, q96Var, kVar);
    }

    @Override // androidx.recyclerview.widget.j
    public final void N0(int i) {
        this.z0 = i;
        this.A0 = Integer.MIN_VALUE;
        ja4 ja4Var = this.B0;
        if (ja4Var != null) {
            ja4Var.X = -1;
        }
        K0();
    }

    @Override // androidx.recyclerview.widget.j
    public int O0(int i, q96 q96Var, k kVar) {
        if (this.r0 == 0) {
            return 0;
        }
        return z1(i, q96Var, kVar);
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean V0() {
        if (this.o0 != 1073741824 && this.n0 != 1073741824) {
            int I = I();
            for (int i = 0; i < I; i++) {
                ViewGroup.LayoutParams layoutParams = H(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean Y() {
        return true;
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean Z() {
        return this.v0;
    }

    @Override // androidx.recyclerview.widget.j
    public boolean Z0() {
        return this.B0 == null && this.u0 == this.x0;
    }

    @Override // defpackage.o96
    public final PointF a(int i) {
        if (I() == 0) {
            return null;
        }
        int i2 = (i < j.T(H(0))) != this.w0 ? -1 : 1;
        return this.r0 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public void a1(q96 q96Var, int[] iArr) {
        int i;
        int iN = q96Var.a != -1 ? this.t0.n() : 0;
        if (this.s0.f == -1) {
            i = 0;
        } else {
            i = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i;
    }

    public void b1(q96 q96Var, b bVar, xr0 xr0Var) {
        int i = bVar.d;
        if (i < 0 || i >= q96Var.b()) {
            return;
        }
        xr0Var.b(i, Math.max(0, bVar.g));
    }

    public final int c1(q96 q96Var) {
        if (I() == 0) {
            return 0;
        }
        g1();
        td5 td5Var = this.t0;
        boolean z = !this.y0;
        return yn0.w(q96Var, td5Var, j1(z), i1(z), this, this.y0);
    }

    public final int d1(q96 q96Var) {
        if (I() == 0) {
            return 0;
        }
        g1();
        td5 td5Var = this.t0;
        boolean z = !this.y0;
        return yn0.x(q96Var, td5Var, j1(z), i1(z), this, this.y0, this.w0);
    }

    public final int e1(q96 q96Var) {
        if (I() == 0) {
            return 0;
        }
        g1();
        td5 td5Var = this.t0;
        boolean z = !this.y0;
        return yn0.y(q96Var, td5Var, j1(z), i1(z), this, this.y0);
    }

    public final int f1(int i) {
        if (i == 1) {
            return (this.r0 != 1 && t1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.r0 != 1 && t1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.r0 == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.r0 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.r0 == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.r0 == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void g1() {
        if (this.s0 == null) {
            b bVar = new b();
            bVar.a = true;
            bVar.h = 0;
            bVar.i = 0;
            bVar.k = null;
            this.s0 = bVar;
        }
    }

    public final int h1(k kVar, b bVar, q96 q96Var, boolean z) {
        int i;
        int i2 = bVar.c;
        int i3 = bVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                bVar.g = i3 + i2;
            }
            w1(kVar, bVar);
        }
        int i4 = bVar.c + bVar.h;
        while (true) {
            if ((!bVar.l && i4 <= 0) || (i = bVar.d) < 0 || i >= q96Var.b()) {
                break;
            }
            ia4 ia4Var = this.D0;
            ia4Var.a = 0;
            ia4Var.b = false;
            ia4Var.c = false;
            ia4Var.d = false;
            u1(kVar, q96Var, bVar, ia4Var);
            if (!ia4Var.b) {
                int i5 = bVar.b;
                int i6 = ia4Var.a;
                bVar.b = (bVar.f * i6) + i5;
                if (!ia4Var.c || bVar.k != null || !q96Var.g) {
                    bVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = bVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    bVar.g = i8;
                    int i9 = bVar.c;
                    if (i9 < 0) {
                        bVar.g = i8 + i9;
                    }
                    w1(kVar, bVar);
                }
                if (z && ia4Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - bVar.c;
    }

    @Override // androidx.recyclerview.widget.j
    public View i0(View view, int i, k kVar, q96 q96Var) {
        int iF1;
        View viewM1;
        y1();
        if (I() != 0 && (iF1 = f1(i)) != Integer.MIN_VALUE) {
            g1();
            C1(iF1, (int) (this.t0.n() * 0.33333334f), false, q96Var);
            b bVar = this.s0;
            bVar.g = Integer.MIN_VALUE;
            bVar.a = false;
            h1(kVar, bVar, q96Var, true);
            boolean z = this.w0;
            if (iF1 == -1) {
                viewM1 = z ? m1(I() - 1, -1) : m1(0, I());
            } else {
                viewM1 = z ? m1(0, I()) : m1(I() - 1, -1);
            }
            View viewS1 = iF1 == -1 ? s1() : r1();
            if (!viewS1.hasFocusable()) {
                return viewM1;
            }
            if (viewM1 != null) {
                return viewS1;
            }
        }
        return null;
    }

    public final View i1(boolean z) {
        return this.w0 ? n1(0, I(), z) : n1(I() - 1, -1, z);
    }

    @Override // androidx.recyclerview.widget.j
    public final void j0(AccessibilityEvent accessibilityEvent) {
        super.j0(accessibilityEvent);
        if (I() > 0) {
            accessibilityEvent.setFromIndex(k1());
            accessibilityEvent.setToIndex(l1());
        }
    }

    public final View j1(boolean z) {
        return this.w0 ? n1(I() - 1, -1, z) : n1(0, I(), z);
    }

    @Override // androidx.recyclerview.widget.j
    public void k0(k kVar, q96 q96Var, h4 h4Var) {
        super.k0(kVar, q96Var, h4Var);
        f fVar = this.Y.r0;
        if (fVar == null || fVar.a() <= 0) {
            return;
        }
        h4Var.b(a4.n);
    }

    public final int k1() {
        View viewN1 = n1(0, I(), false);
        if (viewN1 == null) {
            return -1;
        }
        return j.T(viewN1);
    }

    public final int l1() {
        View viewN1 = n1(I() - 1, -1, false);
        if (viewN1 == null) {
            return -1;
        }
        return j.T(viewN1);
    }

    public final View m1(int i, int i2) {
        int i3;
        int i4;
        g1();
        if (i2 <= i && i2 >= i) {
            return H(i);
        }
        if (this.t0.g(H(i)) < this.t0.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.r0 == 0 ? this.Z.m(i, i2, i3, i4) : this.f0.m(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.j
    public final void n(String str) {
        if (this.B0 == null) {
            super.n(str);
        }
    }

    public final View n1(int i, int i2, boolean z) {
        g1();
        int i3 = z ? 24579 : 320;
        return this.r0 == 0 ? this.Z.m(i, i2, i3, 320) : this.f0.m(i, i2, i3, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View o1(k kVar, q96 q96Var, boolean z, boolean z2) {
        int i;
        int I;
        int i2;
        g1();
        int I2 = I();
        if (z2) {
            I = I() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = I2;
            I = 0;
            i2 = 1;
        }
        int iB = q96Var.b();
        int iM = this.t0.m();
        int i3 = this.t0.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (I != i) {
            View viewH = H(I);
            int iT = j.T(viewH);
            int iG = this.t0.g(viewH);
            int iD = this.t0.d(viewH);
            if (iT >= 0 && iT < iB) {
                if (!((RecyclerView.LayoutParams) viewH.getLayoutParams()).X.i()) {
                    boolean z3 = iD <= iM && iG < iM;
                    boolean z4 = iG >= i3 && iD > i3;
                    if (!z3 && !z4) {
                        return viewH;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewH;
                        } else if (view == null) {
                            view = viewH;
                        }
                    } else if (z3) {
                        view2 = viewH;
                    } else if (view == null) {
                        view = viewH;
                    }
                } else if (view3 == null) {
                    view3 = viewH;
                }
            }
            I += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean p() {
        return this.r0 == 0;
    }

    public final int p1(int i, k kVar, q96 q96Var, boolean z) {
        int i2;
        int i3 = this.t0.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -z1(-i3, q96Var, kVar);
        int i5 = i + i4;
        if (!z || (i2 = this.t0.i() - i5) <= 0) {
            return i4;
        }
        this.t0.r(i2);
        return i2 + i4;
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean q() {
        return this.r0 == 1;
    }

    public final int q1(int i, k kVar, q96 q96Var, boolean z) {
        int iM;
        int iM2 = i - this.t0.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -z1(iM2, q96Var, kVar);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.t0.m()) <= 0) {
            return i2;
        }
        this.t0.r(-iM);
        return i2 - iM;
    }

    public final View r1() {
        return H(this.w0 ? 0 : I() - 1);
    }

    public final View s1() {
        return H(this.w0 ? I() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.j
    public final void t(int i, int i2, q96 q96Var, xr0 xr0Var) {
        if (this.r0 != 0) {
            i = i2;
        }
        if (I() == 0 || i == 0) {
            return;
        }
        g1();
        C1(i > 0 ? 1 : -1, Math.abs(i), true, q96Var);
        b1(q96Var, this.s0, xr0Var);
    }

    public final boolean t1() {
        return this.Y.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.j
    public final void u(int i, xr0 xr0Var) {
        boolean z;
        int i2;
        ja4 ja4Var = this.B0;
        if (ja4Var == null || (i2 = ja4Var.X) < 0) {
            y1();
            z = this.w0;
            i2 = this.z0;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = ja4Var.Z;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.E0 && i2 >= 0 && i2 < i; i4++) {
            xr0Var.b(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0199  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:122:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x021c  */
    /* JADX WARN: Code duplicated, block: B:126:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0223  */
    /* JADX WARN: Code duplicated, block: B:130:0x0226 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:133:0x022c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0230  */
    /* JADX WARN: Code duplicated, block: B:137:0x0237  */
    /* JADX WARN: Code duplicated, block: B:138:0x023d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.j
    public void u0(k kVar, q96 q96Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewO1;
        boolean z3;
        td5 td5Var;
        int iG;
        int iD;
        int iM;
        int i;
        boolean z4;
        boolean z5;
        RecyclerView.LayoutParams layoutParams;
        int i2;
        int i3;
        int i4;
        ?? r4;
        List list;
        int i5;
        int i6;
        int iP1;
        int i7;
        View viewD;
        int iG2;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.B0 == null && this.z0 == -1) && q96Var.b() == 0) {
            E0(kVar);
            return;
        }
        ja4 ja4Var = this.B0;
        if (ja4Var != null && (i9 = ja4Var.X) >= 0) {
            this.z0 = i9;
        }
        g1();
        boolean z6 = false;
        this.s0.a = false;
        y1();
        RecyclerView recyclerView2 = this.Y;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.X.c.contains(focusedChild)) {
            focusedChild = null;
        }
        a aVar = this.C0;
        if (!aVar.e || this.z0 != -1 || this.B0 != null) {
            aVar.c();
            aVar.d = this.w0 ^ this.x0;
            if (q96Var.g || (i2 = this.z0) == -1) {
                if (I() != 0) {
                    recyclerView = this.Y;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.X.c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        layoutParams = (RecyclerView.LayoutParams) focusedChild2.getLayoutParams();
                        if (!layoutParams.X.i() || layoutParams.X.c() < 0 || layoutParams.X.c() >= q96Var.b()) {
                            z = this.u0;
                            z2 = this.x0;
                            if (z == z2 || (viewO1 = o1(kVar, q96Var, aVar.d, z2)) == null) {
                                aVar.a();
                                if (this.x0) {
                                    iB = q96Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                int iT = j.T(viewO1);
                                z3 = aVar.d;
                                td5Var = aVar.a;
                                if (z3) {
                                    aVar.c = aVar.a.o() + td5Var.d(viewO1);
                                } else {
                                    aVar.c = td5Var.g(viewO1);
                                }
                                aVar.b = iT;
                                if (!q96Var.g && Z0()) {
                                    iG = this.t0.g(viewO1);
                                    iD = this.t0.d(viewO1);
                                    iM = this.t0.m();
                                    i = this.t0.i();
                                    if (iD <= iM || iG >= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iG >= i || iD <= i) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (aVar.d) {
                                            iM = i;
                                        }
                                        aVar.c = iM;
                                    }
                                }
                            }
                        } else {
                            aVar.b(focusedChild2, j.T(focusedChild2));
                        }
                    } else {
                        z = this.u0;
                        z2 = this.x0;
                        if (z == z2) {
                            aVar.a();
                            if (this.x0) {
                                iB = q96Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            aVar.b = iB;
                        } else {
                            int iT2 = j.T(viewO1);
                            z3 = aVar.d;
                            td5Var = aVar.a;
                            if (z3) {
                                aVar.c = aVar.a.o() + td5Var.d(viewO1);
                            } else {
                                aVar.c = td5Var.g(viewO1);
                            }
                            aVar.b = iT2;
                            if (!q96Var.g) {
                                iG = this.t0.g(viewO1);
                                iD = this.t0.d(viewO1);
                                iM = this.t0.m();
                                i = this.t0.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (aVar.d) {
                                        iM = i;
                                    }
                                    aVar.c = iM;
                                } else {
                                    if (aVar.d) {
                                        iM = i;
                                    }
                                    aVar.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.x0) {
                        iB = q96Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    aVar.b = iB;
                }
            } else if (i2 < 0 || i2 >= q96Var.b()) {
                this.z0 = -1;
                this.A0 = Integer.MIN_VALUE;
                if (I() != 0) {
                    recyclerView = this.Y;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        layoutParams = (RecyclerView.LayoutParams) focusedChild2.getLayoutParams();
                        if (layoutParams.X.i()) {
                            z = this.u0;
                            z2 = this.x0;
                            if (z == z2) {
                                aVar.a();
                                if (this.x0) {
                                    iB = q96Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                int iT3 = j.T(viewO1);
                                z3 = aVar.d;
                                td5Var = aVar.a;
                                if (z3) {
                                    aVar.c = aVar.a.o() + td5Var.d(viewO1);
                                } else {
                                    aVar.c = td5Var.g(viewO1);
                                }
                                aVar.b = iT3;
                                if (!q96Var.g) {
                                    iG = this.t0.g(viewO1);
                                    iD = this.t0.d(viewO1);
                                    iM = this.t0.m();
                                    i = this.t0.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (aVar.d) {
                                            iM = i;
                                        }
                                        aVar.c = iM;
                                    } else {
                                        if (aVar.d) {
                                            iM = i;
                                        }
                                        aVar.c = iM;
                                    }
                                }
                            }
                        } else {
                            z = this.u0;
                            z2 = this.x0;
                            if (z == z2) {
                                aVar.a();
                                if (this.x0) {
                                    iB = q96Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                int iT4 = j.T(viewO1);
                                z3 = aVar.d;
                                td5Var = aVar.a;
                                if (z3) {
                                    aVar.c = aVar.a.o() + td5Var.d(viewO1);
                                } else {
                                    aVar.c = td5Var.g(viewO1);
                                }
                                aVar.b = iT4;
                                if (!q96Var.g) {
                                    iG = this.t0.g(viewO1);
                                    iD = this.t0.d(viewO1);
                                    iM = this.t0.m();
                                    i = this.t0.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (aVar.d) {
                                            iM = i;
                                        }
                                        aVar.c = iM;
                                    } else {
                                        if (aVar.d) {
                                            iM = i;
                                        }
                                        aVar.c = iM;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.u0;
                        z2 = this.x0;
                        if (z == z2) {
                            aVar.a();
                            if (this.x0) {
                                iB = q96Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            aVar.b = iB;
                        } else {
                            int iT5 = j.T(viewO1);
                            z3 = aVar.d;
                            td5Var = aVar.a;
                            if (z3) {
                                aVar.c = aVar.a.o() + td5Var.d(viewO1);
                            } else {
                                aVar.c = td5Var.g(viewO1);
                            }
                            aVar.b = iT5;
                            if (!q96Var.g) {
                                iG = this.t0.g(viewO1);
                                iD = this.t0.d(viewO1);
                                iM = this.t0.m();
                                i = this.t0.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (aVar.d) {
                                        iM = i;
                                    }
                                    aVar.c = iM;
                                } else {
                                    if (aVar.d) {
                                        iM = i;
                                    }
                                    aVar.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.x0) {
                        iB = q96Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    aVar.b = iB;
                }
            } else {
                int i11 = this.z0;
                aVar.b = i11;
                ja4 ja4Var2 = this.B0;
                if (ja4Var2 != null && ja4Var2.X >= 0) {
                    boolean z7 = ja4Var2.Z;
                    aVar.d = z7;
                    td5 td5Var2 = this.t0;
                    if (z7) {
                        aVar.c = td5Var2.i() - this.B0.Y;
                    } else {
                        aVar.c = td5Var2.m() + this.B0.Y;
                    }
                } else if (this.A0 == Integer.MIN_VALUE) {
                    View viewD2 = D(i11);
                    if (viewD2 == null) {
                        if (I() > 0) {
                            aVar.d = (this.z0 < j.T(H(0))) == this.w0;
                        }
                        aVar.a();
                    } else if (this.t0.e(viewD2) > this.t0.n()) {
                        aVar.a();
                    } else {
                        int iG3 = this.t0.g(viewD2) - this.t0.m();
                        td5 td5Var3 = this.t0;
                        if (iG3 < 0) {
                            aVar.c = td5Var3.m();
                            aVar.d = false;
                        } else if (td5Var3.i() - this.t0.d(viewD2) < 0) {
                            aVar.c = this.t0.i();
                            aVar.d = true;
                        } else {
                            boolean z8 = aVar.d;
                            td5 td5Var4 = this.t0;
                            aVar.c = z8 ? this.t0.o() + td5Var4.d(viewD2) : td5Var4.g(viewD2);
                        }
                    }
                } else {
                    boolean z9 = this.w0;
                    aVar.d = z9;
                    td5 td5Var5 = this.t0;
                    if (z9) {
                        aVar.c = td5Var5.i() - this.A0;
                    } else {
                        aVar.c = td5Var5.m() + this.A0;
                    }
                }
            }
            aVar.e = true;
        } else if (focusedChild != null && (this.t0.g(focusedChild) >= this.t0.i() || this.t0.d(focusedChild) <= this.t0.m())) {
            aVar.b(focusedChild, j.T(focusedChild));
        }
        b bVar = this.s0;
        bVar.f = bVar.j >= 0 ? 1 : -1;
        int[] iArr = this.F0;
        iArr[0] = 0;
        iArr[1] = 0;
        a1(q96Var, iArr);
        int iM2 = this.t0.m() + Math.max(0, iArr[0]);
        int iJ = this.t0.j() + Math.max(0, iArr[1]);
        if (q96Var.g && (i7 = this.z0) != -1 && this.A0 != Integer.MIN_VALUE && (viewD = D(i7)) != null) {
            boolean z10 = this.w0;
            td5 td5Var6 = this.t0;
            if (z10) {
                i8 = td5Var6.i() - this.t0.d(viewD);
                iG2 = this.A0;
            } else {
                iG2 = td5Var6.g(viewD) - this.t0.m();
                i8 = this.A0;
            }
            int i12 = i8 - iG2;
            if (i12 > 0) {
                iM2 += i12;
            } else {
                iJ -= i12;
            }
        }
        boolean z11 = aVar.d;
        boolean z12 = this.w0;
        if (!z11 ? !z12 : z12) {
            i10 = 1;
        }
        v1(kVar, q96Var, aVar, i10);
        B(kVar);
        this.s0.l = this.t0.k() == 0 && this.t0.h() == 0;
        this.s0.getClass();
        this.s0.i = 0;
        boolean z13 = aVar.d;
        int i13 = aVar.b;
        if (z13) {
            E1(i13, aVar.c);
            b bVar2 = this.s0;
            bVar2.h = iM2;
            h1(kVar, bVar2, q96Var, false);
            b bVar3 = this.s0;
            i4 = bVar3.b;
            int i14 = bVar3.d;
            int i15 = bVar3.c;
            if (i15 > 0) {
                iJ += i15;
            }
            D1(aVar.b, aVar.c);
            b bVar4 = this.s0;
            bVar4.h = iJ;
            bVar4.d += bVar4.e;
            h1(kVar, bVar4, q96Var, false);
            b bVar5 = this.s0;
            i3 = bVar5.b;
            int i16 = bVar5.c;
            if (i16 > 0) {
                E1(i14, i4);
                b bVar6 = this.s0;
                bVar6.h = i16;
                h1(kVar, bVar6, q96Var, false);
                i4 = this.s0.b;
            }
        } else {
            D1(i13, aVar.c);
            b bVar7 = this.s0;
            bVar7.h = iJ;
            h1(kVar, bVar7, q96Var, false);
            b bVar8 = this.s0;
            i3 = bVar8.b;
            int i17 = bVar8.d;
            int i18 = bVar8.c;
            if (i18 > 0) {
                iM2 += i18;
            }
            E1(aVar.b, aVar.c);
            b bVar9 = this.s0;
            bVar9.h = iM2;
            bVar9.d += bVar9.e;
            h1(kVar, bVar9, q96Var, false);
            b bVar10 = this.s0;
            int i19 = bVar10.b;
            int i20 = bVar10.c;
            if (i20 > 0) {
                D1(i17, i3);
                b bVar11 = this.s0;
                bVar11.h = i20;
                h1(kVar, bVar11, q96Var, false);
                i3 = this.s0.b;
            }
            i4 = i19;
        }
        if (I() > 0) {
            if (this.w0 ^ this.x0) {
                int iP2 = p1(i3, kVar, q96Var, true);
                i5 = i4 + iP2;
                i6 = i3 + iP2;
                iP1 = q1(i5, kVar, q96Var, false);
            } else {
                int iQ1 = q1(i4, kVar, q96Var, true);
                i5 = i4 + iQ1;
                i6 = i3 + iQ1;
                iP1 = p1(i6, kVar, q96Var, false);
            }
            i4 = i5 + iP1;
            i3 = i6 + iP1;
        }
        if (q96Var.k && I() != 0 && !q96Var.g && Z0()) {
            List list2 = kVar.d;
            int size = list2.size();
            int iT6 = j.T(H(0));
            int i21 = 0;
            int iE = 0;
            int iE2 = 0;
            while (i21 < size) {
                l lVar = (l) list2.get(i21);
                boolean zI = lVar.i();
                View view = lVar.a;
                if (!zI) {
                    boolean z14 = lVar.c() < iT6 ? true : z6;
                    boolean z15 = this.w0;
                    td5 td5Var7 = this.t0;
                    if (z14 != z15) {
                        iE += td5Var7.e(view);
                    } else {
                        iE2 += td5Var7.e(view);
                    }
                }
                i21++;
                z6 = false;
            }
            this.s0.k = list2;
            if (iE > 0) {
                E1(j.T(s1()), i4);
                b bVar12 = this.s0;
                bVar12.h = iE;
                r4 = 0;
                bVar12.c = 0;
                bVar12.a(null);
                h1(kVar, this.s0, q96Var, false);
            } else {
                r4 = 0;
            }
            if (iE2 > 0) {
                D1(j.T(r1()), i3);
                b bVar13 = this.s0;
                bVar13.h = iE2;
                bVar13.c = r4;
                list = null;
                bVar13.a(null);
                h1(kVar, this.s0, q96Var, r4);
            } else {
                list = null;
            }
            this.s0.k = list;
        }
        if (q96Var.g) {
            aVar.c();
        } else {
            td5 td5Var8 = this.t0;
            td5Var8.a = td5Var8.n();
        }
        this.u0 = this.x0;
    }

    public void u1(k kVar, q96 q96Var, b bVar, ia4 ia4Var) {
        int i;
        int iF;
        int i2;
        int iF2;
        View viewB = bVar.b(kVar);
        if (viewB == null) {
            ia4Var.b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewB.getLayoutParams();
        List list = bVar.k;
        boolean z = this.w0;
        int i3 = bVar.f;
        if (list == null) {
            if (z == (i3 == -1)) {
                l(viewB);
            } else {
                m(viewB, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                m(viewB, -1, true);
            } else {
                m(viewB, 0, true);
            }
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) viewB.getLayoutParams();
        Rect rectO = this.Y.O(viewB);
        int i4 = rectO.left + rectO.right;
        int i5 = rectO.top + rectO.bottom;
        int iJ = j.J(this.p0, p(), this.n0, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams2).width);
        int iJ2 = j.J(this.q0, q(), this.o0, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) layoutParams2).height);
        if (U0(viewB, iJ, iJ2, layoutParams2)) {
            viewB.measure(iJ, iJ2);
        }
        ia4Var.a = this.t0.e(viewB);
        if (this.r0 == 1) {
            if (t1()) {
                iF2 = this.p0 - getPaddingRight();
                iF = iF2 - this.t0.f(viewB);
            } else {
                int paddingLeft = getPaddingLeft();
                iF2 = this.t0.f(viewB) + paddingLeft;
                iF = paddingLeft;
            }
            int i6 = bVar.f;
            i2 = bVar.b;
            int i7 = ia4Var.a;
            if (i6 == -1) {
                int i8 = i2 - i7;
                i = i2;
                i2 = i8;
            } else {
                i = i7 + i2;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iF3 = this.t0.f(viewB) + paddingTop;
            int i9 = bVar.f;
            int i10 = bVar.b;
            int i11 = ia4Var.a;
            if (i9 == -1) {
                int i12 = i10 - i11;
                iF2 = i10;
                i2 = paddingTop;
                i = iF3;
                iF = i12;
            } else {
                int i13 = i10 + i11;
                i = iF3;
                iF = i10;
                i2 = paddingTop;
                iF2 = i13;
            }
        }
        j.b0(viewB, iF, i2, iF2, i);
        if (layoutParams.X.i() || layoutParams.X.l()) {
            ia4Var.c = true;
        }
        ia4Var.d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.j
    public final int v(q96 q96Var) {
        return c1(q96Var);
    }

    @Override // androidx.recyclerview.widget.j
    public void v0(q96 q96Var) {
        this.B0 = null;
        this.z0 = -1;
        this.A0 = Integer.MIN_VALUE;
        this.C0.c();
    }

    @Override // androidx.recyclerview.widget.j
    public int w(q96 q96Var) {
        return d1(q96Var);
    }

    public final void w1(k kVar, b bVar) {
        if (!bVar.a || bVar.l) {
            return;
        }
        int i = bVar.g;
        int i2 = bVar.i;
        if (bVar.f == -1) {
            int I = I();
            if (i < 0) {
                return;
            }
            int iH = (this.t0.h() - i) + i2;
            if (this.w0) {
                for (int i3 = 0; i3 < I; i3++) {
                    View viewH = H(i3);
                    if (this.t0.g(viewH) < iH || this.t0.q(viewH) < iH) {
                        x1(kVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = I - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewH2 = H(i5);
                if (this.t0.g(viewH2) < iH || this.t0.q(viewH2) < iH) {
                    x1(kVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int I2 = I();
        if (!this.w0) {
            for (int i7 = 0; i7 < I2; i7++) {
                View viewH3 = H(i7);
                if (this.t0.d(viewH3) > i6 || this.t0.p(viewH3) > i6) {
                    x1(kVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = I2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewH4 = H(i9);
            if (this.t0.d(viewH4) > i6 || this.t0.p(viewH4) > i6) {
                x1(kVar, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.j
    public int x(q96 q96Var) {
        return e1(q96Var);
    }

    public final void x1(k kVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                H0(i, kVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                H0(i3, kVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final int y(q96 q96Var) {
        return c1(q96Var);
    }

    @Override // androidx.recyclerview.widget.j
    public final void y0(Parcelable parcelable) {
        if (parcelable instanceof ja4) {
            ja4 ja4Var = (ja4) parcelable;
            this.B0 = ja4Var;
            if (this.z0 != -1) {
                ja4Var.X = -1;
            }
            K0();
        }
    }

    public final void y1() {
        if (this.r0 == 1 || !t1()) {
            this.w0 = this.v0;
        } else {
            this.w0 = !this.v0;
        }
    }

    @Override // androidx.recyclerview.widget.j
    public int z(q96 q96Var) {
        return d1(q96Var);
    }

    @Override // androidx.recyclerview.widget.j
    public final Parcelable z0() {
        ja4 ja4Var = this.B0;
        if (ja4Var != null) {
            ja4 ja4Var2 = new ja4();
            ja4Var2.X = ja4Var.X;
            ja4Var2.Y = ja4Var.Y;
            ja4Var2.Z = ja4Var.Z;
            return ja4Var2;
        }
        ja4 ja4Var3 = new ja4();
        if (I() <= 0) {
            ja4Var3.X = -1;
            return ja4Var3;
        }
        g1();
        boolean z = this.u0 ^ this.w0;
        ja4Var3.Z = z;
        if (z) {
            View viewR1 = r1();
            ja4Var3.Y = this.t0.i() - this.t0.d(viewR1);
            ja4Var3.X = j.T(viewR1);
            return ja4Var3;
        }
        View viewS1 = s1();
        ja4Var3.X = j.T(viewS1);
        ja4Var3.Y = this.t0.g(viewS1) - this.t0.m();
        return ja4Var3;
    }

    public final int z1(int i, q96 q96Var, k kVar) {
        if (I() != 0 && i != 0) {
            g1();
            this.s0.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            C1(i2, iAbs, true, q96Var);
            b bVar = this.s0;
            int iH1 = h1(kVar, bVar, q96Var, false) + bVar.g;
            if (iH1 >= 0) {
                if (iAbs > iH1) {
                    i = i2 * iH1;
                }
                this.t0.r(-i);
                this.s0.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.j
    public final void h0(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i) {
        this.r0 = 1;
        this.v0 = false;
        this.w0 = false;
        this.x0 = false;
        this.y0 = true;
        this.z0 = -1;
        this.A0 = Integer.MIN_VALUE;
        this.B0 = null;
        this.C0 = new a();
        this.D0 = new ia4();
        this.E0 = (byte) 2;
        this.F0 = new int[2];
        A1(i);
        n(null);
        if (this.v0) {
            this.v0 = false;
            K0();
        }
    }

    public void v1(k kVar, q96 q96Var, a aVar, int i) {
    }
}
