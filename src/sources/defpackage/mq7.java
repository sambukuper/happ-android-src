package defpackage;

import com.tencent.mmkv.MMKV;
import java.util.BitSet;
import java.util.Iterator;
import java.util.ListIterator;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;
import su.happ.tunnel.TProxyService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mq7 implements dn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ mq7(y45 y45Var) {
        this.X = (byte) 20;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        long[] jArr;
        ListIterator listIterator;
        int i;
        switch (this.X) {
            case 0:
                HappApplication happApplication = HappApplication.M0;
                return k32.i().h();
            case 1:
                HappApplication happApplication2 = HappApplication.M0;
                return k32.i().d();
            case 2:
                HappApplication happApplication3 = HappApplication.M0;
                return (qq0) k32.i().j0.getValue();
            case 3:
                HappApplication happApplication4 = HappApplication.M0;
                return (s24) k32.i().k0.getValue();
            case 4:
                HappApplication happApplication5 = HappApplication.M0;
                return (us) k32.i().m0.getValue();
            case 5:
                HappApplication happApplication6 = HappApplication.M0;
                return k32.i().g();
            case 6:
                HappApplication happApplication7 = HappApplication.M0;
                return (a93) k32.i().C0.getValue();
            case 7:
                SubscriptionSortType[] subscriptionSortTypeArrValues = SubscriptionSortType.values();
                subscriptionSortTypeArrValues.getClass();
                return new u22("su.happ.proxyutility.dto.enums.SubscriptionSortType", subscriptionSortTypeArrValues);
            case 8:
                SubscriptionAutoConnectType[] subscriptionAutoConnectTypeArrValues = SubscriptionAutoConnectType.values();
                subscriptionAutoConnectTypeArrValues.getClass();
                return new u22("su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType", subscriptionAutoConnectTypeArrValues);
            case 9:
                HappApplication happApplication8 = HappApplication.M0;
                return k32.i().h();
            case 10:
                HappApplication happApplication9 = HappApplication.M0;
                return k32.i().g();
            case 11:
                HappApplication happApplication10 = HappApplication.M0;
                return new d27(k32.i().a());
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                HappApplication happApplication11 = HappApplication.M0;
                return (pr7) k32.i().G0.getValue();
            case 13:
                HappApplication happApplication12 = HappApplication.M0;
                return (an7) k32.i().X.getValue();
            case 14:
                HappApplication happApplication13 = HappApplication.M0;
                return k32.i().h();
            case 15:
                return MMKV.t("SETTING", vj8.M());
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                HappApplication happApplication14 = HappApplication.M0;
                return k32.i().h();
            case 17:
                HappApplication happApplication15 = HappApplication.M0;
                return (pv0) k32.i().r0.getValue();
            case 18:
                return new kt1(0.0f);
            case 19:
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 20:
                String str = _UrlKt.FRAGMENT_ENCODE_SET;
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", _UrlKt.FRAGMENT_ENCODE_SET);
                    objInvoke.getClass();
                    str = (String) objInvoke;
                    while (true) {
                        o03 o03Var = (o03) listIterator;
                        if (!o03Var.hasNext()) {
                            BitSet bitSetValueOf = BitSet.valueOf(jArr);
                            int size = bitSetValueOf.size();
                            if (size == 0) {
                                return m02.X;
                            }
                            o57 o57Var = new o57(size);
                            for (int iNextSetBit = 0; iNextSetBit >= 0; iNextSetBit = bitSetValueOf.nextSetBit(iNextSetBit + 1)) {
                                if (bitSetValueOf.get(iNextSetBit)) {
                                    o57Var.add(Integer.valueOf(iNextSetBit));
                                }
                                if (iNextSetBit == Integer.MAX_VALUE) {
                                    return w45.m(o57Var);
                                }
                            }
                            return w45.m(o57Var);
                        }
                        jArr[i] = ((Number) o03Var.next()).longValue();
                        i++;
                    }
                } catch (Exception unused) {
                }
                gb4 gb4VarR = i21.r();
                Iterator it = fm7.E0(str, new char[]{','}).iterator();
                while (it.hasNext()) {
                    try {
                        gb4VarR.add(Long.valueOf(Long.parseLong((String) it.next())));
                    } catch (NumberFormatException unused2) {
                    }
                }
                gb4 gb4VarJ = i21.j(gb4VarR);
                gb4VarJ.getClass();
                jArr = new long[gb4VarJ.a()];
                listIterator = gb4VarJ.listIterator(0);
                i = 0;
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                v08 v08Var = TProxyService.Companion;
                return MMKV.t("SETTING", vj8.M());
            case 22:
            case 23:
                return null;
            case 24:
                return ak8.a;
            case 25:
                return new hf3(0L);
            case 26:
                return new hf3(0L);
            case 27:
                return og1.a;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                e37[] e37VarArr = new e37[0];
                if (fm7.o0("kotlinx.datetime.TimeBased")) {
                    bt.q("Blank serial names are prohibited");
                    return null;
                }
                dt0 dt0Var = new dt0("kotlinx.datetime.TimeBased");
                oi4 oi4Var = oi4.a;
                dt0Var.a("nanoseconds", oi4.b);
                return new g37("kotlinx.datetime.TimeBased", pm7.M, dt0Var.b.size(), eu.K0(e37VarArr), dt0Var);
            default:
                kw4 kw4Var2 = kw4.a;
                return kw4.l();
        }
    }

    public /* synthetic */ mq7(byte b) {
        this.X = b;
    }
}
