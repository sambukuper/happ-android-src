package su.happ.proxyutility.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.tencent.mmkv.MMKV;
import defpackage.y46;
import defpackage.ys1;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;
import su.happ.proxyutility.dto.DownloadFilesData;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class d {
    public static final d a = new d();
    public static final vz7 b;
    public static final Set c;
    public static final Map d;
    public static SoftReference e;
    public static final a f;
    public static NotificationManager g;
    public static r65 h;
    public static final ArrayList i;
    public static final m51 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        dn8 rj6Var;
        vz7 vz7Var = new vz7(new w01((byte) 19));
        b = vz7Var;
        c = Collections.synchronizedSet(new LinkedHashSet());
        d = Collections.synchronizedMap(new LinkedHashMap());
        f = new a();
        ArrayList arrayList = new ArrayList();
        i = arrayList;
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        j = gv3.c(g33.K(ow7VarB, dm4.a));
        String strI = ((MMKV) vz7Var.getValue()).i("listDataDownloadFilesInStorage");
        if (strI != null) {
            arrayList.clear();
            try {
                List<DownloadFilesManager$InternalDataForSaveDownloadFiles> list = (List) yw2.b.d(strI, ((yi8) new ys1()).b);
                if (list != null) {
                    for (DownloadFilesManager$InternalDataForSaveDownloadFiles downloadFilesManager$InternalDataForSaveDownloadFiles : list) {
                        if (new File(downloadFilesManager$InternalDataForSaveDownloadFiles.getPath()).exists() && downloadFilesManager$InternalDataForSaveDownloadFiles.getState() == StateDownloadFile.SUCCESS) {
                            arrayList.add(new DownloadFilesManager$InternalDataDownloadFiles(downloadFilesManager$InternalDataForSaveDownloadFiles.getId(), downloadFilesManager$InternalDataForSaveDownloadFiles.getState(), downloadFilesManager$InternalDataForSaveDownloadFiles.getFileName(), downloadFilesManager$InternalDataForSaveDownloadFiles.getPath(), new ArrayList()));
                        }
                    }
                    rj6Var = dn8.a;
                } else {
                    rj6Var = null;
                }
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            if (sj6.a(rj6Var) != null) {
                ((MMKV) b.getValue()).remove("listDataDownloadFilesInStorage");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Context context, DownloadFilesManager$InternalDataDownloadFiles downloadFilesManager$InternalDataDownloadFiles) {
        DownloadFilesService downloadFilesService;
        DownloadFilesService downloadFilesService2;
        bm3 bm3Var = (bm3) d.get(Long.valueOf(downloadFilesManager$InternalDataDownloadFiles.getId()));
        if (bm3Var != null) {
            bm3Var.m((CancellationException) null);
        }
        ArrayList arrayList = i;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((DownloadFilesManager$InternalDataDownloadFiles) it.next()).getId() == downloadFilesManager$InternalDataDownloadFiles.getId()) {
                break;
            } else {
                i2++;
            }
        }
        arrayList.remove(i2);
        c.remove(downloadFilesManager$InternalDataDownloadFiles.getPath());
        if (arrayList.isEmpty()) {
            try {
                g(2, context, yw2.b.h(DownloadFilesManager$InternalDataDownloadFiles.a(downloadFilesManager$InternalDataDownloadFiles, new ArrayList())));
                SoftReference softReference = e;
                if (softReference != null && (downloadFilesService = (DownloadFilesService) softReference.get()) != null) {
                    downloadFilesService.stopSelf();
                    SoftReference softReference2 = e;
                    if (softReference2 == null || (downloadFilesService2 = (DownloadFilesService) softReference2.get()) == null) {
                        return;
                    }
                    downloadFilesService2.stopForeground(1);
                    h = null;
                }
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static NotificationManager b() {
        DownloadFilesService downloadFilesService;
        NotificationManager notificationManager = g;
        if (notificationManager != null) {
            return notificationManager;
        }
        SoftReference softReference = e;
        if (softReference == null || (downloadFilesService = (DownloadFilesService) softReference.get()) == null) {
            return null;
        }
        Object systemService = downloadFilesService.getSystemService("notification");
        systemService.getClass();
        NotificationManager notificationManager2 = (NotificationManager) systemService;
        g = notificationManager2;
        return notificationManager2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(DownloadFilesData downloadFilesData) {
        DownloadFilesService downloadFilesService;
        DownloadFilesService downloadFilesService2;
        Object next;
        DownloadFilesService downloadFilesService3;
        String str;
        SoftReference softReference = e;
        if (softReference == null || (downloadFilesService = (DownloadFilesService) softReference.get()) == null) {
            return;
        }
        try {
            a aVar = f;
            IntentFilter intentFilter = new IntentFilter("su.happ.proxyutility.download.service");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            ue3.I(downloadFilesService, aVar, intentFilter, 2);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        SoftReference softReference2 = e;
        if (softReference2 == null || (downloadFilesService2 = (DownloadFilesService) softReference2.get()) == null) {
            return;
        }
        ArrayList arrayList = i;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((DownloadFilesManager$InternalDataDownloadFiles) next).getId() != downloadFilesData.getId());
        if (next == null) {
            long id = downloadFilesData.getId();
            StateDownloadFile stateDownloadFile = StateDownloadFile.START;
            String url = downloadFilesData.getUrl();
            String url2 = downloadFilesData.getUrl();
            int i2 = -1;
            int length = url2.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i3 = length - 1;
                    if (url2.charAt(length) == '/') {
                        i2 = length;
                        break;
                    } else if (i3 < 0) {
                        break;
                    } else {
                        length = i3;
                    }
                }
            }
            arrayList.add(new DownloadFilesManager$InternalDataDownloadFiles(id, stateDownloadFile, url.substring(i2 + 1), downloadFilesData.getPath(), new ArrayList()));
        }
        SoftReference softReference3 = e;
        if (softReference3 != null && (downloadFilesService3 = (DownloadFilesService) softReference3.get()) != null) {
            PendingIntent activity = PendingIntent.getActivity(downloadFilesService3, 2010, new Intent(downloadFilesService3, (Class<?>) MainActivity.class), 201326592);
            if (Build.VERSION.SDK_INT >= 26) {
                dn.e();
                str = "HAPP_DOWNLOADS_CH_ID";
                NotificationChannel notificationChannel = new NotificationChannel("HAPP_DOWNLOADS_CH_ID", "Happ Background Download Update Service", 0);
                notificationChannel.setLightColor(-12303292);
                notificationChannel.setImportance(0);
                notificationChannel.setLockscreenVisibility(0);
                NotificationManager notificationManagerB = b();
                if (notificationManagerB != null) {
                    notificationManagerB.createNotificationChannel(notificationChannel);
                }
            } else {
                str = "";
            }
            r65 r65Var = new r65(downloadFilesService3, str);
            r65Var.v.icon = q36.ic_stat_name;
            r65Var.e = r65.c(downloadFilesService3.getApplicationContext().getString(y46.notification_download_files_title));
            r65Var.j = -2;
            r65Var.d(2, true);
            r65Var.k = false;
            r65Var.d(8, true);
            r65Var.g = activity;
            h = r65Var;
            downloadFilesService3.startForeground(2009, r65Var.b());
        }
        Map map = d;
        map.getClass();
        Long lValueOf = Long.valueOf(downloadFilesData.getId());
        nf1 nf1Var = tp1.a;
        map.put(lValueOf, jm4.Q(j, dm4.a, new c(downloadFilesData, downloadFilesService2, null), 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d() {
        ArrayList<DownloadFilesManager$InternalDataDownloadFiles> arrayList = i;
        boolean zIsEmpty = arrayList.isEmpty();
        vz7 vz7Var = b;
        if (zIsEmpty) {
            ((MMKV) vz7Var.getValue()).remove("listDataDownloadFilesInStorage");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (DownloadFilesManager$InternalDataDownloadFiles downloadFilesManager$InternalDataDownloadFiles : arrayList) {
            arrayList2.add(new DownloadFilesManager$InternalDataForSaveDownloadFiles(downloadFilesManager$InternalDataDownloadFiles.getId(), downloadFilesManager$InternalDataDownloadFiles.getState(), downloadFilesManager$InternalDataDownloadFiles.getFileName(), downloadFilesManager$InternalDataDownloadFiles.getPath()));
        }
        ((MMKV) vz7Var.getValue()).q("listDataDownloadFilesInStorage", yw2.b.h(arrayList2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long e(Context context, String str, String str2, long j2, hs hsVar) {
        context.getClass();
        str.getClass();
        str2.getClass();
        Set set = c;
        boolean zContains = set.contains(str2);
        ArrayList<DownloadFilesManager$InternalDataDownloadFiles> arrayList = i;
        if (zContains) {
            for (DownloadFilesManager$InternalDataDownloadFiles downloadFilesManager$InternalDataDownloadFiles : arrayList) {
                if (dh3.f(downloadFilesManager$InternalDataDownloadFiles.getPath(), str2)) {
                    downloadFilesManager$InternalDataDownloadFiles.getListeners().add(hsVar);
                    return downloadFilesManager$InternalDataDownloadFiles.getId();
                }
            }
            em7.g("Collection contains no element matching the predicate.");
            return 0L;
        }
        set.add(str2);
        try {
            ue3.I(context, f, new IntentFilter("su.happ.proxyutility.download.manager"), 2);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        StateDownloadFile stateDownloadFile = StateDownloadFile.START;
        int i2 = -1;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                if (str.charAt(length) == '/') {
                    i2 = length;
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                length = i3;
            }
        }
        arrayList.add(new DownloadFilesManager$InternalDataDownloadFiles(jCurrentTimeMillis, stateDownloadFile, str.substring(i2 + 1), str2, new ArrayList(i21.K(hsVar))));
        try {
            Intent intentPutExtra = new Intent(context.getApplicationContext(), (Class<?>) DownloadFilesService.class).putExtra("argDownloadFilesData", yw2.b.h(new DownloadFilesData(jCurrentTimeMillis, str2, str, j2)));
            intentPutExtra.getClass();
            if (Build.VERSION.SDK_INT > 25) {
                context.startForegroundService(intentPutExtra);
            } else {
                context.startService(intentPutExtra);
            }
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
        }
        return jCurrentTimeMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(HappApplication happApplication, long j2) {
        Object next;
        Iterator it = i.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((DownloadFilesManager$InternalDataDownloadFiles) next).getId() != j2);
        DownloadFilesManager$InternalDataDownloadFiles downloadFilesManager$InternalDataDownloadFiles = (DownloadFilesManager$InternalDataDownloadFiles) next;
        if (downloadFilesManager$InternalDataDownloadFiles != null) {
            a(happApplication, downloadFilesManager$InternalDataDownloadFiles);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(int i2, Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("su.happ.proxyutility.download.manager");
        intent.setPackage("su.happ.proxyutility");
        intent.putExtra("download_key", i2);
        if (str != null) {
            intent.putExtra("download_content", str);
        }
        context.sendBroadcast(intent);
    }
}
