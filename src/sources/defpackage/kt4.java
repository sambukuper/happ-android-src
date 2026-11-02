package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kt4 extends BaseAdapter {
    public final nt4 X;
    public int Y = -1;
    public boolean Z;
    public final boolean f0;
    public final LayoutInflater g0;
    public final int h0;

    public kt4(nt4 nt4Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.f0 = z;
        this.g0 = layoutInflater;
        this.X = nt4Var;
        this.h0 = i;
        a();
    }

    public final void a() {
        nt4 nt4Var = this.X;
        st4 st4Var = nt4Var.v;
        if (st4Var != null) {
            nt4Var.i();
            ArrayList arrayList = nt4Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((st4) arrayList.get(i)) == st4Var) {
                    this.Y = i;
                    return;
                }
            }
        }
        this.Y = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final st4 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.f0;
        nt4 nt4Var = this.X;
        if (z) {
            nt4Var.i();
            arrayListL = nt4Var.j;
        } else {
            arrayListL = nt4Var.l();
        }
        int i2 = this.Y;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (st4) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.f0;
        nt4 nt4Var = this.X;
        if (z) {
            nt4Var.i();
            arrayListL = nt4Var.j;
        } else {
            arrayListL = nt4Var.l();
        }
        return this.Y < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.g0.inflate(this.h0, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.X.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        ju4 ju4Var = (ju4) view;
        if (this.Z) {
            listMenuItemView.setForceShowIcon(true);
        }
        ju4Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
