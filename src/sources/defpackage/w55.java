package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w55 {
    public final sy6 a;
    public final rn2 b;
    public fi1 c;
    public boolean d;
    public final mj0 e = new mj0((byte) 16);

    public w55(sy6 sy6Var, rn2 rn2Var, fi1 fi1Var) {
        this.a = sy6Var;
        this.b = rn2Var;
        this.c = fi1Var;
    }

    public static void a(aq5 aq5Var) {
        List list = aq5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((hq5) list.get(i)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(rn2 rn2Var, s51 s51Var) {
        v55 v55Var;
        if (s51Var instanceof v55) {
            v55Var = (v55) s51Var;
            int i = v55Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                v55Var.h0 = i - Integer.MIN_VALUE;
            } else {
                v55Var = new v55(this, s51Var);
            }
        } else {
            v55Var = new v55(this, s51Var);
        }
        Object obj = v55Var.f0;
        int i2 = v55Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(obj);
            this.d = true;
            jy2 jy2Var = new jy2((Object) this, (Object) rn2Var, q51Var, (byte) 15);
            v55Var.h0 = 1;
            nw7 nw7Var = new nw7(v55Var, v55Var.w());
            Object objD = z38.d(nw7Var, true, nw7Var, jy2Var);
            c71 c71Var = c71.X;
            if (objD == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        this.d = false;
        return dn8.a;
    }
}
