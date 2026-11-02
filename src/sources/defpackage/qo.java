package defpackage;

import android.content.Context;
import j$.util.Base64;
import java.io.File;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.CheckSubscriptionExtraResult;
import su.happ.proxyutility.dto.CheckSubscriptionRestrictedResult;
import su.happ.proxyutility.dto.HashedDomain;
import su.happ.proxyutility.dto.InstallId;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionExtraStatus;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.SubscriptionRestrictedStatus;
import su.happ.proxyutility.dto.SubscriptionUserInfo;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.TypeCheck;
import su.happ.proxyutility.util.ErrorCodeJNIWrapper;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class qo {
    public final Context a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qo(Context context) {
        this.a = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: e97 */
    public final Request.Builder a(URL url, String str, un unVar, String str2, String str3, String str4, String str5, String str6, Long l) throws e97 {
        Request.Builder builderHeader;
        Request.Builder builderHeader2;
        Request.Builder builderHeader3 = new Request.Builder().url(url).header("Connection", str6).header("X-HWID", str).header("X-Ver-OS", str2).header("X-Bundle-ID", "su.happ.proxyutility").header("X-Device-model", str3).header("X-Device-OS", ue3.y(this.a) ? "AndroidTV" : "Android").header("X-API-Version", "1.0");
        np3 np3Var = ej3.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap.put("hwid", str);
        linkedHashMap.put("iss", "su.happ.proxyutility");
        linkedHashMap.put("sub", unVar.X);
        linkedHashMap.put("iat", Long.valueOf(y08.c()));
        vk1 vk1Var = new vk1(ro.a + ro.b + "KCcg+" + ro.c + new ErrorCodeJNIWrapper().a(57));
        linkedHashMap2.put("alg", "HS256");
        if (!linkedHashMap2.containsKey("typ")) {
            linkedHashMap2.put("typ", "JWT");
        }
        ej3 ej3Var = new ej3(vk1Var, linkedHashMap2, linkedHashMap);
        Base64.Encoder encoderWithoutPadding = Base64.getUrlEncoder().withoutPadding();
        Charset charset = StandardCharsets.UTF_8;
        String strEncodeToString = encoderWithoutPadding.encodeToString(ej3Var.a.getBytes(charset));
        String strEncodeToString2 = Base64.getUrlEncoder().withoutPadding().encodeToString(ej3Var.b.getBytes(charset));
        try {
            Request.Builder builderHeader4 = builderHeader3.header("X-Credential", pc6.q(strEncodeToString, ".", strEncodeToString2, ".", Base64.getUrlEncoder().withoutPadding().encodeToString(be.g((byte[]) vk1Var.Y, strEncodeToString.getBytes(charset), strEncodeToString2.getBytes(charset))))).header("X-App-Version", "4.9.0").header("X-Sub-Expire", String.valueOf(l));
            if (str4 != null) {
                if (str4.length() <= 0) {
                    str4 = null;
                }
                if (str4 != null && (builderHeader2 = builderHeader4.header("X-Domain-Hash", str4)) != null) {
                    builderHeader4 = builderHeader2;
                }
            }
            if (str5 != null) {
                if (str5.length() <= 0) {
                    str5 = null;
                }
                if (str5 != null && (builderHeader = builderHeader4.header("X-Provider-ID", str5)) != null) {
                    builderHeader4 = builderHeader;
                }
            }
            String userInfo = url.getUserInfo();
            if (userInfo != null) {
                ss8 ss8Var = ss8.a;
                builderHeader4.header("Authorization", "Basic ".concat(ss8.b(ss8.K(userInfo))));
            }
            return builderHeader4;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new e97("The Token's Signature couldn't be generated when signing using the Algorithm: " + vk1Var, e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OkHttpClient b(int i, boolean z, boolean z2) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder builderAddInterceptor = builder.callTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).connectTimeout(j, timeUnit).retryOnConnectionFailure(z2).cache((Cache) null).addInterceptor(new ai3(this.a)).addInterceptor(new sr8(new o7(this, (byte) 6)));
        HappApplication happApplication = HappApplication.M0;
        OkHttpClient.Builder builderA = k32.i().e().a(builderAddInterceptor, 7000);
        if (z) {
            builderA.hostnameVerifier(new rn((byte) 0));
        }
        return builderA.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(tn tnVar, String str, String str2, s51 s51Var) {
        vn vnVar;
        vb vbVar;
        if (s51Var instanceof vn) {
            vnVar = (vn) s51Var;
            int i = vnVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                vnVar.h0 = i - Integer.MIN_VALUE;
            } else {
                vnVar = new vn(this, s51Var);
            }
        } else {
            vnVar = new vn(this, s51Var);
        }
        Object objX = vnVar.f0;
        int i2 = vnVar.h0;
        if (i2 == 0) {
            w39.n0(objX);
            int iOrdinal = tnVar.ordinal();
            if (iOrdinal == 0) {
                vbVar = new vb(3, this, qo.class, "checkInstallIdCheckHapp", "checkInstallIdCheckHapp-qH93ujY(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 1);
            } else if (iOrdinal == 1) {
                vbVar = new vb(3, this, qo.class, "checkInstallIdQLimited", "checkInstallIdQLimited-qH93ujY(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 2);
            } else {
                if (iOrdinal != 2) {
                    b61.c();
                    return null;
                }
                vbVar = new vb(3, this, qo.class, "checkInstallIdCheckHapp", "checkInstallIdCheckHapp-qH93ujY(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 3);
            }
            InstallId installId = new InstallId(str);
            HashedDomain hashedDomain = new HashedDomain(str2);
            vnVar.h0 = 1;
            objX = vbVar.x(installId, hashedDomain, vnVar);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objX);
        }
        return ((sj6) objX).X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, String str2, s51 s51Var) {
        zn znVar;
        if (s51Var instanceof zn) {
            znVar = (zn) s51Var;
            int i = znVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                znVar.h0 = i - Integer.MIN_VALUE;
            } else {
                znVar = new zn(this, s51Var);
            }
        } else {
            znVar = new zn(this, s51Var);
        }
        Object objS = znVar.f0;
        int i2 = znVar.h0;
        if (i2 == 0) {
            w39.n0(objS);
            j31 j31Var = new j31(new ao(str, this, str2, null), (byte) 7);
            nf1 nf1Var = tp1.a;
            xe2 xe2VarH = zc1.H(j31Var, ye1.Z);
            q5 q5Var = new q5(2, (q51) null, (byte) 2);
            znVar.h0 = 1;
            objS = gv3.s(xe2VarH, q5Var, znVar);
            c71 c71Var = c71.X;
            if (objS == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objS);
        }
        sj6 sj6Var = (sj6) objS;
        return sj6Var != null ? sj6Var.X : new rj6(new Exception("Maximum tries exceeded"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, s51 s51Var) {
        bo boVar;
        if (s51Var instanceof bo) {
            boVar = (bo) s51Var;
            int i = boVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                boVar.h0 = i - Integer.MIN_VALUE;
            } else {
                boVar = new bo(this, s51Var);
            }
        } else {
            boVar = new bo(this, s51Var);
        }
        Object objW = boVar.f0;
        int i2 = boVar.h0;
        if (i2 == 0) {
            w39.n0(objW);
            nf1 nf1Var = tp1.a;
            ye1 ye1Var = ye1.Z;
            co coVar = new co(str, this, str2, (q51) null);
            boVar.h0 = 1;
            objW = w51.W(ye1Var, coVar, boVar);
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
        }
        return ((sj6) objW).X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, String str2, tn tnVar, Long l, s51 s51Var) {
        eo eoVar;
        if (s51Var instanceof eo) {
            eoVar = (eo) s51Var;
            int i = eoVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                eoVar.h0 = i - Integer.MIN_VALUE;
            } else {
                eoVar = new eo(this, s51Var);
            }
        } else {
            eoVar = new eo(this, s51Var);
        }
        Object objW = eoVar.f0;
        int i2 = eoVar.h0;
        if (i2 == 0) {
            w39.n0(objW);
            nf1 nf1Var = tp1.a;
            ye1 ye1Var = ye1.Z;
            fo foVar = new fo(tnVar, str, this, str2, l, (q51) null);
            eoVar.h0 = 1;
            objW = w51.W(ye1Var, foVar, eoVar);
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
        }
        return ((sj6) objW).X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce A[Catch: all -> 0x00c8, PHI: r9
  0x00ce: PHI (r9v7 java.lang.String) = (r9v5 java.lang.String), (r9v8 java.lang.String) binds: [B:20:0x004f, B:55:0x00c5] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x00c8, blocks: (B:51:0x00be, B:54:0x00c3, B:63:0x00ce, B:62:0x00cd, B:19:0x003c, B:45:0x00b0, B:47:0x00b4, B:49:0x00b8, B:61:0x00cc), top: B:78:0x003c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(tn tnVar, SubscriptionItem subscriptionItem, s51 s51Var) {
        go goVar;
        String value;
        String str;
        Object obj;
        CheckSubscriptionRestrictedResult rj6Var;
        CheckSubscriptionRestrictedResult rj6Var2;
        if (s51Var instanceof go) {
            goVar = (go) s51Var;
            int i = goVar.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                goVar.k0 = i - Integer.MIN_VALUE;
            } else {
                goVar = new go(this, s51Var);
            }
        } else {
            goVar = new go(this, s51Var);
        }
        Object obj2 = goVar.i0;
        int i2 = goVar.k0;
        if (i2 == 0) {
            w39.n0(obj2);
            try {
                ss8 ss8Var = ss8.a;
                Object objQ = ss8.q(subscriptionItem);
                w39.n0(objQ);
                value = ((HashedDomain) objQ).getValue();
                String installId = subscriptionItem.getInstallId();
                if (installId != null) {
                    try {
                        goVar.f0 = tnVar;
                        goVar.g0 = subscriptionItem;
                        goVar.h0 = value;
                        goVar.k0 = 1;
                        Object objC = c(tnVar, installId, value, goVar);
                        Object obj3 = c71.X;
                        if (objC == obj3) {
                            return obj3;
                        }
                        obj = objC;
                        str = value;
                    } catch (Throwable th) {
                        th = th;
                        str = value;
                        if (th instanceof InterruptedException) {
                        }
                        throw th;
                    }
                } else {
                    rj6Var = new CheckSubscriptionRestrictedResult(value, TypeCheck.REST, 2);
                }
            } catch (Throwable th2) {
                if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                    throw th2;
                }
                rj6Var = new rj6(th2);
            }
            return sj6.a(rj6Var) == null ? rj6Var : new CheckSubscriptionRestrictedResult((String) null, TypeCheck.REST, 3);
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = goVar.h0;
        subscriptionItem = goVar.g0;
        tnVar = goVar.f0;
        try {
            w39.n0(obj2);
            obj = ((sj6) obj2).X;
        } catch (Throwable th3) {
            th = th3;
            if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var2 = new rj6(th);
        }
        Object obj4 = obj instanceof rj6 ? null : obj;
        HappApplication happApplication = HappApplication.M0;
        k32.i().d().h(new sn(subscriptionItem, tnVar, (qg5) obj4, (byte) 0));
        if (!(obj instanceof rj6)) {
            qg5 qg5Var = (qg5) obj;
            int iIntValue = ((Number) qg5Var.X).intValue();
            obj = (200 > iIntValue || iIntValue >= 300) ? null : (SubscriptionRestrictedStatus) qg5Var.Y;
        }
        if (obj instanceof rj6) {
            obj = null;
        }
        rj6Var2 = new CheckSubscriptionRestrictedResult(str, (SubscriptionRestrictedStatus) obj, TypeCheck.REST);
        value = str;
        if (rj6Var2 instanceof rj6) {
            rj6Var2 = null;
        }
        rj6Var = rj6Var2;
        if (rj6Var == null) {
            rj6Var = new CheckSubscriptionRestrictedResult(value, TypeCheck.REST, 2);
        }
        if (sj6.a(rj6Var) == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:35:0x0089 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x0029, B:47:0x00b5, B:51:0x00bc, B:53:0x00d5, B:59:0x00ee, B:60:0x00f1, B:63:0x00f6, B:20:0x003f, B:22:0x0050, B:25:0x0057, B:27:0x005d, B:29:0x0063, B:31:0x006a, B:33:0x0085, B:36:0x008c, B:38:0x0092, B:40:0x0098, B:42:0x00a4, B:35:0x0089, B:64:0x0100), top: B:77:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(SubscriptionItem subscriptionItem, String str, s51 s51Var) {
        ho hoVar;
        CheckSubscriptionExtraResult rj6Var;
        tn tnVar;
        Object objF;
        String str2;
        SubscriptionUserInfo subscriptionUserInfoZ0;
        if (s51Var instanceof ho) {
            hoVar = (ho) s51Var;
            int i = hoVar.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                hoVar.j0 = i - Integer.MIN_VALUE;
            } else {
                hoVar = new ho(this, s51Var);
            }
        } else {
            hoVar = new ho(this, s51Var);
        }
        ho hoVar2 = hoVar;
        Object obj = hoVar2.h0;
        int i2 = hoVar2.j0;
        int i3 = 3;
        String str3 = null;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                ss8 ss8Var = ss8.a;
                Object objQ = ss8.q(subscriptionItem);
                w39.n0(objQ);
                String value = ((HashedDomain) objQ).getValue();
                if (str == null) {
                    str = subscriptionItem.getProviderId();
                }
                String str4 = str;
                if (str4 != null) {
                    MetaParams metaParams = subscriptionItem.getMetaParams();
                    if (metaParams == null) {
                        tnVar = tn.Y;
                    } else {
                        Map mapF = metaParams.getFragmentBean();
                        if (!eu.q0(new Object[]{mapF != null ? new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean(mapF) : null, metaParams.getResolveAddress(), metaParams.getHost(), metaParams.getInsecure()}).isEmpty()) {
                            tnVar = tn.Z;
                        } else {
                            tnVar = tn.Y;
                        }
                    }
                    tn tnVar2 = tnVar;
                    MetaParams metaParams2 = subscriptionItem.getMetaParams();
                    Long l = (metaParams2 == null || (subscriptionUserInfoZ0 = metaParams2.getSubscriptionUserInfo()) == null) ? null : new Long(subscriptionUserInfoZ0.getExpire());
                    hoVar2.f0 = subscriptionItem;
                    hoVar2.g0 = value;
                    hoVar2.j0 = 1;
                    objF = f(str4, value, tnVar2, l, hoVar2);
                    Object obj2 = c71.X;
                    if (objF == obj2) {
                        return obj2;
                    }
                    str2 = value;
                } else {
                    rj6Var = new CheckSubscriptionExtraResult(str3, TypeCheck.REST, i3);
                }
                return sj6.a(rj6Var) == null ? rj6Var : new CheckSubscriptionExtraResult(str3, TypeCheck.REST, i3);
            }
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = hoVar2.g0;
            subscriptionItem = hoVar2.f0;
            w39.n0(obj);
            objF = ((sj6) obj).X;
            Object obj3 = objF instanceof rj6 ? null : objF;
            HappApplication happApplication = HappApplication.M0;
            k32.i().d().h(new p0(subscriptionItem, (qg5) obj3, (byte) 4));
            if (!(objF instanceof rj6)) {
                qg5 qg5Var = (qg5) objF;
                Object obj4 = qg5Var.Y;
                int iIntValue = ((Number) qg5Var.X).intValue();
                if (200 > iIntValue || iIntValue >= 300) {
                    obj4 = null;
                }
                objF = (SubscriptionExtraStatus) obj4;
            }
            if (objF instanceof rj6) {
                objF = null;
            }
            rj6Var = new CheckSubscriptionExtraResult(str2, (SubscriptionExtraStatus) objF, TypeCheck.REST);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, s51 s51Var) {
        io ioVar;
        if (s51Var instanceof io) {
            ioVar = (io) s51Var;
            int i = ioVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ioVar.h0 = i - Integer.MIN_VALUE;
            } else {
                ioVar = new io(this, s51Var);
            }
        } else {
            ioVar = new io(this, s51Var);
        }
        Object objW = ioVar.f0;
        int i2 = ioVar.h0;
        if (i2 == 0) {
            w39.n0(objW);
            nf1 nf1Var = tp1.a;
            ye1 ye1Var = ye1.Z;
            jo joVar = new jo(this, str, null);
            ioVar.h0 = 1;
            objW = w51.W(ye1Var, joVar, ioVar);
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
        }
        return ((sj6) objW).X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, ArrayList arrayList, int i, s51 s51Var) {
        ko koVar;
        if (s51Var instanceof ko) {
            koVar = (ko) s51Var;
            int i2 = koVar.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                koVar.h0 = i2 - Integer.MIN_VALUE;
            } else {
                koVar = new ko(this, s51Var);
            }
        } else {
            koVar = new ko(this, s51Var);
        }
        Object objW = koVar.f0;
        int i3 = koVar.h0;
        if (i3 == 0) {
            w39.n0(objW);
            nf1 nf1Var = tp1.a;
            ye1 ye1Var = ye1.Z;
            lo loVar = new lo(str, arrayList, this, i, null);
            koVar.h0 = 1;
            objW = w51.W(ye1Var, loVar, koVar);
            c71 c71Var = c71.X;
            if (objW == c71Var) {
                return c71Var;
            }
        } else {
            if (i3 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objW);
        }
        return ((sj6) objW).X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(File file, s51 s51Var) {
        mo moVar;
        if (s51Var instanceof mo) {
            moVar = (mo) s51Var;
            int i = moVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                moVar.h0 = i - Integer.MIN_VALUE;
            } else {
                moVar = new mo(this, s51Var);
            }
        } else {
            moVar = new mo(this, s51Var);
        }
        Object objW = moVar.f0;
        int i2 = moVar.h0;
        if (i2 == 0) {
            w39.n0(objW);
            nf1 nf1Var = tp1.a;
            ye1 ye1Var = ye1.Z;
            no noVar = new no(this, file, (q51) null);
            moVar.h0 = 1;
            objW = w51.W(ye1Var, noVar, moVar);
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
        }
        return ((sj6) objW).X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, String[] strArr, s51 s51Var) {
        oo ooVar;
        if (s51Var instanceof oo) {
            ooVar = (oo) s51Var;
            int i = ooVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ooVar.h0 = i - Integer.MIN_VALUE;
            } else {
                ooVar = new oo(this, s51Var);
            }
        } else {
            ooVar = new oo(this, s51Var);
        }
        Object objW = ooVar.f0;
        int i2 = ooVar.h0;
        if (i2 == 0) {
            w39.n0(objW);
            nf1 nf1Var = tp1.a;
            ye1 ye1Var = ye1.Z;
            po poVar = new po(this, str, strArr, null);
            ooVar.h0 = 1;
            objW = w51.W(ye1Var, poVar, ooVar);
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
        }
        return ((sj6) objW).X;
    }
}
