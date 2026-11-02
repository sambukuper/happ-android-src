package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.InstallId;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EPingType;
import su.happ.proxyutility.feature.ping.PingSettingsActivity;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditSearchActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class al5 extends no2 implements gn2 {
    public final /* synthetic */ byte X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al5(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.X = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:102:0x0212  */
    /* JADX WARN: Code duplicated, block: B:179:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x0161  */
    /* JADX WARN: Code duplicated, block: B:66:0x017b  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x018c  */
    /* JADX WARN: Code duplicated, block: B:72:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0197  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01df  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fe  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x019e, please report this as an issue */
    public final Object B(Object obj) {
        int iNextIndex;
        Integer numValueOf;
        boolean zContains;
        String str;
        String strL;
        Map mapE;
        String strConcat;
        Boolean boolL;
        String str2;
        String strH;
        String strConcat2;
        String strT;
        String strConcat3;
        String hwidLink;
        String strConcat4;
        String str3;
        ArrayList arrayListQ0;
        ArrayList arrayList;
        ArrayList arrayListQ1;
        ArrayList arrayList2;
        String strY0;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                String str4 = (String) obj;
                str4.getClass();
                return Boolean.valueOf(((km5) ((nd0) this).receiver).Z.containsKey(str4));
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                EPingType ePingType = (EPingType) obj;
                ePingType.getClass();
                PingSettingsActivity pingSettingsActivity = (PingSettingsActivity) ((nd0) this).receiver;
                int i = PingSettingsActivity.U0;
                pingSettingsActivity.A().l(ePingType.ordinal(), "pref_ping_type");
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                tv5 tv5Var = (tv5) obj;
                tv5Var.getClass();
                ((vv5) ((nd0) this).receiver).f(tv5Var);
                return dn8Var;
            case 3:
                fw5 fw5Var = (fw5) obj;
                fw5Var.getClass();
                ((gw5) ((nd0) this).receiver).e(fw5Var);
                return dn8Var;
            case 4:
                List<ve6> list = (List) obj;
                list.getClass();
                ((s16) ((nd0) this).receiver).getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (((kk0) obj2) instanceof oe6) {
                        arrayList3.add(obj2);
                    }
                }
                list.removeAll(arrayList3);
                Iterator it = wv0.M0(arrayList3).iterator();
                while (it.hasNext()) {
                    list.add(0, (kk0) it.next());
                }
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (((kk0) listIterator.previous()) instanceof pe6) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                if (iNextIndex > 0) {
                    Object obj3 = list.get(iNextIndex);
                    obj3.getClass();
                    pe6 pe6Var = (pe6) obj3;
                    for (int i2 = 0; i2 < iNextIndex; i2++) {
                        qe6 qe6Var = (kk0) list.remove(0);
                        ux0 ux0Var = qe6Var instanceof qe6 ? qe6Var.b : qe6Var instanceof pe6 ? ((pe6) qe6Var).a : null;
                        if (ux0Var != null) {
                            pe6Var.a.D(new vj2(ux0Var, (byte) 27));
                        }
                        if (qe6Var instanceof ve6) {
                            ((ve6) qe6Var).a.a((ai0) null);
                        }
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i3 = 0;
                for (ve6 ve6Var : list) {
                    int i4 = i3 + 1;
                    if (ve6Var instanceof ve6) {
                        ve6 ve6Var2 = ve6Var;
                        String str5 = ve6Var2.a.a;
                        Set setC1 = wv0.c1(wv0.I0(ve6Var2.b, new vi0(str5)));
                        int size = list.size();
                        int i5 = i4;
                        while (true) {
                            if (i5 < size) {
                                qe6 qe6Var2 = (kk0) list.get(i5);
                                if (qe6Var2 instanceof qe6) {
                                    zContains = setC1.contains(new vi0(qe6Var2.a));
                                } else if (qe6Var2 instanceof ve6) {
                                    ve6 ve6Var3 = (ve6) qe6Var2;
                                    String str6 = ve6Var3.a.a;
                                    Set setC2 = wv0.c1(wv0.I0(ve6Var3.b, new vi0(str6)));
                                    if (dh3.f(str5, str6) || !setC1.equals(setC2)) {
                                        zContains = true;
                                    } else {
                                        zContains = false;
                                    }
                                } else {
                                    zContains = false;
                                }
                                if (zContains) {
                                    numValueOf = Integer.valueOf(i5);
                                } else {
                                    i5++;
                                }
                            } else {
                                numValueOf = null;
                            }
                        }
                    } else if (ve6Var instanceof qe6) {
                        int size2 = list.size();
                        int i6 = i4;
                        while (true) {
                            if (i6 < size2) {
                                qe6 qe6Var3 = (kk0) list.get(i6);
                                if ((qe6Var3 instanceof qe6) && dh3.f(qe6Var3.a, ((qe6) ve6Var).a)) {
                                    numValueOf = Integer.valueOf(i6);
                                } else {
                                    i6++;
                                }
                            } else {
                                numValueOf = null;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        qe6 qe6Var4 = (kk0) list.get(numValueOf.intValue());
                        Objects.toString(ve6Var);
                        Objects.toString(qe6Var4);
                        linkedHashSet.add(Integer.valueOf(i3));
                        if ((ve6Var instanceof qe6) && (qe6Var4 instanceof qe6)) {
                            qe6Var4.b.D(new vj2((qe6) ve6Var, (byte) 28));
                        }
                    }
                    i3 = i4;
                }
                ArrayList<ve6> arrayList4 = new ArrayList();
                Iterator it2 = wv0.R0(linkedHashSet).iterator();
                while (it2.hasNext()) {
                    arrayList4.add(list.remove(((Number) it2.next()).intValue() - arrayList4.size()));
                }
                for (ve6 ve6Var4 : arrayList4) {
                    if (ve6Var4 instanceof ve6) {
                        ve6Var4.a.a((ai0) null);
                    }
                }
                return dn8Var;
            case 5:
                return (Integer) ((bx5) ((nd0) this).receiver).a(obj);
            case 6:
                fw5 fw5Var2 = (fw5) obj;
                fw5Var2.getClass();
                ((gw5) ((nd0) this).receiver).e(fw5Var2);
                return dn8Var;
            case 7:
                uo6 uo6Var = (uo6) obj;
                uo6Var.getClass();
                ((ep6) ((nd0) this).receiver).i(uo6Var);
                return dn8Var;
            case 8:
                String str7 = (String) obj;
                str7.getClass();
                RoutingSettingsEditSearchActivity routingSettingsEditSearchActivity = (RoutingSettingsEditSearchActivity) ((nd0) this).receiver;
                int i7 = RoutingSettingsEditSearchActivity.U0;
                eq6 eq6VarA = routingSettingsEditSearchActivity.A();
                ArrayList arrayList5 = eq6VarA.g;
                ArrayList arrayList6 = eq6VarA.f;
                if (!arrayList6.contains(str7)) {
                    arrayList6.add(str7);
                    String str8 = "geosite:";
                    mr2 mr2Var = mm7.Z(str7, false, "geosite:") ? mr2.GEOSITE : mr2.GEOIP;
                    mn6 mn6Var = (mn6) eq6VarA.b.getValue();
                    String str9 = eq6VarA.e;
                    sn snVar = new sn(eq6VarA, mr2Var, str7, (byte) 23);
                    vz7 vz7Var = mn6.j;
                    mn6Var.D(str9, (String) null, snVar);
                    int iOrdinal = eq6VarA.c.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            b61.c();
                            return null;
                        }
                        str8 = "geoip:";
                    }
                    aw0.b0(arrayList5);
                    eq6VarA.k.j(eq6VarA.e(str8.length(), arrayList5));
                    List listF = eq6VarA.f();
                    if (listF != null) {
                        eq6VarA.i.B(wv0.Y0(listF));
                    }
                }
                return dn8Var;
            case 9:
                qq6 qq6Var = (qq6) obj;
                qq6Var.getClass();
                ((sq6) ((nd0) this).receiver).f(qq6Var);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                SubscriptionItem subscriptionItem = (SubscriptionItem) obj;
                subscriptionItem.getClass();
                ((fa0) ((nd0) this).receiver).getClass();
                if (subscriptionItem.getOriginUrl() != null) {
                    return subscriptionItem.getOriginUrl();
                }
                String remarks = fm7.e0(subscriptionItem.getRemarks(), '#') ? "" : subscriptionItem.getRemarks();
                if (subscriptionItem.getInstallId() == null) {
                    if (subscriptionItem.getProviderId() != null) {
                        String providerId = subscriptionItem.getProviderId();
                        ProviderId providerId2 = providerId != null ? new ProviderId(providerId) : null;
                        if (providerId2 == null) {
                            bt.q("Required value was null.");
                            return null;
                        }
                        strL = oi0.l("providerid=", providerId2.getValue());
                    } else {
                        str = null;
                    }
                    mapE = subscriptionItem.E();
                    if (mapE != null) {
                        arrayListQ1 = eu.q0(new String[]{XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.e(mapE), XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.d(mapE), XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.k(mapE)});
                        if (arrayListQ1.size() == 3) {
                            arrayList2 = arrayListQ1;
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            strY0 = wv0.y0(arrayList2, ",", (String) null, (String) null, (gn2) null, 62);
                        } else {
                            strY0 = null;
                        }
                        if (strY0 != null) {
                            strConcat = "fragment=".concat(strY0);
                        } else {
                            strConcat = null;
                        }
                    } else {
                        strConcat = null;
                    }
                    boolL = subscriptionItem.L();
                    if (boolL != null) {
                        str2 = "insecure=" + boolL.booleanValue();
                    } else {
                        str2 = null;
                    }
                    strH = subscriptionItem.H();
                    if (strH != null) {
                        strConcat2 = "host=".concat(strH);
                    } else {
                        strConcat2 = null;
                    }
                    strT = subscriptionItem.T();
                    if (strT != null) {
                        strConcat3 = "resolve-address=".concat(strT);
                    } else {
                        strConcat3 = null;
                    }
                    hwidLink = subscriptionItem.getHwidLink();
                    if (hwidLink != null) {
                        strConcat4 = "hwidlink=".concat(hwidLink);
                    } else {
                        strConcat4 = null;
                    }
                    if (subscriptionItem.getEncryptedUrl()) {
                        str3 = "hide-settings=true";
                    } else {
                        str3 = null;
                    }
                    arrayListQ0 = eu.q0(new String[]{str, strConcat, str2, strConcat2, strConcat3, strConcat4, str3});
                    if (arrayListQ0.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayListQ0;
                    }
                    String strConcat5 = arrayList != null ? "?".concat(wv0.y0(arrayList, "&", (String) null, (String) null, (gn2) null, 62)) : null;
                    return oi0.m(subscriptionItem.m(), "#", remarks, strConcat5 != null ? strConcat5 : "");
                }
                String installId = subscriptionItem.getInstallId();
                InstallId installId2 = installId != null ? new InstallId(installId) : null;
                if (installId2 == null) {
                    bt.q("Required value was null.");
                    return null;
                }
                strL = oi0.l("installid=", installId2.getValue());
                str = strL;
                mapE = subscriptionItem.E();
                if (mapE != null) {
                    arrayListQ1 = eu.q0(new String[]{XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.e(mapE), XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.d(mapE), XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.k(mapE)});
                    if (arrayListQ1.size() == 3) {
                        arrayList2 = arrayListQ1;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        strY0 = wv0.y0(arrayList2, ",", (String) null, (String) null, (gn2) null, 62);
                    } else {
                        strY0 = null;
                    }
                    if (strY0 != null) {
                        strConcat = "fragment=".concat(strY0);
                    } else {
                        strConcat = null;
                    }
                } else {
                    strConcat = null;
                }
                boolL = subscriptionItem.L();
                if (boolL != null) {
                    str2 = "insecure=" + boolL.booleanValue();
                } else {
                    str2 = null;
                }
                strH = subscriptionItem.H();
                if (strH != null) {
                    strConcat2 = "host=".concat(strH);
                } else {
                    strConcat2 = null;
                }
                strT = subscriptionItem.T();
                if (strT != null) {
                    strConcat3 = "resolve-address=".concat(strT);
                } else {
                    strConcat3 = null;
                }
                hwidLink = subscriptionItem.getHwidLink();
                if (hwidLink != null) {
                    strConcat4 = "hwidlink=".concat(hwidLink);
                } else {
                    strConcat4 = null;
                }
                if (subscriptionItem.getEncryptedUrl()) {
                    str3 = "hide-settings=true";
                } else {
                    str3 = null;
                }
                arrayListQ0 = eu.q0(new String[]{str, strConcat, str2, strConcat2, strConcat3, strConcat4, str3});
                if (arrayListQ0.isEmpty()) {
                    arrayList = arrayListQ0;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                }
                return oi0.m(subscriptionItem.m(), "#", remarks, strConcat5 != null ? strConcat5 : "");
            case 11:
                xa3 xa3Var = (xa3) obj;
                xa3Var.getClass();
                ((za3) ((nd0) this).receiver).f(xa3Var);
                return dn8Var;
            case 12:
                l67 l67Var = (l67) obj;
                l67Var.getClass();
                ((p67) ((nd0) this).receiver).f(l67Var);
                return dn8Var;
            case 13:
                return (Integer) ((bx5) ((nd0) this).receiver).a(obj);
            case 14:
                fw5 fw5Var3 = (fw5) obj;
                fw5Var3.getClass();
                ((gw5) ((nd0) this).receiver).e(fw5Var3);
                return dn8Var;
            case 15:
                tv5 tv5Var2 = (tv5) obj;
                tv5Var2.getClass();
                ((vv5) ((nd0) this).receiver).f(tv5Var2);
                return dn8Var;
            case 16:
                ap7 ap7Var = (ap7) obj;
                ap7Var.getClass();
                ((np7) ((nd0) this).receiver).g(ap7Var);
                return dn8Var;
            case 17:
                String strD = ((SubId) obj).d();
                strD.getClass();
                return ((np7) ((nd0) this).receiver).e(strD);
            case 18:
                gr7 gr7Var = (gr7) obj;
                gr7Var.getClass();
                ((kr7) ((nd0) this).receiver).f(gr7Var);
                return dn8Var;
            case 19:
                wt7 wt7Var = (wt7) obj;
                wt7Var.getClass();
                ((yt7) ((nd0) this).receiver).f(wt7Var);
                return dn8Var;
            case 20:
                lu7 lu7Var = (lu7) obj;
                lu7Var.getClass();
                ((mu7) ((nd0) this).receiver).e(lu7Var);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return ((xg1) ((nd0) this).receiver).J0((q51) obj);
            case 22:
                long j = ((z85) obj).a;
                l38 l38Var = (l38) ((nd0) this).receiver;
                l38Var.getClass();
                q38 q38Var = (q38) hi5.W(l38Var, r38.a);
                if (q38Var != null) {
                    w51.G(l38Var.M0(), (s61) null, (e71) null, new s0(l38Var, j, q38Var, new k38(l38Var, j), (q51) null), 3);
                }
                return dn8Var;
            case 23:
                ((e38) ((nd0) this).receiver).b.a((gn2) obj);
                return dn8Var;
            default:
                return (Integer) ((bx5) ((nd0) this).receiver).a(obj);
        }
    }
}
