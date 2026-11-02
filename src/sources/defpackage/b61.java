package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.internal.dns._DnsMessageKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b61 implements zn2, ry0, xx1 {
    public final /* synthetic */ byte X;

    public static /* synthetic */ void c() {
        throw new b55();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, Object obj, String str) {
        throw new IllegalStateException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void g(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " is shutting down");
        throw new RejectedExecutionException(sb.toString());
    }

    public static /* synthetic */ void h(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void j(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void n() {
        throw new o14();
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3) {
        throw new p14(str + obj + obj2 + obj3);
    }

    @Override // defpackage.zn2
    public Object apply(Object obj) {
        return null;
    }

    @Override // defpackage.ry0
    public Object d(y5 y5Var) {
        switch (this.X) {
            case 5:
                Set setE = y5Var.e(e26.a(ry.class));
                yr2 yr2Var = yr2.Z;
                if (yr2Var == null) {
                    synchronized (yr2.class) {
                        try {
                            yr2Var = yr2.Z;
                            if (yr2Var == null) {
                                yr2Var = new yr2((byte) 0);
                                yr2.Z = yr2Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new rg1(setE, yr2Var);
            case 27:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
        }
    }

    @Override // defpackage.xx1
    public float a(float f) {
        return f;
    }
}
