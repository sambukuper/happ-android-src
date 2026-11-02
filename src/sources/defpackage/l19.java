package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l19 extends t19 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public fe3[] d;
    public fe3 e;
    public w19 f;
    public fe3 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public l19(w19 w19Var, WindowInsets windowInsets) {
        super(w19Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private yp1 B(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return yp1.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        im6 im6VarN = tc.n(display, 0);
        im6 im6VarN2 = tc.n(display, 1);
        im6 im6VarN3 = tc.n(display, 2);
        im6 im6VarN4 = tc.n(display, 3);
        return yp1.a(point.x, point.y, false, im6VarN != null ? im6VarN.b : 0, im6VarN2 != null ? im6VarN2.b : 0, im6VarN3 != null ? im6VarN3.b : 0, im6VarN4 != null ? im6VarN4.b : 0);
    }

    private static List<Rect> C(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[du7.c(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] D(fe3 fe3Var) {
        ArrayList arrayList = new ArrayList();
        int i = fe3Var.a;
        int i2 = fe3Var.d;
        int i3 = fe3Var.c;
        int i4 = fe3Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, fe3Var.a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private fe3 E(int i, boolean z) {
        fe3 fe3VarA = fe3.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                fe3VarA = fe3.a(fe3VarA, F(i2, z));
            }
        }
        return fe3VarA;
    }

    private fe3 G() {
        w19 w19Var = this.f;
        return w19Var != null ? w19Var.a.k() : fe3.e;
    }

    private fe3 H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            u52.k("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!m) {
            J();
        }
        Method method = n;
        if (method != null && o != null && p != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    return null;
                }
                Rect rect = (Rect) p.get(q.get(objInvoke));
                if (rect != null) {
                    return fe3.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    private static void J() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        m = true;
    }

    public static boolean L(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.t19
    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    public fe3 F(int i, boolean z) {
        fe3 fe3VarK;
        int i2;
        fe3 fe3Var = fe3.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    fe3[] fe3VarArr = this.d;
                    fe3VarK = fe3VarArr != null ? fe3VarArr[du7.c(8)] : null;
                    if (fe3VarK != null) {
                        return fe3VarK;
                    }
                    fe3 fe3VarM = m();
                    fe3 fe3VarG = G();
                    int i3 = fe3VarM.d;
                    if (i3 > fe3VarG.d) {
                        return fe3.c(0, 0, 0, i3);
                    }
                    fe3 fe3Var2 = this.g;
                    if (fe3Var2 != null && !fe3Var2.equals(fe3Var) && (i2 = this.g.d) > fe3VarG.d) {
                        return fe3.c(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return l();
                    }
                    if (i == 32) {
                        return j();
                    }
                    if (i == 64) {
                        return n();
                    }
                    if (i == 128) {
                        w19 w19Var = this.f;
                        up1 up1VarG = w19Var != null ? w19Var.a.g() : g();
                        if (up1VarG != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return fe3.c(i4 >= 28 ? en.B(up1VarG.a) : 0, i4 >= 28 ? en.D(up1VarG.a) : 0, i4 >= 28 ? en.C(up1VarG.a) : 0, i4 >= 28 ? en.A(up1VarG.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    fe3 fe3VarG2 = G();
                    fe3 fe3VarK2 = k();
                    return fe3.c(Math.max(fe3VarG2.a, fe3VarK2.a), 0, Math.max(fe3VarG2.c, fe3VarK2.c), Math.max(fe3VarG2.d, fe3VarK2.d));
                }
                if ((this.h & 2) == 0) {
                    fe3 fe3VarM2 = m();
                    w19 w19Var2 = this.f;
                    fe3VarK = w19Var2 != null ? w19Var2.a.k() : null;
                    int iMin = fe3VarM2.d;
                    if (fe3VarK != null) {
                        iMin = Math.min(iMin, fe3VarK.d);
                    }
                    return fe3.c(fe3VarM2.a, 0, fe3VarM2.c, iMin);
                }
            }
        } else {
            if (z) {
                return fe3.c(0, Math.max(G().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return fe3.c(0, m().b, 0, 0);
            }
        }
        return fe3Var;
    }

    public boolean I(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !F(i, false).equals(fe3.e);
    }

    public void K(fe3 fe3Var) {
        this.g = fe3Var;
    }

    @Override // defpackage.t19
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        fe3 fe3VarH = H(view);
        if (fe3VarH == null) {
            fe3VarH = fe3.e;
        }
        K(fe3VarH);
    }

    @Override // defpackage.t19
    public List<Rect> e(int i) {
        return C(this.k, i);
    }

    @Override // defpackage.t19
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        l19 l19Var = (l19) obj;
        return Objects.equals(this.g, l19Var.g) && L(this.h, l19Var.h);
    }

    @Override // defpackage.t19
    public List<Rect> f(int i) {
        return C(this.l, i);
    }

    @Override // defpackage.t19
    public fe3 h(int i) {
        return E(i, false);
    }

    @Override // defpackage.t19
    public fe3 i(int i) {
        return E(i, true);
    }

    @Override // defpackage.t19
    public final fe3 m() {
        fe3 fe3Var = this.e;
        if (fe3Var != null) {
            return fe3Var;
        }
        WindowInsets windowInsets = this.c;
        fe3 fe3VarC = fe3.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = fe3VarC;
        return fe3VarC;
    }

    @Override // defpackage.t19
    public void o(View view) {
        B(view);
    }

    @Override // defpackage.t19
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iC = du7.c(i);
            this.k[iC] = D(h(i));
            if (i != 8) {
                this.l[iC] = D(i(i));
            }
        }
    }

    @Override // defpackage.t19
    public w19 q(int i, int i2, int i3, int i4) {
        k19 e19Var;
        w19 w19VarG = w19.g(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            e19Var = new j19(w19VarG);
        } else if (i5 >= 35) {
            e19Var = new i19(w19VarG);
        } else if (i5 >= 34) {
            e19Var = new h19(w19VarG);
        } else if (i5 >= 31) {
            e19Var = new g19(w19VarG);
        } else if (i5 >= 30) {
            e19Var = new f19(w19VarG);
        } else {
            e19Var = i5 >= 29 ? new e19(w19VarG) : new d19(w19VarG);
        }
        e19Var.h(w19.e(m(), i, i2, i3, i4));
        e19Var.f(w19.e(k(), i, i2, i3, i4));
        return e19Var.b();
    }

    @Override // defpackage.t19
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.t19
    public boolean t(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !I(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.t19
    public void v(fe3[] fe3VarArr) {
        this.d = fe3VarArr;
    }

    @Override // defpackage.t19
    public void w(w19 w19Var) {
        this.f = w19Var;
    }

    @Override // defpackage.t19
    public void y(int i) {
        this.h = i;
    }

    @Override // defpackage.t19
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.t19
    public void u(yp1 yp1Var) {
    }
}
