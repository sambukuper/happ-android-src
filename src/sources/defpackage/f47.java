package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.l;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.tistory.zladnrms.roundablelayout.RoundableLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.dto.ServerAffiliationInfo;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigNetworkType;
import su.happ.proxyutility.dto.enums.EConfigSecurity;
import su.happ.proxyutility.dto.enums.EConfigType;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class f47 {
    public final uv7 a;
    public final iv7 b;
    public final iv7 c;
    public final vj4 d;
    public final rn2 e;
    public final sn2 f;
    public final dn2 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f47(uv7 uv7Var, iv7 iv7Var, iv7 iv7Var2, vj4 vj4Var, rn2 rn2Var, sn2 sn2Var, dn2 dn2Var) {
        uv7Var.getClass();
        this.a = uv7Var;
        this.b = iv7Var;
        this.c = iv7Var2;
        this.d = vj4Var;
        this.e = rn2Var;
        this.f = sn2Var;
        this.g = dn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[EDGE_INSN: B:19:0x0062->B:20:0x0063 BREAK  A[LOOP:0: B:14:0x004b->B:41:?]] */
    public static String h(ServerConfig serverConfig, Context context) {
        String upperCase;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        String security;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        String network;
        EConfigType configType = serverConfig.getConfigType();
        kc6 kc6Var = x79.a;
        configType.getClass();
        String str = context.getResources().getStringArray(m26.protocols)[configType.getValue() - 1];
        str.getClass();
        XRayConfig.OutboundBean outboundBean = serverConfig.getOutboundBean();
        String str2 = null;
        if (outboundBean != null && (streamSettings2 = outboundBean.getStreamSettings()) != null && (network = streamSettings2.getNetwork()) != null) {
            upperCase = network.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            l22 l22VarA = EConfigNetworkType.a();
            if (l22VarA != null && l22VarA.isEmpty()) {
                upperCase = null;
                break;
            }
            Iterator it = l22VarA.iterator();
            do {
                if (!it.hasNext()) {
                    upperCase = null;
                    break;
                }
            } while (!upperCase.equalsIgnoreCase(((EConfigNetworkType) it.next()).getType()));
        } else {
            upperCase = null;
            break;
        }
        XRayConfig.OutboundBean outboundBean2 = serverConfig.getOutboundBean();
        if (outboundBean2 != null && (streamSettings = outboundBean2.getStreamSettings()) != null && (security = streamSettings.getSecurity()) != null) {
            String upperCase2 = security.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            l22 l22VarA2 = EConfigSecurity.a();
            if (l22VarA2 == null || !l22VarA2.isEmpty()) {
                Iterator it2 = l22VarA2.iterator();
                while (it2.hasNext()) {
                    if (upperCase2.equalsIgnoreCase(((EConfigSecurity) it2.next()).getType())) {
                        str2 = upperCase2;
                        break;
                    }
                }
            }
        }
        return wv0.y0(eu.q0(new String[]{str, upperCase, str2}), " / ", (String) null, (String) null, (gn2) null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(yv7 yv7Var, int i) {
        pv7 pv7Var = (pv7) this.b.B(Integer.valueOf(i));
        c6 c6Var = yv7Var.u;
        RelativeLayout relativeLayout = (RelativeLayout) c6Var.n0;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                relativeLayout.setVisibility(8);
                return;
            } else {
                b61.c();
                return;
            }
        }
        sn2 sn2Var = this.f;
        if (sn2Var == null) {
            relativeLayout.setVisibility(8);
            return;
        }
        relativeLayout.setVisibility(0);
        ((MaterialCheckBox) c6Var.o0).setChecked(pv7Var.f);
        relativeLayout.setOnClickListener(new go1(sn2Var, pv7Var, (byte) 7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(yv7 yv7Var, int i) {
        float f = ((Boolean) this.c.B(Integer.valueOf(i))).booleanValue() ? 16.0f : 0.0f;
        c6 c6Var = yv7Var.u;
        float fApplyDimension = TypedValue.applyDimension(1, f, ((RoundableLayout) c6Var.i0).getResources().getDisplayMetrics());
        ((RoundableLayout) c6Var.l0).setCornerLeftBottom(fApplyDimension);
        ((RoundableLayout) c6Var.l0).setCornerRightBottom(fApplyDimension);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:65:0x011c A[EDGE_INSN: B:65:0x011c->B:66:0x011d BREAK  A[LOOP:1: B:60:0x0105->B:93:?]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0156 A[EDGE_INSN: B:80:0x0156->B:81:0x0157 BREAK  A[LOOP:2: B:75:0x013f->B:96:?]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0177  */
    public final void c(yv7 yv7Var, int i) {
        String strH;
        Object next;
        String upperCase;
        String upperCase2;
        String upperCase3;
        String security;
        String network;
        ArrayList outbounds;
        XRayConfig.OutboundBean outboundBean;
        String protocol;
        ArrayList outbounds2;
        XRayConfig.OutboundBean outboundBean2;
        String lowerCase;
        ArrayList outbounds3;
        XRayConfig.OutboundBean outboundBean3;
        pv7 pv7Var = (pv7) this.b.B(Integer.valueOf(i));
        ServerConfig config = pv7Var.a.getConfig();
        c6 c6Var = yv7Var.u;
        View view = ((l) yv7Var).a;
        AppCompatTextView appCompatTextView = (HappTextView) c6Var.Z;
        ServerConfig.Meta meta = config.getMeta();
        if ((meta != null ? meta.getServerDescription() : null) != null && pv7Var.g) {
            ServerConfig.Meta meta2 = config.getMeta();
            if (meta2 != null) {
                strH = meta2.getServerDescription();
            } else {
                strH = null;
            }
        } else if (e47.a[config.getConfigType().ordinal()] == 1) {
            XRayConfig fullConfig = config.getFullConfig();
            String protocol2 = (fullConfig == null || (outbounds3 = fullConfig.getOutbounds()) == null || (outboundBean3 = (XRayConfig.OutboundBean) outbounds3.get(0)) == null) ? null : outboundBean3.getProtocol();
            if (protocol2 == null) {
                Context context = view.getContext();
                context.getClass();
                strH = h(config, context);
            } else {
                Iterator it = EConfigType.a().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        lowerCase = ((EConfigType) next).name().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    }
                } while (!lowerCase.equals(protocol2));
                if (((EConfigType) next) != null) {
                    Context context2 = view.getContext();
                    XRayConfig fullConfig2 = config.getFullConfig();
                    XRayConfig.OutboundBean.StreamSettingsBean streamSettings = (fullConfig2 == null || (outbounds2 = fullConfig2.getOutbounds()) == null || (outboundBean2 = (XRayConfig.OutboundBean) wv0.t0(outbounds2)) == null) ? null : outboundBean2.getStreamSettings();
                    XRayConfig fullConfig3 = config.getFullConfig();
                    if (fullConfig3 == null || (outbounds = fullConfig3.getOutbounds()) == null || (outboundBean = (XRayConfig.OutboundBean) wv0.t0(outbounds)) == null || (protocol = outboundBean.getProtocol()) == null) {
                        upperCase = null;
                    } else {
                        upperCase = protocol.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    if (streamSettings != null && (network = streamSettings.getNetwork()) != null) {
                        upperCase2 = network.toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                        l22 l22VarA = EConfigNetworkType.a();
                        if (l22VarA != null && l22VarA.isEmpty()) {
                            upperCase2 = null;
                            break;
                        }
                        Iterator it2 = l22VarA.iterator();
                        do {
                            if (!it2.hasNext()) {
                                upperCase2 = null;
                                break;
                            }
                        } while (!upperCase2.equalsIgnoreCase(((EConfigNetworkType) it2.next()).getType()));
                    } else {
                        upperCase2 = null;
                        break;
                    }
                    if (streamSettings != null && (security = streamSettings.getSecurity()) != null) {
                        upperCase3 = security.toUpperCase(Locale.ROOT);
                        upperCase3.getClass();
                        l22 l22VarA2 = EConfigSecurity.a();
                        if (l22VarA2 != null && l22VarA2.isEmpty()) {
                            upperCase3 = null;
                            break;
                        }
                        Iterator it3 = l22VarA2.iterator();
                        do {
                            if (!it3.hasNext()) {
                                upperCase3 = null;
                                break;
                            }
                        } while (!upperCase3.equalsIgnoreCase(((EConfigSecurity) it3.next()).getType()));
                    } else {
                        upperCase3 = null;
                        break;
                    }
                    strH = pc6.p(wv0.y0(eu.q0(new String[]{upperCase, upperCase2, upperCase3}), " / ", (String) null, (String) null, (gn2) null, 62), " ", context2.getString(y46.json_server_postfix_protocol));
                } else {
                    strH = null;
                }
            }
        } else {
            Context context3 = view.getContext();
            context3.getClass();
            strH = h(config, context3);
        }
        appCompatTextView.setText(strH != null ? fm7.R0(strH).toString() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(yv7 yv7Var, int i) {
        pv7 pv7Var = (pv7) this.b.B(Integer.valueOf(i));
        boolean z = pv7Var.d;
        c6 c6Var = yv7Var.u;
        if (z) {
            RelativeLayout relativeLayout = (RelativeLayout) c6Var.f0;
            relativeLayout.setVisibility(8);
            relativeLayout.setOnClickListener(null);
        } else {
            ((FrameLayout) c6Var.k0).setOnClickListener(new d47(yv7Var, (byte) 1));
            RelativeLayout relativeLayout2 = (RelativeLayout) c6Var.f0;
            relativeLayout2.setVisibility(0);
            relativeLayout2.setOnClickListener(new go1(pv7Var, this, (byte) 8));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(yv7 yv7Var, int i) {
        ServerCache serverCache = ((pv7) this.b.B(Integer.valueOf(i))).a;
        HappApplication happApplication = HappApplication.M0;
        qg5 qg5VarA = ((q72) k32.i().F0.getValue()).a(serverCache.getConfig().getRemarks());
        String str = (String) qg5VarA.X;
        int iIntValue = ((Number) qg5VarA.Y).intValue();
        c6 c6Var = yv7Var.u;
        ((HappTextView) c6Var.g0).setText(fm7.R0(str).toString());
        ((AppCompatImageView) c6Var.m0).setImageResource(iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(yv7 yv7Var, int i) {
        Integer numValueOf = Integer.valueOf(i);
        iv7 iv7Var = this.b;
        pv7 pv7Var = (pv7) iv7Var.B(numValueOf);
        ServerAffiliationInfo affiliationInfo = ((pv7) iv7Var.B(Integer.valueOf(i))).a.getAffiliationInfo();
        c6 c6Var = yv7Var.u;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) c6Var.r0;
        circularProgressIndicator.setIndeterminate(true);
        ServerCache serverCache = pv7Var.a;
        vn5 vn5Var = pv7Var.e;
        ServerAffiliationInfo affiliationInfo2 = serverCache.getAffiliationInfo();
        circularProgressIndicator.setVisibility((affiliationInfo2 == null || !affiliationInfo2.getIsLoading()) ? 8 : 0);
        Long testDelayMillis = affiliationInfo != null ? affiliationInfo.getTestDelayMillis() : null;
        if (affiliationInfo == null || testDelayMillis == null) {
            ((HappTextView) c6Var.h0).setVisibility(8);
            ((AppCompatImageView) c6Var.q0).setVisibility(8);
            return;
        }
        if (testDelayMillis.longValue() < 0) {
            int iOrdinal = vn5Var.ordinal();
            if (iOrdinal == 0) {
                AppCompatTextView appCompatTextView = (HappTextView) c6Var.h0;
                appCompatTextView.setVisibility(0);
                appCompatTextView.setText(appCompatTextView.getContext().getString(y46.ping_fail_value));
                ((AppCompatImageView) c6Var.q0).setVisibility(8);
                return;
            }
            if (iOrdinal != 1) {
                b61.c();
                return;
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) c6Var.q0;
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageResource(q36.ic_ping_failure);
            ((HappTextView) c6Var.h0).setVisibility(8);
            return;
        }
        if (testDelayMillis.longValue() >= 0) {
            int iOrdinal2 = vn5Var.ordinal();
            if (iOrdinal2 == 0) {
                AppCompatTextView appCompatTextView2 = (HappTextView) c6Var.h0;
                appCompatTextView2.setVisibility(0);
                appCompatTextView2.setText(appCompatTextView2.getContext().getString(y46.ping_success_value, testDelayMillis));
                ((AppCompatImageView) c6Var.q0).setVisibility(8);
                return;
            }
            if (iOrdinal2 != 1) {
                b61.c();
                return;
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) c6Var.q0;
            appCompatImageView2.setVisibility(0);
            appCompatImageView2.setImageResource(q36.ic_ping_success);
            ((HappTextView) c6Var.h0).setVisibility(8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(yv7 yv7Var, int i) {
        boolean isSelected = ((pv7) this.b.B(Integer.valueOf(i))).a.getIsSelected();
        c6 c6Var = yv7Var.u;
        if (isSelected) {
            ((RelativeLayout) c6Var.p0).setBackgroundResource(q36.bg_server_config_selected);
            ((View) c6Var.Y).setVisibility(0);
        } else {
            ((RelativeLayout) c6Var.p0).setBackgroundResource(q36.bg_server_config);
            ((View) c6Var.Y).setVisibility(4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(yv7 yv7Var, int i) {
        GuId guId;
        String guid = ((pv7) this.b.B(Integer.valueOf(i))).a.getGuid();
        String strB = null;
        dn2 dn2Var = this.g;
        if (dn2Var != null && (guId = (GuId) dn2Var.invoke()) != null) {
            strB = guId.b();
        }
        if (strB == null ? false : strB.equals(guid)) {
            ((ConstraintLayout) yv7Var.u.j0).requestFocus();
        }
    }
}
