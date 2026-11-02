package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ai implements q61 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;

    public ai(k86 k86Var) {
        this.X = (byte) 1;
        this.Y = k86Var;
        this.Z = new y5((byte) 4);
    }

    @Override // defpackage.s61
    public final s61 B0(s61 s61Var) {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return g33.K(this, s61Var);
    }

    @Override // defpackage.s61
    public final q61 H0(r61 r61Var) {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return g33.t(this, r61Var);
    }

    @Override // defpackage.s61
    public final Object U(rn2 rn2Var, Object obj) {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return rn2Var.K(obj, this);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final Object a(gn2 gn2Var, q51 q51Var) {
        lj5 lj5Var;
        boolean z;
        Object objQ;
        switch (this.X) {
            case 0:
                yh yhVar = (yh) this.Z;
                mm0 mm0Var = new mm0(1, mb6.H(q51Var));
                mm0Var.s();
                zh zhVar = new zh(mm0Var, this, gn2Var);
                if (dh3.f(yhVar.Z, (Choreographer) this.Y)) {
                    synchronized (yhVar.g0) {
                        yhVar.i0.add(zhVar);
                        if (!yhVar.l0) {
                            yhVar.l0 = true;
                            yhVar.Z.postFrameCallback(yhVar.m0);
                        }
                        break;
                    }
                    mm0Var.u(new d3(yhVar, zhVar, (byte) 3));
                } else {
                    ((Choreographer) this.Y).postFrameCallback(zhVar);
                    mm0Var.u(new d3(this, zhVar, (byte) 4));
                }
                return mm0Var.q();
            case 1:
                mm0 mm0Var2 = new mm0(1, mb6.H(q51Var));
                mm0Var2.s();
                y5 y5Var = (y5) this.Z;
                z80 z80Var = new z80();
                z80Var.a = mm0Var2;
                z80Var.b = gn2Var;
                mm0Var2.u(new f0(y5Var.p(z80Var, (k86) this.Y), (byte) 7));
                return mm0Var2.q();
            default:
                if (q51Var instanceof lj5) {
                    lj5Var = (lj5) q51Var;
                    int i = lj5Var.i0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lj5Var.i0 = i - Integer.MIN_VALUE;
                    } else {
                        lj5Var = new lj5(this, q51Var);
                    }
                } else {
                    lj5Var = new lj5(this, q51Var);
                }
                Object obj = lj5Var.g0;
                c71 c71Var = c71.X;
                int i2 = lj5Var.i0;
                if (i2 == 0) {
                    w39.n0(obj);
                    sa2 sa2Var = (sa2) this.Z;
                    lj5Var.f0 = gn2Var;
                    lj5Var.i0 = 1;
                    synchronized (sa2Var.a) {
                        z = sa2Var.b;
                    }
                    if (z) {
                        objQ = dn8.a;
                    } else {
                        mm0 mm0Var3 = new mm0(1, mb6.H(lj5Var));
                        mm0Var3.s();
                        synchronized (sa2Var.a) {
                            ((ArrayList) sa2Var.c).add(mm0Var3);
                        }
                        mm0Var3.u(new d3(sa2Var, mm0Var3, (byte) 9));
                        objQ = mm0Var3.q();
                        if (objQ != c71Var) {
                            objQ = dn8.a;
                        }
                    }
                    if (objQ != c71Var) {
                    }
                    return c71Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gn2Var = lj5Var.f0;
                w39.n0(obj);
                ai aiVar = (ai) this.Y;
                lj5Var.f0 = null;
                lj5Var.i0 = 2;
                Object objA = aiVar.a(gn2Var, lj5Var);
                if (objA != c71Var) {
                    return objA;
                }
                return c71Var;
        }
    }

    @Override // defpackage.s61
    public final s61 a0(r61 r61Var) {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return g33.I(this, r61Var);
    }

    @Override // defpackage.q61
    public r61 getKey() {
        return qe4.f0;
    }

    public ai(ai aiVar) {
        this.X = (byte) 2;
        this.Y = aiVar;
        this.Z = new sa2();
    }

    public ai(Choreographer choreographer, yh yhVar) {
        this.X = (byte) 0;
        this.Y = choreographer;
        this.Z = yhVar;
    }
}
