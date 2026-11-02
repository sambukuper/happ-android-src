package defpackage;

import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract /* synthetic */ class bt1 {
    public static final /* synthetic */ int[] a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = new int[StateDownloadFile.values().length];
        try {
            iArr[StateDownloadFile.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StateDownloadFile.PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StateDownloadFile.FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StateDownloadFile.LINK_NOT_CORRECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[StateDownloadFile.SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[mr2.values().length];
        try {
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[0] = 2;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
