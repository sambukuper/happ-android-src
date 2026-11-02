package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s19 extends r19 {
    public s19(w19 w19Var, WindowInsets windowInsets) {
        super(w19Var, windowInsets);
    }

    @Override // defpackage.l19, defpackage.t19
    public List<Rect> e(int i) {
        return this.c.getBoundingRects(v19.a(i));
    }

    @Override // defpackage.l19, defpackage.t19
    public List<Rect> f(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(v19.a(i));
    }

    @Override // defpackage.l19, defpackage.t19
    public void p() {
    }
}
