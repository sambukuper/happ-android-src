package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tw7 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ uw7 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public tt4 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public tw7(uw7 uw7Var, Menu menu) {
        this.E = uw7Var;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        uw7 uw7Var = this.E;
        Context context = uw7Var.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                bt.i("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object objA = uw7Var.d;
            if (objA == null) {
                objA = uw7.a(context);
                uw7Var.d = objA;
            }
            String str = this.y;
            sw7 sw7Var = new sw7();
            sw7Var.b = objA;
            Class<?> cls = objA.getClass();
            try {
                sw7Var.c = cls.getMethod(str, sw7.d);
                menuItem.setOnMenuItemClickListener(sw7Var);
            } catch (Exception e) {
                StringBuilder sbP = p61.p("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbP.append(cls.getName());
                InflateException inflateException = new InflateException(sbP.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof st4) {
                st4 st4Var = (st4) menuItem;
                st4Var.x = (st4Var.x & (-5)) | 4;
            } else if (menuItem instanceof wt4) {
                wt4 wt4Var = (wt4) menuItem;
                vw7 vw7Var = wt4Var.c;
                try {
                    Method declaredMethod = wt4Var.d;
                    if (declaredMethod == null) {
                        declaredMethod = vw7Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        wt4Var.d = declaredMethod;
                    }
                    declaredMethod.invoke(vw7Var, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, uw7.e, uw7Var.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        tt4 tt4Var = this.z;
        if (tt4Var != null && (menuItem instanceof vw7)) {
            ((vw7) menuItem).a(tt4Var);
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof vw7;
        if (z2) {
            ((vw7) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ue3.S(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((vw7) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ue3.f0(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((vw7) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ue3.M(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((vw7) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ue3.b0(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((vw7) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                ue3.Y(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((vw7) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                ue3.X(menuItem, colorStateList);
            }
        }
    }
}
