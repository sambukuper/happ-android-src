package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.util.dnsttv.dto.DnsQuestion;
import su.happ.proxyutility.util.dnsttv.dto.DnsRR;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class yq1 {
    public short a;
    public short b;
    public List c;
    public final List d;
    public final List e;
    public List f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yq1(short s, int i) {
        s = (i & 1) != 0 ? (short) 0 : s;
        short s2 = (i & 2) == 0 ? (short) 256 : (short) 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.a = s;
        this.b = s2;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] a() throws zq1.c {
        xq1 xq1Var = new xq1();
        xq1Var.d(this.a & 65535);
        xq1Var.d(this.b & 65535);
        int size = this.c.size();
        List list = this.d;
        int size2 = list.size();
        List list2 = this.e;
        int[] iArr = {size, size2, list2.size(), this.f.size()};
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 > 65535) {
                throw new zq1.c();
            }
            xq1Var.d(i2);
        }
        for (DnsQuestion dnsQuestion : this.c) {
            dnsQuestion.getClass();
            xq1Var.b(dnsQuestion.getName());
            xq1Var.d(dnsQuestion.getType() & 65535);
            xq1Var.d(dnsQuestion.getCls() & 65535);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xq1Var.c((DnsRR) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            xq1Var.c((DnsRR) it2.next());
        }
        Iterator it3 = this.f.iterator();
        while (it3.hasNext()) {
            xq1Var.c((DnsRR) it3.next());
        }
        byte[] byteArray = xq1Var.a.toByteArray();
        byteArray.getClass();
        return byteArray;
    }
}
