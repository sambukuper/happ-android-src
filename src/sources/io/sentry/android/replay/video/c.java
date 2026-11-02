package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import defpackage.dn2;
import defpackage.fm7;
import defpackage.g24;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g24 implements dn2 {
    public static final c Y = new c(0);

    @Override // defpackage.dn2
    public final Object invoke() {
        boolean z = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        codecInfos.getClass();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            String name = mediaCodecInfo.getName();
            name.getClass();
            if (fm7.d0(name, "c2.exynos", false)) {
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
