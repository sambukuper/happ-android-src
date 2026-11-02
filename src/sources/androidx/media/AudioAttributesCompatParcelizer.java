package androidx.media;

import defpackage.fv8;
import defpackage.hv8;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(fv8 fv8Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        hv8 hv8VarH = audioAttributesCompat.a;
        if (fv8Var.e(1)) {
            hv8VarH = fv8Var.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) hv8VarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, fv8 fv8Var) {
        fv8Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        fv8Var.i(1);
        fv8Var.k(audioAttributesImpl);
    }
}
