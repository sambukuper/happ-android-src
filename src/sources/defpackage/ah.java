package defpackage;

import android.R;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ah {
    public final bh a;
    public final yg b;
    public final yg c;
    public final View d;

    public ah(bh bhVar, yg ygVar, yg ygVar2, View view) {
        this.a = bhVar;
        this.b = ygVar;
        this.c = ygVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        g38 g38Var = (g38) this.b.invoke();
        byte b = 0;
        if (dh3.f(g38Var, null)) {
            return false;
        }
        menu.clear();
        List list = g38Var.a;
        int size = list.size();
        int i2 = 1;
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            f38 f38Var = (f38) list.get(i4);
            if (f38Var instanceof n38) {
                int i5 = i2 + 1;
                Object obj = f38Var.a;
                if (dh3.f(obj, w79.c)) {
                    i = R.id.cut;
                } else if (dh3.f(obj, w79.d)) {
                    i = R.id.copy;
                } else if (dh3.f(obj, w79.e)) {
                    i = R.id.paste;
                } else if (dh3.f(obj, w79.f)) {
                    i = R.id.selectAll;
                } else {
                    i = dh3.f(obj, w79.g) ? R.id.autofill : i2;
                }
                n38 n38Var = (n38) f38Var;
                MenuItem menuItemAdd = menu.add(i3, i, i2, n38Var.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new zg(n38Var, this, b));
                i2 = i5;
            } else if (f38Var instanceof u38) {
                if (Build.VERSION.SDK_INT >= 28) {
                    u38 u38Var = (u38) f38Var;
                    en.a(menu, i2, this.d.getContext(), u38Var.b, u38Var.c, u38Var.d);
                    i2++;
                }
            } else if (f38Var instanceof s38) {
                i3++;
            }
        }
        return true;
    }
}
