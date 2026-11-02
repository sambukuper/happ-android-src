package androidx.activity;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import defpackage.a94;
import defpackage.aa5;
import defpackage.ax8;
import defpackage.bn2;
import defpackage.bt;
import defpackage.bx8;
import defpackage.d41;
import defpackage.d94;
import defpackage.dh3;
import defpackage.dn2;
import defpackage.dy0;
import defpackage.en5;
import defpackage.ep1;
import defpackage.ex8;
import defpackage.ey0;
import defpackage.f51;
import defpackage.f63;
import defpackage.fl2;
import defpackage.fx8;
import defpackage.g55;
import defpackage.g94;
import defpackage.ge6;
import defpackage.gy0;
import defpackage.hr5;
import defpackage.hy0;
import defpackage.ia5;
import defpackage.ie6;
import defpackage.iy0;
import defpackage.iz2;
import defpackage.j25;
import defpackage.j6;
import defpackage.jy0;
import defpackage.ky0;
import defpackage.ln7;
import defpackage.ly0;
import defpackage.lz4;
import defpackage.n46;
import defpackage.n84;
import defpackage.nn;
import defpackage.o84;
import defpackage.q6;
import defpackage.r6;
import defpackage.r86;
import defpackage.sv6;
import defpackage.sz4;
import defpackage.v36;
import defpackage.vz7;
import defpackage.w36;
import defpackage.x36;
import defpackage.xd6;
import defpackage.xv6;
import defpackage.yn0;
import defpackage.yv6;
import defpackage.z36;
import defpackage.z47;
import defpackage.z95;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u0002:\u0003\u000e\u000f\u000fJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", _UrlKt.FRAGMENT_ENCODE_SET, "Ld94;", "Lfx8;", "Liz2;", "Lyv6;", "Laa5;", "Lj25;", "Landroid/view/View;", "view", "Ldn8;", "setContentView", "(Landroid/view/View;)V", "jy0", "ky0", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ComponentActivity extends androidx.core.app.ComponentActivity implements fx8, iz2, yv6, aa5, j25 {
    public static final /* synthetic */ int x0 = 0;
    public final f51 Y = new f51();
    public final f63 Z = new f63(new dy0(this, (byte) 0));
    public final xd6 f0;
    public ex8 g0;
    public final ky0 h0;
    public final vz7 i0;
    public final AtomicInteger j0;
    public final ly0 k0;
    public final CopyOnWriteArrayList l0;
    public final CopyOnWriteArrayList m0;
    public final CopyOnWriteArrayList n0;
    public final CopyOnWriteArrayList o0;
    public final CopyOnWriteArrayList p0;
    public final CopyOnWriteArrayList q0;
    public final CopyOnWriteArrayList r0;
    public boolean s0;
    public boolean t0;
    public final vz7 u0;
    public final vz7 v0;
    public final vz7 w0;

    public ComponentActivity() {
        byte b = 0;
        xd6 xd6Var = new xd6(new xv6(this, new hr5(this, (byte) 14)), (byte) 5);
        this.f0 = xd6Var;
        this.h0 = new ky0(this);
        byte b2 = 1;
        this.i0 = new vz7(new ey0(this, b2));
        this.j0 = new AtomicInteger();
        this.k0 = new ly0(this);
        this.l0 = new CopyOnWriteArrayList();
        this.m0 = new CopyOnWriteArrayList();
        this.n0 = new CopyOnWriteArrayList();
        this.o0 = new CopyOnWriteArrayList();
        this.p0 = new CopyOnWriteArrayList();
        this.q0 = new CopyOnWriteArrayList();
        this.r0 = new CopyOnWriteArrayList();
        this.u0 = new vz7(new ey0(this, (byte) 2));
        g94 g94Var = this.X;
        if (g94Var == null) {
            bt.i("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        g94Var.a(new gy0(this, b));
        this.X.a(new gy0(this, b2));
        this.X.a(new r86(this, b2));
        xd6Var.w();
        sv6.b(this);
        ((xd6) xd6Var.Z).D("android:support:activity-result", new hy0(this, b));
        j(new iy0(this, b));
        this.v0 = new vz7(new ey0(this, (byte) 3));
        this.w0 = new vz7(new ey0(this, (byte) 4));
    }

    public static final void i(z95 z95Var, ComponentActivity componentActivity, d94 d94Var, n84 n84Var) {
        if (n84Var == n84.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            z95Var.d(onBackInvokedDispatcher);
        }
    }

    public static final void l(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!dh3.f(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!dh3.f(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.j25
    public final z47 a() {
        return b().c().c;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.h0.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.aa5
    public final z95 b() {
        return (z95) this.w0.getValue();
    }

    @Override // defpackage.iz2
    public final bx8 c() {
        return (bx8) this.v0.getValue();
    }

    @Override // defpackage.iz2
    public final sz4 d() {
        sz4 sz4Var = new sz4(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = sz4Var.a;
        if (application != null) {
            linkedHashMap.put(ax8.d, getApplication());
        }
        linkedHashMap.put(sv6.a, this);
        linkedHashMap.put(sv6.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(sv6.c, extras);
        }
        return sz4Var;
    }

    @Override // defpackage.fx8
    public final ex8 e() {
        if (getApplication() == null) {
            bt.i("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        ex8 ex8Var = this.g0;
        if (ex8Var == null) {
            jy0 jy0Var = (jy0) getLastNonConfigurationInstance();
            if (jy0Var != null) {
                this.g0 = jy0Var.a;
            }
            ex8Var = this.g0;
            if (ex8Var == null) {
                ex8Var = new ex8();
                this.g0 = ex8Var;
            }
        }
        ex8Var.getClass();
        return ex8Var;
    }

    @Override // defpackage.yv6
    public final xd6 f() {
        return (xd6) this.f0.Z;
    }

    @Override // androidx.core.app.ComponentActivity, defpackage.d94
    /* JADX INFO: renamed from: h */
    public final g94 getX() {
        return this.X;
    }

    public final void j(ia5 ia5Var) {
        f51 f51Var = this.Y;
        f51Var.getClass();
        ComponentActivity componentActivity = (ComponentActivity) f51Var.a;
        if (componentActivity != null) {
            ia5Var.a(componentActivity);
        }
        ((CopyOnWriteArraySet) f51Var.b).add(ia5Var);
    }

    public final void k() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(v36.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(w36.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(z36.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(n46.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(n46.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(x36.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final r6 m(final j6 j6Var, final yn0 yn0Var) {
        final ly0 ly0Var = this.k0;
        ly0Var.getClass();
        final String str = "activity_rq#" + this.j0.getAndIncrement();
        LinkedHashMap linkedHashMap = ly0Var.c;
        g94 g94Var = this.X;
        if (g94Var.i.compareTo(o84.f0) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            o84 o84Var = g94Var.i;
            sb.append(" is attempting to register while current state is ");
            sb.append(o84Var);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        ly0Var.d(str);
        q6 q6Var = (q6) linkedHashMap.get(str);
        if (q6Var == null) {
            q6Var = new q6(g94Var);
        }
        a94 a94Var = new a94() { // from class: o6
            @Override // defpackage.a94
            public final void k(d94 d94Var, n84 n84Var) {
                n84 n84Var2 = n84.ON_START;
                ly0 ly0Var2 = ly0Var;
                String str2 = str;
                if (n84Var2 != n84Var) {
                    if (n84.ON_STOP == n84Var) {
                        ly0Var2.e.remove(str2);
                        return;
                    } else {
                        if (n84.ON_DESTROY == n84Var) {
                            ly0Var2.e(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = ly0Var2.e;
                Bundle bundle = ly0Var2.g;
                LinkedHashMap linkedHashMap3 = ly0Var2.f;
                j6 j6Var2 = j6Var;
                yn0 yn0Var2 = yn0Var;
                linkedHashMap2.put(str2, new p6(j6Var2, yn0Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    j6Var2.c(obj);
                }
                i6 i6Var = (i6) ch3.G(str2, bundle);
                if (i6Var != null) {
                    bundle.remove(str2);
                    j6Var2.c(yn0Var2.S(i6Var.Y, i6Var.X));
                }
            }
        };
        q6Var.a.a(a94Var);
        q6Var.b.add(a94Var);
        linkedHashMap.put(str, q6Var);
        return new r6(ly0Var, str, yn0Var, (byte) 0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.k0.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((ep1) this.u0.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.l0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((d41) it.next()).accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f0.x(bundle);
        f51 f51Var = this.Y;
        f51Var.a = this;
        Iterator it = ((CopyOnWriteArraySet) f51Var.b).iterator();
        while (it.hasNext()) {
            ((ia5) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = ie6.Y;
        ge6.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.Z.Z).iterator();
        while (it.hasNext()) {
            ((fl2) it.next()).a.l();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.Z.Z).iterator();
            while (it.hasNext()) {
                if (((fl2) it.next()).a.q()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.s0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.s0 = false;
            Iterator it = this.o0.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((d41) it.next()).accept(new lz4(z));
            }
        } catch (Throwable th) {
            this.s0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.n0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((d41) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.Z.Z).iterator();
        while (it.hasNext()) {
            ((fl2) it.next()).a.r();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.t0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.t0 = false;
            Iterator it = this.p0.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((d41) it.next()).accept(new en5(z));
            }
        } catch (Throwable th) {
            this.t0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        g55 g55VarB = nn.b(pictureInPictureUiState);
        Iterator it = this.q0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((d41) it.next()).accept(g55VarB);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.Z.Z).iterator();
        while (it.hasNext()) {
            ((fl2) it.next()).a.u();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.k0.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        jy0 jy0Var;
        ex8 ex8Var = this.g0;
        if (ex8Var == null && (jy0Var = (jy0) getLastNonConfigurationInstance()) != null) {
            ex8Var = jy0Var.a;
        }
        if (ex8Var == null) {
            return null;
        }
        jy0 jy0Var2 = new jy0();
        jy0Var2.a = ex8Var;
        return jy0Var2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        g94 g94Var = this.X;
        if (g94Var != null) {
            g94Var.c("setCurrentState");
            g94Var.e(o84.Z);
        }
        super.onSaveInstanceState(bundle);
        this.f0.z(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.m0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((d41) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.r0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (ln7.c()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            bn2 bn2Var = (bn2) this.i0.getValue();
            synchronized (bn2Var.b) {
                try {
                    bn2Var.c = true;
                    Iterator it = bn2Var.d.iterator();
                    while (it.hasNext()) {
                        ((dn2) it.next()).invoke();
                    }
                    bn2Var.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        k();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.h0.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        k();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.h0.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.h0.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.s0) {
            return;
        }
        Iterator it = this.o0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((d41) it.next()).accept(new lz4(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.t0) {
            return;
        }
        Iterator it = this.p0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((d41) it.next()).accept(new en5(z));
        }
    }
}
