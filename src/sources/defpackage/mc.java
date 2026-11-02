package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mc {
    public static final mc a = new mc();

    public final void a(View view, fq5 fq5Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = fq5Var instanceof sf ? PointerIcon.getSystemIcon(context, ((sf) fq5Var).b) : PointerIcon.getSystemIcon(context, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
        if (dh3.f(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
