package defpackage;

import java.util.ArrayList;
import java.util.Map;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class oz2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MetaParams a(Map map) {
        map.getClass();
        MetaParams.Companion companion = MetaParams.INSTANCE;
        ArrayList arrayListQ0 = eu.q0(new qg5[]{b(MetaParams.PROFILE_TITLE, map), b(MetaParams.PROFILE_UPDATE_INTERVAL, map), b(MetaParams.SUBSCRIPTION_USER_INFO, map), b(MetaParams.PROFILE_WEB_PAGE_URL, map), b(MetaParams.FRAGMENT, map), b(MetaParams.RESOLVE_ADDRESS, map), b(MetaParams.HOST, map), b(MetaParams.INSECURE, map), b(MetaParams.ANNOUNCE, map), b(MetaParams.SUPPPORT_URL, map), b(MetaParams.ROUTING, map), b(MetaParams.NEW_URL, map), b(MetaParams.NEW_DOMAIN, map), b(MetaParams.PROVIDER_ID, map), b(MetaParams.INSTALL_ID, map), b(MetaParams.SUBSCRIPTION_AUTOCONNECT, map), b(MetaParams.SUBSCRIPTION_PING_ONOPEN_ENABLED, map), b(MetaParams.SUBSCRIPTION_AUTOCONNECT_TYPE, map), b(MetaParams.ROUTING_ENABLE, map), b(MetaParams.FRAGMENTATION_ENABLE, map), b(MetaParams.FRAGMENTATION_PACKETS, map), b(MetaParams.FRAGMENTATION_LENGTH, map), b(MetaParams.FRAGMENTATION_DELAY, map), b(MetaParams.FRAGMENTATION_INTERVAL, map), b(MetaParams.FRAGMENTATION_TYPE, map), b(MetaParams.FRAGMENTATION_ADVANCED_PARAM, map), b(MetaParams.FRAGMENTATION_MAX_SPLIT, map), b(MetaParams.NOISES_ENABLE, map), b(MetaParams.NOISES_PACKET_TYPE, map), b(MetaParams.NOISES_PACKET, map), b(MetaParams.NOISES_DELAY, map), b(MetaParams.NOISES_RAND, map), b(MetaParams.NOISES_RAND_RANGE, map), b(MetaParams.LOCAL_DNS_ENABLE, map), b(MetaParams.SUBSCRIPTION_AUTO_UPDATE_OPEN_ENABLE, map), b(MetaParams.SUBSCRIPTION_SEND_HWID_ENABLED, map), b(MetaParams.SUBSCRIPTION_ALWAYS_HWID_ENABLE, map), b(MetaParams.SUBSCRIPTION_HWID_IN_COOKIE_ENABLE, map), b(MetaParams.NOTIFICATION_SUBS_EXPIRE, map), b(MetaParams.PING_TYPE, map), b(MetaParams.HIDE_SETTINGS, map), b(MetaParams.CHANGE_USER_AGENT, map), b(MetaParams.CHECK_URL_VIA_PROXY, map), b(MetaParams.APP_AUTO_START, map), b(MetaParams.RESOLVE_SERVER_ADDRESS_ENABLE, map), b(MetaParams.RESOLVE_SERVER_ADDRESS_DNS_IP, map), b(MetaParams.RESOLVE_SERVER_ADDRESS_DNS_DOMAIN, map), b(MetaParams.PER_APP_PROXY_MODE, map), b(MetaParams.PER_APP_PROXY_LIST, map), b(MetaParams.PER_APP_PROXY_LIST_SET, map), b(MetaParams.PER_APP_PROXY_LIST_INVERT, map), b(MetaParams.MUX_ENABLE, map), b(MetaParams.MUX_TCP_CONNECTIONS, map), b(MetaParams.MUX_XUDP_CONNECTIONS, map), b(MetaParams.MUX_QUIC, map), b(MetaParams.SNIFFING_ENABLE, map), b(MetaParams.PREFERRED_IP_TYPE, map), b(MetaParams.SUBSCRIPTIONS_COLLAPSE, map), b(MetaParams.PING_RESULT, map), b(MetaParams.EXCLUDE_ROUTES, map), b(MetaParams.EXCLUDE_ROUTES_SET, map), b(MetaParams.SUB_INFO_COLOR, map), b(MetaParams.SUB_INFO_TEXT, map), b(MetaParams.SUB_INFO_BUTTON_TEXT, map), b(MetaParams.SUB_INFO_BUTTON_LINK, map), b(MetaParams.SUB_EXPIRE, map), b(MetaParams.SUB_EXPIRE_BUTTON_LINK, map), b(MetaParams.SUBSCRIPTIONS_EXPAND_NOW, map), b(MetaParams.SUBSCRIPTION_PIN, map), b(MetaParams.DONT_USE_FILTER, map), b(MetaParams.MANUAL_BLOCK_USER_AGENT, map), b(MetaParams.SUBSCRIPTIONS_SORT_TYPE, map), b(MetaParams.SUBSCRIPTION_SORT_TYPE, map), b(MetaParams.DNS_FROM_JSON_ENABLE, map), b(MetaParams.SOCKS_AUTH_MODE, map), b(MetaParams.SOCKS_AUTH_USER, map), b(MetaParams.SOCKS_AUTH_PASSWORD, map), b(MetaParams.INBOUND_HTTP_ENABLE, map), b(MetaParams.HTTP_AUTH_MODE, map), b(MetaParams.HTTP_AUTH_USER, map), b(MetaParams.HTTP_AUTH_PASSWORD, map), b(MetaParams.USER_AGENT_GEO_FILES, map), b(MetaParams.SUBSCRIPTION_REQUEST_TIMEOUT, map), b(MetaParams.XRAY_TUN_ENABLE, map), b(MetaParams.XRAY_TUN_MTU, map), b(MetaParams.BLOCK_BIND_TO_TUNNEL_ENABLE, map), b(MetaParams.PROXY_PING_MODE, map), b(MetaParams.PROXY_PING_TIMEOUT, map), b(MetaParams.USE_OKHTTP_LEGACY, map), b(MetaParams.FALLBACK_URL, map)});
        companion.getClass();
        return MetaParams.Companion.a(arrayListQ0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final qg5 b(String str, Map map) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return new qg5(str, str2);
        }
        return null;
    }
}
