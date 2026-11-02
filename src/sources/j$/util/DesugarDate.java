package j$.util;

import j$.time.Instant;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DesugarDate {
    public static Date from(Instant instant) {
        try {
            return new Date(instant.I());
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
