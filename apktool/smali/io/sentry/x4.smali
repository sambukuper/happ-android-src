.class public final Lio/sentry/x4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/b5;


# instance fields
.field public final a:Lio/sentry/b5;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Lio/sentry/util/k;->a:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-boolean v0, Lio/sentry/util/k;->b:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lio/sentry/p5;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1}, Lio/sentry/p5;-><init>(B)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lio/sentry/x4;->a:Lio/sentry/b5;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance v0, Lio/sentry/p5;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {v0, v1}, Lio/sentry/p5;-><init>(B)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lio/sentry/x4;->a:Lio/sentry/b5;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()Lio/sentry/a5;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x4;->a:Lio/sentry/b5;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/sentry/b5;->a()Lio/sentry/a5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
