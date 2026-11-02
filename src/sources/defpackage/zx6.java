package defpackage;

import android.content.Context;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.CancellationException;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zx6 implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ zx6(byte b) {
        this.X = b;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) throws Exception {
        Object rj6Var;
        is7 is7Var;
        byte b = this.X;
        boolean z = true;
        boolean z2 = false;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return new ay6(((Integer) obj).intValue());
            case 1:
                z85 z85Var = (z85) obj;
                long j = z85Var.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new tk(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & z85Var.a))) : o07.a;
            case 2:
                tk tkVar = (tk) obj;
                return new z85((((long) Float.floatToRawIntBits(tkVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(tkVar.a)) << 32));
            case 3:
                kw2 kw2Var = kw2.a;
                return kw2.k(((ServerCache) obj).getGuid());
            case 4:
                u27 u27Var = (u27) obj;
                u27Var.getClass();
                return u27Var.iterator();
            case 5:
                return obj;
            case 6:
                return Boolean.valueOf(obj == null);
            case 7:
                p87 p87Var = (p87) obj;
                p87Var.getClass();
                int iOrdinal = p87Var.ordinal();
                if (iOrdinal == 0) {
                    z = false;
                } else if (iOrdinal != 1 && iOrdinal != 2) {
                    b61.c();
                    return null;
                }
                return Boolean.valueOf(z);
            case 8:
                return dn8Var;
            case 9:
                return dn8Var;
            case 10:
                ((Boolean) obj).getClass();
                return dn8Var;
            case 11:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.println(p61.q(printWriter) + " Fallback request (3)");
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                PrintWriter printWriter2 = (PrintWriter) obj;
                printWriter2.println(p61.q(printWriter2) + " Fallback request (4)");
                return dn8Var;
            case 13:
                qg5 qg5Var = (qg5) obj;
                qg5Var.getClass();
                String value = ((SubId) qg5Var.X).getValue();
                String str = (String) qg5Var.Y;
                try {
                    cp3 cp3Var = mr.a;
                    g55 g55Var = cp3Var.b;
                    rj6Var = cp3Var.a(qs7.Companion.serializer(), str);
                    break;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
                if (rj6Var instanceof rj6) {
                    rj6Var = null;
                }
                qs7 qs7Var = (qs7) rj6Var;
                if (qs7Var != null) {
                    return new qg5(new SubId(value), qs7Var);
                }
                return null;
            case 14:
                qg5 qg5Var2 = (qg5) obj;
                qg5Var2.getClass();
                return Boolean.valueOf(((SubscriptionItem) qg5Var2.Y).a0());
            case 15:
                PrintWriter printWriter3 = (PrintWriter) obj;
                printWriter3.println(p61.q(printWriter3) + " SubscriptionUpdater: skipping update since notifications are disabled");
                return dn8Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                PrintWriter printWriter4 = (PrintWriter) obj;
                printWriter4.println(p61.q(printWriter4) + " SubscriptionUpdater: skipping update since UI is running");
                return dn8Var;
            case 17:
                qg5 qg5Var3 = (qg5) obj;
                qg5Var3.getClass();
                String value2 = ((SubId) qg5Var3.X).getValue();
                return new yf8(new SubId(value2), (SubscriptionItem) qg5Var3.Y, ((zt7) ev7.c.getValue()).a(value2));
            case 18:
                yf8 yf8Var = (yf8) obj;
                yf8Var.getClass();
                SubscriptionItem subscriptionItem = (SubscriptionItem) yf8Var.Y;
                qs7 qs7Var2 = (qs7) yf8Var.Z;
                if (!subscriptionItem.getAutoUpdate() && (qs7Var2 == null || (is7Var = qs7Var2.a) == null || !is7Var.a)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                rv7 rv7Var = (rv7) obj;
                rv7Var.getClass();
                ConfigGroupCache configGroupCache = rv7Var.b;
                SubscriptionItem subscriptionItemD = configGroupCache.getSubscriptionItem();
                Long lValueOf = subscriptionItemD != null ? Long.valueOf(subscriptionItemD.getLastUpdated()) : null;
                SubscriptionItem subscriptionItemD2 = configGroupCache.getSubscriptionItem();
                return new Object[]{lValueOf, subscriptionItemD2 != null ? new Date(subscriptionItemD2.getAddedTime()) : null, rv7Var.e};
            case 20:
                rv7 rv7Var2 = (rv7) obj;
                rv7Var2.getClass();
                ConfigGroupCache configGroupCache2 = rv7Var2.b;
                SubscriptionItem subscriptionItemD3 = configGroupCache2.getSubscriptionItem();
                if (subscriptionItemD3 != null && subscriptionItemD3.b0()) {
                    z2 = true;
                }
                return new Object[]{Boolean.valueOf(z2), Boolean.valueOf(!fm7.o0(configGroupCache2.getSubId()))};
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                rv7 rv7Var3 = (rv7) obj;
                rv7Var3.getClass();
                ConfigGroupCache configGroupCache3 = rv7Var3.b;
                SubscriptionItem subscriptionItemD4 = configGroupCache3.getSubscriptionItem();
                MetaParams metaParamsP = subscriptionItemD4 != null ? subscriptionItemD4.getMetaParams() : null;
                SubscriptionItem subscriptionItemD5 = configGroupCache3.getSubscriptionItem();
                String strX = subscriptionItemD5 != null ? subscriptionItemD5.getUrl() : null;
                SubscriptionItem subscriptionItemD6 = configGroupCache3.getSubscriptionItem();
                Boolean boolValueOf = subscriptionItemD6 != null ? Boolean.valueOf(subscriptionItemD6.getEncryptedUrl()) : null;
                SubscriptionItem subscriptionItemD7 = configGroupCache3.getSubscriptionItem();
                b12 b12VarY = subscriptionItemD7 != null ? subscriptionItemD7.getEncryptedUrlMode() : null;
                SubscriptionItem subscriptionItemD8 = configGroupCache3.getSubscriptionItem();
                return new Object[]{metaParamsP, strX, boolValueOf, b12VarY, subscriptionItemD8 != null ? Boolean.valueOf(subscriptionItemD8.G()) : null};
            case 22:
                rv7 rv7Var4 = (rv7) obj;
                rv7Var4.getClass();
                ConfigGroupCache configGroupCache4 = rv7Var4.b;
                return new Object[]{Boolean.valueOf(configGroupCache4.getIsExpand()), Boolean.valueOf(configGroupCache4.getConfigs().isEmpty())};
            case 23:
                rv7 rv7Var5 = (rv7) obj;
                rv7Var5.getClass();
                ConfigGroupCache configGroupCache5 = rv7Var5.b;
                SubscriptionItem subscriptionItemD9 = configGroupCache5.getSubscriptionItem();
                return new Object[]{Boolean.valueOf(subscriptionItemD9 != null ? dh3.f(subscriptionItemD9.getImport(), Boolean.FALSE) : false), Boolean.valueOf(configGroupCache5.getConfigs().isEmpty())};
            case 24:
                nw3[] nw3VarArr = d17.a;
                e17 e17Var = c17.m;
                nw3 nw3Var = d17.a[5];
                Boolean bool = Boolean.TRUE;
                e17Var.getClass();
                ((f17) obj).a(e17Var, bool);
                return dn8Var;
            case 25:
                return dn8Var;
            case 26:
                return Float.valueOf(1.0f);
            case 27:
                return Float.valueOf(((Context) obj).getResources().getDisplayMetrics().density);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                qr6 qr6Var = (qr6) obj;
                qr6Var.getClass();
                xr6 xr6VarX0 = qr6Var.X0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (xr6VarX0.S0()) {
                        arrayList.add(xr6VarX0.p0(0));
                    }
                    xr6VarX0.close();
                    return arrayList;
                } catch (Throwable th2) {
                    xr6VarX0.close();
                    throw th2;
                }
            default:
                ((Float) obj).getClass();
                return dn8Var;
        }
    }
}
