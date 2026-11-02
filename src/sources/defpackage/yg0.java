package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yg0 extends xg0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public yg0(List list) {
        this.a = (byte) 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xg0 xg0Var = (xg0) it.next();
            if (!(xg0Var instanceof zg0)) {
                ((ArrayList) this.b).add(xg0Var);
            }
        }
    }

    @Override // defpackage.xg0
    public void a(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xg0) it.next()).a(i);
                }
                break;
        }
    }

    @Override // defpackage.xg0
    public final void b(int i, dh0 dh0Var) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xg0) it.next()).b(i, dh0Var);
                }
                return;
            case 1:
                cv4 cv4Var = (cv4) this.b;
                synchronized (cv4Var.X) {
                    try {
                        if (cv4Var.g0) {
                            return;
                        }
                        cv4Var.k0.put(dh0Var.getTimestamp(), new eh0(dh0Var));
                        cv4Var.j();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                oy8 oy8Var = (oy8) ((WeakReference) this.b).get();
                if (oy8Var != null) {
                    Iterator it2 = oy8Var.X.iterator();
                    while (it2.hasNext()) {
                        f57 f57Var = ((hq8) it2.next()).o;
                        Iterator it3 = f57Var.g.d.iterator();
                        while (it3.hasNext()) {
                            ((xg0) it3.next()).b(i, new gj4(-1L, dh0Var, f57Var.g.e));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.xg0
    public void c(int i, ra raVar) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xg0) it.next()).c(i, raVar);
                }
                break;
        }
    }

    @Override // defpackage.xg0
    public void d(int i, int i2) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xg0) it.next()).d(i, i2);
                }
                break;
        }
    }

    @Override // defpackage.xg0
    public void e(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((xg0) it.next()).e(i);
                }
                break;
        }
    }

    public yg0(oy8 oy8Var) {
        this.a = (byte) 2;
        this.b = new WeakReference(oy8Var);
    }

    public yg0(cv4 cv4Var) {
        this.a = (byte) 1;
        this.b = cv4Var;
    }
}
