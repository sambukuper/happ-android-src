package defpackage;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class te implements mn0 {
    public final cl7 a;

    public te(cl7 cl7Var, s98 s98Var) {
        s98Var.getClass();
        this.a = cl7Var;
    }

    @Override // defpackage.mn0
    public final ln0 a(yh0 yh0Var, Map map, sn0 sn0Var) throws Exception {
        sn0Var.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
        }
        if (yh0Var.J0(arrayList, sn0Var)) {
            return new kn0(e02.X, w51.m(map, this.a));
        }
        yh0Var.toString();
        sn0Var.toString();
        sn0Var.a();
        return oy1.k0;
    }
}
