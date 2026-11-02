package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.res.TypedArray;
import android.widget.TextView;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.ResolveForPingData;
import su.happ.proxyutility.dto.SubscriptionExtraStatus;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ p0(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0183  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [q51] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Integer] */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        SubscriptionExtraStatus subscriptionExtraStatus;
        String strA;
        byte b = this.X;
        byte b2 = 3;
        byte b3 = 0;
        Object objValueOf = 0;
        strA = null;
        String strA2 = null;
        objValueOf = 0;
        Object rj6Var = dn8.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                ((xz4) obj3).b((et5) obj2);
                return rj6Var;
            case 1:
                z9 z9Var = (z9) obj3;
                ia iaVar = (ia) obj2;
                long jG = z85.g(z9Var.u1() ? -1.0f : 1.0f, ((fu1) obj).a);
                iaVar.a(z9Var.L0.c(Float.intBitsToFloat((int) (z9Var.s0 == sd5.X ? jG & 4294967295L : jG >> 32))), 0.0f);
                return rj6Var;
            case 2:
                return new wd3((kh) obj3, new o7((rf) obj2, b2));
            case 3:
                ir5 ir5Var = (ir5) obj3;
                ir5Var.setPositionProvider((nr5) obj2);
                ir5Var.q();
                return new zf((byte) 0);
            case 4:
                qg5 qg5Var = (qg5) obj2;
                PrintWriter printWriter = (PrintWriter) obj;
                Object objQ = p61.q(printWriter);
                String strW = ((SubscriptionItem) obj3).getRemarks();
                Object obj4 = qg5Var != null ? (Integer) qg5Var.X : null;
                if (qg5Var != null && (subscriptionExtraStatus = (SubscriptionExtraStatus) qg5Var.Y) != null) {
                    objValueOf = Integer.valueOf(subscriptionExtraStatus.getStatus());
                }
                printWriter.println(objQ + " subscription " + strW + " check provider response code: " + obj4 + " total " + objValueOf);
                return rj6Var;
            case 5:
                c00 c00Var = (c00) obj3;
                d00 d00Var = (d00) obj2;
                t98 t98Var = c00Var.q0;
                if (t98Var != null) {
                    t98Var.b();
                }
                c00Var.q0 = null;
                ux0 ux0Var = d00Var.Y;
                if (ux0Var != null) {
                    ux0Var.V(rj6Var);
                }
                d00Var.Y = null;
                return rj6Var;
            case 6:
                m00 m00Var = (m00) obj3;
                fz0 fz0Var = (fz0) obj2;
                z47 z47Var = m00Var.a;
                if (z47Var != null) {
                    z47.k(z47Var, fz0Var.b);
                } else {
                    z95 z95Var = m00Var.b;
                    if (z95Var == null) {
                        bt.i("Unreachable");
                        return null;
                    }
                    z95Var.b(fz0Var.a);
                }
                return new p00(m00Var, fz0Var, b3);
            case 7:
                w51.G((b71) obj3, null, null, new q0((yh2) obj, (jc8) obj2, objValueOf, (byte) 7), 3);
                return rj6Var;
            case 8:
                do5.k((do5) obj, (eo5) obj3, 0, 0, ((j60) obj2).q0, 4);
                return rj6Var;
            case 9:
                d90 d90Var = (d90) obj2;
                p34 p34Var = (p34) obj;
                p34Var.a();
                sv1.d0(p34Var, (lf) obj3, d90Var, 0.0f, null, 60);
                return rj6Var;
            case 10:
                p34 p34Var2 = (p34) obj;
                p34Var2.a();
                sv1.d0(p34Var2, ((zd5) obj3).j0, (d90) obj2, 0.0f, null, 60);
                return rj6Var;
            case 11:
                ((c15) ((yr2) obj3).Y).j((l41) obj2);
                return rj6Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                qd0 qd0Var = (qd0) obj3;
                ux0 ux0Var2 = (ux0) obj2;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    qd0Var.b(ux0Var2.G());
                } else if (th instanceof CancellationException) {
                    qd0Var.c();
                } else {
                    qd0Var.d(th);
                }
                return rj6Var;
            case 13:
                xg1 xg1Var = (xg1) obj3;
                ux0 ux0Var3 = (ux0) obj2;
                Throwable th2 = (Throwable) obj;
                xg1Var.getClass();
                ux0Var3.getClass();
                if (th2 == null) {
                    ux0Var3.V(xg1Var.p());
                } else if (th2 instanceof CancellationException) {
                    ux0Var3.l((CancellationException) th2);
                } else {
                    ux0Var3.l0(th2);
                }
                return rj6Var;
            case 14:
                qr6 qr6Var = (qr6) obj;
                qr6Var.getClass();
                ((pi1) obj3).b.H(qr6Var, (ki1) obj2);
                return rj6Var;
            case 15:
                ko1 ko1Var = (ko1) obj;
                ko1Var.getClass();
                ko1Var.b0((jo1) obj3, (String) obj2);
                return rj6Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return DiskLruCache.Editor.newSink$lambda$0$0((DiskLruCache) obj3, (DiskLruCache.Editor) obj2, (IOException) obj);
            case 17:
                String str = (String) obj3;
                Service service = (Service) obj2;
                String str2 = (String) obj;
                str2.getClass();
                try {
                    a aVar = yw2.b;
                    aVar.getClass();
                    XRayConfig xRayConfig = (XRayConfig) aVar.c(str, new yi8(XRayConfig.class));
                    for (XRayConfig.OutboundBean outboundBean : xRayConfig.getOutbounds()) {
                        if (dh3.f(outboundBean.getTag(), "proxy")) {
                            outboundBean.n(str2);
                        }
                    }
                    qe4.M0(8, service, new a().h(new ResolveForPingData(str2, yw2.d.h(xRayConfig))));
                    break;
                } catch (Throwable th3) {
                    if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                        throw th3;
                    }
                    rj6Var = new rj6(th3);
                }
                return (dn8) (rj6Var instanceof rj6 ? null : rj6Var);
            case 18:
                d58 d58Var = (d58) obj2;
                if (((Boolean) ((py7) obj3).B((pt1) obj)).booleanValue()) {
                    return d58Var;
                }
                return null;
            case 19:
                ((z32) obj3).b.b((y32) obj2);
                return rj6Var;
            case 20:
                String str3 = (String) obj3;
                List list = (List) obj2;
                PrintWriter printWriter2 = (PrintWriter) obj;
                Date dateQ = p61.q(printWriter2);
                ProviderId.Companion companion = ProviderId.INSTANCE;
                printWriter2.println(dateQ + " Provider " + str3 + " was found in file: " + (list != null));
                return rj6Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                p72 p72Var = (p72) obj2;
                PrintWriter printWriter3 = (PrintWriter) obj;
                printWriter3.println(p61.q(printWriter3) + " Check provider with file: " + ((Boolean) obj3));
                p72Var.c().getClass();
                Long lC0 = mm7.c0("1792654306601");
                if (lC0 != null) {
                    te3 te3Var = te3.Z;
                    te3 te3VarE = km4.E(lC0.longValue());
                    if (te3VarE != null) {
                        ld4 ld4VarD = v18.d(te3VarE, pa8.b);
                        nd4 nd4Var = m72.a;
                        nd4Var.getClass();
                        strA = nd4Var.a(ld4VarD);
                    } else {
                        strA = null;
                    }
                } else {
                    strA = null;
                }
                long jF = ((MMKV) p72Var.c().a.getValue()).f(-1L, "extra_file_timestamp");
                Long lValueOf = Long.valueOf(jF);
                if (jF == -1) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    te3 te3Var2 = te3.Z;
                    te3 te3VarE2 = km4.E(lValueOf.longValue());
                    if (te3VarE2 != null) {
                        ld4 ld4VarD2 = v18.d(te3VarE2, pa8.b);
                        nd4 nd4Var2 = m72.a;
                        nd4Var2.getClass();
                        strA2 = nd4Var2.a(ld4VarD2);
                    }
                }
                printWriter3.println("date_in: " + strA + " date_re: " + strA2);
                return rj6Var;
            case 22:
                rn2 rn2Var = (rn2) obj3;
                String str4 = (String) obj2;
                qg5 qg5Var2 = (qg5) obj;
                qg5Var2.getClass();
                String strR = ((SubscriptionItem) qg5Var2.Y).getProviderId();
                Boolean bool = (Boolean) rn2Var.K(strR != null ? strR : null, str4);
                bool.getClass();
                return bool;
            case 23:
                PrintWriter printWriter4 = (PrintWriter) obj;
                printWriter4.println(p61.q(printWriter4) + " control type:sub-change change:" + ((hp0) obj3).X + " size:" + ((String) obj2).length());
                return rj6Var;
            case 24:
                PrintWriter printWriter5 = (PrintWriter) obj;
                printWriter5.println(p61.q(printWriter5) + " control type:set-settings param:" + ((String) obj3) + " value:" + ((String) obj2));
                return rj6Var;
            case 25:
                ((xz4) obj3).b((vf3) obj2);
                return rj6Var;
            case 26:
                ((hv2) obj3).Z.removeCallbacks((sc) obj2);
                return rj6Var;
            case 27:
                ca6 ca6Var = (ca6) obj3;
                ca6 ca6Var2 = (ca6) obj2;
                fq4 fq4Var = (fq4) obj;
                if (ca6Var.X == -1) {
                    ca6Var.X = fq4Var.b().X;
                }
                ca6Var2.X = fq4Var.b().Y + 1;
                return _UrlKt.FRAGMENT_ENCODE_SET;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                Map map = (Map) obj3;
                ca6 ca6Var3 = (ca6) obj2;
                PrintWriter printWriter6 = (PrintWriter) obj;
                Date dateQ2 = p61.q(printWriter6);
                Integer numValueOf = map != null ? Integer.valueOf(map.size()) : null;
                printWriter6.println(dateQ2 + " Config manager import batch: before servers: " + numValueOf + ", now servers " + ca6Var3.X);
                return rj6Var;
            default:
                HappForwardField happForwardField = (HappForwardField) obj3;
                TypedArray typedArray = (TypedArray) obj;
                int i = HappForwardField.j0;
                typedArray.getClass();
                TextView textView = happForwardField.f0;
                textView.setText(typedArray.getString(x56.HappForwardField_title));
                textView.setTextColor(typedArray.getColor(x56.HappForwardField_titleColor, os4.q((Context) obj2, v26.settingsText)));
                happForwardField.g0.setText(typedArray.getString(x56.HappForwardField_value));
                String string = typedArray.getString(x56.HappForwardField_description);
                TextView textView2 = happForwardField.i0;
                textView2.setVisibility(string != null ? 0 : 8);
                textView2.setText(string);
                return rj6Var;
        }
    }
}
