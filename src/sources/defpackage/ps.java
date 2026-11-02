package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ps {
    public final /* synthetic */ byte a;
    public final ArrayList b;

    public ps(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ArrayList(20);
                break;
            case 2:
                this.b = new ArrayList();
                new ArrayList();
                bv4.a.getClass();
                List listA = av4.a();
                ArrayList arrayList = new ArrayList(xv0.Z(listA, 10));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((nt3) ((bv4) it.next())).getClass();
                    arrayList.add(new mt3());
                }
                break;
            case 3:
                this.b = new ArrayList(9);
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    public void a(qj2 qj2Var) {
        boolean z = qj2Var instanceof s55;
        ArrayList arrayList = this.b;
        if (z) {
            arrayList.add(qj2Var);
        } else {
            if (!(qj2Var instanceof b11)) {
                b61.c();
                return;
            }
            Iterator it = ((b11) qj2Var).a.iterator();
            while (it.hasNext()) {
                arrayList.add((s55) it.next());
            }
        }
    }

    public void b(Object obj) {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 3:
                if (obj == null) {
                    b61.i("Set contributions cannot be null");
                } else {
                    arrayList.add(obj);
                }
                break;
            default:
                arrayList.add(obj);
                break;
        }
    }

    public void c(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.b;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public nz2 d() {
        return new nz2((String[]) this.b.toArray(new String[0]));
    }

    public void e(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public ps(int i) {
        this.a = (byte) 4;
        this.b = new ArrayList(i);
    }
}
