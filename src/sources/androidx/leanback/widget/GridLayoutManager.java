package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.FocusFinder;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.GridView;
import androidx.leanback.widget.picker.DatePicker;
import androidx.leanback.widget.picker.Picker;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.l;
import defpackage.a4;
import defpackage.b20;
import defpackage.bt;
import defpackage.cb0;
import defpackage.cn5;
import defpackage.cw8;
import defpackage.ea5;
import defpackage.ej4;
import defpackage.f4;
import defpackage.f63;
import defpackage.g4;
import defpackage.h4;
import defpackage.ig7;
import defpackage.iu2;
import defpackage.ju2;
import defpackage.kp5;
import defpackage.ku2;
import defpackage.la7;
import defpackage.lu2;
import defpackage.m09;
import defpackage.mi3;
import defpackage.mu2;
import defpackage.ni3;
import defpackage.nu2;
import defpackage.pc6;
import defpackage.q02;
import defpackage.q96;
import defpackage.r75;
import defpackage.td5;
import defpackage.xb;
import defpackage.xr0;
import defpackage.yr6;
import defpackage.zm5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import okhttp3.dnsoverhttps.DnsOverHttps;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class GridLayoutManager extends j {
    public static final Rect h1 = new Rect();
    public static final int[] i1 = new int[2];
    public final SparseIntArray A0;
    public int[] B0;
    public AudioManager C0;
    public k D0;
    public int E0;
    public ArrayList F0;
    public int G0;
    public ku2 H0;
    public mu2 I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public int[] O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public iu2 X0;
    public int Y0;
    public final yr6 Z0;
    public final f63 a1;
    public int b1;
    public int c1;
    public final int[] d1;
    public final cb0 e1;
    public final xb f1;
    public final q02 g1;
    public float r0;
    public int s0;
    public b20 t0;
    public boolean u0;
    public td5 v0;
    public int w0;
    public q96 x0;
    public int y0;
    public int z0;

    public GridLayoutManager(b20 b20Var) {
        this.r0 = 1.0f;
        this.s0 = 10;
        this.u0 = false;
        this.v0 = new d(this);
        this.A0 = new SparseIntArray();
        this.E0 = 221696;
        this.F0 = null;
        this.G0 = -1;
        this.J0 = 0;
        this.U0 = 8388659;
        this.W0 = 1;
        this.Y0 = 0;
        this.Z0 = new yr6((byte) 13);
        this.a1 = new f63((byte) 4);
        this.d1 = new int[2];
        cb0 cb0Var = new cb0((byte) 8);
        cb0Var.Y = 0;
        cb0Var.Z = 100;
        this.e1 = cb0Var;
        this.f1 = new xb(this, (byte) 12);
        this.g1 = new q02((Object) this, (byte) 7);
        this.t0 = b20Var;
        this.K0 = -1;
        if (this.k0) {
            this.k0 = false;
            this.l0 = 0;
            RecyclerView recyclerView = this.Y;
            if (recyclerView != null) {
                recyclerView.h0.n();
            }
        }
    }

    public static int e1(View view) {
        lu2 lu2Var;
        if (view == null || (lu2Var = (lu2) view.getLayoutParams()) == null || lu2Var.X.i()) {
            return -1;
        }
        return lu2Var.X.b();
    }

    public static int f1(View view) {
        lu2 lu2Var = (lu2) view.getLayoutParams();
        return j.O(view) + ((ViewGroup.MarginLayoutParams) lu2Var).topMargin + ((ViewGroup.MarginLayoutParams) lu2Var).bottomMargin;
    }

    public static int g1(View view) {
        lu2 lu2Var = (lu2) view.getLayoutParams();
        return j.P(view) + ((ViewGroup.MarginLayoutParams) lu2Var).leftMargin + ((ViewGroup.MarginLayoutParams) lu2Var).rightMargin;
    }

    public final void A1(int i, boolean z) {
        View viewD = D(i);
        androidx.recyclerview.widget.c cVar = this.g0;
        boolean z2 = cVar != null && cVar.e;
        if (!z2 && !this.t0.isLayoutRequested() && viewD != null && e1(viewD) == i) {
            this.E0 |= 32;
            C1(viewD, viewD.findFocus(), z, 0, 0);
            this.E0 &= -33;
            return;
        }
        int i2 = this.E0;
        if ((i2 & 512) == 0 || (i2 & 64) != 0) {
            this.G0 = i;
            this.J0 = Integer.MIN_VALUE;
            return;
        }
        if (z && !this.t0.isLayoutRequested()) {
            this.G0 = i;
            this.J0 = Integer.MIN_VALUE;
            if (this.X0 == null) {
                this.t0.getId();
                return;
            }
            ju2 ju2Var = new ju2(this);
            ju2Var.a = i;
            Y0(ju2Var);
            int i3 = ju2Var.a;
            if (i3 != this.G0) {
                this.G0 = i3;
                return;
            }
            return;
        }
        if (z2) {
            ku2 ku2Var = this.H0;
            if (ku2Var != null) {
                ku2Var.p = true;
            }
            this.t0.t0();
        }
        if (!this.t0.isLayoutRequested() && viewD != null && e1(viewD) == i) {
            this.E0 |= 32;
            C1(viewD, viewD.findFocus(), z, 0, 0);
            this.E0 &= -33;
        } else {
            this.G0 = i;
            this.J0 = Integer.MIN_VALUE;
            this.E0 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            K0();
        }
    }

    public final void B1(View view, View view2, boolean z) {
        C1(view, view2, z, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.j
    public final boolean C0(k kVar, q96 q96Var, int i, Bundle bundle) {
        if ((this.E0 & 131072) != 0) {
            x1(kVar, q96Var);
            boolean z = (this.E0 & 262144) != 0;
            if (this.u0) {
                if (i == a4.o.a()) {
                    i = 8192;
                } else if (i == a4.q.a()) {
                    i = 4096;
                }
            } else if (i == a4.p.a()) {
                if (z) {
                    i = 4096;
                } else {
                    i = 8192;
                }
            } else if (i == a4.r.a()) {
                if (z) {
                    i = 8192;
                } else {
                    i = 4096;
                }
            }
            int i2 = this.G0;
            boolean z2 = i2 == 0 && i == 8192;
            boolean z3 = i2 == q96Var.b() - 1 && i == 4096;
            if (z2 || z3) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(4096);
                this.t0.onInitializeAccessibilityEvent(accessibilityEventObtain);
                b20 b20Var = this.t0;
                b20Var.requestSendAccessibilityEvent(b20Var, accessibilityEventObtain);
            } else if (i == 4096) {
                s1(true);
                u1(1, false);
            } else if (i == 8192) {
                s1(false);
                u1(-1, false);
            }
            p1();
        }
        return true;
    }

    public final void C1(View view, View view2, boolean z, int i, int i2) {
        if ((this.E0 & 64) != 0) {
            return;
        }
        int iE1 = e1(view);
        if (view != null && view2 != null) {
            ((lu2) view.getLayoutParams()).getClass();
        }
        if (iE1 != this.G0) {
            this.G0 = iE1;
            this.J0 = 0;
            if ((this.E0 & 3) != 1) {
                b1();
            }
            if (this.t0.Q()) {
                this.t0.invalidate();
            }
        }
        if (view == null) {
            return;
        }
        if (!view.hasFocus() && this.t0.hasFocus()) {
            view.requestFocus();
        }
        if ((this.E0 & 131072) == 0 && z) {
            return;
        }
        int[] iArr = i1;
        if (!k1(view, view2, iArr) && i == 0 && i2 == 0) {
            return;
        }
        int i3 = iArr[0] + i;
        int i4 = iArr[1] + i2;
        if ((this.E0 & 3) == 1) {
            y1(i3);
            z1(i4);
            return;
        }
        if (this.u0) {
            i4 = i3;
            i3 = i4;
        }
        b20 b20Var = this.t0;
        if (z) {
            b20Var.n0(i3, i4, false);
        } else {
            b20Var.scrollBy(i3, i4);
            c1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D1(int i) {
        if (i == 0 || i == 1) {
            this.u0 = i;
            this.v0 = td5.b(this, i);
            yr6 yr6Var = this.Z0;
            m09 m09Var = (m09) yr6Var.Y;
            m09 m09Var2 = (m09) yr6Var.Z;
            if (i == 0) {
                yr6Var.f0 = m09Var2;
                yr6Var.g0 = m09Var;
            } else {
                yr6Var.f0 = m09Var;
                yr6Var.g0 = m09Var2;
            }
            f63 f63Var = this.a1;
            f63Var.getClass();
            if (i == 0) {
                f63Var.f0 = (mi3) f63Var.Z;
            } else {
                f63Var.f0 = (mi3) f63Var.Y;
            }
            this.E0 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final void E0(k kVar) {
        for (int I = I() - 1; I >= 0; I--) {
            H0(I, kVar);
        }
    }

    public final void E1(int i) {
        if (i >= 0 || i == -2) {
            this.M0 = i;
        } else {
            bt.q(pc6.j(i, "Invalid row height: "));
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final RecyclerView.LayoutParams F(Context context, AttributeSet attributeSet) {
        return new lu2(context, attributeSet);
    }

    public final void F1(int i, boolean z) {
        if (this.G0 == i || i == -1) {
            return;
        }
        A1(i, z);
    }

    @Override // androidx.recyclerview.widget.j
    public final RecyclerView.LayoutParams G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof lu2) {
            return new lu2((lu2) layoutParams);
        }
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new lu2((RecyclerView.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new lu2((ViewGroup.MarginLayoutParams) layoutParams) : new lu2(layoutParams);
    }

    public final void G1() {
        int I = I();
        for (int i = 0; i < I; i++) {
            H1(H(i));
        }
    }

    public final void H1(View view) {
        lu2 lu2Var = (lu2) view.getLayoutParams();
        lu2Var.getClass();
        f63 f63Var = this.a1;
        mi3 mi3Var = (mi3) f63Var.Z;
        lu2Var.k0 = ni3.a(view, mi3Var, mi3Var.e ? 1 : 0);
        mi3 mi3Var2 = (mi3) f63Var.Y;
        lu2Var.l0 = ni3.a(view, mi3Var2, mi3Var2.e ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean I0(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return false;
    }

    public final void I1() {
        if (I() <= 0) {
            this.y0 = 0;
        } else {
            this.y0 = this.X0.f - ((lu2) H(0).getLayoutParams()).X.c();
        }
    }

    public final void J1() {
        int i = (this.E0 & (-1025)) | (t1(false) ? 1024 : 0);
        this.E0 = i;
        if ((i & 1024) != 0) {
            b20 b20Var = this.t0;
            WeakHashMap weakHashMap = cw8.a;
            b20Var.postOnAnimation(this.f1);
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final int K(k kVar, q96 q96Var) {
        iu2 iu2Var;
        return (!this.u0 || (iu2Var = this.X0) == null) ? super.K(kVar, q96Var) : iu2Var.e;
    }

    public final void K1() {
        int i;
        int i2;
        int iB;
        int iB2;
        int i3;
        int i4;
        int top;
        int i5;
        int top2;
        int i6;
        if (this.x0.b() == 0) {
            return;
        }
        int i7 = this.E0 & 262144;
        iu2 iu2Var = this.X0;
        if (i7 == 0) {
            i = iu2Var.g;
            iB2 = this.x0.b() - 1;
            i2 = this.X0.f;
            iB = 0;
        } else {
            i = iu2Var.f;
            i2 = iu2Var.g;
            iB = this.x0.b() - 1;
            iB2 = 0;
        }
        if (i < 0 || i2 < 0) {
            return;
        }
        boolean z = i == iB2;
        boolean z2 = i2 == iB;
        int i8 = Integer.MIN_VALUE;
        int iG = Integer.MAX_VALUE;
        yr6 yr6Var = this.Z0;
        if (!z) {
            m09 m09Var = (m09) yr6Var.f0;
            if (m09Var.a == Integer.MAX_VALUE && !z2 && m09Var.b == Integer.MIN_VALUE) {
                return;
            }
        }
        int[] iArr = i1;
        if (z) {
            iG = this.X0.g(true, iArr);
            View viewD = D(iArr[1]);
            if (this.u0) {
                lu2 lu2Var = (lu2) viewD.getLayoutParams();
                lu2Var.getClass();
                top2 = viewD.getTop() + lu2Var.h0;
                i6 = lu2Var.l0;
            } else {
                lu2 lu2Var2 = (lu2) viewD.getLayoutParams();
                lu2Var2.getClass();
                top2 = viewD.getLeft() + lu2Var2.g0;
                i6 = lu2Var2.k0;
            }
            i3 = top2 + i6;
            ((lu2) viewD.getLayoutParams()).getClass();
        } else {
            i3 = Integer.MAX_VALUE;
        }
        if (z2) {
            i8 = this.X0.i(false, iArr);
            View viewD2 = D(iArr[1]);
            if (this.u0) {
                lu2 lu2Var3 = (lu2) viewD2.getLayoutParams();
                lu2Var3.getClass();
                top = viewD2.getTop() + lu2Var3.h0;
                i5 = lu2Var3.l0;
            } else {
                lu2 lu2Var4 = (lu2) viewD2.getLayoutParams();
                lu2Var4.getClass();
                top = viewD2.getLeft() + lu2Var4.g0;
                i5 = lu2Var4.k0;
            }
            i4 = top + i5;
        } else {
            i4 = Integer.MIN_VALUE;
        }
        ((m09) yr6Var.f0).c(i8, iG, i4, i3);
    }

    @Override // androidx.recyclerview.widget.j
    public final int L(View view) {
        return super.L(view) - ((lu2) view.getLayoutParams()).j0;
    }

    public final void L1() {
        m09 m09Var = (m09) this.Z0.g0;
        int i = m09Var.j - this.L0;
        int iL1 = l1() + i;
        m09Var.c(i, iL1, i, iL1);
    }

    @Override // androidx.recyclerview.widget.j
    public final void M(View view, Rect rect) {
        super.M(view, rect);
        lu2 lu2Var = (lu2) view.getLayoutParams();
        rect.left += lu2Var.g0;
        rect.top += lu2Var.h0;
        rect.right -= lu2Var.i0;
        rect.bottom -= lu2Var.j0;
    }

    @Override // androidx.recyclerview.widget.j
    public final int M0(int i, q96 q96Var, k kVar) {
        if ((this.E0 & 512) == 0 || this.X0 == null) {
            return 0;
        }
        x1(kVar, q96Var);
        this.E0 = (this.E0 & (-4)) | 2;
        int iY1 = !this.u0 ? y1(i) : z1(i);
        p1();
        this.E0 &= -4;
        return iY1;
    }

    @Override // androidx.recyclerview.widget.j
    public final int N(View view) {
        return super.N(view) + ((lu2) view.getLayoutParams()).g0;
    }

    @Override // androidx.recyclerview.widget.j
    public final void N0(int i) {
        F1(i, false);
    }

    @Override // androidx.recyclerview.widget.j
    public final int O0(int i, q96 q96Var, k kVar) {
        int i2 = this.E0;
        if ((i2 & 512) == 0 || this.X0 == null) {
            return 0;
        }
        this.E0 = (i2 & (-4)) | 2;
        x1(kVar, q96Var);
        int iY1 = this.u0 ? y1(i) : z1(i);
        p1();
        this.E0 &= -4;
        return iY1;
    }

    @Override // androidx.recyclerview.widget.j
    public final int Q(View view) {
        return super.Q(view) - ((lu2) view.getLayoutParams()).i0;
    }

    @Override // androidx.recyclerview.widget.j
    public final int R(View view) {
        return super.R(view) + ((lu2) view.getLayoutParams()).h0;
    }

    @Override // androidx.recyclerview.widget.j
    public final int V(k kVar, q96 q96Var) {
        iu2 iu2Var;
        return (this.u0 || (iu2Var = this.X0) == null) ? super.V(kVar, q96Var) : iu2Var.e;
    }

    @Override // androidx.recyclerview.widget.j
    public final void X0(RecyclerView recyclerView, int i) {
        F1(i, true);
    }

    @Override // androidx.recyclerview.widget.j
    public final void Y0(androidx.recyclerview.widget.c cVar) {
        ku2 ku2Var = this.H0;
        if (ku2Var != null) {
            ku2Var.p = true;
        }
        super.Y0(cVar);
        if (!cVar.e || !(cVar instanceof ku2)) {
            this.H0 = null;
            this.I0 = null;
            return;
        }
        ku2 ku2Var2 = (ku2) cVar;
        this.H0 = ku2Var2;
        if (ku2Var2 instanceof mu2) {
            this.I0 = (mu2) ku2Var2;
        } else {
            this.I0 = null;
        }
    }

    public final void a1() {
        this.X0.b((this.E0 & 262144) != 0 ? (-this.c1) - this.z0 : this.b1 + this.c1 + this.z0, false);
    }

    public final void b1() {
        ArrayList arrayList = this.F0;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int i = this.G0;
        View viewD = i == -1 ? null : D(i);
        b20 b20Var = this.t0;
        if (viewD != null) {
            d1(this.t0, b20Var.M(viewD), this.G0);
        } else {
            d1(b20Var, null, -1);
        }
        if ((this.E0 & 3) == 1 || this.t0.isLayoutRequested()) {
            return;
        }
        int I = I();
        for (int i2 = 0; i2 < I; i2++) {
            if (H(i2).isLayoutRequested()) {
                b20 b20Var2 = this.t0;
                WeakHashMap weakHashMap = cw8.a;
                b20Var2.postOnAnimation(this.f1);
                return;
            }
        }
    }

    public final void c1() {
        ArrayList arrayList = this.F0;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int i = this.G0;
        View viewD = i == -1 ? null : D(i);
        b20 b20Var = this.t0;
        if (viewD == null) {
            ArrayList arrayList2 = this.F0;
            if (arrayList2 == null) {
                return;
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((ea5) this.F0.get(size)).getClass();
            }
            return;
        }
        b20Var.M(viewD);
        ArrayList arrayList3 = this.F0;
        if (arrayList3 == null) {
            return;
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ((ea5) this.F0.get(size2)).getClass();
        }
    }

    public final void d1(RecyclerView recyclerView, l lVar, int i) {
        ArrayList arrayList = this.F0;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zm5 zm5Var = (zm5) ((ea5) this.F0.get(size));
            zm5Var.getClass();
            Picker picker = zm5Var.a;
            int iIndexOf = picker.g0.indexOf((VerticalGridView) recyclerView);
            picker.d(iIndexOf);
            if (lVar != null) {
                int i2 = ((cn5) picker.h0.get(iIndexOf)).b + i;
                DatePicker datePicker = (DatePicker) picker;
                datePicker.G0.setTimeInMillis(datePicker.F0.getTimeInMillis());
                ArrayList arrayList2 = datePicker.h0;
                int i3 = (arrayList2 == null ? null : (cn5) arrayList2.get(iIndexOf)).a;
                if (iIndexOf == datePicker.z0) {
                    datePicker.G0.add(5, i2 - i3);
                } else if (iIndexOf == datePicker.y0) {
                    datePicker.G0.add(2, i2 - i3);
                } else {
                    if (iIndexOf != datePicker.A0) {
                        kp5.e();
                        return;
                    }
                    datePicker.G0.add(1, i2 - i3);
                }
                datePicker.g(datePicker.G0.get(1), datePicker.G0.get(2), datePicker.G0.get(5));
            }
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final void e0(f fVar) {
        if (fVar != null) {
            this.X0 = null;
            this.O0 = null;
            this.E0 &= -1025;
            this.G0 = -1;
            this.J0 = 0;
            ej4 ej4Var = (ej4) this.e1.f0;
            if (ej4Var != null) {
                ej4Var.d(-1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    @Override // androidx.recyclerview.widget.j
    public final boolean f0(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        int i3;
        View viewH;
        boolean z;
        char c;
        char c2;
        b20 b20Var;
        View viewC;
        boolean z2 = true;
        if ((this.E0 & 32768) == 0) {
            if (!recyclerView.hasFocus()) {
                int size = arrayList.size();
                if (this.Y0 != 0) {
                    m09 m09Var = (m09) this.Z0.f0;
                    int i4 = m09Var.j;
                    int i5 = ((m09Var.i - i4) - m09Var.k) + i4;
                    int I = I();
                    for (int i6 = 0; i6 < I; i6++) {
                        View viewH2 = H(i6);
                        if (viewH2.getVisibility() == 0 && this.v0.g(viewH2) >= i4 && this.v0.d(viewH2) <= i5) {
                            viewH2.addFocusables(arrayList, i, i2);
                        }
                    }
                    if (arrayList.size() == size) {
                        int I2 = I();
                        for (int i7 = 0; i7 < I2; i7++) {
                            View viewH3 = H(i7);
                            if (viewH3.getVisibility() == 0) {
                                viewH3.addFocusables(arrayList, i, i2);
                            }
                        }
                    }
                } else {
                    View viewD = D(this.G0);
                    if (viewD != null) {
                        viewD.addFocusables(arrayList, i, i2);
                    }
                }
                if (arrayList.size() != size || !recyclerView.isFocusable()) {
                    return true;
                }
                arrayList.add(recyclerView);
                return true;
            }
            if (this.I0 == null) {
                int iH1 = h1(i);
                View viewFindFocus = recyclerView.findFocus();
                if (viewFindFocus == null || (b20Var = this.t0) == null || viewFindFocus == b20Var || (viewC = C(viewFindFocus)) == null) {
                    i3 = -1;
                    break;
                }
                int I3 = I();
                i3 = 0;
                while (true) {
                    if (i3 >= I3) {
                        i3 = -1;
                        break;
                    }
                    if (H(i3) == viewC) {
                        break;
                    }
                    i3++;
                }
                int iE1 = e1(H(i3));
                View viewD2 = iE1 == -1 ? null : D(iE1);
                if (viewD2 != null) {
                    viewD2.addFocusables(arrayList, i, i2);
                }
                if (this.X0 != null && I() != 0) {
                    char c3 = 2;
                    char c4 = 3;
                    if ((iH1 != 3 && iH1 != 2) || this.X0.e > 1) {
                        iu2 iu2Var = this.X0;
                        int i8 = (iu2Var == null || viewD2 == null) ? -1 : iu2Var.k(iE1).Y;
                        int size2 = arrayList.size();
                        int i9 = (iH1 == 1 || iH1 == 3) ? 1 : -1;
                        int I4 = i9 > 0 ? I() - 1 : 0;
                        int I5 = i3 == -1 ? i9 > 0 ? 0 : I() - 1 : i3 + i9;
                        while (true) {
                            if (i9 <= 0) {
                                if (I5 < I4) {
                                    break;
                                }
                                viewH = H(I5);
                                if (viewH.getVisibility() == 0) {
                                    z = z2;
                                    c = c3;
                                    c2 = c4;
                                } else {
                                    z = z2;
                                    c = c3;
                                    c2 = c4;
                                }
                                I5 += i9;
                                c4 = c2;
                                c3 = c;
                                z2 = z;
                            } else {
                                if (I5 > I4) {
                                    break;
                                }
                                viewH = H(I5);
                                if (viewH.getVisibility() == 0 || !viewH.hasFocusable()) {
                                    z = z2;
                                    c = c3;
                                    c2 = c4;
                                } else if (viewD2 == null) {
                                    viewH.addFocusables(arrayList, i, i2);
                                    if (arrayList.size() > size2) {
                                        break;
                                    }
                                    z = z2;
                                    c = c3;
                                    c2 = c4;
                                } else {
                                    int iE2 = e1(H(I5));
                                    r75 r75VarK = this.X0.k(iE2);
                                    if (r75VarK == null) {
                                        z = z2;
                                        c = 2;
                                        c2 = 3;
                                    } else {
                                        int i10 = r75VarK.Y;
                                        if (iH1 == z2) {
                                            if (i10 == i8 && iE2 > iE1) {
                                                viewH.addFocusables(arrayList, i, i2);
                                                if (arrayList.size() > size2) {
                                                    break;
                                                }
                                            }
                                            z = z2;
                                            c = 2;
                                            c2 = 3;
                                        } else if (iH1 == 0) {
                                            if (i10 == i8 && iE2 < iE1) {
                                                viewH.addFocusables(arrayList, i, i2);
                                                if (arrayList.size() > size2) {
                                                    break;
                                                }
                                            }
                                            z = z2;
                                            c = 2;
                                            c2 = 3;
                                        } else {
                                            c2 = 3;
                                            if (iH1 == 3) {
                                                if (i10 != i8) {
                                                    if (i10 < i8) {
                                                        break;
                                                    }
                                                    viewH.addFocusables(arrayList, i, i2);
                                                }
                                                z = z2;
                                                c = 2;
                                            } else {
                                                z = z2;
                                                c = 2;
                                                if (iH1 == 2 && i10 != i8) {
                                                    if (i10 > i8) {
                                                        return z;
                                                    }
                                                    viewH.addFocusables(arrayList, i, i2);
                                                }
                                            }
                                        }
                                    }
                                }
                                I5 += i9;
                                c4 = c2;
                                c3 = c;
                                z2 = z;
                            }
                        }
                    }
                }
            }
        }
        return z2;
    }

    public final int h1(int i) {
        boolean z = this.u0;
        if (z) {
            if (z) {
                if (i == 17) {
                    return (this.E0 & 524288) == 0 ? 2 : 3;
                }
                if (i == 33) {
                    return 0;
                }
                if (i == 66) {
                    return (this.E0 & 524288) == 0 ? 3 : 2;
                }
                if (i == 130) {
                    return 1;
                }
            }
        }
        if (i != 17) {
            if (i == 33) {
                return 2;
            }
            if (i != 66) {
                return i != 130 ? 17 : 3;
            }
            if ((this.E0 & 262144) != 0) {
                return 0;
            }
        } else if ((this.E0 & 262144) == 0) {
            return 0;
        }
        return 1;
    }

    public final int i1(int i) {
        int i2 = this.N0;
        if (i2 != 0) {
            return i2;
        }
        int[] iArr = this.O0;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    public final int j1(int i) {
        int iI1 = 0;
        if ((this.E0 & 524288) != 0) {
            for (int i2 = this.V0 - 1; i2 > i; i2--) {
                iI1 += i1(i2) + this.T0;
            }
            return iI1;
        }
        int iI2 = 0;
        while (iI1 < i) {
            iI2 += i1(iI1) + this.T0;
            iI1++;
        }
        return iI2;
    }

    @Override // androidx.recyclerview.widget.j
    public final void k0(k kVar, q96 q96Var, h4 h4Var) {
        x1(kVar, q96Var);
        int iB = q96Var.b();
        int i = this.E0;
        boolean z = (262144 & i) != 0;
        if ((i & 2048) == 0 || (iB > 1 && !n1(0))) {
            if (this.u0) {
                h4Var.b(a4.o);
            } else {
                h4Var.b(z ? a4.r : a4.p);
            }
            h4Var.u(true);
        }
        if ((this.E0 & 4096) == 0 || (iB > 1 && !n1(iB - 1))) {
            if (this.u0) {
                h4Var.b(a4.q);
            } else {
                h4Var.b(z ? a4.p : a4.r);
            }
            h4Var.u(true);
        }
        h4Var.n(f4.a(V(kVar, q96Var), K(kVar, q96Var), 0));
        h4Var.m(GridView.class.getName());
        p1();
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0156  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x015f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    public final boolean k1(View view, View view2, int[] iArr) {
        View viewD;
        int i;
        int iD;
        int left;
        int i2;
        int iB;
        int top;
        int i3;
        int left2;
        int i4;
        int i5 = this.Y0;
        yr6 yr6Var = this.Z0;
        if (i5 != 1 && i5 != 2) {
            m09 m09Var = (m09) yr6Var.f0;
            if (this.u0) {
                lu2 lu2Var = (lu2) view.getLayoutParams();
                lu2Var.getClass();
                top = view.getTop() + lu2Var.h0;
                i3 = lu2Var.l0;
            } else {
                lu2 lu2Var2 = (lu2) view.getLayoutParams();
                lu2Var2.getClass();
                top = view.getLeft() + lu2Var2.g0;
                i3 = lu2Var2.k0;
            }
            int iB2 = m09Var.b(top + i3);
            if (view2 != null) {
                ((lu2) view.getLayoutParams()).getClass();
            }
            if (this.u0) {
                lu2 lu2Var3 = (lu2) view.getLayoutParams();
                lu2Var3.getClass();
                left2 = view.getLeft() + lu2Var3.g0;
                i4 = lu2Var3.k0;
            } else {
                lu2 lu2Var4 = (lu2) view.getLayoutParams();
                lu2Var4.getClass();
                left2 = view.getTop() + lu2Var4.h0;
                i4 = lu2Var4.l0;
            }
            int iB3 = ((m09) yr6Var.g0).b(left2 + i4);
            if (iB2 == 0 && iB3 == 0) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
            iArr[0] = iB2;
            iArr[1] = iB3;
            return true;
        }
        int iE1 = e1(view);
        int iG = this.v0.g(view);
        int iD2 = this.v0.d(view);
        m09 m09Var2 = (m09) yr6Var.f0;
        int i6 = m09Var2.j;
        int i7 = (m09Var2.i - i6) - m09Var2.k;
        r75 r75VarK = this.X0.k(iE1);
        int i8 = r75VarK == null ? -1 : r75VarK.Y;
        View viewD2 = null;
        if (iG < i6) {
            if (this.Y0 == 2) {
                View view3 = view;
                while (true) {
                    iu2 iu2Var = this.X0;
                    if (!iu2Var.m(iu2Var.c ? Integer.MIN_VALUE : Integer.MAX_VALUE, true)) {
                        viewD = null;
                        viewD2 = view3;
                        break;
                    }
                    iu2 iu2Var2 = this.X0;
                    cb0 cb0Var = iu2Var2.j(iu2Var2.f, iE1)[i8];
                    View viewD3 = D(cb0Var.q(0));
                    if (iD2 - this.v0.g(viewD3) > i7) {
                        if ((cb0Var.Y & cb0Var.Z) <= 2) {
                            viewD = null;
                            viewD2 = viewD3;
                            break;
                        }
                        viewD = null;
                        viewD2 = D(cb0Var.q(2));
                        break;
                    }
                    view3 = viewD3;
                }
            } else {
                viewD = null;
                viewD2 = view;
            }
        } else if (iD2 <= i7 + i6) {
            viewD = null;
        } else if (this.Y0 == 2) {
            do {
                iu2 iu2Var3 = this.X0;
                cb0 cb0Var2 = iu2Var3.j(iE1, iu2Var3.g)[i8];
                viewD = D(cb0Var2.q((cb0Var2.Y & cb0Var2.Z) - 1));
                if (this.v0.d(viewD) - iG > i7) {
                    viewD = null;
                    break;
                }
            } while (this.X0.a());
            if (viewD == null) {
                viewD2 = view;
            }
        } else {
            viewD = view;
        }
        if (viewD2 == null) {
            if (viewD != null) {
                iD = this.v0.d(viewD);
                i6 += i7;
            } else {
                i = 0;
            }
            if (viewD2 != null) {
                view = viewD2;
            } else if (viewD != null) {
                view = viewD;
            }
            if (this.u0) {
                lu2 lu2Var5 = (lu2) view.getLayoutParams();
                lu2Var5.getClass();
                left = view.getLeft() + lu2Var5.g0;
                i2 = lu2Var5.k0;
            } else {
                lu2 lu2Var6 = (lu2) view.getLayoutParams();
                lu2Var6.getClass();
                left = view.getTop() + lu2Var6.h0;
                i2 = lu2Var6.l0;
            }
            iB = ((m09) yr6Var.g0).b(left + i2);
            if (i != 0 && iB == 0) {
                return false;
            }
            iArr[0] = i;
            iArr[1] = iB;
            return true;
        }
        iD = this.v0.g(viewD2);
        i = iD - i6;
        if (viewD2 != null) {
            view = viewD2;
        } else if (viewD != null) {
            view = viewD;
        }
        if (this.u0) {
            lu2 lu2Var7 = (lu2) view.getLayoutParams();
            lu2Var7.getClass();
            left = view.getTop() + lu2Var7.h0;
            i2 = lu2Var7.l0;
        } else {
            lu2 lu2Var8 = (lu2) view.getLayoutParams();
            lu2Var8.getClass();
            left = view.getLeft() + lu2Var8.g0;
            i2 = lu2Var8.k0;
        }
        iB = ((m09) yr6Var.g0).b(left + i2);
        if (i != 0) {
        }
        iArr[0] = i;
        iArr[1] = iB;
        return true;
    }

    public final int l1() {
        int i = (this.E0 & 524288) != 0 ? 0 : this.V0 - 1;
        return i1(i) + j1(i);
    }

    @Override // androidx.recyclerview.widget.j
    public final void m0(k kVar, q96 q96Var, View view, h4 h4Var) {
        r75 r75VarK;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.X0 == null || !(layoutParams instanceof lu2)) {
            return;
        }
        int iB = ((lu2) layoutParams).X.b();
        int i = -1;
        if (iB >= 0 && (r75VarK = this.X0.k(iB)) != null) {
            i = r75VarK.Y;
        }
        if (i < 0) {
            return;
        }
        int i2 = iB / this.X0.e;
        if (this.u0) {
            h4Var.o(g4.a(i2, false, 1, i, 1));
        } else {
            h4Var.o(g4.a(i, false, 1, i2, 1));
        }
    }

    public final boolean m1() {
        int iS = S();
        return iS == 0 || this.t0.I(iS - 1) != null;
    }

    @Override // androidx.recyclerview.widget.j
    public final View n0(View view, int i) {
        View viewFindNextFocus;
        View viewFindNextFocus2;
        if ((this.E0 & 32768) != 0) {
            return view;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (i == 2 || i == 1) {
            if (q()) {
                viewFindNextFocus = focusFinder.findNextFocus(this.t0, view, i == 2 ? 130 : 33);
            } else {
                viewFindNextFocus = null;
            }
            if (p()) {
                viewFindNextFocus2 = focusFinder.findNextFocus(this.t0, view, (this.Y.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17);
            } else {
                viewFindNextFocus2 = viewFindNextFocus;
            }
        } else {
            viewFindNextFocus2 = focusFinder.findNextFocus(this.t0, view, i);
        }
        if (viewFindNextFocus2 != null) {
            return viewFindNextFocus2;
        }
        int descendantFocusability = this.t0.getDescendantFocusability();
        b20 b20Var = this.t0;
        if (descendantFocusability == 393216) {
            return b20Var.getParent().focusSearch(view, i);
        }
        int iH1 = h1(i);
        boolean z = b20Var.getScrollState() != 0;
        if (iH1 == 1) {
            if (z || (this.E0 & 4096) == 0) {
                viewFindNextFocus2 = view;
            }
            if ((this.E0 & 131072) != 0 && !m1()) {
                s1(true);
                viewFindNextFocus2 = view;
            }
        } else if (iH1 == 0) {
            if (z || (this.E0 & 2048) == 0) {
                viewFindNextFocus2 = view;
            }
            if ((this.E0 & 131072) != 0 && S() != 0 && this.t0.I(0) == null) {
                s1(false);
                viewFindNextFocus2 = view;
            }
        } else if (iH1 == 3) {
        }
        if (viewFindNextFocus2 != null) {
            return viewFindNextFocus2;
        }
        View viewFocusSearch = this.t0.getParent().focusSearch(view, i);
        if (viewFocusSearch != null) {
            return viewFocusSearch;
        }
        return view != null ? view : this.t0;
    }

    public final boolean n1(int i) {
        l lVarI = this.t0.I(i);
        if (lVarI == null) {
            return false;
        }
        View view = lVarI.a;
        return view.getLeft() >= 0 && view.getRight() <= this.t0.getWidth() && view.getTop() >= 0 && view.getBottom() <= this.t0.getHeight();
    }

    @Override // androidx.recyclerview.widget.j
    public final void o0(int i, int i2) {
        iu2 iu2Var;
        int i3;
        int i4 = this.G0;
        if (i4 != -1 && (iu2Var = this.X0) != null && iu2Var.f >= 0 && (i3 = this.J0) != Integer.MIN_VALUE && i <= i4 + i3) {
            this.J0 = i3 + i2;
        }
        ej4 ej4Var = (ej4) this.e1.f0;
        if (ej4Var != null) {
            ej4Var.d(-1);
        }
    }

    public final void o1(View view, int i, int i2, int i3, int i4) {
        int iI1;
        int i5;
        int iF1 = !this.u0 ? f1(view) : g1(view);
        int i6 = this.N0;
        if (i6 > 0) {
            iF1 = Math.min(iF1, i6);
        }
        int i7 = this.U0;
        int i8 = i7 & 112;
        int absoluteGravity = (this.E0 & 786432) != 0 ? Gravity.getAbsoluteGravity(i7 & 8388615, 1) : i7 & 7;
        boolean z = this.u0;
        if ((z || i8 != 48) && (!z || absoluteGravity != 3)) {
            if ((!z && i8 == 80) || (z && absoluteGravity == 5)) {
                iI1 = i1(i) - iF1;
            } else if ((!z && i8 == 16) || (z && absoluteGravity == 1)) {
                iI1 = (i1(i) - iF1) / 2;
            }
            i4 += iI1;
        }
        if (this.u0) {
            int i9 = iF1 + i4;
            int i10 = i4;
            i4 = i2;
            i2 = i10;
            i5 = i3;
            i3 = i9;
        } else {
            i5 = iF1 + i4;
        }
        lu2 lu2Var = (lu2) view.getLayoutParams();
        j.b0(view, i2, i4, i3, i5);
        Rect rect = h1;
        super.M(view, rect);
        int i11 = i2 - rect.left;
        int i12 = i4 - rect.top;
        int i13 = rect.right - i3;
        int i14 = rect.bottom - i5;
        lu2Var.g0 = i11;
        lu2Var.h0 = i12;
        lu2Var.i0 = i13;
        lu2Var.j0 = i14;
        H1(view);
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean p() {
        return !this.u0 || this.V0 > 1;
    }

    @Override // androidx.recyclerview.widget.j
    public final void p0() {
        this.J0 = 0;
        ej4 ej4Var = (ej4) this.e1.f0;
        if (ej4Var != null) {
            ej4Var.d(-1);
        }
    }

    public final void p1() {
        int i = this.w0 - 1;
        this.w0 = i;
        if (i == 0) {
            this.D0 = null;
            this.x0 = null;
            this.y0 = 0;
            this.z0 = 0;
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean q() {
        return this.u0 || this.V0 > 1;
    }

    @Override // androidx.recyclerview.widget.j
    public final void q0(int i, int i2) {
        int i3;
        int i4 = this.G0;
        if (i4 != -1 && (i3 = this.J0) != Integer.MIN_VALUE) {
            int i5 = i4 + i3;
            if (i <= i5 && i5 < i + 1) {
                this.J0 = (i2 - i) + i3;
            } else if (i < i5 && i2 > i5 - 1) {
                this.J0 = i3 - 1;
            } else if (i > i5 && i2 < i5) {
                this.J0 = i3 + 1;
            }
        }
        ej4 ej4Var = (ej4) this.e1.f0;
        if (ej4Var != null) {
            ej4Var.d(-1);
        }
    }

    public final void q1(View view) {
        int childMeasureSpec;
        int childMeasureSpec2;
        lu2 lu2Var = (lu2) view.getLayoutParams();
        Rect rect = h1;
        o(view, rect);
        int i = ((ViewGroup.MarginLayoutParams) lu2Var).leftMargin + ((ViewGroup.MarginLayoutParams) lu2Var).rightMargin + rect.left + rect.right;
        int i2 = ((ViewGroup.MarginLayoutParams) lu2Var).topMargin + ((ViewGroup.MarginLayoutParams) lu2Var).bottomMargin + rect.top + rect.bottom;
        int iMakeMeasureSpec = this.M0 == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.N0, 1073741824);
        if (this.u0) {
            int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i2, ((ViewGroup.MarginLayoutParams) lu2Var).height);
            int childMeasureSpec4 = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i, ((ViewGroup.MarginLayoutParams) lu2Var).width);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        } else {
            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i, ((ViewGroup.MarginLayoutParams) lu2Var).width);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i2, ((ViewGroup.MarginLayoutParams) lu2Var).height);
        }
        view.measure(childMeasureSpec2, childMeasureSpec);
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean r(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof lu2;
    }

    @Override // androidx.recyclerview.widget.j
    public final void r0(int i, int i2) {
        iu2 iu2Var;
        int i3;
        int i4;
        int i5 = this.G0;
        if (i5 != -1 && (iu2Var = this.X0) != null && iu2Var.f >= 0 && (i3 = this.J0) != Integer.MIN_VALUE && i <= (i4 = i5 + i3)) {
            if (i + i2 > i4) {
                this.G0 = (i - i4) + i3 + i5;
                this.J0 = Integer.MIN_VALUE;
            } else {
                this.J0 = i3 - i2;
            }
        }
        ej4 ej4Var = (ej4) this.e1.f0;
        if (ej4Var != null) {
            ej4Var.d(-1);
        }
    }

    public final void r1() {
        this.X0.m((this.E0 & 262144) != 0 ? this.b1 + this.c1 + this.z0 : (-this.c1) - this.z0, false);
    }

    @Override // androidx.recyclerview.widget.j
    public final void s0(int i, int i2) {
        int i3;
        int i4 = i2 + i;
        while (i < i4) {
            cb0 cb0Var = this.e1;
            ej4 ej4Var = (ej4) cb0Var.f0;
            if (ej4Var != null) {
                synchronized (ej4Var.c) {
                    i3 = ej4Var.d;
                }
                if (i3 != 0) {
                    ((ej4) cb0Var.f0).c(Integer.toString(i));
                }
            }
            i++;
        }
    }

    public final void s1(boolean z) {
        int i;
        if (z) {
            if (m1()) {
                return;
            }
        } else if (S() == 0 || this.t0.I(0) != null) {
            return;
        }
        mu2 mu2Var = this.I0;
        if (mu2Var == null) {
            mu2 mu2Var2 = new mu2(this, z ? 1 : -1, this.V0 > 1);
            this.J0 = 0;
            Y0(mu2Var2);
        } else {
            GridLayoutManager gridLayoutManager = mu2Var.t;
            int i2 = mu2Var.s;
            if (z) {
                if (i2 < gridLayoutManager.s0) {
                    mu2Var.s = i2 + 1;
                }
            } else if (i2 > (-gridLayoutManager.s0)) {
                mu2Var.s = i2 - 1;
            }
        }
        if (this.u0) {
            i = z ? 2 : 1;
        } else {
            i = 4;
            if (this.Y.getLayoutDirection() != 1 ? !z : z) {
                i = 3;
            }
        }
        AudioManager audioManager = this.C0;
        if (audioManager == null) {
            audioManager = (AudioManager) this.t0.getContext().getSystemService("audio");
            this.C0 = audioManager;
        }
        audioManager.playSoundEffect(i);
    }

    @Override // androidx.recyclerview.widget.j
    public final void t(int i, int i2, q96 q96Var, xr0 xr0Var) {
        try {
            x1(null, q96Var);
            if (this.u0) {
                i = i2;
            }
            if (I() != 0 && i != 0) {
                this.X0.e(i < 0 ? -this.c1 : this.b1 + this.c1, i, xr0Var);
            }
        } finally {
            p1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0149  */
    public final boolean t1(boolean z) {
        int i;
        int i2 = 0;
        if (this.N0 != 0 || this.O0 == null) {
            return false;
        }
        iu2 iu2Var = this.X0;
        cb0[] cb0VarArrJ = iu2Var == null ? null : iu2Var.j(iu2Var.f, iu2Var.g);
        int i3 = 0;
        boolean z2 = false;
        int i4 = -1;
        while (i3 < this.V0) {
            cb0 cb0Var = cb0VarArrJ == null ? null : cb0VarArrJ[i3];
            int i5 = cb0Var == null ? i2 : cb0Var.Y & cb0Var.Z;
            int i6 = -1;
            for (int i7 = i2; i7 < i5; i7 += 2) {
                int iQ = cb0Var.q(i7 + 1);
                for (int iQ2 = cb0Var.q(i7); iQ2 <= iQ; iQ2++) {
                    View viewD = D(iQ2 - this.y0);
                    if (viewD != null) {
                        if (z) {
                            q1(viewD);
                        }
                        int iF1 = !this.u0 ? f1(viewD) : g1(viewD);
                        if (iF1 > i6) {
                            i6 = iF1;
                        }
                    }
                }
            }
            int iB = this.x0.b();
            if (this.t0.z0 || !z || i6 >= 0 || iB <= 0) {
                i = i2;
            } else {
                if (i4 >= 0) {
                    i = i2;
                } else {
                    int i8 = this.G0;
                    if (i8 < 0) {
                        i8 = i2;
                    } else if (i8 >= iB) {
                        i8 = iB - 1;
                    }
                    if (I() > 0) {
                        int iC = this.t0.M(H(i2)).c();
                        int iC2 = this.t0.M(H(I() - 1)).c();
                        if (i8 >= iC && i8 <= iC2) {
                            i8 = i8 - iC <= iC2 - i8 ? iC - 1 : iC2 + 1;
                            if (i8 < 0 && iC2 < iB - 1) {
                                i8 = iC2 + 1;
                            } else if (i8 >= iB && iC > 0) {
                                i8 = iC - 1;
                            }
                        }
                    }
                    if (i8 < 0 || i8 >= iB) {
                        i = i2;
                    } else {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, i2);
                        View viewD2 = this.D0.d(i8);
                        int[] iArr = this.d1;
                        if (viewD2 != null) {
                            lu2 lu2Var = (lu2) viewD2.getLayoutParams();
                            Rect rect = h1;
                            o(viewD2, rect);
                            i = i2;
                            viewD2.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lu2Var).leftMargin + ((ViewGroup.MarginLayoutParams) lu2Var).rightMargin + rect.left + rect.right, ((ViewGroup.MarginLayoutParams) lu2Var).width), ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) lu2Var).topMargin + ((ViewGroup.MarginLayoutParams) lu2Var).bottomMargin + rect.top + rect.bottom, ((ViewGroup.MarginLayoutParams) lu2Var).height));
                            iArr[i] = g1(viewD2);
                            iArr[1] = f1(viewD2);
                            this.D0.i(viewD2);
                        } else {
                            i = i2;
                        }
                        i4 = !this.u0 ? iArr[1] : iArr[i];
                    }
                }
                if (i4 >= 0) {
                    i6 = i4;
                }
            }
            if (i6 < 0) {
                i6 = i;
            }
            int[] iArr2 = this.O0;
            if (iArr2[i3] != i6) {
                iArr2[i3] = i6;
                z2 = true;
            }
            i3++;
            i2 = i;
        }
        return z2;
    }

    @Override // androidx.recyclerview.widget.j
    public final void u(int i, xr0 xr0Var) {
        int i2 = this.t0.S1;
        if (i == 0 || i2 == 0) {
            return;
        }
        int iMax = Math.max(0, Math.min(this.G0 - ((i2 - 1) / 2), i - i2));
        for (int i3 = iMax; i3 < i && i3 < iMax + i2; i3++) {
            xr0Var.b(i3, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x033e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0344  */
    /* JADX WARN: Code duplicated, block: B:161:0x034a  */
    /* JADX WARN: Code duplicated, block: B:164:0x036a  */
    /* JADX WARN: Code duplicated, block: B:165:0x036c  */
    /* JADX WARN: Code duplicated, block: B:294:0x05c8 A[PHI: r1
  0x05c8: PHI (r1v30 int) = (r1v29 int), (r1v48 int) binds: [B:286:0x05b0, B:292:0x05c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:296:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:305:0x05f3 A[PHI: r1 r2
  0x05f3: PHI (r1v42 int) = (r1v36 int), (r1v45 int) binds: [B:317:0x061f, B:304:0x05f1] A[DONT_GENERATE, DONT_INLINE]
  0x05f3: PHI (r2v44 int) = (r2v43 int), (r2v47 int) binds: [B:317:0x061f, B:304:0x05f1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.j
    public final void u0(k kVar, q96 q96Var) {
        int i;
        int i2;
        boolean z;
        View view;
        boolean z2;
        int i3;
        iu2 la7Var;
        boolean z3;
        int i4;
        int right;
        int left;
        List list;
        int size;
        iu2 iu2Var;
        int i5;
        int i6;
        r75 r75VarK;
        int i7;
        r75 r75VarK2;
        if (this.V0 != 0 && q96Var.b() >= 0) {
            if ((this.E0 & 64) != 0 && I() > 0) {
                this.E0 |= 128;
                return;
            }
            int i8 = this.E0;
            if ((i8 & 512) == 0) {
                this.X0 = null;
                this.O0 = null;
                this.E0 = i8 & (-1025);
                E0(kVar);
                return;
            }
            this.E0 = (i8 & (-4)) | 1;
            x1(kVar, q96Var);
            int iMax = Integer.MIN_VALUE;
            if (q96Var.g) {
                I1();
                int I = I();
                if (this.X0 != null && I > 0) {
                    int i9 = this.t0.M(H(0)).d;
                    int i10 = this.t0.M(H(I - 1)).d;
                    int iMin = Integer.MAX_VALUE;
                    for (int i11 = 0; i11 < I; i11++) {
                        View viewH = H(i11);
                        lu2 lu2Var = (lu2) viewH.getLayoutParams();
                        this.t0.getClass();
                        l lVarN = RecyclerView.N(viewH);
                        int iB = lVarN != null ? lVarN.b() : -1;
                        if (lu2Var.X.l() || lu2Var.X.i() || viewH.isLayoutRequested() || ((!viewH.hasFocus() && this.G0 == lu2Var.X.b()) || ((viewH.hasFocus() && this.G0 != lu2Var.X.b()) || iB < i9 || iB > i10))) {
                            iMin = Math.min(iMin, this.v0.g(viewH));
                            iMax = Math.max(iMax, this.v0.d(viewH));
                        }
                    }
                    if (iMax > iMin) {
                        this.z0 = iMax - iMin;
                    }
                    a1();
                    r1();
                }
                this.E0 &= -4;
                p1();
                return;
            }
            boolean z4 = q96Var.k;
            SparseIntArray sparseIntArray = this.A0;
            if (z4) {
                sparseIntArray.clear();
                int I2 = I();
                for (int i12 = 0; i12 < I2; i12++) {
                    int i13 = this.t0.M(H(i12)).d;
                    if (i13 >= 0 && (r75VarK2 = this.X0.k(i13)) != null) {
                        sparseIntArray.put(i13, r75VarK2.Y);
                    }
                }
            }
            androidx.recyclerview.widget.c cVar = this.g0;
            boolean z5 = (cVar == null || !cVar.e) && this.Y0 == 0;
            int i14 = this.G0;
            if (i14 != -1 && (i7 = this.J0) != Integer.MIN_VALUE) {
                i14 += i7;
                this.G0 = i14;
            }
            this.J0 = 0;
            View viewD = D(i14);
            int i15 = this.G0;
            boolean zHasFocus = this.t0.hasFocus();
            iu2 iu2Var2 = this.X0;
            int i16 = iu2Var2 != null ? iu2Var2.f : -1;
            int i17 = iu2Var2 != null ? iu2Var2.g : -1;
            boolean z6 = this.u0;
            int i18 = q96Var.o;
            int i19 = q96Var.p;
            if (z6) {
                i = i19;
            } else {
                i = i18;
                i18 = i19;
            }
            int iB2 = this.x0.b();
            if (iB2 == 0) {
                this.G0 = -1;
            } else {
                int i20 = this.G0;
                if (i20 >= iB2) {
                    this.G0 = iB2 - 1;
                } else if (i20 == -1 && iB2 > 0) {
                    this.G0 = 0;
                }
            }
            boolean z7 = this.x0.f;
            yr6 yr6Var = this.Z0;
            if (z7 || (iu2Var = this.X0) == null || iu2Var.f < 0 || (this.E0 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 || iu2Var.e != this.V0) {
                i2 = i18;
                z = z5;
                view = viewD;
                z2 = zHasFocus;
                int i21 = this.E0;
                this.E0 = i21 & (-257);
                iu2 iu2Var3 = this.X0;
                if (iu2Var3 == null || this.V0 != iu2Var3.e) {
                    i3 = this.V0;
                    if (i3 == 1) {
                        la7Var = new la7();
                    } else {
                        ig7 ig7Var = new ig7();
                        ig7Var.j = new xr0(64);
                        ig7Var.k = -1;
                        ig7Var.n(i3);
                        la7Var = ig7Var;
                    }
                    this.X0 = la7Var;
                    la7Var.b = this.g1;
                    if ((this.E0 & 262144) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    la7Var.c = z3;
                } else if (((i21 & 262144) != 0) != iu2Var3.c) {
                    i3 = this.V0;
                    if (i3 == 1) {
                        la7Var = new la7();
                    } else {
                        ig7 ig7Var2 = new ig7();
                        ig7Var2.j = new xr0(64);
                        ig7Var2.k = -1;
                        ig7Var2.n(i3);
                        la7Var = ig7Var2;
                    }
                    this.X0 = la7Var;
                    la7Var.b = this.g1;
                    if ((this.E0 & 262144) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    la7Var.c = z3;
                }
                m09 m09Var = (m09) yr6Var.f0;
                m09 m09Var2 = (m09) yr6Var.Y;
                m09Var.b = Integer.MIN_VALUE;
                m09Var.a = Integer.MAX_VALUE;
                m09 m09Var3 = (m09) yr6Var.Z;
                m09Var3.i = this.p0;
                m09Var2.i = this.q0;
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                m09Var3.j = paddingLeft;
                m09Var3.k = paddingRight;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                m09Var2.j = paddingTop;
                m09Var2.k = paddingBottom;
                this.b1 = ((m09) yr6Var.f0).i;
                this.L0 = 0;
                L1();
                this.X0.d = this.S0;
                B(this.D0);
                iu2 iu2Var4 = this.X0;
                iu2Var4.g = -1;
                iu2Var4.f = -1;
                m09 m09Var4 = (m09) yr6Var.f0;
                m09Var4.b = Integer.MIN_VALUE;
                m09Var4.d = Integer.MIN_VALUE;
                m09Var4.a = Integer.MAX_VALUE;
                m09Var4.c = Integer.MAX_VALUE;
                int i22 = this.E0;
                this.E0 = i22 & (-5);
                this.E0 = (i22 & (-21)) | (z ? 16 : 0);
                if (z && (i16 < 0 || (i4 = this.G0) > i17 || i4 < i16)) {
                    i16 = this.G0;
                    i17 = i16;
                }
                iu2Var4.i = i16;
                if (i17 != -1) {
                    while (this.X0.a() && D(i17) == null) {
                    }
                }
            } else {
                m09 m09Var5 = (m09) yr6Var.Z;
                m09 m09Var6 = (m09) yr6Var.Y;
                m09Var5.i = this.p0;
                m09Var6.i = this.q0;
                int paddingLeft2 = getPaddingLeft();
                int paddingRight2 = getPaddingRight();
                m09Var5.j = paddingLeft2;
                m09Var5.k = paddingRight2;
                int paddingTop2 = getPaddingTop();
                int paddingBottom2 = getPaddingBottom();
                m09Var6.j = paddingTop2;
                m09Var6.k = paddingBottom2;
                this.b1 = ((m09) yr6Var.f0).i;
                L1();
                iu2 iu2Var5 = this.X0;
                iu2Var5.d = this.S0;
                this.E0 |= 4;
                iu2Var5.i = this.G0;
                int I3 = I();
                int i23 = this.X0.f;
                this.E0 &= -9;
                int i24 = i23;
                int i25 = 0;
                while (true) {
                    if (i25 < I3) {
                        View viewH2 = H(i25);
                        if (i24 == e1(viewH2) && (r75VarK = this.X0.k(i24)) != null) {
                            int i26 = i18;
                            int iJ1 = (j1(r75VarK.Y) + ((m09) yr6Var.g0).j) - this.L0;
                            int iG = this.v0.g(viewH2);
                            Rect rect = h1;
                            M(viewH2, rect);
                            int iWidth = !this.u0 ? rect.width() : rect.height();
                            if ((((lu2) viewH2.getLayoutParams()).X.j & 2) != 0) {
                                this.E0 |= 8;
                                L0(this.D0, this.X.j(viewH2), viewH2);
                                viewH2 = this.D0.d(i24);
                                lu2 lu2Var2 = (lu2) viewH2.getLayoutParams();
                                this.t0.M(viewH2);
                                lu2Var2.getClass();
                                m(viewH2, i25, false);
                            }
                            q1(viewH2);
                            int iG1 = !this.u0 ? g1(viewH2) : f1(viewH2);
                            view = viewD;
                            yr6 yr6Var2 = yr6Var;
                            z2 = zHasFocus;
                            int i27 = iG1;
                            i5 = I3;
                            i6 = i25;
                            i2 = i26;
                            z = z5;
                            o1(viewH2, r75VarK.Y, iG, iG + iG1, iJ1);
                            if (iWidth == i27) {
                                i25 = i6 + 1;
                                i24++;
                                I3 = i5;
                                i18 = i2;
                                yr6Var = yr6Var2;
                                z5 = z;
                                zHasFocus = z2;
                                viewD = view;
                            }
                        } else {
                            i2 = i18;
                            i5 = I3;
                            z = z5;
                            view = viewD;
                            z2 = zHasFocus;
                            i6 = i25;
                        }
                        int i28 = this.X0.g;
                        for (int i29 = i5 - 1; i29 >= i6; i29--) {
                            View viewH3 = H(i29);
                            L0(this.D0, this.X.j(viewH3), viewH3);
                        }
                        this.X0.l(i24);
                        if ((this.E0 & DnsOverHttps.MAX_RESPONSE_SIZE) != 0) {
                            a1();
                            int i30 = this.G0;
                            if (i30 >= 0 && i30 <= i28) {
                                while (true) {
                                    iu2 iu2Var6 = this.X0;
                                    if (iu2Var6.g >= this.G0) {
                                        break;
                                    } else {
                                        iu2Var6.a();
                                    }
                                }
                            }
                        } else {
                            while (this.X0.a() && this.X0.g < i28) {
                            }
                        }
                    } else {
                        i2 = i18;
                        z = z5;
                        view = viewD;
                        z2 = zHasFocus;
                    }
                    K1();
                    L1();
                }
            }
            while (true) {
                K1();
                iu2 iu2Var7 = this.X0;
                int i31 = iu2Var7.f;
                int i32 = iu2Var7.g;
                int i33 = -i;
                int i34 = -i2;
                View viewD2 = D(this.G0);
                if (viewD2 != null && z) {
                    C1(viewD2, viewD2.findFocus(), false, i33, i34);
                }
                if (viewD2 != null && z2 && !viewD2.hasFocus()) {
                    viewD2.requestFocus();
                } else if (!z2 && !this.t0.hasFocus()) {
                    if (viewD2 == null || !viewD2.hasFocusable()) {
                        int I4 = I();
                        for (int i35 = 0; i35 < I4; i35++) {
                            viewD2 = H(i35);
                            if (viewD2 != null && viewD2.hasFocusable()) {
                                this.t0.focusableViewAvailable(viewD2);
                                break;
                            }
                        }
                    } else {
                        this.t0.focusableViewAvailable(viewD2);
                    }
                    if (z && viewD2 != null && viewD2.hasFocus()) {
                        C1(viewD2, viewD2.findFocus(), false, i33, i34);
                    }
                }
                a1();
                r1();
                iu2 iu2Var8 = this.X0;
                if (iu2Var8.f == i31 && iu2Var8.g == i32) {
                    break;
                }
            }
            w1();
            v1();
            if (q96Var.k && (size = (list = this.D0.d).size()) != 0) {
                int[] iArr = this.B0;
                if (iArr == null || size > iArr.length) {
                    int length = iArr == null ? 16 : iArr.length;
                    while (length < size) {
                        length <<= 1;
                    }
                    this.B0 = new int[length];
                }
                int i36 = 0;
                for (int i37 = 0; i37 < size; i37++) {
                    int iB3 = ((l) list.get(i37)).b();
                    if (iB3 >= 0) {
                        this.B0[i36] = iB3;
                        i36++;
                    }
                }
                if (i36 > 0) {
                    Arrays.sort(this.B0, 0, i36);
                    iu2 iu2Var9 = this.X0;
                    int[] iArr2 = this.B0;
                    Object[] objArr = iu2Var9.a;
                    int i38 = iu2Var9.g;
                    int iBinarySearch = i38 >= 0 ? Arrays.binarySearch(iArr2, 0, i36, i38) : 0;
                    if (iBinarySearch < 0) {
                        boolean z8 = iu2Var9.c;
                        q02 q02Var = iu2Var9.b;
                        int iH = z8 ? (q02Var.H(i38) - iu2Var9.b.L(i38)) - iu2Var9.d : iu2Var9.d + iu2Var9.b.L(i38) + q02Var.H(i38);
                        for (int i39 = (-iBinarySearch) - 1; i39 < i36; i39++) {
                            int i40 = iArr2[i39];
                            int i41 = sparseIntArray.get(i40);
                            int i42 = i41 < 0 ? 0 : i41;
                            int iB4 = iu2Var9.b.B(i40, true, objArr, true);
                            iu2Var9.b.A(objArr[0], i40, iB4, i42, iH);
                            boolean z9 = iu2Var9.c;
                            int i43 = iu2Var9.d;
                            iH = z9 ? (iH - iB4) - i43 : iH + iB4 + i43;
                        }
                    }
                    int i44 = iu2Var9.f;
                    int iBinarySearch2 = i44 >= 0 ? Arrays.binarySearch(iArr2, 0, i36, i44) : 0;
                    if (iBinarySearch2 < 0) {
                        int i45 = (-iBinarySearch2) - 2;
                        boolean z10 = iu2Var9.c;
                        q02 q02Var2 = iu2Var9.b;
                        int iH2 = z10 ? q02Var2.H(i44) : q02Var2.H(i44);
                        while (i45 >= 0) {
                            int i46 = iArr2[i45];
                            int i47 = sparseIntArray.get(i46);
                            int i48 = i47 < 0 ? 0 : i47;
                            int iB5 = iu2Var9.b.B(i46, false, objArr, true);
                            boolean z11 = iu2Var9.c;
                            int i49 = iu2Var9.d;
                            int i50 = z11 ? iH2 + i49 + iB5 : (iH2 - i49) - iB5;
                            iu2Var9.b.A(objArr[0], i46, iB5, i48, i50);
                            i45--;
                            iH2 = i50;
                        }
                    }
                }
                sparseIntArray.clear();
            }
            int i51 = this.E0;
            if ((i51 & 1024) != 0) {
                this.E0 = i51 & (-1025);
            } else {
                J1();
            }
            int i52 = this.E0;
            if ((i52 & 4) != 0) {
                int i53 = this.G0;
                if (i53 == i15 && D(i53) == view) {
                    i52 = this.E0;
                    if ((i52 & 8) == 0) {
                        if ((i52 & 20) == 16) {
                            b1();
                        }
                    }
                }
                b1();
            } else if ((i52 & 20) == 16) {
                b1();
            }
            c1();
            int i54 = this.E0;
            if ((i54 & 64) != 0) {
                if (this.u0) {
                    right = -this.q0;
                    if (I() > 0 && (left = H(0).getTop()) < 0) {
                        right += left;
                    }
                } else {
                    int i55 = i54 & 262144;
                    int i56 = this.p0;
                    if (i55 == 0) {
                        right = -i56;
                        if (I() > 0 && (left = H(0).getLeft()) < 0) {
                            right += left;
                        }
                    } else if (I() <= 0 || (right = H(0).getRight()) <= i56) {
                        right = i56;
                    }
                }
                y1(right);
            }
            this.E0 &= -4;
            p1();
        }
    }

    public final int u1(int i, boolean z) {
        r75 r75VarK;
        iu2 iu2Var = this.X0;
        if (iu2Var == null) {
            return i;
        }
        int i2 = this.G0;
        int i3 = (i2 == -1 || (r75VarK = iu2Var.k(i2)) == null) ? -1 : r75VarK.Y;
        int I = I();
        View view = null;
        for (int i4 = 0; i4 < I && i != 0; i4++) {
            int i5 = i > 0 ? i4 : (I - 1) - i4;
            View viewH = H(i5);
            if (viewH.getVisibility() == 0 && (!X() || viewH.hasFocusable())) {
                int iE1 = e1(H(i5));
                r75 r75VarK2 = this.X0.k(iE1);
                int i6 = r75VarK2 == null ? -1 : r75VarK2.Y;
                if (i3 == -1) {
                    i2 = iE1;
                    view = viewH;
                    i3 = i6;
                } else if (i6 == i3 && ((i > 0 && iE1 > i2) || (i < 0 && iE1 < i2))) {
                    i = i > 0 ? i - 1 : i + 1;
                    i2 = iE1;
                    view = viewH;
                }
            }
        }
        if (view != null) {
            if (z) {
                if (X()) {
                    this.E0 |= 32;
                    view.requestFocus();
                    this.E0 &= -33;
                }
                this.G0 = i2;
                return i;
            }
            B1(view, view.findFocus(), true);
        }
        return i;
    }

    public final void v1() {
        int i;
        int i2 = this.E0;
        if ((65600 & i2) == 65536) {
            iu2 iu2Var = this.X0;
            int i3 = this.G0;
            if ((i2 & 262144) != 0) {
                i = -this.c1;
            } else {
                i = this.c1 + this.b1;
            }
            while (true) {
                int i4 = iu2Var.g;
                if (i4 >= iu2Var.f && i4 > i3) {
                    boolean z = iu2Var.c;
                    q02 q02Var = iu2Var.b;
                    if (!z) {
                        if (q02Var.H(i4) < i) {
                            break;
                        }
                        iu2Var.b.Q(iu2Var.g);
                        iu2Var.g--;
                    } else {
                        if (q02Var.H(i4) > i) {
                            break;
                        }
                        iu2Var.b.Q(iu2Var.g);
                        iu2Var.g--;
                    }
                } else {
                    break;
                }
            }
            if (iu2Var.g < iu2Var.f) {
                iu2Var.g = -1;
                iu2Var.f = -1;
            }
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final void w0(k kVar, q96 q96Var, int i, int i2) {
        int size;
        int size2;
        int mode;
        int paddingLeft;
        int paddingRight;
        int iL1;
        x1(kVar, q96Var);
        if (this.u0) {
            size = View.MeasureSpec.getSize(i);
            size2 = View.MeasureSpec.getSize(i2);
            mode = View.MeasureSpec.getMode(i);
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        } else {
            size2 = View.MeasureSpec.getSize(i);
            size = View.MeasureSpec.getSize(i2);
            mode = View.MeasureSpec.getMode(i2);
            paddingLeft = getPaddingTop();
            paddingRight = getPaddingBottom();
        }
        int i3 = paddingRight + paddingLeft;
        this.P0 = size;
        int i4 = this.M0;
        if (i4 == -2) {
            int i5 = this.W0;
            if (i5 == 0) {
                i5 = 1;
            }
            this.V0 = i5;
            this.N0 = 0;
            int[] iArr = this.O0;
            if (iArr == null || iArr.length != i5) {
                this.O0 = new int[i5];
            }
            if (this.x0.g) {
                I1();
            }
            t1(true);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(l1() + i3, this.P0);
            } else if (mode == 0) {
                iL1 = l1();
                size = iL1 + i3;
            } else {
                if (mode != 1073741824) {
                    bt.i("wrong spec");
                    return;
                }
                size = this.P0;
            }
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    if (i4 == 0) {
                        i4 = size - i3;
                    }
                    this.N0 = i4;
                    int i6 = this.W0;
                    if (i6 == 0) {
                        i6 = 1;
                    }
                    this.V0 = i6;
                    iL1 = ((i6 - 1) * this.T0) + (i4 * i6);
                    size = iL1 + i3;
                } else if (mode != 1073741824) {
                    bt.i("wrong spec");
                    return;
                }
            }
            int i7 = this.W0;
            if (i7 == 0 && i4 == 0) {
                this.V0 = 1;
                i4 = size - i3;
                this.N0 = i4;
                i7 = 1;
            } else if (i7 == 0) {
                this.N0 = i4;
                int i8 = this.T0;
                i7 = (size + i8) / (i8 + i4);
                this.V0 = i7;
            } else if (i4 == 0) {
                this.V0 = i7;
                i4 = ((size - i3) - ((i7 - 1) * this.T0)) / i7;
                this.N0 = i4;
            } else {
                this.V0 = i7;
                this.N0 = i4;
            }
            if (mode == Integer.MIN_VALUE) {
                int i9 = ((i7 - 1) * this.T0) + (i4 * i7) + i3;
                if (i9 < size) {
                    size = i9;
                }
            }
        }
        boolean z = this.u0;
        RecyclerView recyclerView = this.Y;
        if (z) {
            recyclerView.setMeasuredDimension(size, size2);
        } else {
            recyclerView.setMeasuredDimension(size2, size);
        }
        p1();
    }

    public final void w1() {
        int i = this.E0;
        if ((65600 & i) == 65536) {
            iu2 iu2Var = this.X0;
            int i2 = this.G0;
            int i3 = (i & 262144) != 0 ? this.b1 + this.c1 : -this.c1;
            while (true) {
                int i4 = iu2Var.g;
                int i5 = iu2Var.f;
                if (i4 >= i5 && i5 < i2) {
                    int iL = iu2Var.b.L(i5);
                    boolean z = iu2Var.c;
                    q02 q02Var = iu2Var.b;
                    int i6 = iu2Var.f;
                    if (!z) {
                        if (q02Var.H(i6) + iL > i3) {
                            break;
                        }
                        iu2Var.b.Q(iu2Var.f);
                        iu2Var.f++;
                    } else {
                        if (q02Var.H(i6) - iL < i3) {
                            break;
                        }
                        iu2Var.b.Q(iu2Var.f);
                        iu2Var.f++;
                    }
                } else {
                    break;
                }
            }
            if (iu2Var.g < iu2Var.f) {
                iu2Var.g = -1;
                iu2Var.f = -1;
            }
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean x0(RecyclerView recyclerView, View view, View view2) {
        if ((this.E0 & 32768) == 0 && e1(view) != -1 && (this.E0 & 35) == 0) {
            C1(view, view2, true, 0, 0);
        }
        return true;
    }

    public final void x1(k kVar, q96 q96Var) {
        int i = this.w0;
        if (i == 0) {
            this.D0 = kVar;
            this.x0 = q96Var;
            this.y0 = 0;
            this.z0 = 0;
        }
        this.w0 = i + 1;
    }

    @Override // androidx.recyclerview.widget.j
    public final void y0(Parcelable parcelable) {
        if (parcelable instanceof nu2) {
            nu2 nu2Var = (nu2) parcelable;
            this.G0 = nu2Var.X;
            this.J0 = 0;
            Bundle bundle = nu2Var.Y;
            cb0 cb0Var = this.e1;
            ej4 ej4Var = (ej4) cb0Var.f0;
            if (ej4Var != null && bundle != null) {
                ej4Var.d(-1);
                for (String str : bundle.keySet()) {
                    ((ej4) cb0Var.f0).b(str, bundle.getSparseParcelableArray(str));
                }
            }
            this.E0 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            K0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0031 A[PHI: r0
  0x0031: PHI (r0v9 int) = (r0v8 int), (r0v12 int) binds: [B:19:0x002f, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    public final int y1(int i) {
        int i2;
        int i3 = this.E0;
        if ((i3 & 64) == 0 && (i3 & 3) != 1) {
            yr6 yr6Var = this.Z0;
            if (i > 0) {
                m09 m09Var = (m09) yr6Var.f0;
                if (m09Var.a != Integer.MAX_VALUE && i > (i2 = m09Var.c)) {
                    i = i2;
                }
            } else if (i < 0) {
                m09 m09Var2 = (m09) yr6Var.f0;
                if (m09Var2.b != Integer.MIN_VALUE && i < (i2 = m09Var2.d)) {
                    i = i2;
                }
            }
        }
        if (i == 0) {
            return 0;
        }
        int i4 = -i;
        int I = I();
        if (this.u0) {
            for (int i5 = 0; i5 < I; i5++) {
                H(i5).offsetTopAndBottom(i4);
            }
        } else {
            for (int i6 = 0; i6 < I; i6++) {
                H(i6).offsetLeftAndRight(i4);
            }
        }
        if ((this.E0 & 3) == 1) {
            K1();
            return i;
        }
        int I2 = I();
        if ((this.E0 & 262144) == 0 ? i >= 0 : i <= 0) {
            a1();
        } else {
            r1();
        }
        boolean z = I() > I2;
        int I3 = I();
        if ((262144 & this.E0) == 0 ? i >= 0 : i <= 0) {
            w1();
        } else {
            v1();
        }
        if (z | (I() < I3)) {
            J1();
        }
        this.t0.invalidate();
        K1();
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    @Override // androidx.recyclerview.widget.j
    public final Parcelable z0() {
        Bundle bundle;
        int i;
        LinkedHashMap linkedHashMap;
        nu2 nu2Var = new nu2();
        nu2Var.Y = Bundle.EMPTY;
        nu2Var.X = this.G0;
        cb0 cb0Var = this.e1;
        ej4 ej4Var = (ej4) cb0Var.f0;
        if (ej4Var != null) {
            synchronized (ej4Var.c) {
                i = ej4Var.d;
            }
            if (i == 0) {
                bundle = null;
            } else {
                ej4 ej4Var2 = (ej4) cb0Var.f0;
                synchronized (ej4Var2.c) {
                    Set setEntrySet = ej4Var2.b.a.entrySet();
                    setEntrySet.getClass();
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = ej4Var2.b.a.entrySet();
                    setEntrySet2.getClass();
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundle = new Bundle();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    bundle.putSparseParcelableArray((String) entry2.getKey(), (SparseArray) entry2.getValue());
                }
            }
        } else {
            bundle = null;
        }
        int I = I();
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = H(i2);
            int iE1 = e1(viewH);
            if (iE1 != -1 && this.e1.Y != 0) {
                String string = Integer.toString(iE1);
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                viewH.saveHierarchyState(sparseArray);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray(string, sparseArray);
            }
        }
        nu2Var.Y = bundle;
        return nu2Var;
    }

    public final int z1(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = -i;
        int I = I();
        if (this.u0) {
            while (i2 < I) {
                H(i2).offsetLeftAndRight(i3);
                i2++;
            }
        } else {
            while (i2 < I) {
                H(i2).offsetTopAndBottom(i3);
                i2++;
            }
        }
        this.L0 += i;
        L1();
        this.t0.invalidate();
        return i;
    }

    public GridLayoutManager() {
        this(null);
    }
}
