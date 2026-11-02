package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ph extends TextPaint {
    public df a;
    public x38 b;
    public byte c;
    public t67 d;
    public dw0 e;
    public d90 f;
    public zi1 g;
    public ua7 h;
    public tv1 i;

    public final df a() {
        df dfVar = this.a;
        if (dfVar != null) {
            return dfVar;
        }
        df dfVar2 = new df(this);
        this.a = dfVar2;
        return dfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().e(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    public final void c(d90 d90Var, long j, float f) {
        if (d90Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (d90Var instanceof fe7) {
            d(ln7.d(f, ((fe7) d90Var).a));
            return;
        }
        if (!(d90Var instanceof q67)) {
            b61.c();
            return;
        }
        byte b = 0;
        if (dh3.f(this.f, d90Var)) {
            ua7 ua7Var = this.h;
            if (!(ua7Var == null ? false : ua7.a(ua7Var.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = d90Var;
                    this.h = new ua7(j);
                    this.g = rd7.b(new oh(d90Var, j, b));
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f = d90Var;
            this.h = new ua7(j);
            this.g = rd7.b(new oh(d90Var, j, b));
        }
        df dfVarA = a();
        zi1 zi1Var = this.g;
        dfVarA.i(zi1Var != null ? (Shader) zi1Var.getValue() : null);
        this.e = null;
        mb6.Z(this, f);
    }

    public final void d(long j) {
        dw0 dw0Var = this.e;
        if ((dw0Var == null ? false : tk8.a(dw0Var.a, j)) || j == 16) {
            return;
        }
        this.e = new dw0(j);
        setColor(z51.U(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(tv1 tv1Var) {
        if (tv1Var == null || dh3.f(this.i, tv1Var)) {
            return;
        }
        this.i = tv1Var;
        if (tv1Var.equals(ea2.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(tv1Var instanceof om7)) {
            b61.c();
            return;
        }
        a().m(1);
        om7 om7Var = (om7) tv1Var;
        a().l(om7Var.a);
        df dfVarA = a();
        dfVarA.a.setStrokeMiter(om7Var.b);
        a().k(om7Var.d);
        a().j(om7Var.c);
        a().a.setPathEffect(null);
    }

    public final void f(t67 t67Var) {
        if (t67Var == null || dh3.f(this.d, t67Var)) {
            return;
        }
        this.d = t67Var;
        if (t67Var.equals(t67.d)) {
            clearShadowLayer();
            return;
        }
        t67 t67Var2 = this.d;
        float f = t67Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (t67Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), z51.U(this.d.a));
    }

    public final void g(x38 x38Var) {
        if (x38Var == null || dh3.f(this.b, x38Var)) {
            return;
        }
        this.b = x38Var;
        int i = x38Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
