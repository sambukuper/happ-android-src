package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cc0 {
    public final /* synthetic */ byte a;
    public ArrayList b;

    public cc0(y5 y5Var) {
        this.a = (byte) 3;
        y5Var.getClass();
        int i = k39.a;
        e31 e31Var = (e31) y5Var.Z;
        z35 z35Var = (z35) y5Var.f0;
        ArrayList arrayListN = i21.N(new x40(e31Var, (byte) 0), new x40((y40) y5Var.g0, (byte) 1), new x40((e31) y5Var.h0, (byte) 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Object systemService = ((Context) y5Var.Y).getSystemService("connectivity");
            systemService.getClass();
            arrayListN.add(new v35((ConnectivityManager) systemService));
        } else {
            z35Var.getClass();
            arrayListN.addAll(i21.L(new x40(z35Var, (byte) 2), new x40(z35Var, (byte) 3), new s35(z35Var), new r35(z35Var)));
        }
        this.b = arrayListN;
    }

    public void a(bc0 bc0Var) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int i = 0;
        while (true) {
            int size = this.b.size();
            ArrayList arrayList = this.b;
            if (i >= size) {
                arrayList.add(bc0Var);
                return;
            } else {
                if (((bc0) arrayList.get(i)).a.b > bc0Var.a.b) {
                    this.b.add(i, bc0Var);
                    return;
                }
                i++;
            }
        }
    }

    public void b(cc0 cc0Var) {
        if (cc0Var.b == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList(cc0Var.b.size());
        }
        Iterator it = cc0Var.b.iterator();
        while (it.hasNext()) {
            a((bc0) it.next());
        }
    }

    public void c() {
        this.b.add(ri5.c);
    }

    public void d(float f, float f2) {
        this.b.add(new ui5(f, f2));
    }

    public void e(float f, float f2) {
        this.b.add(new vi5(f, f2));
    }

    public void f(float f, float f2, float f3, float f4) {
        this.b.add(new fj5(f, f2, f3, f4));
    }

    public xe2 g(l49 l49Var) {
        l49Var.getClass();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((w21) obj).c(l49Var)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(xv0.Z(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((w21) it.next()).b(l49Var.j));
        }
        return w51.t(new j31((xe2[]) wv0.Y0(arrayList3).toArray(new xe2[0]), (byte) 9));
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (this.b == null) {
                    return _UrlKt.FRAGMENT_ENCODE_SET;
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    sb.append(((bc0) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public cc0(ez3 ez3Var) {
        this.a = (byte) 1;
        this.b = new ArrayList(1);
    }

    public cc0(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new ArrayList(32);
                break;
            default:
                this.b = null;
                break;
        }
    }
}
