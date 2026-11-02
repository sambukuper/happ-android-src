package androidx.media;

import defpackage.fv8;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(fv8 fv8Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = 0;
        audioAttributesImplBase.b = 0;
        audioAttributesImplBase.c = 0;
        audioAttributesImplBase.d = -1;
        audioAttributesImplBase.a = fv8Var.f(0, 1);
        audioAttributesImplBase.b = fv8Var.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = fv8Var.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = fv8Var.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, fv8 fv8Var) {
        fv8Var.getClass();
        fv8Var.j(audioAttributesImplBase.a, 1);
        fv8Var.j(audioAttributesImplBase.b, 2);
        fv8Var.j(audioAttributesImplBase.c, 3);
        fv8Var.j(audioAttributesImplBase.d, 4);
    }
}
