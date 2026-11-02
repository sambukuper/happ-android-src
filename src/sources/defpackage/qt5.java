package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qt5 implements n85 {
    public final aj0 a;
    public final yz4 b;
    public ut5 c;
    public final s65 d;
    public yo2 e;
    public boolean f = false;

    public qt5(aj0 aj0Var, yz4 yz4Var, s65 s65Var) {
        this.a = aj0Var;
        this.b = yz4Var;
        this.d = s65Var;
        synchronized (this) {
            this.c = (ut5) yz4Var.d();
        }
    }

    @Override // defpackage.n85
    public final void a(Object obj) {
        bj0 bj0Var = (bj0) obj;
        bj0 bj0Var2 = bj0.g0;
        ut5 ut5Var = ut5.X;
        if (bj0Var == bj0Var2 || bj0Var == bj0.Z || bj0Var == bj0.Y || bj0Var == bj0.X) {
            b(ut5Var);
            if (this.f) {
                this.f = false;
                yo2 yo2Var = this.e;
                if (yo2Var != null) {
                    yo2Var.cancel(false);
                    this.e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((bj0Var == bj0.h0 || bj0Var == bj0.i0 || bj0Var == bj0.f0) && !this.f) {
            aj0 aj0Var = this.a;
            b(ut5Var);
            ArrayList arrayList = new ArrayList();
            qd0 qd0Var = new qd0();
            qd0Var.c = new if6();
            ud0 ud0Var = new ud0(qd0Var);
            qd0Var.b = ud0Var;
            qd0Var.a = p61.class;
            try {
                pt5 pt5Var = new pt5(qd0Var, aj0Var);
                arrayList.add(pt5Var);
                aj0Var.r(dp1.a(), pt5Var);
                qd0Var.a = "waitForCaptureResult";
            } catch (Exception e) {
                ud0Var.b(e);
            }
            zo0 zo0VarG0 = vr3.g0(yo2.b(ud0Var), new ot5(this), dp1.a());
            ot5 ot5Var = new ot5(this);
            zo0 zo0VarG1 = vr3.g0(zo0VarG0, new vk1((Object) ot5Var, (byte) 13), dp1.a());
            this.e = zo0VarG1;
            f63 f63Var = new f63(this, arrayList, aj0Var);
            zo0VarG1.a(new zo2(zo0VarG1, f63Var, (byte) 0), dp1.a());
            this.f = true;
        }
    }

    public final void b(ut5 ut5Var) {
        synchronized (this) {
            try {
                if (this.c.equals(ut5Var)) {
                    return;
                }
                this.c = ut5Var;
                Objects.toString(ut5Var);
                hi5.z0("StreamStateObserver");
                this.b.k(ut5Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n85
    public final void onError(Throwable th) {
        yo2 yo2Var = this.e;
        if (yo2Var != null) {
            yo2Var.cancel(false);
            this.e = null;
        }
        b(ut5.X);
    }
}
