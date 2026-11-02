package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e81 extends BaseAdapter implements Filterable {
    public boolean X;
    public boolean Y;
    public Cursor Z;
    public int f0;
    public c81 g0;
    public d81 h0;
    public h81 i0;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.Z;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                c81 c81Var = this.g0;
                if (c81Var != null) {
                    cursor2.unregisterContentObserver(c81Var);
                }
                d81 d81Var = this.h0;
                if (d81Var != null) {
                    cursor2.unregisterDataSetObserver(d81Var);
                }
            }
            this.Z = cursor;
            if (cursor != null) {
                c81 c81Var2 = this.g0;
                if (c81Var2 != null) {
                    cursor.registerContentObserver(c81Var2);
                }
                d81 d81Var2 = this.h0;
                if (d81Var2 != null) {
                    cursor.registerDataSetObserver(d81Var2);
                }
                this.f0 = cursor.getColumnIndexOrThrow("_id");
                this.X = true;
                notifyDataSetChanged();
            } else {
                this.f0 = -1;
                this.X = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.X || (cursor = this.Z) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.X) {
            return null;
        }
        this.Z.moveToPosition(i);
        if (view == null) {
            lw7 lw7Var = (lw7) this;
            view = lw7Var.l0.inflate(lw7Var.k0, viewGroup, false);
        }
        a(view, this.Z);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        h81 h81Var = this.i0;
        if (h81Var != null) {
            return h81Var;
        }
        h81 h81Var2 = new h81();
        h81Var2.a = this;
        this.i0 = h81Var2;
        return h81Var2;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.X || (cursor = this.Z) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.Z;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.X && (cursor = this.Z) != null && cursor.moveToPosition(i)) {
            return this.Z.getLong(this.f0);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.X) {
            bt.i("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.Z.moveToPosition(i)) {
            bt.i(pc6.j(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.Z);
        return view;
    }
}
