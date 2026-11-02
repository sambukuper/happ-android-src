package defpackage;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h81 extends Filter {
    public e81 a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorG;
        lw7 lw7Var = (lw7) this.a;
        SearchView searchView = lw7Var.m0;
        String string = charSequence == null ? _UrlKt.FRAGMENT_ENCODE_SET : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorG = lw7Var.g(lw7Var.n0, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException unused) {
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        e81 e81Var = this.a;
        Cursor cursor = e81Var.Z;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        e81Var.b((Cursor) obj);
    }
}
