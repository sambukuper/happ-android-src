.class public final Lio/sentry/a7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final c:Lio/sentry/a7;


# instance fields
.field public final a:Z

.field public final b:Lio/sentry/j7;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/a7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lio/sentry/a7;-><init>(ZLio/sentry/j7;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lio/sentry/a7;->c:Lio/sentry/a7;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(ZLio/sentry/j7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lio/sentry/a7;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/a7;->b:Lio/sentry/j7;

    .line 7
    .line 8
    return-void
.end method
