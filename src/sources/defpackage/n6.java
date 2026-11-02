package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n6 extends yn0 {
    public final /* synthetic */ byte j;

    public /* synthetic */ n6(byte b) {
        this.j = b;
    }

    @Override // defpackage.yn0
    public final Intent A(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.j) {
            case 0:
                ym5 ym5Var = (ym5) obj;
                ym5Var.getClass();
                if (b4.l()) {
                    Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(b4.j(ym5Var.a));
                    ym5Var.b.getClass();
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent;
                }
                if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent2.setType(b4.j(ym5Var.a));
                    if (intent2.getType() != null) {
                        return intent2;
                    }
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent2;
                }
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveInfoResolveActivity == null) {
                    bt.i("Required value was null.");
                    return null;
                }
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent3.setType(b4.j(ym5Var.a));
                ym5Var.b.getClass();
                intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                return intent3;
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 2:
                Intent intent4 = (Intent) obj;
                intent4.getClass();
                return intent4;
            default:
                uf3 uf3Var = (uf3) obj;
                Intent intent5 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent6 = uf3Var.Y;
                if (intent6 != null && (bundleExtra = intent6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent5.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent6.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        uf3Var = new uf3(uf3Var.X, null, uf3Var.Z, uf3Var.f0);
                    }
                }
                intent5.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", uf3Var);
                if (ml2.K(2)) {
                    intent5.toString();
                }
                return intent5;
        }
    }

    @Override // defpackage.yn0
    public g4 I(Context context, Object obj) {
        switch (this.j) {
            case 0:
                ((ym5) obj).getClass();
                return null;
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new g4(e02.X);
                }
                for (String str : strArr) {
                    if (w79.i(context, str) != 0) {
                        return null;
                    }
                }
                int iG = aq4.G(strArr.length);
                if (iG < 16) {
                    iG = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new g4(linkedHashMap);
            default:
                return super.I(context, obj);
        }
    }

    @Override // defpackage.yn0
    public final Object S(Intent intent, int i) {
        List arrayList;
        switch (this.j) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data = intent.getData();
                if (data != null) {
                    return data;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = d02.X;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i2 = 0; i2 < itemCount; i2++) {
                            Uri uri = clipData.getItemAt(i2).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) wv0.t0(arrayList);
            case 1:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i3 == 0));
                        }
                        return zp4.P(wv0.e1(eu.q0(stringArrayExtra), arrayList2));
                    }
                }
                return e02.X;
            case 2:
                return new i6(intent, i);
            default:
                return new i6(intent, i);
        }
    }
}
