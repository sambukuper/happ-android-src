package su.happ.proxyutility.feature.main;

import android.R;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ComponentActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import defpackage.a45;
import defpackage.ae1;
import defpackage.ak4;
import defpackage.au7;
import defpackage.ay2;
import defpackage.b6;
import defpackage.bk4;
import defpackage.bl4;
import defpackage.bm4;
import defpackage.ck4;
import defpackage.cl4;
import defpackage.dk4;
import defpackage.dr2;
import defpackage.dt7;
import defpackage.dw7;
import defpackage.e46;
import defpackage.fk4;
import defpackage.g83;
import defpackage.gk7;
import defpackage.gv7;
import defpackage.gw5;
import defpackage.hk4;
import defpackage.ho4;
import defpackage.i83;
import defpackage.ik4;
import defpackage.j02;
import defpackage.jk4;
import defpackage.jo1;
import defpackage.k83;
import defpackage.ko1;
import defpackage.kr7;
import defpackage.kw2;
import defpackage.kw4;
import defpackage.l81;
import defpackage.ld6;
import defpackage.ln7;
import defpackage.m83;
import defpackage.mj4;
import defpackage.my2;
import defpackage.n69;
import defpackage.n83;
import defpackage.nj4;
import defpackage.nk4;
import defpackage.o;
import defpackage.o83;
import defpackage.oj4;
import defpackage.ok4;
import defpackage.ok7;
import defpackage.om4;
import defpackage.oo4;
import defpackage.oq6;
import defpackage.p83;
import defpackage.pk4;
import defpackage.pl4;
import defpackage.pz7;
import defpackage.q83;
import defpackage.r83;
import defpackage.rg8;
import defpackage.rj4;
import defpackage.rp7;
import defpackage.s83;
import defpackage.sj4;
import defpackage.sq6;
import defpackage.ss8;
import defpackage.t46;
import defpackage.t83;
import defpackage.tk4;
import defpackage.uj4;
import defpackage.uk4;
import defpackage.uq0;
import defpackage.uu7;
import defpackage.v26;
import defpackage.v83;
import defpackage.vh;
import defpackage.vj4;
import defpackage.vm4;
import defpackage.vr1;
import defpackage.wj4;
import defpackage.wk4;
import defpackage.wl4;
import defpackage.wu7;
import defpackage.x83;
import defpackage.xl4;
import defpackage.xm4;
import defpackage.xn4;
import defpackage.xz1;
import defpackage.y46;
import defpackage.yj4;
import defpackage.ym;
import defpackage.za3;
import defpackage.zh4;
import defpackage.zj4;
import defpackage.zl4;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import libxray.XRayPoint;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.HWID;
import su.happ.proxyutility.dto.ImportResult;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EDeeplinkType;
import su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.main.MainViewModel;
import su.happ.proxyutility.feature.settings.SettingsActivity;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.button.HappDebouncedImageButton;
import su.happ.proxyutility.ui.foundation.component.button.HappDebouncedTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsu/happ/proxyutility/feature/main/MainActivity;", "Lsu/happ/proxyutility/ui/SnackbarHostActivity;", "Lgv7;", "Lzl4;", "Luu7;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class MainActivity extends SnackbarHostActivity implements gv7, zl4, uu7 {
    public static final /* synthetic */ int y1 = 0;
    public b6 Q0;
    public final m51 R0;
    public final vz7 S0;
    public final vz7 T0;
    public final vz7 U0;
    public final vz7 V0;
    public final vz7 W0;
    public final vz7 X0;
    public final r6 Y0;
    public final x90 Z0;
    public final r6 a1;
    public final r6 b1;
    public og7 c1;
    public final u77 d1;
    public final y5 e1;
    public final y5 f1;
    public final y5 g1;
    public final y5 h1;
    public final y5 i1;
    public final y5 j1;
    public final AtomicBoolean k1;
    public final gk7 l1;
    public final AtomicBoolean m1;
    public final ConcurrentHashMap n1;
    public final q02 o1;
    public final vz7 p1;
    public final q15 q1;
    public final vz7 r1;
    public final vz7 s1;
    public final vz7 t1;
    public final vz7 u1;
    public boolean v1;
    public ValueAnimator w1;
    public final r6 x1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MainActivity() {
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        this.R0 = gv3.c(g33.K(ow7VarB, ye1.Z));
        byte b = 0;
        this.S0 = new vz7(new mj4(this, b));
        byte b2 = 12;
        this.T0 = new vz7(new mj4(this, b2));
        this.U0 = new vz7(new sh4((byte) 5));
        byte b3 = 6;
        this.V0 = new vz7(new sh4((byte) 6));
        byte b4 = 13;
        this.W0 = new vz7(new mj4(this, b4));
        byte b5 = 3;
        this.X0 = new vz7(new sh4((byte) 3));
        byte b6 = 2;
        this.Y0 = m(new nj4(this, b), new n6((byte) 2));
        byte b7 = 1;
        this.Z0 = gv3.b(1, l90.Y, (gn2) null, 4);
        this.a1 = m(new nj4(this, b7), new n6((byte) 2));
        this.b1 = m(new nj4(this, b6), new n6((byte) 2));
        this.d1 = v77.b(0, 7, (l90) null);
        uj4 uj4Var = new uj4(this, (byte) 10);
        zb6 zb6Var = yb6.a;
        this.e1 = new y5(zb6Var.b(MainViewModel.class), new uj4(this, (byte) 11), uj4Var, new uj4(this, b2));
        this.f1 = new y5(zb6Var.b(sq6.class), new uj4(this, (byte) 14), new uj4(this, b4), new uj4(this, (byte) 15));
        this.g1 = new y5(zb6Var.b(gw5.class), new uj4(this, (byte) 17), new uj4(this, (byte) 16), new uj4(this, (byte) 18));
        this.h1 = new y5(zb6Var.b(dr2.class), new uj4(this, b6), new uj4(this, b7), new uj4(this, b5));
        this.i1 = new y5(zb6Var.b(za3.class), new uj4(this, (byte) 5), new uj4(this, (byte) 4), new uj4(this, b3));
        byte b8 = 9;
        this.j1 = new y5(zb6Var.b(kr7.class), new uj4(this, (byte) 8), new uj4(this, (byte) 7), new uj4(this, b8));
        this.k1 = new AtomicBoolean(false);
        HappApplication happApplication = HappApplication.M0;
        this.l1 = k32.i().g();
        this.m1 = new AtomicBoolean(false);
        this.n1 = new ConcurrentHashMap();
        this.o1 = new q02(this, (byte) 18);
        this.p1 = new vz7(new mj4(this, b7));
        this.q1 = r15.a();
        this.r1 = new vz7(new mj4(this, b6));
        this.s1 = new vz7(new sh4((byte) 4));
        this.t1 = new vz7(new mj4(this, b3));
        this.u1 = new vz7(new mj4(this, b8));
        this.w1 = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.x1 = m(new nj4(this, b5), new n6((byte) 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object L(MainActivity mainActivity, String str, boolean z, String str2, Boolean bool, Boolean bool2, s51 s51Var, int i) {
        SubId.Companion.getClass();
        return mainActivity.K(str, z, SubId.c(), (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0, s51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:100:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:101:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:111:0x031c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0336  */
    /* JADX WARN: Code duplicated, block: B:124:0x0340  */
    /* JADX WARN: Code duplicated, block: B:126:0x034a  */
    /* JADX WARN: Code duplicated, block: B:130:0x037e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0226  */
    /* JADX WARN: Code duplicated, block: B:71:0x022c  */
    /* JADX WARN: Code duplicated, block: B:73:0x022f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0235  */
    /* JADX WARN: Code duplicated, block: B:77:0x0239  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0244  */
    /* JADX WARN: Code duplicated, block: B:82:0x0247  */
    /* JADX WARN: Code duplicated, block: B:85:0x0273  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b4  */
    public static final Object M(String str, MainActivity mainActivity, boolean z, boolean z2, String str2, String str3, Boolean bool, Boolean bool2, s51 s51Var) {
        ik4 ik4Var;
        String str4;
        Boolean bool3;
        String str5;
        boolean z3;
        Boolean bool4;
        String str6;
        MainActivity mainActivity2;
        boolean z4;
        Object value;
        xm4 xm4Var;
        qg5 qg5Var;
        boolean z5;
        boolean z6;
        List list;
        Boolean bool5;
        String str7;
        MainActivity mainActivity3;
        String str8;
        String str9;
        Boolean bool6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object next;
        final ImportResult importResult;
        Object obj;
        c71 c71Var;
        boolean z10;
        Object obj2;
        final ImportResult importResult2;
        boolean z11;
        String str10;
        Boolean bool7;
        String strA;
        boolean z12;
        boolean z13;
        String str11;
        SubscriptionItem subscriptionItemF;
        c71 c71Var2;
        Object objS;
        final ImportResult importResult3;
        boolean z14;
        boolean z15;
        boolean z16;
        ImportResult importResult4;
        boolean z17 = z;
        if (s51Var instanceof ik4) {
            ik4Var = (ik4) s51Var;
            int i = ik4Var.t0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ik4Var.t0 = i - Integer.MIN_VALUE;
            } else {
                ik4Var = new ik4(s51Var);
            }
        } else {
            ik4Var = new ik4(s51Var);
        }
        Object objD = ik4Var.s0;
        int i2 = ik4Var.t0;
        byte b = 1;
        c71 c71Var3 = c71.X;
        if (i2 == 0) {
            w39.n0(objD);
            if (str == null || str.length() == 0) {
                mainActivity.W(new ImportResult(0, m83.a, null, 5), z17, z2);
                return Boolean.FALSE;
            }
            mainActivity.getClass();
            if (ae1.b(str) == EDeeplinkType.ROUTING) {
                ((sq6) mainActivity.f1.getValue()).f(oq6.a);
                oh7 oh7Var = mainActivity.G().w;
                do {
                    value = oh7Var.getValue();
                    xm4Var = (xm4) value;
                    xm4Var.getClass();
                } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, 0, 0, null, null, false, new vm4(str), false, null, false, false, null, 64511)));
                return Boolean.TRUE;
            }
            boolean zC = mainActivity.H().c("pref_reject_duplicates_subscription", true);
            nf1 nf1Var = tp1.a;
            ye1 ye1Var = ye1.Z;
            vh vhVar = new vh(2, null, b);
            ik4Var.f0 = str;
            ik4Var.g0 = mainActivity;
            str4 = str2;
            ik4Var.h0 = str4;
            ik4Var.i0 = str3;
            ik4Var.j0 = bool;
            bool3 = bool2;
            ik4Var.k0 = bool3;
            ik4Var.n0 = z17;
            ik4Var.o0 = z2;
            ik4Var.p0 = zC;
            ik4Var.t0 = 1;
            Object objW = w51.W(ye1Var, vhVar, ik4Var);
            if (objW != c71Var3) {
                str5 = str;
                z3 = zC;
                objD = objW;
                bool4 = bool;
                str6 = str3;
                mainActivity2 = mainActivity;
                z4 = z2;
            }
            return c71Var3;
        }
        if (i2 == 1) {
            z3 = ik4Var.p0;
            z4 = ik4Var.o0;
            z17 = ik4Var.n0;
            Boolean bool8 = ik4Var.k0;
            bool4 = ik4Var.j0;
            str6 = ik4Var.i0;
            str4 = ik4Var.h0;
            mainActivity2 = ik4Var.g0;
            str5 = ik4Var.f0;
            w39.n0(objD);
            bool3 = bool8;
        } else {
            if (i2 == 2) {
                z9 = ik4Var.r0;
                z6 = ik4Var.q0;
                z8 = ik4Var.p0;
                z5 = ik4Var.o0;
                z7 = ik4Var.n0;
                String str12 = ik4Var.m0;
                List list2 = ik4Var.l0;
                Boolean bool9 = ik4Var.k0;
                Boolean bool10 = ik4Var.j0;
                String str13 = ik4Var.i0;
                MainActivity mainActivity4 = ik4Var.g0;
                String str14 = ik4Var.f0;
                w39.n0(objD);
                str7 = str14;
                str9 = str12;
                str8 = str13;
                bool6 = bool10;
                bool5 = bool9;
                mainActivity3 = mainActivity4;
                list = list2;
                importResult = (ImportResult) objD;
                HappApplication happApplication = HappApplication.M0;
                obj = objD;
                c71Var = c71Var3;
                z10 = z9;
                final byte b2 = 0;
                k32.i().d().h(new gn2() { // from class: qj4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object B(Object obj3) {
                        byte b3 = b2;
                        dn8 dn8Var = dn8.a;
                        ImportResult importResult5 = importResult;
                        PrintWriter printWriter = (PrintWriter) obj3;
                        switch (b3) {
                            case 0:
                                int i3 = MainActivity.y1;
                                printWriter.println(p61.q(printWriter) + " Batch config result 1: " + importResult5);
                                break;
                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                int i4 = MainActivity.y1;
                                printWriter.println(p61.q(printWriter) + " Batch config result 2: " + importResult5);
                                break;
                            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                int i5 = MainActivity.y1;
                                printWriter.println(p61.q(printWriter) + " Append custom result: " + importResult5);
                                break;
                            case 3:
                                printWriter.println(p61.q(printWriter) + " Batch config result 1 (use case): " + importResult5);
                                break;
                            case 4:
                                printWriter.println(p61.q(printWriter) + " Batch config result 2 (use case): " + importResult5);
                                break;
                            default:
                                printWriter.println(p61.q(printWriter) + " Append custom result (use case): " + importResult5);
                                break;
                        }
                        return dn8Var;
                    }
                });
                if (!(importResult.getStatus() instanceof r83) || (importResult.getLastParseError() instanceof r83) || (importResult.getLastParseError() instanceof m83) || (importResult.getLastParseError() instanceof p83) || !mainActivity3.W(importResult, z7, z5)) {
                    obj2 = obj;
                } else {
                    obj2 = null;
                }
                importResult2 = (ImportResult) obj2;
                if (importResult2 == null) {
                    return Boolean.FALSE;
                }
                if (importResult2.getCount() <= 0) {
                    ss8 ss8Var = ss8.a;
                    if (str7 != null) {
                        bt.q("Required value was null.");
                        return null;
                    }
                    strA = ss8.a(str7);
                    if (strA.length() <= 0) {
                        strA = null;
                    }
                    if (strA != null) {
                        kw2 kw2Var = kw2.a;
                        ik4Var.f0 = str7;
                        ik4Var.g0 = mainActivity3;
                        ik4Var.h0 = null;
                        ik4Var.i0 = str8;
                        ik4Var.j0 = bool6;
                        ik4Var.k0 = bool5;
                        ik4Var.l0 = list;
                        ik4Var.m0 = str9;
                        ik4Var.n0 = z7;
                        ik4Var.o0 = z5;
                        ik4Var.p0 = z8;
                        ik4Var.q0 = z6;
                        ik4Var.r0 = z10;
                        ik4Var.t0 = 3;
                        objD = kw2Var.d(strA, str9, z10, ik4Var);
                        c71Var3 = c71Var;
                        if (objD != c71Var3) {
                            z13 = z10;
                        }
                        return c71Var3;
                    }
                    c71Var3 = c71Var;
                    z11 = z10;
                    z12 = z5;
                    importResult2 = new ImportResult(0, null, r83.a, 3);
                    z8 = z8;
                    z6 = z6;
                    c71Var = c71Var3;
                    str10 = str7;
                    bool7 = bool6;
                    z5 = z12;
                } else {
                    z11 = z10;
                    str10 = str7;
                    bool7 = bool6;
                }
                boolean z18 = z7;
                String str15 = str8;
                MainActivity mainActivity5 = mainActivity3;
                str11 = str9;
                if (importResult2.getCount() <= 0) {
                    kw2 kw2Var2 = kw2.a;
                    importResult2 = kw2.a(str10, z11, str11);
                    final byte b3 = 2;
                    k32.i().d().h(new gn2() { // from class: qj4
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public final Object B(Object obj3) {
                            byte b4 = b3;
                            dn8 dn8Var = dn8.a;
                            ImportResult importResult5 = importResult2;
                            PrintWriter printWriter = (PrintWriter) obj3;
                            switch (b4) {
                                case 0:
                                    int i3 = MainActivity.y1;
                                    printWriter.println(p61.q(printWriter) + " Batch config result 1: " + importResult5);
                                    break;
                                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                    int i4 = MainActivity.y1;
                                    printWriter.println(p61.q(printWriter) + " Batch config result 2: " + importResult5);
                                    break;
                                case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                    int i5 = MainActivity.y1;
                                    printWriter.println(p61.q(printWriter) + " Append custom result: " + importResult5);
                                    break;
                                case 3:
                                    printWriter.println(p61.q(printWriter) + " Batch config result 1 (use case): " + importResult5);
                                    break;
                                case 4:
                                    printWriter.println(p61.q(printWriter) + " Batch config result 2 (use case): " + importResult5);
                                    break;
                                default:
                                    printWriter.println(p61.q(printWriter) + " Append custom result (use case): " + importResult5);
                                    break;
                            }
                            return dn8Var;
                        }
                    });
                    if (!(importResult2.getStatus() instanceof r83) && !(importResult2.getLastParseError() instanceof r83) && !(importResult2.getLastParseError() instanceof m83) && mainActivity5.W(importResult2, z18, z5)) {
                        importResult2 = null;
                    }
                    if (importResult2 == null) {
                        return Boolean.FALSE;
                    }
                }
                ImportResult importResult5 = importResult2;
                if (fm7.o0(str11)) {
                    subscriptionItemF = null;
                } else {
                    kw4 kw4Var = kw4.a;
                    subscriptionItemF = kw4.f(str11);
                }
                ik4Var.f0 = null;
                ik4Var.g0 = null;
                ik4Var.h0 = null;
                ik4Var.i0 = null;
                ik4Var.j0 = null;
                ik4Var.k0 = null;
                ik4Var.l0 = null;
                ik4Var.m0 = null;
                ik4Var.n0 = z18;
                ik4Var.o0 = z5;
                ik4Var.p0 = z8;
                ik4Var.q0 = z6;
                ik4Var.r0 = z11;
                ik4Var.t0 = 4;
                c71Var2 = c71Var;
                objS = mainActivity5.S(importResult5, str11, subscriptionItemF, false, z6, str15, bool7, bool5, z18, z5, list, ik4Var);
                if (objS == c71Var2) {
                    return c71Var2;
                }
                return objS;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    w39.n0(objD);
                    return objD;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z13 = ik4Var.r0;
            z6 = ik4Var.q0;
            z8 = ik4Var.p0;
            z5 = ik4Var.o0;
            z7 = ik4Var.n0;
            str9 = ik4Var.m0;
            list = ik4Var.l0;
            bool5 = ik4Var.k0;
            bool6 = ik4Var.j0;
            str8 = ik4Var.i0;
            mainActivity3 = ik4Var.g0;
            str7 = ik4Var.f0;
            w39.n0(objD);
        }
        importResult3 = (ImportResult) objD;
        HappApplication happApplication2 = HappApplication.M0;
        z14 = z13;
        z15 = z6;
        z16 = z8;
        final byte b4 = 1;
        k32.i().d().h(new gn2() { // from class: qj4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj3) {
                byte b5 = b4;
                dn8 dn8Var = dn8.a;
                ImportResult importResult6 = importResult3;
                PrintWriter printWriter = (PrintWriter) obj3;
                switch (b5) {
                    case 0:
                        int i3 = MainActivity.y1;
                        printWriter.println(p61.q(printWriter) + " Batch config result 1: " + importResult6);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i4 = MainActivity.y1;
                        printWriter.println(p61.q(printWriter) + " Batch config result 2: " + importResult6);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i5 = MainActivity.y1;
                        printWriter.println(p61.q(printWriter) + " Append custom result: " + importResult6);
                        break;
                    case 3:
                        printWriter.println(p61.q(printWriter) + " Batch config result 1 (use case): " + importResult6);
                        break;
                    case 4:
                        printWriter.println(p61.q(printWriter) + " Batch config result 2 (use case): " + importResult6);
                        break;
                    default:
                        printWriter.println(p61.q(printWriter) + " Append custom result (use case): " + importResult6);
                        break;
                }
                return dn8Var;
            }
        });
        if (!(importResult3.getStatus() instanceof r83) && !(importResult3.getLastParseError() instanceof r83) && !(importResult3.getLastParseError() instanceof m83) && mainActivity3.W(importResult3, z7, z5)) {
            objD = null;
        }
        importResult4 = (ImportResult) objD;
        if (importResult4 == null) {
            return Boolean.FALSE;
        }
        z11 = z14;
        z6 = z15;
        z8 = z16;
        z12 = z5;
        importResult2 = importResult4;
        c71Var = c71Var3;
        str10 = str7;
        bool7 = bool6;
        z5 = z12;
        boolean z19 = z7;
        String str16 = str8;
        MainActivity mainActivity6 = mainActivity3;
        str11 = str9;
        if (importResult2.getCount() <= 0) {
            kw2 kw2Var3 = kw2.a;
            importResult2 = kw2.a(str10, z11, str11);
            final byte b5 = 2;
            k32.i().d().h(new gn2() { // from class: qj4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object B(Object obj3) {
                    byte b6 = b5;
                    dn8 dn8Var = dn8.a;
                    ImportResult importResult6 = importResult2;
                    PrintWriter printWriter = (PrintWriter) obj3;
                    switch (b6) {
                        case 0:
                            int i3 = MainActivity.y1;
                            printWriter.println(p61.q(printWriter) + " Batch config result 1: " + importResult6);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            int i4 = MainActivity.y1;
                            printWriter.println(p61.q(printWriter) + " Batch config result 2: " + importResult6);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            int i5 = MainActivity.y1;
                            printWriter.println(p61.q(printWriter) + " Append custom result: " + importResult6);
                            break;
                        case 3:
                            printWriter.println(p61.q(printWriter) + " Batch config result 1 (use case): " + importResult6);
                            break;
                        case 4:
                            printWriter.println(p61.q(printWriter) + " Batch config result 2 (use case): " + importResult6);
                            break;
                        default:
                            printWriter.println(p61.q(printWriter) + " Append custom result (use case): " + importResult6);
                            break;
                    }
                    return dn8Var;
                }
            });
            if (!(importResult2.getStatus() instanceof r83)) {
                importResult2 = null;
            }
            if (importResult2 == null) {
                return Boolean.FALSE;
            }
        }
        ImportResult importResult6 = importResult2;
        if (fm7.o0(str11)) {
            kw4 kw4Var2 = kw4.a;
            subscriptionItemF = kw4.f(str11);
        } else {
            subscriptionItemF = null;
        }
        ik4Var.f0 = null;
        ik4Var.g0 = null;
        ik4Var.h0 = null;
        ik4Var.i0 = null;
        ik4Var.j0 = null;
        ik4Var.k0 = null;
        ik4Var.l0 = null;
        ik4Var.m0 = null;
        ik4Var.n0 = z19;
        ik4Var.o0 = z5;
        ik4Var.p0 = z8;
        ik4Var.q0 = z6;
        ik4Var.r0 = z11;
        ik4Var.t0 = 4;
        c71Var2 = c71Var;
        objS = mainActivity6.S(importResult6, str11, subscriptionItemF, false, z6, str16, bool7, bool5, z19, z5, list, ik4Var);
        if (objS == c71Var2) {
            return c71Var2;
        }
        return objS;
        List list3 = (List) objD;
        String strX0 = fm7.x0("happ://add/", str5);
        if (z3) {
            Iterator it = list3.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((SubscriptionItem) ((qg5) next).Y).Y(strX0));
            qg5 qg5Var2 = (qg5) next;
            qg5Var = qg5Var2 == null ? new qg5(Boolean.FALSE, new SubId(str4)) : new qg5(Boolean.TRUE, qg5Var2.X);
        } else {
            qg5Var = new qg5(Boolean.FALSE, new SubId(str4));
        }
        boolean zBooleanValue = ((Boolean) qg5Var.X).booleanValue();
        String strD = ((SubId) qg5Var.Y).d();
        boolean zO0 = fm7.o0(strD);
        kw2 kw2Var4 = kw2.a;
        ik4Var.f0 = str5;
        ik4Var.g0 = mainActivity2;
        ik4Var.h0 = null;
        ik4Var.i0 = str6;
        ik4Var.j0 = bool4;
        ik4Var.k0 = bool3;
        ik4Var.l0 = list3;
        ik4Var.m0 = strD;
        ik4Var.n0 = z17;
        ik4Var.o0 = z4;
        ik4Var.p0 = z3;
        ik4Var.q0 = zBooleanValue;
        ik4Var.r0 = zO0;
        ik4Var.t0 = 2;
        Object objD2 = kw2Var4.d(str5, strD, zO0, ik4Var);
        if (objD2 != c71Var3) {
            z5 = z4;
            z6 = zBooleanValue;
            MainActivity mainActivity7 = mainActivity2;
            list = list3;
            objD = objD2;
            bool5 = bool3;
            str7 = str5;
            mainActivity3 = mainActivity7;
            str8 = str6;
            str9 = strD;
            bool6 = bool4;
            z7 = z17;
            z8 = z3;
            z9 = zO0;
            importResult = (ImportResult) objD;
            HappApplication happApplication3 = HappApplication.M0;
            obj = objD;
            c71Var = c71Var3;
            z10 = z9;
            final byte b6 = 0;
            k32.i().d().h(new gn2() { // from class: qj4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object B(Object obj3) {
                    byte b7 = b6;
                    dn8 dn8Var = dn8.a;
                    ImportResult importResult7 = importResult;
                    PrintWriter printWriter = (PrintWriter) obj3;
                    switch (b7) {
                        case 0:
                            int i3 = MainActivity.y1;
                            printWriter.println(p61.q(printWriter) + " Batch config result 1: " + importResult7);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            int i4 = MainActivity.y1;
                            printWriter.println(p61.q(printWriter) + " Batch config result 2: " + importResult7);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            int i5 = MainActivity.y1;
                            printWriter.println(p61.q(printWriter) + " Append custom result: " + importResult7);
                            break;
                        case 3:
                            printWriter.println(p61.q(printWriter) + " Batch config result 1 (use case): " + importResult7);
                            break;
                        case 4:
                            printWriter.println(p61.q(printWriter) + " Batch config result 2 (use case): " + importResult7);
                            break;
                        default:
                            printWriter.println(p61.q(printWriter) + " Append custom result (use case): " + importResult7);
                            break;
                    }
                    return dn8Var;
                }
            });
            if (importResult.getStatus() instanceof r83) {
                obj2 = obj;
            } else {
                obj2 = obj;
            }
            importResult2 = (ImportResult) obj2;
            if (importResult2 == null) {
                return Boolean.FALSE;
            }
            if (importResult2.getCount() <= 0) {
                ss8 ss8Var2 = ss8.a;
                if (str7 != null) {
                    bt.q("Required value was null.");
                    return null;
                }
                strA = ss8.a(str7);
                if (strA.length() <= 0) {
                    strA = null;
                }
                if (strA != null) {
                    kw2 kw2Var5 = kw2.a;
                    ik4Var.f0 = str7;
                    ik4Var.g0 = mainActivity3;
                    ik4Var.h0 = null;
                    ik4Var.i0 = str8;
                    ik4Var.j0 = bool6;
                    ik4Var.k0 = bool5;
                    ik4Var.l0 = list;
                    ik4Var.m0 = str9;
                    ik4Var.n0 = z7;
                    ik4Var.o0 = z5;
                    ik4Var.p0 = z8;
                    ik4Var.q0 = z6;
                    ik4Var.r0 = z10;
                    ik4Var.t0 = 3;
                    objD = kw2Var5.d(strA, str9, z10, ik4Var);
                    c71Var3 = c71Var;
                    if (objD != c71Var3) {
                        z13 = z10;
                        importResult3 = (ImportResult) objD;
                        HappApplication happApplication4 = HappApplication.M0;
                        z14 = z13;
                        z15 = z6;
                        z16 = z8;
                        final byte b7 = 1;
                        k32.i().d().h(new gn2() { // from class: qj4
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final Object B(Object obj3) {
                                byte b8 = b7;
                                dn8 dn8Var = dn8.a;
                                ImportResult importResult7 = importResult3;
                                PrintWriter printWriter = (PrintWriter) obj3;
                                switch (b8) {
                                    case 0:
                                        int i3 = MainActivity.y1;
                                        printWriter.println(p61.q(printWriter) + " Batch config result 1: " + importResult7);
                                        break;
                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                        int i4 = MainActivity.y1;
                                        printWriter.println(p61.q(printWriter) + " Batch config result 2: " + importResult7);
                                        break;
                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                        int i5 = MainActivity.y1;
                                        printWriter.println(p61.q(printWriter) + " Append custom result: " + importResult7);
                                        break;
                                    case 3:
                                        printWriter.println(p61.q(printWriter) + " Batch config result 1 (use case): " + importResult7);
                                        break;
                                    case 4:
                                        printWriter.println(p61.q(printWriter) + " Batch config result 2 (use case): " + importResult7);
                                        break;
                                    default:
                                        printWriter.println(p61.q(printWriter) + " Append custom result (use case): " + importResult7);
                                        break;
                                }
                                return dn8Var;
                            }
                        });
                        if (!(importResult3.getStatus() instanceof r83)) {
                            objD = null;
                        }
                        importResult4 = (ImportResult) objD;
                        if (importResult4 == null) {
                            return Boolean.FALSE;
                        }
                        z11 = z14;
                        z6 = z15;
                        z8 = z16;
                        z12 = z5;
                        importResult2 = importResult4;
                    }
                } else {
                    c71Var3 = c71Var;
                    z11 = z10;
                    z12 = z5;
                    importResult2 = new ImportResult(0, null, r83.a, 3);
                    z8 = z8;
                    z6 = z6;
                }
                c71Var = c71Var3;
                str10 = str7;
                bool7 = bool6;
                z5 = z12;
            } else {
                z11 = z10;
                str10 = str7;
                bool7 = bool6;
            }
            boolean z110 = z7;
            String str17 = str8;
            MainActivity mainActivity8 = mainActivity3;
            str11 = str9;
            if (importResult2.getCount() <= 0) {
                kw2 kw2Var6 = kw2.a;
                importResult2 = kw2.a(str10, z11, str11);
                final byte b8 = 2;
                k32.i().d().h(new gn2() { // from class: qj4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object B(Object obj3) {
                        byte b9 = b8;
                        dn8 dn8Var = dn8.a;
                        ImportResult importResult7 = importResult2;
                        PrintWriter printWriter = (PrintWriter) obj3;
                        switch (b9) {
                            case 0:
                                int i3 = MainActivity.y1;
                                printWriter.println(p61.q(printWriter) + " Batch config result 1: " + importResult7);
                                break;
                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                int i4 = MainActivity.y1;
                                printWriter.println(p61.q(printWriter) + " Batch config result 2: " + importResult7);
                                break;
                            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                int i5 = MainActivity.y1;
                                printWriter.println(p61.q(printWriter) + " Append custom result: " + importResult7);
                                break;
                            case 3:
                                printWriter.println(p61.q(printWriter) + " Batch config result 1 (use case): " + importResult7);
                                break;
                            case 4:
                                printWriter.println(p61.q(printWriter) + " Batch config result 2 (use case): " + importResult7);
                                break;
                            default:
                                printWriter.println(p61.q(printWriter) + " Append custom result (use case): " + importResult7);
                                break;
                        }
                        return dn8Var;
                    }
                });
                if (!(importResult2.getStatus() instanceof r83)) {
                    importResult2 = null;
                }
                if (importResult2 == null) {
                    return Boolean.FALSE;
                }
            }
            ImportResult importResult7 = importResult2;
            if (fm7.o0(str11)) {
                kw4 kw4Var3 = kw4.a;
                subscriptionItemF = kw4.f(str11);
            } else {
                subscriptionItemF = null;
            }
            ik4Var.f0 = null;
            ik4Var.g0 = null;
            ik4Var.h0 = null;
            ik4Var.i0 = null;
            ik4Var.j0 = null;
            ik4Var.k0 = null;
            ik4Var.l0 = null;
            ik4Var.m0 = null;
            ik4Var.n0 = z110;
            ik4Var.o0 = z5;
            ik4Var.p0 = z8;
            ik4Var.q0 = z6;
            ik4Var.r0 = z11;
            ik4Var.t0 = 4;
            c71Var2 = c71Var;
            objS = mainActivity8.S(importResult7, str11, subscriptionItemF, false, z6, str17, bool7, bool5, z110, z5, list, ik4Var);
            if (objS == c71Var2) {
                return c71Var2;
            }
            return objS;
        }
        return c71Var3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Object P(MainActivity mainActivity, String str, SubscriptionItem subscriptionItem, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, Boolean bool, g83 g83Var, s51 s51Var, int i) {
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            z4 = false;
        }
        if ((i & 128) != 0) {
            z5 = true;
        }
        if ((i & 256) != 0) {
            bool = null;
        }
        if ((i & 512) != 0) {
            g83Var = null;
        }
        return mainActivity.O(str, subscriptionItem, z, z2, z3, str2, z4, z5, bool, g83Var, s51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
    
        if (w51.W(r8, r10, r9) == r15) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        r7 = r28;
        r0 = r33;
        r5 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        if (w51.W(r8, r10, r9) == r15) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015c, code lost:
    
        return r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(String str, boolean z, Boolean bool, Boolean bool2, MainActivity mainActivity, boolean z2, String str2, SubscriptionItem subscriptionItem, s51 s51Var) {
        uk4 uk4Var;
        String str3;
        boolean z3;
        SubscriptionItem subscriptionItem2;
        boolean z4 = z;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        MainActivity mainActivity2 = mainActivity;
        String str4 = str2;
        if (s51Var instanceof uk4) {
            uk4Var = (uk4) s51Var;
            int i = uk4Var.o0;
            if ((i & Integer.MIN_VALUE) != 0) {
                uk4Var.o0 = i - Integer.MIN_VALUE;
            } else {
                uk4Var = new uk4(s51Var);
            }
        } else {
            uk4Var = new uk4(s51Var);
        }
        Object obj = uk4Var.n0;
        int i2 = uk4Var.o0;
        byte b = 2;
        byte b2 = 1;
        q51 q51Var = null;
        c71 c71Var = c71.X;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                z3 = uk4Var.m0;
                z4 = uk4Var.l0;
                SubscriptionItem subscriptionItem3 = uk4Var.k0;
                String str5 = uk4Var.j0;
                mainActivity2 = uk4Var.i0;
                Boolean bool5 = uk4Var.h0;
                Boolean bool6 = uk4Var.g0;
                str3 = uk4Var.f0;
                w39.n0(obj);
                subscriptionItem2 = subscriptionItem3;
                bool3 = bool6;
                str4 = str5;
                bool4 = bool5;
            } else {
                if (i2 != 3) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
            }
            return dn8.a;
        }
        w39.n0(obj);
        if (str != null) {
            subscriptionItem.v0(str, true);
        }
        if (z4) {
            HappApplication happApplication = HappApplication.M0;
            k32.i().d().h(new uq0(subscriptionItem, (byte) 6));
            nf1 nf1Var = tp1.a;
            hv2 hv2Var = dm4.a;
            tk4 tk4Var = new tk4(mainActivity2, subscriptionItem, q51Var, b2);
            uk4Var.f0 = str;
            uk4Var.g0 = bool3;
            uk4Var.h0 = bool4;
            uk4Var.i0 = mainActivity2;
            uk4Var.j0 = str4;
            uk4Var.k0 = subscriptionItem;
            uk4Var.l0 = z4;
            uk4Var.m0 = z2;
            uk4Var.o0 = 1;
        } else {
            HappApplication happApplication2 = HappApplication.M0;
            k32.i().d().h(new uq0(subscriptionItem, (byte) 7));
            nf1 nf1Var2 = tp1.a;
            hv2 hv2Var2 = dm4.a;
            tk4 tk4Var2 = new tk4(mainActivity2, subscriptionItem, q51Var, b);
            uk4Var.f0 = str;
            uk4Var.g0 = bool3;
            uk4Var.h0 = bool4;
            uk4Var.i0 = mainActivity2;
            uk4Var.j0 = str4;
            uk4Var.k0 = subscriptionItem;
            uk4Var.l0 = z4;
            uk4Var.m0 = z2;
            uk4Var.o0 = 2;
        }
        Boolean bool7 = bool4;
        MainActivity mainActivity3 = mainActivity2;
        SubscriptionItem subscriptionItem4 = subscriptionItem2;
        if (bool3 != null) {
            subscriptionItem4.n0(bool3.booleanValue());
        }
        if (bool7 != null) {
            MetaParams metaParams = subscriptionItem4.getMetaParams();
            subscriptionItem4.r0(metaParams != null ? MetaParams.c(metaParams, bool7, null, null, null, null, null, null, -129, -1, 268435455) : new MetaParams(bool7, -129));
        }
        kw4 kw4Var = kw4.a;
        kw4.u(subscriptionItem4, str4);
        HappApplication happApplication3 = HappApplication.M0;
        k32.i().d().h(new uq0(subscriptionItem4, (byte) 8));
        uk4Var.f0 = null;
        uk4Var.g0 = null;
        uk4Var.h0 = null;
        uk4Var.i0 = null;
        uk4Var.j0 = null;
        uk4Var.k0 = null;
        uk4Var.l0 = z4;
        uk4Var.m0 = z3;
        uk4Var.o0 = 3;
        if (P(mainActivity3, str4, subscriptionItem4, false, z3, false, str3, false, false, null, null, uk4Var, 976) == c71Var) {
            return c71Var;
        }
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void U(View view) {
        view.animate().scaleX(1.1f).scaleY(1.1f).setDuration(150L).start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void V(View view) {
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HappSnackbarHost A() {
        b6 b6Var = this.Q0;
        if (b6Var != null) {
            return b6Var.B0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(ServerCache serverCache) {
        if (serverCache == null || G().u()) {
            return;
        }
        G().H(serverCache.getGuid());
        jm4.Q(ys0.z(((ComponentActivity) this).X), (u61) null, new wj4(this, null, (byte) 0), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        b6 b6Var = this.Q0;
        if (b6Var == null) {
            dh3.T("binding");
            throw null;
        }
        AppCompatTextView appCompatTextView = b6Var.l0;
        rp7.e(appCompatTextView, G().u());
        appCompatTextView.setText(getString(y46.btn_disconnect));
        b6 b6Var2 = this.Q0;
        if (b6Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        rp7.e(b6Var2.k0, G().u());
        b0(G().u());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4 A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:53:0x00ee, B:55:0x00f4), top: B:70:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:77:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:0: B:70:0x00ee->B:79:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final Object D(Intent intent, s51 s51Var) throws FileNotFoundException {
        zj4 zj4Var;
        int i;
        Throwable th;
        ?? r3;
        String str;
        Closeable closeable;
        Iterator it;
        Closeable closeable2;
        Closeable closeable3;
        String str2;
        int i2;
        if (s51Var instanceof zj4) {
            zj4Var = (zj4) s51Var;
            i2 = zj4Var.j0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = i2 - Integer.MIN_VALUE;
                zj4Var.j0 = i3;
                i = i3;
            } else {
                zj4Var = new zj4(this, s51Var);
                i = i2;
            }
        } else {
            zj4Var = new zj4(this, s51Var);
            i = i2;
        }
        zj4 zj4Var2 = zj4Var;
        Object objL = zj4Var2.h0;
        int i4 = zj4Var2.j0;
        Boolean boolValueOf = dn8.a;
        Boolean bool = null;
        c71 c71Var = c71.X;
        try {
            if (i4 == 0) {
                w39.n0(objL);
                Uri data = intent.getData();
                if (data == null) {
                    return Boolean.FALSE;
                }
                InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(data);
                if (inputStreamOpenInputStream != null) {
                    try {
                        ArrayList arrayListD = dt7.d(new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, iq0.a), 8192));
                        String path = data.getPath();
                        if (path == null || !mm7.R(path, false, ".json")) {
                            String str3 = (String) wv0.t0(arrayListD);
                            if ((str3 == null || !fm7.G0('[', str3)) && ((str = (String) wv0.t0(arrayListD)) == null || !fm7.G0('{', str))) {
                                Iterator it2 = arrayListD.iterator();
                                closeable = inputStreamOpenInputStream;
                                it = it2;
                                while (it.hasNext()) {
                                    str2 = (String) it.next();
                                    zj4Var2.f0 = closeable;
                                    zj4Var2.g0 = it;
                                    zj4Var2.j0 = 2;
                                    if (L(this, str2, false, null, null, null, zj4Var2, 248) == c71Var) {
                                    }
                                }
                                closeable3 = closeable;
                            } else {
                                String strY0 = wv0.y0(arrayListD, "", (String) null, (String) null, (gn2) null, 62);
                                zj4Var2.f0 = inputStreamOpenInputStream;
                                zj4Var2.j0 = 1;
                                objL = L(this, strY0, false, null, null, null, zj4Var2, 120);
                                if (objL != c71Var) {
                                    closeable2 = inputStreamOpenInputStream;
                                    boolValueOf = Boolean.valueOf(!((Boolean) objL).booleanValue());
                                    closeable3 = closeable2;
                                }
                            }
                            return c71Var;
                        }
                        Q(wv0.y0(arrayListD, "", (String) null, (String) null, (gn2) null, 62), false);
                        closeable3 = inputStreamOpenInputStream;
                        oc.h(closeable3, (Throwable) null);
                        bool = boolValueOf;
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = inputStreamOpenInputStream;
                        throw th;
                    }
                }
            } else if (i4 == 1) {
                Closeable closeable4 = zj4Var2.f0;
                w39.n0(objL);
                closeable2 = closeable4;
                boolValueOf = Boolean.valueOf(!((Boolean) objL).booleanValue());
                closeable3 = closeable2;
                oc.h(closeable3, (Throwable) null);
                bool = boolValueOf;
            } else {
                if (i4 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Iterator it3 = zj4Var2.g0;
                Closeable closeable5 = zj4Var2.f0;
                w39.n0(objL);
                it = it3;
                closeable = closeable5;
                while (it.hasNext()) {
                    try {
                        str2 = (String) it.next();
                        zj4Var2.f0 = closeable;
                        zj4Var2.g0 = it;
                        zj4Var2.j0 = 2;
                        if (L(this, str2, false, null, null, null, zj4Var2, 248) == c71Var) {
                            return c71Var;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r3 = closeable;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            oc.h((Closeable) r3, th);
                            throw th4;
                        }
                    }
                }
                closeable3 = closeable;
                oc.h(closeable3, (Throwable) null);
                bool = boolValueOf;
            }
            return Boolean.valueOf(bool != null);
        } catch (Throwable th5) {
            th = th5;
            r3 = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:75:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0186  */
    /* JADX WARN: Code duplicated, block: B:87:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[LOOP:0: B:80:0x0180->B:93:?, LOOP_END, SYNTHETIC] */
    public final Object E(s51 s51Var) {
        dk4 dk4Var;
        qs7 qs7VarA;
        int i;
        SubscriptionAutoConnectType subscriptionAutoConnectType;
        ArrayList arrayList;
        int i2;
        Object next;
        int i3;
        ArrayList arrayList2;
        fs7 fs7Var;
        fs7 fs7Var2;
        Iterator it;
        Object objR;
        if (s51Var instanceof dk4) {
            dk4Var = (dk4) s51Var;
            int i4 = dk4Var.k0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dk4Var.k0 = i4 - Integer.MIN_VALUE;
            } else {
                dk4Var = new dk4(this, s51Var);
            }
        } else {
            dk4Var = new dk4(this, s51Var);
        }
        Object objQ = dk4Var.i0;
        int i5 = dk4Var.k0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        int i6 = 1;
        if (i5 == 0) {
            w39.n0(objQ);
            MainViewModel mainViewModelG = G();
            dk4Var.k0 = 1;
            objQ = gv3.q(new j31(new o(mainViewModelG.H, (byte) 14), (byte) 6), dk4Var);
            if (objQ != c71Var) {
            }
            return c71Var;
        }
        if (i5 == 1) {
            w39.n0(objQ);
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    w39.n0(objQ);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i6 = dk4Var.h0;
            i3 = dk4Var.g0;
            arrayList2 = dk4Var.f0;
            w39.n0(objQ);
        }
        i = i3;
        arrayList = arrayList2;
        i2 = i6;
        if (i2 == 0 && (arrayList == null || !arrayList.isEmpty())) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                if (((qs7) ((qg5) it.next()).X).c) {
                    dk4Var.f0 = null;
                    dk4Var.g0 = i;
                    dk4Var.h0 = i2;
                    dk4Var.k0 = 3;
                    objR = G().R(dk4Var, null, false);
                    if (objR != c71Var) {
                        objR = dn8Var;
                    }
                    if (objR == c71Var) {
                        return c71Var;
                    }
                }
            }
        }
        return dn8Var;
        ConfigGroupCache configGroupCache = (ConfigGroupCache) objQ;
        if (configGroupCache != null) {
            String subId = configGroupCache.getSubId();
            HappApplication happApplication = HappApplication.M0;
            qs7VarA = k32.i().h().a(subId);
        } else {
            qs7VarA = null;
        }
        i = (qs7VarA == null || (fs7Var2 = qs7VarA.d) == null || !fs7Var2.a) ? 0 : 1;
        if (qs7VarA == null || (fs7Var = qs7VarA.d) == null || (subscriptionAutoConnectType = fs7Var.b) == null) {
            subscriptionAutoConnectType = SubscriptionAutoConnectType.LAST_USED;
        }
        CopyOnWriteArrayList<ConfigGroupCache> copyOnWriteArrayList = G().q;
        arrayList = new ArrayList();
        for (ConfigGroupCache configGroupCache2 : copyOnWriteArrayList) {
            HappApplication happApplication2 = HappApplication.M0;
            qs7 qs7VarA2 = k32.i().h().a(configGroupCache2.getSubId());
            qg5 qg5Var = qs7VarA2 != null ? new qg5(qs7VarA2, configGroupCache2) : null;
            if (qg5Var != null) {
                arrayList.add(qg5Var);
            }
        }
        if (i == 0 || subscriptionAutoConnectType == SubscriptionAutoConnectType.LAST_USED) {
            if (i != 0) {
                Iterator it2 = configGroupCache.getConfigs().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((ServerCache) next).getIsSelected());
                B((ServerCache) next);
            }
            i2 = 0;
            if (i2 == 0) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((qs7) ((qg5) it.next()).X).c) {
                        dk4Var.f0 = null;
                        dk4Var.g0 = i;
                        dk4Var.h0 = i2;
                        dk4Var.k0 = 3;
                        objR = G().R(dk4Var, null, false);
                        if (objR != c71Var) {
                            objR = dn8Var;
                        }
                        if (objR == c71Var) {
                        }
                    }
                }
            }
            return dn8Var;
        }
        ArrayList arrayList3 = G().r;
        sd2 sd2Var = new sd2(new la2(new hu(arrayList, (byte) 1), true, new uh3((byte) 21)), new uh3((byte) 22), z27.X);
        arrayList3.getClass();
        arrayList3.clear();
        rd2 it3 = sd2Var.iterator();
        while (true) {
            rd2 rd2Var = it3;
            if (!rd2Var.hasNext()) {
                break;
            }
            arrayList3.add(rd2Var.next());
        }
        G().s = new a23(this, subscriptionAutoConnectType, (byte) 6);
        String subId2 = configGroupCache.getSubId();
        dk4Var.f0 = arrayList;
        dk4Var.g0 = i;
        dk4Var.h0 = 1;
        dk4Var.k0 = 2;
        Object objR2 = G().R(dk4Var, subId2, false);
        if (objR2 != c71Var) {
            objR2 = dn8Var;
        }
        if (objR2 != c71Var) {
            i3 = i;
            arrayList2 = arrayList;
            i = i3;
            arrayList = arrayList2;
            i2 = i6;
            if (i2 == 0) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((qs7) ((qg5) it.next()).X).c) {
                        dk4Var.f0 = null;
                        dk4Var.g0 = i;
                        dk4Var.h0 = i2;
                        dk4Var.k0 = 3;
                        objR = G().R(dk4Var, null, false);
                        if (objR != c71Var) {
                            objR = dn8Var;
                        }
                        if (objR == c71Var) {
                        }
                    }
                }
            }
            return dn8Var;
        }
        return c71Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final dw7 F() {
        return (dw7) this.S0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MainViewModel G() {
        return (MainViewModel) this.e1.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MMKV H() {
        return (MMKV) this.V0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(Intent intent) {
        String stringExtra;
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            g94 g94Var = ((ComponentActivity) this).X;
            if (iHashCode == -1173171990) {
                if (action.equals("android.intent.action.VIEW")) {
                    jm4.Q(ys0.z(g94Var), (u61) null, new pi(intent, this, (q51) null, (byte) 12), 3);
                }
            } else if (iHashCode == -746632332 && action.equals("reset_sub_import") && (stringExtra = intent.getStringExtra("reset_sub_url")) != null) {
                jm4.Q(ys0.z(g94Var), (u61) null, new fk4(this, stringExtra, null, (byte) 2), 3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void J(t83 t83Var, boolean z) {
        if (t83Var instanceof m83) {
            String string = getString(y46.dialog_subscription_update_msg_parsing_error_empty_clipboard);
            string.getClass();
            e0(string, false);
            return;
        }
        if (t83Var instanceof o83) {
            String string2 = getString(y46.dialog_subscription_update_msg_parsing_error_invalid_deeplink);
            string2.getClass();
            e0(string2, z);
            return;
        }
        if (t83Var instanceof s83) {
            String string3 = getString(y46.dialog_subscription_update_msg_parsing_error_unknown_deeplink);
            string3.getClass();
            e0(string3, z);
            return;
        }
        if (t83Var instanceof p83) {
            String string4 = getString(y46.dialog_subscription_update_msg_parsing_error_invalid_routing);
            string4.getClass();
            e0(string4, z);
            return;
        }
        if (t83Var instanceof q83) {
            String string5 = getString(y46.dialog_subscription_update_msg_parsing_error_invalid_server, ((q83) t83Var).a);
            string5.getClass();
            e0(string5, z);
        } else if (t83Var instanceof n83) {
            String string6 = getString(y46.dialog_subscription_update_msg_parsing_error_invalid_array_json_server);
            string6.getClass();
            e0(string6, z);
        } else {
            if (!(t83Var instanceof r83)) {
                b61.c();
                return;
            }
            String string7 = getString(y46.dialog_subscription_update_msg_parsing_error_invalid_unknown_content_type);
            string7.getClass();
            e0(string7, z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object K(String str, boolean z, String str2, String str3, Boolean bool, Boolean bool2, boolean z2, s51 s51Var) throws Throwable {
        hk4 hk4Var;
        Boolean bool3;
        o15 o15Var;
        Boolean bool4;
        boolean z3;
        boolean z4;
        String str4;
        String str5;
        Object objPutIfAbsent;
        Throwable th;
        o15 o15Var2;
        if (s51Var instanceof hk4) {
            hk4Var = (hk4) s51Var;
            int i = hk4Var.p0;
            if ((i & Integer.MIN_VALUE) != 0) {
                hk4Var.p0 = i - Integer.MIN_VALUE;
            } else {
                hk4Var = new hk4(this, s51Var);
            }
        } else {
            hk4Var = new hk4(this, s51Var);
        }
        hk4 hk4Var2 = hk4Var;
        Object objM = hk4Var2.n0;
        int i2 = hk4Var2.p0;
        c71 c71Var = c71.X;
        try {
            if (i2 == 0) {
                w39.n0(objM);
                SubId subId = new SubId(str2);
                ConcurrentHashMap concurrentHashMap = this.n1;
                Object objA = concurrentHashMap.get(subId);
                if (objA == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(subId, (objA = r15.a()))) != null) {
                    objA = objPutIfAbsent;
                }
                o15 o15Var3 = (o15) objA;
                hk4Var2.f0 = str;
                hk4Var2.g0 = str2;
                hk4Var2.h0 = str3;
                hk4Var2.i0 = bool;
                hk4Var2.j0 = bool2;
                hk4Var2.k0 = o15Var3;
                hk4Var2.l0 = z;
                hk4Var2.m0 = z2;
                hk4Var2.p0 = 1;
                if (o15Var3.g(hk4Var2) != c71Var) {
                    bool3 = bool;
                    o15Var = o15Var3;
                    bool4 = bool2;
                    z3 = z;
                    z4 = z2;
                    str4 = str2;
                    str5 = str3;
                }
                return c71Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o15Var2 = hk4Var2.k0;
                try {
                    w39.n0(objM);
                    Boolean bool5 = (Boolean) objM;
                    bool5.getClass();
                    o15Var2.m((Object) null);
                    return bool5;
                } catch (Throwable th2) {
                    th = th2;
                    o15Var2.m((Object) null);
                    throw th;
                }
            }
            boolean z5 = hk4Var2.m0;
            boolean z6 = hk4Var2.l0;
            o15Var = hk4Var2.k0;
            Boolean bool6 = hk4Var2.j0;
            Boolean bool7 = hk4Var2.i0;
            String str6 = hk4Var2.h0;
            str4 = hk4Var2.g0;
            String str7 = hk4Var2.f0;
            w39.n0(objM);
            z4 = z5;
            str = str7;
            str5 = str6;
            bool4 = bool6;
            bool3 = bool7;
            z3 = z6;
            hk4Var2.f0 = null;
            hk4Var2.g0 = null;
            hk4Var2.h0 = null;
            hk4Var2.i0 = null;
            hk4Var2.j0 = null;
            hk4Var2.k0 = o15Var;
            hk4Var2.l0 = z3;
            hk4Var2.m0 = z4;
            hk4Var2.p0 = 2;
            objM = M(str, this, z3, z4, str4, str5, bool3, bool4, hk4Var2);
            if (objM != c71Var) {
                o15Var2 = o15Var;
                Boolean bool8 = (Boolean) objM;
                bool8.getClass();
                o15Var2.m((Object) null);
                return bool8;
            }
            return c71Var;
        } catch (Throwable th3) {
            th = th3;
            o15Var2 = o15Var;
            o15Var2.m((Object) null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void N() {
        try {
            ss8 ss8Var = ss8.a;
            String strG = ss8.g(this);
            u84 u84VarZ = ys0.z(((ComponentActivity) this).X);
            nf1 nf1Var = tp1.a;
            jm4.Q(u84VarZ, ye1.Z, new fk4(this, strG, null, (byte) 3), 2);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:102:0x0368  */
    /* JADX WARN: Code duplicated, block: B:104:0x036c  */
    /* JADX WARN: Code duplicated, block: B:105:0x037b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0380  */
    /* JADX WARN: Code duplicated, block: B:110:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:112:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:114:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x03df  */
    /* JADX WARN: Code duplicated, block: B:121:0x0401  */
    /* JADX WARN: Code duplicated, block: B:123:0x0408  */
    /* JADX WARN: Code duplicated, block: B:125:0x0413  */
    /* JADX WARN: Code duplicated, block: B:128:0x0434 A[PHI: r0 r2 r3 r4 r5 r6 r7
  0x0434: PHI (r0v42 boolean) = (r0v35 boolean), (r0v35 boolean), (r0v43 boolean) binds: [B:124:0x0411, B:126:0x0431, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0434: PHI (r2v26 boolean) = (r2v19 boolean), (r2v19 boolean), (r2v27 boolean) binds: [B:124:0x0411, B:126:0x0431, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0434: PHI (r3v15 boolean) = (r3v8 boolean), (r3v8 boolean), (r3v16 boolean) binds: [B:124:0x0411, B:126:0x0431, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0434: PHI (r4v13 boolean) = (r4v6 boolean), (r4v6 boolean), (r4v14 boolean) binds: [B:124:0x0411, B:126:0x0431, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0434: PHI (r5v18 boolean) = (r5v11 boolean), (r5v11 boolean), (r5v19 boolean) binds: [B:124:0x0411, B:126:0x0431, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0434: PHI (r6v24 java.lang.String) = (r6v10 java.lang.String), (r6v10 java.lang.String), (r6v25 java.lang.String) binds: [B:124:0x0411, B:126:0x0431, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0434: PHI (r7v23 su.happ.proxyutility.feature.main.MainActivity) = 
  (r7v15 su.happ.proxyutility.feature.main.MainActivity)
  (r7v15 su.happ.proxyutility.feature.main.MainActivity)
  (r7v24 su.happ.proxyutility.feature.main.MainActivity)
 binds: [B:124:0x0411, B:126:0x0431, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x0469  */
    /* JADX WARN: Code duplicated, block: B:134:0x046c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0471  */
    /* JADX WARN: Code duplicated, block: B:139:0x049a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:143:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0058 A[PHI: r0 r2 r3 r4 r5 r6 r7
  0x0058: PHI (r0v44 boolean) = (r0v42 boolean), (r0v46 boolean) binds: [B:129:0x0456, B:13:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r2v28 boolean) = (r2v26 boolean), (r2v29 boolean) binds: [B:129:0x0456, B:13:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r3v17 boolean) = (r3v15 boolean), (r3v18 boolean) binds: [B:129:0x0456, B:13:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r4v15 boolean) = (r4v13 boolean), (r4v16 boolean) binds: [B:129:0x0456, B:13:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r5v20 boolean) = (r5v18 boolean), (r5v21 boolean) binds: [B:129:0x0456, B:13:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r6v26 java.lang.String) = (r6v24 java.lang.String), (r6v34 java.lang.String) binds: [B:129:0x0456, B:13:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r7v25 su.happ.proxyutility.feature.main.MainActivity) = (r7v23 su.happ.proxyutility.feature.main.MainActivity), (r7v26 su.happ.proxyutility.feature.main.MainActivity) binds: [B:129:0x0456, B:13:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x0213  */
    /* JADX WARN: Code duplicated, block: B:74:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x021d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0233  */
    /* JADX WARN: Code duplicated, block: B:78:0x0236  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code duplicated, block: B:81:0x0256  */
    /* JADX WARN: Code duplicated, block: B:83:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0260  */
    /* JADX WARN: Code duplicated, block: B:85:0x0276  */
    /* JADX WARN: Code duplicated, block: B:87:0x0279  */
    /* JADX WARN: Code duplicated, block: B:93:0x032b  */
    /* JADX WARN: Code duplicated, block: B:96:0x033d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0345 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0347  */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0498, code lost:
    
        if (u70.G(r8, r10) == r12) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d6, code lost:
    
        if (r9.a(r15, r10) == r12) goto L139;
     */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [g83, java.lang.Boolean, java.lang.String, su.happ.proxyutility.dto.SubscriptionItem] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [g83, java.lang.Boolean, java.lang.String, su.happ.proxyutility.dto.SubscriptionItem] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(String str, SubscriptionItem subscriptionItem, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, Boolean bool, g83 g83Var, s51 s51Var) {
        jk4 jk4Var;
        boolean z6;
        boolean z7;
        g83 g83Var2;
        String str3;
        SubscriptionItem subscriptionItem2;
        Boolean bool2;
        String str4;
        Boolean bool3;
        g83 g83Var3;
        rj6 rj6Var;
        String url;
        o83 o83Var;
        ?? r11;
        ?? r12;
        boolean z8;
        g83 g83Var4;
        boolean z9;
        boolean z10;
        Object objB;
        boolean z11;
        g83 g83Var5;
        String str5;
        xu7 xu7Var;
        g83 g83Var6;
        MainActivity mainActivity;
        Throwable th;
        g83 g83Var7;
        g83 g83Var8;
        g83 g83Var9;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        g83 g83Var10;
        MainViewModel mainViewModelG;
        boolean z16;
        String str6;
        qs7 qs7VarA;
        SubscriptionSortType subscriptionSortType;
        boolean z17 = z2;
        boolean z18 = z4;
        boolean z19 = z5;
        if (s51Var instanceof jk4) {
            jk4Var = (jk4) s51Var;
            int i = jk4Var.r0;
            if ((i & Integer.MIN_VALUE) != 0) {
                jk4Var.r0 = i - Integer.MIN_VALUE;
            } else {
                jk4Var = new jk4(this, s51Var);
            }
        } else {
            jk4Var = new jk4(this, s51Var);
        }
        Object obj = jk4Var.p0;
        int i2 = jk4Var.r0;
        jo1 jo1Var = jo1.g0;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        switch (i2) {
            case 0:
                w39.n0(obj);
                if (dh3.f(subscriptionItem.getImport(), Boolean.FALSE)) {
                    if (g83Var != null) {
                        jk4Var.f0 = null;
                        jk4Var.g0 = null;
                        jk4Var.h0 = null;
                        jk4Var.i0 = null;
                        jk4Var.j0 = null;
                        jk4Var.k0 = z;
                        jk4Var.l0 = z17;
                        jk4Var.m0 = z3;
                        jk4Var.n0 = z18;
                        jk4Var.o0 = z19;
                        jk4Var.r0 = 1;
                        if (g83Var.t(false, jk4Var) == c71Var) {
                            return c71Var;
                        }
                    }
                    return dn8Var;
                }
                ss8 ss8Var = ss8.a;
                if (!ss8.x() && z19) {
                    if (!z18) {
                        m51 m51Var = ko1.B1;
                        km4.l0(n(), jo1Var, (String) null);
                    }
                    if (g83Var != null) {
                        jk4Var.f0 = null;
                        jk4Var.g0 = null;
                        jk4Var.h0 = null;
                        jk4Var.i0 = null;
                        jk4Var.j0 = null;
                        jk4Var.k0 = z;
                        jk4Var.l0 = z17;
                        jk4Var.m0 = z3;
                        jk4Var.n0 = z18;
                        jk4Var.o0 = z19;
                        jk4Var.r0 = 2;
                        if (g83Var.t(false, jk4Var) == c71Var) {
                        }
                    }
                    return dn8Var;
                }
                if (!z18) {
                    m51 m51Var2 = ko1.B1;
                    km4.l0(n(), z3 ? jo1.Y : jo1.X, (String) null);
                }
                if (z3) {
                    HappApplication happApplication = HappApplication.M0;
                    qq0 qq0Var = (qq0) k32.i().j0.getValue();
                    jk4Var.f0 = str;
                    jk4Var.g0 = subscriptionItem;
                    jk4Var.h0 = str2;
                    jk4Var.i0 = bool;
                    jk4Var.j0 = g83Var;
                    jk4Var.k0 = z;
                    jk4Var.l0 = z17;
                    jk4Var.m0 = z3;
                    jk4Var.n0 = z18;
                    jk4Var.o0 = z19;
                    jk4Var.r0 = 3;
                    if (qq0.d(qq0Var, subscriptionItem, str, jk4Var, 92) != c71Var) {
                        str4 = str;
                        bool3 = bool;
                        subscriptionItem2 = subscriptionItem;
                        g83Var3 = g83Var;
                        str3 = str2;
                        z6 = z;
                        z7 = z3;
                        HappApplication happApplication2 = HappApplication.M0;
                        us usVar = (us) k32.i().m0.getValue();
                        jk4Var.f0 = str4;
                        jk4Var.g0 = subscriptionItem2;
                        jk4Var.h0 = str3;
                        jk4Var.i0 = bool3;
                        jk4Var.j0 = g83Var3;
                        jk4Var.k0 = z6;
                        jk4Var.l0 = z17;
                        jk4Var.m0 = z7;
                        jk4Var.n0 = z18;
                        jk4Var.o0 = z19;
                        jk4Var.r0 = 4;
                    }
                    break;
                } else {
                    z6 = z;
                    z7 = z3;
                    g83Var2 = g83Var;
                    str3 = str2;
                    subscriptionItem2 = subscriptionItem;
                    bool2 = bool;
                    str4 = str;
                    if (!subscriptionItem2.getEncryptedUrl()) {
                        url = subscriptionItem2.getUrl();
                    } else {
                        try {
                            ss8 ss8Var2 = ss8.a;
                            rj6Var = ss8.s(subscriptionItem2.getUrl());
                        } catch (Throwable th2) {
                            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                                throw th2;
                            }
                            rj6Var = new rj6(th2);
                        }
                        if (rj6Var instanceof rj6) {
                            rj6Var = null;
                        }
                        url = (String) rj6Var;
                        o83Var = o83.a;
                        if (url == null) {
                            if (z18) {
                                r12 = 0;
                            } else {
                                m51 m51Var3 = ko1.B1;
                                km4.x(n());
                                r12 = 0;
                                W(new ImportResult(0, o83Var, null, 5), z17, true);
                            }
                            if (g83Var2 != null) {
                                jk4Var.f0 = r12;
                                jk4Var.g0 = r12;
                                jk4Var.h0 = r12;
                                jk4Var.i0 = r12;
                                jk4Var.j0 = r12;
                                jk4Var.k0 = z6;
                                jk4Var.l0 = z17;
                                jk4Var.m0 = z7;
                                jk4Var.n0 = z18;
                                jk4Var.o0 = z19;
                                jk4Var.r0 = 5;
                                if (g83Var2.t(false, jk4Var) == c71Var) {
                                }
                            }
                            return dn8Var;
                        }
                        ss8 ss8Var3 = ss8.a;
                        if (!ss8.z(url)) {
                            if (z18) {
                                r11 = 0;
                            } else {
                                m51 m51Var4 = ko1.B1;
                                km4.x(n());
                                r11 = 0;
                                W(new ImportResult(0, o83Var, null, 5), z17, true);
                            }
                            if (g83Var2 != null) {
                                jk4Var.f0 = r11;
                                jk4Var.g0 = r11;
                                jk4Var.h0 = r11;
                                jk4Var.i0 = r11;
                                jk4Var.j0 = r11;
                                jk4Var.k0 = z6;
                                jk4Var.l0 = z17;
                                jk4Var.m0 = z7;
                                jk4Var.n0 = z18;
                                jk4Var.o0 = z19;
                                jk4Var.r0 = 6;
                                if (g83Var2.t(false, jk4Var) == c71Var) {
                                }
                            }
                            return dn8Var;
                        }
                    }
                    pr7 pr7Var = (pr7) this.X0.getValue();
                    String str7 = url;
                    Boolean bool4 = bool2;
                    q30 q30Var = new q30(z18, this, (byte) 2);
                    boolean z20 = z6;
                    boolean z21 = z18;
                    z8 = z19;
                    g83Var4 = g83Var2;
                    SubscriptionItem subscriptionItem3 = subscriptionItem2;
                    ok4 ok4Var = new ok4(z21, this, subscriptionItem3, bool4, z17, str4, z20, str3, z8, g83Var4);
                    z9 = z21;
                    zs1 zs1Var = new zs1(this, z17, (byte) 4);
                    pk4 pk4Var = new pk4(this, str4, subscriptionItem3, z20, str3, z17, null);
                    z10 = z20;
                    jk4Var.f0 = str4;
                    jk4Var.g0 = subscriptionItem2;
                    jk4Var.h0 = null;
                    jk4Var.i0 = null;
                    jk4Var.j0 = g83Var4;
                    jk4Var.k0 = z10;
                    jk4Var.l0 = z17;
                    jk4Var.m0 = z7;
                    jk4Var.n0 = z9;
                    jk4Var.o0 = z8;
                    jk4Var.r0 = 7;
                    objB = pr7.b(pr7Var, str4, z10, str7, q30Var, ok4Var, zs1Var, pk4Var, bool4, jk4Var, 128);
                    if (objB != c71Var) {
                        obj = objB;
                        z11 = z8;
                        g83Var5 = g83Var4;
                        str5 = str4;
                        xu7Var = (av7) obj;
                        G().W(str5);
                        if (xu7Var instanceof xu7) {
                            th = xu7Var.a;
                            if (th instanceof ym) {
                                if (!z9) {
                                    m51 m51Var5 = ko1.B1;
                                    km4.l0(n(), jo1Var, (String) null);
                                }
                                HappApplication happApplication3 = HappApplication.M0;
                                k32.i().d().h(new uh3((byte) 23));
                            } else if (th instanceof xz1) {
                                W(new ImportResult(0, m83.a, null, 5), z17, true);
                            } else {
                                if (!(th instanceof j02)) {
                                    g83Var7 = g83Var5;
                                    if ((th instanceof au7) && !z9) {
                                        m51 m51Var6 = ko1.B1;
                                        km4.x(n());
                                    }
                                    g83Var10 = g83Var7;
                                    if (g83Var10 != null) {
                                        jk4Var.f0 = null;
                                        jk4Var.g0 = null;
                                        jk4Var.h0 = null;
                                        jk4Var.i0 = null;
                                        jk4Var.j0 = null;
                                        jk4Var.k0 = z10;
                                        jk4Var.l0 = z17;
                                        jk4Var.m0 = z7;
                                        jk4Var.n0 = z9;
                                        jk4Var.o0 = z11;
                                        jk4Var.r0 = 9;
                                        if (g83Var10.t(false, jk4Var) == c71Var) {
                                        }
                                    }
                                    return dn8Var;
                                }
                                jk4Var.f0 = null;
                                jk4Var.g0 = null;
                                jk4Var.h0 = null;
                                jk4Var.i0 = null;
                                jk4Var.j0 = g83Var5;
                                jk4Var.k0 = z10;
                                jk4Var.l0 = z17;
                                jk4Var.m0 = z7;
                                jk4Var.n0 = z9;
                                jk4Var.o0 = z11;
                                jk4Var.r0 = 8;
                                nf1 nf1Var = tp1.a;
                                g83Var8 = g83Var5;
                                if (w51.W(dm4.a, new zh4(z9, this, subscriptionItem2, g83Var8, null), jk4Var) != c71Var) {
                                    boolean z22 = z10;
                                    g83Var9 = g83Var8;
                                    z12 = z9;
                                    z13 = z7;
                                    z14 = z17;
                                    z15 = z22;
                                    g83Var10 = g83Var9;
                                    z10 = z15;
                                    z17 = z14;
                                    z7 = z13;
                                    z9 = z12;
                                    if (g83Var10 != null) {
                                        jk4Var.f0 = null;
                                        jk4Var.g0 = null;
                                        jk4Var.h0 = null;
                                        jk4Var.i0 = null;
                                        jk4Var.j0 = null;
                                        jk4Var.k0 = z10;
                                        jk4Var.l0 = z17;
                                        jk4Var.m0 = z7;
                                        jk4Var.n0 = z9;
                                        jk4Var.o0 = z11;
                                        jk4Var.r0 = 9;
                                        if (g83Var10.t(false, jk4Var) == c71Var) {
                                        }
                                    }
                                    return dn8Var;
                                }
                            }
                            g83Var7 = g83Var5;
                            g83Var10 = g83Var7;
                            if (g83Var10 != null) {
                                jk4Var.f0 = null;
                                jk4Var.g0 = null;
                                jk4Var.h0 = null;
                                jk4Var.i0 = null;
                                jk4Var.j0 = null;
                                jk4Var.k0 = z10;
                                jk4Var.l0 = z17;
                                jk4Var.m0 = z7;
                                jk4Var.n0 = z9;
                                jk4Var.o0 = z11;
                                jk4Var.r0 = 9;
                                if (g83Var10.t(false, jk4Var) == c71Var) {
                                }
                            }
                            return dn8Var;
                        }
                        g83Var6 = g83Var5;
                        mainActivity = this;
                        if (!z9) {
                            m51 m51Var7 = ko1.B1;
                            km4.x(mainActivity.n());
                        }
                        if (g83Var6 != null) {
                            jk4Var.f0 = str5;
                            jk4Var.g0 = null;
                            jk4Var.h0 = null;
                            jk4Var.i0 = null;
                            jk4Var.j0 = null;
                            jk4Var.k0 = z10;
                            jk4Var.l0 = z17;
                            jk4Var.m0 = z7;
                            jk4Var.n0 = z9;
                            jk4Var.o0 = z11;
                            jk4Var.r0 = 10;
                            if (g83Var6.t(true, jk4Var) != c71Var) {
                                mainViewModelG = mainActivity.G();
                                jk4Var.f0 = str5;
                                jk4Var.g0 = null;
                                jk4Var.h0 = null;
                                jk4Var.i0 = null;
                                jk4Var.j0 = null;
                                jk4Var.k0 = z10;
                                jk4Var.l0 = z17;
                                jk4Var.m0 = z7;
                                jk4Var.n0 = z9;
                                jk4Var.o0 = z11;
                                jk4Var.r0 = 11;
                                if (mainViewModelG.D(jk4Var, null, false) != c71Var) {
                                    z16 = z11;
                                    str6 = str5;
                                    HappApplication happApplication4 = HappApplication.M0;
                                    qs7VarA = k32.i().h().a(str6);
                                    if (qs7VarA != null) {
                                        subscriptionSortType = qs7VarA.j;
                                    } else {
                                        subscriptionSortType = null;
                                    }
                                    if (subscriptionSortType == SubscriptionSortType.PING) {
                                        be beVar = gx1.Y;
                                        long jL0 = vj8.l0(500, lx1.Z);
                                        jk4Var.f0 = str6;
                                        jk4Var.g0 = null;
                                        jk4Var.h0 = null;
                                        jk4Var.i0 = null;
                                        jk4Var.j0 = null;
                                        jk4Var.k0 = z10;
                                        jk4Var.l0 = z17;
                                        jk4Var.m0 = z7;
                                        jk4Var.n0 = z9;
                                        jk4Var.o0 = z16;
                                        jk4Var.r0 = 12;
                                        break;
                                    }
                                    return dn8Var;
                                }
                            }
                        } else {
                            mainViewModelG = mainActivity.G();
                            jk4Var.f0 = str5;
                            jk4Var.g0 = null;
                            jk4Var.h0 = null;
                            jk4Var.i0 = null;
                            jk4Var.j0 = null;
                            jk4Var.k0 = z10;
                            jk4Var.l0 = z17;
                            jk4Var.m0 = z7;
                            jk4Var.n0 = z9;
                            jk4Var.o0 = z11;
                            jk4Var.r0 = 11;
                            if (mainViewModelG.D(jk4Var, null, false) != c71Var) {
                                z16 = z11;
                                str6 = str5;
                                HappApplication happApplication5 = HappApplication.M0;
                                qs7VarA = k32.i().h().a(str6);
                                if (qs7VarA != null) {
                                    subscriptionSortType = qs7VarA.j;
                                } else {
                                    subscriptionSortType = null;
                                }
                                if (subscriptionSortType == SubscriptionSortType.PING) {
                                    be beVar2 = gx1.Y;
                                    long jL1 = vj8.l0(500, lx1.Z);
                                    jk4Var.f0 = str6;
                                    jk4Var.g0 = null;
                                    jk4Var.h0 = null;
                                    jk4Var.i0 = null;
                                    jk4Var.j0 = null;
                                    jk4Var.k0 = z10;
                                    jk4Var.l0 = z17;
                                    jk4Var.m0 = z7;
                                    jk4Var.n0 = z9;
                                    jk4Var.o0 = z16;
                                    jk4Var.r0 = 12;
                                    break;
                                }
                                return dn8Var;
                            }
                        }
                    }
                }
                return c71Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w39.n0(obj);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                w39.n0(obj);
                return dn8Var;
            case 3:
                boolean z23 = jk4Var.o0;
                boolean z24 = jk4Var.n0;
                z7 = jk4Var.m0;
                z17 = jk4Var.l0;
                z6 = jk4Var.k0;
                g83 g83Var11 = jk4Var.j0;
                Boolean bool5 = jk4Var.i0;
                str3 = jk4Var.h0;
                subscriptionItem2 = jk4Var.g0;
                str4 = jk4Var.f0;
                w39.n0(obj);
                z19 = z23;
                bool3 = bool5;
                z18 = z24;
                g83Var3 = g83Var11;
                HappApplication happApplication6 = HappApplication.M0;
                us usVar2 = (us) k32.i().m0.getValue();
                jk4Var.f0 = str4;
                jk4Var.g0 = subscriptionItem2;
                jk4Var.h0 = str3;
                jk4Var.i0 = bool3;
                jk4Var.j0 = g83Var3;
                jk4Var.k0 = z6;
                jk4Var.l0 = z17;
                jk4Var.m0 = z7;
                jk4Var.n0 = z18;
                jk4Var.o0 = z19;
                jk4Var.r0 = 4;
                break;
            case 4:
                boolean z25 = jk4Var.o0;
                boolean z26 = jk4Var.n0;
                z7 = jk4Var.m0;
                z17 = jk4Var.l0;
                z6 = jk4Var.k0;
                g83 g83Var12 = jk4Var.j0;
                Boolean bool6 = jk4Var.i0;
                str3 = jk4Var.h0;
                subscriptionItem2 = jk4Var.g0;
                str4 = jk4Var.f0;
                w39.n0(obj);
                z19 = z25;
                bool3 = bool6;
                z18 = z26;
                g83Var3 = g83Var12;
                g83Var2 = g83Var3;
                bool2 = bool3;
                if (!subscriptionItem2.getEncryptedUrl()) {
                    ss8 ss8Var4 = ss8.a;
                    rj6Var = ss8.s(subscriptionItem2.getUrl());
                    if (rj6Var instanceof rj6) {
                        rj6Var = null;
                    }
                    url = (String) rj6Var;
                    o83Var = o83.a;
                    if (url == null) {
                        if (z18) {
                            m51 m51Var8 = ko1.B1;
                            km4.x(n());
                            r12 = 0;
                            W(new ImportResult(0, o83Var, null, 5), z17, true);
                        } else {
                            r12 = 0;
                        }
                        if (g83Var2 != null) {
                            jk4Var.f0 = r12;
                            jk4Var.g0 = r12;
                            jk4Var.h0 = r12;
                            jk4Var.i0 = r12;
                            jk4Var.j0 = r12;
                            jk4Var.k0 = z6;
                            jk4Var.l0 = z17;
                            jk4Var.m0 = z7;
                            jk4Var.n0 = z18;
                            jk4Var.o0 = z19;
                            jk4Var.r0 = 5;
                            if (g83Var2.t(false, jk4Var) == c71Var) {
                                return c71Var;
                            }
                        }
                        return dn8Var;
                    }
                    ss8 ss8Var5 = ss8.a;
                    if (!ss8.z(url)) {
                        if (z18) {
                            m51 m51Var9 = ko1.B1;
                            km4.x(n());
                            r11 = 0;
                            W(new ImportResult(0, o83Var, null, 5), z17, true);
                        } else {
                            r11 = 0;
                        }
                        if (g83Var2 != null) {
                            jk4Var.f0 = r11;
                            jk4Var.g0 = r11;
                            jk4Var.h0 = r11;
                            jk4Var.i0 = r11;
                            jk4Var.j0 = r11;
                            jk4Var.k0 = z6;
                            jk4Var.l0 = z17;
                            jk4Var.m0 = z7;
                            jk4Var.n0 = z18;
                            jk4Var.o0 = z19;
                            jk4Var.r0 = 6;
                            if (g83Var2.t(false, jk4Var) == c71Var) {
                            }
                        }
                        return dn8Var;
                    }
                    return c71Var;
                }
                url = subscriptionItem2.getUrl();
                pr7 pr7Var2 = (pr7) this.X0.getValue();
                String str8 = url;
                Boolean bool7 = bool2;
                q30 q30Var2 = new q30(z18, this, (byte) 2);
                boolean z27 = z6;
                boolean z28 = z18;
                z8 = z19;
                g83Var4 = g83Var2;
                SubscriptionItem subscriptionItem4 = subscriptionItem2;
                ok4 ok4Var2 = new ok4(z28, this, subscriptionItem4, bool7, z17, str4, z27, str3, z8, g83Var4);
                z9 = z28;
                zs1 zs1Var2 = new zs1(this, z17, (byte) 4);
                pk4 pk4Var2 = new pk4(this, str4, subscriptionItem4, z27, str3, z17, null);
                z10 = z27;
                jk4Var.f0 = str4;
                jk4Var.g0 = subscriptionItem2;
                jk4Var.h0 = null;
                jk4Var.i0 = null;
                jk4Var.j0 = g83Var4;
                jk4Var.k0 = z10;
                jk4Var.l0 = z17;
                jk4Var.m0 = z7;
                jk4Var.n0 = z9;
                jk4Var.o0 = z8;
                jk4Var.r0 = 7;
                objB = pr7.b(pr7Var2, str4, z10, str8, q30Var2, ok4Var2, zs1Var2, pk4Var2, bool7, jk4Var, 128);
                if (objB != c71Var) {
                    obj = objB;
                    z11 = z8;
                    g83Var5 = g83Var4;
                    str5 = str4;
                    xu7Var = (av7) obj;
                    G().W(str5);
                    if (xu7Var instanceof xu7) {
                        th = xu7Var.a;
                        if (th instanceof ym) {
                            if (!z9) {
                                m51 m51Var10 = ko1.B1;
                                km4.l0(n(), jo1Var, (String) null);
                            }
                            HappApplication happApplication7 = HappApplication.M0;
                            k32.i().d().h(new uh3((byte) 23));
                        } else if (th instanceof xz1) {
                            W(new ImportResult(0, m83.a, null, 5), z17, true);
                        } else {
                            if (!(th instanceof j02)) {
                                g83Var7 = g83Var5;
                                if (th instanceof au7) {
                                    m51 m51Var11 = ko1.B1;
                                    km4.x(n());
                                }
                                g83Var10 = g83Var7;
                                if (g83Var10 != null) {
                                    jk4Var.f0 = null;
                                    jk4Var.g0 = null;
                                    jk4Var.h0 = null;
                                    jk4Var.i0 = null;
                                    jk4Var.j0 = null;
                                    jk4Var.k0 = z10;
                                    jk4Var.l0 = z17;
                                    jk4Var.m0 = z7;
                                    jk4Var.n0 = z9;
                                    jk4Var.o0 = z11;
                                    jk4Var.r0 = 9;
                                    if (g83Var10.t(false, jk4Var) == c71Var) {
                                    }
                                }
                                return dn8Var;
                            }
                            jk4Var.f0 = null;
                            jk4Var.g0 = null;
                            jk4Var.h0 = null;
                            jk4Var.i0 = null;
                            jk4Var.j0 = g83Var5;
                            jk4Var.k0 = z10;
                            jk4Var.l0 = z17;
                            jk4Var.m0 = z7;
                            jk4Var.n0 = z9;
                            jk4Var.o0 = z11;
                            jk4Var.r0 = 8;
                            nf1 nf1Var2 = tp1.a;
                            g83Var8 = g83Var5;
                            if (w51.W(dm4.a, new zh4(z9, this, subscriptionItem2, g83Var8, null), jk4Var) != c71Var) {
                                boolean z29 = z10;
                                g83Var9 = g83Var8;
                                z12 = z9;
                                z13 = z7;
                                z14 = z17;
                                z15 = z29;
                                g83Var10 = g83Var9;
                                z10 = z15;
                                z17 = z14;
                                z7 = z13;
                                z9 = z12;
                                if (g83Var10 != null) {
                                    jk4Var.f0 = null;
                                    jk4Var.g0 = null;
                                    jk4Var.h0 = null;
                                    jk4Var.i0 = null;
                                    jk4Var.j0 = null;
                                    jk4Var.k0 = z10;
                                    jk4Var.l0 = z17;
                                    jk4Var.m0 = z7;
                                    jk4Var.n0 = z9;
                                    jk4Var.o0 = z11;
                                    jk4Var.r0 = 9;
                                    if (g83Var10.t(false, jk4Var) == c71Var) {
                                    }
                                }
                                return dn8Var;
                            }
                        }
                        g83Var7 = g83Var5;
                        g83Var10 = g83Var7;
                        if (g83Var10 != null) {
                            jk4Var.f0 = null;
                            jk4Var.g0 = null;
                            jk4Var.h0 = null;
                            jk4Var.i0 = null;
                            jk4Var.j0 = null;
                            jk4Var.k0 = z10;
                            jk4Var.l0 = z17;
                            jk4Var.m0 = z7;
                            jk4Var.n0 = z9;
                            jk4Var.o0 = z11;
                            jk4Var.r0 = 9;
                            if (g83Var10.t(false, jk4Var) == c71Var) {
                            }
                        }
                        return dn8Var;
                    }
                    g83Var6 = g83Var5;
                    mainActivity = this;
                    if (!z9) {
                        m51 m51Var12 = ko1.B1;
                        km4.x(mainActivity.n());
                    }
                    if (g83Var6 != null) {
                        jk4Var.f0 = str5;
                        jk4Var.g0 = null;
                        jk4Var.h0 = null;
                        jk4Var.i0 = null;
                        jk4Var.j0 = null;
                        jk4Var.k0 = z10;
                        jk4Var.l0 = z17;
                        jk4Var.m0 = z7;
                        jk4Var.n0 = z9;
                        jk4Var.o0 = z11;
                        jk4Var.r0 = 10;
                        if (g83Var6.t(true, jk4Var) != c71Var) {
                            mainViewModelG = mainActivity.G();
                            jk4Var.f0 = str5;
                            jk4Var.g0 = null;
                            jk4Var.h0 = null;
                            jk4Var.i0 = null;
                            jk4Var.j0 = null;
                            jk4Var.k0 = z10;
                            jk4Var.l0 = z17;
                            jk4Var.m0 = z7;
                            jk4Var.n0 = z9;
                            jk4Var.o0 = z11;
                            jk4Var.r0 = 11;
                            if (mainViewModelG.D(jk4Var, null, false) != c71Var) {
                                z16 = z11;
                                str6 = str5;
                                HappApplication happApplication8 = HappApplication.M0;
                                qs7VarA = k32.i().h().a(str6);
                                if (qs7VarA != null) {
                                    subscriptionSortType = qs7VarA.j;
                                } else {
                                    subscriptionSortType = null;
                                }
                                if (subscriptionSortType == SubscriptionSortType.PING) {
                                    be beVar3 = gx1.Y;
                                    long jL2 = vj8.l0(500, lx1.Z);
                                    jk4Var.f0 = str6;
                                    jk4Var.g0 = null;
                                    jk4Var.h0 = null;
                                    jk4Var.i0 = null;
                                    jk4Var.j0 = null;
                                    jk4Var.k0 = z10;
                                    jk4Var.l0 = z17;
                                    jk4Var.m0 = z7;
                                    jk4Var.n0 = z9;
                                    jk4Var.o0 = z16;
                                    jk4Var.r0 = 12;
                                    break;
                                }
                                return dn8Var;
                            }
                        }
                    } else {
                        mainViewModelG = mainActivity.G();
                        jk4Var.f0 = str5;
                        jk4Var.g0 = null;
                        jk4Var.h0 = null;
                        jk4Var.i0 = null;
                        jk4Var.j0 = null;
                        jk4Var.k0 = z10;
                        jk4Var.l0 = z17;
                        jk4Var.m0 = z7;
                        jk4Var.n0 = z9;
                        jk4Var.o0 = z11;
                        jk4Var.r0 = 11;
                        if (mainViewModelG.D(jk4Var, null, false) != c71Var) {
                            z16 = z11;
                            str6 = str5;
                            HappApplication happApplication9 = HappApplication.M0;
                            qs7VarA = k32.i().h().a(str6);
                            if (qs7VarA != null) {
                                subscriptionSortType = qs7VarA.j;
                            } else {
                                subscriptionSortType = null;
                            }
                            if (subscriptionSortType == SubscriptionSortType.PING) {
                                be beVar4 = gx1.Y;
                                long jL3 = vj8.l0(500, lx1.Z);
                                jk4Var.f0 = str6;
                                jk4Var.g0 = null;
                                jk4Var.h0 = null;
                                jk4Var.i0 = null;
                                jk4Var.j0 = null;
                                jk4Var.k0 = z10;
                                jk4Var.l0 = z17;
                                jk4Var.m0 = z7;
                                jk4Var.n0 = z9;
                                jk4Var.o0 = z16;
                                jk4Var.r0 = 12;
                                break;
                            }
                            return dn8Var;
                        }
                    }
                }
                return c71Var;
            case 5:
            case 6:
                w39.n0(obj);
                return dn8Var;
            case 7:
                z11 = jk4Var.o0;
                z9 = jk4Var.n0;
                z7 = jk4Var.m0;
                z17 = jk4Var.l0;
                z10 = jk4Var.k0;
                g83 g83Var13 = jk4Var.j0;
                SubscriptionItem subscriptionItem5 = jk4Var.g0;
                String str9 = jk4Var.f0;
                w39.n0(obj);
                subscriptionItem2 = subscriptionItem5;
                g83Var5 = g83Var13;
                str5 = str9;
                xu7Var = (av7) obj;
                G().W(str5);
                if (xu7Var instanceof xu7) {
                    th = xu7Var.a;
                    if (th instanceof ym) {
                        if (!z9) {
                            m51 m51Var13 = ko1.B1;
                            km4.l0(n(), jo1Var, (String) null);
                        }
                        HappApplication happApplication10 = HappApplication.M0;
                        k32.i().d().h(new uh3((byte) 23));
                    } else if (th instanceof xz1) {
                        W(new ImportResult(0, m83.a, null, 5), z17, true);
                    } else {
                        if (!(th instanceof j02)) {
                            g83Var7 = g83Var5;
                            if (th instanceof au7) {
                                m51 m51Var14 = ko1.B1;
                                km4.x(n());
                            }
                            g83Var10 = g83Var7;
                            if (g83Var10 != null) {
                                jk4Var.f0 = null;
                                jk4Var.g0 = null;
                                jk4Var.h0 = null;
                                jk4Var.i0 = null;
                                jk4Var.j0 = null;
                                jk4Var.k0 = z10;
                                jk4Var.l0 = z17;
                                jk4Var.m0 = z7;
                                jk4Var.n0 = z9;
                                jk4Var.o0 = z11;
                                jk4Var.r0 = 9;
                                if (g83Var10.t(false, jk4Var) == c71Var) {
                                }
                            }
                            return dn8Var;
                        }
                        jk4Var.f0 = null;
                        jk4Var.g0 = null;
                        jk4Var.h0 = null;
                        jk4Var.i0 = null;
                        jk4Var.j0 = g83Var5;
                        jk4Var.k0 = z10;
                        jk4Var.l0 = z17;
                        jk4Var.m0 = z7;
                        jk4Var.n0 = z9;
                        jk4Var.o0 = z11;
                        jk4Var.r0 = 8;
                        nf1 nf1Var3 = tp1.a;
                        g83Var8 = g83Var5;
                        if (w51.W(dm4.a, new zh4(z9, this, subscriptionItem2, g83Var8, null), jk4Var) != c71Var) {
                            boolean z210 = z10;
                            g83Var9 = g83Var8;
                            z12 = z9;
                            z13 = z7;
                            z14 = z17;
                            z15 = z210;
                            g83Var10 = g83Var9;
                            z10 = z15;
                            z17 = z14;
                            z7 = z13;
                            z9 = z12;
                            if (g83Var10 != null) {
                                jk4Var.f0 = null;
                                jk4Var.g0 = null;
                                jk4Var.h0 = null;
                                jk4Var.i0 = null;
                                jk4Var.j0 = null;
                                jk4Var.k0 = z10;
                                jk4Var.l0 = z17;
                                jk4Var.m0 = z7;
                                jk4Var.n0 = z9;
                                jk4Var.o0 = z11;
                                jk4Var.r0 = 9;
                                if (g83Var10.t(false, jk4Var) == c71Var) {
                                }
                            }
                            return dn8Var;
                        }
                    }
                    g83Var7 = g83Var5;
                    g83Var10 = g83Var7;
                    if (g83Var10 != null) {
                        jk4Var.f0 = null;
                        jk4Var.g0 = null;
                        jk4Var.h0 = null;
                        jk4Var.i0 = null;
                        jk4Var.j0 = null;
                        jk4Var.k0 = z10;
                        jk4Var.l0 = z17;
                        jk4Var.m0 = z7;
                        jk4Var.n0 = z9;
                        jk4Var.o0 = z11;
                        jk4Var.r0 = 9;
                        if (g83Var10.t(false, jk4Var) == c71Var) {
                        }
                    }
                    return dn8Var;
                }
                g83Var6 = g83Var5;
                mainActivity = this;
                if (!z9) {
                    m51 m51Var15 = ko1.B1;
                    km4.x(mainActivity.n());
                }
                if (g83Var6 != null) {
                    jk4Var.f0 = str5;
                    jk4Var.g0 = null;
                    jk4Var.h0 = null;
                    jk4Var.i0 = null;
                    jk4Var.j0 = null;
                    jk4Var.k0 = z10;
                    jk4Var.l0 = z17;
                    jk4Var.m0 = z7;
                    jk4Var.n0 = z9;
                    jk4Var.o0 = z11;
                    jk4Var.r0 = 10;
                    if (g83Var6.t(true, jk4Var) != c71Var) {
                        mainViewModelG = mainActivity.G();
                        jk4Var.f0 = str5;
                        jk4Var.g0 = null;
                        jk4Var.h0 = null;
                        jk4Var.i0 = null;
                        jk4Var.j0 = null;
                        jk4Var.k0 = z10;
                        jk4Var.l0 = z17;
                        jk4Var.m0 = z7;
                        jk4Var.n0 = z9;
                        jk4Var.o0 = z11;
                        jk4Var.r0 = 11;
                        if (mainViewModelG.D(jk4Var, null, false) != c71Var) {
                            z16 = z11;
                            str6 = str5;
                            HappApplication happApplication11 = HappApplication.M0;
                            qs7VarA = k32.i().h().a(str6);
                            if (qs7VarA != null) {
                                subscriptionSortType = qs7VarA.j;
                            } else {
                                subscriptionSortType = null;
                            }
                            if (subscriptionSortType == SubscriptionSortType.PING) {
                                be beVar5 = gx1.Y;
                                long jL4 = vj8.l0(500, lx1.Z);
                                jk4Var.f0 = str6;
                                jk4Var.g0 = null;
                                jk4Var.h0 = null;
                                jk4Var.i0 = null;
                                jk4Var.j0 = null;
                                jk4Var.k0 = z10;
                                jk4Var.l0 = z17;
                                jk4Var.m0 = z7;
                                jk4Var.n0 = z9;
                                jk4Var.o0 = z16;
                                jk4Var.r0 = 12;
                                break;
                            }
                            return dn8Var;
                        }
                    }
                } else {
                    mainViewModelG = mainActivity.G();
                    jk4Var.f0 = str5;
                    jk4Var.g0 = null;
                    jk4Var.h0 = null;
                    jk4Var.i0 = null;
                    jk4Var.j0 = null;
                    jk4Var.k0 = z10;
                    jk4Var.l0 = z17;
                    jk4Var.m0 = z7;
                    jk4Var.n0 = z9;
                    jk4Var.o0 = z11;
                    jk4Var.r0 = 11;
                    if (mainViewModelG.D(jk4Var, null, false) != c71Var) {
                        z16 = z11;
                        str6 = str5;
                        HappApplication happApplication12 = HappApplication.M0;
                        qs7VarA = k32.i().h().a(str6);
                        if (qs7VarA != null) {
                            subscriptionSortType = qs7VarA.j;
                        } else {
                            subscriptionSortType = null;
                        }
                        if (subscriptionSortType == SubscriptionSortType.PING) {
                            be beVar6 = gx1.Y;
                            long jL5 = vj8.l0(500, lx1.Z);
                            jk4Var.f0 = str6;
                            jk4Var.g0 = null;
                            jk4Var.h0 = null;
                            jk4Var.i0 = null;
                            jk4Var.j0 = null;
                            jk4Var.k0 = z10;
                            jk4Var.l0 = z17;
                            jk4Var.m0 = z7;
                            jk4Var.n0 = z9;
                            jk4Var.o0 = z16;
                            jk4Var.r0 = 12;
                            break;
                        }
                        return dn8Var;
                    }
                }
                return c71Var;
            case 8:
                z11 = jk4Var.o0;
                z12 = jk4Var.n0;
                z13 = jk4Var.m0;
                z14 = jk4Var.l0;
                z15 = jk4Var.k0;
                g83Var9 = jk4Var.j0;
                w39.n0(obj);
                g83Var10 = g83Var9;
                z10 = z15;
                z17 = z14;
                z7 = z13;
                z9 = z12;
                if (g83Var10 != null) {
                    jk4Var.f0 = null;
                    jk4Var.g0 = null;
                    jk4Var.h0 = null;
                    jk4Var.i0 = null;
                    jk4Var.j0 = null;
                    jk4Var.k0 = z10;
                    jk4Var.l0 = z17;
                    jk4Var.m0 = z7;
                    jk4Var.n0 = z9;
                    jk4Var.o0 = z11;
                    jk4Var.r0 = 9;
                    if (g83Var10.t(false, jk4Var) == c71Var) {
                        return c71Var;
                    }
                }
                return dn8Var;
            case 9:
                w39.n0(obj);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                z11 = jk4Var.o0;
                z9 = jk4Var.n0;
                z7 = jk4Var.m0;
                z17 = jk4Var.l0;
                z10 = jk4Var.k0;
                str5 = jk4Var.f0;
                w39.n0(obj);
                mainActivity = this;
                mainViewModelG = mainActivity.G();
                jk4Var.f0 = str5;
                jk4Var.g0 = null;
                jk4Var.h0 = null;
                jk4Var.i0 = null;
                jk4Var.j0 = null;
                jk4Var.k0 = z10;
                jk4Var.l0 = z17;
                jk4Var.m0 = z7;
                jk4Var.n0 = z9;
                jk4Var.o0 = z11;
                jk4Var.r0 = 11;
                if (mainViewModelG.D(jk4Var, null, false) != c71Var) {
                    z16 = z11;
                    str6 = str5;
                    HappApplication happApplication13 = HappApplication.M0;
                    qs7VarA = k32.i().h().a(str6);
                    if (qs7VarA != null) {
                        subscriptionSortType = qs7VarA.j;
                    } else {
                        subscriptionSortType = null;
                    }
                    if (subscriptionSortType == SubscriptionSortType.PING) {
                        be beVar7 = gx1.Y;
                        long jL6 = vj8.l0(500, lx1.Z);
                        jk4Var.f0 = str6;
                        jk4Var.g0 = null;
                        jk4Var.h0 = null;
                        jk4Var.i0 = null;
                        jk4Var.j0 = null;
                        jk4Var.k0 = z10;
                        jk4Var.l0 = z17;
                        jk4Var.m0 = z7;
                        jk4Var.n0 = z9;
                        jk4Var.o0 = z16;
                        jk4Var.r0 = 12;
                        break;
                    }
                    return dn8Var;
                }
                return c71Var;
            case 11:
                z11 = jk4Var.o0;
                z9 = jk4Var.n0;
                z7 = jk4Var.m0;
                z17 = jk4Var.l0;
                z10 = jk4Var.k0;
                str5 = jk4Var.f0;
                w39.n0(obj);
                mainActivity = this;
                z16 = z11;
                str6 = str5;
                HappApplication happApplication14 = HappApplication.M0;
                qs7VarA = k32.i().h().a(str6);
                if (qs7VarA != null) {
                    subscriptionSortType = qs7VarA.j;
                } else {
                    subscriptionSortType = null;
                }
                if (subscriptionSortType == SubscriptionSortType.PING) {
                    be beVar8 = gx1.Y;
                    long jL7 = vj8.l0(500, lx1.Z);
                    jk4Var.f0 = str6;
                    jk4Var.g0 = null;
                    jk4Var.h0 = null;
                    jk4Var.i0 = null;
                    jk4Var.j0 = null;
                    jk4Var.k0 = z10;
                    jk4Var.l0 = z17;
                    jk4Var.m0 = z7;
                    jk4Var.n0 = z9;
                    jk4Var.o0 = z16;
                    jk4Var.r0 = 12;
                    break;
                }
                return dn8Var;
            case 12:
                str6 = jk4Var.f0;
                w39.n0(obj);
                mainActivity = this;
                mainActivity.X(str6);
                return dn8Var;
            default:
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: su.happ.proxyutility.feature.main.MainViewModel.C(su.happ.proxyutility.feature.main.MainViewModel, boolean, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q(String str, boolean z) {
        dn8 rj6Var;
        try {
            if (TextUtils.isEmpty(str)) {
                J(m83.a, z);
                return;
            }
            HappApplication happApplication = HappApplication.M0;
            l81 l81VarA = ((i83) k32.i().H0.getValue()).a(str);
            boolean z2 = l81VarA.a;
            if (l81VarA.b) {
                MainViewModel.C(G(), false, 3);
                pu.Q(this, y46.toast_success);
            } else if (z2) {
                J(n83.a, z);
            } else {
                J(new q83("json"), z);
            }
            rj6Var = dn8.a;
            if (sj6.a(rj6Var) != null) {
                J(new q83("json"), z);
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void R() {
        if (getPackageManager().hasSystemFeature("android.hardware.camera")) {
            new y45(this).L(new String[]{"android.permission.CAMERA"}).a(new o61(new oj4(this, (byte) 3), (byte) 15));
        } else {
            if (pz7.a()) {
                return;
            }
            be.m(this, getString(y46.warning_text), getString(y46.switch_tv_ui_dialog), (String) null, getString(y46.yes), getString(y46.no), (Integer) null, new mj4(this, (byte) 8), (dn2) null, 1170);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:76:0x0213  */
    /* JADX WARN: Code duplicated, block: B:79:0x0265  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0265 -> B:80:0x026c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object S(su.happ.proxyutility.dto.ImportResult r25, java.lang.String r26, su.happ.proxyutility.dto.SubscriptionItem r27, boolean r28, boolean r29, java.lang.String r30, java.lang.Boolean r31, java.lang.Boolean r32, boolean r33, boolean r34, java.util.List r35, s51 r36) {
        /*
            r24 = this;
            r4 = r24
            r6 = r26
            r9 = r27
            r10 = r28
            r1 = r29
            r5 = r33
            r11 = r34
            r0 = r36
            boolean r2 = r0 instanceof defpackage.sk4
            if (r2 == 0) goto L24
            r2 = r0
            sk4 r2 = (defpackage.sk4) r2
            int r3 = r2.s0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r3 & r7
            if (r8 == 0) goto L24
            int r3 = r3 - r7
            r2.s0 = r3
        L22:
            r8 = r2
            goto L2a
        L24:
            sk4 r2 = new sk4
            r2.<init>(r4, r0)
            goto L22
        L2a:
            java.lang.Object r0 = r8.q0
            int r2 = r8.s0
            gk7 r13 = r4.l1
            r14 = 1
            r15 = 0
            c71 r7 = c71.X
            switch(r2) {
                case 0: goto Lbb;
                case 1: goto La6;
                case 2: goto L9f;
                case 3: goto L76;
                case 4: goto L5d;
                case 5: goto L5d;
                case 6: goto L4b;
                case 7: goto L42;
                case 8: goto L3d;
                default: goto L37;
            }
        L37:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            bt.i(r0)
            return r15
        L3d:
            w39.n0(r0)
            goto L3e3
        L42:
            su.happ.proxyutility.dto.SubscriptionItem r1 = r8.g0
            java.lang.String r2 = r8.f0
            w39.n0(r0)
            goto L348
        L4b:
            boolean r1 = r8.p0
            boolean r2 = r8.o0
            boolean r3 = r8.n0
            boolean r5 = r8.m0
            su.happ.proxyutility.dto.SubscriptionItem r6 = r8.g0
            java.lang.String r9 = r8.f0
            w39.n0(r0)
            r12 = r7
            goto L315
        L5d:
            boolean r1 = r8.p0
            boolean r2 = r8.o0
            boolean r3 = r8.n0
            boolean r5 = r8.m0
            su.happ.proxyutility.dto.SubscriptionItem r6 = r8.k0
            java.util.List r6 = (java.util.List) r6
            su.happ.proxyutility.dto.SubscriptionItem r6 = r8.g0
            java.lang.String r9 = r8.f0
            w39.n0(r0)
            r11 = r9
            r9 = r6
            r6 = r11
            r11 = r1
            goto L278
        L76:
            boolean r1 = r8.p0
            boolean r2 = r8.o0
            boolean r3 = r8.n0
            boolean r5 = r8.m0
            java.util.Iterator r6 = r8.l0
            su.happ.proxyutility.dto.SubscriptionItem r9 = r8.k0
            java.util.List r9 = (java.util.List) r9
            java.lang.Boolean r9 = r8.j0
            java.lang.Boolean r10 = r8.i0
            java.lang.String r11 = r8.h0
            su.happ.proxyutility.dto.SubscriptionItem r12 = r8.g0
            java.lang.String r15 = r8.f0
            w39.n0(r0)
            r0 = r5
            r5 = r2
            r2 = r10
            r10 = r0
            r0 = r11
            r11 = r1
            r1 = r3
            r3 = r9
            r9 = r12
            r12 = r8
            r8 = r6
            r6 = r15
            goto L26c
        L9f:
            java.lang.String r1 = r8.f0
            w39.n0(r0)
            goto L195
        La6:
            boolean r1 = r8.p0
            boolean r2 = r8.o0
            boolean r5 = r8.n0
            boolean r6 = r8.m0
            su.happ.proxyutility.dto.SubscriptionItem r9 = r8.k0
            java.lang.String r10 = r8.f0
            w39.n0(r0)
            r11 = r10
            r10 = r6
            r6 = r11
            r11 = r1
            goto L16b
        Lbb:
            w39.n0(r0)
            int r0 = r25.getCount()
            if (r0 <= 0) goto L3a0
            if (r9 == 0) goto L1a0
            if (r1 != 0) goto L1a0
            kw4 r2 = defpackage.kw4.a
            su.happ.proxyutility.dto.SubscriptionItem r16 = defpackage.kw4.f(r6)
            if (r16 != 0) goto Ld2
            r2 = 0
            goto Le8
        Ld2:
            long r17 = y08.c()
            r22 = 0
            r23 = 268434943(0xffffdff, float:2.5242777E-29)
            r19 = 0
            r20 = 0
            r21 = 0
            su.happ.proxyutility.dto.SubscriptionItem r2 = su.happ.proxyutility.dto.SubscriptionItem.d(r16, r17, r19, r20, r21, r22, r23)
            defpackage.kw4.u(r2, r6)
        Le8:
            if (r2 != 0) goto Leb
            goto Lec
        Leb:
            r9 = r2
        Lec:
            su.happ.proxyutility.dto.MetaParams r2 = r9.getMetaParams()
            if (r2 == 0) goto L12c
            java.util.Map r12 = r2.getFragmentBean()
            if (r12 == 0) goto Lfe
            su.happ.proxyutility.dto.XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean r15 = new su.happ.proxyutility.dto.XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean
            r15.<init>(r12)
            goto Lff
        Lfe:
            r15 = 0
        Lff:
            java.lang.String r12 = r2.getResolveAddress()
            java.lang.String r3 = r2.getHost()
            java.lang.Boolean r0 = r2.getInsecure()
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r12, r3, r0}
            java.util.ArrayList r0 = eu.q0(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r14
            if (r0 != r14) goto L12c
            su.happ.proxyutility.HappApplication r0 = su.happ.proxyutility.HappApplication.M0
            su.happ.proxyutility.HappApplication r0 = k32.i()
            kf4 r0 = r0.d()
            za2 r3 = new za2
            r3.<init>(r2, r9, r14)
            r0.h(r3)
        L12c:
            su.happ.proxyutility.HappApplication r0 = su.happ.proxyutility.HappApplication.M0
            su.happ.proxyutility.HappApplication r0 = k32.i()
            kf4 r0 = r0.d()
            uq0 r2 = new uq0
            r3 = 4
            r2.<init>(r9, r3)
            r0.h(r2)
            nf1 r0 = tp1.a
            hv2 r0 = dm4.a
            tk4 r2 = new tk4
            r3 = 0
            r12 = 0
            r2.<init>(r4, r9, r12, r3)
            r8.f0 = r6
            r8.g0 = r12
            r8.h0 = r12
            r8.i0 = r12
            r8.j0 = r12
            r8.k0 = r9
            r8.m0 = r10
            r8.n0 = r1
            r8.o0 = r5
            r8.p0 = r11
            r8.s0 = r14
            java.lang.Object r0 = w51.W(r0, r2, r8)
            if (r0 != r7) goto L169
        L166:
            r12 = r7
            goto L3e2
        L169:
            r2 = r5
            r5 = r1
        L16b:
            su.happ.proxyutility.dto.MetaParams r0 = r9.getMetaParams()
            if (r0 == 0) goto L196
            boolean r1 = r9.b0()
            r8.f0 = r6
            r12 = 0
            r8.g0 = r12
            r8.h0 = r12
            r8.i0 = r12
            r8.j0 = r12
            r8.k0 = r12
            r8.m0 = r10
            r8.n0 = r5
            r8.o0 = r2
            r8.p0 = r11
            r2 = 2
            r8.s0 = r2
            java.lang.Object r0 = r13.a(r0, r1, r6, r8)
            if (r0 != r7) goto L194
            goto L166
        L194:
            r1 = r6
        L195:
            r6 = r1
        L196:
            su.happ.proxyutility.feature.main.MainViewModel r0 = r4.G()
            r0.W(r6)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L1a0:
            kw4 r0 = defpackage.kw4.a
            java.util.List r0 = defpackage.kw4.d()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1af:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L1f2
            java.lang.Object r12 = r0.next()
            r15 = r12
            qg5 r15 = (qg5) r15
            java.lang.Object r15 = r15.X
            su.happ.proxyutility.domain.sub.SubId r15 = (su.happ.proxyutility.domain.sub.SubId) r15
            java.lang.String r15 = r15.d()
            if (r35 == 0) goto L1cd
            boolean r16 = r35.isEmpty()
            if (r16 == 0) goto L1cd
            goto L1ee
        L1cd:
            java.util.Iterator r16 = r35.iterator()
        L1d1:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L1ee
            java.lang.Object r17 = r16.next()
            r2 = r17
            qg5 r2 = (qg5) r2
            java.lang.Object r2 = r2.X
            su.happ.proxyutility.domain.sub.SubId r2 = (su.happ.proxyutility.domain.sub.SubId) r2
            java.lang.String r2 = r2.d()
            boolean r2 = dh3.f(r15, r2)
            if (r2 == 0) goto L1d1
            goto L1af
        L1ee:
            r3.add(r12)
            goto L1af
        L1f2:
            kw4 r0 = defpackage.kw4.a
            su.happ.proxyutility.dto.SubscriptionItem r0 = defpackage.kw4.f(r6)
            if (r0 != 0) goto L1fb
            r0 = r9
        L1fb:
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L27b
            java.util.Iterator r0 = r3.iterator()
            r2 = r31
            r3 = r32
            r12 = r8
            r8 = r0
            r0 = r30
        L20d:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L270
            java.lang.Object r15 = r8.next()
            qg5 r15 = (qg5) r15
            java.lang.Object r14 = r15.X
            su.happ.proxyutility.domain.sub.SubId r14 = (su.happ.proxyutility.domain.sub.SubId) r14
            java.lang.String r14 = r14.d()
            java.lang.Object r15 = r15.Y
            su.happ.proxyutility.dto.SubscriptionItem r15 = (su.happ.proxyutility.dto.SubscriptionItem) r15
            r12.f0 = r6
            r12.g0 = r9
            r12.h0 = r0
            r12.i0 = r2
            r12.j0 = r3
            r25 = r0
            r0 = 0
            r12.k0 = r0
            r12.l0 = r8
            r12.m0 = r10
            r12.n0 = r1
            r12.o0 = r5
            r12.p0 = r11
            r0 = 3
            r12.s0 = r0
            r26 = r1
            r27 = r2
            r28 = r3
            r29 = r4
            r30 = r5
            r33 = r12
            r31 = r14
            r32 = r15
            java.lang.Object r0 = T(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r12 = r30
            r1 = r33
            if (r0 != r7) goto L265
            goto L166
        L265:
            r0 = r12
            r12 = r1
            r1 = r3
            r3 = r5
            r5 = r0
            r0 = r2
            r2 = r4
        L26c:
            r4 = r24
            r14 = 1
            goto L20d
        L270:
            r3 = r1
            r1 = r12
            r12 = r5
            r4 = r24
            r8 = r1
            r5 = r10
            r2 = r12
        L278:
            r12 = r7
            goto L2dd
        L27b:
            if (r1 == 0) goto L2b0
            if (r0 == 0) goto L2a9
            r8.f0 = r6
            r8.g0 = r9
            r12 = 0
            r8.h0 = r12
            r8.i0 = r12
            r8.j0 = r12
            r8.k0 = r12
            r8.m0 = r10
            r8.n0 = r1
            r8.o0 = r5
            r8.p0 = r11
            r3 = 4
            r8.s0 = r3
            r4 = r24
            r2 = r31
            r3 = r32
            r12 = r7
            r7 = r0
            r0 = r30
            java.lang.Object r0 = T(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r12) goto L2ac
            goto L3e2
        L2a9:
            r4 = r24
            r12 = r7
        L2ac:
            r3 = r1
            r2 = r5
            r5 = r10
            goto L2dd
        L2b0:
            r4 = r24
            r12 = r7
            nf1 r0 = tp1.a
            hv2 r0 = dm4.a
            nk4 r2 = new nk4
            r3 = 1
            r7 = 0
            r2.<init>(r4, r7, r3)
            r8.f0 = r6
            r8.g0 = r9
            r8.h0 = r7
            r8.i0 = r7
            r8.j0 = r7
            r8.k0 = r7
            r8.m0 = r10
            r8.n0 = r1
            r8.o0 = r5
            r8.p0 = r11
            r3 = 5
            r8.s0 = r3
            java.lang.Object r0 = w51.W(r0, r2, r8)
            if (r0 != r12) goto L2ac
            goto L3e2
        L2dd:
            kw4 r0 = defpackage.kw4.a
            su.happ.proxyutility.dto.SubscriptionItem r0 = defpackage.kw4.f(r6)
            if (r0 == 0) goto L319
            su.happ.proxyutility.dto.MetaParams r1 = r0.getMetaParams()
            if (r1 == 0) goto L319
            boolean r0 = r0.b0()
            r8.f0 = r6
            r8.g0 = r9
            r7 = 0
            r8.h0 = r7
            r8.i0 = r7
            r8.j0 = r7
            r8.k0 = r7
            r8.l0 = r7
            r8.m0 = r5
            r8.n0 = r3
            r8.o0 = r2
            r8.p0 = r11
            r7 = 6
            r8.s0 = r7
            java.lang.Object r0 = r13.a(r1, r0, r6, r8)
            if (r0 != r12) goto L311
            goto L3e2
        L311:
            r1 = r9
            r9 = r6
            r6 = r1
            r1 = r11
        L315:
            r11 = r9
            r9 = r6
            r6 = r11
            r11 = r1
        L319:
            r0 = r2
            r2 = r6
            r1 = r9
            nf1 r6 = tp1.a
            ye1 r6 = ye1.Z
            wj4 r7 = new wj4
            r9 = 3
            r10 = 0
            r7.<init>(r4, r5, r10, r9)
            r8.f0 = r2
            r8.g0 = r1
            r8.h0 = r10
            r8.i0 = r10
            r8.j0 = r10
            r8.k0 = r10
            r8.l0 = r10
            r8.m0 = r5
            r8.n0 = r3
            r8.o0 = r0
            r8.p0 = r11
            r0 = 7
            r8.s0 = r0
            java.lang.Object r0 = w51.W(r6, r7, r8)
            if (r0 != r12) goto L348
            goto L3e2
        L348:
            su.happ.proxyutility.feature.main.MainViewModel r0 = r4.G()
            r2.getClass()
            zt7 r0 = r0.q()
            qs7 r0 = r0.a(r2)
            if (r0 == 0) goto L363
            is7 r0 = r0.a
            if (r0 == 0) goto L363
            boolean r0 = r0.a
            r3 = 1
            if (r0 != r3) goto L363
            goto L389
        L363:
            kw4 r0 = defpackage.kw4.a
            su.happ.proxyutility.dto.SubscriptionItem r0 = defpackage.kw4.f(r2)
            if (r0 == 0) goto L389
            su.happ.proxyutility.dto.MetaParams r0 = r0.getMetaParams()
            if (r0 == 0) goto L389
            java.lang.Integer r0 = r0.getProfileUpdateInterval()
            if (r0 == 0) goto L389
            int r3 = r0.intValue()
            if (r3 <= 0) goto L37f
            r15 = r0
            goto L380
        L37f:
            r15 = 0
        L380:
            if (r15 == 0) goto L389
            int r0 = r15.intValue()
            defpackage.ev7.b(r0, r2)
        L389:
            su.happ.proxyutility.HappApplication r0 = su.happ.proxyutility.HappApplication.M0
            su.happ.proxyutility.HappApplication r0 = k32.i()
            kf4 r0 = r0.d()
            zw2 r3 = new zw2
            r4 = 13
            r3.<init>(r2, r1, r4)
            r0.h(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L3a0:
            r12 = r7
            su.happ.proxyutility.feature.main.MainViewModel r0 = r4.G()
            r2 = 2
            su.happ.proxyutility.feature.main.MainViewModel.C(r0, r10, r2)
            su.happ.proxyutility.HappApplication r0 = su.happ.proxyutility.HappApplication.M0
            su.happ.proxyutility.HappApplication r0 = k32.i()
            kf4 r0 = r0.d()
            uq0 r2 = new uq0
            r3 = 5
            r2.<init>(r9, r3)
            r0.h(r2)
            nf1 r0 = tp1.a
            hv2 r0 = dm4.a
            rk4 r2 = new rk4
            r7 = 0
            r2.<init>(r4, r5, r11, r7)
            r8.f0 = r7
            r8.g0 = r7
            r8.h0 = r7
            r8.i0 = r7
            r8.j0 = r7
            r8.m0 = r10
            r8.n0 = r1
            r8.o0 = r5
            r8.p0 = r11
            r1 = 8
            r8.s0 = r1
            java.lang.Object r0 = w51.W(r0, r2, r8)
            if (r0 != r12) goto L3e3
        L3e2:
            return r12
        L3e3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.feature.main.MainActivity.S(su.happ.proxyutility.dto.ImportResult, java.lang.String, su.happ.proxyutility.dto.SubscriptionItem, boolean, boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, boolean, boolean, java.util.List, s51):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean W(ImportResult importResult, boolean z, boolean z2) {
        x83 status = importResult.getStatus();
        boolean z3 = false;
        Boolean boolValueOf = null;
        if (status instanceof v83) {
            MainViewModel.C(G(), false, 3);
        } else {
            boolean z4 = status instanceof k83;
            g94 g94Var = ((ComponentActivity) this).X;
            if (z4) {
                u84 u84VarZ = ys0.z(g94Var);
                nf1 nf1Var = tp1.a;
                jm4.Q(u84VarZ, dm4.a, new jy2(this, (k83) status, (q51) null, (byte) 10), 2);
            } else if (status instanceof t83) {
                u84 u84VarZ2 = ys0.z(g94Var);
                nf1 nf1Var2 = tp1.a;
                jm4.Q(u84VarZ2, dm4.a, new z81(this, z2, (t83) status, z, (q51) null, (byte) 3), 2);
            } else {
                if (importResult.getLastParseError() != null) {
                    u84 u84VarZ3 = ys0.z(g94Var);
                    nf1 nf1Var3 = tp1.a;
                    jm4.Q(u84VarZ3, dm4.a, new z81(this, z2, importResult, z, (q51) null, (byte) 4), 2);
                    z3 = true;
                }
                boolValueOf = Boolean.valueOf(z3);
            }
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X(String str) {
        str.getClass();
        u84 u84VarZ = ys0.z(((ComponentActivity) this).X);
        nf1 nf1Var = tp1.a;
        jm4.Q(u84VarZ, ye1.Z, new qk4(this, str, (q51) null), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object Y(s51 s51Var) {
        bl4 bl4Var;
        if (s51Var instanceof bl4) {
            bl4Var = (bl4) s51Var;
            int i = bl4Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                bl4Var.h0 = i - Integer.MIN_VALUE;
            } else {
                bl4Var = new bl4(this, s51Var);
            }
        } else {
            bl4Var = new bl4(this, s51Var);
        }
        Object obj = bl4Var.f0;
        int i2 = bl4Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            if (dh3.f(((qc4) G().A.getValue()).d(), Boolean.TRUE)) {
                ss8 ss8Var = ss8.a;
                qe4.L0(this, "su.happ.proxyutility.action.service", 42, "");
            }
            if (G().u()) {
                ss8 ss8Var2 = ss8.a;
                ss8.I(this);
            }
            be beVar = gx1.Y;
            long jM0 = vj8.m0(1000L, lx1.Z);
            bl4Var.h0 = 1;
            Object objG = u70.G(jM0, bl4Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        i0();
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z() {
        a aVar = wu7.y1;
        ml2 ml2VarN = n();
        int i = e46.fragment_container_view;
        wu7 wu7Var = new wu7();
        wu7Var.V();
        r00 r00Var = new r00(ml2VarN);
        r00Var.o = true;
        if (i == 0) {
            bt.q("Must use non-zero containerViewId");
        } else {
            r00Var.g(i, wu7Var, "DialogSubscriptionSync", 2);
            r00Var.e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a0() {
        b6 b6Var = this.Q0;
        if (b6Var != null) {
            setBarsParams(b6Var.z0);
        } else {
            dh3.T("binding");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(boolean z) {
        int i;
        boolean z2 = ((xm4) G().x.X.getValue()).q || z;
        b6 b6Var = this.Q0;
        if (b6Var == null) {
            dh3.T("binding");
            throw null;
        }
        Context context = b6Var.i0.getContext();
        b6 b6Var2 = this.Q0;
        if (b6Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        Drawable drawable = b6Var2.i0.getDrawable();
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        if (z2) {
            int i2 = v26.icBtnPowerOn;
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(i2, typedValue, true);
            i = typedValue.resourceId;
        } else {
            int i3 = v26.icBtnPowerOff;
            TypedValue typedValue2 = new TypedValue();
            getTheme().resolveAttribute(i3, typedValue2, true);
            i = typedValue2.resourceId;
        }
        Drawable drawable2 = context.getDrawable(i);
        if (drawable2 == null) {
            bt.q("Required value was null.");
            return;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        b6 b6Var3 = this.Q0;
        if (b6Var3 == null) {
            dh3.T("binding");
            throw null;
        }
        b6Var3.i0.setImageDrawable(transitionDrawable);
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(boolean z) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        animationLoadAnimation2.setDuration(100L);
        animationLoadAnimation.setDuration(100L);
        animationLoadAnimation.setAnimationListener(new cl4(this, z, animationLoadAnimation2));
        b6 b6Var = this.Q0;
        if (b6Var != null) {
            b6Var.i0.startAnimation(animationLoadAnimation);
        } else {
            dh3.T("binding");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0(String str) {
        b6 b6Var = this.Q0;
        if (b6Var == null) {
            dh3.T("binding");
            throw null;
        }
        AppCompatButton appCompatButton = b6Var.L0;
        if (appCompatButton == null) {
            appCompatButton = b6Var.o0;
        }
        if (appCompatButton != null) {
            appCompatButton.setText(str);
        }
        C();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(String str, boolean z) {
        int i = zx2.B;
        b6 b6Var = this.Q0;
        ay2 ay2Var = null;
        if (b6Var == null) {
            dh3.T("binding");
            throw null;
        }
        CoordinatorLayout host = b6Var.B0.getHost();
        int i2 = pu.i(this, 0.0f);
        String string = getString(y46.main_checkout_faq);
        string.getClass();
        ay2 ay2Var2 = new ay2(string, u70.O(this, q36.ic_faq), new mj4(this, (byte) 3));
        if (z) {
            String string2 = getString(y46.main_show_clipboard);
            string2.getClass();
            ay2Var = new ay2(string2, u70.O(this, q36.ic_clipboard), new mj4(this, (byte) 4));
        }
        k42.g(this, host, str, my2.Y, eu.q0(new ay2[]{ay2Var2, ay2Var}), i2, 64);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f0(List list, boolean z) {
        ml2 ml2VarN = n();
        int i = e46.fragment_container_view;
        list.getClass();
        ok7 ok7Var = new ok7();
        ok7Var.V();
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("stories", (Parcelable[]) list.toArray(new ld6[0]));
        bundle.putBoolean("is_force", z);
        ok7Var.Q(bundle);
        r00 r00Var = new r00(ml2VarN);
        r00Var.o = true;
        if (i == 0) {
            bt.q("Must use non-zero containerViewId");
        } else {
            r00Var.g(i, ok7Var, "StoriesDialogFragment", 2);
            r00Var.e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g0() {
        b6 b6Var = this.Q0;
        if (b6Var == null) {
            dh3.T("binding");
            throw null;
        }
        AppCompatButton appCompatButton = b6Var.L0;
        if (appCompatButton == null) {
            appCompatButton = b6Var.o0;
        }
        if (appCompatButton != null) {
            appCompatButton.setText(getString(y46.connection_test_testing));
        }
        b6 b6Var2 = this.Q0;
        if (b6Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        AppCompatTextView appCompatTextView = b6Var2.l0;
        rp7.e(appCompatTextView, true);
        appCompatTextView.setText(getString(y46.connection_test_testing));
        b6 b6Var3 = this.Q0;
        if (b6Var3 == null) {
            dh3.T("binding");
            throw null;
        }
        rp7.e(b6Var3.k0, false);
        b0(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h0(s51 s51Var) {
        wl4 wl4Var;
        q15 q15Var;
        Intent intentPrepare;
        if (s51Var instanceof wl4) {
            wl4Var = (wl4) s51Var;
            int i = wl4Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                wl4Var.i0 = i - Integer.MIN_VALUE;
            } else {
                wl4Var = new wl4(this, s51Var);
            }
        } else {
            wl4Var = new wl4(this, s51Var);
        }
        Object obj = wl4Var.g0;
        int i2 = wl4Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            q15 q15Var2 = this.q1;
            wl4Var.f0 = q15Var2;
            wl4Var.i0 = 1;
            Object objG = q15Var2.g(wl4Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
            q15Var = q15Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q15Var = wl4Var.f0;
            w39.n0(obj);
        }
        try {
            ServerConfig serverConfigG = G().G();
            dn8 dn8Var = dn8.a;
            if (serverConfigG == null) {
                return dn8Var;
            }
            String strI = H().i("pref_mode");
            if (strI == null) {
                strI = "VPN";
            }
            if (!strI.equals("VPN") || (intentPrepare = VpnService.prepare(this)) == null) {
                i0();
            } else {
                this.Y0.h0(intentPrepare);
            }
            return dn8Var;
        } finally {
            q15Var.m((Object) null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        boolean zF;
        if (dh3.f(((qc4) G().A.getValue()).d(), Boolean.TRUE)) {
            ss8 ss8Var = ss8.a;
            qe4.L0(this, "su.happ.proxyutility.action.service", 42, "");
        }
        vz7 vz7Var = this.U0;
        String strI = ((MMKV) vz7Var.getValue()).i("SELECTED_SERVER");
        if (strI != null) {
            GuId guId = new GuId(strI);
            q51 q51Var = null;
            if (fm7.o0(guId.b())) {
                guId = null;
            }
            String strB = guId != null ? guId.b() : null;
            if (strB != null) {
                kw4 kw4Var = kw4.a;
                ServerConfig serverConfigB = kw4.b(strB);
                if (serverConfigB != null) {
                    SubId subId = new SubId(serverConfigB.getSubscriptionId());
                    if (fm7.o0(subId.d())) {
                        subId = null;
                    }
                    String strD = subId != null ? subId.d() : null;
                    if (strD != null) {
                        SubscriptionItem subscriptionItemF = kw4.f(strD);
                        zF = dh3.f(subscriptionItemF != null ? subscriptionItemF.getImport() : null, Boolean.FALSE);
                    } else {
                        zF = false;
                    }
                } else {
                    zF = false;
                }
                if (zF) {
                    ((MMKV) vz7Var.getValue()).remove("SELECTED_SERVER");
                    return;
                }
                this.v1 = true;
                u84 u84VarZ = ys0.z(((ComponentActivity) this).X);
                nf1 nf1Var = tp1.a;
                jm4.Q(u84VarZ, dm4.a, new pl4(this, q51Var, (byte) 5), 2);
                XRayPoint xRayPoint = n69.a;
                n69.b(this, false);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j0() {
        this.v1 = false;
        Object animatedValue = this.w1.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        long currentPlayTime = this.w1.getCurrentPlayTime();
        this.w1.cancel();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, 360.0f);
        this.w1 = valueAnimatorOfFloat;
        long j = 1000 - currentPlayTime;
        if (j > 0) {
            valueAnimatorOfFloat.setDuration(j);
            this.w1.setInterpolator(new DecelerateInterpolator());
            this.w1.addUpdateListener(new sj4(this, (byte) 0));
            this.w1.start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object k0(s51 s51Var) {
        xl4 xl4Var;
        q15 q15Var;
        if (s51Var instanceof xl4) {
            xl4Var = (xl4) s51Var;
            int i = xl4Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                xl4Var.i0 = i - Integer.MIN_VALUE;
            } else {
                xl4Var = new xl4(this, s51Var);
            }
        } else {
            xl4Var = new xl4(this, s51Var);
        }
        Object obj = xl4Var.g0;
        int i2 = xl4Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            q15 q15Var2 = this.q1;
            xl4Var.f0 = q15Var2;
            xl4Var.i0 = 1;
            Object objG = q15Var2.g(xl4Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
            q15Var = q15Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q15Var = xl4Var.f0;
            w39.n0(obj);
        }
        try {
            ss8 ss8Var = ss8.a;
            ss8.I(this);
            List list = (List) G().H.X.getValue();
            if (list != null && list.isEmpty()) {
                b0(false);
            }
            return dn8.a;
        } finally {
            q15Var.m((Object) null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object l0(uy7 uy7Var) {
        G().K();
        boolean zU = G().u();
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        if (zU) {
            Object objK0 = k0(uy7Var);
            if (objK0 == c71Var) {
                return objK0;
            }
        } else {
            kw4 kw4Var = kw4.a;
            if (!kw4.n()) {
                be.m(this, getString(y46.main_error_no_subscriptions_title), getString(y46.main_error_no_subscriptions_description), (String) null, getString(R.string.ok), (String) null, new Integer(t46.dialog_alert_warning), (dn2) null, (dn2) null, 1874);
                return dn8Var;
            }
            Object objH0 = h0(uy7Var);
            if (objH0 == c71Var) {
                return objH0;
            }
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object m0(ArrayList arrayList, int i, int i2, s51 s51Var) {
        qg5 qg5Var = (qg5) arrayList.get(i);
        String strD = ((SubId) qg5Var.X).d();
        SubscriptionItem subscriptionItem = (SubscriptionItem) qg5Var.Y;
        if (subscriptionItem != null) {
            m51 m51Var = ko1.B1;
            km4.l0(n(), jo1.X, (String) null);
            HappApplication happApplication = HappApplication.M0;
            k32.i().d().h(new uq0(subscriptionItem, (byte) 3));
            nv0 nv0Var = new nv0();
            nv0Var.X = i;
            nv0Var.Y = i2;
            nv0Var.Z = this;
            nv0Var.f0 = arrayList;
            Object objP = P(this, strD, subscriptionItem, true, false, false, null, true, false, null, nv0Var, s51Var, 304);
            if (objP == c71.X) {
                return objP;
            }
        }
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n0() {
        a45 rj6Var;
        Object value;
        xm4 xm4Var;
        vz7 vz7Var = this.r1;
        try {
            NetworkCapabilities networkCapabilities = ((ConnectivityManager) vz7Var.getValue()).getNetworkCapabilities(((ConnectivityManager) vz7Var.getValue()).getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasTransport(1)) {
                rj6Var = (networkCapabilities == null || !networkCapabilities.hasTransport(0)) ? null : a45.Y;
            } else {
                rj6Var = a45.X;
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        a45 a45Var = rj6Var instanceof rj6 ? null : rj6Var;
        MainViewModel mainViewModelG = G();
        if (((xm4) mainViewModelG.x.X.getValue()).h == a45Var) {
            return;
        }
        oh7 oh7Var = mainViewModelG.w;
        do {
            value = oh7Var.getValue();
            xm4Var = (xm4) value;
            xm4Var.getClass();
        } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, 0, 0, a45Var, null, false, null, false, null, false, false, null, 65407)));
        mainViewModelG.s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r44v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        AppCompatImageButton appCompatImageButtonB;
        AppCompatImageButton appCompatImageButtonB2;
        AppCompatImageView appCompatImageViewB;
        CardView cardViewB;
        View viewB;
        AppCompatImageButton appCompatImageButtonB3;
        AppCompatImageButton appCompatImageButtonB4;
        Object value;
        xm4 xm4Var;
        Object value2;
        xm4 xm4Var2;
        super/*su.happ.proxyutility.ui.BaseActivity*/.onCreate(bundle);
        final byte b = 1;
        HappApplication.P0 = true;
        q51 q51Var = null;
        final byte b2 = 0;
        DrawerLayout drawerLayoutInflate = getLayoutInflater().inflate(t46.activity_main, (ViewGroup) null, false);
        int i = e46.bg_jobs;
        if (ln7.b(drawerLayoutInflate, i) != null) {
            i = e46.btn_ai_helper;
            HappDebouncedTextButton happDebouncedTextButton = (HappDebouncedTextButton) ln7.b(drawerLayoutInflate, i);
            if (happDebouncedTextButton != null) {
                HappDebouncedTextButton happDebouncedTextButton2 = (HappDebouncedTextButton) ln7.b(drawerLayoutInflate, e46.btn_clipboard);
                i = e46.btn_invalid_time;
                AppCompatImageButton appCompatImageButtonB5 = ln7.b(drawerLayoutInflate, i);
                if (appCompatImageButtonB5 != null && (appCompatImageButtonB = ln7.b(drawerLayoutInflate, (i = e46.btn_jobs))) != null && (appCompatImageButtonB2 = ln7.b(drawerLayoutInflate, (i = e46.btn_notification_disabled))) != null) {
                    i = e46.btn_power;
                    HappDebouncedImageButton happDebouncedImageButton = (HappDebouncedImageButton) ln7.b(drawerLayoutInflate, i);
                    if (happDebouncedImageButton != null && (appCompatImageViewB = ln7.b(drawerLayoutInflate, (i = e46.btn_power_circle))) != null) {
                        i = e46.btn_power_connected_time;
                        HappTextView happTextView = (HappTextView) ln7.b(drawerLayoutInflate, i);
                        if (happTextView != null) {
                            i = e46.btn_power_disconnect;
                            HappTextView happTextView2 = (HappTextView) ln7.b(drawerLayoutInflate, i);
                            if (happTextView2 != null) {
                                HappDebouncedTextButton happDebouncedTextButton3 = (HappDebouncedTextButton) ln7.b(drawerLayoutInflate, e46.btn_qr_code);
                                i = e46.btn_stories;
                                AppCompatImageButton appCompatImageButtonB6 = ln7.b(drawerLayoutInflate, i);
                                if (appCompatImageButtonB6 != null) {
                                    AppCompatButton appCompatButtonB = ln7.b(drawerLayoutInflate, e46.btn_test_ping);
                                    i = e46.composeView;
                                    ComposeView composeViewB = ln7.b(drawerLayoutInflate, i);
                                    if (composeViewB != null) {
                                        i = e46.fl_geo_progress;
                                        if (((FrameLayout) ln7.b(drawerLayoutInflate, i)) != null) {
                                            i = e46.fragment_container_view;
                                            if (ln7.b(drawerLayoutInflate, i) != null && (cardViewB = ln7.b(drawerLayoutInflate, (i = e46.geo_progress))) != null) {
                                                ln7.b(drawerLayoutInflate, e46.guideline_power_height_max);
                                                ln7.b(drawerLayoutInflate, e46.guideline_test_hide_buttons_divisor);
                                                ShapeableImageView shapeableImageViewB = ln7.b(drawerLayoutInflate, e46.iv_current_server_flag);
                                                i = e46.iv_geo_file_progress;
                                                AppCompatImageView appCompatImageViewB2 = ln7.b(drawerLayoutInflate, i);
                                                if (appCompatImageViewB2 != null) {
                                                    RelativeLayout relativeLayout = (RelativeLayout) ln7.b(drawerLayoutInflate, e46.layout_hide_all);
                                                    i = e46.layout_main;
                                                    ConstraintLayout constraintLayoutB = ln7.b(drawerLayoutInflate, i);
                                                    if (constraintLayoutB != null) {
                                                        ConstraintLayout constraintLayoutB2 = ln7.b(drawerLayoutInflate, e46.layout_no_configs);
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ln7.b(drawerLayoutInflate, e46.layout_test_current_config);
                                                        LinearLayout linearLayout = (LinearLayout) ln7.b(drawerLayoutInflate, e46.ll_current_server);
                                                        i = e46.ll_hwid;
                                                        LinearLayout linearLayout2 = (LinearLayout) ln7.b(drawerLayoutInflate, i);
                                                        if (linearLayout2 != null) {
                                                            i = e46.ll_jobs;
                                                            if (((LinearLayout) ln7.b(drawerLayoutInflate, i)) != null) {
                                                                i = e46.root_layout;
                                                                LinearLayout linearLayout3 = (LinearLayout) ln7.b(drawerLayoutInflate, i);
                                                                if (linearLayout3 != null && (viewB = ln7.b(drawerLayoutInflate, (i = e46.rv_config_groups))) != null) {
                                                                    i = e46.snackbar_host_root;
                                                                    HappSnackbarHost happSnackbarHost = (HappSnackbarHost) ln7.b(drawerLayoutInflate, i);
                                                                    if (happSnackbarHost != null) {
                                                                        i = e46.toolbar;
                                                                        if (ln7.b(drawerLayoutInflate, i) != null) {
                                                                            i = e46.toolbar_left_side;
                                                                            if (ln7.b(drawerLayoutInflate, i) != null && (appCompatImageButtonB3 = ln7.b(drawerLayoutInflate, (i = e46.toolbar_main_add))) != null) {
                                                                                i = e46.toolbar_main_dev_mode;
                                                                                HappTextView happTextView3 = (HappTextView) ln7.b(drawerLayoutInflate, i);
                                                                                if (happTextView3 != null && (appCompatImageButtonB4 = ln7.b(drawerLayoutInflate, (i = e46.toolbar_main_settings))) != null) {
                                                                                    HappTextView happTextView4 = (HappTextView) ln7.b(drawerLayoutInflate, e46.tv_current_server_title);
                                                                                    i = e46.tv_geo_progress_description;
                                                                                    HappTextView happTextView5 = (HappTextView) ln7.b(drawerLayoutInflate, i);
                                                                                    if (happTextView5 != null) {
                                                                                        i = e46.tv_geo_progress_title;
                                                                                        HappTextView happTextView6 = (HappTextView) ln7.b(drawerLayoutInflate, i);
                                                                                        if (happTextView6 != null) {
                                                                                            HappTextView happTextView7 = (HappTextView) ln7.b(drawerLayoutInflate, e46.tv_hide_all);
                                                                                            i = e46.tv_hint;
                                                                                            HappTextView happTextView8 = (HappTextView) ln7.b(drawerLayoutInflate, i);
                                                                                            if (happTextView8 != null) {
                                                                                                i = e46.tv_hwid;
                                                                                                HappTextView happTextView9 = (HappTextView) ln7.b(drawerLayoutInflate, i);
                                                                                                if (happTextView9 != null) {
                                                                                                    i = e46.tv_jobs;
                                                                                                    if (((HappTextView) ln7.b(drawerLayoutInflate, i)) != null) {
                                                                                                        DrawerLayout drawerLayout = drawerLayoutInflate;
                                                                                                        this.Q0 = new b6(drawerLayout, happDebouncedTextButton, happDebouncedTextButton2, appCompatImageButtonB5, appCompatImageButtonB, appCompatImageButtonB2, happDebouncedImageButton, appCompatImageViewB, happTextView, happTextView2, happDebouncedTextButton3, appCompatImageButtonB6, appCompatButtonB, composeViewB, cardViewB, shapeableImageViewB, appCompatImageViewB2, relativeLayout, constraintLayoutB, constraintLayoutB2, relativeLayout2, linearLayout, linearLayout2, linearLayout3, viewB, happSnackbarHost, appCompatImageButtonB3, happTextView3, appCompatImageButtonB4, happTextView4, happTextView5, happTextView6, happTextView7, happTextView8, happTextView9, (HappTextView) ln7.b(drawerLayoutInflate, e46.tv_test_current_config));
                                                                                                        setContentView(drawerLayout);
                                                                                                        vz7 vz7Var = this.p1;
                                                                                                        mb6.g((ck4) vz7Var.getValue());
                                                                                                        a0();
                                                                                                        b0(false);
                                                                                                        MMKV.u();
                                                                                                        MainViewModel mainViewModelG = G();
                                                                                                        int iE = ((MMKV) mainViewModelG.d.getValue()).e(0, "pref_job_open");
                                                                                                        oh7 oh7Var = mainViewModelG.w;
                                                                                                        do {
                                                                                                            value = oh7Var.getValue();
                                                                                                            xm4Var = (xm4) value;
                                                                                                            xm4Var.getClass();
                                                                                                        } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, 0, iE, null, null, false, null, false, null, false, false, null, 65471)));
                                                                                                        MainViewModel mainViewModelG2 = G();
                                                                                                        String strI = mainViewModelG2.n().i("SELECTED_SERVER");
                                                                                                        if (strI != null) {
                                                                                                            kw4 kw4Var = kw4.a;
                                                                                                            ServerConfig serverConfigB = kw4.b(strI);
                                                                                                            if (serverConfigB != null) {
                                                                                                                oh7 oh7Var2 = mainViewModelG2.w;
                                                                                                                do {
                                                                                                                    value2 = oh7Var2.getValue();
                                                                                                                    xm4Var2 = (xm4) value2;
                                                                                                                    xm4Var2.getClass();
                                                                                                                } while (!oh7Var2.k(value2, xm4.a(xm4Var2, null, 0L, serverConfigB, null, false, 0, 0, null, null, false, null, false, null, false, false, null, 65531)));
                                                                                                            }
                                                                                                        }
                                                                                                        g94 g94Var = ((ComponentActivity) this).X;
                                                                                                        u84 u84VarZ = ys0.z(g94Var);
                                                                                                        nf1 nf1Var = tp1.a;
                                                                                                        hv2 hv2Var = dm4.a;
                                                                                                        final byte b3 = 2;
                                                                                                        jm4.Q(u84VarZ, hv2Var, new wj4(this, q51Var, (byte) 22), 2);
                                                                                                        ((yz4) G().J.getValue()).e(this, new bm4(new oj4(this, b), (byte) 0));
                                                                                                        final byte b4 = 3;
                                                                                                        jm4.Q(ys0.z(g94Var), (u61) null, new wj4(this, q51Var, (byte) 24), 3);
                                                                                                        jm4.Q(ys0.z(g94Var), hv2Var, new wj4(this, q51Var, (byte) 26), 2);
                                                                                                        jm4.Q(ys0.z(g94Var), hv2Var, new wj4(this, q51Var, (byte) 28), 2);
                                                                                                        G().m().e(this, new bm4(new oj4(this, b3), (byte) 0));
                                                                                                        jm4.Q(ys0.z(g94Var), hv2Var, new pl4(this, q51Var, b2), 2);
                                                                                                        jm4.Q(ys0.z(g94Var), hv2Var, new pl4(this, q51Var, b3), 2);
                                                                                                        final byte b5 = 4;
                                                                                                        jm4.Q(ys0.z(g94Var), hv2Var, new pl4(this, q51Var, b5), 2);
                                                                                                        jm4.Q(ys0.z(g94Var), hv2Var, new wj4(this, q51Var, (byte) 16), 2);
                                                                                                        jm4.Q(ys0.z(g94Var), hv2Var, new wj4(this, q51Var, (byte) 18), 2);
                                                                                                        jm4.Q(ys0.z(g94Var), hv2Var, new wj4(this, q51Var, (byte) 21), 2);
                                                                                                        MainViewModel mainViewModelG3 = G();
                                                                                                        mainViewModelG3.X(rg8.f0);
                                                                                                        mainViewModelG3.m().j(om4.f0);
                                                                                                        Application application = mainViewModelG3.b;
                                                                                                        ue3.I(application, mainViewModelG3.M, new IntentFilter("su.happ.proxyutility.action.activity"), 2);
                                                                                                        qe4.L0(application, "su.happ.proxyutility.action.service", 1, "");
                                                                                                        final byte b6 = 13;
                                                                                                        qe4.L0(application, "su.happ.proxyutility.action.service", 13, "");
                                                                                                        String str = HappApplication.O0;
                                                                                                        str.getClass();
                                                                                                        mainViewModelG3.p(str);
                                                                                                        MainViewModel mainViewModelG4 = G();
                                                                                                        jm4.Q(zw8.a(mainViewModelG4), hv2Var, new oo4(mainViewModelG4, null), 2);
                                                                                                        jm4.Q(ys0.z(g94Var), (u61) null, new nk4(this, q51Var, b4), 3);
                                                                                                        G().v = this.o1;
                                                                                                        try {
                                                                                                            ((ConnectivityManager) this.r1.getValue()).requestNetwork((NetworkRequest) this.s1.getValue(), (yj4) this.t1.getValue());
                                                                                                        } catch (Throwable th) {
                                                                                                            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                                                                                                throw th;
                                                                                                            }
                                                                                                        }
                                                                                                        ss8 ss8Var = ss8.a;
                                                                                                        String strL = ss8.L(this);
                                                                                                        u84 u84VarZ2 = ys0.z(g94Var);
                                                                                                        nf1 nf1Var2 = tp1.a;
                                                                                                        jm4.Q(u84VarZ2, ye1.Z, new bk4(this, strL, q51Var, b2), 2);
                                                                                                        final byte b7 = 14;
                                                                                                        if (Build.VERSION.SDK_INT >= 33) {
                                                                                                            new y45(this).L(new String[]{"android.permission.POST_NOTIFICATIONS"}).a(new o61(new oj4(this, b2), (byte) 14));
                                                                                                        }
                                                                                                        b6 b6Var = this.Q0;
                                                                                                        if (b6Var == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        b6Var.p0.setContent(new zy0(-1557108490, true, new rj4(this, b2)));
                                                                                                        b6 b6Var2 = this.Q0;
                                                                                                        if (b6Var2 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        ConstraintLayout constraintLayout = b6Var2.v0;
                                                                                                        if (constraintLayout != null) {
                                                                                                            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                                                                                                            layoutParams.getClass();
                                                                                                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                                                                                            marginLayoutParams.bottomMargin = u() + marginLayoutParams.bottomMargin;
                                                                                                        }
                                                                                                        b6 b6Var3 = this.Q0;
                                                                                                        if (b6Var3 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        final byte b8 = 9;
                                                                                                        b6Var3.E0.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                            public final /* synthetic */ MainActivity Y;

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            {
                                                                                                                this.Y = this;
                                                                                                            }

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                            /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                            /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                Object value3;
                                                                                                                xm4 xm4Var3;
                                                                                                                String strB;
                                                                                                                int i2;
                                                                                                                byte b9 = b8;
                                                                                                                q51 q51Var2 = null;
                                                                                                                ComponentActivity componentActivity = this.Y;
                                                                                                                switch (b9) {
                                                                                                                    case 0:
                                                                                                                        b6 b6Var4 = componentActivity.Q0;
                                                                                                                        if (b6Var4 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        AppCompatTextView appCompatTextView = b6Var4.L0;
                                                                                                                        if (appCompatTextView != null) {
                                                                                                                            appCompatTextView.performClick();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                        int i3 = MainActivity.y1;
                                                                                                                        if (componentActivity.G().u()) {
                                                                                                                            componentActivity.g0();
                                                                                                                            qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                        int i4 = MainActivity.y1;
                                                                                                                        ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                        oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                        do {
                                                                                                                            value3 = oh7Var3.getValue();
                                                                                                                            xm4Var3 = (xm4) value3;
                                                                                                                            xm4Var3.getClass();
                                                                                                                        } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                        return;
                                                                                                                    case 3:
                                                                                                                        int i5 = MainActivity.y1;
                                                                                                                        componentActivity.N();
                                                                                                                        return;
                                                                                                                    case 4:
                                                                                                                        int i6 = MainActivity.y1;
                                                                                                                        componentActivity.R();
                                                                                                                        return;
                                                                                                                    case 5:
                                                                                                                        int i7 = MainActivity.y1;
                                                                                                                        ss8 ss8Var2 = ss8.a;
                                                                                                                        ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                        return;
                                                                                                                    case 6:
                                                                                                                        int i8 = MainActivity.y1;
                                                                                                                        if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                            b6 b6Var5 = componentActivity.Q0;
                                                                                                                            if (b6Var5 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView2 = b6Var5.I0;
                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                appCompatTextView2.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case 7:
                                                                                                                        int i9 = MainActivity.y1;
                                                                                                                        MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                        tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                        nf1 nf1Var3 = tp1.a;
                                                                                                                        jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                        return;
                                                                                                                    case 8:
                                                                                                                        int i10 = MainActivity.y1;
                                                                                                                        ss8 ss8Var3 = ss8.a;
                                                                                                                        ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                        pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                        return;
                                                                                                                    case 9:
                                                                                                                        int i11 = MainActivity.y1;
                                                                                                                        componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                        int i12 = MainActivity.y1;
                                                                                                                        n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                        b6 b6Var6 = componentActivity.Q0;
                                                                                                                        if (b6Var6 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        f63 f63Var = new f63(n51Var, b6Var6.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                        du4 du4Var = (du4) f63Var.Z;
                                                                                                                        nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                        String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                        if (strI2 != null) {
                                                                                                                            GuId guId = new GuId(strI2);
                                                                                                                            if (fm7.o0(guId.b())) {
                                                                                                                                guId = null;
                                                                                                                            }
                                                                                                                            if (guId != null) {
                                                                                                                                strB = guId.b();
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            strB = null;
                                                                                                                        }
                                                                                                                        f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                        du4Var.g = 8388613;
                                                                                                                        if (ue3.y(componentActivity)) {
                                                                                                                            i2 = v46.menu_main_tv;
                                                                                                                        } else {
                                                                                                                            ss8 ss8Var4 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                i2 = v46.menu_main_mobile;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                        MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                        menuItemFindItem.setVisible(false);
                                                                                                                        u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                        nf1 nf1Var4 = tp1.a;
                                                                                                                        jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                        MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                        menuItemFindItem2.setVisible(false);
                                                                                                                        MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                        menuItemFindItem3.setVisible(false);
                                                                                                                        ss8 ss8Var5 = ss8.a;
                                                                                                                        if (ss8.t()) {
                                                                                                                            menuItemFindItem2.setVisible(true);
                                                                                                                            menuItemFindItem3.setVisible(true);
                                                                                                                        }
                                                                                                                        if (du4Var.b()) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (du4Var.f != null) {
                                                                                                                            du4Var.d(0, 0, false, false);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 11:
                                                                                                                        int i13 = MainActivity.y1;
                                                                                                                        List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                        if (list != null) {
                                                                                                                            componentActivity.f0(list, true);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 12:
                                                                                                                        int i14 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                        return;
                                                                                                                    case 13:
                                                                                                                        int i15 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                        return;
                                                                                                                    case 14:
                                                                                                                        int i16 = MainActivity.y1;
                                                                                                                        int i17 = t46.dialog_alert_warning;
                                                                                                                        int i18 = y46.jobs_title;
                                                                                                                        ?? r6 = this.Y;
                                                                                                                        be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        int i19 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                        return;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        b6 b6Var4 = this.Q0;
                                                                                                        if (b6Var4 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        final byte b9 = 10;
                                                                                                        b6Var4.C0.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                            public final /* synthetic */ MainActivity Y;

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            {
                                                                                                                this.Y = this;
                                                                                                            }

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                            /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                            /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                Object value3;
                                                                                                                xm4 xm4Var3;
                                                                                                                String strB;
                                                                                                                int i2;
                                                                                                                byte b10 = b9;
                                                                                                                q51 q51Var2 = null;
                                                                                                                ComponentActivity componentActivity = this.Y;
                                                                                                                switch (b10) {
                                                                                                                    case 0:
                                                                                                                        b6 b6Var5 = componentActivity.Q0;
                                                                                                                        if (b6Var5 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        AppCompatTextView appCompatTextView = b6Var5.L0;
                                                                                                                        if (appCompatTextView != null) {
                                                                                                                            appCompatTextView.performClick();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                        int i3 = MainActivity.y1;
                                                                                                                        if (componentActivity.G().u()) {
                                                                                                                            componentActivity.g0();
                                                                                                                            qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                        int i4 = MainActivity.y1;
                                                                                                                        ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                        oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                        do {
                                                                                                                            value3 = oh7Var3.getValue();
                                                                                                                            xm4Var3 = (xm4) value3;
                                                                                                                            xm4Var3.getClass();
                                                                                                                        } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                        return;
                                                                                                                    case 3:
                                                                                                                        int i5 = MainActivity.y1;
                                                                                                                        componentActivity.N();
                                                                                                                        return;
                                                                                                                    case 4:
                                                                                                                        int i6 = MainActivity.y1;
                                                                                                                        componentActivity.R();
                                                                                                                        return;
                                                                                                                    case 5:
                                                                                                                        int i7 = MainActivity.y1;
                                                                                                                        ss8 ss8Var2 = ss8.a;
                                                                                                                        ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                        return;
                                                                                                                    case 6:
                                                                                                                        int i8 = MainActivity.y1;
                                                                                                                        if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                            b6 b6Var6 = componentActivity.Q0;
                                                                                                                            if (b6Var6 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView2 = b6Var6.I0;
                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                appCompatTextView2.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case 7:
                                                                                                                        int i9 = MainActivity.y1;
                                                                                                                        MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                        tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                        nf1 nf1Var3 = tp1.a;
                                                                                                                        jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                        return;
                                                                                                                    case 8:
                                                                                                                        int i10 = MainActivity.y1;
                                                                                                                        ss8 ss8Var3 = ss8.a;
                                                                                                                        ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                        pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                        return;
                                                                                                                    case 9:
                                                                                                                        int i11 = MainActivity.y1;
                                                                                                                        componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                        int i12 = MainActivity.y1;
                                                                                                                        n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                        b6 b6Var7 = componentActivity.Q0;
                                                                                                                        if (b6Var7 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        f63 f63Var = new f63(n51Var, b6Var7.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                        du4 du4Var = (du4) f63Var.Z;
                                                                                                                        nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                        String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                        if (strI2 != null) {
                                                                                                                            GuId guId = new GuId(strI2);
                                                                                                                            if (fm7.o0(guId.b())) {
                                                                                                                                guId = null;
                                                                                                                            }
                                                                                                                            if (guId != null) {
                                                                                                                                strB = guId.b();
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            strB = null;
                                                                                                                        }
                                                                                                                        f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                        du4Var.g = 8388613;
                                                                                                                        if (ue3.y(componentActivity)) {
                                                                                                                            i2 = v46.menu_main_tv;
                                                                                                                        } else {
                                                                                                                            ss8 ss8Var4 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                i2 = v46.menu_main_mobile;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                        MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                        menuItemFindItem.setVisible(false);
                                                                                                                        u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                        nf1 nf1Var4 = tp1.a;
                                                                                                                        jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                        MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                        menuItemFindItem2.setVisible(false);
                                                                                                                        MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                        menuItemFindItem3.setVisible(false);
                                                                                                                        ss8 ss8Var5 = ss8.a;
                                                                                                                        if (ss8.t()) {
                                                                                                                            menuItemFindItem2.setVisible(true);
                                                                                                                            menuItemFindItem3.setVisible(true);
                                                                                                                        }
                                                                                                                        if (du4Var.b()) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (du4Var.f != null) {
                                                                                                                            du4Var.d(0, 0, false, false);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 11:
                                                                                                                        int i13 = MainActivity.y1;
                                                                                                                        List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                        if (list != null) {
                                                                                                                            componentActivity.f0(list, true);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 12:
                                                                                                                        int i14 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                        return;
                                                                                                                    case 13:
                                                                                                                        int i15 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                        return;
                                                                                                                    case 14:
                                                                                                                        int i16 = MainActivity.y1;
                                                                                                                        int i17 = t46.dialog_alert_warning;
                                                                                                                        int i18 = y46.jobs_title;
                                                                                                                        ?? r6 = this.Y;
                                                                                                                        be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        int i19 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                        return;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        b6 b6Var5 = this.Q0;
                                                                                                        if (b6Var5 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        final byte b10 = 11;
                                                                                                        b6Var5.n0.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                            public final /* synthetic */ MainActivity Y;

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            {
                                                                                                                this.Y = this;
                                                                                                            }

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                            /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                            /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                Object value3;
                                                                                                                xm4 xm4Var3;
                                                                                                                String strB;
                                                                                                                int i2;
                                                                                                                byte b11 = b10;
                                                                                                                q51 q51Var2 = null;
                                                                                                                ComponentActivity componentActivity = this.Y;
                                                                                                                switch (b11) {
                                                                                                                    case 0:
                                                                                                                        b6 b6Var6 = componentActivity.Q0;
                                                                                                                        if (b6Var6 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        AppCompatTextView appCompatTextView = b6Var6.L0;
                                                                                                                        if (appCompatTextView != null) {
                                                                                                                            appCompatTextView.performClick();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                        int i3 = MainActivity.y1;
                                                                                                                        if (componentActivity.G().u()) {
                                                                                                                            componentActivity.g0();
                                                                                                                            qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                        int i4 = MainActivity.y1;
                                                                                                                        ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                        oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                        do {
                                                                                                                            value3 = oh7Var3.getValue();
                                                                                                                            xm4Var3 = (xm4) value3;
                                                                                                                            xm4Var3.getClass();
                                                                                                                        } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                        return;
                                                                                                                    case 3:
                                                                                                                        int i5 = MainActivity.y1;
                                                                                                                        componentActivity.N();
                                                                                                                        return;
                                                                                                                    case 4:
                                                                                                                        int i6 = MainActivity.y1;
                                                                                                                        componentActivity.R();
                                                                                                                        return;
                                                                                                                    case 5:
                                                                                                                        int i7 = MainActivity.y1;
                                                                                                                        ss8 ss8Var2 = ss8.a;
                                                                                                                        ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                        return;
                                                                                                                    case 6:
                                                                                                                        int i8 = MainActivity.y1;
                                                                                                                        if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                            b6 b6Var7 = componentActivity.Q0;
                                                                                                                            if (b6Var7 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView2 = b6Var7.I0;
                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                appCompatTextView2.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case 7:
                                                                                                                        int i9 = MainActivity.y1;
                                                                                                                        MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                        tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                        nf1 nf1Var3 = tp1.a;
                                                                                                                        jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                        return;
                                                                                                                    case 8:
                                                                                                                        int i10 = MainActivity.y1;
                                                                                                                        ss8 ss8Var3 = ss8.a;
                                                                                                                        ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                        pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                        return;
                                                                                                                    case 9:
                                                                                                                        int i11 = MainActivity.y1;
                                                                                                                        componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                        int i12 = MainActivity.y1;
                                                                                                                        n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                        b6 b6Var8 = componentActivity.Q0;
                                                                                                                        if (b6Var8 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        f63 f63Var = new f63(n51Var, b6Var8.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                        du4 du4Var = (du4) f63Var.Z;
                                                                                                                        nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                        String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                        if (strI2 != null) {
                                                                                                                            GuId guId = new GuId(strI2);
                                                                                                                            if (fm7.o0(guId.b())) {
                                                                                                                                guId = null;
                                                                                                                            }
                                                                                                                            if (guId != null) {
                                                                                                                                strB = guId.b();
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            strB = null;
                                                                                                                        }
                                                                                                                        f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                        du4Var.g = 8388613;
                                                                                                                        if (ue3.y(componentActivity)) {
                                                                                                                            i2 = v46.menu_main_tv;
                                                                                                                        } else {
                                                                                                                            ss8 ss8Var4 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                i2 = v46.menu_main_mobile;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                        MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                        menuItemFindItem.setVisible(false);
                                                                                                                        u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                        nf1 nf1Var4 = tp1.a;
                                                                                                                        jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                        MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                        menuItemFindItem2.setVisible(false);
                                                                                                                        MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                        menuItemFindItem3.setVisible(false);
                                                                                                                        ss8 ss8Var5 = ss8.a;
                                                                                                                        if (ss8.t()) {
                                                                                                                            menuItemFindItem2.setVisible(true);
                                                                                                                            menuItemFindItem3.setVisible(true);
                                                                                                                        }
                                                                                                                        if (du4Var.b()) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (du4Var.f != null) {
                                                                                                                            du4Var.d(0, 0, false, false);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 11:
                                                                                                                        int i13 = MainActivity.y1;
                                                                                                                        List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                        if (list != null) {
                                                                                                                            componentActivity.f0(list, true);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 12:
                                                                                                                        int i14 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                        return;
                                                                                                                    case 13:
                                                                                                                        int i15 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                        return;
                                                                                                                    case 14:
                                                                                                                        int i16 = MainActivity.y1;
                                                                                                                        int i17 = t46.dialog_alert_warning;
                                                                                                                        int i18 = y46.jobs_title;
                                                                                                                        ?? r6 = this.Y;
                                                                                                                        be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        int i19 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                        return;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        b6 b6Var6 = this.Q0;
                                                                                                        if (b6Var6 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        final byte b11 = 12;
                                                                                                        b6Var6.f0.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                            public final /* synthetic */ MainActivity Y;

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            {
                                                                                                                this.Y = this;
                                                                                                            }

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                            /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                            /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                Object value3;
                                                                                                                xm4 xm4Var3;
                                                                                                                String strB;
                                                                                                                int i2;
                                                                                                                byte b12 = b11;
                                                                                                                q51 q51Var2 = null;
                                                                                                                ComponentActivity componentActivity = this.Y;
                                                                                                                switch (b12) {
                                                                                                                    case 0:
                                                                                                                        b6 b6Var7 = componentActivity.Q0;
                                                                                                                        if (b6Var7 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        AppCompatTextView appCompatTextView = b6Var7.L0;
                                                                                                                        if (appCompatTextView != null) {
                                                                                                                            appCompatTextView.performClick();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                        int i3 = MainActivity.y1;
                                                                                                                        if (componentActivity.G().u()) {
                                                                                                                            componentActivity.g0();
                                                                                                                            qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                        int i4 = MainActivity.y1;
                                                                                                                        ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                        oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                        do {
                                                                                                                            value3 = oh7Var3.getValue();
                                                                                                                            xm4Var3 = (xm4) value3;
                                                                                                                            xm4Var3.getClass();
                                                                                                                        } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                        return;
                                                                                                                    case 3:
                                                                                                                        int i5 = MainActivity.y1;
                                                                                                                        componentActivity.N();
                                                                                                                        return;
                                                                                                                    case 4:
                                                                                                                        int i6 = MainActivity.y1;
                                                                                                                        componentActivity.R();
                                                                                                                        return;
                                                                                                                    case 5:
                                                                                                                        int i7 = MainActivity.y1;
                                                                                                                        ss8 ss8Var2 = ss8.a;
                                                                                                                        ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                        return;
                                                                                                                    case 6:
                                                                                                                        int i8 = MainActivity.y1;
                                                                                                                        if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                            b6 b6Var8 = componentActivity.Q0;
                                                                                                                            if (b6Var8 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView2 = b6Var8.I0;
                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                appCompatTextView2.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case 7:
                                                                                                                        int i9 = MainActivity.y1;
                                                                                                                        MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                        tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                        nf1 nf1Var3 = tp1.a;
                                                                                                                        jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                        return;
                                                                                                                    case 8:
                                                                                                                        int i10 = MainActivity.y1;
                                                                                                                        ss8 ss8Var3 = ss8.a;
                                                                                                                        ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                        pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                        return;
                                                                                                                    case 9:
                                                                                                                        int i11 = MainActivity.y1;
                                                                                                                        componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                        int i12 = MainActivity.y1;
                                                                                                                        n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                        b6 b6Var9 = componentActivity.Q0;
                                                                                                                        if (b6Var9 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        f63 f63Var = new f63(n51Var, b6Var9.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                        du4 du4Var = (du4) f63Var.Z;
                                                                                                                        nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                        String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                        if (strI2 != null) {
                                                                                                                            GuId guId = new GuId(strI2);
                                                                                                                            if (fm7.o0(guId.b())) {
                                                                                                                                guId = null;
                                                                                                                            }
                                                                                                                            if (guId != null) {
                                                                                                                                strB = guId.b();
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            strB = null;
                                                                                                                        }
                                                                                                                        f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                        du4Var.g = 8388613;
                                                                                                                        if (ue3.y(componentActivity)) {
                                                                                                                            i2 = v46.menu_main_tv;
                                                                                                                        } else {
                                                                                                                            ss8 ss8Var4 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                i2 = v46.menu_main_mobile;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                        MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                        menuItemFindItem.setVisible(false);
                                                                                                                        u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                        nf1 nf1Var4 = tp1.a;
                                                                                                                        jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                        MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                        menuItemFindItem2.setVisible(false);
                                                                                                                        MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                        menuItemFindItem3.setVisible(false);
                                                                                                                        ss8 ss8Var5 = ss8.a;
                                                                                                                        if (ss8.t()) {
                                                                                                                            menuItemFindItem2.setVisible(true);
                                                                                                                            menuItemFindItem3.setVisible(true);
                                                                                                                        }
                                                                                                                        if (du4Var.b()) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (du4Var.f != null) {
                                                                                                                            du4Var.d(0, 0, false, false);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 11:
                                                                                                                        int i13 = MainActivity.y1;
                                                                                                                        List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                        if (list != null) {
                                                                                                                            componentActivity.f0(list, true);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 12:
                                                                                                                        int i14 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                        return;
                                                                                                                    case 13:
                                                                                                                        int i15 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                        return;
                                                                                                                    case 14:
                                                                                                                        int i16 = MainActivity.y1;
                                                                                                                        int i17 = t46.dialog_alert_warning;
                                                                                                                        int i18 = y46.jobs_title;
                                                                                                                        ?? r6 = this.Y;
                                                                                                                        be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        int i19 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                        return;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        b6 b6Var7 = this.Q0;
                                                                                                        if (b6Var7 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        b6Var7.h0.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                            public final /* synthetic */ MainActivity Y;

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            {
                                                                                                                this.Y = this;
                                                                                                            }

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                            /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                            /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                Object value3;
                                                                                                                xm4 xm4Var3;
                                                                                                                String strB;
                                                                                                                int i2;
                                                                                                                byte b12 = b6;
                                                                                                                q51 q51Var2 = null;
                                                                                                                ComponentActivity componentActivity = this.Y;
                                                                                                                switch (b12) {
                                                                                                                    case 0:
                                                                                                                        b6 b6Var8 = componentActivity.Q0;
                                                                                                                        if (b6Var8 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        AppCompatTextView appCompatTextView = b6Var8.L0;
                                                                                                                        if (appCompatTextView != null) {
                                                                                                                            appCompatTextView.performClick();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                        int i3 = MainActivity.y1;
                                                                                                                        if (componentActivity.G().u()) {
                                                                                                                            componentActivity.g0();
                                                                                                                            qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                        int i4 = MainActivity.y1;
                                                                                                                        ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                        oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                        do {
                                                                                                                            value3 = oh7Var3.getValue();
                                                                                                                            xm4Var3 = (xm4) value3;
                                                                                                                            xm4Var3.getClass();
                                                                                                                        } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                        return;
                                                                                                                    case 3:
                                                                                                                        int i5 = MainActivity.y1;
                                                                                                                        componentActivity.N();
                                                                                                                        return;
                                                                                                                    case 4:
                                                                                                                        int i6 = MainActivity.y1;
                                                                                                                        componentActivity.R();
                                                                                                                        return;
                                                                                                                    case 5:
                                                                                                                        int i7 = MainActivity.y1;
                                                                                                                        ss8 ss8Var2 = ss8.a;
                                                                                                                        ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                        return;
                                                                                                                    case 6:
                                                                                                                        int i8 = MainActivity.y1;
                                                                                                                        if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                            b6 b6Var9 = componentActivity.Q0;
                                                                                                                            if (b6Var9 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView2 = b6Var9.I0;
                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                appCompatTextView2.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case 7:
                                                                                                                        int i9 = MainActivity.y1;
                                                                                                                        MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                        tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                        nf1 nf1Var3 = tp1.a;
                                                                                                                        jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                        return;
                                                                                                                    case 8:
                                                                                                                        int i10 = MainActivity.y1;
                                                                                                                        ss8 ss8Var3 = ss8.a;
                                                                                                                        ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                        pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                        return;
                                                                                                                    case 9:
                                                                                                                        int i11 = MainActivity.y1;
                                                                                                                        componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                        int i12 = MainActivity.y1;
                                                                                                                        n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                        b6 b6Var10 = componentActivity.Q0;
                                                                                                                        if (b6Var10 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        f63 f63Var = new f63(n51Var, b6Var10.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                        du4 du4Var = (du4) f63Var.Z;
                                                                                                                        nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                        String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                        if (strI2 != null) {
                                                                                                                            GuId guId = new GuId(strI2);
                                                                                                                            if (fm7.o0(guId.b())) {
                                                                                                                                guId = null;
                                                                                                                            }
                                                                                                                            if (guId != null) {
                                                                                                                                strB = guId.b();
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            strB = null;
                                                                                                                        }
                                                                                                                        f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                        du4Var.g = 8388613;
                                                                                                                        if (ue3.y(componentActivity)) {
                                                                                                                            i2 = v46.menu_main_tv;
                                                                                                                        } else {
                                                                                                                            ss8 ss8Var4 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                i2 = v46.menu_main_mobile;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                        MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                        menuItemFindItem.setVisible(false);
                                                                                                                        u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                        nf1 nf1Var4 = tp1.a;
                                                                                                                        jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                        MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                        menuItemFindItem2.setVisible(false);
                                                                                                                        MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                        menuItemFindItem3.setVisible(false);
                                                                                                                        ss8 ss8Var5 = ss8.a;
                                                                                                                        if (ss8.t()) {
                                                                                                                            menuItemFindItem2.setVisible(true);
                                                                                                                            menuItemFindItem3.setVisible(true);
                                                                                                                        }
                                                                                                                        if (du4Var.b()) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (du4Var.f != null) {
                                                                                                                            du4Var.d(0, 0, false, false);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 11:
                                                                                                                        int i13 = MainActivity.y1;
                                                                                                                        List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                        if (list != null) {
                                                                                                                            componentActivity.f0(list, true);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 12:
                                                                                                                        int i14 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                        return;
                                                                                                                    case 13:
                                                                                                                        int i15 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                        return;
                                                                                                                    case 14:
                                                                                                                        int i16 = MainActivity.y1;
                                                                                                                        int i17 = t46.dialog_alert_warning;
                                                                                                                        int i18 = y46.jobs_title;
                                                                                                                        ?? r6 = this.Y;
                                                                                                                        be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        int i19 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                        return;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        b6 b6Var8 = this.Q0;
                                                                                                        if (b6Var8 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        b6Var8.g0.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                            public final /* synthetic */ MainActivity Y;

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            {
                                                                                                                this.Y = this;
                                                                                                            }

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                            /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                            /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                Object value3;
                                                                                                                xm4 xm4Var3;
                                                                                                                String strB;
                                                                                                                int i2;
                                                                                                                byte b12 = b7;
                                                                                                                q51 q51Var2 = null;
                                                                                                                ComponentActivity componentActivity = this.Y;
                                                                                                                switch (b12) {
                                                                                                                    case 0:
                                                                                                                        b6 b6Var9 = componentActivity.Q0;
                                                                                                                        if (b6Var9 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        AppCompatTextView appCompatTextView = b6Var9.L0;
                                                                                                                        if (appCompatTextView != null) {
                                                                                                                            appCompatTextView.performClick();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                        int i3 = MainActivity.y1;
                                                                                                                        if (componentActivity.G().u()) {
                                                                                                                            componentActivity.g0();
                                                                                                                            qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                        int i4 = MainActivity.y1;
                                                                                                                        ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                        oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                        do {
                                                                                                                            value3 = oh7Var3.getValue();
                                                                                                                            xm4Var3 = (xm4) value3;
                                                                                                                            xm4Var3.getClass();
                                                                                                                        } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                        return;
                                                                                                                    case 3:
                                                                                                                        int i5 = MainActivity.y1;
                                                                                                                        componentActivity.N();
                                                                                                                        return;
                                                                                                                    case 4:
                                                                                                                        int i6 = MainActivity.y1;
                                                                                                                        componentActivity.R();
                                                                                                                        return;
                                                                                                                    case 5:
                                                                                                                        int i7 = MainActivity.y1;
                                                                                                                        ss8 ss8Var2 = ss8.a;
                                                                                                                        ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                        return;
                                                                                                                    case 6:
                                                                                                                        int i8 = MainActivity.y1;
                                                                                                                        if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                            b6 b6Var10 = componentActivity.Q0;
                                                                                                                            if (b6Var10 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView2 = b6Var10.I0;
                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                appCompatTextView2.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case 7:
                                                                                                                        int i9 = MainActivity.y1;
                                                                                                                        MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                        tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                        nf1 nf1Var3 = tp1.a;
                                                                                                                        jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                        return;
                                                                                                                    case 8:
                                                                                                                        int i10 = MainActivity.y1;
                                                                                                                        ss8 ss8Var3 = ss8.a;
                                                                                                                        ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                        pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                        return;
                                                                                                                    case 9:
                                                                                                                        int i11 = MainActivity.y1;
                                                                                                                        componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                        int i12 = MainActivity.y1;
                                                                                                                        n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                        b6 b6Var11 = componentActivity.Q0;
                                                                                                                        if (b6Var11 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        f63 f63Var = new f63(n51Var, b6Var11.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                        du4 du4Var = (du4) f63Var.Z;
                                                                                                                        nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                        String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                        if (strI2 != null) {
                                                                                                                            GuId guId = new GuId(strI2);
                                                                                                                            if (fm7.o0(guId.b())) {
                                                                                                                                guId = null;
                                                                                                                            }
                                                                                                                            if (guId != null) {
                                                                                                                                strB = guId.b();
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            strB = null;
                                                                                                                        }
                                                                                                                        f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                        du4Var.g = 8388613;
                                                                                                                        if (ue3.y(componentActivity)) {
                                                                                                                            i2 = v46.menu_main_tv;
                                                                                                                        } else {
                                                                                                                            ss8 ss8Var4 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                i2 = v46.menu_main_mobile;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                        MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                        menuItemFindItem.setVisible(false);
                                                                                                                        u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                        nf1 nf1Var4 = tp1.a;
                                                                                                                        jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                        MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                        menuItemFindItem2.setVisible(false);
                                                                                                                        MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                        menuItemFindItem3.setVisible(false);
                                                                                                                        ss8 ss8Var5 = ss8.a;
                                                                                                                        if (ss8.t()) {
                                                                                                                            menuItemFindItem2.setVisible(true);
                                                                                                                            menuItemFindItem3.setVisible(true);
                                                                                                                        }
                                                                                                                        if (du4Var.b()) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (du4Var.f != null) {
                                                                                                                            du4Var.d(0, 0, false, false);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 11:
                                                                                                                        int i13 = MainActivity.y1;
                                                                                                                        List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                        if (list != null) {
                                                                                                                            componentActivity.f0(list, true);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 12:
                                                                                                                        int i14 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                        return;
                                                                                                                    case 13:
                                                                                                                        int i15 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                        return;
                                                                                                                    case 14:
                                                                                                                        int i16 = MainActivity.y1;
                                                                                                                        int i17 = t46.dialog_alert_warning;
                                                                                                                        int i18 = y46.jobs_title;
                                                                                                                        ?? r6 = this.Y;
                                                                                                                        be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        int i19 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                        return;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        b6 b6Var9 = this.Q0;
                                                                                                        if (b6Var9 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        final byte b12 = 15;
                                                                                                        b6Var9.i0.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                            public final /* synthetic */ MainActivity Y;

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            {
                                                                                                                this.Y = this;
                                                                                                            }

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                            /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                            /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                Object value3;
                                                                                                                xm4 xm4Var3;
                                                                                                                String strB;
                                                                                                                int i2;
                                                                                                                byte b13 = b12;
                                                                                                                q51 q51Var2 = null;
                                                                                                                ComponentActivity componentActivity = this.Y;
                                                                                                                switch (b13) {
                                                                                                                    case 0:
                                                                                                                        b6 b6Var10 = componentActivity.Q0;
                                                                                                                        if (b6Var10 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        AppCompatTextView appCompatTextView = b6Var10.L0;
                                                                                                                        if (appCompatTextView != null) {
                                                                                                                            appCompatTextView.performClick();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                        int i3 = MainActivity.y1;
                                                                                                                        if (componentActivity.G().u()) {
                                                                                                                            componentActivity.g0();
                                                                                                                            qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                        int i4 = MainActivity.y1;
                                                                                                                        ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                        oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                        do {
                                                                                                                            value3 = oh7Var3.getValue();
                                                                                                                            xm4Var3 = (xm4) value3;
                                                                                                                            xm4Var3.getClass();
                                                                                                                        } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                        return;
                                                                                                                    case 3:
                                                                                                                        int i5 = MainActivity.y1;
                                                                                                                        componentActivity.N();
                                                                                                                        return;
                                                                                                                    case 4:
                                                                                                                        int i6 = MainActivity.y1;
                                                                                                                        componentActivity.R();
                                                                                                                        return;
                                                                                                                    case 5:
                                                                                                                        int i7 = MainActivity.y1;
                                                                                                                        ss8 ss8Var2 = ss8.a;
                                                                                                                        ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                        return;
                                                                                                                    case 6:
                                                                                                                        int i8 = MainActivity.y1;
                                                                                                                        if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                            b6 b6Var11 = componentActivity.Q0;
                                                                                                                            if (b6Var11 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView2 = b6Var11.I0;
                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                appCompatTextView2.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case 7:
                                                                                                                        int i9 = MainActivity.y1;
                                                                                                                        MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                        tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                        nf1 nf1Var3 = tp1.a;
                                                                                                                        jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                        return;
                                                                                                                    case 8:
                                                                                                                        int i10 = MainActivity.y1;
                                                                                                                        ss8 ss8Var3 = ss8.a;
                                                                                                                        ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                        pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                        return;
                                                                                                                    case 9:
                                                                                                                        int i11 = MainActivity.y1;
                                                                                                                        componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                        int i12 = MainActivity.y1;
                                                                                                                        n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                        b6 b6Var12 = componentActivity.Q0;
                                                                                                                        if (b6Var12 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        f63 f63Var = new f63(n51Var, b6Var12.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                        du4 du4Var = (du4) f63Var.Z;
                                                                                                                        nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                        String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                        if (strI2 != null) {
                                                                                                                            GuId guId = new GuId(strI2);
                                                                                                                            if (fm7.o0(guId.b())) {
                                                                                                                                guId = null;
                                                                                                                            }
                                                                                                                            if (guId != null) {
                                                                                                                                strB = guId.b();
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            strB = null;
                                                                                                                        }
                                                                                                                        f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                        du4Var.g = 8388613;
                                                                                                                        if (ue3.y(componentActivity)) {
                                                                                                                            i2 = v46.menu_main_tv;
                                                                                                                        } else {
                                                                                                                            ss8 ss8Var4 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                i2 = v46.menu_main_mobile;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                        MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                        menuItemFindItem.setVisible(false);
                                                                                                                        u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                        nf1 nf1Var4 = tp1.a;
                                                                                                                        jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                        MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                        menuItemFindItem2.setVisible(false);
                                                                                                                        MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                        menuItemFindItem3.setVisible(false);
                                                                                                                        ss8 ss8Var5 = ss8.a;
                                                                                                                        if (ss8.t()) {
                                                                                                                            menuItemFindItem2.setVisible(true);
                                                                                                                            menuItemFindItem3.setVisible(true);
                                                                                                                        }
                                                                                                                        if (du4Var.b()) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (du4Var.f != null) {
                                                                                                                            du4Var.d(0, 0, false, false);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 11:
                                                                                                                        int i13 = MainActivity.y1;
                                                                                                                        List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                        if (list != null) {
                                                                                                                            componentActivity.f0(list, true);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 12:
                                                                                                                        int i14 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                        return;
                                                                                                                    case 13:
                                                                                                                        int i15 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                        return;
                                                                                                                    case 14:
                                                                                                                        int i16 = MainActivity.y1;
                                                                                                                        int i17 = t46.dialog_alert_warning;
                                                                                                                        int i18 = y46.jobs_title;
                                                                                                                        ?? r6 = this.Y;
                                                                                                                        be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        int i19 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                        return;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        b6 b6Var10 = this.Q0;
                                                                                                        if (b6Var10 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        b6Var10.i0.setOnTouchListener(new vw1(this, (byte) 1));
                                                                                                        b6 b6Var11 = this.Q0;
                                                                                                        if (b6Var11 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        RelativeLayout relativeLayout3 = b6Var11.w0;
                                                                                                        if (relativeLayout3 != null) {
                                                                                                            relativeLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                                public final /* synthetic */ MainActivity Y;

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                {
                                                                                                                    this.Y = this;
                                                                                                                }

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                                /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                                /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    Object value3;
                                                                                                                    xm4 xm4Var3;
                                                                                                                    String strB;
                                                                                                                    int i2;
                                                                                                                    byte b13 = b2;
                                                                                                                    q51 q51Var2 = null;
                                                                                                                    ComponentActivity componentActivity = this.Y;
                                                                                                                    switch (b13) {
                                                                                                                        case 0:
                                                                                                                            b6 b6Var12 = componentActivity.Q0;
                                                                                                                            if (b6Var12 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView = b6Var12.L0;
                                                                                                                            if (appCompatTextView != null) {
                                                                                                                                appCompatTextView.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                            int i3 = MainActivity.y1;
                                                                                                                            if (componentActivity.G().u()) {
                                                                                                                                componentActivity.g0();
                                                                                                                                qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                            int i4 = MainActivity.y1;
                                                                                                                            ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                            oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                            do {
                                                                                                                                value3 = oh7Var3.getValue();
                                                                                                                                xm4Var3 = (xm4) value3;
                                                                                                                                xm4Var3.getClass();
                                                                                                                            } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                            return;
                                                                                                                        case 3:
                                                                                                                            int i5 = MainActivity.y1;
                                                                                                                            componentActivity.N();
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i6 = MainActivity.y1;
                                                                                                                            componentActivity.R();
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i7 = MainActivity.y1;
                                                                                                                            ss8 ss8Var2 = ss8.a;
                                                                                                                            ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i8 = MainActivity.y1;
                                                                                                                            if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                                b6 b6Var13 = componentActivity.Q0;
                                                                                                                                if (b6Var13 == null) {
                                                                                                                                    dh3.T("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                AppCompatTextView appCompatTextView2 = b6Var13.I0;
                                                                                                                                if (appCompatTextView2 != null) {
                                                                                                                                    appCompatTextView2.performClick();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i9 = MainActivity.y1;
                                                                                                                            MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                            tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                            nf1 nf1Var3 = tp1.a;
                                                                                                                            jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i10 = MainActivity.y1;
                                                                                                                            ss8 ss8Var3 = ss8.a;
                                                                                                                            ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                            pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i11 = MainActivity.y1;
                                                                                                                            componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                            int i12 = MainActivity.y1;
                                                                                                                            n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                            b6 b6Var14 = componentActivity.Q0;
                                                                                                                            if (b6Var14 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            f63 f63Var = new f63(n51Var, b6Var14.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                            du4 du4Var = (du4) f63Var.Z;
                                                                                                                            nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                            String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                            if (strI2 != null) {
                                                                                                                                GuId guId = new GuId(strI2);
                                                                                                                                if (fm7.o0(guId.b())) {
                                                                                                                                    guId = null;
                                                                                                                                }
                                                                                                                                if (guId != null) {
                                                                                                                                    strB = guId.b();
                                                                                                                                } else {
                                                                                                                                    strB = null;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                            f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                            du4Var.g = 8388613;
                                                                                                                            if (ue3.y(componentActivity)) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                ss8 ss8Var4 = ss8.a;
                                                                                                                                if (ss8.t()) {
                                                                                                                                    i2 = v46.menu_main_tv;
                                                                                                                                } else {
                                                                                                                                    i2 = v46.menu_main_mobile;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                            MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                            menuItemFindItem.setVisible(false);
                                                                                                                            u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                            nf1 nf1Var4 = tp1.a;
                                                                                                                            jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                            MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                            menuItemFindItem2.setVisible(false);
                                                                                                                            MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                            menuItemFindItem3.setVisible(false);
                                                                                                                            ss8 ss8Var5 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                menuItemFindItem2.setVisible(true);
                                                                                                                                menuItemFindItem3.setVisible(true);
                                                                                                                            }
                                                                                                                            if (du4Var.b()) {
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (du4Var.f != null) {
                                                                                                                                du4Var.d(0, 0, false, false);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 11:
                                                                                                                            int i13 = MainActivity.y1;
                                                                                                                            List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                            if (list != null) {
                                                                                                                                componentActivity.f0(list, true);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 12:
                                                                                                                            int i14 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i15 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                            return;
                                                                                                                        case 14:
                                                                                                                            int i16 = MainActivity.y1;
                                                                                                                            int i17 = t46.dialog_alert_warning;
                                                                                                                            int i18 = y46.jobs_title;
                                                                                                                            ?? r6 = this.Y;
                                                                                                                            be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i19 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                        b6 b6Var12 = this.Q0;
                                                                                                        if (b6Var12 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        AppCompatButton appCompatButton = b6Var12.L0;
                                                                                                        if (appCompatButton == null) {
                                                                                                            appCompatButton = b6Var12.o0;
                                                                                                        }
                                                                                                        if (appCompatButton != null) {
                                                                                                            appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                                public final /* synthetic */ MainActivity Y;

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                {
                                                                                                                    this.Y = this;
                                                                                                                }

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                                /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                                /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    Object value3;
                                                                                                                    xm4 xm4Var3;
                                                                                                                    String strB;
                                                                                                                    int i2;
                                                                                                                    byte b13 = b;
                                                                                                                    q51 q51Var2 = null;
                                                                                                                    ComponentActivity componentActivity = this.Y;
                                                                                                                    switch (b13) {
                                                                                                                        case 0:
                                                                                                                            b6 b6Var13 = componentActivity.Q0;
                                                                                                                            if (b6Var13 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView = b6Var13.L0;
                                                                                                                            if (appCompatTextView != null) {
                                                                                                                                appCompatTextView.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                            int i3 = MainActivity.y1;
                                                                                                                            if (componentActivity.G().u()) {
                                                                                                                                componentActivity.g0();
                                                                                                                                qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                            int i4 = MainActivity.y1;
                                                                                                                            ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                            oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                            do {
                                                                                                                                value3 = oh7Var3.getValue();
                                                                                                                                xm4Var3 = (xm4) value3;
                                                                                                                                xm4Var3.getClass();
                                                                                                                            } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                            return;
                                                                                                                        case 3:
                                                                                                                            int i5 = MainActivity.y1;
                                                                                                                            componentActivity.N();
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i6 = MainActivity.y1;
                                                                                                                            componentActivity.R();
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i7 = MainActivity.y1;
                                                                                                                            ss8 ss8Var2 = ss8.a;
                                                                                                                            ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i8 = MainActivity.y1;
                                                                                                                            if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                                b6 b6Var14 = componentActivity.Q0;
                                                                                                                                if (b6Var14 == null) {
                                                                                                                                    dh3.T("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                AppCompatTextView appCompatTextView2 = b6Var14.I0;
                                                                                                                                if (appCompatTextView2 != null) {
                                                                                                                                    appCompatTextView2.performClick();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i9 = MainActivity.y1;
                                                                                                                            MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                            tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                            nf1 nf1Var3 = tp1.a;
                                                                                                                            jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i10 = MainActivity.y1;
                                                                                                                            ss8 ss8Var3 = ss8.a;
                                                                                                                            ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                            pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i11 = MainActivity.y1;
                                                                                                                            componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                            int i12 = MainActivity.y1;
                                                                                                                            n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                            b6 b6Var15 = componentActivity.Q0;
                                                                                                                            if (b6Var15 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            f63 f63Var = new f63(n51Var, b6Var15.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                            du4 du4Var = (du4) f63Var.Z;
                                                                                                                            nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                            String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                            if (strI2 != null) {
                                                                                                                                GuId guId = new GuId(strI2);
                                                                                                                                if (fm7.o0(guId.b())) {
                                                                                                                                    guId = null;
                                                                                                                                }
                                                                                                                                if (guId != null) {
                                                                                                                                    strB = guId.b();
                                                                                                                                } else {
                                                                                                                                    strB = null;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                            f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                            du4Var.g = 8388613;
                                                                                                                            if (ue3.y(componentActivity)) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                ss8 ss8Var4 = ss8.a;
                                                                                                                                if (ss8.t()) {
                                                                                                                                    i2 = v46.menu_main_tv;
                                                                                                                                } else {
                                                                                                                                    i2 = v46.menu_main_mobile;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                            MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                            menuItemFindItem.setVisible(false);
                                                                                                                            u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                            nf1 nf1Var4 = tp1.a;
                                                                                                                            jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                            MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                            menuItemFindItem2.setVisible(false);
                                                                                                                            MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                            menuItemFindItem3.setVisible(false);
                                                                                                                            ss8 ss8Var5 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                menuItemFindItem2.setVisible(true);
                                                                                                                                menuItemFindItem3.setVisible(true);
                                                                                                                            }
                                                                                                                            if (du4Var.b()) {
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (du4Var.f != null) {
                                                                                                                                du4Var.d(0, 0, false, false);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 11:
                                                                                                                            int i13 = MainActivity.y1;
                                                                                                                            List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                            if (list != null) {
                                                                                                                                componentActivity.f0(list, true);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 12:
                                                                                                                            int i14 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i15 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                            return;
                                                                                                                        case 14:
                                                                                                                            int i16 = MainActivity.y1;
                                                                                                                            int i17 = t46.dialog_alert_warning;
                                                                                                                            int i18 = y46.jobs_title;
                                                                                                                            ?? r6 = this.Y;
                                                                                                                            be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i19 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                        b6 b6Var13 = this.Q0;
                                                                                                        if (b6Var13 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        b6Var13.q0.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                            public final /* synthetic */ MainActivity Y;

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            {
                                                                                                                this.Y = this;
                                                                                                            }

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                            /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                            /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                Object value3;
                                                                                                                xm4 xm4Var3;
                                                                                                                String strB;
                                                                                                                int i2;
                                                                                                                byte b13 = b3;
                                                                                                                q51 q51Var2 = null;
                                                                                                                ComponentActivity componentActivity = this.Y;
                                                                                                                switch (b13) {
                                                                                                                    case 0:
                                                                                                                        b6 b6Var14 = componentActivity.Q0;
                                                                                                                        if (b6Var14 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        AppCompatTextView appCompatTextView = b6Var14.L0;
                                                                                                                        if (appCompatTextView != null) {
                                                                                                                            appCompatTextView.performClick();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                        int i3 = MainActivity.y1;
                                                                                                                        if (componentActivity.G().u()) {
                                                                                                                            componentActivity.g0();
                                                                                                                            qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                        int i4 = MainActivity.y1;
                                                                                                                        ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                        oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                        do {
                                                                                                                            value3 = oh7Var3.getValue();
                                                                                                                            xm4Var3 = (xm4) value3;
                                                                                                                            xm4Var3.getClass();
                                                                                                                        } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                        return;
                                                                                                                    case 3:
                                                                                                                        int i5 = MainActivity.y1;
                                                                                                                        componentActivity.N();
                                                                                                                        return;
                                                                                                                    case 4:
                                                                                                                        int i6 = MainActivity.y1;
                                                                                                                        componentActivity.R();
                                                                                                                        return;
                                                                                                                    case 5:
                                                                                                                        int i7 = MainActivity.y1;
                                                                                                                        ss8 ss8Var2 = ss8.a;
                                                                                                                        ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                        return;
                                                                                                                    case 6:
                                                                                                                        int i8 = MainActivity.y1;
                                                                                                                        if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                            b6 b6Var15 = componentActivity.Q0;
                                                                                                                            if (b6Var15 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView2 = b6Var15.I0;
                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                appCompatTextView2.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case 7:
                                                                                                                        int i9 = MainActivity.y1;
                                                                                                                        MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                        tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                        nf1 nf1Var3 = tp1.a;
                                                                                                                        jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                        return;
                                                                                                                    case 8:
                                                                                                                        int i10 = MainActivity.y1;
                                                                                                                        ss8 ss8Var3 = ss8.a;
                                                                                                                        ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                        pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                        return;
                                                                                                                    case 9:
                                                                                                                        int i11 = MainActivity.y1;
                                                                                                                        componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                        int i12 = MainActivity.y1;
                                                                                                                        n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                        b6 b6Var16 = componentActivity.Q0;
                                                                                                                        if (b6Var16 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        f63 f63Var = new f63(n51Var, b6Var16.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                        du4 du4Var = (du4) f63Var.Z;
                                                                                                                        nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                        String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                        if (strI2 != null) {
                                                                                                                            GuId guId = new GuId(strI2);
                                                                                                                            if (fm7.o0(guId.b())) {
                                                                                                                                guId = null;
                                                                                                                            }
                                                                                                                            if (guId != null) {
                                                                                                                                strB = guId.b();
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            strB = null;
                                                                                                                        }
                                                                                                                        f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                        du4Var.g = 8388613;
                                                                                                                        if (ue3.y(componentActivity)) {
                                                                                                                            i2 = v46.menu_main_tv;
                                                                                                                        } else {
                                                                                                                            ss8 ss8Var4 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                i2 = v46.menu_main_mobile;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                        MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                        menuItemFindItem.setVisible(false);
                                                                                                                        u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                        nf1 nf1Var4 = tp1.a;
                                                                                                                        jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                        MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                        menuItemFindItem2.setVisible(false);
                                                                                                                        MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                        menuItemFindItem3.setVisible(false);
                                                                                                                        ss8 ss8Var5 = ss8.a;
                                                                                                                        if (ss8.t()) {
                                                                                                                            menuItemFindItem2.setVisible(true);
                                                                                                                            menuItemFindItem3.setVisible(true);
                                                                                                                        }
                                                                                                                        if (du4Var.b()) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (du4Var.f != null) {
                                                                                                                            du4Var.d(0, 0, false, false);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 11:
                                                                                                                        int i13 = MainActivity.y1;
                                                                                                                        List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                        if (list != null) {
                                                                                                                            componentActivity.f0(list, true);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 12:
                                                                                                                        int i14 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                        return;
                                                                                                                    case 13:
                                                                                                                        int i15 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                        return;
                                                                                                                    case 14:
                                                                                                                        int i16 = MainActivity.y1;
                                                                                                                        int i17 = t46.dialog_alert_warning;
                                                                                                                        int i18 = y46.jobs_title;
                                                                                                                        ?? r6 = this.Y;
                                                                                                                        be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        int i19 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                        return;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        if (!ue3.y(this)) {
                                                                                                            b6 b6Var14 = this.Q0;
                                                                                                            if (b6Var14 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            b6Var14.A0.setLayoutManager(new LinearLayoutManager(1));
                                                                                                        }
                                                                                                        b6 b6Var15 = this.Q0;
                                                                                                        if (b6Var15 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        b6Var15.A0.setAdapter(F());
                                                                                                        F().l = (vj4) this.T0.getValue();
                                                                                                        F().m = this;
                                                                                                        F().n = (ck4) vz7Var.getValue();
                                                                                                        b6 b6Var16 = this.Q0;
                                                                                                        if (b6Var16 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        MaterialButton materialButton = b6Var16.Z;
                                                                                                        if (materialButton != null) {
                                                                                                            materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                                public final /* synthetic */ MainActivity Y;

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                {
                                                                                                                    this.Y = this;
                                                                                                                }

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                                /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                                /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    Object value3;
                                                                                                                    xm4 xm4Var3;
                                                                                                                    String strB;
                                                                                                                    int i2;
                                                                                                                    byte b13 = b4;
                                                                                                                    q51 q51Var2 = null;
                                                                                                                    ComponentActivity componentActivity = this.Y;
                                                                                                                    switch (b13) {
                                                                                                                        case 0:
                                                                                                                            b6 b6Var17 = componentActivity.Q0;
                                                                                                                            if (b6Var17 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView = b6Var17.L0;
                                                                                                                            if (appCompatTextView != null) {
                                                                                                                                appCompatTextView.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                            int i3 = MainActivity.y1;
                                                                                                                            if (componentActivity.G().u()) {
                                                                                                                                componentActivity.g0();
                                                                                                                                qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                            int i4 = MainActivity.y1;
                                                                                                                            ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                            oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                            do {
                                                                                                                                value3 = oh7Var3.getValue();
                                                                                                                                xm4Var3 = (xm4) value3;
                                                                                                                                xm4Var3.getClass();
                                                                                                                            } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                            return;
                                                                                                                        case 3:
                                                                                                                            int i5 = MainActivity.y1;
                                                                                                                            componentActivity.N();
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i6 = MainActivity.y1;
                                                                                                                            componentActivity.R();
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i7 = MainActivity.y1;
                                                                                                                            ss8 ss8Var2 = ss8.a;
                                                                                                                            ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i8 = MainActivity.y1;
                                                                                                                            if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                                b6 b6Var18 = componentActivity.Q0;
                                                                                                                                if (b6Var18 == null) {
                                                                                                                                    dh3.T("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                AppCompatTextView appCompatTextView2 = b6Var18.I0;
                                                                                                                                if (appCompatTextView2 != null) {
                                                                                                                                    appCompatTextView2.performClick();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i9 = MainActivity.y1;
                                                                                                                            MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                            tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                            nf1 nf1Var3 = tp1.a;
                                                                                                                            jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i10 = MainActivity.y1;
                                                                                                                            ss8 ss8Var3 = ss8.a;
                                                                                                                            ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                            pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i11 = MainActivity.y1;
                                                                                                                            componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                            int i12 = MainActivity.y1;
                                                                                                                            n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                            b6 b6Var19 = componentActivity.Q0;
                                                                                                                            if (b6Var19 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            f63 f63Var = new f63(n51Var, b6Var19.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                            du4 du4Var = (du4) f63Var.Z;
                                                                                                                            nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                            String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                            if (strI2 != null) {
                                                                                                                                GuId guId = new GuId(strI2);
                                                                                                                                if (fm7.o0(guId.b())) {
                                                                                                                                    guId = null;
                                                                                                                                }
                                                                                                                                if (guId != null) {
                                                                                                                                    strB = guId.b();
                                                                                                                                } else {
                                                                                                                                    strB = null;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                            f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                            du4Var.g = 8388613;
                                                                                                                            if (ue3.y(componentActivity)) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                ss8 ss8Var4 = ss8.a;
                                                                                                                                if (ss8.t()) {
                                                                                                                                    i2 = v46.menu_main_tv;
                                                                                                                                } else {
                                                                                                                                    i2 = v46.menu_main_mobile;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                            MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                            menuItemFindItem.setVisible(false);
                                                                                                                            u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                            nf1 nf1Var4 = tp1.a;
                                                                                                                            jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                            MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                            menuItemFindItem2.setVisible(false);
                                                                                                                            MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                            menuItemFindItem3.setVisible(false);
                                                                                                                            ss8 ss8Var5 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                menuItemFindItem2.setVisible(true);
                                                                                                                                menuItemFindItem3.setVisible(true);
                                                                                                                            }
                                                                                                                            if (du4Var.b()) {
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (du4Var.f != null) {
                                                                                                                                du4Var.d(0, 0, false, false);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 11:
                                                                                                                            int i13 = MainActivity.y1;
                                                                                                                            List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                            if (list != null) {
                                                                                                                                componentActivity.f0(list, true);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 12:
                                                                                                                            int i14 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i15 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                            return;
                                                                                                                        case 14:
                                                                                                                            int i16 = MainActivity.y1;
                                                                                                                            int i17 = t46.dialog_alert_warning;
                                                                                                                            int i18 = y46.jobs_title;
                                                                                                                            ?? r6 = this.Y;
                                                                                                                            be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i19 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                        b6 b6Var17 = this.Q0;
                                                                                                        if (b6Var17 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        MaterialButton materialButton2 = b6Var17.m0;
                                                                                                        if (materialButton2 != null) {
                                                                                                            materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                                public final /* synthetic */ MainActivity Y;

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                {
                                                                                                                    this.Y = this;
                                                                                                                }

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                                /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                                /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    Object value3;
                                                                                                                    xm4 xm4Var3;
                                                                                                                    String strB;
                                                                                                                    int i2;
                                                                                                                    byte b13 = b5;
                                                                                                                    q51 q51Var2 = null;
                                                                                                                    ComponentActivity componentActivity = this.Y;
                                                                                                                    switch (b13) {
                                                                                                                        case 0:
                                                                                                                            b6 b6Var18 = componentActivity.Q0;
                                                                                                                            if (b6Var18 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView = b6Var18.L0;
                                                                                                                            if (appCompatTextView != null) {
                                                                                                                                appCompatTextView.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                            int i3 = MainActivity.y1;
                                                                                                                            if (componentActivity.G().u()) {
                                                                                                                                componentActivity.g0();
                                                                                                                                qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                            int i4 = MainActivity.y1;
                                                                                                                            ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                            oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                            do {
                                                                                                                                value3 = oh7Var3.getValue();
                                                                                                                                xm4Var3 = (xm4) value3;
                                                                                                                                xm4Var3.getClass();
                                                                                                                            } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                            return;
                                                                                                                        case 3:
                                                                                                                            int i5 = MainActivity.y1;
                                                                                                                            componentActivity.N();
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i6 = MainActivity.y1;
                                                                                                                            componentActivity.R();
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i7 = MainActivity.y1;
                                                                                                                            ss8 ss8Var2 = ss8.a;
                                                                                                                            ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i8 = MainActivity.y1;
                                                                                                                            if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                                b6 b6Var19 = componentActivity.Q0;
                                                                                                                                if (b6Var19 == null) {
                                                                                                                                    dh3.T("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                AppCompatTextView appCompatTextView2 = b6Var19.I0;
                                                                                                                                if (appCompatTextView2 != null) {
                                                                                                                                    appCompatTextView2.performClick();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i9 = MainActivity.y1;
                                                                                                                            MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                            tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                            nf1 nf1Var3 = tp1.a;
                                                                                                                            jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i10 = MainActivity.y1;
                                                                                                                            ss8 ss8Var3 = ss8.a;
                                                                                                                            ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                            pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i11 = MainActivity.y1;
                                                                                                                            componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                            int i12 = MainActivity.y1;
                                                                                                                            n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                            b6 b6Var110 = componentActivity.Q0;
                                                                                                                            if (b6Var110 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            f63 f63Var = new f63(n51Var, b6Var110.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                            du4 du4Var = (du4) f63Var.Z;
                                                                                                                            nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                            String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                            if (strI2 != null) {
                                                                                                                                GuId guId = new GuId(strI2);
                                                                                                                                if (fm7.o0(guId.b())) {
                                                                                                                                    guId = null;
                                                                                                                                }
                                                                                                                                if (guId != null) {
                                                                                                                                    strB = guId.b();
                                                                                                                                } else {
                                                                                                                                    strB = null;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                            f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                            du4Var.g = 8388613;
                                                                                                                            if (ue3.y(componentActivity)) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                ss8 ss8Var4 = ss8.a;
                                                                                                                                if (ss8.t()) {
                                                                                                                                    i2 = v46.menu_main_tv;
                                                                                                                                } else {
                                                                                                                                    i2 = v46.menu_main_mobile;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                            MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                            menuItemFindItem.setVisible(false);
                                                                                                                            u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                            nf1 nf1Var4 = tp1.a;
                                                                                                                            jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                            MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                            menuItemFindItem2.setVisible(false);
                                                                                                                            MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                            menuItemFindItem3.setVisible(false);
                                                                                                                            ss8 ss8Var5 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                menuItemFindItem2.setVisible(true);
                                                                                                                                menuItemFindItem3.setVisible(true);
                                                                                                                            }
                                                                                                                            if (du4Var.b()) {
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (du4Var.f != null) {
                                                                                                                                du4Var.d(0, 0, false, false);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 11:
                                                                                                                            int i13 = MainActivity.y1;
                                                                                                                            List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                            if (list != null) {
                                                                                                                                componentActivity.f0(list, true);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 12:
                                                                                                                            int i14 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i15 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                            return;
                                                                                                                        case 14:
                                                                                                                            int i16 = MainActivity.y1;
                                                                                                                            int i17 = t46.dialog_alert_warning;
                                                                                                                            int i18 = y46.jobs_title;
                                                                                                                            ?? r6 = this.Y;
                                                                                                                            be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i19 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                        b6 b6Var18 = this.Q0;
                                                                                                        if (b6Var18 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        final byte b13 = 5;
                                                                                                        b6Var18.Y.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                            public final /* synthetic */ MainActivity Y;

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            {
                                                                                                                this.Y = this;
                                                                                                            }

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                            /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                            /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                Object value3;
                                                                                                                xm4 xm4Var3;
                                                                                                                String strB;
                                                                                                                int i2;
                                                                                                                byte b14 = b13;
                                                                                                                q51 q51Var2 = null;
                                                                                                                ComponentActivity componentActivity = this.Y;
                                                                                                                switch (b14) {
                                                                                                                    case 0:
                                                                                                                        b6 b6Var19 = componentActivity.Q0;
                                                                                                                        if (b6Var19 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        AppCompatTextView appCompatTextView = b6Var19.L0;
                                                                                                                        if (appCompatTextView != null) {
                                                                                                                            appCompatTextView.performClick();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                        int i3 = MainActivity.y1;
                                                                                                                        if (componentActivity.G().u()) {
                                                                                                                            componentActivity.g0();
                                                                                                                            qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                        int i4 = MainActivity.y1;
                                                                                                                        ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                        oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                        do {
                                                                                                                            value3 = oh7Var3.getValue();
                                                                                                                            xm4Var3 = (xm4) value3;
                                                                                                                            xm4Var3.getClass();
                                                                                                                        } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                        return;
                                                                                                                    case 3:
                                                                                                                        int i5 = MainActivity.y1;
                                                                                                                        componentActivity.N();
                                                                                                                        return;
                                                                                                                    case 4:
                                                                                                                        int i6 = MainActivity.y1;
                                                                                                                        componentActivity.R();
                                                                                                                        return;
                                                                                                                    case 5:
                                                                                                                        int i7 = MainActivity.y1;
                                                                                                                        ss8 ss8Var2 = ss8.a;
                                                                                                                        ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                        return;
                                                                                                                    case 6:
                                                                                                                        int i8 = MainActivity.y1;
                                                                                                                        if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                            b6 b6Var110 = componentActivity.Q0;
                                                                                                                            if (b6Var110 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView2 = b6Var110.I0;
                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                appCompatTextView2.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case 7:
                                                                                                                        int i9 = MainActivity.y1;
                                                                                                                        MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                        tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                        nf1 nf1Var3 = tp1.a;
                                                                                                                        jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                        return;
                                                                                                                    case 8:
                                                                                                                        int i10 = MainActivity.y1;
                                                                                                                        ss8 ss8Var3 = ss8.a;
                                                                                                                        ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                        pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                        return;
                                                                                                                    case 9:
                                                                                                                        int i11 = MainActivity.y1;
                                                                                                                        componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                        int i12 = MainActivity.y1;
                                                                                                                        n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                        b6 b6Var111 = componentActivity.Q0;
                                                                                                                        if (b6Var111 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        f63 f63Var = new f63(n51Var, b6Var111.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                        du4 du4Var = (du4) f63Var.Z;
                                                                                                                        nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                        String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                        if (strI2 != null) {
                                                                                                                            GuId guId = new GuId(strI2);
                                                                                                                            if (fm7.o0(guId.b())) {
                                                                                                                                guId = null;
                                                                                                                            }
                                                                                                                            if (guId != null) {
                                                                                                                                strB = guId.b();
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            strB = null;
                                                                                                                        }
                                                                                                                        f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                        du4Var.g = 8388613;
                                                                                                                        if (ue3.y(componentActivity)) {
                                                                                                                            i2 = v46.menu_main_tv;
                                                                                                                        } else {
                                                                                                                            ss8 ss8Var4 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                i2 = v46.menu_main_mobile;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                        MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                        menuItemFindItem.setVisible(false);
                                                                                                                        u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                        nf1 nf1Var4 = tp1.a;
                                                                                                                        jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                        MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                        menuItemFindItem2.setVisible(false);
                                                                                                                        MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                        menuItemFindItem3.setVisible(false);
                                                                                                                        ss8 ss8Var5 = ss8.a;
                                                                                                                        if (ss8.t()) {
                                                                                                                            menuItemFindItem2.setVisible(true);
                                                                                                                            menuItemFindItem3.setVisible(true);
                                                                                                                        }
                                                                                                                        if (du4Var.b()) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (du4Var.f != null) {
                                                                                                                            du4Var.d(0, 0, false, false);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 11:
                                                                                                                        int i13 = MainActivity.y1;
                                                                                                                        List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                        if (list != null) {
                                                                                                                            componentActivity.f0(list, true);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 12:
                                                                                                                        int i14 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                        return;
                                                                                                                    case 13:
                                                                                                                        int i15 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                        return;
                                                                                                                    case 14:
                                                                                                                        int i16 = MainActivity.y1;
                                                                                                                        int i17 = t46.dialog_alert_warning;
                                                                                                                        int i18 = y46.jobs_title;
                                                                                                                        ?? r6 = this.Y;
                                                                                                                        be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        int i19 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                        return;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        b6 b6Var19 = this.Q0;
                                                                                                        if (b6Var19 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        RelativeLayout relativeLayout4 = b6Var19.t0;
                                                                                                        final byte b14 = 6;
                                                                                                        if (relativeLayout4 != null) {
                                                                                                            relativeLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                                public final /* synthetic */ MainActivity Y;

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                {
                                                                                                                    this.Y = this;
                                                                                                                }

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                                /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                                /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    Object value3;
                                                                                                                    xm4 xm4Var3;
                                                                                                                    String strB;
                                                                                                                    int i2;
                                                                                                                    byte b15 = b14;
                                                                                                                    q51 q51Var2 = null;
                                                                                                                    ComponentActivity componentActivity = this.Y;
                                                                                                                    switch (b15) {
                                                                                                                        case 0:
                                                                                                                            b6 b6Var110 = componentActivity.Q0;
                                                                                                                            if (b6Var110 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView = b6Var110.L0;
                                                                                                                            if (appCompatTextView != null) {
                                                                                                                                appCompatTextView.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                            int i3 = MainActivity.y1;
                                                                                                                            if (componentActivity.G().u()) {
                                                                                                                                componentActivity.g0();
                                                                                                                                qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                            int i4 = MainActivity.y1;
                                                                                                                            ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                            oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                            do {
                                                                                                                                value3 = oh7Var3.getValue();
                                                                                                                                xm4Var3 = (xm4) value3;
                                                                                                                                xm4Var3.getClass();
                                                                                                                            } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                            return;
                                                                                                                        case 3:
                                                                                                                            int i5 = MainActivity.y1;
                                                                                                                            componentActivity.N();
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i6 = MainActivity.y1;
                                                                                                                            componentActivity.R();
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i7 = MainActivity.y1;
                                                                                                                            ss8 ss8Var2 = ss8.a;
                                                                                                                            ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i8 = MainActivity.y1;
                                                                                                                            if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                                b6 b6Var111 = componentActivity.Q0;
                                                                                                                                if (b6Var111 == null) {
                                                                                                                                    dh3.T("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                AppCompatTextView appCompatTextView2 = b6Var111.I0;
                                                                                                                                if (appCompatTextView2 != null) {
                                                                                                                                    appCompatTextView2.performClick();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i9 = MainActivity.y1;
                                                                                                                            MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                            tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                            nf1 nf1Var3 = tp1.a;
                                                                                                                            jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i10 = MainActivity.y1;
                                                                                                                            ss8 ss8Var3 = ss8.a;
                                                                                                                            ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                            pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i11 = MainActivity.y1;
                                                                                                                            componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                            int i12 = MainActivity.y1;
                                                                                                                            n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                            b6 b6Var112 = componentActivity.Q0;
                                                                                                                            if (b6Var112 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            f63 f63Var = new f63(n51Var, b6Var112.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                            du4 du4Var = (du4) f63Var.Z;
                                                                                                                            nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                            String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                            if (strI2 != null) {
                                                                                                                                GuId guId = new GuId(strI2);
                                                                                                                                if (fm7.o0(guId.b())) {
                                                                                                                                    guId = null;
                                                                                                                                }
                                                                                                                                if (guId != null) {
                                                                                                                                    strB = guId.b();
                                                                                                                                } else {
                                                                                                                                    strB = null;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                            f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                            du4Var.g = 8388613;
                                                                                                                            if (ue3.y(componentActivity)) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                ss8 ss8Var4 = ss8.a;
                                                                                                                                if (ss8.t()) {
                                                                                                                                    i2 = v46.menu_main_tv;
                                                                                                                                } else {
                                                                                                                                    i2 = v46.menu_main_mobile;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                            MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                            menuItemFindItem.setVisible(false);
                                                                                                                            u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                            nf1 nf1Var4 = tp1.a;
                                                                                                                            jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                            MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                            menuItemFindItem2.setVisible(false);
                                                                                                                            MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                            menuItemFindItem3.setVisible(false);
                                                                                                                            ss8 ss8Var5 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                menuItemFindItem2.setVisible(true);
                                                                                                                                menuItemFindItem3.setVisible(true);
                                                                                                                            }
                                                                                                                            if (du4Var.b()) {
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (du4Var.f != null) {
                                                                                                                                du4Var.d(0, 0, false, false);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 11:
                                                                                                                            int i13 = MainActivity.y1;
                                                                                                                            List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                            if (list != null) {
                                                                                                                                componentActivity.f0(list, true);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 12:
                                                                                                                            int i14 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i15 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                            return;
                                                                                                                        case 14:
                                                                                                                            int i16 = MainActivity.y1;
                                                                                                                            int i17 = t46.dialog_alert_warning;
                                                                                                                            int i18 = y46.jobs_title;
                                                                                                                            ?? r6 = this.Y;
                                                                                                                            be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i19 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                        b6 b6Var20 = this.Q0;
                                                                                                        if (b6Var20 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        AppCompatTextView appCompatTextView = b6Var20.I0;
                                                                                                        final byte b15 = 7;
                                                                                                        if (appCompatTextView != null) {
                                                                                                            appCompatTextView.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                                public final /* synthetic */ MainActivity Y;

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                {
                                                                                                                    this.Y = this;
                                                                                                                }

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                                /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                                /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    Object value3;
                                                                                                                    xm4 xm4Var3;
                                                                                                                    String strB;
                                                                                                                    int i2;
                                                                                                                    byte b16 = b15;
                                                                                                                    q51 q51Var2 = null;
                                                                                                                    ComponentActivity componentActivity = this.Y;
                                                                                                                    switch (b16) {
                                                                                                                        case 0:
                                                                                                                            b6 b6Var110 = componentActivity.Q0;
                                                                                                                            if (b6Var110 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView2 = b6Var110.L0;
                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                appCompatTextView2.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                            int i3 = MainActivity.y1;
                                                                                                                            if (componentActivity.G().u()) {
                                                                                                                                componentActivity.g0();
                                                                                                                                qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                            int i4 = MainActivity.y1;
                                                                                                                            ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                            oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                            do {
                                                                                                                                value3 = oh7Var3.getValue();
                                                                                                                                xm4Var3 = (xm4) value3;
                                                                                                                                xm4Var3.getClass();
                                                                                                                            } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                            return;
                                                                                                                        case 3:
                                                                                                                            int i5 = MainActivity.y1;
                                                                                                                            componentActivity.N();
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i6 = MainActivity.y1;
                                                                                                                            componentActivity.R();
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i7 = MainActivity.y1;
                                                                                                                            ss8 ss8Var2 = ss8.a;
                                                                                                                            ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i8 = MainActivity.y1;
                                                                                                                            if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                                b6 b6Var111 = componentActivity.Q0;
                                                                                                                                if (b6Var111 == null) {
                                                                                                                                    dh3.T("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                AppCompatTextView appCompatTextView3 = b6Var111.I0;
                                                                                                                                if (appCompatTextView3 != null) {
                                                                                                                                    appCompatTextView3.performClick();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i9 = MainActivity.y1;
                                                                                                                            MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                            tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                            nf1 nf1Var3 = tp1.a;
                                                                                                                            jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i10 = MainActivity.y1;
                                                                                                                            ss8 ss8Var3 = ss8.a;
                                                                                                                            ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                            pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i11 = MainActivity.y1;
                                                                                                                            componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                            return;
                                                                                                                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                            int i12 = MainActivity.y1;
                                                                                                                            n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                            b6 b6Var112 = componentActivity.Q0;
                                                                                                                            if (b6Var112 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            f63 f63Var = new f63(n51Var, b6Var112.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                            du4 du4Var = (du4) f63Var.Z;
                                                                                                                            nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                            String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                            if (strI2 != null) {
                                                                                                                                GuId guId = new GuId(strI2);
                                                                                                                                if (fm7.o0(guId.b())) {
                                                                                                                                    guId = null;
                                                                                                                                }
                                                                                                                                if (guId != null) {
                                                                                                                                    strB = guId.b();
                                                                                                                                } else {
                                                                                                                                    strB = null;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                            f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                            du4Var.g = 8388613;
                                                                                                                            if (ue3.y(componentActivity)) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                ss8 ss8Var4 = ss8.a;
                                                                                                                                if (ss8.t()) {
                                                                                                                                    i2 = v46.menu_main_tv;
                                                                                                                                } else {
                                                                                                                                    i2 = v46.menu_main_mobile;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                            MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                            menuItemFindItem.setVisible(false);
                                                                                                                            u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                            nf1 nf1Var4 = tp1.a;
                                                                                                                            jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                            MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                            menuItemFindItem2.setVisible(false);
                                                                                                                            MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                            menuItemFindItem3.setVisible(false);
                                                                                                                            ss8 ss8Var5 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                menuItemFindItem2.setVisible(true);
                                                                                                                                menuItemFindItem3.setVisible(true);
                                                                                                                            }
                                                                                                                            if (du4Var.b()) {
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (du4Var.f != null) {
                                                                                                                                du4Var.d(0, 0, false, false);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 11:
                                                                                                                            int i13 = MainActivity.y1;
                                                                                                                            List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                            if (list != null) {
                                                                                                                                componentActivity.f0(list, true);
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        case 12:
                                                                                                                            int i14 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i15 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                            return;
                                                                                                                        case 14:
                                                                                                                            int i16 = MainActivity.y1;
                                                                                                                            int i17 = t46.dialog_alert_warning;
                                                                                                                            int i18 = y46.jobs_title;
                                                                                                                            ?? r6 = this.Y;
                                                                                                                            be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i19 = MainActivity.y1;
                                                                                                                            jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                        if (ss8.t()) {
                                                                                                            b6 b6Var21 = this.Q0;
                                                                                                            if (b6Var21 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            b6Var21.D0.setVisibility(0);
                                                                                                        }
                                                                                                        b6 b6Var22 = this.Q0;
                                                                                                        if (b6Var22 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        new y42(b6Var22.A0, F());
                                                                                                        Intent intent = getIntent();
                                                                                                        intent.getClass();
                                                                                                        I(intent);
                                                                                                        b6 b6Var23 = this.Q0;
                                                                                                        if (b6Var23 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        b6Var23.K0.setText(getString(y46.your_hwid, new HWID(ss8.j(this))));
                                                                                                        b6 b6Var24 = this.Q0;
                                                                                                        if (b6Var24 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        final byte b16 = 8;
                                                                                                        b6Var24.y0.setOnClickListener(new View.OnClickListener(this) { // from class: pj4
                                                                                                            public final /* synthetic */ MainActivity Y;

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            {
                                                                                                                this.Y = this;
                                                                                                            }

                                                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                            /* JADX WARN: Code duplicated, block: B:27:0x00f4  */
                                                                                                            /* JADX WARN: Code duplicated, block: B:34:0x0114  */
                                                                                                            /* JADX WARN: Type inference failed for: r6v16, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                Object value3;
                                                                                                                xm4 xm4Var3;
                                                                                                                String strB;
                                                                                                                int i2;
                                                                                                                byte b17 = b16;
                                                                                                                q51 q51Var2 = null;
                                                                                                                ComponentActivity componentActivity = this.Y;
                                                                                                                switch (b17) {
                                                                                                                    case 0:
                                                                                                                        b6 b6Var110 = componentActivity.Q0;
                                                                                                                        if (b6Var110 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        AppCompatTextView appCompatTextView2 = b6Var110.L0;
                                                                                                                        if (appCompatTextView2 != null) {
                                                                                                                            appCompatTextView2.performClick();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                                                        int i3 = MainActivity.y1;
                                                                                                                        if (componentActivity.G().u()) {
                                                                                                                            componentActivity.g0();
                                                                                                                            qe4.L0(componentActivity.G().b, "su.happ.proxyutility.action.service", 6, "");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                                                                        int i4 = MainActivity.y1;
                                                                                                                        ((dr2) componentActivity.h1.getValue()).e(vq2.a);
                                                                                                                        oh7 oh7Var3 = componentActivity.G().w;
                                                                                                                        do {
                                                                                                                            value3 = oh7Var3.getValue();
                                                                                                                            xm4Var3 = (xm4) value3;
                                                                                                                            xm4Var3.getClass();
                                                                                                                        } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, true, false, null, 57343)));
                                                                                                                        return;
                                                                                                                    case 3:
                                                                                                                        int i5 = MainActivity.y1;
                                                                                                                        componentActivity.N();
                                                                                                                        return;
                                                                                                                    case 4:
                                                                                                                        int i6 = MainActivity.y1;
                                                                                                                        componentActivity.R();
                                                                                                                        return;
                                                                                                                    case 5:
                                                                                                                        int i7 = MainActivity.y1;
                                                                                                                        ss8 ss8Var2 = ss8.a;
                                                                                                                        ss8.B(componentActivity, "https://ai-4docs.com/happ");
                                                                                                                        return;
                                                                                                                    case 6:
                                                                                                                        int i8 = MainActivity.y1;
                                                                                                                        if (((xm4) componentActivity.G().x.X.getValue()).e) {
                                                                                                                            b6 b6Var111 = componentActivity.Q0;
                                                                                                                            if (b6Var111 == null) {
                                                                                                                                dh3.T("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppCompatTextView appCompatTextView3 = b6Var111.I0;
                                                                                                                            if (appCompatTextView3 != null) {
                                                                                                                                appCompatTextView3.performClick();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    case 7:
                                                                                                                        int i9 = MainActivity.y1;
                                                                                                                        MainViewModel mainViewModelG5 = componentActivity.G();
                                                                                                                        tu0 tu0VarA = zw8.a(mainViewModelG5);
                                                                                                                        nf1 nf1Var3 = tp1.a;
                                                                                                                        jm4.Q(tu0VarA, ye1.Z, new l40(mainViewModelG5, (q51) null, (byte) 7), 2);
                                                                                                                        return;
                                                                                                                    case 8:
                                                                                                                        int i10 = MainActivity.y1;
                                                                                                                        ss8 ss8Var3 = ss8.a;
                                                                                                                        ss8.E(componentActivity, ss8.j(componentActivity));
                                                                                                                        pu.Q(componentActivity, y46.toast_copied_to_clipboard);
                                                                                                                        return;
                                                                                                                    case 9:
                                                                                                                        int i11 = MainActivity.y1;
                                                                                                                        componentActivity.startActivity(new Intent((Context) componentActivity, (Class<?>) SettingsActivity.class).putExtra("isRunning", componentActivity.G().u()));
                                                                                                                        return;
                                                                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                                                                                                        int i12 = MainActivity.y1;
                                                                                                                        n51 n51Var = new n51(componentActivity, p56.CustomPopupMenuTheme);
                                                                                                                        b6 b6Var112 = componentActivity.Q0;
                                                                                                                        if (b6Var112 == null) {
                                                                                                                            dh3.T("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        f63 f63Var = new f63(n51Var, b6Var112.C0, 0, w26.popupMenuStyle, 0);
                                                                                                                        du4 du4Var = (du4) f63Var.Z;
                                                                                                                        nt4 nt4Var = (nt4) f63Var.Y;
                                                                                                                        String strI2 = ((MMKV) componentActivity.U0.getValue()).i("SELECTED_SERVER");
                                                                                                                        if (strI2 != null) {
                                                                                                                            GuId guId = new GuId(strI2);
                                                                                                                            if (fm7.o0(guId.b())) {
                                                                                                                                guId = null;
                                                                                                                            }
                                                                                                                            if (guId != null) {
                                                                                                                                strB = guId.b();
                                                                                                                            } else {
                                                                                                                                strB = null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            strB = null;
                                                                                                                        }
                                                                                                                        f63Var.f0 = new jn0(componentActivity, strB, (byte) 5);
                                                                                                                        du4Var.g = 8388613;
                                                                                                                        if (ue3.y(componentActivity)) {
                                                                                                                            i2 = v46.menu_main_tv;
                                                                                                                        } else {
                                                                                                                            ss8 ss8Var4 = ss8.a;
                                                                                                                            if (ss8.t()) {
                                                                                                                                i2 = v46.menu_main_tv;
                                                                                                                            } else {
                                                                                                                                i2 = v46.menu_main_mobile;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        new uw7(n51Var).inflate(i2, nt4Var);
                                                                                                                        MenuItem menuItemFindItem = nt4Var.findItem(e46.export_json_clipboard);
                                                                                                                        menuItemFindItem.setVisible(false);
                                                                                                                        u84 u84VarZ3 = ys0.z(componentActivity.X);
                                                                                                                        nf1 nf1Var4 = tp1.a;
                                                                                                                        jm4.Q(u84VarZ3, dm4.a, new co(strB, menuItemFindItem, null), 2);
                                                                                                                        MenuItem menuItemFindItem2 = nt4Var.findItem(e46.config_group);
                                                                                                                        menuItemFindItem2.setVisible(false);
                                                                                                                        MenuItem menuItemFindItem3 = nt4Var.findItem(e46.dialog_test);
                                                                                                                        menuItemFindItem3.setVisible(false);
                                                                                                                        ss8 ss8Var5 = ss8.a;
                                                                                                                        if (ss8.t()) {
                                                                                                                            menuItemFindItem2.setVisible(true);
                                                                                                                            menuItemFindItem3.setVisible(true);
                                                                                                                        }
                                                                                                                        if (du4Var.b()) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (du4Var.f != null) {
                                                                                                                            du4Var.d(0, 0, false, false);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            bt.i("MenuPopupHelper cannot be used without an anchor");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 11:
                                                                                                                        int i13 = MainActivity.y1;
                                                                                                                        List list = (List) ((qc2) componentActivity.G().g.getValue()).h.X.getValue();
                                                                                                                        if (list != null) {
                                                                                                                            componentActivity.f0(list, true);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            componentActivity.f0(((xm4) componentActivity.G().x.X.getValue()).d, false);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    case 12:
                                                                                                                        int i14 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 11), 3);
                                                                                                                        return;
                                                                                                                    case 13:
                                                                                                                        int i15 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 12), 3);
                                                                                                                        return;
                                                                                                                    case 14:
                                                                                                                        int i16 = MainActivity.y1;
                                                                                                                        int i17 = t46.dialog_alert_warning;
                                                                                                                        int i18 = y46.jobs_title;
                                                                                                                        ?? r6 = this.Y;
                                                                                                                        be.m((BaseActivity) r6, r6.getString(i18), r6.getString(y46.jobs_description), (String) null, r6.getString(y46.jobs_btn), (String) null, Integer.valueOf(i17), new mj4(r6, (byte) 7), (dn2) null, 1362);
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        int i19 = MainActivity.y1;
                                                                                                                        jm4.Q(ys0.z(componentActivity.h()), (u61) null, new wj4(componentActivity, q51Var2, (byte) 13), 3);
                                                                                                                        return;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        b6 b6Var25 = this.Q0;
                                                                                                        if (b6Var25 == null) {
                                                                                                            dh3.T("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        b6Var25.A0.setEdgeEffectFactory(new wk4(this));
                                                                                                        jm4.Q(ys0.z(g94Var), (u61) null, new wj4(this, q51Var, b13), 3);
                                                                                                        try {
                                                                                                            jm4.Q(ys0.z(g94Var), (u61) null, new wj4(this, q51Var, b14), 3);
                                                                                                        } catch (Throwable th2) {
                                                                                                            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                                                                                                                throw th2;
                                                                                                            }
                                                                                                        }
                                                                                                        jm4.Q(ys0.z(g94Var), (u61) null, new wj4(this, q51Var, b15), 3);
                                                                                                        jm4.Q(ys0.z(g94Var), (u61) null, new wj4(this, q51Var, b8), 3);
                                                                                                        jm4.Q(ys0.z(g94Var), ye1.Z, new wj4(this, q51Var, (byte) 10), 2);
                                                                                                        HappApplication happApplication = HappApplication.M0;
                                                                                                        ((vr1) k32.i().x0.getValue()).f.i();
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
        b61.i("Missing required view with ID: ".concat(drawerLayoutInflate.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onDestroy() {
        super/*androidx.appcompat.app.AppCompatActivity*/.onDestroy();
        try {
            ((ConnectivityManager) this.r1.getValue()).unregisterNetworkCallback((yj4) this.t1.getValue());
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        a aVar = wu7.y1;
        jm4.Q(wu7.z1, (u61) null, new l40(n(), (q51) null, (byte) 15), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        I(intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        Object value;
        xm4 xm4Var;
        super/*su.happ.proxyutility.ui.BaseActivity*/.onResume();
        MainViewModel mainViewModelG = G();
        mainViewModelG.A();
        byte b = 0;
        MainViewModel.C(mainViewModelG, false, 3);
        boolean zAreNotificationsEnabled = new y65(this).b.areNotificationsEnabled();
        oh7 oh7Var = mainViewModelG.w;
        do {
            value = oh7Var.getValue();
            xm4Var = (xm4) value;
            xm4Var.getClass();
        } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, 0, 0, null, null, zAreNotificationsEnabled, null, false, null, false, false, null, 65023)));
        qe4.L0(this, "su.happ.proxyutility.action.service", 9, "");
        MainViewModel mainViewModelG2 = G();
        jm4.Q(zw8.a(mainViewModelG2), (u61) null, new xn4(mainViewModelG2, null, b), 3);
        if (this.k1.get()) {
            MainViewModel.C(G(), false, 3);
        }
        u84 u84VarZ = ys0.z(((ComponentActivity) this).X);
        nf1 nf1Var = tp1.a;
        jm4.Q(u84VarZ, ye1.Z, new ak4(this, null), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onStart() {
        super/*androidx.appcompat.app.AppCompatActivity*/.onStart();
        MainViewModel mainViewModelG = G();
        jm4.Q(zw8.a(mainViewModelG), (u61) null, new ho4(mainViewModelG, null, (byte) 1), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: su.happ.proxyutility.feature.main.MainActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final Set z() {
        Bundle extras = getIntent().getExtras();
        Set<String> setKeySet = extras != null ? extras.keySet() : null;
        return setKeySet == null ? m02.X : setKeySet;
    }
}
