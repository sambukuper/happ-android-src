package defpackage;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import java.io.File;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import okhttp3.Dns;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.ExcludeSettingsCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h80 implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ h80(byte b) {
        this.X = b;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return dn8Var;
            case 1:
                kl5 kl5Var = (kl5) obj;
                ox1 ox1Var = pc.b;
                kl5Var.getClass();
                if (((Context) x97.S(kl5Var, ox1Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return y80.b;
                }
                w80.a.getClass();
                return v80.c;
            case 2:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.getClass();
                printWriter.println("subscription try add");
                return dn8Var;
            case 3:
                return dn8Var;
            case 4:
                ye8 ye8Var = (ye8) obj;
                ye8Var.getClass();
                di5 di5Var = (di5) ye8Var;
                di5Var.r0 = false;
                ch3.I(di5Var);
                return Boolean.FALSE;
            case 5:
                ((Long) obj).getClass();
                return dn8Var;
            case 6:
                uz0 uz0Var = (uz0) obj;
                LayoutNode layoutNode = uz0Var instanceof LayoutNode ? (LayoutNode) uz0Var : null;
                if (layoutNode != null && layoutNode.Q0) {
                    wc3.b("Apply is called on deactivated node " + uz0Var);
                }
                return dn8Var;
            case 7:
                return Boolean.valueOf(!(((ix4) obj) instanceof yz0));
            case 8:
                q61 q61Var = (q61) obj;
                if (q61Var instanceof u61) {
                    return (u61) q61Var;
                }
                return null;
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                return str + " : " + value;
            case 10:
                return obj instanceof Object[] ? eu.x0((Object[]) obj, null, "[", "]", new h80((byte) 10), 25) : String.valueOf(obj);
            case 11:
                d17.f((f17) obj);
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((String) obj).getClass();
                return dn8Var;
            case 13:
                ko1 ko1Var = (ko1) obj;
                ko1Var.getClass();
                ko1Var.R(false, false);
                return dn8Var;
            case 14:
                return Boolean.valueOf(w39.j(obj));
            case 15:
                return Dns.Record.ServiceMetadata.toString$lambda$0$0((InetAddress) obj);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                return new String(bArr, iq0.a);
            case 17:
                byte[] bArr2 = (byte[]) obj;
                bArr2.getClass();
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArr2) {
                    int i = b2 & 255;
                    if (i == 45 || ((48 <= i && i < 58) || ((65 <= i && i < 91) || (97 <= i && i < 123)))) {
                        sb.append((char) i);
                    } else {
                        sb.append(String.format("\\x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
                    }
                }
                return sb.toString();
            case 18:
                InetAddress inetAddress = (InetAddress) obj;
                inetAddress.getClass();
                return inetAddress.getHostAddress();
            case 19:
                return Boolean.TRUE;
            case 20:
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return Boolean.FALSE;
            case 22:
                qg5 qg5Var = (qg5) obj;
                qg5Var.getClass();
                return String.valueOf(((String) qg5Var.X).charAt(((Number) qg5Var.Y).intValue()));
            case 23:
                String str2 = (String) obj;
                str2.getClass();
                return Boolean.valueOf(jm4.N(str2));
            case 24:
                String str3 = (String) obj;
                str3.getClass();
                return new ExcludeSettingsCache(str3, jm4.E(str3));
            case 25:
                PrintWriter printWriter2 = (PrintWriter) obj;
                printWriter2.println(p61.q(printWriter2) + " Fallback to assets");
                return dn8Var;
            case 26:
                md4 md4Var = (md4) obj;
                md4Var.getClass();
                md4Var.g(dg5.Y);
                z68.t(md4Var, '-');
                md4Var.e(dg5.Y);
                z68.t(md4Var, '-');
                md4Var.d(dg5.Y);
                z68.t(md4Var, ' ');
                dg5 dg5Var = dg5.Y;
                md4Var.b(dg5Var);
                z68.t(md4Var, ':');
                md4Var.f(dg5Var);
                z68.t(md4Var, ':');
                md4Var.c(dg5Var);
                return dn8Var;
            case 27:
                ((PrintWriter) obj).println(new Date() + " Happ file updated");
                return dn8Var;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ((PrintWriter) obj).println(new Date() + " Happ file failed");
                return dn8Var;
            default:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new ja7(absolutePath);
        }
    }
}
