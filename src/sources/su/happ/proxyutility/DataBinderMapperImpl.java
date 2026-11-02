package su.happ.proxyutility;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import androidx.appcompat.widget.AppCompatImageView;
import com.tistory.zladnrms.roundablelayout.RoundableLayout;
import defpackage.a6;
import defpackage.g6;
import defpackage.h6;
import defpackage.pi3;
import defpackage.ri3;
import defpackage.t46;
import defpackage.ti3;
import defpackage.w5;
import defpackage.x5;
import defpackage.x6;
import defpackage.xk2;
import defpackage.yl2;
import defpackage.zk2;
import java.util.ArrayList;
import java.util.List;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public class DataBinderMapperImpl extends w91 {
    public static final SparseIntArray a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray(11);
        a = sparseIntArray;
        sparseIntArray.put(t46.activity_excluded_routes, 1);
        sparseIntArray.put(t46.activity_inbound_auth, 2);
        sparseIntArray.put(t46.activity_report, 3);
        sparseIntArray.put(t46.activity_reset_settings, 4);
        sparseIntArray.put(t46.activity_vpn_settings, 5);
        sparseIntArray.put(t46.fragment_dialog_stories, 6);
        sparseIntArray.put(t46.fragment_dialog_subscription_sync, 7);
        sparseIntArray.put(t46.fragment_story_page, 8);
        sparseIntArray.put(t46.item_network_filter_warning, 9);
        sparseIntArray.put(t46.item_server_spacer, 10);
        sparseIntArray.put(t46.item_subscription_spacer, 11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final kw8 b(View view, int i) {
        int i2 = a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i2) {
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        if ("layout-television/activity_excluded_routes_0".equals(tag)) {
                            return new x5(view);
                        }
                        if ("layout/activity_excluded_routes_0".equals(tag)) {
                            return new w5(view);
                        }
                        bt.q(oi0.k(tag, "The tag for activity_excluded_routes is invalid. Received: "));
                        return null;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        if ("layout/activity_inbound_auth_0".equals(tag)) {
                            return new a6(view);
                        }
                        bt.q(oi0.k(tag, "The tag for activity_inbound_auth is invalid. Received: "));
                        return null;
                    case 3:
                        if ("layout/activity_report_0".equals(tag)) {
                            return new g6(view);
                        }
                        bt.q(oi0.k(tag, "The tag for activity_report is invalid. Received: "));
                        return null;
                    case 4:
                        if ("layout/activity_reset_settings_0".equals(tag)) {
                            return new h6(view);
                        }
                        bt.q(oi0.k(tag, "The tag for activity_reset_settings is invalid. Received: "));
                        return null;
                    case 5:
                        if ("layout/activity_vpn_settings_0".equals(tag)) {
                            return new x6(view);
                        }
                        bt.q(oi0.k(tag, "The tag for activity_vpn_settings is invalid. Received: "));
                        return null;
                    case 6:
                        if ("layout/fragment_dialog_stories_0".equals(tag)) {
                            return new xk2(view);
                        }
                        bt.q(oi0.k(tag, "The tag for fragment_dialog_stories is invalid. Received: "));
                        return null;
                    case 7:
                        if ("layout/fragment_dialog_subscription_sync_0".equals(tag)) {
                            return new zk2(view);
                        }
                        bt.q(oi0.k(tag, "The tag for fragment_dialog_subscription_sync is invalid. Received: "));
                        return null;
                    case 8:
                        if (!"layout/fragment_story_page_0".equals(tag)) {
                            bt.q(oi0.k(tag, "The tag for fragment_story_page is invalid. Received: "));
                            return null;
                        }
                        Object[] objArrE = kw8.e(view, 7, yl2.t0);
                        LinearLayout linearLayout = (LinearLayout) objArrE[3];
                        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrE[1];
                        RelativeLayout relativeLayout = (RelativeLayout) objArrE[0];
                        TextSwitcher textSwitcher = (TextSwitcher) objArrE[6];
                        TextSwitcher textSwitcher2 = (TextSwitcher) objArrE[4];
                        yl2 yl2Var = new yl2(view, linearLayout, appCompatImageView, relativeLayout, textSwitcher, textSwitcher2);
                        yl2Var.s0 = -1L;
                        yl2Var.o0.setTag(null);
                        view.setTag(m46.dataBinding, yl2Var);
                        synchronized (yl2Var) {
                            yl2Var.s0 = 1L;
                            break;
                        }
                        yl2Var.f();
                        return yl2Var;
                    case 9:
                        if (!"layout/item_network_filter_warning_0".equals(tag)) {
                            bt.q(oi0.k(tag, "The tag for item_network_filter_warning is invalid. Received: "));
                            return null;
                        }
                        Object[] objArrE2 = kw8.e(view, 6, pi3.q0);
                        pi3 pi3Var = new pi3(view, (HappTextView) objArrE2[4], (RoundableLayout) objArrE2[0]);
                        pi3Var.p0 = -1L;
                        pi3Var.n0.setTag(null);
                        view.setTag(m46.dataBinding, pi3Var);
                        synchronized (pi3Var) {
                            pi3Var.p0 = 1L;
                            break;
                        }
                        pi3Var.f();
                        return pi3Var;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        if (!"layout/item_server_spacer_0".equals(tag)) {
                            bt.q(oi0.k(tag, "The tag for item_server_spacer is invalid. Received: "));
                            return null;
                        }
                        Object[] objArrE3 = kw8.e(view, 1, (SparseIntArray) null);
                        ri3 ri3Var = new ri3(view, null);
                        ri3Var.m0 = -1L;
                        ((View) objArrE3[0]).setTag(null);
                        ri3Var.g(view);
                        synchronized (ri3Var) {
                            ri3Var.m0 = 1L;
                            break;
                        }
                        ri3Var.f();
                        return ri3Var;
                    case 11:
                        if (!"layout/item_subscription_spacer_0".equals(tag)) {
                            bt.q(oi0.k(tag, "The tag for item_subscription_spacer is invalid. Received: "));
                            return null;
                        }
                        Object[] objArrE4 = kw8.e(view, 1, (SparseIntArray) null);
                        ti3 ti3Var = new ti3(view, null);
                        ti3Var.m0 = -1L;
                        ((View) objArrE4[0]).setTag(null);
                        ti3Var.g(view);
                        synchronized (ti3Var) {
                            ti3Var.m0 = 1L;
                            break;
                        }
                        ti3Var.f();
                        return ti3Var;
                }
            }
            kp5.t("view must have a tag");
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final kw8 c(View[] viewArr, int i) {
        if (viewArr.length != 0 && a.get(i) > 0 && viewArr[0].getTag() == null) {
            kp5.t("view must have a tag");
        }
        return null;
    }
}
