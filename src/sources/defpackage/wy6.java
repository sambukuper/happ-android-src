package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.leanback.widget.SearchBar;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wy6 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ SearchBar Y;

    public /* synthetic */ wy6(SearchBar searchBar, byte b) {
        this.X = b;
        this.Y = searchBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        SearchBar searchBar = this.Y;
        switch (b) {
            case 0:
                searchBar.setSearchQueryInternal(searchBar.f0.getText().toString());
                break;
            default:
                searchBar.f0.requestFocusFromTouch();
                searchBar.f0.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, searchBar.f0.getWidth(), searchBar.f0.getHeight(), 0));
                searchBar.f0.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, searchBar.f0.getWidth(), searchBar.f0.getHeight(), 0));
                break;
        }
    }
}
