package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ay4 implements Comparable, Parcelable {
    public static final Parcelable.Creator<ay4> CREATOR = new l99(28);
    public final Calendar X;
    public final int Y;
    public final int Z;
    public final int f0;
    public final int g0;
    public final long h0;
    public String i0;

    public ay4(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = tr8.a(calendar);
        this.X = calendarA;
        this.Y = calendarA.get(2);
        this.Z = calendarA.get(1);
        this.f0 = calendarA.getMaximum(7);
        this.g0 = calendarA.getActualMaximum(5);
        this.h0 = calendarA.getTimeInMillis();
    }

    public static ay4 c(int i, int i2) {
        Calendar calendarC = tr8.c(null);
        calendarC.set(1, i);
        calendarC.set(2, i2);
        return new ay4(calendarC);
    }

    public static ay4 d(long j) {
        Calendar calendarC = tr8.c(null);
        calendarC.setTimeInMillis(j);
        return new ay4(calendarC);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.X.compareTo(((ay4) obj).X);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        String str = this.i0;
        if (str != null) {
            return str;
        }
        long timeInMillis = this.X.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = tr8.a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        String str2 = instanceForSkeleton.format(new Date(timeInMillis));
        this.i0 = str2;
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay4)) {
            return false;
        }
        ay4 ay4Var = (ay4) obj;
        return this.Y == ay4Var.Y && this.Z == ay4Var.Z;
    }

    public final int g(ay4 ay4Var) {
        if (this.X instanceof GregorianCalendar) {
            return (ay4Var.Y - this.Y) + ((ay4Var.Z - this.Z) * 12);
        }
        bt.q("Only Gregorian calendars are supported.");
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.Y), Integer.valueOf(this.Z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.Z);
        parcel.writeInt(this.Y);
    }
}
