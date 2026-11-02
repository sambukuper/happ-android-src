package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigNetworkType;
import su.happ.proxyutility.ui.ServerActivity;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.widget.CustomSpinner;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class b47 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ ServerActivity X;
    public final /* synthetic */ ServerConfig Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b47(ServerActivity serverActivity, ServerConfig serverConfig) {
        this.X = serverActivity;
        this.Y = serverConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context, java.lang.Object, su.happ.proxyutility.ui.ServerActivity] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int i2;
        int i3;
        Integer maxSendingWindow;
        Integer cwndMultiplier;
        XRayConfig.OutboundBean outboundBean;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        XRayConfig.OutboundBean outboundBeanG;
        List listL;
        String string;
        String strValueOf = null;
        ?? r8 = this.X;
        if (i < 0) {
            ConstraintLayout constraintLayout = r8.U1;
            if (constraintLayout != null) {
                y5 y5Var = r8.Q0;
                if (y5Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout = (LinearLayout) y5Var.Y;
                linearLayout.getClass();
                Resources resources = r8.getResources();
                resources.getClass();
                a38.b(constraintLayout, linearLayout, resources);
                return;
            }
            return;
        }
        y5 y5Var2 = r8.Q0;
        if (y5Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        LinearLayout linearLayout2 = (LinearLayout) y5Var2.Y;
        linearLayout2.getClass();
        linearLayout2.setForeground(null);
        String str = r8.D()[i];
        r8.V0 = str;
        String[] strArrJ = r8.J(str);
        ConstraintLayout constraintLayout2 = r8.W1;
        if (strArrJ != null) {
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            HappSettingsDivider happSettingsDivider = r8.Z1;
            if (happSettingsDivider != null) {
                happSettingsDivider.setVisibility(0);
            }
            CustomSpinner customSpinner = r8.X1;
            if (customSpinner != null) {
                r8.A(customSpinner, strArrJ, r8.W1, new t16((Object) r8, (byte) 17));
            }
        } else {
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
            HappSettingsDivider happSettingsDivider2 = r8.Z1;
            if (happSettingsDivider2 != null) {
                happSettingsDivider2.setVisibility(8);
            }
        }
        int length = strArrJ != null ? strArrJ.length : 0;
        CustomSpinner customSpinner2 = r8.X1;
        if (length <= 1) {
            if (customSpinner2 != null) {
                customSpinner2.setEnabled(false);
            }
            CustomSpinner customSpinner3 = r8.X1;
            if (customSpinner3 != null) {
                customSpinner3.setSelection(0);
            }
        } else if (customSpinner2 != null) {
            customSpinner2.setEnabled(true);
        }
        TextView textView = r8.Y1;
        if (textView != null) {
            String str2 = r8.V0;
            if (dh3.f(str2, EConfigNetworkType.GRPC.getType())) {
                string = r8.getString(y46.server_mode_type);
            } else {
                string = dh3.f(str2, EConfigNetworkType.XHTTP.getType()) ? r8.getString(y46.server_xhttp_mode) : r8.getString(y46.server_head_type);
            }
            textView.setText(string);
        }
        ServerConfig serverConfig = this.Y;
        if (serverConfig != null && (outboundBeanG = serverConfig.g()) != null && (listL = outboundBeanG.l()) != null) {
            Integer numL = strArrJ != null ? z91.L(listL.get(0), strArrJ) : null;
            CustomSpinner customSpinner4 = r8.X1;
            if (numL == null) {
                if (customSpinner4 != null) {
                    customSpinner4.setSelection(0);
                }
            } else if (customSpinner4 != null) {
                customSpinner4.setSelection(numL.intValue());
            }
            EditText editText = r8.c2;
            if (editText != null) {
                editText.setText(wl7.e0((String) listL.get(1)));
            }
            EditText editText2 = r8.g2;
            if (editText2 != null) {
                editText2.setText(wl7.e0((String) listL.get(2)));
            }
        }
        XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean kcpSettings = (serverConfig == null || (outboundBean = serverConfig.getOutboundBean()) == null || (streamSettings = outboundBean.getStreamSettings()) == null) ? null : streamSettings.getKcpSettings();
        HappInputField happInputField = r8.i2;
        if (happInputField != null) {
            String strValueOf2 = kcpSettings != null ? String.valueOf(kcpSettings.getMtu()) : null;
            if (strValueOf2 == null) {
                strValueOf2 = "";
            }
            happInputField.setText(strValueOf2);
        }
        HappInputField happInputField2 = r8.k2;
        if (happInputField2 != null) {
            String strValueOf3 = kcpSettings != null ? String.valueOf(kcpSettings.getTti()) : null;
            if (strValueOf3 == null) {
                strValueOf3 = "";
            }
            happInputField2.setText(strValueOf3);
        }
        HappInputField happInputField3 = r8.m2;
        if (happInputField3 != null) {
            String strValueOf4 = (kcpSettings == null || (cwndMultiplier = kcpSettings.getCwndMultiplier()) == null) ? null : String.valueOf(cwndMultiplier.intValue());
            if (strValueOf4 == null) {
                strValueOf4 = "";
            }
            happInputField3.setText(strValueOf4);
        }
        HappInputField happInputField4 = r8.o2;
        if (happInputField4 != null) {
            if (kcpSettings != null && (maxSendingWindow = kcpSettings.getMaxSendingWindow()) != null) {
                strValueOf = String.valueOf(maxSendingWindow.intValue());
            }
            happInputField4.setText(strValueOf != null ? strValueOf : "");
        }
        LinearLayout linearLayout3 = r8.Y2;
        if (linearLayout3 != null) {
            String str3 = r8.V0;
            linearLayout3.setVisibility((dh3.f(str3, EConfigNetworkType.SPLIT_HTTP.getType()) || dh3.f(str3, EConfigNetworkType.XHTTP.getType())) ? 0 : 8);
        }
        String str4 = r8.V0;
        EConfigNetworkType eConfigNetworkType = EConfigNetworkType.KCP;
        boolean zF = dh3.f(str4, eConfigNetworkType.getType());
        HappInputField happInputField5 = r8.i2;
        if (happInputField5 != null) {
            happInputField5.setVisibility(zF ? 0 : 8);
        }
        HappSettingsDivider happSettingsDivider3 = r8.j2;
        if (happSettingsDivider3 != null) {
            happSettingsDivider3.setVisibility(zF ? 0 : 8);
        }
        HappInputField happInputField6 = r8.k2;
        if (happInputField6 != null) {
            happInputField6.setVisibility(zF ? 0 : 8);
        }
        HappSettingsDivider happSettingsDivider4 = r8.l2;
        if (happSettingsDivider4 != null) {
            happSettingsDivider4.setVisibility(zF ? 0 : 8);
        }
        HappInputField happInputField7 = r8.m2;
        if (happInputField7 != null) {
            happInputField7.setVisibility(zF ? 0 : 8);
        }
        HappSettingsDivider happSettingsDivider5 = r8.n2;
        if (happSettingsDivider5 != null) {
            happSettingsDivider5.setVisibility(zF ? 0 : 8);
        }
        HappInputField happInputField8 = r8.o2;
        if (happInputField8 != null) {
            happInputField8.setVisibility(zF ? 0 : 8);
        }
        HappSettingsDivider happSettingsDivider6 = r8.p2;
        if (happSettingsDivider6 != null) {
            happSettingsDivider6.setVisibility(zF ? 0 : 8);
        }
        TextView textView2 = r8.b2;
        if (textView2 != null) {
            String str5 = r8.V0;
            if (dh3.f(str5, EConfigNetworkType.TCP.getType())) {
                i3 = y46.server_request_host_http;
            } else if (dh3.f(str5, EConfigNetworkType.WS.getType())) {
                i3 = y46.server_request_host_ws;
            } else if (dh3.f(str5, EConfigNetworkType.HTTP_UPGRADE.getType())) {
                i3 = y46.server_request_host_httpupgrade;
            } else if (dh3.f(str5, EConfigNetworkType.SPLIT_HTTP.getType()) || dh3.f(str5, EConfigNetworkType.XHTTP.getType())) {
                i3 = y46.server_request_host_xhttp;
            } else {
                i3 = dh3.f(str5, EConfigNetworkType.GRPC.getType()) ? y46.server_request_host_grpc : y46.server_request_host;
            }
            String string2 = r8.getString(i3);
            string2.getClass();
            textView2.setText(wl7.e0(string2));
        }
        TextView textView3 = r8.f2;
        if (textView3 != null) {
            String str6 = r8.V0;
            if (dh3.f(str6, eConfigNetworkType.getType())) {
                i2 = y46.server_path_kcp;
            } else if (dh3.f(str6, EConfigNetworkType.WS.getType())) {
                i2 = y46.server_path_ws;
            } else if (dh3.f(str6, EConfigNetworkType.HTTP_UPGRADE.getType())) {
                i2 = y46.server_path_httpupgrade;
            } else if (dh3.f(str6, EConfigNetworkType.SPLIT_HTTP.getType()) || dh3.f(str6, EConfigNetworkType.XHTTP.getType())) {
                i2 = y46.server_path_xhttp;
            } else {
                i2 = dh3.f(str6, EConfigNetworkType.GRPC.getType()) ? y46.server_path_grpc : y46.server_path;
            }
            String string3 = r8.getString(i2);
            string3.getClass();
            textView3.setText(wl7.e0(string3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        y5 y5Var = this.X.Q0;
        if (y5Var == null) {
            dh3.T("binding");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) y5Var.Y;
        linearLayout.getClass();
        linearLayout.setForeground(null);
    }
}
