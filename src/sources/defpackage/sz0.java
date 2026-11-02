package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sz0 implements j04 {
    public final ArrayList X;

    public sz0(byte b) {
        switch (b) {
            case 1:
                this.X = new ArrayList();
                break;
            default:
                this.X = new ArrayList();
                break;
        }
    }

    @Override // defpackage.j04
    public i04 a(qs0 qs0Var) {
        return null;
    }

    @Override // defpackage.j04
    public void b(Object obj) {
        if (obj instanceof String) {
            this.X.add((String) obj);
        }
    }

    @Override // defpackage.j04
    public void c() {
        i((String[]) this.X.toArray(new String[0]));
    }

    public boolean d(int i, np2 np2Var, Object obj) {
        ArrayList arrayList = np2Var.a;
        if (arrayList == null) {
            f(i, np2Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof gp2)) {
                if (!(obj2 instanceof np2)) {
                    b61.o(obj2, "Unexpected child source info ");
                    break;
                }
                if (d(i, (np2) obj2, obj)) {
                    f(0, np2Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                f(0, np2Var, obj2);
                return true;
            }
        }
        return false;
    }

    public void f(int i, np2 np2Var, Object obj) {
        this.X.add(new tz0(i, null, null));
    }

    public void g(int i, Object obj, np2 np2Var, Object obj2) {
        if (dh3.f(obj, zz0.a)) {
            f(i, np2Var, null);
        }
    }

    public abstract void i(String[] strArr);

    @Override // defpackage.j04
    public void h(vs0 vs0Var) {
    }

    @Override // defpackage.j04
    public void e(qs0 qs0Var, v15 v15Var) {
    }
}
