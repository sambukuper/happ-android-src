package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uv2 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ HappApplication h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv2(HappApplication happApplication, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = happApplication;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                ((uv2) n(q51Var, b71Var)).q(dn8Var);
                break;
            default:
                ((uv2) n(q51Var, b71Var)).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        HappApplication happApplication = this.h0;
        switch (b) {
            case 0:
                return new uv2(happApplication, q51Var, (byte) 0);
            default:
                return new uv2(happApplication, q51Var, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        String[] strArr;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        HappApplication happApplication = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                happApplication.d().f();
                return dn8Var;
            default:
                w39.n0(obj);
                sf5 sf5Var = (sf5) happApplication.v0.getValue();
                sf5Var.getClass();
                if (!sf5Var.d.getAndSet(true)) {
                    Context applicationContext = happApplication.getApplicationContext();
                    applicationContext.getClass();
                    PackageManager packageManager = applicationContext.getPackageManager();
                    packageManager.getClass();
                    sf5Var.a = packageManager;
                    HashMap map = sf5Var.b;
                    List<PackageInfo> installedPackages = packageManager.getInstalledPackages(4232);
                    installedPackages.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : installedPackages) {
                        PackageInfo packageInfo = (PackageInfo) obj2;
                        String str = packageInfo.packageName;
                        if ((str.hashCode() == -861391249 && str.equals("android")) || ((strArr = packageInfo.requestedPermissions) != null && eu.Z("android.permission.INTERNET", strArr))) {
                            arrayList.add(obj2);
                        }
                    }
                    int iG = aq4.G(xv0.Z(arrayList, 10));
                    if (iG < 16) {
                        iG = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                    for (Object obj3 : arrayList) {
                        String str2 = ((PackageInfo) obj3).packageName;
                        str2.getClass();
                        linkedHashMap.put(str2, obj3);
                    }
                    PackageManager packageManager2 = sf5Var.a;
                    if (packageManager2 == null) {
                        dh3.T("packageManager");
                        throw null;
                    }
                    List<ApplicationInfo> installedApplications = packageManager2.getInstalledApplications(128);
                    installedApplications.getClass();
                    int iG2 = aq4.G(xv0.Z(installedApplications, 10));
                    if (iG2 < 16) {
                        iG2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iG2);
                    for (Object obj4 : installedApplications) {
                        String str3 = ((ApplicationInfo) obj4).packageName;
                        str3.getClass();
                        linkedHashMap2.put(str3, obj4);
                    }
                    int iG3 = aq4.G(xv0.Z(installedApplications, 10));
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iG3 >= 16 ? iG3 : 16);
                    for (ApplicationInfo applicationInfo : installedApplications) {
                        linkedHashMap3.put(applicationInfo.packageName, Integer.valueOf(applicationInfo.uid));
                    }
                    map.clear();
                    for (ApplicationInfo applicationInfo2 : installedApplications) {
                        Integer numValueOf = Integer.valueOf(applicationInfo2.uid);
                        Object hashSet = map.get(numValueOf);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(numValueOf, hashSet);
                        }
                        ((HashSet) hashSet).add(applicationInfo2.packageName);
                    }
                    sf5Var.c.m(null);
                }
                return dn8Var;
        }
    }
}
