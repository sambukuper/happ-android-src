package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import libxray.XRayVPNServiceSupportsSet;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.ServerConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class s18 implements qd7, bw6, y23, XRayVPNServiceSupportsSet, iw7 {
    public static final /* synthetic */ s18 Y = new s18((byte) 18);
    public final /* synthetic */ byte X;

    public s18(Context context, kp5 kp5Var) {
        this.X = (byte) 17;
        ViewConfiguration.get(context).getScaledTouchSlop();
        new GestureDetector(context, new s70(this, (byte) 1));
    }

    public static qr8 c(hq8 hq8Var) {
        hq8Var.getClass();
        if (hq8Var instanceof lt5) {
            return qr8.Z;
        }
        if (hq8Var instanceof x53) {
            return qr8.f0;
        }
        if (hq8Var instanceof k53) {
            return qr8.g0;
        }
        if (ts7.f(hq8Var)) {
            return qr8.h0;
        }
        return hq8Var instanceof gl7 ? qr8.i0 : qr8.j0;
    }

    @Override // defpackage.bw6
    public Object U(hv6 hv6Var, Object obj) {
        f08 f08Var;
        bm8 bm8Var = (bm8) obj;
        gb4 gb4VarR = i21.r();
        gb4VarR.add(Integer.valueOf(bm8Var.a));
        vd7 vd7Var = bm8Var.b;
        gb4VarR.add(Integer.valueOf(vd7Var.size()));
        vd7 vd7Var2 = bm8Var.c;
        gb4VarR.add(Integer.valueOf(vd7Var2.size()));
        int size = vd7Var.size();
        int i = 0;
        while (true) {
            f08Var = u88.i;
            if (i >= size) {
                break;
            }
            gb4VarR.add(f08Var.U(hv6Var, vd7Var.get(i)));
            i++;
        }
        int size2 = vd7Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            gb4VarR.add(f08Var.U(hv6Var, vd7Var2.get(i2)));
        }
        return i21.j(gb4VarR);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[RETURN] */
    @Override // defpackage.qd7
    public boolean X(Object obj, Object obj2) {
        s58 s58Var = (s58) obj;
        s58 s58Var2 = (s58) obj2;
        if (s58Var == null || s58Var2 == null) {
            if ((s58Var == null) ^ (s58Var2 == null)) {
                return false;
            }
            return true;
        }
        if (s58Var.e == s58Var2.e && s58Var.f == s58Var2.f && s58Var.b == s58Var2.b && dh3.f(s58Var.c, s58Var2.c) && q31.b(s58Var.d, s58Var2.d)) {
            return true;
        }
        return false;
    }

    public ui8 a(lh8 lh8Var, List list) {
        lh8Var.getClass();
        list.getClass();
        List listG = lh8Var.g();
        listG.getClass();
        hi8 hi8Var = (hi8) wv0.B0(listG);
        if (hi8Var != null) {
            byte b = 1;
            if (hi8Var.U()) {
                List listG2 = lh8Var.g();
                listG2.getClass();
                ArrayList arrayList = new ArrayList(xv0.Z(listG2, 10));
                Iterator it = listG2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((hi8) it.next()).l());
                }
                return new xg7(zp4.P(wv0.e1(arrayList, list)), b);
            }
        }
        return new nb3((hi8[]) listG.toArray(new hi8[0]), (ni8[]) list.toArray(new ni8[0]), false);
    }

    @Override // defpackage.iw7
    public fb9 b(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = yq6.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? g28.l(bundle) : g28.l(null);
    }

    public boolean d(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.y23
    public boolean h(byte[] bArr) {
        return bArr[0] == 9;
    }

    @Override // libxray.XRayVPNServiceSupportsSet
    public long onEmitStatus(long j, String str) {
        switch (this.X) {
        }
        return 0L;
    }

    @Override // libxray.XRayVPNServiceSupportsSet
    public long shutdown() {
        h69 h69Var;
        Object rj6Var;
        long j = 0;
        switch (this.X) {
            case 15:
                return 0L;
            default:
                SoftReference softReference = n69.f;
                if (softReference == null || (h69Var = (h69) softReference.get()) == null) {
                    return -1L;
                }
                try {
                    h69Var.b();
                    rj6Var = dn8.a;
                    break;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
                if (sj6.a(rj6Var) == null) {
                } else {
                    j = -1;
                }
                return j;
        }
    }

    @Override // libxray.XRayVPNServiceSupportsSet
    public long startup() {
        h69 h69Var;
        Object rj6Var;
        switch (this.X) {
            case 15:
                return 0L;
            default:
                if (n69.a.getIsRunning()) {
                    return 0L;
                }
                SoftReference softReference = n69.f;
                if (softReference != null && (h69Var = (h69) softReference.get()) != null) {
                    try {
                        ServerConfig serverConfig = n69.g;
                        if (serverConfig != null) {
                            h69Var.j(serverConfig);
                        }
                        System.currentTimeMillis();
                        rj6Var = dn8.a;
                    } catch (Throwable th) {
                        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var = new rj6(th);
                    }
                    if (sj6.a(rj6Var) == null) {
                        return 0L;
                    }
                    break;
                }
                return -1L;
        }
    }

    public String toString() {
        switch (this.X) {
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                int iHashCode = hashCode();
                km4.q(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return pc6.q("CreationExtras.Key@", string, "<", yb6.a.b(String.class).E(), ">");
            case 13:
            default:
                return super.toString();
            case 14:
                return "NULL_VALUE";
        }
    }

    @Override // defpackage.bw6
    public Object y(Object obj) {
        f08 f08Var;
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        int iIntValue2 = ((Integer) obj3).intValue();
        Object obj4 = list.get(2);
        obj4.getClass();
        int iIntValue3 = ((Integer) obj4).intValue();
        gb4 gb4VarR = i21.r();
        int i = 3;
        while (true) {
            int i2 = iIntValue2 + 3;
            f08Var = u88.i;
            if (i >= i2) {
                break;
            }
            gb4VarR.add(f08Var.y(list.get(i)));
            i++;
        }
        gb4 gb4VarJ = i21.j(gb4VarR);
        gb4 gb4VarR2 = i21.r();
        while (i < iIntValue2 + iIntValue3 + 3) {
            gb4VarR2.add(f08Var.y(list.get(i)));
            i++;
        }
        return new bm8(gb4VarJ, i21.j(gb4VarR2), iIntValue);
    }

    public s18(String str) {
        this.X = (byte) 10;
    }

    public /* synthetic */ s18(byte b) {
        this.X = b;
    }
}
