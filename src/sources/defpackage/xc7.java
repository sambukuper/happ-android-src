package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xc7 implements he2 {
    public final lr a;
    public final pk b;
    public final gp1 c = iy6.b;

    public xc7(lr lrVar, pk pkVar) {
        this.a = lrVar;
        this.b = pkVar;
    }

    @Override // defpackage.he2
    public Object a(xx6 xx6Var, float f, uy7 uy7Var) {
        return c(xx6Var, f, w39.h0, uy7Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(xx6 xx6Var, float f, gn2 gn2Var, s51 s51Var) {
        sc7 sc7Var;
        gn2 gn2Var2;
        if (s51Var instanceof sc7) {
            sc7Var = (sc7) s51Var;
            int i = sc7Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                sc7Var.i0 = i - Integer.MIN_VALUE;
            } else {
                sc7Var = new sc7(this, s51Var);
            }
        } else {
            sc7Var = new sc7(this, s51Var);
        }
        Object objW = sc7Var.g0;
        int i2 = sc7Var.i0;
        if (i2 == 0) {
            w39.n0(objW);
            uc7 uc7Var = new uc7(this, f, gn2Var, xx6Var, null);
            sc7Var.f0 = gn2Var;
            sc7Var.i0 = 1;
            objW = w51.W(this.c, uc7Var, sc7Var);
            c71 c71Var = c71.X;
            if (objW == c71Var) {
                return c71Var;
            }
            gn2Var2 = gn2Var;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gn2Var2 = sc7Var.f0;
            w39.n0(objW);
        }
        mk mkVar = (mk) objW;
        gn2Var2.B(new Float(0.0f));
        return mkVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(xx6 xx6Var, float f, zx6 zx6Var, s51 s51Var) {
        vc7 vc7Var;
        if (s51Var instanceof vc7) {
            vc7Var = (vc7) s51Var;
            int i = vc7Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                vc7Var.h0 = i - Integer.MIN_VALUE;
            } else {
                vc7Var = new vc7(this, s51Var);
            }
        } else {
            vc7Var = new vc7(this, s51Var);
        }
        Object objB = vc7Var.f0;
        int i2 = vc7Var.h0;
        if (i2 == 0) {
            w39.n0(objB);
            vc7Var.h0 = 1;
            objB = b(xx6Var, f, zx6Var, vc7Var);
            Object obj = c71.X;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objB);
        }
        mk mkVar = (mk) objB;
        return new Float(mkVar.a.floatValue() != 0.0f ? ((Number) mkVar.b.a()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(xx6 xx6Var, float f, float f2, tc7 tc7Var, s51 s51Var) {
        wc7 wc7Var;
        if (s51Var instanceof wc7) {
            wc7Var = (wc7) s51Var;
            int i = wc7Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                wc7Var.h0 = i - Integer.MIN_VALUE;
            } else {
                wc7Var = new wc7(this, s51Var);
            }
        } else {
            wc7Var = new wc7(this, s51Var);
        }
        wc7 wc7Var2 = wc7Var;
        Object objH = wc7Var2.f0;
        int i2 = wc7Var2.h0;
        if (i2 == 0) {
            w39.n0(objH);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return z68.b(f, f2, 28);
            }
            wc7Var2.h0 = 1;
            objH = (Math.abs(z39.k(t9.b, 0.0f, f2)) >= Math.abs(f) ? new ra((byte) 20, false) : new lr5((Object) this.b, (byte) 21)).h(xx6Var, new Float(f), new Float(f2), tc7Var, wc7Var2);
            c71 c71Var = c71.X;
            if (objH == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objH);
        }
        return ((mk) objH).b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xc7) {
            xc7 xc7Var = (xc7) obj;
            return dh3.f(xc7Var.b, this.b) && xc7Var.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((t9.b.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
