package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mb4 extends BaseAdapter {
    public int X = -1;
    public final /* synthetic */ nb4 Y;

    public mb4(nb4 nb4Var) {
        this.Y = nb4Var;
        a();
    }

    public final void a() {
        nt4 nt4Var = this.Y.Z;
        st4 st4Var = nt4Var.v;
        if (st4Var != null) {
            nt4Var.i();
            ArrayList arrayList = nt4Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((st4) arrayList.get(i)) == st4Var) {
                    this.X = i;
                    return;
                }
            }
        }
        this.X = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final st4 getItem(int i) {
        nt4 nt4Var = this.Y.Z;
        nt4Var.i();
        ArrayList arrayList = nt4Var.j;
        int i2 = this.X;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (st4) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        nt4 nt4Var = this.Y.Z;
        nt4Var.i();
        int size = nt4Var.j.size();
        return this.X < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            nb4 nb4Var = this.Y;
            view = nb4Var.Y.inflate(nb4Var.g0, viewGroup, false);
        }
        ((ju4) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
