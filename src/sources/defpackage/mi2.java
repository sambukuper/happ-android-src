package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mi2 {
    public static final ej4 a = new ej4(2);
    public static final cg b = new cg((byte) 1);

    public static fj2 a(Context context, List list) {
        String str;
        Typeface typefaceC;
        Trace.beginSection("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ni2 ni2Var = (ni2) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceC = hj8.c((str = ni2Var.e))) == null || hj8.d(typefaceC) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), ni2Var, context.getResources());
                    if (providerInfoB == null) {
                        return new fj2();
                    }
                    arrayList.add(c(context, ni2Var, providerInfoB.authority));
                } else {
                    arrayList.add(new gj2[]{new gj2(str, ni2Var.f)});
                }
            }
            return new fj2(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, ni2 ni2Var, Resources resources) {
        cg cgVar = b;
        ej4 ej4Var = a;
        Trace.beginSection("FontProvider.getProvider");
        try {
            List listL = ni2Var.d;
            String str = ni2Var.a;
            String str2 = ni2Var.b;
            if (listL == null) {
                listL = jb5.L(resources, 0);
            }
            li2 li2Var = new li2();
            li2Var.a = str;
            li2Var.b = str2;
            li2Var.c = listL;
            ProviderInfo providerInfo = (ProviderInfo) ej4Var.a(li2Var);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, cgVar);
            for (int i = 0; i < listL.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listL.get(i));
                Collections.sort(arrayList2, cgVar);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            ej4Var.b(li2Var, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gj2[] c(Context context, ni2 ni2Var, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2;
        Trace.beginSection("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection("ContentQueryWrapper.query");
                try {
                    try {
                        String[] strArr2 = {ni2Var.c};
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            try {
                                cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                            } catch (RemoteException unused) {
                            }
                        }
                        Trace.endSection();
                        if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                            contentProviderClient2 = contentProviderClientAcquireUnstableContentProviderClient;
                        } else {
                            int columnIndex = cursorQuery.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorQuery.getColumnIndex("_id");
                            int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                            int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                            int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                            while (cursorQuery.moveToNext()) {
                                int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                                arrayList2.add(new gj2(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, ni2Var.f, i));
                                contentProviderClientAcquireUnstableContentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                            }
                            contentProviderClient2 = contentProviderClientAcquireUnstableContentProviderClient;
                            arrayList = arrayList2;
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClient2 != null) {
                            contentProviderClient2.close();
                        }
                        gj2[] gj2VarArr = (gj2[]) arrayList.toArray(new gj2[0]);
                        Trace.endSection();
                        return gj2VarArr;
                    } catch (Throwable th) {
                        th = th;
                        contentProviderClient = context;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClient != 0) {
                            contentProviderClient.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }
}
