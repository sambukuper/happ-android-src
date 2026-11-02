package defpackage;

import java.util.ArrayList;
import su.happ.proxyutility.util.dnsttv.dto.DnsQuestion;
import su.happ.proxyutility.util.dnsttv.dto.DnsRR;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class cs1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static yq1 a(byte[] bArr) throws zq1.f {
        bArr.getClass();
        la1 la1Var = new la1(bArr);
        yq1 yq1Var = new yq1((short) 0, 63);
        yq1Var.a = (short) la1Var.b();
        yq1Var.b = (short) la1Var.b();
        int iB = la1Var.b();
        int iB2 = la1Var.b();
        int iB3 = la1Var.b();
        int iB4 = la1Var.b();
        for (int i = 0; i < iB; i++) {
            yq1Var.c.add(new DnsQuestion(b(la1Var), (short) la1Var.b(), (short) la1Var.b()));
        }
        for (int i2 = 0; i2 < iB2; i2++) {
            yq1Var.d.add(c(la1Var));
        }
        for (int i3 = 0; i3 < iB3; i3++) {
            yq1Var.e.add(c(la1Var));
        }
        for (int i4 = 0; i4 < iB4; i4++) {
            yq1Var.f.add(c(la1Var));
        }
        if (la1Var.a.length - la1Var.b == 0) {
            return yq1Var;
        }
        throw new zq1.f("trailing bytes after message");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static br1 b(la1 la1Var) throws zq1.e, zq1.d, zq1.g {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Integer numValueOf = null;
        while (true) {
            int iA = la1Var.a();
            int i2 = iA & 192;
            if (i2 == 0) {
                int i3 = iA & 63;
                if (i3 == 0) {
                    if (numValueOf != null) {
                        la1Var.b = numValueOf.intValue();
                    }
                    br1 br1Var = br1.b;
                    return ar1.b(arrayList);
                }
                int i4 = la1Var.b;
                int i5 = i4 + i3;
                byte[] bArr = la1Var.a;
                if (i5 > bArr.length) {
                    throw new zq1.g();
                }
                byte[] bArrJ0 = eu.j0(i4, i5, bArr);
                la1Var.b += i3;
                arrayList.add(bArrJ0);
            } else {
                if (i2 != 192) {
                    throw new zq1.d("reserved label type");
                }
                int iA2 = ((iA & 63) << 8) | la1Var.a();
                if (i == 0) {
                    numValueOf = Integer.valueOf(la1Var.b);
                }
                i++;
                if (i > 10) {
                    throw new zq1.e("too many compression pointers");
                }
                la1Var.b = iA2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static DnsRR c(la1 la1Var) throws zq1.e, zq1.d, zq1.g {
        br1 br1VarB = b(la1Var);
        short sB = (short) la1Var.b();
        short sB2 = (short) la1Var.b();
        int iA = (la1Var.a() << 24) | (la1Var.a() << 16) | (la1Var.a() << 8) | la1Var.a();
        int iB = la1Var.b();
        int i = la1Var.b;
        int i2 = i + iB;
        byte[] bArr = la1Var.a;
        if (i2 > bArr.length) {
            throw new zq1.g();
        }
        byte[] bArrJ0 = eu.j0(i, i2, bArr);
        la1Var.b += iB;
        return new DnsRR(br1VarB, sB, sB2, iA, bArrJ0);
    }
}
