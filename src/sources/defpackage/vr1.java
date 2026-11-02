package defpackage;

import android.content.Context;
import com.google.gson.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.AdditionalInfoCode;
import su.happ.proxyutility.dto.AdditionalInfoCodeKt;
import su.happ.proxyutility.dto.AppVersion;
import su.happ.proxyutility.dto.CheckSubscriptionExtraResult;
import su.happ.proxyutility.dto.CheckSubscriptionRestrictedResult;
import su.happ.proxyutility.dto.DeviceModel;
import su.happ.proxyutility.dto.HWID;
import su.happ.proxyutility.dto.HashedDomain;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.RemotePushStatus;
import su.happ.proxyutility.dto.SubscriptionExtraStatus;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.SubscriptionRestrictedStatus;
import su.happ.proxyutility.dto.SubscriptionUserInfo;
import su.happ.proxyutility.dto.VersionOS;
import su.happ.proxyutility.dto.enums.TypeCheck;
import su.happ.proxyutility.util.dnsttv.dto.RequestEnvelope;
import su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class vr1 {
    public final Context a;
    public final byte[] b;
    public final List c;
    public final m51 d;
    public final DnsTTLogType e;
    public final p91 f;
    public final ls1 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vr1(Context context) {
        this.a = context;
        ss8 ss8Var = ss8.a;
        this.b = ss8.r("c33b18ca2035aa44330a757316ab0f92aa18572a284543af2388950e62fadb4f");
        List listL = i21.L(new String[]{"t.polend.org", "t.pullse.org", "t.itine.org", "ads.pullse.org", "cloud.itine.org"});
        this.c = listL;
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        this.d = gv3.c(g33.K(ow7VarB, ye1.Z));
        this.e = DnsTTLogType.INFO;
        this.f = new p91(context, listL, new yr2(this, (byte) 27));
        this.g = new ls1();
        jm4.Q(HappApplication.N0, (u61) null, new r5(this, (q51) null, (byte) 11), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void d(vr1 vr1Var, String str, DnsTTLogType dnsTTLogType, int i) {
        vr1Var.c(str, (i & 4) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:41:0x0142  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(SubscriptionItem subscriptionItem, s51 s51Var) {
        qr1 qr1Var;
        CheckSubscriptionRestrictedResult rj6Var;
        String str;
        SubscriptionItem subscriptionItem2;
        Object objE;
        SubscriptionRestrictedStatus subscriptionRestrictedStatus;
        if (s51Var instanceof qr1) {
            qr1Var = (qr1) s51Var;
            int i = qr1Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                qr1Var.j0 = i - Integer.MIN_VALUE;
            } else {
                qr1Var = new qr1(this, s51Var);
            }
        } else {
            qr1Var = new qr1(this, s51Var);
        }
        Object obj = qr1Var.h0;
        int i2 = qr1Var.j0;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                ss8 ss8Var = ss8.a;
                Object objQ = ss8.q(subscriptionItem);
                w39.n0(objQ);
                String value = ((HashedDomain) objQ).getValue();
                String installId = subscriptionItem.getInstallId();
                if (installId == null) {
                    return new CheckSubscriptionRestrictedResult((String) null, TypeCheck.DNSTT, 3);
                }
                AppVersion appVersionF = ss8.f();
                yf8 yf8VarK = ss8.k(this.a);
                RequestEnvelope requestEnvelope = new RequestEnvelope(RequestEnvelope.DeviceOS.Android, appVersionF.getMajor(), appVersionF.getMinor(), appVersionF.getPatch(), RequestEnvelope.Route.Install, null, ((VersionOS) yf8VarK.Y).getValue(), ((HWID) yf8VarK.X).getValue(), ((DeviceModel) yf8VarK.Z).getValue(), value, null, installId, null);
                str = value;
                subscriptionItem2 = subscriptionItem;
                qr1Var.f0 = subscriptionItem2;
                qr1Var.g0 = str;
                qr1Var.j0 = 1;
                objE = e(requestEnvelope, qr1Var);
                c71 c71Var = c71.X;
                if (objE == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = qr1Var.g0;
                SubscriptionItem subscriptionItem3 = qr1Var.f0;
                w39.n0(obj);
                objE = obj;
                subscriptionItem2 = subscriptionItem3;
            }
            qg5 qg5Var = (qg5) objE;
            Integer num = (Integer) qg5Var.X;
            byte[] bArr = (byte[]) qg5Var.Y;
            if (num == null && bArr != null) {
                String str2 = new String(bArr, iq0.a);
                cp3 cp3Var = mr.a;
                g55 g55Var = ((vm3) cp3Var).b;
                AdditionalInfoCode additionalInfoCode = ((lr1) cp3Var.a(lr1.Companion.serializer(), str2)).a;
                Integer num2 = ((or1) cp3Var.a(or1.Companion.serializer(), str2)).a;
                StringBuilder sb = new StringBuilder();
                sb.append(new Date() + " subscription " + subscriptionItem2.getRemarks() + " check install tt-state: success responseCode:" + num2 + " ");
                if (num2 == null) {
                    subscriptionRestrictedStatus = null;
                } else {
                    int iIntValue = num2.intValue();
                    if (200 > iIntValue || iIntValue >= 300) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        a aVar = yw2.c;
                        aVar.getClass();
                        subscriptionRestrictedStatus = (SubscriptionRestrictedStatus) aVar.c(str2, new yi8(SubscriptionRestrictedStatus.class));
                    } else {
                        subscriptionRestrictedStatus = null;
                    }
                }
                if (subscriptionRestrictedStatus != null) {
                    sb.append("total: " + subscriptionRestrictedStatus.getImport() + " Info Code:" + (additionalInfoCode != null ? AdditionalInfoCodeKt.a(additionalInfoCode.getValue(), str) : null));
                } else {
                    sb.append("ERROR Info Code:" + (additionalInfoCode != null ? AdditionalInfoCodeKt.a(additionalInfoCode.getValue(), str) : null));
                }
                d(this, sb.toString(), null, 2);
                rj6Var = new CheckSubscriptionRestrictedResult(str, subscriptionRestrictedStatus, TypeCheck.DNSTT);
            } else if (num == null) {
                d(this, new Date() + " subscription " + subscriptionItem2.getRemarks() + " check install tt-state: failure data:null", null, 2);
                rj6Var = new CheckSubscriptionRestrictedResult((String) null, TypeCheck.DNSTT, 3);
            } else {
                d(this, new Date() + " subscription " + subscriptionItem2.getRemarks() + " check install tt-state: failure error:" + num, null, 2);
                rj6Var = new CheckSubscriptionRestrictedResult((String) null, TypeCheck.DNSTT, 3);
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return sj6.a(rj6Var) == null ? rj6Var : new CheckSubscriptionRestrictedResult((String) null, TypeCheck.DNSTT, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:55:0x016e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object b(SubscriptionItem subscriptionItem, String str, s51 s51Var) {
        rr1 rr1Var;
        CheckSubscriptionExtraResult rj6Var;
        String providerId;
        String str2;
        SubscriptionItem subscriptionItem2;
        Object objE;
        SubscriptionUserInfo subscriptionUserInfo;
        SubscriptionExtraStatus subscriptionExtraStatus;
        Context context = this.a;
        if (s51Var instanceof rr1) {
            rr1Var = (rr1) s51Var;
            int i = rr1Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                rr1Var.j0 = i - Integer.MIN_VALUE;
            } else {
                rr1Var = new rr1(this, s51Var);
            }
        } else {
            rr1Var = new rr1(this, s51Var);
        }
        Object obj = rr1Var.h0;
        int i2 = rr1Var.j0;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                ss8 ss8Var = ss8.a;
                Object objQ = ss8.q(subscriptionItem);
                w39.n0(objQ);
                String value = ((HashedDomain) objQ).getValue();
                if (str == null) {
                    providerId = subscriptionItem.getProviderId();
                    if (providerId == null) {
                        return new CheckSubscriptionExtraResult((String) null, TypeCheck.DNSTT, 3);
                    }
                } else {
                    providerId = str;
                }
                AppVersion appVersionF = ss8.f();
                yf8 yf8VarK = ss8.k(context);
                String value2 = ((HWID) yf8VarK.X).getValue();
                String value3 = ((VersionOS) yf8VarK.Y).getValue();
                String value4 = ((DeviceModel) yf8VarK.Z).getValue();
                RequestEnvelope.DeviceOS deviceOS = ue3.y(context) ? RequestEnvelope.DeviceOS.AndroidTV : RequestEnvelope.DeviceOS.Android;
                int major = appVersionF.getMajor();
                int minor = appVersionF.getMinor();
                int patch = appVersionF.getPatch();
                RequestEnvelope.Route route = RequestEnvelope.Route.Provider;
                MetaParams metaParams = subscriptionItem.getMetaParams();
                RequestEnvelope requestEnvelope = new RequestEnvelope(deviceOS, major, minor, patch, route, (metaParams == null || (subscriptionUserInfo = metaParams.getSubscriptionUserInfo()) == null) ? null : new Long(subscriptionUserInfo.getExpire()), value3, value2, value4, value, i21.K(providerId), null, null);
                str2 = value;
                subscriptionItem2 = subscriptionItem;
                rr1Var.f0 = subscriptionItem2;
                rr1Var.g0 = str2;
                rr1Var.j0 = 1;
                objE = e(requestEnvelope, rr1Var);
                c71 c71Var = c71.X;
                if (objE == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = rr1Var.g0;
                SubscriptionItem subscriptionItem3 = rr1Var.f0;
                w39.n0(obj);
                objE = obj;
                subscriptionItem2 = subscriptionItem3;
            }
            qg5 qg5Var = (qg5) objE;
            Integer num = (Integer) qg5Var.X;
            byte[] bArr = (byte[]) qg5Var.Y;
            if (num == null && bArr != null) {
                String str3 = new String(bArr, iq0.a);
                cp3 cp3Var = mr.a;
                g55 g55Var = ((vm3) cp3Var).b;
                AdditionalInfoCode additionalInfoCode = ((lr1) cp3Var.a(lr1.Companion.serializer(), str3)).a;
                Integer num2 = ((or1) cp3Var.a(or1.Companion.serializer(), str3)).a;
                StringBuilder sb = new StringBuilder();
                sb.append(new Date() + " subscription " + subscriptionItem2.getRemarks() + " check provider tt-state: success responseCode:" + num2 + " ");
                if (num2 == null) {
                    subscriptionExtraStatus = null;
                } else {
                    int iIntValue = num2.intValue();
                    if (200 > iIntValue || iIntValue >= 300) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        a aVar = yw2.c;
                        aVar.getClass();
                        subscriptionExtraStatus = (SubscriptionExtraStatus) aVar.c(str3, new yi8(SubscriptionExtraStatus.class));
                    } else {
                        subscriptionExtraStatus = null;
                    }
                }
                if (subscriptionExtraStatus != null) {
                    sb.append("total: " + subscriptionExtraStatus.getStatus() + " Info Code:" + (additionalInfoCode != null ? AdditionalInfoCodeKt.a(additionalInfoCode.getValue(), str2) : null));
                } else {
                    sb.append("ERROR Info Code:" + (additionalInfoCode != null ? AdditionalInfoCodeKt.a(additionalInfoCode.getValue(), str2) : null));
                }
                d(this, sb.toString(), null, 2);
                rj6Var = new CheckSubscriptionExtraResult(str2, subscriptionExtraStatus, TypeCheck.DNSTT);
            } else if (num == null) {
                d(this, new Date() + " subscription " + subscriptionItem2.getRemarks() + " check provider tt-state: failure data:null", null, 2);
                rj6Var = new CheckSubscriptionExtraResult((String) null, TypeCheck.DNSTT, 3);
            } else {
                d(this, new Date() + " subscription " + subscriptionItem2.getRemarks() + " check provider tt-state: failure error:" + num, null, 2);
                rj6Var = new CheckSubscriptionExtraResult((String) null, TypeCheck.DNSTT, 3);
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return sj6.a(rj6Var) == null ? rj6Var : new CheckSubscriptionExtraResult((String) null, TypeCheck.DNSTT, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c(String str, boolean z) {
        if (z) {
            try {
                HappApplication happApplication = HappApplication.M0;
                k32.i().d().h(new m40(str, (byte) 5));
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                return new rj6(th);
            }
        }
        ss8 ss8Var = ss8.a;
        if (ss8.t()) {
            int i = pr1.a[this.e.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                throw new b55();
            }
        }
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable e(RequestEnvelope requestEnvelope, s51 s51Var) {
        sr1 sr1Var;
        qg5 rj6Var;
        if (s51Var instanceof sr1) {
            sr1Var = (sr1) s51Var;
            int i = sr1Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                sr1Var.h0 = i - Integer.MIN_VALUE;
            } else {
                sr1Var = new sr1(this, s51Var);
            }
        } else {
            sr1Var = new sr1(this, s51Var);
        }
        Object objH = sr1Var.f0;
        int i2 = sr1Var.h0;
        try {
            if (i2 == 0) {
                w39.n0(objH);
                yg1 yg1VarJ = w51.j(this.d, (s61) null, new tr1(this, requestEnvelope, null), 3);
                sr1Var.h0 = 1;
                objH = yg1VarJ.h(sr1Var);
                c71 c71Var = c71.X;
                if (objH == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(objH);
            }
            rj6Var = (qg5) objH;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return rj6Var instanceof rj6 ? new qg5(new Integer(903), (Object) null) : rj6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable f(String str, List list, s51 s51Var) {
        ur1 ur1Var;
        Boolean rj6Var;
        RemotePushStatus remotePushStatus;
        if (s51Var instanceof ur1) {
            ur1Var = (ur1) s51Var;
            int i = ur1Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ur1Var.h0 = i - Integer.MIN_VALUE;
            } else {
                ur1Var = new ur1(this, s51Var);
            }
        } else {
            ur1Var = new ur1(this, s51Var);
        }
        Object objE = ur1Var.f0;
        int i2 = ur1Var.h0;
        try {
            if (i2 == 0) {
                w39.n0(objE);
                ss8 ss8Var = ss8.a;
                AppVersion appVersionF = ss8.f();
                yf8 yf8VarK = ss8.k(this.a);
                String value = ((HWID) yf8VarK.X).getValue();
                String value2 = ((VersionOS) yf8VarK.Y).getValue();
                String value3 = ((DeviceModel) yf8VarK.Z).getValue();
                RequestEnvelope.DeviceOS deviceOS = RequestEnvelope.DeviceOS.Android;
                int major = appVersionF.getMajor();
                int minor = appVersionF.getMinor();
                int patch = appVersionF.getPatch();
                RequestEnvelope.Route route = RequestEnvelope.Route.RemotePush;
                ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ProviderId) it.next()).getValue());
                }
                RequestEnvelope requestEnvelope = new RequestEnvelope(deviceOS, major, minor, patch, route, null, value2, value, value3, null, arrayList, null, str);
                ur1Var.h0 = 1;
                objE = e(requestEnvelope, ur1Var);
                c71 c71Var = c71.X;
                if (objE == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(objE);
            }
            qg5 qg5Var = (qg5) objE;
            Integer num = (Integer) qg5Var.X;
            byte[] bArr = (byte[]) qg5Var.Y;
            if (num != null || bArr == null) {
                rj6Var = null;
            } else {
                String str2 = new String(bArr, iq0.a);
                cp3 cp3Var = mr.a;
                g55 g55Var = ((vm3) cp3Var).b;
                Integer num2 = ((or1) cp3Var.a(or1.Companion.serializer(), str2)).a;
                if (num2 == null) {
                    remotePushStatus = null;
                } else {
                    int iIntValue = num2.intValue();
                    if (200 > iIntValue || iIntValue >= 300) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        a aVar = yw2.c;
                        aVar.getClass();
                        remotePushStatus = (RemotePushStatus) aVar.c(str2, new yi8(RemotePushStatus.class));
                    } else {
                        remotePushStatus = null;
                    }
                }
                rj6Var = Boolean.valueOf(remotePushStatus != null ? remotePushStatus.getSuccess() : false);
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            return null;
        }
        return rj6Var;
    }
}
