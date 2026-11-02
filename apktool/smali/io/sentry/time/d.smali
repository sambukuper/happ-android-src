.class public final Lio/sentry/time/d;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/time/b;


# static fields
.field public static final a:Lio/sentry/time/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-boolean v0, Lio/sentry/util/k;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lio/sentry/util/k;->b:Z

    .line 6
    .line 7
    :cond_0
    new-instance v0, Lio/sentry/time/d;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lio/sentry/time/d;->a:Lio/sentry/time/d;

    .line 13
    .line 14
    return-void
.end method
