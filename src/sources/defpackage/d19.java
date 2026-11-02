package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d19 extends k19 {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public fe3 f;

    public d19() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.k19
    public w19 b() {
        a();
        w19 w19VarG = w19.g(null, this.e);
        fe3[] fe3VarArr = this.b;
        t19 t19Var = w19VarG.a;
        t19Var.v(fe3VarArr);
        t19Var.x(this.f);
        t19Var.u(null);
        t19Var.z(this.c);
        t19Var.A(this.d);
        return w19VarG;
    }

    @Override // defpackage.k19
    public void f(fe3 fe3Var) {
        this.f = fe3Var;
    }

    @Override // defpackage.k19
    public void h(fe3 fe3Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(fe3Var.a, fe3Var.b, fe3Var.c, fe3Var.d);
        }
    }

    public d19(w19 w19Var) {
        super(w19Var);
        this.e = w19Var.f();
    }
}
