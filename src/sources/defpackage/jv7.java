package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class jv7 extends nr4 {
    public final /* synthetic */ uv7 M;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jv7(uv7 uv7Var) {
        super((byte) 13);
        this.M = uv7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean Y(tv7 tv7Var, tv7 tv7Var2, gn2 gn2Var) {
        return !Arrays.equals((Object[]) gn2Var.B(tv7Var), (Object[]) gn2Var.B(tv7Var2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object y(Object obj, Object obj2) {
        tv7 tv7Var = (tv7) obj;
        tv7 tv7Var2 = (tv7) obj2;
        Bundle bundle = new Bundle();
        boolean z = tv7Var instanceof pv7;
        uv7 uv7Var = uv7.Y;
        uv7 uv7Var2 = this.M;
        if (z && (tv7Var2 instanceof pv7)) {
            pv7 pv7Var = (pv7) tv7Var;
            ServerCache serverCache = pv7Var.a;
            Boolean boolValueOf = Boolean.valueOf(serverCache.getIsSelected());
            pv7 pv7Var2 = (pv7) tv7Var2;
            ServerCache serverCache2 = pv7Var2.a;
            if (!boolValueOf.equals(Boolean.valueOf(serverCache2.getIsSelected()))) {
                bundle.putBoolean("selection_change", true);
            }
            if (!dh3.f(serverCache.getConfig().getRemarks(), serverCache2.getConfig().getRemarks())) {
                bundle.putBoolean("name_change", true);
            }
            ServerConfig.Meta meta = serverCache.getConfig().getMeta();
            String serverDescription = meta != null ? meta.getServerDescription() : null;
            ServerConfig.Meta meta2 = serverCache2.getConfig().getMeta();
            if (!dh3.f(serverDescription, meta2 != null ? meta2.getServerDescription() : null)) {
                bundle.putBoolean("description_change", true);
            }
            if (!new qg5(serverCache.getAffiliationInfo(), pv7Var.e).equals(new qg5(serverCache2.getAffiliationInfo(), pv7Var2.e))) {
                bundle.putBoolean("ping_change", true);
            }
            if (!Boolean.valueOf(pv7Var.f).equals(Boolean.valueOf(pv7Var2.f))) {
                bundle.putBoolean("checked_change", true);
            }
            if (uv7Var2 == uv7Var && !Boolean.valueOf(pv7Var.d).equals(Boolean.valueOf(pv7Var2.d))) {
                bundle.putBoolean("hide_settings", true);
            }
            if (!Boolean.valueOf(pv7Var.c).equals(Boolean.valueOf(pv7Var2.c))) {
                bundle.putBoolean("corners", true);
            }
        } else if ((tv7Var instanceof rv7) && (tv7Var2 instanceof rv7)) {
            if (Y(tv7Var, tv7Var2, new zx6((byte) 22))) {
                bundle.putBoolean("corners", true);
            }
            rv7 rv7Var = (rv7) tv7Var;
            ConfigGroupCache configGroupCache = rv7Var.b;
            Object[] objArr = {Boolean.valueOf(rv7Var.d)};
            rv7 rv7Var2 = (rv7) tv7Var2;
            ConfigGroupCache configGroupCache2 = rv7Var2.b;
            if (!Arrays.equals(objArr, new Object[]{Boolean.valueOf(rv7Var2.d)})) {
                bundle.putBoolean("collapse", true);
            }
            if (uv7Var2 == uv7Var && Y(tv7Var, tv7Var2, new zx6((byte) 23))) {
                bundle.putBoolean("action_menu", true);
            }
            SubscriptionItem subscriptionItem = configGroupCache.getSubscriptionItem();
            Object[] objArr2 = {subscriptionItem != null ? subscriptionItem.getRemarks() : null};
            SubscriptionItem subscriptionItem2 = configGroupCache2.getSubscriptionItem();
            if (!Arrays.equals(objArr2, new Object[]{subscriptionItem2 != null ? subscriptionItem2.getRemarks() : null})) {
                bundle.putBoolean("title", true);
            }
            if (uv7Var2 == uv7Var && Y(tv7Var, tv7Var2, new zx6((byte) 19))) {
                bundle.putBoolean("description", true);
            }
            if (uv7Var2 == uv7Var && !Arrays.equals(new Object[]{Boolean.valueOf(configGroupCache.getConfigs().isEmpty())}, new Object[]{Boolean.valueOf(configGroupCache2.getConfigs().isEmpty())})) {
                bundle.putBoolean("ping", true);
            }
            if (uv7Var2 == uv7Var && !Arrays.equals(new Object[]{Boolean.valueOf(configGroupCache.getIsPinned())}, new Object[]{Boolean.valueOf(configGroupCache2.getIsPinned())})) {
                bundle.putBoolean("pin", true);
            }
            if (!Arrays.equals(new Object[]{Boolean.valueOf(configGroupCache.getIsExpand())}, new Object[]{Boolean.valueOf(configGroupCache2.getIsExpand())})) {
                bundle.putBoolean("expand", true);
            }
            if (uv7Var2 == uv7.X && !Arrays.equals(new Object[]{Boolean.valueOf(rv7Var.c)}, new Object[]{Boolean.valueOf(rv7Var2.c)})) {
                bundle.putBoolean("check", true);
            }
            if (uv7Var2 == uv7Var && Y(tv7Var, tv7Var2, new zx6((byte) 20))) {
                bundle.putBoolean("extra", true);
            }
            SubscriptionItem subscriptionItem3 = configGroupCache.getSubscriptionItem();
            Object[] objArr3 = {subscriptionItem3 != null ? subscriptionItem3.getImport() : null};
            SubscriptionItem subscriptionItem4 = configGroupCache2.getSubscriptionItem();
            if (!Arrays.equals(objArr3, new Object[]{subscriptionItem4 != null ? subscriptionItem4.getImport() : null})) {
                bundle.putBoolean("import", true);
            }
            if (Y(tv7Var, tv7Var2, new zx6((byte) 21))) {
                bundle.putBoolean("meta_params", true);
                bundle.putBoolean("description", false);
            }
        } else if ((tv7Var instanceof ov7) && (tv7Var2 instanceof ov7)) {
            ov7 ov7Var = (ov7) tv7Var;
            ov7 ov7Var2 = (ov7) tv7Var2;
            if (!ov7Var.a.equals(ov7Var2.a)) {
                bundle.putBoolean("network_transport", true);
            }
            if (!Boolean.valueOf(ov7Var.b).equals(Boolean.valueOf(ov7Var2.b))) {
                bundle.putBoolean("corners", true);
            }
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
