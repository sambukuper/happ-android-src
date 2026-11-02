package defpackage;

import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tj7 implements kq8 {
    public final pd2 a;
    public final pr8 b;
    public final q15 c;
    public qq8 d;
    public final LinkedList e;

    public tj7(pd2 pd2Var, pr8 pr8Var) {
        pd2Var.getClass();
        pr8Var.getClass();
        this.a = pd2Var;
        this.b = pr8Var;
        this.c = r15.a();
        this.e = new LinkedList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rj7 rj7Var, qq8 qq8Var, s51 s51Var) {
        sj7 sj7Var;
        if (s51Var instanceof sj7) {
            sj7Var = (sj7) s51Var;
            int i = sj7Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                sj7Var.h0 = i - Integer.MIN_VALUE;
            } else {
                sj7Var = new sj7(this, s51Var);
            }
        } else {
            sj7Var = new sj7(this, s51Var);
        }
        Object objA = sj7Var.f0;
        int i2 = sj7Var.h0;
        if (i2 == 0) {
            w39.n0(objA);
            if (hi5.i0("CXCP")) {
                Objects.toString(rj7Var);
                Objects.toString(qq8Var);
            }
            sj7Var.h0 = 1;
            objA = this.a.a(sj7Var);
            c71 c71Var = c71.X;
            if (objA == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objA);
        }
        ((Number) objA).intValue();
        hi5.i0("CXCP");
        throw null;
    }

    @Override // defpackage.kq8
    public final void b(qq8 qq8Var) {
        this.d = qq8Var;
        w51.G(this.b.f, null, null, new ia1(this, null), 3);
    }

    @Override // defpackage.kq8
    public final void reset() {
        w51.G(this.b.f, null, null, new qk4((Object) this, (q51) null, (byte) 19), 3);
    }
}
