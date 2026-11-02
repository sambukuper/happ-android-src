package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fi7 implements qd1 {
    public final k17 a;

    public fi7(k17 k17Var) {
        this.a = k17Var;
    }

    @Override // defpackage.qd1
    public final sd1 a(le7 le7Var, pd5 pd5Var) {
        ImageDecoder.Source sourceM;
        Bitmap.Config configA = b73.a(pd5Var);
        if ((configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) && (sourceM = wa.M(le7Var.a, pd5Var, false)) != null) {
            return new hi7(sourceM, le7Var.a, pd5Var, this.a);
        }
        return null;
    }
}
