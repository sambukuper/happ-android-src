package defpackage;

import java.io.Closeable;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gd0 implements f35 {
    public final OkHttpClient a;

    public /* synthetic */ gd0(OkHttpClient okHttpClient) {
        this.a = okHttpClient;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(OkHttpClient okHttpClient, t35 t35Var, rn2 rn2Var, s51 s51Var) {
        fd0 fd0Var;
        Call.Factory factory;
        rn2 rn2Var2;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (s51Var instanceof fd0) {
            fd0Var = (fd0) s51Var;
            int i = fd0Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                fd0Var.i0 = i - Integer.MIN_VALUE;
            } else {
                fd0Var = new fd0(s51Var);
            }
        } else {
            fd0Var = new fd0(s51Var);
        }
        Object objB = fd0Var.h0;
        int i2 = fd0Var.i0;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objB);
            fd0Var.f0 = rn2Var;
            fd0Var.g0 = okHttpClient;
            fd0Var.i0 = 1;
            objB = id0.b(t35Var, fd0Var);
            if (objB != c71Var) {
            }
            factory = okHttpClient;
            return c71Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) fd0Var.g0;
                try {
                    w39.n0(objB);
                    oc.h(closeable2, null);
                    return objB;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        oc.h(closeable2, th);
                        throw th3;
                    }
                }
            }
            rn2Var2 = fd0Var.f0;
            w39.n0(objB);
            closeable = (Closeable) objB;
            try {
                w35 w35VarA = id0.a((Response) closeable);
                fd0Var.f0 = null;
                fd0Var.g0 = closeable;
                fd0Var.i0 = 3;
                objB = rn2Var2.K(w35VarA, fd0Var);
                if (objB != c71Var) {
                    closeable2 = closeable;
                    oc.h(closeable2, null);
                    return objB;
                }
                factory = okHttpClient;
                return c71Var;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        Call.Factory factory2 = (Call.Factory) fd0Var.g0;
        rn2Var = fd0Var.f0;
        w39.n0(objB);
        factory = factory2;
        factory = okHttpClient;
        Call callNewCall = factory.newCall((Request) objB);
        fd0Var.f0 = rn2Var;
        fd0Var.g0 = null;
        fd0Var.i0 = 2;
        mm0 mm0Var = new mm0(1, mb6.H(fd0Var));
        mm0Var.s();
        mm0Var.u(new f0(callNewCall, (byte) 9));
        callNewCall.enqueue(new wl6((Object) mm0Var, (byte) 15));
        objB = mm0Var.q();
        if (objB != c71Var) {
            rn2Var2 = rn2Var;
            closeable = (Closeable) objB;
            w35 w35VarA2 = id0.a((Response) closeable);
            fd0Var.f0 = null;
            fd0Var.g0 = closeable;
            fd0Var.i0 = 3;
            objB = rn2Var2.K(w35VarA2, fd0Var);
            if (objB != c71Var) {
                closeable2 = closeable;
                oc.h(closeable2, null);
                return objB;
            }
        }
        factory = okHttpClient;
        return c71Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gd0) {
            return this.a == ((gd0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ")";
    }
}
