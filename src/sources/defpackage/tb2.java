package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.work.impl.WorkDatabase_Impl;
import io.sentry.c2;
import io.sentry.s6;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.inbound_auth.InboundAuthActivity;
import su.happ.proxyutility.firebase.FirebaseMessagingService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb2 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ tb2(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        wm2 wm2Var;
        int largeMemoryClass;
        r01 r01Var;
        byte b = this.X;
        int i = 0;
        dn8 dn8Var = dn8.a;
        Object obj = this.Y;
        switch (b) {
            case 0:
                int i2 = FirebaseMessagingService.n0;
                return new tc2((FirebaseMessagingService) obj);
            case 1:
                ((ai2) obj).a1();
                return dn8Var;
            case 2:
                xm2 xm2Var = (xm2) obj;
                Context context = xm2Var.X;
                String str = xm2Var.Y;
                if (str == null || !xm2Var.f0) {
                    wm2Var = new wm2(context, xm2Var.Y, new vk1((byte) 12), xm2Var.Z, xm2Var.g0);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    wm2Var = new wm2(context, new File(noBackupFilesDir, str).getAbsolutePath(), new vk1((byte) 12), xm2Var.Z, xm2Var.g0);
                }
                wm2Var.setWriteAheadLoggingEnabled(xm2Var.i0);
                return wm2Var;
            case 3:
                ur2 ur2Var = (ur2) obj;
                d73 d73Var = ur2Var.a;
                pd5 pd5Var = ur2Var.b;
                d73 d73VarB0 = w39.b0(d73Var, true);
                try {
                    Movie movieDecodeStream = Movie.decodeStream(d73VarB0.source().Y0());
                    u15.h(d73VarB0, null);
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        bt.i("Failed to decode GIF.");
                        return null;
                    }
                    xy4 xy4Var = new xy4(movieDecodeStream, (movieDecodeStream.isOpaque() && ((Boolean) z68.G(pd5Var, b73.h)).booleanValue()) ? Bitmap.Config.RGB_565 : ue3.z(b73.a(pd5Var)) ? Bitmap.Config.ARGB_8888 : (Bitmap.Config) z68.G(pd5Var, b73.b), pd5Var.c);
                    f4 f4Var = w63.a;
                    if (((Number) z68.G(pd5Var, f4Var)).intValue() != -2) {
                        int iIntValue = ((Number) z68.G(pd5Var, f4Var)).intValue();
                        if (iIntValue < -1) {
                            em7.c(pc6.j(iIntValue, "Invalid repeatCount: "));
                            return null;
                        }
                        xy4Var.s0 = iIntValue;
                    }
                    dn2 dn2Var = (dn2) z68.G(pd5Var, w63.c);
                    dn2 dn2Var2 = (dn2) z68.G(pd5Var, w63.d);
                    if (dn2Var != null || dn2Var2 != null) {
                        xy4Var.g0.add(new vs8(dn2Var, dn2Var2));
                    }
                    if (z68.G(pd5Var, w63.b) != null) {
                        c2.m();
                        return null;
                    }
                    xy4Var.t0 = null;
                    xy4Var.u0 = co5.X;
                    xy4Var.v0 = false;
                    xy4Var.invalidateSelf();
                    return new nd1(z39.h(xy4Var), false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u15.h(d73VarB0, th);
                        throw th2;
                    }
                }
            case 4:
                int iOrdinal = ((ru2) obj).a().ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        i = 2;
                        if (iOrdinal != 2) {
                            i = 3;
                            if (iOrdinal != 3) {
                                i = 4;
                                if (iOrdinal != 4) {
                                    b61.c();
                                    return null;
                                }
                            }
                        }
                    } else {
                        i = 1;
                    }
                }
                return Integer.valueOf(i);
            case 5:
                Window window = (Window) obj;
                window.setSoftInputMode(48);
                window.setWindowAnimations(0);
                window.setDimAmount(0.0f);
                return dn8Var;
            case 6:
                ((ow2) obj).a.setValue(Boolean.FALSE);
                return dn8Var;
            case 7:
                ky2 ky2Var = (ky2) obj;
                Boolean bool = (Boolean) ky2Var.c.getValue();
                bool.getClass();
                return new qg5(bool, (by2) ky2Var.b.getValue());
            case 8:
                return Http2Connection.sendDegradedPingLater$lambda$1((Http2Connection) obj);
            case 9:
                Context context2 = (Context) ((f63) obj).Y;
                double d = 0.2d;
                try {
                    Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    bt.q("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                b8 b8Var = new b8();
                try {
                    Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                return new a86(new gj4((long) (d * ((long) largeMemoryClass) * s6.MAX_EVENT_SIZE_BYTES), b8Var), b8Var);
            case 10:
                z5 z5Var = ((InboundAuthActivity) obj).Q0;
                if (z5Var != null) {
                    return new l93(z5Var);
                }
                dh3.T("binding");
                throw null;
            case 11:
                return Float.valueOf(((ga3) obj).b.getProgress() / 100.0f);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return Float.valueOf(ry7.h(((b71) obj).getCoroutineContext()));
            case 13:
                return (Integer) obj;
            case 14:
                Object systemService3 = ((View) ((f63) obj).Y).getContext().getSystemService("input_method");
                systemService3.getClass();
                return (InputMethodManager) systemService3;
            case 15:
                WorkDatabase_Impl workDatabase_Impl = ((fi3) obj).a;
                return Boolean.valueOf(!workDatabase_Impl.j() || workDatabase_Impl.m());
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                Object obj2 = ((rw3) obj).X;
                h04 h04Var = obj2 instanceof h04 ? (h04) obj2 : null;
                if (h04Var != null) {
                    return h04Var.v();
                }
                return null;
            case 17:
                r34 r34Var = ((LayoutNode) obj).I0;
                r34Var.p.C0 = true;
                bj4 bj4Var = r34Var.q;
                if (bj4Var != null) {
                    bj4Var.w0 = true;
                }
                return dn8Var;
            case 18:
                t34 t34Var = (t34) obj;
                if (!((Boolean) t34Var.g.getValue()).booleanValue() && (r01Var = t34Var.c) != null) {
                    r01Var.l();
                }
                return dn8Var;
            case 19:
                aq1 aq1Var = ((d64) obj).j;
                if (aq1Var != null) {
                    z68.W(aq1Var);
                }
                return dn8Var;
            case 20:
                dp4 dp4Var = (dp4) ((j94) obj).a.Y;
                if (!dp4Var.Y) {
                    if (dp4Var.Z) {
                        xr5.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    dp4Var.a();
                    dp4Var.Z = true;
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ((ow4) obj).g0.invoke();
                return dn8Var;
            case 22:
                mx4 mx4Var = (mx4) obj;
                mx4Var.f = false;
                HashSet hashSet = new HashSet();
                j05 j05Var = mx4Var.d;
                if (j05Var != null) {
                    Object[] objArr = j05Var.a;
                    int i3 = j05Var.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        LayoutNode layoutNode = (LayoutNode) objArr[i4];
                        j05 j05Var2 = mx4Var.e;
                        if (j05Var2 == null) {
                            j05Var2 = new j05();
                            mx4Var.e = j05Var2;
                        }
                        r06 r06Var = (r06) j05Var2.g(i4);
                        jx4 jx4Var = (jx4) layoutNode.H0.i0;
                        if (jx4Var.p0) {
                            mx4.b(jx4Var, r06Var);
                        }
                    }
                    j05Var.d();
                    j05 j05Var3 = mx4Var.e;
                    if (j05Var3 != null) {
                        j05Var3.d();
                    }
                }
                j05 j05Var4 = mx4Var.b;
                if (j05Var4 != null) {
                    Object[] objArr2 = j05Var4.a;
                    int i5 = j05Var4.b;
                    for (int i6 = 0; i6 < i5; i6++) {
                        d10 d10Var = (d10) objArr2[i6];
                        j05 j05Var5 = mx4Var.c;
                        if (j05Var5 == null) {
                            j05Var5 = new j05();
                            mx4Var.c = j05Var5;
                        }
                        r06 r06Var2 = (r06) j05Var5.g(i6);
                        if (d10Var.p0) {
                            mx4.b(d10Var, r06Var2);
                        }
                    }
                    j05Var4.d();
                    j05 j05Var6 = mx4Var.c;
                    if (j05Var6 != null) {
                        j05Var6.d();
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((d10) it.next()).a1();
                }
                return dn8Var;
            case 23:
                return (b71) ((z47) obj).g0;
            case 24:
                return ((z25) obj).Y0();
            case 25:
                return (r76) ((v76) obj).a.e.getValue();
            case 26:
                return "Unexpected end of input: yet to parse ".concat(((w75) obj).b());
            case 27:
                return new x95((z95) obj);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                qj0 qj0Var = ((xm5) obj).X;
                jf0 jf0Var = new jf0();
                String str2 = qj0Var.a.Y;
                return jf0Var;
            default:
                return oi0.o(new StringBuilder("Unexpected end of input: yet to parse '"), ((ko5) obj).a, '\'');
        }
    }
}
