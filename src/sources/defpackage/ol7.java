package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ol7 {
    public final h70 a;
    public final vm3 b;
    public final q59 c;
    public final ol7[] d;
    public final g55 e;
    public final mn3 f;
    public boolean g;
    public String h;
    public String i;

    public ol7(h70 h70Var, vm3 vm3Var, q59 q59Var, ol7[] ol7VarArr) {
        h70Var.getClass();
        this.a = h70Var;
        this.b = vm3Var;
        this.c = q59Var;
        this.d = ol7VarArr;
        this.e = vm3Var.b;
        this.f = vm3Var.a;
        int iOrdinal = q59Var.ordinal();
        if (ol7VarArr != null) {
            ol7 ol7Var = ol7VarArr[iOrdinal];
            if (ol7Var == null && ol7Var == this) {
                return;
            }
            ol7VarArr[iOrdinal] = this;
        }
    }

    public final ol7 a(e37 e37Var) {
        ol7 ol7Var;
        e37Var.getClass();
        vm3 vm3Var = this.b;
        q59 q59VarG = d28.g(vm3Var, e37Var);
        char c = q59VarG.X;
        h70 h70Var = this.a;
        h70Var.h(c);
        h70Var.Y = true;
        String str = this.h;
        if (str != null) {
            String strA = this.i;
            if (strA == null) {
                strA = e37Var.a();
            }
            h70Var.f();
            h70Var.l(str);
            h70Var.h(':');
            t(strA);
            this.h = null;
            this.i = null;
        }
        if (this.c == q59VarG) {
            return this;
        }
        ol7[] ol7VarArr = this.d;
        return (ol7VarArr == null || (ol7Var = ol7VarArr[q59VarG.ordinal()]) == null) ? new ol7(h70Var, vm3Var, q59VarG, ol7VarArr) : ol7Var;
    }

    public final void b(boolean z) {
        if (this.g) {
            t(String.valueOf(z));
        } else {
            ((b8) this.a.Z).s(String.valueOf(z));
        }
    }

    public final void c(e37 e37Var, int i, boolean z) {
        e37Var.getClass();
        g(e37Var, i);
        b(z);
    }

    public final void d(byte b) {
        if (this.g) {
            t(String.valueOf((int) b));
        } else {
            this.a.g(b);
        }
    }

    public final void e(char c) {
        t(String.valueOf(c));
    }

    public final void f(double d) {
        if (this.g) {
            t(String.valueOf(d));
        } else {
            ((b8) this.a.Z).s(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new go3(ys0.N(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    public final void g(e37 e37Var, int i) {
        e37Var.getClass();
        int iOrdinal = this.c.ordinal();
        h70 h70Var = this.a;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!h70Var.Y) {
                h70Var.h(',');
            }
            h70Var.f();
            return;
        }
        if (iOrdinal == 2) {
            if (h70Var.Y) {
                this.g = true;
                h70Var.f();
                return;
            }
            if (i % 2 == 0) {
                h70Var.h(',');
                h70Var.f();
            } else {
                h70Var.h(':');
                h70Var.m();
                z = false;
            }
            this.g = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!h70Var.Y) {
                h70Var.h(',');
            }
            h70Var.f();
            sp3.d(this.b, e37Var);
            t(e37Var.f(i));
            h70Var.h(':');
            h70Var.m();
            return;
        }
        if (i == 0) {
            this.g = true;
        }
        if (i == 1) {
            h70Var.h(',');
            h70Var.m();
            this.g = false;
        }
    }

    public final void h(float f) {
        if (this.g) {
            t(String.valueOf(f));
        } else {
            ((b8) this.a.Z).s(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new go3(ys0.N(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    public final ol7 i(e37 e37Var) {
        e37Var.getClass();
        boolean zA = pl7.a(e37Var);
        q59 q59Var = this.c;
        vm3 vm3Var = this.b;
        h70 b01Var = this.a;
        if (zA) {
            if (!(b01Var instanceof c01)) {
                b01Var = new c01((b8) b01Var.Z, this.g);
            }
            return new ol7(b01Var, vm3Var, q59Var, null);
        }
        if (e37Var.i() && e37Var.equals(co3.a)) {
            if (!(b01Var instanceof b01)) {
                b01Var = new b01((b8) b01Var.Z, this.g);
            }
            return new ol7(b01Var, vm3Var, q59Var, null);
        }
        if (this.h != null) {
            this.i = e37Var.a();
        }
        return this;
    }

    public final ol7 j(xt5 xt5Var, int i) {
        g(xt5Var, i);
        return i(xt5Var.h(i));
    }

    public final void k(int i) {
        if (this.g) {
            t(String.valueOf(i));
        } else {
            this.a.i(i);
        }
    }

    public final void l(int i, int i2, e37 e37Var) {
        e37Var.getClass();
        g(e37Var, i);
        k(i2);
    }

    public final void m(long j) {
        if (this.g) {
            t(String.valueOf(j));
        } else {
            this.a.j(j);
        }
    }

    public final void n(e37 e37Var, int i, long j) {
        e37Var.getClass();
        g(e37Var, i);
        m(j);
    }

    public final void o() {
        h70 h70Var = this.a;
        h70Var.getClass();
        ((b8) h70Var.Z).s("null");
    }

    public final void p(e37 e37Var, int i, ow3 ow3Var, Object obj) {
        e37Var.getClass();
        ow3Var.getClass();
        if (obj != null || this.f.c) {
            e37Var.getClass();
            ow3Var.getClass();
            g(e37Var, i);
            if (ow3Var.d().c()) {
                r(ow3Var, obj);
            } else if (obj == null) {
                o();
            } else {
                r(ow3Var, obj);
            }
        }
    }

    public final void q(e37 e37Var, int i, ow3 ow3Var, Object obj) {
        e37Var.getClass();
        ow3Var.getClass();
        g(e37Var, i);
        r(ow3Var, obj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    public final void r(ow3 ow3Var, Object obj) {
        String strR;
        ow3 ow3VarV;
        ow3Var.getClass();
        vm3 vm3Var = this.b;
        mn3 mn3Var = vm3Var.a;
        boolean z = ow3Var instanceof m2;
        ps0 ps0Var = mn3Var.g;
        if (!z) {
            int iOrdinal = ps0Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    nr4 nr4VarR = ow3Var.d().r();
                    strR = (dh3.f(nr4VarR, pm7.M) || dh3.f(nr4VarR, pm7.P)) ? km4.r(vm3Var, ow3Var.d()) : null;
                } else if (iOrdinal != 2) {
                    b61.c();
                    return;
                }
            }
        } else if (ps0Var != ps0.X) {
        }
        if (z) {
            m2 m2Var = (m2) ow3Var;
            if (obj == null) {
                em7.h("Value for serializer ", m2Var.d(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            ow3VarV = nr4.v(m2Var, this, obj);
        } else {
            ow3VarV = ow3Var;
        }
        if (strR != null) {
            e37 e37VarD = ow3VarV.d();
            e37VarD.getClass();
            sp3.d(vm3Var, e37VarD);
            if (wl7.o(e37VarD).contains(strR)) {
                String strA = ow3Var.d().a();
                String strA2 = ow3VarV.d().a();
                throw new go3(oi0.p(oi0.t("Class '", strA2, "' cannot be serialized ", (mn3Var.g == ps0.Y && dh3.f(strA, strA2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : p61.l('\'', "as base class '", strA), " because it has property name that conflicts with JSON class discriminator '"), strR, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            nr4 nr4VarR2 = ow3VarV.d().r();
            nr4VarR2.getClass();
            if (nr4VarR2 instanceof j37) {
                bt.i("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            }
            if (nr4VarR2 instanceof zt5) {
                bt.i("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            } else if (nr4VarR2 instanceof qq5) {
                bt.i("Actual serializer for polymorphic cannot be polymorphic itself");
                return;
            } else {
                String strA3 = ow3VarV.d().a();
                this.h = strR;
                this.i = strA3;
            }
        }
        ow3VarV.a(this, obj);
    }

    public final void s(short s) {
        if (this.g) {
            t(String.valueOf((int) s));
        } else {
            this.a.k(s);
        }
    }

    public final void t(String str) {
        str.getClass();
        this.a.l(str);
    }

    public final void u(e37 e37Var, int i, String str) {
        e37Var.getClass();
        str.getClass();
        g(e37Var, i);
        t(str);
    }

    public final void v(e37 e37Var) {
        e37Var.getClass();
        h70 h70Var = this.a;
        h70Var.getClass();
        h70Var.Y = false;
        h70Var.h(this.c.Y);
    }

    public final boolean w(e37 e37Var) {
        e37Var.getClass();
        return false;
    }
}
