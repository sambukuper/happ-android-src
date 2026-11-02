package defpackage;

import android.view.View;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rf implements b71 {
    public final View X;
    public final o78 Y;
    public final b71 Z;
    public final AtomicReference f0 = new AtomicReference(null);

    public rf(View view, o78 o78Var, b71 b71Var) {
        this.X = view;
        this.Y = o78Var;
        this.Z = b71Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(kh khVar, s51 s51Var) {
        qf qfVar;
        if (s51Var instanceof qf) {
            qfVar = (qf) s51Var;
            int i = qfVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                qfVar.h0 = i - Integer.MIN_VALUE;
            } else {
                qfVar = new qf(this, s51Var);
            }
        } else {
            qfVar = new qf(this, s51Var);
        }
        Object obj = qfVar.f0;
        int i2 = qfVar.h0;
        if (i2 == 0) {
            w39.n0(obj);
            byte b = 2;
            p0 p0Var = new p0(khVar, this, b);
            q51 q51Var = null;
            q0 q0Var = new q0(this, q51Var, b);
            qfVar.h0 = 1;
            if (gv3.n(new wu1((Object) p0Var, (Serializable) this.f0, (Object) q0Var, q51Var, (byte) 9), qfVar) == c71.X) {
                return;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w39.n0(obj);
        }
        b61.n();
    }

    @Override // defpackage.b71
    public final s61 getCoroutineContext() {
        return this.Z.getCoroutineContext();
    }
}
