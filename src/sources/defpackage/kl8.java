package defpackage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class kl8 extends uy7 implements rn2 {
    public final /* synthetic */ String g0;
    public final /* synthetic */ jh4 h0;
    public final /* synthetic */ byte[] i0;
    public final /* synthetic */ long j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl8(String str, jh4 jh4Var, byte[] bArr, long j, q51 q51Var) {
        super(2, q51Var);
        this.g0 = str;
        this.h0 = jh4Var;
        this.i0 = bArr;
        this.j0 = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new kl8(this.g0, this.h0, this.i0, this.j0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) throws te8.a {
        qg5 qg5Var;
        qg5 qg5Var2;
        Integer numB0;
        w39.n0(obj);
        int iIntValue = 53;
        String str = this.g0;
        if (mm7.Z(str, false, "[")) {
            int iM0 = fm7.m0(str, "]", 0, false, 6);
            if (iM0 == -1) {
                qg5Var = new qg5(str, 53);
            } else {
                String strSubstring = str.substring(1, iM0);
                String strSubstring2 = str.substring(iM0 + 1);
                if (mm7.Z(strSubstring2, false, ":") && (numB0 = mm7.b0(strSubstring2.substring(1))) != null) {
                    iIntValue = numB0.intValue();
                }
                qg5Var2 = new qg5(strSubstring, Integer.valueOf(iIntValue));
                qg5Var = qg5Var2;
            }
        } else {
            int iQ0 = fm7.q0(str, ':', 0, 6);
            int iL0 = fm7.l0(str, ':', 0, 6);
            if (iQ0 == -1 || iQ0 != iL0) {
                qg5Var = new qg5(str, 53);
            } else {
                String strSubstring3 = str.substring(0, iQ0);
                Integer numB1 = mm7.b0(str.substring(iQ0 + 1));
                qg5Var2 = new qg5(strSubstring3, Integer.valueOf(numB1 != null ? numB1.intValue() : 53));
                qg5Var = qg5Var2;
            }
        }
        String str2 = (String) qg5Var.X;
        int iIntValue2 = ((Number) qg5Var.Y).intValue();
        try {
            InetAddress byName = InetAddress.getByName(str2);
            long j = this.j0;
            byte[] bArr = this.i0;
            jh4 jh4Var = this.h0;
            if (jh4Var != null) {
                jh4.v(jh4Var, "udpExchange size:" + bArr.length + " host:" + str2 + " port:" + iIntValue2 + " addr:" + byName + " timeoutMillis:" + j, null, 6);
            }
            DatagramSocket datagramSocket = new DatagramSocket();
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            try {
                datagramSocket.setSoTimeout((int) j);
                try {
                    try {
                        try {
                            datagramSocket.send(new DatagramPacket(bArr, bArr.length, byName, iIntValue2));
                            byte[] bArr2 = new byte[4096];
                            DatagramPacket datagramPacket = new DatagramPacket(bArr2, 4096);
                            datagramSocket.receive(datagramPacket);
                            if (datagramPacket.getLength() == 0) {
                                throw new te8.c();
                            }
                            byte[] bArrJ0 = eu.j0(0, datagramPacket.getLength(), bArr2);
                            datagramSocket.close();
                            return bArrJ0;
                        } catch (CancellationException e) {
                            throw e;
                        }
                    } catch (SocketTimeoutException unused) {
                        throw new te8.d();
                    }
                } catch (te8 e2) {
                    throw e2;
                } catch (Throwable th) {
                    throw new te8.b("UDP I/O failure: " + th.getMessage(), th);
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    oc.h(datagramSocket, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            str2.getClass();
            throw new te8.a("invalid resolver address: ".concat(str2), th4);
        }
    }
}
