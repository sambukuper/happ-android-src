package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class py0 extends Dialog implements d94, aa5, j25, yv6 {
    public g94 X;
    public final xd6 Y;
    public final vz7 Z;
    public final vz7 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py0(Context context, int i) {
        super(context, i);
        context.getClass();
        this.Y = new xd6(new xv6(this, new hr5(this, (byte) 14)), (byte) 5);
        final byte b = 0;
        this.Z = new vz7(new dn2(this) { // from class: oy0
            public final /* synthetic */ py0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                py0 py0Var = this.Y;
                switch (b2) {
                    case 0:
                        ep1 ep1Var = new ep1();
                        py0Var.a().l(ep1Var);
                        return ep1Var;
                    default:
                        return new z95(new c1(py0Var, (byte) 13));
                }
            }
        });
        final byte b2 = 1;
        this.f0 = new vz7(new dn2(this) { // from class: oy0
            public final /* synthetic */ py0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                py0 py0Var = this.Y;
                switch (b3) {
                    case 0:
                        ep1 ep1Var = new ep1();
                        py0Var.a().l(ep1Var);
                        return ep1Var;
                    default:
                        return new z95(new c1(py0Var, (byte) 13));
                }
            }
        });
    }

    public static final void e(py0 py0Var) {
        super.onBackPressed();
    }

    @Override // defpackage.j25
    public final z47 a() {
        return b().c().c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.aa5
    public final z95 b() {
        return (z95) this.f0.getValue();
    }

    public final g94 c() {
        g94 g94Var = this.X;
        if (g94Var != null) {
            return g94Var;
        }
        g94 g94Var2 = new g94(this, true);
        this.X = g94Var2;
        return g94Var2;
    }

    public final void d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(v36.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(n46.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(z36.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(x36.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.yv6
    public final xd6 f() {
        return (xd6) this.Y.Z;
    }

    @Override // defpackage.d94
    /* JADX INFO: renamed from: h */
    public final g94 getH0() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((ep1) this.Z.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            z95 z95VarB = b();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            z95VarB.d(onBackInvokedDispatcher);
        }
        this.Y.x(bundle);
        c().d(n84.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.Y.z(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        c().d(n84.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(n84.ON_DESTROY);
        this.X = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }
}
