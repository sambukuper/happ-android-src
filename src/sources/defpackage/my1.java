package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class my1 extends ly1 {
    @Override // defpackage.ky1, defpackage.iy1, defpackage.ny1
    public void b(e08 e08Var, e08 e08Var2, Window window, View view, boolean z, boolean z2) {
        eu7 y19Var;
        e08Var.getClass();
        e08Var2.getClass();
        window.getClass();
        view.getClass();
        xt7.f(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof gw0)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        lr5 lr5Var = new lr5(view);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            y19Var = new b29(window, lr5Var);
        } else if (i3 >= 30) {
            y19Var = new z19(window, lr5Var);
        } else {
            y19Var = i3 >= 26 ? new y19(window, lr5Var) : new x19(window, lr5Var);
        }
        y19Var.k(!z);
        y19Var.j(!z2);
    }
}
