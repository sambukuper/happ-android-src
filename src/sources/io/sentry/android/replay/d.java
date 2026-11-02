package io.sentry.android.replay;

import defpackage.dh3;
import defpackage.fm7;
import defpackage.g44;
import defpackage.kc6;
import defpackage.mm7;
import defpackage.w74;
import defpackage.x97;
import io.sentry.c2;
import io.sentry.c4;
import io.sentry.s5;
import io.sentry.s6;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c4 {
    public static final g44 c = x97.P(w74.Y, a.Z);
    public static final HashSet d;
    public String a;
    public final Map b = Collections.synchronizedMap(new b());

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        d = hashSet;
    }

    public d(s6 s6Var) {
        s6Var.setBeforeBreadcrumb(new io.sentry.d(this, s6Var.getBeforeBreadcrumb()));
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01b7  */
    @Override // io.sentry.c4
    public final io.sentry.rrweb.b a(io.sentry.g gVar) {
        String str;
        s5 s5Var;
        Object obj;
        String strK0;
        double dLongValue;
        double dLongValue2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (dh3.f(gVar.i0, "http")) {
            Object obj2 = gVar.b().get("url");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null || str2.length() == 0) {
                return null;
            }
            Map mapB = gVar.b();
            mapB.getClass();
            if (!mapB.containsKey("http.start_timestamp")) {
                return null;
            }
            Map mapB2 = gVar.b();
            mapB2.getClass();
            if (!mapB2.containsKey("http.end_timestamp")) {
                return null;
            }
            Object obj3 = gVar.b().get("http.start_timestamp");
            Object obj4 = gVar.b().get("http.end_timestamp");
            io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
            lVar.Y = gVar.c().getTime();
            lVar.f0 = "resource.http";
            Object obj5 = gVar.b().get("url");
            obj5.getClass();
            lVar.g0 = (String) obj5;
            if (obj3 instanceof Double) {
                dLongValue = ((Number) obj3).doubleValue();
            } else {
                obj3.getClass();
                dLongValue = ((Long) obj3).longValue();
            }
            lVar.h0 = dLongValue / 1000.0d;
            if (obj4 instanceof Double) {
                dLongValue2 = ((Number) obj4).doubleValue();
            } else {
                obj4.getClass();
                dLongValue2 = ((Long) obj4).longValue();
            }
            lVar.i0 = dLongValue2 / 1000.0d;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (this.b.remove(gVar) != null) {
                c2.m();
                return null;
            }
            Map mapB3 = gVar.b();
            mapB3.getClass();
            for (Map.Entry entry : mapB3.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (d.contains(str3)) {
                    str3.getClass();
                    linkedHashMap2.put(((kc6) c.getValue()).e(fm7.J0(mm7.W(str3, "content_length", "body_size", false), "."), c.Z), value);
                }
            }
            lVar.j0 = new ConcurrentHashMap(linkedHashMap2);
            return lVar;
        }
        String str4 = "navigation";
        if (dh3.f(gVar.g0, "navigation") && dh3.f(gVar.i0, "app.lifecycle")) {
            str4 = "app." + gVar.b().get("state");
        } else if (dh3.f(gVar.g0, "navigation") && dh3.f(gVar.i0, "device.orientation")) {
            str4 = gVar.i0;
            str4.getClass();
            Object obj6 = gVar.b().get("position");
            if (!dh3.f(obj6, "landscape") && !dh3.f(obj6, "portrait")) {
                return null;
            }
            linkedHashMap.put("position", obj6);
        } else {
            if (!dh3.f(gVar.g0, "navigation")) {
                if (dh3.f(gVar.i0, "ui.click")) {
                    Object obj7 = gVar.b().get("view.id");
                    if (obj7 == null && (obj7 = gVar.b().get("view.tag")) == null) {
                        obj7 = gVar.b().get("view.class");
                    }
                    str = obj7 instanceof String ? (String) obj7 : null;
                    if (str == null) {
                        return null;
                    }
                    Map mapB4 = gVar.b();
                    mapB4.getClass();
                    linkedHashMap.putAll(mapB4);
                    str4 = "ui.tap";
                    s5Var = null;
                } else if (dh3.f(gVar.g0, "system") && dh3.f(gVar.i0, "network.event")) {
                    if (dh3.f(gVar.b().get("action"), "NETWORK_LOST")) {
                        obj = "offline";
                    } else {
                        Map mapB5 = gVar.b();
                        mapB5.getClass();
                        if (!mapB5.containsKey("network_type")) {
                            return null;
                        }
                        Object obj8 = gVar.b().get("network_type");
                        String str5 = obj8 instanceof String ? (String) obj8 : null;
                        if (str5 == null || str5.length() == 0) {
                            return null;
                        }
                        obj = gVar.b().get("network_type");
                    }
                    linkedHashMap.put("state", obj);
                    if (dh3.f(this.a, linkedHashMap.get("state"))) {
                        return null;
                    }
                    Object obj9 = linkedHashMap.get("state");
                    this.a = obj9 instanceof String ? (String) obj9 : null;
                    str4 = "device.connectivity";
                } else if (dh3.f(gVar.b().get("action"), "BATTERY_CHANGED")) {
                    Map mapB6 = gVar.b();
                    mapB6.getClass();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry2 : mapB6.entrySet()) {
                        String str6 = (String) entry2.getKey();
                        if (dh3.f(str6, "level") || dh3.f(str6, "charging")) {
                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap3);
                    str4 = "device.battery";
                } else {
                    str4 = gVar.i0;
                    str = gVar.f0;
                    s5Var = gVar.k0;
                    Map mapB7 = gVar.b();
                    mapB7.getClass();
                    linkedHashMap.putAll(mapB7);
                }
                if (str4 == null && str4.length() != 0) {
                    io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                    aVar.Y = gVar.c().getTime();
                    aVar.f0 = gVar.c().getTime() / 1000.0d;
                    aVar.g0 = "default";
                    aVar.h0 = str4;
                    aVar.i0 = str;
                    aVar.j0 = s5Var;
                    aVar.k0 = new ConcurrentHashMap(linkedHashMap);
                    return aVar;
                }
            }
            if (dh3.f(gVar.b().get("state"), "resumed")) {
                Object obj10 = gVar.b().get("screen");
                String str7 = obj10 instanceof String ? (String) obj10 : null;
                if (str7 != null) {
                    strK0 = fm7.K0('.', str7, str7);
                } else {
                    strK0 = null;
                }
            } else {
                Map mapB8 = gVar.b();
                mapB8.getClass();
                if (mapB8.containsKey("to")) {
                    Object obj11 = gVar.b().get("to");
                    if (obj11 instanceof String) {
                        strK0 = (String) obj11;
                    } else {
                        strK0 = null;
                    }
                } else {
                    strK0 = null;
                }
            }
            if (strK0 == null) {
                return null;
            }
            linkedHashMap.put("to", strK0);
        }
        str = null;
        s5Var = null;
        return str4 == null ? null : null;
    }
}
