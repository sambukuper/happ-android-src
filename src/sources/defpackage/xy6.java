package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.leanback.widget.SearchBar;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xy6 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ xy6(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                SearchBar searchBar = (SearchBar) viewGroup;
                if (2 != i) {
                    return false;
                }
                searchBar.n0.hideSoftInputFromWindow(searchBar.f0.getWindowToken(), 0);
                searchBar.m0.postDelayed(new xb(this, (byte) 18), 500L);
                return true;
            default:
                ((SearchView) viewGroup).q();
                return true;
        }
    }
}
