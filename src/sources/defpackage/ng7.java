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
public final class ng7 extends l5 implements lt4 {
    public Context f0;
    public ActionBarContextView g0;
    public dq h0;
    public WeakReference i0;
    public boolean j0;
    public nt4 k0;

    @Override // defpackage.lt4
    public final void D(nt4 nt4Var) {
        i();
        a aVar = this.g0.i0;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // defpackage.l5
    public final void b() {
        if (this.j0) {
            return;
        }
        this.j0 = true;
        this.h0.F(this);
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
        return this.k0;
    }

    @Override // defpackage.l5
    public final MenuInflater f() {
        return new uw7(this.g0.getContext());
    }

    @Override // defpackage.l5
    public final CharSequence g() {
        return this.g0.getSubtitle();
    }

    @Override // defpackage.l5
    public final CharSequence h() {
        return this.g0.getTitle();
    }

    @Override // defpackage.l5
    public final void i() {
        this.h0.G(this, this.k0);
    }

    @Override // defpackage.l5
    public final boolean j() {
        return this.g0.x0;
    }

    @Override // defpackage.lt4
    public final boolean l(nt4 nt4Var, MenuItem menuItem) {
        return ((yr6) this.h0.Y).j(this, menuItem);
    }

    @Override // defpackage.l5
    public final void m(View view) {
        this.g0.setCustomView(view);
        this.i0 = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.l5
    public final void n(int i) {
        o(this.f0.getString(i));
    }

    @Override // defpackage.l5
    public final void o(CharSequence charSequence) {
        this.g0.setSubtitle(charSequence);
    }

    @Override // defpackage.l5
    public final void p(int i) {
        q(this.f0.getString(i));
    }

    @Override // defpackage.l5
    public final void q(CharSequence charSequence) {
        this.g0.setTitle(charSequence);
    }

    @Override // defpackage.l5
    public final void r(boolean z) {
        this.Y = z;
        this.g0.setTitleOptional(z);
    }
}
