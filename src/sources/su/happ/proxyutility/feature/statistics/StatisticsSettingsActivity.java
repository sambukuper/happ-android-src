package su.happ.proxyutility.feature.statistics;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.bd8;
import defpackage.e46;
import defpackage.j61;
import defpackage.k61;
import defpackage.ln7;
import defpackage.ni7;
import defpackage.oi7;
import defpackage.qi7;
import defpackage.r47;
import defpackage.si7;
import defpackage.t46;
import defpackage.u6;
import defpackage.x79;
import defpackage.y46;
import defpackage.zl7;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSettingsTitle;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/statistics/StatisticsSettingsActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class StatisticsSettingsActivity extends BaseActivity {
    public static final /* synthetic */ int W0 = 0;
    public u6 Q0;
    public final vz7 R0 = new vz7(new r47((byte) 8));
    public final vz7 S0 = new vz7(new hr5(this, (byte) 23));
    public final j61 T0 = new j61(this, (byte) 1);
    public qi7 U0;
    public long V0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(long j) {
        this.V0 = j;
        u6 u6Var = this.Q0;
        if (u6Var == null) {
            dh3.T("binding");
            throw null;
        }
        u6Var.o0.setText(zl7.a(j));
        qi7 qi7Var = this.U0;
        if (j <= 0) {
            if (qi7Var != null) {
                qi7Var.cancel();
            }
            this.U0 = null;
        } else if (qi7Var == null) {
            qi7 qi7Var2 = new qi7(this);
            this.U0 = qi7Var2;
            qi7Var2.start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B() {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        oi7 oi7Var = (oi7) ((yz4) this.R0.getValue()).d();
        if (oi7Var != null) {
            long j = oi7Var.a;
            Map map = oi7Var.c;
            long j2 = oi7Var.b;
            Map map2 = oi7Var.d;
            long jCurrentTimeMillis = System.currentTimeMillis() - j2;
            if (j2 == 0) {
                u6 u6Var = this.Q0;
                if (u6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                u6Var.t0.setText("");
            } else {
                Date date = new Date(jCurrentTimeMillis);
                u6 u6Var2 = this.Q0;
                if (u6Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                u6Var2.t0.setText(ue3.i0(6, date.getTime()));
            }
            A(j2);
            bd8 bd8Var = bd8.X;
            Map map3 = (Map) map.get(bd8Var);
            si7 si7Var = si7.X;
            if (map3 != null && (l6 = (Long) map3.get(si7Var)) != null) {
                long jLongValue = l6.longValue();
                Long lValueOf = Long.valueOf(j);
                if (j <= 0) {
                    lValueOf = null;
                }
                u6 u6Var3 = this.Q0;
                if (lValueOf != null) {
                    long jLongValue2 = lValueOf.longValue();
                    if (u6Var3 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    u6Var3.m0.setText(x79.f(jLongValue / jLongValue2));
                } else {
                    if (u6Var3 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    u6Var3.m0.setText(x79.f(0L));
                }
            }
            Map map4 = (Map) map.get(bd8Var);
            si7 si7Var2 = si7.Y;
            if (map4 != null && (l5 = (Long) map4.get(si7Var2)) != null) {
                long jLongValue3 = l5.longValue();
                Long lValueOf2 = Long.valueOf(j);
                if (j <= 0) {
                    lValueOf2 = null;
                }
                u6 u6Var4 = this.Q0;
                if (lValueOf2 != null) {
                    long jLongValue4 = lValueOf2.longValue();
                    if (u6Var4 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    u6Var4.n0.setText(x79.f(jLongValue3 / jLongValue4));
                } else {
                    if (u6Var4 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    u6Var4.n0.setText(x79.f(0L));
                }
            }
            Map map5 = (Map) map2.get(bd8Var);
            if (map5 != null && (l4 = (Long) map5.get(si7Var)) != null) {
                long jLongValue5 = l4.longValue();
                u6 u6Var5 = this.Q0;
                if (u6Var5 == null) {
                    dh3.T("binding");
                    throw null;
                }
                u6Var5.r0.setText(x79.g(jLongValue5));
            }
            Map map6 = (Map) map2.get(bd8Var);
            if (map6 != null && (l3 = (Long) map6.get(si7Var2)) != null) {
                long jLongValue6 = l3.longValue();
                u6 u6Var6 = this.Q0;
                if (u6Var6 == null) {
                    dh3.T("binding");
                    throw null;
                }
                u6Var6.s0.setText(x79.g(jLongValue6));
            }
            bd8 bd8Var2 = bd8.Y;
            Map map7 = (Map) map2.get(bd8Var2);
            if (map7 != null && (l2 = (Long) map7.get(si7Var)) != null) {
                long jLongValue7 = l2.longValue();
                u6 u6Var7 = this.Q0;
                if (u6Var7 == null) {
                    dh3.T("binding");
                    throw null;
                }
                u6Var7.p0.setText(x79.g(jLongValue7));
            }
            Map map8 = (Map) map2.get(bd8Var2);
            if (map8 == null || (l = (Long) map8.get(si7Var2)) == null) {
                return;
            }
            long jLongValue8 = l.longValue();
            u6 u6Var8 = this.Q0;
            if (u6Var8 != null) {
                u6Var8.q0.setText(x79.g(jLongValue8));
            } else {
                dh3.T("binding");
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: su.happ.proxyutility.feature.statistics.StatisticsSettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        ConstraintLayout constraintLayoutB;
        ConstraintLayout constraintLayoutB2;
        ConstraintLayout constraintLayoutB3;
        ConstraintLayout constraintLayoutB4;
        ConstraintLayout constraintLayoutB5;
        ConstraintLayout constraintLayoutB6;
        ConstraintLayout constraintLayoutB7;
        ConstraintLayout constraintLayoutB8;
        Toolbar toolbarB;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(t46.activity_statistics_settings, (ViewGroup) null, false);
        int i = e46.cl_bandwidth;
        if (((LinearLayout) ln7.b(viewInflate, i)) != null && (constraintLayoutB = ln7.b(viewInflate, (i = e46.cl_bandwidth_download))) != null && (constraintLayoutB2 = ln7.b(viewInflate, (i = e46.cl_bandwidth_upload))) != null && (constraintLayoutB3 = ln7.b(viewInflate, (i = e46.cl_connect_time))) != null) {
            i = e46.cl_direct_data_usage;
            if (((LinearLayout) ln7.b(viewInflate, i)) != null && (constraintLayoutB4 = ln7.b(viewInflate, (i = e46.cl_direct_data_usage_download))) != null && (constraintLayoutB5 = ln7.b(viewInflate, (i = e46.cl_direct_data_usage_upload))) != null) {
                i = e46.cl_main;
                if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                    i = e46.cl_proxy_data_usage;
                    if (((LinearLayout) ln7.b(viewInflate, i)) != null && (constraintLayoutB6 = ln7.b(viewInflate, (i = e46.cl_proxy_data_usage_download))) != null && (constraintLayoutB7 = ln7.b(viewInflate, (i = e46.cl_proxy_data_usage_upload))) != null && (constraintLayoutB8 = ln7.b(viewInflate, (i = e46.cl_start_time))) != null) {
                        i = e46.divider_bandwidth_download;
                        if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                            i = e46.divider_direct_data_usage_download;
                            if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                                i = e46.divider_proxy_data_usage_download;
                                if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                                    i = e46.divider_start_time;
                                    if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                                        i = e46.ll_server;
                                        if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                                            i = e46.title_bandwidth;
                                            if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                i = e46.title_direct_data_usage;
                                                if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                    i = e46.title_proxy_data_usage;
                                                    if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                        i = e46.title_server;
                                                        if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                                                            i = e46.tv_bandwidth_download;
                                                            HappTextView happTextView = (HappTextView) ln7.b(viewInflate, i);
                                                            if (happTextView != null) {
                                                                i = e46.tv_bandwidth_download_text;
                                                                if (((HappTextView) ln7.b(viewInflate, i)) != null) {
                                                                    i = e46.tv_bandwidth_upload;
                                                                    HappTextView happTextView2 = (HappTextView) ln7.b(viewInflate, i);
                                                                    if (happTextView2 != null) {
                                                                        i = e46.tv_bandwidth_upload_text;
                                                                        if (((HappTextView) ln7.b(viewInflate, i)) != null) {
                                                                            i = e46.tv_connect_time;
                                                                            HappTextView happTextView3 = (HappTextView) ln7.b(viewInflate, i);
                                                                            if (happTextView3 != null) {
                                                                                i = e46.tv_connect_time_text;
                                                                                if (((HappTextView) ln7.b(viewInflate, i)) != null) {
                                                                                    i = e46.tv_direct_data_usage_download;
                                                                                    HappTextView happTextView4 = (HappTextView) ln7.b(viewInflate, i);
                                                                                    if (happTextView4 != null) {
                                                                                        i = e46.tv_direct_data_usage_download_text;
                                                                                        if (((HappTextView) ln7.b(viewInflate, i)) != null) {
                                                                                            i = e46.tv_direct_data_usage_upload;
                                                                                            HappTextView happTextView5 = (HappTextView) ln7.b(viewInflate, i);
                                                                                            if (happTextView5 != null) {
                                                                                                i = e46.tv_direct_data_usage_upload_text;
                                                                                                if (((HappTextView) ln7.b(viewInflate, i)) != null) {
                                                                                                    i = e46.tv_proxy_data_usage_download;
                                                                                                    HappTextView happTextView6 = (HappTextView) ln7.b(viewInflate, i);
                                                                                                    if (happTextView6 != null) {
                                                                                                        i = e46.tv_proxy_data_usage_download_text;
                                                                                                        if (((HappTextView) ln7.b(viewInflate, i)) != null) {
                                                                                                            i = e46.tv_proxy_data_usage_upload;
                                                                                                            HappTextView happTextView7 = (HappTextView) ln7.b(viewInflate, i);
                                                                                                            if (happTextView7 != null) {
                                                                                                                i = e46.tv_proxy_data_usage_upload_text;
                                                                                                                if (((HappTextView) ln7.b(viewInflate, i)) != null) {
                                                                                                                    i = e46.tv_start_time;
                                                                                                                    HappTextView happTextView8 = (HappTextView) ln7.b(viewInflate, i);
                                                                                                                    if (happTextView8 != null) {
                                                                                                                        i = e46.tv_start_time_text;
                                                                                                                        if (((HappTextView) ln7.b(viewInflate, i)) != null) {
                                                                                                                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                                                                                            this.Q0 = new u6(linearLayout, constraintLayoutB, constraintLayoutB2, constraintLayoutB3, constraintLayoutB4, constraintLayoutB5, constraintLayoutB6, constraintLayoutB7, constraintLayoutB8, toolbarB, happTextView, happTextView2, happTextView3, happTextView4, happTextView5, happTextView6, happTextView7, happTextView8);
                                                                                                                            setContentView(linearLayout);
                                                                                                                            u6 u6Var = this.Q0;
                                                                                                                            if (u6Var == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            LinearLayout linearLayout2 = u6Var.X;
                                                                                                                            linearLayout2.getClass();
                                                                                                                            setBarsParams(linearLayout2);
                                                                                                                            u6 u6Var2 = this.Q0;
                                                                                                                            if (u6Var2 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            r(u6Var2.l0);
                                                                                                                            setTitle(getString(y46.title_statistics));
                                                                                                                            mb6.g((ni7) this.S0.getValue());
                                                                                                                            B();
                                                                                                                            HappApplication happApplication = HappApplication.M0;
                                                                                                                            k61 k61VarB = k32.i().b();
                                                                                                                            k61VarB.getClass();
                                                                                                                            j61 j61Var = this.T0;
                                                                                                                            j61Var.getClass();
                                                                                                                            ArrayList arrayList = k61VarB.b;
                                                                                                                            if (arrayList.contains(j61Var)) {
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            arrayList.add(j61Var);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onDestroy() {
        HappApplication happApplication = HappApplication.M0;
        k61 k61VarB = k32.i().b();
        k61VarB.getClass();
        j61 j61Var = this.T0;
        j61Var.getClass();
        k61VarB.b.remove(j61Var);
        super.onDestroy();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final Toolbar v() {
        u6 u6Var = this.Q0;
        if (u6Var != null) {
            return u6Var.l0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        u6 u6Var = this.Q0;
        if (u6Var != null) {
            return u6Var.k0.requestFocus();
        }
        dh3.T("binding");
        throw null;
    }
}
