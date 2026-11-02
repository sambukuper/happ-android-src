package defpackage;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ej7 extends DateFormat {
    public static final Pattern h0 = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    public static final Pattern i0;
    public static final String[] j0;
    public static final TimeZone k0;
    public static final Locale l0;
    public static final SimpleDateFormat m0;
    public static final ej7 n0;
    public static final GregorianCalendar o0;
    public transient TimeZone X;
    public final Locale Y;
    public Boolean Z;
    public transient Calendar f0;
    public transient DateFormat g0;

    static {
        try {
            i0 = Pattern.compile("(?:[+-]?\\d{4,})[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            j0 = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
            k0 = timeZone;
            Locale locale = Locale.US;
            l0 = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            m0 = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            n0 = new ej7();
            o0 = new GregorianCalendar(timeZone, locale);
        } catch (Exception e) {
            u52.q(e);
        }
    }

    public ej7(TimeZone timeZone, Locale locale, Boolean bool) {
        this.X = timeZone;
        this.Y = locale;
        this.Z = bool;
    }

    public static int b(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    public static int c(String str) {
        return (str.charAt(3) - '0') + ((str.charAt(2) - '0') * 10) + ((str.charAt(1) - '0') * 100) + ((str.charAt(0) - '0') * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
    }

    public static void f(StringBuffer stringBuffer, int i) {
        int i2 = i / 10;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 10;
        }
        stringBuffer.append((char) (i + 48));
    }

    public static void g(StringBuffer stringBuffer, int i) {
        int i2 = i / 100;
        if (i2 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i2 > 99) {
                stringBuffer.append(i2);
            } else {
                f(stringBuffer, i2);
            }
            i -= i2 * 100;
        }
        f(stringBuffer, i);
    }

    public final Calendar a(TimeZone timeZone) {
        Calendar calendar = this.f0;
        if (calendar == null) {
            calendar = (Calendar) o0.clone();
            this.f0 = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    @Override // java.text.DateFormat, java.text.Format
    public final Object clone() {
        return new ej7(this.X, this.Y, this.Z);
    }

    public final Date d(String str) throws ParseException {
        String str2;
        int length = str.length();
        Calendar calendarA = a((this.X == null || 'Z' == str.charAt(length + (-1))) ? k0 : this.X);
        calendarA.clear();
        int iCharAt = 0;
        if (length > 10) {
            Matcher matcher = i0.matcher(str);
            if (matcher.matches()) {
                int iIndexOf = str.charAt(0) == '-' ? str.indexOf(45, 1) : str.indexOf(45);
                int iC = iIndexOf <= 4 ? c(str) : Integer.parseInt(str.substring(0, iIndexOf));
                int iB = b(iIndexOf + 1, str) - 1;
                int iB2 = b(iIndexOf + 4, str);
                int iB3 = b(iIndexOf + 7, str);
                int iB4 = b(iIndexOf + 10, str);
                int i = iIndexOf + 12;
                int iB5 = (length <= i || str.charAt(i) != ':') ? 0 : b(iIndexOf + 13, str);
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i2 = iEnd - iStart;
                if (i2 > 1) {
                    int iB6 = b(iStart + 1, str) * 3600;
                    if (i2 >= 5) {
                        iB6 += b(iEnd - 2, str) * 60;
                    }
                    calendarA.set(15, str.charAt(iStart) == '-' ? iB6 * (-1000) : iB6 * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
                    calendarA.set(16, 0);
                }
                calendarA.set(iC, iB, iB2, iB3, iB4, iB5);
                int iStart2 = matcher.start(1);
                int i3 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i3 >= iEnd2) {
                    calendarA.set(14, 0);
                } else {
                    int i4 = iEnd2 - i3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            int i5 = 2;
                            if (i4 != 2) {
                                if (i4 != 3 && i4 > 9) {
                                    throw new ParseException(pc6.q("Cannot parse date \"", str, "\": invalid fractional seconds '", matcher.group(1).substring(1), "'; can use at most 9 digits"), i3);
                                }
                                iCharAt = str.charAt(iStart2 + 3) - '0';
                                i5 = 2;
                            }
                            iCharAt += (str.charAt(iStart2 + i5) - '0') * 10;
                        }
                        iCharAt += (str.charAt(i3) - '0') * 100;
                    }
                    calendarA.set(14, iCharAt);
                }
                return calendarA.getTime();
            }
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        } else {
            if (h0.matcher(str).matches()) {
                calendarA.set(c(str), b(5, str) - 1, b(8, str), 0, 0, 0);
                calendarA.set(14, 0);
                return calendarA.getTime();
            }
            str2 = "yyyy-MM-dd";
        }
        Boolean bool = this.Z;
        StringBuilder sbT = oi0.t("Cannot parse date \"", str, "\": while it seems to fit format '", str2, "', parsing fails (leniency? ");
        sbT.append(bool);
        sbT.append(")");
        throw new ParseException(sbT.toString(), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (java.lang.Character.isDigit(r7.charAt(5)) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (java.lang.Character.isDigit(r7.charAt(1)) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        return d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        throw new java.text.ParseException(defpackage.oi0.m("Cannot parse date \"", r7, "\", problem: ", r6.getMessage()), r8.getErrorIndex());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bd, code lost:
    
        if (r2 < 0) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Date e(java.lang.String r7, java.text.ParsePosition r8) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej7.e(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    @Override // java.text.DateFormat
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.X;
        if (timeZone == null) {
            timeZone = k0;
        }
        Calendar calendarA = a(timeZone);
        calendarA.setTime(date);
        int i = calendarA.get(1);
        if (calendarA.get(0) != 0) {
            if (i > 9999) {
                stringBuffer.append('+');
            }
            g(stringBuffer, i);
        } else if (i == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            g(stringBuffer, i - 1);
        }
        stringBuffer.append('-');
        f(stringBuffer, calendarA.get(2) + 1);
        stringBuffer.append('-');
        f(stringBuffer, calendarA.get(5));
        stringBuffer.append('T');
        f(stringBuffer, calendarA.get(11));
        stringBuffer.append(':');
        f(stringBuffer, calendarA.get(12));
        stringBuffer.append(':');
        f(stringBuffer, calendarA.get(13));
        stringBuffer.append('.');
        int i2 = calendarA.get(14);
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 100;
        }
        f(stringBuffer, i2);
        int offset = timeZone.getOffset(calendarA.getTimeInMillis());
        if (offset == 0) {
            stringBuffer.append("+00:00");
            return stringBuffer;
        }
        int i4 = offset / 60000;
        int iAbs = Math.abs(i4 / 60);
        int iAbs2 = Math.abs(i4 % 60);
        stringBuffer.append(offset < 0 ? '-' : '+');
        f(stringBuffer, iAbs);
        stringBuffer.append(':');
        f(stringBuffer, iAbs2);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public final TimeZone getTimeZone() {
        return this.X;
    }

    @Override // java.text.DateFormat
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.text.DateFormat
    public final boolean isLenient() {
        Boolean bool = this.Z;
        return bool == null || bool.booleanValue();
    }

    @Override // java.text.DateFormat
    public final Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateE = e(strTrim, parsePosition);
        if (dateE != null) {
            return dateE;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : j0) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(pc6.q("Cannot parse date \"", strTrim, "\": not compatible with any of standard forms (", sb.toString(), ")"), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public final void setLenient(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Boolean bool = this.Z;
        if (boolValueOf == bool || boolValueOf.equals(bool)) {
            return;
        }
        this.Z = boolValueOf;
        this.g0 = null;
    }

    @Override // java.text.DateFormat
    public final void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.X)) {
            return;
        }
        this.g0 = null;
        this.X = timeZone;
    }

    public final String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", ej7.class.getName(), this.X, this.Y, this.Z);
    }

    public ej7() {
        this.Y = l0;
    }

    @Override // java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        try {
            return e(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
