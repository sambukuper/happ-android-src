package defpackage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class dr1 extends uy7 implements rn2 {
    public final /* synthetic */ String g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ short i0;
    public final /* synthetic */ LinkedHashMap j0;
    public final /* synthetic */ gn2 k0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: int */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dr1(String str, String str2, int i, LinkedHashMap linkedHashMap, gn2 gn2Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = str;
        this.h0 = str2;
        this.i0 = i;
        this.j0 = linkedHashMap;
        this.k0 = gn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        dr1 dr1VarN = n((q51) obj2, (b71) obj);
        dn8 dn8Var = dn8.a;
        dr1VarN.q(dn8Var);
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new dr1(this.g0, this.h0, this.i0, this.j0, this.k0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
    public final Object q(Object obj) {
        DatagramSocket datagramSocket;
        ir1 rj6Var;
        Throwable thA;
        ir1 ir1Var;
        long jCurrentTimeMillis;
        w39.n0(obj);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        String str = this.g0;
        String str2 = this.h0;
        short s = this.i0;
        gn2 gn2Var = this.k0;
        try {
            gn2Var.B("Запуск резолва для: " + str2 + " через " + str);
            try {
                InetAddress byName = InetAddress.getByName(str);
                datagramSocket = new DatagramSocket();
                datagramSocket.setSoTimeout(s);
                try {
                    byte[] bArrP = oy1.p(str2);
                    datagramSocket.send(new DatagramPacket(bArrP, bArrP.length, byName, 53));
                    byte[] bArr = new byte[1024];
                    DatagramPacket datagramPacket = new DatagramPacket(bArr, 1024);
                    datagramSocket.receive(datagramPacket);
                    ArrayList arrayList = new ArrayList();
                    oy1.D(bArr, datagramPacket.getLength(), arrayList);
                    rj6Var = !arrayList.isEmpty() ? new hr1(arrayList) : new gr1("Сервер прислал ответ, но в нем нет IPv4 (A) записей.", null);
                    if (datagramSocket != null) {
                        datagramSocket.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var = new rj6(th);
                        if (datagramSocket != null) {
                        }
                        thA = sj6.a(rj6Var);
                        if (thA != null) {
                            if (thA instanceof SocketTimeoutException) {
                                rj6Var = new gr1(oi0.l("Таймаут ожидания ответа от ", str), thA);
                            } else {
                                rj6Var = new gr1(oi0.l("Критическая ошибка: ", thA.getLocalizedMessage()), thA);
                            }
                        }
                        ir1Var = rj6Var;
                        jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                        if (ir1Var instanceof hr1) {
                            this.j0.put(str, new Integer((int) jCurrentTimeMillis));
                            StringBuilder sbT = oi0.t("dnsServer:", str, " domain:", str2, " SUCCESS resolvedIps:");
                            sbT.append(((hr1) ir1Var).a);
                            sbT.append(" time:");
                            sbT.append(jCurrentTimeMillis);
                            gn2Var.B(sbT.toString());
                        } else {
                            if (ir1Var instanceof gr1) {
                                b61.c();
                                return null;
                            }
                            StringBuilder sbT2 = oi0.t("dnsServer:", str, " domain:", str2, " FAILURE time:");
                            sbT2.append(jCurrentTimeMillis);
                            sbT2.append(" error:");
                            sbT2.append(((gr1) ir1Var).a);
                            gn2Var.B(sbT2.toString());
                        }
                        return dn8.a;
                    } catch (Throwable th2) {
                        if (datagramSocket != null) {
                            datagramSocket.close();
                        }
                        throw th2;
                    }
                }
            } catch (Exception e) {
                rj6Var = new gr1("Неверный IP DNS-сервера: " + str, e);
                datagramSocket = null;
            }
        } catch (Throwable th3) {
            th = th3;
            datagramSocket = null;
        }
        thA = sj6.a(rj6Var);
        if (thA != null) {
            if (thA instanceof SocketTimeoutException) {
                rj6Var = new gr1(oi0.l("Таймаут ожидания ответа от ", str), thA);
            } else {
                rj6Var = new gr1(oi0.l("Критическая ошибка: ", thA.getLocalizedMessage()), thA);
            }
        }
        ir1Var = rj6Var;
        jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
        if (ir1Var instanceof hr1) {
            this.j0.put(str, new Integer((int) jCurrentTimeMillis));
            StringBuilder sbT3 = oi0.t("dnsServer:", str, " domain:", str2, " SUCCESS resolvedIps:");
            sbT3.append(((hr1) ir1Var).a);
            sbT3.append(" time:");
            sbT3.append(jCurrentTimeMillis);
            gn2Var.B(sbT3.toString());
        } else {
            if (ir1Var instanceof gr1) {
                b61.c();
                return null;
            }
            StringBuilder sbT4 = oi0.t("dnsServer:", str, " domain:", str2, " FAILURE time:");
            sbT4.append(jCurrentTimeMillis);
            sbT4.append(" error:");
            sbT4.append(((gr1) ir1Var).a);
            gn2Var.B(sbT4.toString());
        }
        return dn8.a;
    }
}
