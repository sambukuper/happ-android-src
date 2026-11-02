.class public abstract Lio/sentry/util/o;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lwh;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwh;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lwh;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lio/sentry/util/o;->a:Lwh;

    .line 8
    .line 9
    return-void
.end method

.method public static a()Lio/sentry/util/l;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/util/o;->a:Lwh;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/sentry/util/l;

    .line 8
    .line 9
    return-object v0
.end method
