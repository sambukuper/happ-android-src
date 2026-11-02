package defpackage;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ya2 implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ ya2(int i) {
        this.X = (byte) 10;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        Object rj6Var;
        Object rj6Var2;
        boolean z;
        z = false;
        boolean z2 = false;
        boolean z3 = true;
        switch (this.X) {
            case 0:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.println(p61.q(printWriter) + " REMOTE_PUSH The domain in URL has not changed as it is already the same");
                return dn8.a;
            case 1:
                PrintWriter printWriter2 = (PrintWriter) obj;
                printWriter2.write(p61.q(printWriter2) + " REMOTE_PUSH New domain changed to NEW_DOMAIN");
                return dn8.a;
            case 2:
                PrintWriter printWriter3 = (PrintWriter) obj;
                printWriter3.write(p61.q(printWriter3) + " REMOTE_PUSH The URL changed to NEW_URL");
                return dn8.a;
            case 3:
                PrintWriter printWriter4 = (PrintWriter) obj;
                printWriter4.write(p61.q(printWriter4) + " REMOTE_PUSH The URL has not changed as it is already the same");
                return dn8.a;
            case 4:
                PrintWriter printWriter5 = (PrintWriter) obj;
                printWriter5.println(p61.q(printWriter5) + " Fallback request (5)");
                return dn8.a;
            case 5:
                String str = (String) obj;
                try {
                    um3 um3Var = vm3.d;
                    g55 g55Var = um3Var.b;
                    rj6Var = new qg5(str, Long.valueOf(((ld6) um3Var.a(ld6.Companion.serializer(), str)).Z));
                    break;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
                return (qg5) (rj6Var instanceof rj6 ? null : rj6Var);
            case 6:
                return (String) ((qg5) obj).X;
            case 7:
                String str2 = (String) obj;
                try {
                    um3 um3Var2 = vm3.d;
                    g55 g55Var2 = um3Var2.b;
                    rj6Var2 = new qg5(str2, um3Var2.a(ld6.Companion.serializer(), str2));
                    break;
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    rj6Var2 = new rj6(th2);
                }
                return (qg5) (rj6Var2 instanceof rj6 ? null : rj6Var2);
            case 8:
                return dn8.a;
            case 9:
                return dn8.a;
            case 10:
                return Boolean.valueOf(((ai2) obj).Y0());
            case 11:
                synchronized (kd7.c) {
                    List list = kd7.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((gn2) list.get(i)).B(obj);
                    }
                }
                return dn8.a;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                PrintWriter printWriter6 = (PrintWriter) obj;
                printWriter6.getClass();
                printWriter6.println("=========================");
                return dn8.a;
            case 13:
                return new ow2(((Boolean) obj).booleanValue());
            case 14:
                ((fj) obj).getClass();
                return new a51(b22.c(null, 3), b22.d(null, 3));
            case 15:
                return Boolean.valueOf(obj != null);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return String.valueOf((int) ((Float) obj).floatValue());
            case 17:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 18:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 19:
                o05 o05Var = (o05) obj;
                js5 js5Var = sz2.c;
                long j = 0;
                for (Map.Entry entry : o05Var.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        js5 js5Var2 = (js5) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = sz2.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                bt.q(oi0.k(obj2, "duplicate element: "));
                                return null;
                            }
                            o05Var.e(js5Var2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            o05Var.d(js5Var2);
                        }
                    }
                }
                if (j == 0) {
                    o05Var.d(js5Var);
                } else {
                    o05Var.e(js5Var, Long.valueOf(j));
                }
                return null;
            case 20:
                ((c13) obj).getClass();
                return Boolean.TRUE;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ((g48) obj).f(null);
                return dn8.a;
            case 22:
                ja3 ja3Var = (ja3) obj;
                ja3Var.getClass();
                if (ja3Var instanceof ia3) {
                    z = true;
                } else if (ja3Var instanceof ha3) {
                    z = ((ha3) ja3Var).b;
                } else if (ja3Var instanceof ga3) {
                    z = ((ga3) ja3Var).c;
                } else {
                    if (!(ja3Var instanceof fa3)) {
                        b61.c();
                        return null;
                    }
                    z = ((fa3) ja3Var).a;
                }
                return new fa3(z, true);
            case 23:
                ja3 ja3Var2 = (ja3) obj;
                ja3Var2.getClass();
                if (!(ja3Var2 instanceof ia3)) {
                    if (ja3Var2 instanceof ha3) {
                        z3 = ((ha3) ja3Var2).b;
                    } else if (ja3Var2 instanceof ga3) {
                        z3 = ((ga3) ja3Var2).c;
                    } else {
                        if (!(ja3Var2 instanceof fa3)) {
                            b61.c();
                            return null;
                        }
                        z3 = ((fa3) ja3Var2).a;
                    }
                }
                return new fa3(z3, false);
            case 24:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 25:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 26:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 27:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            default:
                char cCharValue2 = ((Character) obj).charValue();
                if ('0' <= cCharValue2 && cCharValue2 < ':') {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }

    public /* synthetic */ ya2(byte b) {
        this.X = b;
    }

    public /* synthetic */ ya2(Object obj, byte b) {
        this.X = b;
    }
}
