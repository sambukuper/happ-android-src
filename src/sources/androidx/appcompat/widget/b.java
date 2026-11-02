package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import defpackage.eu4;
import defpackage.nt4;
import defpackage.qw1;
import defpackage.rt4;
import defpackage.st4;
import defpackage.yr2;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ListPopupWindow implements rt4 {
    public static final Method F0;
    public yr2 E0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                F0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // defpackage.rt4
    public final void c(nt4 nt4Var, MenuItem menuItem) {
        yr2 yr2Var = this.E0;
        if (yr2Var != null) {
            yr2Var.c(nt4Var, menuItem);
        }
    }

    @Override // defpackage.rt4
    public final void k(nt4 nt4Var, st4 st4Var) {
        yr2 yr2Var = this.E0;
        if (yr2Var != null) {
            yr2Var.k(nt4Var, st4Var);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    public final qw1 q(Context context, boolean z) {
        eu4 eu4Var = new eu4(context, z);
        eu4Var.setHoverListener(this);
        return eu4Var;
    }
}
