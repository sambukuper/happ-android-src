package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class t19 {
    public static final w19 b;
    public final w19 a;

    static {
        k19 e19Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            e19Var = new j19();
        } else if (i >= 35) {
            e19Var = new i19();
        } else if (i >= 34) {
            e19Var = new h19();
        } else if (i >= 31) {
            e19Var = new g19();
        } else if (i >= 30) {
            e19Var = new f19();
        } else {
            e19Var = i >= 29 ? new e19() : new d19();
        }
        b = e19Var.b().a.a().a.b().a.c();
    }

    public t19(w19 w19Var) {
        this.a = w19Var;
    }

    public w19 a() {
        return this.a;
    }

    public w19 b() {
        return this.a;
    }

    public w19 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t19)) {
            return false;
        }
        t19 t19Var = (t19) obj;
        return s() == t19Var.s() && r() == t19Var.r() && Objects.equals(m(), t19Var.m()) && Objects.equals(k(), t19Var.k()) && Objects.equals(g(), t19Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public up1 g() {
        return null;
    }

    public fe3 h(int i) {
        return fe3.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public fe3 i(int i) {
        if ((i & 8) == 0) {
            return fe3.e;
        }
        bt.q("Unable to query the maximum insets for IME");
        return null;
    }

    public fe3 j() {
        return m();
    }

    public fe3 k() {
        return fe3.e;
    }

    public fe3 l() {
        return m();
    }

    public fe3 m() {
        return fe3.e;
    }

    public fe3 n() {
        return m();
    }

    public w19 q(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t(int i) {
        return true;
    }

    public void p() {
    }

    public void A(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void u(yp1 yp1Var) {
    }

    public void v(fe3[] fe3VarArr) {
    }

    public void w(w19 w19Var) {
    }

    public void x(fe3 fe3Var) {
    }

    public void y(int i) {
    }

    public void z(Rect[][] rectArr) {
    }
}
