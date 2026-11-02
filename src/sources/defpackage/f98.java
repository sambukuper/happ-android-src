package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f98 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ f98(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        int i;
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                wj0 wj0Var = (wj0) obj;
                Executor executor = ((pj0) ((b8) obj2).c).a;
                if (executor != null) {
                    return executor;
                }
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, new sh(-3, uh.b(uh.b, "CXCP-Camera-E")));
                executorServiceNewFixedThreadPool.getClass();
                wj0Var.a(uj0.Z, new fl6((Object) executorServiceNewFixedThreadPool, (byte) 15));
                return executorServiceNewFixedThreadPool;
            default:
                kd8 kd8Var = (kd8) obj2;
                qe4 qe4Var = (qe4) obj;
                h48 h48VarC = kd8Var.a.c();
                r07 r07Var = (r07) kd8Var.e.getValue();
                qf3 qf3Var = new qf3((byte) 2);
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                boolean z = false;
                while (i2 < h48VarC.Z.length()) {
                    int iCodePointAt = Character.codePointAt(h48VarC, i2);
                    qe4Var.getClass();
                    if (iCodePointAt == 10) {
                        i = 32;
                    } else {
                        i = iCodePointAt == 13 ? 65279 : iCodePointAt;
                    }
                    int iCharCount = Character.charCount(iCodePointAt);
                    if (i != iCodePointAt) {
                        qf3Var.i(sb.length(), sb.length() + iCharCount, Character.charCount(i));
                        z = true;
                    }
                    sb.appendCodePoint(i);
                    i2 += iCharCount;
                }
                CharSequence string = z ? sb.toString() : h48VarC;
                if (string == h48VarC) {
                    return null;
                }
                long jI = qp7.i(h48VarC.f0, qf3Var, r07Var);
                f88 f88Var = h48VarC.g0;
                return new id8(new h48(string, jI, f88Var != null ? new f88(qp7.i(f88Var.a, qf3Var, r07Var)) : null, null, null, null, null, 120), qf3Var);
        }
    }
}
