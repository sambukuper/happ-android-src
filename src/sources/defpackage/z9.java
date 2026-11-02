package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z9 extends xu1 {
    public la L0;
    public Boolean M0;
    public xc7 N0;
    public he2 O0;
    public fi1 P0;

    @Override // defpackage.jx4
    public final void Q0() {
        v1(this.N0);
    }

    @Override // defpackage.nh1, defpackage.kq5
    public final void c() {
        I();
        if (this.p0) {
            fi1 fi1Var = yn0.Z(this).A0;
            fi1 fi1Var2 = this.P0;
            if (fi1Var2 == null || !fi1Var2.equals(fi1Var)) {
                this.P0 = fi1Var;
                v1(this.N0);
            }
        }
    }

    @Override // defpackage.xu1
    public final Object c1(pi piVar, wu1 wu1Var) {
        la laVar = this.L0;
        q51 q51Var = null;
        u9 u9Var = new u9(piVar, this, null);
        m15 m15Var = laVar.b;
        da daVar = new da(laVar, u9Var, q51Var, (byte) 1);
        m15Var.getClass();
        Object objN = gv3.n(new kg3(f15.X, m15Var, daVar, q51Var, (byte) 1), wu1Var);
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        if (objN != c71Var) {
            objN = dn8Var;
        }
        return objN == c71Var ? objN : dn8Var;
    }

    @Override // defpackage.xu1
    public final boolean q1() {
        return this.L0.h.getValue() != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t1(float f, s51 s51Var) {
        v9 v9Var;
        ba6 ba6Var;
        if (s51Var instanceof v9) {
            v9Var = (v9) s51Var;
            int i = v9Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9Var.i0 = i - Integer.MIN_VALUE;
            } else {
                v9Var = new v9(this, s51Var);
            }
        } else {
            v9Var = new v9(this, s51Var);
        }
        Object obj = v9Var.g0;
        int i2 = v9Var.i0;
        byte b = 1;
        if (i2 == 0) {
            w39.n0(obj);
            this.L0.getClass();
            ba6 ba6Var2 = new ba6();
            ba6Var2.X = f;
            la laVar = this.L0;
            q51 q51Var = null;
            x9 x9Var = new x9(this, ba6Var2, f, null);
            v9Var.f0 = ba6Var2;
            v9Var.i0 = 2;
            m15 m15Var = laVar.b;
            da daVar = new da(laVar, x9Var, q51Var, b);
            m15Var.getClass();
            Object objN = gv3.n(new kg3(f15.X, m15Var, daVar, q51Var, (byte) 1), v9Var);
            Object obj2 = c71.X;
            if (objN != obj2) {
                objN = dn8.a;
            }
            if (objN == obj2) {
                return obj2;
            }
            ba6Var = ba6Var2;
        } else {
            if (i2 == 1) {
                w39.n0(obj);
                return obj;
            }
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba6Var = v9Var.f0;
            w39.n0(obj);
        }
        return new Float(ba6Var.X);
    }

    public final boolean u1() {
        Boolean bool = this.M0;
        if (bool == null) {
            return yn0.Z(this).B0 == z24.Y && this.s0 == sd5.Y;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    public final void v1(xc7 xc7Var) {
        if (xc7Var == null) {
            sg8 sg8Var = g9.a;
            y2 y2Var = g9.b;
            fi1 fi1Var = yn0.Z(this).A0;
            this.P0 = fi1Var;
            xc7Var = new xc7(new lr((Object) this.L0, (Object) y2Var, (Object) new o7((Object) fi1Var, (byte) 2), (byte) 6), sg8Var);
        }
        this.O0 = xc7Var;
    }
}
