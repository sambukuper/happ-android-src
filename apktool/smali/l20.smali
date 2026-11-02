.class public final Ll20;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final j0:Ljava/util/TimeZone;


# instance fields
.field public final X:Luh8;

.field public final Y:Lhi5;

.field public final Z:Lfj3;

.field public final f0:Lmd0;

.field public final g0:Ljava/text/DateFormat;

.field public final h0:Ljava/util/Locale;

.field public final i0:Ll10;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTC"

    .line 2
    .line 3
    invoke-static {v0}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ll20;->j0:Ljava/util/TimeZone;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lb30;Lfj3;Luh8;Ljava/text/DateFormat;Ljava/util/Locale;Ll10;Lmd0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll20;->Y:Lhi5;

    .line 5
    .line 6
    iput-object p2, p0, Ll20;->Z:Lfj3;

    .line 7
    .line 8
    iput-object p3, p0, Ll20;->X:Luh8;

    .line 9
    .line 10
    iput-object p4, p0, Ll20;->g0:Ljava/text/DateFormat;

    .line 11
    .line 12
    iput-object p5, p0, Ll20;->h0:Ljava/util/Locale;

    .line 13
    .line 14
    iput-object p6, p0, Ll20;->i0:Ll10;

    .line 15
    .line 16
    iput-object p7, p0, Ll20;->f0:Lmd0;

    .line 17
    .line 18
    return-void
.end method
