package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qk2 implements ComponentCallbacks, View.OnCreateContextMenuListener, d94, fx8, iz2, yv6 {
    public static final Object c1 = new Object();
    public int A0;
    public String B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean H0;
    public ViewGroup I0;
    public View J0;
    public boolean K0;
    public nk2 M0;
    public boolean N0;
    public LayoutInflater O0;
    public boolean P0;
    public String Q0;
    public o84 R0;
    public g94 S0;
    public final f51 T0;
    public gm2 U0;
    public final yz4 V0;
    public zv6 W0;
    public xd6 X0;
    public Bundle Y;
    public final q02 Y0;
    public SparseArray Z;
    public final ArrayList Z0;
    public final lk2 a1;
    public final lk2 b1;
    public Bundle f0;
    public Bundle h0;
    public qk2 i0;
    public int k0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public int u0;
    public ml2 v0;
    public tk2 w0;
    public qk2 y0;
    public int z0;
    public int X = -1;
    public String g0 = UUID.randomUUID().toString();
    public String j0 = null;
    public Boolean l0 = null;
    public ml2 x0 = new ml2();
    public boolean G0 = true;
    public boolean L0 = true;

    public qk2() {
        new xb(this, (byte) 8);
        this.R0 = o84.g0;
        this.T0 = new f51();
        this.V0 = new yz4();
        this.Y0 = new q02((Object) this, (byte) 4);
        new AtomicInteger();
        this.Z0 = new ArrayList();
        this.a1 = new lk2(this, (byte) 0);
        this.b1 = new lk2(this, (byte) 1);
        q();
    }

    public void A() {
        this.H0 = true;
    }

    public void B() {
        this.H0 = true;
    }

    public LayoutInflater C(Bundle bundle) {
        tk2 tk2Var = this.w0;
        if (tk2Var == null) {
            bt.i("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        AppCompatActivity appCompatActivity = tk2Var.F0;
        LayoutInflater layoutInflaterCloneInContext = appCompatActivity.getLayoutInflater().cloneInContext(appCompatActivity);
        layoutInflaterCloneInContext.setFactory2(this.x0.f);
        return layoutInflaterCloneInContext;
    }

    public void D() {
        this.H0 = true;
    }

    public void E() {
        this.H0 = true;
    }

    public void G() {
        this.H0 = true;
    }

    public void H() {
        this.H0 = true;
    }

    public void J(Bundle bundle) {
        this.H0 = true;
    }

    public void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.x0.R();
        this.t0 = true;
        this.U0 = new gm2(this, e(), new jk2(this, (byte) 13));
        this.Y0.S(new j0(this, layoutInflater, viewGroup, bundle), "Fragment#onCreateView");
        View view = this.J0;
        gm2 gm2Var = this.U0;
        if (view == null) {
            if (gm2Var.g0 == null) {
                this.U0 = null;
                return;
            } else {
                bt.i("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        gm2Var.g();
        if (ml2.K(3)) {
            Objects.toString(this.J0);
            toString();
        }
        View view2 = this.J0;
        gm2 gm2Var2 = this.U0;
        view2.getClass();
        view2.setTag(v36.view_tree_lifecycle_owner, gm2Var2);
        View view3 = this.J0;
        gm2 gm2Var3 = this.U0;
        view3.getClass();
        view3.setTag(w36.view_tree_view_model_store_owner, gm2Var3);
        View view4 = this.J0;
        gm2 gm2Var4 = this.U0;
        view4.getClass();
        view4.setTag(z36.view_tree_saved_state_registry_owner, gm2Var4);
        this.V0.j(this.U0);
    }

    public final void L() {
        Bundle bundle = this.Y;
        this.Y0.S(new jk2(this, bundle != null ? bundle.getBundle("savedInstanceState") : null, (byte) 17), "Fragment#onViewCreated");
        this.x0.v(2);
    }

    public final FragmentActivity M() {
        FragmentActivity fragmentActivityI = i();
        if (fragmentActivityI != null) {
            return fragmentActivityI;
        }
        bt.i(ie2.i("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Context N() {
        Context contextK = k();
        if (contextK != null) {
            return contextK;
        }
        bt.i(ie2.i("Fragment ", this, " not attached to a context."));
        return null;
    }

    public final View O() {
        View view = this.J0;
        if (view != null) {
            return view;
        }
        bt.i(ie2.i("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public final void P(int i, int i2, int i3, int i4) {
        if (this.M0 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        g().b = i;
        g().c = i2;
        g().d = i3;
        g().e = i4;
    }

    public final void Q(Bundle bundle) {
        ml2 ml2Var = this.v0;
        if (ml2Var != null) {
            if (ml2Var == null ? false : ml2Var.P()) {
                bt.i("Fragment already added and state has been saved");
                return;
            }
        }
        this.h0 = bundle;
    }

    public vj8 a() {
        return new mk2(this);
    }

    @Override // defpackage.iz2
    public final bx8 c() {
        Application application = null;
        if (this.v0 == null) {
            bt.i("Can't access ViewModels from detached fragment");
            return null;
        }
        zv6 zv6Var = this.W0;
        if (zv6Var != null) {
            return zv6Var;
        }
        for (Context applicationContext = N().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
        }
        if (application == null && ml2.K(3)) {
            Objects.toString(N().getApplicationContext());
        }
        zv6 zv6Var2 = new zv6(application, this, this.h0);
        this.W0 = zv6Var2;
        return zv6Var2;
    }

    @Override // defpackage.iz2
    public final sz4 d() {
        Application application;
        Context applicationContext = N().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && ml2.K(3)) {
            Objects.toString(N().getApplicationContext());
        }
        sz4 sz4Var = new sz4(0);
        LinkedHashMap linkedHashMap = sz4Var.a;
        if (application != null) {
            linkedHashMap.put(ax8.d, application);
        }
        linkedHashMap.put(sv6.a, this);
        linkedHashMap.put(sv6.b, this);
        Bundle bundle = this.h0;
        if (bundle != null) {
            linkedHashMap.put(sv6.c, bundle);
        }
        return sz4Var;
    }

    @Override // defpackage.fx8
    public final ex8 e() {
        if (this.v0 == null) {
            bt.i("Can't access ViewModels from detached fragment");
            return null;
        }
        if (m() == 1) {
            bt.i("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.v0.O.d;
        ex8 ex8Var = (ex8) map.get(this.g0);
        if (ex8Var != null) {
            return ex8Var;
        }
        ex8 ex8Var2 = new ex8();
        map.put(this.g0, ex8Var2);
        return ex8Var2;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.yv6
    public final xd6 f() {
        return (xd6) this.X0.Z;
    }

    public final nk2 g() {
        nk2 nk2Var = this.M0;
        if (nk2Var != null) {
            return nk2Var;
        }
        nk2 nk2Var2 = new nk2();
        Object obj = c1;
        nk2Var2.g = obj;
        nk2Var2.h = obj;
        nk2Var2.i = obj;
        nk2Var2.j = 1.0f;
        nk2Var2.k = null;
        this.M0 = nk2Var2;
        return nk2Var2;
    }

    @Override // defpackage.d94
    /* JADX INFO: renamed from: h */
    public final g94 getX() {
        return this.S0;
    }

    public final FragmentActivity i() {
        tk2 tk2Var = this.w0;
        if (tk2Var == null) {
            return null;
        }
        return tk2Var.B0;
    }

    public final ml2 j() {
        if (this.w0 != null) {
            return this.x0;
        }
        bt.i(ie2.i("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public final Context k() {
        tk2 tk2Var = this.w0;
        if (tk2Var == null) {
            return null;
        }
        return tk2Var.C0;
    }

    public final LayoutInflater l() {
        LayoutInflater layoutInflater = this.O0;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterC = C(null);
        this.O0 = layoutInflaterC;
        return layoutInflaterC;
    }

    public final int m() {
        o84 o84Var = this.R0;
        return (o84Var == o84.Y || this.y0 == null) ? o84Var.ordinal() : Math.min(o84Var.ordinal(), this.y0.m());
    }

    public final ml2 n() {
        ml2 ml2Var = this.v0;
        if (ml2Var != null) {
            return ml2Var;
        }
        bt.i(ie2.i("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final Resources o() {
        return N().getResources();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.H0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        M().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.H0 = true;
    }

    public final String p(int i) {
        return o().getString(i);
    }

    public final void q() {
        this.S0 = new g94(this, true);
        this.X0 = new xd6(new xv6(this, new hr5(this, (byte) 14)), (byte) 5);
        this.W0 = null;
        ArrayList arrayList = this.Z0;
        lk2 lk2Var = this.a1;
        if (!arrayList.contains(lk2Var)) {
            if (this.X >= 0) {
                lk2Var.a();
            } else {
                arrayList.add(lk2Var);
            }
        }
        lk2 lk2Var2 = this.b1;
        if (arrayList.contains(lk2Var2)) {
            return;
        }
        if (this.X >= 0) {
            lk2Var2.a();
        } else {
            arrayList.add(lk2Var2);
        }
    }

    public final void r() {
        q();
        this.Q0 = this.g0;
        this.g0 = UUID.randomUUID().toString();
        this.m0 = false;
        this.n0 = false;
        this.p0 = false;
        this.q0 = false;
        this.s0 = false;
        this.u0 = 0;
        this.v0 = null;
        this.x0 = new ml2();
        this.w0 = null;
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = null;
        this.C0 = false;
        this.D0 = false;
    }

    public final boolean s() {
        return this.w0 != null && this.m0;
    }

    public final boolean t() {
        if (this.C0) {
            return true;
        }
        ml2 ml2Var = this.v0;
        if (ml2Var != null) {
            qk2 qk2Var = this.y0;
            ml2Var.getClass();
            if (qk2Var == null ? false : qk2Var.t()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.g0);
        if (this.z0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.z0));
        }
        if (this.B0 != null) {
            sb.append(" tag=");
            sb.append(this.B0);
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        return this.u0 > 0;
    }

    public void v() {
        this.H0 = true;
    }

    public void w(int i, int i2, Intent intent) {
        if (ml2.K(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void x(Context context) {
        this.H0 = true;
        tk2 tk2Var = this.w0;
        if ((tk2Var == null ? null : tk2Var.B0) != null) {
            this.H0 = true;
        }
    }

    public void y(Bundle bundle) {
        Bundle bundle2;
        this.H0 = true;
        Bundle bundle3 = this.Y;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.x0.X(bundle2);
            ml2 ml2Var = this.x0;
            ml2Var.H = false;
            ml2Var.I = false;
            ml2Var.O.g = false;
            ml2Var.v(1);
        }
        ml2 ml2Var2 = this.x0;
        if (ml2Var2.v >= 1) {
            return;
        }
        ml2Var2.H = false;
        ml2Var2.I = false;
        ml2Var2.O.g = false;
        ml2Var2.v(1);
    }

    public View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void F(Bundle bundle) {
    }

    public void I(View view) {
    }
}
