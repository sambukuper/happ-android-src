package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public final class qj3 implements dn2 {
    public final /* synthetic */ byte X;
    public final rj3 Y;

    public /* synthetic */ qj3(rj3 rj3Var, byte b) {
        this.X = b;
        this.Y = rj3Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        rj3 rj3Var = this.Y;
        switch (b) {
            case 0:
                return wv0.y0(rj3Var.g(), _UrlKt.FRAGMENT_ENCODE_SET, "<init>(", ")V", cl1.m0, 24);
            case 1:
                return u15.j(rj3Var.Y);
            case 2:
                gu guVarD1 = wv0.d1(rj3Var.Z);
                ArrayList arrayList = new ArrayList(xv0.Z(guVarD1, 10));
                Iterator it = guVarD1.iterator();
                while (true) {
                    rw1 rw1Var = (rw1) it;
                    if (!rw1Var.Y.hasNext()) {
                        return arrayList;
                    }
                    pb3 pb3Var = (pb3) rw1Var.next();
                    int i = pb3Var.a;
                    Method method = (Method) pb3Var.b;
                    method.getClass();
                    arrayList.add(new sj3(rj3Var, method, i));
                }
                break;
            case 3:
                Class clsM = zc1.M(rj3Var.Y);
                List list = rj3Var.Z;
                ArrayList arrayList2 = new ArrayList(xv0.Z(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new em(clsM, arrayList2, cm.Y, dm.X, rj3Var.Z);
            default:
                Class clsM2 = zc1.M(rj3Var.Y);
                List list2 = rj3Var.Z;
                ArrayList arrayList3 = new ArrayList(xv0.Z(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((Method) it3.next()).getName());
                }
                return new em(clsM2, arrayList3, cm.X, dm.X, rj3Var.Z);
        }
    }
}
