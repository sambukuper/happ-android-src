package androidx.media;

import android.media.AudioAttributes;
import defpackage.fv8;
import defpackage.gv8;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(fv8 fv8Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.b = -1;
        audioAttributesImplApi21.a = (AudioAttributes) fv8Var.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = fv8Var.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, fv8 fv8Var) {
        fv8Var.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        fv8Var.i(1);
        ((gv8) fv8Var).e.writeParcelable(audioAttributes, 0);
        fv8Var.j(audioAttributesImplApi21.b, 2);
    }
}
