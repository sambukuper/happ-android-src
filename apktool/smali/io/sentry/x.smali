.class public final Lio/sentry/x;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/n1;


# instance fields
.field public final X:Lio/sentry/i1;


# direct methods
.method public constructor <init>(Lio/sentry/i1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/x;->X:Lio/sentry/i1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/y;->a:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/x;->X:Lio/sentry/i1;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
