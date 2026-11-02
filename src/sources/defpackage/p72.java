package defpackage;

import com.tencent.mmkv.MMKV;
import java.io.File;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p72 {
    public final vz7 a = new vz7(new j72((byte) 1));
    public final vz7 b = new vz7(new j72((byte) 2));
    public final q15 c = r15.a();

    public final Object a() {
        l72 l72VarC = c();
        l72VarC.getClass();
        try {
            HappApplication happApplication = HappApplication.M0;
            if (!new File(k32.i().getFilesDir(), "data.result.tmp").renameTo(new File(k32.i().getFilesDir(), "data.result"))) {
                throw new IllegalArgumentException("File rename failed");
            }
            ((MMKV) l72VarC.a.getValue()).m(we3.a.a().a(), "extra_file_timestamp");
            return dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(s51 s51Var) {
        o72 o72Var;
        Object rj6Var;
        if (s51Var instanceof o72) {
            o72Var = (o72) s51Var;
            int i = o72Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o72Var.h0 = i - Integer.MIN_VALUE;
            } else {
                o72Var = new o72(this, s51Var);
            }
        } else {
            o72Var = new o72(this, s51Var);
        }
        Object obj = o72Var.f0;
        int i2 = o72Var.h0;
        q51 q51Var = null;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                nf1 nf1Var = tp1.a;
                ye1 ye1Var = ye1.Z;
                bv bvVar = new bv(this, q51Var, (byte) 4);
                o72Var.h0 = 1;
                Object objW = w51.W(ye1Var, bvVar, o72Var);
                c71 c71Var = c71.X;
                if (objW == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
            }
            rj6Var = dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Throwable thA = sj6.a(rj6Var);
        if (thA != null) {
            HappApplication happApplication = HappApplication.M0;
            k32.i().d().h(new n72(thA, (byte) 0));
        }
        return rj6Var;
    }

    public final l72 c() {
        return (l72) this.b.getValue();
    }
}
