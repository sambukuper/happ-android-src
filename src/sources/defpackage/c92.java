package defpackage;

import io.sentry.c2;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c92 {
    public static final /* synthetic */ int c = 0;
    public final hc7 a = hc7.g();
    public boolean b;

    static {
        new c92(0);
    }

    public c92(int i) {
        a();
        a();
    }

    public static void b(mv0 mv0Var, b39 b39Var, int i, Object obj) {
        if (b39Var == b39.f0) {
            mv0Var.B(i, 3);
            ((e2) obj).b(mv0Var);
            mv0Var.B(i, 4);
        }
        mv0Var.B(i, b39Var.Y);
        switch (b39Var.ordinal()) {
            case 0:
                mv0Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                mv0Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                mv0Var.F(((Long) obj).longValue());
                break;
            case 3:
                mv0Var.F(((Long) obj).longValue());
                break;
            case 4:
                mv0Var.w(((Integer) obj).intValue());
                break;
            case 5:
                mv0Var.u(((Long) obj).longValue());
                break;
            case 6:
                mv0Var.s(((Integer) obj).intValue());
                break;
            case 7:
                mv0Var.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof hb0)) {
                    mv0Var.A((String) obj);
                } else {
                    mv0Var.q((hb0) obj);
                }
                break;
            case 9:
                ((e2) obj).b(mv0Var);
                break;
            case 10:
                e2 e2Var = (e2) obj;
                mv0Var.D(((cq2) e2Var).a(null));
                e2Var.b(mv0Var);
                break;
            case 11:
                if (!(obj instanceof hb0)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    mv0Var.D(length);
                    mv0Var.n(bArr, 0, length);
                } else {
                    mv0Var.q((hb0) obj);
                }
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                mv0Var.D(((Integer) obj).intValue());
                break;
            case 13:
                mv0Var.w(((Integer) obj).intValue());
                break;
            case 14:
                mv0Var.s(((Integer) obj).intValue());
                break;
            case 15:
                mv0Var.u(((Long) obj).longValue());
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                mv0Var.D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                mv0Var.F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        hc7 hc7Var = this.a;
        int size = hc7Var.X.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = hc7Var.c(i);
            if (entryC.getValue() instanceof cq2) {
                cq2 cq2Var = (cq2) entryC.getValue();
                cq2Var.getClass();
                l06 l06Var = l06.c;
                l06Var.getClass();
                l06Var.a(cq2Var.getClass()).b(cq2Var);
                cq2Var.h();
            }
        }
        if (!hc7Var.Z) {
            if (hc7Var.X.size() > 0) {
                hc7Var.c(0).getKey().getClass();
                c2.m();
                return;
            } else {
                Iterator it = hc7Var.e().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    c2.m();
                    return;
                }
            }
        }
        if (!hc7Var.Z) {
            hc7Var.Y = hc7Var.Y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hc7Var.Y);
            hc7Var.g0 = hc7Var.g0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hc7Var.g0);
            hc7Var.Z = true;
        }
        this.b = true;
    }

    public final Object clone() {
        c92 c92Var = new c92();
        hc7 hc7Var = this.a;
        if (hc7Var.X.size() > 0) {
            Map.Entry entryC = hc7Var.c(0);
            if (entryC.getKey() != null) {
                c2.m();
                return null;
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = hc7Var.e().iterator();
        if (!it.hasNext()) {
            return c92Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            c2.m();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c92) {
            return this.a.equals(((c92) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public c92() {
    }
}
