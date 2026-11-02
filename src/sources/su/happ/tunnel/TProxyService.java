package su.happ.tunnel;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.tencent.mmkv.MMKV;
import defpackage.da2;
import defpackage.e69;
import defpackage.f08;
import defpackage.fm7;
import defpackage.k32;
import defpackage.mm7;
import defpackage.mq7;
import defpackage.n67;
import defpackage.p69;
import defpackage.ss8;
import defpackage.v08;
import defpackage.vz7;
import defpackage.wv0;
import defpackage.xv0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.AuthData;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lsu/happ/tunnel/TProxyService;", "Companion", "v08", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TProxyService {
    public static final v08 Companion = new v08();
    public final Context a;
    public final ParcelFileDescriptor b;
    public final vz7 c;

    static {
        System.loadLibrary("hev-socks5-tunnel");
    }

    public TProxyService(Context context, ParcelFileDescriptor parcelFileDescriptor, p69 p69Var, p69 p69Var2) {
        parcelFileDescriptor.getClass();
        this.a = context;
        this.b = parcelFileDescriptor;
        this.c = new vz7(new mq7((byte) 21));
    }

    private static final native long[] TProxyGetStats();

    private static final native boolean TProxyIsRunning();

    private static final native boolean TProxyStartService(String str, int i);

    private static final native boolean TProxyStopService();

    public static void b() {
        try {
            Companion.getClass();
            TProxyStopService();
        } catch (Exception unused) {
        }
    }

    public final void a() throws IOException {
        Integer numB0;
        Integer numB1;
        int iD = n67.d();
        HappApplication happApplication = HappApplication.M0;
        AuthData authDataF = k32.i().e().f();
        ss8 ss8Var = ss8.a;
        if (ss8.t()) {
            authDataF.toString();
        }
        StringBuilder sb = new StringBuilder("tunnel:\n  mtu: 1500\n  ipv4: 26.26.26.1\n");
        if (n67.g()) {
            sb.append("  ipv6: 'da26:2626::1'\n");
        }
        sb.append("socks5:\n");
        sb.append("  port: " + iD);
        sb.append("\n  address: 127.0.0.1\n  udp: 'udp'\n");
        String password = authDataF.getPassword();
        if (password != null) {
            sb.append("  username: '" + mm7.W(authDataF.getUser(), "'", "''", false) + "'");
            sb.append('\n');
            sb.append("  password: '" + mm7.W(password, "'", "''", false) + "'");
            sb.append('\n');
        }
        List listF0 = fm7.F0("300,60", new String[]{","}, 6);
        ArrayList arrayList = new ArrayList(xv0.Z(listF0, 10));
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            arrayList.add(fm7.R0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        String str = (String) wv0.u0(0, arrayList2);
        int iIntValue = (str == null || (numB1 = mm7.b0(str)) == null) ? 300 : numB1.intValue();
        String str2 = (String) wv0.u0(1, arrayList2);
        int iIntValue2 = (str2 == null || (numB0 = mm7.b0(str2)) == null) ? 60 : numB0.intValue();
        sb.append("misc:\n");
        sb.append("  tcp-read-write-timeout: " + (iIntValue * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax));
        sb.append('\n');
        sb.append("  udp-read-write-timeout: " + (iIntValue2 * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax));
        sb.append('\n');
        int iE = ((MMKV) this.c.getValue()).e(-1, "pref_logs_type");
        e69.Z.getClass();
        String str3 = f08.i(iE).X;
        if (str3.equals("warning")) {
            str3 = "warn";
        }
        if (!str3.equals("none")) {
            sb.append("  log-level: ".concat(str3));
            sb.append('\n');
        }
        String string = sb.toString();
        File file = new File(this.a.getFilesDir(), "hev-socks5-tunnel.yaml");
        da2.T(file, string);
        ss8 ss8Var2 = ss8.a;
        if (ss8.t()) {
            file.getAbsolutePath();
        }
        try {
            v08 v08Var = Companion;
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            int fd = this.b.getFd();
            v08Var.getClass();
            TProxyStartService(absolutePath, fd);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
