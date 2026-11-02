package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nb4 implements iu4, AdapterView.OnItemClickListener {
    public Context X;
    public LayoutInflater Y;
    public nt4 Z;
    public ExpandedMenuView f0;
    public final int g0;
    public hu4 h0;
    public mb4 i0;

    public nb4(ContextWrapper contextWrapper, int i) {
        this.g0 = i;
        this.X = contextWrapper;
        this.Y = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.iu4
    public final void b(nt4 nt4Var, boolean z) {
        hu4 hu4Var = this.h0;
        if (hu4Var != null) {
            hu4Var.b(nt4Var, z);
        }
    }

    @Override // defpackage.iu4
    public final boolean c(gn7 gn7Var) {
        boolean zHasVisibleItems = gn7Var.hasVisibleItems();
        Context context = gn7Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        pt4 pt4Var = new pt4();
        pt4Var.X = gn7Var;
        b8 b8Var = new b8(context);
        x7 x7Var = (x7) b8Var.c;
        nb4 nb4Var = new nb4((ContextThemeWrapper) x7Var.c, u46.abc_list_menu_item_layout);
        pt4Var.Z = nb4Var;
        nb4Var.h0 = pt4Var;
        gn7Var.b(nb4Var, context);
        nb4 nb4Var2 = pt4Var.Z;
        mb4 mb4Var = nb4Var2.i0;
        if (mb4Var == null) {
            mb4Var = new mb4(nb4Var2);
            nb4Var2.i0 = mb4Var;
        }
        x7Var.j = mb4Var;
        x7Var.k = pt4Var;
        View view = gn7Var.o;
        if (view != null) {
            x7Var.g = view;
        } else {
            x7Var.e = gn7Var.n;
            x7Var.f = gn7Var.m;
        }
        x7Var.i = pt4Var;
        c8 c8VarD = b8Var.d();
        pt4Var.Y = c8VarD;
        c8VarD.setOnDismissListener(pt4Var);
        WindowManager.LayoutParams attributes = pt4Var.Y.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pt4Var.Y.show();
        hu4 hu4Var = this.h0;
        if (hu4Var == null) {
            return true;
        }
        hu4Var.N(gn7Var);
        return true;
    }

    @Override // defpackage.iu4
    public final boolean d() {
        return false;
    }

    @Override // defpackage.iu4
    public final boolean e(st4 st4Var) {
        return false;
    }

    @Override // defpackage.iu4
    public final void g(hu4 hu4Var) {
        throw null;
    }

    @Override // defpackage.iu4
    public final boolean h(st4 st4Var) {
        return false;
    }

    @Override // defpackage.iu4
    public final void i() {
        mb4 mb4Var = this.i0;
        if (mb4Var != null) {
            mb4Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.iu4
    public final void k(Context context, nt4 nt4Var) {
        if (this.X != null) {
            this.X = context;
            if (this.Y == null) {
                this.Y = LayoutInflater.from(context);
            }
        }
        this.Z = nt4Var;
        mb4 mb4Var = this.i0;
        if (mb4Var != null) {
            mb4Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.Z.q(this.i0.getItem(i), this, 0);
    }
}
