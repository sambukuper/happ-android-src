package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ul2 extends z86 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ul2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.z86
    public void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((vl2) obj).b(true);
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                recyclerView.k1.f = true;
                recyclerView.a0(true);
                if (!recyclerView.j0.y()) {
                    recyclerView.requestLayout();
                }
                break;
        }
    }

    @Override // defpackage.z86
    public void b() {
        switch (this.a) {
            case 0:
                a();
                break;
        }
    }

    @Override // defpackage.z86
    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                a();
                break;
            case 1:
            default:
                super.c(i, i2, obj);
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.k(null);
                d7 d7Var = recyclerView.j0;
                ArrayList arrayList = (ArrayList) d7Var.d;
                if (i2 >= 1) {
                    arrayList.add(d7Var.A(obj, 4, i, i2));
                    d7Var.b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.z86
    public void d(int i, int i2) {
        switch (this.a) {
            case 0:
                a();
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.k(null);
                d7 d7Var = recyclerView.j0;
                ArrayList arrayList = (ArrayList) d7Var.d;
                if (i2 >= 1) {
                    arrayList.add(d7Var.A(null, 1, i, i2));
                    d7Var.b |= 1;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.z86
    public final void e(int i, int i2) {
        byte b = this.a;
        byte b2 = 1;
        q51 q51Var = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                a();
                break;
            case 1:
                PerAppProxyActivity perAppProxyActivity = (PerAppProxyActivity) obj;
                jm4.Q(ys0.z(perAppProxyActivity.getH0()), null, new i74(perAppProxyActivity, i, q51Var, b2), 3);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                d7 d7Var = recyclerView.j0;
                ArrayList arrayList = (ArrayList) d7Var.d;
                if (i != i2) {
                    arrayList.add(d7Var.A(null, 8, i, i2));
                    d7Var.b |= 8;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.z86
    public void f(int i, int i2) {
        switch (this.a) {
            case 0:
                a();
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.k(null);
                d7 d7Var = recyclerView.j0;
                ArrayList arrayList = (ArrayList) d7Var.d;
                if (i2 >= 1) {
                    arrayList.add(d7Var.A(null, 2, i, i2));
                    d7Var.b |= 2;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!recyclerView.z0 || !recyclerView.y0) {
            recyclerView.G0 = true;
            recyclerView.requestLayout();
        } else {
            v86 v86Var = recyclerView.n0;
            WeakHashMap weakHashMap = cw8.a;
            recyclerView.postOnAnimation(v86Var);
        }
    }
}
