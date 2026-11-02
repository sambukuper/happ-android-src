package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.a;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r09 extends l5 implements lt4 {
    public final Context f0;
    public final nt4 g0;
    public dq h0;
    public WeakReference i0;
    public final /* synthetic */ s09 j0;

    public r09(s09 s09Var, Context context, dq dqVar) {
        this.j0 = s09Var;
        this.f0 = context;
        this.h0 = dqVar;
        nt4 nt4Var = new nt4(context);
        nt4Var.l = true;
        this.g0 = nt4Var;
        nt4Var.e = this;
    }

    @Override // defpackage.lt4
    public final void D(nt4 nt4Var) {
        if (this.h0 == null) {
            return;
        }
        i();
        a aVar = this.j0.l.i0;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // defpackage.l5
    public final void b() {
        s09 s09Var = this.j0;
        if (s09Var.o != this) {
            return;
        }
        if (s09Var.v) {
            s09Var.p = this;
            s09Var.q = this.h0;
        } else {
            this.h0.F(this);
        }
        this.h0 = null;
        s09Var.u0(false);
        ActionBarContextView actionBarContextView = s09Var.l;
        if (actionBarContextView.p0 == null) {
            actionBarContextView.e();
        }
        s09Var.i.setHideOnContentScrollEnabled(s09Var.A);
        s09Var.o = null;
    }

    @Override // defpackage.l5
    public final View c() {
        WeakReference weakReference = this.i0;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.l5
    public final nt4 e() {
        return this.g0;
    }

    @Override // defpackage.l5
    public final MenuInflater f() {
        return new uw7(this.f0);
    }

    @Override // defpackage.l5
    public final CharSequence g() {
        return this.j0.l.getSubtitle();
    }

    @Override // defpackage.l5
    public final CharSequence h() {
        return this.j0.l.getTitle();
    }

    @Override // defpackage.l5
    public final void i() {
        if (this.j0.o != this) {
            return;
        }
        nt4 nt4Var = this.g0;
        nt4Var.w();
        try {
            this.h0.G(this, nt4Var);
        } finally {
            nt4Var.v();
        }
    }

    @Override // defpackage.l5
    public final boolean j() {
        return this.j0.l.x0;
    }

    @Override // defpackage.lt4
    public final boolean l(nt4 nt4Var, MenuItem menuItem) {
        dq dqVar = this.h0;
        if (dqVar != null) {
            return ((yr6) dqVar.Y).j(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.l5
    public final void m(View view) {
        this.j0.l.setCustomView(view);
        this.i0 = new WeakReference(view);
    }

    @Override // defpackage.l5
    public final void n(int i) {
        o(this.j0.g.getResources().getString(i));
    }

    @Override // defpackage.l5
    public final void o(CharSequence charSequence) {
        this.j0.l.setSubtitle(charSequence);
    }

    @Override // defpackage.l5
    public final void p(int i) {
        q(this.j0.g.getResources().getString(i));
    }

    @Override // defpackage.l5
    public final void q(CharSequence charSequence) {
        this.j0.l.setTitle(charSequence);
    }

    @Override // defpackage.l5
    public final void r(boolean z) {
        this.Y = z;
        this.j0.l.setTitleOptional(z);
    }
}
