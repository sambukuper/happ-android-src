package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gn7 extends nt4 implements SubMenu {
    public final st4 A;
    public final nt4 z;

    public gn7(Context context, nt4 nt4Var, st4 st4Var) {
        super(context);
        this.z = nt4Var;
        this.A = st4Var;
    }

    @Override // defpackage.nt4
    public final boolean d(st4 st4Var) {
        return this.z.d(st4Var);
    }

    @Override // defpackage.nt4
    public final boolean e(nt4 nt4Var, MenuItem menuItem) {
        return super.e(nt4Var, menuItem) || this.z.e(nt4Var, menuItem);
    }

    @Override // defpackage.nt4
    public final boolean f(st4 st4Var) {
        return this.z.f(st4Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.nt4
    public final String j() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return pc6.j(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.nt4
    public final nt4 k() {
        return this.z.k();
    }

    @Override // defpackage.nt4
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.nt4
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.nt4
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.nt4, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.nt4, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
