.class public abstract Lio/sentry/c0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lio/sentry/i1;

.field public final b:Lio/sentry/ILogger;

.field public final c:J

.field public final d:Lio/sentry/k7;


# direct methods
.method public constructor <init>(Lio/sentry/i1;Lio/sentry/ILogger;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/c0;->a:Lio/sentry/i1;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/c0;->b:Lio/sentry/ILogger;

    .line 7
    .line 8
    iput-wide p3, p0, Lio/sentry/c0;->c:J

    .line 9
    .line 10
    new-instance p1, Lio/sentry/j;

    .line 11
    .line 12
    invoke-direct {p1, p5}, Lio/sentry/j;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance p2, Lio/sentry/k7;

    .line 16
    .line 17
    invoke-direct {p2, p1}, Lio/sentry/k7;-><init>(Lio/sentry/j;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lio/sentry/c0;->d:Lio/sentry/k7;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 0

    .line 1
    const-string p0, ".envelope"

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public abstract b(Ljava/io/File;Lio/sentry/n0;)V
.end method
