package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class dq7 implements View.OnClickListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ kq7 Y;
    public final /* synthetic */ rv7 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ dq7(kq7 kq7Var, rv7 rv7Var, byte b) {
        this.X = b;
        this.Y = kq7Var;
        this.Z = rv7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.X;
        rv7 rv7Var = this.Z;
        kq7 kq7Var = this.Y;
        switch (b) {
            case 0:
                vj4 vj4Var = kq7Var.d;
                if (vj4Var != null) {
                    ConfigGroupCache configGroupCache = rv7Var.b;
                    String subId = configGroupCache.getSubId();
                    boolean z = configGroupCache.getSubscriptionItem() != null;
                    SubscriptionItem subscriptionItem = configGroupCache.getSubscriptionItem();
                    boolean zF = subscriptionItem != null ? dh3.f(subscriptionItem.getImport(), Boolean.FALSE) : false;
                    boolean zIsEmpty = configGroupCache.getConfigs().isEmpty();
                    subId.getClass();
                    MainActivity mainActivity = vj4Var.a;
                    in1 in1Var = new in1();
                    Bundle bundle = new Bundle();
                    bundle.putString("sub_id", subId);
                    bundle.putBoolean("is_sub_config_group", z);
                    bundle.putBoolean("is_empty_config_group", zIsEmpty);
                    bundle.putBoolean("is_restricted_access", zF);
                    in1Var.Q(bundle);
                    in1Var.X(mainActivity.n(), "DialogConfigGroupActionsFragment");
                    return;
                }
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                vj4 vj4Var2 = kq7Var.d;
                if (vj4Var2 != null) {
                    MainActivity mainActivity2 = vj4Var2.a;
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 720.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                    rotateAnimation.setDuration(3000L);
                    rotateAnimation.setRepeatCount(0);
                    b6 b6Var = mainActivity2.Q0;
                    if (b6Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var.j0.startAnimation(rotateAnimation);
                }
                gv7 gv7Var = kq7Var.c;
                if (gv7Var != null) {
                    ((MainActivity) gv7Var).X(rv7Var.b.getSubId());
                    return;
                }
                return;
            default:
                kq7Var.h.B(new SubId(rv7Var.b.getSubId()));
                return;
        }
    }
}
