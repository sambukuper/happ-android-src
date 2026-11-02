package defpackage;

import io.sentry.util.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cf implements mn0 {
    public final s98 a;
    public final hi0 b;
    public final cl7 c;

    public cf(s98 s98Var, hi0 hi0Var, cl7 cl7Var) {
        s98Var.getClass();
        this.a = s98Var;
        this.b = hi0Var;
        this.c = cl7Var;
    }

    @Override // defpackage.mn0
    public final ln0 a(yh0 yh0Var, Map map, sn0 sn0Var) throws Exception {
        int i;
        ArrayList arrayList;
        oy1 oy1Var = oy1.k0;
        sn0Var.getClass();
        hi0 hi0Var = this.b;
        int i2 = hi0Var.h;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == 1) {
            i = 1;
        } else {
            if (i2 == 2) {
                c.a(wl7.g0(i2), "Unsupported session mode: ");
                return null;
            }
            i = i2;
        }
        le5 le5VarL = w51.l(hi0Var, this.c, map);
        ArrayList arrayList2 = le5VarL.a;
        if (arrayList2.isEmpty()) {
            Objects.toString(hi0Var);
            sn0Var.a();
            return oy1Var;
        }
        ArrayList arrayList3 = hi0Var.d;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ze5 ze5Var = (ze5) wv0.O0(((be3) it.next()).a.a);
                arrayList4.add(new hd3(ze5Var.a.getWidth(), ze5Var.a.getHeight(), ze5Var.b));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((hd3) it2.next()).c != ((hd3) arrayList.get(0)).c) {
                    bt.i("All InputStream.Config objects must have the same format for multi resolution");
                    return null;
                }
            }
        }
        if (yh0Var.X(new i57(i, arrayList, arrayList2, (Executor) this.a.j.getValue(), sn0Var, hi0Var.f, hi0Var.g))) {
            return new kn0(le5VarL.b, le5VarL.d);
        }
        yh0Var.toString();
        sn0Var.toString();
        sn0Var.a();
        return oy1Var;
    }
}
