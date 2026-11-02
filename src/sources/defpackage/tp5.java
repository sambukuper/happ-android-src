package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tp5 {
    public static final ox1 a = new ox1(new dw4((byte) 23), (byte) 1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(y48 y48Var, t17 t17Var, s51 s51Var) {
        rp5 rp5Var;
        if (s51Var instanceof rp5) {
            rp5Var = (rp5) s51Var;
            int i = rp5Var.g0;
            if ((i & Integer.MIN_VALUE) != 0) {
                rp5Var.g0 = i - Integer.MIN_VALUE;
            } else {
                rp5Var = new rp5(s51Var);
            }
        } else {
            rp5Var = new rp5(s51Var);
        }
        Object obj = rp5Var.f0;
        int i2 = rp5Var.g0;
        if (i2 != 0) {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                w39.n0(obj);
                b61.n();
                return;
            }
        }
        w39.n0(obj);
        if (!y48Var.X.p0) {
            bt.q("establishTextInputSession called from an unattached node");
            return;
        }
        mf5 mf5VarA0 = yn0.a0(y48Var);
        kl5 kl5Var = (kl5) yn0.Z(y48Var).D0;
        kl5Var.getClass();
        if (x97.S(kl5Var, a) != null) {
            c2.m();
        } else {
            rp5Var.g0 = 1;
            b(mf5VarA0, t17Var, rp5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(mf5 mf5Var, rn2 rn2Var, s51 s51Var) {
        sp5 sp5Var;
        if (s51Var instanceof sp5) {
            sp5Var = (sp5) s51Var;
            int i = sp5Var.g0;
            if ((i & Integer.MIN_VALUE) != 0) {
                sp5Var.g0 = i - Integer.MIN_VALUE;
            } else {
                sp5Var = new sp5(s51Var);
            }
        } else {
            sp5Var = new sp5(s51Var);
        }
        Object obj = sp5Var.f0;
        int i2 = sp5Var.g0;
        if (i2 == 0) {
            w39.n0(obj);
            sp5Var.g0 = 1;
            ((AndroidComposeView) mf5Var).H(rn2Var, sp5Var);
        } else if (i2 == 1) {
            w39.n0(obj);
            b61.n();
        } else if (i2 != 2) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
        } else {
            w39.n0(obj);
            b61.n();
        }
    }
}
