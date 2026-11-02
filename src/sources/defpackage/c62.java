package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import io.sentry.util.c;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c62 {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final z52 H;
    public static final z52[][] I;
    public static final z52[] J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final Set M;
    public static final HashMap N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;
    public static final boolean o = Log.isLoggable("ExifInterface", 3);
    public static final int[] p;
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final boolean e;
    public final HashMap[] f;
    public final HashSet g;
    public ByteOrder h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public y52 n;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        p = new int[]{8, 8, 8};
        q = new int[]{8};
        r = new byte[]{-1, -40, -1};
        s = new byte[]{102, 116, 121, 112};
        t = new byte[]{109, 105, 102, 49};
        u = new byte[]{104, 101, 105, 99};
        v = new byte[]{97, 118, 105, 102};
        w = new byte[]{97, 118, 105, 115};
        x = new byte[]{79, 76, 89, 77, 80, 0};
        y = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        z = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        A = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        B = new byte[]{82, 73, 70, 70};
        C = new byte[]{87, 69, 66, 80};
        D = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{_UrlKt.FRAGMENT_ENCODE_SET, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        z52[] z52VarArr = {new z52("NewSubfileType", 254, 4), new z52("SubfileType", 255, 4), new z52("ImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4), new z52("ImageLength", 257, 3, 4), new z52("BitsPerSample", 258, 3), new z52("Compression", 259, 3), new z52("PhotometricInterpretation", 262, 3), new z52("ImageDescription", 270, 2), new z52("Make", 271, 2), new z52("Model", 272, 2), new z52("StripOffsets", 273, 3, 4), new z52("Orientation", 274, 3), new z52("SamplesPerPixel", 277, 3), new z52("RowsPerStrip", 278, 3, 4), new z52("StripByteCounts", 279, 3, 4), new z52("XResolution", 282, 5), new z52("YResolution", 283, 5), new z52("PlanarConfiguration", 284, 3), new z52("ResolutionUnit", 296, 3), new z52("TransferFunction", 301, 3), new z52("Software", 305, 2), new z52("DateTime", 306, 2), new z52("Artist", 315, 2), new z52("WhitePoint", 318, 5), new z52("PrimaryChromaticities", 319, 5), new z52("SubIFDPointer", 330, 4), new z52("JPEGInterchangeFormat", 513, 4), new z52("JPEGInterchangeFormatLength", 514, 4), new z52("YCbCrCoefficients", 529, 5), new z52("YCbCrSubSampling", 530, 3), new z52("YCbCrPositioning", 531, 3), new z52("ReferenceBlackWhite", 532, 5), new z52("Copyright", 33432, 2), new z52("ExifIFDPointer", 34665, 4), new z52("GPSInfoIFDPointer", 34853, 4), new z52("SensorTopBorder", 4, 4), new z52("SensorLeftBorder", 5, 4), new z52("SensorBottomBorder", 6, 4), new z52("SensorRightBorder", 7, 4), new z52("ISO", 23, 3), new z52("JpgFromRaw", 46, 7), new z52("Xmp", 700, 1)};
        z52[] z52VarArr2 = {new z52("ExposureTime", 33434, 5), new z52("FNumber", 33437, 5), new z52("ExposureProgram", 34850, 3), new z52("SpectralSensitivity", 34852, 2), new z52("PhotographicSensitivity", 34855, 3), new z52("OECF", 34856, 7), new z52("SensitivityType", 34864, 3), new z52("StandardOutputSensitivity", 34865, 4), new z52("RecommendedExposureIndex", 34866, 4), new z52("ISOSpeed", 34867, 4), new z52("ISOSpeedLatitudeyyy", 34868, 4), new z52("ISOSpeedLatitudezzz", 34869, 4), new z52("ExifVersion", 36864, 2), new z52("DateTimeOriginal", 36867, 2), new z52("DateTimeDigitized", 36868, 2), new z52("OffsetTime", 36880, 2), new z52("OffsetTimeOriginal", 36881, 2), new z52("OffsetTimeDigitized", 36882, 2), new z52("ComponentsConfiguration", 37121, 7), new z52("CompressedBitsPerPixel", 37122, 5), new z52("ShutterSpeedValue", 37377, 10), new z52("ApertureValue", 37378, 5), new z52("BrightnessValue", 37379, 10), new z52("ExposureBiasValue", 37380, 10), new z52("MaxApertureValue", 37381, 5), new z52("SubjectDistance", 37382, 5), new z52("MeteringMode", 37383, 3), new z52("LightSource", 37384, 3), new z52("Flash", 37385, 3), new z52("FocalLength", 37386, 5), new z52("SubjectArea", 37396, 3), new z52("MakerNote", 37500, 7), new z52("UserComment", 37510, 7), new z52("SubSecTime", 37520, 2), new z52("SubSecTimeOriginal", 37521, 2), new z52("SubSecTimeDigitized", 37522, 2), new z52("FlashpixVersion", 40960, 7), new z52("ColorSpace", 40961, 3), new z52("PixelXDimension", 40962, 3, 4), new z52("PixelYDimension", 40963, 3, 4), new z52("RelatedSoundFile", 40964, 2), new z52("InteroperabilityIFDPointer", 40965, 4), new z52("FlashEnergy", 41483, 5), new z52("SpatialFrequencyResponse", 41484, 7), new z52("FocalPlaneXResolution", 41486, 5), new z52("FocalPlaneYResolution", 41487, 5), new z52("FocalPlaneResolutionUnit", 41488, 3), new z52("SubjectLocation", 41492, 3), new z52("ExposureIndex", 41493, 5), new z52("SensingMethod", 41495, 3), new z52("FileSource", 41728, 7), new z52("SceneType", 41729, 7), new z52("CFAPattern", 41730, 7), new z52("CustomRendered", 41985, 3), new z52("ExposureMode", 41986, 3), new z52("WhiteBalance", 41987, 3), new z52("DigitalZoomRatio", 41988, 5), new z52("FocalLengthIn35mmFilm", 41989, 3), new z52("SceneCaptureType", 41990, 3), new z52("GainControl", 41991, 3), new z52("Contrast", 41992, 3), new z52("Saturation", 41993, 3), new z52("Sharpness", 41994, 3), new z52("DeviceSettingDescription", 41995, 7), new z52("SubjectDistanceRange", 41996, 3), new z52("ImageUniqueID", 42016, 2), new z52("CameraOwnerName", 42032, 2), new z52("BodySerialNumber", 42033, 2), new z52("LensSpecification", 42034, 5), new z52("LensMake", 42035, 2), new z52("LensModel", 42036, 2), new z52("Gamma", 42240, 5), new z52("DNGVersion", 50706, 1), new z52("DefaultCropSize", 50720, 3, 4)};
        z52[] z52VarArr3 = {new z52("GPSVersionID", 0, 1), new z52("GPSLatitudeRef", 1, 2), new z52("GPSLatitude", 2, 5, 10), new z52("GPSLongitudeRef", 3, 2), new z52("GPSLongitude", 4, 5, 10), new z52("GPSAltitudeRef", 5, 1), new z52("GPSAltitude", 6, 5), new z52("GPSTimeStamp", 7, 5), new z52("GPSSatellites", 8, 2), new z52("GPSStatus", 9, 2), new z52("GPSMeasureMode", 10, 2), new z52("GPSDOP", 11, 5), new z52("GPSSpeedRef", 12, 2), new z52("GPSSpeed", 13, 5), new z52("GPSTrackRef", 14, 2), new z52("GPSTrack", 15, 5), new z52("GPSImgDirectionRef", 16, 2), new z52("GPSImgDirection", 17, 5), new z52("GPSMapDatum", 18, 2), new z52("GPSDestLatitudeRef", 19, 2), new z52("GPSDestLatitude", 20, 5), new z52("GPSDestLongitudeRef", 21, 2), new z52("GPSDestLongitude", 22, 5), new z52("GPSDestBearingRef", 23, 2), new z52("GPSDestBearing", 24, 5), new z52("GPSDestDistanceRef", 25, 2), new z52("GPSDestDistance", 26, 5), new z52("GPSProcessingMethod", 27, 7), new z52("GPSAreaInformation", 28, 7), new z52("GPSDateStamp", 29, 2), new z52("GPSDifferential", 30, 3), new z52("GPSHPositioningError", 31, 5)};
        z52[] z52VarArr4 = {new z52("InteroperabilityIndex", 1, 2)};
        z52[] z52VarArr5 = {new z52("NewSubfileType", 254, 4), new z52("SubfileType", 255, 4), new z52("ThumbnailImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4), new z52("ThumbnailImageLength", 257, 3, 4), new z52("BitsPerSample", 258, 3), new z52("Compression", 259, 3), new z52("PhotometricInterpretation", 262, 3), new z52("ImageDescription", 270, 2), new z52("Make", 271, 2), new z52("Model", 272, 2), new z52("StripOffsets", 273, 3, 4), new z52("ThumbnailOrientation", 274, 3), new z52("SamplesPerPixel", 277, 3), new z52("RowsPerStrip", 278, 3, 4), new z52("StripByteCounts", 279, 3, 4), new z52("XResolution", 282, 5), new z52("YResolution", 283, 5), new z52("PlanarConfiguration", 284, 3), new z52("ResolutionUnit", 296, 3), new z52("TransferFunction", 301, 3), new z52("Software", 305, 2), new z52("DateTime", 306, 2), new z52("Artist", 315, 2), new z52("WhitePoint", 318, 5), new z52("PrimaryChromaticities", 319, 5), new z52("SubIFDPointer", 330, 4), new z52("JPEGInterchangeFormat", 513, 4), new z52("JPEGInterchangeFormatLength", 514, 4), new z52("YCbCrCoefficients", 529, 5), new z52("YCbCrSubSampling", 530, 3), new z52("YCbCrPositioning", 531, 3), new z52("ReferenceBlackWhite", 532, 5), new z52("Copyright", 33432, 2), new z52("ExifIFDPointer", 34665, 4), new z52("GPSInfoIFDPointer", 34853, 4), new z52("DNGVersion", 50706, 1), new z52("DefaultCropSize", 50720, 3, 4)};
        H = new z52("StripOffsets", 273, 3);
        I = new z52[][]{z52VarArr, z52VarArr2, z52VarArr3, z52VarArr4, z52VarArr5, z52VarArr, new z52[]{new z52("ThumbnailImage", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 7), new z52("CameraSettingsIFDPointer", 8224, 4), new z52("ImageProcessingIFDPointer", 8256, 4)}, new z52[]{new z52("PreviewImageStart", 257, 4), new z52("PreviewImageLength", 258, 4)}, new z52[]{new z52("AspectFrame", 4371, 3)}, new z52[]{new z52("ColorSpace", 55, 3)}};
        J = new z52[]{new z52("SubIFDPointer", 330, 4), new z52("ExifIFDPointer", 34665, 4), new z52("GPSInfoIFDPointer", 34853, 4), new z52("InteroperabilityIFDPointer", 40965, 4), new z52("CameraSettingsIFDPointer", 8224, 1), new z52("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        N = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        O = charsetForName;
        P = "Exif\u0000\u0000".getBytes(charsetForName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            z52[][] z52VarArr6 = I;
            if (i >= z52VarArr6.length) {
                HashMap map = N;
                z52[] z52VarArr7 = J;
                map.put(Integer.valueOf(z52VarArr7[0].a), 5);
                map.put(Integer.valueOf(z52VarArr7[1].a), 1);
                map.put(Integer.valueOf(z52VarArr7[2].a), 2);
                map.put(Integer.valueOf(z52VarArr7[3].a), 3);
                map.put(Integer.valueOf(z52VarArr7[4].a), 7);
                map.put(Integer.valueOf(z52VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            K[i] = new HashMap();
            L[i] = new HashMap();
            for (z52 z52Var : z52VarArr6[i]) {
                K[i].put(Integer.valueOf(z52Var.a), z52Var);
                L[i].put(z52Var.b, z52Var);
            }
            i++;
        }
    }

    public c62(InputStream inputStream) throws Throwable {
        z52[][] z52VarArr = I;
        this.f = new HashMap[z52VarArr.length];
        this.g = new HashSet(z52VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        this.a = null;
        this.e = false;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.c = null;
                this.b = fileInputStream.getFD();
            } catch (Exception unused) {
                this.c = null;
                this.b = null;
            }
        } else {
            this.c = null;
            this.b = null;
        }
        boolean z2 = this.e;
        boolean z3 = o;
        for (int i = 0; i < z52VarArr.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException unused2) {
                    a();
                    if (!z3) {
                        return;
                    }
                }
            } catch (Throwable th) {
                a();
                if (z3) {
                    r();
                }
                throw th;
            }
        }
        if (!z2) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.d;
        if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            x52 x52Var = new x52(inputStream);
            int i3 = this.d;
            if (i3 == 4) {
                f(x52Var, 0, 0);
            } else if (i3 == 13) {
                i(x52Var);
            } else if (i3 == 9) {
                j(x52Var);
            } else if (i3 == 14) {
                n(x52Var);
            }
        } else {
            b62 b62Var = new b62(inputStream);
            if (z2) {
                if (!m(b62Var)) {
                    a();
                    if (!z3) {
                        return;
                    }
                }
                r();
            }
            int i4 = this.d;
            if (i4 == 12 || i4 == 15) {
                e(b62Var, i4);
            } else if (i4 == 7) {
                h(b62Var);
            } else if (i4 == 10) {
                l(b62Var);
            } else {
                k(b62Var);
            }
            b62Var.k(this.j);
            w(b62Var);
        }
        a();
        if (!z3) {
            return;
        }
        r();
    }

    public static ByteOrder s(x52 x52Var) throws IOException {
        short s2 = x52Var.readShort();
        if (s2 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        c.b(Integer.toHexString(s2), "Invalid byte order: ");
        return null;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f;
        if (strB != null && b("DateTime") == null) {
            mapArr[0].put("DateTime", y52.a(strB));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", y52.b(0L, this.h));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", y52.b(0L, this.h));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", y52.b(0L, this.h));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", y52.b(0L, this.h));
        }
    }

    public final String b(String str) {
        if (str == null) {
            b61.i("tag shouldn't be null");
            return null;
        }
        y52 y52VarD = d(str);
        if (y52VarD != null) {
            if (str.equals("GPSTimeStamp")) {
                int i = y52VarD.a;
                if (i == 5 || i == 10) {
                    a62[] a62VarArr = (a62[]) y52VarD.h(this.h);
                    if (a62VarArr == null || a62VarArr.length != 3) {
                        Arrays.toString(a62VarArr);
                        return null;
                    }
                    a62 a62Var = a62VarArr[0];
                    Integer numValueOf = Integer.valueOf((int) (a62Var.a / a62Var.b));
                    a62 a62Var2 = a62VarArr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (a62Var2.a / a62Var2.b));
                    a62 a62Var3 = a62VarArr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (a62Var3.a / a62Var3.b)));
                }
            } else {
                boolean zContains = M.contains(str);
                ByteOrder byteOrder = this.h;
                if (!zContains) {
                    return y52VarD.g(byteOrder);
                }
                try {
                    return Double.toString(y52VarD.e(byteOrder));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public final int c(int i, String str) {
        y52 y52VarD = d(str);
        if (y52VarD != null) {
            try {
                return y52VarD.f(this.h);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final y52 d(String str) {
        y52 y52Var;
        int i;
        y52 y52Var2;
        if (str == null) {
            b61.i("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (y52Var2 = this.n) != null)) {
            return y52Var2;
        }
        for (int i2 = 0; i2 < I.length; i2++) {
            y52 y52Var3 = (y52) this.f[i2].get(str);
            if (y52Var3 != null) {
                return y52Var3;
            }
        }
        if (!"Xmp".equals(str) || (y52Var = this.n) == null) {
            return null;
        }
        return y52Var;
    }

    public final void e(b62 b62Var, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            u52.k("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i3 < 31) {
            u52.k("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new w52(b62Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", y52.d(Integer.parseInt(strExtractMetadata), this.h));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", y52.d(Integer.parseInt(strExtractMetadata3), this.h));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = i4 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", y52.d(i2, this.h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    b62Var.k(i5);
                    byte[] bArr = new byte[6];
                    b62Var.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    b62Var.readFully(bArr2);
                    this.j = i7;
                    t(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    b62Var.k(j);
                    byte[] bArr3 = new byte[i10];
                    b62Var.readFully(bArr3);
                    this.n = new y52(j, bArr3, 1, i10);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException unused2) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006e A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108 A[LOOP:0: B:10:0x0023->B:56:0x0108, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x010e A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0060. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0063. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0066. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void f(defpackage.x52 r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c62.f(x52, int, int):void");
    }

    public final int g(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        x52 x52Var;
        int i2;
        x52 x52Var2;
        int i3;
        int i4;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr2 = r;
            if (i5 >= bArr2.length) {
                return 4;
            }
            if (bArr[i5] != bArr2[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr[i6] != bytes[i6]) {
                        x52 x52Var3 = null;
                        try {
                            x52Var = new x52(bArr);
                            try {
                                try {
                                    long j2 = x52Var.readInt();
                                    byte[] bArr3 = new byte[4];
                                    x52Var.readFully(bArr3);
                                    if (Arrays.equals(bArr3, s)) {
                                        if (j2 == 1) {
                                            j2 = x52Var.readLong();
                                            j = 16;
                                            if (j2 < 16) {
                                            }
                                            x52Var.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            j = 8;
                                        }
                                        if (j2 > StateDownloadFileV2.Success.OUTDATED_DURATION_MS) {
                                            j2 = 5000;
                                        }
                                        long j3 = j2 - j;
                                        if (j3 < 8) {
                                            x52Var.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            byte[] bArr4 = new byte[4];
                                            long j4 = 0;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            boolean z4 = false;
                                            while (true) {
                                                if (j4 < j3 / 4) {
                                                    try {
                                                        x52Var.readFully(bArr4);
                                                        if (j4 != 1) {
                                                            i = 0;
                                                            try {
                                                                if (Arrays.equals(bArr4, t)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr4, u)) {
                                                                    z3 = true;
                                                                } else if (Arrays.equals(bArr4, v) || Arrays.equals(bArr4, w)) {
                                                                    z4 = true;
                                                                }
                                                                if (!z2) {
                                                                    continue;
                                                                } else if (z3) {
                                                                    x52Var.close();
                                                                    i2 = 12;
                                                                } else if (z4) {
                                                                    x52Var.close();
                                                                    i2 = 15;
                                                                }
                                                            } catch (Exception unused) {
                                                                if (x52Var != null) {
                                                                    x52Var.close();
                                                                }
                                                                i2 = i;
                                                            }
                                                        }
                                                        j4++;
                                                    } catch (EOFException unused2) {
                                                        i = 0;
                                                        x52Var.close();
                                                        i2 = i;
                                                    }
                                                } else {
                                                    i = 0;
                                                }
                                                x52Var.close();
                                                i2 = i;
                                            }
                                        }
                                    } else {
                                        x52Var.close();
                                        i = 0;
                                        i2 = 0;
                                    }
                                } catch (Exception unused3) {
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                x52Var3 = x52Var;
                                if (x52Var3 != null) {
                                    x52Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused4) {
                            i = 0;
                            x52Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        try {
                            x52Var2 = new x52(bArr);
                            try {
                                ByteOrder byteOrderS = s(x52Var2);
                                this.h = byteOrderS;
                                x52Var2.Z = byteOrderS;
                                short s2 = x52Var2.readShort();
                                i3 = (s2 == 20306 || s2 == 21330) ? 1 : i;
                                x52Var2.close();
                            } catch (Exception unused5) {
                                if (x52Var2 != null) {
                                    x52Var2.close();
                                }
                                i3 = i;
                            } catch (Throwable th3) {
                                th = th3;
                                x52Var3 = x52Var2;
                                if (x52Var3 != null) {
                                    x52Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused6) {
                            x52Var2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        if (i3 != 0) {
                            return 7;
                        }
                        try {
                            x52 x52Var4 = new x52(bArr);
                            try {
                                ByteOrder byteOrderS2 = s(x52Var4);
                                this.h = byteOrderS2;
                                x52Var4.Z = byteOrderS2;
                                i4 = x52Var4.readShort() != 85 ? i : 1;
                                x52Var4.close();
                            } catch (Exception unused7) {
                                x52Var3 = x52Var4;
                                if (x52Var3 != null) {
                                    x52Var3.close();
                                }
                                i4 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                x52Var3 = x52Var4;
                                if (x52Var3 != null) {
                                    x52Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused8) {
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i4 != 0) {
                            return 10;
                        }
                        int i7 = i;
                        while (true) {
                            byte[] bArr5 = z;
                            if (i7 >= bArr5.length) {
                                return 13;
                            }
                            if (bArr[i7] != bArr5[i7]) {
                                int i8 = i;
                                while (true) {
                                    byte[] bArr6 = B;
                                    if (i8 >= bArr6.length) {
                                        int i9 = i;
                                        while (true) {
                                            byte[] bArr7 = C;
                                            if (i9 >= bArr7.length) {
                                                return 14;
                                            }
                                            if (bArr[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                break;
                                            }
                                            i9++;
                                        }
                                    } else {
                                        if (bArr[i8] != bArr6[i8]) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                return i;
                            }
                            i7++;
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    public final void h(b62 b62Var) throws Throwable {
        int i;
        int i2;
        k(b62Var);
        HashMap[] mapArr = this.f;
        y52 y52Var = (y52) mapArr[1].get("MakerNote");
        if (y52Var != null) {
            b62 b62Var2 = new b62(y52Var.d);
            b62Var2.Z = this.h;
            byte[] bArr = x;
            byte[] bArr2 = new byte[bArr.length];
            b62Var2.readFully(bArr2);
            b62Var2.k(0L);
            byte[] bArr3 = y;
            byte[] bArr4 = new byte[bArr3.length];
            b62Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                b62Var2.k(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                b62Var2.k(12L);
            }
            u(b62Var2, 6);
            y52 y52Var2 = (y52) mapArr[7].get("PreviewImageStart");
            y52 y52Var3 = (y52) mapArr[7].get("PreviewImageLength");
            if (y52Var2 != null && y52Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", y52Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", y52Var3);
            }
            y52 y52Var4 = (y52) mapArr[8].get("AspectFrame");
            if (y52Var4 != null) {
                int[] iArr = (int[]) y52Var4.h(this.h);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                y52 y52VarD = y52.d(i5, this.h);
                y52 y52VarD2 = y52.d(i6, this.h);
                mapArr[0].put("ImageWidth", y52VarD);
                mapArr[0].put("ImageLength", y52VarD2);
            }
        }
    }

    public final void i(x52 x52Var) throws Throwable {
        if (o) {
            Objects.toString(x52Var);
        }
        x52Var.Z = ByteOrder.BIG_ENDIAN;
        int i = x52Var.Y;
        x52Var.g(z.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int i2 = x52Var.readInt();
                int i3 = x52Var.readInt();
                int i4 = x52Var.Y;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z2) {
                    this.j = i6;
                    byte[] bArr = new byte[i2];
                    x52Var.readFully(bArr);
                    int i7 = x52Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    t(0, bArr);
                    z();
                    w(new x52(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = A;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        x52Var.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = x52Var.Y - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            x52Var.readFully(bArr4);
                            this.n = new y52(i8, bArr4, 1, i9);
                            z3 = true;
                        }
                    }
                }
                x52Var.g(i5 - x52Var.Y);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void j(x52 x52Var) throws Throwable {
        if (o) {
            Objects.toString(x52Var);
        }
        x52Var.g(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        x52Var.readFully(bArr);
        x52Var.readFully(bArr2);
        x52Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        x52Var.g(i - x52Var.Y);
        x52Var.readFully(bArr4);
        f(new x52(bArr4), i, 5);
        x52Var.g(i3 - x52Var.Y);
        x52Var.Z = ByteOrder.BIG_ENDIAN;
        int i4 = x52Var.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = x52Var.readUnsignedShort();
            int unsignedShort2 = x52Var.readUnsignedShort();
            if (unsignedShort == H.a) {
                short s2 = x52Var.readShort();
                short s3 = x52Var.readShort();
                y52 y52VarD = y52.d(s2, this.h);
                y52 y52VarD2 = y52.d(s3, this.h);
                HashMap[] mapArr = this.f;
                mapArr[0].put("ImageLength", y52VarD);
                mapArr[0].put("ImageWidth", y52VarD2);
                return;
            }
            x52Var.g(unsignedShort2);
        }
    }

    public final void k(b62 b62Var) throws Throwable {
        q(b62Var);
        u(b62Var, 0);
        y(b62Var, 0);
        y(b62Var, 5);
        y(b62Var, 4);
        z();
        if (this.d == 8) {
            HashMap[] mapArr = this.f;
            y52 y52Var = (y52) mapArr[1].get("MakerNote");
            if (y52Var != null) {
                b62 b62Var2 = new b62(y52Var.d);
                b62Var2.Z = this.h;
                b62Var2.g(6);
                u(b62Var2, 9);
                y52 y52Var2 = (y52) mapArr[9].get("ColorSpace");
                if (y52Var2 != null) {
                    mapArr[1].put("ColorSpace", y52Var2);
                }
            }
        }
    }

    public final void l(b62 b62Var) throws Throwable {
        if (o) {
            Objects.toString(b62Var);
        }
        k(b62Var);
        HashMap[] mapArr = this.f;
        y52 y52Var = (y52) mapArr[0].get("JpgFromRaw");
        if (y52Var != null) {
            f(new x52(y52Var.d), (int) y52Var.c, 5);
        }
        y52 y52Var2 = (y52) mapArr[0].get("ISO");
        y52 y52Var3 = (y52) mapArr[1].get("PhotographicSensitivity");
        if (y52Var2 == null || y52Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", y52Var2);
    }

    public final boolean m(b62 b62Var) throws IOException {
        byte[] bArr = P;
        byte[] bArr2 = new byte[bArr.length];
        b62Var.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = b62Var.X.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.j = bArr.length;
                t(0, bArrCopyOf2);
                return true;
            }
            i += i2;
            b62Var.Y += i2;
        }
    }

    public final void n(x52 x52Var) throws Throwable {
        if (o) {
            Objects.toString(x52Var);
        }
        x52Var.Z = ByteOrder.LITTLE_ENDIAN;
        x52Var.g(B.length);
        int i = x52Var.readInt() + 8;
        byte[] bArr = C;
        x52Var.g(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                x52Var.readFully(bArr2);
                int i2 = x52Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    x52Var.readFully(bArrCopyOfRange);
                    byte[] bArr3 = P;
                    if (os4.P(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.j = i3;
                    t(0, bArrCopyOfRange);
                    w(new x52(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                x52Var.g(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void o(x52 x52Var, HashMap map) throws Throwable {
        y52 y52Var = (y52) map.get("JPEGInterchangeFormat");
        y52 y52Var2 = (y52) map.get("JPEGInterchangeFormatLength");
        if (y52Var == null || y52Var2 == null) {
            return;
        }
        int iF = y52Var.f(this.h);
        int iF2 = y52Var2.f(this.h);
        if (this.d == 7) {
            iF += this.k;
        }
        if (iF > 0 && iF2 > 0 && this.a == null && this.c == null && this.b == null) {
            x52Var.g(iF);
            x52Var.readFully(new byte[iF2]);
        }
    }

    public final boolean p(HashMap map) {
        y52 y52Var = (y52) map.get("ImageLength");
        y52 y52Var2 = (y52) map.get("ImageWidth");
        if (y52Var == null || y52Var2 == null) {
            return false;
        }
        return y52Var.f(this.h) <= 512 && y52Var2.f(this.h) <= 512;
    }

    public final void q(b62 b62Var) throws IOException {
        ByteOrder byteOrderS = s(b62Var);
        this.h = byteOrderS;
        b62Var.Z = byteOrderS;
        int unsignedShort = b62Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            c.b(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = b62Var.readInt();
        if (i2 < 8) {
            u52.s(pc6.j(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            b62Var.g(i3);
        }
    }

    public final void r() throws Throwable {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                y52 y52Var = (y52) entry.getValue();
                y52Var.toString();
                y52Var.g(this.h);
            }
            i++;
        }
    }

    public final void t(int i, byte[] bArr) throws IOException {
        b62 b62Var = new b62(bArr);
        q(b62Var);
        u(b62Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    public final void u(b62 b62Var, int i) throws IOException {
        boolean z2;
        HashMap[] mapArr;
        HashMap[] mapArr2;
        z52 z52Var;
        long j;
        int i2;
        boolean z3;
        HashMap[] mapArr3;
        z52 z52Var2;
        int unsignedShort;
        long j2;
        int i3;
        Integer numValueOf = Integer.valueOf(b62Var.Y);
        HashSet hashSet = this.g;
        hashSet.add(numValueOf);
        short s2 = b62Var.readShort();
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            z2 = o;
            mapArr = this.f;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = b62Var.readUnsignedShort();
            int unsignedShort3 = b62Var.readUnsignedShort();
            int i4 = b62Var.readInt();
            short s4 = s3;
            long j3 = ((long) b62Var.Y) + 4;
            z52 z52Var3 = (z52) K[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), z52Var3 != null ? z52Var3.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i4));
            }
            if (z52Var3 != null && unsignedShort3 > 0) {
                int[] iArr = F;
                if (unsignedShort3 < iArr.length) {
                    byte b = z52Var3.c;
                    if (b == 7 || unsignedShort3 == 7 || b == unsignedShort3 || (i2 = z52Var3.d) == unsignedShort3 || (((b == 4 || i2 == 4) && unsignedShort3 == 3) || (((b == 9 || i2 == 9) && unsignedShort3 == 8) || ((b == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = b;
                        }
                        mapArr2 = mapArr;
                        z52Var = z52Var3;
                        j = ((long) i4) * ((long) iArr[unsignedShort3]);
                        z3 = j >= 0 && j <= 2147483647L;
                    } else {
                        if (z2 != 0) {
                            String str = E[unsignedShort3];
                        }
                        z52Var = z52Var3;
                        mapArr2 = mapArr;
                        j = 0;
                    }
                } else {
                    z52Var = z52Var3;
                    mapArr2 = mapArr;
                    j = 0;
                }
            } else {
                z52Var = z52Var3;
                mapArr2 = mapArr;
                j = 0;
            }
            if (z3) {
                if (j > 4) {
                    int i5 = b62Var.readInt();
                    if (this.d == 7) {
                        mapArr3 = mapArr2;
                        z52Var2 = z52Var;
                        if ("MakerNote".equals(z52Var2.b)) {
                            this.k = i5;
                        } else {
                            if (i == 6 && "ThumbnailImage".equals(z52Var2.b)) {
                                this.l = i5;
                                this.m = i4;
                                y52 y52VarD = y52.d(6, this.h);
                                unsignedShort2 = unsignedShort2;
                                y52 y52VarB = y52.b(this.l, this.h);
                                y52 y52VarB2 = y52.b(this.m, this.h);
                                mapArr3[4].put("Compression", y52VarD);
                                mapArr3[4].put("JPEGInterchangeFormat", y52VarB);
                                mapArr3[4].put("JPEGInterchangeFormatLength", y52VarB2);
                            }
                            b62Var.k(i5);
                        }
                    } else {
                        mapArr3 = mapArr2;
                        z52Var2 = z52Var;
                    }
                    b62Var.k(i5);
                } else {
                    mapArr3 = mapArr2;
                    unsignedShort2 = unsignedShort2;
                    z52Var2 = z52Var;
                    i4 = i4;
                }
                Integer num = (Integer) N.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j2 = ((long) b62Var.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = b62Var.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = b62Var.readInt();
                        } else {
                            j2 = -1;
                        }
                        if (z2) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j2), z52Var2.b);
                        }
                        if (j2 > 0 && (((i3 = b62Var.g0) == -1 || j2 < i3) && !hashSet.contains(Integer.valueOf((int) j2)))) {
                            b62Var.k(j2);
                            u(b62Var, num.intValue());
                        }
                        b62Var.k(j3);
                    } else {
                        unsignedShort = b62Var.readUnsignedShort();
                    }
                    j2 = unsignedShort;
                    if (z2) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j2), z52Var2.b);
                    }
                    if (j2 > 0) {
                        b62Var.k(j2);
                        u(b62Var, num.intValue());
                    }
                    b62Var.k(j3);
                } else {
                    int i6 = b62Var.Y + this.j;
                    byte[] bArr = new byte[(int) j];
                    b62Var.readFully(bArr);
                    y52 y52Var = new y52(i6, bArr, unsignedShort3, i4);
                    HashMap map = mapArr3[i];
                    String str2 = z52Var2.b;
                    map.put(str2, y52Var);
                    if ("DNGVersion".equals(str2)) {
                        this.d = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && y52Var.g(this.h).contains("PENTAX")) || ("Compression".equals(str2) && y52Var.f(this.h) == 65535)) {
                        this.d = 8;
                    }
                    if (b62Var.Y != j3) {
                        b62Var.k(j3);
                    }
                }
            } else {
                b62Var.k(j3);
            }
            s3 = (short) (s4 + 1);
            s2 = s2;
        }
        int i7 = b62Var.readInt();
        if (z2) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i7));
        }
        long j4 = i7;
        if (j4 <= 0 || hashSet.contains(Integer.valueOf(i7))) {
            return;
        }
        b62Var.k(j4);
        if (mapArr[4].isEmpty()) {
            u(b62Var, 4);
        } else if (mapArr[5].isEmpty()) {
            u(b62Var, 5);
        }
    }

    public final void v(String str, int i, String str2) {
        HashMap[] mapArr = this.f;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (y52) map.get(str));
        mapArr[i].remove(str);
    }

    public final void w(x52 x52Var) throws Throwable {
        y52 y52Var;
        HashMap map = this.f[4];
        y52 y52Var2 = (y52) map.get("Compression");
        if (y52Var2 == null) {
            o(x52Var, map);
            return;
        }
        int iF = y52Var2.f(this.h);
        if (iF != 1) {
            if (iF == 6) {
                o(x52Var, map);
                return;
            } else if (iF != 7) {
                return;
            }
        }
        y52 y52Var3 = (y52) map.get("BitsPerSample");
        if (y52Var3 != null) {
            int[] iArr = (int[]) y52Var3.h(this.h);
            int[] iArr2 = p;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.d != 3 || (y52Var = (y52) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iF2 = y52Var.f(this.h);
                if ((iF2 != 1 || !Arrays.equals(iArr, q)) && (iF2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            y52 y52Var4 = (y52) map.get("StripOffsets");
            y52 y52Var5 = (y52) map.get("StripByteCounts");
            if (y52Var4 == null || y52Var5 == null) {
                return;
            }
            long[] jArrK = os4.k(y52Var4.h(this.h));
            long[] jArrK2 = os4.k(y52Var5.h(this.h));
            if (jArrK == null || jArrK.length == 0 || jArrK2 == null || jArrK2.length == 0 || jArrK.length != jArrK2.length) {
                return;
            }
            long j = 0;
            for (long j2 : jArrK2) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            this.i = true;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < jArrK.length; i3++) {
                int i4 = (int) jArrK[i3];
                int i5 = (int) jArrK2[i3];
                if (i3 < jArrK.length - 1 && i4 + i5 != jArrK[i3 + 1]) {
                    this.i = false;
                }
                int i6 = i4 - i;
                if (i6 < 0) {
                    return;
                }
                try {
                    x52Var.g(i6);
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    x52Var.readFully(bArr2);
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                } catch (EOFException unused) {
                    return;
                }
            }
            if (this.i) {
                long j3 = jArrK[0];
            }
        }
    }

    public final void x(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        y52 y52Var = (y52) mapArr[i].get("ImageLength");
        y52 y52Var2 = (y52) mapArr[i].get("ImageWidth");
        y52 y52Var3 = (y52) mapArr[i2].get("ImageLength");
        y52 y52Var4 = (y52) mapArr[i2].get("ImageWidth");
        if (y52Var == null || y52Var2 == null || y52Var3 == null || y52Var4 == null) {
            return;
        }
        int iF = y52Var.f(this.h);
        int iF2 = y52Var2.f(this.h);
        int iF3 = y52Var3.f(this.h);
        int iF4 = y52Var4.f(this.h);
        if (iF >= iF3 || iF2 >= iF4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void y(b62 b62Var, int i) throws Throwable {
        y52 y52VarD;
        y52 y52VarD2;
        HashMap[] mapArr = this.f;
        y52 y52Var = (y52) mapArr[i].get("DefaultCropSize");
        y52 y52Var2 = (y52) mapArr[i].get("SensorTopBorder");
        y52 y52Var3 = (y52) mapArr[i].get("SensorLeftBorder");
        y52 y52Var4 = (y52) mapArr[i].get("SensorBottomBorder");
        y52 y52Var5 = (y52) mapArr[i].get("SensorRightBorder");
        if (y52Var != null) {
            int i2 = y52Var.a;
            ByteOrder byteOrder = this.h;
            if (i2 == 5) {
                a62[] a62VarArr = (a62[]) y52Var.h(byteOrder);
                if (a62VarArr == null || a62VarArr.length != 2) {
                    Arrays.toString(a62VarArr);
                    return;
                }
                y52VarD = y52.c(new a62[]{a62VarArr[0]}, this.h);
                y52VarD2 = y52.c(new a62[]{a62VarArr[1]}, this.h);
            } else {
                int[] iArr = (int[]) y52Var.h(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    y52VarD = y52.d(iArr[0], this.h);
                    y52VarD2 = y52.d(iArr[1], this.h);
                }
            }
            mapArr[i].put("ImageWidth", y52VarD);
            mapArr[i].put("ImageLength", y52VarD2);
            return;
        }
        if (y52Var2 != null && y52Var3 != null && y52Var4 != null && y52Var5 != null) {
            int iF = y52Var2.f(this.h);
            int iF2 = y52Var4.f(this.h);
            int iF3 = y52Var5.f(this.h);
            int iF4 = y52Var3.f(this.h);
            if (iF2 <= iF || iF3 <= iF4) {
                return;
            }
            y52 y52VarD3 = y52.d(iF2 - iF, this.h);
            y52 y52VarD4 = y52.d(iF3 - iF4, this.h);
            mapArr[i].put("ImageLength", y52VarD3);
            mapArr[i].put("ImageWidth", y52VarD4);
            return;
        }
        y52 y52Var6 = (y52) mapArr[i].get("ImageLength");
        y52 y52Var7 = (y52) mapArr[i].get("ImageWidth");
        if (y52Var6 == null || y52Var7 == null) {
            y52 y52Var8 = (y52) mapArr[i].get("JPEGInterchangeFormat");
            y52 y52Var9 = (y52) mapArr[i].get("JPEGInterchangeFormatLength");
            if (y52Var8 == null || y52Var9 == null) {
                return;
            }
            int iF5 = y52Var8.f(this.h);
            int iF6 = y52Var8.f(this.h);
            b62Var.k(iF5);
            byte[] bArr = new byte[iF6];
            b62Var.readFully(bArr);
            f(new x52(bArr), iF5, i);
        }
    }

    public final void z() throws Throwable {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        HashMap[] mapArr = this.f;
        y52 y52Var = (y52) mapArr[1].get("PixelXDimension");
        y52 y52Var2 = (y52) mapArr[1].get("PixelYDimension");
        if (y52Var != null && y52Var2 != null) {
            mapArr[0].put("ImageWidth", y52Var);
            mapArr[0].put("ImageLength", y52Var2);
        }
        if (mapArr[4].isEmpty() && p(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        p(mapArr[4]);
        v("ThumbnailOrientation", 0, "Orientation");
        v("ThumbnailImageLength", 0, "ImageLength");
        v("ThumbnailImageWidth", 0, "ImageWidth");
        v("ThumbnailOrientation", 5, "Orientation");
        v("ThumbnailImageLength", 5, "ImageLength");
        v("ThumbnailImageWidth", 5, "ImageWidth");
        v("Orientation", 4, "ThumbnailOrientation");
        v("ImageLength", 4, "ThumbnailImageLength");
        v("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
