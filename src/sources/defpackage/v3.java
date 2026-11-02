package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v3 {
    public Object a;
    public Object b;

    public v3(byte b) {
        switch (b) {
            case 3:
                this.a = nr4.f(1);
                this.b = new ux0();
                break;
            case 4:
            default:
                this.b = new int[2];
                break;
            case 5:
                this.a = new CopyOnWriteArraySet();
                this.b = new CopyOnWriteArraySet();
                break;
        }
    }

    public static float j(int i, int i2, int i3) {
        return z91.l((i - i2) / i3, 0.0f, 1.0f);
    }

    public void d(String str) {
        ((CopyOnWriteArraySet) this.a).add(str);
        ((CopyOnWriteArraySet) this.b).remove(str);
    }

    public abstract void e();

    public void f() {
        tp tpVar = (tp) this.a;
        if (tpVar != null) {
            try {
                ((wp) this.b).m0.unregisterReceiver(tpVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter g();

    public abstract int[] h(int i);

    public abstract int i();

    public MenuItem k(MenuItem menuItem) {
        if (!(menuItem instanceof vw7)) {
            return menuItem;
        }
        vw7 vw7Var = (vw7) menuItem;
        l97 l97Var = (l97) this.b;
        if (l97Var == null) {
            l97Var = new l97(0);
            this.b = l97Var;
        }
        MenuItem menuItem2 = (MenuItem) l97Var.get(vw7Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        wt4 wt4Var = new wt4((Context) this.a, vw7Var);
        ((l97) this.b).put(vw7Var, wt4Var);
        return wt4Var;
    }

    public int[] l(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String m() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        dh3.T("text");
        throw null;
    }

    public abstract void n();

    public abstract void o();

    public abstract int[] p(int i);

    public void s(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.ImageView");
            copyOnWriteArraySet.remove("android.widget.ImageView");
        } else {
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
        }
    }

    public void t(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.TextView");
            copyOnWriteArraySet.remove("android.widget.TextView");
        } else {
            copyOnWriteArraySet.add("android.widget.TextView");
            copyOnWriteArraySet2.remove("android.widget.TextView");
        }
    }

    public void u() {
        f();
        IntentFilter intentFilterG = g();
        if (intentFilterG.countActions() == 0) {
            return;
        }
        tp tpVar = (tp) this.a;
        if (tpVar == null) {
            tpVar = new tp(this);
            this.a = tpVar;
        }
        ((wp) this.b).m0.registerReceiver(tpVar, intentFilterG);
    }

    public abstract void v();

    public void r() {
    }

    public void w() {
    }

    public void x() {
    }

    public void q(i20 i20Var) {
    }

    public v3(int i) {
        this.b = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.b).add(new kw1());
        }
    }

    public v3(Context context) {
        this.a = context;
    }

    public v3(wp wpVar) {
        this.b = wpVar;
    }
}
