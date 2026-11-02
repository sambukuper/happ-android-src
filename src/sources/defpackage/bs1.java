package defpackage;

import java.io.ByteArrayOutputStream;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import su.happ.proxyutility.util.dnsttv.dto.DnsQuestion;
import su.happ.proxyutility.util.dnsttv.dto.DnsRR;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class bs1 {
    public static final bs1 a = new bs1();
    public static final SecretKeySpec b = new SecretKeySpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, "HmacSHA256");
    public static final byte[] c;
    public static final byte[] d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Charset charset = iq0.d;
        byte[] bytes = "v1/probe-out".getBytes(charset);
        bytes.getClass();
        c = bytes;
        byte[] bytes2 = "v1/probe-in".getBytes(charset);
        bytes2.getClass();
        d = bytes2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] a(br1 br1Var) {
        yq1 yq1Var = new yq1((short) 0, 63);
        yq1Var.a = (short) m66.Y.c(0, 65536);
        yq1Var.b = (short) 256;
        yq1Var.c = i21.N(new DnsQuestion[]{new DnsQuestion(br1Var, (short) 16, (short) 1)});
        yq1Var.f = i21.N(new DnsRR[]{new DnsRR(br1.b, (short) 41, (short) 4096, 0, new byte[0])});
        return yq1Var.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n28 b(byte[] bArr, String str, br1 br1Var, byte[] bArr2, int i, gn2 gn2Var) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            yq1 yq1VarA = cs1.a(bArr);
            short s = yq1VarA.b;
            int i2 = s & Short.MIN_VALUE;
            m28 m28Var = m28.Z;
            if (i2 != 32768) {
                return new n28(str, m28Var, null);
            }
            if ((s & 15) != 0) {
                return new n28(str, m28Var, null);
            }
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(b);
            mac.update(d);
            mac.update(bArr2);
            byte[] bArrDoFinal = mac.doFinal();
            bArrDoFinal.getClass();
            byte[] bArrJ0 = eu.j0(0, 8, bArrDoFinal);
            for (DnsRR dnsRR : yq1VarA.d) {
                if (dnsRR.getType() == 16 && ((Boolean) dnsRR.getName().a(br1Var).Y).booleanValue()) {
                    try {
                        byte[] data = dnsRR.getData();
                        data.getClass();
                        if (data.length == 0) {
                            throw new zq1.g();
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        int i3 = 0;
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
                        if (byteArray.length == 48) {
                            byte[] bArrJ1 = eu.j0(0, 8, byteArray);
                            byte[] bArrJ2 = eu.j0(8, 16, byteArray);
                            boolean zEquals = Arrays.equals(bArrJ1, bArrJ0);
                            boolean zEquals2 = Arrays.equals(bArrJ2, bArr2);
                            if (zEquals && zEquals2) {
                                return new n28(str, m28.X, Integer.valueOf(i));
                            }
                            if (zEquals2 && !zEquals) {
                                gn2Var.B("[DNSTTv.Prober] " + str + ": tag mismatch (key skew or forgery)");
                                return new n28(str, m28Var, null);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return new n28(str, m28Var, null);
        } catch (Throwable th) {
            gn2Var.B("[DNSTTv.Prober] " + str + ": malformed reply — " + th);
            return new n28(str, m28.f0, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object c(String str, br1 br1Var, long j, gn2 gn2Var, s51 s51Var) throws NoSuchAlgorithmException, InvalidKeyException {
        wr1 wr1Var;
        long jCurrentTimeMillis;
        br1 br1Var2;
        gn2 gn2Var2;
        byte[] bArr;
        Integer num;
        Integer num2;
        String str2;
        gn2 gn2Var3;
        String str3 = str;
        gn2 gn2Var4 = gn2Var;
        if (s51Var instanceof wr1) {
            wr1Var = (wr1) s51Var;
            int i = wr1Var.m0;
            if ((i & Integer.MIN_VALUE) != 0) {
                wr1Var.m0 = i - Integer.MIN_VALUE;
            } else {
                wr1Var = new wr1(this, s51Var);
            }
        } else {
            wr1Var = new wr1(this, s51Var);
        }
        wr1 wr1Var2 = wr1Var;
        Object objA = wr1Var2.k0;
        int i2 = wr1Var2.m0;
        m28 m28Var = m28.Y;
        m28 m28Var2 = m28.f0;
        if (i2 == 0) {
            w39.n0(objA);
            byte[] bArr2 = new byte[8];
            l66 l66Var = m66.X;
            l66Var.f(bArr2);
            byte[] bArr3 = new byte[8];
            l66Var.f(bArr3);
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(b);
            mac.update(c);
            mac.update(bArr3);
            byte[] bArrDoFinal = mac.doFinal();
            bArrDoFinal.getClass();
            byte[] bArrJ0 = eu.j0(0, 4, bArrDoFinal);
            byte[] bArr4 = new byte[48];
            l66Var.f(bArr4);
            System.arraycopy(bArrJ0, 0, bArr4, 0, 4);
            System.arraycopy(bArr3, 0, bArr4, 4, 8);
            try {
                SecureRandom secureRandom = vq1.a;
                byte[] bArrA = a(vq1.b(bArr2, bArr4, br1Var));
                jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        ll8 ll8Var = ll8.a;
                        yr2 yr2Var = new yr2(gn2Var4, (byte) 28);
                        wr1Var2.f0 = str3;
                        wr1Var2.g0 = br1Var;
                        wr1Var2.h0 = gn2Var4;
                        wr1Var2.i0 = bArr3;
                        wr1Var2.j0 = jCurrentTimeMillis;
                        wr1Var2.m0 = 1;
                        objA = ll8Var.a(bArrA, str3, j, yr2Var, wr1Var2);
                        Object obj = c71.X;
                        if (objA == obj) {
                            return obj;
                        }
                        br1Var2 = br1Var;
                        gn2Var2 = gn2Var4;
                        bArr = bArr3;
                        str2 = str3;
                        gn2Var3 = gn2Var2;
                        return b((byte[]) objA, str2, br1Var2, bArr, (int) (System.currentTimeMillis() - jCurrentTimeMillis), gn2Var3);
                    } catch (Throwable th) {
                        th = th;
                        gn2Var4.B("[DNSTTv.testr] " + str3 + ": network error — " + th);
                        return new n28(str3, m28Var2, null);
                    }
                } catch (SocketTimeoutException unused) {
                    num2 = null;
                    return new n28(str3, m28Var, num2);
                } catch (te8.d unused2) {
                    num = null;
                    return new n28(str3, m28Var, num);
                }
            } catch (Throwable th2) {
                gn2Var4.B("[DNSTTv.testr] " + str3 + ": encode error — " + th2);
                return new n28(str3, m28Var2, null);
            }
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = wr1Var2.j0;
        bArr = wr1Var2.i0;
        gn2Var2 = wr1Var2.h0;
        br1Var2 = wr1Var2.g0;
        String str4 = wr1Var2.f0;
        try {
            w39.n0(objA);
            jCurrentTimeMillis = j2;
            str3 = str4;
            try {
                str2 = str3;
                gn2Var3 = gn2Var2;
                try {
                    return b((byte[]) objA, str2, br1Var2, bArr, (int) (System.currentTimeMillis() - jCurrentTimeMillis), gn2Var3);
                } catch (SocketTimeoutException unused3) {
                    str3 = str2;
                    num2 = null;
                    return new n28(str3, m28Var, num2);
                } catch (te8.d unused4) {
                    str3 = str2;
                    num = null;
                    return new n28(str3, m28Var, num);
                } catch (Throwable th3) {
                    th = th3;
                    str3 = str2;
                    gn2Var2 = gn2Var3;
                    gn2Var4 = gn2Var2;
                    gn2Var4.B("[DNSTTv.testr] " + str3 + ": network error — " + th);
                    return new n28(str3, m28Var2, null);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (SocketTimeoutException unused5) {
            str3 = str4;
            num2 = null;
            return new n28(str3, m28Var, num2);
        } catch (te8.d unused6) {
            str3 = str4;
            num = null;
            return new n28(str3, m28Var, num);
        } catch (Throwable th5) {
            th = th5;
            gn2Var4 = gn2Var2;
            str3 = str4;
            gn2Var4.B("[DNSTTv.testr] " + str3 + ": network error — " + th);
            return new n28(str3, m28Var2, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(List list, List list2, int i, long j, pq1 pq1Var, s51 s51Var) {
        xr1 xr1Var;
        LinkedHashMap rj6Var;
        qg5 qg5Var;
        if (s51Var instanceof xr1) {
            xr1Var = (xr1) s51Var;
            int i2 = xr1Var.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xr1Var.i0 = i2 - Integer.MIN_VALUE;
            } else {
                xr1Var = new xr1(this, s51Var);
            }
        } else {
            xr1Var = new xr1(this, s51Var);
        }
        Object obj = xr1Var.g0;
        int i3 = xr1Var.i0;
        try {
            if (i3 == 0) {
                w39.n0(obj);
                if (list2.isEmpty()) {
                    throw new IllegalArgumentException("testr.test requires at least one domain");
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int iMax = Math.max(0, i);
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    try {
                        br1 br1Var = br1.b;
                        qg5Var = new qg5(str, ar1.a(str));
                    } catch (Throwable unused) {
                        qg5Var = null;
                    }
                    if (qg5Var != null) {
                        arrayList.add(qg5Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    pq1Var.B("[DNSTTv.testr] no valid domains parsed — aborting");
                } else {
                    list.getClass();
                    List listA1 = wv0.a1(list);
                    Collections.shuffle(listA1);
                    as1 as1Var = new as1(listA1, arrayList, iMax, j, pq1Var, linkedHashMap, null);
                    xr1Var.f0 = linkedHashMap;
                    xr1Var.i0 = 1;
                    Object objN = gv3.n(as1Var, xr1Var);
                    c71 c71Var = c71.X;
                    if (objN == c71Var) {
                        return c71Var;
                    }
                    rj6Var = linkedHashMap;
                }
                rj6Var = null;
                if (rj6Var instanceof rj6) {
                    return null;
                }
                return rj6Var;
            }
            if (i3 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rj6Var = xr1Var.f0;
            w39.n0(obj);
            if (rj6Var.isEmpty()) {
                rj6Var = null;
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            return null;
        }
        return rj6Var;
    }
}
