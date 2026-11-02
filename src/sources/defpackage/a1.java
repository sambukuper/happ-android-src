package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a1 implements ow3 {
    @Override // defpackage.ow3
    public Object b(rd1 rd1Var) {
        return i(rd1Var);
    }

    public Object e() {
        return new ArrayList();
    }

    public int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    public Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    public int h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    public final Object i(rd1 rd1Var) {
        Object objE = e();
        int iF = f(objE);
        f01 f01VarT = rd1Var.t(d());
        while (true) {
            int iE = f01VarT.e(d());
            if (iE == -1) {
                f01VarT.n(d());
                return l(objE);
            }
            j(f01VarT, iE + iF, objE);
        }
    }

    public abstract void j(f01 f01Var, int i, Object obj);

    public Object k(Object obj) {
        throw null;
    }

    public Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }
}
