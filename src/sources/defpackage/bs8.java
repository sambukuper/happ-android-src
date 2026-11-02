package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bs8 {
    public static final vz7 a = new vz7(new ng8((byte) 8));
    public static final vz7 b = new vz7(new ng8((byte) 9));
    public static final vz7 c = new vz7(new ng8((byte) 10));

    public static final vr8 a(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new vr8((ZoneOffset) dateTimeFormatter.parse(str, new as8()));
        } catch (DateTimeException e) {
            throw new dc1(e);
        }
    }
}
