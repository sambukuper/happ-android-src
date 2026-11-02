package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.j;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kg5 extends kx8 {
    public final LinearLayoutManager a;
    public lx8 b;

    public kg5(jx8 jx8Var) {
        this.a = jx8Var;
    }

    @Override // defpackage.kx8
    public final void b(int i, float f, int i2) {
        if (this.b == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.a;
            if (i3 >= linearLayoutManager.I()) {
                return;
            }
            View viewH = linearLayoutManager.H(i3);
            if (viewH == null) {
                Locale locale = Locale.US;
                bt.i(pc6.k(i3, "LayoutManager returned a null child at pos ", linearLayoutManager.I(), "/", " while transforming pages"));
                return;
            }
            j.T(viewH);
            ok7 ok7Var = (ok7) ((o61) this.b).Y;
            View viewFindViewById = viewH.findViewById(e46.scroll_body);
            viewFindViewById.getClass();
            byte b = 1;
            viewFindViewById.setOnTouchListener(new hk7(ok7Var, b));
            viewH.setOnTouchListener(new hk7(ok7Var, b));
            i3++;
        }
    }

    @Override // defpackage.kx8
    public final void a(int i) {
    }
}
