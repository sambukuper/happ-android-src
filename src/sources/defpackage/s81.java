package defpackage;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s81 extends t81 {
    @Override // defpackage.gr4
    public final void h(Canvas canvas) {
        if (this.I0.s.isEmpty()) {
            super.h(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        r81 r81Var = this.I0;
        if (i >= 26) {
            canvas.clipOutRect(r81Var.s);
        } else {
            canvas.clipRect(r81Var.s, Region.Op.DIFFERENCE);
        }
        super.h(canvas);
        canvas.restore();
    }
}
