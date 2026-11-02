package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wl2 {
    public final mj0 a;
    public final z47 b;
    public final qk2 c;
    public boolean d = false;
    public int e = -1;

    public wl2(mj0 mj0Var, z47 z47Var, ClassLoader classLoader, gl2 gl2Var, Bundle bundle) {
        this.a = mj0Var;
        this.b = z47Var;
        tl2 tl2Var = (tl2) bundle.getParcelable("state");
        qk2 qk2VarA = gl2Var.a(tl2Var.X);
        qk2VarA.g0 = tl2Var.Y;
        qk2VarA.p0 = tl2Var.Z;
        qk2VarA.r0 = tl2Var.f0;
        qk2VarA.s0 = true;
        qk2VarA.z0 = tl2Var.g0;
        qk2VarA.A0 = tl2Var.h0;
        qk2VarA.B0 = tl2Var.i0;
        qk2VarA.E0 = tl2Var.j0;
        qk2VarA.n0 = tl2Var.k0;
        qk2VarA.D0 = tl2Var.l0;
        qk2VarA.C0 = tl2Var.m0;
        qk2VarA.R0 = o84.values()[tl2Var.n0];
        qk2VarA.j0 = tl2Var.o0;
        qk2VarA.k0 = tl2Var.p0;
        qk2VarA.L0 = tl2Var.q0;
        this.c = qk2VarA;
        qk2VarA.Y = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        qk2VarA.Q(bundle2);
        if (ml2.K(2)) {
            Objects.toString(qk2VarA);
        }
    }

    public final void a() {
        boolean zK = ml2.K(3);
        qk2 qk2Var = this.c;
        if (zK) {
            Objects.toString(qk2Var);
        }
        Bundle bundle = qk2Var.Y;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        qk2Var.x0.R();
        qk2Var.X = 3;
        qk2Var.H0 = false;
        q02 q02Var = qk2Var.Y0;
        q02Var.S(new jk2(qk2Var, bundle2, (byte) 16), "Fragment#onActivityCreated");
        if (!qk2Var.H0) {
            throw new mw7(ie2.i("Fragment ", qk2Var, " did not call through to super.onActivityCreated()"));
        }
        if (ml2.K(3)) {
            qk2Var.toString();
        }
        if (qk2Var.J0 != null) {
            Bundle bundle3 = qk2Var.Y;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = qk2Var.Z;
            if (sparseArray != null) {
                qk2Var.J0.restoreHierarchyState(sparseArray);
                qk2Var.Z = null;
            }
            qk2Var.H0 = false;
            q02Var.S(new kk2(qk2Var, bundle4, (byte) 2), "Fragment#onViewStateRestored");
            if (!qk2Var.H0) {
                throw new mw7(ie2.i("Fragment ", qk2Var, " did not call through to super.onViewStateRestored()"));
            }
            if (qk2Var.J0 != null) {
                q02Var.S(new jk2(qk2Var, (byte) 14), "FragmentViewLifecycle#handleLifecycleEvent(ON_CREATE)");
            }
        }
        qk2Var.Y = null;
        ml2 ml2Var = qk2Var.x0;
        ml2Var.H = false;
        ml2Var.I = false;
        ml2Var.O.g = false;
        ml2Var.v(4);
        this.a.B(qk2Var, false);
    }

    public final void b() {
        qk2 qk2Var;
        View view;
        View view2;
        qk2 qk2Var2 = this.c;
        View view3 = qk2Var2.I0;
        while (true) {
            qk2Var = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(t36.fragment_container_view_tag);
            qk2 qk2Var3 = tag instanceof qk2 ? (qk2) tag : null;
            if (qk2Var3 != null) {
                qk2Var = qk2Var3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        qk2 qk2Var4 = qk2Var2.y0;
        if (qk2Var != null && qk2Var != qk2Var4) {
            int i = qk2Var2.A0;
            zl2 zl2Var = am2.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(qk2Var2);
            sb.append(" within the view of parent fragment ");
            sb.append(qk2Var);
            sb.append(" via container with ID ");
            am2.b(new u59(qk2Var2, oi0.n(sb, i, " without using parent's childFragmentManager")));
            am2.a(qk2Var2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.b.Y;
        ViewGroup viewGroup = qk2Var2.I0;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(qk2Var2);
            for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                qk2 qk2Var5 = (qk2) arrayList.get(i2);
                if (qk2Var5.I0 == viewGroup && (view2 = qk2Var5.J0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                qk2 qk2Var6 = (qk2) arrayList.get(iIndexOf);
                if (qk2Var6.I0 == viewGroup && (view = qk2Var6.J0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        qk2Var2.I0.addView(qk2Var2.J0, iIndexOfChild);
    }

    public final void c() {
        boolean zK = ml2.K(3);
        qk2 qk2Var = this.c;
        if (zK) {
            Objects.toString(qk2Var);
        }
        qk2 qk2Var2 = qk2Var.i0;
        wl2 wl2Var = null;
        z47 z47Var = this.b;
        if (qk2Var2 != null) {
            wl2 wl2Var2 = (wl2) ((HashMap) z47Var.Z).get(qk2Var2.g0);
            if (wl2Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(qk2Var);
                qk2 qk2Var3 = qk2Var.i0;
                sb.append(" declared target fragment ");
                sb.append(qk2Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            qk2Var.j0 = qk2Var.i0.g0;
            qk2Var.i0 = null;
            wl2Var = wl2Var2;
        } else {
            String str = qk2Var.j0;
            if (str != null && (wl2Var = (wl2) ((HashMap) z47Var.Z).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(qk2Var);
                sb2.append(" declared target fragment ");
                bt.i(oi0.p(sb2, qk2Var.j0, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (wl2Var != null) {
            wl2Var.k();
        }
        ml2 ml2Var = qk2Var.v0;
        qk2Var.w0 = ml2Var.w;
        qk2Var.y0 = ml2Var.y;
        mj0 mj0Var = this.a;
        mj0Var.H(qk2Var, false);
        ArrayList arrayList = qk2Var.Z0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((lk2) it.next()).a();
        }
        arrayList.clear();
        qk2Var.x0.b(qk2Var.w0, qk2Var.a(), qk2Var);
        qk2Var.X = 0;
        qk2Var.H0 = false;
        qk2Var.Y0.S(new jk2(qk2Var, (byte) 21), "Fragment#onAttach");
        if (!qk2Var.H0) {
            throw new mw7(ie2.i("Fragment ", qk2Var, " did not call through to super.onAttach()"));
        }
        Iterator it2 = qk2Var.v0.p.iterator();
        while (it2.hasNext()) {
            ((ql2) it2.next()).a();
        }
        ml2 ml2Var2 = qk2Var.x0;
        ml2Var2.H = false;
        ml2Var2.I = false;
        ml2Var2.O.g = false;
        ml2Var2.v(0);
        mj0Var.C(qk2Var, false);
    }

    public final int d() {
        qk2 qk2Var = this.c;
        if (qk2Var.v0 == null) {
            return qk2Var.X;
        }
        int iMin = this.e;
        int iOrdinal = qk2Var.R0.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (qk2Var.p0) {
            boolean z = qk2Var.q0;
            int i = this.e;
            if (z) {
                iMin = Math.max(i, 2);
                View view = qk2Var.J0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i < 4 ? Math.min(iMin, qk2Var.X) : Math.min(iMin, 1);
            }
        }
        if (qk2Var.r0 && qk2Var.I0 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!qk2Var.m0) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = qk2Var.I0;
        ye7 ye7Var = null;
        if (viewGroup != null) {
            fg1 fg1VarI = fg1.i(viewGroup, qk2Var.n());
            xe7 xe7VarF = fg1VarI.f(qk2Var);
            ye7 ye7Var2 = xe7VarF != null ? xe7VarF.b : null;
            xe7 xe7VarG = fg1VarI.g(qk2Var);
            ye7Var = xe7VarG != null ? xe7VarG.b : null;
            int i2 = ye7Var2 == null ? -1 : af7.a[ye7Var2.ordinal()];
            if (i2 != -1 && i2 != 1) {
                ye7Var = ye7Var2;
            }
        }
        if (ye7Var == ye7.Y) {
            iMin = Math.min(iMin, 6);
        } else if (ye7Var == ye7.Z) {
            iMin = Math.max(iMin, 3);
        } else if (qk2Var.n0) {
            iMin = qk2Var.u() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (qk2Var.K0 && qk2Var.X < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (qk2Var.o0) {
            iMin = Math.max(iMin, 3);
        }
        if (ml2.K(2)) {
            Objects.toString(qk2Var);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        byte b = 3;
        boolean zK = ml2.K(3);
        qk2 qk2Var = this.c;
        if (zK) {
            Objects.toString(qk2Var);
        }
        Bundle bundle2 = qk2Var.Y;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        byte b2 = 1;
        if (qk2Var.P0) {
            qk2Var.X = 1;
            Bundle bundle4 = qk2Var.Y;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            qk2Var.x0.X(bundle);
            ml2 ml2Var = qk2Var.x0;
            ml2Var.H = false;
            ml2Var.I = false;
            ml2Var.O.g = false;
            ml2Var.v(1);
            return;
        }
        mj0 mj0Var = this.a;
        mj0Var.I(qk2Var, false);
        qk2Var.x0.R();
        qk2Var.X = 1;
        qk2Var.H0 = false;
        qk2Var.S0.a(new r86(qk2Var, b));
        q02 q02Var = qk2Var.Y0;
        q02Var.S(new kk2(qk2Var, bundle3, b2), "Fragment#onCreate");
        qk2Var.P0 = true;
        if (!qk2Var.H0) {
            throw new mw7(ie2.i("Fragment ", qk2Var, " did not call through to super.onCreate()"));
        }
        q02Var.S(new jk2(qk2Var, (byte) 12), "FragmentLifecycle#handleLifecycleEvent(ON_CREATE)");
        mj0Var.D(qk2Var, false);
    }

    public final void f() {
        String resourceName;
        qk2 qk2Var = this.c;
        if (qk2Var.p0) {
            return;
        }
        byte b = 3;
        if (ml2.K(3)) {
            Objects.toString(qk2Var);
        }
        Bundle bundle = qk2Var.Y;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterC = qk2Var.C(bundle2);
        qk2Var.O0 = layoutInflaterC;
        ViewGroup viewGroup2 = qk2Var.I0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = qk2Var.A0;
            if (i != 0) {
                if (i == -1) {
                    bt.q(ie2.i("Cannot create fragment ", qk2Var, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) qk2Var.v0.x.W(i);
                if (viewGroup == null) {
                    if (!qk2Var.s0 && !qk2Var.r0) {
                        try {
                            resourceName = qk2Var.o().getResourceName(qk2Var.A0);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        u52.p("No view found for id 0x", Integer.toHexString(qk2Var.A0), " (", resourceName, ") for fragment ", qk2Var);
                        return;
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    zl2 zl2Var = am2.a;
                    am2.b(new t59(qk2Var, "Attempting to add fragment " + qk2Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    am2.a(qk2Var).getClass();
                }
            }
        }
        qk2Var.I0 = viewGroup;
        qk2Var.K(layoutInflaterC, viewGroup, bundle2);
        if (qk2Var.J0 != null) {
            if (ml2.K(3)) {
                Objects.toString(qk2Var);
            }
            qk2Var.J0.setSaveFromParentEnabled(false);
            qk2Var.J0.setTag(t36.fragment_container_view_tag, qk2Var);
            if (viewGroup != null) {
                b();
            }
            if (qk2Var.C0) {
                qk2Var.J0.setVisibility(8);
            }
            boolean zIsAttachedToWindow = qk2Var.J0.isAttachedToWindow();
            View view = qk2Var.J0;
            if (zIsAttachedToWindow) {
                WeakHashMap weakHashMap = cw8.a;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new ge(view, b));
            }
            qk2Var.L();
            this.a.N(qk2Var, qk2Var.J0, false);
            int visibility = qk2Var.J0.getVisibility();
            qk2Var.g().j = qk2Var.J0.getAlpha();
            if (qk2Var.I0 != null && visibility == 0) {
                View viewFindFocus = qk2Var.J0.findFocus();
                if (viewFindFocus != null) {
                    qk2Var.g().k = viewFindFocus;
                    if (ml2.K(2)) {
                        viewFindFocus.toString();
                        Objects.toString(qk2Var);
                    }
                }
                qk2Var.J0.setAlpha(0.0f);
            }
        }
        qk2Var.X = 2;
    }

    public final void g() {
        qk2 qk2VarZ;
        byte b = 3;
        boolean zK = ml2.K(3);
        qk2 qk2Var = this.c;
        if (zK) {
            Objects.toString(qk2Var);
        }
        boolean z = qk2Var.n0 && !qk2Var.u();
        z47 z47Var = this.b;
        if (z) {
            z47Var.R(qk2Var.g0, null);
        }
        if (!z) {
            pl2 pl2Var = (pl2) z47Var.g0;
            if (!((pl2Var.b.containsKey(qk2Var.g0) && pl2Var.e) ? pl2Var.f : true)) {
                String str = qk2Var.j0;
                if (str != null && (qk2VarZ = z47Var.z(str)) != null && qk2VarZ.E0) {
                    qk2Var.i0 = qk2VarZ;
                }
                qk2Var.X = 0;
                return;
            }
        }
        tk2 tk2Var = qk2Var.w0;
        boolean zIsChangingConfigurations = tk2Var != null ? ((pl2) z47Var.g0).f : true ^ tk2Var.C0.isChangingConfigurations();
        if (z || zIsChangingConfigurations) {
            pl2 pl2Var2 = (pl2) z47Var.g0;
            if (ml2.K(3)) {
                pl2Var2.getClass();
                Objects.toString(qk2Var);
            }
            pl2Var2.f(qk2Var.g0, false);
        }
        qk2Var.x0.m();
        q02 q02Var = qk2Var.Y0;
        q02Var.S(new jk2(qk2Var, b), "FragmentLifecycle#handleLifecycleEvent(ON_DESTROY)");
        qk2Var.X = 0;
        qk2Var.H0 = false;
        qk2Var.P0 = false;
        q02Var.S(new jk2(qk2Var, (byte) 4), "Fragment#onDestroy");
        if (!qk2Var.H0) {
            throw new mw7(ie2.i("Fragment ", qk2Var, " did not call through to super.onDestroy()"));
        }
        this.a.E(qk2Var, false);
        for (wl2 wl2Var : z47Var.C()) {
            if (wl2Var != null) {
                qk2 qk2Var2 = wl2Var.c;
                if (qk2Var.g0.equals(qk2Var2.j0)) {
                    qk2Var2.i0 = qk2Var;
                    qk2Var2.j0 = null;
                }
            }
        }
        String str2 = qk2Var.j0;
        if (str2 != null) {
            qk2Var.i0 = z47Var.z(str2);
        }
        z47Var.O(this);
    }

    public final void h() {
        View view;
        boolean zK = ml2.K(3);
        qk2 qk2Var = this.c;
        if (zK) {
            Objects.toString(qk2Var);
        }
        ViewGroup viewGroup = qk2Var.I0;
        if (viewGroup != null && (view = qk2Var.J0) != null) {
            viewGroup.removeView(view);
        }
        q02 q02Var = qk2Var.Y0;
        qk2Var.x0.v(1);
        if (qk2Var.J0 != null) {
            gm2 gm2Var = qk2Var.U0;
            gm2Var.g();
            if (gm2Var.g0.i.compareTo(o84.Z) >= 0) {
                q02Var.S(new jk2(qk2Var, (byte) 9), "FragmentViewLifecycle#handleLifecycleEvent(ON_DESTROY)");
            }
        }
        qk2Var.X = 1;
        qk2Var.H0 = false;
        q02Var.S(new jk2(qk2Var, (byte) 11), "Fragment#onDestroyView");
        if (!qk2Var.H0) {
            throw new mw7(ie2.i("Fragment ", qk2Var, " did not call through to super.onDestroyView()"));
        }
        ex8 ex8VarE = qk2Var.e();
        ex8VarE.getClass();
        n71 n71Var = n71.b;
        n71Var.getClass();
        yr6 yr6Var = new yr6(ex8VarE, xc4.c, n71Var);
        zu3 zu3VarB = yb6.a.b(xc4.class);
        String strP = zu3VarB.p();
        if (strP == null) {
            bt.q("Local and anonymous classes can not be ViewModels");
            return;
        }
        ue7 ue7Var = ((xc4) yr6Var.g(zu3VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP))).b;
        if (ue7Var.Z > 0) {
            ue7Var.e(0).getClass();
            c2.m();
            return;
        }
        qk2Var.t0 = false;
        this.a.O(qk2Var, false);
        qk2Var.I0 = null;
        qk2Var.J0 = null;
        qk2Var.U0 = null;
        qk2Var.V0.j(null);
        qk2Var.q0 = false;
    }

    public final void i() {
        if (ml2.K(3)) {
            Objects.toString(this.c);
        }
        qk2 qk2Var = this.c;
        qk2Var.X = -1;
        qk2Var.H0 = false;
        qk2Var.Y0.S(new jk2(qk2Var, (byte) 5), "Fragment#onDetach");
        qk2Var.O0 = null;
        if (!qk2Var.H0) {
            throw new mw7(ie2.i("Fragment ", qk2Var, " did not call through to super.onDetach()"));
        }
        ml2 ml2Var = qk2Var.x0;
        if (!ml2Var.J) {
            ml2Var.m();
            qk2Var.x0 = new ml2();
        }
        this.a.F(this.c, false);
        qk2 qk2Var2 = this.c;
        qk2Var2.X = -1;
        qk2Var2.w0 = null;
        qk2Var2.T0.a = null;
        qk2 qk2Var3 = this.c;
        qk2Var3.y0 = null;
        qk2Var3.v0 = null;
        if (!qk2Var3.n0 || qk2Var3.u()) {
            pl2 pl2Var = (pl2) this.b.g0;
            if (!((pl2Var.b.containsKey(this.c.g0) && pl2Var.e) ? pl2Var.f : true)) {
                return;
            }
        }
        if (ml2.K(3)) {
            Objects.toString(this.c);
        }
        this.c.r();
    }

    public final void j() {
        qk2 qk2Var = this.c;
        if (qk2Var.p0 && qk2Var.q0 && !qk2Var.t0) {
            if (ml2.K(3)) {
                Objects.toString(qk2Var);
            }
            Bundle bundle = qk2Var.Y;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterC = qk2Var.C(bundle2);
            qk2Var.O0 = layoutInflaterC;
            qk2Var.K(layoutInflaterC, null, bundle2);
            View view = qk2Var.J0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                qk2Var.J0.setTag(t36.fragment_container_view_tag, qk2Var);
                if (qk2Var.C0) {
                    qk2Var.J0.setVisibility(8);
                }
                qk2Var.L();
                this.a.N(qk2Var, qk2Var.J0, false);
                qk2Var.X = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        z47 z47Var = this.b;
        boolean z = this.d;
        qk2 qk2Var = this.c;
        if (z) {
            if (ml2.K(2)) {
                Objects.toString(qk2Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = qk2Var.X;
                if (iD == i) {
                    if (!z2 && i == -1 && qk2Var.n0 && !qk2Var.u()) {
                        if (ml2.K(3)) {
                            Objects.toString(qk2Var);
                        }
                        pl2 pl2Var = (pl2) z47Var.g0;
                        if (ml2.K(3)) {
                            pl2Var.getClass();
                            Objects.toString(qk2Var);
                        }
                        pl2Var.f(qk2Var.g0, true);
                        z47Var.O(this);
                        if (ml2.K(3)) {
                            Objects.toString(qk2Var);
                        }
                        qk2Var.r();
                    }
                    if (qk2Var.N0) {
                        if (qk2Var.J0 != null && (viewGroup = qk2Var.I0) != null) {
                            fg1 fg1VarI = fg1.i(viewGroup, qk2Var.n());
                            boolean z3 = qk2Var.C0;
                            ye7 ye7Var = ye7.X;
                            if (z3) {
                                if (ml2.K(2)) {
                                    Objects.toString(qk2Var);
                                }
                                fg1VarI.d(ze7.f0, ye7Var, this);
                            } else {
                                if (ml2.K(2)) {
                                    Objects.toString(qk2Var);
                                }
                                fg1VarI.d(ze7.Z, ye7Var, this);
                            }
                        }
                        ml2 ml2Var = qk2Var.v0;
                        if (ml2Var != null && qk2Var.m0 && ml2.L(qk2Var)) {
                            ml2Var.G = true;
                        }
                        qk2Var.N0 = false;
                        qk2Var.x0.p();
                    }
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            qk2Var.X = 1;
                            break;
                        case 2:
                            qk2Var.q0 = false;
                            qk2Var.X = 2;
                            break;
                        case 3:
                            if (ml2.K(3)) {
                                Objects.toString(qk2Var);
                            }
                            if (qk2Var.J0 != null && qk2Var.Z == null) {
                                p();
                            }
                            if (qk2Var.J0 != null && (viewGroup2 = qk2Var.I0) != null) {
                                fg1 fg1VarI2 = fg1.i(viewGroup2, qk2Var.n());
                                if (ml2.K(2)) {
                                    Objects.toString(qk2Var);
                                }
                                fg1VarI2.d(ze7.Y, ye7.Z, this);
                            }
                            qk2Var.X = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            qk2Var.X = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (qk2Var.J0 != null && (viewGroup3 = qk2Var.I0) != null) {
                                fg1 fg1VarI3 = fg1.i(viewGroup3, qk2Var.n());
                                int visibility = qk2Var.J0.getVisibility();
                                ze7.X.getClass();
                                ze7 ze7VarL = we5.l(visibility);
                                if (ml2.K(2)) {
                                    Objects.toString(qk2Var);
                                }
                                fg1VarI3.d(ze7VarL, ye7.Y, this);
                            }
                            qk2Var.X = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            qk2Var.X = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.d = false;
        }
    }

    public final void l() {
        boolean zK = ml2.K(3);
        qk2 qk2Var = this.c;
        if (zK) {
            Objects.toString(qk2Var);
        }
        q02 q02Var = qk2Var.Y0;
        ml2 ml2Var = qk2Var.x0;
        if (ml2Var.h != null) {
            ml2Var.d();
        }
        ml2Var.v(5);
        if (qk2Var.J0 != null) {
            q02Var.S(new jk2(qk2Var, (byte) 22), "FragmentViewLifecycle#handleLifecycleEvent(ON_PAUSE)");
        }
        q02Var.S(new jk2(qk2Var, (byte) 1), "FragmentLifecycle#handleLifecycleEvent(ON_PAUSE)");
        qk2Var.X = 6;
        qk2Var.H0 = false;
        q02Var.S(new jk2(qk2Var, (byte) 2), "Fragment#onPause");
        if (!qk2Var.H0) {
            throw new mw7(ie2.i("Fragment ", qk2Var, " did not call through to super.onPause()"));
        }
        this.a.G(qk2Var, false);
    }

    public final void m(ClassLoader classLoader) {
        qk2 qk2Var = this.c;
        Bundle bundle = qk2Var.Y;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (qk2Var.Y.getBundle("savedInstanceState") == null) {
            qk2Var.Y.putBundle("savedInstanceState", new Bundle());
        }
        try {
            qk2Var.Z = qk2Var.Y.getSparseParcelableArray("viewState");
            qk2Var.f0 = qk2Var.Y.getBundle("viewRegistryState");
            tl2 tl2Var = (tl2) qk2Var.Y.getParcelable("state");
            if (tl2Var != null) {
                qk2Var.j0 = tl2Var.o0;
                qk2Var.k0 = tl2Var.p0;
                qk2Var.L0 = tl2Var.q0;
            }
            if (qk2Var.L0) {
                return;
            }
            qk2Var.K0 = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + qk2Var, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    public final void n() {
        boolean zK = ml2.K(3);
        qk2 qk2Var = this.c;
        if (zK) {
            Objects.toString(qk2Var);
        }
        nk2 nk2Var = qk2Var.M0;
        View view = nk2Var == null ? null : nk2Var.k;
        if (view != null) {
            if (view == qk2Var.J0) {
                view.requestFocus();
                if (ml2.K(2)) {
                    view.toString();
                    Objects.toString(qk2Var);
                    Objects.toString(qk2Var.J0.findFocus());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == qk2Var.J0) {
                            view.requestFocus();
                            if (ml2.K(2)) {
                                view.toString();
                                Objects.toString(qk2Var);
                                Objects.toString(qk2Var.J0.findFocus());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        qk2Var.g().k = null;
        qk2Var.x0.R();
        qk2Var.x0.A(true);
        byte b = 7;
        qk2Var.X = 7;
        qk2Var.H0 = false;
        q02 q02Var = qk2Var.Y0;
        q02Var.S(new jk2(qk2Var, (byte) 6), "Fragment#onResume");
        if (!qk2Var.H0) {
            throw new mw7(ie2.i("Fragment ", qk2Var, " did not call through to super.onResume()"));
        }
        q02Var.S(new jk2(qk2Var, b), "FragmentLifecycle#handleLifecycleEvent(ON_RESUME)");
        if (qk2Var.J0 != null) {
            q02Var.S(new jk2(qk2Var, (byte) 8), "FragmentViewLifecycle#handleLifecycleEvent(ON_RESUME)");
        }
        ml2 ml2Var = qk2Var.x0;
        ml2Var.H = false;
        ml2Var.I = false;
        ml2Var.O.g = false;
        ml2Var.v(7);
        this.a.J(qk2Var, false);
        this.b.R(qk2Var.g0, null);
        qk2Var.Y = null;
        qk2Var.Z = null;
        qk2Var.f0 = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        qk2 qk2Var = this.c;
        if (qk2Var.X == -1 && (bundle = qk2Var.Y) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new tl2(qk2Var));
        if (qk2Var.X > 0) {
            Bundle bundle3 = new Bundle();
            qk2Var.Y0.S(new kk2(qk2Var, bundle3, (byte) 0), "Fragment#onSaveInstanceState");
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.K(qk2Var, bundle3, false);
            Bundle bundle4 = new Bundle();
            qk2Var.X0.z(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleY = qk2Var.x0.Y();
            if (!bundleY.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleY);
            }
            if (qk2Var.J0 != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = qk2Var.Z;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = qk2Var.f0;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = qk2Var.h0;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        qk2 qk2Var = this.c;
        if (qk2Var.J0 == null) {
            return;
        }
        if (ml2.K(2)) {
            Objects.toString(qk2Var);
            Objects.toString(qk2Var.J0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        qk2Var.J0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            qk2Var.Z = sparseArray;
        }
        Bundle bundle = new Bundle();
        qk2Var.U0.h0.z(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        qk2Var.f0 = bundle;
    }

    public final void q() {
        boolean zK = ml2.K(3);
        qk2 qk2Var = this.c;
        if (zK) {
            Objects.toString(qk2Var);
        }
        qk2Var.x0.R();
        qk2Var.x0.A(true);
        qk2Var.X = 5;
        qk2Var.H0 = false;
        q02 q02Var = qk2Var.Y0;
        q02Var.S(new jk2(qk2Var, (byte) 18), "Fragment#onStart");
        if (!qk2Var.H0) {
            throw new mw7(ie2.i("Fragment ", qk2Var, " did not call through to super.onStart()"));
        }
        q02Var.S(new jk2(qk2Var, (byte) 19), "FragmentLifecycle#handleLifecycleEvent(ON_START)");
        if (qk2Var.J0 != null) {
            q02Var.S(new jk2(qk2Var, (byte) 20), "FragmentViewLifecycle#handleLifecycleEvent(ON_START)");
        }
        ml2 ml2Var = qk2Var.x0;
        ml2Var.H = false;
        ml2Var.I = false;
        ml2Var.O.g = false;
        ml2Var.v(5);
        this.a.L(qk2Var, false);
    }

    public final void r() {
        boolean zK = ml2.K(3);
        qk2 qk2Var = this.c;
        if (zK) {
            Objects.toString(qk2Var);
        }
        q02 q02Var = qk2Var.Y0;
        ml2 ml2Var = qk2Var.x0;
        ml2Var.I = true;
        ml2Var.O.g = true;
        ml2Var.v(4);
        byte b = 0;
        if (qk2Var.J0 != null) {
            q02Var.S(new jk2(qk2Var, b), "FragmentViewLifecycle#handleLifecycleEvent(ON_STOP)");
        }
        q02Var.S(new jk2(qk2Var, (byte) 10), "FragmentLifecycle#handleLifecycleEvent(ON_STOP)");
        qk2Var.X = 4;
        qk2Var.H0 = false;
        q02Var.S(new jk2(qk2Var, (byte) 15), "Fragment#onStop");
        if (!qk2Var.H0) {
            throw new mw7(ie2.i("Fragment ", qk2Var, " did not call through to super.onStop()"));
        }
        this.a.M(qk2Var, false);
    }

    public wl2(mj0 mj0Var, z47 z47Var, qk2 qk2Var) {
        this.a = mj0Var;
        this.b = z47Var;
        this.c = qk2Var;
    }

    public wl2(mj0 mj0Var, z47 z47Var, qk2 qk2Var, Bundle bundle) {
        this.a = mj0Var;
        this.b = z47Var;
        this.c = qk2Var;
        qk2Var.Z = null;
        qk2Var.f0 = null;
        qk2Var.u0 = 0;
        qk2Var.q0 = false;
        qk2Var.m0 = false;
        qk2 qk2Var2 = qk2Var.i0;
        qk2Var.j0 = qk2Var2 != null ? qk2Var2.g0 : null;
        qk2Var.i0 = null;
        qk2Var.Y = bundle;
        qk2Var.h0 = bundle.getBundle("arguments");
    }
}
