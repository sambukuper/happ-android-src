package defpackage;

import java.nio.MappedByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z23 {
    public static final k42 a = new k42();

    public static int a(MappedByteBuffer mappedByteBuffer, int i) {
        int iPosition = mappedByteBuffer.position();
        return mappedByteBuffer.getInt((i * 8) + iPosition + 4) + iPosition;
    }

    public static boolean b(MappedByteBuffer mappedByteBuffer, int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (mappedByteBuffer.get(i + i2) == "icudt77b".charAt(i2)) {
            }
        }
        byte b = mappedByteBuffer.get(i + 7);
        return (b == 98 || b == 108) && mappedByteBuffer.get(i + 8) == 47;
    }
}
