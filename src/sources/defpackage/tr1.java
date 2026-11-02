package defpackage;

import java.util.List;
import su.happ.proxyutility.util.dnsttv.dto.RequestEnvelope;
import su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class tr1 extends uy7 implements rn2 {
    public vr1 g0;
    public RequestEnvelope h0;
    public long i0;
    public boolean j0;
    public /* synthetic */ Object k0;
    public final /* synthetic */ vr1 l0;
    public final /* synthetic */ RequestEnvelope m0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr1(vr1 vr1Var, RequestEnvelope requestEnvelope, q51 q51Var) {
        super(2, q51Var);
        this.l0 = vr1Var;
        this.m0 = requestEnvelope;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        tr1 tr1Var = new tr1(this.l0, this.m0, q51Var);
        tr1Var.k0 = obj;
        return tr1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) throws Throwable {
        RequestEnvelope requestEnvelope;
        long j;
        vr1 vr1Var;
        byte[] bytes;
        b71 b71Var = (b71) this.k0;
        boolean z = this.j0;
        if (!z) {
            w39.n0(obj);
            RequestEnvelope requestEnvelope2 = this.m0;
            String str = "withResolvers: START data:" + requestEnvelope2.getUrl();
            vr1 vr1Var2 = this.l0;
            vr1.d(vr1Var2, str, null, 6);
            long jCurrentTimeMillis = System.currentTimeMillis();
            List list = vr1Var2.c;
            l66 l66Var = m66.X;
            String str2 = (String) wv0.J0(list);
            vr1.d(vr1Var2, "domain:" + str2, null, 6);
            List listI = vr1Var2.f.i();
            if (listI != null) {
                if (listI.isEmpty()) {
                    listI = null;
                }
                if (listI != null) {
                    byte[] bArr = vr1Var2.b;
                    vk1 vk1Var = new vk1(vr1Var2, (byte) 3);
                    str2.getClass();
                    bArr.getClass();
                    is1 is1Var = new is1(str2, bArr, listI, vk1Var);
                    byte[] bArrA = requestEnvelope2.a();
                    DnsTTLogType dnsTTLogType = vr1Var2.e;
                    this.k0 = b71Var;
                    this.g0 = vr1Var2;
                    this.h0 = requestEnvelope2;
                    this.i0 = jCurrentTimeMillis;
                    this.j0 = true;
                    Object objC = is1Var.c(bArrA, dnsTTLogType, this);
                    c71 c71Var = c71.X;
                    if (objC == c71Var) {
                        return c71Var;
                    }
                    requestEnvelope = requestEnvelope2;
                    j = jCurrentTimeMillis;
                    obj = objC;
                    vr1Var = vr1Var2;
                }
            }
            return new qg5(new Integer(901), (Object) null);
        }
        if (!z) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = this.i0;
        requestEnvelope = this.h0;
        vr1Var = this.g0;
        w39.n0(obj);
        t82 t82Var = (t82) obj;
        byte[] bArr2 = t82Var.a;
        boolean z2 = bArr2 != null;
        String str3 = t82Var.b;
        if (z2) {
            vr1Var.f.g = str3;
        }
        RequestEnvelope.Route url = requestEnvelope.getUrl();
        String str4 = t82Var.a != null ? "SUCCESS" : "FAILURE";
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        int iHashCode = requestEnvelope.hashCode();
        if (bArr2 == null) {
            bytes = "fail".getBytes(iq0.a);
            bytes.getClass();
        } else {
            bytes = bArr2;
        }
        vr1.d(vr1Var, "withResolvers\ndata.url:" + url + "\nSTATUS:" + str4 + "\ntime:" + jCurrentTimeMillis2 + "ms\ndns:" + str3 + "\nsend data:" + iHashCode + "\nanswer data:\n" + new String(bytes, iq0.a), DnsTTLogType.INFO, 4);
        return new qg5(t82Var.c, bArr2);
    }
}
