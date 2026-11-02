package su.happ.proxyutility;

import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.tencent.mmkv.MMKV;
import defpackage.aj2;
import defpackage.an7;
import defpackage.b2;
import defpackage.b83;
import defpackage.bw0;
import defpackage.c12;
import defpackage.c16;
import defpackage.cm5;
import defpackage.d02;
import defpackage.da2;
import defpackage.dh3;
import defpackage.dm4;
import defpackage.dn2;
import defpackage.dn8;
import defpackage.dt7;
import defpackage.eb5;
import defpackage.en;
import defpackage.ev7;
import defpackage.fl5;
import defpackage.fm7;
import defpackage.g33;
import defpackage.gk7;
import defpackage.gv3;
import defpackage.ig8;
import defpackage.j72;
import defpackage.jm4;
import defpackage.k32;
import defpackage.k61;
import defpackage.kf4;
import defpackage.kp5;
import defpackage.kw4;
import defpackage.m51;
import defpackage.mj0;
import defpackage.mn6;
import defpackage.nf1;
import defpackage.o84;
import defpackage.ow7;
import defpackage.pc6;
import defpackage.pd6;
import defpackage.pw7;
import defpackage.q15;
import defpackage.q36;
import defpackage.q51;
import defpackage.qc2;
import defpackage.qo;
import defpackage.r5;
import defpackage.rj6;
import defpackage.ss8;
import defpackage.tp1;
import defpackage.tv2;
import defpackage.u5;
import defpackage.ue3;
import defpackage.uv2;
import defpackage.vp8;
import defpackage.vz7;
import defpackage.we3;
import defpackage.wv0;
import defpackage.x39;
import defpackage.xa2;
import defpackage.xv0;
import defpackage.xy0;
import defpackage.ye1;
import defpackage.zt7;
import io.sentry.android.core.s1;
import io.sentry.android.core.v;
import java.io.File;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.Conscrypt;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.receiver.WidgetProvider;
import su.happ.proxyutility.service.SubscriptionUpdater$ExpireReminderTask;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/HappApplication;", "Landroid/app/Application;", "<init>", "()V", "k32", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HappApplication extends Application {
    public static HappApplication M0;
    public static final m51 N0;
    public static String O0;
    public static boolean P0;
    public static boolean Q0;
    public static boolean R0;
    public final vz7 A0;
    public final vz7 B0;
    public final vz7 D0;
    public final vz7 E0;
    public final vz7 F0;
    public final vz7 G0;
    public final vz7 X;
    public final vz7 h0;
    public final vz7 m0;
    public final vz7 n0;
    public final vz7 p0;
    public final vz7 u0;
    public final vz7 x0;
    public final vz7 z0;
    public final vz7 Y = new vz7(new j72(this));
    public final vz7 Z = new vz7(new j72((byte) 22));
    public final vz7 f0 = new vz7(new j72((byte) 27));
    public final vz7 g0 = new vz7(new j72((byte) 28));
    public final vz7 i0 = new vz7(new j72((byte) 29));
    public final vz7 j0 = new vz7(new tv2(0));
    public final vz7 k0 = new vz7(new tv2(1));
    public final vz7 l0 = new vz7(new tv2(2));
    public final vz7 o0 = new vz7(new tv2(3));
    public final vz7 q0 = new vz7(new tv2(4));
    public final vz7 r0 = new vz7(new tv2(5));
    public final vz7 s0 = new vz7(new tv2(6));
    public final vz7 t0 = new vz7(new tv2(7));
    public final vz7 v0 = new vz7(new j72((byte) 17));
    public final vz7 w0 = new vz7(new j72((byte) 19));
    public final vz7 y0 = new vz7(new j72((byte) 20));
    public final vz7 C0 = new vz7(new j72((byte) 21));
    public final vz7 H0 = new vz7(new j72((byte) 23));
    public final vz7 I0 = new vz7(new j72((byte) 24));
    public final vz7 J0 = new vz7(new j72((byte) 25));
    public final vz7 K0 = new vz7(new j72((byte) 26));
    public final u5 L0 = new u5((byte) 0);

    static {
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        N0 = gv3.c(g33.K(ow7VarB, dm4.a));
        O0 = "pref_mode";
        P0 = true;
        Q0 = true;
        R0 = true;
    }

    public HappApplication() {
        final byte b = 0;
        this.X = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                HappApplication happApplication = this.Y;
                switch (b2) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b2 = 11;
        this.h0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                HappApplication happApplication = this.Y;
                switch (b3) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b3 = 6;
        this.m0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b4 = b3;
                HappApplication happApplication = this.Y;
                switch (b4) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b4 = 10;
        this.n0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b5 = b4;
                HappApplication happApplication = this.Y;
                switch (b5) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b5 = 12;
        this.p0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b6 = b5;
                HappApplication happApplication = this.Y;
                switch (b6) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b6 = 13;
        this.u0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b7 = b6;
                HappApplication happApplication = this.Y;
                switch (b7) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b7 = 1;
        this.x0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b8 = b7;
                HappApplication happApplication = this.Y;
                switch (b8) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b8 = 2;
        this.z0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b9 = b8;
                HappApplication happApplication = this.Y;
                switch (b9) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b9 = 3;
        this.A0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b10 = b9;
                HappApplication happApplication = this.Y;
                switch (b10) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b10 = 4;
        this.B0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b11 = b10;
                HappApplication happApplication = this.Y;
                switch (b11) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b11 = 5;
        this.D0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b12 = b11;
                HappApplication happApplication = this.Y;
                switch (b12) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b12 = 7;
        this.E0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b13 = b12;
                HappApplication happApplication = this.Y;
                switch (b13) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b13 = 8;
        this.F0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b14 = b13;
                HappApplication happApplication = this.Y;
                switch (b14) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
        final byte b14 = 9;
        this.G0 = new vz7(new dn2(this) { // from class: sv2
            public final /* synthetic */ HappApplication Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b15 = b14;
                HappApplication happApplication = this.Y;
                switch (b15) {
                    case 0:
                        HappApplication happApplication2 = HappApplication.M0;
                        return new an7(happApplication);
                    case 1:
                        HappApplication happApplication3 = HappApplication.M0;
                        return new vr1(happApplication);
                    case 2:
                        HappApplication happApplication4 = HappApplication.M0;
                        return new e72(happApplication);
                    case 3:
                        HappApplication happApplication5 = HappApplication.M0;
                        return new oq7(happApplication);
                    case 4:
                        HappApplication happApplication6 = HappApplication.M0;
                        return new f84(happApplication);
                    case 5:
                        HappApplication happApplication7 = HappApplication.M0;
                        return new un5(happApplication);
                    case 6:
                        HappApplication happApplication8 = HappApplication.M0;
                        Context applicationContext = happApplication.getApplicationContext();
                        applicationContext.getClass();
                        return new us(applicationContext);
                    case 7:
                        HappApplication happApplication9 = HappApplication.M0;
                        return new pi7((un5) happApplication.D0.getValue());
                    case 8:
                        HappApplication happApplication10 = HappApplication.M0;
                        return new q72(happApplication);
                    case 9:
                        return new pr7((xr7) happApplication.q0.getValue());
                    case 10:
                        HappApplication happApplication11 = HappApplication.M0;
                        return new kf4(happApplication);
                    case 11:
                        HappApplication happApplication12 = HappApplication.M0;
                        return new qo(happApplication);
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        HappApplication happApplication13 = HappApplication.M0;
                        return new qc2(happApplication);
                    default:
                        HappApplication happApplication14 = HappApplication.M0;
                        return new c16(happApplication);
                }
            }
        });
    }

    public final qo a() {
        return (qo) this.h0.getValue();
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        M0 = this;
    }

    public final k61 b() {
        return (k61) this.g0.getValue();
    }

    public final qc2 c() {
        return (qc2) this.p0.getValue();
    }

    public final kf4 d() {
        return (kf4) this.n0.getValue();
    }

    public final c16 e() {
        return (c16) this.u0.getValue();
    }

    public final mn6 f() {
        return (mn6) this.Z.getValue();
    }

    public final gk7 g() {
        return (gk7) this.i0.getValue();
    }

    public final zt7 h() {
        return (zt7) this.J0.getValue();
    }

    public final ig8 i() {
        return (ig8) this.t0.getValue();
    }

    public final xy0 j() {
        mj0 mj0Var = new mj0((byte) 7, false);
        mj0Var.Z = pc6.o(getPackageName(), ":bg_process");
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
        executorServiceNewFixedThreadPool.getClass();
        mj0Var.Y = executorServiceNewFixedThreadPool;
        return new xy0(mj0Var);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x03d4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [d02] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v9, types: [q51] */
    @Override // android.app.Application
    public final void onCreate() {
        String str;
        Object rj6Var;
        ?? arrayList;
        Object rj6Var2;
        Object next;
        Object next2;
        super.onCreate();
        MMKV.r(this);
        byte b = 1;
        if (Build.VERSION.SDK_INT <= 29) {
            Security.insertProviderAt(Conscrypt.newProvider(), 1);
        }
        ss8 ss8Var = ss8.a;
        List listF0 = fm7.F0("uWM0lcVs0849kTwk?AqHnQy35aOM/ZtgUip+BrTHHLnSYBNwQAX0y2g==?os8iL1DE8Dee/5roJ+ZzsQ==", new String[]{"?"}, 6);
        ArrayList arrayList2 = c12.a;
        ?? r5 = 0;
        r5 = 0;
        if (!fm7.y0((String) en.k(k32.i()).get(0), "\n").equals(c12.b((String) listF0.get(1), (String) listF0.get(0), (String) listF0.get(2)))) {
            c12.e();
            O0 = null;
        }
        byte b2 = 3;
        c12.a(3, q36.ic_unfold_24dp);
        c12.a(8, q36.ic_tab_24dp);
        c12.a(4, q36.ic_minimize_24dp);
        c12.a(5, q36.ic_forward_24dp);
        c12.a(2, q36.ic_swap_24dp);
        c12.a(6, q36.ic_swipe_24dp);
        c12.a(7, q36.ic_enable_24dp);
        c12.a(1, q36.ic_bolt_24dp);
        c12.a(0, q36.ic_favourite_24dp);
        c12.a(9, q36.ic_width_24dp);
        c12.a(64, q36.ic_slow_24dp);
        c12.a(15, q36.ic_strict_24dp);
        c12.a(73, q36.ic_launch_24dp);
        c12.a(50, q36.ic_like_24dp);
        c12.a(37, q36.ic_release_24dp);
        c12.a(12, q36.ic_open_24dp);
        c12.a(85, q36.ic_protected_24dp);
        c12.a(13, q36.ic_warning_24dp);
        c12.a(31, q36.ic_rel_24dp);
        c12.a(80, q36.ic_space_24dp);
        c12.a(51, q36.ic_nice_24dp);
        c12.a(61, q36.ic_usage_24dp);
        c12.a(84, q36.ic_move_24dp);
        c12.a(28, q36.ic_true_24dp);
        c12.a(34, q36.ic_social_24dp);
        c12.a(81, q36.ic_sheet_24dp);
        c12.a(39, q36.ic_wall_24dp);
        c12.a(55, q36.ic_gesture_24dp);
        c12.a(56, q36.ic_side_24dp);
        c12.a(30, q36.ic_item_24dp);
        c12.a(20, q36.ic_globe_24dp);
        c12.a(74, q36.ic_unit_24dp);
        c12.a(21, q36.ic_property_24dp);
        c12.a(65, q36.ic_normal_24dp);
        c12.a(86, q36.ic_storage_24dp);
        c12.a(58, q36.ic_sync_24dp);
        c12.a(18, q36.ic_splash_24dp);
        c12.a(22, q36.ic_recent_24dp);
        c12.a(49, q36.ic_topic_24dp);
        c12.a(76, q36.ic_free_24dp);
        c12.a(77, q36.ic_tag_24dp);
        c12.a(42, q36.ic_solid_24dp);
        c12.a(66, q36.ic_redo_24dp);
        c12.a(43, q36.ic_music_24dp);
        c12.a(17, q36.ic_key_24dp);
        c12.a(44, q36.ic_user_24dp);
        c12.a(87, q36.ic_wrong_24dp);
        c12.a(69, q36.ic_server_24dp);
        c12.a(70, q36.ic_recycle_24dp);
        c12.a(40, q36.ic_go_24dp);
        c12.a(19, q36.ic_get_24dp);
        c12.a(32, q36.ic_require_24dp);
        c12.a(36, q36.ic_raw_24dp);
        c12.a(78, q36.ic_arrow_24dp);
        byte b3 = 26;
        c12.a(26, q36.ic_player_24dp);
        byte b4 = 14;
        c12.a(14, q36.ic_cancel_24dp);
        c12.a(52, q36.ic_visible_24dp);
        c12.a(23, q36.ic_map_24dp);
        c12.a(53, q36.ic_throw_24dp);
        c12.a(71, q36.ic_search_24dp);
        c12.a(41, q36.ic_home_24dp);
        c12.a(62, q36.ic_until_24dp);
        c12.a(47, q36.ic_travel_24dp);
        c12.a(25, q36.ic_mix_24dp);
        c12.a(60, q36.ic_identify_24dp);
        c12.a(10, q36.ic_game_24dp);
        c12.a(82, q36.ic_send_24dp);
        c12.a(88, q36.ic_paste_24dp);
        c12.a(72, q36.ic_pending_24dp);
        c12.a(54, q36.ic_battery_24dp);
        c12.a(45, q36.ic_scope_24dp);
        c12.a(68, q36.ic_lock_24dp);
        c12.a(59, q36.ic_sleep_24dp);
        c12.a(89, q36.ic_trail_24dp);
        c12.a(46, q36.ic_overline_24dp);
        c12.a(24, q36.ic_thumb_24dp);
        c12.a(79, q36.ic_queue_24dp);
        c12.a(83, q36.ic_task_24dp);
        c12.a(35, q36.ic_stand_24dp);
        c12.a(57, q36.ic_input_24dp);
        c12.a(16, q36.ic_indent_24dp);
        c12.a(11, q36.ic_native_24dp);
        c12.a(38, q36.ic_cast_24dp);
        c12.a(75, q36.ic_worker_24dp);
        c12.a(67, q36.ic_success_24dp);
        c12.a(33, q36.ic_pause_24dp);
        c12.a(63, q36.ic_origin_24dp);
        c12.a(29, q36.ic_placeholder_24dp);
        c12.a(27, q36.ic_migration_24dp);
        c12.a(48, q36.ic_font_24dp);
        ss8.F();
        int iE = ((MMKV) HappTextView.o0.getValue()).e(-1, "pref_font_size");
        aj2.X.getClass();
        HappTextView.p0 = k32.g(iE);
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        ue3.I(applicationContext, new BroadcastReceiver() { // from class: su.happ.proxyutility.HappApplication$registerUiAliveReceiver$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Object next3;
                context.getClass();
                intent.getClass();
                HappApplication happApplication = this.a;
                String packageName = happApplication.getPackageName();
                int iMyPid = Process.myPid();
                Object systemService = happApplication.getSystemService("activity");
                systemService.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                String str2 = null;
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    do {
                        if (!it.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it.next();
                    } while (((ActivityManager.RunningAppProcessInfo) next3).pid != iMyPid);
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next3;
                    if (runningAppProcessInfo != null) {
                        str2 = runningAppProcessInfo.processName;
                    }
                }
                if (!dh3.f(packageName, str2) || ProcessLifecycleOwner.k0.h0.i.compareTo(o84.f0) < 0) {
                    return;
                }
                Intent intent2 = new Intent();
                intent2.setAction("su.happ.proxyutility.action.check.main.process.alive.response");
                intent2.setPackage("su.happ.proxyutility");
                context.sendBroadcast(intent2);
            }
        }, new IntentFilter("su.happ.proxyutility.action.check.main.process.alive"), null);
        k61 k61VarB = b();
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        k61VarB.getClass();
        if (!k61VarB.a) {
            ue3.I(applicationContext2, k61VarB.e, new IntentFilter("su.happ.proxyutility.action.activity"), 2);
            try {
                Intent intent = new Intent();
                intent.setAction("su.happ.proxyutility.action.service");
                intent.setPackage("su.happ.proxyutility");
                intent.putExtra("key", 1);
                intent.putExtra("content", _UrlKt.FRAGMENT_ENCODE_SET);
                applicationContext2.sendBroadcast(intent);
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
            k61VarB.a = true;
        }
        try {
            xa2.f(this);
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
        }
        s1.b(this, new v(b2), new kp5(b3));
        x39.w0(this, j());
        vz7 vz7Var = ev7.a;
        pd6 pd6VarC = pd6.c(k32.i());
        eb5 eb5Var = new eb5(SubscriptionUpdater$ExpireReminderTask.class, 1L, TimeUnit.DAYS);
        eb5Var.e(1L, TimeUnit.MINUTES);
        pd6VarC.b("expire_reminder", (fl5) eb5Var.a());
        registerActivityLifecycleCallbacks(this.L0);
        q15 q15Var = WidgetProvider.a;
        Context applicationContext3 = getApplicationContext();
        applicationContext3.getClass();
        dt7.f(applicationContext3, null);
        String packageName = getPackageName();
        int iMyPid = Process.myPid();
        Object systemService = getSystemService("activity");
        systemService.getClass();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator it = runningAppProcesses.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((ActivityManager.RunningAppProcessInfo) next2).pid != iMyPid);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next2;
            if (runningAppProcessInfo != null) {
                str = runningAppProcessInfo.processName;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (dh3.f(packageName, str)) {
            jm4.Q(N0, ye1.Z, new r5(this, (q51) r5, b4), 2);
        }
        m51 m51Var = N0;
        ye1 ye1Var = ye1.Z;
        jm4.Q(m51Var, ye1Var, new uv2(this, r5, false ? 1 : 0), 2);
        jm4.Q(m51Var, ye1Var, new uv2(this, r5, b), 2);
        an7 an7Var = (an7) this.X.getValue();
        ue3.I(an7Var.a, an7Var.d, new IntentFilter("su.happ.proxyutility.action.activity"), 2);
        ((vp8) this.Y.getValue()).getClass();
        String packageName2 = getPackageName();
        int iMyPid2 = Process.myPid();
        Object systemService2 = getSystemService("activity");
        systemService2.getClass();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses2 = ((ActivityManager) systemService2).getRunningAppProcesses();
        if (runningAppProcesses2 != null) {
            Iterator it2 = runningAppProcesses2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid2);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = (ActivityManager.RunningAppProcessInfo) next;
            if (runningAppProcessInfo2 != null) {
                r5 = runningAppProcessInfo2.processName;
            }
        }
        if (dh3.f(packageName2, r5)) {
            kw4 kw4Var = kw4.a;
            Set setC1 = wv0.c1(kw4.c());
            vz7 vz7Var2 = kw4.d;
            kw4.s((MMKV) vz7Var2.getValue(), setC1);
            kw4.s(kw4.i(), setC1);
            kw4.s(kw4.j(), setC1);
            long jG = kw4.l().g("trim_mmkv_timestamp");
            long jA = we3.a.a().a();
            if (jA - jG > 345600000) {
                try {
                    ((MMKV) vz7Var2.getValue()).trim();
                    kw4.i().trim();
                    kw4.j().trim();
                    rj6Var = dn8.a;
                } catch (Throwable th3) {
                    if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                        throw th3;
                    }
                    rj6Var = new rj6(th3);
                }
                if (!(rj6Var instanceof rj6)) {
                    kw4.l().m(jA, "trim_mmkv_timestamp");
                }
            }
            Collection<b83> collectionE = ((b2) ((cm5) f().g.X.getValue())).e();
            ArrayList arrayList3 = new ArrayList();
            for (b83 b83Var : collectionE) {
                ArrayList arrayList4 = new ArrayList(xv0.Z(b83Var, 10));
                Iterator it3 = b83Var.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((RouteProfile) it3.next()).getId());
                }
                bw0.d0(arrayList3, arrayList4);
            }
            Set setC2 = wv0.c1(arrayList3);
            ss8 ss8Var2 = ss8.a;
            File[] fileArrListFiles = new File(ss8.L(mn6.j())).listFiles();
            if (fileArrListFiles != null) {
                arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        String name = file.getName();
                        name.getClass();
                        try {
                            rj6Var2 = UUID.fromString(name);
                        } catch (Throwable th4) {
                            if ((th4 instanceof InterruptedException) || (th4 instanceof CancellationException)) {
                                throw th4;
                            }
                            rj6Var2 = new rj6(th4);
                        }
                        if (!(rj6Var2 instanceof rj6)) {
                            arrayList.add(file);
                        }
                    }
                }
            } else {
                arrayList = d02.X;
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : arrayList) {
                if (!setC2.contains(((File) obj).getName())) {
                    arrayList5.add(obj);
                }
            }
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                da2.R((File) it4.next());
            }
        }
    }
}
