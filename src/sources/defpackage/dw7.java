package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.l;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.tistory.zladnrms.roundablelayout.RoundableLayout;
import java.util.List;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class dw7 extends eb4 {
    public final uv7 d;
    public final mh7 e;
    public final rn2 f;
    public final rn2 g;
    public final sn2 h;
    public final dn2 i;
    public final gn2 j;
    public final rn2 k;
    public vj4 l;
    public MainActivity m;
    public ck4 n;
    public final vz7 o;
    public final vz7 p;
    public final vz7 q;
    public final vz7 r;
    public final vz7 s;
    public final vz7 t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public dw7(mh7 mh7Var, yn1 yn1Var, yn1 yn1Var2, vb vbVar, uj4 uj4Var, gn2 gn2Var, sb sbVar, int i) {
        uv7 uv7Var = (i & 1) != 0 ? uv7.Y : uv7.X;
        mh7Var = (i & 2) != 0 ? null : mh7Var;
        yn1Var = (i & 4) != 0 ? null : yn1Var;
        yn1Var2 = (i & 8) != 0 ? null : yn1Var2;
        vbVar = (i & 16) != 0 ? null : vbVar;
        uj4Var = (i & 32) != 0 ? null : uj4Var;
        sbVar = (i & 128) != 0 ? null : sbVar;
        super(new jv7(uv7Var));
        this.d = uv7Var;
        this.e = mh7Var;
        this.f = yn1Var;
        this.g = yn1Var2;
        this.h = vbVar;
        this.i = uj4Var;
        this.j = gn2Var;
        this.k = sbVar;
        final byte b = 0;
        this.o = new vz7(new dn2(this) { // from class: hv7
            public final /* synthetic */ dw7 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b2 = b;
                dw7 dw7Var = this.Y;
                switch (b2) {
                    case 0:
                        return new kq7(dw7Var.d, new iv7(dw7Var, (byte) 0), dw7Var.m, dw7Var.l, dw7Var.e, dw7Var.g, dw7Var.h, dw7Var.j, dw7Var.k);
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        return new f47(dw7Var.d, new iv7(dw7Var, (byte) 1), new iv7(dw7Var, (byte) 2), dw7Var.l, dw7Var.f, dw7Var.h, dw7Var.i);
                    default:
                        return new p35(new iv7(dw7Var, (byte) 3));
                }
            }
        });
        final byte b2 = 1;
        this.p = new vz7(new dn2(this) { // from class: hv7
            public final /* synthetic */ dw7 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b3 = b2;
                dw7 dw7Var = this.Y;
                switch (b3) {
                    case 0:
                        return new kq7(dw7Var.d, new iv7(dw7Var, (byte) 0), dw7Var.m, dw7Var.l, dw7Var.e, dw7Var.g, dw7Var.h, dw7Var.j, dw7Var.k);
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        return new f47(dw7Var.d, new iv7(dw7Var, (byte) 1), new iv7(dw7Var, (byte) 2), dw7Var.l, dw7Var.f, dw7Var.h, dw7Var.i);
                    default:
                        return new p35(new iv7(dw7Var, (byte) 3));
                }
            }
        });
        final byte b3 = 2;
        this.q = new vz7(new dn2(this) { // from class: hv7
            public final /* synthetic */ dw7 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b4 = b3;
                dw7 dw7Var = this.Y;
                switch (b4) {
                    case 0:
                        return new kq7(dw7Var.d, new iv7(dw7Var, (byte) 0), dw7Var.m, dw7Var.l, dw7Var.e, dw7Var.g, dw7Var.h, dw7Var.j, dw7Var.k);
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        return new f47(dw7Var.d, new iv7(dw7Var, (byte) 1), new iv7(dw7Var, (byte) 2), dw7Var.l, dw7Var.f, dw7Var.h, dw7Var.i);
                    default:
                        return new p35(new iv7(dw7Var, (byte) 3));
                }
            }
        });
        this.r = new vz7(new mq7((byte) 15));
        this.s = new vz7(new mq7((byte) 16));
        this.t = new vz7(new mq7((byte) 17));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        return ((eb4) this).c.f.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(int i) {
        tv7 tv7Var = (tv7) ((eb4) this).c.f.get(i);
        tv7Var.getClass();
        if (tv7Var instanceof rv7) {
            return 0;
        }
        if (tv7Var instanceof sv7) {
            return 1;
        }
        if (tv7Var instanceof pv7) {
            return 2;
        }
        if (tv7Var instanceof qv7) {
            return 3;
        }
        if (tv7Var instanceof ov7) {
            return 4;
        }
        b61.c();
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(l lVar, int i, List list) {
        kv7 kv7Var = (kv7) lVar;
        list.getClass();
        Object objT0 = wv0.t0(list);
        if (!(objT0 instanceof Bundle)) {
            e(kv7Var, i);
            return;
        }
        if (kv7Var instanceof yv7) {
            f47 f47Var = (f47) this.p.getValue();
            yv7 yv7Var = (yv7) kv7Var;
            Bundle bundle = (Bundle) objT0;
            f47Var.getClass();
            f47Var.i(yv7Var, i);
            if (bundle.containsKey("selection_change")) {
                f47Var.g(yv7Var, i);
            }
            if (bundle.containsKey("name_change")) {
                f47Var.e(yv7Var, i);
            }
            if (bundle.containsKey("description_change")) {
                f47Var.c(yv7Var, i);
            }
            if (bundle.containsKey("ping_change")) {
                f47Var.f(yv7Var, i);
            }
            if (bundle.containsKey("checked_change")) {
                f47Var.a(yv7Var, i);
            }
            if (bundle.containsKey("hide_settings")) {
                f47Var.d(yv7Var, i);
            }
            if (bundle.containsKey("corners")) {
                f47Var.b(yv7Var, i);
                return;
            }
            return;
        }
        if (!(kv7Var instanceof aw7)) {
            if (kv7Var instanceof wv7) {
                p35 p35Var = (p35) this.q.getValue();
                wv7 wv7Var = (wv7) kv7Var;
                Bundle bundle2 = (Bundle) objT0;
                p35Var.getClass();
                ov7 ov7Var = (ov7) p35Var.a.B(Integer.valueOf(i));
                if (bundle2.containsKey("network_transport")) {
                    p35.b(wv7Var, ov7Var);
                }
                if (bundle2.containsKey("corners")) {
                    p35.a(wv7Var, ov7Var);
                    return;
                }
                return;
            }
            return;
        }
        kq7 kq7Var = (kq7) this.o.getValue();
        aw7 aw7Var = (aw7) kv7Var;
        Bundle bundle3 = (Bundle) objT0;
        kq7Var.getClass();
        if (bundle3.getBoolean("corners")) {
            kq7Var.d(aw7Var, i);
        }
        if (bundle3.getBoolean("collapse")) {
            kq7Var.c(aw7Var, i);
        }
        if (bundle3.getBoolean("action_menu")) {
            kq7Var.a(aw7Var, i);
        }
        if (bundle3.getBoolean("title")) {
            kq7Var.m(aw7Var, i);
        }
        if (bundle3.getBoolean("description")) {
            kq7Var.e(aw7Var, i);
        }
        if (bundle3.getBoolean("ping")) {
            kq7Var.k(aw7Var, i);
        }
        if (bundle3.getBoolean("pin")) {
            kq7Var.j(aw7Var, i);
        }
        if (bundle3.getBoolean("expand")) {
            kq7Var.f(aw7Var, i);
        }
        if (bundle3.getBoolean("check")) {
            kq7Var.b(aw7Var, i);
        }
        if (bundle3.getBoolean("extra")) {
            kq7Var.g(aw7Var, i);
        }
        if (bundle3.getBoolean("import")) {
            kq7Var.h(aw7Var, i);
        }
        if (bundle3.getBoolean("meta_params")) {
            kq7Var.i(aw7Var, i);
            kq7Var.l(aw7Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l g(ViewGroup viewGroup, int i) {
        AppCompatImageButton appCompatImageButtonB;
        AppCompatImageView appCompatImageViewB;
        ConstraintLayout constraintLayoutB;
        ConstraintLayout constraintLayoutB2;
        AppCompatImageButton appCompatImageButtonB2;
        AppCompatImageButton appCompatImageButtonB3;
        AppCompatImageButton appCompatImageButtonB4;
        AppCompatImageButton appCompatImageButtonB5;
        View viewB;
        AppCompatImageView appCompatImageViewB2;
        AppCompatImageView appCompatImageViewB3;
        View viewB2;
        MaterialCheckBox materialCheckBoxB;
        AppCompatImageView appCompatImageViewB4;
        CircularProgressIndicator circularProgressIndicatorB;
        if (i != 0) {
            if (i == 1) {
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                int i2 = ti3.n0;
                DataBinderMapperImpl dataBinderMapperImpl = x91.a;
                ti3 ti3Var = (ti3) kw8.c(t46.item_subscription_spacer, layoutInflaterFrom, viewGroup);
                ti3Var.getClass();
                View view = ((kw8) ti3Var).Z;
                view.getClass();
                return new xv7(view);
            }
            if (i != 2) {
                if (i == 3) {
                    LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(viewGroup.getContext());
                    int i3 = ri3.n0;
                    DataBinderMapperImpl dataBinderMapperImpl2 = x91.a;
                    ri3 ri3Var = (ri3) kw8.c(t46.item_server_spacer, layoutInflaterFrom2, viewGroup);
                    ri3Var.getClass();
                    View view2 = ((kw8) ri3Var).Z;
                    view2.getClass();
                    return new xv7(view2);
                }
                if (i != 4) {
                    bt.i(ie2.h("Unresolved viewType '", i, "'"));
                    return null;
                }
                LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(viewGroup.getContext());
                int i4 = oi3.o0;
                DataBinderMapperImpl dataBinderMapperImpl3 = x91.a;
                oi3 oi3Var = (oi3) kw8.c(t46.item_network_filter_warning, layoutInflaterFrom3, viewGroup);
                oi3Var.getClass();
                return new wv7(oi3Var);
            }
            RoundableLayout roundableLayoutInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t46.item_server, viewGroup, false);
            int i5 = e46.cl_config;
            ConstraintLayout constraintLayoutB3 = ln7.b(roundableLayoutInflate, i5);
            if (constraintLayoutB3 != null) {
                i5 = e46.config_action;
                FrameLayout frameLayout = (FrameLayout) ln7.b(roundableLayoutInflate, i5);
                if (frameLayout != null && (viewB2 = ln7.b(roundableLayoutInflate, (i5 = e46.config_activated))) != null) {
                    RoundableLayout roundableLayout = roundableLayoutInflate;
                    i5 = e46.config_country_flag;
                    AppCompatImageView appCompatImageViewB5 = ln7.b(roundableLayoutInflate, i5);
                    if (appCompatImageViewB5 != null) {
                        i5 = e46.config_description;
                        HappTextView happTextView = (HappTextView) ln7.b(roundableLayoutInflate, i5);
                        if (happTextView != null) {
                            i5 = e46.config_edit;
                            RelativeLayout relativeLayout = (RelativeLayout) ln7.b(roundableLayoutInflate, i5);
                            if (relativeLayout != null) {
                                i5 = e46.config_group_checkbox_layout;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ln7.b(roundableLayoutInflate, i5);
                                if (relativeLayout2 != null && (materialCheckBoxB = ln7.b(roundableLayoutInflate, (i5 = e46.config_group_checkbox_view))) != null) {
                                    i5 = e46.config_layout;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ln7.b(roundableLayoutInflate, i5);
                                    if (relativeLayout3 != null) {
                                        i5 = e46.config_name;
                                        HappTextView happTextView2 = (HappTextView) ln7.b(roundableLayoutInflate, i5);
                                        if (happTextView2 != null) {
                                            i5 = e46.fl_config_affiliation_info;
                                            if (((FrameLayout) ln7.b(roundableLayoutInflate, i5)) != null && (appCompatImageViewB4 = ln7.b(roundableLayoutInflate, (i5 = e46.icon_config_affiliation_info))) != null && (circularProgressIndicatorB = ln7.b(roundableLayoutInflate, (i5 = e46.loader_affiliation_info))) != null) {
                                                i5 = e46.tv_config_affiliation_info;
                                                HappTextView happTextView3 = (HappTextView) ln7.b(roundableLayoutInflate, i5);
                                                if (happTextView3 != null) {
                                                    return new yv7(this, new c6(roundableLayout, constraintLayoutB3, frameLayout, viewB2, roundableLayout, appCompatImageViewB5, happTextView, relativeLayout, relativeLayout2, materialCheckBoxB, relativeLayout3, happTextView2, appCompatImageViewB4, circularProgressIndicatorB, happTextView3));
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
            b61.i("Missing required view with ID: ".concat(roundableLayoutInflate.getResources().getResourceName(i5)));
            return null;
        }
        RoundableLayout roundableLayoutInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(t46.item_subscription, viewGroup, false);
        int i6 = e46.announce_text;
        HappTextView happTextView4 = (HappTextView) ln7.b(roundableLayoutInflate2, i6);
        if (happTextView4 != null) {
            RoundableLayout roundableLayout2 = roundableLayoutInflate2;
            i6 = e46.config_group_checkbox;
            MaterialCheckBox materialCheckBoxB2 = ln7.b(roundableLayoutInflate2, i6);
            if (materialCheckBoxB2 != null) {
                i6 = e46.config_group_collapsed_part;
                if (((LinearLayout) ln7.b(roundableLayoutInflate2, i6)) != null) {
                    i6 = e46.config_group_description;
                    HappTextView happTextView5 = (HappTextView) ln7.b(roundableLayoutInflate2, i6);
                    if (happTextView5 != null && (appCompatImageButtonB = ln7.b(roundableLayoutInflate2, (i6 = e46.config_group_expand_collapse))) != null && (appCompatImageViewB = ln7.b(roundableLayoutInflate2, (i6 = e46.config_group_extra_status))) != null) {
                        i6 = e46.config_group_main;
                        if (ln7.b(roundableLayoutInflate2, i6) != null) {
                            i6 = e46.config_group_meta_info;
                            LinearLayout linearLayout = (LinearLayout) ln7.b(roundableLayoutInflate2, i6);
                            if (linearLayout != null && (constraintLayoutB = ln7.b(roundableLayoutInflate2, (i6 = e46.config_group_meta_info_announce_layout))) != null) {
                                i6 = e46.config_group_meta_info_layout;
                                LinearLayout linearLayout2 = (LinearLayout) ln7.b(roundableLayoutInflate2, i6);
                                if (linearLayout2 != null && (constraintLayoutB2 = ln7.b(roundableLayoutInflate2, (i6 = e46.config_group_meta_progress))) != null) {
                                    i6 = e46.config_group_meta_user_info;
                                    LinearLayout linearLayout3 = (LinearLayout) ln7.b(roundableLayoutInflate2, i6);
                                    if (linearLayout3 != null && (appCompatImageButtonB2 = ln7.b(roundableLayoutInflate2, (i6 = e46.config_group_more))) != null) {
                                        i6 = e46.config_group_name;
                                        HappTextView happTextView6 = (HappTextView) ln7.b(roundableLayoutInflate2, i6);
                                        if (happTextView6 != null) {
                                            i6 = e46.config_group_name_container;
                                            if (ln7.b(roundableLayoutInflate2, i6) != null && (appCompatImageButtonB3 = ln7.b(roundableLayoutInflate2, (i6 = e46.config_group_pin))) != null && (appCompatImageButtonB4 = ln7.b(roundableLayoutInflate2, (i6 = e46.config_group_ping))) != null && (appCompatImageButtonB5 = ln7.b(roundableLayoutInflate2, (i6 = e46.config_group_refresh))) != null) {
                                                i6 = e46.divider_bottom;
                                                if (ln7.b(roundableLayoutInflate2, i6) != null && (viewB = ln7.b(roundableLayoutInflate2, (i6 = e46.divider_middle))) != null) {
                                                    i6 = e46.divider_top;
                                                    if (ln7.b(roundableLayoutInflate2, i6) != null) {
                                                        i6 = e46.expire_text;
                                                        HappTextView happTextView7 = (HappTextView) ln7.b(roundableLayoutInflate2, i6);
                                                        if (happTextView7 != null && (appCompatImageViewB2 = ln7.b(roundableLayoutInflate2, (i6 = e46.icon_link))) != null && (appCompatImageViewB3 = ln7.b(roundableLayoutInflate2, (i6 = e46.icon_web_page))) != null) {
                                                            i6 = e46.ll_sub_info;
                                                            LinearLayout linearLayout4 = (LinearLayout) ln7.b(roundableLayoutInflate2, i6);
                                                            if (linearLayout4 != null) {
                                                                i6 = e46.pb_horizontal;
                                                                ProgressBar progressBar = (ProgressBar) ln7.b(roundableLayoutInflate2, i6);
                                                                if (progressBar != null) {
                                                                    i6 = e46.rl_config_group_checkbox;
                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) ln7.b(roundableLayoutInflate2, i6);
                                                                    if (relativeLayout4 != null) {
                                                                        i6 = e46.sub_info_button;
                                                                        HappTextButton happTextButton = (HappTextButton) ln7.b(roundableLayoutInflate2, i6);
                                                                        if (happTextButton != null) {
                                                                            i6 = e46.sub_info_layout;
                                                                            LinearLayout linearLayout5 = (LinearLayout) ln7.b(roundableLayoutInflate2, i6);
                                                                            if (linearLayout5 != null) {
                                                                                i6 = e46.sub_info_text;
                                                                                HappTextView happTextView8 = (HappTextView) ln7.b(roundableLayoutInflate2, i6);
                                                                                if (happTextView8 != null) {
                                                                                    i6 = e46.traffic_count;
                                                                                    HappTextView happTextView9 = (HappTextView) ln7.b(roundableLayoutInflate2, i6);
                                                                                    if (happTextView9 != null) {
                                                                                        return new aw7(this, new si3(roundableLayout2, happTextView4, roundableLayout2, materialCheckBoxB2, happTextView5, appCompatImageButtonB, appCompatImageViewB, linearLayout, constraintLayoutB, linearLayout2, constraintLayoutB2, linearLayout3, appCompatImageButtonB2, happTextView6, appCompatImageButtonB3, appCompatImageButtonB4, appCompatImageButtonB5, viewB, happTextView7, appCompatImageViewB2, appCompatImageViewB3, linearLayout4, progressBar, relativeLayout4, happTextButton, linearLayout5, happTextView8, happTextView9));
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
        b61.i("Missing required view with ID: ".concat(roundableLayoutInflate2.getResources().getResourceName(i6)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final pv7 l(int i) {
        Object obj = ((eb4) this).c.f.get(i);
        if (obj instanceof pv7) {
            return (pv7) obj;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(List list, a45 a45Var, s51 s51Var) {
        cw7 cw7Var;
        dw7 dw7Var;
        if (s51Var instanceof cw7) {
            cw7Var = (cw7) s51Var;
            int i = cw7Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                cw7Var.h0 = i - Integer.MIN_VALUE;
            } else {
                cw7Var = new cw7(this, s51Var);
            }
        } else {
            cw7Var = new cw7(this, s51Var);
        }
        Object objW = cw7Var.f0;
        int i2 = cw7Var.h0;
        if (i2 == 0) {
            w39.n0(objW);
            nf1 nf1Var = tp1.a;
            dw7Var = this;
            co coVar = new co((Object) dw7Var, (Object) list, (Object) a45Var, (q51) null, (byte) 12);
            cw7Var.h0 = 1;
            objW = w51.W(nf1Var, coVar, cw7Var);
            c71 c71Var = c71.X;
            if (objW == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objW);
            dw7Var = this;
        }
        ((eb4) dw7Var).c.b((List) objW);
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: e(Landroidx/recyclerview/widget/l;I)V */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void e(kv7 kv7Var, int i) {
        tv7 tv7Var = (tv7) ((eb4) this).c.f.get(i);
        if (tv7Var instanceof rv7) {
            kq7 kq7Var = (kq7) this.o.getValue();
            aw7 aw7Var = (aw7) kv7Var;
            kq7Var.getClass();
            mb6.g(aw7Var.w);
            kq7Var.d(aw7Var, i);
            kq7Var.c(aw7Var, i);
            kq7Var.a(aw7Var, i);
            kq7Var.m(aw7Var, i);
            kq7Var.e(aw7Var, i);
            kq7Var.l(aw7Var, i);
            kq7Var.k(aw7Var, i);
            kq7Var.j(aw7Var, i);
            kq7Var.f(aw7Var, i);
            kq7Var.b(aw7Var, i);
            kq7Var.g(aw7Var, i);
            kq7Var.h(aw7Var, i);
            return;
        }
        if (tv7Var instanceof sv7) {
            return;
        }
        if (!(tv7Var instanceof pv7)) {
            if (tv7Var instanceof qv7) {
                return;
            }
            if (!(tv7Var instanceof ov7)) {
                b61.c();
                return;
            }
            p35 p35Var = (p35) this.q.getValue();
            wv7 wv7Var = (wv7) kv7Var;
            p35Var.getClass();
            ov7 ov7Var = (ov7) p35Var.a.B(Integer.valueOf(i));
            p35.b(wv7Var, ov7Var);
            p35.a(wv7Var, ov7Var);
            return;
        }
        f47 f47Var = (f47) this.p.getValue();
        yv7 yv7Var = (yv7) kv7Var;
        c6 c6Var = yv7Var.u;
        f47Var.getClass();
        mb6.g(yv7Var.v);
        pv7 pv7Var = (pv7) f47Var.b.B(Integer.valueOf(i));
        String strD = pv7Var.a.getGuid();
        ConstraintLayout constraintLayout = (ConstraintLayout) c6Var.j0;
        Context context = ((RoundableLayout) c6Var.i0).getContext();
        context.getClass();
        constraintLayout.setFocusableInTouchMode(ue3.y(context));
        f47Var.i(yv7Var, i);
        f47Var.g(yv7Var, i);
        f47Var.e(yv7Var, i);
        f47Var.c(yv7Var, i);
        f47Var.f(yv7Var, i);
        f47Var.a(yv7Var, i);
        f47Var.b(yv7Var, i);
        int iOrdinal = f47Var.a.ordinal();
        if (iOrdinal == 0) {
            ((FrameLayout) c6Var.k0).setOnClickListener(new d47(yv7Var, (byte) 0));
            RelativeLayout relativeLayout = (RelativeLayout) c6Var.f0;
            relativeLayout.setVisibility(8);
            relativeLayout.setOnClickListener(null);
        } else {
            if (iOrdinal != 1) {
                b61.c();
                return;
            }
            f47Var.d(yv7Var, i);
        }
        ((ConstraintLayout) c6Var.j0).setOnClickListener(new m24(f47Var, pv7Var, strD, (byte) 2));
    }
}
