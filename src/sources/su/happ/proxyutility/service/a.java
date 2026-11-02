package su.happ.proxyutility.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class a extends BroadcastReceiver {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        Object next;
        Object obj = null;
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("download_key", 0)) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            d dVar = d.a;
            d.d();
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 3) {
            if (numValueOf == null || numValueOf.intValue() != 2 || (stringExtra = intent.getStringExtra("download_content")) == null) {
                return;
            }
            com.google.gson.a aVar = yw2.b;
            aVar.getClass();
            DownloadFilesManager$InternalDataDownloadFiles downloadFilesManager$InternalDataDownloadFiles = (DownloadFilesManager$InternalDataDownloadFiles) aVar.c(stringExtra, new yi8(DownloadFilesManager$InternalDataDownloadFiles.class));
            if (downloadFilesManager$InternalDataDownloadFiles != null) {
                for (Object obj2 : d.i) {
                    if (((DownloadFilesManager$InternalDataDownloadFiles) obj2).getId() == downloadFilesManager$InternalDataDownloadFiles.getId()) {
                        obj = obj2;
                        break;
                    }
                }
                DownloadFilesManager$InternalDataDownloadFiles downloadFilesManager$InternalDataDownloadFiles2 = (DownloadFilesManager$InternalDataDownloadFiles) obj;
                if (downloadFilesManager$InternalDataDownloadFiles2 != null) {
                    downloadFilesManager$InternalDataDownloadFiles2.g(downloadFilesManager$InternalDataDownloadFiles.getState());
                    List listeners = downloadFilesManager$InternalDataDownloadFiles2.getListeners();
                    if (listeners != null) {
                        Iterator it = listeners.iterator();
                        while (it.hasNext()) {
                            ((hs) it.next()).a(downloadFilesManager$InternalDataDownloadFiles.getState() == StateDownloadFile.SUCCESS);
                        }
                    }
                }
                d dVar2 = d.a;
                d.d();
                return;
            }
            return;
        }
        String stringExtra2 = intent.getStringExtra("download_content");
        if (stringExtra2 != null) {
            com.google.gson.a aVar2 = yw2.b;
            aVar2.getClass();
            DownloadFilesInfo downloadFilesInfo = (DownloadFilesInfo) aVar2.c(stringExtra2, new yi8(DownloadFilesInfo.class));
            if (downloadFilesInfo != null) {
                Iterator it2 = d.i.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((DownloadFilesManager$InternalDataDownloadFiles) next).getId() != downloadFilesInfo.d());
                DownloadFilesManager$InternalDataDownloadFiles downloadFilesManager$InternalDataDownloadFiles3 = (DownloadFilesManager$InternalDataDownloadFiles) next;
                if (downloadFilesManager$InternalDataDownloadFiles3 != null) {
                    downloadFilesManager$InternalDataDownloadFiles3.g(StateDownloadFile.PROGRESS);
                    List<hs> listeners2 = downloadFilesManager$InternalDataDownloadFiles3.getListeners();
                    if (listeners2 != null) {
                        for (hs hsVar : listeners2) {
                            hsVar.getClass();
                            ms msVar = hsVar.a;
                            m51 m51Var = msVar.c;
                            nf1 nf1Var = tp1.a;
                            jm4.Q(m51Var, ye1.Z, new q0(msVar, downloadFilesInfo, (q51) null, (byte) 5), 2);
                        }
                    }
                }
                d dVar3 = d.a;
                d.d();
            }
        }
    }
}
