package defpackage;

import com.tencent.mmkv.MMKV;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ci4 extends xw8 {
    public final vz7 b = new vz7(new sh4((byte) 2));
    public final oh7 c;
    public final h76 d;
    public final u77 e;
    public final f76 f;
    public og7 g;
    public volatile Process h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ci4() {
        oh7 oh7VarA = ph7.a(mg4.a);
        this.c = oh7VarA;
        this.d = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.e = u77VarB;
        this.f = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(ci4 ci4Var, gg4 gg4Var, int i) {
        gg4 gg4Var2;
        Object value;
        q51 q51Var = null;
        if ((i & 1) != 0) {
            gg4Var = null;
        }
        boolean z = (i & 2) == 0;
        mg4 mg4Var = mg4.a;
        og7 og7Var = ci4Var.g;
        if (og7Var == null || !og7Var.k()) {
            og7 og7Var2 = ci4Var.g;
            if (og7Var2 != null) {
                og7Var2.m((CancellationException) null);
            }
            Process process = ci4Var.h;
            if (process != null) {
                process.destroy();
            }
            if (gg4Var == null) {
                ng4 ng4Var = (ng4) ci4Var.d.X.getValue();
                lg4 lg4Var = ng4Var instanceof lg4 ? (lg4) ng4Var : null;
                if (lg4Var != null) {
                    gg4Var = lg4Var.a;
                    gg4Var2 = gg4Var;
                } else {
                    gg4Var2 = null;
                }
            } else {
                gg4Var2 = gg4Var;
            }
            oh7 oh7Var = ci4Var.c;
            oh7Var.getClass();
            do {
                value = oh7Var.getValue();
                ((ng4) value).getClass();
            } while (!oh7Var.k(value, mg4Var));
            tu0 tu0VarA = zw8.a(ci4Var);
            nf1 nf1Var = tp1.a;
            ci4Var.g = jm4.Q(tu0VarA, dm4.a, new qq1(ci4Var, gg4Var2, z, q51Var, (byte) 1), 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        Process process = this.h;
        if (process != null) {
            process.destroy();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(tg4 tg4Var) {
        jm4.Q(zw8.a(this), (u61) null, new jy2(this, tg4Var, (q51) null, (byte) 8), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(fh4 fh4Var) {
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        Object value3;
        Object objA3;
        Object value4;
        Object objA4;
        lg4 lg4Var;
        gg4 gg4Var;
        String str;
        String str2;
        if (fh4Var instanceof ah4) {
            gg4 gg4Var2 = ((ah4) fh4Var).a;
            f(this, gg4Var2, 2);
            if (gg4Var2.c) {
                e(rg4.a);
                return;
            }
            return;
        }
        if (fh4Var instanceof dh4) {
            f(this, null, 3);
            return;
        }
        boolean z = fh4Var instanceof xg4;
        h76 h76Var = this.d;
        if (z) {
            ng4 ng4Var = (ng4) h76Var.X.getValue();
            lg4Var = ng4Var instanceof lg4 ? (lg4) ng4Var : null;
            if (lg4Var == null || (str2 = lg4Var.d) == null) {
                return;
            }
            e(new og4(str2));
            return;
        }
        if (fh4Var instanceof wg4) {
            f(this, null, 1);
            return;
        }
        if (fh4Var instanceof eh4) {
            ng4 ng4Var2 = (ng4) h76Var.X.getValue();
            lg4Var = ng4Var2 instanceof lg4 ? (lg4) ng4Var2 : null;
            if (lg4Var == null || (gg4Var = lg4Var.a) == null || (str = gg4Var.a) == null) {
                return;
            }
            e(new qg4(str));
            return;
        }
        boolean z2 = fh4Var instanceof ch4;
        oh7 oh7Var = this.c;
        if (z2) {
            oh7Var.getClass();
            do {
                value4 = oh7Var.getValue();
                objA4 = (ng4) value4;
                objA4.getClass();
                if (objA4 instanceof lg4) {
                    lg4 lg4Var2 = (lg4) objA4;
                    objA4 = lg4.a(lg4Var2, x97.n(lg4Var2.c - 1, 0, Math.max(lg4Var2.f - 1, 0)));
                } else if (!(objA4 instanceof mg4)) {
                    b61.c();
                    return;
                }
            } while (!oh7Var.k(value4, objA4));
            return;
        }
        if (fh4Var instanceof yg4) {
            oh7Var.getClass();
            do {
                value3 = oh7Var.getValue();
                objA3 = (ng4) value3;
                objA3.getClass();
                if (objA3 instanceof lg4) {
                    lg4 lg4Var3 = (lg4) objA3;
                    objA3 = lg4.a(lg4Var3, x97.n(0, 0, Math.max(lg4Var3.f - 1, 0)));
                } else if (!(objA3 instanceof mg4)) {
                    b61.c();
                    return;
                }
            } while (!oh7Var.k(value3, objA3));
            return;
        }
        if (fh4Var instanceof bh4) {
            oh7Var.getClass();
            do {
                value2 = oh7Var.getValue();
                objA2 = (ng4) value2;
                objA2.getClass();
                if (objA2 instanceof lg4) {
                    lg4 lg4Var4 = (lg4) objA2;
                    objA2 = lg4.a(lg4Var4, x97.n(lg4Var4.c + 1, 0, Math.max(lg4Var4.f - 1, 0)));
                } else if (!(objA2 instanceof mg4)) {
                    b61.c();
                    return;
                }
            } while (!oh7Var.k(value2, objA2));
            return;
        }
        if (!(fh4Var instanceof zg4)) {
            b61.c();
            return;
        }
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            objA = (ng4) value;
            objA.getClass();
            if (objA instanceof lg4) {
                lg4 lg4Var5 = (lg4) objA;
                int i = lg4Var5.f - 1;
                objA = lg4.a(lg4Var5, x97.n(i, 0, Math.max(i, 0)));
            } else if (!(objA instanceof mg4)) {
                b61.c();
                return;
            }
        } while (!oh7Var.k(value, objA));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object h(boolean z, s51 s51Var) {
        bi4 bi4Var;
        boolean z2 = z;
        if (s51Var instanceof bi4) {
            bi4Var = (bi4) s51Var;
            int i = bi4Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                bi4Var.i0 = i - Integer.MIN_VALUE;
            } else {
                bi4Var = new bi4(this, s51Var);
            }
        } else {
            bi4Var = new bi4(this, s51Var);
        }
        s61 s61Var = ((s51) bi4Var).Y;
        Object obj = bi4Var.g0;
        int i2 = bi4Var.i0;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(obj);
            if (z2) {
                s61Var.getClass();
                nf1 nf1Var = tp1.a;
                ye1 ye1Var = ye1.Z;
                ai4 ai4Var = new ai4(new String[]{"-c"}, this, s61Var, (byte) 0);
                bi4Var.f0 = z2;
                bi4Var.i0 = 1;
                if (w51.W(ye1Var, new pg3(ai4Var, (q51) null, (byte) 0), bi4Var) != c71Var) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                w39.n0(obj);
                return obj;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = bi4Var.f0;
        w39.n0(obj);
        vz7 vz7Var = this.b;
        int iE = ((MMKV) vz7Var.getValue()).e(-1, "pref_logs_type");
        e69.Z.getClass();
        String str = f08.i(iE).Y;
        if (str == null) {
            return "";
        }
        int iE2 = ((MMKV) vz7Var.getValue()).e(-1, "pref_logs_output_type");
        nf4.Y.getClass();
        nf4 nf4Var = (nf4) wv0.u0(iE2, nf4.g0);
        if (nf4Var == null) {
            nf4Var = nf4.AUTO;
        }
        String[] strArr = {"-d", "-v", nf4Var.X, "GoLog:".concat(str), "tun2socks:".concat(str), "*:S"};
        s61Var.getClass();
        nf1 nf1Var2 = tp1.a;
        ye1 ye1Var2 = ye1.Z;
        ai4 ai4Var2 = new ai4(strArr, this, s61Var, (byte) 1);
        bi4Var.f0 = z2;
        bi4Var.i0 = 2;
        Object objW = w51.W(ye1Var2, new pg3(ai4Var2, (q51) null, (byte) 0), bi4Var);
        return objW == c71Var ? c71Var : objW;
    }
}
