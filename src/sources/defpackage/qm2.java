package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qm2 {
    public static final sv i;
    public final long a;
    public final long b;
    public final long c;
    public final nm2 d;
    public final gb4 e;
    public final tv f;
    public final qv g;
    public final CopyOnWriteArrayList h;

    static {
        sv svVar = new sv();
        svVar.a = 0L;
        i = svVar;
    }

    public qm2(te6 te6Var, long j, long j2, Set set) {
        Object next;
        te6Var.getClass();
        this.a = j;
        this.b = j2;
        sv svVar = i;
        svVar.getClass();
        this.c = sv.b.incrementAndGet(svVar);
        this.d = new nm2(this);
        gb4 gb4VarR = i21.r();
        Iterator it = te6Var.U().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i2 = ((dl7) it.next()).a;
            Iterator it2 = set.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((fl0) next).a != i2);
            fl0 fl0Var = (fl0) next;
            if (fl0Var != null) {
                ArrayList arrayList = fl0Var.b;
                qv qvVarF = nr4.f(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    gb4VarR.add(new om2(this, i2, ((bl7) arrayList.get(i3)).a, qvVarF));
                }
            }
        }
        gb4 gb4VarJ = i21.j(gb4VarR);
        this.e = gb4VarJ;
        this.f = nr4.g(pm2.X);
        ArrayList arrayList2 = new ArrayList(xv0.Z(gb4VarJ, 10));
        ListIterator listIterator = gb4VarJ.listIterator(0);
        while (true) {
            o03 o03Var = (o03) listIterator;
            if (!o03Var.hasNext()) {
                this.g = nr4.f(wv0.Y0(wv0.b1(arrayList2)).size());
                this.h = new CopyOnWriteArrayList();
                return;
            }
            arrayList2.add(new dl7(((om2) o03Var.next()).c));
        }
    }

    public final String toString() {
        return "Frame-" + ((Object) ("FrameId(value=" + this.c + ')')) + '(' + this.a + '@' + this.b + ')';
    }
}
