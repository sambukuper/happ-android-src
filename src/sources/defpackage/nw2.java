package defpackage;

import java.util.Map;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nw2 implements rn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ nw2(byte b) {
        this.X = b;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x006a A[LOOP:0: B:7:0x0023->B:20:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x006d A[SYNTHETIC] */
    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                ow2 ow2Var = (ow2) obj2;
                ((hv6) obj).getClass();
                ow2Var.getClass();
                return (Boolean) ow2Var.a.getValue();
            case 1:
                j74 j74Var = (j74) obj2;
                return i21.L(Integer.valueOf(j74Var.c()), Integer.valueOf(((oh5) j74Var.g0.c).l()));
            case 2:
                Map mapD = ((o74) obj2).d();
                if (mapD.isEmpty()) {
                    return null;
                }
                return mapD;
            case 3:
                pm4 pm4Var = (pm4) obj;
                pm4 pm4Var2 = (pm4) obj2;
                return Boolean.valueOf(((pm4Var.a instanceof StateDownloadFileV2.Success) && (pm4Var2.a instanceof StateDownloadFileV2.Success)) ? true : pm4Var.equals(pm4Var2));
            case 4:
                return Integer.valueOf(((tr4) obj).K(((Integer) obj2).intValue()));
            case 5:
                return Integer.valueOf(((tr4) obj).m(((Integer) obj2).intValue()));
            case 6:
                return Integer.valueOf(((tr4) obj).a(((Integer) obj2).intValue()));
            case 7:
                return Integer.valueOf(((tr4) obj).k(((Integer) obj2).intValue()));
            case 8:
                za4 za4Var = (za4) obj2;
                za4Var.getClass();
                return Boolean.valueOf(dh3.f(obj, za4Var.a));
            case 9:
                za4 za4Var2 = (za4) obj2;
                za4Var2.getClass();
                return Boolean.valueOf(dh3.f(obj, za4Var2.a));
            case 10:
                return Boolean.valueOf(dh3.f(obj, obj2));
            case 11:
                return Boolean.valueOf(dh3.f(obj, obj2));
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return Boolean.valueOf(dh3.f(obj, obj2));
            case 13:
                return Boolean.valueOf(dh3.f(obj, obj2));
            case 14:
                za4 za4Var3 = (za4) obj2;
                za4Var3.getClass();
                return Boolean.valueOf(dh3.f(obj, za4Var3.a));
            case 15:
                za4 za4Var4 = (za4) obj2;
                za4Var4.getClass();
                return Boolean.valueOf(dh3.f(obj, za4Var4.a));
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                za4 za4Var5 = (za4) obj;
                za4 za4Var6 = (za4) obj2;
                za4Var5.getClass();
                za4Var6.getClass();
                return Boolean.valueOf(dh3.f(za4Var5.a, za4Var6.a));
            case 17:
                za4 za4Var7 = (za4) obj;
                za4 za4Var8 = (za4) obj2;
                za4Var7.getClass();
                za4Var8.getClass();
                return Boolean.valueOf(dh3.f(za4Var7.a, za4Var8.a));
            case 18:
                za4 za4Var9 = (za4) obj;
                za4Var9.getClass();
                return Boolean.valueOf(dh3.f(za4Var9.a, obj2));
            case 19:
                za4 za4Var10 = (za4) obj;
                za4Var10.getClass();
                return Boolean.valueOf(dh3.f(za4Var10.a, obj2));
            case 20:
                za4 za4Var11 = (za4) obj;
                za4 za4Var12 = (za4) obj2;
                za4Var11.getClass();
                za4Var12.getClass();
                return Boolean.valueOf(dh3.f(za4Var11.a, za4Var12.a));
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                za4 za4Var13 = (za4) obj;
                za4 za4Var14 = (za4) obj2;
                za4Var13.getClass();
                za4Var14.getClass();
                return Boolean.valueOf(dh3.f(za4Var13.a, za4Var14.a));
            case 22:
                za4 za4Var15 = (za4) obj;
                za4Var15.getClass();
                return Boolean.valueOf(dh3.f(za4Var15.a, obj2));
            case 23:
                za4 za4Var16 = (za4) obj;
                za4Var16.getClass();
                return Boolean.valueOf(dh3.f(za4Var16.a, obj2));
            case 24:
                ((ab4) obj).getClass();
                ((ab4) obj2).getClass();
                return Boolean.TRUE;
            case 25:
                ((ab4) obj).getClass();
                ((ab4) obj2).getClass();
                return Boolean.TRUE;
            case 26:
                ((ab4) obj).getClass();
                ((ab4) obj2).getClass();
                return Boolean.TRUE;
            case 27:
                ((ab4) obj).getClass();
                ((ab4) obj2).getClass();
                return Boolean.TRUE;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            default:
                jv6 jv6Var = (jv6) obj2;
                Map map = jv6Var.X;
                s05 s05Var = jv6Var.Y;
                Object[] objArr = s05Var.b;
                Object[] objArr2 = s05Var.c;
                long[] jArr = s05Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapD2 = ((kv6) objArr2[i4]).d();
                                    if (mapD2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapD2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
        }
    }
}
