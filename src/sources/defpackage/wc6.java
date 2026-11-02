package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wc6 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Serializable g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    public /* synthetic */ wc6(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = serializable;
        this.h0 = obj4;
        this.i0 = obj5;
    }

    @Override // defpackage.dn2
    public final Object invoke() throws Throwable {
        boolean z;
        byte b = this.X;
        Object obj = this.i0;
        Object obj2 = this.h0;
        Serializable serializable = this.g0;
        Object obj3 = this.f0;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        switch (b) {
            case 0:
                hv6 hv6Var = (hv6) obj5;
                bw6 bw6Var = (bw6) obj4;
                kv6 kv6Var = (kv6) obj3;
                String str = (String) serializable;
                Object[] objArr = (Object[]) obj;
                boolean z2 = true;
                if (hv6Var.Y != kv6Var) {
                    hv6Var.Y = kv6Var;
                    z = true;
                } else {
                    z = false;
                }
                if (dh3.f(hv6Var.Z, str)) {
                    z2 = z;
                } else {
                    hv6Var.Z = str;
                }
                hv6Var.X = bw6Var;
                hv6Var.f0 = obj2;
                hv6Var.g0 = objArr;
                f63 f63Var = hv6Var.h0;
                if (f63Var != null && z2) {
                    f63Var.D();
                    hv6Var.h0 = null;
                    hv6Var.d();
                }
                return dn8.a;
            default:
                return Boolean.valueOf(((mx7) obj5).a((lx7) obj4, (ArrayList) obj3, (LinkedHashMap) serializable, (List) obj2, (ArrayList) obj));
        }
    }
}
