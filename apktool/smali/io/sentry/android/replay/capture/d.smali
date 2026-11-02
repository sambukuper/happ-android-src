.class public final synthetic Lio/sentry/android/replay/capture/d;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:Lio/sentry/android/replay/capture/f;

.field public final synthetic Y:J

.field public final synthetic Z:Ljava/util/Date;

.field public final synthetic f0:Lio/sentry/protocol/w;

.field public final synthetic g0:Lio/sentry/android/replay/d0;

.field public final synthetic h0:Lgn2;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/f;JLjava/util/Date;Lio/sentry/protocol/w;Lio/sentry/android/replay/d0;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/replay/capture/d;->X:Lio/sentry/android/replay/capture/f;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/sentry/android/replay/capture/d;->Y:J

    .line 7
    .line 8
    iput-object p4, p0, Lio/sentry/android/replay/capture/d;->Z:Ljava/util/Date;

    .line 9
    .line 10
    iput-object p5, p0, Lio/sentry/android/replay/capture/d;->f0:Lio/sentry/protocol/w;

    .line 11
    .line 12
    iput-object p6, p0, Lio/sentry/android/replay/capture/d;->g0:Lio/sentry/android/replay/d0;

    .line 13
    .line 14
    iput-object p7, p0, Lio/sentry/android/replay/capture/d;->h0:Lgn2;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/d;->X:Lio/sentry/android/replay/capture/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/android/replay/capture/c;->e()I

    .line 4
    .line 5
    .line 6
    move-result v5

    .line 7
    iget-object v1, p0, Lio/sentry/android/replay/capture/d;->g0:Lio/sentry/android/replay/d0;

    .line 8
    .line 9
    iget v6, v1, Lio/sentry/android/replay/d0;->b:I

    .line 10
    .line 11
    iget v7, v1, Lio/sentry/android/replay/d0;->a:I

    .line 12
    .line 13
    iget v8, v1, Lio/sentry/android/replay/d0;->e:I

    .line 14
    .line 15
    iget v9, v1, Lio/sentry/android/replay/d0;->f:I

    .line 16
    .line 17
    iget-wide v1, p0, Lio/sentry/android/replay/capture/d;->Y:J

    .line 18
    .line 19
    iget-object v3, p0, Lio/sentry/android/replay/capture/d;->Z:Ljava/util/Date;

    .line 20
    .line 21
    iget-object v4, p0, Lio/sentry/android/replay/capture/d;->f0:Lio/sentry/protocol/w;

    .line 22
    .line 23
    invoke-static/range {v0 .. v9}, Lio/sentry/android/replay/capture/c;->c(Lio/sentry/android/replay/capture/c;JLjava/util/Date;Lio/sentry/protocol/w;IIIII)Lio/sentry/android/replay/capture/k;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object p0, p0, Lio/sentry/android/replay/capture/d;->h0:Lgn2;

    .line 28
    .line 29
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
.end method
