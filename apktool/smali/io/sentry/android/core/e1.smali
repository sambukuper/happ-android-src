.class public final Lio/sentry/android/core/e1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:J

.field public final e:Z

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/net/NetworkCapabilities;Lio/sentry/android/core/n0;J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string p2, "NetworkCapabilities is required"

    .line 5
    .line 6
    invoke-static {p1, p2}, Lio/sentry/util/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/net/NetworkCapabilities;->getLinkDownstreamBandwidthKbps()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iput p2, p0, Lio/sentry/android/core/e1;->a:I

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/net/NetworkCapabilities;->getLinkUpstreamBandwidthKbps()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iput p2, p0, Lio/sentry/android/core/e1;->b:I

    .line 20
    .line 21
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v0, 0x1d

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-lt p2, v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/net/NetworkCapabilities;->getSignalStrength()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move p2, v1

    .line 34
    :goto_0
    const/16 v0, -0x64

    .line 35
    .line 36
    if-le p2, v0, :cond_1

    .line 37
    .line 38
    move v1, p2

    .line 39
    :cond_1
    iput v1, p0, Lio/sentry/android/core/e1;->c:I

    .line 40
    .line 41
    const/4 p2, 0x4

    .line 42
    invoke-virtual {p1, p2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iput-boolean p2, p0, Lio/sentry/android/core/e1;->e:Z

    .line 47
    .line 48
    invoke-static {p1}, Lio/sentry/android/core/internal/util/c;->u(Landroid/net/NetworkCapabilities;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const-string p1, ""

    .line 56
    .line 57
    :goto_1
    iput-object p1, p0, Lio/sentry/android/core/e1;->f:Ljava/lang/String;

    .line 58
    .line 59
    iput-wide p3, p0, Lio/sentry/android/core/e1;->d:J

    .line 60
    .line 61
    return-void
.end method
