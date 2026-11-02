package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dc0 {
    public ArrayList a = null;
    public int b = 0;

    public final void a() {
        this.b += XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append((ec0) it.next());
            sb.append(' ');
        }
        sb.append('[');
        return pc6.r(sb, this.b, ']');
    }
}
