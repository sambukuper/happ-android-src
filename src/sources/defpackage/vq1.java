package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import su.happ.proxyutility.util.dnsttv.dto.DnsRR;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class vq1 {
    public static final SecureRandom a = new SecureRandom();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] a(yq1 yq1Var, br1 br1Var) throws wq1.b, wq1.a, zq1.g, wq1.c {
        String strL;
        String strJ;
        List list = yq1Var.d;
        br1Var.getClass();
        short s = yq1Var.b;
        int i = s & 15;
        if (i != 0) {
            list.size();
        }
        int i2 = s & Short.MIN_VALUE;
        if (i2 == 0) {
            throw new wq1.a("Not a response (QR=0). Is this a query?");
        }
        if (i != 0) {
            if (i == 1) {
                strJ = "Format Error (FORMERR)";
            } else if (i == 2) {
                strJ = "Server Failure (SERVFAIL)";
            } else if (i == 3) {
                strJ = "Non-Existent Domain (NXDOMAIN)";
            } else if (i != 4) {
                strJ = i != 5 ? pc6.j(i, "Unknown RCODE ") : "Query Refused (REFUSED)";
            } else {
                strJ = "Not Implemented (NOTIMP)";
            }
            throw new wq1.a("DNS Server returned error: ".concat(strJ));
        }
        if (list.isEmpty()) {
            throw new wq1.a("Response has 0 answer records");
        }
        list.size();
        int i3 = 0;
        DnsRR dnsRR = (DnsRR) list.get(0);
        if (!((Boolean) dnsRR.getName().a(br1Var).Y).booleanValue()) {
            throw new wq1.a("Answer name [" + dnsRR.getName() + "] does not match domain [" + br1Var + "]");
        }
        if (dnsRR.getType() != 16) {
            int type = dnsRR.getType() & 65535;
            if (type == 1) {
                strL = "A (IPv4)";
            } else if (type == 2) {
                strL = "NS";
            } else if (type == 5) {
                strL = "CNAME";
            } else if (type == 6) {
                strL = "SOA";
            } else if (type == 12) {
                strL = "PTR";
            } else if (type != 15) {
                strL = type != 28 ? oi0.l("Type ", dl8.a(dnsRR.getType())) : "AAAA (IPv6)";
            } else {
                strL = "MX";
            }
            throw new wq1.a("Expected TXT record, but got " + strL + " from " + dnsRR.getName());
        }
        if (i2 != 32768) {
            throw new wq1.c();
        }
        if (i != 0) {
            throw new wq1.c();
        }
        if (list.size() != 1) {
            throw new wq1.b("no answer record");
        }
        if (dnsRR.getType() != 16) {
            throw new wq1.c();
        }
        byte[] data = dnsRR.getData();
        data.getClass();
        if (data.length == 0) {
            throw new zq1.g();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i3 < data.length) {
            int i4 = data[i3] & 255;
            int i5 = i3 + 1;
            if (data.length - i5 < i4) {
                throw new zq1.g();
            }
            byteArrayOutputStream.write(data, i5, i4);
            i3 = i5 + i4;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static br1 b(byte[] bArr, byte[] bArr2, br1 br1Var) {
        bArr.getClass();
        br1Var.getClass();
        byte[] bArr3 = new byte[3];
        a.nextBytes(bArr3);
        int length = bArr.length + 4 + bArr2.length;
        byte[] bArr4 = new byte[length];
        int i = 0;
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        bArr4[bArr.length] = -29;
        System.arraycopy(bArr3, 0, bArr4, bArr.length + 1, 3);
        System.arraycopy(bArr2, 0, bArr4, bArr.length + 4, bArr2.length);
        byte[] bArr5 = g10.a;
        byte[] bArr6 = new byte[((length * 8) + 4) / 5];
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            j = (j << 8) | (((long) bArr4[i4]) & 255);
            i2 += 8;
            while (i2 >= 5) {
                i2 -= 5;
                bArr6[i3] = bArr5[(int) ((j >> i2) & 31)];
                i3++;
            }
        }
        if (i2 > 0) {
            bArr6[i3] = bArr5[(int) ((j << (5 - i2)) & 31)];
            i3++;
        }
        Charset charset = iq0.d;
        String lowerCase = new String(bArr6, 0, i3, charset).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        byte[] bytes = lowerCase.getBytes(charset);
        bytes.getClass();
        ArrayList arrayList = new ArrayList();
        while (i < bytes.length) {
            int iMin = Math.min(i + 63, bytes.length);
            arrayList.add(eu.j0(i, iMin, bytes));
            i = iMin;
        }
        arrayList.addAll(br1Var.a);
        br1 br1Var2 = br1.b;
        return ar1.b(arrayList);
    }
}
