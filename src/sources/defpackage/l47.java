package defpackage;

import android.net.Uri;
import com.google.gson.a;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class l47 extends i47 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i47
    public final x83 b(String str) {
        fq4 fq4Var;
        XRayConfig.OutboundBean outboundBean;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        Object rj6Var;
        String strA;
        XRayConfig.OutboundBean.OutSettingsBean settings;
        List servers;
        XRayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean;
        XRayConfig.OutboundBean.OutSettingsBean settings2;
        List servers2;
        XRayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean2;
        str.getClass();
        ss8 ss8Var = ss8.a;
        Uri uri = Uri.parse(ss8.c(str));
        EConfigType eConfigType = EConfigType.SOCKS;
        String strW = mm7.W(str, eConfigType.getProtocolScheme() + "://", "", false);
        int iM0 = fm7.m0(strW, "#", 0, false, 6);
        ServerConfig.INSTANCE.getClass();
        ServerConfig serverConfigA = ServerConfig.Companion.a(eConfigType);
        if (iM0 > 0) {
            String strJ = i47.j(strW);
            serverConfigA.m(strJ != null ? strJ : "");
            strW = fm7.Q0(iM0, strW);
        }
        Pattern patternCompile = Pattern.compile("^(.*):(.*)@(.+?):(\\d+?)$");
        patternCompile.getClass();
        int iM1 = fm7.m0(strW, "@", 0, false, 6);
        Object obj = null;
        if (iM1 < 0) {
            strW = ss8.a(strW);
            fq4Var = null;
        } else {
            Matcher matcher = patternCompile.matcher(strW);
            matcher.getClass();
            fq4Var = !matcher.matches() ? null : new fq4(matcher, strW);
            if (fq4Var == null) {
                strW = pc6.p(ss8.a(fm7.Q0(iM1, strW)), "@", fm7.f0(iM1 + 1, strW));
            }
        }
        if (fq4Var == null) {
            Matcher matcher2 = patternCompile.matcher(strW);
            matcher2.getClass();
            fq4Var = !matcher2.matches() ? null : new fq4(matcher2, strW);
            if (fq4Var == null) {
                Matcher matcher3 = patternCompile.matcher(str);
                matcher3.getClass();
                fq4Var = !matcher3.matches() ? null : new fq4(matcher3, str);
                if (fq4Var == null) {
                    return new q83("socks");
                }
            }
        }
        XRayConfig.OutboundBean outboundBean2 = serverConfigA.getOutboundBean();
        if (outboundBean2 != null && (settings2 = outboundBean2.getSettings()) != null && (servers2 = settings2.getServers()) != null && (serversBean2 = (XRayConfig.OutboundBean.OutSettingsBean.ServersBean) servers2.get(0)) != null) {
            serversBean2.g(fm7.z0((String) fq4Var.a().get(3), "[", "]"));
            serversBean2.k(Integer.parseInt((String) fq4Var.a().get(4)));
            XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean = new XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean();
            socksUsersBean.d((String) fq4Var.a().get(1));
            socksUsersBean.c((String) fq4Var.a().get(2));
            serversBean2.l(i21.K(socksUsersBean));
        }
        if (serverConfigA.getRemarks().length() == 0) {
            XRayConfig.OutboundBean outboundBean3 = serverConfigA.getOutboundBean();
            if (outboundBean3 == null || (settings = outboundBean3.getSettings()) == null || (servers = settings.getServers()) == null || (serversBean = (XRayConfig.OutboundBean.OutSettingsBean.ServersBean) servers.get(0)) == null || (strA = serversBean.getAddress()) == null) {
                strA = x79.a(uri);
            }
            serverConfigA.m(strA);
        }
        ka2 ka2Var = new ka2(w27.m0(new hu(new kf3(1, 3, 1), (byte) 1), new zo6(uri, (byte) 6)));
        while (ka2Var.hasNext()) {
            String str2 = (String) ka2Var.next();
            try {
                a aVar = yw2.c;
                aVar.getClass();
                rj6Var = aVar.c(str2, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean.class));
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            if (rj6Var instanceof rj6) {
                rj6Var = null;
            }
            if (rj6Var != null) {
                obj = rj6Var;
                break;
            }
        }
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMaskBean = (XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean) obj;
        if (finalMaskBean != null && (outboundBean = serverConfigA.getOutboundBean()) != null && (streamSettings = outboundBean.getStreamSettings()) != null) {
            streamSettings.o(finalMaskBean);
        }
        String strH = i47.h(str);
        if (strH != null) {
            serverConfigA.l(serverConfigA.getMeta() != null ? new ServerConfig.Meta(strH) : new ServerConfig.Meta(strH));
        }
        return new j83(serverConfigA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i47
    public final String g(ServerConfig serverConfig) {
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        String strG;
        String str;
        List servers;
        XRayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean;
        List users;
        XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean;
        List servers2;
        XRayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean2;
        List users2;
        XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean2;
        XRayConfig.OutboundBean outboundBeanG = serverConfig.g();
        if (outboundBeanG == null || (streamSettings = outboundBeanG.getStreamSettings()) == null || (strG = outboundBeanG.g()) == null) {
            return "";
        }
        Integer numH = outboundBeanG.h();
        XRayConfig.OutboundBean.OutSettingsBean settings = outboundBeanG.getSettings();
        if (((settings == null || (servers2 = settings.getServers()) == null || (serversBean2 = (XRayConfig.OutboundBean.OutSettingsBean.ServersBean) servers2.get(0)) == null || (users2 = serversBean2.getUsers()) == null || (socksUsersBean2 = (XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean) users2.get(0)) == null) ? null : socksUsersBean2.getUser()) != null) {
            XRayConfig.OutboundBean.OutSettingsBean settings2 = outboundBeanG.getSettings();
            String user = (settings2 == null || (servers = settings2.getServers()) == null || (serversBean = (XRayConfig.OutboundBean.OutSettingsBean.ServersBean) servers.get(0)) == null || (users = serversBean.getUsers()) == null || (socksUsersBean = (XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean) users.get(0)) == null) ? null : socksUsersBean.getUser();
            str = user + ":" + outboundBeanG.d();
        } else {
            str = ":";
        }
        Uri.Builder builder = new Uri.Builder();
        EConfigType eConfigType = EConfigType.SOCKS;
        Uri.Builder builderEncodedAuthority = builder.scheme(eConfigType.getProtocolScheme()).encodedAuthority(str + "@" + strG + ":" + numH);
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask = streamSettings.getFinalMask();
        if (finalMask != null) {
            builderEncodedAuthority.appendQueryParameter("fm", yw2.c.h(finalMask));
        }
        ServerConfig.Meta meta = serverConfig.getMeta();
        String serverDescription = meta != null ? meta.getServerDescription() : null;
        String strConcat = serverDescription != null ? "?serverDescription=".concat(wl7.b0(0, serverDescription)) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        builderEncodedAuthority.fragment(serverConfig.getRemarks() + strConcat);
        String string = builderEncodedAuthority.build().toString();
        string.getClass();
        return mm7.W(string, eConfigType.getProtocolScheme() + "://", "", false);
    }
}
