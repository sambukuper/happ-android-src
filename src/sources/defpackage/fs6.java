package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fs6 extends et6 implements ct6 {
    public ArrayList h = new ArrayList();
    public Boolean i;
    public Matrix j;
    public int k;
    public String l;

    @Override // defpackage.ct6
    public final void e(gt6 gt6Var) throws gu6 {
        if (gt6Var instanceof xs6) {
            this.h.add(gt6Var);
            return;
        }
        throw new gu6("Gradient elements cannot contain " + gt6Var + " elements.");
    }

    @Override // defpackage.ct6
    public final List g() {
        return this.h;
    }
}
