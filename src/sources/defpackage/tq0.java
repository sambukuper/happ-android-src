package defpackage;

import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.CheckSubscriptionRestrictedResult;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.SubscriptionRestrictedStatus;
import su.happ.proxyutility.dto.enums.TypeCheck;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tq0 {
    public final vz7 a = new vz7(new w60((byte) 5));
    public final vz7 b = new vz7(new w60((byte) 6));

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b4 -> B:32:0x00b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.tn r11, defpackage.rn2 r12, defpackage.s51 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.rq0
            if (r0 == 0) goto L13
            r0 = r13
            rq0 r0 = (defpackage.rq0) r0
            int r1 = r0.m0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m0 = r1
            goto L18
        L13:
            rq0 r0 = new rq0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.k0
            int r1 = r0.m0
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            rn2 r11 = r0.j0
            su.happ.proxyutility.domain.sub.SubId r12 = r0.i0
            java.util.Iterator r1 = r0.h0
            rn2 r3 = r0.g0
            tn r4 = r0.f0
            defpackage.w39.n0(r13)
            r9 = r3
            r3 = r10
            r10 = r9
            goto Lb8
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r10)
            r10 = 0
            return r10
        L3a:
            defpackage.w39.n0(r13)
            kw4 r13 = defpackage.kw4.a
            java.util.List r13 = defpackage.kw4.d()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
        L4c:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r13.next()
            r4 = r3
            qg5 r4 = (defpackage.qg5) r4
            java.lang.Object r4 = r4.Y
            su.happ.proxyutility.dto.SubscriptionItem r4 = (su.happ.proxyutility.dto.SubscriptionItem) r4
            java.lang.String r5 = r4.getInstallId()
            if (r5 == 0) goto L4c
            java.lang.Boolean r4 = r4.getImport()
            if (r4 != 0) goto L4c
            r1.add(r3)
            goto L4c
        L6d:
            java.util.Iterator r13 = r1.iterator()
            r4 = r11
            r1 = r13
            r5 = r0
        L74:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto Lc1
            java.lang.Object r11 = r1.next()
            qg5 r11 = (defpackage.qg5) r11
            java.lang.Object r13 = r11.X
            su.happ.proxyutility.domain.sub.SubId r13 = (su.happ.proxyutility.domain.sub.SubId) r13
            java.lang.String r7 = r13.getValue()
            java.lang.Object r11 = r11.Y
            r8 = r11
            su.happ.proxyutility.dto.SubscriptionItem r8 = (su.happ.proxyutility.dto.SubscriptionItem) r8
            java.lang.String r6 = r8.getInstallId()
            java.lang.String r11 = r8.getHashedDomain()
            if (r6 == 0) goto Lbe
            if (r11 == 0) goto Lbe
            su.happ.proxyutility.domain.sub.SubId r11 = new su.happ.proxyutility.domain.sub.SubId
            r11.<init>(r7)
            r5.f0 = r4
            r5.g0 = r12
            r5.h0 = r1
            r5.i0 = r11
            r5.j0 = r12
            r5.m0 = r2
            r3 = r10
            java.lang.Object r13 = r3.b(r4, r5, r6, r7, r8)
            c71 r10 = defpackage.c71.X
            if (r13 != r10) goto Lb4
            return r10
        Lb4:
            r10 = r12
            r0 = r5
            r12 = r11
            r11 = r10
        Lb8:
            r11.K(r12, r13)
            r12 = r10
            r5 = r0
            goto Lbf
        Lbe:
            r3 = r10
        Lbf:
            r10 = r3
            goto L74
        Lc1:
            dn8 r10 = defpackage.dn8.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq0.a(tn, rn2, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x0127  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:71:0x013b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(tn tnVar, s51 s51Var, String str, String str2, SubscriptionItem subscriptionItem) {
        sq0 sq0Var;
        String strA;
        String str3;
        CheckSubscriptionRestrictedResult checkSubscriptionRestrictedResult;
        String str4;
        String str5;
        String str6;
        SubscriptionItem subscriptionItem2;
        String hashedDomain;
        SubscriptionRestrictedStatus restrictedStatusResult;
        TypeCheck typeCheck;
        String providerId;
        SubscriptionItem.Status statusA;
        String strI;
        ServerConfig serverConfigB;
        String subscriptionId;
        boolean zEquals;
        if (s51Var instanceof sq0) {
            sq0Var = (sq0) s51Var;
            int i = sq0Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                sq0Var.l0 = i - Integer.MIN_VALUE;
            } else {
                sq0Var = new sq0(this, s51Var);
            }
        } else {
            sq0Var = new sq0(this, s51Var);
        }
        Object objA = sq0Var.j0;
        int i2 = sq0Var.l0;
        v83 v83Var = v83.a;
        w83 w83Var = w83.a;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objA);
            Boolean bool = subscriptionItem.getImport();
            if (dh3.f(bool, Boolean.TRUE)) {
                return w83Var;
            }
            if (dh3.f(bool, Boolean.FALSE)) {
                return v83Var;
            }
            if (bool != null) {
                b61.c();
                return null;
            }
            if (str2 == null) {
                SubId.Companion.getClass();
                strA = rl8.a();
            } else {
                strA = str2;
            }
            qo qoVar = (qo) this.a.getValue();
            sq0Var.f0 = str;
            sq0Var.g0 = str2;
            sq0Var.h0 = subscriptionItem;
            sq0Var.i0 = strA;
            sq0Var.l0 = 1;
            Object objG = qoVar.g(tnVar, subscriptionItem, sq0Var);
            if (objG != c71Var) {
                String str7 = strA;
                objA = objG;
                str3 = str7;
            }
            return c71Var;
        }
        if (i2 == 1) {
            str3 = sq0Var.i0;
            subscriptionItem = sq0Var.h0;
            str2 = sq0Var.g0;
            str = sq0Var.f0;
            w39.n0(objA);
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str6 = sq0Var.i0;
            subscriptionItem2 = sq0Var.h0;
            str5 = sq0Var.g0;
            str4 = sq0Var.f0;
            w39.n0(objA);
        }
        checkSubscriptionRestrictedResult = (CheckSubscriptionRestrictedResult) objA;
        String str8 = str4;
        str2 = str5;
        str = str8;
        subscriptionItem = subscriptionItem2;
        str3 = str6;
        hashedDomain = checkSubscriptionRestrictedResult.getHashedDomain();
        restrictedStatusResult = checkSubscriptionRestrictedResult.getRestrictedStatusResult();
        typeCheck = checkSubscriptionRestrictedResult.getTypeCheck();
        if (checkSubscriptionRestrictedResult.getIsRestricted()) {
            subscriptionItem.q0(str);
            if (restrictedStatusResult != null) {
                providerId = restrictedStatusResult.getProviderId();
            } else {
                providerId = null;
            }
            subscriptionItem.t0(providerId, hashedDomain);
            if (restrictedStatusResult != null) {
                int status = restrictedStatusResult.getStatus();
                SubscriptionItem.INSTANCE.getClass();
                statusA = SubscriptionItem.Companion.a(status);
            } else {
                statusA = null;
            }
            SubscriptionItem.u0(subscriptionItem, statusA, typeCheck, 2);
            subscriptionItem.o0(restrictedStatusResult != null ? Boolean.valueOf(restrictedStatusResult.getImport()) : null);
            kw4 kw4Var = kw4.a;
            kw4.u(subscriptionItem, str3);
            return w83Var;
        }
        if (str2 != null) {
            kw4 kw4Var2 = kw4.a;
            strI = kw4.h().i("SELECTED_SERVER");
            if (strI == null) {
                strI = null;
            }
            if (strI != null) {
                serverConfigB = kw4.b(strI);
            } else {
                serverConfigB = null;
            }
            subscriptionId = serverConfigB != null ? serverConfigB.getSubscriptionId() : null;
            if (subscriptionId == null) {
                zEquals = false;
            } else {
                zEquals = subscriptionId.equals(str2);
            }
            if (zEquals) {
                ss8 ss8Var = ss8.a;
                HappApplication happApplication = HappApplication.M0;
                ss8.I(k32.i());
            }
            kw4.r(str2);
        }
        subscriptionItem.o0(Boolean.FALSE);
        kw4 kw4Var3 = kw4.a;
        kw4.u(subscriptionItem, str3);
        return v83Var;
        if (((CheckSubscriptionRestrictedResult) objA).d() == null) {
            objA = null;
        }
        checkSubscriptionRestrictedResult = (CheckSubscriptionRestrictedResult) objA;
        if (checkSubscriptionRestrictedResult == null) {
            vr1 vr1Var = (vr1) this.b.getValue();
            sq0Var.f0 = str;
            sq0Var.g0 = str2;
            sq0Var.h0 = subscriptionItem;
            sq0Var.i0 = str3;
            sq0Var.l0 = 2;
            objA = vr1Var.a(subscriptionItem, sq0Var);
            if (objA != c71Var) {
                String str9 = str2;
                str4 = str;
                str5 = str9;
                str6 = str3;
                subscriptionItem2 = subscriptionItem;
                checkSubscriptionRestrictedResult = (CheckSubscriptionRestrictedResult) objA;
                String str10 = str4;
                str2 = str5;
                str = str10;
                subscriptionItem = subscriptionItem2;
                str3 = str6;
            }
            return c71Var;
        }
        hashedDomain = checkSubscriptionRestrictedResult.getHashedDomain();
        restrictedStatusResult = checkSubscriptionRestrictedResult.getRestrictedStatusResult();
        typeCheck = checkSubscriptionRestrictedResult.getTypeCheck();
        if (checkSubscriptionRestrictedResult.getIsRestricted()) {
            subscriptionItem.q0(str);
            if (restrictedStatusResult != null) {
                providerId = restrictedStatusResult.getProviderId();
            } else {
                providerId = null;
            }
            subscriptionItem.t0(providerId, hashedDomain);
            if (restrictedStatusResult != null) {
                int status2 = restrictedStatusResult.getStatus();
                SubscriptionItem.INSTANCE.getClass();
                statusA = SubscriptionItem.Companion.a(status2);
            } else {
                statusA = null;
            }
            SubscriptionItem.u0(subscriptionItem, statusA, typeCheck, 2);
            subscriptionItem.o0(restrictedStatusResult != null ? Boolean.valueOf(restrictedStatusResult.getImport()) : null);
            kw4 kw4Var4 = kw4.a;
            kw4.u(subscriptionItem, str3);
            return w83Var;
        }
        if (str2 != null) {
            kw4 kw4Var5 = kw4.a;
            strI = kw4.h().i("SELECTED_SERVER");
            if (strI == null) {
                strI = null;
            }
            if (strI != null) {
                serverConfigB = kw4.b(strI);
            } else {
                serverConfigB = null;
            }
            if (serverConfigB != null) {
            }
            if (subscriptionId == null) {
                zEquals = false;
            } else {
                zEquals = subscriptionId.equals(str2);
            }
            if (zEquals) {
                ss8 ss8Var2 = ss8.a;
                HappApplication happApplication2 = HappApplication.M0;
                ss8.I(k32.i());
            }
            kw4.r(str2);
        }
        subscriptionItem.o0(Boolean.FALSE);
        kw4 kw4Var6 = kw4.a;
        kw4.u(subscriptionItem, str3);
        return v83Var;
    }
}
