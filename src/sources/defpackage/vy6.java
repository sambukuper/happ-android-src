package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.leanback.widget.SearchBar;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vy6 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ vy6(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                SearchBar searchBar = (SearchBar) viewGroup;
                if (z) {
                    searchBar.m0.post(new wy6(searchBar, (byte) 1));
                } else {
                    searchBar.n0.hideSoftInputFromWindow(searchBar.f0.getWindowToken(), 0);
                }
                searchBar.d(z);
                break;
            case 1:
                SearchBar searchBar2 = (SearchBar) viewGroup;
                if (z) {
                    searchBar2.n0.hideSoftInputFromWindow(searchBar2.f0.getWindowToken(), 0);
                    if (searchBar2.o0) {
                        searchBar2.a();
                        searchBar2.o0 = false;
                    }
                } else {
                    searchBar2.b();
                }
                searchBar2.d(z);
                break;
            default:
                SearchView searchView = (SearchView) viewGroup;
                View.OnFocusChangeListener onFocusChangeListener = searchView.Q0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z);
                }
                break;
        }
    }
}
