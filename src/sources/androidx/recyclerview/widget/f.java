package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.fm2;
import defpackage.y86;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public final y86 a = new y86();
    public boolean b = false;

    public abstract int a();

    public long b(int i) {
        return -1L;
    }

    public int c(int i) {
        return 0;
    }

    public abstract void e(l lVar, int i);

    public void f(l lVar, int i, List list) {
        e(lVar, i);
    }

    public l g(ViewGroup viewGroup, int i) {
        int i2 = fm2.u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new fm2(frameLayout);
    }

    public boolean i(l lVar) {
        return false;
    }

    public void d(RecyclerView recyclerView) {
    }

    public void h(RecyclerView recyclerView) {
    }

    public void j(l lVar) {
    }

    public void k(l lVar) {
    }
}
