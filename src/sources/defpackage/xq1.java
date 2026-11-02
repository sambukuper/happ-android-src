package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
import su.happ.proxyutility.util.dnsttv.dto.DnsRR;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xq1 {
    public final ByteArrayOutputStream a = new ByteArrayOutputStream();
    public final HashMap b = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        this.a.write(i & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(br1 br1Var) {
        br1Var.getClass();
        List list = br1Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List listSubList = list.subList(i, list.size());
            new br1(listSubList);
            String strY0 = listSubList.isEmpty() ? "." : wv0.y0(listSubList, ".", (String) null, (String) null, new h80((byte) 17), 30);
            HashMap map = this.b;
            Integer num = (Integer) map.get(strY0);
            if (num != null && (num.intValue() & 16383) == num.intValue()) {
                d(49152 | num.intValue());
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = this.a;
            map.put(strY0, Integer.valueOf(byteArrayOutputStream.size()));
            byte[] bArr = (byte[]) list.get(i);
            a(bArr.length);
            byteArrayOutputStream.write(bArr, 0, bArr.length);
        }
        a(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(DnsRR dnsRR) throws zq1.c {
        dnsRR.getClass();
        b(dnsRR.getName());
        d(dnsRR.getType() & 65535);
        d(dnsRR.getCls() & 65535);
        int ttl = dnsRR.getTtl();
        a(ttl >>> 24);
        a((ttl >>> 16) & 255);
        a((ttl >>> 8) & 255);
        a(ttl & 255);
        if (dnsRR.getData().length > 65535) {
            throw new zq1.c();
        }
        d(dnsRR.getData().length);
        byte[] data = dnsRR.getData();
        data.getClass();
        this.a.write(data, 0, data.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i) {
        a(i >> 8);
        a(i & 255);
    }
}
