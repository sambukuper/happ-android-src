package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidComposeView;
import java.io.PrintWriter;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y2 implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ y2(BaseActivity baseActivity) {
        this.X = (byte) 26;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        boolean z = false;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                oq5 oq5Var = (oq5) obj;
                if (oq5Var != null && oq5Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 1:
                return dn8Var;
            case 2:
                return dn8Var;
            case 3:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 4:
                return Boolean.TRUE;
            case 5:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 6:
                return Boolean.TRUE;
            case 7:
                Class cls = AndroidComposeView.J1;
                return Boolean.TRUE;
            case 8:
                return Boolean.valueOf(vr3.I((y07) obj));
            case 9:
                return (q78) obj;
            case 10:
                kl5 kl5Var = (kl5) obj;
                ox1 ox1Var = pc.a;
                kl5Var.getClass();
                x97.S(kl5Var, ox1Var);
                return ((Context) x97.S(kl5Var, pc.b)).getResources();
            case 11:
                return Boolean.valueOf(vr3.I((y07) obj));
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                nw3[] nw3VarArr = d17.a;
                ((f17) obj).a(c17.y, dn8Var);
                return dn8Var;
            case 13:
                nw3[] nw3VarArr2 = d17.a;
                ((f17) obj).a(c17.x, dn8Var);
                return dn8Var;
            case 14:
                ((Long) obj).getClass();
                return dn8Var;
            case 15:
                return dn8Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ((Long) obj).getClass();
                return dn8Var;
            case 17:
                return Boolean.valueOf(!(((ml) obj) instanceof xg5));
            case 18:
                kn3 kn3Var = (kn3) obj;
                kn3Var.getClass();
                kn3Var.a = true;
                return dn8Var;
            case 19:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.println(p61.q(printWriter) + " The domain in URL has not changed as it is already the same");
                return dn8Var;
            case 20:
                PrintWriter printWriter2 = (PrintWriter) obj;
                printWriter2.write(p61.q(printWriter2) + " New domain changed to NEW_DOMAIN");
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                PrintWriter printWriter3 = (PrintWriter) obj;
                printWriter3.write(p61.q(printWriter3) + " The URL changed to NEW_URL");
                return dn8Var;
            case 22:
                PrintWriter printWriter4 = (PrintWriter) obj;
                printWriter4.write(p61.q(printWriter4) + " The URL has not changed as it is already the same");
                return dn8Var;
            case 23:
                return (av) obj;
            case 24:
                d10 d10Var = (d10) obj;
                d10Var.getClass();
                z68.W(d10Var);
                return dn8Var;
            case 25:
                ((d10) obj).a1();
                return dn8Var;
            case 26:
                Resources resources = (Resources) obj;
                int i = BaseActivity.P0;
                resources.getClass();
                return Boolean.valueOf(BaseActivity.w(resources));
            case 27:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(mm7.Z(str, false, "#"));
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ((p34) obj).a();
                return dn8Var;
            default:
                return dn8Var;
        }
    }

    public /* synthetic */ y2(byte b) {
        this.X = b;
    }
}
